package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Protection extends js.Object {
  def addEditor(emailAddress: java.lang.String): Protection = js.native
  def addEditor(user: googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.User): Protection = js.native
  def addEditors(emailAddresses: js.Array[java.lang.String]): Protection = js.native
  def canDomainEdit(): scala.Boolean = js.native
  def canEdit(): scala.Boolean = js.native
  def getDescription(): java.lang.String = js.native
  def getEditors(): js.Array[googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.User] = js.native
  def getProtectionType(): ProtectionType = js.native
  def getRange(): Range = js.native
  def getRangeName(): java.lang.String = js.native
  def getUnprotectedRanges(): js.Array[Range] = js.native
  def isWarningOnly(): scala.Boolean = js.native
  def remove(): scala.Unit = js.native
  def removeEditor(emailAddress: java.lang.String): Protection = js.native
  def removeEditor(user: googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.User): Protection = js.native
  def removeEditors(emailAddresses: js.Array[java.lang.String]): Protection = js.native
  def setDescription(description: java.lang.String): Protection = js.native
  def setDomainEdit(editable: scala.Boolean): Protection = js.native
  def setNamedRange(namedRange: NamedRange): Protection = js.native
  def setRange(range: Range): Protection = js.native
  def setRangeName(rangeName: java.lang.String): Protection = js.native
  def setUnprotectedRanges(ranges: js.Array[Range]): Protection = js.native
  def setWarningOnly(warningOnly: scala.Boolean): Protection = js.native
}

