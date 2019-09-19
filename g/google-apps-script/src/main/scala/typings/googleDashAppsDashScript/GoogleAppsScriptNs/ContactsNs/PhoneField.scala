package typings.googleDashAppsDashScript.GoogleAppsScriptNs.ContactsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PhoneField extends js.Object {
  def deletePhoneField(): Unit = js.native
  def getLabel(): Field | ExtendedField | String = js.native
  def getPhoneNumber(): String = js.native
  def isPrimary(): Boolean = js.native
  def setAsPrimary(): PhoneField = js.native
  def setLabel(field: Field): PhoneField = js.native
  def setLabel(label: String): PhoneField = js.native
  def setPhoneNumber(number: String): PhoneField = js.native
}

