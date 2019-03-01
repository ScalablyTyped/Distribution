package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.CardUnderscoreServiceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenLink extends js.Object {
  def setOnClose(onClose: OnClose): OpenLink
  def setOpenAs(openAs: OpenAs): OpenLink
  def setUrl(url: java.lang.String): OpenLink
}

object OpenLink {
  @scala.inline
  def apply(
    setOnClose: js.Function1[OnClose, OpenLink],
    setOpenAs: js.Function1[OpenAs, OpenLink],
    setUrl: js.Function1[java.lang.String, OpenLink]
  ): OpenLink = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("setOnClose")(setOnClose)
    __obj.updateDynamic("setOpenAs")(setOpenAs)
    __obj.updateDynamic("setUrl")(setUrl)
    __obj.asInstanceOf[OpenLink]
  }
}

