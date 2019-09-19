package typings.googleDashAppsDashScript.GoogleAppsScriptNs.ContactsNs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.BaseNs.Month
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DateField extends js.Object {
  def deleteDateField(): Unit = js.native
  def getDay(): Integer = js.native
  def getLabel(): Field | ExtendedField | String = js.native
  def getMonth(): Month = js.native
  def getYear(): Integer = js.native
  def setDate(month: Month, day: Integer): DateField = js.native
  def setDate(month: Month, day: Integer, year: Integer): DateField = js.native
  def setLabel(label: String): DateField = js.native
  def setLabel(label: Field): DateField = js.native
}

