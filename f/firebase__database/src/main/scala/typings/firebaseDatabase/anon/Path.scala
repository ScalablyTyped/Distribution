package typings.firebaseDatabase.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Path[T] extends StObject {
  
  var path: typings.firebaseDatabase.pathMod.Path = js.native
  
  var value: T = js.native
}
object Path {
  
  @scala.inline
  def apply[T](path: typings.firebaseDatabase.pathMod.Path, value: T): Path[T] = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Path[T]]
  }
  
  @scala.inline
  implicit class PathMutableBuilder[Self <: Path[_], T] (val x: Self with Path[T]) extends AnyVal {
    
    @scala.inline
    def setPath(value: typings.firebaseDatabase.pathMod.Path): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
