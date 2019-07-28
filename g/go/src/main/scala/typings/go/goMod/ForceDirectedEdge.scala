package typings.go.goMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This holds ForceDirectedLayout-specific information about Links.*/
@JSImport("go", "ForceDirectedEdge")
@js.native
class ForceDirectedEdge () extends LayoutEdge {
  /**Gets or sets the length of this edge.*/
  var length: Double = js.native
  /**Gets or sets this edge's stiffness or resistence to compression or stretching.*/
  var stiffness: Double = js.native
}

