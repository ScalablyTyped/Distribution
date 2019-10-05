package typings.fridaDashGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Thread")
@js.native
object Thread extends js.Object {
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
  def backtrace(): js.Array[NativePointer] = js.native
  def backtrace(context: CpuContext): js.Array[NativePointer] = js.native
  def backtrace(context: CpuContext, backtracer: Backtracer): js.Array[NativePointer] = js.native
  /**
    * Suspends execution of the current thread for `delay` seconds.
    *
    * For example `0.05` to sleep for 50 ms.
    *
    * @param delay Delay in seconds.
    */
  def sleep(delay: Double): Unit = js.native
}

