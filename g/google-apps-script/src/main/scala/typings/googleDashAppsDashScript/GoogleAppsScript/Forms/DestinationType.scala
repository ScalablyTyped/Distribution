package typings.googleDashAppsDashScript.GoogleAppsScript.Forms

import org.scalablytyped.runtime.TopLevel
import typings.googleDashAppsDashScript.GoogleAppsScript.Forms.DestinationType.SPREADSHEET
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DestinationType extends js.Object

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
object DestinationType extends js.Object {
  @js.native
  sealed trait SPREADSHEET extends DestinationType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DestinationType with Double] = js.native
  /* 0 */ @js.native
  object SPREADSHEET extends TopLevel[SPREADSHEET with Double]
  
}

