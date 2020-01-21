package typings.googleapis.appengineV1betaMod.appengineV1beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Rules to match an HTTP request and dispatch that request to a service.
  */
@js.native
trait SchemaUrlDispatchRule extends js.Object {
  /**
    * Domain name to match against. The wildcard &quot;*&quot; is supported if
    * specified before a period: &quot;*.&quot;.Defaults to matching all
    * domains: &quot;*&quot;.
    */
  var domain: js.UndefOr[String] = js.native
  /**
    * Pathname within the host. Must start with a &quot;/&quot;. A single
    * &quot;*&quot; can be included at the end of the path.The sum of the
    * lengths of the domain and path may not exceed 100 characters.
    */
  var path: js.UndefOr[String] = js.native
  /**
    * Resource ID of a service in this application that should serve the
    * matched request. The service must already exist. Example: default.
    */
  var service: js.UndefOr[String] = js.native
}

object SchemaUrlDispatchRule {
  @scala.inline
  def apply(domain: String = null, path: String = null, service: String = null): SchemaUrlDispatchRule = {
    val __obj = js.Dynamic.literal()
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (service != null) __obj.updateDynamic("service")(service.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaUrlDispatchRule]
  }
}

