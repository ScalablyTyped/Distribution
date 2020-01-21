package typings.googleCloudStorage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object storageMod {
  type BucketCallback = js.Function3[
    /* err */ typings.std.Error | scala.Null, 
    /* bucket */ js.UndefOr[typings.googleCloudStorage.bucketMod.Bucket | scala.Null], 
    /* apiResponse */ js.UndefOr[typings.googleCloudCommon.serviceObjectMod.Metadata], 
    scala.Unit
  ]
  type CreateBucketResponse = js.Tuple2[
    typings.googleCloudStorage.bucketMod.Bucket, 
    typings.googleCloudCommon.serviceObjectMod.Metadata
  ]
  type CreateHmacKeyCallback = js.Function4[
    /* err */ typings.std.Error | scala.Null, 
    /* hmacKey */ js.UndefOr[typings.googleCloudStorage.hmacKeyMod.HmacKey | scala.Null], 
    /* secret */ js.UndefOr[java.lang.String | scala.Null], 
    /* apiResponse */ js.UndefOr[typings.googleCloudStorage.storageMod.HmacKeyResourceResponse], 
    scala.Unit
  ]
  type CreateHmacKeyResponse = js.Tuple3[
    typings.googleCloudStorage.hmacKeyMod.HmacKey, 
    java.lang.String, 
    typings.googleCloudStorage.storageMod.HmacKeyResourceResponse
  ]
  type GetBucketsCallback = js.Function4[
    /* err */ typings.std.Error | scala.Null, 
    /* buckets */ js.Array[typings.googleCloudStorage.bucketMod.Bucket], 
    /* nextQuery */ js.UndefOr[js.Object], 
    /* apiResponse */ js.UndefOr[typings.googleCloudCommon.serviceObjectMod.Metadata], 
    scala.Unit
  ]
  type GetBucketsResponse = js.Tuple3[
    js.Array[typings.googleCloudStorage.bucketMod.Bucket], 
    js.Object, 
    typings.googleCloudCommon.serviceObjectMod.Metadata
  ]
  type GetHmacKeysCallback = js.Function4[
    /* err */ typings.std.Error | scala.Null, 
    /* hmacKeys */ js.Array[typings.googleCloudStorage.hmacKeyMod.HmacKey] | scala.Null, 
    /* nextQuery */ js.UndefOr[js.Object], 
    /* apiResponse */ js.UndefOr[typings.googleCloudCommon.serviceObjectMod.Metadata], 
    scala.Unit
  ]
  type GetHmacKeysResponse = js.Array[js.Array[typings.googleCloudStorage.hmacKeyMod.HmacKey]]
  type GetServiceAccountCallback = js.Function3[
    /* err */ typings.std.Error | scala.Null, 
    /* serviceAccount */ js.UndefOr[typings.googleCloudStorage.storageMod.ServiceAccount], 
    /* apiResponse */ js.UndefOr[typings.googleCloudCommon.serviceObjectMod.Metadata], 
    scala.Unit
  ]
  type GetServiceAccountResponse = js.Tuple2[
    typings.googleCloudStorage.storageMod.ServiceAccount, 
    typings.googleCloudCommon.serviceObjectMod.Metadata
  ]
}
