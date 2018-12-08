package typings
package atGoogleDashCloudStorageLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object buildSrcBucketMod {
  type BucketExistsCallback = atGoogleDashCloudCommonLib.buildSrcServiceDashObjectMod.ExistsCallback
  type BucketExistsResponse = js.Array[scala.Boolean]
  type BucketLockCallback = js.Function2[
    /* err */ js.UndefOr[nodeLib.Error | scala.Null], 
    /* apiResponse */ js.UndefOr[requestLib.requestMod.requestNs.Response], 
    scala.Unit
  ]
  type BucketLockResponse = js.Array[requestLib.requestMod.requestNs.Response]
  type CombineCallback = js.Function3[
    /* err */ nodeLib.Error | scala.Null, 
    /* newFile */ atGoogleDashCloudStorageLib.buildSrcFileMod.File | scala.Null, 
    /* apiResponse */ requestLib.requestMod.requestNs.Response, 
    scala.Unit
  ]
  type CombineResponse = js.Tuple2[
    atGoogleDashCloudStorageLib.buildSrcFileMod.File, 
    requestLib.requestMod.requestNs.Response
  ]
  type CreateChannelCallback = js.Function3[
    /* err */ nodeLib.Error | scala.Null, 
    /* channel */ atGoogleDashCloudStorageLib.buildSrcChannelMod.Channel | scala.Null, 
    /* apiResponse */ requestLib.requestMod.requestNs.Response, 
    scala.Unit
  ]
  type CreateChannelResponse = js.Tuple2[
    atGoogleDashCloudStorageLib.buildSrcChannelMod.Channel, 
    requestLib.requestMod.requestNs.Response
  ]
  type CreateNotificationCallback = js.Function3[
    /* err */ nodeLib.Error | scala.Null, 
    /* notification */ atGoogleDashCloudStorageLib.buildSrcNotificationMod.Notification | scala.Null, 
    /* apiResponse */ requestLib.requestMod.requestNs.Response, 
    scala.Unit
  ]
  type CreateNotificationResponse = js.Tuple2[
    atGoogleDashCloudStorageLib.buildSrcNotificationMod.Notification, 
    requestLib.requestMod.requestNs.Response
  ]
  type DeleteBucketResponse = js.Array[requestLib.requestMod.requestNs.Response]
  type DeleteFilesCallback = js.Function2[
    /* err */ nodeLib.Error | js.Array[nodeLib.Error] | scala.Null, 
    /* apiResponse */ js.UndefOr[js.Object], 
    scala.Unit
  ]
  type DeleteLabelsCallback = SetLabelsCallback
  type DeleteLabelsResponse = js.Array[requestLib.requestMod.requestNs.Response]
  type DisableRequesterPaysCallback = js.Function2[
    /* err */ js.UndefOr[nodeLib.Error | scala.Null], 
    /* apiResponse */ js.UndefOr[js.Object], 
    scala.Unit
  ]
  type DisableRequesterPaysResponse = js.Array[requestLib.requestMod.requestNs.Response]
  type EnableRequesterPaysCallback = js.Function2[
    /* err */ js.UndefOr[nodeLib.Error | scala.Null], 
    /* apiResponse */ js.UndefOr[requestLib.requestMod.requestNs.Response], 
    scala.Unit
  ]
  type EnableRequesterPaysResponse = js.Array[requestLib.requestMod.requestNs.Response]
  type GetBucketMetadataCallback = js.Function3[
    /* err */ atGoogleDashCloudCommonLib.commonMod.ApiError | scala.Null, 
    /* metadata */ atGoogleDashCloudCommonLib.buildSrcServiceDashObjectMod.Metadata | scala.Null, 
    /* apiResponse */ requestLib.requestMod.requestNs.Response, 
    scala.Unit
  ]
  type GetBucketMetadataResponse = js.Tuple2[
    atGoogleDashCloudCommonLib.buildSrcServiceDashObjectMod.Metadata, 
    requestLib.requestMod.requestNs.Response
  ]
  type GetBucketResponse = js.Tuple2[Bucket, requestLib.requestMod.requestNs.Response]
  type GetFilesCallback = js.Function4[
    /* err */ nodeLib.Error | scala.Null, 
    /* files */ js.UndefOr[js.Array[atGoogleDashCloudStorageLib.buildSrcFileMod.File]], 
    /* nextQuery */ js.UndefOr[js.Object], 
    /* apiResponse */ js.UndefOr[requestLib.requestMod.requestNs.Response], 
    scala.Unit
  ]
  type GetLabelsCallback = js.Function2[
    /* err */ nodeLib.Error | scala.Null, 
    /* labels */ js.Object | scala.Null, 
    scala.Unit
  ]
  type GetLabelsResponse = js.Array[requestLib.requestMod.requestNs.Response]
  type GetNotificationsCallback = js.Function3[
    /* err */ nodeLib.Error | scala.Null, 
    /* notifications */ js.Array[atGoogleDashCloudStorageLib.buildSrcNotificationMod.Notification] | scala.Null, 
    /* apiResponse */ requestLib.requestMod.requestNs.Response, 
    scala.Unit
  ]
  type GetNotificationsResponse = js.Tuple2[
    js.Array[atGoogleDashCloudStorageLib.buildSrcNotificationMod.Notification], 
    requestLib.requestMod.requestNs.Response
  ]
  /**
   * @private
   *
   * @callback SetBucketMetadataCallback
   * @param {?Error} err Request error, if any.
   * @param {File[]} files Files that were updated.
   */
  type MakeAllFilesPublicPrivateCallback = js.Function2[
    /* err */ js.UndefOr[nodeLib.Error | js.Array[nodeLib.Error] | scala.Null], 
    /* files */ js.UndefOr[js.Array[atGoogleDashCloudStorageLib.buildSrcFileMod.File]], 
    scala.Unit
  ]
  /**
   * @typedef {array} MakeAllFilesPublicPrivateResponse
   * @property {File[]} 0 List of files affected.
   */
  type MakeAllFilesPublicPrivateResponse = js.Array[js.Array[atGoogleDashCloudStorageLib.buildSrcFileMod.File]]
  type MakeBucketPrivateCallback = js.Function2[
    /* err */ js.UndefOr[nodeLib.Error | scala.Null], 
    /* files */ js.UndefOr[js.Array[atGoogleDashCloudStorageLib.buildSrcFileMod.File]], 
    scala.Unit
  ]
  type MakeBucketPrivateResponse = js.Array[js.Array[atGoogleDashCloudStorageLib.buildSrcFileMod.File]]
  type MakeBucketPublicCallback = js.Function2[
    /* err */ js.UndefOr[nodeLib.Error | scala.Null], 
    /* files */ js.UndefOr[js.Array[atGoogleDashCloudStorageLib.buildSrcFileMod.File]], 
    scala.Unit
  ]
  type MakeBucketPublicResponse = js.Array[js.Array[atGoogleDashCloudStorageLib.buildSrcFileMod.File]]
  type SetBucketMetadataCallback = js.Function2[
    /* err */ js.UndefOr[nodeLib.Error | scala.Null], 
    /* metadata */ js.UndefOr[atGoogleDashCloudCommonLib.buildSrcServiceDashObjectMod.Metadata], 
    scala.Unit
  ]
  type SetBucketMetadataResponse = js.Array[requestLib.requestMod.requestNs.Response]
  type SetBucketStorageClassCallback = js.Function1[/* err */ js.UndefOr[nodeLib.Error | scala.Null], scala.Unit]
  type SetLabelsCallback = js.Function2[
    /* err */ js.UndefOr[nodeLib.Error | scala.Null], 
    /* metadata */ js.UndefOr[atGoogleDashCloudCommonLib.buildSrcServiceDashObjectMod.Metadata], 
    scala.Unit
  ]
  type SetLabelsResponse = js.Array[requestLib.requestMod.requestNs.Response]
  type UploadCallback = js.Function3[
    /* err */ nodeLib.Error | scala.Null, 
    /* file */ js.UndefOr[atGoogleDashCloudStorageLib.buildSrcFileMod.File | scala.Null], 
    /* apiResponse */ js.UndefOr[requestLib.requestMod.requestNs.Response], 
    scala.Unit
  ]
  type UploadResponse = js.Tuple2[
    atGoogleDashCloudStorageLib.buildSrcFileMod.File, 
    requestLib.requestMod.requestNs.Response
  ]
}
