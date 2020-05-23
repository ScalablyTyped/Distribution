package typings.fabric.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Baseline extends js.Object {
  var baseline: Double
  var size: Double
}

object Baseline {
  @scala.inline
  def apply(baseline: Double, size: Double): Baseline = {
    val __obj = js.Dynamic.literal(baseline = baseline.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Baseline]
  }
}

