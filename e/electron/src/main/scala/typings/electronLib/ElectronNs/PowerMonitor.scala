package typings
package electronLib.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PowerMonitor extends EventEmitter {
  @JSName("addListener")
  def addListener_lockscreen(event: electronLib.electronLibStrings.`lock-screen`, listener: js.Function): this.type = js.native
  @JSName("addListener")
  def addListener_onac(event: electronLib.electronLibStrings.`on-ac`, listener: js.Function): this.type = js.native
  @JSName("addListener")
  def addListener_onbattery(event: electronLib.electronLibStrings.`on-battery`, listener: js.Function): this.type = js.native
  @JSName("addListener")
  def addListener_resume(event: electronLib.electronLibStrings.resume, listener: js.Function): this.type = js.native
  @JSName("addListener")
  def addListener_shutdown(event: electronLib.electronLibStrings.shutdown, listener: js.Function): this.type = js.native
  @JSName("addListener")
  def addListener_suspend(event: electronLib.electronLibStrings.suspend, listener: js.Function): this.type = js.native
  @JSName("addListener")
  def addListener_unlockscreen(event: electronLib.electronLibStrings.`unlock-screen`, listener: js.Function): this.type = js.native
  // Docs: http://electronjs.org/docs/api/power-monitor
  /**
    * Emitted when the system is about to lock the screen.
    */
  @JSName("on")
  def on_lockscreen(event: electronLib.electronLibStrings.`lock-screen`, listener: js.Function): this.type = js.native
  /**
    * Emitted when the system changes to AC power.
    */
  @JSName("on")
  def on_onac(event: electronLib.electronLibStrings.`on-ac`, listener: js.Function): this.type = js.native
  /**
    * Emitted when system changes to battery power.
    */
  @JSName("on")
  def on_onbattery(event: electronLib.electronLibStrings.`on-battery`, listener: js.Function): this.type = js.native
  /**
    * Emitted when system is resuming.
    */
  @JSName("on")
  def on_resume(event: electronLib.electronLibStrings.resume, listener: js.Function): this.type = js.native
  /**
    * Emitted when the system is about to reboot or shut down. If the event handler
    * invokes e.preventDefault(), Electron will attempt to delay system shutdown in
    * order for the app to exit cleanly. If e.preventDefault() is called, the app
    * should exit as soon as possible by calling something like app.quit().
    */
  @JSName("on")
  def on_shutdown(event: electronLib.electronLibStrings.shutdown, listener: js.Function): this.type = js.native
  /**
    * Emitted when the system is suspending.
    */
  @JSName("on")
  def on_suspend(event: electronLib.electronLibStrings.suspend, listener: js.Function): this.type = js.native
  /**
    * Emitted as soon as the systems screen is unlocked.
    */
  @JSName("on")
  def on_unlockscreen(event: electronLib.electronLibStrings.`unlock-screen`, listener: js.Function): this.type = js.native
  @JSName("once")
  def once_lockscreen(event: electronLib.electronLibStrings.`lock-screen`, listener: js.Function): this.type = js.native
  @JSName("once")
  def once_onac(event: electronLib.electronLibStrings.`on-ac`, listener: js.Function): this.type = js.native
  @JSName("once")
  def once_onbattery(event: electronLib.electronLibStrings.`on-battery`, listener: js.Function): this.type = js.native
  @JSName("once")
  def once_resume(event: electronLib.electronLibStrings.resume, listener: js.Function): this.type = js.native
  @JSName("once")
  def once_shutdown(event: electronLib.electronLibStrings.shutdown, listener: js.Function): this.type = js.native
  @JSName("once")
  def once_suspend(event: electronLib.electronLibStrings.suspend, listener: js.Function): this.type = js.native
  @JSName("once")
  def once_unlockscreen(event: electronLib.electronLibStrings.`unlock-screen`, listener: js.Function): this.type = js.native
  @JSName("removeListener")
  def removeListener_lockscreen(event: electronLib.electronLibStrings.`lock-screen`, listener: js.Function): this.type = js.native
  @JSName("removeListener")
  def removeListener_onac(event: electronLib.electronLibStrings.`on-ac`, listener: js.Function): this.type = js.native
  @JSName("removeListener")
  def removeListener_onbattery(event: electronLib.electronLibStrings.`on-battery`, listener: js.Function): this.type = js.native
  @JSName("removeListener")
  def removeListener_resume(event: electronLib.electronLibStrings.resume, listener: js.Function): this.type = js.native
  @JSName("removeListener")
  def removeListener_shutdown(event: electronLib.electronLibStrings.shutdown, listener: js.Function): this.type = js.native
  @JSName("removeListener")
  def removeListener_suspend(event: electronLib.electronLibStrings.suspend, listener: js.Function): this.type = js.native
  @JSName("removeListener")
  def removeListener_unlockscreen(event: electronLib.electronLibStrings.`unlock-screen`, listener: js.Function): this.type = js.native
}

