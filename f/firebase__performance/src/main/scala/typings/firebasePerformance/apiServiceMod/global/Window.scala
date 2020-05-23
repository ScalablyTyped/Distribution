package typings.firebasePerformance.apiServiceMod.global

import org.scalablytyped.runtime.Instantiable1
import typings.firebasePerformance.anon.Instantiable
import typings.firebasePerformance.anon.OnFirstInputDelay
import typings.std.PerformanceObserverCallback
import typings.std.global.PerformanceObserver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Window extends js.Object {
  var PerformanceObserver: Instantiable with (Instantiable1[/* callback */ PerformanceObserverCallback, typings.std.global.PerformanceObserver])
  var perfMetrics: js.UndefOr[OnFirstInputDelay] = js.undefined
}

object Window {
  @scala.inline
  def apply(
    PerformanceObserver: Instantiable with (Instantiable1[/* callback */ PerformanceObserverCallback, PerformanceObserver]),
    perfMetrics: OnFirstInputDelay = null
  ): Window = {
    val __obj = js.Dynamic.literal(PerformanceObserver = PerformanceObserver.asInstanceOf[js.Any])
    if (perfMetrics != null) __obj.updateDynamic("perfMetrics")(perfMetrics.asInstanceOf[js.Any])
    __obj.asInstanceOf[Window]
  }
}

