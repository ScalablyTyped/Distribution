package typings
package fabricLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Baseline extends js.Object {
  var baseline: scala.Double
  var size: scala.Double
}

object Anon_Baseline {
  @scala.inline
  def apply(baseline: scala.Double, size: scala.Double): Anon_Baseline = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("baseline")(baseline)
    __obj.updateDynamic("size")(size)
    __obj.asInstanceOf[Anon_Baseline]
  }
}

