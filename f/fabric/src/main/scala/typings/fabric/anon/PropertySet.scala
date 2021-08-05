package typings.fabric.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PropertySet extends StObject {
  
  var propertySet: js.UndefOr[String] = js.undefined
  
  var stateProperties: js.UndefOr[js.Array[js.Any]] = js.undefined
}
object PropertySet {
  
  inline def apply(): PropertySet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PropertySet]
  }
  
  extension [Self <: PropertySet](x: Self) {
    
    inline def setPropertySet(value: String): Self = StObject.set(x, "propertySet", value.asInstanceOf[js.Any])
    
    inline def setPropertySetUndefined: Self = StObject.set(x, "propertySet", js.undefined)
    
    inline def setStateProperties(value: js.Array[js.Any]): Self = StObject.set(x, "stateProperties", value.asInstanceOf[js.Any])
    
    inline def setStatePropertiesUndefined: Self = StObject.set(x, "stateProperties", js.undefined)
    
    inline def setStatePropertiesVarargs(value: js.Any*): Self = StObject.set(x, "stateProperties", js.Array(value :_*))
  }
}
