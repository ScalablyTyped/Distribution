package typings
package goLib.goMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This holds LayeredDigraphLayout-specific information about Link s.*/
@JSImport("go", "LayeredDigraphEdge")
@js.native
class LayeredDigraphEdge ()
  extends goLib.goMod.goNs.LayeredDigraphEdge {
  /**Gets or sets the model data, used only when virtualizing*/
  /* CompleteClass */
  override var data: js.Any = js.native
  /**True if the link is part of the depth first forest.*/
  /* CompleteClass */
  override var forest: scala.Boolean = js.native
  /**Gets or sets the LayoutVertex that this edge comes from.*/
  /* CompleteClass */
  override var fromVertex: goLib.goMod.goNs.LayoutVertex = js.native
  /**Gets or sets the Link associated with this edge, if any.*/
  /* CompleteClass */
  override var link: goLib.goMod.goNs.Link = js.native
  /**Gets or sets the LayoutNetwork that owns this edge.*/
  /* CompleteClass */
  override var network: goLib.goMod.goNs.LayoutNetwork = js.native
  /**Approximate column offset of the from port of the link from the from node column used in straightening.*/
  /* CompleteClass */
  override var portFromColOffset: scala.Double = js.native
  /**Location of the port at the from node of the link.*/
  /* CompleteClass */
  override var portFromPos: scala.Double = js.native
  /**Approximate column offset of the to port of the link from the to node column used in straightening.*/
  /* CompleteClass */
  override var portToColOffset: scala.Double = js.native
  /**Location of the port at the to node of the link.*/
  /* CompleteClass */
  override var portToPos: scala.Double = js.native
  /**True if the link was reversed during cycle removal.*/
  /* CompleteClass */
  override var rev: scala.Boolean = js.native
  /**Gets or sets the LayoutVertex that this edge goes to.*/
  /* CompleteClass */
  override var toVertex: goLib.goMod.goNs.LayoutVertex = js.native
  /**True if the link is part of the proper digraph.*/
  /* CompleteClass */
  override var valid: scala.Boolean = js.native
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

