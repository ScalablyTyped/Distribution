package typings.flowdoc.Flow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Connection extends StObject {
  
  var nodeID: String
}
object Connection {
  
  @scala.inline
  def apply(nodeID: String): Connection = {
    val __obj = js.Dynamic.literal(nodeID = nodeID.asInstanceOf[js.Any])
    __obj.asInstanceOf[Connection]
  }
  
  @scala.inline
  implicit class ConnectionMutableBuilder[Self <: Connection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNodeID(value: String): Self = StObject.set(x, "nodeID", value.asInstanceOf[js.Any])
  }
}
