package typings.flowdoc.Flow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Connection extends js.Object {
  var nodeID: String
}

object Connection {
  @scala.inline
  def apply(nodeID: String): Connection = {
    val __obj = js.Dynamic.literal(nodeID = nodeID.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Connection]
  }
}

