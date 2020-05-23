package typings.googleAppsScript.global.GoogleAppsScript.Base

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An enum representing predetermined, localized sets of one or more dialog buttons that can be
  * added to an alert or a prompt. To determine which button the user clicked,
  * use Button.
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
@JSGlobal("GoogleAppsScript.Base.ButtonSet")
@js.native
object ButtonSet extends js.Object {
  /* 0 */ val OK: typings.googleAppsScript.GoogleAppsScript.Base.ButtonSet.OK with Double = js.native
  /* 1 */ val OK_CANCEL: typings.googleAppsScript.GoogleAppsScript.Base.ButtonSet.OK_CANCEL with Double = js.native
  /* 2 */ val YES_NO: typings.googleAppsScript.GoogleAppsScript.Base.ButtonSet.YES_NO with Double = js.native
  /* 3 */ val YES_NO_CANCEL: typings.googleAppsScript.GoogleAppsScript.Base.ButtonSet.YES_NO_CANCEL with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.googleAppsScript.GoogleAppsScript.Base.ButtonSet with Double] = js.native
}

