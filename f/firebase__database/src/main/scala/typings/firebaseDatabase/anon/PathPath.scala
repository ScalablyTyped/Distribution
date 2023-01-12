package typings.firebaseDatabase.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathPath[T] extends StObject {
  
  var path: typings.firebaseDatabase.distSrcCoreUtilPathMod.Path
  
  var value: T
}
object PathPath {
  
  inline def apply[T](path: typings.firebaseDatabase.distSrcCoreUtilPathMod.Path, value: T): PathPath[T] = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathPath[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathPath[?], T] (val x: Self & PathPath[T]) extends AnyVal {
    
    inline def setPath(value: typings.firebaseDatabase.distSrcCoreUtilPathMod.Path): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
