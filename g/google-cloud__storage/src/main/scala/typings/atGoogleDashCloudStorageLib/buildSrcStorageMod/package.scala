package typings
package atGoogleDashCloudStorageLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object buildSrcStorageMod {
  type BucketCallback = js.Function3[
    /* err */ stdLib.Error | scala.Null, 
    /* bucket */ js.UndefOr[atGoogleDashCloudStorageLib.buildSrcBucketMod.Bucket | scala.Null], 
    /* apiResponse */ js.UndefOr[requestLib.requestMod.Response], 
    scala.Unit
  ]
  type CreateBucketResponse = js.Tuple2[
    atGoogleDashCloudStorageLib.buildSrcBucketMod.Bucket, 
    requestLib.requestMod.Response
  ]
  type GetBucketsCallback = js.Function2[
    /* err */ stdLib.Error | scala.Null, 
    /* buckets */ js.Array[atGoogleDashCloudStorageLib.buildSrcBucketMod.Bucket], 
    scala.Unit
  ]
  type GetBucketsResponse = js.Array[js.Array[atGoogleDashCloudStorageLib.buildSrcBucketMod.Bucket]]
  type GetServiceAccountCallback = js.Function3[
    /* err */ stdLib.Error | scala.Null, 
    /* serviceAccount */ js.UndefOr[ServiceAccount], 
    /* apiResponse */ js.UndefOr[requestLib.requestMod.Response], 
    scala.Unit
  ]
  type GetServiceAccountResponse = js.Tuple2[ServiceAccount, requestLib.requestMod.Response]
}
