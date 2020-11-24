package typings.googleCloudStorage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object bucketMod {
  
  type BucketExistsCallback = typings.googleCloudCommon.serviceObjectMod.ExistsCallback
  
  type BucketExistsResponse = js.Array[scala.Boolean]
  
  type BucketLockCallback = js.Function2[
    /* err */ js.UndefOr[typings.std.Error | scala.Null], 
    /* apiResponse */ js.UndefOr[typings.googleCloudCommon.serviceObjectMod.Metadata], 
    scala.Unit
  ]
  
  type BucketLockResponse = js.Array[typings.googleCloudCommon.serviceObjectMod.Metadata]
  
  type CombineCallback = js.Function3[
    /* err */ typings.std.Error | scala.Null, 
    /* newFile */ typings.googleCloudStorage.fileMod.File | scala.Null, 
    /* apiResponse */ typings.googleCloudCommon.serviceObjectMod.Metadata, 
    scala.Unit
  ]
  
  type CombineResponse = js.Tuple2[
    typings.googleCloudStorage.fileMod.File, 
    typings.googleCloudCommon.serviceObjectMod.Metadata
  ]
  
  type CreateChannelCallback = js.Function3[
    /* err */ typings.std.Error | scala.Null, 
    /* channel */ typings.googleCloudStorage.channelMod.Channel | scala.Null, 
    /* apiResponse */ typings.googleCloudCommon.serviceObjectMod.Metadata, 
    scala.Unit
  ]
  
  type CreateChannelResponse = js.Tuple2[
    typings.googleCloudStorage.channelMod.Channel, 
    typings.googleCloudCommon.serviceObjectMod.Metadata
  ]
  
  type CreateNotificationCallback = js.Function3[
    /* err */ typings.std.Error | scala.Null, 
    /* notification */ typings.googleCloudStorage.notificationMod.Notification | scala.Null, 
    /* apiResponse */ typings.googleCloudCommon.serviceObjectMod.Metadata, 
    scala.Unit
  ]
  
  type CreateNotificationResponse = js.Tuple2[
    typings.googleCloudStorage.notificationMod.Notification, 
    typings.googleCloudCommon.serviceObjectMod.Metadata
  ]
  
  type DeleteBucketResponse = js.Array[typings.googleCloudCommon.serviceObjectMod.Metadata]
  
  type DeleteFilesCallback = js.Function2[
    /* err */ typings.std.Error | js.Array[typings.std.Error] | scala.Null, 
    /* apiResponse */ js.UndefOr[js.Object], 
    scala.Unit
  ]
  
  type DeleteLabelsCallback = typings.googleCloudStorage.bucketMod.SetLabelsCallback
  
  type DeleteLabelsResponse = js.Array[typings.googleCloudCommon.serviceObjectMod.Metadata]
  
  type DisableRequesterPaysCallback = js.Function2[
    /* err */ js.UndefOr[typings.std.Error | scala.Null], 
    /* apiResponse */ js.UndefOr[js.Object], 
    scala.Unit
  ]
  
  type DisableRequesterPaysResponse = js.Array[typings.googleCloudCommon.serviceObjectMod.Metadata]
  
  type EnableRequesterPaysCallback = js.Function2[
    /* err */ js.UndefOr[typings.std.Error | scala.Null], 
    /* apiResponse */ js.UndefOr[typings.googleCloudCommon.serviceObjectMod.Metadata], 
    scala.Unit
  ]
  
  type EnableRequesterPaysResponse = js.Array[typings.googleCloudCommon.serviceObjectMod.Metadata]
  
  type GetBucketCallback = js.Function3[
    /* err */ typings.googleCloudCommon.mod.ApiError | scala.Null, 
    /* bucket */ typings.googleCloudStorage.bucketMod.Bucket | scala.Null, 
    /* apiResponse */ typings.googleCloudCommon.serviceObjectMod.Metadata, 
    scala.Unit
  ]
  
  type GetBucketMetadataCallback = js.Function3[
    /* err */ typings.googleCloudCommon.mod.ApiError | scala.Null, 
    /* metadata */ typings.googleCloudCommon.serviceObjectMod.Metadata | scala.Null, 
    /* apiResponse */ typings.googleCloudCommon.serviceObjectMod.Metadata, 
    scala.Unit
  ]
  
  type GetBucketMetadataResponse = js.Tuple2[
    typings.googleCloudCommon.serviceObjectMod.Metadata, 
    typings.googleCloudCommon.serviceObjectMod.Metadata
  ]
  
  type GetBucketResponse = js.Tuple2[
    typings.googleCloudStorage.bucketMod.Bucket, 
    typings.googleCloudCommon.serviceObjectMod.Metadata
  ]
  
  type GetFilesCallback = js.Function4[
    /* err */ typings.std.Error | scala.Null, 
    /* files */ js.UndefOr[js.Array[typings.googleCloudStorage.fileMod.File]], 
    /* nextQuery */ js.UndefOr[js.Object], 
    /* apiResponse */ js.UndefOr[typings.googleCloudCommon.serviceObjectMod.Metadata], 
    scala.Unit
  ]
  
  type GetFilesResponse = js.Tuple3[
    js.Array[typings.googleCloudStorage.fileMod.File], 
    js.Object, 
    typings.googleCloudCommon.serviceObjectMod.Metadata
  ]
  
  type GetLabelsCallback = js.Function2[
    /* err */ typings.std.Error | scala.Null, 
    /* labels */ js.Object | scala.Null, 
    scala.Unit
  ]
  
  type GetLabelsResponse = js.Array[typings.googleCloudCommon.serviceObjectMod.Metadata]
  
  type GetNotificationsCallback = js.Function3[
    /* err */ typings.std.Error | scala.Null, 
    /* notifications */ js.Array[typings.googleCloudStorage.notificationMod.Notification] | scala.Null, 
    /* apiResponse */ typings.googleCloudCommon.serviceObjectMod.Metadata, 
    scala.Unit
  ]
  
  type GetNotificationsResponse = js.Tuple2[
    js.Array[typings.googleCloudStorage.notificationMod.Notification], 
    typings.googleCloudCommon.serviceObjectMod.Metadata
  ]
  
  type Labels = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  
  type MakeAllFilesPublicPrivateCallback = js.Function2[
    /* err */ js.UndefOr[typings.std.Error | js.Array[typings.std.Error] | scala.Null], 
    /* files */ js.UndefOr[js.Array[typings.googleCloudStorage.fileMod.File]], 
    scala.Unit
  ]
  
  type MakeAllFilesPublicPrivateResponse = js.Array[js.Array[typings.googleCloudStorage.fileMod.File]]
  
  type MakeBucketPrivateCallback = js.Function2[
    /* err */ js.UndefOr[typings.std.Error | scala.Null], 
    /* files */ js.UndefOr[js.Array[typings.googleCloudStorage.fileMod.File]], 
    scala.Unit
  ]
  
  type MakeBucketPrivateResponse = js.Array[js.Array[typings.googleCloudStorage.fileMod.File]]
  
  type MakeBucketPublicCallback = js.Function2[
    /* err */ js.UndefOr[typings.std.Error | scala.Null], 
    /* files */ js.UndefOr[js.Array[typings.googleCloudStorage.fileMod.File]], 
    scala.Unit
  ]
  
  type MakeBucketPublicResponse = js.Array[js.Array[typings.googleCloudStorage.fileMod.File]]
  
  type SetBucketMetadataCallback = js.Function2[
    /* err */ js.UndefOr[typings.std.Error | scala.Null], 
    /* metadata */ js.UndefOr[typings.googleCloudCommon.serviceObjectMod.Metadata], 
    scala.Unit
  ]
  
  type SetBucketMetadataResponse = js.Array[typings.googleCloudCommon.serviceObjectMod.Metadata]
  
  type SetBucketStorageClassCallback = js.Function1[/* err */ js.UndefOr[typings.std.Error | scala.Null], scala.Unit]
  
  type SetLabelsCallback = js.Function2[
    /* err */ js.UndefOr[typings.std.Error | scala.Null], 
    /* metadata */ js.UndefOr[typings.googleCloudCommon.serviceObjectMod.Metadata], 
    scala.Unit
  ]
  
  type SetLabelsResponse = js.Array[typings.googleCloudCommon.serviceObjectMod.Metadata]
  
  type UploadCallback = js.Function3[
    /* err */ typings.std.Error | scala.Null, 
    /* file */ js.UndefOr[typings.googleCloudStorage.fileMod.File | scala.Null], 
    /* apiResponse */ js.UndefOr[typings.googleCloudCommon.serviceObjectMod.Metadata], 
    scala.Unit
  ]
  
  type UploadResponse = js.Tuple2[
    typings.googleCloudStorage.fileMod.File, 
    typings.googleCloudCommon.serviceObjectMod.Metadata
  ]
}
