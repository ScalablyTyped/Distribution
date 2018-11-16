package typings
package goLib.goMod.goNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This holds ForceDirectedLayout-specific information about Nodes.*/

trait ForceDirectedVertex extends LayoutVertex {
  /**Gets or sets the electrical charge for this vertex.*/
  var charge: scala.Double
  /**Gets or sets the cumulative force on the vertex in the X direction.*/
  var forceX: scala.Double
  /**Gets or sets the cumulative force on the vertex in the Y direction.*/
  var forceY: scala.Double
  /**Gets or sets whether the vertex may be moved by any forces.*/
  var isFixed: scala.Boolean
  /**Gets or sets the gravitational mass for this vertex.*/
  var mass: scala.Double
}

