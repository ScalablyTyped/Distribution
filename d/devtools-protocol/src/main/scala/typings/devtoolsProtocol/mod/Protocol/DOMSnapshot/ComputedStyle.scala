package typings.devtoolsProtocol.mod.Protocol.DOMSnapshot

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComputedStyle extends StObject {
  
  /**
    * Name/value pairs of computed style properties.
    */
  var properties: js.Array[NameValue]
}
object ComputedStyle {
  
  inline def apply(properties: js.Array[NameValue]): ComputedStyle = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComputedStyle]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ComputedStyle] (val x: Self) extends AnyVal {
    
    inline def setProperties(value: js.Array[NameValue]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesVarargs(value: NameValue*): Self = StObject.set(x, "properties", js.Array(value*))
  }
}
