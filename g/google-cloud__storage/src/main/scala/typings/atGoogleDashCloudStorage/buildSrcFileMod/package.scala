package typings.atGoogleDashCloudStorage

import typings.atGoogleDashCloudCommon.buildSrcServiceDashObjectMod.Metadata
import typings.node.Buffer
import typings.std.Date
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object buildSrcFileMod {
  type CopyCallback = js.Function3[
    /* err */ Error | Null, 
    /* file */ js.UndefOr[File | Null], 
    /* apiResponse */ js.UndefOr[Metadata], 
    Unit
  ]
  type CopyResponse = js.Tuple2[File, Metadata]
  type CreateResumableUploadCallback = js.Function2[/* err */ Error | Null, /* uri */ js.UndefOr[String], Unit]
  type CreateResumableUploadResponse = js.Array[String]
  type DeleteFileCallback = js.Function2[/* err */ Error | Null, /* apiResponse */ js.UndefOr[Metadata], Unit]
  type DeleteFileResponse = js.Array[Metadata]
  type DownloadCallback = js.Function2[/* err */ RequestError | Null, /* contents */ Buffer, Unit]
  type DownloadResponse = js.Array[Buffer]
  type FileExistsCallback = js.Function2[/* err */ Error | Null, /* exists */ js.UndefOr[Boolean], Unit]
  type FileExistsResponse = js.Array[Boolean]
  type GetExpirationDateCallback = js.Function3[
    /* err */ Error | Null, 
    /* expirationDate */ js.UndefOr[Date | Null], 
    /* apiResponse */ js.UndefOr[Metadata], 
    Unit
  ]
  type GetExpirationDateResponse = js.Array[Date]
  type GetFileCallback = js.Function3[
    /* err */ Error | Null, 
    /* file */ js.UndefOr[File], 
    /* apiResponse */ js.UndefOr[Metadata], 
    Unit
  ]
  type GetFileMetadataCallback = js.Function3[
    /* err */ Error | Null, 
    /* metadata */ js.UndefOr[Metadata], 
    /* apiResponse */ js.UndefOr[Metadata], 
    Unit
  ]
  type GetFileMetadataResponse = js.Tuple2[Metadata, Metadata]
  type GetFileResponse = js.Tuple2[File, Metadata]
  type GetSignedPolicyCallback = js.Function2[/* err */ Error | Null, /* policy */ js.UndefOr[PolicyDocument], Unit]
  type GetSignedPolicyResponse = js.Array[PolicyDocument]
  type GetSignedUrlCallback = js.Function2[/* err */ Error | Null, /* url */ js.UndefOr[String], Unit]
  type GetSignedUrlResponse = js.Array[String]
  type IsPublicCallback = js.Function2[/* err */ Error | Null, /* resp */ js.UndefOr[Boolean], Unit]
  type IsPublicResponse = js.Array[Boolean]
  type MakeFilePrivateCallback = SetFileMetadataCallback
  type MakeFilePrivateResponse = js.Array[Metadata]
  type MakeFilePublicCallback = js.Function2[/* err */ js.UndefOr[Error | Null], /* apiResponse */ js.UndefOr[Metadata], Unit]
  type MakeFilePublicResponse = js.Array[Metadata]
  type MoveCallback = js.Function3[
    /* err */ Error | Null, 
    /* destinationFile */ js.UndefOr[File | Null], 
    /* apiResponse */ js.UndefOr[Metadata], 
    Unit
  ]
  type MoveResponse = js.Array[Metadata]
  type RotateEncryptionKeyCallback = CopyCallback
  type RotateEncryptionKeyOptions = String | Buffer | EncryptionKeyOptions
  type RotateEncryptionKeyResponse = CopyResponse
  type SaveCallback = js.Function1[/* err */ js.UndefOr[Error | Null], Unit]
  type SaveOptions = CreateWriteStreamOptions
  type SetFileMetadataCallback = js.Function2[/* err */ js.UndefOr[Error | Null], /* apiResponse */ js.UndefOr[Metadata], Unit]
  type SetFileMetadataResponse = js.Array[Metadata]
  type SetStorageClassCallback = js.Function2[/* err */ js.UndefOr[Error | Null], /* apiResponse */ js.UndefOr[Metadata], Unit]
  type SetStorageClassResponse = js.Array[Metadata]
}
