package typings.forgeViewer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Properties extends StObject {
  
  var properties: js.Array[Any]
}
object Properties {
  
  inline def apply(properties: js.Array[Any]): Properties = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[Properties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Properties] (val x: Self) extends AnyVal {
    
    inline def setProperties(value: js.Array[Any]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesVarargs(value: Any*): Self = StObject.set(x, "properties", js.Array(value*))
  }
}
