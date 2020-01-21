package typings.googleAppsScript.GoogleAppsScript.Contacts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A URL field in a Contact.
  */
@js.native
trait UrlField extends js.Object {
  def deleteUrlField(): Unit = js.native
  def getAddress(): String = js.native
  def getLabel(): Field | ExtendedField | String = js.native
  def isPrimary(): Boolean = js.native
  def setAddress(address: String): UrlField = js.native
  def setAsPrimary(): UrlField = js.native
  def setLabel(field: Field): UrlField = js.native
  def setLabel(label: String): UrlField = js.native
}

