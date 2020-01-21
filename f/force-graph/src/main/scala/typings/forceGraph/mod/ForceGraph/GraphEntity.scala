package typings.forceGraph.mod.ForceGraph

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphEntity extends js.Object {
  var id: String
}

object GraphEntity {
  @scala.inline
  def apply(id: String): GraphEntity = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GraphEntity]
  }
}

