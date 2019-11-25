package typings.gapiDotClientDotCivicinfo.gapi.client.civicinfo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContextParams extends js.Object {
  var clientProfile: js.UndefOr[String] = js.undefined
}

object ContextParams {
  @scala.inline
  def apply(clientProfile: String = null): ContextParams = {
    val __obj = js.Dynamic.literal()
    if (clientProfile != null) __obj.updateDynamic("clientProfile")(clientProfile.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContextParams]
  }
}

