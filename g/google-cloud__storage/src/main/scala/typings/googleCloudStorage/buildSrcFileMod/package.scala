package typings.googleCloudStorage.buildSrcFileMod

import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudStorage.buildSrcFileMod.^
import typings.googleCloudStorage.buildSrcNodejsCommonServiceObjectMod.Metadata
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def STORAGE_POST_POLICY_BASE_URL: /* "https://storage.googleapis.com" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("STORAGE_POST_POLICY_BASE_URL").asInstanceOf[/* "https://storage.googleapis.com" */ String]

type CopyCallback = js.Function3[
/* err */ js.Error | Null, 
/* file */ js.UndefOr[File | Null], 
/* apiResponse */ js.UndefOr[Metadata], 
Unit]

type CopyResponse = js.Tuple2[File, Metadata]

type CreateResumableUploadCallback = js.Function2[/* err */ js.Error | Null, /* uri */ js.UndefOr[String], Unit]

type CreateResumableUploadResponse = js.Array[String]

type DeleteFileCallback = js.Function2[/* err */ js.Error | Null, /* apiResponse */ js.UndefOr[Metadata], Unit]

type DeleteFileResponse = js.Array[Metadata]

type DownloadCallback = js.Function2[/* err */ RequestError | Null, /* contents */ Buffer, Unit]

type DownloadResponse = js.Array[Buffer]

type FileExistsCallback = js.Function2[/* err */ js.Error | Null, /* exists */ js.UndefOr[Boolean], Unit]

type FileExistsResponse = js.Array[Boolean]

type GenerateSignedPostPolicyV2Callback = js.Function2[/* err */ js.Error | Null, /* policy */ js.UndefOr[PolicyDocument], Unit]

type GenerateSignedPostPolicyV2Response = js.Array[PolicyDocument]

type GenerateSignedPostPolicyV4Callback = js.Function2[/* err */ js.Error | Null, /* output */ js.UndefOr[SignedPostPolicyV4Output], Unit]

type GenerateSignedPostPolicyV4Response = js.Array[SignedPostPolicyV4Output]

type GetExpirationDateCallback = js.Function3[
/* err */ js.Error | Null, 
/* expirationDate */ js.UndefOr[js.Date | Null], 
/* apiResponse */ js.UndefOr[Metadata], 
Unit]

type GetExpirationDateResponse = js.Array[js.Date]

type GetFileCallback = js.Function3[
/* err */ js.Error | Null, 
/* file */ js.UndefOr[File], 
/* apiResponse */ js.UndefOr[Metadata], 
Unit]

type GetFileMetadataCallback = js.Function3[
/* err */ js.Error | Null, 
/* metadata */ js.UndefOr[Metadata], 
/* apiResponse */ js.UndefOr[Metadata], 
Unit]

type GetFileMetadataResponse = js.Tuple2[Metadata, Metadata]

type GetFileResponse = js.Tuple2[File, Metadata]

type IsPublicCallback = js.Function2[/* err */ js.Error | Null, /* resp */ js.UndefOr[Boolean], Unit]

type IsPublicResponse = js.Array[Boolean]

type MakeFilePrivateCallback = SetFileMetadataCallback

type MakeFilePrivateResponse = js.Array[Metadata]

type MakeFilePublicCallback = js.Function2[/* err */ js.UndefOr[js.Error | Null], /* apiResponse */ js.UndefOr[Metadata], Unit]

type MakeFilePublicResponse = js.Array[Metadata]

type MoveCallback = js.Function3[
/* err */ js.Error | Null, 
/* destinationFile */ js.UndefOr[File | Null], 
/* apiResponse */ js.UndefOr[Metadata], 
Unit]

type MoveResponse = js.Array[Metadata]

type PolicyFields = StringDictionary[String]

type RenameCallback = MoveCallback

type RenameOptions = MoveOptions

type RenameResponse = MoveResponse

type RotateEncryptionKeyCallback = CopyCallback

type RotateEncryptionKeyOptions = String | Buffer | EncryptionKeyOptions

type RotateEncryptionKeyResponse = CopyResponse

type SaveCallback = js.Function1[/* err */ js.UndefOr[js.Error | Null], Unit]

type SetFileMetadataCallback = js.Function2[/* err */ js.UndefOr[js.Error | Null], /* apiResponse */ js.UndefOr[Metadata], Unit]

type SetFileMetadataResponse = js.Array[Metadata]

type SetStorageClassCallback = js.Function2[/* err */ js.UndefOr[js.Error | Null], /* apiResponse */ js.UndefOr[Metadata], Unit]

type SetStorageClassResponse = js.Array[Metadata]
