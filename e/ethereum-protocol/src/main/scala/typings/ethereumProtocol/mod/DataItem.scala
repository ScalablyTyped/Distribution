package typings.ethereumProtocol.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataItem extends StObject {
  
  var components: js.UndefOr[js.Array[DataItem]] = js.undefined
  
  var name: String
  
  var `type`: String
}
object DataItem {
  
  inline def apply(name: String, `type`: String): DataItem = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataItem] (val x: Self) extends AnyVal {
    
    inline def setComponents(value: js.Array[DataItem]): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
    
    inline def setComponentsUndefined: Self = StObject.set(x, "components", js.undefined)
    
    inline def setComponentsVarargs(value: DataItem*): Self = StObject.set(x, "components", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
