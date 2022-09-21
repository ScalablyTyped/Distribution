package typings.globaloffensive.mod

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InventoryItemAttribute extends StObject {
  
  var def_index: Double
  
  var value: Any | Null
  
  var value_bytes: Buffer
}
object InventoryItemAttribute {
  
  inline def apply(def_index: Double, value_bytes: Buffer): InventoryItemAttribute = {
    val __obj = js.Dynamic.literal(def_index = def_index.asInstanceOf[js.Any], value_bytes = value_bytes.asInstanceOf[js.Any], value = null)
    __obj.asInstanceOf[InventoryItemAttribute]
  }
  
  extension [Self <: InventoryItemAttribute](x: Self) {
    
    inline def setDef_index(value: Double): Self = StObject.set(x, "def_index", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
    
    inline def setValue_bytes(value: Buffer): Self = StObject.set(x, "value_bytes", value.asInstanceOf[js.Any])
  }
}
