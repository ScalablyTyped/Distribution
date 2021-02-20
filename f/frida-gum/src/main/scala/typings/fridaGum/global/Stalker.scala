package typings.fridaGum.global

import typings.fridaGum.ArrayBuffer
import typings.fridaGum.MemoryRange
import typings.fridaGum.NativePointerValue
import typings.fridaGum.StalkerCallProbeCallback
import typings.fridaGum.StalkerCallProbeId
import typings.fridaGum.StalkerEventBare
import typings.fridaGum.StalkerEventFull
import typings.fridaGum.StalkerOptions
import typings.fridaGum.StalkerParseOptions
import typings.fridaGum.ThreadId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Follows execution on a per thread basis.
  */
object Stalker {
  
  @JSGlobal("Stalker")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Calls `callback` synchronously when a call is made to `address`.
    * Returns an id that can be passed to `removeCallProbe()` later.
    *
    * @param address Address of function to monitor stalked calls to.
    * @param callback Function to be called synchronously when a stalked
    *                 thread is about to call the function at `address`.
    * @param data User data to be passed to `StalkerNativeCallProbeCallback`.
    */
  @JSGlobal("Stalker.addCallProbe")
  @js.native
  def addCallProbe(address: NativePointerValue, callback: StalkerCallProbeCallback): StalkerCallProbeId = js.native
  @JSGlobal("Stalker.addCallProbe")
  @js.native
  def addCallProbe(address: NativePointerValue, callback: StalkerCallProbeCallback, data: NativePointerValue): StalkerCallProbeId = js.native
  
  /**
    * Marks a memory range as excluded. This means Stalker will not follow
    * execution when encountering a call to an instruction in such a range.
    * You will thus be able to observe/modify the arguments going in, and
    * the return value coming back, but won't see the instructions that
    * happened between.
    *
    * Useful to improve performance and reduce noise.
    *
    * @param range Range to exclude.
    */
  @JSGlobal("Stalker.exclude")
  @js.native
  def exclude(range: MemoryRange): Unit = js.native
  
  /**
    * Flushes out any buffered events. Useful when you don't want to wait
    * until the next `queueDrainInterval` tick.
    */
  @JSGlobal("Stalker.flush")
  @js.native
  def flush(): Unit = js.native
  
  /**
    * Starts following the execution of a given thread.
    *
    * @param threadId Thread ID to start following the execution of, or the
    *                 current thread if omitted.
    * @param options Options to customize the instrumentation.
    */
  @JSGlobal("Stalker.follow")
  @js.native
  def follow(): Unit = js.native
  @JSGlobal("Stalker.follow")
  @js.native
  def follow(threadId: js.UndefOr[scala.Nothing], options: StalkerOptions): Unit = js.native
  @JSGlobal("Stalker.follow")
  @js.native
  def follow(threadId: ThreadId): Unit = js.native
  @JSGlobal("Stalker.follow")
  @js.native
  def follow(threadId: ThreadId, options: StalkerOptions): Unit = js.native
  
  /**
    * Frees accumulated memory at a safe point after `unfollow()`. This is
    * needed to avoid race-conditions where the thread just unfollowed is
    * executing its last instructions.
    */
  @JSGlobal("Stalker.garbageCollect")
  @js.native
  def garbageCollect(): Unit = js.native
  
  /**
    * Parses a binary blob comprised of `Gum.Event` values.
    *
    * @param events Binary blob containing zero or more `Gum.Event` values.
    * @param options Options for customizing the output.
    */
  @JSGlobal("Stalker.parse")
  @js.native
  def parse(events: ArrayBuffer): js.Array[StalkerEventBare | StalkerEventFull] = js.native
  @JSGlobal("Stalker.parse")
  @js.native
  def parse(events: ArrayBuffer, options: StalkerParseOptions): js.Array[StalkerEventBare | StalkerEventFull] = js.native
  
  /**
    * Capacity of the event queue in number of events.
    *
    * Defaults to 16384 events.
    */
  @JSGlobal("Stalker.queueCapacity")
  @js.native
  def queueCapacity: Double = js.native
  @scala.inline
  def queueCapacity_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("queueCapacity")(x.asInstanceOf[js.Any])
  
  /**
    * Time in milliseconds between each time the event queue is drained.
    *
    * Defaults to 250 ms, which means that the event queue is drained four
    * times per second. You may also set this property to zero to disable
    * periodic draining and instead call `Stalker.flush()` when you would
    * like the queue to be drained.
    */
  @JSGlobal("Stalker.queueDrainInterval")
  @js.native
  def queueDrainInterval: Double = js.native
  @scala.inline
  def queueDrainInterval_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("queueDrainInterval")(x.asInstanceOf[js.Any])
  
  /**
    * Removes a call probe added by `addCallProbe()`.
    *
    * @param callbackId ID of probe to remove.
    */
  @JSGlobal("Stalker.removeCallProbe")
  @js.native
  def removeCallProbe(callbackId: StalkerCallProbeId): Unit = js.native
  
  /**
    * How many times a piece of code needs to be executed before it is assumed
    * it can be trusted to not mutate. Specify -1 for no trust (slow), 0 to
    * trust code from the get-go, and N to trust code after it has been
    * executed N times.
    *
    * Defaults to 1.
    */
  @JSGlobal("Stalker.trustThreshold")
  @js.native
  def trustThreshold: Double = js.native
  @scala.inline
  def trustThreshold_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("trustThreshold")(x.asInstanceOf[js.Any])
  
  /**
    * Stops following the execution of a given thread.
    *
    * @param threadId Thread ID to stop following the execution of, or the
    *                 current thread if omitted.
    */
  @JSGlobal("Stalker.unfollow")
  @js.native
  def unfollow(): Unit = js.native
  @JSGlobal("Stalker.unfollow")
  @js.native
  def unfollow(threadId: ThreadId): Unit = js.native
}
