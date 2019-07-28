package typings.googleDashAppsDashScript.GoogleAppsScriptNs.SlidesNs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectionSite extends js.Object {
  def getIndex(): Integer
  def getPageElement(): PageElement
}

object ConnectionSite {
  @scala.inline
  def apply(getIndex: () => Integer, getPageElement: () => PageElement): ConnectionSite = {
    val __obj = js.Dynamic.literal(getIndex = js.Any.fromFunction0(getIndex), getPageElement = js.Any.fromFunction0(getPageElement))
  
    __obj.asInstanceOf[ConnectionSite]
  }
}

