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
  
  inline def apply(): BulkSendingCopyCustomField = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BulkSendingCopyCustomField]
  }
  
  extension [Self <: BulkSendingCopyCustomField](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
