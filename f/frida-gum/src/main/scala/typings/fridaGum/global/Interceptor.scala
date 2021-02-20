package typings.fridaGum.global

import typings.fridaGum.InstructionProbeCallback
import typings.fridaGum.InvocationListenerCallbacks
import typings.fridaGum.NativePointerValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Intercepts execution through inline hooking.
  */
object Interceptor {
  
  @JSGlobal("Interceptor.attach")
  @js.native
  def attach(target: NativePointerValue, callbacksOrProbe: InstructionProbeCallback): typings.fridaGum.InvocationListener = js.native
  @JSGlobal("Interceptor.attach")
  @js.native
  def attach(target: NativePointerValue, callbacksOrProbe: InstructionProbeCallback, data: NativePointerValue): typings.fridaGum.InvocationListener = js.native
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
  @JSGlobal("Interceptor.attach")
  @js.native
  def attach(target: NativePointerValue, callbacksOrProbe: InvocationListenerCallbacks): typings.fridaGum.InvocationListener = js.native
  @JSGlobal("Interceptor.attach")
  @js.native
  def attach(
    target: NativePointerValue,
    callbacksOrProbe: InvocationListenerCallbacks,
    data: NativePointerValue
  ): typings.fridaGum.InvocationListener = js.native
  
  /**
    * Detaches all previously attached listeners.
    */
  @JSGlobal("Interceptor.detachAll")
  @js.native
  def detachAll(): Unit = js.native
  
  /**
    * Ensure any pending changes have been committed to memory.
    */
  @JSGlobal("Interceptor.flush")
  @js.native
  def flush(): Unit = js.native
  
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
  @JSGlobal("Interceptor.replace")
  @js.native
  def replace(target: NativePointerValue, replacement: NativePointerValue): Unit = js.native
  @JSGlobal("Interceptor.replace")
  @js.native
  def replace(target: NativePointerValue, replacement: NativePointerValue, data: NativePointerValue): Unit = js.native
  
  /**
    * Reverts the previously replaced function at `target`.
    */
  @JSGlobal("Interceptor.revert")
  @js.native
  def revert(target: NativePointerValue): Unit = js.native
}
