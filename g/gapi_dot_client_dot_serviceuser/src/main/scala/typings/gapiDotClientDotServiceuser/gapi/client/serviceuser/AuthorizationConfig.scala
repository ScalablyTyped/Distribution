package typings.gapiDotClientDotServiceuser.gapi.client.serviceuser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthorizationConfig extends js.Object {
  /**
    * The name of the authorization provider, such as
    * firebaserules.googleapis.com.
    */
  var provider: js.UndefOr[String] = js.undefined
}

object AuthorizationConfig {
  @scala.inline
  def apply(provider: String = null): AuthorizationConfig = {
    val __obj = js.Dynamic.literal()
    if (provider != null) __obj.updateDynamic("provider")(provider)
    __obj.asInstanceOf[AuthorizationConfig]
  }
}

