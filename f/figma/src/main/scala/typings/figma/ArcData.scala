package typings.figma

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArcData extends js.Object {
  val endingAngle: Double
  val innerRadius: Double
  val startingAngle: Double
}

object ArcData {
  @scala.inline
  def apply(endingAngle: Double, innerRadius: Double, startingAngle: Double): ArcData = {
    val __obj = js.Dynamic.literal(endingAngle = endingAngle, innerRadius = innerRadius, startingAngle = startingAngle)
  
    __obj.asInstanceOf[ArcData]
  }
}

