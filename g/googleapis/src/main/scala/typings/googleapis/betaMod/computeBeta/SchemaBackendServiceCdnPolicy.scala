package typings.googleapis.betaMod.computeBeta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Message containing Cloud CDN configuration for a backend service.
  */
@js.native
trait SchemaBackendServiceCdnPolicy extends js.Object {
  /**
    * The CacheKeyPolicy for this CdnPolicy.
    */
  var cacheKeyPolicy: js.UndefOr[SchemaCacheKeyPolicy] = js.native
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

object SchemaBackendServiceCdnPolicy {
  @scala.inline
  def apply(
    cacheKeyPolicy: SchemaCacheKeyPolicy = null,
    signedUrlCacheMaxAgeSec: String = null,
    signedUrlKeyNames: js.Array[String] = null
  ): SchemaBackendServiceCdnPolicy = {
    val __obj = js.Dynamic.literal()
    if (cacheKeyPolicy != null) __obj.updateDynamic("cacheKeyPolicy")(cacheKeyPolicy.asInstanceOf[js.Any])
    if (signedUrlCacheMaxAgeSec != null) __obj.updateDynamic("signedUrlCacheMaxAgeSec")(signedUrlCacheMaxAgeSec.asInstanceOf[js.Any])
    if (signedUrlKeyNames != null) __obj.updateDynamic("signedUrlKeyNames")(signedUrlKeyNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaBackendServiceCdnPolicy]
  }
}

