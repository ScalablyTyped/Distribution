package typings.figma.mod._Global_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VectorRegion extends js.Object {
  val loops: js.Array[js.Array[Double]]
  val windingRule: WindingRule
}

object VectorRegion {
  @scala.inline
  def apply(loops: js.Array[js.Array[Double]], windingRule: WindingRule): VectorRegion = {
    val __obj = js.Dynamic.literal(loops = loops.asInstanceOf[js.Any], windingRule = windingRule.asInstanceOf[js.Any])
    __obj.asInstanceOf[VectorRegion]
  }
}

