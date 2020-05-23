package typings.earcut.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dimensions extends js.Object {
  var dimensions: Double
  var holes: js.Array[Double]
  var vertices: js.Array[Double]
}

object Dimensions {
  @scala.inline
  def apply(dimensions: Double, holes: js.Array[Double], vertices: js.Array[Double]): Dimensions = {
    val __obj = js.Dynamic.literal(dimensions = dimensions.asInstanceOf[js.Any], holes = holes.asInstanceOf[js.Any], vertices = vertices.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dimensions]
  }
}

