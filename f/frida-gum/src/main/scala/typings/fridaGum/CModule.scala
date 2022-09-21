package typings.fridaGum

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Compiles C source code to machine code, straight to memory. May also be
  * constructed from a precompiled shared library.
  *
  * Useful for implementing hot callbacks, e.g. for `Interceptor` and `Stalker`,
  * but also useful when needing to start new threads in order to call functions
  * in a tight loop, e.g. for fuzzing purposes.
  *
  * Global functions are automatically exported as `NativePointer` properties
  * named exactly like in the C source code. This means you can pass them to
  * `Interceptor` and `Stalker`, or call them using `NativeFunction`.
  *
  * In addition to accessing a curated subset of Gum, GLib, and standard C APIs,
  * the code being mapped in can also communicate with JavaScript through the
  * symbols exposed to it. These can be plugged in at creation, e.g. to share
  * memory allocated using `Memory.alloc()`, or `NativeCallback` values for
  * receiving callbacks from the C module.
  *
  * To perform initialization and cleanup, you may define functions with the
  * following names and signatures:
  *
  *     `void init (void)`
  *     `void finalize (void)`
  *
  * Note that all data is read-only, so writable globals should be declared
  * `extern`, allocated using e.g. `Memory.alloc()`, and passed in as symbols
  * through the constructor's second argument.
  */
trait CModule
  extends StObject
     with /* name */ StringDictionary[Any] {
  
  /**
    * Eagerly unmaps the module from memory. Useful for short-lived modules
    * when waiting for a future garbage collection isn't desirable.
    */
  def dispose(): Unit
}
object CModule {
  
  inline def apply(dispose: () => Unit): CModule = {
    val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose))
    __obj.asInstanceOf[CModule]
  }
  
  extension [Self <: CModule](x: Self) {
    
    inline def setDispose(value: () => Unit): Self = StObject.set(x, "dispose", js.Any.fromFunction0(value))
  }
}
