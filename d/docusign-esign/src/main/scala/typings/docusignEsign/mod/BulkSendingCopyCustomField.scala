package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BulkSendingCopyCustomField extends StObject {
  
  /**
    * The name of the custom field.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The value of the custom field.
    */
  var value: js.UndefOr[String] = js.undefined
}
object BulkSendingCopyCustomField {
  
  @scala.inline
  def apply(): BulkSendingCopyCustomField = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BulkSendingCopyCustomField]
  }
  
  @scala.inline
  implicit class BulkSendingCopyCustomFieldMutableBuilder[Self <: BulkSendingCopyCustomField] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
