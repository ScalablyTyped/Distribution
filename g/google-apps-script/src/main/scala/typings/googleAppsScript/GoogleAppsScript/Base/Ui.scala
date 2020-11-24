package typings.googleAppsScript.GoogleAppsScript.Base

import typings.googleAppsScript.GoogleAppsScript.HTML.HtmlOutput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An instance of the user-interface environment for a Google App that allows the script to add
  * features like menus, dialogs, and sidebars. A script can only interact with the UI for the
  * current instance of an open editor, and only if the script is container-bound to the editor.
  *
  *     // Display a dialog box with a title, message, input field, and "Yes" and "No" buttons. The
  *     // user can also close the dialog by clicking the close button in its title bar.
  *     var ui = SpreadsheetApp.getUi();
  *     var response = ui.prompt('Getting to know you', 'May I know your name?', ui.ButtonSet.YES_NO);
  *
  *     // Process the user's response.
  *     if (response.getSelectedButton() == ui.Button.YES) {
  *       Logger.log('The user\'s name is %s.', response.getResponseText());
  *     } else if (response.getSelectedButton() == ui.Button.NO) {
  *       Logger.log('The user didn\'t want to provide a name.');
  *     } else {
  *       Logger.log('The user clicked the close button in the dialog\'s title bar.');
  *     }
  */
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
  
  /** @deprecated DO NOT USE */ def showDialog(userInterface: HtmlOutput): Unit = js.native
  
  def showModalDialog(userInterface: HtmlOutput, title: String): Unit = js.native
  
  def showModelessDialog(userInterface: HtmlOutput, title: String): Unit = js.native
  
  def showSidebar(userInterface: HtmlOutput): Unit = js.native
}
