package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagmanagerUnderscoreV2Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZoneChildContainer extends js.Object {
  var nickname: js.UndefOr[java.lang.String] = js.undefined
  var publicId: js.UndefOr[java.lang.String] = js.undefined
}

object ZoneChildContainer {
  @scala.inline
  def apply(nickname: java.lang.String = null, publicId: java.lang.String = null): ZoneChildContainer = {
    val __obj = js.Dynamic.literal()
    if (nickname != null) __obj.updateDynamic("nickname")(nickname)
    if (publicId != null) __obj.updateDynamic("publicId")(publicId)
    __obj.asInstanceOf[ZoneChildContainer]
  }
}

