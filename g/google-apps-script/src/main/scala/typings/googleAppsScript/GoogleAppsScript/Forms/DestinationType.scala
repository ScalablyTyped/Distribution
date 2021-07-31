package typings.googleAppsScript.GoogleAppsScript.Forms

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DestinationType extends StObject
/**
  * An enum representing the supported types of form-response destinations. All forms, including
  * those that do not have a destination set explicitly, save a copy of responses in the form's
  * response store. Destination types can be accessed from FormApp.DestinationType.
  *
  *     // Open a form by ID and create a new spreadsheet.
  *     var form = FormApp.openById('1234567890abcdefghijklmnopqrstuvwxyz');
  *     var ss = SpreadsheetApp.create('Spreadsheet Name');
  *
  *     // Update the form's response destination.
  *     form.setDestination(FormApp.DestinationType.SPREADSHEET, ss.getId());
  */
@JSGlobal("GoogleAppsScript.Forms.DestinationType")
@js.native
object DestinationType extends StObject {
  
  @js.native
  sealed trait SPREADSHEET
    extends StObject
       with DestinationType
}
