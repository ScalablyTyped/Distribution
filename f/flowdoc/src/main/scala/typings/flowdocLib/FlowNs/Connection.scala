package typings
package flowdocLib.FlowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Connection extends js.Object {
  var nodeID: java.lang.String
}

object Connection {
  @scala.inline
  def apply(nodeID: java.lang.String): Connection = {
    val __obj = js.Dynamic.literal(nodeID = nodeID)
  
    __obj.asInstanceOf[Connection]
  }
}

