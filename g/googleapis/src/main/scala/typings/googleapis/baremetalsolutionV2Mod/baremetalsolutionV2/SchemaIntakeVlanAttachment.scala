package typings.googleapis.baremetalsolutionV2Mod.baremetalsolutionV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaIntakeVlanAttachment extends StObject {
  
  /**
    * Identifier of the VLAN attachment.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Attachment pairing key.
    */
  var pairingKey: js.UndefOr[String | Null] = js.undefined
}
object SchemaIntakeVlanAttachment {
  
  inline def apply(): SchemaIntakeVlanAttachment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaIntakeVlanAttachment]
  }
  
  extension [Self <: SchemaIntakeVlanAttachment](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setPairingKey(value: String): Self = StObject.set(x, "pairingKey", value.asInstanceOf[js.Any])
    
    inline def setPairingKeyNull: Self = StObject.set(x, "pairingKey", null)
    
    inline def setPairingKeyUndefined: Self = StObject.set(x, "pairingKey", js.undefined)
  }
}
