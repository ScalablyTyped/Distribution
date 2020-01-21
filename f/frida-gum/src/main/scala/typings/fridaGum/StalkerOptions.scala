package typings.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options to customize Stalker's instrumentation.
  *
  * Note that the callbacks provided have a significant impact on performance.
  * If you only need periodic call summaries but do not care about the raw
  * events, or the other way around, make sure you omit the callback that you
  * don't need; i.e. avoid putting your logic in `onCallSummary` and leaving
  * `onReceive` in there as an empty callback.
  */
trait StalkerOptions extends js.Object {
  /**
    * User data to be passed to `StalkerNativeTransformCallback`.
    */
  var data: js.UndefOr[NativePointerValue] = js.undefined
  /**
    * Which events, if any, should be generated and periodically delivered to
    * `onReceive()` and/or `onCallSummary()`.
    */
  var events: js.UndefOr[AnonBlock] = js.undefined
  /**
    * Callback that periodically receives a summary of `call` events that
    * happened in each time window.
    *
    * You would typically implement this instead of `onReceive()` for
    * efficiency, i.e. when you only want to know which targets were called
    * and how many times, but don't care about the order that the calls
    * happened in.
    *
    * @param summary Key-value mapping of call target to number of calls, in
    *                the current time window.
    */
  var onCallSummary: js.UndefOr[js.Function1[/* summary */ StalkerCallSummary, Unit]] = js.undefined
  /**
    * Callback that periodically receives batches of events.
    *
    * @param events Binary blob comprised of one or more `Gum.Event` structs.
    *               See `gumevent.h` for details about the format.
    *               Use `Stalker.parse()` to examine the data.
    */
  var onReceive: js.UndefOr[js.Function1[/* events */ ArrayBuffer, Unit]] = js.undefined
  /**
    * Callback that transforms each basic block compiled whenever Stalker
    * wants to recompile a basic block of the code that's about to be executed
    * by the stalked thread.
    */
  var transform: js.UndefOr[StalkerTransformCallback] = js.undefined
}

object StalkerOptions {
  @scala.inline
  def apply(
    data: NativePointerValue = null,
    events: AnonBlock = null,
    onCallSummary: /* summary */ StalkerCallSummary => Unit = null,
    onReceive: /* events */ ArrayBuffer => Unit = null,
    transform: StalkerTransformCallback = null
  ): StalkerOptions = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    if (onCallSummary != null) __obj.updateDynamic("onCallSummary")(js.Any.fromFunction1(onCallSummary))
    if (onReceive != null) __obj.updateDynamic("onReceive")(js.Any.fromFunction1(onReceive))
    if (transform != null) __obj.updateDynamic("transform")(transform.asInstanceOf[js.Any])
    __obj.asInstanceOf[StalkerOptions]
  }
}

