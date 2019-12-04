package typings.atFirebasePerformance.distSrcServicesApiUnderscoreServiceMod._Global_

import typings.atFirebasePerformance.Anon_Callback
import typings.atFirebasePerformance.Anon_OnFirstInputDelay
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Window extends js.Object {
  var PerformanceObserver: Anon_Callback
  var perfMetrics: js.UndefOr[Anon_OnFirstInputDelay] = js.undefined
}

object Window {
  @scala.inline
  def apply(PerformanceObserver: Anon_Callback, perfMetrics: Anon_OnFirstInputDelay = null): Window = {
    val __obj = js.Dynamic.literal(PerformanceObserver = PerformanceObserver.asInstanceOf[js.Any])
    if (perfMetrics != null) __obj.updateDynamic("perfMetrics")(perfMetrics.asInstanceOf[js.Any])
    __obj.asInstanceOf[Window]
  }
}

