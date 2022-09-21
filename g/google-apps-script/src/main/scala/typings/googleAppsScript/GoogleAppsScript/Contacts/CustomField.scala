package typings.googleAppsScript.GoogleAppsScript.Contacts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A custom field in a Contact.
  */
@js.native
trait CustomField extends StObject {
  
  def deleteCustomField(): Unit = js.native
  
  def getLabel(): Field | ExtendedField | String = js.native
  
  def getValue(): Any = js.native
  
  def setLabel(field: ExtendedField): CustomField = js.native
  def setLabel(label: String): CustomField = js.native
  
  def setValue(value: Any): CustomField = js.native
}
