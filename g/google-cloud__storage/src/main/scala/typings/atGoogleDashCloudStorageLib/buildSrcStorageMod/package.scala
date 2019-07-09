package typings
package atGoogleDashCloudStorageLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object buildSrcStorageMod {
  type BucketCallback = js.Function3[
    /* err */ stdLib.Error | scala.Null, 
    /* bucket */ js.UndefOr[atGoogleDashCloudStorageLib.buildSrcBucketMod.Bucket | scala.Null], 
    /* apiResponse */ js.UndefOr[atGoogleDashCloudCommonLib.buildSrcServiceDashObjectMod.Metadata], 
    scala.Unit
  ]
  type CreateBucketResponse = js.Tuple2[
    atGoogleDashCloudStorageLib.buildSrcBucketMod.Bucket, 
    atGoogleDashCloudCommonLib.buildSrcServiceDashObjectMod.Metadata
  ]
  type GetBucketsCallback = js.Function4[
    /* err */ stdLib.Error | scala.Null, 
    /* buckets */ js.Array[atGoogleDashCloudStorageLib.buildSrcBucketMod.Bucket], 
    /* nextQuery */ js.UndefOr[js.Object], 
    /* apiResponse */ js.UndefOr[atGoogleDashCloudCommonLib.buildSrcServiceDashObjectMod.Metadata], 
    scala.Unit
  ]
  type GetBucketsResponse = js.Tuple3[
    js.Array[atGoogleDashCloudStorageLib.buildSrcBucketMod.Bucket], 
    js.Object, 
    atGoogleDashCloudCommonLib.buildSrcServiceDashObjectMod.Metadata
  ]
  type GetServiceAccountCallback = js.Function3[
    /* err */ stdLib.Error | scala.Null, 
    /* serviceAccount */ js.UndefOr[ServiceAccount], 
    /* apiResponse */ js.UndefOr[atGoogleDashCloudCommonLib.buildSrcServiceDashObjectMod.Metadata], 
    scala.Unit
  ]
  type GetServiceAccountResponse = js.Tuple2[ServiceAccount, atGoogleDashCloudCommonLib.buildSrcServiceDashObjectMod.Metadata]
}
