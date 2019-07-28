package typings.earcut

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Dimensions extends js.Object {
  var dimensions: Double
  var holes: js.Array[Double]
  var vertices: js.Array[Double]
}

object Anon_Dimensions {
  @scala.inline
  def apply(dimensions: Double, holes: js.Array[Double], vertices: js.Array[Double]): Anon_Dimensions = {
    val __obj = js.Dynamic.literal(dimensions = dimensions, holes = holes, vertices = vertices)
  
    __obj.asInstanceOf[Anon_Dimensions]
  }
}

