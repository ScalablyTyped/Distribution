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
  def attach(target: NativePointerValue, callbacksOrProbe: InstructionProbeCallback, data: NativePointerValue): InvocationListener = js.native
  /**
    * Intercepts calls to function/instruction at `target`. It is important
    * to specify a `InstructionProbeCallback` if `target` is not the first
    * instruction of a function.
    *
    * @param target Address of function/instruction to intercept.
    * @param callbacksOrProbe Callbacks or instruction-level probe callback.
    * @param data User data exposed to `NativeInvocationListenerCallbacks`
    *             through the `GumInvocationContext *`.
    */
  def attach(target: NativePointerValue, callbacksOrProbe: InvocationListenerCallbacks): InvocationListener = js.native
  def attach(
    target: NativePointerValue,
    callbacksOrProbe: InvocationListenerCallbacks,
    data: NativePointerValue
  ): InvocationListener = js.native
  /**
    * Detaches all previously attached listeners.
    */
  def detachAll(): Unit = js.native
  /**
    * Replaces function at `target` with implementation at `replacement`.
    *
    * May be implemented using e.g. `NativeCallback` or `CModule`.
    *
    * @param target Address of function to replace.
    * @param replacement Replacement implementation.
    * @param data User data exposed to native replacement through the
    *             `GumInvocationContext *`, obtained using
    *             `gum_interceptor_get_current_invocation()`.
    */
  def replace(target: NativePointerValue, replacement: NativePointerValue): Unit = js.native
  def replace(target: NativePointerValue, replacement: NativePointerValue, data: NativePointerValue): Unit = js.native
  /**
    * Reverts the previously replaced function at `target`.
    */
  def revert(target: NativePointerValue): Unit = js.native
}

