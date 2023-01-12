package typings.flowdoc.Flow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Connection extends StObject {
  
  var nodeID: String
}
object Connection {
  
  inline def apply(nodeID: String): Connection = {
    val __obj = js.Dynamic.literal(nodeID = nodeID.asInstanceOf[js.Any])
    __obj.asInstanceOf[Connection]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Connection] (val x: Self) extends AnyVal {
    
    inline def setNodeID(value: String): Self = StObject.set(x, "nodeID", value.asInstanceOf[js.Any])
  }
}
