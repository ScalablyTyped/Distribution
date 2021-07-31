package typings.fridaGum.global

import typings.fridaGum.CpuContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Thread {
  
  @JSGlobal("Thread")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Generates a backtrace for the given thread's `context`.
    *
    * If you call this from Interceptor's `onEnter` or `onLeave` callbacks
    * you should provide `this.context` for the optional `context` argument,
    * as it will give you a more accurate backtrace. Omitting `context` means
    * the backtrace will be generated from the current stack location, which
    * may not give you a very good backtrace due to the JavaScript VM's
    * potentially JITed stack frames.
    *
    * @param context CPU context to use for generating the backtrace.
    * @param backtracer The kind of backtracer to use. Must be either
    *                   `Backtracer.FUZZY` or `Backtracer.ACCURATE`,
    *                   where the latter is the default if not specified.
    */
  @scala.inline
  def backtrace(): js.Array[typings.fridaGum.NativePointer] = ^.asInstanceOf[js.Dynamic].applyDynamic("backtrace")().asInstanceOf[js.Array[typings.fridaGum.NativePointer]]
  @scala.inline
  def backtrace(context: Unit, backtracer: typings.fridaGum.Backtracer): js.Array[typings.fridaGum.NativePointer] = (^.asInstanceOf[js.Dynamic].applyDynamic("backtrace")(context.asInstanceOf[js.Any], backtracer.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.fridaGum.NativePointer]]
  @scala.inline
  def backtrace(context: CpuContext): js.Array[typings.fridaGum.NativePointer] = ^.asInstanceOf[js.Dynamic].applyDynamic("backtrace")(context.asInstanceOf[js.Any]).asInstanceOf[js.Array[typings.fridaGum.NativePointer]]
  @scala.inline
  def backtrace(context: CpuContext, backtracer: typings.fridaGum.Backtracer): js.Array[typings.fridaGum.NativePointer] = (^.asInstanceOf[js.Dynamic].applyDynamic("backtrace")(context.asInstanceOf[js.Any], backtracer.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.fridaGum.NativePointer]]
  
  /**
    * Suspends execution of the current thread for `delay` seconds.
    *
    * For example `0.05` to sleep for 50 ms.
    *
    * @param delay Delay in seconds.
    */
  @scala.inline
  def sleep(delay: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("sleep")(delay.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
