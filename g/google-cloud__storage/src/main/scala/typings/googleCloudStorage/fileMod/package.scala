package typings.googleCloudStorage.fileMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def STORAGE_POST_POLICY_BASE_URL: /* "https://storage.googleapis.com" */ java.lang.String = typings.googleCloudStorage.fileMod.^.asInstanceOf[js.Dynamic].selectDynamic("STORAGE_POST_POLICY_BASE_URL").asInstanceOf[/* "https://storage.googleapis.com" */ java.lang.String]

type CopyCallback = js.Function3[
/* err */ typings.std.Error | scala.Null, 
/* file */ js.UndefOr[typings.googleCloudStorage.fileMod.File | scala.Null], 
/* apiResponse */ js.UndefOr[typings.googleCloudCommon.serviceObjectMod.Metadata], 
scala.Unit]

type CopyResponse = js.Tuple2[
typings.googleCloudStorage.fileMod.File, 
typings.googleCloudCommon.serviceObjectMod.Metadata]

type CreateResumableUploadCallback = js.Function2[
/* err */ typings.std.Error | scala.Null, 
/* uri */ js.UndefOr[java.lang.String], 
scala.Unit]

type CreateResumableUploadResponse = js.Array[java.lang.String]

type DeleteFileCallback = js.Function2[
/* err */ typings.std.Error | scala.Null, 
/* apiResponse */ js.UndefOr[typings.googleCloudCommon.serviceObjectMod.Metadata], 
scala.Unit]

type DeleteFileResponse = js.Array[typings.googleCloudCommon.serviceObjectMod.Metadata]

type DownloadCallback = js.Function2[
/* err */ typings.googleCloudStorage.fileMod.RequestError | scala.Null, 
/* contents */ typings.node.Buffer, 
scala.Unit]

type DownloadResponse = js.Array[typings.node.Buffer]

type FileExistsCallback = js.Function2[
/* err */ typings.std.Error | scala.Null, 
/* exists */ js.UndefOr[scala.Boolean], 
scala.Unit]

type FileExistsResponse = js.Array[scala.Boolean]

type GenerateSignedPostPolicyV2Callback = typings.googleCloudStorage.fileMod.GetSignedPolicyCallback

type GenerateSignedPostPolicyV2Options = typings.googleCloudStorage.fileMod.GetSignedPolicyOptions

type GenerateSignedPostPolicyV2Response = typings.googleCloudStorage.fileMod.GetSignedPolicyResponse

type GenerateSignedPostPolicyV4Callback = js.Function2[
/* err */ typings.std.Error | scala.Null, 
/* output */ js.UndefOr[typings.googleCloudStorage.fileMod.SignedPostPolicyV4Output], 
scala.Unit]

type GenerateSignedPostPolicyV4Response = js.Array[typings.googleCloudStorage.fileMod.SignedPostPolicyV4Output]

type GetExpirationDateCallback = js.Function3[
/* err */ typings.std.Error | scala.Null, 
/* expirationDate */ js.UndefOr[typings.std.Date | scala.Null], 
/* apiResponse */ js.UndefOr[typings.googleCloudCommon.serviceObjectMod.Metadata], 
scala.Unit]

type GetExpirationDateResponse = js.Array[typings.std.Date]

type GetFileCallback = js.Function3[
/* err */ typings.std.Error | scala.Null, 
/* file */ js.UndefOr[typings.googleCloudStorage.fileMod.File], 
/* apiResponse */ js.UndefOr[typings.googleCloudCommon.serviceObjectMod.Metadata], 
scala.Unit]

type GetFileMetadataCallback = js.Function3[
/* err */ typings.std.Error | scala.Null, 
/* metadata */ js.UndefOr[typings.googleCloudCommon.serviceObjectMod.Metadata], 
/* apiResponse */ js.UndefOr[typings.googleCloudCommon.serviceObjectMod.Metadata], 
scala.Unit]

type GetFileMetadataResponse = js.Tuple2[
typings.googleCloudCommon.serviceObjectMod.Metadata, 
typings.googleCloudCommon.serviceObjectMod.Metadata]

type GetFileResponse = js.Tuple2[
typings.googleCloudStorage.fileMod.File, 
typings.googleCloudCommon.serviceObjectMod.Metadata]

type GetSignedPolicyCallback = js.Function2[
/* err */ typings.std.Error | scala.Null, 
/* policy */ js.UndefOr[typings.googleCloudStorage.fileMod.PolicyDocument], 
scala.Unit]

type GetSignedPolicyResponse = js.Array[typings.googleCloudStorage.fileMod.PolicyDocument]

type IsPublicCallback = js.Function2[
/* err */ typings.std.Error | scala.Null, 
/* resp */ js.UndefOr[scala.Boolean], 
scala.Unit]

type IsPublicResponse = js.Array[scala.Boolean]

type MakeFilePrivateCallback = typings.googleCloudStorage.fileMod.SetFileMetadataCallback

type MakeFilePrivateResponse = js.Array[typings.googleCloudCommon.serviceObjectMod.Metadata]

type MakeFilePublicCallback = js.Function2[
/* err */ js.UndefOr[typings.std.Error | scala.Null], 
/* apiResponse */ js.UndefOr[typings.googleCloudCommon.serviceObjectMod.Metadata], 
scala.Unit]

type MakeFilePublicResponse = js.Array[typings.googleCloudCommon.serviceObjectMod.Metadata]

type MoveCallback = js.Function3[
/* err */ typings.std.Error | scala.Null, 
/* destinationFile */ js.UndefOr[typings.googleCloudStorage.fileMod.File | scala.Null], 
/* apiResponse */ js.UndefOr[typings.googleCloudCommon.serviceObjectMod.Metadata], 
scala.Unit]

type MoveResponse = js.Array[typings.googleCloudCommon.serviceObjectMod.Metadata]

type PolicyFields = org.scalablytyped.runtime.StringDictionary[java.lang.String]

type RenameCallback = typings.googleCloudStorage.fileMod.MoveCallback

type RenameOptions = typings.googleCloudStorage.fileMod.MoveOptions

type RenameResponse = typings.googleCloudStorage.fileMod.MoveResponse

type RotateEncryptionKeyCallback = typings.googleCloudStorage.fileMod.CopyCallback

type RotateEncryptionKeyOptions = java.lang.String | typings.node.Buffer | typings.googleCloudStorage.fileMod.EncryptionKeyOptions

type RotateEncryptionKeyResponse = typings.googleCloudStorage.fileMod.CopyResponse

type SaveCallback = js.Function1[/* err */ js.UndefOr[typings.std.Error | scala.Null], scala.Unit]

type SetFileMetadataCallback = js.Function2[
/* err */ js.UndefOr[typings.std.Error | scala.Null], 
/* apiResponse */ js.UndefOr[typings.googleCloudCommon.serviceObjectMod.Metadata], 
scala.Unit]

type SetFileMetadataResponse = js.Array[typings.googleCloudCommon.serviceObjectMod.Metadata]

type SetStorageClassCallback = js.Function2[
/* err */ js.UndefOr[typings.std.Error | scala.Null], 
/* apiResponse */ js.UndefOr[typings.googleCloudCommon.serviceObjectMod.Metadata], 
scala.Unit]

type SetStorageClassResponse = js.Array[typings.googleCloudCommon.serviceObjectMod.Metadata]
