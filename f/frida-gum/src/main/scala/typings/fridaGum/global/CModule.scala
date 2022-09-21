package typings.fridaGum.global

import typings.fridaGum.ArrayBuffer
import typings.fridaGum.CModuleBuiltins
import typings.fridaGum.CModuleOptions
import typings.fridaGum.CSymbols
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
@JSGlobal("CModule")
@js.native
open class CModule protected ()
  extends StObject
     with typings.fridaGum.CModule {
  /**
    * Creates a new C module from the provided `code`.
    *
    * @param code C source code to compile, or a precompiled shared library.
    * @param symbols Symbols to expose to the C module. Declare them as `extern`.
    *    This may for example be one or more memory blocks allocated using
    *     `Memory.alloc()`, and/or `NativeCallback` values for receiving
    *     callbacks from the C module.
    * @param options Options for customizing the construction.
    */
  def this(code: String) = this()
  def this(code: ArrayBuffer) = this()
  def this(code: String, symbols: CSymbols) = this()
  def this(code: ArrayBuffer, symbols: CSymbols) = this()
  def this(code: String, symbols: Unit, options: CModuleOptions) = this()
  def this(code: String, symbols: CSymbols, options: CModuleOptions) = this()
  def this(code: ArrayBuffer, symbols: Unit, options: CModuleOptions) = this()
  def this(code: ArrayBuffer, symbols: CSymbols, options: CModuleOptions) = this()
  
  /**
    * Eagerly unmaps the module from memory. Useful for short-lived modules
    * when waiting for a future garbage collection isn't desirable.
    */
  /* CompleteClass */
  override def dispose(): Unit = js.native
}
object CModule {
  
  @JSGlobal("CModule")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("CModule.builtins")
  @js.native
  def builtins: CModuleBuiltins = js.native
  inline def builtins_=(x: CModuleBuiltins): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("builtins")(x.asInstanceOf[js.Any])
}
