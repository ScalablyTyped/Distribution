package typings.electron.Electron

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GlobalShortcut extends EventEmitter {
  // Docs: http://electronjs.org/docs/api/global-shortcut
  /**
    * When the accelerator is already taken by other applications, this call will
    * still return false. This behavior is intended by operating systems, since they
    * don't want applications to fight for global shortcuts.
    */
  def isRegistered(accelerator: Accelerator): Boolean = js.native
  /**
    * Registers a global shortcut of accelerator. The callback is called when the
    * registered shortcut is pressed by the user. When the accelerator is already
    * taken by other applications, this call will silently fail. This behavior is
    * intended by operating systems, since they don't want applications to fight for
    * global shortcuts. The following accelerators will not be registered successfully
    * on macOS 10.14 Mojave unless the app has been authorized as a trusted
    * accessibility client:
    */
  def register(accelerator: Accelerator, callback: js.Function): Boolean = js.native
  /**
    * Registers a global shortcut of all accelerator items in accelerators. The
    * callback is called when any of the registered shortcuts are pressed by the user.
    * When a given accelerator is already taken by other applications, this call will
    * silently fail. This behavior is intended by operating systems, since they don't
    * want applications to fight for global shortcuts. The following accelerators will
    * not be registered successfully on macOS 10.14 Mojave unless the app has been
    * authorized as a trusted accessibility client:
    */
  def registerAll(accelerators: js.Array[String], callback: js.Function): Unit = js.native
  /**
    * Unregisters the global shortcut of accelerator.
    */
  def unregister(accelerator: Accelerator): Unit = js.native
  /**
    * Unregisters all of the global shortcuts.
    */
  def unregisterAll(): Unit = js.native
}

@JSGlobal("Electron.globalShortcut")
@js.native
object globalShortcut extends TopLevel[GlobalShortcut]

