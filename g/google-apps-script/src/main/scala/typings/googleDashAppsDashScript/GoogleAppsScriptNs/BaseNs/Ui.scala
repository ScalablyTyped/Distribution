package typings.googleDashAppsDashScript.GoogleAppsScriptNs.BaseNs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.HTMLNs.HtmlOutput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Ui extends js.Object {
  var Button: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Button */ js.Any = js.native
  var ButtonSet: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ButtonSet */ js.Any = js.native
  def alert(prompt: String): Button = js.native
  def alert(prompt: String, buttons: ButtonSet): Button = js.native
  def alert(title: String, prompt: String, buttons: ButtonSet): Button = js.native
  def createAddonMenu(): Menu = js.native
  def createMenu(caption: String): Menu = js.native
  def prompt(prompt: String): PromptResponse = js.native
  def prompt(prompt: String, buttons: ButtonSet): PromptResponse = js.native
  def prompt(title: String, prompt: String, buttons: ButtonSet): PromptResponse = js.native
  /** @deprecated DO NOT USE */
  def showDialog(userInterface: HtmlOutput): Unit = js.native
  def showModalDialog(userInterface: HtmlOutput, title: String): Unit = js.native
  def showModelessDialog(userInterface: HtmlOutput, title: String): Unit = js.native
  def showSidebar(userInterface: HtmlOutput): Unit = js.native
}

