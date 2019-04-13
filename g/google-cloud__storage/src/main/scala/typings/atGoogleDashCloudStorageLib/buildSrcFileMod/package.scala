package typings
package atGoogleDashCloudStorageLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object buildSrcFileMod {
  type CopyCallback = js.Function3[
    /* err */ stdLib.Error | scala.Null, 
    /* file */ js.UndefOr[File | scala.Null], 
    /* apiResponse */ js.UndefOr[requestLib.requestMod.Response], 
    scala.Unit
  ]
  type CopyResponse = js.Tuple2[File, requestLib.requestMod.Response]
  type CreateResumableUploadCallback = js.Function2[
    /* err */ stdLib.Error | scala.Null, 
    /* uri */ js.UndefOr[java.lang.String], 
    scala.Unit
  ]
  type CreateResumableUploadResponse = js.Array[java.lang.String]
  type DeleteFileCallback = js.Function2[
    /* err */ stdLib.Error | scala.Null, 
    /* apiResponse */ js.UndefOr[requestLib.requestMod.Response], 
    scala.Unit
  ]
  type DeleteFileResponse = js.Array[requestLib.requestMod.Response]
  type DownloadCallback = js.Function2[/* err */ RequestError | scala.Null, /* contents */ nodeLib.Buffer, scala.Unit]
  type DownloadResponse = js.Array[nodeLib.Buffer]
  type FileExistsCallback = js.Function2[
    /* err */ stdLib.Error | scala.Null, 
    /* exists */ js.UndefOr[scala.Boolean], 
    scala.Unit
  ]
  type FileExistsResponse = js.Array[scala.Boolean]
  type GetExpirationDateCallback = js.Function3[
    /* err */ stdLib.Error | scala.Null, 
    /* expirationDate */ js.UndefOr[stdLib.Date | scala.Null], 
    /* apiResponse */ js.UndefOr[requestLib.requestMod.Response], 
    scala.Unit
  ]
  type GetExpirationDateResponse = js.Array[stdLib.Date]
  type GetFileCallback = js.Function3[
    /* err */ stdLib.Error | scala.Null, 
    /* file */ js.UndefOr[File], 
    /* apiResponse */ js.UndefOr[requestLib.requestMod.Response], 
    scala.Unit
  ]
  type GetFileMetadataCallback = js.Function3[
    /* err */ stdLib.Error | scala.Null, 
    /* metadata */ js.UndefOr[atGoogleDashCloudCommonLib.buildSrcServiceDashObjectMod.Metadata], 
    /* apiResponse */ js.UndefOr[requestLib.requestMod.Response], 
    scala.Unit
  ]
  type GetFileMetadataResponse = js.Tuple2[
    atGoogleDashCloudCommonLib.buildSrcServiceDashObjectMod.Metadata, 
    requestLib.requestMod.Response
  ]
  type GetFileResponse = js.Tuple2[File, requestLib.requestMod.Response]
  type GetSignedPolicyCallback = js.Function2[
    /* err */ stdLib.Error | scala.Null, 
    /* policy */ js.UndefOr[PolicyDocument], 
    scala.Unit
  ]
  type GetSignedPolicyResponse = js.Array[PolicyDocument]
  type GetSignedUrlCallback = js.Function2[
    /* err */ stdLib.Error | scala.Null, 
    /* url */ js.UndefOr[java.lang.String], 
    scala.Unit
  ]
  type GetSignedUrlResponse = js.Array[java.lang.String]
  type MakeFilePrivateCallback = SetFileMetadataCallback
  type MakeFilePrivateResponse = js.Array[requestLib.requestMod.Response]
  type MakeFilePublicCallback = js.Function2[
    /* err */ js.UndefOr[stdLib.Error | scala.Null], 
    /* apiResponse */ js.UndefOr[requestLib.requestMod.Response], 
    scala.Unit
  ]
  type MakeFilePublicResponse = js.Array[requestLib.requestMod.Response]
  type MoveCallback = js.Function3[
    /* err */ stdLib.Error | scala.Null, 
    /* destinationFile */ js.UndefOr[File | scala.Null], 
    /* apiResponse */ js.UndefOr[requestLib.requestMod.Response], 
    scala.Unit
  ]
  type MoveResponse = js.Array[requestLib.requestMod.Response]
  type RotateEncryptionKeyCallback = CopyCallback
  type RotateEncryptionKeyOptions = java.lang.String | nodeLib.Buffer | EncryptionKeyOptions
  type RotateEncryptionKeyResponse = CopyResponse
  type SaveCallback = js.Function1[/* err */ js.UndefOr[stdLib.Error | scala.Null], scala.Unit]
  type SaveOptions = CreateWriteStreamOptions
  type SetFileMetadataCallback = js.Function2[
    /* err */ js.UndefOr[stdLib.Error | scala.Null], 
    /* apiResponse */ js.UndefOr[requestLib.requestMod.Response], 
    scala.Unit
  ]
  type SetFileMetadataResponse = js.Array[requestLib.requestMod.Response]
  type SetStorageClassCallback = js.Function2[
    /* err */ js.UndefOr[stdLib.Error | scala.Null], 
    /* apiResponse */ js.UndefOr[requestLib.requestMod.Response], 
    scala.Unit
  ]
  type SetStorageClassResponse = js.Array[requestLib.requestMod.Response]
}
