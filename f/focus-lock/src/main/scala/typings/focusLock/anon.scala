package typings.focusLock

import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Node extends StObject {
    
    var node: HTMLInputElement
  }
  object Node {
    
    inline def apply(node: HTMLInputElement): Node = {
      val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any])
      __obj.asInstanceOf[Node]
    }
    
    extension [Self <: Node](x: Self) {
      
      inline def setNode(value: HTMLInputElement): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    }
  }
}
