package typings.googleapis.betaMod.computeBeta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Message containing Cloud CDN configuration for a backend bucket.
  */
@js.native
trait SchemaBackendBucketCdnPolicy extends js.Object {
  /**
    * Maximum number of seconds the response to a signed URL request will be
    * considered fresh. After this time period, the response will be
    * revalidated before being served. Defaults to 1hr (3600s). When serving
    * responses to signed URL requests, Cloud CDN will internally behave as
    * though all responses from this backend had a &quot;Cache-Control: public,
    * max-age=[TTL]&quot; header, regardless of any existing Cache-Control
    * header. The actual headers served in responses will not be altered.
    */
  var signedUrlCacheMaxAgeSec: js.UndefOr[String] = js.native
  /**
    * [Output Only] Names of the keys for signing request URLs.
    */
  var signedUrlKeyNames: js.UndefOr[js.Array[String]] = js.native
}

object SchemaBackendBucketCdnPolicy {
  @scala.inline
  def apply(signedUrlCacheMaxAgeSec: String = null, signedUrlKeyNames: js.Array[String] = null): SchemaBackendBucketCdnPolicy = {
    val __obj = js.Dynamic.literal()
    if (signedUrlCacheMaxAgeSec != null) __obj.updateDynamic("signedUrlCacheMaxAgeSec")(signedUrlCacheMaxAgeSec.asInstanceOf[js.Any])
    if (signedUrlKeyNames != null) __obj.updateDynamic("signedUrlKeyNames")(signedUrlKeyNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaBackendBucketCdnPolicy]
  }
}

