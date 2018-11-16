package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.FormsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PageBreakItem extends js.Object {
  def duplicate(): PageBreakItem = js.native
  def getGoToPage(): PageBreakItem = js.native
  def getHelpText(): java.lang.String = js.native
  def getId(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer = js.native
  def getIndex(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer = js.native
  def getPageNavigationType(): PageNavigationType = js.native
  def getTitle(): java.lang.String = js.native
  def getType(): ItemType = js.native
  def setGoToPage(goToPageItem: PageBreakItem): PageBreakItem = js.native
  def setGoToPage(navigationType: PageNavigationType): PageBreakItem = js.native
  def setHelpText(text: java.lang.String): PageBreakItem = js.native
  def setTitle(title: java.lang.String): PageBreakItem = js.native
}

