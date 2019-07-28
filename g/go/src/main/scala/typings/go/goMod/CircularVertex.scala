package typings.go.goMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This holds CircularLayout-specific information about Nodes.*/
@JSImport("go", "CircularVertex")
@js.native
class CircularVertex () extends LayoutVertex {
  /**Gets or sets the value used as the vertex's angle.*/
  var actualAngle: Double = js.native
  /**Gets or sets the value used as the vertex's diameter.*/
  var diameter: Double = js.native
}

