package typings.firebasePerformance.apiServiceMod._Global_

import typings.firebasePerformance.AnonInstantiable
import typings.firebasePerformance.AnonOnFirstInputDelay
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Window extends js.Object {
  var PerformanceObserver: AnonInstantiable
  var perfMetrics: js.UndefOr[AnonOnFirstInputDelay] = js.undefined
}

object Window {
  @scala.inline
  def apply(PerformanceObserver: AnonInstantiable, perfMetrics: AnonOnFirstInputDelay = null): Window = {
    val __obj = js.Dynamic.literal(PerformanceObserver = PerformanceObserver.asInstanceOf[js.Any])
    if (perfMetrics != null) __obj.updateDynamic("perfMetrics")(perfMetrics.asInstanceOf[js.Any])
    __obj.asInstanceOf[Window]
  }
}

