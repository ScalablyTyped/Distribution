package typings.atGoogleDashCloudStorage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object buildSrcStorageMod {
  import typings.atGoogleDashCloudCommon.buildSrcServiceDashObjectMod.Metadata
  import typings.atGoogleDashCloudStorage.buildSrcBucketMod.Bucket
  import typings.std.Error

  type BucketCallback = js.Function3[
    /* err */ Error | Null, 
    /* bucket */ js.UndefOr[Bucket | Null], 
    /* apiResponse */ js.UndefOr[Metadata], 
    Unit
  ]
  type CreateBucketResponse = js.Tuple2[Bucket, Metadata]
  type GetBucketsCallback = js.Function4[
    /* err */ Error | Null, 
    /* buckets */ js.Array[Bucket], 
    /* nextQuery */ js.UndefOr[js.Object], 
    /* apiResponse */ js.UndefOr[Metadata], 
    Unit
  ]
  type GetBucketsResponse = js.Tuple3[js.Array[Bucket], js.Object, Metadata]
  type GetServiceAccountCallback = js.Function3[
    /* err */ Error | Null, 
    /* serviceAccount */ js.UndefOr[ServiceAccount], 
    /* apiResponse */ js.UndefOr[Metadata], 
    Unit
  ]
  type GetServiceAccountResponse = js.Tuple2[ServiceAccount, Metadata]
}
