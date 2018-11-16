package typings
package electronLib.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GlobalShortcut extends EventEmitter {
  // Docs: http://electron.atom.io/docs/api/global-shortcut
  /**
       * When the accelerator is already taken by other applications, this call will
       * still return false. This behavior is intended by operating systems, since they
       * don't want applications to fight for global shortcuts.
       */
  def isRegistered(accelerator: Accelerator): scala.Boolean = js.native
  /**
       * Registers a global shortcut of accelerator. The callback is called when the
       * registered shortcut is pressed by the user. When the accelerator is already
       * taken by other applications, this call will silently fail. This behavior is
       * intended by operating systems, since they don't want applications to fight for
       * global shortcuts.
       */
  def register(accelerator: Accelerator, callback: js.Function): scala.Unit = js.native
  /**
       * Unregisters the global shortcut of accelerator.
       */
  def unregister(accelerator: Accelerator): scala.Unit = js.native
  /**
       * Unregisters all of the global shortcuts.
       */
  def unregisterAll(): scala.Unit = js.native
}

