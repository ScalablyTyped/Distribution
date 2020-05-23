package typings.gaugejs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DivColor extends js.Object {
  var divColor: String
  var divLength: Double
  var divWidth: Double
  var divisions: Double
  var subColor: String
  var subDivisions: Double
  var subLength: Double
  var subWidth: Double
}

object DivColor {
  @scala.inline
  def apply(
    divColor: String,
    divLength: Double,
    divWidth: Double,
    divisions: Double,
    subColor: String,
    subDivisions: Double,
    subLength: Double,
    subWidth: Double
  ): DivColor = {
    val __obj = js.Dynamic.literal(divColor = divColor.asInstanceOf[js.Any], divLength = divLength.asInstanceOf[js.Any], divWidth = divWidth.asInstanceOf[js.Any], divisions = divisions.asInstanceOf[js.Any], subColor = subColor.asInstanceOf[js.Any], subDivisions = subDivisions.asInstanceOf[js.Any], subLength = subLength.asInstanceOf[js.Any], subWidth = subWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[DivColor]
  }
}

