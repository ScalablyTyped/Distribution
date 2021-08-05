package typings.emscripten

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FS {
  
  trait ErrnoError extends StObject
  
  trait FSNode extends StObject
  
  trait FSStream extends StObject
  
  trait Lookup extends StObject {
    
    var node: FSNode
    
    var path: String
  }
  object Lookup {
    
    inline def apply(node: FSNode, path: String): Lookup = {
      val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[Lookup]
    }
    
    extension [Self <: Lookup](x: Self) {
      
      inline def setNode(value: FSNode): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
}
