package typings.go.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This holds LayeredDigraphLayout-specific information about Nodes.*/
@JSImport("go", "LayeredDigraphVertex")
@js.native
class LayeredDigraphVertex () extends LayoutVertex {
  /**The column to which the node is assigned.*/
  var column: Double = js.native
  /**The connected component to which the node is assigned.*/
  var component: Double = js.native
  /**The index to which the node is assigned.*/
  var index: Double = js.native
  /**The layer to which the node is assigned.*/
  var layer: Double = js.native
  /**Another LayeredDigraphVertex in the same layer that this node should be near.*/
  var near: LayeredDigraphVertex = js.native
}

