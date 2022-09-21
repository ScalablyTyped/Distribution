package typings.firebaseDatabase.privateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NamedNode extends StObject {
  
  var name: String
  
  var node: Node2
}
object NamedNode {
  
  inline def apply(name: String, node: Node2): NamedNode = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    __obj.asInstanceOf[NamedNode]
  }
  
  extension [Self <: NamedNode](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNode(value: Node2): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
  }
}
