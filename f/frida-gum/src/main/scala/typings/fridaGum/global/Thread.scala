package typings.fridaGum.global

import typings.fridaGum.CpuContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Thread {
  
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
  @JSGlobal("Thread.backtrace")
  @js.native
  def backtrace(): js.Array[typings.fridaGum.NativePointer] = js.native
  @JSGlobal("Thread.backtrace")
  @js.native
  def backtrace(context: js.UndefOr[scala.Nothing], backtracer: typings.fridaGum.Backtracer): js.Array[typings.fridaGum.NativePointer] = js.native
  @JSGlobal("Thread.backtrace")
  @js.native
  def backtrace(context: CpuContext): js.Array[typings.fridaGum.NativePointer] = js.native
  @JSGlobal("Thread.backtrace")
  @js.native
  def backtrace(context: CpuContext, backtracer: typings.fridaGum.Backtracer): js.Array[typings.fridaGum.NativePointer] = js.native
  
  /**
    * Suspends execution of the current thread for `delay` seconds.
    *
    * For example `0.05` to sleep for 50 ms.
    *
    * @param delay Delay in seconds.
    */
  @JSGlobal("Thread.sleep")
  @js.native
  def sleep(delay: Double): Unit = js.native
}
