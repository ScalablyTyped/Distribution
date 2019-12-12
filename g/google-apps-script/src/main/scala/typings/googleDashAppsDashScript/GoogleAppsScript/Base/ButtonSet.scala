package typings.googleDashAppsDashScript.GoogleAppsScript.Base

import org.scalablytyped.runtime.TopLevel
import typings.googleDashAppsDashScript.GoogleAppsScript.Base.ButtonSet.OK
import typings.googleDashAppsDashScript.GoogleAppsScript.Base.ButtonSet.OK_CANCEL
import typings.googleDashAppsDashScript.GoogleAppsScript.Base.ButtonSet.YES_NO
import typings.googleDashAppsDashScript.GoogleAppsScript.Base.ButtonSet.YES_NO_CANCEL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ButtonSet extends js.Object

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
  @js.native
  sealed trait OK extends ButtonSet
  
  @js.native
  sealed trait OK_CANCEL extends ButtonSet
  
  @js.native
  sealed trait YES_NO extends ButtonSet
  
  @js.native
  sealed trait YES_NO_CANCEL extends ButtonSet
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ButtonSet with Double] = js.native
  /* 0 */ @js.native
  object OK extends TopLevel[OK with Double]
  
  /* 1 */ @js.native
  object OK_CANCEL extends TopLevel[OK_CANCEL with Double]
  
  /* 2 */ @js.native
  object YES_NO extends TopLevel[YES_NO with Double]
  
  /* 3 */ @js.native
  object YES_NO_CANCEL extends TopLevel[YES_NO_CANCEL with Double]
  
}

