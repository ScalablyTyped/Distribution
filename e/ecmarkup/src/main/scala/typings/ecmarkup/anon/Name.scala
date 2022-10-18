package typings.ecmarkup.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Name[key /* <: String */] extends StObject {
  
  var name: key
  
  var `type`: js.UndefOr[Any] = js.undefined
}
object Name {
  
  inline def apply[key /* <: String */](name: key): Name[key] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Name[key]]
  }
  
  extension [Self <: Name[?], key /* <: String */](x: Self & Name[key]) {
    
    inline def setName(value: key): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: Any): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
