package typings.gestalt.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Path extends StObject {
  
  var __path: String
}
object Path {
  
  @scala.inline
  def apply(__path: String): Path = {
    val __obj = js.Dynamic.literal(__path = __path.asInstanceOf[js.Any])
    __obj.asInstanceOf[Path]
  }
  
  @scala.inline
  implicit class PathMutableBuilder[Self <: Path] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set__path(value: String): Self = StObject.set(x, "__path", value.asInstanceOf[js.Any])
  }
}
