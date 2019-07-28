package typings.googleDashAppsDashScript.GoogleAppsScriptNs.BaseNs

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
  def showDialog(userInterface: js.Object): Unit = js.native
  def showModalDialog(userInterface: js.Object, title: String): Unit = js.native
  def showModelessDialog(userInterface: js.Object, title: String): Unit = js.native
  def showSidebar(userInterface: js.Object): Unit = js.native
}

