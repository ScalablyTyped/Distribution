package typings.devtoolsProtocol.mod.Protocol.Accessibility

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AXProperty extends StObject {
  
  /**
    * The name of this property.
    */
  var name: AXPropertyName
  
  /**
    * The value of this property.
    */
  var value: AXValue
}
object AXProperty {
  
  inline def apply(name: AXPropertyName, value: AXValue): AXProperty = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AXProperty]
  }
  
  extension [Self <: AXProperty](x: Self) {
    
    inline def setName(value: AXPropertyName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setValue(value: AXValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
