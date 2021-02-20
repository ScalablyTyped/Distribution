package typings.fridaGum

import typings.fridaGum.anon.Block
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
trait StalkerOptions extends StObject {
  
  /**
    * User data to be passed to `StalkerNativeEventCallback` and `StalkerNativeTransformCallback`.
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
    * C callback that processes events as they occur, allowing synchronous
    * processing of events in native code – typically implemented using
    * CModule.
    *
    * This is useful when wanting to implement custom filtering and/or queuing
    * logic to improve performance, or sacrifice performance in exchange for
    * reliable event delivery.
    *
    * Note that this precludes usage of `onReceive()` and `onCallSummary()`.
    */
  var onEvent: js.UndefOr[StalkerNativeEventCallback] = js.native
  
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
  implicit class StalkerOptionsMutableBuilder[Self <: StalkerOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: NativePointerValue): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setEvents(value: Block): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
    
    @scala.inline
    def setOnCallSummary(value: /* summary */ StalkerCallSummary => Unit): Self = StObject.set(x, "onCallSummary", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnCallSummaryUndefined: Self = StObject.set(x, "onCallSummary", js.undefined)
    
    @scala.inline
    def setOnEvent(value: StalkerNativeEventCallback): Self = StObject.set(x, "onEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnEventUndefined: Self = StObject.set(x, "onEvent", js.undefined)
    
    @scala.inline
    def setOnReceive(value: /* events */ ArrayBuffer => Unit): Self = StObject.set(x, "onReceive", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnReceiveUndefined: Self = StObject.set(x, "onReceive", js.undefined)
    
    @scala.inline
    def setTransform(value: StalkerTransformCallback): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransformFunction1(
      value: (/* iterator */ StalkerArm64Iterator) | StalkerArmIterator | StalkerThumbIterator | (/* iterator */ StalkerX86Iterator) => Unit
    ): Self = StObject.set(x, "transform", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
  }
}
