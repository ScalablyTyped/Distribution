package typings.googleDashAppsDashScript.GoogleAppsScript.Mirror.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthToken extends js.Object {
  var authToken: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object AuthToken {
  @scala.inline
  def apply(authToken: String = null, `type`: String = null): AuthToken = {
    val __obj = js.Dynamic.literal()
    if (authToken != null) __obj.updateDynamic("authToken")(authToken)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[AuthToken]
  }
}

