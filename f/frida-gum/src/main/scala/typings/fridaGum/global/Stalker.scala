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
  inline def addCallProbe(address: NativePointerValue, callback: StalkerCallProbeCallback): StalkerCallProbeId = (^.asInstanceOf[js.Dynamic].applyDynamic("addCallProbe")(address.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[StalkerCallProbeId]
  inline def addCallProbe(address: NativePointerValue, callback: StalkerCallProbeCallback, data: NativePointerValue): StalkerCallProbeId = (^.asInstanceOf[js.Dynamic].applyDynamic("addCallProbe")(address.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[StalkerCallProbeId]
  
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
  inline def exclude(range: MemoryRange): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("exclude")(range.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Flushes out any buffered events. Useful when you don't want to wait
    * until the next `queueDrainInterval` tick.
    */
  inline def flush(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("flush")().asInstanceOf[Unit]
  
  /**
    * Starts following the execution of a given thread.
    *
    * @param threadId Thread ID to start following the execution of, or the
    *                 current thread if omitted.
    * @param options Options to customize the instrumentation.
    */
  inline def follow(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("follow")().asInstanceOf[Unit]
  inline def follow(threadId: Unit, options: StalkerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("follow")(threadId.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def follow(threadId: ThreadId): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("follow")(threadId.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def follow(threadId: ThreadId, options: StalkerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("follow")(threadId.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Frees accumulated memory at a safe point after `unfollow()`. This is
    * needed to avoid race-conditions where the thread just unfollowed is
    * executing its last instructions.
    */
  inline def garbageCollect(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("garbageCollect")().asInstanceOf[Unit]
  
  /**
    * Invalidates the current thread's translated code for a given basic block.
    * Useful when providing a transform callback and wanting to dynamically
    * adapt the instrumentation for a given basic block. This is much more
    * efficient than unfollowing and re-following the thread, which would
    * discard all cached translations and require all encountered basic blocks
    * to be compiled from scratch.
    *
    * @param address Start address of basic block to invalidate.
    */
  inline def invalidate(address: NativePointerValue): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("invalidate")(address.asInstanceOf[js.Any]).asInstanceOf[Unit]
  /**
    * Invalidates a specific thread's translated code for a given basic block.
    * Useful when providing a transform callback and wanting to dynamically
    * adapt the instrumentation for a given basic block. This is much more
    * efficient than unfollowing and re-following the thread, which would
    * discard all cached translations and require all encountered basic blocks
    * to be compiled from scratch.
    *
    * @param threadId Thread that should have some of its code invalidated.
    * @param address Start address of basic block to invalidate.
    */
  inline def invalidate(threadId: ThreadId, address: NativePointerValue): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("invalidate")(threadId.asInstanceOf[js.Any], address.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Parses a binary blob comprised of `Gum.Event` values.
    *
    * @param events Binary blob containing zero or more `Gum.Event` values.
    * @param options Options for customizing the output.
    */
  inline def parse(events: ArrayBuffer): js.Array[StalkerEventBare | StalkerEventFull] = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(events.asInstanceOf[js.Any]).asInstanceOf[js.Array[StalkerEventBare | StalkerEventFull]]
  inline def parse(events: ArrayBuffer, options: StalkerParseOptions): js.Array[StalkerEventBare | StalkerEventFull] = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(events.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[StalkerEventBare | StalkerEventFull]]
  
  /**
    * Capacity of the event queue in number of events.
    *
    * Defaults to 16384 events.
    */
  @JSGlobal("Stalker.queueCapacity")
  @js.native
  def queueCapacity: Double = js.native
  inline def queueCapacity_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("queueCapacity")(x.asInstanceOf[js.Any])
  
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
  inline def queueDrainInterval_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("queueDrainInterval")(x.asInstanceOf[js.Any])
  
  /**
    * Removes a call probe added by `addCallProbe()`.
    *
    * @param callbackId ID of probe to remove.
    */
  inline def removeCallProbe(callbackId: StalkerCallProbeId): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeCallProbe")(callbackId.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
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
  inline def trustThreshold_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("trustThreshold")(x.asInstanceOf[js.Any])
  
  /**
    * Stops following the execution of a given thread.
    *
    * @param threadId Thread ID to stop following the execution of, or the
    *                 current thread if omitted.
    */
  inline def unfollow(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unfollow")().asInstanceOf[Unit]
  inline def unfollow(threadId: ThreadId): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unfollow")(threadId.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
