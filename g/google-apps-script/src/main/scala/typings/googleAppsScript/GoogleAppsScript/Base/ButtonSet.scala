package typings.googleAppsScript.GoogleAppsScript.Base

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ButtonSet extends StObject
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
object ButtonSet extends StObject {
  
  @js.native
  sealed trait OK
    extends StObject
       with ButtonSet
  
  @js.native
  sealed trait OK_CANCEL
    extends StObject
       with ButtonSet
  
  @js.native
  sealed trait YES_NO
    extends StObject
       with ButtonSet
  
  @js.native
  sealed trait YES_NO_CANCEL
    extends StObject
       with ButtonSet
}
