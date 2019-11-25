package typings.gapiDotClientDotServiceuser.gapi.client.serviceuser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Control extends js.Object {
  /**
    * The service control environment to use. If empty, no control plane
    * feature (like quota and billing) will be enabled.
    */
  var environment: js.UndefOr[String] = js.undefined
}

object Control {
  @scala.inline
  def apply(environment: String = null): Control = {
    val __obj = js.Dynamic.literal()
    if (environment != null) __obj.updateDynamic("environment")(environment.asInstanceOf[js.Any])
    __obj.asInstanceOf[Control]
  }
}

