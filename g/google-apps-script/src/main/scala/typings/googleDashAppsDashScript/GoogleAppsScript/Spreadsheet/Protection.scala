package typings.googleDashAppsDashScript.GoogleAppsScript.Spreadsheet

import typings.googleDashAppsDashScript.GoogleAppsScript.Base.User
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def removeEditors(emailAddresses: js.Array[String | User]): Protection = js.native
  def setDescription(description: String): Protection = js.native
  def setDomainEdit(editable: Boolean): Protection = js.native
  def setNamedRange(namedRange: NamedRange): Protection = js.native
  def setRange(range: Range): Protection = js.native
  def setRangeName(rangeName: String): Protection = js.native
  def setUnprotectedRanges(ranges: js.Array[Range]): Protection = js.native
  def setWarningOnly(warningOnly: Boolean): Protection = js.native
}

