package typings.firebaseDatabase.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Path[T] extends StObject {
  
  var path: typings.firebaseDatabase.internalMod.Path
  
  var value: T
}
object Path {
  
  inline def apply[T](path: typings.firebaseDatabase.internalMod.Path, value: T): Path[T] = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Path[T]]
  }
  
  extension [Self <: Path[?], T](x: Self & Path[T]) {
    
    inline def setPath(value: typings.firebaseDatabase.internalMod.Path): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
