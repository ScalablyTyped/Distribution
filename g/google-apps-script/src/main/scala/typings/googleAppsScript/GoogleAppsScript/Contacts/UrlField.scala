package typings.googleAppsScript.GoogleAppsScript.Contacts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A URL field in a Contact.
  */
@js.native
trait UrlField extends StObject {
  
  def deleteUrlField(): Unit = js.native
  
  def getAddress(): String = js.native
  
  def getLabel(): Field | ExtendedField | String = js.native
  
  def isPrimary(): Boolean = js.native
  
  def setAddress(address: String): UrlField = js.native
  
  def setAsPrimary(): UrlField = js.native
  
  def setLabel(field: Field): UrlField = js.native
  def setLabel(label: String): UrlField = js.native
}
