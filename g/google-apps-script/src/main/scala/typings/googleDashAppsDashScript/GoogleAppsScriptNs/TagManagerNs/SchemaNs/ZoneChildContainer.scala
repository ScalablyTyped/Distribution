package typings.googleDashAppsDashScript.GoogleAppsScriptNs.TagManagerNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZoneChildContainer extends js.Object {
  var nickname: js.UndefOr[String] = js.undefined
  var publicId: js.UndefOr[String] = js.undefined
}

object ZoneChildContainer {
  @scala.inline
  def apply(nickname: String = null, publicId: String = null): ZoneChildContainer = {
    val __obj = js.Dynamic.literal()
    if (nickname != null) __obj.updateDynamic("nickname")(nickname)
    if (publicId != null) __obj.updateDynamic("publicId")(publicId)
    __obj.asInstanceOf[ZoneChildContainer]
  }
}

