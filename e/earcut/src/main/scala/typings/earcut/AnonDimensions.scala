package typings.earcut

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDimensions extends js.Object {
  var dimensions: Double
  var holes: js.Array[Double]
  var vertices: js.Array[Double]
}

object AnonDimensions {
  @scala.inline
  def apply(dimensions: Double, holes: js.Array[Double], vertices: js.Array[Double]): AnonDimensions = {
    val __obj = js.Dynamic.literal(dimensions = dimensions.asInstanceOf[js.Any], holes = holes.asInstanceOf[js.Any], vertices = vertices.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDimensions]
  }
}

