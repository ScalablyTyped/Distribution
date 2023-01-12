package typings.fastify.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Path extends StObject {
  
  var path: String
  
  var prefix: String
  
  var routePath: String
}
object Path {
  
  inline def apply(path: String, prefix: String, routePath: String): Path = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], routePath = routePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[Path]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Path] (val x: Self) extends AnyVal {
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    inline def setRoutePath(value: String): Self = StObject.set(x, "routePath", value.asInstanceOf[js.Any])
  }
}
