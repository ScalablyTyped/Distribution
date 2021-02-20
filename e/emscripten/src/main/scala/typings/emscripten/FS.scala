package typings.emscripten

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FS {
  
  @js.native
  trait ErrnoError extends StObject
  
  @js.native
  trait FSNode extends StObject
  
  @js.native
  trait FSStream extends StObject
  
  @js.native
  trait Lookup extends StObject {
    
    var node: FSNode = js.native
    
    var path: String = js.native
  }
  object Lookup {
    
    @scala.inline
    def apply(node: FSNode, path: String): Lookup = {
      val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[Lookup]
    }
    
    @scala.inline
    implicit class LookupMutableBuilder[Self <: Lookup] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNode(value: FSNode): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
}
