package typings.eventTargetShim

import typings.eventTargetShim.mod.EventTarget.EventDefinition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Pick<event-target-shim.event-target-shim.Event, event-target-shim.event-target-shim.EventTarget.OmittableEventKeys>> */
trait PartialPickEventOmittable[TEvents /* <: EventDefinition */] extends js.Object {
  var AT_TARGET: js.UndefOr[Double] = js.undefined
  var BUBBLING_PHASE: js.UndefOr[Double] = js.undefined
  var CAPTURING_PHASE: js.UndefOr[Double] = js.undefined
  var NONE: js.UndefOr[Double] = js.undefined
  var bubbles: js.UndefOr[Boolean] = js.undefined
  var cancelBubble: js.UndefOr[Boolean] = js.undefined
  var cancelable: js.UndefOr[Boolean] = js.undefined
  var composed: js.UndefOr[Boolean] = js.undefined
  var composedPath: js.UndefOr[js.Function0[js.Array[EventTargetstandardAddEventListener[TEvents]]]] = js.undefined
  var currentTarget: js.UndefOr[EventTargetstandardAddEventListener[TEvents]] = js.undefined
  var defaultPrevented: js.UndefOr[Boolean] = js.undefined
  var eventPhase: js.UndefOr[Double] = js.undefined
  var initEvent: js.UndefOr[
    js.Function3[
      /* type */ String, 
      /* bubbles */ js.UndefOr[Boolean], 
      /* cancelable */ js.UndefOr[Boolean], 
      Unit
    ]
  ] = js.undefined
  var isTrusted: js.UndefOr[Boolean] = js.undefined
  var preventDefault: js.UndefOr[js.Function0[Unit]] = js.undefined
  var returnValue: js.UndefOr[Boolean] = js.undefined
  var srcElement: js.UndefOr[js.Any] = js.undefined
  var stopImmediatePropagation: js.UndefOr[js.Function0[Unit]] = js.undefined
  var stopPropagation: js.UndefOr[js.Function0[Unit]] = js.undefined
  var target: js.UndefOr[EventTargetstandardAddEventListener[TEvents]] = js.undefined
  var timeStamp: js.UndefOr[Double] = js.undefined
}

object PartialPickEventOmittable {
  @scala.inline
  def apply[TEvents /* <: EventDefinition */](
    AT_TARGET: Int | Double = null,
    BUBBLING_PHASE: Int | Double = null,
    CAPTURING_PHASE: Int | Double = null,
    NONE: Int | Double = null,
    bubbles: js.UndefOr[Boolean] = js.undefined,
    cancelBubble: js.UndefOr[Boolean] = js.undefined,
    cancelable: js.UndefOr[Boolean] = js.undefined,
    composed: js.UndefOr[Boolean] = js.undefined,
    composedPath: () => js.Array[EventTargetstandardAddEventListener[TEvents]] = null,
    currentTarget: EventTargetstandardAddEventListener[TEvents] = null,
    defaultPrevented: js.UndefOr[Boolean] = js.undefined,
    eventPhase: Int | Double = null,
    initEvent: (/* type */ String, /* bubbles */ js.UndefOr[Boolean], /* cancelable */ js.UndefOr[Boolean]) => Unit = null,
    isTrusted: js.UndefOr[Boolean] = js.undefined,
    preventDefault: () => Unit = null,
    returnValue: js.UndefOr[Boolean] = js.undefined,
    srcElement: js.Any = null,
    stopImmediatePropagation: () => Unit = null,
    stopPropagation: () => Unit = null,
    target: EventTargetstandardAddEventListener[TEvents] = null,
    timeStamp: Int | Double = null
  ): PartialPickEventOmittable[TEvents] = {
    val __obj = js.Dynamic.literal()
    if (AT_TARGET != null) __obj.updateDynamic("AT_TARGET")(AT_TARGET.asInstanceOf[js.Any])
    if (BUBBLING_PHASE != null) __obj.updateDynamic("BUBBLING_PHASE")(BUBBLING_PHASE.asInstanceOf[js.Any])
    if (CAPTURING_PHASE != null) __obj.updateDynamic("CAPTURING_PHASE")(CAPTURING_PHASE.asInstanceOf[js.Any])
    if (NONE != null) __obj.updateDynamic("NONE")(NONE.asInstanceOf[js.Any])
    if (!js.isUndefined(bubbles)) __obj.updateDynamic("bubbles")(bubbles.asInstanceOf[js.Any])
    if (!js.isUndefined(cancelBubble)) __obj.updateDynamic("cancelBubble")(cancelBubble.asInstanceOf[js.Any])
    if (!js.isUndefined(cancelable)) __obj.updateDynamic("cancelable")(cancelable.asInstanceOf[js.Any])
    if (!js.isUndefined(composed)) __obj.updateDynamic("composed")(composed.asInstanceOf[js.Any])
    if (composedPath != null) __obj.updateDynamic("composedPath")(js.Any.fromFunction0(composedPath))
    if (currentTarget != null) __obj.updateDynamic("currentTarget")(currentTarget.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultPrevented)) __obj.updateDynamic("defaultPrevented")(defaultPrevented.asInstanceOf[js.Any])
    if (eventPhase != null) __obj.updateDynamic("eventPhase")(eventPhase.asInstanceOf[js.Any])
    if (initEvent != null) __obj.updateDynamic("initEvent")(js.Any.fromFunction3(initEvent))
    if (!js.isUndefined(isTrusted)) __obj.updateDynamic("isTrusted")(isTrusted.asInstanceOf[js.Any])
    if (preventDefault != null) __obj.updateDynamic("preventDefault")(js.Any.fromFunction0(preventDefault))
    if (!js.isUndefined(returnValue)) __obj.updateDynamic("returnValue")(returnValue.asInstanceOf[js.Any])
    if (srcElement != null) __obj.updateDynamic("srcElement")(srcElement.asInstanceOf[js.Any])
    if (stopImmediatePropagation != null) __obj.updateDynamic("stopImmediatePropagation")(js.Any.fromFunction0(stopImmediatePropagation))
    if (stopPropagation != null) __obj.updateDynamic("stopPropagation")(js.Any.fromFunction0(stopPropagation))
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (timeStamp != null) __obj.updateDynamic("timeStamp")(timeStamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialPickEventOmittable[TEvents]]
  }
}

