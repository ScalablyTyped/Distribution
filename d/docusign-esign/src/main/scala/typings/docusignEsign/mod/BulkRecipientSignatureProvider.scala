package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BulkRecipientSignatureProvider extends StObject {
  
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the value of the tab.
    */
  var value: js.UndefOr[String] = js.undefined
}
object BulkRecipientSignatureProvider {
  
  inline def apply(): BulkRecipientSignatureProvider = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BulkRecipientSignatureProvider]
  }
  
  extension [Self <: BulkRecipientSignatureProvider](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
