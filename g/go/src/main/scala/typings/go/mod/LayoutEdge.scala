package typings.go.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An edge represents a link in a LayoutNetwork. It holds layout-specific data for the link. */
@JSImport("go", "LayoutEdge")
@js.native
/**
  * This constructs an edge that does not know about any Link.
  */
class LayoutEdge () extends js.Object {
  /**Gets or sets the model data, used only when virtualizing*/
  var data: js.Any = js.native
  /**Gets or sets the LayoutVertex that this edge comes from.*/
  var fromVertex: LayoutVertex = js.native
  /**Gets or sets the Link associated with this edge, if any.*/
  var link: Link = js.native
  /**Gets or sets the LayoutNetwork that owns this edge.*/
  var network: LayoutNetwork = js.native
  /**Gets or sets the LayoutVertex that this edge goes to.*/
  var toVertex: LayoutVertex = js.native
  /**
    * Commits the route of this edge to the corresponding Link, if any.
    */
  def commit(): Unit = js.native
  /**
    * Returns the edge's vertex at the other of this edge from the given vertex.
    * @param {LayoutVertex} v
    */
  def getOtherVertex(v: LayoutVertex): Unit = js.native
}

