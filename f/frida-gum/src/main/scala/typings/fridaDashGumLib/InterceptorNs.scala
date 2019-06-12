package typings
package fridaDashGumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Intercepts execution through inline hooking.
  */
@JSGlobal("Interceptor")
@js.native
object InterceptorNs extends js.Object {
  def attach(
    target: fridaDashGumLib.NativePointerValue,
    callbacksOrProbe: fridaDashGumLib.InstructionProbeCallback
  ): fridaDashGumLib.InvocationListener = js.native
  /**
    * Intercepts calls to function/instruction at `target`. It is important
    * to specify a `InstructionProbeCallback` if `target` is not the first
    * instruction of a function.
    */
  def attach(
    target: fridaDashGumLib.NativePointerValue,
    callbacksOrProbe: fridaDashGumLib.InvocationListenerCallbacks
  ): fridaDashGumLib.InvocationListener = js.native
  /**
    * Detaches all previously attached listeners.
    */
  def detachAll(): scala.Unit = js.native
  /**
    * Replaces function at `target` with implementation at `replacement`.
    */
  def replace(target: fridaDashGumLib.NativePointerValue, replacement: fridaDashGumLib.NativePointerValue): scala.Unit = js.native
  /**
    * Reverts the previously replaced function at `target`.
    */
  def revert(target: fridaDashGumLib.NativePointerValue): scala.Unit = js.native
}

