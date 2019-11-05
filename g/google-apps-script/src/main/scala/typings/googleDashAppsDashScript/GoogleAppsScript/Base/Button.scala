package typings.googleDashAppsDashScript.GoogleAppsScript.Base

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Button extends js.Object

/**
  * An enum representing predetermined, localized dialog buttons returned by an alert or PromptResponse.getSelectedButton() to indicate
  * which button in a dialog the user clicked. These values cannot be set; to add buttons to an
  * alert or prompt, use ButtonSet instead.
  *
  *     // Display a dialog box with a message and "Yes" and "No" buttons.
  *     var ui = DocumentApp.getUi();
  *     var response = ui.alert('Are you sure you want to continue?', ui.ButtonSet.YES_NO);
  *
  *     // Process the user's response.
  *     if (response == ui.Button.YES) {
  *       Logger.log('The user clicked "Yes."');
  *     } else {
  *       Logger.log('The user clicked "No" or the dialog\'s close button.');
  *     }
  */
@JSGlobal("GoogleAppsScript.Base.Button")
@js.native
object Button extends js.Object {
  @js.native
  sealed trait CANCEL extends Button
  
  @js.native
  sealed trait CLOSE extends Button
  
  @js.native
  sealed trait NO extends Button
  
  @js.native
  sealed trait OK extends Button
  
  @js.native
  sealed trait YES extends Button
  
  /* 2 */ val CANCEL: typings.googleDashAppsDashScript.GoogleAppsScript.Base.Button.CANCEL with Double = js.native
  /* 0 */ val CLOSE: typings.googleDashAppsDashScript.GoogleAppsScript.Base.Button.CLOSE with Double = js.native
  /* 4 */ val NO: typings.googleDashAppsDashScript.GoogleAppsScript.Base.Button.NO with Double = js.native
  /* 1 */ val OK: typings.googleDashAppsDashScript.GoogleAppsScript.Base.Button.OK with Double = js.native
  /* 3 */ val YES: typings.googleDashAppsDashScript.GoogleAppsScript.Base.Button.YES with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Button with Double] = js.native
}

