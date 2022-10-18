package typings.firebaseDatabase.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathValue[T] extends StObject {
  
  var path: typings.firebaseDatabase.distPrivateMod.Path
  
  var value: T
}
object PathValue {
  
  inline def apply[T](path: typings.firebaseDatabase.distPrivateMod.Path, value: T): PathValue[T] = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathValue[T]]
  }
  
  extension [Self <: PathValue[?], T](x: Self & PathValue[T]) {
    
    inline def setPath(value: typings.firebaseDatabase.distPrivateMod.Path): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
