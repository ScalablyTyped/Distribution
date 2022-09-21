package typings.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGuestAttributesEntry extends StObject {
  
  /**
    * Key for the guest attribute entry.
    */
  var key: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Namespace for the guest attribute entry.
    */
  var namespace: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Value for the guest attribute entry.
    */
  var value: js.UndefOr[String | Null] = js.undefined
}
object SchemaGuestAttributesEntry {
  
  inline def apply(): SchemaGuestAttributesEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGuestAttributesEntry]
  }
  
  extension [Self <: SchemaGuestAttributesEntry](x: Self) {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyNull: Self = StObject.set(x, "key", null)
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    
    inline def setNamespaceNull: Self = StObject.set(x, "namespace", null)
    
    inline def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
