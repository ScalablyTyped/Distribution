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
    getIndex: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    getPageElement: () => PageElement
  ): ConnectionSite = {
    val __obj = js.Dynamic.literal(getIndex = js.Any.fromFunction0(getIndex), getPageElement = js.Any.fromFunction0(getPageElement))
  
    __obj.asInstanceOf[ConnectionSite]
  }
}

