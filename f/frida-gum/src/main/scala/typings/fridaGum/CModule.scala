package typings.fridaGum

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Compiles C source code to machine code, straight to memory.
  *
  * Useful for implementing hot callbacks, e.g. for `Interceptor` and `Stalker`,
  * but also useful when needing to start new threads in order to call functions
  * in a tight loop, e.g. for fuzzing purposes.
  *
  * Global functions are automatically exported as `NativePointer` properties
  * named exactly like in the C source code. This means you can pass them to
  * `Interceptor` and `Stalker`, or call them using `NativeFunction`.
  *
  * Symbols can also be plugged in at creation, e.g. memory allocated using
  * `Memory.alloc()`, or `NativeCallback` for receiving callbacks from the C
  * module.
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
@js.native
trait CModule
  extends /* name */ StringDictionary[js.Any] {
  /**
    * Eagerly unmaps the module from memory. Useful for short-lived modules
    * when waiting for a future garbage collection isn't desirable.
    */
  def dispose(): Unit = js.native
}

object CModule {
  @scala.inline
  def apply(dispose: () => Unit): CModule = {
    val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose))
    __obj.asInstanceOf[CModule]
  }
  @scala.inline
  implicit class CModuleOps[Self <: CModule] (val x: Self) extends AnyVal {
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
    def setDispose(value: () => Unit): Self = this.set("dispose", js.Any.fromFunction0(value))
  }
  
}

