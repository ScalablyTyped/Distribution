package typings.googleAppsScript.GoogleAppsScript.Spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ProtectionType extends js.Object
/**
  * An enumeration representing the parts of a spreadsheet that can be protected from edits.
  *
  *     // Remove all range protections in the spreadsheet that the user has permission to edit.
  *     var ss = SpreadsheetApp.getActive();
  *     var protections = ss.getProtections(SpreadsheetApp.ProtectionType.RANGE);
  *     for (var i = 0; i < protections.length; i++) {
  *       var protection = protections[i];
  *       if (protection.canEdit()) {
  *         protection.remove();
  *       }
  *     }
  *
  *     // Removes sheet protection from the active sheet, if the user has permission to edit it.
  *     var sheet = SpreadsheetApp.getActiveSheet();
  *     var protection = sheet.getProtections(SpreadsheetApp.ProtectionType.SHEET)[0];
  *     if (protection && protection.canEdit()) {
  *       protection.remove();
  *     }
  */
@JSGlobal("GoogleAppsScript.Spreadsheet.ProtectionType")
@js.native
object ProtectionType extends js.Object {
  
  @js.native
  sealed trait RANGE extends ProtectionType
  
  @js.native
  sealed trait SHEET extends ProtectionType
}
