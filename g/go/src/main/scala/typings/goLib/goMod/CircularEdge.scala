package typings
package goLib.goMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This holds CircularLayout-specific information about Links.*/
@JSImport("go", "CircularEdge")
@js.native
class CircularEdge ()
  extends goLib.goMod.goNs.CircularEdge {
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

