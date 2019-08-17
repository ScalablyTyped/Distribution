package typings.atGoogleDashCloudStorage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object buildSrcBucketMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.atGoogleDashCloudCommon.atGoogleDashCloudCommonMod.ApiError
  import typings.atGoogleDashCloudCommon.buildSrcServiceDashObjectMod.ExistsCallback
  import typings.atGoogleDashCloudCommon.buildSrcServiceDashObjectMod.Metadata
  import typings.atGoogleDashCloudStorage.buildSrcChannelMod.Channel
  import typings.atGoogleDashCloudStorage.buildSrcFileMod.File
  import typings.atGoogleDashCloudStorage.buildSrcNotificationMod.Notification
  import typings.std.Error

  type BucketExistsCallback = ExistsCallback
  type BucketExistsResponse = js.Array[Boolean]
  type BucketLockCallback = js.Function2[/* err */ js.UndefOr[Error | Null], /* apiResponse */ js.UndefOr[Metadata], Unit]
  type BucketLockResponse = js.Array[Metadata]
  type CombineCallback = js.Function3[/* err */ Error | Null, /* newFile */ File | Null, /* apiResponse */ Metadata, Unit]
  type CombineResponse = js.Tuple2[File, Metadata]
  type CreateChannelCallback = js.Function3[/* err */ Error | Null, /* channel */ Channel | Null, /* apiResponse */ Metadata, Unit]
  type CreateChannelResponse = js.Tuple2[Channel, Metadata]
  type CreateNotificationCallback = js.Function3[
    /* err */ Error | Null, 
    /* notification */ Notification | Null, 
    /* apiResponse */ Metadata, 
    Unit
  ]
  type CreateNotificationResponse = js.Tuple2[Notification, Metadata]
  type DeleteBucketResponse = js.Array[Metadata]
  type DeleteFilesCallback = js.Function2[
    /* err */ Error | js.Array[Error] | Null, 
    /* apiResponse */ js.UndefOr[js.Object], 
    Unit
  ]
  type DeleteLabelsCallback = SetLabelsCallback
  type DeleteLabelsResponse = js.Array[Metadata]
  type DisableRequesterPaysCallback = js.Function2[/* err */ js.UndefOr[Error | Null], /* apiResponse */ js.UndefOr[js.Object], Unit]
  type DisableRequesterPaysResponse = js.Array[Metadata]
  type EnableRequesterPaysCallback = js.Function2[/* err */ js.UndefOr[Error | Null], /* apiResponse */ js.UndefOr[Metadata], Unit]
  type EnableRequesterPaysResponse = js.Array[Metadata]
  type GetBucketCallback = js.Function3[
    /* err */ ApiError | Null, 
    /* bucket */ Bucket | Null, 
    /* apiResponse */ Metadata, 
    Unit
  ]
  type GetBucketMetadataCallback = js.Function3[
    /* err */ ApiError | Null, 
    /* metadata */ Metadata | Null, 
    /* apiResponse */ Metadata, 
    Unit
  ]
  type GetBucketMetadataResponse = js.Tuple2[Metadata, Metadata]
  type GetBucketResponse = js.Tuple2[Bucket, Metadata]
  type GetFilesCallback = js.Function4[
    /* err */ Error | Null, 
    /* files */ js.UndefOr[js.Array[File]], 
    /* nextQuery */ js.UndefOr[js.Object], 
    /* apiResponse */ js.UndefOr[Metadata], 
    Unit
  ]
  type GetFilesResponse = js.Tuple3[js.Array[File], js.Object, Metadata]
  type GetLabelsCallback = js.Function2[/* err */ Error | Null, /* labels */ js.Object | Null, Unit]
  type GetLabelsResponse = js.Array[Metadata]
  type GetNotificationsCallback = js.Function3[
    /* err */ Error | Null, 
    /* notifications */ js.Array[Notification] | Null, 
    /* apiResponse */ Metadata, 
    Unit
  ]
  type GetNotificationsResponse = js.Tuple2[js.Array[Notification], Metadata]
  type Labels = StringDictionary[String]
  type MakeAllFilesPublicPrivateCallback = js.Function2[
    /* err */ js.UndefOr[Error | js.Array[Error] | Null], 
    /* files */ js.UndefOr[js.Array[File]], 
    Unit
  ]
  type MakeAllFilesPublicPrivateResponse = js.Array[js.Array[File]]
  type MakeBucketPrivateCallback = js.Function2[/* err */ js.UndefOr[Error | Null], /* files */ js.UndefOr[js.Array[File]], Unit]
  type MakeBucketPrivateResponse = js.Array[js.Array[File]]
  type MakeBucketPublicCallback = js.Function2[/* err */ js.UndefOr[Error | Null], /* files */ js.UndefOr[js.Array[File]], Unit]
  type MakeBucketPublicResponse = js.Array[js.Array[File]]
  type SetBucketMetadataCallback = js.Function2[/* err */ js.UndefOr[Error | Null], /* metadata */ js.UndefOr[Metadata], Unit]
  type SetBucketMetadataResponse = js.Array[Metadata]
  type SetBucketStorageClassCallback = js.Function1[/* err */ js.UndefOr[Error | Null], Unit]
  type SetLabelsCallback = js.Function2[/* err */ js.UndefOr[Error | Null], /* metadata */ js.UndefOr[Metadata], Unit]
  type SetLabelsResponse = js.Array[Metadata]
  type UploadCallback = js.Function3[
    /* err */ Error | Null, 
    /* file */ js.UndefOr[File | Null], 
    /* apiResponse */ js.UndefOr[Metadata], 
    Unit
  ]
  type UploadResponse = js.Tuple2[File, Metadata]
}
