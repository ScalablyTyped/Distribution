package typings.firebaseDatabase.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Path[T] extends StObject {
  
  var path: typings.firebaseDatabase.distInternalMod.Path
  
  var value: T
}
object Path {
  
  inline def apply[T](path: typings.firebaseDatabase.distInternalMod.Path, value: T): Path[T] = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Path[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Path[?], T] (val x: Self & Path[T]) extends AnyVal {
    
    inline def setPath(value: typings.firebaseDatabase.distInternalMod.Path): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
