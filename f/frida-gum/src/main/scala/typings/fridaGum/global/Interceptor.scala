package typings.fridaGum.global

import typings.fridaGum.InstructionProbeCallback
import typings.fridaGum.InvocationListenerCallbacks
import typings.fridaGum.NativePointerValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Intercepts execution through inline hooking.
  */
object Interceptor {
  
  @JSGlobal("Interceptor")
  @js.native
  val ^ : js.Any = js.native
  
  inline def attach(target: NativePointerValue, callbacksOrProbe: InstructionProbeCallback): typings.fridaGum.InvocationListener = (^.asInstanceOf[js.Dynamic].applyDynamic("attach")(target.asInstanceOf[js.Any], callbacksOrProbe.asInstanceOf[js.Any])).asInstanceOf[typings.fridaGum.InvocationListener]
  inline def attach(target: NativePointerValue, callbacksOrProbe: InstructionProbeCallback, data: NativePointerValue): typings.fridaGum.InvocationListener = (^.asInstanceOf[js.Dynamic].applyDynamic("attach")(target.asInstanceOf[js.Any], callbacksOrProbe.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[typings.fridaGum.InvocationListener]
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
  inline def attach(target: NativePointerValue, callbacksOrProbe: InvocationListenerCallbacks): typings.fridaGum.InvocationListener = (^.asInstanceOf[js.Dynamic].applyDynamic("attach")(target.asInstanceOf[js.Any], callbacksOrProbe.asInstanceOf[js.Any])).asInstanceOf[typings.fridaGum.InvocationListener]
  inline def attach(
    target: NativePointerValue,
    callbacksOrProbe: InvocationListenerCallbacks,
    data: NativePointerValue
  ): typings.fridaGum.InvocationListener = (^.asInstanceOf[js.Dynamic].applyDynamic("attach")(target.asInstanceOf[js.Any], callbacksOrProbe.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[typings.fridaGum.InvocationListener]
  
  /**
    * Detaches all previously attached listeners.
    */
  inline def detachAll(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("detachAll")().asInstanceOf[Unit]
  
  /**
    * Ensure any pending changes have been committed to memory.
    */
  inline def flush(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("flush")().asInstanceOf[Unit]
  
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
  inline def replace(target: NativePointerValue, replacement: NativePointerValue): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("replace")(target.asInstanceOf[js.Any], replacement.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def replace(target: NativePointerValue, replacement: NativePointerValue, data: NativePointerValue): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("replace")(target.asInstanceOf[js.Any], replacement.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Reverts the previously replaced function at `target`.
    */
  inline def revert(target: NativePointerValue): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("revert")(target.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
