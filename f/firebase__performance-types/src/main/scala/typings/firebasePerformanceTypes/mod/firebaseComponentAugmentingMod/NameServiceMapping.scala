package typings.firebasePerformanceTypes.mod.firebaseComponentAugmentingMod

import typings.firebasePerformanceTypes.mod.FirebasePerformance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NameServiceMapping extends js.Object {
  var performance: FirebasePerformance
}

object NameServiceMapping {
  @scala.inline
  def apply(performance: FirebasePerformance): NameServiceMapping = {
    val __obj = js.Dynamic.literal(performance = performance.asInstanceOf[js.Any])
    __obj.asInstanceOf[NameServiceMapping]
  }
}

