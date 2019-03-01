package typings
package earcutLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Dimensions extends js.Object {
  var dimensions: scala.Double
  var holes: js.Array[scala.Double]
  var vertices: js.Array[scala.Double]
}

object Anon_Dimensions {
  @scala.inline
  def apply(dimensions: scala.Double, holes: js.Array[scala.Double], vertices: js.Array[scala.Double]): Anon_Dimensions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("dimensions")(dimensions)
    __obj.updateDynamic("holes")(holes)
    __obj.updateDynamic("vertices")(vertices)
    __obj.asInstanceOf[Anon_Dimensions]
  }
}

