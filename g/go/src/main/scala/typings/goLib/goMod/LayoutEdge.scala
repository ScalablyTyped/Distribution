package typings
package goLib.goMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An edge represents a link in a LayoutNetwork. It holds layout-specific data for the link. */
@JSImport("go", "LayoutEdge")
@js.native
/**
  * This constructs an edge that does not know about any Link.
  */
class LayoutEdge ()
  extends goLib.goMod.goNs.LayoutEdge {
  /**Gets or sets the model data, used only when virtualizing*/
  /* CompleteClass */
  override var data: js.Any = js.native
  /**Gets or sets the LayoutVertex that this edge comes from.*/
  /* CompleteClass */
  override var fromVertex: goLib.goMod.goNs.LayoutVertex = js.native
  /**Gets or sets the Link associated with this edge, if any.*/
  /* CompleteClass */
  override var link: goLib.goMod.goNs.Link = js.native
  /**Gets or sets the LayoutNetwork that owns this edge.*/
  /* CompleteClass */
  override var network: goLib.goMod.goNs.LayoutNetwork = js.native
  /**Gets or sets the LayoutVertex that this edge goes to.*/
  /* CompleteClass */
  override var toVertex: goLib.goMod.goNs.LayoutVertex = js.native
  /**
    * Commits the route of this edge to the corresponding Link, if any.
    */
  /* CompleteClass */
  override def commit(): scala.Unit = js.native
  /**
    * Returns the edge's vertex at the other of this edge from the given vertex.
    * @param {LayoutVertex} v
    */
  /* CompleteClass */
  override def getOtherVertex(v: goLib.goMod.goNs.LayoutVertex): scala.Unit = js.native
}

