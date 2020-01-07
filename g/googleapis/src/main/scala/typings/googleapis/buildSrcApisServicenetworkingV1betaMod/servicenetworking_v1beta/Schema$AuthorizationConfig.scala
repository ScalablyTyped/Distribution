package typings.googleapis.buildSrcApisServicenetworkingV1betaMod.servicenetworking_v1beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Configuration of authorization.  This section determines the authorization
  * provider, if unspecified, then no authorization check will be done.
  * Example:      experimental:       authorization:         provider:
  * firebaserules.googleapis.com
  */
@js.native
trait Schema$AuthorizationConfig extends js.Object {
  /**
    * The name of the authorization provider, such as
    * firebaserules.googleapis.com.
    */
  var provider: js.UndefOr[String] = js.native
}

object Schema$AuthorizationConfig {
  @scala.inline
  def apply(provider: String = null): Schema$AuthorizationConfig = {
    val __obj = js.Dynamic.literal()
    if (provider != null) __obj.updateDynamic("provider")(provider.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$AuthorizationConfig]
  }
}

