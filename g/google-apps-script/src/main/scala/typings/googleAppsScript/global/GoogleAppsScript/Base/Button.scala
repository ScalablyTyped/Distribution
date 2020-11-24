package typings.googleAppsScript.global.GoogleAppsScript.Base

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.googleAppsScript.GoogleAppsScript.Base.Button with Double] = js.native
  
  /* 2 */ val CANCEL: typings.googleAppsScript.GoogleAppsScript.Base.Button.CANCEL with Double = js.native
  
  /* 0 */ val CLOSE: typings.googleAppsScript.GoogleAppsScript.Base.Button.CLOSE with Double = js.native
  
  /* 4 */ val NO: typings.googleAppsScript.GoogleAppsScript.Base.Button.NO with Double = js.native
  
  /* 1 */ val OK: typings.googleAppsScript.GoogleAppsScript.Base.Button.OK with Double = js.native
  
  /* 3 */ val YES: typings.googleAppsScript.GoogleAppsScript.Base.Button.YES with Double = js.native
}
