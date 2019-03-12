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
    setOnClose: OnClose => OpenLink,
    setOpenAs: OpenAs => OpenLink,
    setUrl: java.lang.String => OpenLink
  ): OpenLink = {
    val __obj = js.Dynamic.literal(setOnClose = js.Any.fromFunction1(setOnClose), setOpenAs = js.Any.fromFunction1(setOpenAs), setUrl = js.Any.fromFunction1(setUrl))
  
    __obj.asInstanceOf[OpenLink]
  }
}

