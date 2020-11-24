package typings.firebasePerformance.apiServiceMod.global

import org.scalablytyped.runtime.Instantiable1
import typings.firebasePerformance.anon.Instantiable
import typings.firebasePerformance.anon.OnFirstInputDelay
import typings.std.PerformanceObserverCallback
import typings.std.global.PerformanceObserver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Window extends js.Object {
  
  var PerformanceObserver: Instantiable with (Instantiable1[/* callback */ PerformanceObserverCallback, typings.std.global.PerformanceObserver]) = js.native
  
  var perfMetrics: js.UndefOr[OnFirstInputDelay] = js.native
}
object Window {
  
  @scala.inline
  def apply(
    PerformanceObserver: Instantiable with (Instantiable1[/* callback */ PerformanceObserverCallback, PerformanceObserver])
  ): Window = {
    val __obj = js.Dynamic.literal(PerformanceObserver = PerformanceObserver.asInstanceOf[js.Any])
    __obj.asInstanceOf[Window]
  }
  
  @scala.inline
  implicit class WindowOps[Self <: Window] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setPerformanceObserver(
      value: Instantiable with (Instantiable1[/* callback */ PerformanceObserverCallback, PerformanceObserver])
    ): Self = this.set("PerformanceObserver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPerfMetrics(value: OnFirstInputDelay): Self = this.set("perfMetrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePerfMetrics: Self = this.set("perfMetrics", js.undefined)
  }
}
