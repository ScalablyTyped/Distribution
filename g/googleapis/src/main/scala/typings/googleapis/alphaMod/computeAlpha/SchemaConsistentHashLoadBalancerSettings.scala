package typings.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This message defines settings for a consistent hash style load balancer.
  */
@js.native
trait SchemaConsistentHashLoadBalancerSettings extends js.Object {
  /**
    * Hash is based on HTTP Cookie. This field describes a HTTP cookie that
    * will be used as the hash key for the consistent hash load balancer. If
    * the cookie is not present, it will be generated. This field is applicable
    * if the sessionAffinity is set to HTTP_COOKIE.
    */
  var httpCookie: js.UndefOr[SchemaConsistentHashLoadBalancerSettingsHttpCookie] = js.native
  /**
    * The hash based on the value of the specified header field. This field is
    * applicable if the sessionAffinity is set to HEADER_FIELD.
    */
  var httpHeaderName: js.UndefOr[String] = js.native
  /**
    * The minimum number of virtual nodes to use for the hash ring. Defaults to
    * 1024. Larger ring sizes result in more granular load distributions. If
    * the number of hosts in the load balancing pool is larger than the ring
    * size, each host will be assigned a single virtual node.
    */
  var minimumRingSize: js.UndefOr[String] = js.native
}

object SchemaConsistentHashLoadBalancerSettings {
  @scala.inline
  def apply(
    httpCookie: SchemaConsistentHashLoadBalancerSettingsHttpCookie = null,
    httpHeaderName: String = null,
    minimumRingSize: String = null
  ): SchemaConsistentHashLoadBalancerSettings = {
    val __obj = js.Dynamic.literal()
    if (httpCookie != null) __obj.updateDynamic("httpCookie")(httpCookie.asInstanceOf[js.Any])
    if (httpHeaderName != null) __obj.updateDynamic("httpHeaderName")(httpHeaderName.asInstanceOf[js.Any])
    if (minimumRingSize != null) __obj.updateDynamic("minimumRingSize")(minimumRingSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaConsistentHashLoadBalancerSettings]
  }
}

