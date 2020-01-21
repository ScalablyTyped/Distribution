package typings.fabric

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBaseline extends js.Object {
  var baseline: Double
  var size: Double
}

object AnonBaseline {
  @scala.inline
  def apply(baseline: Double, size: Double): AnonBaseline = {
    val __obj = js.Dynamic.literal(baseline = baseline.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBaseline]
  }
}

