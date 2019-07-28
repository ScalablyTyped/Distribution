package typings.googleDashAppsDashScript.GoogleAppsScriptNs.FormsNs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PageBreakItem extends js.Object {
  def duplicate(): PageBreakItem = js.native
  def getGoToPage(): PageBreakItem = js.native
  def getHelpText(): String = js.native
  def getId(): Integer = js.native
  def getIndex(): Integer = js.native
  def getPageNavigationType(): PageNavigationType = js.native
  def getTitle(): String = js.native
  def getType(): ItemType = js.native
  def setGoToPage(goToPageItem: PageBreakItem): PageBreakItem = js.native
  def setGoToPage(navigationType: PageNavigationType): PageBreakItem = js.native
  def setHelpText(text: String): PageBreakItem = js.native
  def setTitle(title: String): PageBreakItem = js.native
}

