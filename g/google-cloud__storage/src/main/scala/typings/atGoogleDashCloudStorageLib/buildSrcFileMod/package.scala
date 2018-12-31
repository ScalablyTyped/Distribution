package typings
package atGoogleDashCloudStorageLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object buildSrcFileMod {
  type CopyCallback = js.Function3[
    /* err */ nodeLib.Error | scala.Null, 
    /* file */ js.UndefOr[File | scala.Null], 
    /* apiResponse */ js.UndefOr[requestLib.requestMod.requestNs.Response], 
    scala.Unit
  ]
  type CopyResponse = js.Tuple2[File, requestLib.requestMod.requestNs.Response]
  type CreateResumableUploadCallback = js.Function2[
    /* err */ nodeLib.Error | scala.Null, 
    /* uri */ js.UndefOr[java.lang.String], 
    scala.Unit
  ]
  type CreateResumableUploadResponse = js.Array[java.lang.String]
  type DeleteFileCallback = js.Function2[
    /* err */ nodeLib.Error | scala.Null, 
    /* apiResponse */ js.UndefOr[requestLib.requestMod.requestNs.Response], 
    scala.Unit
  ]
  type DeleteFileResponse = js.Array[requestLib.requestMod.requestNs.Response]
  type DownloadCallback = js.Function2[/* err */ RequestError | scala.Null, /* contents */ nodeLib.Buffer, scala.Unit]
  type DownloadResponse = js.Array[nodeLib.Buffer]
  type FileExistsCallback = js.Function2[
    /* err */ nodeLib.Error | scala.Null, 
    /* exists */ js.UndefOr[scala.Boolean], 
    scala.Unit
  ]
  type FileExistsResponse = js.Array[scala.Boolean]
  type GetExpirationDateCallback = js.Function3[
    /* err */ nodeLib.Error | scala.Null, 
    /* expirationDate */ js.UndefOr[stdLib.Date | scala.Null], 
    /* apiResponse */ js.UndefOr[requestLib.requestMod.requestNs.Response], 
    scala.Unit
  ]
  type GetExpirationDateResponse = js.Array[stdLib.Date]
  type GetFileCallback = js.Function3[
    /* err */ nodeLib.Error | scala.Null, 
    /* file */ js.UndefOr[File], 
    /* apiResponse */ js.UndefOr[requestLib.requestMod.requestNs.Response], 
    scala.Unit
  ]
  type GetFileMetadataCallback = js.Function3[
    /* err */ nodeLib.Error | scala.Null, 
    /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify Metadata */ /* metadata */ js.UndefOr[
      /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify Metadata */ js.Any
    ], 
    /* apiResponse */ js.UndefOr[requestLib.requestMod.requestNs.Response], 
    scala.Unit
  ]
  type GetFileMetadataResponse = js.Tuple2[
    /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify Metadata */ js.Any, 
    requestLib.requestMod.requestNs.Response
  ]
  type GetFileResponse = js.Tuple2[File, requestLib.requestMod.requestNs.Response]
  type GetSignedPolicyCallback = js.Function2[
    /* err */ nodeLib.Error | scala.Null, 
    /* policy */ js.UndefOr[PolicyDocument], 
    scala.Unit
  ]
  type GetSignedPolicyResponse = js.Array[PolicyDocument]
  type GetSignedUrlCallback = js.Function2[
    /* err */ nodeLib.Error | scala.Null, 
    /* url */ js.UndefOr[java.lang.String], 
    scala.Unit
  ]
  type GetSignedUrlResponse = js.Array[java.lang.String]
  type MakeFilePrivateCallback = SetFileMetadataCallback
  type MakeFilePrivateResponse = js.Array[requestLib.requestMod.requestNs.Response]
  type MakeFilePublicCallback = js.Function2[
    /* err */ js.UndefOr[nodeLib.Error | scala.Null], 
    /* apiResponse */ js.UndefOr[requestLib.requestMod.requestNs.Response], 
    scala.Unit
  ]
  type MakeFilePublicResponse = js.Array[requestLib.requestMod.requestNs.Response]
  type MoveCallback = js.Function3[
    /* err */ nodeLib.Error | scala.Null, 
    /* destinationFile */ js.UndefOr[File | scala.Null], 
    /* apiResponse */ js.UndefOr[requestLib.requestMod.requestNs.Response], 
    scala.Unit
  ]
  type MoveResponse = js.Array[requestLib.requestMod.requestNs.Response]
  type PredefinedAcl = atGoogleDashCloudStorageLib.atGoogleDashCloudStorageLibStrings.authenticatedRead | atGoogleDashCloudStorageLib.atGoogleDashCloudStorageLibStrings.bucketOwnerFullControl | atGoogleDashCloudStorageLib.atGoogleDashCloudStorageLibStrings.bucketOwnerRead | atGoogleDashCloudStorageLib.atGoogleDashCloudStorageLibStrings.`private` | atGoogleDashCloudStorageLib.atGoogleDashCloudStorageLibStrings.projectPrivate | atGoogleDashCloudStorageLib.atGoogleDashCloudStorageLibStrings.publicRead
  type RotateEncryptionKeyCallback = CopyCallback
  type RotateEncryptionKeyOptions = java.lang.String | nodeLib.Buffer | EncryptionKeyOptions
  type RotateEncryptionKeyResponse = CopyResponse
  type SaveCallback = js.Function1[/* err */ js.UndefOr[nodeLib.Error | scala.Null], scala.Unit]
  type SaveOptions = CreateWriteStreamOptions
  type SetFileMetadataCallback = js.Function2[
    /* err */ js.UndefOr[nodeLib.Error | scala.Null], 
    /* apiResponse */ js.UndefOr[requestLib.requestMod.requestNs.Response], 
    scala.Unit
  ]
  type SetFileMetadataResponse = js.Array[requestLib.requestMod.requestNs.Response]
  type SetStorageClassCallback = js.Function2[
    /* err */ js.UndefOr[nodeLib.Error | scala.Null], 
    /* apiResponse */ js.UndefOr[requestLib.requestMod.requestNs.Response], 
    scala.Unit
  ]
  type SetStorageClassResponse = js.Array[requestLib.requestMod.requestNs.Response]
}
