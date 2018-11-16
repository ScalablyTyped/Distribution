package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContactsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DateField extends js.Object {
  def deleteDateField(): scala.Unit = js.native
  def getDay(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer = js.native
  def getLabel(): js.Object = js.native
  def getMonth(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.Month = js.native
  def getYear(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer = js.native
  def setDate(
    month: googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.Month,
    day: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  ): DateField = js.native
  def setDate(
    month: googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.Month,
    day: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    year: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  ): DateField = js.native
  def setLabel(label: Field): DateField = js.native
  def setLabel(label: java.lang.String): DateField = js.native
}

