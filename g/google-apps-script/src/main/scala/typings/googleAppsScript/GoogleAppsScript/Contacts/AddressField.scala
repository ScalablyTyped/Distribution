package typings.googleAppsScript.GoogleAppsScript.Contacts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Address field in a contact.
  */
@js.native
trait AddressField extends js.Object {
  
  def deleteAddressField(): Unit = js.native
  
  def getAddress(): String = js.native
  
  def getLabel(): Field | ExtendedField | String = js.native
  
  def isPrimary(): Boolean = js.native
  
  def setAddress(address: String): AddressField = js.native
  
  def setAsPrimary(): AddressField = js.native
  
  def setLabel(field: Field): AddressField = js.native
  def setLabel(label: String): AddressField = js.native
}
