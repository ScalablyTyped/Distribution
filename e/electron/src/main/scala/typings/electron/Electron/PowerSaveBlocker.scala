package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PowerSaveBlocker extends StObject {
  
  // Docs: https://electronjs.org/docs/api/power-save-blocker
  /**
    * Whether the corresponding `powerSaveBlocker` has started.
    */
  def isStarted(id: Double): Boolean
  
  /**
    * The blocker ID that is assigned to this power blocker.
    *
    * Starts preventing the system from entering lower-power mode. Returns an integer
    * identifying the power save blocker.
    *
    * **Note:** `prevent-display-sleep` has higher precedence over
    * `prevent-app-suspension`. Only the highest precedence type takes effect. In
    * other words, `prevent-display-sleep` always takes precedence over
    * `prevent-app-suspension`.
    *
    * For example, an API calling A requests for `prevent-app-suspension`, and another
    * calling B requests for `prevent-display-sleep`. `prevent-display-sleep` will be
    * used until B stops its request. After that, `prevent-app-suspension` is used.
    */
  @JSName("start")
  @scala.annotation.targetName("start_preventappsuspension_preventdisplaysleep")
  def start(`type`: "prevent-app-suspension" | "prevent-display-sleep"): Double
  
  /**
    * Stops the specified power save blocker.
    */
  def stop(id: Double): Unit
}
object PowerSaveBlocker {
  
  inline def apply(
    isStarted: Double => Boolean,
    start: "prevent-app-suspension" | "prevent-display-sleep" => Double,
    stop: Double => Unit
  ): PowerSaveBlocker = {
    val __obj = js.Dynamic.literal(isStarted = js.Any.fromFunction1(isStarted), start = js.Any.fromFunction1(start), stop = js.Any.fromFunction1(stop))
    __obj.asInstanceOf[PowerSaveBlocker]
  }
  
  extension [Self <: PowerSaveBlocker](x: Self) {
    
    inline def setIsStarted(value: Double => Boolean): Self = StObject.set(x, "isStarted", js.Any.fromFunction1(value))
    
    inline def setStart(value: "prevent-app-suspension" | "prevent-display-sleep" => Double): Self = StObject.set(x, "start", js.Any.fromFunction1(value))
    
    inline def setStop(value: Double => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction1(value))
  }
}
