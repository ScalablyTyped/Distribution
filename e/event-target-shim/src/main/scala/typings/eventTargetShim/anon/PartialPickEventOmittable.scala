package typings.eventTargetShim.anon

import typings.eventTargetShim.mod.EventTarget.EventDefinition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<std.Pick<event-target-shim.event-target-shim.Event, event-target-shim.event-target-shim.EventTarget.OmittableEventKeys>> */
@js.native
trait PartialPickEventOmittable[TEvents /* <: EventDefinition */] extends js.Object {
  
  var AT_TARGET: js.UndefOr[Double] = js.native
  
  var BUBBLING_PHASE: js.UndefOr[Double] = js.native
  
  var CAPTURING_PHASE: js.UndefOr[Double] = js.native
  
  var NONE: js.UndefOr[Double] = js.native
  
  var bubbles: js.UndefOr[Boolean] = js.native
  
  var cancelBubble: js.UndefOr[Boolean] = js.native
  
  var cancelable: js.UndefOr[Boolean] = js.native
  
  var composed: js.UndefOr[Boolean] = js.native
  
  var composedPath: js.UndefOr[js.Function0[js.Array[EventTargetstandardAddEventListener[TEvents]]]] = js.native
  
  var currentTarget: js.UndefOr[EventTargetstandardAddEventListener[TEvents] | Null] = js.native
  
  var defaultPrevented: js.UndefOr[Boolean] = js.native
  
  var eventPhase: js.UndefOr[Double] = js.native
  
  var initEvent: js.UndefOr[
    js.Function3[
      /* type */ String, 
      /* bubbles */ js.UndefOr[Boolean], 
      /* cancelable */ js.UndefOr[Boolean], 
      Unit
    ]
  ] = js.native
  
  var isTrusted: js.UndefOr[Boolean] = js.native
  
  var preventDefault: js.UndefOr[js.Function0[Unit]] = js.native
  
  var returnValue: js.UndefOr[Boolean] = js.native
  
  var srcElement: js.UndefOr[js.Any | Null] = js.native
  
  var stopImmediatePropagation: js.UndefOr[js.Function0[Unit]] = js.native
  
  var stopPropagation: js.UndefOr[js.Function0[Unit]] = js.native
  
  var target: js.UndefOr[EventTargetstandardAddEventListener[TEvents] | Null] = js.native
  
  var timeStamp: js.UndefOr[Double] = js.native
}
object PartialPickEventOmittable {
  
  @scala.inline
  def apply[TEvents /* <: EventDefinition */](): PartialPickEventOmittable[TEvents] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPickEventOmittable[TEvents]]
  }
  
  @scala.inline
  implicit class PartialPickEventOmittableOps[Self <: PartialPickEventOmittable[_], TEvents /* <: EventDefinition */] (val x: Self with PartialPickEventOmittable[TEvents]) extends AnyVal {
    
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
    def setAT_TARGET(value: Double): Self = this.set("AT_TARGET", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAT_TARGET: Self = this.set("AT_TARGET", js.undefined)
    
    @scala.inline
    def setBUBBLING_PHASE(value: Double): Self = this.set("BUBBLING_PHASE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBUBBLING_PHASE: Self = this.set("BUBBLING_PHASE", js.undefined)
    
    @scala.inline
    def setCAPTURING_PHASE(value: Double): Self = this.set("CAPTURING_PHASE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCAPTURING_PHASE: Self = this.set("CAPTURING_PHASE", js.undefined)
    
    @scala.inline
    def setNONE(value: Double): Self = this.set("NONE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNONE: Self = this.set("NONE", js.undefined)
    
    @scala.inline
    def setBubbles(value: Boolean): Self = this.set("bubbles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBubbles: Self = this.set("bubbles", js.undefined)
    
    @scala.inline
    def setCancelBubble(value: Boolean): Self = this.set("cancelBubble", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCancelBubble: Self = this.set("cancelBubble", js.undefined)
    
    @scala.inline
    def setCancelable(value: Boolean): Self = this.set("cancelable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCancelable: Self = this.set("cancelable", js.undefined)
    
    @scala.inline
    def setComposed(value: Boolean): Self = this.set("composed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComposed: Self = this.set("composed", js.undefined)
    
    @scala.inline
    def setComposedPath(value: () => js.Array[EventTargetstandardAddEventListener[TEvents]]): Self = this.set("composedPath", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteComposedPath: Self = this.set("composedPath", js.undefined)
    
    @scala.inline
    def setCurrentTarget(value: EventTargetstandardAddEventListener[TEvents]): Self = this.set("currentTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrentTarget: Self = this.set("currentTarget", js.undefined)
    
    @scala.inline
    def setCurrentTargetNull: Self = this.set("currentTarget", null)
    
    @scala.inline
    def setDefaultPrevented(value: Boolean): Self = this.set("defaultPrevented", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultPrevented: Self = this.set("defaultPrevented", js.undefined)
    
    @scala.inline
    def setEventPhase(value: Double): Self = this.set("eventPhase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventPhase: Self = this.set("eventPhase", js.undefined)
    
    @scala.inline
    def setInitEvent(
      value: (/* type */ String, /* bubbles */ js.UndefOr[Boolean], /* cancelable */ js.UndefOr[Boolean]) => Unit
    ): Self = this.set("initEvent", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteInitEvent: Self = this.set("initEvent", js.undefined)
    
    @scala.inline
    def setIsTrusted(value: Boolean): Self = this.set("isTrusted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsTrusted: Self = this.set("isTrusted", js.undefined)
    
    @scala.inline
    def setPreventDefault(value: () => Unit): Self = this.set("preventDefault", js.Any.fromFunction0(value))
    
    @scala.inline
    def deletePreventDefault: Self = this.set("preventDefault", js.undefined)
    
    @scala.inline
    def setReturnValue(value: Boolean): Self = this.set("returnValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReturnValue: Self = this.set("returnValue", js.undefined)
    
    @scala.inline
    def setSrcElement(value: js.Any): Self = this.set("srcElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSrcElement: Self = this.set("srcElement", js.undefined)
    
    @scala.inline
    def setSrcElementNull: Self = this.set("srcElement", null)
    
    @scala.inline
    def setStopImmediatePropagation(value: () => Unit): Self = this.set("stopImmediatePropagation", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteStopImmediatePropagation: Self = this.set("stopImmediatePropagation", js.undefined)
    
    @scala.inline
    def setStopPropagation(value: () => Unit): Self = this.set("stopPropagation", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteStopPropagation: Self = this.set("stopPropagation", js.undefined)
    
    @scala.inline
    def setTarget(value: EventTargetstandardAddEventListener[TEvents]): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
    
    @scala.inline
    def setTargetNull: Self = this.set("target", null)
    
    @scala.inline
    def setTimeStamp(value: Double): Self = this.set("timeStamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeStamp: Self = this.set("timeStamp", js.undefined)
  }
}
