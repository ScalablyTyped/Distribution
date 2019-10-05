package typings.googleDashAppsDashScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThirdPartyAuthenticationToken extends js.Object {
  var name: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[String] = js.undefined
}

object ThirdPartyAuthenticationToken {
  @scala.inline
  def apply(name: String = null, value: String = null): ThirdPartyAuthenticationToken = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[ThirdPartyAuthenticationToken]
  }
}

