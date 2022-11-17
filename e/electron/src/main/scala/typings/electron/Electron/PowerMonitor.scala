package typings.electron.Electron

import typings.node.eventsMod.global.NodeJS.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PowerMonitor
  extends StObject
     with EventEmitter {
  
  @JSName("addListener")
  @scala.annotation.targetName("addListener_suspend")
  def addListener(event: "suspend", listener: js.Function): this.type = js.native
  @JSName("addListener")
  @scala.annotation.targetName("addListener_shutdown")
  def addListener(event: "shutdown", listener: js.Function): this.type = js.native
  @JSName("addListener")
  @scala.annotation.targetName("addListener_onac")
  def addListener(event: "on-ac", listener: js.Function): this.type = js.native
  @JSName("addListener")
  @scala.annotation.targetName("addListener_resume")
  def addListener(event: "resume", listener: js.Function): this.type = js.native
  @JSName("addListener")
  @scala.annotation.targetName("addListener_onbattery")
  def addListener(event: "on-battery", listener: js.Function): this.type = js.native
  @JSName("addListener")
  @scala.annotation.targetName("addListener_unlockscreen")
  def addListener(event: "unlock-screen", listener: js.Function): this.type = js.native
  @JSName("addListener")
  @scala.annotation.targetName("addListener_userdidresignactive")
  def addListener(event: "user-did-resign-active", listener: js.Function): this.type = js.native
  @JSName("addListener")
  @scala.annotation.targetName("addListener_userdidbecomeactive")
  def addListener(event: "user-did-become-active", listener: js.Function): this.type = js.native
  @JSName("addListener")
  @scala.annotation.targetName("addListener_lockscreen")
  def addListener(event: "lock-screen", listener: js.Function): this.type = js.native
  
  /**
    * The system's current state. Can be `active`, `idle`, `locked` or `unknown`.
    *
    * Calculate the system idle state. `idleThreshold` is the amount of time (in
    * seconds) before considered idle.  `locked` is available on supported systems
    * only.
    */
  def getSystemIdleState(idleThreshold: Double): "active" | "idle" | "locked" | "unknown" = js.native
  
  /**
    * Idle time in seconds
    *
    * Calculate system idle time in seconds.
    */
  def getSystemIdleTime(): Double = js.native
  
  /**
    * Whether the system is on battery power.
    *
    * To monitor for changes in this property, use the `on-battery` and `on-ac`
    * events.
    */
  def isOnBatteryPower(): Boolean = js.native
  
  /**
    * Emitted when the system is about to reboot or shut down. If the event handler
    * invokes `e.preventDefault()`, Electron will attempt to delay system shutdown in
    * order for the app to exit cleanly. If `e.preventDefault()` is called, the app
    * should exit as soon as possible by calling something like `app.quit()`.
    *
    * @platform linux,darwin
    */
  @JSName("on")
  @scala.annotation.targetName("on_shutdown")
  def on(event: "shutdown", listener: js.Function): this.type = js.native
  /**
    * Emitted when the system changes to AC power.
    *
    * @platform darwin,win32
    */
  @JSName("on")
  @scala.annotation.targetName("on_onac")
  def on(event: "on-ac", listener: js.Function): this.type = js.native
  /**
    * Emitted as soon as the systems screen is unlocked.
    *
    * @platform darwin,win32
    */
  @JSName("on")
  @scala.annotation.targetName("on_unlockscreen")
  def on(event: "unlock-screen", listener: js.Function): this.type = js.native
  /**
    * Emitted when a login session is activated. See documentation for more
    * information.
    *
    * @platform darwin
    */
  @JSName("on")
  @scala.annotation.targetName("on_userdidbecomeactive")
  def on(event: "user-did-become-active", listener: js.Function): this.type = js.native
  /**
    * Emitted when system changes to battery power.
    *
    * @platform darwin
    */
  @JSName("on")
  @scala.annotation.targetName("on_onbattery")
  def on(event: "on-battery", listener: js.Function): this.type = js.native
  /**
    * Emitted when system is resuming.
    */
  @JSName("on")
  @scala.annotation.targetName("on_resume")
  def on(event: "resume", listener: js.Function): this.type = js.native
  /**
    * Emitted when the system is suspending.
    */
  @JSName("on")
  @scala.annotation.targetName("on_suspend")
  def on(event: "suspend", listener: js.Function): this.type = js.native
  // Docs: https://electronjs.org/docs/api/power-monitor
  /**
    * Emitted when the system is about to lock the screen.
    *
    * @platform darwin,win32
    */
  @JSName("on")
  @scala.annotation.targetName("on_lockscreen")
  def on(event: "lock-screen", listener: js.Function): this.type = js.native
  /**
    * Emitted when a login session is deactivated. See documentation for more
    * information.
    *
    * @platform darwin
    */
  @JSName("on")
  @scala.annotation.targetName("on_userdidresignactive")
  def on(event: "user-did-resign-active", listener: js.Function): this.type = js.native
  
  /**
    * A `boolean` property. True if the system is on battery power.
    *
    * See `powerMonitor.isOnBatteryPower()`.
    */
  var onBatteryPower: Boolean = js.native
  
  @JSName("once")
  @scala.annotation.targetName("once_lockscreen")
  def once(event: "lock-screen", listener: js.Function): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_shutdown")
  def once(event: "shutdown", listener: js.Function): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_suspend")
  def once(event: "suspend", listener: js.Function): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_userdidbecomeactive")
  def once(event: "user-did-become-active", listener: js.Function): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_resume")
  def once(event: "resume", listener: js.Function): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_unlockscreen")
  def once(event: "unlock-screen", listener: js.Function): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_onbattery")
  def once(event: "on-battery", listener: js.Function): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_onac")
  def once(event: "on-ac", listener: js.Function): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_userdidresignactive")
  def once(event: "user-did-resign-active", listener: js.Function): this.type = js.native
  
  @JSName("removeListener")
  @scala.annotation.targetName("removeListener_resume")
  def removeListener(event: "resume", listener: js.Function): this.type = js.native
  @JSName("removeListener")
  @scala.annotation.targetName("removeListener_userdidbecomeactive")
  def removeListener(event: "user-did-become-active", listener: js.Function): this.type = js.native
  @JSName("removeListener")
  @scala.annotation.targetName("removeListener_onbattery")
  def removeListener(event: "on-battery", listener: js.Function): this.type = js.native
  @JSName("removeListener")
  @scala.annotation.targetName("removeListener_suspend")
  def removeListener(event: "suspend", listener: js.Function): this.type = js.native
  @JSName("removeListener")
  @scala.annotation.targetName("removeListener_shutdown")
  def removeListener(event: "shutdown", listener: js.Function): this.type = js.native
  @JSName("removeListener")
  @scala.annotation.targetName("removeListener_lockscreen")
  def removeListener(event: "lock-screen", listener: js.Function): this.type = js.native
  @JSName("removeListener")
  @scala.annotation.targetName("removeListener_userdidresignactive")
  def removeListener(event: "user-did-resign-active", listener: js.Function): this.type = js.native
  @JSName("removeListener")
  @scala.annotation.targetName("removeListener_unlockscreen")
  def removeListener(event: "unlock-screen", listener: js.Function): this.type = js.native
  @JSName("removeListener")
  @scala.annotation.targetName("removeListener_onac")
  def removeListener(event: "on-ac", listener: js.Function): this.type = js.native
}
