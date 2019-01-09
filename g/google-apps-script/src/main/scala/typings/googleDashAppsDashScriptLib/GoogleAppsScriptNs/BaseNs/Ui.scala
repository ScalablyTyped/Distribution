package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Ui extends js.Object {
  var Button: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Button */ js.Any = js.native
  var ButtonSet: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ButtonSet */ js.Any = js.native
  def alert(prompt: java.lang.String): Button = js.native
  def alert(prompt: java.lang.String, buttons: ButtonSet): Button = js.native
  def alert(title: java.lang.String, prompt: java.lang.String, buttons: ButtonSet): Button = js.native
  def createAddonMenu(): Menu = js.native
  def createMenu(caption: java.lang.String): Menu = js.native
  def prompt(prompt: java.lang.String): PromptResponse = js.native
  def prompt(prompt: java.lang.String, buttons: ButtonSet): PromptResponse = js.native
  def prompt(title: java.lang.String, prompt: java.lang.String, buttons: ButtonSet): PromptResponse = js.native
  def showDialog(userInterface: js.Object): scala.Unit = js.native
  def showModalDialog(userInterface: js.Object, title: java.lang.String): scala.Unit = js.native
  def showModelessDialog(userInterface: js.Object, title: java.lang.String): scala.Unit = js.native
  def showSidebar(userInterface: js.Object): scala.Unit = js.native
}

