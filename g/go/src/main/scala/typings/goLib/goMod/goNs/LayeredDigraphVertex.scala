package typings
package goLib.goMod.goNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This holds LayeredDigraphLayout-specific information about Nodes.*/
trait LayeredDigraphVertex extends LayoutVertex {
  /**The column to which the node is assigned.*/
  var column: scala.Double
  /**The connected component to which the node is assigned.*/
  var component: scala.Double
  /**The index to which the node is assigned.*/
  var index: scala.Double
  /**The layer to which the node is assigned.*/
  var layer: scala.Double
  /**Another LayeredDigraphVertex in the same layer that this node should be near.*/
  var near: LayeredDigraphVertex
}

