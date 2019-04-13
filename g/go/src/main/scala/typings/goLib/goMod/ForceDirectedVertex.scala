package typings
package goLib.goMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This holds ForceDirectedLayout-specific information about Nodes.*/
@JSImport("go", "ForceDirectedVertex")
@js.native
class ForceDirectedVertex () extends LayoutVertex {
  /**Gets or sets the electrical charge for this vertex.*/
  var charge: scala.Double = js.native
  /**Gets or sets the cumulative force on the vertex in the X direction.*/
  var forceX: scala.Double = js.native
  /**Gets or sets the cumulative force on the vertex in the Y direction.*/
  var forceY: scala.Double = js.native
  /**Gets or sets whether the vertex may be moved by any forces.*/
  var isFixed: scala.Boolean = js.native
  /**Gets or sets the gravitational mass for this vertex.*/
  var mass: scala.Double = js.native
}

