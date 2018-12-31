package typings
package goLib.goMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Force-directed layout treats the graph as if it were a system of physical
  * bodies with forces acting on them and between them.
  * The algorithm seeks a configuration of the bodies with locally minimal energy,
  * i.e. vertex positions such that the sum of the forces on each vertex is zero.
  */
@JSImport("go", "ForceDirectedLayout")
@js.native
/**
  * Constructs a ForceDirectedLayout with no Layout.network and with no owning Layout.diagram.
  */
class ForceDirectedLayout ()
  extends goLib.goMod.goNs.ForceDirectedLayout

