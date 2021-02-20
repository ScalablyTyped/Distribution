package typings.googleAppsScript.GoogleAppsScript.Contacts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An instant messaging field in a Contact.
  */
@js.native
trait IMField extends StObject {
  
  def deleteIMField(): Unit = js.native
  
  def getAddress(): String = js.native
  
  def getLabel(): Field | ExtendedField | String = js.native
  
  def isPrimary(): Boolean = js.native
  
  def setAddress(address: String): IMField = js.native
  
  def setAsPrimary(): IMField = js.native
  
  def setLabel(field: Field): IMField = js.native
  def setLabel(label: String): IMField = js.native
}
