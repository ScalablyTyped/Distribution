package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectionSite extends js.Object {
  def getIndex(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  def getPageElement(): PageElement
}

object ConnectionSite {
  @scala.inline
  def apply(
    getIndex: js.Function0[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer],
    getPageElement: js.Function0[PageElement]
  ): ConnectionSite = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getIndex")(getIndex)
    __obj.updateDynamic("getPageElement")(getPageElement)
    __obj.asInstanceOf[ConnectionSite]
  }
}

