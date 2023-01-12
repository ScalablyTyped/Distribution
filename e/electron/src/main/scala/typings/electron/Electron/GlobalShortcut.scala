package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GlobalShortcut extends StObject {
  
  // Docs: https://electronjs.org/docs/api/global-shortcut
  /**
    * Whether this application has registered `accelerator`.
    *
    * When the accelerator is already taken by other applications, this call will
    * still return `false`. This behavior is intended by operating systems, since they
    * don't want applications to fight for global shortcuts.
    */
  def isRegistered(accelerator: Accelerator): Boolean
  
  /**
    * Whether or not the shortcut was registered successfully.
    *
    * Registers a global shortcut of `accelerator`. The `callback` is called when the
    * registered shortcut is pressed by the user.
    *
    * When the accelerator is already taken by other applications, this call will
    * silently fail. This behavior is intended by operating systems, since they don't
    * want applications to fight for global shortcuts.
    *
    * The following accelerators will not be registered successfully on macOS 10.14
    * Mojave unless the app has been authorized as a trusted accessibility client:
    *
    * * "Media Play/Pause"
    * * "Media Next Track"
    * * "Media Previous Track"
    * * "Media Stop"
    */
  def register(accelerator: Accelerator, callback: js.Function0[Unit]): Boolean
  
  /**
    * Registers a global shortcut of all `accelerator` items in `accelerators`. The
    * `callback` is called when any of the registered shortcuts are pressed by the
    * user.
    *
    * When a given accelerator is already taken by other applications, this call will
    * silently fail. This behavior is intended by operating systems, since they don't
    * want applications to fight for global shortcuts.
    *
    * The following accelerators will not be registered successfully on macOS 10.14
    * Mojave unless the app has been authorized as a trusted accessibility client:
    *
    * * "Media Play/Pause"
    * * "Media Next Track"
    * * "Media Previous Track"
    * * "Media Stop"
    */
  def registerAll(accelerators: js.Array[String], callback: js.Function0[Unit]): Unit
  
  /**
    * Unregisters the global shortcut of `accelerator`.
    */
  def unregister(accelerator: Accelerator): Unit
  
  /**
    * Unregisters all of the global shortcuts.
    */
  def unregisterAll(): Unit
}
object GlobalShortcut {
  
  inline def apply(
    isRegistered: Accelerator => Boolean,
    register: (Accelerator, js.Function0[Unit]) => Boolean,
    registerAll: (js.Array[String], js.Function0[Unit]) => Unit,
    unregister: Accelerator => Unit,
    unregisterAll: () => Unit
  ): GlobalShortcut = {
    val __obj = js.Dynamic.literal(isRegistered = js.Any.fromFunction1(isRegistered), register = js.Any.fromFunction2(register), registerAll = js.Any.fromFunction2(registerAll), unregister = js.Any.fromFunction1(unregister), unregisterAll = js.Any.fromFunction0(unregisterAll))
    __obj.asInstanceOf[GlobalShortcut]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GlobalShortcut] (val x: Self) extends AnyVal {
    
    inline def setIsRegistered(value: Accelerator => Boolean): Self = StObject.set(x, "isRegistered", js.Any.fromFunction1(value))
    
    inline def setRegister(value: (Accelerator, js.Function0[Unit]) => Boolean): Self = StObject.set(x, "register", js.Any.fromFunction2(value))
    
    inline def setRegisterAll(value: (js.Array[String], js.Function0[Unit]) => Unit): Self = StObject.set(x, "registerAll", js.Any.fromFunction2(value))
    
    inline def setUnregister(value: Accelerator => Unit): Self = StObject.set(x, "unregister", js.Any.fromFunction1(value))
    
    inline def setUnregisterAll(value: () => Unit): Self = StObject.set(x, "unregisterAll", js.Any.fromFunction0(value))
  }
}
