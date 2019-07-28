package typings.fridaDashGum

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Follows execution on a per thread basis.
  */
@JSGlobal("Stalker")
@js.native
object StalkerNs extends js.Object {
  /**
    * Capacity of the event queue in number of events.
    *
    * Defaults to 16384 events.
    */
  var queueCapacity: Double = js.native
  /**
    * Time in milliseconds between each time the event queue is drained.
    *
    * Defaults to 250 ms, which means that the event queue is drained four
    * times per second.
    */
  var queueDrainInterval: Double = js.native
  /**
    * How many times a piece of code needs to be executed before it is assumed
    * it can be trusted to not mutate. Specify -1 for no trust (slow), 0 to
    * trust code from the get-go, and N to trust code after it has been
    * executed N times.
    *
    * Defaults to 1.
    */
  var trustThreshold: Double = js.native
  /**
    * Calls `callback` synchronously when a `CALL` is made to `address`.
    * Returns an id that can be passed to `removeCallProbe()` later.
    *
    * @param address Address of function to monitor stalked calls to.
    * @param callback Function to be called synchronously when a stalked
    *                 thread is about to call the function at `address`.
    */
  def addCallProbe(address: NativePointerValue, callback: StalkerCallProbeCallback): StalkerCallProbeId = js.native
  /**
    * Flushes out any buffered events. Useful when you don't want to wait
    * until the next `queueDrainInterval` tick.
    */
  def flush(): Unit = js.native
  /**
    * Starts following the execution of a given thread.
    *
    * @param threadId Thread ID to start following the execution of, or the
    *                 current thread if omitted.
    * @param options Options to customize the instrumentation.
    */
  def follow(): Unit = js.native
  def follow(threadId: ThreadId): Unit = js.native
  def follow(threadId: ThreadId, options: StalkerOptions): Unit = js.native
  /**
    * Frees accumulated memory at a safe point after `unfollow()`. This is
    * needed to avoid race-conditions where the thread just unfollowed is
    * executing its last instructions.
    */
  def garbageCollect(): Unit = js.native
  /**
    * Parses a binary blob comprised of `Gum.Event` values.
    *
    * @param events Binary blob containing zero or more `Gum.Event` values.
    * @param options Options for customizing the output.
    */
  def parse(events: ArrayBuffer): js.Array[StalkerEventBare | StalkerEventFull] = js.native
  def parse(events: ArrayBuffer, options: StalkerParseOptions): js.Array[StalkerEventBare | StalkerEventFull] = js.native
  /**
    * Removes a call probe added by `addCallProbe()`.
    *
    * @param callbackId ID of probe to remove.
    */
  def removeCallProbe(callbackId: StalkerCallProbeId): Unit = js.native
  /**
    * Stops following the execution of a given thread.
    *
    * @param threadId Thread ID to stop following the execution of, or the
    *                 current thread if omitted.
    */
  def unfollow(): Unit = js.native
  def unfollow(threadId: ThreadId): Unit = js.native
}

