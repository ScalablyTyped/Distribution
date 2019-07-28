package typings.fridaDashGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Intercepts execution through inline hooking.
  */
@JSGlobal("Interceptor")
@js.native
object InterceptorNs extends js.Object {
  def attach(target: NativePointerValue, callbacksOrProbe: InstructionProbeCallback): InvocationListener = js.native
  /**
    * Intercepts calls to function/instruction at `target`. It is important
    * to specify a `InstructionProbeCallback` if `target` is not the first
    * instruction of a function.
    */
  def attach(target: NativePointerValue, callbacksOrProbe: InvocationListenerCallbacks): InvocationListener = js.native
  /**
    * Detaches all previously attached listeners.
    */
  def detachAll(): Unit = js.native
  /**
    * Replaces function at `target` with implementation at `replacement`.
    */
  def replace(target: NativePointerValue, replacement: NativePointerValue): Unit = js.native
  /**
    * Reverts the previously replaced function at `target`.
    */
  def revert(target: NativePointerValue): Unit = js.native
}

