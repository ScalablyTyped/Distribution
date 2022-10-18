package typings.googleCloudStorage.buildSrcStorageMod

import typings.googleCloudStorage.buildSrcBucketMod.Bucket
import typings.googleCloudStorage.buildSrcHmacKeyMod.HmacKey
import typings.googleCloudStorage.buildSrcNodejsCommonMod.ApiError
import typings.googleCloudStorage.buildSrcNodejsCommonServiceObjectMod.Metadata
import typings.googleCloudStorage.buildSrcStorageMod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def AUTO_RETRY_DEFAULT: /* true */ Boolean = ^.asInstanceOf[js.Dynamic].selectDynamic("AUTO_RETRY_DEFAULT").asInstanceOf[/* true */ Boolean]

inline def MAX_RETRY_DEFAULT: /* 3 */ Double = ^.asInstanceOf[js.Dynamic].selectDynamic("MAX_RETRY_DEFAULT").asInstanceOf[/* 3 */ Double]

inline def MAX_RETRY_DELAY_DEFAULT: /* 64 */ Double = ^.asInstanceOf[js.Dynamic].selectDynamic("MAX_RETRY_DELAY_DEFAULT").asInstanceOf[/* 64 */ Double]

inline def PROTOCOL_REGEX: js.RegExp = ^.asInstanceOf[js.Dynamic].selectDynamic("PROTOCOL_REGEX").asInstanceOf[js.RegExp]

inline def RETRYABLE_ERR_FN_DEFAULT(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("RETRYABLE_ERR_FN_DEFAULT")().asInstanceOf[Boolean]
inline def RETRYABLE_ERR_FN_DEFAULT(err: ApiError): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("RETRYABLE_ERR_FN_DEFAULT")(err.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def RETRY_DELAY_MULTIPLIER_DEFAULT: /* 2 */ Double = ^.asInstanceOf[js.Dynamic].selectDynamic("RETRY_DELAY_MULTIPLIER_DEFAULT").asInstanceOf[/* 2 */ Double]

inline def TOTAL_TIMEOUT_DEFAULT: /* 600 */ Double = ^.asInstanceOf[js.Dynamic].selectDynamic("TOTAL_TIMEOUT_DEFAULT").asInstanceOf[/* 600 */ Double]

type BucketCallback = js.Function3[
/* err */ js.Error | Null, 
/* bucket */ js.UndefOr[Bucket | Null], 
/* apiResponse */ js.UndefOr[Metadata], 
Unit]

type CreateBucketResponse = js.Tuple2[Bucket, Metadata]

type CreateHmacKeyCallback = js.Function4[
/* err */ js.Error | Null, 
/* hmacKey */ js.UndefOr[HmacKey | Null], 
/* secret */ js.UndefOr[String | Null], 
/* apiResponse */ js.UndefOr[HmacKeyResourceResponse], 
Unit]

type CreateHmacKeyResponse = js.Tuple3[HmacKey, String, HmacKeyResourceResponse]

type GetBucketsCallback = js.Function4[
/* err */ js.Error | Null, 
/* buckets */ js.Array[Bucket], 
/* nextQuery */ js.UndefOr[js.Object], 
/* apiResponse */ js.UndefOr[Metadata], 
Unit]

type GetBucketsResponse = js.Tuple3[js.Array[Bucket], js.Object, Metadata]

type GetHmacKeysCallback = js.Function4[
/* err */ js.Error | Null, 
/* hmacKeys */ js.Array[HmacKey] | Null, 
/* nextQuery */ js.UndefOr[js.Object], 
/* apiResponse */ js.UndefOr[Metadata], 
Unit]

type GetHmacKeysResponse = js.Array[js.Array[HmacKey]]

type GetServiceAccountCallback = js.Function3[
/* err */ js.Error | Null, 
/* serviceAccount */ js.UndefOr[ServiceAccount], 
/* apiResponse */ js.UndefOr[Metadata], 
Unit]

type GetServiceAccountResponse = js.Tuple2[ServiceAccount, Metadata]
