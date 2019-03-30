package typings
package downshiftLib.downshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Environment extends js.Object {
  @JSName("addEventListener")
  var addEventListener_Original: downshiftLib.Anon_Abort = js.native
  var document: stdLib.Document = js.native
  @JSName("removeEventListener")
  var removeEventListener_Original: downshiftLib.Anon_AbortAfterprint = js.native
  def addEventListener(`type`: java.lang.String): scala.Unit = js.native
  def addEventListener(`type`: java.lang.String, listener: scala.Null, options: scala.Boolean): scala.Unit = js.native
  def addEventListener(`type`: java.lang.String, listener: scala.Null, options: stdLib.AddEventListenerOptions): scala.Unit = js.native
  def addEventListener(`type`: java.lang.String, listener: stdLib.EventListenerOrEventListenerObject): scala.Unit = js.native
  def addEventListener(
    `type`: java.lang.String,
    listener: stdLib.EventListenerOrEventListenerObject,
    options: scala.Boolean
  ): scala.Unit = js.native
  def addEventListener(
    `type`: java.lang.String,
    listener: stdLib.EventListenerOrEventListenerObject,
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSGestureChange(
    `type`: downshiftLib.downshiftLibStrings.MSGestureChange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSGestureChange(
    `type`: downshiftLib.downshiftLibStrings.MSGestureChange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSGestureChange(
    `type`: downshiftLib.downshiftLibStrings.MSGestureChange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSGestureDoubleTap(
    `type`: downshiftLib.downshiftLibStrings.MSGestureDoubleTap,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSGestureDoubleTap(
    `type`: downshiftLib.downshiftLibStrings.MSGestureDoubleTap,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSGestureDoubleTap(
    `type`: downshiftLib.downshiftLibStrings.MSGestureDoubleTap,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSGestureEnd(
    `type`: downshiftLib.downshiftLibStrings.MSGestureEnd,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSGestureEnd(
    `type`: downshiftLib.downshiftLibStrings.MSGestureEnd,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSGestureEnd(
    `type`: downshiftLib.downshiftLibStrings.MSGestureEnd,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSGestureHold(
    `type`: downshiftLib.downshiftLibStrings.MSGestureHold,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSGestureHold(
    `type`: downshiftLib.downshiftLibStrings.MSGestureHold,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSGestureHold(
    `type`: downshiftLib.downshiftLibStrings.MSGestureHold,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSGestureStart(
    `type`: downshiftLib.downshiftLibStrings.MSGestureStart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSGestureStart(
    `type`: downshiftLib.downshiftLibStrings.MSGestureStart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSGestureStart(
    `type`: downshiftLib.downshiftLibStrings.MSGestureStart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSGestureTap(
    `type`: downshiftLib.downshiftLibStrings.MSGestureTap,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSGestureTap(
    `type`: downshiftLib.downshiftLibStrings.MSGestureTap,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSGestureTap(
    `type`: downshiftLib.downshiftLibStrings.MSGestureTap,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSInertiaStart(
    `type`: downshiftLib.downshiftLibStrings.MSInertiaStart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSInertiaStart(
    `type`: downshiftLib.downshiftLibStrings.MSInertiaStart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSInertiaStart(
    `type`: downshiftLib.downshiftLibStrings.MSInertiaStart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSPointerCancel(
    `type`: downshiftLib.downshiftLibStrings.MSPointerCancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSPointerCancel(
    `type`: downshiftLib.downshiftLibStrings.MSPointerCancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSPointerCancel(
    `type`: downshiftLib.downshiftLibStrings.MSPointerCancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSPointerDown(
    `type`: downshiftLib.downshiftLibStrings.MSPointerDown,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSPointerDown(
    `type`: downshiftLib.downshiftLibStrings.MSPointerDown,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSPointerDown(
    `type`: downshiftLib.downshiftLibStrings.MSPointerDown,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSPointerEnter(
    `type`: downshiftLib.downshiftLibStrings.MSPointerEnter,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSPointerEnter(
    `type`: downshiftLib.downshiftLibStrings.MSPointerEnter,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSPointerEnter(
    `type`: downshiftLib.downshiftLibStrings.MSPointerEnter,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSPointerLeave(
    `type`: downshiftLib.downshiftLibStrings.MSPointerLeave,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSPointerLeave(
    `type`: downshiftLib.downshiftLibStrings.MSPointerLeave,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSPointerLeave(
    `type`: downshiftLib.downshiftLibStrings.MSPointerLeave,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSPointerMove(
    `type`: downshiftLib.downshiftLibStrings.MSPointerMove,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSPointerMove(
    `type`: downshiftLib.downshiftLibStrings.MSPointerMove,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSPointerMove(
    `type`: downshiftLib.downshiftLibStrings.MSPointerMove,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSPointerOut(
    `type`: downshiftLib.downshiftLibStrings.MSPointerOut,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSPointerOut(
    `type`: downshiftLib.downshiftLibStrings.MSPointerOut,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSPointerOut(
    `type`: downshiftLib.downshiftLibStrings.MSPointerOut,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSPointerOver(
    `type`: downshiftLib.downshiftLibStrings.MSPointerOver,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSPointerOver(
    `type`: downshiftLib.downshiftLibStrings.MSPointerOver,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSPointerOver(
    `type`: downshiftLib.downshiftLibStrings.MSPointerOver,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSPointerUp(
    `type`: downshiftLib.downshiftLibStrings.MSPointerUp,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSPointerUp(
    `type`: downshiftLib.downshiftLibStrings.MSPointerUp,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSPointerUp(
    `type`: downshiftLib.downshiftLibStrings.MSPointerUp,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_abort(
    `type`: downshiftLib.downshiftLibStrings.abort,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.UIEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_abort(
    `type`: downshiftLib.downshiftLibStrings.abort,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.UIEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_abort(
    `type`: downshiftLib.downshiftLibStrings.abort,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.UIEvent, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_afterprint(
    `type`: downshiftLib.downshiftLibStrings.afterprint,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_afterprint(
    `type`: downshiftLib.downshiftLibStrings.afterprint,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_afterprint(
    `type`: downshiftLib.downshiftLibStrings.afterprint,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationcancel(
    `type`: downshiftLib.downshiftLibStrings.animationcancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.AnimationEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationcancel(
    `type`: downshiftLib.downshiftLibStrings.animationcancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.AnimationEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationcancel(
    `type`: downshiftLib.downshiftLibStrings.animationcancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.AnimationEvent, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationend(
    `type`: downshiftLib.downshiftLibStrings.animationend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.AnimationEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationend(
    `type`: downshiftLib.downshiftLibStrings.animationend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.AnimationEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationend(
    `type`: downshiftLib.downshiftLibStrings.animationend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.AnimationEvent, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationiteration(
    `type`: downshiftLib.downshiftLibStrings.animationiteration,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.AnimationEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationiteration(
    `type`: downshiftLib.downshiftLibStrings.animationiteration,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.AnimationEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationiteration(
    `type`: downshiftLib.downshiftLibStrings.animationiteration,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.AnimationEvent, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationstart(
    `type`: downshiftLib.downshiftLibStrings.animationstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.AnimationEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationstart(
    `type`: downshiftLib.downshiftLibStrings.animationstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.AnimationEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationstart(
    `type`: downshiftLib.downshiftLibStrings.animationstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.AnimationEvent, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_auxclick(
    `type`: downshiftLib.downshiftLibStrings.auxclick,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_auxclick(
    `type`: downshiftLib.downshiftLibStrings.auxclick,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_auxclick(
    `type`: downshiftLib.downshiftLibStrings.auxclick,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_beforeprint(
    `type`: downshiftLib.downshiftLibStrings.beforeprint,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_beforeprint(
    `type`: downshiftLib.downshiftLibStrings.beforeprint,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_beforeprint(
    `type`: downshiftLib.downshiftLibStrings.beforeprint,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_beforeunload(
    `type`: downshiftLib.downshiftLibStrings.beforeunload,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.BeforeUnloadEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_beforeunload(
    `type`: downshiftLib.downshiftLibStrings.beforeunload,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.BeforeUnloadEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_beforeunload(
    `type`: downshiftLib.downshiftLibStrings.beforeunload,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.BeforeUnloadEvent, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_blur(
    `type`: downshiftLib.downshiftLibStrings.blur,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.FocusEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_blur(
    `type`: downshiftLib.downshiftLibStrings.blur,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.FocusEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_blur(
    `type`: downshiftLib.downshiftLibStrings.blur,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.FocusEvent, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cancel(
    `type`: downshiftLib.downshiftLibStrings.cancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cancel(
    `type`: downshiftLib.downshiftLibStrings.cancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cancel(
    `type`: downshiftLib.downshiftLibStrings.cancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_canplay(
    `type`: downshiftLib.downshiftLibStrings.canplay,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_canplay(
    `type`: downshiftLib.downshiftLibStrings.canplay,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_canplay(
    `type`: downshiftLib.downshiftLibStrings.canplay,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_canplaythrough(
    `type`: downshiftLib.downshiftLibStrings.canplaythrough,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_canplaythrough(
    `type`: downshiftLib.downshiftLibStrings.canplaythrough,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_canplaythrough(
    `type`: downshiftLib.downshiftLibStrings.canplaythrough,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_change(
    `type`: downshiftLib.downshiftLibStrings.change,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_change(
    `type`: downshiftLib.downshiftLibStrings.change,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_change(
    `type`: downshiftLib.downshiftLibStrings.change,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_click(
    `type`: downshiftLib.downshiftLibStrings.click,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.MouseEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_click(
    `type`: downshiftLib.downshiftLibStrings.click,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.MouseEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_click(
    `type`: downshiftLib.downshiftLibStrings.click,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.MouseEvent, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_close(
    `type`: downshiftLib.downshiftLibStrings.close,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_close(
    `type`: downshiftLib.downshiftLibStrings.close,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_close(
    `type`: downshiftLib.downshiftLibStrings.close,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_compassneedscalibration(
    `type`: downshiftLib.downshiftLibStrings.compassneedscalibration,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_compassneedscalibration(
    `type`: downshiftLib.downshiftLibStrings.compassneedscalibration,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_compassneedscalibration(
    `type`: downshiftLib.downshiftLibStrings.compassneedscalibration,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_contextmenu(
    `type`: downshiftLib.downshiftLibStrings.contextmenu,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.MouseEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_contextmenu(
    `type`: downshiftLib.downshiftLibStrings.contextmenu,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.MouseEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_contextmenu(
    `type`: downshiftLib.downshiftLibStrings.contextmenu,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.MouseEvent, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cuechange(
    `type`: downshiftLib.downshiftLibStrings.cuechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cuechange(
    `type`: downshiftLib.downshiftLibStrings.cuechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cuechange(
    `type`: downshiftLib.downshiftLibStrings.cuechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dblclick(
    `type`: downshiftLib.downshiftLibStrings.dblclick,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.MouseEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dblclick(
    `type`: downshiftLib.downshiftLibStrings.dblclick,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.MouseEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dblclick(
    `type`: downshiftLib.downshiftLibStrings.dblclick,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.MouseEvent, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_devicelight(
    `type`: downshiftLib.downshiftLibStrings.devicelight,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.DeviceLightEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_devicelight(
    `type`: downshiftLib.downshiftLibStrings.devicelight,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.DeviceLightEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_devicelight(
    `type`: downshiftLib.downshiftLibStrings.devicelight,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.DeviceLightEvent, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_devicemotion(
    `type`: downshiftLib.downshiftLibStrings.devicemotion,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.DeviceMotionEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_devicemotion(
    `type`: downshiftLib.downshiftLibStrings.devicemotion,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.DeviceMotionEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_devicemotion(
    `type`: downshiftLib.downshiftLibStrings.devicemotion,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.DeviceMotionEvent, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_deviceorientation(
    `type`: downshiftLib.downshiftLibStrings.deviceorientation,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.DeviceOrientationEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_deviceorientation(
    `type`: downshiftLib.downshiftLibStrings.deviceorientation,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.DeviceOrientationEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_deviceorientation(
    `type`: downshiftLib.downshiftLibStrings.deviceorientation,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.DeviceOrientationEvent, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_drag(
    `type`: downshiftLib.downshiftLibStrings.drag,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.DragEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_drag(
    `type`: downshiftLib.downshiftLibStrings.drag,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.DragEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_drag(
    `type`: downshiftLib.downshiftLibStrings.drag,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.DragEvent, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragend(
    `type`: downshiftLib.downshiftLibStrings.dragend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.DragEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragend(
    `type`: downshiftLib.downshiftLibStrings.dragend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.DragEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragend(
    `type`: downshiftLib.downshiftLibStrings.dragend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.DragEvent, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragenter(
    `type`: downshiftLib.downshiftLibStrings.dragenter,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.DragEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragenter(
    `type`: downshiftLib.downshiftLibStrings.dragenter,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.DragEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragenter(
    `type`: downshiftLib.downshiftLibStrings.dragenter,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.DragEvent, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragexit(
    `type`: downshiftLib.downshiftLibStrings.dragexit,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragexit(
    `type`: downshiftLib.downshiftLibStrings.dragexit,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragexit(
    `type`: downshiftLib.downshiftLibStrings.dragexit,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragleave(
    `type`: downshiftLib.downshiftLibStrings.dragleave,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.DragEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragleave(
    `type`: downshiftLib.downshiftLibStrings.dragleave,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.DragEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragleave(
    `type`: downshiftLib.downshiftLibStrings.dragleave,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.DragEvent, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragover(
    `type`: downshiftLib.downshiftLibStrings.dragover,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.DragEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragover(
    `type`: downshiftLib.downshiftLibStrings.dragover,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.DragEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragover(
    `type`: downshiftLib.downshiftLibStrings.dragover,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.DragEvent, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragstart(
    `type`: downshiftLib.downshiftLibStrings.dragstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.DragEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragstart(
    `type`: downshiftLib.downshiftLibStrings.dragstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.DragEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragstart(
    `type`: downshiftLib.downshiftLibStrings.dragstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.DragEvent, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_drop(
    `type`: downshiftLib.downshiftLibStrings.drop,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.DragEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_drop(
    `type`: downshiftLib.downshiftLibStrings.drop,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.DragEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_drop(
    `type`: downshiftLib.downshiftLibStrings.drop,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.DragEvent, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_durationchange(
    `type`: downshiftLib.downshiftLibStrings.durationchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_durationchange(
    `type`: downshiftLib.downshiftLibStrings.durationchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_durationchange(
    `type`: downshiftLib.downshiftLibStrings.durationchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_emptied(
    `type`: downshiftLib.downshiftLibStrings.emptied,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_emptied(
    `type`: downshiftLib.downshiftLibStrings.emptied,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_emptied(
    `type`: downshiftLib.downshiftLibStrings.emptied,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ended(
    `type`: downshiftLib.downshiftLibStrings.ended,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ended(
    `type`: downshiftLib.downshiftLibStrings.ended,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ended(
    `type`: downshiftLib.downshiftLibStrings.ended,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(
    `type`: downshiftLib.downshiftLibStrings.error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.ErrorEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(
    `type`: downshiftLib.downshiftLibStrings.error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.ErrorEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(
    `type`: downshiftLib.downshiftLibStrings.error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.ErrorEvent, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_focus(
    `type`: downshiftLib.downshiftLibStrings.focus,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.FocusEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_focus(
    `type`: downshiftLib.downshiftLibStrings.focus,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.FocusEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_focus(
    `type`: downshiftLib.downshiftLibStrings.focus,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.FocusEvent, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_gotpointercapture(
    `type`: downshiftLib.downshiftLibStrings.gotpointercapture,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.PointerEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_gotpointercapture(
    `type`: downshiftLib.downshiftLibStrings.gotpointercapture,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.PointerEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_gotpointercapture(
    `type`: downshiftLib.downshiftLibStrings.gotpointercapture,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.PointerEvent, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_hashchange(
    `type`: downshiftLib.downshiftLibStrings.hashchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.HashChangeEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_hashchange(
    `type`: downshiftLib.downshiftLibStrings.hashchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.HashChangeEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_hashchange(
    `type`: downshiftLib.downshiftLibStrings.hashchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.HashChangeEvent, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_input(
    `type`: downshiftLib.downshiftLibStrings.input,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_input(
    `type`: downshiftLib.downshiftLibStrings.input,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_input(
    `type`: downshiftLib.downshiftLibStrings.input,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_invalid(
    `type`: downshiftLib.downshiftLibStrings.invalid,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_invalid(
    `type`: downshiftLib.downshiftLibStrings.invalid,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_invalid(
    `type`: downshiftLib.downshiftLibStrings.invalid,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_keydown(
    `type`: downshiftLib.downshiftLibStrings.keydown,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.KeyboardEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_keydown(
    `type`: downshiftLib.downshiftLibStrings.keydown,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.KeyboardEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_keydown(
    `type`: downshiftLib.downshiftLibStrings.keydown,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.KeyboardEvent, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_keypress(
    `type`: downshiftLib.downshiftLibStrings.keypress,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.KeyboardEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_keypress(
    `type`: downshiftLib.downshiftLibStrings.keypress,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.KeyboardEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_keypress(
    `type`: downshiftLib.downshiftLibStrings.keypress,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.KeyboardEvent, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_keyup(
    `type`: downshiftLib.downshiftLibStrings.keyup,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.KeyboardEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_keyup(
    `type`: downshiftLib.downshiftLibStrings.keyup,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.KeyboardEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_keyup(
    `type`: downshiftLib.downshiftLibStrings.keyup,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.KeyboardEvent, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_languagechange(
    `type`: downshiftLib.downshiftLibStrings.languagechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_languagechange(
    `type`: downshiftLib.downshiftLibStrings.languagechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_languagechange(
    `type`: downshiftLib.downshiftLibStrings.languagechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_load(
    `type`: downshiftLib.downshiftLibStrings.load,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_load(
    `type`: downshiftLib.downshiftLibStrings.load,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_load(
    `type`: downshiftLib.downshiftLibStrings.load,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadeddata(
    `type`: downshiftLib.downshiftLibStrings.loadeddata,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadeddata(
    `type`: downshiftLib.downshiftLibStrings.loadeddata,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadeddata(
    `type`: downshiftLib.downshiftLibStrings.loadeddata,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadedmetadata(
    `type`: downshiftLib.downshiftLibStrings.loadedmetadata,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadedmetadata(
    `type`: downshiftLib.downshiftLibStrings.loadedmetadata,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadedmetadata(
    `type`: downshiftLib.downshiftLibStrings.loadedmetadata,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadend(
    `type`: downshiftLib.downshiftLibStrings.loadend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.ProgressEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadend(
    `type`: downshiftLib.downshiftLibStrings.loadend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.ProgressEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadend(
    `type`: downshiftLib.downshiftLibStrings.loadend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.ProgressEvent, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadstart(
    `type`: downshiftLib.downshiftLibStrings.loadstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadstart(
    `type`: downshiftLib.downshiftLibStrings.loadstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadstart(
    `type`: downshiftLib.downshiftLibStrings.loadstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_lostpointercapture(
    `type`: downshiftLib.downshiftLibStrings.lostpointercapture,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.PointerEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_lostpointercapture(
    `type`: downshiftLib.downshiftLibStrings.lostpointercapture,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.PointerEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_lostpointercapture(
    `type`: downshiftLib.downshiftLibStrings.lostpointercapture,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.PointerEvent, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_message(
    `type`: downshiftLib.downshiftLibStrings.message,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.MessageEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_message(
    `type`: downshiftLib.downshiftLibStrings.message,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.MessageEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_message(
    `type`: downshiftLib.downshiftLibStrings.message,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.MessageEvent, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_messageerror(
    `type`: downshiftLib.downshiftLibStrings.messageerror,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.MessageEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_messageerror(
    `type`: downshiftLib.downshiftLibStrings.messageerror,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.MessageEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_messageerror(
    `type`: downshiftLib.downshiftLibStrings.messageerror,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.MessageEvent, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mousedown(
    `type`: downshiftLib.downshiftLibStrings.mousedown,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.MouseEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mousedown(
    `type`: downshiftLib.downshiftLibStrings.mousedown,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.MouseEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mousedown(
    `type`: downshiftLib.downshiftLibStrings.mousedown,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.MouseEvent, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseenter(
    `type`: downshiftLib.downshiftLibStrings.mouseenter,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.MouseEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseenter(
    `type`: downshiftLib.downshiftLibStrings.mouseenter,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.MouseEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseenter(
    `type`: downshiftLib.downshiftLibStrings.mouseenter,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.MouseEvent, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseleave(
    `type`: downshiftLib.downshiftLibStrings.mouseleave,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.MouseEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseleave(
    `type`: downshiftLib.downshiftLibStrings.mouseleave,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.MouseEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseleave(
    `type`: downshiftLib.downshiftLibStrings.mouseleave,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.MouseEvent, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mousemove(
    `type`: downshiftLib.downshiftLibStrings.mousemove,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.MouseEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mousemove(
    `type`: downshiftLib.downshiftLibStrings.mousemove,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.MouseEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mousemove(
    `type`: downshiftLib.downshiftLibStrings.mousemove,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.MouseEvent, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseout(
    `type`: downshiftLib.downshiftLibStrings.mouseout,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.MouseEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseout(
    `type`: downshiftLib.downshiftLibStrings.mouseout,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.MouseEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseout(
    `type`: downshiftLib.downshiftLibStrings.mouseout,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.MouseEvent, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseover(
    `type`: downshiftLib.downshiftLibStrings.mouseover,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.MouseEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseover(
    `type`: downshiftLib.downshiftLibStrings.mouseover,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.MouseEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseover(
    `type`: downshiftLib.downshiftLibStrings.mouseover,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.MouseEvent, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseup(
    `type`: downshiftLib.downshiftLibStrings.mouseup,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.MouseEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseup(
    `type`: downshiftLib.downshiftLibStrings.mouseup,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.MouseEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseup(
    `type`: downshiftLib.downshiftLibStrings.mouseup,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.MouseEvent, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mousewheel(
    `type`: downshiftLib.downshiftLibStrings.mousewheel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mousewheel(
    `type`: downshiftLib.downshiftLibStrings.mousewheel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mousewheel(
    `type`: downshiftLib.downshiftLibStrings.mousewheel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_offline(
    `type`: downshiftLib.downshiftLibStrings.offline,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_offline(
    `type`: downshiftLib.downshiftLibStrings.offline,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_offline(
    `type`: downshiftLib.downshiftLibStrings.offline,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_online(
    `type`: downshiftLib.downshiftLibStrings.online,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_online(
    `type`: downshiftLib.downshiftLibStrings.online,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_online(
    `type`: downshiftLib.downshiftLibStrings.online,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_orientationchange(
    `type`: downshiftLib.downshiftLibStrings.orientationchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_orientationchange(
    `type`: downshiftLib.downshiftLibStrings.orientationchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_orientationchange(
    `type`: downshiftLib.downshiftLibStrings.orientationchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pagehide(
    `type`: downshiftLib.downshiftLibStrings.pagehide,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.PageTransitionEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pagehide(
    `type`: downshiftLib.downshiftLibStrings.pagehide,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.PageTransitionEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pagehide(
    `type`: downshiftLib.downshiftLibStrings.pagehide,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.PageTransitionEvent, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pageshow(
    `type`: downshiftLib.downshiftLibStrings.pageshow,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.PageTransitionEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pageshow(
    `type`: downshiftLib.downshiftLibStrings.pageshow,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.PageTransitionEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pageshow(
    `type`: downshiftLib.downshiftLibStrings.pageshow,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.PageTransitionEvent, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pause(
    `type`: downshiftLib.downshiftLibStrings.pause,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pause(
    `type`: downshiftLib.downshiftLibStrings.pause,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pause(
    `type`: downshiftLib.downshiftLibStrings.pause,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_play(
    `type`: downshiftLib.downshiftLibStrings.play,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_play(
    `type`: downshiftLib.downshiftLibStrings.play,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_play(
    `type`: downshiftLib.downshiftLibStrings.play,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_playing(
    `type`: downshiftLib.downshiftLibStrings.playing,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_playing(
    `type`: downshiftLib.downshiftLibStrings.playing,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_playing(
    `type`: downshiftLib.downshiftLibStrings.playing,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointercancel(
    `type`: downshiftLib.downshiftLibStrings.pointercancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.PointerEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointercancel(
    `type`: downshiftLib.downshiftLibStrings.pointercancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.PointerEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointercancel(
    `type`: downshiftLib.downshiftLibStrings.pointercancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.PointerEvent, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerdown(
    `type`: downshiftLib.downshiftLibStrings.pointerdown,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.PointerEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerdown(
    `type`: downshiftLib.downshiftLibStrings.pointerdown,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.PointerEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerdown(
    `type`: downshiftLib.downshiftLibStrings.pointerdown,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.PointerEvent, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerenter(
    `type`: downshiftLib.downshiftLibStrings.pointerenter,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.PointerEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerenter(
    `type`: downshiftLib.downshiftLibStrings.pointerenter,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.PointerEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerenter(
    `type`: downshiftLib.downshiftLibStrings.pointerenter,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.PointerEvent, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerleave(
    `type`: downshiftLib.downshiftLibStrings.pointerleave,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.PointerEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerleave(
    `type`: downshiftLib.downshiftLibStrings.pointerleave,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.PointerEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerleave(
    `type`: downshiftLib.downshiftLibStrings.pointerleave,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.PointerEvent, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointermove(
    `type`: downshiftLib.downshiftLibStrings.pointermove,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.PointerEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointermove(
    `type`: downshiftLib.downshiftLibStrings.pointermove,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.PointerEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointermove(
    `type`: downshiftLib.downshiftLibStrings.pointermove,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.PointerEvent, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerout(
    `type`: downshiftLib.downshiftLibStrings.pointerout,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.PointerEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerout(
    `type`: downshiftLib.downshiftLibStrings.pointerout,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.PointerEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerout(
    `type`: downshiftLib.downshiftLibStrings.pointerout,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.PointerEvent, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerover(
    `type`: downshiftLib.downshiftLibStrings.pointerover,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.PointerEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerover(
    `type`: downshiftLib.downshiftLibStrings.pointerover,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.PointerEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerover(
    `type`: downshiftLib.downshiftLibStrings.pointerover,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.PointerEvent, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerup(
    `type`: downshiftLib.downshiftLibStrings.pointerup,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.PointerEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerup(
    `type`: downshiftLib.downshiftLibStrings.pointerup,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.PointerEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerup(
    `type`: downshiftLib.downshiftLibStrings.pointerup,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.PointerEvent, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_popstate(
    `type`: downshiftLib.downshiftLibStrings.popstate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.PopStateEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_popstate(
    `type`: downshiftLib.downshiftLibStrings.popstate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.PopStateEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_popstate(
    `type`: downshiftLib.downshiftLibStrings.popstate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.PopStateEvent, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_progress(
    `type`: downshiftLib.downshiftLibStrings.progress,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.ProgressEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_progress(
    `type`: downshiftLib.downshiftLibStrings.progress,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.ProgressEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_progress(
    `type`: downshiftLib.downshiftLibStrings.progress,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.ProgressEvent, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ratechange(
    `type`: downshiftLib.downshiftLibStrings.ratechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ratechange(
    `type`: downshiftLib.downshiftLibStrings.ratechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ratechange(
    `type`: downshiftLib.downshiftLibStrings.ratechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_readystatechange(
    `type`: downshiftLib.downshiftLibStrings.readystatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.ProgressEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_readystatechange(
    `type`: downshiftLib.downshiftLibStrings.readystatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.ProgressEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_readystatechange(
    `type`: downshiftLib.downshiftLibStrings.readystatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.ProgressEvent, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_rejectionhandled(
    `type`: downshiftLib.downshiftLibStrings.rejectionhandled,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_rejectionhandled(
    `type`: downshiftLib.downshiftLibStrings.rejectionhandled,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_rejectionhandled(
    `type`: downshiftLib.downshiftLibStrings.rejectionhandled,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_reset(
    `type`: downshiftLib.downshiftLibStrings.reset,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_reset(
    `type`: downshiftLib.downshiftLibStrings.reset,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_reset(
    `type`: downshiftLib.downshiftLibStrings.reset,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_resize(
    `type`: downshiftLib.downshiftLibStrings.resize,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.UIEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_resize(
    `type`: downshiftLib.downshiftLibStrings.resize,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.UIEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_resize(
    `type`: downshiftLib.downshiftLibStrings.resize,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.UIEvent, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_scroll(
    `type`: downshiftLib.downshiftLibStrings.scroll,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_scroll(
    `type`: downshiftLib.downshiftLibStrings.scroll,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_scroll(
    `type`: downshiftLib.downshiftLibStrings.scroll,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_securitypolicyviolation(
    `type`: downshiftLib.downshiftLibStrings.securitypolicyviolation,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.SecurityPolicyViolationEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_securitypolicyviolation(
    `type`: downshiftLib.downshiftLibStrings.securitypolicyviolation,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.SecurityPolicyViolationEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_securitypolicyviolation(
    `type`: downshiftLib.downshiftLibStrings.securitypolicyviolation,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.SecurityPolicyViolationEvent, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_seeked(
    `type`: downshiftLib.downshiftLibStrings.seeked,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_seeked(
    `type`: downshiftLib.downshiftLibStrings.seeked,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_seeked(
    `type`: downshiftLib.downshiftLibStrings.seeked,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_seeking(
    `type`: downshiftLib.downshiftLibStrings.seeking,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_seeking(
    `type`: downshiftLib.downshiftLibStrings.seeking,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_seeking(
    `type`: downshiftLib.downshiftLibStrings.seeking,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_select(
    `type`: downshiftLib.downshiftLibStrings.select,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_select(
    `type`: downshiftLib.downshiftLibStrings.select,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_select(
    `type`: downshiftLib.downshiftLibStrings.select,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectionchange(
    `type`: downshiftLib.downshiftLibStrings.selectionchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectionchange(
    `type`: downshiftLib.downshiftLibStrings.selectionchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectionchange(
    `type`: downshiftLib.downshiftLibStrings.selectionchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectstart(
    `type`: downshiftLib.downshiftLibStrings.selectstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectstart(
    `type`: downshiftLib.downshiftLibStrings.selectstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectstart(
    `type`: downshiftLib.downshiftLibStrings.selectstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_stalled(
    `type`: downshiftLib.downshiftLibStrings.stalled,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_stalled(
    `type`: downshiftLib.downshiftLibStrings.stalled,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_stalled(
    `type`: downshiftLib.downshiftLibStrings.stalled,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_storage(
    `type`: downshiftLib.downshiftLibStrings.storage,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.StorageEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_storage(
    `type`: downshiftLib.downshiftLibStrings.storage,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.StorageEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_storage(
    `type`: downshiftLib.downshiftLibStrings.storage,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.StorageEvent, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_submit(
    `type`: downshiftLib.downshiftLibStrings.submit,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_submit(
    `type`: downshiftLib.downshiftLibStrings.submit,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_submit(
    `type`: downshiftLib.downshiftLibStrings.submit,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_suspend(
    `type`: downshiftLib.downshiftLibStrings.suspend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_suspend(
    `type`: downshiftLib.downshiftLibStrings.suspend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_suspend(
    `type`: downshiftLib.downshiftLibStrings.suspend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_timeupdate(
    `type`: downshiftLib.downshiftLibStrings.timeupdate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_timeupdate(
    `type`: downshiftLib.downshiftLibStrings.timeupdate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_timeupdate(
    `type`: downshiftLib.downshiftLibStrings.timeupdate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_toggle(
    `type`: downshiftLib.downshiftLibStrings.toggle,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_toggle(
    `type`: downshiftLib.downshiftLibStrings.toggle,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_toggle(
    `type`: downshiftLib.downshiftLibStrings.toggle,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchcancel(
    `type`: downshiftLib.downshiftLibStrings.touchcancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.TouchEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchcancel(
    `type`: downshiftLib.downshiftLibStrings.touchcancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.TouchEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchcancel(
    `type`: downshiftLib.downshiftLibStrings.touchcancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.TouchEvent, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchend(
    `type`: downshiftLib.downshiftLibStrings.touchend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.TouchEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchend(
    `type`: downshiftLib.downshiftLibStrings.touchend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.TouchEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchend(
    `type`: downshiftLib.downshiftLibStrings.touchend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.TouchEvent, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchmove(
    `type`: downshiftLib.downshiftLibStrings.touchmove,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.TouchEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchmove(
    `type`: downshiftLib.downshiftLibStrings.touchmove,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.TouchEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchmove(
    `type`: downshiftLib.downshiftLibStrings.touchmove,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.TouchEvent, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchstart(
    `type`: downshiftLib.downshiftLibStrings.touchstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.TouchEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchstart(
    `type`: downshiftLib.downshiftLibStrings.touchstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.TouchEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchstart(
    `type`: downshiftLib.downshiftLibStrings.touchstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.TouchEvent, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitioncancel(
    `type`: downshiftLib.downshiftLibStrings.transitioncancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.TransitionEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitioncancel(
    `type`: downshiftLib.downshiftLibStrings.transitioncancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.TransitionEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitioncancel(
    `type`: downshiftLib.downshiftLibStrings.transitioncancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.TransitionEvent, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitionend(
    `type`: downshiftLib.downshiftLibStrings.transitionend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.TransitionEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitionend(
    `type`: downshiftLib.downshiftLibStrings.transitionend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.TransitionEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitionend(
    `type`: downshiftLib.downshiftLibStrings.transitionend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.TransitionEvent, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitionrun(
    `type`: downshiftLib.downshiftLibStrings.transitionrun,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.TransitionEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitionrun(
    `type`: downshiftLib.downshiftLibStrings.transitionrun,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.TransitionEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitionrun(
    `type`: downshiftLib.downshiftLibStrings.transitionrun,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.TransitionEvent, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitionstart(
    `type`: downshiftLib.downshiftLibStrings.transitionstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.TransitionEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitionstart(
    `type`: downshiftLib.downshiftLibStrings.transitionstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.TransitionEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitionstart(
    `type`: downshiftLib.downshiftLibStrings.transitionstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.TransitionEvent, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_unhandledrejection(
    `type`: downshiftLib.downshiftLibStrings.unhandledrejection,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.PromiseRejectionEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_unhandledrejection(
    `type`: downshiftLib.downshiftLibStrings.unhandledrejection,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.PromiseRejectionEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_unhandledrejection(
    `type`: downshiftLib.downshiftLibStrings.unhandledrejection,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.PromiseRejectionEvent, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_unload(
    `type`: downshiftLib.downshiftLibStrings.unload,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_unload(
    `type`: downshiftLib.downshiftLibStrings.unload,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_unload(
    `type`: downshiftLib.downshiftLibStrings.unload,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_volumechange(
    `type`: downshiftLib.downshiftLibStrings.volumechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_volumechange(
    `type`: downshiftLib.downshiftLibStrings.volumechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_volumechange(
    `type`: downshiftLib.downshiftLibStrings.volumechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplayactivate(
    `type`: downshiftLib.downshiftLibStrings.vrdisplayactivate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplayactivate(
    `type`: downshiftLib.downshiftLibStrings.vrdisplayactivate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplayactivate(
    `type`: downshiftLib.downshiftLibStrings.vrdisplayactivate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplayblur(
    `type`: downshiftLib.downshiftLibStrings.vrdisplayblur,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplayblur(
    `type`: downshiftLib.downshiftLibStrings.vrdisplayblur,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplayblur(
    `type`: downshiftLib.downshiftLibStrings.vrdisplayblur,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplayconnect(
    `type`: downshiftLib.downshiftLibStrings.vrdisplayconnect,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplayconnect(
    `type`: downshiftLib.downshiftLibStrings.vrdisplayconnect,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplayconnect(
    `type`: downshiftLib.downshiftLibStrings.vrdisplayconnect,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplaydeactivate(
    `type`: downshiftLib.downshiftLibStrings.vrdisplaydeactivate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplaydeactivate(
    `type`: downshiftLib.downshiftLibStrings.vrdisplaydeactivate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplaydeactivate(
    `type`: downshiftLib.downshiftLibStrings.vrdisplaydeactivate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplaydisconnect(
    `type`: downshiftLib.downshiftLibStrings.vrdisplaydisconnect,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplaydisconnect(
    `type`: downshiftLib.downshiftLibStrings.vrdisplaydisconnect,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplaydisconnect(
    `type`: downshiftLib.downshiftLibStrings.vrdisplaydisconnect,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplayfocus(
    `type`: downshiftLib.downshiftLibStrings.vrdisplayfocus,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplayfocus(
    `type`: downshiftLib.downshiftLibStrings.vrdisplayfocus,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplayfocus(
    `type`: downshiftLib.downshiftLibStrings.vrdisplayfocus,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplaypointerrestricted(
    `type`: downshiftLib.downshiftLibStrings.vrdisplaypointerrestricted,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplaypointerrestricted(
    `type`: downshiftLib.downshiftLibStrings.vrdisplaypointerrestricted,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplaypointerrestricted(
    `type`: downshiftLib.downshiftLibStrings.vrdisplaypointerrestricted,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplaypointerunrestricted(
    `type`: downshiftLib.downshiftLibStrings.vrdisplaypointerunrestricted,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplaypointerunrestricted(
    `type`: downshiftLib.downshiftLibStrings.vrdisplaypointerunrestricted,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplaypointerunrestricted(
    `type`: downshiftLib.downshiftLibStrings.vrdisplaypointerunrestricted,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplaypresentchange(
    `type`: downshiftLib.downshiftLibStrings.vrdisplaypresentchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplaypresentchange(
    `type`: downshiftLib.downshiftLibStrings.vrdisplaypresentchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplaypresentchange(
    `type`: downshiftLib.downshiftLibStrings.vrdisplaypresentchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_waiting(
    `type`: downshiftLib.downshiftLibStrings.waiting,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_waiting(
    `type`: downshiftLib.downshiftLibStrings.waiting,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_waiting(
    `type`: downshiftLib.downshiftLibStrings.waiting,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_wheel(
    `type`: downshiftLib.downshiftLibStrings.wheel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.WheelEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_wheel(
    `type`: downshiftLib.downshiftLibStrings.wheel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.WheelEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_wheel(
    `type`: downshiftLib.downshiftLibStrings.wheel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.WheelEvent, _],
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, callback: scala.Null, options: scala.Boolean): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, callback: scala.Null, options: stdLib.EventListenerOptions): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: stdLib.EventListenerOrEventListenerObject): scala.Unit = js.native
  def removeEventListener(
    `type`: java.lang.String,
    listener: stdLib.EventListenerOrEventListenerObject,
    options: scala.Boolean
  ): scala.Unit = js.native
  def removeEventListener(
    `type`: java.lang.String,
    listener: stdLib.EventListenerOrEventListenerObject,
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSGestureChange(
    `type`: downshiftLib.downshiftLibStrings.MSGestureChange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSGestureChange(
    `type`: downshiftLib.downshiftLibStrings.MSGestureChange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSGestureChange(
    `type`: downshiftLib.downshiftLibStrings.MSGestureChange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSGestureDoubleTap(
    `type`: downshiftLib.downshiftLibStrings.MSGestureDoubleTap,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSGestureDoubleTap(
    `type`: downshiftLib.downshiftLibStrings.MSGestureDoubleTap,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSGestureDoubleTap(
    `type`: downshiftLib.downshiftLibStrings.MSGestureDoubleTap,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSGestureEnd(
    `type`: downshiftLib.downshiftLibStrings.MSGestureEnd,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSGestureEnd(
    `type`: downshiftLib.downshiftLibStrings.MSGestureEnd,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSGestureEnd(
    `type`: downshiftLib.downshiftLibStrings.MSGestureEnd,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSGestureHold(
    `type`: downshiftLib.downshiftLibStrings.MSGestureHold,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSGestureHold(
    `type`: downshiftLib.downshiftLibStrings.MSGestureHold,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSGestureHold(
    `type`: downshiftLib.downshiftLibStrings.MSGestureHold,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSGestureStart(
    `type`: downshiftLib.downshiftLibStrings.MSGestureStart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSGestureStart(
    `type`: downshiftLib.downshiftLibStrings.MSGestureStart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSGestureStart(
    `type`: downshiftLib.downshiftLibStrings.MSGestureStart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSGestureTap(
    `type`: downshiftLib.downshiftLibStrings.MSGestureTap,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSGestureTap(
    `type`: downshiftLib.downshiftLibStrings.MSGestureTap,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSGestureTap(
    `type`: downshiftLib.downshiftLibStrings.MSGestureTap,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSInertiaStart(
    `type`: downshiftLib.downshiftLibStrings.MSInertiaStart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSInertiaStart(
    `type`: downshiftLib.downshiftLibStrings.MSInertiaStart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSInertiaStart(
    `type`: downshiftLib.downshiftLibStrings.MSInertiaStart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSPointerCancel(
    `type`: downshiftLib.downshiftLibStrings.MSPointerCancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSPointerCancel(
    `type`: downshiftLib.downshiftLibStrings.MSPointerCancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSPointerCancel(
    `type`: downshiftLib.downshiftLibStrings.MSPointerCancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSPointerDown(
    `type`: downshiftLib.downshiftLibStrings.MSPointerDown,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSPointerDown(
    `type`: downshiftLib.downshiftLibStrings.MSPointerDown,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSPointerDown(
    `type`: downshiftLib.downshiftLibStrings.MSPointerDown,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSPointerEnter(
    `type`: downshiftLib.downshiftLibStrings.MSPointerEnter,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSPointerEnter(
    `type`: downshiftLib.downshiftLibStrings.MSPointerEnter,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSPointerEnter(
    `type`: downshiftLib.downshiftLibStrings.MSPointerEnter,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSPointerLeave(
    `type`: downshiftLib.downshiftLibStrings.MSPointerLeave,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSPointerLeave(
    `type`: downshiftLib.downshiftLibStrings.MSPointerLeave,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSPointerLeave(
    `type`: downshiftLib.downshiftLibStrings.MSPointerLeave,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSPointerMove(
    `type`: downshiftLib.downshiftLibStrings.MSPointerMove,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSPointerMove(
    `type`: downshiftLib.downshiftLibStrings.MSPointerMove,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSPointerMove(
    `type`: downshiftLib.downshiftLibStrings.MSPointerMove,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSPointerOut(
    `type`: downshiftLib.downshiftLibStrings.MSPointerOut,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSPointerOut(
    `type`: downshiftLib.downshiftLibStrings.MSPointerOut,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSPointerOut(
    `type`: downshiftLib.downshiftLibStrings.MSPointerOut,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSPointerOver(
    `type`: downshiftLib.downshiftLibStrings.MSPointerOver,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSPointerOver(
    `type`: downshiftLib.downshiftLibStrings.MSPointerOver,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSPointerOver(
    `type`: downshiftLib.downshiftLibStrings.MSPointerOver,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSPointerUp(
    `type`: downshiftLib.downshiftLibStrings.MSPointerUp,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSPointerUp(
    `type`: downshiftLib.downshiftLibStrings.MSPointerUp,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSPointerUp(
    `type`: downshiftLib.downshiftLibStrings.MSPointerUp,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_abort(
    `type`: downshiftLib.downshiftLibStrings.abort,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.UIEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_abort(
    `type`: downshiftLib.downshiftLibStrings.abort,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.UIEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_abort(
    `type`: downshiftLib.downshiftLibStrings.abort,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.UIEvent, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_afterprint(
    `type`: downshiftLib.downshiftLibStrings.afterprint,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_afterprint(
    `type`: downshiftLib.downshiftLibStrings.afterprint,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_afterprint(
    `type`: downshiftLib.downshiftLibStrings.afterprint,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_animationcancel(
    `type`: downshiftLib.downshiftLibStrings.animationcancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.AnimationEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_animationcancel(
    `type`: downshiftLib.downshiftLibStrings.animationcancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.AnimationEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_animationcancel(
    `type`: downshiftLib.downshiftLibStrings.animationcancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.AnimationEvent, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_animationend(
    `type`: downshiftLib.downshiftLibStrings.animationend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.AnimationEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_animationend(
    `type`: downshiftLib.downshiftLibStrings.animationend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.AnimationEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_animationend(
    `type`: downshiftLib.downshiftLibStrings.animationend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.AnimationEvent, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_animationiteration(
    `type`: downshiftLib.downshiftLibStrings.animationiteration,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.AnimationEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_animationiteration(
    `type`: downshiftLib.downshiftLibStrings.animationiteration,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.AnimationEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_animationiteration(
    `type`: downshiftLib.downshiftLibStrings.animationiteration,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.AnimationEvent, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_animationstart(
    `type`: downshiftLib.downshiftLibStrings.animationstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.AnimationEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_animationstart(
    `type`: downshiftLib.downshiftLibStrings.animationstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.AnimationEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_animationstart(
    `type`: downshiftLib.downshiftLibStrings.animationstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.AnimationEvent, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_auxclick(
    `type`: downshiftLib.downshiftLibStrings.auxclick,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_auxclick(
    `type`: downshiftLib.downshiftLibStrings.auxclick,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_auxclick(
    `type`: downshiftLib.downshiftLibStrings.auxclick,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_beforeprint(
    `type`: downshiftLib.downshiftLibStrings.beforeprint,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_beforeprint(
    `type`: downshiftLib.downshiftLibStrings.beforeprint,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_beforeprint(
    `type`: downshiftLib.downshiftLibStrings.beforeprint,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_beforeunload(
    `type`: downshiftLib.downshiftLibStrings.beforeunload,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.BeforeUnloadEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_beforeunload(
    `type`: downshiftLib.downshiftLibStrings.beforeunload,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.BeforeUnloadEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_beforeunload(
    `type`: downshiftLib.downshiftLibStrings.beforeunload,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.BeforeUnloadEvent, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_blur(
    `type`: downshiftLib.downshiftLibStrings.blur,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.FocusEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_blur(
    `type`: downshiftLib.downshiftLibStrings.blur,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.FocusEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_blur(
    `type`: downshiftLib.downshiftLibStrings.blur,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.FocusEvent, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_cancel(
    `type`: downshiftLib.downshiftLibStrings.cancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_cancel(
    `type`: downshiftLib.downshiftLibStrings.cancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_cancel(
    `type`: downshiftLib.downshiftLibStrings.cancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_canplay(
    `type`: downshiftLib.downshiftLibStrings.canplay,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_canplay(
    `type`: downshiftLib.downshiftLibStrings.canplay,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_canplay(
    `type`: downshiftLib.downshiftLibStrings.canplay,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_canplaythrough(
    `type`: downshiftLib.downshiftLibStrings.canplaythrough,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_canplaythrough(
    `type`: downshiftLib.downshiftLibStrings.canplaythrough,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_canplaythrough(
    `type`: downshiftLib.downshiftLibStrings.canplaythrough,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_change(
    `type`: downshiftLib.downshiftLibStrings.change,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_change(
    `type`: downshiftLib.downshiftLibStrings.change,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_change(
    `type`: downshiftLib.downshiftLibStrings.change,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_click(
    `type`: downshiftLib.downshiftLibStrings.click,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.MouseEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_click(
    `type`: downshiftLib.downshiftLibStrings.click,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.MouseEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_click(
    `type`: downshiftLib.downshiftLibStrings.click,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.MouseEvent, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_close(
    `type`: downshiftLib.downshiftLibStrings.close,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_close(
    `type`: downshiftLib.downshiftLibStrings.close,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_close(
    `type`: downshiftLib.downshiftLibStrings.close,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_compassneedscalibration(
    `type`: downshiftLib.downshiftLibStrings.compassneedscalibration,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_compassneedscalibration(
    `type`: downshiftLib.downshiftLibStrings.compassneedscalibration,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_compassneedscalibration(
    `type`: downshiftLib.downshiftLibStrings.compassneedscalibration,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_contextmenu(
    `type`: downshiftLib.downshiftLibStrings.contextmenu,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.MouseEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_contextmenu(
    `type`: downshiftLib.downshiftLibStrings.contextmenu,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.MouseEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_contextmenu(
    `type`: downshiftLib.downshiftLibStrings.contextmenu,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.MouseEvent, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_cuechange(
    `type`: downshiftLib.downshiftLibStrings.cuechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_cuechange(
    `type`: downshiftLib.downshiftLibStrings.cuechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_cuechange(
    `type`: downshiftLib.downshiftLibStrings.cuechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dblclick(
    `type`: downshiftLib.downshiftLibStrings.dblclick,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.MouseEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dblclick(
    `type`: downshiftLib.downshiftLibStrings.dblclick,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.MouseEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dblclick(
    `type`: downshiftLib.downshiftLibStrings.dblclick,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.MouseEvent, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_devicelight(
    `type`: downshiftLib.downshiftLibStrings.devicelight,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.DeviceLightEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_devicelight(
    `type`: downshiftLib.downshiftLibStrings.devicelight,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.DeviceLightEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_devicelight(
    `type`: downshiftLib.downshiftLibStrings.devicelight,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.DeviceLightEvent, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_devicemotion(
    `type`: downshiftLib.downshiftLibStrings.devicemotion,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.DeviceMotionEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_devicemotion(
    `type`: downshiftLib.downshiftLibStrings.devicemotion,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.DeviceMotionEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_devicemotion(
    `type`: downshiftLib.downshiftLibStrings.devicemotion,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.DeviceMotionEvent, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_deviceorientation(
    `type`: downshiftLib.downshiftLibStrings.deviceorientation,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.DeviceOrientationEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_deviceorientation(
    `type`: downshiftLib.downshiftLibStrings.deviceorientation,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.DeviceOrientationEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_deviceorientation(
    `type`: downshiftLib.downshiftLibStrings.deviceorientation,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.DeviceOrientationEvent, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_drag(
    `type`: downshiftLib.downshiftLibStrings.drag,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.DragEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_drag(
    `type`: downshiftLib.downshiftLibStrings.drag,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.DragEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_drag(
    `type`: downshiftLib.downshiftLibStrings.drag,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.DragEvent, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragend(
    `type`: downshiftLib.downshiftLibStrings.dragend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.DragEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragend(
    `type`: downshiftLib.downshiftLibStrings.dragend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.DragEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragend(
    `type`: downshiftLib.downshiftLibStrings.dragend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.DragEvent, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragenter(
    `type`: downshiftLib.downshiftLibStrings.dragenter,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.DragEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragenter(
    `type`: downshiftLib.downshiftLibStrings.dragenter,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.DragEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragenter(
    `type`: downshiftLib.downshiftLibStrings.dragenter,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.DragEvent, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragexit(
    `type`: downshiftLib.downshiftLibStrings.dragexit,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragexit(
    `type`: downshiftLib.downshiftLibStrings.dragexit,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragexit(
    `type`: downshiftLib.downshiftLibStrings.dragexit,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragleave(
    `type`: downshiftLib.downshiftLibStrings.dragleave,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.DragEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragleave(
    `type`: downshiftLib.downshiftLibStrings.dragleave,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.DragEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragleave(
    `type`: downshiftLib.downshiftLibStrings.dragleave,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.DragEvent, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragover(
    `type`: downshiftLib.downshiftLibStrings.dragover,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.DragEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragover(
    `type`: downshiftLib.downshiftLibStrings.dragover,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.DragEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragover(
    `type`: downshiftLib.downshiftLibStrings.dragover,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.DragEvent, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragstart(
    `type`: downshiftLib.downshiftLibStrings.dragstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.DragEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragstart(
    `type`: downshiftLib.downshiftLibStrings.dragstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.DragEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragstart(
    `type`: downshiftLib.downshiftLibStrings.dragstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.DragEvent, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_drop(
    `type`: downshiftLib.downshiftLibStrings.drop,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.DragEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_drop(
    `type`: downshiftLib.downshiftLibStrings.drop,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.DragEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_drop(
    `type`: downshiftLib.downshiftLibStrings.drop,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.DragEvent, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_durationchange(
    `type`: downshiftLib.downshiftLibStrings.durationchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_durationchange(
    `type`: downshiftLib.downshiftLibStrings.durationchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_durationchange(
    `type`: downshiftLib.downshiftLibStrings.durationchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_emptied(
    `type`: downshiftLib.downshiftLibStrings.emptied,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_emptied(
    `type`: downshiftLib.downshiftLibStrings.emptied,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_emptied(
    `type`: downshiftLib.downshiftLibStrings.emptied,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_ended(
    `type`: downshiftLib.downshiftLibStrings.ended,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_ended(
    `type`: downshiftLib.downshiftLibStrings.ended,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_ended(
    `type`: downshiftLib.downshiftLibStrings.ended,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_error(
    `type`: downshiftLib.downshiftLibStrings.error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.ErrorEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_error(
    `type`: downshiftLib.downshiftLibStrings.error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.ErrorEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_error(
    `type`: downshiftLib.downshiftLibStrings.error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.ErrorEvent, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_focus(
    `type`: downshiftLib.downshiftLibStrings.focus,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.FocusEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_focus(
    `type`: downshiftLib.downshiftLibStrings.focus,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.FocusEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_focus(
    `type`: downshiftLib.downshiftLibStrings.focus,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.FocusEvent, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_gotpointercapture(
    `type`: downshiftLib.downshiftLibStrings.gotpointercapture,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.PointerEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_gotpointercapture(
    `type`: downshiftLib.downshiftLibStrings.gotpointercapture,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.PointerEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_gotpointercapture(
    `type`: downshiftLib.downshiftLibStrings.gotpointercapture,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.PointerEvent, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_hashchange(
    `type`: downshiftLib.downshiftLibStrings.hashchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.HashChangeEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_hashchange(
    `type`: downshiftLib.downshiftLibStrings.hashchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.HashChangeEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_hashchange(
    `type`: downshiftLib.downshiftLibStrings.hashchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.HashChangeEvent, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_input(
    `type`: downshiftLib.downshiftLibStrings.input,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_input(
    `type`: downshiftLib.downshiftLibStrings.input,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_input(
    `type`: downshiftLib.downshiftLibStrings.input,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_invalid(
    `type`: downshiftLib.downshiftLibStrings.invalid,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_invalid(
    `type`: downshiftLib.downshiftLibStrings.invalid,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_invalid(
    `type`: downshiftLib.downshiftLibStrings.invalid,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_keydown(
    `type`: downshiftLib.downshiftLibStrings.keydown,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.KeyboardEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_keydown(
    `type`: downshiftLib.downshiftLibStrings.keydown,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.KeyboardEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_keydown(
    `type`: downshiftLib.downshiftLibStrings.keydown,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.KeyboardEvent, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_keypress(
    `type`: downshiftLib.downshiftLibStrings.keypress,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.KeyboardEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_keypress(
    `type`: downshiftLib.downshiftLibStrings.keypress,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.KeyboardEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_keypress(
    `type`: downshiftLib.downshiftLibStrings.keypress,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.KeyboardEvent, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_keyup(
    `type`: downshiftLib.downshiftLibStrings.keyup,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.KeyboardEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_keyup(
    `type`: downshiftLib.downshiftLibStrings.keyup,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.KeyboardEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_keyup(
    `type`: downshiftLib.downshiftLibStrings.keyup,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.KeyboardEvent, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_languagechange(
    `type`: downshiftLib.downshiftLibStrings.languagechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_languagechange(
    `type`: downshiftLib.downshiftLibStrings.languagechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_languagechange(
    `type`: downshiftLib.downshiftLibStrings.languagechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_load(
    `type`: downshiftLib.downshiftLibStrings.load,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_load(
    `type`: downshiftLib.downshiftLibStrings.load,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_load(
    `type`: downshiftLib.downshiftLibStrings.load,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadeddata(
    `type`: downshiftLib.downshiftLibStrings.loadeddata,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadeddata(
    `type`: downshiftLib.downshiftLibStrings.loadeddata,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadeddata(
    `type`: downshiftLib.downshiftLibStrings.loadeddata,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadedmetadata(
    `type`: downshiftLib.downshiftLibStrings.loadedmetadata,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadedmetadata(
    `type`: downshiftLib.downshiftLibStrings.loadedmetadata,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadedmetadata(
    `type`: downshiftLib.downshiftLibStrings.loadedmetadata,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadend(
    `type`: downshiftLib.downshiftLibStrings.loadend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.ProgressEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadend(
    `type`: downshiftLib.downshiftLibStrings.loadend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.ProgressEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadend(
    `type`: downshiftLib.downshiftLibStrings.loadend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.ProgressEvent, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadstart(
    `type`: downshiftLib.downshiftLibStrings.loadstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadstart(
    `type`: downshiftLib.downshiftLibStrings.loadstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadstart(
    `type`: downshiftLib.downshiftLibStrings.loadstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_lostpointercapture(
    `type`: downshiftLib.downshiftLibStrings.lostpointercapture,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.PointerEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_lostpointercapture(
    `type`: downshiftLib.downshiftLibStrings.lostpointercapture,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.PointerEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_lostpointercapture(
    `type`: downshiftLib.downshiftLibStrings.lostpointercapture,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.PointerEvent, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_message(
    `type`: downshiftLib.downshiftLibStrings.message,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.MessageEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_message(
    `type`: downshiftLib.downshiftLibStrings.message,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.MessageEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_message(
    `type`: downshiftLib.downshiftLibStrings.message,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.MessageEvent, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_messageerror(
    `type`: downshiftLib.downshiftLibStrings.messageerror,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.MessageEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_messageerror(
    `type`: downshiftLib.downshiftLibStrings.messageerror,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.MessageEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_messageerror(
    `type`: downshiftLib.downshiftLibStrings.messageerror,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.MessageEvent, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mousedown(
    `type`: downshiftLib.downshiftLibStrings.mousedown,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.MouseEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mousedown(
    `type`: downshiftLib.downshiftLibStrings.mousedown,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.MouseEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mousedown(
    `type`: downshiftLib.downshiftLibStrings.mousedown,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.MouseEvent, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseenter(
    `type`: downshiftLib.downshiftLibStrings.mouseenter,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.MouseEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseenter(
    `type`: downshiftLib.downshiftLibStrings.mouseenter,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.MouseEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseenter(
    `type`: downshiftLib.downshiftLibStrings.mouseenter,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.MouseEvent, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseleave(
    `type`: downshiftLib.downshiftLibStrings.mouseleave,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.MouseEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseleave(
    `type`: downshiftLib.downshiftLibStrings.mouseleave,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.MouseEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseleave(
    `type`: downshiftLib.downshiftLibStrings.mouseleave,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.MouseEvent, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mousemove(
    `type`: downshiftLib.downshiftLibStrings.mousemove,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.MouseEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mousemove(
    `type`: downshiftLib.downshiftLibStrings.mousemove,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.MouseEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mousemove(
    `type`: downshiftLib.downshiftLibStrings.mousemove,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.MouseEvent, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseout(
    `type`: downshiftLib.downshiftLibStrings.mouseout,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.MouseEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseout(
    `type`: downshiftLib.downshiftLibStrings.mouseout,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.MouseEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseout(
    `type`: downshiftLib.downshiftLibStrings.mouseout,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.MouseEvent, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseover(
    `type`: downshiftLib.downshiftLibStrings.mouseover,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.MouseEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseover(
    `type`: downshiftLib.downshiftLibStrings.mouseover,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.MouseEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseover(
    `type`: downshiftLib.downshiftLibStrings.mouseover,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.MouseEvent, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseup(
    `type`: downshiftLib.downshiftLibStrings.mouseup,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.MouseEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseup(
    `type`: downshiftLib.downshiftLibStrings.mouseup,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.MouseEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseup(
    `type`: downshiftLib.downshiftLibStrings.mouseup,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.MouseEvent, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mousewheel(
    `type`: downshiftLib.downshiftLibStrings.mousewheel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mousewheel(
    `type`: downshiftLib.downshiftLibStrings.mousewheel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mousewheel(
    `type`: downshiftLib.downshiftLibStrings.mousewheel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_offline(
    `type`: downshiftLib.downshiftLibStrings.offline,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_offline(
    `type`: downshiftLib.downshiftLibStrings.offline,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_offline(
    `type`: downshiftLib.downshiftLibStrings.offline,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_online(
    `type`: downshiftLib.downshiftLibStrings.online,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_online(
    `type`: downshiftLib.downshiftLibStrings.online,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_online(
    `type`: downshiftLib.downshiftLibStrings.online,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_orientationchange(
    `type`: downshiftLib.downshiftLibStrings.orientationchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_orientationchange(
    `type`: downshiftLib.downshiftLibStrings.orientationchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_orientationchange(
    `type`: downshiftLib.downshiftLibStrings.orientationchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pagehide(
    `type`: downshiftLib.downshiftLibStrings.pagehide,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.PageTransitionEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pagehide(
    `type`: downshiftLib.downshiftLibStrings.pagehide,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.PageTransitionEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pagehide(
    `type`: downshiftLib.downshiftLibStrings.pagehide,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.PageTransitionEvent, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pageshow(
    `type`: downshiftLib.downshiftLibStrings.pageshow,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.PageTransitionEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pageshow(
    `type`: downshiftLib.downshiftLibStrings.pageshow,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.PageTransitionEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pageshow(
    `type`: downshiftLib.downshiftLibStrings.pageshow,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.PageTransitionEvent, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pause(
    `type`: downshiftLib.downshiftLibStrings.pause,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pause(
    `type`: downshiftLib.downshiftLibStrings.pause,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pause(
    `type`: downshiftLib.downshiftLibStrings.pause,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_play(
    `type`: downshiftLib.downshiftLibStrings.play,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_play(
    `type`: downshiftLib.downshiftLibStrings.play,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_play(
    `type`: downshiftLib.downshiftLibStrings.play,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_playing(
    `type`: downshiftLib.downshiftLibStrings.playing,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_playing(
    `type`: downshiftLib.downshiftLibStrings.playing,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_playing(
    `type`: downshiftLib.downshiftLibStrings.playing,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointercancel(
    `type`: downshiftLib.downshiftLibStrings.pointercancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.PointerEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointercancel(
    `type`: downshiftLib.downshiftLibStrings.pointercancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.PointerEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointercancel(
    `type`: downshiftLib.downshiftLibStrings.pointercancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.PointerEvent, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerdown(
    `type`: downshiftLib.downshiftLibStrings.pointerdown,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.PointerEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerdown(
    `type`: downshiftLib.downshiftLibStrings.pointerdown,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.PointerEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerdown(
    `type`: downshiftLib.downshiftLibStrings.pointerdown,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.PointerEvent, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerenter(
    `type`: downshiftLib.downshiftLibStrings.pointerenter,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.PointerEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerenter(
    `type`: downshiftLib.downshiftLibStrings.pointerenter,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.PointerEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerenter(
    `type`: downshiftLib.downshiftLibStrings.pointerenter,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.PointerEvent, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerleave(
    `type`: downshiftLib.downshiftLibStrings.pointerleave,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.PointerEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerleave(
    `type`: downshiftLib.downshiftLibStrings.pointerleave,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.PointerEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerleave(
    `type`: downshiftLib.downshiftLibStrings.pointerleave,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.PointerEvent, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointermove(
    `type`: downshiftLib.downshiftLibStrings.pointermove,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.PointerEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointermove(
    `type`: downshiftLib.downshiftLibStrings.pointermove,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.PointerEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointermove(
    `type`: downshiftLib.downshiftLibStrings.pointermove,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.PointerEvent, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerout(
    `type`: downshiftLib.downshiftLibStrings.pointerout,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.PointerEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerout(
    `type`: downshiftLib.downshiftLibStrings.pointerout,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.PointerEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerout(
    `type`: downshiftLib.downshiftLibStrings.pointerout,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.PointerEvent, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerover(
    `type`: downshiftLib.downshiftLibStrings.pointerover,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.PointerEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerover(
    `type`: downshiftLib.downshiftLibStrings.pointerover,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.PointerEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerover(
    `type`: downshiftLib.downshiftLibStrings.pointerover,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.PointerEvent, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerup(
    `type`: downshiftLib.downshiftLibStrings.pointerup,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.PointerEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerup(
    `type`: downshiftLib.downshiftLibStrings.pointerup,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.PointerEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerup(
    `type`: downshiftLib.downshiftLibStrings.pointerup,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.PointerEvent, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_popstate(
    `type`: downshiftLib.downshiftLibStrings.popstate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.PopStateEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_popstate(
    `type`: downshiftLib.downshiftLibStrings.popstate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.PopStateEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_popstate(
    `type`: downshiftLib.downshiftLibStrings.popstate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.PopStateEvent, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_progress(
    `type`: downshiftLib.downshiftLibStrings.progress,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.ProgressEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_progress(
    `type`: downshiftLib.downshiftLibStrings.progress,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.ProgressEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_progress(
    `type`: downshiftLib.downshiftLibStrings.progress,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.ProgressEvent, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_ratechange(
    `type`: downshiftLib.downshiftLibStrings.ratechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_ratechange(
    `type`: downshiftLib.downshiftLibStrings.ratechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_ratechange(
    `type`: downshiftLib.downshiftLibStrings.ratechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_readystatechange(
    `type`: downshiftLib.downshiftLibStrings.readystatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.ProgressEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_readystatechange(
    `type`: downshiftLib.downshiftLibStrings.readystatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.ProgressEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_readystatechange(
    `type`: downshiftLib.downshiftLibStrings.readystatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.ProgressEvent, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_rejectionhandled(
    `type`: downshiftLib.downshiftLibStrings.rejectionhandled,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_rejectionhandled(
    `type`: downshiftLib.downshiftLibStrings.rejectionhandled,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_rejectionhandled(
    `type`: downshiftLib.downshiftLibStrings.rejectionhandled,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_reset(
    `type`: downshiftLib.downshiftLibStrings.reset,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_reset(
    `type`: downshiftLib.downshiftLibStrings.reset,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_reset(
    `type`: downshiftLib.downshiftLibStrings.reset,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_resize(
    `type`: downshiftLib.downshiftLibStrings.resize,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.UIEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_resize(
    `type`: downshiftLib.downshiftLibStrings.resize,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.UIEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_resize(
    `type`: downshiftLib.downshiftLibStrings.resize,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.UIEvent, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_scroll(
    `type`: downshiftLib.downshiftLibStrings.scroll,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_scroll(
    `type`: downshiftLib.downshiftLibStrings.scroll,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_scroll(
    `type`: downshiftLib.downshiftLibStrings.scroll,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_securitypolicyviolation(
    `type`: downshiftLib.downshiftLibStrings.securitypolicyviolation,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.SecurityPolicyViolationEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_securitypolicyviolation(
    `type`: downshiftLib.downshiftLibStrings.securitypolicyviolation,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.SecurityPolicyViolationEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_securitypolicyviolation(
    `type`: downshiftLib.downshiftLibStrings.securitypolicyviolation,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.SecurityPolicyViolationEvent, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_seeked(
    `type`: downshiftLib.downshiftLibStrings.seeked,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_seeked(
    `type`: downshiftLib.downshiftLibStrings.seeked,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_seeked(
    `type`: downshiftLib.downshiftLibStrings.seeked,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_seeking(
    `type`: downshiftLib.downshiftLibStrings.seeking,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_seeking(
    `type`: downshiftLib.downshiftLibStrings.seeking,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_seeking(
    `type`: downshiftLib.downshiftLibStrings.seeking,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_select(
    `type`: downshiftLib.downshiftLibStrings.select,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_select(
    `type`: downshiftLib.downshiftLibStrings.select,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_select(
    `type`: downshiftLib.downshiftLibStrings.select,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_selectionchange(
    `type`: downshiftLib.downshiftLibStrings.selectionchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_selectionchange(
    `type`: downshiftLib.downshiftLibStrings.selectionchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_selectionchange(
    `type`: downshiftLib.downshiftLibStrings.selectionchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_selectstart(
    `type`: downshiftLib.downshiftLibStrings.selectstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_selectstart(
    `type`: downshiftLib.downshiftLibStrings.selectstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_selectstart(
    `type`: downshiftLib.downshiftLibStrings.selectstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_stalled(
    `type`: downshiftLib.downshiftLibStrings.stalled,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_stalled(
    `type`: downshiftLib.downshiftLibStrings.stalled,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_stalled(
    `type`: downshiftLib.downshiftLibStrings.stalled,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_storage(
    `type`: downshiftLib.downshiftLibStrings.storage,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.StorageEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_storage(
    `type`: downshiftLib.downshiftLibStrings.storage,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.StorageEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_storage(
    `type`: downshiftLib.downshiftLibStrings.storage,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.StorageEvent, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_submit(
    `type`: downshiftLib.downshiftLibStrings.submit,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_submit(
    `type`: downshiftLib.downshiftLibStrings.submit,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_submit(
    `type`: downshiftLib.downshiftLibStrings.submit,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_suspend(
    `type`: downshiftLib.downshiftLibStrings.suspend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_suspend(
    `type`: downshiftLib.downshiftLibStrings.suspend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_suspend(
    `type`: downshiftLib.downshiftLibStrings.suspend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_timeupdate(
    `type`: downshiftLib.downshiftLibStrings.timeupdate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_timeupdate(
    `type`: downshiftLib.downshiftLibStrings.timeupdate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_timeupdate(
    `type`: downshiftLib.downshiftLibStrings.timeupdate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_toggle(
    `type`: downshiftLib.downshiftLibStrings.toggle,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_toggle(
    `type`: downshiftLib.downshiftLibStrings.toggle,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_toggle(
    `type`: downshiftLib.downshiftLibStrings.toggle,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_touchcancel(
    `type`: downshiftLib.downshiftLibStrings.touchcancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.TouchEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_touchcancel(
    `type`: downshiftLib.downshiftLibStrings.touchcancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.TouchEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_touchcancel(
    `type`: downshiftLib.downshiftLibStrings.touchcancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.TouchEvent, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_touchend(
    `type`: downshiftLib.downshiftLibStrings.touchend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.TouchEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_touchend(
    `type`: downshiftLib.downshiftLibStrings.touchend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.TouchEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_touchend(
    `type`: downshiftLib.downshiftLibStrings.touchend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.TouchEvent, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_touchmove(
    `type`: downshiftLib.downshiftLibStrings.touchmove,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.TouchEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_touchmove(
    `type`: downshiftLib.downshiftLibStrings.touchmove,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.TouchEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_touchmove(
    `type`: downshiftLib.downshiftLibStrings.touchmove,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.TouchEvent, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_touchstart(
    `type`: downshiftLib.downshiftLibStrings.touchstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.TouchEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_touchstart(
    `type`: downshiftLib.downshiftLibStrings.touchstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.TouchEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_touchstart(
    `type`: downshiftLib.downshiftLibStrings.touchstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.TouchEvent, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_transitioncancel(
    `type`: downshiftLib.downshiftLibStrings.transitioncancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.TransitionEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_transitioncancel(
    `type`: downshiftLib.downshiftLibStrings.transitioncancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.TransitionEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_transitioncancel(
    `type`: downshiftLib.downshiftLibStrings.transitioncancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.TransitionEvent, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_transitionend(
    `type`: downshiftLib.downshiftLibStrings.transitionend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.TransitionEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_transitionend(
    `type`: downshiftLib.downshiftLibStrings.transitionend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.TransitionEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_transitionend(
    `type`: downshiftLib.downshiftLibStrings.transitionend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.TransitionEvent, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_transitionrun(
    `type`: downshiftLib.downshiftLibStrings.transitionrun,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.TransitionEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_transitionrun(
    `type`: downshiftLib.downshiftLibStrings.transitionrun,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.TransitionEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_transitionrun(
    `type`: downshiftLib.downshiftLibStrings.transitionrun,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.TransitionEvent, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_transitionstart(
    `type`: downshiftLib.downshiftLibStrings.transitionstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.TransitionEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_transitionstart(
    `type`: downshiftLib.downshiftLibStrings.transitionstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.TransitionEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_transitionstart(
    `type`: downshiftLib.downshiftLibStrings.transitionstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.TransitionEvent, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_unhandledrejection(
    `type`: downshiftLib.downshiftLibStrings.unhandledrejection,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.PromiseRejectionEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_unhandledrejection(
    `type`: downshiftLib.downshiftLibStrings.unhandledrejection,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.PromiseRejectionEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_unhandledrejection(
    `type`: downshiftLib.downshiftLibStrings.unhandledrejection,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.PromiseRejectionEvent, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_unload(
    `type`: downshiftLib.downshiftLibStrings.unload,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_unload(
    `type`: downshiftLib.downshiftLibStrings.unload,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_unload(
    `type`: downshiftLib.downshiftLibStrings.unload,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_volumechange(
    `type`: downshiftLib.downshiftLibStrings.volumechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_volumechange(
    `type`: downshiftLib.downshiftLibStrings.volumechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_volumechange(
    `type`: downshiftLib.downshiftLibStrings.volumechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplayactivate(
    `type`: downshiftLib.downshiftLibStrings.vrdisplayactivate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplayactivate(
    `type`: downshiftLib.downshiftLibStrings.vrdisplayactivate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplayactivate(
    `type`: downshiftLib.downshiftLibStrings.vrdisplayactivate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplayblur(
    `type`: downshiftLib.downshiftLibStrings.vrdisplayblur,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplayblur(
    `type`: downshiftLib.downshiftLibStrings.vrdisplayblur,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplayblur(
    `type`: downshiftLib.downshiftLibStrings.vrdisplayblur,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplayconnect(
    `type`: downshiftLib.downshiftLibStrings.vrdisplayconnect,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplayconnect(
    `type`: downshiftLib.downshiftLibStrings.vrdisplayconnect,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplayconnect(
    `type`: downshiftLib.downshiftLibStrings.vrdisplayconnect,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplaydeactivate(
    `type`: downshiftLib.downshiftLibStrings.vrdisplaydeactivate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplaydeactivate(
    `type`: downshiftLib.downshiftLibStrings.vrdisplaydeactivate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplaydeactivate(
    `type`: downshiftLib.downshiftLibStrings.vrdisplaydeactivate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplaydisconnect(
    `type`: downshiftLib.downshiftLibStrings.vrdisplaydisconnect,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplaydisconnect(
    `type`: downshiftLib.downshiftLibStrings.vrdisplaydisconnect,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplaydisconnect(
    `type`: downshiftLib.downshiftLibStrings.vrdisplaydisconnect,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplayfocus(
    `type`: downshiftLib.downshiftLibStrings.vrdisplayfocus,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplayfocus(
    `type`: downshiftLib.downshiftLibStrings.vrdisplayfocus,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplayfocus(
    `type`: downshiftLib.downshiftLibStrings.vrdisplayfocus,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplaypointerrestricted(
    `type`: downshiftLib.downshiftLibStrings.vrdisplaypointerrestricted,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplaypointerrestricted(
    `type`: downshiftLib.downshiftLibStrings.vrdisplaypointerrestricted,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplaypointerrestricted(
    `type`: downshiftLib.downshiftLibStrings.vrdisplaypointerrestricted,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplaypointerunrestricted(
    `type`: downshiftLib.downshiftLibStrings.vrdisplaypointerunrestricted,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplaypointerunrestricted(
    `type`: downshiftLib.downshiftLibStrings.vrdisplaypointerunrestricted,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplaypointerunrestricted(
    `type`: downshiftLib.downshiftLibStrings.vrdisplaypointerunrestricted,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplaypresentchange(
    `type`: downshiftLib.downshiftLibStrings.vrdisplaypresentchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplaypresentchange(
    `type`: downshiftLib.downshiftLibStrings.vrdisplaypresentchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplaypresentchange(
    `type`: downshiftLib.downshiftLibStrings.vrdisplaypresentchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_waiting(
    `type`: downshiftLib.downshiftLibStrings.waiting,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_waiting(
    `type`: downshiftLib.downshiftLibStrings.waiting,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_waiting(
    `type`: downshiftLib.downshiftLibStrings.waiting,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_wheel(
    `type`: downshiftLib.downshiftLibStrings.wheel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.WheelEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_wheel(
    `type`: downshiftLib.downshiftLibStrings.wheel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.WheelEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_wheel(
    `type`: downshiftLib.downshiftLibStrings.wheel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.WheelEvent, _],
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
}

