package typings.forceDashGraph.forceDashGraphMod.ForceGraphNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interfaces
  */
trait GraphData extends js.Object {
  var links: js.Array[GraphLink]
  var nodes: js.Array[GraphNode]
}

object GraphData {
  @scala.inline
  def apply(links: js.Array[GraphLink], nodes: js.Array[GraphNode]): GraphData = {
    val __obj = js.Dynamic.literal(links = links, nodes = nodes)
  
    __obj.asInstanceOf[GraphData]
  }
}

