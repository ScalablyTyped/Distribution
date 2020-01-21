package typings.googleAppsScript.GoogleAppsScript.Contacts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A custom field in a Contact.
  */
@js.native
trait CustomField extends js.Object {
  def deleteCustomField(): Unit = js.native
  def getLabel(): Field | ExtendedField | String = js.native
  def getValue(): js.Any = js.native
  def setLabel(field: ExtendedField): CustomField = js.native
  def setLabel(label: String): CustomField = js.native
  def setValue(value: js.Any): CustomField = js.native
}

