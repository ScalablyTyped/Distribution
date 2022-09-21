package typings.firebaseDatabase.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Value[T] extends StObject {
  
  var path: typings.firebaseDatabase.pathMod.Path
  
  var value: T
}
object Value {
  
  inline def apply[T](path: typings.firebaseDatabase.pathMod.Path, value: T): Value[T] = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Value[T]]
  }
  
  extension [Self <: Value[?], T](x: Self & Value[T]) {
    
    inline def setPath(value: typings.firebaseDatabase.pathMod.Path): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
