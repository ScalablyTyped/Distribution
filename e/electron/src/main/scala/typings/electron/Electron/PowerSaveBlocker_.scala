package typings.electron.Electron

import typings.electron.electronStrings.`prevent-app-suspension`
import typings.electron.electronStrings.`prevent-display-sleep`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PowerSaveBlocker_ extends js.Object {
  // Docs: http://electronjs.org/docs/api/power-save-blocker
  /**
    * Whether the corresponding `powerSaveBlocker` has started.
    */
  def isStarted(id: Double): Boolean = js.native
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
  def start_preventappsuspension(`type`: `prevent-app-suspension`): Double = js.native
  @JSName("start")
  def start_preventdisplaysleep(`type`: `prevent-display-sleep`): Double = js.native
  /**
    * Stops the specified power save blocker.
    */
  def stop(id: Double): Unit = js.native
}

