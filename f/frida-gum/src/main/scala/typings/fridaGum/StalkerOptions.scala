package typings.fridaGum

import typings.fridaGum.anon.Block
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
@js.native
trait StalkerOptions extends js.Object {
  /**
    * User data to be passed to `StalkerNativeTransformCallback`.
    */
  var data: js.UndefOr[NativePointerValue] = js.native
  /**
    * Which events, if any, should be generated and periodically delivered to
    * `onReceive()` and/or `onCallSummary()`.
    */
  var events: js.UndefOr[Block] = js.native
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
  var onCallSummary: js.UndefOr[js.Function1[/* summary */ StalkerCallSummary, Unit]] = js.native
  /**
    * Callback that periodically receives batches of events.
    *
    * @param events Binary blob comprised of one or more `Gum.Event` structs.
    *               See `gumevent.h` for details about the format.
    *               Use `Stalker.parse()` to examine the data.
    */
  var onReceive: js.UndefOr[js.Function1[/* events */ ArrayBuffer, Unit]] = js.native
  /**
    * Callback that transforms each basic block compiled whenever Stalker
    * wants to recompile a basic block of the code that's about to be executed
    * by the stalked thread.
    */
  var transform: js.UndefOr[StalkerTransformCallback] = js.native
}

object StalkerOptions {
  @scala.inline
  def apply(): StalkerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StalkerOptions]
  }
  @scala.inline
  implicit class StalkerOptionsOps[Self <: StalkerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setData(value: NativePointerValue): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setEvents(value: Block): Self = this.set("events", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEvents: Self = this.set("events", js.undefined)
    @scala.inline
    def setOnCallSummary(value: /* summary */ StalkerCallSummary => Unit): Self = this.set("onCallSummary", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnCallSummary: Self = this.set("onCallSummary", js.undefined)
    @scala.inline
    def setOnReceive(value: /* events */ ArrayBuffer => Unit): Self = this.set("onReceive", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnReceive: Self = this.set("onReceive", js.undefined)
    @scala.inline
    def setTransformFunction1(
      value: (/* iterator */ StalkerArm64Iterator) | StalkerArmIterator | StalkerThumbIterator | (/* iterator */ StalkerX86Iterator) => Unit
    ): Self = this.set("transform", js.Any.fromFunction1(value))
    @scala.inline
    def setTransform(value: StalkerTransformCallback): Self = this.set("transform", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransform: Self = this.set("transform", js.undefined)
  }
  
}

