package typings.googleDashAppsDashScript.GoogleAppsScript.Spreadsheet

import typings.googleDashAppsDashScript.GoogleAppsScript.Base.User
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Access and modify protected ranges and sheets. A protected range can protect either a static
  * range of cells or a named range. A protected sheet may include unprotected regions. For
  * spreadsheets created with the older version of Google Sheets, use the PageProtection
  * class instead.
  *
  *     // Protect range A1:B10, then remove all other users from the list of editors.
  *     var ss = SpreadsheetApp.getActive();
  *     var range = ss.getRange('A1:B10');
  *     var protection = range.protect().setDescription('Sample protected range');
  *
  *     // Ensure the current user is an editor before removing others. Otherwise, if the user's edit
  *     // permission comes from a group, the script throws an exception upon removing the group.
  *     var me = Session.getEffectiveUser();
  *     protection.addEditor(me);
  *     protection.removeEditors(protection.getEditors());
  *     if (protection.canDomainEdit()) {
  *       protection.setDomainEdit(false);
  *     }
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
  *     // Protect the active sheet, then remove all other users from the list of editors.
  *     var sheet = SpreadsheetApp.getActiveSheet();
  *     var protection = sheet.protect().setDescription('Sample protected sheet');
  *
  *     // Ensure the current user is an editor before removing others. Otherwise, if the user's edit
  *     // permission comes from a group, the script throws an exception upon removing the group.
  *     var me = Session.getEffectiveUser();
  *     protection.addEditor(me);
  *     protection.removeEditors(protection.getEditors());
  *     if (protection.canDomainEdit()) {
  *       protection.setDomainEdit(false);
  *     }
  */
@js.native
trait Protection extends js.Object {
  def addEditor(emailAddress: String): Protection = js.native
  def addEditor(user: User): Protection = js.native
  def addEditors(emailAddresses: js.Array[String]): Protection = js.native
  def canDomainEdit(): Boolean = js.native
  def canEdit(): Boolean = js.native
  def getDescription(): String = js.native
  def getEditors(): js.Array[User] = js.native
  def getProtectionType(): ProtectionType = js.native
  def getRange(): Range = js.native
  def getRangeName(): String | Null = js.native
  def getUnprotectedRanges(): js.Array[Range] = js.native
  def isWarningOnly(): Boolean = js.native
  def remove(): Unit = js.native
  def removeEditor(emailAddress: String): Protection = js.native
  def removeEditor(user: User): Protection = js.native
  def removeEditors(emailAddresses: js.Array[String]): Protection = js.native
  def setDescription(description: String): Protection = js.native
  def setDomainEdit(editable: Boolean): Protection = js.native
  def setNamedRange(namedRange: NamedRange): Protection = js.native
  def setRange(range: Range): Protection = js.native
  def setRangeName(rangeName: String): Protection = js.native
  def setUnprotectedRanges(ranges: js.Array[Range]): Protection = js.native
  def setWarningOnly(warningOnly: Boolean): Protection = js.native
}

