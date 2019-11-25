package typings.domDashHelpers

import typings.domDashHelpers.cjsAddEventListenerMod.EventHandler
import typings.domDashHelpers.cjsAddEventListenerMod.TaggedEventHandler
import typings.domDashHelpers.cjsTypesMod.CamelProperty
import typings.domDashHelpers.cjsTypesMod.HyphenProperty
import typings.domDashHelpers.cjsTypesMod.Property
import typings.domDashHelpers.domDashHelpersStrings.abort
import typings.domDashHelpers.domDashHelpersStrings.animationcancel
import typings.domDashHelpers.domDashHelpersStrings.animationend
import typings.domDashHelpers.domDashHelpersStrings.animationiteration
import typings.domDashHelpers.domDashHelpersStrings.animationstart
import typings.domDashHelpers.domDashHelpersStrings.auxclick
import typings.domDashHelpers.domDashHelpersStrings.blur
import typings.domDashHelpers.domDashHelpersStrings.cancel
import typings.domDashHelpers.domDashHelpersStrings.canplay
import typings.domDashHelpers.domDashHelpersStrings.canplaythrough
import typings.domDashHelpers.domDashHelpersStrings.change
import typings.domDashHelpers.domDashHelpersStrings.click
import typings.domDashHelpers.domDashHelpersStrings.close
import typings.domDashHelpers.domDashHelpersStrings.contextmenu
import typings.domDashHelpers.domDashHelpersStrings.copy
import typings.domDashHelpers.domDashHelpersStrings.cuechange
import typings.domDashHelpers.domDashHelpersStrings.cut
import typings.domDashHelpers.domDashHelpersStrings.dblclick
import typings.domDashHelpers.domDashHelpersStrings.drag
import typings.domDashHelpers.domDashHelpersStrings.dragend
import typings.domDashHelpers.domDashHelpersStrings.dragenter
import typings.domDashHelpers.domDashHelpersStrings.dragexit
import typings.domDashHelpers.domDashHelpersStrings.dragleave
import typings.domDashHelpers.domDashHelpersStrings.dragover
import typings.domDashHelpers.domDashHelpersStrings.dragstart
import typings.domDashHelpers.domDashHelpersStrings.drop
import typings.domDashHelpers.domDashHelpersStrings.durationchange
import typings.domDashHelpers.domDashHelpersStrings.emptied
import typings.domDashHelpers.domDashHelpersStrings.ended
import typings.domDashHelpers.domDashHelpersStrings.error
import typings.domDashHelpers.domDashHelpersStrings.focus
import typings.domDashHelpers.domDashHelpersStrings.focusin
import typings.domDashHelpers.domDashHelpersStrings.focusout
import typings.domDashHelpers.domDashHelpersStrings.fullscreenchange
import typings.domDashHelpers.domDashHelpersStrings.fullscreenerror
import typings.domDashHelpers.domDashHelpersStrings.gotpointercapture
import typings.domDashHelpers.domDashHelpersStrings.input
import typings.domDashHelpers.domDashHelpersStrings.invalid
import typings.domDashHelpers.domDashHelpersStrings.keydown
import typings.domDashHelpers.domDashHelpersStrings.keypress
import typings.domDashHelpers.domDashHelpersStrings.keyup
import typings.domDashHelpers.domDashHelpersStrings.load
import typings.domDashHelpers.domDashHelpersStrings.loadeddata
import typings.domDashHelpers.domDashHelpersStrings.loadedmetadata
import typings.domDashHelpers.domDashHelpersStrings.loadend
import typings.domDashHelpers.domDashHelpersStrings.loadstart
import typings.domDashHelpers.domDashHelpersStrings.lostpointercapture
import typings.domDashHelpers.domDashHelpersStrings.mousedown
import typings.domDashHelpers.domDashHelpersStrings.mouseenter
import typings.domDashHelpers.domDashHelpersStrings.mouseleave
import typings.domDashHelpers.domDashHelpersStrings.mousemove
import typings.domDashHelpers.domDashHelpersStrings.mouseout
import typings.domDashHelpers.domDashHelpersStrings.mouseover
import typings.domDashHelpers.domDashHelpersStrings.mouseup
import typings.domDashHelpers.domDashHelpersStrings.paste
import typings.domDashHelpers.domDashHelpersStrings.pause
import typings.domDashHelpers.domDashHelpersStrings.play
import typings.domDashHelpers.domDashHelpersStrings.playing
import typings.domDashHelpers.domDashHelpersStrings.pointercancel
import typings.domDashHelpers.domDashHelpersStrings.pointerdown
import typings.domDashHelpers.domDashHelpersStrings.pointerenter
import typings.domDashHelpers.domDashHelpersStrings.pointerleave
import typings.domDashHelpers.domDashHelpersStrings.pointermove
import typings.domDashHelpers.domDashHelpersStrings.pointerout
import typings.domDashHelpers.domDashHelpersStrings.pointerover
import typings.domDashHelpers.domDashHelpersStrings.pointerup
import typings.domDashHelpers.domDashHelpersStrings.progress
import typings.domDashHelpers.domDashHelpersStrings.ratechange
import typings.domDashHelpers.domDashHelpersStrings.reset
import typings.domDashHelpers.domDashHelpersStrings.resize
import typings.domDashHelpers.domDashHelpersStrings.scroll
import typings.domDashHelpers.domDashHelpersStrings.securitypolicyviolation
import typings.domDashHelpers.domDashHelpersStrings.seeked
import typings.domDashHelpers.domDashHelpersStrings.seeking
import typings.domDashHelpers.domDashHelpersStrings.select
import typings.domDashHelpers.domDashHelpersStrings.selectionchange
import typings.domDashHelpers.domDashHelpersStrings.selectstart
import typings.domDashHelpers.domDashHelpersStrings.stalled
import typings.domDashHelpers.domDashHelpersStrings.submit
import typings.domDashHelpers.domDashHelpersStrings.suspend
import typings.domDashHelpers.domDashHelpersStrings.timeupdate
import typings.domDashHelpers.domDashHelpersStrings.toggle
import typings.domDashHelpers.domDashHelpersStrings.touchcancel
import typings.domDashHelpers.domDashHelpersStrings.touchend
import typings.domDashHelpers.domDashHelpersStrings.touchmove
import typings.domDashHelpers.domDashHelpersStrings.touchstart
import typings.domDashHelpers.domDashHelpersStrings.transitioncancel
import typings.domDashHelpers.domDashHelpersStrings.transitionend
import typings.domDashHelpers.domDashHelpersStrings.transitionrun
import typings.domDashHelpers.domDashHelpersStrings.transitionstart
import typings.domDashHelpers.domDashHelpersStrings.volumechange
import typings.domDashHelpers.domDashHelpersStrings.waiting
import typings.domDashHelpers.domDashHelpersStrings.wheel
import typings.std.AddEventListenerOptions
import typings.std.Document
import typings.std.Element
import typings.std.EventListenerOptions
import typings.std.FrameRequestCallback
import typings.std.HTMLElement
import typings.std.Partial
import typings.std.Record
import typings.std.SVGElement
import typings.std.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dom-helpers", JSImport.Namespace)
@js.native
object domDashHelpersMod extends js.Object {
  val requestAnimationFrame: js.Function1[/* callback */ FrameRequestCallback, Double] = js.native
  def activeElement(): Element | Null = js.native
  def activeElement(doc: Document): Element | Null = js.native
  def addClass(element: Element, className: String): Unit = js.native
  def addClass(element: SVGElement, className: String): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_abort(node: HTMLElement, eventName: abort, handler: TaggedEventHandler[abort]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_abort(node: HTMLElement, eventName: abort, handler: TaggedEventHandler[abort], options: Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_abort(
    node: HTMLElement,
    eventName: abort,
    handler: TaggedEventHandler[abort],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationcancel(node: HTMLElement, eventName: animationcancel, handler: TaggedEventHandler[animationcancel]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationcancel(
    node: HTMLElement,
    eventName: animationcancel,
    handler: TaggedEventHandler[animationcancel],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationcancel(
    node: HTMLElement,
    eventName: animationcancel,
    handler: TaggedEventHandler[animationcancel],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationend(node: HTMLElement, eventName: animationend, handler: TaggedEventHandler[animationend]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationend(
    node: HTMLElement,
    eventName: animationend,
    handler: TaggedEventHandler[animationend],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationend(
    node: HTMLElement,
    eventName: animationend,
    handler: TaggedEventHandler[animationend],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationiteration(node: HTMLElement, eventName: animationiteration, handler: TaggedEventHandler[animationiteration]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationiteration(
    node: HTMLElement,
    eventName: animationiteration,
    handler: TaggedEventHandler[animationiteration],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationiteration(
    node: HTMLElement,
    eventName: animationiteration,
    handler: TaggedEventHandler[animationiteration],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationstart(node: HTMLElement, eventName: animationstart, handler: TaggedEventHandler[animationstart]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationstart(
    node: HTMLElement,
    eventName: animationstart,
    handler: TaggedEventHandler[animationstart],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationstart(
    node: HTMLElement,
    eventName: animationstart,
    handler: TaggedEventHandler[animationstart],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_auxclick(node: HTMLElement, eventName: auxclick, handler: TaggedEventHandler[auxclick]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_auxclick(node: HTMLElement, eventName: auxclick, handler: TaggedEventHandler[auxclick], options: Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_auxclick(
    node: HTMLElement,
    eventName: auxclick,
    handler: TaggedEventHandler[auxclick],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_blur(node: HTMLElement, eventName: blur, handler: TaggedEventHandler[blur]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_blur(node: HTMLElement, eventName: blur, handler: TaggedEventHandler[blur], options: Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_blur(
    node: HTMLElement,
    eventName: blur,
    handler: TaggedEventHandler[blur],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cancel(node: HTMLElement, eventName: cancel, handler: TaggedEventHandler[cancel]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cancel(node: HTMLElement, eventName: cancel, handler: TaggedEventHandler[cancel], options: Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cancel(
    node: HTMLElement,
    eventName: cancel,
    handler: TaggedEventHandler[cancel],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_canplay(node: HTMLElement, eventName: canplay, handler: TaggedEventHandler[canplay]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_canplay(node: HTMLElement, eventName: canplay, handler: TaggedEventHandler[canplay], options: Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_canplay(
    node: HTMLElement,
    eventName: canplay,
    handler: TaggedEventHandler[canplay],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_canplaythrough(node: HTMLElement, eventName: canplaythrough, handler: TaggedEventHandler[canplaythrough]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_canplaythrough(
    node: HTMLElement,
    eventName: canplaythrough,
    handler: TaggedEventHandler[canplaythrough],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_canplaythrough(
    node: HTMLElement,
    eventName: canplaythrough,
    handler: TaggedEventHandler[canplaythrough],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_change(node: HTMLElement, eventName: change, handler: TaggedEventHandler[change]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_change(node: HTMLElement, eventName: change, handler: TaggedEventHandler[change], options: Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_change(
    node: HTMLElement,
    eventName: change,
    handler: TaggedEventHandler[change],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_click(node: HTMLElement, eventName: click, handler: TaggedEventHandler[click]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_click(node: HTMLElement, eventName: click, handler: TaggedEventHandler[click], options: Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_click(
    node: HTMLElement,
    eventName: click,
    handler: TaggedEventHandler[click],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_close(node: HTMLElement, eventName: close, handler: TaggedEventHandler[close]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_close(node: HTMLElement, eventName: close, handler: TaggedEventHandler[close], options: Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_close(
    node: HTMLElement,
    eventName: close,
    handler: TaggedEventHandler[close],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_contextmenu(node: HTMLElement, eventName: contextmenu, handler: TaggedEventHandler[contextmenu]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_contextmenu(
    node: HTMLElement,
    eventName: contextmenu,
    handler: TaggedEventHandler[contextmenu],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_contextmenu(
    node: HTMLElement,
    eventName: contextmenu,
    handler: TaggedEventHandler[contextmenu],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_copy(node: HTMLElement, eventName: copy, handler: TaggedEventHandler[copy]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_copy(node: HTMLElement, eventName: copy, handler: TaggedEventHandler[copy], options: Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_copy(
    node: HTMLElement,
    eventName: copy,
    handler: TaggedEventHandler[copy],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cuechange(node: HTMLElement, eventName: cuechange, handler: TaggedEventHandler[cuechange]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cuechange(node: HTMLElement, eventName: cuechange, handler: TaggedEventHandler[cuechange], options: Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cuechange(
    node: HTMLElement,
    eventName: cuechange,
    handler: TaggedEventHandler[cuechange],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cut(node: HTMLElement, eventName: cut, handler: TaggedEventHandler[cut]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cut(node: HTMLElement, eventName: cut, handler: TaggedEventHandler[cut], options: Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cut(
    node: HTMLElement,
    eventName: cut,
    handler: TaggedEventHandler[cut],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dblclick(node: HTMLElement, eventName: dblclick, handler: TaggedEventHandler[dblclick]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dblclick(node: HTMLElement, eventName: dblclick, handler: TaggedEventHandler[dblclick], options: Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dblclick(
    node: HTMLElement,
    eventName: dblclick,
    handler: TaggedEventHandler[dblclick],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_drag(node: HTMLElement, eventName: drag, handler: TaggedEventHandler[drag]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_drag(node: HTMLElement, eventName: drag, handler: TaggedEventHandler[drag], options: Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_drag(
    node: HTMLElement,
    eventName: drag,
    handler: TaggedEventHandler[drag],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragend(node: HTMLElement, eventName: dragend, handler: TaggedEventHandler[dragend]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragend(node: HTMLElement, eventName: dragend, handler: TaggedEventHandler[dragend], options: Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragend(
    node: HTMLElement,
    eventName: dragend,
    handler: TaggedEventHandler[dragend],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragenter(node: HTMLElement, eventName: dragenter, handler: TaggedEventHandler[dragenter]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragenter(node: HTMLElement, eventName: dragenter, handler: TaggedEventHandler[dragenter], options: Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragenter(
    node: HTMLElement,
    eventName: dragenter,
    handler: TaggedEventHandler[dragenter],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragexit(node: HTMLElement, eventName: dragexit, handler: TaggedEventHandler[dragexit]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragexit(node: HTMLElement, eventName: dragexit, handler: TaggedEventHandler[dragexit], options: Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragexit(
    node: HTMLElement,
    eventName: dragexit,
    handler: TaggedEventHandler[dragexit],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragleave(node: HTMLElement, eventName: dragleave, handler: TaggedEventHandler[dragleave]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragleave(node: HTMLElement, eventName: dragleave, handler: TaggedEventHandler[dragleave], options: Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragleave(
    node: HTMLElement,
    eventName: dragleave,
    handler: TaggedEventHandler[dragleave],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragover(node: HTMLElement, eventName: dragover, handler: TaggedEventHandler[dragover]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragover(node: HTMLElement, eventName: dragover, handler: TaggedEventHandler[dragover], options: Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragover(
    node: HTMLElement,
    eventName: dragover,
    handler: TaggedEventHandler[dragover],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragstart(node: HTMLElement, eventName: dragstart, handler: TaggedEventHandler[dragstart]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragstart(node: HTMLElement, eventName: dragstart, handler: TaggedEventHandler[dragstart], options: Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragstart(
    node: HTMLElement,
    eventName: dragstart,
    handler: TaggedEventHandler[dragstart],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_drop(node: HTMLElement, eventName: drop, handler: TaggedEventHandler[drop]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_drop(node: HTMLElement, eventName: drop, handler: TaggedEventHandler[drop], options: Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_drop(
    node: HTMLElement,
    eventName: drop,
    handler: TaggedEventHandler[drop],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_durationchange(node: HTMLElement, eventName: durationchange, handler: TaggedEventHandler[durationchange]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_durationchange(
    node: HTMLElement,
    eventName: durationchange,
    handler: TaggedEventHandler[durationchange],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_durationchange(
    node: HTMLElement,
    eventName: durationchange,
    handler: TaggedEventHandler[durationchange],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_emptied(node: HTMLElement, eventName: emptied, handler: TaggedEventHandler[emptied]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_emptied(node: HTMLElement, eventName: emptied, handler: TaggedEventHandler[emptied], options: Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_emptied(
    node: HTMLElement,
    eventName: emptied,
    handler: TaggedEventHandler[emptied],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ended(node: HTMLElement, eventName: ended, handler: TaggedEventHandler[ended]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ended(node: HTMLElement, eventName: ended, handler: TaggedEventHandler[ended], options: Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ended(
    node: HTMLElement,
    eventName: ended,
    handler: TaggedEventHandler[ended],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(node: HTMLElement, eventName: error, handler: TaggedEventHandler[error]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(node: HTMLElement, eventName: error, handler: TaggedEventHandler[error], options: Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(
    node: HTMLElement,
    eventName: error,
    handler: TaggedEventHandler[error],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_focus(node: HTMLElement, eventName: focus, handler: TaggedEventHandler[focus]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_focus(node: HTMLElement, eventName: focus, handler: TaggedEventHandler[focus], options: Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_focus(
    node: HTMLElement,
    eventName: focus,
    handler: TaggedEventHandler[focus],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_focusin(node: HTMLElement, eventName: focusin, handler: TaggedEventHandler[focusin]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_focusin(node: HTMLElement, eventName: focusin, handler: TaggedEventHandler[focusin], options: Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_focusin(
    node: HTMLElement,
    eventName: focusin,
    handler: TaggedEventHandler[focusin],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_focusout(node: HTMLElement, eventName: focusout, handler: TaggedEventHandler[focusout]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_focusout(node: HTMLElement, eventName: focusout, handler: TaggedEventHandler[focusout], options: Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_focusout(
    node: HTMLElement,
    eventName: focusout,
    handler: TaggedEventHandler[focusout],
    options: AddEventListenerOptions
  ): Unit = js.native
  /**
    * An `addEventListener` ponyfill, supports the `once` option
    */
  @JSName("addEventListener")
  def addEventListener_fullscreenchange(node: HTMLElement, eventName: fullscreenchange, handler: TaggedEventHandler[fullscreenchange]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_fullscreenchange(
    node: HTMLElement,
    eventName: fullscreenchange,
    handler: TaggedEventHandler[fullscreenchange],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_fullscreenchange(
    node: HTMLElement,
    eventName: fullscreenchange,
    handler: TaggedEventHandler[fullscreenchange],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_fullscreenerror(node: HTMLElement, eventName: fullscreenerror, handler: TaggedEventHandler[fullscreenerror]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_fullscreenerror(
    node: HTMLElement,
    eventName: fullscreenerror,
    handler: TaggedEventHandler[fullscreenerror],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_fullscreenerror(
    node: HTMLElement,
    eventName: fullscreenerror,
    handler: TaggedEventHandler[fullscreenerror],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_gotpointercapture(node: HTMLElement, eventName: gotpointercapture, handler: TaggedEventHandler[gotpointercapture]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_gotpointercapture(
    node: HTMLElement,
    eventName: gotpointercapture,
    handler: TaggedEventHandler[gotpointercapture],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_gotpointercapture(
    node: HTMLElement,
    eventName: gotpointercapture,
    handler: TaggedEventHandler[gotpointercapture],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_input(node: HTMLElement, eventName: input, handler: TaggedEventHandler[input]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_input(node: HTMLElement, eventName: input, handler: TaggedEventHandler[input], options: Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_input(
    node: HTMLElement,
    eventName: input,
    handler: TaggedEventHandler[input],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_invalid(node: HTMLElement, eventName: invalid, handler: TaggedEventHandler[invalid]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_invalid(node: HTMLElement, eventName: invalid, handler: TaggedEventHandler[invalid], options: Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_invalid(
    node: HTMLElement,
    eventName: invalid,
    handler: TaggedEventHandler[invalid],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_keydown(node: HTMLElement, eventName: keydown, handler: TaggedEventHandler[keydown]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_keydown(node: HTMLElement, eventName: keydown, handler: TaggedEventHandler[keydown], options: Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_keydown(
    node: HTMLElement,
    eventName: keydown,
    handler: TaggedEventHandler[keydown],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_keypress(node: HTMLElement, eventName: keypress, handler: TaggedEventHandler[keypress]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_keypress(node: HTMLElement, eventName: keypress, handler: TaggedEventHandler[keypress], options: Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_keypress(
    node: HTMLElement,
    eventName: keypress,
    handler: TaggedEventHandler[keypress],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_keyup(node: HTMLElement, eventName: keyup, handler: TaggedEventHandler[keyup]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_keyup(node: HTMLElement, eventName: keyup, handler: TaggedEventHandler[keyup], options: Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_keyup(
    node: HTMLElement,
    eventName: keyup,
    handler: TaggedEventHandler[keyup],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_load(node: HTMLElement, eventName: load, handler: TaggedEventHandler[load]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_load(node: HTMLElement, eventName: load, handler: TaggedEventHandler[load], options: Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_load(
    node: HTMLElement,
    eventName: load,
    handler: TaggedEventHandler[load],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadeddata(node: HTMLElement, eventName: loadeddata, handler: TaggedEventHandler[loadeddata]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadeddata(
    node: HTMLElement,
    eventName: loadeddata,
    handler: TaggedEventHandler[loadeddata],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadeddata(
    node: HTMLElement,
    eventName: loadeddata,
    handler: TaggedEventHandler[loadeddata],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadedmetadata(node: HTMLElement, eventName: loadedmetadata, handler: TaggedEventHandler[loadedmetadata]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadedmetadata(
    node: HTMLElement,
    eventName: loadedmetadata,
    handler: TaggedEventHandler[loadedmetadata],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadedmetadata(
    node: HTMLElement,
    eventName: loadedmetadata,
    handler: TaggedEventHandler[loadedmetadata],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadend(node: HTMLElement, eventName: loadend, handler: TaggedEventHandler[loadend]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadend(node: HTMLElement, eventName: loadend, handler: TaggedEventHandler[loadend], options: Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadend(
    node: HTMLElement,
    eventName: loadend,
    handler: TaggedEventHandler[loadend],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadstart(node: HTMLElement, eventName: loadstart, handler: TaggedEventHandler[loadstart]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadstart(node: HTMLElement, eventName: loadstart, handler: TaggedEventHandler[loadstart], options: Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadstart(
    node: HTMLElement,
    eventName: loadstart,
    handler: TaggedEventHandler[loadstart],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_lostpointercapture(node: HTMLElement, eventName: lostpointercapture, handler: TaggedEventHandler[lostpointercapture]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_lostpointercapture(
    node: HTMLElement,
    eventName: lostpointercapture,
    handler: TaggedEventHandler[lostpointercapture],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_lostpointercapture(
    node: HTMLElement,
    eventName: lostpointercapture,
    handler: TaggedEventHandler[lostpointercapture],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mousedown(node: HTMLElement, eventName: mousedown, handler: TaggedEventHandler[mousedown]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mousedown(node: HTMLElement, eventName: mousedown, handler: TaggedEventHandler[mousedown], options: Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mousedown(
    node: HTMLElement,
    eventName: mousedown,
    handler: TaggedEventHandler[mousedown],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseenter(node: HTMLElement, eventName: mouseenter, handler: TaggedEventHandler[mouseenter]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseenter(
    node: HTMLElement,
    eventName: mouseenter,
    handler: TaggedEventHandler[mouseenter],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseenter(
    node: HTMLElement,
    eventName: mouseenter,
    handler: TaggedEventHandler[mouseenter],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseleave(node: HTMLElement, eventName: mouseleave, handler: TaggedEventHandler[mouseleave]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseleave(
    node: HTMLElement,
    eventName: mouseleave,
    handler: TaggedEventHandler[mouseleave],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseleave(
    node: HTMLElement,
    eventName: mouseleave,
    handler: TaggedEventHandler[mouseleave],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mousemove(node: HTMLElement, eventName: mousemove, handler: TaggedEventHandler[mousemove]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mousemove(node: HTMLElement, eventName: mousemove, handler: TaggedEventHandler[mousemove], options: Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mousemove(
    node: HTMLElement,
    eventName: mousemove,
    handler: TaggedEventHandler[mousemove],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseout(node: HTMLElement, eventName: mouseout, handler: TaggedEventHandler[mouseout]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseout(node: HTMLElement, eventName: mouseout, handler: TaggedEventHandler[mouseout], options: Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseout(
    node: HTMLElement,
    eventName: mouseout,
    handler: TaggedEventHandler[mouseout],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseover(node: HTMLElement, eventName: mouseover, handler: TaggedEventHandler[mouseover]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseover(node: HTMLElement, eventName: mouseover, handler: TaggedEventHandler[mouseover], options: Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseover(
    node: HTMLElement,
    eventName: mouseover,
    handler: TaggedEventHandler[mouseover],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseup(node: HTMLElement, eventName: mouseup, handler: TaggedEventHandler[mouseup]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseup(node: HTMLElement, eventName: mouseup, handler: TaggedEventHandler[mouseup], options: Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseup(
    node: HTMLElement,
    eventName: mouseup,
    handler: TaggedEventHandler[mouseup],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_paste(node: HTMLElement, eventName: paste, handler: TaggedEventHandler[paste]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_paste(node: HTMLElement, eventName: paste, handler: TaggedEventHandler[paste], options: Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_paste(
    node: HTMLElement,
    eventName: paste,
    handler: TaggedEventHandler[paste],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pause(node: HTMLElement, eventName: pause, handler: TaggedEventHandler[pause]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pause(node: HTMLElement, eventName: pause, handler: TaggedEventHandler[pause], options: Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pause(
    node: HTMLElement,
    eventName: pause,
    handler: TaggedEventHandler[pause],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_play(node: HTMLElement, eventName: play, handler: TaggedEventHandler[play]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_play(node: HTMLElement, eventName: play, handler: TaggedEventHandler[play], options: Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_play(
    node: HTMLElement,
    eventName: play,
    handler: TaggedEventHandler[play],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_playing(node: HTMLElement, eventName: playing, handler: TaggedEventHandler[playing]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_playing(node: HTMLElement, eventName: playing, handler: TaggedEventHandler[playing], options: Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_playing(
    node: HTMLElement,
    eventName: playing,
    handler: TaggedEventHandler[playing],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointercancel(node: HTMLElement, eventName: pointercancel, handler: TaggedEventHandler[pointercancel]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointercancel(
    node: HTMLElement,
    eventName: pointercancel,
    handler: TaggedEventHandler[pointercancel],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointercancel(
    node: HTMLElement,
    eventName: pointercancel,
    handler: TaggedEventHandler[pointercancel],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerdown(node: HTMLElement, eventName: pointerdown, handler: TaggedEventHandler[pointerdown]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerdown(
    node: HTMLElement,
    eventName: pointerdown,
    handler: TaggedEventHandler[pointerdown],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerdown(
    node: HTMLElement,
    eventName: pointerdown,
    handler: TaggedEventHandler[pointerdown],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerenter(node: HTMLElement, eventName: pointerenter, handler: TaggedEventHandler[pointerenter]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerenter(
    node: HTMLElement,
    eventName: pointerenter,
    handler: TaggedEventHandler[pointerenter],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerenter(
    node: HTMLElement,
    eventName: pointerenter,
    handler: TaggedEventHandler[pointerenter],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerleave(node: HTMLElement, eventName: pointerleave, handler: TaggedEventHandler[pointerleave]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerleave(
    node: HTMLElement,
    eventName: pointerleave,
    handler: TaggedEventHandler[pointerleave],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerleave(
    node: HTMLElement,
    eventName: pointerleave,
    handler: TaggedEventHandler[pointerleave],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointermove(node: HTMLElement, eventName: pointermove, handler: TaggedEventHandler[pointermove]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointermove(
    node: HTMLElement,
    eventName: pointermove,
    handler: TaggedEventHandler[pointermove],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointermove(
    node: HTMLElement,
    eventName: pointermove,
    handler: TaggedEventHandler[pointermove],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerout(node: HTMLElement, eventName: pointerout, handler: TaggedEventHandler[pointerout]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerout(
    node: HTMLElement,
    eventName: pointerout,
    handler: TaggedEventHandler[pointerout],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerout(
    node: HTMLElement,
    eventName: pointerout,
    handler: TaggedEventHandler[pointerout],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerover(node: HTMLElement, eventName: pointerover, handler: TaggedEventHandler[pointerover]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerover(
    node: HTMLElement,
    eventName: pointerover,
    handler: TaggedEventHandler[pointerover],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerover(
    node: HTMLElement,
    eventName: pointerover,
    handler: TaggedEventHandler[pointerover],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerup(node: HTMLElement, eventName: pointerup, handler: TaggedEventHandler[pointerup]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerup(node: HTMLElement, eventName: pointerup, handler: TaggedEventHandler[pointerup], options: Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerup(
    node: HTMLElement,
    eventName: pointerup,
    handler: TaggedEventHandler[pointerup],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_progress(node: HTMLElement, eventName: progress, handler: TaggedEventHandler[progress]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_progress(node: HTMLElement, eventName: progress, handler: TaggedEventHandler[progress], options: Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_progress(
    node: HTMLElement,
    eventName: progress,
    handler: TaggedEventHandler[progress],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ratechange(node: HTMLElement, eventName: ratechange, handler: TaggedEventHandler[ratechange]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ratechange(
    node: HTMLElement,
    eventName: ratechange,
    handler: TaggedEventHandler[ratechange],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ratechange(
    node: HTMLElement,
    eventName: ratechange,
    handler: TaggedEventHandler[ratechange],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_reset(node: HTMLElement, eventName: reset, handler: TaggedEventHandler[reset]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_reset(node: HTMLElement, eventName: reset, handler: TaggedEventHandler[reset], options: Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_reset(
    node: HTMLElement,
    eventName: reset,
    handler: TaggedEventHandler[reset],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_resize(node: HTMLElement, eventName: resize, handler: TaggedEventHandler[resize]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_resize(node: HTMLElement, eventName: resize, handler: TaggedEventHandler[resize], options: Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_resize(
    node: HTMLElement,
    eventName: resize,
    handler: TaggedEventHandler[resize],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_scroll(node: HTMLElement, eventName: scroll, handler: TaggedEventHandler[scroll]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_scroll(node: HTMLElement, eventName: scroll, handler: TaggedEventHandler[scroll], options: Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_scroll(
    node: HTMLElement,
    eventName: scroll,
    handler: TaggedEventHandler[scroll],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_securitypolicyviolation(
    node: HTMLElement,
    eventName: securitypolicyviolation,
    handler: TaggedEventHandler[securitypolicyviolation]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_securitypolicyviolation(
    node: HTMLElement,
    eventName: securitypolicyviolation,
    handler: TaggedEventHandler[securitypolicyviolation],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_securitypolicyviolation(
    node: HTMLElement,
    eventName: securitypolicyviolation,
    handler: TaggedEventHandler[securitypolicyviolation],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_seeked(node: HTMLElement, eventName: seeked, handler: TaggedEventHandler[seeked]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_seeked(node: HTMLElement, eventName: seeked, handler: TaggedEventHandler[seeked], options: Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_seeked(
    node: HTMLElement,
    eventName: seeked,
    handler: TaggedEventHandler[seeked],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_seeking(node: HTMLElement, eventName: seeking, handler: TaggedEventHandler[seeking]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_seeking(node: HTMLElement, eventName: seeking, handler: TaggedEventHandler[seeking], options: Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_seeking(
    node: HTMLElement,
    eventName: seeking,
    handler: TaggedEventHandler[seeking],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_select(node: HTMLElement, eventName: select, handler: TaggedEventHandler[select]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_select(node: HTMLElement, eventName: select, handler: TaggedEventHandler[select], options: Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_select(
    node: HTMLElement,
    eventName: select,
    handler: TaggedEventHandler[select],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectionchange(node: HTMLElement, eventName: selectionchange, handler: TaggedEventHandler[selectionchange]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectionchange(
    node: HTMLElement,
    eventName: selectionchange,
    handler: TaggedEventHandler[selectionchange],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectionchange(
    node: HTMLElement,
    eventName: selectionchange,
    handler: TaggedEventHandler[selectionchange],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectstart(node: HTMLElement, eventName: selectstart, handler: TaggedEventHandler[selectstart]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectstart(
    node: HTMLElement,
    eventName: selectstart,
    handler: TaggedEventHandler[selectstart],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectstart(
    node: HTMLElement,
    eventName: selectstart,
    handler: TaggedEventHandler[selectstart],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_stalled(node: HTMLElement, eventName: stalled, handler: TaggedEventHandler[stalled]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_stalled(node: HTMLElement, eventName: stalled, handler: TaggedEventHandler[stalled], options: Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_stalled(
    node: HTMLElement,
    eventName: stalled,
    handler: TaggedEventHandler[stalled],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_submit(node: HTMLElement, eventName: submit, handler: TaggedEventHandler[submit]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_submit(node: HTMLElement, eventName: submit, handler: TaggedEventHandler[submit], options: Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_submit(
    node: HTMLElement,
    eventName: submit,
    handler: TaggedEventHandler[submit],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_suspend(node: HTMLElement, eventName: suspend, handler: TaggedEventHandler[suspend]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_suspend(node: HTMLElement, eventName: suspend, handler: TaggedEventHandler[suspend], options: Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_suspend(
    node: HTMLElement,
    eventName: suspend,
    handler: TaggedEventHandler[suspend],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_timeupdate(node: HTMLElement, eventName: timeupdate, handler: TaggedEventHandler[timeupdate]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_timeupdate(
    node: HTMLElement,
    eventName: timeupdate,
    handler: TaggedEventHandler[timeupdate],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_timeupdate(
    node: HTMLElement,
    eventName: timeupdate,
    handler: TaggedEventHandler[timeupdate],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_toggle(node: HTMLElement, eventName: toggle, handler: TaggedEventHandler[toggle]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_toggle(node: HTMLElement, eventName: toggle, handler: TaggedEventHandler[toggle], options: Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_toggle(
    node: HTMLElement,
    eventName: toggle,
    handler: TaggedEventHandler[toggle],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchcancel(node: HTMLElement, eventName: touchcancel, handler: TaggedEventHandler[touchcancel]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchcancel(
    node: HTMLElement,
    eventName: touchcancel,
    handler: TaggedEventHandler[touchcancel],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchcancel(
    node: HTMLElement,
    eventName: touchcancel,
    handler: TaggedEventHandler[touchcancel],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchend(node: HTMLElement, eventName: touchend, handler: TaggedEventHandler[touchend]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchend(node: HTMLElement, eventName: touchend, handler: TaggedEventHandler[touchend], options: Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchend(
    node: HTMLElement,
    eventName: touchend,
    handler: TaggedEventHandler[touchend],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchmove(node: HTMLElement, eventName: touchmove, handler: TaggedEventHandler[touchmove]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchmove(node: HTMLElement, eventName: touchmove, handler: TaggedEventHandler[touchmove], options: Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchmove(
    node: HTMLElement,
    eventName: touchmove,
    handler: TaggedEventHandler[touchmove],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchstart(node: HTMLElement, eventName: touchstart, handler: TaggedEventHandler[touchstart]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchstart(
    node: HTMLElement,
    eventName: touchstart,
    handler: TaggedEventHandler[touchstart],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchstart(
    node: HTMLElement,
    eventName: touchstart,
    handler: TaggedEventHandler[touchstart],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitioncancel(node: HTMLElement, eventName: transitioncancel, handler: TaggedEventHandler[transitioncancel]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitioncancel(
    node: HTMLElement,
    eventName: transitioncancel,
    handler: TaggedEventHandler[transitioncancel],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitioncancel(
    node: HTMLElement,
    eventName: transitioncancel,
    handler: TaggedEventHandler[transitioncancel],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitionend(node: HTMLElement, eventName: transitionend, handler: TaggedEventHandler[transitionend]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitionend(
    node: HTMLElement,
    eventName: transitionend,
    handler: TaggedEventHandler[transitionend],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitionend(
    node: HTMLElement,
    eventName: transitionend,
    handler: TaggedEventHandler[transitionend],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitionrun(node: HTMLElement, eventName: transitionrun, handler: TaggedEventHandler[transitionrun]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitionrun(
    node: HTMLElement,
    eventName: transitionrun,
    handler: TaggedEventHandler[transitionrun],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitionrun(
    node: HTMLElement,
    eventName: transitionrun,
    handler: TaggedEventHandler[transitionrun],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitionstart(node: HTMLElement, eventName: transitionstart, handler: TaggedEventHandler[transitionstart]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitionstart(
    node: HTMLElement,
    eventName: transitionstart,
    handler: TaggedEventHandler[transitionstart],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitionstart(
    node: HTMLElement,
    eventName: transitionstart,
    handler: TaggedEventHandler[transitionstart],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_volumechange(node: HTMLElement, eventName: volumechange, handler: TaggedEventHandler[volumechange]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_volumechange(
    node: HTMLElement,
    eventName: volumechange,
    handler: TaggedEventHandler[volumechange],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_volumechange(
    node: HTMLElement,
    eventName: volumechange,
    handler: TaggedEventHandler[volumechange],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_waiting(node: HTMLElement, eventName: waiting, handler: TaggedEventHandler[waiting]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_waiting(node: HTMLElement, eventName: waiting, handler: TaggedEventHandler[waiting], options: Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_waiting(
    node: HTMLElement,
    eventName: waiting,
    handler: TaggedEventHandler[waiting],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_wheel(node: HTMLElement, eventName: wheel, handler: TaggedEventHandler[wheel]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_wheel(node: HTMLElement, eventName: wheel, handler: TaggedEventHandler[wheel], options: Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_wheel(
    node: HTMLElement,
    eventName: wheel,
    handler: TaggedEventHandler[wheel],
    options: AddEventListenerOptions
  ): Unit = js.native
  def cancelAnimationFrame(id: Double): Unit = js.native
  def closest(node: Element, selector: String): Element | Null = js.native
  def closest(node: Element, selector: String, stopAt: Element): Element | Null = js.native
  def contains(context: Element, node: Element): js.UndefOr[Boolean] = js.native
  @JSName("filter")
  def filter_abort(selector: String, handler: EventHandler[abort]): EventHandler[abort] = js.native
  @JSName("filter")
  def filter_animationcancel(selector: String, handler: EventHandler[animationcancel]): EventHandler[animationcancel] = js.native
  @JSName("filter")
  def filter_animationend(selector: String, handler: EventHandler[animationend]): EventHandler[animationend] = js.native
  @JSName("filter")
  def filter_animationiteration(selector: String, handler: EventHandler[animationiteration]): EventHandler[animationiteration] = js.native
  @JSName("filter")
  def filter_animationstart(selector: String, handler: EventHandler[animationstart]): EventHandler[animationstart] = js.native
  @JSName("filter")
  def filter_auxclick(selector: String, handler: EventHandler[auxclick]): EventHandler[auxclick] = js.native
  @JSName("filter")
  def filter_blur(selector: String, handler: EventHandler[blur]): EventHandler[blur] = js.native
  @JSName("filter")
  def filter_cancel(selector: String, handler: EventHandler[cancel]): EventHandler[cancel] = js.native
  @JSName("filter")
  def filter_canplay(selector: String, handler: EventHandler[canplay]): EventHandler[canplay] = js.native
  @JSName("filter")
  def filter_canplaythrough(selector: String, handler: EventHandler[canplaythrough]): EventHandler[canplaythrough] = js.native
  @JSName("filter")
  def filter_change(selector: String, handler: EventHandler[change]): EventHandler[change] = js.native
  @JSName("filter")
  def filter_click(selector: String, handler: EventHandler[click]): EventHandler[click] = js.native
  @JSName("filter")
  def filter_close(selector: String, handler: EventHandler[close]): EventHandler[close] = js.native
  @JSName("filter")
  def filter_contextmenu(selector: String, handler: EventHandler[contextmenu]): EventHandler[contextmenu] = js.native
  @JSName("filter")
  def filter_copy(selector: String, handler: EventHandler[copy]): EventHandler[copy] = js.native
  @JSName("filter")
  def filter_cuechange(selector: String, handler: EventHandler[cuechange]): EventHandler[cuechange] = js.native
  @JSName("filter")
  def filter_cut(selector: String, handler: EventHandler[cut]): EventHandler[cut] = js.native
  @JSName("filter")
  def filter_dblclick(selector: String, handler: EventHandler[dblclick]): EventHandler[dblclick] = js.native
  @JSName("filter")
  def filter_drag(selector: String, handler: EventHandler[drag]): EventHandler[drag] = js.native
  @JSName("filter")
  def filter_dragend(selector: String, handler: EventHandler[dragend]): EventHandler[dragend] = js.native
  @JSName("filter")
  def filter_dragenter(selector: String, handler: EventHandler[dragenter]): EventHandler[dragenter] = js.native
  @JSName("filter")
  def filter_dragexit(selector: String, handler: EventHandler[dragexit]): EventHandler[dragexit] = js.native
  @JSName("filter")
  def filter_dragleave(selector: String, handler: EventHandler[dragleave]): EventHandler[dragleave] = js.native
  @JSName("filter")
  def filter_dragover(selector: String, handler: EventHandler[dragover]): EventHandler[dragover] = js.native
  @JSName("filter")
  def filter_dragstart(selector: String, handler: EventHandler[dragstart]): EventHandler[dragstart] = js.native
  @JSName("filter")
  def filter_drop(selector: String, handler: EventHandler[drop]): EventHandler[drop] = js.native
  @JSName("filter")
  def filter_durationchange(selector: String, handler: EventHandler[durationchange]): EventHandler[durationchange] = js.native
  @JSName("filter")
  def filter_emptied(selector: String, handler: EventHandler[emptied]): EventHandler[emptied] = js.native
  @JSName("filter")
  def filter_ended(selector: String, handler: EventHandler[ended]): EventHandler[ended] = js.native
  @JSName("filter")
  def filter_error(selector: String, handler: EventHandler[error]): EventHandler[error] = js.native
  @JSName("filter")
  def filter_focus(selector: String, handler: EventHandler[focus]): EventHandler[focus] = js.native
  @JSName("filter")
  def filter_focusin(selector: String, handler: EventHandler[focusin]): EventHandler[focusin] = js.native
  @JSName("filter")
  def filter_focusout(selector: String, handler: EventHandler[focusout]): EventHandler[focusout] = js.native
  @JSName("filter")
  def filter_fullscreenchange(selector: String, handler: EventHandler[fullscreenchange]): EventHandler[fullscreenchange] = js.native
  @JSName("filter")
  def filter_fullscreenerror(selector: String, handler: EventHandler[fullscreenerror]): EventHandler[fullscreenerror] = js.native
  @JSName("filter")
  def filter_gotpointercapture(selector: String, handler: EventHandler[gotpointercapture]): EventHandler[gotpointercapture] = js.native
  @JSName("filter")
  def filter_input(selector: String, handler: EventHandler[input]): EventHandler[input] = js.native
  @JSName("filter")
  def filter_invalid(selector: String, handler: EventHandler[invalid]): EventHandler[invalid] = js.native
  @JSName("filter")
  def filter_keydown(selector: String, handler: EventHandler[keydown]): EventHandler[keydown] = js.native
  @JSName("filter")
  def filter_keypress(selector: String, handler: EventHandler[keypress]): EventHandler[keypress] = js.native
  @JSName("filter")
  def filter_keyup(selector: String, handler: EventHandler[keyup]): EventHandler[keyup] = js.native
  @JSName("filter")
  def filter_load(selector: String, handler: EventHandler[load]): EventHandler[load] = js.native
  @JSName("filter")
  def filter_loadeddata(selector: String, handler: EventHandler[loadeddata]): EventHandler[loadeddata] = js.native
  @JSName("filter")
  def filter_loadedmetadata(selector: String, handler: EventHandler[loadedmetadata]): EventHandler[loadedmetadata] = js.native
  @JSName("filter")
  def filter_loadend(selector: String, handler: EventHandler[loadend]): EventHandler[loadend] = js.native
  @JSName("filter")
  def filter_loadstart(selector: String, handler: EventHandler[loadstart]): EventHandler[loadstart] = js.native
  @JSName("filter")
  def filter_lostpointercapture(selector: String, handler: EventHandler[lostpointercapture]): EventHandler[lostpointercapture] = js.native
  @JSName("filter")
  def filter_mousedown(selector: String, handler: EventHandler[mousedown]): EventHandler[mousedown] = js.native
  @JSName("filter")
  def filter_mouseenter(selector: String, handler: EventHandler[mouseenter]): EventHandler[mouseenter] = js.native
  @JSName("filter")
  def filter_mouseleave(selector: String, handler: EventHandler[mouseleave]): EventHandler[mouseleave] = js.native
  @JSName("filter")
  def filter_mousemove(selector: String, handler: EventHandler[mousemove]): EventHandler[mousemove] = js.native
  @JSName("filter")
  def filter_mouseout(selector: String, handler: EventHandler[mouseout]): EventHandler[mouseout] = js.native
  @JSName("filter")
  def filter_mouseover(selector: String, handler: EventHandler[mouseover]): EventHandler[mouseover] = js.native
  @JSName("filter")
  def filter_mouseup(selector: String, handler: EventHandler[mouseup]): EventHandler[mouseup] = js.native
  @JSName("filter")
  def filter_paste(selector: String, handler: EventHandler[paste]): EventHandler[paste] = js.native
  @JSName("filter")
  def filter_pause(selector: String, handler: EventHandler[pause]): EventHandler[pause] = js.native
  @JSName("filter")
  def filter_play(selector: String, handler: EventHandler[play]): EventHandler[play] = js.native
  @JSName("filter")
  def filter_playing(selector: String, handler: EventHandler[playing]): EventHandler[playing] = js.native
  @JSName("filter")
  def filter_pointercancel(selector: String, handler: EventHandler[pointercancel]): EventHandler[pointercancel] = js.native
  @JSName("filter")
  def filter_pointerdown(selector: String, handler: EventHandler[pointerdown]): EventHandler[pointerdown] = js.native
  @JSName("filter")
  def filter_pointerenter(selector: String, handler: EventHandler[pointerenter]): EventHandler[pointerenter] = js.native
  @JSName("filter")
  def filter_pointerleave(selector: String, handler: EventHandler[pointerleave]): EventHandler[pointerleave] = js.native
  @JSName("filter")
  def filter_pointermove(selector: String, handler: EventHandler[pointermove]): EventHandler[pointermove] = js.native
  @JSName("filter")
  def filter_pointerout(selector: String, handler: EventHandler[pointerout]): EventHandler[pointerout] = js.native
  @JSName("filter")
  def filter_pointerover(selector: String, handler: EventHandler[pointerover]): EventHandler[pointerover] = js.native
  @JSName("filter")
  def filter_pointerup(selector: String, handler: EventHandler[pointerup]): EventHandler[pointerup] = js.native
  @JSName("filter")
  def filter_progress(selector: String, handler: EventHandler[progress]): EventHandler[progress] = js.native
  @JSName("filter")
  def filter_ratechange(selector: String, handler: EventHandler[ratechange]): EventHandler[ratechange] = js.native
  @JSName("filter")
  def filter_reset(selector: String, handler: EventHandler[reset]): EventHandler[reset] = js.native
  @JSName("filter")
  def filter_resize(selector: String, handler: EventHandler[resize]): EventHandler[resize] = js.native
  @JSName("filter")
  def filter_scroll(selector: String, handler: EventHandler[scroll]): EventHandler[scroll] = js.native
  @JSName("filter")
  def filter_securitypolicyviolation(selector: String, handler: EventHandler[securitypolicyviolation]): EventHandler[securitypolicyviolation] = js.native
  @JSName("filter")
  def filter_seeked(selector: String, handler: EventHandler[seeked]): EventHandler[seeked] = js.native
  @JSName("filter")
  def filter_seeking(selector: String, handler: EventHandler[seeking]): EventHandler[seeking] = js.native
  @JSName("filter")
  def filter_select(selector: String, handler: EventHandler[select]): EventHandler[select] = js.native
  @JSName("filter")
  def filter_selectionchange(selector: String, handler: EventHandler[selectionchange]): EventHandler[selectionchange] = js.native
  @JSName("filter")
  def filter_selectstart(selector: String, handler: EventHandler[selectstart]): EventHandler[selectstart] = js.native
  @JSName("filter")
  def filter_stalled(selector: String, handler: EventHandler[stalled]): EventHandler[stalled] = js.native
  @JSName("filter")
  def filter_submit(selector: String, handler: EventHandler[submit]): EventHandler[submit] = js.native
  @JSName("filter")
  def filter_suspend(selector: String, handler: EventHandler[suspend]): EventHandler[suspend] = js.native
  @JSName("filter")
  def filter_timeupdate(selector: String, handler: EventHandler[timeupdate]): EventHandler[timeupdate] = js.native
  @JSName("filter")
  def filter_toggle(selector: String, handler: EventHandler[toggle]): EventHandler[toggle] = js.native
  @JSName("filter")
  def filter_touchcancel(selector: String, handler: EventHandler[touchcancel]): EventHandler[touchcancel] = js.native
  @JSName("filter")
  def filter_touchend(selector: String, handler: EventHandler[touchend]): EventHandler[touchend] = js.native
  @JSName("filter")
  def filter_touchmove(selector: String, handler: EventHandler[touchmove]): EventHandler[touchmove] = js.native
  @JSName("filter")
  def filter_touchstart(selector: String, handler: EventHandler[touchstart]): EventHandler[touchstart] = js.native
  @JSName("filter")
  def filter_transitioncancel(selector: String, handler: EventHandler[transitioncancel]): EventHandler[transitioncancel] = js.native
  @JSName("filter")
  def filter_transitionend(selector: String, handler: EventHandler[transitionend]): EventHandler[transitionend] = js.native
  @JSName("filter")
  def filter_transitionrun(selector: String, handler: EventHandler[transitionrun]): EventHandler[transitionrun] = js.native
  @JSName("filter")
  def filter_transitionstart(selector: String, handler: EventHandler[transitionstart]): EventHandler[transitionstart] = js.native
  @JSName("filter")
  def filter_volumechange(selector: String, handler: EventHandler[volumechange]): EventHandler[volumechange] = js.native
  @JSName("filter")
  def filter_waiting(selector: String, handler: EventHandler[waiting]): EventHandler[waiting] = js.native
  @JSName("filter")
  def filter_wheel(selector: String, handler: EventHandler[wheel]): EventHandler[wheel] = js.native
  def hasClass(element: Element, className: String): Boolean = js.native
  def hasClass(element: SVGElement, className: String): Boolean = js.native
  def height(node: HTMLElement): Double = js.native
  def height(node: HTMLElement, client: Boolean): Double = js.native
  @JSName("listen")
  def listen_abort(node: HTMLElement, eventName: abort, handler: EventHandler[abort]): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_abort(node: HTMLElement, eventName: abort, handler: EventHandler[abort], options: Boolean): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_abort(
    node: HTMLElement,
    eventName: abort,
    handler: EventHandler[abort],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_animationcancel(node: HTMLElement, eventName: animationcancel, handler: EventHandler[animationcancel]): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_animationcancel(
    node: HTMLElement,
    eventName: animationcancel,
    handler: EventHandler[animationcancel],
    options: Boolean
  ): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_animationcancel(
    node: HTMLElement,
    eventName: animationcancel,
    handler: EventHandler[animationcancel],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_animationend(node: HTMLElement, eventName: animationend, handler: EventHandler[animationend]): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_animationend(node: HTMLElement, eventName: animationend, handler: EventHandler[animationend], options: Boolean): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_animationend(
    node: HTMLElement,
    eventName: animationend,
    handler: EventHandler[animationend],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_animationiteration(node: HTMLElement, eventName: animationiteration, handler: EventHandler[animationiteration]): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_animationiteration(
    node: HTMLElement,
    eventName: animationiteration,
    handler: EventHandler[animationiteration],
    options: Boolean
  ): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_animationiteration(
    node: HTMLElement,
    eventName: animationiteration,
    handler: EventHandler[animationiteration],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_animationstart(node: HTMLElement, eventName: animationstart, handler: EventHandler[animationstart]): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_animationstart(
    node: HTMLElement,
    eventName: animationstart,
    handler: EventHandler[animationstart],
    options: Boolean
  ): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_animationstart(
    node: HTMLElement,
    eventName: animationstart,
    handler: EventHandler[animationstart],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_auxclick(node: HTMLElement, eventName: auxclick, handler: EventHandler[auxclick]): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_auxclick(node: HTMLElement, eventName: auxclick, handler: EventHandler[auxclick], options: Boolean): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_auxclick(
    node: HTMLElement,
    eventName: auxclick,
    handler: EventHandler[auxclick],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_blur(node: HTMLElement, eventName: blur, handler: EventHandler[blur]): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_blur(node: HTMLElement, eventName: blur, handler: EventHandler[blur], options: Boolean): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_blur(node: HTMLElement, eventName: blur, handler: EventHandler[blur], options: AddEventListenerOptions): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_cancel(node: HTMLElement, eventName: cancel, handler: EventHandler[cancel]): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_cancel(node: HTMLElement, eventName: cancel, handler: EventHandler[cancel], options: Boolean): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_cancel(
    node: HTMLElement,
    eventName: cancel,
    handler: EventHandler[cancel],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_canplay(node: HTMLElement, eventName: canplay, handler: EventHandler[canplay]): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_canplay(node: HTMLElement, eventName: canplay, handler: EventHandler[canplay], options: Boolean): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_canplay(
    node: HTMLElement,
    eventName: canplay,
    handler: EventHandler[canplay],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_canplaythrough(node: HTMLElement, eventName: canplaythrough, handler: EventHandler[canplaythrough]): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_canplaythrough(
    node: HTMLElement,
    eventName: canplaythrough,
    handler: EventHandler[canplaythrough],
    options: Boolean
  ): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_canplaythrough(
    node: HTMLElement,
    eventName: canplaythrough,
    handler: EventHandler[canplaythrough],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_change(node: HTMLElement, eventName: change, handler: EventHandler[change]): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_change(node: HTMLElement, eventName: change, handler: EventHandler[change], options: Boolean): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_change(
    node: HTMLElement,
    eventName: change,
    handler: EventHandler[change],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_click(node: HTMLElement, eventName: click, handler: EventHandler[click]): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_click(node: HTMLElement, eventName: click, handler: EventHandler[click], options: Boolean): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_click(
    node: HTMLElement,
    eventName: click,
    handler: EventHandler[click],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_close(node: HTMLElement, eventName: close, handler: EventHandler[close]): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_close(node: HTMLElement, eventName: close, handler: EventHandler[close], options: Boolean): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_close(
    node: HTMLElement,
    eventName: close,
    handler: EventHandler[close],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_contextmenu(node: HTMLElement, eventName: contextmenu, handler: EventHandler[contextmenu]): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_contextmenu(node: HTMLElement, eventName: contextmenu, handler: EventHandler[contextmenu], options: Boolean): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_contextmenu(
    node: HTMLElement,
    eventName: contextmenu,
    handler: EventHandler[contextmenu],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_copy(node: HTMLElement, eventName: copy, handler: EventHandler[copy]): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_copy(node: HTMLElement, eventName: copy, handler: EventHandler[copy], options: Boolean): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_copy(node: HTMLElement, eventName: copy, handler: EventHandler[copy], options: AddEventListenerOptions): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_cuechange(node: HTMLElement, eventName: cuechange, handler: EventHandler[cuechange]): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_cuechange(node: HTMLElement, eventName: cuechange, handler: EventHandler[cuechange], options: Boolean): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_cuechange(
    node: HTMLElement,
    eventName: cuechange,
    handler: EventHandler[cuechange],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_cut(node: HTMLElement, eventName: cut, handler: EventHandler[cut]): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_cut(node: HTMLElement, eventName: cut, handler: EventHandler[cut], options: Boolean): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_cut(node: HTMLElement, eventName: cut, handler: EventHandler[cut], options: AddEventListenerOptions): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_dblclick(node: HTMLElement, eventName: dblclick, handler: EventHandler[dblclick]): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_dblclick(node: HTMLElement, eventName: dblclick, handler: EventHandler[dblclick], options: Boolean): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_dblclick(
    node: HTMLElement,
    eventName: dblclick,
    handler: EventHandler[dblclick],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_drag(node: HTMLElement, eventName: drag, handler: EventHandler[drag]): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_drag(node: HTMLElement, eventName: drag, handler: EventHandler[drag], options: Boolean): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_drag(node: HTMLElement, eventName: drag, handler: EventHandler[drag], options: AddEventListenerOptions): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_dragend(node: HTMLElement, eventName: dragend, handler: EventHandler[dragend]): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_dragend(node: HTMLElement, eventName: dragend, handler: EventHandler[dragend], options: Boolean): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_dragend(
    node: HTMLElement,
    eventName: dragend,
    handler: EventHandler[dragend],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_dragenter(node: HTMLElement, eventName: dragenter, handler: EventHandler[dragenter]): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_dragenter(node: HTMLElement, eventName: dragenter, handler: EventHandler[dragenter], options: Boolean): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_dragenter(
    node: HTMLElement,
    eventName: dragenter,
    handler: EventHandler[dragenter],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_dragexit(node: HTMLElement, eventName: dragexit, handler: EventHandler[dragexit]): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_dragexit(node: HTMLElement, eventName: dragexit, handler: EventHandler[dragexit], options: Boolean): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_dragexit(
    node: HTMLElement,
    eventName: dragexit,
    handler: EventHandler[dragexit],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_dragleave(node: HTMLElement, eventName: dragleave, handler: EventHandler[dragleave]): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_dragleave(node: HTMLElement, eventName: dragleave, handler: EventHandler[dragleave], options: Boolean): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_dragleave(
    node: HTMLElement,
    eventName: dragleave,
    handler: EventHandler[dragleave],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_dragover(node: HTMLElement, eventName: dragover, handler: EventHandler[dragover]): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_dragover(node: HTMLElement, eventName: dragover, handler: EventHandler[dragover], options: Boolean): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_dragover(
    node: HTMLElement,
    eventName: dragover,
    handler: EventHandler[dragover],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_dragstart(node: HTMLElement, eventName: dragstart, handler: EventHandler[dragstart]): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_dragstart(node: HTMLElement, eventName: dragstart, handler: EventHandler[dragstart], options: Boolean): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_dragstart(
    node: HTMLElement,
    eventName: dragstart,
    handler: EventHandler[dragstart],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_drop(node: HTMLElement, eventName: drop, handler: EventHandler[drop]): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_drop(node: HTMLElement, eventName: drop, handler: EventHandler[drop], options: Boolean): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_drop(node: HTMLElement, eventName: drop, handler: EventHandler[drop], options: AddEventListenerOptions): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_durationchange(node: HTMLElement, eventName: durationchange, handler: EventHandler[durationchange]): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_durationchange(
    node: HTMLElement,
    eventName: durationchange,
    handler: EventHandler[durationchange],
    options: Boolean
  ): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_durationchange(
    node: HTMLElement,
    eventName: durationchange,
    handler: EventHandler[durationchange],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_emptied(node: HTMLElement, eventName: emptied, handler: EventHandler[emptied]): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_emptied(node: HTMLElement, eventName: emptied, handler: EventHandler[emptied], options: Boolean): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_emptied(
    node: HTMLElement,
    eventName: emptied,
    handler: EventHandler[emptied],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_ended(node: HTMLElement, eventName: ended, handler: EventHandler[ended]): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_ended(node: HTMLElement, eventName: ended, handler: EventHandler[ended], options: Boolean): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_ended(
    node: HTMLElement,
    eventName: ended,
    handler: EventHandler[ended],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_error(node: HTMLElement, eventName: error, handler: EventHandler[error]): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_error(node: HTMLElement, eventName: error, handler: EventHandler[error], options: Boolean): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_error(
    node: HTMLElement,
    eventName: error,
    handler: EventHandler[error],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_focus(node: HTMLElement, eventName: focus, handler: EventHandler[focus]): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_focus(node: HTMLElement, eventName: focus, handler: EventHandler[focus], options: Boolean): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_focus(
    node: HTMLElement,
    eventName: focus,
    handler: EventHandler[focus],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_focusin(node: HTMLElement, eventName: focusin, handler: EventHandler[focusin]): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_focusin(node: HTMLElement, eventName: focusin, handler: EventHandler[focusin], options: Boolean): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_focusin(
    node: HTMLElement,
    eventName: focusin,
    handler: EventHandler[focusin],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_focusout(node: HTMLElement, eventName: focusout, handler: EventHandler[focusout]): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_focusout(node: HTMLElement, eventName: focusout, handler: EventHandler[focusout], options: Boolean): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_focusout(
    node: HTMLElement,
    eventName: focusout,
    handler: EventHandler[focusout],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_fullscreenchange(node: HTMLElement, eventName: fullscreenchange, handler: EventHandler[fullscreenchange]): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_fullscreenchange(
    node: HTMLElement,
    eventName: fullscreenchange,
    handler: EventHandler[fullscreenchange],
    options: Boolean
  ): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_fullscreenchange(
    node: HTMLElement,
    eventName: fullscreenchange,
    handler: EventHandler[fullscreenchange],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_fullscreenerror(node: HTMLElement, eventName: fullscreenerror, handler: EventHandler[fullscreenerror]): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_fullscreenerror(
    node: HTMLElement,
    eventName: fullscreenerror,
    handler: EventHandler[fullscreenerror],
    options: Boolean
  ): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_fullscreenerror(
    node: HTMLElement,
    eventName: fullscreenerror,
    handler: EventHandler[fullscreenerror],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_gotpointercapture(node: HTMLElement, eventName: gotpointercapture, handler: EventHandler[gotpointercapture]): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_gotpointercapture(
    node: HTMLElement,
    eventName: gotpointercapture,
    handler: EventHandler[gotpointercapture],
    options: Boolean
  ): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_gotpointercapture(
    node: HTMLElement,
    eventName: gotpointercapture,
    handler: EventHandler[gotpointercapture],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_input(node: HTMLElement, eventName: input, handler: EventHandler[input]): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_input(node: HTMLElement, eventName: input, handler: EventHandler[input], options: Boolean): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_input(
    node: HTMLElement,
    eventName: input,
    handler: EventHandler[input],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_invalid(node: HTMLElement, eventName: invalid, handler: EventHandler[invalid]): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_invalid(node: HTMLElement, eventName: invalid, handler: EventHandler[invalid], options: Boolean): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_invalid(
    node: HTMLElement,
    eventName: invalid,
    handler: EventHandler[invalid],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_keydown(node: HTMLElement, eventName: keydown, handler: EventHandler[keydown]): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_keydown(node: HTMLElement, eventName: keydown, handler: EventHandler[keydown], options: Boolean): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_keydown(
    node: HTMLElement,
    eventName: keydown,
    handler: EventHandler[keydown],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_keypress(node: HTMLElement, eventName: keypress, handler: EventHandler[keypress]): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_keypress(node: HTMLElement, eventName: keypress, handler: EventHandler[keypress], options: Boolean): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_keypress(
    node: HTMLElement,
    eventName: keypress,
    handler: EventHandler[keypress],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_keyup(node: HTMLElement, eventName: keyup, handler: EventHandler[keyup]): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_keyup(node: HTMLElement, eventName: keyup, handler: EventHandler[keyup], options: Boolean): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_keyup(
    node: HTMLElement,
    eventName: keyup,
    handler: EventHandler[keyup],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_load(node: HTMLElement, eventName: load, handler: EventHandler[load]): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_load(node: HTMLElement, eventName: load, handler: EventHandler[load], options: Boolean): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_load(node: HTMLElement, eventName: load, handler: EventHandler[load], options: AddEventListenerOptions): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_loadeddata(node: HTMLElement, eventName: loadeddata, handler: EventHandler[loadeddata]): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_loadeddata(node: HTMLElement, eventName: loadeddata, handler: EventHandler[loadeddata], options: Boolean): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_loadeddata(
    node: HTMLElement,
    eventName: loadeddata,
    handler: EventHandler[loadeddata],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_loadedmetadata(node: HTMLElement, eventName: loadedmetadata, handler: EventHandler[loadedmetadata]): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_loadedmetadata(
    node: HTMLElement,
    eventName: loadedmetadata,
    handler: EventHandler[loadedmetadata],
    options: Boolean
  ): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_loadedmetadata(
    node: HTMLElement,
    eventName: loadedmetadata,
    handler: EventHandler[loadedmetadata],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_loadend(node: HTMLElement, eventName: loadend, handler: EventHandler[loadend]): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_loadend(node: HTMLElement, eventName: loadend, handler: EventHandler[loadend], options: Boolean): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_loadend(
    node: HTMLElement,
    eventName: loadend,
    handler: EventHandler[loadend],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_loadstart(node: HTMLElement, eventName: loadstart, handler: EventHandler[loadstart]): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_loadstart(node: HTMLElement, eventName: loadstart, handler: EventHandler[loadstart], options: Boolean): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_loadstart(
    node: HTMLElement,
    eventName: loadstart,
    handler: EventHandler[loadstart],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_lostpointercapture(node: HTMLElement, eventName: lostpointercapture, handler: EventHandler[lostpointercapture]): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_lostpointercapture(
    node: HTMLElement,
    eventName: lostpointercapture,
    handler: EventHandler[lostpointercapture],
    options: Boolean
  ): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_lostpointercapture(
    node: HTMLElement,
    eventName: lostpointercapture,
    handler: EventHandler[lostpointercapture],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_mousedown(node: HTMLElement, eventName: mousedown, handler: EventHandler[mousedown]): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_mousedown(node: HTMLElement, eventName: mousedown, handler: EventHandler[mousedown], options: Boolean): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_mousedown(
    node: HTMLElement,
    eventName: mousedown,
    handler: EventHandler[mousedown],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_mouseenter(node: HTMLElement, eventName: mouseenter, handler: EventHandler[mouseenter]): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_mouseenter(node: HTMLElement, eventName: mouseenter, handler: EventHandler[mouseenter], options: Boolean): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_mouseenter(
    node: HTMLElement,
    eventName: mouseenter,
    handler: EventHandler[mouseenter],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_mouseleave(node: HTMLElement, eventName: mouseleave, handler: EventHandler[mouseleave]): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_mouseleave(node: HTMLElement, eventName: mouseleave, handler: EventHandler[mouseleave], options: Boolean): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_mouseleave(
    node: HTMLElement,
    eventName: mouseleave,
    handler: EventHandler[mouseleave],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_mousemove(node: HTMLElement, eventName: mousemove, handler: EventHandler[mousemove]): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_mousemove(node: HTMLElement, eventName: mousemove, handler: EventHandler[mousemove], options: Boolean): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_mousemove(
    node: HTMLElement,
    eventName: mousemove,
    handler: EventHandler[mousemove],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_mouseout(node: HTMLElement, eventName: mouseout, handler: EventHandler[mouseout]): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_mouseout(node: HTMLElement, eventName: mouseout, handler: EventHandler[mouseout], options: Boolean): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_mouseout(
    node: HTMLElement,
    eventName: mouseout,
    handler: EventHandler[mouseout],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_mouseover(node: HTMLElement, eventName: mouseover, handler: EventHandler[mouseover]): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_mouseover(node: HTMLElement, eventName: mouseover, handler: EventHandler[mouseover], options: Boolean): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_mouseover(
    node: HTMLElement,
    eventName: mouseover,
    handler: EventHandler[mouseover],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_mouseup(node: HTMLElement, eventName: mouseup, handler: EventHandler[mouseup]): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_mouseup(node: HTMLElement, eventName: mouseup, handler: EventHandler[mouseup], options: Boolean): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_mouseup(
    node: HTMLElement,
    eventName: mouseup,
    handler: EventHandler[mouseup],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_paste(node: HTMLElement, eventName: paste, handler: EventHandler[paste]): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_paste(node: HTMLElement, eventName: paste, handler: EventHandler[paste], options: Boolean): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_paste(
    node: HTMLElement,
    eventName: paste,
    handler: EventHandler[paste],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_pause(node: HTMLElement, eventName: pause, handler: EventHandler[pause]): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_pause(node: HTMLElement, eventName: pause, handler: EventHandler[pause], options: Boolean): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_pause(
    node: HTMLElement,
    eventName: pause,
    handler: EventHandler[pause],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_play(node: HTMLElement, eventName: play, handler: EventHandler[play]): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_play(node: HTMLElement, eventName: play, handler: EventHandler[play], options: Boolean): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_play(node: HTMLElement, eventName: play, handler: EventHandler[play], options: AddEventListenerOptions): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_playing(node: HTMLElement, eventName: playing, handler: EventHandler[playing]): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_playing(node: HTMLElement, eventName: playing, handler: EventHandler[playing], options: Boolean): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_playing(
    node: HTMLElement,
    eventName: playing,
    handler: EventHandler[playing],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_pointercancel(node: HTMLElement, eventName: pointercancel, handler: EventHandler[pointercancel]): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_pointercancel(
    node: HTMLElement,
    eventName: pointercancel,
    handler: EventHandler[pointercancel],
    options: Boolean
  ): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_pointercancel(
    node: HTMLElement,
    eventName: pointercancel,
    handler: EventHandler[pointercancel],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_pointerdown(node: HTMLElement, eventName: pointerdown, handler: EventHandler[pointerdown]): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_pointerdown(node: HTMLElement, eventName: pointerdown, handler: EventHandler[pointerdown], options: Boolean): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_pointerdown(
    node: HTMLElement,
    eventName: pointerdown,
    handler: EventHandler[pointerdown],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_pointerenter(node: HTMLElement, eventName: pointerenter, handler: EventHandler[pointerenter]): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_pointerenter(node: HTMLElement, eventName: pointerenter, handler: EventHandler[pointerenter], options: Boolean): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_pointerenter(
    node: HTMLElement,
    eventName: pointerenter,
    handler: EventHandler[pointerenter],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_pointerleave(node: HTMLElement, eventName: pointerleave, handler: EventHandler[pointerleave]): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_pointerleave(node: HTMLElement, eventName: pointerleave, handler: EventHandler[pointerleave], options: Boolean): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_pointerleave(
    node: HTMLElement,
    eventName: pointerleave,
    handler: EventHandler[pointerleave],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_pointermove(node: HTMLElement, eventName: pointermove, handler: EventHandler[pointermove]): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_pointermove(node: HTMLElement, eventName: pointermove, handler: EventHandler[pointermove], options: Boolean): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_pointermove(
    node: HTMLElement,
    eventName: pointermove,
    handler: EventHandler[pointermove],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_pointerout(node: HTMLElement, eventName: pointerout, handler: EventHandler[pointerout]): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_pointerout(node: HTMLElement, eventName: pointerout, handler: EventHandler[pointerout], options: Boolean): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_pointerout(
    node: HTMLElement,
    eventName: pointerout,
    handler: EventHandler[pointerout],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_pointerover(node: HTMLElement, eventName: pointerover, handler: EventHandler[pointerover]): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_pointerover(node: HTMLElement, eventName: pointerover, handler: EventHandler[pointerover], options: Boolean): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_pointerover(
    node: HTMLElement,
    eventName: pointerover,
    handler: EventHandler[pointerover],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_pointerup(node: HTMLElement, eventName: pointerup, handler: EventHandler[pointerup]): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_pointerup(node: HTMLElement, eventName: pointerup, handler: EventHandler[pointerup], options: Boolean): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_pointerup(
    node: HTMLElement,
    eventName: pointerup,
    handler: EventHandler[pointerup],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_progress(node: HTMLElement, eventName: progress, handler: EventHandler[progress]): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_progress(node: HTMLElement, eventName: progress, handler: EventHandler[progress], options: Boolean): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_progress(
    node: HTMLElement,
    eventName: progress,
    handler: EventHandler[progress],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_ratechange(node: HTMLElement, eventName: ratechange, handler: EventHandler[ratechange]): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_ratechange(node: HTMLElement, eventName: ratechange, handler: EventHandler[ratechange], options: Boolean): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_ratechange(
    node: HTMLElement,
    eventName: ratechange,
    handler: EventHandler[ratechange],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_reset(node: HTMLElement, eventName: reset, handler: EventHandler[reset]): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_reset(node: HTMLElement, eventName: reset, handler: EventHandler[reset], options: Boolean): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_reset(
    node: HTMLElement,
    eventName: reset,
    handler: EventHandler[reset],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_resize(node: HTMLElement, eventName: resize, handler: EventHandler[resize]): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_resize(node: HTMLElement, eventName: resize, handler: EventHandler[resize], options: Boolean): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_resize(
    node: HTMLElement,
    eventName: resize,
    handler: EventHandler[resize],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_scroll(node: HTMLElement, eventName: scroll, handler: EventHandler[scroll]): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_scroll(node: HTMLElement, eventName: scroll, handler: EventHandler[scroll], options: Boolean): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_scroll(
    node: HTMLElement,
    eventName: scroll,
    handler: EventHandler[scroll],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_securitypolicyviolation(
    node: HTMLElement,
    eventName: securitypolicyviolation,
    handler: EventHandler[securitypolicyviolation]
  ): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_securitypolicyviolation(
    node: HTMLElement,
    eventName: securitypolicyviolation,
    handler: EventHandler[securitypolicyviolation],
    options: Boolean
  ): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_securitypolicyviolation(
    node: HTMLElement,
    eventName: securitypolicyviolation,
    handler: EventHandler[securitypolicyviolation],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_seeked(node: HTMLElement, eventName: seeked, handler: EventHandler[seeked]): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_seeked(node: HTMLElement, eventName: seeked, handler: EventHandler[seeked], options: Boolean): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_seeked(
    node: HTMLElement,
    eventName: seeked,
    handler: EventHandler[seeked],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_seeking(node: HTMLElement, eventName: seeking, handler: EventHandler[seeking]): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_seeking(node: HTMLElement, eventName: seeking, handler: EventHandler[seeking], options: Boolean): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_seeking(
    node: HTMLElement,
    eventName: seeking,
    handler: EventHandler[seeking],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_select(node: HTMLElement, eventName: select, handler: EventHandler[select]): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_select(node: HTMLElement, eventName: select, handler: EventHandler[select], options: Boolean): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_select(
    node: HTMLElement,
    eventName: select,
    handler: EventHandler[select],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_selectionchange(node: HTMLElement, eventName: selectionchange, handler: EventHandler[selectionchange]): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_selectionchange(
    node: HTMLElement,
    eventName: selectionchange,
    handler: EventHandler[selectionchange],
    options: Boolean
  ): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_selectionchange(
    node: HTMLElement,
    eventName: selectionchange,
    handler: EventHandler[selectionchange],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_selectstart(node: HTMLElement, eventName: selectstart, handler: EventHandler[selectstart]): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_selectstart(node: HTMLElement, eventName: selectstart, handler: EventHandler[selectstart], options: Boolean): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_selectstart(
    node: HTMLElement,
    eventName: selectstart,
    handler: EventHandler[selectstart],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_stalled(node: HTMLElement, eventName: stalled, handler: EventHandler[stalled]): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_stalled(node: HTMLElement, eventName: stalled, handler: EventHandler[stalled], options: Boolean): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_stalled(
    node: HTMLElement,
    eventName: stalled,
    handler: EventHandler[stalled],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_submit(node: HTMLElement, eventName: submit, handler: EventHandler[submit]): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_submit(node: HTMLElement, eventName: submit, handler: EventHandler[submit], options: Boolean): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_submit(
    node: HTMLElement,
    eventName: submit,
    handler: EventHandler[submit],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_suspend(node: HTMLElement, eventName: suspend, handler: EventHandler[suspend]): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_suspend(node: HTMLElement, eventName: suspend, handler: EventHandler[suspend], options: Boolean): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_suspend(
    node: HTMLElement,
    eventName: suspend,
    handler: EventHandler[suspend],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_timeupdate(node: HTMLElement, eventName: timeupdate, handler: EventHandler[timeupdate]): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_timeupdate(node: HTMLElement, eventName: timeupdate, handler: EventHandler[timeupdate], options: Boolean): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_timeupdate(
    node: HTMLElement,
    eventName: timeupdate,
    handler: EventHandler[timeupdate],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_toggle(node: HTMLElement, eventName: toggle, handler: EventHandler[toggle]): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_toggle(node: HTMLElement, eventName: toggle, handler: EventHandler[toggle], options: Boolean): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_toggle(
    node: HTMLElement,
    eventName: toggle,
    handler: EventHandler[toggle],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_touchcancel(node: HTMLElement, eventName: touchcancel, handler: EventHandler[touchcancel]): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_touchcancel(node: HTMLElement, eventName: touchcancel, handler: EventHandler[touchcancel], options: Boolean): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_touchcancel(
    node: HTMLElement,
    eventName: touchcancel,
    handler: EventHandler[touchcancel],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_touchend(node: HTMLElement, eventName: touchend, handler: EventHandler[touchend]): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_touchend(node: HTMLElement, eventName: touchend, handler: EventHandler[touchend], options: Boolean): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_touchend(
    node: HTMLElement,
    eventName: touchend,
    handler: EventHandler[touchend],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_touchmove(node: HTMLElement, eventName: touchmove, handler: EventHandler[touchmove]): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_touchmove(node: HTMLElement, eventName: touchmove, handler: EventHandler[touchmove], options: Boolean): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_touchmove(
    node: HTMLElement,
    eventName: touchmove,
    handler: EventHandler[touchmove],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_touchstart(node: HTMLElement, eventName: touchstart, handler: EventHandler[touchstart]): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_touchstart(node: HTMLElement, eventName: touchstart, handler: EventHandler[touchstart], options: Boolean): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_touchstart(
    node: HTMLElement,
    eventName: touchstart,
    handler: EventHandler[touchstart],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_transitioncancel(node: HTMLElement, eventName: transitioncancel, handler: EventHandler[transitioncancel]): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_transitioncancel(
    node: HTMLElement,
    eventName: transitioncancel,
    handler: EventHandler[transitioncancel],
    options: Boolean
  ): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_transitioncancel(
    node: HTMLElement,
    eventName: transitioncancel,
    handler: EventHandler[transitioncancel],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_transitionend(node: HTMLElement, eventName: transitionend, handler: EventHandler[transitionend]): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_transitionend(
    node: HTMLElement,
    eventName: transitionend,
    handler: EventHandler[transitionend],
    options: Boolean
  ): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_transitionend(
    node: HTMLElement,
    eventName: transitionend,
    handler: EventHandler[transitionend],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_transitionrun(node: HTMLElement, eventName: transitionrun, handler: EventHandler[transitionrun]): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_transitionrun(
    node: HTMLElement,
    eventName: transitionrun,
    handler: EventHandler[transitionrun],
    options: Boolean
  ): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_transitionrun(
    node: HTMLElement,
    eventName: transitionrun,
    handler: EventHandler[transitionrun],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_transitionstart(node: HTMLElement, eventName: transitionstart, handler: EventHandler[transitionstart]): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_transitionstart(
    node: HTMLElement,
    eventName: transitionstart,
    handler: EventHandler[transitionstart],
    options: Boolean
  ): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_transitionstart(
    node: HTMLElement,
    eventName: transitionstart,
    handler: EventHandler[transitionstart],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_volumechange(node: HTMLElement, eventName: volumechange, handler: EventHandler[volumechange]): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_volumechange(node: HTMLElement, eventName: volumechange, handler: EventHandler[volumechange], options: Boolean): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_volumechange(
    node: HTMLElement,
    eventName: volumechange,
    handler: EventHandler[volumechange],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_waiting(node: HTMLElement, eventName: waiting, handler: EventHandler[waiting]): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_waiting(node: HTMLElement, eventName: waiting, handler: EventHandler[waiting], options: Boolean): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_waiting(
    node: HTMLElement,
    eventName: waiting,
    handler: EventHandler[waiting],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_wheel(node: HTMLElement, eventName: wheel, handler: EventHandler[wheel]): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_wheel(node: HTMLElement, eventName: wheel, handler: EventHandler[wheel], options: Boolean): js.Function0[Unit] = js.native
  @JSName("listen")
  def listen_wheel(
    node: HTMLElement,
    eventName: wheel,
    handler: EventHandler[wheel],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  def matches(node: Element, selector: String): Boolean = js.native
  def offset(node: HTMLElement): Anon_Height = js.native
  def offsetParent(node: HTMLElement): HTMLElement = js.native
  def ownerDocument(): Document = js.native
  def ownerDocument(node: Element): Document = js.native
  def ownerWindow(): Window = js.native
  def ownerWindow(node: Element): Window = js.native
  def position(node: HTMLElement): Anon_Height = js.native
  def position(node: HTMLElement, offsetParent: HTMLElement): Anon_Height = js.native
  def querySelectorAll(element: Document, selector: String): js.Array[HTMLElement] = js.native
  def querySelectorAll(element: HTMLElement, selector: String): js.Array[HTMLElement] = js.native
  def removeClass(element: Element, className: String): Unit = js.native
  def removeClass(element: SVGElement, className: String): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_abort(node: HTMLElement, eventName: abort, handler: TaggedEventHandler[abort]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_abort(node: HTMLElement, eventName: abort, handler: TaggedEventHandler[abort], options: Boolean): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_abort(
    node: HTMLElement,
    eventName: abort,
    handler: TaggedEventHandler[abort],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_animationcancel(node: HTMLElement, eventName: animationcancel, handler: TaggedEventHandler[animationcancel]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_animationcancel(
    node: HTMLElement,
    eventName: animationcancel,
    handler: TaggedEventHandler[animationcancel],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_animationcancel(
    node: HTMLElement,
    eventName: animationcancel,
    handler: TaggedEventHandler[animationcancel],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_animationend(node: HTMLElement, eventName: animationend, handler: TaggedEventHandler[animationend]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_animationend(
    node: HTMLElement,
    eventName: animationend,
    handler: TaggedEventHandler[animationend],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_animationend(
    node: HTMLElement,
    eventName: animationend,
    handler: TaggedEventHandler[animationend],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_animationiteration(node: HTMLElement, eventName: animationiteration, handler: TaggedEventHandler[animationiteration]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_animationiteration(
    node: HTMLElement,
    eventName: animationiteration,
    handler: TaggedEventHandler[animationiteration],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_animationiteration(
    node: HTMLElement,
    eventName: animationiteration,
    handler: TaggedEventHandler[animationiteration],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_animationstart(node: HTMLElement, eventName: animationstart, handler: TaggedEventHandler[animationstart]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_animationstart(
    node: HTMLElement,
    eventName: animationstart,
    handler: TaggedEventHandler[animationstart],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_animationstart(
    node: HTMLElement,
    eventName: animationstart,
    handler: TaggedEventHandler[animationstart],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_auxclick(node: HTMLElement, eventName: auxclick, handler: TaggedEventHandler[auxclick]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_auxclick(node: HTMLElement, eventName: auxclick, handler: TaggedEventHandler[auxclick], options: Boolean): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_auxclick(
    node: HTMLElement,
    eventName: auxclick,
    handler: TaggedEventHandler[auxclick],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_blur(node: HTMLElement, eventName: blur, handler: TaggedEventHandler[blur]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_blur(node: HTMLElement, eventName: blur, handler: TaggedEventHandler[blur], options: Boolean): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_blur(
    node: HTMLElement,
    eventName: blur,
    handler: TaggedEventHandler[blur],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_cancel(node: HTMLElement, eventName: cancel, handler: TaggedEventHandler[cancel]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_cancel(node: HTMLElement, eventName: cancel, handler: TaggedEventHandler[cancel], options: Boolean): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_cancel(
    node: HTMLElement,
    eventName: cancel,
    handler: TaggedEventHandler[cancel],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_canplay(node: HTMLElement, eventName: canplay, handler: TaggedEventHandler[canplay]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_canplay(node: HTMLElement, eventName: canplay, handler: TaggedEventHandler[canplay], options: Boolean): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_canplay(
    node: HTMLElement,
    eventName: canplay,
    handler: TaggedEventHandler[canplay],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_canplaythrough(node: HTMLElement, eventName: canplaythrough, handler: TaggedEventHandler[canplaythrough]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_canplaythrough(
    node: HTMLElement,
    eventName: canplaythrough,
    handler: TaggedEventHandler[canplaythrough],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_canplaythrough(
    node: HTMLElement,
    eventName: canplaythrough,
    handler: TaggedEventHandler[canplaythrough],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_change(node: HTMLElement, eventName: change, handler: TaggedEventHandler[change]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_change(node: HTMLElement, eventName: change, handler: TaggedEventHandler[change], options: Boolean): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_change(
    node: HTMLElement,
    eventName: change,
    handler: TaggedEventHandler[change],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_click(node: HTMLElement, eventName: click, handler: TaggedEventHandler[click]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_click(node: HTMLElement, eventName: click, handler: TaggedEventHandler[click], options: Boolean): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_click(
    node: HTMLElement,
    eventName: click,
    handler: TaggedEventHandler[click],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_close(node: HTMLElement, eventName: close, handler: TaggedEventHandler[close]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_close(node: HTMLElement, eventName: close, handler: TaggedEventHandler[close], options: Boolean): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_close(
    node: HTMLElement,
    eventName: close,
    handler: TaggedEventHandler[close],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_contextmenu(node: HTMLElement, eventName: contextmenu, handler: TaggedEventHandler[contextmenu]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_contextmenu(
    node: HTMLElement,
    eventName: contextmenu,
    handler: TaggedEventHandler[contextmenu],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_contextmenu(
    node: HTMLElement,
    eventName: contextmenu,
    handler: TaggedEventHandler[contextmenu],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_copy(node: HTMLElement, eventName: copy, handler: TaggedEventHandler[copy]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_copy(node: HTMLElement, eventName: copy, handler: TaggedEventHandler[copy], options: Boolean): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_copy(
    node: HTMLElement,
    eventName: copy,
    handler: TaggedEventHandler[copy],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_cuechange(node: HTMLElement, eventName: cuechange, handler: TaggedEventHandler[cuechange]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_cuechange(node: HTMLElement, eventName: cuechange, handler: TaggedEventHandler[cuechange], options: Boolean): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_cuechange(
    node: HTMLElement,
    eventName: cuechange,
    handler: TaggedEventHandler[cuechange],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_cut(node: HTMLElement, eventName: cut, handler: TaggedEventHandler[cut]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_cut(node: HTMLElement, eventName: cut, handler: TaggedEventHandler[cut], options: Boolean): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_cut(node: HTMLElement, eventName: cut, handler: TaggedEventHandler[cut], options: EventListenerOptions): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dblclick(node: HTMLElement, eventName: dblclick, handler: TaggedEventHandler[dblclick]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dblclick(node: HTMLElement, eventName: dblclick, handler: TaggedEventHandler[dblclick], options: Boolean): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dblclick(
    node: HTMLElement,
    eventName: dblclick,
    handler: TaggedEventHandler[dblclick],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_drag(node: HTMLElement, eventName: drag, handler: TaggedEventHandler[drag]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_drag(node: HTMLElement, eventName: drag, handler: TaggedEventHandler[drag], options: Boolean): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_drag(
    node: HTMLElement,
    eventName: drag,
    handler: TaggedEventHandler[drag],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragend(node: HTMLElement, eventName: dragend, handler: TaggedEventHandler[dragend]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragend(node: HTMLElement, eventName: dragend, handler: TaggedEventHandler[dragend], options: Boolean): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragend(
    node: HTMLElement,
    eventName: dragend,
    handler: TaggedEventHandler[dragend],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragenter(node: HTMLElement, eventName: dragenter, handler: TaggedEventHandler[dragenter]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragenter(node: HTMLElement, eventName: dragenter, handler: TaggedEventHandler[dragenter], options: Boolean): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragenter(
    node: HTMLElement,
    eventName: dragenter,
    handler: TaggedEventHandler[dragenter],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragexit(node: HTMLElement, eventName: dragexit, handler: TaggedEventHandler[dragexit]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragexit(node: HTMLElement, eventName: dragexit, handler: TaggedEventHandler[dragexit], options: Boolean): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragexit(
    node: HTMLElement,
    eventName: dragexit,
    handler: TaggedEventHandler[dragexit],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragleave(node: HTMLElement, eventName: dragleave, handler: TaggedEventHandler[dragleave]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragleave(node: HTMLElement, eventName: dragleave, handler: TaggedEventHandler[dragleave], options: Boolean): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragleave(
    node: HTMLElement,
    eventName: dragleave,
    handler: TaggedEventHandler[dragleave],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragover(node: HTMLElement, eventName: dragover, handler: TaggedEventHandler[dragover]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragover(node: HTMLElement, eventName: dragover, handler: TaggedEventHandler[dragover], options: Boolean): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragover(
    node: HTMLElement,
    eventName: dragover,
    handler: TaggedEventHandler[dragover],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragstart(node: HTMLElement, eventName: dragstart, handler: TaggedEventHandler[dragstart]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragstart(node: HTMLElement, eventName: dragstart, handler: TaggedEventHandler[dragstart], options: Boolean): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragstart(
    node: HTMLElement,
    eventName: dragstart,
    handler: TaggedEventHandler[dragstart],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_drop(node: HTMLElement, eventName: drop, handler: TaggedEventHandler[drop]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_drop(node: HTMLElement, eventName: drop, handler: TaggedEventHandler[drop], options: Boolean): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_drop(
    node: HTMLElement,
    eventName: drop,
    handler: TaggedEventHandler[drop],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_durationchange(node: HTMLElement, eventName: durationchange, handler: TaggedEventHandler[durationchange]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_durationchange(
    node: HTMLElement,
    eventName: durationchange,
    handler: TaggedEventHandler[durationchange],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_durationchange(
    node: HTMLElement,
    eventName: durationchange,
    handler: TaggedEventHandler[durationchange],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_emptied(node: HTMLElement, eventName: emptied, handler: TaggedEventHandler[emptied]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_emptied(node: HTMLElement, eventName: emptied, handler: TaggedEventHandler[emptied], options: Boolean): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_emptied(
    node: HTMLElement,
    eventName: emptied,
    handler: TaggedEventHandler[emptied],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_ended(node: HTMLElement, eventName: ended, handler: TaggedEventHandler[ended]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_ended(node: HTMLElement, eventName: ended, handler: TaggedEventHandler[ended], options: Boolean): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_ended(
    node: HTMLElement,
    eventName: ended,
    handler: TaggedEventHandler[ended],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_error(node: HTMLElement, eventName: error, handler: TaggedEventHandler[error]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_error(node: HTMLElement, eventName: error, handler: TaggedEventHandler[error], options: Boolean): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_error(
    node: HTMLElement,
    eventName: error,
    handler: TaggedEventHandler[error],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_focus(node: HTMLElement, eventName: focus, handler: TaggedEventHandler[focus]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_focus(node: HTMLElement, eventName: focus, handler: TaggedEventHandler[focus], options: Boolean): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_focus(
    node: HTMLElement,
    eventName: focus,
    handler: TaggedEventHandler[focus],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_focusin(node: HTMLElement, eventName: focusin, handler: TaggedEventHandler[focusin]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_focusin(node: HTMLElement, eventName: focusin, handler: TaggedEventHandler[focusin], options: Boolean): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_focusin(
    node: HTMLElement,
    eventName: focusin,
    handler: TaggedEventHandler[focusin],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_focusout(node: HTMLElement, eventName: focusout, handler: TaggedEventHandler[focusout]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_focusout(node: HTMLElement, eventName: focusout, handler: TaggedEventHandler[focusout], options: Boolean): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_focusout(
    node: HTMLElement,
    eventName: focusout,
    handler: TaggedEventHandler[focusout],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_fullscreenchange(node: HTMLElement, eventName: fullscreenchange, handler: TaggedEventHandler[fullscreenchange]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_fullscreenchange(
    node: HTMLElement,
    eventName: fullscreenchange,
    handler: TaggedEventHandler[fullscreenchange],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_fullscreenchange(
    node: HTMLElement,
    eventName: fullscreenchange,
    handler: TaggedEventHandler[fullscreenchange],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_fullscreenerror(node: HTMLElement, eventName: fullscreenerror, handler: TaggedEventHandler[fullscreenerror]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_fullscreenerror(
    node: HTMLElement,
    eventName: fullscreenerror,
    handler: TaggedEventHandler[fullscreenerror],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_fullscreenerror(
    node: HTMLElement,
    eventName: fullscreenerror,
    handler: TaggedEventHandler[fullscreenerror],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_gotpointercapture(node: HTMLElement, eventName: gotpointercapture, handler: TaggedEventHandler[gotpointercapture]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_gotpointercapture(
    node: HTMLElement,
    eventName: gotpointercapture,
    handler: TaggedEventHandler[gotpointercapture],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_gotpointercapture(
    node: HTMLElement,
    eventName: gotpointercapture,
    handler: TaggedEventHandler[gotpointercapture],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_input(node: HTMLElement, eventName: input, handler: TaggedEventHandler[input]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_input(node: HTMLElement, eventName: input, handler: TaggedEventHandler[input], options: Boolean): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_input(
    node: HTMLElement,
    eventName: input,
    handler: TaggedEventHandler[input],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_invalid(node: HTMLElement, eventName: invalid, handler: TaggedEventHandler[invalid]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_invalid(node: HTMLElement, eventName: invalid, handler: TaggedEventHandler[invalid], options: Boolean): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_invalid(
    node: HTMLElement,
    eventName: invalid,
    handler: TaggedEventHandler[invalid],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_keydown(node: HTMLElement, eventName: keydown, handler: TaggedEventHandler[keydown]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_keydown(node: HTMLElement, eventName: keydown, handler: TaggedEventHandler[keydown], options: Boolean): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_keydown(
    node: HTMLElement,
    eventName: keydown,
    handler: TaggedEventHandler[keydown],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_keypress(node: HTMLElement, eventName: keypress, handler: TaggedEventHandler[keypress]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_keypress(node: HTMLElement, eventName: keypress, handler: TaggedEventHandler[keypress], options: Boolean): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_keypress(
    node: HTMLElement,
    eventName: keypress,
    handler: TaggedEventHandler[keypress],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_keyup(node: HTMLElement, eventName: keyup, handler: TaggedEventHandler[keyup]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_keyup(node: HTMLElement, eventName: keyup, handler: TaggedEventHandler[keyup], options: Boolean): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_keyup(
    node: HTMLElement,
    eventName: keyup,
    handler: TaggedEventHandler[keyup],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_load(node: HTMLElement, eventName: load, handler: TaggedEventHandler[load]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_load(node: HTMLElement, eventName: load, handler: TaggedEventHandler[load], options: Boolean): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_load(
    node: HTMLElement,
    eventName: load,
    handler: TaggedEventHandler[load],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadeddata(node: HTMLElement, eventName: loadeddata, handler: TaggedEventHandler[loadeddata]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadeddata(
    node: HTMLElement,
    eventName: loadeddata,
    handler: TaggedEventHandler[loadeddata],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadeddata(
    node: HTMLElement,
    eventName: loadeddata,
    handler: TaggedEventHandler[loadeddata],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadedmetadata(node: HTMLElement, eventName: loadedmetadata, handler: TaggedEventHandler[loadedmetadata]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadedmetadata(
    node: HTMLElement,
    eventName: loadedmetadata,
    handler: TaggedEventHandler[loadedmetadata],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadedmetadata(
    node: HTMLElement,
    eventName: loadedmetadata,
    handler: TaggedEventHandler[loadedmetadata],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadend(node: HTMLElement, eventName: loadend, handler: TaggedEventHandler[loadend]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadend(node: HTMLElement, eventName: loadend, handler: TaggedEventHandler[loadend], options: Boolean): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadend(
    node: HTMLElement,
    eventName: loadend,
    handler: TaggedEventHandler[loadend],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadstart(node: HTMLElement, eventName: loadstart, handler: TaggedEventHandler[loadstart]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadstart(node: HTMLElement, eventName: loadstart, handler: TaggedEventHandler[loadstart], options: Boolean): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadstart(
    node: HTMLElement,
    eventName: loadstart,
    handler: TaggedEventHandler[loadstart],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_lostpointercapture(node: HTMLElement, eventName: lostpointercapture, handler: TaggedEventHandler[lostpointercapture]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_lostpointercapture(
    node: HTMLElement,
    eventName: lostpointercapture,
    handler: TaggedEventHandler[lostpointercapture],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_lostpointercapture(
    node: HTMLElement,
    eventName: lostpointercapture,
    handler: TaggedEventHandler[lostpointercapture],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mousedown(node: HTMLElement, eventName: mousedown, handler: TaggedEventHandler[mousedown]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mousedown(node: HTMLElement, eventName: mousedown, handler: TaggedEventHandler[mousedown], options: Boolean): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mousedown(
    node: HTMLElement,
    eventName: mousedown,
    handler: TaggedEventHandler[mousedown],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseenter(node: HTMLElement, eventName: mouseenter, handler: TaggedEventHandler[mouseenter]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseenter(
    node: HTMLElement,
    eventName: mouseenter,
    handler: TaggedEventHandler[mouseenter],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseenter(
    node: HTMLElement,
    eventName: mouseenter,
    handler: TaggedEventHandler[mouseenter],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseleave(node: HTMLElement, eventName: mouseleave, handler: TaggedEventHandler[mouseleave]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseleave(
    node: HTMLElement,
    eventName: mouseleave,
    handler: TaggedEventHandler[mouseleave],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseleave(
    node: HTMLElement,
    eventName: mouseleave,
    handler: TaggedEventHandler[mouseleave],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mousemove(node: HTMLElement, eventName: mousemove, handler: TaggedEventHandler[mousemove]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mousemove(node: HTMLElement, eventName: mousemove, handler: TaggedEventHandler[mousemove], options: Boolean): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mousemove(
    node: HTMLElement,
    eventName: mousemove,
    handler: TaggedEventHandler[mousemove],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseout(node: HTMLElement, eventName: mouseout, handler: TaggedEventHandler[mouseout]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseout(node: HTMLElement, eventName: mouseout, handler: TaggedEventHandler[mouseout], options: Boolean): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseout(
    node: HTMLElement,
    eventName: mouseout,
    handler: TaggedEventHandler[mouseout],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseover(node: HTMLElement, eventName: mouseover, handler: TaggedEventHandler[mouseover]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseover(node: HTMLElement, eventName: mouseover, handler: TaggedEventHandler[mouseover], options: Boolean): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseover(
    node: HTMLElement,
    eventName: mouseover,
    handler: TaggedEventHandler[mouseover],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseup(node: HTMLElement, eventName: mouseup, handler: TaggedEventHandler[mouseup]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseup(node: HTMLElement, eventName: mouseup, handler: TaggedEventHandler[mouseup], options: Boolean): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseup(
    node: HTMLElement,
    eventName: mouseup,
    handler: TaggedEventHandler[mouseup],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_paste(node: HTMLElement, eventName: paste, handler: TaggedEventHandler[paste]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_paste(node: HTMLElement, eventName: paste, handler: TaggedEventHandler[paste], options: Boolean): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_paste(
    node: HTMLElement,
    eventName: paste,
    handler: TaggedEventHandler[paste],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pause(node: HTMLElement, eventName: pause, handler: TaggedEventHandler[pause]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pause(node: HTMLElement, eventName: pause, handler: TaggedEventHandler[pause], options: Boolean): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pause(
    node: HTMLElement,
    eventName: pause,
    handler: TaggedEventHandler[pause],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_play(node: HTMLElement, eventName: play, handler: TaggedEventHandler[play]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_play(node: HTMLElement, eventName: play, handler: TaggedEventHandler[play], options: Boolean): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_play(
    node: HTMLElement,
    eventName: play,
    handler: TaggedEventHandler[play],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_playing(node: HTMLElement, eventName: playing, handler: TaggedEventHandler[playing]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_playing(node: HTMLElement, eventName: playing, handler: TaggedEventHandler[playing], options: Boolean): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_playing(
    node: HTMLElement,
    eventName: playing,
    handler: TaggedEventHandler[playing],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointercancel(node: HTMLElement, eventName: pointercancel, handler: TaggedEventHandler[pointercancel]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointercancel(
    node: HTMLElement,
    eventName: pointercancel,
    handler: TaggedEventHandler[pointercancel],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointercancel(
    node: HTMLElement,
    eventName: pointercancel,
    handler: TaggedEventHandler[pointercancel],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerdown(node: HTMLElement, eventName: pointerdown, handler: TaggedEventHandler[pointerdown]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerdown(
    node: HTMLElement,
    eventName: pointerdown,
    handler: TaggedEventHandler[pointerdown],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerdown(
    node: HTMLElement,
    eventName: pointerdown,
    handler: TaggedEventHandler[pointerdown],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerenter(node: HTMLElement, eventName: pointerenter, handler: TaggedEventHandler[pointerenter]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerenter(
    node: HTMLElement,
    eventName: pointerenter,
    handler: TaggedEventHandler[pointerenter],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerenter(
    node: HTMLElement,
    eventName: pointerenter,
    handler: TaggedEventHandler[pointerenter],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerleave(node: HTMLElement, eventName: pointerleave, handler: TaggedEventHandler[pointerleave]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerleave(
    node: HTMLElement,
    eventName: pointerleave,
    handler: TaggedEventHandler[pointerleave],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerleave(
    node: HTMLElement,
    eventName: pointerleave,
    handler: TaggedEventHandler[pointerleave],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointermove(node: HTMLElement, eventName: pointermove, handler: TaggedEventHandler[pointermove]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointermove(
    node: HTMLElement,
    eventName: pointermove,
    handler: TaggedEventHandler[pointermove],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointermove(
    node: HTMLElement,
    eventName: pointermove,
    handler: TaggedEventHandler[pointermove],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerout(node: HTMLElement, eventName: pointerout, handler: TaggedEventHandler[pointerout]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerout(
    node: HTMLElement,
    eventName: pointerout,
    handler: TaggedEventHandler[pointerout],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerout(
    node: HTMLElement,
    eventName: pointerout,
    handler: TaggedEventHandler[pointerout],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerover(node: HTMLElement, eventName: pointerover, handler: TaggedEventHandler[pointerover]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerover(
    node: HTMLElement,
    eventName: pointerover,
    handler: TaggedEventHandler[pointerover],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerover(
    node: HTMLElement,
    eventName: pointerover,
    handler: TaggedEventHandler[pointerover],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerup(node: HTMLElement, eventName: pointerup, handler: TaggedEventHandler[pointerup]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerup(node: HTMLElement, eventName: pointerup, handler: TaggedEventHandler[pointerup], options: Boolean): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerup(
    node: HTMLElement,
    eventName: pointerup,
    handler: TaggedEventHandler[pointerup],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_progress(node: HTMLElement, eventName: progress, handler: TaggedEventHandler[progress]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_progress(node: HTMLElement, eventName: progress, handler: TaggedEventHandler[progress], options: Boolean): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_progress(
    node: HTMLElement,
    eventName: progress,
    handler: TaggedEventHandler[progress],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_ratechange(node: HTMLElement, eventName: ratechange, handler: TaggedEventHandler[ratechange]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_ratechange(
    node: HTMLElement,
    eventName: ratechange,
    handler: TaggedEventHandler[ratechange],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_ratechange(
    node: HTMLElement,
    eventName: ratechange,
    handler: TaggedEventHandler[ratechange],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_reset(node: HTMLElement, eventName: reset, handler: TaggedEventHandler[reset]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_reset(node: HTMLElement, eventName: reset, handler: TaggedEventHandler[reset], options: Boolean): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_reset(
    node: HTMLElement,
    eventName: reset,
    handler: TaggedEventHandler[reset],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_resize(node: HTMLElement, eventName: resize, handler: TaggedEventHandler[resize]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_resize(node: HTMLElement, eventName: resize, handler: TaggedEventHandler[resize], options: Boolean): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_resize(
    node: HTMLElement,
    eventName: resize,
    handler: TaggedEventHandler[resize],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_scroll(node: HTMLElement, eventName: scroll, handler: TaggedEventHandler[scroll]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_scroll(node: HTMLElement, eventName: scroll, handler: TaggedEventHandler[scroll], options: Boolean): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_scroll(
    node: HTMLElement,
    eventName: scroll,
    handler: TaggedEventHandler[scroll],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_securitypolicyviolation(
    node: HTMLElement,
    eventName: securitypolicyviolation,
    handler: TaggedEventHandler[securitypolicyviolation]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_securitypolicyviolation(
    node: HTMLElement,
    eventName: securitypolicyviolation,
    handler: TaggedEventHandler[securitypolicyviolation],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_securitypolicyviolation(
    node: HTMLElement,
    eventName: securitypolicyviolation,
    handler: TaggedEventHandler[securitypolicyviolation],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_seeked(node: HTMLElement, eventName: seeked, handler: TaggedEventHandler[seeked]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_seeked(node: HTMLElement, eventName: seeked, handler: TaggedEventHandler[seeked], options: Boolean): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_seeked(
    node: HTMLElement,
    eventName: seeked,
    handler: TaggedEventHandler[seeked],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_seeking(node: HTMLElement, eventName: seeking, handler: TaggedEventHandler[seeking]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_seeking(node: HTMLElement, eventName: seeking, handler: TaggedEventHandler[seeking], options: Boolean): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_seeking(
    node: HTMLElement,
    eventName: seeking,
    handler: TaggedEventHandler[seeking],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_select(node: HTMLElement, eventName: select, handler: TaggedEventHandler[select]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_select(node: HTMLElement, eventName: select, handler: TaggedEventHandler[select], options: Boolean): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_select(
    node: HTMLElement,
    eventName: select,
    handler: TaggedEventHandler[select],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_selectionchange(node: HTMLElement, eventName: selectionchange, handler: TaggedEventHandler[selectionchange]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_selectionchange(
    node: HTMLElement,
    eventName: selectionchange,
    handler: TaggedEventHandler[selectionchange],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_selectionchange(
    node: HTMLElement,
    eventName: selectionchange,
    handler: TaggedEventHandler[selectionchange],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_selectstart(node: HTMLElement, eventName: selectstart, handler: TaggedEventHandler[selectstart]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_selectstart(
    node: HTMLElement,
    eventName: selectstart,
    handler: TaggedEventHandler[selectstart],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_selectstart(
    node: HTMLElement,
    eventName: selectstart,
    handler: TaggedEventHandler[selectstart],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_stalled(node: HTMLElement, eventName: stalled, handler: TaggedEventHandler[stalled]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_stalled(node: HTMLElement, eventName: stalled, handler: TaggedEventHandler[stalled], options: Boolean): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_stalled(
    node: HTMLElement,
    eventName: stalled,
    handler: TaggedEventHandler[stalled],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_submit(node: HTMLElement, eventName: submit, handler: TaggedEventHandler[submit]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_submit(node: HTMLElement, eventName: submit, handler: TaggedEventHandler[submit], options: Boolean): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_submit(
    node: HTMLElement,
    eventName: submit,
    handler: TaggedEventHandler[submit],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_suspend(node: HTMLElement, eventName: suspend, handler: TaggedEventHandler[suspend]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_suspend(node: HTMLElement, eventName: suspend, handler: TaggedEventHandler[suspend], options: Boolean): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_suspend(
    node: HTMLElement,
    eventName: suspend,
    handler: TaggedEventHandler[suspend],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_timeupdate(node: HTMLElement, eventName: timeupdate, handler: TaggedEventHandler[timeupdate]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_timeupdate(
    node: HTMLElement,
    eventName: timeupdate,
    handler: TaggedEventHandler[timeupdate],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_timeupdate(
    node: HTMLElement,
    eventName: timeupdate,
    handler: TaggedEventHandler[timeupdate],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_toggle(node: HTMLElement, eventName: toggle, handler: TaggedEventHandler[toggle]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_toggle(node: HTMLElement, eventName: toggle, handler: TaggedEventHandler[toggle], options: Boolean): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_toggle(
    node: HTMLElement,
    eventName: toggle,
    handler: TaggedEventHandler[toggle],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_touchcancel(node: HTMLElement, eventName: touchcancel, handler: TaggedEventHandler[touchcancel]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_touchcancel(
    node: HTMLElement,
    eventName: touchcancel,
    handler: TaggedEventHandler[touchcancel],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_touchcancel(
    node: HTMLElement,
    eventName: touchcancel,
    handler: TaggedEventHandler[touchcancel],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_touchend(node: HTMLElement, eventName: touchend, handler: TaggedEventHandler[touchend]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_touchend(node: HTMLElement, eventName: touchend, handler: TaggedEventHandler[touchend], options: Boolean): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_touchend(
    node: HTMLElement,
    eventName: touchend,
    handler: TaggedEventHandler[touchend],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_touchmove(node: HTMLElement, eventName: touchmove, handler: TaggedEventHandler[touchmove]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_touchmove(node: HTMLElement, eventName: touchmove, handler: TaggedEventHandler[touchmove], options: Boolean): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_touchmove(
    node: HTMLElement,
    eventName: touchmove,
    handler: TaggedEventHandler[touchmove],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_touchstart(node: HTMLElement, eventName: touchstart, handler: TaggedEventHandler[touchstart]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_touchstart(
    node: HTMLElement,
    eventName: touchstart,
    handler: TaggedEventHandler[touchstart],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_touchstart(
    node: HTMLElement,
    eventName: touchstart,
    handler: TaggedEventHandler[touchstart],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_transitioncancel(node: HTMLElement, eventName: transitioncancel, handler: TaggedEventHandler[transitioncancel]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_transitioncancel(
    node: HTMLElement,
    eventName: transitioncancel,
    handler: TaggedEventHandler[transitioncancel],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_transitioncancel(
    node: HTMLElement,
    eventName: transitioncancel,
    handler: TaggedEventHandler[transitioncancel],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_transitionend(node: HTMLElement, eventName: transitionend, handler: TaggedEventHandler[transitionend]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_transitionend(
    node: HTMLElement,
    eventName: transitionend,
    handler: TaggedEventHandler[transitionend],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_transitionend(
    node: HTMLElement,
    eventName: transitionend,
    handler: TaggedEventHandler[transitionend],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_transitionrun(node: HTMLElement, eventName: transitionrun, handler: TaggedEventHandler[transitionrun]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_transitionrun(
    node: HTMLElement,
    eventName: transitionrun,
    handler: TaggedEventHandler[transitionrun],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_transitionrun(
    node: HTMLElement,
    eventName: transitionrun,
    handler: TaggedEventHandler[transitionrun],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_transitionstart(node: HTMLElement, eventName: transitionstart, handler: TaggedEventHandler[transitionstart]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_transitionstart(
    node: HTMLElement,
    eventName: transitionstart,
    handler: TaggedEventHandler[transitionstart],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_transitionstart(
    node: HTMLElement,
    eventName: transitionstart,
    handler: TaggedEventHandler[transitionstart],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_volumechange(node: HTMLElement, eventName: volumechange, handler: TaggedEventHandler[volumechange]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_volumechange(
    node: HTMLElement,
    eventName: volumechange,
    handler: TaggedEventHandler[volumechange],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_volumechange(
    node: HTMLElement,
    eventName: volumechange,
    handler: TaggedEventHandler[volumechange],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_waiting(node: HTMLElement, eventName: waiting, handler: TaggedEventHandler[waiting]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_waiting(node: HTMLElement, eventName: waiting, handler: TaggedEventHandler[waiting], options: Boolean): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_waiting(
    node: HTMLElement,
    eventName: waiting,
    handler: TaggedEventHandler[waiting],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_wheel(node: HTMLElement, eventName: wheel, handler: TaggedEventHandler[wheel]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_wheel(node: HTMLElement, eventName: wheel, handler: TaggedEventHandler[wheel], options: Boolean): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_wheel(
    node: HTMLElement,
    eventName: wheel,
    handler: TaggedEventHandler[wheel],
    options: EventListenerOptions
  ): Unit = js.native
  def scrollParent(element: HTMLElement): Document | HTMLElement = js.native
  def scrollParent(element: HTMLElement, firstPossible: Boolean): Document | HTMLElement = js.native
  def scrollTop(node: Element): Double = js.native
  def scrollTop(node: Element, `val`: Double): js.UndefOr[scala.Nothing] = js.native
  def style(node: HTMLElement, property: Partial[Record[Property, String]]): Unit = js.native
  def style[T /* <: HyphenProperty */](node: HTMLElement, property: T): /* import warning: importer.ImportType#apply Failed type conversion: csstype.csstype.PropertiesHyphen<string | 0>[T] */ js.Any = js.native
  @JSName("style")
  def style_T_CamelProperty[T /* <: CamelProperty */](node: HTMLElement, property: T): /* import warning: importer.ImportType#apply Failed type conversion: csstype.csstype.Properties<string | 0>[T] */ js.Any = js.native
  def toggleClass(element: Element, className: String): Unit = js.native
  def toggleClass(element: SVGElement, className: String): Unit = js.native
  def width(node: HTMLElement): Double = js.native
  def width(node: HTMLElement, client: Boolean): Double = js.native
  @js.native
  object default extends js.Object {
    @JSName("activeElement")
    var activeElement_Original: js.Function1[/* doc */ js.UndefOr[Document], Element | Null] = js.native
    @JSName("addClass")
    var addClass_Original: js.Function2[/* element */ Element | SVGElement, /* className */ String, Unit] = js.native
    @JSName("addEventListener")
    var addEventListener_Original: Fn_Abort = js.native
    @JSName("closest")
    var closest_Original: js.Function3[
        /* node */ Element, 
        /* selector */ String, 
        /* stopAt */ js.UndefOr[Element], 
        Element | Null
      ] = js.native
    @JSName("contains")
    var contains_Original: js.Function2[/* context */ Element, /* node */ Element, js.UndefOr[Boolean]] = js.native
    @JSName("filter")
    var filter_Original: Fn_AbortAnimationcancelAnimationend = js.native
    @JSName("hasClass")
    var hasClass_Original: js.Function2[/* element */ Element | SVGElement, /* className */ String, Boolean] = js.native
    @JSName("height")
    var height_Original: js.Function2[/* node */ HTMLElement, /* client */ js.UndefOr[Boolean], Double] = js.native
    @JSName("listen")
    var listen_Original: Fn_AbortAnimationcancelAnimationendAnimationiteration = js.native
    @JSName("matches")
    var matches_Original: js.Function2[/* node */ Element, /* selector */ String, Boolean] = js.native
    @JSName("offsetParent")
    var offsetParent_Original: js.Function1[/* node */ HTMLElement, HTMLElement] = js.native
    @JSName("offset")
    var offset_Original: js.Function1[/* node */ HTMLElement, Anon_Height] = js.native
    @JSName("ownerDocument")
    var ownerDocument_Original: js.Function1[/* node */ js.UndefOr[Element], Document] = js.native
    @JSName("ownerWindow")
    var ownerWindow_Original: js.Function1[/* node */ js.UndefOr[Element], Window] = js.native
    @JSName("position")
    var position_Original: js.Function2[/* node */ HTMLElement, /* offsetParent */ js.UndefOr[HTMLElement], Anon_Height] = js.native
    @JSName("querySelectorAll")
    var querySelectorAll_Original: js.Function2[/* element */ HTMLElement | Document, /* selector */ String, js.Array[HTMLElement]] = js.native
    @JSName("removeClass")
    var removeClass_Original: js.Function2[/* element */ Element | SVGElement, /* className */ String, Unit] = js.native
    @JSName("removeEventListener")
    var removeEventListener_Original: Fn_AbortAnimationcancel = js.native
    @JSName("scrollParent")
    var scrollParent_Original: js.Function2[
        /* element */ HTMLElement, 
        /* firstPossible */ js.UndefOr[Boolean], 
        Document | HTMLElement
      ] = js.native
    @JSName("style")
    var style_Original: Fn_0 = js.native
    @JSName("toggleClass")
    var toggleClass_Original: js.Function2[/* element */ Element | SVGElement, /* className */ String, Unit] = js.native
    @JSName("width")
    var width_Original: js.Function2[/* node */ HTMLElement, /* client */ js.UndefOr[Boolean], Double] = js.native
    def activeElement(): Element | Null = js.native
    def activeElement(doc: Document): Element | Null = js.native
    def addClass(element: Element, className: String): Unit = js.native
    def addClass(element: SVGElement, className: String): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_abort(node: HTMLElement, eventName: abort, handler: TaggedEventHandler[abort]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_abort(node: HTMLElement, eventName: abort, handler: TaggedEventHandler[abort], options: Boolean): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_abort(
      node: HTMLElement,
      eventName: abort,
      handler: TaggedEventHandler[abort],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_animationcancel(node: HTMLElement, eventName: animationcancel, handler: TaggedEventHandler[animationcancel]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_animationcancel(
      node: HTMLElement,
      eventName: animationcancel,
      handler: TaggedEventHandler[animationcancel],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_animationcancel(
      node: HTMLElement,
      eventName: animationcancel,
      handler: TaggedEventHandler[animationcancel],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_animationend(node: HTMLElement, eventName: animationend, handler: TaggedEventHandler[animationend]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_animationend(
      node: HTMLElement,
      eventName: animationend,
      handler: TaggedEventHandler[animationend],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_animationend(
      node: HTMLElement,
      eventName: animationend,
      handler: TaggedEventHandler[animationend],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_animationiteration(node: HTMLElement, eventName: animationiteration, handler: TaggedEventHandler[animationiteration]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_animationiteration(
      node: HTMLElement,
      eventName: animationiteration,
      handler: TaggedEventHandler[animationiteration],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_animationiteration(
      node: HTMLElement,
      eventName: animationiteration,
      handler: TaggedEventHandler[animationiteration],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_animationstart(node: HTMLElement, eventName: animationstart, handler: TaggedEventHandler[animationstart]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_animationstart(
      node: HTMLElement,
      eventName: animationstart,
      handler: TaggedEventHandler[animationstart],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_animationstart(
      node: HTMLElement,
      eventName: animationstart,
      handler: TaggedEventHandler[animationstart],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_auxclick(node: HTMLElement, eventName: auxclick, handler: TaggedEventHandler[auxclick]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_auxclick(node: HTMLElement, eventName: auxclick, handler: TaggedEventHandler[auxclick], options: Boolean): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_auxclick(
      node: HTMLElement,
      eventName: auxclick,
      handler: TaggedEventHandler[auxclick],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_blur(node: HTMLElement, eventName: blur, handler: TaggedEventHandler[blur]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_blur(node: HTMLElement, eventName: blur, handler: TaggedEventHandler[blur], options: Boolean): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_blur(
      node: HTMLElement,
      eventName: blur,
      handler: TaggedEventHandler[blur],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_cancel(node: HTMLElement, eventName: cancel, handler: TaggedEventHandler[cancel]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_cancel(node: HTMLElement, eventName: cancel, handler: TaggedEventHandler[cancel], options: Boolean): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_cancel(
      node: HTMLElement,
      eventName: cancel,
      handler: TaggedEventHandler[cancel],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_canplay(node: HTMLElement, eventName: canplay, handler: TaggedEventHandler[canplay]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_canplay(node: HTMLElement, eventName: canplay, handler: TaggedEventHandler[canplay], options: Boolean): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_canplay(
      node: HTMLElement,
      eventName: canplay,
      handler: TaggedEventHandler[canplay],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_canplaythrough(node: HTMLElement, eventName: canplaythrough, handler: TaggedEventHandler[canplaythrough]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_canplaythrough(
      node: HTMLElement,
      eventName: canplaythrough,
      handler: TaggedEventHandler[canplaythrough],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_canplaythrough(
      node: HTMLElement,
      eventName: canplaythrough,
      handler: TaggedEventHandler[canplaythrough],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_change(node: HTMLElement, eventName: change, handler: TaggedEventHandler[change]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_change(node: HTMLElement, eventName: change, handler: TaggedEventHandler[change], options: Boolean): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_change(
      node: HTMLElement,
      eventName: change,
      handler: TaggedEventHandler[change],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_click(node: HTMLElement, eventName: click, handler: TaggedEventHandler[click]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_click(node: HTMLElement, eventName: click, handler: TaggedEventHandler[click], options: Boolean): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_click(
      node: HTMLElement,
      eventName: click,
      handler: TaggedEventHandler[click],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_close(node: HTMLElement, eventName: close, handler: TaggedEventHandler[close]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_close(node: HTMLElement, eventName: close, handler: TaggedEventHandler[close], options: Boolean): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_close(
      node: HTMLElement,
      eventName: close,
      handler: TaggedEventHandler[close],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_contextmenu(node: HTMLElement, eventName: contextmenu, handler: TaggedEventHandler[contextmenu]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_contextmenu(
      node: HTMLElement,
      eventName: contextmenu,
      handler: TaggedEventHandler[contextmenu],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_contextmenu(
      node: HTMLElement,
      eventName: contextmenu,
      handler: TaggedEventHandler[contextmenu],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_copy(node: HTMLElement, eventName: copy, handler: TaggedEventHandler[copy]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_copy(node: HTMLElement, eventName: copy, handler: TaggedEventHandler[copy], options: Boolean): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_copy(
      node: HTMLElement,
      eventName: copy,
      handler: TaggedEventHandler[copy],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_cuechange(node: HTMLElement, eventName: cuechange, handler: TaggedEventHandler[cuechange]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_cuechange(node: HTMLElement, eventName: cuechange, handler: TaggedEventHandler[cuechange], options: Boolean): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_cuechange(
      node: HTMLElement,
      eventName: cuechange,
      handler: TaggedEventHandler[cuechange],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_cut(node: HTMLElement, eventName: cut, handler: TaggedEventHandler[cut]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_cut(node: HTMLElement, eventName: cut, handler: TaggedEventHandler[cut], options: Boolean): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_cut(
      node: HTMLElement,
      eventName: cut,
      handler: TaggedEventHandler[cut],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_dblclick(node: HTMLElement, eventName: dblclick, handler: TaggedEventHandler[dblclick]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_dblclick(node: HTMLElement, eventName: dblclick, handler: TaggedEventHandler[dblclick], options: Boolean): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_dblclick(
      node: HTMLElement,
      eventName: dblclick,
      handler: TaggedEventHandler[dblclick],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_drag(node: HTMLElement, eventName: drag, handler: TaggedEventHandler[drag]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_drag(node: HTMLElement, eventName: drag, handler: TaggedEventHandler[drag], options: Boolean): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_drag(
      node: HTMLElement,
      eventName: drag,
      handler: TaggedEventHandler[drag],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_dragend(node: HTMLElement, eventName: dragend, handler: TaggedEventHandler[dragend]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_dragend(node: HTMLElement, eventName: dragend, handler: TaggedEventHandler[dragend], options: Boolean): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_dragend(
      node: HTMLElement,
      eventName: dragend,
      handler: TaggedEventHandler[dragend],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_dragenter(node: HTMLElement, eventName: dragenter, handler: TaggedEventHandler[dragenter]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_dragenter(node: HTMLElement, eventName: dragenter, handler: TaggedEventHandler[dragenter], options: Boolean): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_dragenter(
      node: HTMLElement,
      eventName: dragenter,
      handler: TaggedEventHandler[dragenter],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_dragexit(node: HTMLElement, eventName: dragexit, handler: TaggedEventHandler[dragexit]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_dragexit(node: HTMLElement, eventName: dragexit, handler: TaggedEventHandler[dragexit], options: Boolean): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_dragexit(
      node: HTMLElement,
      eventName: dragexit,
      handler: TaggedEventHandler[dragexit],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_dragleave(node: HTMLElement, eventName: dragleave, handler: TaggedEventHandler[dragleave]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_dragleave(node: HTMLElement, eventName: dragleave, handler: TaggedEventHandler[dragleave], options: Boolean): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_dragleave(
      node: HTMLElement,
      eventName: dragleave,
      handler: TaggedEventHandler[dragleave],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_dragover(node: HTMLElement, eventName: dragover, handler: TaggedEventHandler[dragover]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_dragover(node: HTMLElement, eventName: dragover, handler: TaggedEventHandler[dragover], options: Boolean): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_dragover(
      node: HTMLElement,
      eventName: dragover,
      handler: TaggedEventHandler[dragover],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_dragstart(node: HTMLElement, eventName: dragstart, handler: TaggedEventHandler[dragstart]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_dragstart(node: HTMLElement, eventName: dragstart, handler: TaggedEventHandler[dragstart], options: Boolean): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_dragstart(
      node: HTMLElement,
      eventName: dragstart,
      handler: TaggedEventHandler[dragstart],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_drop(node: HTMLElement, eventName: drop, handler: TaggedEventHandler[drop]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_drop(node: HTMLElement, eventName: drop, handler: TaggedEventHandler[drop], options: Boolean): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_drop(
      node: HTMLElement,
      eventName: drop,
      handler: TaggedEventHandler[drop],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_durationchange(node: HTMLElement, eventName: durationchange, handler: TaggedEventHandler[durationchange]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_durationchange(
      node: HTMLElement,
      eventName: durationchange,
      handler: TaggedEventHandler[durationchange],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_durationchange(
      node: HTMLElement,
      eventName: durationchange,
      handler: TaggedEventHandler[durationchange],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_emptied(node: HTMLElement, eventName: emptied, handler: TaggedEventHandler[emptied]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_emptied(node: HTMLElement, eventName: emptied, handler: TaggedEventHandler[emptied], options: Boolean): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_emptied(
      node: HTMLElement,
      eventName: emptied,
      handler: TaggedEventHandler[emptied],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ended(node: HTMLElement, eventName: ended, handler: TaggedEventHandler[ended]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ended(node: HTMLElement, eventName: ended, handler: TaggedEventHandler[ended], options: Boolean): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ended(
      node: HTMLElement,
      eventName: ended,
      handler: TaggedEventHandler[ended],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_error(node: HTMLElement, eventName: error, handler: TaggedEventHandler[error]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_error(node: HTMLElement, eventName: error, handler: TaggedEventHandler[error], options: Boolean): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_error(
      node: HTMLElement,
      eventName: error,
      handler: TaggedEventHandler[error],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_focus(node: HTMLElement, eventName: focus, handler: TaggedEventHandler[focus]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_focus(node: HTMLElement, eventName: focus, handler: TaggedEventHandler[focus], options: Boolean): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_focus(
      node: HTMLElement,
      eventName: focus,
      handler: TaggedEventHandler[focus],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_focusin(node: HTMLElement, eventName: focusin, handler: TaggedEventHandler[focusin]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_focusin(node: HTMLElement, eventName: focusin, handler: TaggedEventHandler[focusin], options: Boolean): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_focusin(
      node: HTMLElement,
      eventName: focusin,
      handler: TaggedEventHandler[focusin],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_focusout(node: HTMLElement, eventName: focusout, handler: TaggedEventHandler[focusout]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_focusout(node: HTMLElement, eventName: focusout, handler: TaggedEventHandler[focusout], options: Boolean): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_focusout(
      node: HTMLElement,
      eventName: focusout,
      handler: TaggedEventHandler[focusout],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_fullscreenchange(node: HTMLElement, eventName: fullscreenchange, handler: TaggedEventHandler[fullscreenchange]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_fullscreenchange(
      node: HTMLElement,
      eventName: fullscreenchange,
      handler: TaggedEventHandler[fullscreenchange],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_fullscreenchange(
      node: HTMLElement,
      eventName: fullscreenchange,
      handler: TaggedEventHandler[fullscreenchange],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_fullscreenerror(node: HTMLElement, eventName: fullscreenerror, handler: TaggedEventHandler[fullscreenerror]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_fullscreenerror(
      node: HTMLElement,
      eventName: fullscreenerror,
      handler: TaggedEventHandler[fullscreenerror],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_fullscreenerror(
      node: HTMLElement,
      eventName: fullscreenerror,
      handler: TaggedEventHandler[fullscreenerror],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_gotpointercapture(node: HTMLElement, eventName: gotpointercapture, handler: TaggedEventHandler[gotpointercapture]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_gotpointercapture(
      node: HTMLElement,
      eventName: gotpointercapture,
      handler: TaggedEventHandler[gotpointercapture],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_gotpointercapture(
      node: HTMLElement,
      eventName: gotpointercapture,
      handler: TaggedEventHandler[gotpointercapture],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_input(node: HTMLElement, eventName: input, handler: TaggedEventHandler[input]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_input(node: HTMLElement, eventName: input, handler: TaggedEventHandler[input], options: Boolean): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_input(
      node: HTMLElement,
      eventName: input,
      handler: TaggedEventHandler[input],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_invalid(node: HTMLElement, eventName: invalid, handler: TaggedEventHandler[invalid]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_invalid(node: HTMLElement, eventName: invalid, handler: TaggedEventHandler[invalid], options: Boolean): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_invalid(
      node: HTMLElement,
      eventName: invalid,
      handler: TaggedEventHandler[invalid],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_keydown(node: HTMLElement, eventName: keydown, handler: TaggedEventHandler[keydown]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_keydown(node: HTMLElement, eventName: keydown, handler: TaggedEventHandler[keydown], options: Boolean): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_keydown(
      node: HTMLElement,
      eventName: keydown,
      handler: TaggedEventHandler[keydown],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_keypress(node: HTMLElement, eventName: keypress, handler: TaggedEventHandler[keypress]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_keypress(node: HTMLElement, eventName: keypress, handler: TaggedEventHandler[keypress], options: Boolean): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_keypress(
      node: HTMLElement,
      eventName: keypress,
      handler: TaggedEventHandler[keypress],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_keyup(node: HTMLElement, eventName: keyup, handler: TaggedEventHandler[keyup]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_keyup(node: HTMLElement, eventName: keyup, handler: TaggedEventHandler[keyup], options: Boolean): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_keyup(
      node: HTMLElement,
      eventName: keyup,
      handler: TaggedEventHandler[keyup],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_load(node: HTMLElement, eventName: load, handler: TaggedEventHandler[load]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_load(node: HTMLElement, eventName: load, handler: TaggedEventHandler[load], options: Boolean): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_load(
      node: HTMLElement,
      eventName: load,
      handler: TaggedEventHandler[load],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_loadeddata(node: HTMLElement, eventName: loadeddata, handler: TaggedEventHandler[loadeddata]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_loadeddata(
      node: HTMLElement,
      eventName: loadeddata,
      handler: TaggedEventHandler[loadeddata],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_loadeddata(
      node: HTMLElement,
      eventName: loadeddata,
      handler: TaggedEventHandler[loadeddata],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_loadedmetadata(node: HTMLElement, eventName: loadedmetadata, handler: TaggedEventHandler[loadedmetadata]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_loadedmetadata(
      node: HTMLElement,
      eventName: loadedmetadata,
      handler: TaggedEventHandler[loadedmetadata],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_loadedmetadata(
      node: HTMLElement,
      eventName: loadedmetadata,
      handler: TaggedEventHandler[loadedmetadata],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_loadend(node: HTMLElement, eventName: loadend, handler: TaggedEventHandler[loadend]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_loadend(node: HTMLElement, eventName: loadend, handler: TaggedEventHandler[loadend], options: Boolean): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_loadend(
      node: HTMLElement,
      eventName: loadend,
      handler: TaggedEventHandler[loadend],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_loadstart(node: HTMLElement, eventName: loadstart, handler: TaggedEventHandler[loadstart]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_loadstart(node: HTMLElement, eventName: loadstart, handler: TaggedEventHandler[loadstart], options: Boolean): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_loadstart(
      node: HTMLElement,
      eventName: loadstart,
      handler: TaggedEventHandler[loadstart],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_lostpointercapture(node: HTMLElement, eventName: lostpointercapture, handler: TaggedEventHandler[lostpointercapture]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_lostpointercapture(
      node: HTMLElement,
      eventName: lostpointercapture,
      handler: TaggedEventHandler[lostpointercapture],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_lostpointercapture(
      node: HTMLElement,
      eventName: lostpointercapture,
      handler: TaggedEventHandler[lostpointercapture],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_mousedown(node: HTMLElement, eventName: mousedown, handler: TaggedEventHandler[mousedown]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_mousedown(node: HTMLElement, eventName: mousedown, handler: TaggedEventHandler[mousedown], options: Boolean): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_mousedown(
      node: HTMLElement,
      eventName: mousedown,
      handler: TaggedEventHandler[mousedown],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_mouseenter(node: HTMLElement, eventName: mouseenter, handler: TaggedEventHandler[mouseenter]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_mouseenter(
      node: HTMLElement,
      eventName: mouseenter,
      handler: TaggedEventHandler[mouseenter],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_mouseenter(
      node: HTMLElement,
      eventName: mouseenter,
      handler: TaggedEventHandler[mouseenter],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_mouseleave(node: HTMLElement, eventName: mouseleave, handler: TaggedEventHandler[mouseleave]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_mouseleave(
      node: HTMLElement,
      eventName: mouseleave,
      handler: TaggedEventHandler[mouseleave],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_mouseleave(
      node: HTMLElement,
      eventName: mouseleave,
      handler: TaggedEventHandler[mouseleave],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_mousemove(node: HTMLElement, eventName: mousemove, handler: TaggedEventHandler[mousemove]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_mousemove(node: HTMLElement, eventName: mousemove, handler: TaggedEventHandler[mousemove], options: Boolean): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_mousemove(
      node: HTMLElement,
      eventName: mousemove,
      handler: TaggedEventHandler[mousemove],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_mouseout(node: HTMLElement, eventName: mouseout, handler: TaggedEventHandler[mouseout]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_mouseout(node: HTMLElement, eventName: mouseout, handler: TaggedEventHandler[mouseout], options: Boolean): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_mouseout(
      node: HTMLElement,
      eventName: mouseout,
      handler: TaggedEventHandler[mouseout],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_mouseover(node: HTMLElement, eventName: mouseover, handler: TaggedEventHandler[mouseover]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_mouseover(node: HTMLElement, eventName: mouseover, handler: TaggedEventHandler[mouseover], options: Boolean): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_mouseover(
      node: HTMLElement,
      eventName: mouseover,
      handler: TaggedEventHandler[mouseover],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_mouseup(node: HTMLElement, eventName: mouseup, handler: TaggedEventHandler[mouseup]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_mouseup(node: HTMLElement, eventName: mouseup, handler: TaggedEventHandler[mouseup], options: Boolean): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_mouseup(
      node: HTMLElement,
      eventName: mouseup,
      handler: TaggedEventHandler[mouseup],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_paste(node: HTMLElement, eventName: paste, handler: TaggedEventHandler[paste]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_paste(node: HTMLElement, eventName: paste, handler: TaggedEventHandler[paste], options: Boolean): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_paste(
      node: HTMLElement,
      eventName: paste,
      handler: TaggedEventHandler[paste],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pause(node: HTMLElement, eventName: pause, handler: TaggedEventHandler[pause]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pause(node: HTMLElement, eventName: pause, handler: TaggedEventHandler[pause], options: Boolean): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pause(
      node: HTMLElement,
      eventName: pause,
      handler: TaggedEventHandler[pause],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_play(node: HTMLElement, eventName: play, handler: TaggedEventHandler[play]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_play(node: HTMLElement, eventName: play, handler: TaggedEventHandler[play], options: Boolean): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_play(
      node: HTMLElement,
      eventName: play,
      handler: TaggedEventHandler[play],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_playing(node: HTMLElement, eventName: playing, handler: TaggedEventHandler[playing]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_playing(node: HTMLElement, eventName: playing, handler: TaggedEventHandler[playing], options: Boolean): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_playing(
      node: HTMLElement,
      eventName: playing,
      handler: TaggedEventHandler[playing],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pointercancel(node: HTMLElement, eventName: pointercancel, handler: TaggedEventHandler[pointercancel]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pointercancel(
      node: HTMLElement,
      eventName: pointercancel,
      handler: TaggedEventHandler[pointercancel],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pointercancel(
      node: HTMLElement,
      eventName: pointercancel,
      handler: TaggedEventHandler[pointercancel],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pointerdown(node: HTMLElement, eventName: pointerdown, handler: TaggedEventHandler[pointerdown]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pointerdown(
      node: HTMLElement,
      eventName: pointerdown,
      handler: TaggedEventHandler[pointerdown],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pointerdown(
      node: HTMLElement,
      eventName: pointerdown,
      handler: TaggedEventHandler[pointerdown],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pointerenter(node: HTMLElement, eventName: pointerenter, handler: TaggedEventHandler[pointerenter]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pointerenter(
      node: HTMLElement,
      eventName: pointerenter,
      handler: TaggedEventHandler[pointerenter],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pointerenter(
      node: HTMLElement,
      eventName: pointerenter,
      handler: TaggedEventHandler[pointerenter],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pointerleave(node: HTMLElement, eventName: pointerleave, handler: TaggedEventHandler[pointerleave]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pointerleave(
      node: HTMLElement,
      eventName: pointerleave,
      handler: TaggedEventHandler[pointerleave],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pointerleave(
      node: HTMLElement,
      eventName: pointerleave,
      handler: TaggedEventHandler[pointerleave],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pointermove(node: HTMLElement, eventName: pointermove, handler: TaggedEventHandler[pointermove]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pointermove(
      node: HTMLElement,
      eventName: pointermove,
      handler: TaggedEventHandler[pointermove],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pointermove(
      node: HTMLElement,
      eventName: pointermove,
      handler: TaggedEventHandler[pointermove],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pointerout(node: HTMLElement, eventName: pointerout, handler: TaggedEventHandler[pointerout]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pointerout(
      node: HTMLElement,
      eventName: pointerout,
      handler: TaggedEventHandler[pointerout],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pointerout(
      node: HTMLElement,
      eventName: pointerout,
      handler: TaggedEventHandler[pointerout],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pointerover(node: HTMLElement, eventName: pointerover, handler: TaggedEventHandler[pointerover]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pointerover(
      node: HTMLElement,
      eventName: pointerover,
      handler: TaggedEventHandler[pointerover],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pointerover(
      node: HTMLElement,
      eventName: pointerover,
      handler: TaggedEventHandler[pointerover],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pointerup(node: HTMLElement, eventName: pointerup, handler: TaggedEventHandler[pointerup]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pointerup(node: HTMLElement, eventName: pointerup, handler: TaggedEventHandler[pointerup], options: Boolean): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pointerup(
      node: HTMLElement,
      eventName: pointerup,
      handler: TaggedEventHandler[pointerup],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_progress(node: HTMLElement, eventName: progress, handler: TaggedEventHandler[progress]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_progress(node: HTMLElement, eventName: progress, handler: TaggedEventHandler[progress], options: Boolean): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_progress(
      node: HTMLElement,
      eventName: progress,
      handler: TaggedEventHandler[progress],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ratechange(node: HTMLElement, eventName: ratechange, handler: TaggedEventHandler[ratechange]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ratechange(
      node: HTMLElement,
      eventName: ratechange,
      handler: TaggedEventHandler[ratechange],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ratechange(
      node: HTMLElement,
      eventName: ratechange,
      handler: TaggedEventHandler[ratechange],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_reset(node: HTMLElement, eventName: reset, handler: TaggedEventHandler[reset]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_reset(node: HTMLElement, eventName: reset, handler: TaggedEventHandler[reset], options: Boolean): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_reset(
      node: HTMLElement,
      eventName: reset,
      handler: TaggedEventHandler[reset],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_resize(node: HTMLElement, eventName: resize, handler: TaggedEventHandler[resize]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_resize(node: HTMLElement, eventName: resize, handler: TaggedEventHandler[resize], options: Boolean): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_resize(
      node: HTMLElement,
      eventName: resize,
      handler: TaggedEventHandler[resize],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_scroll(node: HTMLElement, eventName: scroll, handler: TaggedEventHandler[scroll]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_scroll(node: HTMLElement, eventName: scroll, handler: TaggedEventHandler[scroll], options: Boolean): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_scroll(
      node: HTMLElement,
      eventName: scroll,
      handler: TaggedEventHandler[scroll],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_securitypolicyviolation(
      node: HTMLElement,
      eventName: securitypolicyviolation,
      handler: TaggedEventHandler[securitypolicyviolation]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_securitypolicyviolation(
      node: HTMLElement,
      eventName: securitypolicyviolation,
      handler: TaggedEventHandler[securitypolicyviolation],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_securitypolicyviolation(
      node: HTMLElement,
      eventName: securitypolicyviolation,
      handler: TaggedEventHandler[securitypolicyviolation],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_seeked(node: HTMLElement, eventName: seeked, handler: TaggedEventHandler[seeked]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_seeked(node: HTMLElement, eventName: seeked, handler: TaggedEventHandler[seeked], options: Boolean): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_seeked(
      node: HTMLElement,
      eventName: seeked,
      handler: TaggedEventHandler[seeked],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_seeking(node: HTMLElement, eventName: seeking, handler: TaggedEventHandler[seeking]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_seeking(node: HTMLElement, eventName: seeking, handler: TaggedEventHandler[seeking], options: Boolean): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_seeking(
      node: HTMLElement,
      eventName: seeking,
      handler: TaggedEventHandler[seeking],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_select(node: HTMLElement, eventName: select, handler: TaggedEventHandler[select]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_select(node: HTMLElement, eventName: select, handler: TaggedEventHandler[select], options: Boolean): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_select(
      node: HTMLElement,
      eventName: select,
      handler: TaggedEventHandler[select],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_selectionchange(node: HTMLElement, eventName: selectionchange, handler: TaggedEventHandler[selectionchange]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_selectionchange(
      node: HTMLElement,
      eventName: selectionchange,
      handler: TaggedEventHandler[selectionchange],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_selectionchange(
      node: HTMLElement,
      eventName: selectionchange,
      handler: TaggedEventHandler[selectionchange],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_selectstart(node: HTMLElement, eventName: selectstart, handler: TaggedEventHandler[selectstart]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_selectstart(
      node: HTMLElement,
      eventName: selectstart,
      handler: TaggedEventHandler[selectstart],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_selectstart(
      node: HTMLElement,
      eventName: selectstart,
      handler: TaggedEventHandler[selectstart],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_stalled(node: HTMLElement, eventName: stalled, handler: TaggedEventHandler[stalled]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_stalled(node: HTMLElement, eventName: stalled, handler: TaggedEventHandler[stalled], options: Boolean): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_stalled(
      node: HTMLElement,
      eventName: stalled,
      handler: TaggedEventHandler[stalled],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_submit(node: HTMLElement, eventName: submit, handler: TaggedEventHandler[submit]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_submit(node: HTMLElement, eventName: submit, handler: TaggedEventHandler[submit], options: Boolean): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_submit(
      node: HTMLElement,
      eventName: submit,
      handler: TaggedEventHandler[submit],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_suspend(node: HTMLElement, eventName: suspend, handler: TaggedEventHandler[suspend]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_suspend(node: HTMLElement, eventName: suspend, handler: TaggedEventHandler[suspend], options: Boolean): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_suspend(
      node: HTMLElement,
      eventName: suspend,
      handler: TaggedEventHandler[suspend],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_timeupdate(node: HTMLElement, eventName: timeupdate, handler: TaggedEventHandler[timeupdate]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_timeupdate(
      node: HTMLElement,
      eventName: timeupdate,
      handler: TaggedEventHandler[timeupdate],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_timeupdate(
      node: HTMLElement,
      eventName: timeupdate,
      handler: TaggedEventHandler[timeupdate],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_toggle(node: HTMLElement, eventName: toggle, handler: TaggedEventHandler[toggle]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_toggle(node: HTMLElement, eventName: toggle, handler: TaggedEventHandler[toggle], options: Boolean): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_toggle(
      node: HTMLElement,
      eventName: toggle,
      handler: TaggedEventHandler[toggle],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_touchcancel(node: HTMLElement, eventName: touchcancel, handler: TaggedEventHandler[touchcancel]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_touchcancel(
      node: HTMLElement,
      eventName: touchcancel,
      handler: TaggedEventHandler[touchcancel],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_touchcancel(
      node: HTMLElement,
      eventName: touchcancel,
      handler: TaggedEventHandler[touchcancel],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_touchend(node: HTMLElement, eventName: touchend, handler: TaggedEventHandler[touchend]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_touchend(node: HTMLElement, eventName: touchend, handler: TaggedEventHandler[touchend], options: Boolean): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_touchend(
      node: HTMLElement,
      eventName: touchend,
      handler: TaggedEventHandler[touchend],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_touchmove(node: HTMLElement, eventName: touchmove, handler: TaggedEventHandler[touchmove]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_touchmove(node: HTMLElement, eventName: touchmove, handler: TaggedEventHandler[touchmove], options: Boolean): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_touchmove(
      node: HTMLElement,
      eventName: touchmove,
      handler: TaggedEventHandler[touchmove],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_touchstart(node: HTMLElement, eventName: touchstart, handler: TaggedEventHandler[touchstart]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_touchstart(
      node: HTMLElement,
      eventName: touchstart,
      handler: TaggedEventHandler[touchstart],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_touchstart(
      node: HTMLElement,
      eventName: touchstart,
      handler: TaggedEventHandler[touchstart],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_transitioncancel(node: HTMLElement, eventName: transitioncancel, handler: TaggedEventHandler[transitioncancel]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_transitioncancel(
      node: HTMLElement,
      eventName: transitioncancel,
      handler: TaggedEventHandler[transitioncancel],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_transitioncancel(
      node: HTMLElement,
      eventName: transitioncancel,
      handler: TaggedEventHandler[transitioncancel],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_transitionend(node: HTMLElement, eventName: transitionend, handler: TaggedEventHandler[transitionend]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_transitionend(
      node: HTMLElement,
      eventName: transitionend,
      handler: TaggedEventHandler[transitionend],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_transitionend(
      node: HTMLElement,
      eventName: transitionend,
      handler: TaggedEventHandler[transitionend],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_transitionrun(node: HTMLElement, eventName: transitionrun, handler: TaggedEventHandler[transitionrun]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_transitionrun(
      node: HTMLElement,
      eventName: transitionrun,
      handler: TaggedEventHandler[transitionrun],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_transitionrun(
      node: HTMLElement,
      eventName: transitionrun,
      handler: TaggedEventHandler[transitionrun],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_transitionstart(node: HTMLElement, eventName: transitionstart, handler: TaggedEventHandler[transitionstart]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_transitionstart(
      node: HTMLElement,
      eventName: transitionstart,
      handler: TaggedEventHandler[transitionstart],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_transitionstart(
      node: HTMLElement,
      eventName: transitionstart,
      handler: TaggedEventHandler[transitionstart],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_volumechange(node: HTMLElement, eventName: volumechange, handler: TaggedEventHandler[volumechange]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_volumechange(
      node: HTMLElement,
      eventName: volumechange,
      handler: TaggedEventHandler[volumechange],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_volumechange(
      node: HTMLElement,
      eventName: volumechange,
      handler: TaggedEventHandler[volumechange],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_waiting(node: HTMLElement, eventName: waiting, handler: TaggedEventHandler[waiting]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_waiting(node: HTMLElement, eventName: waiting, handler: TaggedEventHandler[waiting], options: Boolean): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_waiting(
      node: HTMLElement,
      eventName: waiting,
      handler: TaggedEventHandler[waiting],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_wheel(node: HTMLElement, eventName: wheel, handler: TaggedEventHandler[wheel]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_wheel(node: HTMLElement, eventName: wheel, handler: TaggedEventHandler[wheel], options: Boolean): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_wheel(
      node: HTMLElement,
      eventName: wheel,
      handler: TaggedEventHandler[wheel],
      options: AddEventListenerOptions
    ): Unit = js.native
    def cancelAnimationFrame(id: Double): Unit = js.native
    def closest(node: Element, selector: String): Element | Null = js.native
    def closest(node: Element, selector: String, stopAt: Element): Element | Null = js.native
    def contains(context: Element, node: Element): js.UndefOr[Boolean] = js.native
    @JSName("filter")
    def filter_abort(selector: String, handler: EventHandler[abort]): EventHandler[abort] = js.native
    @JSName("filter")
    def filter_animationcancel(selector: String, handler: EventHandler[animationcancel]): EventHandler[animationcancel] = js.native
    @JSName("filter")
    def filter_animationend(selector: String, handler: EventHandler[animationend]): EventHandler[animationend] = js.native
    @JSName("filter")
    def filter_animationiteration(selector: String, handler: EventHandler[animationiteration]): EventHandler[animationiteration] = js.native
    @JSName("filter")
    def filter_animationstart(selector: String, handler: EventHandler[animationstart]): EventHandler[animationstart] = js.native
    @JSName("filter")
    def filter_auxclick(selector: String, handler: EventHandler[auxclick]): EventHandler[auxclick] = js.native
    @JSName("filter")
    def filter_blur(selector: String, handler: EventHandler[blur]): EventHandler[blur] = js.native
    @JSName("filter")
    def filter_cancel(selector: String, handler: EventHandler[cancel]): EventHandler[cancel] = js.native
    @JSName("filter")
    def filter_canplay(selector: String, handler: EventHandler[canplay]): EventHandler[canplay] = js.native
    @JSName("filter")
    def filter_canplaythrough(selector: String, handler: EventHandler[canplaythrough]): EventHandler[canplaythrough] = js.native
    @JSName("filter")
    def filter_change(selector: String, handler: EventHandler[change]): EventHandler[change] = js.native
    @JSName("filter")
    def filter_click(selector: String, handler: EventHandler[click]): EventHandler[click] = js.native
    @JSName("filter")
    def filter_close(selector: String, handler: EventHandler[close]): EventHandler[close] = js.native
    @JSName("filter")
    def filter_contextmenu(selector: String, handler: EventHandler[contextmenu]): EventHandler[contextmenu] = js.native
    @JSName("filter")
    def filter_copy(selector: String, handler: EventHandler[copy]): EventHandler[copy] = js.native
    @JSName("filter")
    def filter_cuechange(selector: String, handler: EventHandler[cuechange]): EventHandler[cuechange] = js.native
    @JSName("filter")
    def filter_cut(selector: String, handler: EventHandler[cut]): EventHandler[cut] = js.native
    @JSName("filter")
    def filter_dblclick(selector: String, handler: EventHandler[dblclick]): EventHandler[dblclick] = js.native
    @JSName("filter")
    def filter_drag(selector: String, handler: EventHandler[drag]): EventHandler[drag] = js.native
    @JSName("filter")
    def filter_dragend(selector: String, handler: EventHandler[dragend]): EventHandler[dragend] = js.native
    @JSName("filter")
    def filter_dragenter(selector: String, handler: EventHandler[dragenter]): EventHandler[dragenter] = js.native
    @JSName("filter")
    def filter_dragexit(selector: String, handler: EventHandler[dragexit]): EventHandler[dragexit] = js.native
    @JSName("filter")
    def filter_dragleave(selector: String, handler: EventHandler[dragleave]): EventHandler[dragleave] = js.native
    @JSName("filter")
    def filter_dragover(selector: String, handler: EventHandler[dragover]): EventHandler[dragover] = js.native
    @JSName("filter")
    def filter_dragstart(selector: String, handler: EventHandler[dragstart]): EventHandler[dragstart] = js.native
    @JSName("filter")
    def filter_drop(selector: String, handler: EventHandler[drop]): EventHandler[drop] = js.native
    @JSName("filter")
    def filter_durationchange(selector: String, handler: EventHandler[durationchange]): EventHandler[durationchange] = js.native
    @JSName("filter")
    def filter_emptied(selector: String, handler: EventHandler[emptied]): EventHandler[emptied] = js.native
    @JSName("filter")
    def filter_ended(selector: String, handler: EventHandler[ended]): EventHandler[ended] = js.native
    @JSName("filter")
    def filter_error(selector: String, handler: EventHandler[error]): EventHandler[error] = js.native
    @JSName("filter")
    def filter_focus(selector: String, handler: EventHandler[focus]): EventHandler[focus] = js.native
    @JSName("filter")
    def filter_focusin(selector: String, handler: EventHandler[focusin]): EventHandler[focusin] = js.native
    @JSName("filter")
    def filter_focusout(selector: String, handler: EventHandler[focusout]): EventHandler[focusout] = js.native
    @JSName("filter")
    def filter_fullscreenchange(selector: String, handler: EventHandler[fullscreenchange]): EventHandler[fullscreenchange] = js.native
    @JSName("filter")
    def filter_fullscreenerror(selector: String, handler: EventHandler[fullscreenerror]): EventHandler[fullscreenerror] = js.native
    @JSName("filter")
    def filter_gotpointercapture(selector: String, handler: EventHandler[gotpointercapture]): EventHandler[gotpointercapture] = js.native
    @JSName("filter")
    def filter_input(selector: String, handler: EventHandler[input]): EventHandler[input] = js.native
    @JSName("filter")
    def filter_invalid(selector: String, handler: EventHandler[invalid]): EventHandler[invalid] = js.native
    @JSName("filter")
    def filter_keydown(selector: String, handler: EventHandler[keydown]): EventHandler[keydown] = js.native
    @JSName("filter")
    def filter_keypress(selector: String, handler: EventHandler[keypress]): EventHandler[keypress] = js.native
    @JSName("filter")
    def filter_keyup(selector: String, handler: EventHandler[keyup]): EventHandler[keyup] = js.native
    @JSName("filter")
    def filter_load(selector: String, handler: EventHandler[load]): EventHandler[load] = js.native
    @JSName("filter")
    def filter_loadeddata(selector: String, handler: EventHandler[loadeddata]): EventHandler[loadeddata] = js.native
    @JSName("filter")
    def filter_loadedmetadata(selector: String, handler: EventHandler[loadedmetadata]): EventHandler[loadedmetadata] = js.native
    @JSName("filter")
    def filter_loadend(selector: String, handler: EventHandler[loadend]): EventHandler[loadend] = js.native
    @JSName("filter")
    def filter_loadstart(selector: String, handler: EventHandler[loadstart]): EventHandler[loadstart] = js.native
    @JSName("filter")
    def filter_lostpointercapture(selector: String, handler: EventHandler[lostpointercapture]): EventHandler[lostpointercapture] = js.native
    @JSName("filter")
    def filter_mousedown(selector: String, handler: EventHandler[mousedown]): EventHandler[mousedown] = js.native
    @JSName("filter")
    def filter_mouseenter(selector: String, handler: EventHandler[mouseenter]): EventHandler[mouseenter] = js.native
    @JSName("filter")
    def filter_mouseleave(selector: String, handler: EventHandler[mouseleave]): EventHandler[mouseleave] = js.native
    @JSName("filter")
    def filter_mousemove(selector: String, handler: EventHandler[mousemove]): EventHandler[mousemove] = js.native
    @JSName("filter")
    def filter_mouseout(selector: String, handler: EventHandler[mouseout]): EventHandler[mouseout] = js.native
    @JSName("filter")
    def filter_mouseover(selector: String, handler: EventHandler[mouseover]): EventHandler[mouseover] = js.native
    @JSName("filter")
    def filter_mouseup(selector: String, handler: EventHandler[mouseup]): EventHandler[mouseup] = js.native
    @JSName("filter")
    def filter_paste(selector: String, handler: EventHandler[paste]): EventHandler[paste] = js.native
    @JSName("filter")
    def filter_pause(selector: String, handler: EventHandler[pause]): EventHandler[pause] = js.native
    @JSName("filter")
    def filter_play(selector: String, handler: EventHandler[play]): EventHandler[play] = js.native
    @JSName("filter")
    def filter_playing(selector: String, handler: EventHandler[playing]): EventHandler[playing] = js.native
    @JSName("filter")
    def filter_pointercancel(selector: String, handler: EventHandler[pointercancel]): EventHandler[pointercancel] = js.native
    @JSName("filter")
    def filter_pointerdown(selector: String, handler: EventHandler[pointerdown]): EventHandler[pointerdown] = js.native
    @JSName("filter")
    def filter_pointerenter(selector: String, handler: EventHandler[pointerenter]): EventHandler[pointerenter] = js.native
    @JSName("filter")
    def filter_pointerleave(selector: String, handler: EventHandler[pointerleave]): EventHandler[pointerleave] = js.native
    @JSName("filter")
    def filter_pointermove(selector: String, handler: EventHandler[pointermove]): EventHandler[pointermove] = js.native
    @JSName("filter")
    def filter_pointerout(selector: String, handler: EventHandler[pointerout]): EventHandler[pointerout] = js.native
    @JSName("filter")
    def filter_pointerover(selector: String, handler: EventHandler[pointerover]): EventHandler[pointerover] = js.native
    @JSName("filter")
    def filter_pointerup(selector: String, handler: EventHandler[pointerup]): EventHandler[pointerup] = js.native
    @JSName("filter")
    def filter_progress(selector: String, handler: EventHandler[progress]): EventHandler[progress] = js.native
    @JSName("filter")
    def filter_ratechange(selector: String, handler: EventHandler[ratechange]): EventHandler[ratechange] = js.native
    @JSName("filter")
    def filter_reset(selector: String, handler: EventHandler[reset]): EventHandler[reset] = js.native
    @JSName("filter")
    def filter_resize(selector: String, handler: EventHandler[resize]): EventHandler[resize] = js.native
    @JSName("filter")
    def filter_scroll(selector: String, handler: EventHandler[scroll]): EventHandler[scroll] = js.native
    @JSName("filter")
    def filter_securitypolicyviolation(selector: String, handler: EventHandler[securitypolicyviolation]): EventHandler[securitypolicyviolation] = js.native
    @JSName("filter")
    def filter_seeked(selector: String, handler: EventHandler[seeked]): EventHandler[seeked] = js.native
    @JSName("filter")
    def filter_seeking(selector: String, handler: EventHandler[seeking]): EventHandler[seeking] = js.native
    @JSName("filter")
    def filter_select(selector: String, handler: EventHandler[select]): EventHandler[select] = js.native
    @JSName("filter")
    def filter_selectionchange(selector: String, handler: EventHandler[selectionchange]): EventHandler[selectionchange] = js.native
    @JSName("filter")
    def filter_selectstart(selector: String, handler: EventHandler[selectstart]): EventHandler[selectstart] = js.native
    @JSName("filter")
    def filter_stalled(selector: String, handler: EventHandler[stalled]): EventHandler[stalled] = js.native
    @JSName("filter")
    def filter_submit(selector: String, handler: EventHandler[submit]): EventHandler[submit] = js.native
    @JSName("filter")
    def filter_suspend(selector: String, handler: EventHandler[suspend]): EventHandler[suspend] = js.native
    @JSName("filter")
    def filter_timeupdate(selector: String, handler: EventHandler[timeupdate]): EventHandler[timeupdate] = js.native
    @JSName("filter")
    def filter_toggle(selector: String, handler: EventHandler[toggle]): EventHandler[toggle] = js.native
    @JSName("filter")
    def filter_touchcancel(selector: String, handler: EventHandler[touchcancel]): EventHandler[touchcancel] = js.native
    @JSName("filter")
    def filter_touchend(selector: String, handler: EventHandler[touchend]): EventHandler[touchend] = js.native
    @JSName("filter")
    def filter_touchmove(selector: String, handler: EventHandler[touchmove]): EventHandler[touchmove] = js.native
    @JSName("filter")
    def filter_touchstart(selector: String, handler: EventHandler[touchstart]): EventHandler[touchstart] = js.native
    @JSName("filter")
    def filter_transitioncancel(selector: String, handler: EventHandler[transitioncancel]): EventHandler[transitioncancel] = js.native
    @JSName("filter")
    def filter_transitionend(selector: String, handler: EventHandler[transitionend]): EventHandler[transitionend] = js.native
    @JSName("filter")
    def filter_transitionrun(selector: String, handler: EventHandler[transitionrun]): EventHandler[transitionrun] = js.native
    @JSName("filter")
    def filter_transitionstart(selector: String, handler: EventHandler[transitionstart]): EventHandler[transitionstart] = js.native
    @JSName("filter")
    def filter_volumechange(selector: String, handler: EventHandler[volumechange]): EventHandler[volumechange] = js.native
    @JSName("filter")
    def filter_waiting(selector: String, handler: EventHandler[waiting]): EventHandler[waiting] = js.native
    @JSName("filter")
    def filter_wheel(selector: String, handler: EventHandler[wheel]): EventHandler[wheel] = js.native
    def hasClass(element: Element, className: String): Boolean = js.native
    def hasClass(element: SVGElement, className: String): Boolean = js.native
    def height(node: HTMLElement): Double = js.native
    def height(node: HTMLElement, client: Boolean): Double = js.native
    @JSName("listen")
    def listen_abort(node: HTMLElement, eventName: abort, handler: EventHandler[abort]): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_abort(node: HTMLElement, eventName: abort, handler: EventHandler[abort], options: Boolean): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_abort(
      node: HTMLElement,
      eventName: abort,
      handler: EventHandler[abort],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_animationcancel(node: HTMLElement, eventName: animationcancel, handler: EventHandler[animationcancel]): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_animationcancel(
      node: HTMLElement,
      eventName: animationcancel,
      handler: EventHandler[animationcancel],
      options: Boolean
    ): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_animationcancel(
      node: HTMLElement,
      eventName: animationcancel,
      handler: EventHandler[animationcancel],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_animationend(node: HTMLElement, eventName: animationend, handler: EventHandler[animationend]): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_animationend(node: HTMLElement, eventName: animationend, handler: EventHandler[animationend], options: Boolean): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_animationend(
      node: HTMLElement,
      eventName: animationend,
      handler: EventHandler[animationend],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_animationiteration(node: HTMLElement, eventName: animationiteration, handler: EventHandler[animationiteration]): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_animationiteration(
      node: HTMLElement,
      eventName: animationiteration,
      handler: EventHandler[animationiteration],
      options: Boolean
    ): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_animationiteration(
      node: HTMLElement,
      eventName: animationiteration,
      handler: EventHandler[animationiteration],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_animationstart(node: HTMLElement, eventName: animationstart, handler: EventHandler[animationstart]): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_animationstart(
      node: HTMLElement,
      eventName: animationstart,
      handler: EventHandler[animationstart],
      options: Boolean
    ): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_animationstart(
      node: HTMLElement,
      eventName: animationstart,
      handler: EventHandler[animationstart],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_auxclick(node: HTMLElement, eventName: auxclick, handler: EventHandler[auxclick]): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_auxclick(node: HTMLElement, eventName: auxclick, handler: EventHandler[auxclick], options: Boolean): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_auxclick(
      node: HTMLElement,
      eventName: auxclick,
      handler: EventHandler[auxclick],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_blur(node: HTMLElement, eventName: blur, handler: EventHandler[blur]): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_blur(node: HTMLElement, eventName: blur, handler: EventHandler[blur], options: Boolean): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_blur(node: HTMLElement, eventName: blur, handler: EventHandler[blur], options: AddEventListenerOptions): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_cancel(node: HTMLElement, eventName: cancel, handler: EventHandler[cancel]): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_cancel(node: HTMLElement, eventName: cancel, handler: EventHandler[cancel], options: Boolean): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_cancel(
      node: HTMLElement,
      eventName: cancel,
      handler: EventHandler[cancel],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_canplay(node: HTMLElement, eventName: canplay, handler: EventHandler[canplay]): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_canplay(node: HTMLElement, eventName: canplay, handler: EventHandler[canplay], options: Boolean): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_canplay(
      node: HTMLElement,
      eventName: canplay,
      handler: EventHandler[canplay],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_canplaythrough(node: HTMLElement, eventName: canplaythrough, handler: EventHandler[canplaythrough]): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_canplaythrough(
      node: HTMLElement,
      eventName: canplaythrough,
      handler: EventHandler[canplaythrough],
      options: Boolean
    ): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_canplaythrough(
      node: HTMLElement,
      eventName: canplaythrough,
      handler: EventHandler[canplaythrough],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_change(node: HTMLElement, eventName: change, handler: EventHandler[change]): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_change(node: HTMLElement, eventName: change, handler: EventHandler[change], options: Boolean): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_change(
      node: HTMLElement,
      eventName: change,
      handler: EventHandler[change],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_click(node: HTMLElement, eventName: click, handler: EventHandler[click]): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_click(node: HTMLElement, eventName: click, handler: EventHandler[click], options: Boolean): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_click(
      node: HTMLElement,
      eventName: click,
      handler: EventHandler[click],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_close(node: HTMLElement, eventName: close, handler: EventHandler[close]): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_close(node: HTMLElement, eventName: close, handler: EventHandler[close], options: Boolean): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_close(
      node: HTMLElement,
      eventName: close,
      handler: EventHandler[close],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_contextmenu(node: HTMLElement, eventName: contextmenu, handler: EventHandler[contextmenu]): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_contextmenu(node: HTMLElement, eventName: contextmenu, handler: EventHandler[contextmenu], options: Boolean): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_contextmenu(
      node: HTMLElement,
      eventName: contextmenu,
      handler: EventHandler[contextmenu],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_copy(node: HTMLElement, eventName: copy, handler: EventHandler[copy]): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_copy(node: HTMLElement, eventName: copy, handler: EventHandler[copy], options: Boolean): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_copy(node: HTMLElement, eventName: copy, handler: EventHandler[copy], options: AddEventListenerOptions): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_cuechange(node: HTMLElement, eventName: cuechange, handler: EventHandler[cuechange]): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_cuechange(node: HTMLElement, eventName: cuechange, handler: EventHandler[cuechange], options: Boolean): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_cuechange(
      node: HTMLElement,
      eventName: cuechange,
      handler: EventHandler[cuechange],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_cut(node: HTMLElement, eventName: cut, handler: EventHandler[cut]): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_cut(node: HTMLElement, eventName: cut, handler: EventHandler[cut], options: Boolean): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_cut(node: HTMLElement, eventName: cut, handler: EventHandler[cut], options: AddEventListenerOptions): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_dblclick(node: HTMLElement, eventName: dblclick, handler: EventHandler[dblclick]): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_dblclick(node: HTMLElement, eventName: dblclick, handler: EventHandler[dblclick], options: Boolean): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_dblclick(
      node: HTMLElement,
      eventName: dblclick,
      handler: EventHandler[dblclick],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_drag(node: HTMLElement, eventName: drag, handler: EventHandler[drag]): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_drag(node: HTMLElement, eventName: drag, handler: EventHandler[drag], options: Boolean): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_drag(node: HTMLElement, eventName: drag, handler: EventHandler[drag], options: AddEventListenerOptions): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_dragend(node: HTMLElement, eventName: dragend, handler: EventHandler[dragend]): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_dragend(node: HTMLElement, eventName: dragend, handler: EventHandler[dragend], options: Boolean): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_dragend(
      node: HTMLElement,
      eventName: dragend,
      handler: EventHandler[dragend],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_dragenter(node: HTMLElement, eventName: dragenter, handler: EventHandler[dragenter]): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_dragenter(node: HTMLElement, eventName: dragenter, handler: EventHandler[dragenter], options: Boolean): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_dragenter(
      node: HTMLElement,
      eventName: dragenter,
      handler: EventHandler[dragenter],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_dragexit(node: HTMLElement, eventName: dragexit, handler: EventHandler[dragexit]): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_dragexit(node: HTMLElement, eventName: dragexit, handler: EventHandler[dragexit], options: Boolean): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_dragexit(
      node: HTMLElement,
      eventName: dragexit,
      handler: EventHandler[dragexit],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_dragleave(node: HTMLElement, eventName: dragleave, handler: EventHandler[dragleave]): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_dragleave(node: HTMLElement, eventName: dragleave, handler: EventHandler[dragleave], options: Boolean): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_dragleave(
      node: HTMLElement,
      eventName: dragleave,
      handler: EventHandler[dragleave],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_dragover(node: HTMLElement, eventName: dragover, handler: EventHandler[dragover]): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_dragover(node: HTMLElement, eventName: dragover, handler: EventHandler[dragover], options: Boolean): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_dragover(
      node: HTMLElement,
      eventName: dragover,
      handler: EventHandler[dragover],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_dragstart(node: HTMLElement, eventName: dragstart, handler: EventHandler[dragstart]): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_dragstart(node: HTMLElement, eventName: dragstart, handler: EventHandler[dragstart], options: Boolean): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_dragstart(
      node: HTMLElement,
      eventName: dragstart,
      handler: EventHandler[dragstart],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_drop(node: HTMLElement, eventName: drop, handler: EventHandler[drop]): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_drop(node: HTMLElement, eventName: drop, handler: EventHandler[drop], options: Boolean): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_drop(node: HTMLElement, eventName: drop, handler: EventHandler[drop], options: AddEventListenerOptions): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_durationchange(node: HTMLElement, eventName: durationchange, handler: EventHandler[durationchange]): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_durationchange(
      node: HTMLElement,
      eventName: durationchange,
      handler: EventHandler[durationchange],
      options: Boolean
    ): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_durationchange(
      node: HTMLElement,
      eventName: durationchange,
      handler: EventHandler[durationchange],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_emptied(node: HTMLElement, eventName: emptied, handler: EventHandler[emptied]): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_emptied(node: HTMLElement, eventName: emptied, handler: EventHandler[emptied], options: Boolean): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_emptied(
      node: HTMLElement,
      eventName: emptied,
      handler: EventHandler[emptied],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_ended(node: HTMLElement, eventName: ended, handler: EventHandler[ended]): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_ended(node: HTMLElement, eventName: ended, handler: EventHandler[ended], options: Boolean): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_ended(
      node: HTMLElement,
      eventName: ended,
      handler: EventHandler[ended],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_error(node: HTMLElement, eventName: error, handler: EventHandler[error]): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_error(node: HTMLElement, eventName: error, handler: EventHandler[error], options: Boolean): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_error(
      node: HTMLElement,
      eventName: error,
      handler: EventHandler[error],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_focus(node: HTMLElement, eventName: focus, handler: EventHandler[focus]): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_focus(node: HTMLElement, eventName: focus, handler: EventHandler[focus], options: Boolean): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_focus(
      node: HTMLElement,
      eventName: focus,
      handler: EventHandler[focus],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_focusin(node: HTMLElement, eventName: focusin, handler: EventHandler[focusin]): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_focusin(node: HTMLElement, eventName: focusin, handler: EventHandler[focusin], options: Boolean): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_focusin(
      node: HTMLElement,
      eventName: focusin,
      handler: EventHandler[focusin],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_focusout(node: HTMLElement, eventName: focusout, handler: EventHandler[focusout]): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_focusout(node: HTMLElement, eventName: focusout, handler: EventHandler[focusout], options: Boolean): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_focusout(
      node: HTMLElement,
      eventName: focusout,
      handler: EventHandler[focusout],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_fullscreenchange(node: HTMLElement, eventName: fullscreenchange, handler: EventHandler[fullscreenchange]): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_fullscreenchange(
      node: HTMLElement,
      eventName: fullscreenchange,
      handler: EventHandler[fullscreenchange],
      options: Boolean
    ): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_fullscreenchange(
      node: HTMLElement,
      eventName: fullscreenchange,
      handler: EventHandler[fullscreenchange],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_fullscreenerror(node: HTMLElement, eventName: fullscreenerror, handler: EventHandler[fullscreenerror]): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_fullscreenerror(
      node: HTMLElement,
      eventName: fullscreenerror,
      handler: EventHandler[fullscreenerror],
      options: Boolean
    ): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_fullscreenerror(
      node: HTMLElement,
      eventName: fullscreenerror,
      handler: EventHandler[fullscreenerror],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_gotpointercapture(node: HTMLElement, eventName: gotpointercapture, handler: EventHandler[gotpointercapture]): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_gotpointercapture(
      node: HTMLElement,
      eventName: gotpointercapture,
      handler: EventHandler[gotpointercapture],
      options: Boolean
    ): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_gotpointercapture(
      node: HTMLElement,
      eventName: gotpointercapture,
      handler: EventHandler[gotpointercapture],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_input(node: HTMLElement, eventName: input, handler: EventHandler[input]): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_input(node: HTMLElement, eventName: input, handler: EventHandler[input], options: Boolean): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_input(
      node: HTMLElement,
      eventName: input,
      handler: EventHandler[input],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_invalid(node: HTMLElement, eventName: invalid, handler: EventHandler[invalid]): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_invalid(node: HTMLElement, eventName: invalid, handler: EventHandler[invalid], options: Boolean): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_invalid(
      node: HTMLElement,
      eventName: invalid,
      handler: EventHandler[invalid],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_keydown(node: HTMLElement, eventName: keydown, handler: EventHandler[keydown]): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_keydown(node: HTMLElement, eventName: keydown, handler: EventHandler[keydown], options: Boolean): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_keydown(
      node: HTMLElement,
      eventName: keydown,
      handler: EventHandler[keydown],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_keypress(node: HTMLElement, eventName: keypress, handler: EventHandler[keypress]): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_keypress(node: HTMLElement, eventName: keypress, handler: EventHandler[keypress], options: Boolean): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_keypress(
      node: HTMLElement,
      eventName: keypress,
      handler: EventHandler[keypress],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_keyup(node: HTMLElement, eventName: keyup, handler: EventHandler[keyup]): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_keyup(node: HTMLElement, eventName: keyup, handler: EventHandler[keyup], options: Boolean): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_keyup(
      node: HTMLElement,
      eventName: keyup,
      handler: EventHandler[keyup],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_load(node: HTMLElement, eventName: load, handler: EventHandler[load]): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_load(node: HTMLElement, eventName: load, handler: EventHandler[load], options: Boolean): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_load(node: HTMLElement, eventName: load, handler: EventHandler[load], options: AddEventListenerOptions): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_loadeddata(node: HTMLElement, eventName: loadeddata, handler: EventHandler[loadeddata]): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_loadeddata(node: HTMLElement, eventName: loadeddata, handler: EventHandler[loadeddata], options: Boolean): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_loadeddata(
      node: HTMLElement,
      eventName: loadeddata,
      handler: EventHandler[loadeddata],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_loadedmetadata(node: HTMLElement, eventName: loadedmetadata, handler: EventHandler[loadedmetadata]): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_loadedmetadata(
      node: HTMLElement,
      eventName: loadedmetadata,
      handler: EventHandler[loadedmetadata],
      options: Boolean
    ): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_loadedmetadata(
      node: HTMLElement,
      eventName: loadedmetadata,
      handler: EventHandler[loadedmetadata],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_loadend(node: HTMLElement, eventName: loadend, handler: EventHandler[loadend]): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_loadend(node: HTMLElement, eventName: loadend, handler: EventHandler[loadend], options: Boolean): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_loadend(
      node: HTMLElement,
      eventName: loadend,
      handler: EventHandler[loadend],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_loadstart(node: HTMLElement, eventName: loadstart, handler: EventHandler[loadstart]): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_loadstart(node: HTMLElement, eventName: loadstart, handler: EventHandler[loadstart], options: Boolean): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_loadstart(
      node: HTMLElement,
      eventName: loadstart,
      handler: EventHandler[loadstart],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_lostpointercapture(node: HTMLElement, eventName: lostpointercapture, handler: EventHandler[lostpointercapture]): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_lostpointercapture(
      node: HTMLElement,
      eventName: lostpointercapture,
      handler: EventHandler[lostpointercapture],
      options: Boolean
    ): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_lostpointercapture(
      node: HTMLElement,
      eventName: lostpointercapture,
      handler: EventHandler[lostpointercapture],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_mousedown(node: HTMLElement, eventName: mousedown, handler: EventHandler[mousedown]): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_mousedown(node: HTMLElement, eventName: mousedown, handler: EventHandler[mousedown], options: Boolean): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_mousedown(
      node: HTMLElement,
      eventName: mousedown,
      handler: EventHandler[mousedown],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_mouseenter(node: HTMLElement, eventName: mouseenter, handler: EventHandler[mouseenter]): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_mouseenter(node: HTMLElement, eventName: mouseenter, handler: EventHandler[mouseenter], options: Boolean): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_mouseenter(
      node: HTMLElement,
      eventName: mouseenter,
      handler: EventHandler[mouseenter],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_mouseleave(node: HTMLElement, eventName: mouseleave, handler: EventHandler[mouseleave]): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_mouseleave(node: HTMLElement, eventName: mouseleave, handler: EventHandler[mouseleave], options: Boolean): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_mouseleave(
      node: HTMLElement,
      eventName: mouseleave,
      handler: EventHandler[mouseleave],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_mousemove(node: HTMLElement, eventName: mousemove, handler: EventHandler[mousemove]): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_mousemove(node: HTMLElement, eventName: mousemove, handler: EventHandler[mousemove], options: Boolean): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_mousemove(
      node: HTMLElement,
      eventName: mousemove,
      handler: EventHandler[mousemove],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_mouseout(node: HTMLElement, eventName: mouseout, handler: EventHandler[mouseout]): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_mouseout(node: HTMLElement, eventName: mouseout, handler: EventHandler[mouseout], options: Boolean): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_mouseout(
      node: HTMLElement,
      eventName: mouseout,
      handler: EventHandler[mouseout],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_mouseover(node: HTMLElement, eventName: mouseover, handler: EventHandler[mouseover]): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_mouseover(node: HTMLElement, eventName: mouseover, handler: EventHandler[mouseover], options: Boolean): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_mouseover(
      node: HTMLElement,
      eventName: mouseover,
      handler: EventHandler[mouseover],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_mouseup(node: HTMLElement, eventName: mouseup, handler: EventHandler[mouseup]): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_mouseup(node: HTMLElement, eventName: mouseup, handler: EventHandler[mouseup], options: Boolean): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_mouseup(
      node: HTMLElement,
      eventName: mouseup,
      handler: EventHandler[mouseup],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_paste(node: HTMLElement, eventName: paste, handler: EventHandler[paste]): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_paste(node: HTMLElement, eventName: paste, handler: EventHandler[paste], options: Boolean): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_paste(
      node: HTMLElement,
      eventName: paste,
      handler: EventHandler[paste],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_pause(node: HTMLElement, eventName: pause, handler: EventHandler[pause]): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_pause(node: HTMLElement, eventName: pause, handler: EventHandler[pause], options: Boolean): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_pause(
      node: HTMLElement,
      eventName: pause,
      handler: EventHandler[pause],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_play(node: HTMLElement, eventName: play, handler: EventHandler[play]): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_play(node: HTMLElement, eventName: play, handler: EventHandler[play], options: Boolean): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_play(node: HTMLElement, eventName: play, handler: EventHandler[play], options: AddEventListenerOptions): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_playing(node: HTMLElement, eventName: playing, handler: EventHandler[playing]): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_playing(node: HTMLElement, eventName: playing, handler: EventHandler[playing], options: Boolean): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_playing(
      node: HTMLElement,
      eventName: playing,
      handler: EventHandler[playing],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_pointercancel(node: HTMLElement, eventName: pointercancel, handler: EventHandler[pointercancel]): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_pointercancel(
      node: HTMLElement,
      eventName: pointercancel,
      handler: EventHandler[pointercancel],
      options: Boolean
    ): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_pointercancel(
      node: HTMLElement,
      eventName: pointercancel,
      handler: EventHandler[pointercancel],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_pointerdown(node: HTMLElement, eventName: pointerdown, handler: EventHandler[pointerdown]): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_pointerdown(node: HTMLElement, eventName: pointerdown, handler: EventHandler[pointerdown], options: Boolean): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_pointerdown(
      node: HTMLElement,
      eventName: pointerdown,
      handler: EventHandler[pointerdown],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_pointerenter(node: HTMLElement, eventName: pointerenter, handler: EventHandler[pointerenter]): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_pointerenter(node: HTMLElement, eventName: pointerenter, handler: EventHandler[pointerenter], options: Boolean): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_pointerenter(
      node: HTMLElement,
      eventName: pointerenter,
      handler: EventHandler[pointerenter],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_pointerleave(node: HTMLElement, eventName: pointerleave, handler: EventHandler[pointerleave]): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_pointerleave(node: HTMLElement, eventName: pointerleave, handler: EventHandler[pointerleave], options: Boolean): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_pointerleave(
      node: HTMLElement,
      eventName: pointerleave,
      handler: EventHandler[pointerleave],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_pointermove(node: HTMLElement, eventName: pointermove, handler: EventHandler[pointermove]): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_pointermove(node: HTMLElement, eventName: pointermove, handler: EventHandler[pointermove], options: Boolean): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_pointermove(
      node: HTMLElement,
      eventName: pointermove,
      handler: EventHandler[pointermove],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_pointerout(node: HTMLElement, eventName: pointerout, handler: EventHandler[pointerout]): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_pointerout(node: HTMLElement, eventName: pointerout, handler: EventHandler[pointerout], options: Boolean): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_pointerout(
      node: HTMLElement,
      eventName: pointerout,
      handler: EventHandler[pointerout],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_pointerover(node: HTMLElement, eventName: pointerover, handler: EventHandler[pointerover]): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_pointerover(node: HTMLElement, eventName: pointerover, handler: EventHandler[pointerover], options: Boolean): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_pointerover(
      node: HTMLElement,
      eventName: pointerover,
      handler: EventHandler[pointerover],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_pointerup(node: HTMLElement, eventName: pointerup, handler: EventHandler[pointerup]): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_pointerup(node: HTMLElement, eventName: pointerup, handler: EventHandler[pointerup], options: Boolean): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_pointerup(
      node: HTMLElement,
      eventName: pointerup,
      handler: EventHandler[pointerup],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_progress(node: HTMLElement, eventName: progress, handler: EventHandler[progress]): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_progress(node: HTMLElement, eventName: progress, handler: EventHandler[progress], options: Boolean): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_progress(
      node: HTMLElement,
      eventName: progress,
      handler: EventHandler[progress],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_ratechange(node: HTMLElement, eventName: ratechange, handler: EventHandler[ratechange]): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_ratechange(node: HTMLElement, eventName: ratechange, handler: EventHandler[ratechange], options: Boolean): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_ratechange(
      node: HTMLElement,
      eventName: ratechange,
      handler: EventHandler[ratechange],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_reset(node: HTMLElement, eventName: reset, handler: EventHandler[reset]): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_reset(node: HTMLElement, eventName: reset, handler: EventHandler[reset], options: Boolean): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_reset(
      node: HTMLElement,
      eventName: reset,
      handler: EventHandler[reset],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_resize(node: HTMLElement, eventName: resize, handler: EventHandler[resize]): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_resize(node: HTMLElement, eventName: resize, handler: EventHandler[resize], options: Boolean): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_resize(
      node: HTMLElement,
      eventName: resize,
      handler: EventHandler[resize],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_scroll(node: HTMLElement, eventName: scroll, handler: EventHandler[scroll]): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_scroll(node: HTMLElement, eventName: scroll, handler: EventHandler[scroll], options: Boolean): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_scroll(
      node: HTMLElement,
      eventName: scroll,
      handler: EventHandler[scroll],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_securitypolicyviolation(
      node: HTMLElement,
      eventName: securitypolicyviolation,
      handler: EventHandler[securitypolicyviolation]
    ): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_securitypolicyviolation(
      node: HTMLElement,
      eventName: securitypolicyviolation,
      handler: EventHandler[securitypolicyviolation],
      options: Boolean
    ): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_securitypolicyviolation(
      node: HTMLElement,
      eventName: securitypolicyviolation,
      handler: EventHandler[securitypolicyviolation],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_seeked(node: HTMLElement, eventName: seeked, handler: EventHandler[seeked]): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_seeked(node: HTMLElement, eventName: seeked, handler: EventHandler[seeked], options: Boolean): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_seeked(
      node: HTMLElement,
      eventName: seeked,
      handler: EventHandler[seeked],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_seeking(node: HTMLElement, eventName: seeking, handler: EventHandler[seeking]): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_seeking(node: HTMLElement, eventName: seeking, handler: EventHandler[seeking], options: Boolean): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_seeking(
      node: HTMLElement,
      eventName: seeking,
      handler: EventHandler[seeking],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_select(node: HTMLElement, eventName: select, handler: EventHandler[select]): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_select(node: HTMLElement, eventName: select, handler: EventHandler[select], options: Boolean): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_select(
      node: HTMLElement,
      eventName: select,
      handler: EventHandler[select],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_selectionchange(node: HTMLElement, eventName: selectionchange, handler: EventHandler[selectionchange]): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_selectionchange(
      node: HTMLElement,
      eventName: selectionchange,
      handler: EventHandler[selectionchange],
      options: Boolean
    ): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_selectionchange(
      node: HTMLElement,
      eventName: selectionchange,
      handler: EventHandler[selectionchange],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_selectstart(node: HTMLElement, eventName: selectstart, handler: EventHandler[selectstart]): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_selectstart(node: HTMLElement, eventName: selectstart, handler: EventHandler[selectstart], options: Boolean): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_selectstart(
      node: HTMLElement,
      eventName: selectstart,
      handler: EventHandler[selectstart],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_stalled(node: HTMLElement, eventName: stalled, handler: EventHandler[stalled]): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_stalled(node: HTMLElement, eventName: stalled, handler: EventHandler[stalled], options: Boolean): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_stalled(
      node: HTMLElement,
      eventName: stalled,
      handler: EventHandler[stalled],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_submit(node: HTMLElement, eventName: submit, handler: EventHandler[submit]): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_submit(node: HTMLElement, eventName: submit, handler: EventHandler[submit], options: Boolean): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_submit(
      node: HTMLElement,
      eventName: submit,
      handler: EventHandler[submit],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_suspend(node: HTMLElement, eventName: suspend, handler: EventHandler[suspend]): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_suspend(node: HTMLElement, eventName: suspend, handler: EventHandler[suspend], options: Boolean): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_suspend(
      node: HTMLElement,
      eventName: suspend,
      handler: EventHandler[suspend],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_timeupdate(node: HTMLElement, eventName: timeupdate, handler: EventHandler[timeupdate]): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_timeupdate(node: HTMLElement, eventName: timeupdate, handler: EventHandler[timeupdate], options: Boolean): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_timeupdate(
      node: HTMLElement,
      eventName: timeupdate,
      handler: EventHandler[timeupdate],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_toggle(node: HTMLElement, eventName: toggle, handler: EventHandler[toggle]): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_toggle(node: HTMLElement, eventName: toggle, handler: EventHandler[toggle], options: Boolean): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_toggle(
      node: HTMLElement,
      eventName: toggle,
      handler: EventHandler[toggle],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_touchcancel(node: HTMLElement, eventName: touchcancel, handler: EventHandler[touchcancel]): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_touchcancel(node: HTMLElement, eventName: touchcancel, handler: EventHandler[touchcancel], options: Boolean): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_touchcancel(
      node: HTMLElement,
      eventName: touchcancel,
      handler: EventHandler[touchcancel],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_touchend(node: HTMLElement, eventName: touchend, handler: EventHandler[touchend]): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_touchend(node: HTMLElement, eventName: touchend, handler: EventHandler[touchend], options: Boolean): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_touchend(
      node: HTMLElement,
      eventName: touchend,
      handler: EventHandler[touchend],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_touchmove(node: HTMLElement, eventName: touchmove, handler: EventHandler[touchmove]): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_touchmove(node: HTMLElement, eventName: touchmove, handler: EventHandler[touchmove], options: Boolean): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_touchmove(
      node: HTMLElement,
      eventName: touchmove,
      handler: EventHandler[touchmove],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_touchstart(node: HTMLElement, eventName: touchstart, handler: EventHandler[touchstart]): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_touchstart(node: HTMLElement, eventName: touchstart, handler: EventHandler[touchstart], options: Boolean): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_touchstart(
      node: HTMLElement,
      eventName: touchstart,
      handler: EventHandler[touchstart],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_transitioncancel(node: HTMLElement, eventName: transitioncancel, handler: EventHandler[transitioncancel]): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_transitioncancel(
      node: HTMLElement,
      eventName: transitioncancel,
      handler: EventHandler[transitioncancel],
      options: Boolean
    ): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_transitioncancel(
      node: HTMLElement,
      eventName: transitioncancel,
      handler: EventHandler[transitioncancel],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_transitionend(node: HTMLElement, eventName: transitionend, handler: EventHandler[transitionend]): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_transitionend(
      node: HTMLElement,
      eventName: transitionend,
      handler: EventHandler[transitionend],
      options: Boolean
    ): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_transitionend(
      node: HTMLElement,
      eventName: transitionend,
      handler: EventHandler[transitionend],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_transitionrun(node: HTMLElement, eventName: transitionrun, handler: EventHandler[transitionrun]): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_transitionrun(
      node: HTMLElement,
      eventName: transitionrun,
      handler: EventHandler[transitionrun],
      options: Boolean
    ): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_transitionrun(
      node: HTMLElement,
      eventName: transitionrun,
      handler: EventHandler[transitionrun],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_transitionstart(node: HTMLElement, eventName: transitionstart, handler: EventHandler[transitionstart]): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_transitionstart(
      node: HTMLElement,
      eventName: transitionstart,
      handler: EventHandler[transitionstart],
      options: Boolean
    ): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_transitionstart(
      node: HTMLElement,
      eventName: transitionstart,
      handler: EventHandler[transitionstart],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_volumechange(node: HTMLElement, eventName: volumechange, handler: EventHandler[volumechange]): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_volumechange(node: HTMLElement, eventName: volumechange, handler: EventHandler[volumechange], options: Boolean): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_volumechange(
      node: HTMLElement,
      eventName: volumechange,
      handler: EventHandler[volumechange],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_waiting(node: HTMLElement, eventName: waiting, handler: EventHandler[waiting]): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_waiting(node: HTMLElement, eventName: waiting, handler: EventHandler[waiting], options: Boolean): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_waiting(
      node: HTMLElement,
      eventName: waiting,
      handler: EventHandler[waiting],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_wheel(node: HTMLElement, eventName: wheel, handler: EventHandler[wheel]): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_wheel(node: HTMLElement, eventName: wheel, handler: EventHandler[wheel], options: Boolean): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_wheel(
      node: HTMLElement,
      eventName: wheel,
      handler: EventHandler[wheel],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = js.native
    def matches(node: Element, selector: String): Boolean = js.native
    def offset(node: HTMLElement): Anon_Height = js.native
    def offsetParent(node: HTMLElement): HTMLElement = js.native
    def ownerDocument(): Document = js.native
    def ownerDocument(node: Element): Document = js.native
    def ownerWindow(): Window = js.native
    def ownerWindow(node: Element): Window = js.native
    def position(node: HTMLElement): Anon_Height = js.native
    def position(node: HTMLElement, offsetParent: HTMLElement): Anon_Height = js.native
    def querySelectorAll(element: Document, selector: String): js.Array[HTMLElement] = js.native
    def querySelectorAll(element: HTMLElement, selector: String): js.Array[HTMLElement] = js.native
    def removeClass(element: Element, className: String): Unit = js.native
    def removeClass(element: SVGElement, className: String): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_abort(node: HTMLElement, eventName: abort, handler: TaggedEventHandler[abort]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_abort(node: HTMLElement, eventName: abort, handler: TaggedEventHandler[abort], options: Boolean): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_abort(
      node: HTMLElement,
      eventName: abort,
      handler: TaggedEventHandler[abort],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_animationcancel(node: HTMLElement, eventName: animationcancel, handler: TaggedEventHandler[animationcancel]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_animationcancel(
      node: HTMLElement,
      eventName: animationcancel,
      handler: TaggedEventHandler[animationcancel],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_animationcancel(
      node: HTMLElement,
      eventName: animationcancel,
      handler: TaggedEventHandler[animationcancel],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_animationend(node: HTMLElement, eventName: animationend, handler: TaggedEventHandler[animationend]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_animationend(
      node: HTMLElement,
      eventName: animationend,
      handler: TaggedEventHandler[animationend],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_animationend(
      node: HTMLElement,
      eventName: animationend,
      handler: TaggedEventHandler[animationend],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_animationiteration(node: HTMLElement, eventName: animationiteration, handler: TaggedEventHandler[animationiteration]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_animationiteration(
      node: HTMLElement,
      eventName: animationiteration,
      handler: TaggedEventHandler[animationiteration],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_animationiteration(
      node: HTMLElement,
      eventName: animationiteration,
      handler: TaggedEventHandler[animationiteration],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_animationstart(node: HTMLElement, eventName: animationstart, handler: TaggedEventHandler[animationstart]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_animationstart(
      node: HTMLElement,
      eventName: animationstart,
      handler: TaggedEventHandler[animationstart],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_animationstart(
      node: HTMLElement,
      eventName: animationstart,
      handler: TaggedEventHandler[animationstart],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_auxclick(node: HTMLElement, eventName: auxclick, handler: TaggedEventHandler[auxclick]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_auxclick(node: HTMLElement, eventName: auxclick, handler: TaggedEventHandler[auxclick], options: Boolean): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_auxclick(
      node: HTMLElement,
      eventName: auxclick,
      handler: TaggedEventHandler[auxclick],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_blur(node: HTMLElement, eventName: blur, handler: TaggedEventHandler[blur]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_blur(node: HTMLElement, eventName: blur, handler: TaggedEventHandler[blur], options: Boolean): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_blur(
      node: HTMLElement,
      eventName: blur,
      handler: TaggedEventHandler[blur],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_cancel(node: HTMLElement, eventName: cancel, handler: TaggedEventHandler[cancel]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_cancel(node: HTMLElement, eventName: cancel, handler: TaggedEventHandler[cancel], options: Boolean): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_cancel(
      node: HTMLElement,
      eventName: cancel,
      handler: TaggedEventHandler[cancel],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_canplay(node: HTMLElement, eventName: canplay, handler: TaggedEventHandler[canplay]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_canplay(node: HTMLElement, eventName: canplay, handler: TaggedEventHandler[canplay], options: Boolean): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_canplay(
      node: HTMLElement,
      eventName: canplay,
      handler: TaggedEventHandler[canplay],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_canplaythrough(node: HTMLElement, eventName: canplaythrough, handler: TaggedEventHandler[canplaythrough]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_canplaythrough(
      node: HTMLElement,
      eventName: canplaythrough,
      handler: TaggedEventHandler[canplaythrough],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_canplaythrough(
      node: HTMLElement,
      eventName: canplaythrough,
      handler: TaggedEventHandler[canplaythrough],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_change(node: HTMLElement, eventName: change, handler: TaggedEventHandler[change]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_change(node: HTMLElement, eventName: change, handler: TaggedEventHandler[change], options: Boolean): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_change(
      node: HTMLElement,
      eventName: change,
      handler: TaggedEventHandler[change],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_click(node: HTMLElement, eventName: click, handler: TaggedEventHandler[click]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_click(node: HTMLElement, eventName: click, handler: TaggedEventHandler[click], options: Boolean): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_click(
      node: HTMLElement,
      eventName: click,
      handler: TaggedEventHandler[click],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_close(node: HTMLElement, eventName: close, handler: TaggedEventHandler[close]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_close(node: HTMLElement, eventName: close, handler: TaggedEventHandler[close], options: Boolean): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_close(
      node: HTMLElement,
      eventName: close,
      handler: TaggedEventHandler[close],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_contextmenu(node: HTMLElement, eventName: contextmenu, handler: TaggedEventHandler[contextmenu]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_contextmenu(
      node: HTMLElement,
      eventName: contextmenu,
      handler: TaggedEventHandler[contextmenu],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_contextmenu(
      node: HTMLElement,
      eventName: contextmenu,
      handler: TaggedEventHandler[contextmenu],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_copy(node: HTMLElement, eventName: copy, handler: TaggedEventHandler[copy]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_copy(node: HTMLElement, eventName: copy, handler: TaggedEventHandler[copy], options: Boolean): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_copy(
      node: HTMLElement,
      eventName: copy,
      handler: TaggedEventHandler[copy],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_cuechange(node: HTMLElement, eventName: cuechange, handler: TaggedEventHandler[cuechange]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_cuechange(node: HTMLElement, eventName: cuechange, handler: TaggedEventHandler[cuechange], options: Boolean): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_cuechange(
      node: HTMLElement,
      eventName: cuechange,
      handler: TaggedEventHandler[cuechange],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_cut(node: HTMLElement, eventName: cut, handler: TaggedEventHandler[cut]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_cut(node: HTMLElement, eventName: cut, handler: TaggedEventHandler[cut], options: Boolean): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_cut(node: HTMLElement, eventName: cut, handler: TaggedEventHandler[cut], options: EventListenerOptions): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_dblclick(node: HTMLElement, eventName: dblclick, handler: TaggedEventHandler[dblclick]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_dblclick(node: HTMLElement, eventName: dblclick, handler: TaggedEventHandler[dblclick], options: Boolean): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_dblclick(
      node: HTMLElement,
      eventName: dblclick,
      handler: TaggedEventHandler[dblclick],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_drag(node: HTMLElement, eventName: drag, handler: TaggedEventHandler[drag]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_drag(node: HTMLElement, eventName: drag, handler: TaggedEventHandler[drag], options: Boolean): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_drag(
      node: HTMLElement,
      eventName: drag,
      handler: TaggedEventHandler[drag],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_dragend(node: HTMLElement, eventName: dragend, handler: TaggedEventHandler[dragend]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_dragend(node: HTMLElement, eventName: dragend, handler: TaggedEventHandler[dragend], options: Boolean): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_dragend(
      node: HTMLElement,
      eventName: dragend,
      handler: TaggedEventHandler[dragend],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_dragenter(node: HTMLElement, eventName: dragenter, handler: TaggedEventHandler[dragenter]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_dragenter(node: HTMLElement, eventName: dragenter, handler: TaggedEventHandler[dragenter], options: Boolean): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_dragenter(
      node: HTMLElement,
      eventName: dragenter,
      handler: TaggedEventHandler[dragenter],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_dragexit(node: HTMLElement, eventName: dragexit, handler: TaggedEventHandler[dragexit]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_dragexit(node: HTMLElement, eventName: dragexit, handler: TaggedEventHandler[dragexit], options: Boolean): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_dragexit(
      node: HTMLElement,
      eventName: dragexit,
      handler: TaggedEventHandler[dragexit],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_dragleave(node: HTMLElement, eventName: dragleave, handler: TaggedEventHandler[dragleave]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_dragleave(node: HTMLElement, eventName: dragleave, handler: TaggedEventHandler[dragleave], options: Boolean): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_dragleave(
      node: HTMLElement,
      eventName: dragleave,
      handler: TaggedEventHandler[dragleave],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_dragover(node: HTMLElement, eventName: dragover, handler: TaggedEventHandler[dragover]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_dragover(node: HTMLElement, eventName: dragover, handler: TaggedEventHandler[dragover], options: Boolean): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_dragover(
      node: HTMLElement,
      eventName: dragover,
      handler: TaggedEventHandler[dragover],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_dragstart(node: HTMLElement, eventName: dragstart, handler: TaggedEventHandler[dragstart]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_dragstart(node: HTMLElement, eventName: dragstart, handler: TaggedEventHandler[dragstart], options: Boolean): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_dragstart(
      node: HTMLElement,
      eventName: dragstart,
      handler: TaggedEventHandler[dragstart],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_drop(node: HTMLElement, eventName: drop, handler: TaggedEventHandler[drop]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_drop(node: HTMLElement, eventName: drop, handler: TaggedEventHandler[drop], options: Boolean): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_drop(
      node: HTMLElement,
      eventName: drop,
      handler: TaggedEventHandler[drop],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_durationchange(node: HTMLElement, eventName: durationchange, handler: TaggedEventHandler[durationchange]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_durationchange(
      node: HTMLElement,
      eventName: durationchange,
      handler: TaggedEventHandler[durationchange],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_durationchange(
      node: HTMLElement,
      eventName: durationchange,
      handler: TaggedEventHandler[durationchange],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_emptied(node: HTMLElement, eventName: emptied, handler: TaggedEventHandler[emptied]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_emptied(node: HTMLElement, eventName: emptied, handler: TaggedEventHandler[emptied], options: Boolean): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_emptied(
      node: HTMLElement,
      eventName: emptied,
      handler: TaggedEventHandler[emptied],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_ended(node: HTMLElement, eventName: ended, handler: TaggedEventHandler[ended]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_ended(node: HTMLElement, eventName: ended, handler: TaggedEventHandler[ended], options: Boolean): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_ended(
      node: HTMLElement,
      eventName: ended,
      handler: TaggedEventHandler[ended],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_error(node: HTMLElement, eventName: error, handler: TaggedEventHandler[error]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_error(node: HTMLElement, eventName: error, handler: TaggedEventHandler[error], options: Boolean): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_error(
      node: HTMLElement,
      eventName: error,
      handler: TaggedEventHandler[error],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_focus(node: HTMLElement, eventName: focus, handler: TaggedEventHandler[focus]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_focus(node: HTMLElement, eventName: focus, handler: TaggedEventHandler[focus], options: Boolean): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_focus(
      node: HTMLElement,
      eventName: focus,
      handler: TaggedEventHandler[focus],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_focusin(node: HTMLElement, eventName: focusin, handler: TaggedEventHandler[focusin]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_focusin(node: HTMLElement, eventName: focusin, handler: TaggedEventHandler[focusin], options: Boolean): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_focusin(
      node: HTMLElement,
      eventName: focusin,
      handler: TaggedEventHandler[focusin],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_focusout(node: HTMLElement, eventName: focusout, handler: TaggedEventHandler[focusout]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_focusout(node: HTMLElement, eventName: focusout, handler: TaggedEventHandler[focusout], options: Boolean): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_focusout(
      node: HTMLElement,
      eventName: focusout,
      handler: TaggedEventHandler[focusout],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_fullscreenchange(node: HTMLElement, eventName: fullscreenchange, handler: TaggedEventHandler[fullscreenchange]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_fullscreenchange(
      node: HTMLElement,
      eventName: fullscreenchange,
      handler: TaggedEventHandler[fullscreenchange],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_fullscreenchange(
      node: HTMLElement,
      eventName: fullscreenchange,
      handler: TaggedEventHandler[fullscreenchange],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_fullscreenerror(node: HTMLElement, eventName: fullscreenerror, handler: TaggedEventHandler[fullscreenerror]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_fullscreenerror(
      node: HTMLElement,
      eventName: fullscreenerror,
      handler: TaggedEventHandler[fullscreenerror],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_fullscreenerror(
      node: HTMLElement,
      eventName: fullscreenerror,
      handler: TaggedEventHandler[fullscreenerror],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_gotpointercapture(node: HTMLElement, eventName: gotpointercapture, handler: TaggedEventHandler[gotpointercapture]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_gotpointercapture(
      node: HTMLElement,
      eventName: gotpointercapture,
      handler: TaggedEventHandler[gotpointercapture],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_gotpointercapture(
      node: HTMLElement,
      eventName: gotpointercapture,
      handler: TaggedEventHandler[gotpointercapture],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_input(node: HTMLElement, eventName: input, handler: TaggedEventHandler[input]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_input(node: HTMLElement, eventName: input, handler: TaggedEventHandler[input], options: Boolean): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_input(
      node: HTMLElement,
      eventName: input,
      handler: TaggedEventHandler[input],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_invalid(node: HTMLElement, eventName: invalid, handler: TaggedEventHandler[invalid]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_invalid(node: HTMLElement, eventName: invalid, handler: TaggedEventHandler[invalid], options: Boolean): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_invalid(
      node: HTMLElement,
      eventName: invalid,
      handler: TaggedEventHandler[invalid],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_keydown(node: HTMLElement, eventName: keydown, handler: TaggedEventHandler[keydown]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_keydown(node: HTMLElement, eventName: keydown, handler: TaggedEventHandler[keydown], options: Boolean): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_keydown(
      node: HTMLElement,
      eventName: keydown,
      handler: TaggedEventHandler[keydown],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_keypress(node: HTMLElement, eventName: keypress, handler: TaggedEventHandler[keypress]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_keypress(node: HTMLElement, eventName: keypress, handler: TaggedEventHandler[keypress], options: Boolean): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_keypress(
      node: HTMLElement,
      eventName: keypress,
      handler: TaggedEventHandler[keypress],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_keyup(node: HTMLElement, eventName: keyup, handler: TaggedEventHandler[keyup]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_keyup(node: HTMLElement, eventName: keyup, handler: TaggedEventHandler[keyup], options: Boolean): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_keyup(
      node: HTMLElement,
      eventName: keyup,
      handler: TaggedEventHandler[keyup],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_load(node: HTMLElement, eventName: load, handler: TaggedEventHandler[load]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_load(node: HTMLElement, eventName: load, handler: TaggedEventHandler[load], options: Boolean): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_load(
      node: HTMLElement,
      eventName: load,
      handler: TaggedEventHandler[load],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_loadeddata(node: HTMLElement, eventName: loadeddata, handler: TaggedEventHandler[loadeddata]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_loadeddata(
      node: HTMLElement,
      eventName: loadeddata,
      handler: TaggedEventHandler[loadeddata],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_loadeddata(
      node: HTMLElement,
      eventName: loadeddata,
      handler: TaggedEventHandler[loadeddata],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_loadedmetadata(node: HTMLElement, eventName: loadedmetadata, handler: TaggedEventHandler[loadedmetadata]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_loadedmetadata(
      node: HTMLElement,
      eventName: loadedmetadata,
      handler: TaggedEventHandler[loadedmetadata],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_loadedmetadata(
      node: HTMLElement,
      eventName: loadedmetadata,
      handler: TaggedEventHandler[loadedmetadata],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_loadend(node: HTMLElement, eventName: loadend, handler: TaggedEventHandler[loadend]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_loadend(node: HTMLElement, eventName: loadend, handler: TaggedEventHandler[loadend], options: Boolean): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_loadend(
      node: HTMLElement,
      eventName: loadend,
      handler: TaggedEventHandler[loadend],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_loadstart(node: HTMLElement, eventName: loadstart, handler: TaggedEventHandler[loadstart]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_loadstart(node: HTMLElement, eventName: loadstart, handler: TaggedEventHandler[loadstart], options: Boolean): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_loadstart(
      node: HTMLElement,
      eventName: loadstart,
      handler: TaggedEventHandler[loadstart],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_lostpointercapture(node: HTMLElement, eventName: lostpointercapture, handler: TaggedEventHandler[lostpointercapture]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_lostpointercapture(
      node: HTMLElement,
      eventName: lostpointercapture,
      handler: TaggedEventHandler[lostpointercapture],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_lostpointercapture(
      node: HTMLElement,
      eventName: lostpointercapture,
      handler: TaggedEventHandler[lostpointercapture],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_mousedown(node: HTMLElement, eventName: mousedown, handler: TaggedEventHandler[mousedown]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_mousedown(node: HTMLElement, eventName: mousedown, handler: TaggedEventHandler[mousedown], options: Boolean): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_mousedown(
      node: HTMLElement,
      eventName: mousedown,
      handler: TaggedEventHandler[mousedown],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_mouseenter(node: HTMLElement, eventName: mouseenter, handler: TaggedEventHandler[mouseenter]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_mouseenter(
      node: HTMLElement,
      eventName: mouseenter,
      handler: TaggedEventHandler[mouseenter],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_mouseenter(
      node: HTMLElement,
      eventName: mouseenter,
      handler: TaggedEventHandler[mouseenter],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_mouseleave(node: HTMLElement, eventName: mouseleave, handler: TaggedEventHandler[mouseleave]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_mouseleave(
      node: HTMLElement,
      eventName: mouseleave,
      handler: TaggedEventHandler[mouseleave],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_mouseleave(
      node: HTMLElement,
      eventName: mouseleave,
      handler: TaggedEventHandler[mouseleave],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_mousemove(node: HTMLElement, eventName: mousemove, handler: TaggedEventHandler[mousemove]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_mousemove(node: HTMLElement, eventName: mousemove, handler: TaggedEventHandler[mousemove], options: Boolean): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_mousemove(
      node: HTMLElement,
      eventName: mousemove,
      handler: TaggedEventHandler[mousemove],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_mouseout(node: HTMLElement, eventName: mouseout, handler: TaggedEventHandler[mouseout]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_mouseout(node: HTMLElement, eventName: mouseout, handler: TaggedEventHandler[mouseout], options: Boolean): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_mouseout(
      node: HTMLElement,
      eventName: mouseout,
      handler: TaggedEventHandler[mouseout],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_mouseover(node: HTMLElement, eventName: mouseover, handler: TaggedEventHandler[mouseover]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_mouseover(node: HTMLElement, eventName: mouseover, handler: TaggedEventHandler[mouseover], options: Boolean): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_mouseover(
      node: HTMLElement,
      eventName: mouseover,
      handler: TaggedEventHandler[mouseover],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_mouseup(node: HTMLElement, eventName: mouseup, handler: TaggedEventHandler[mouseup]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_mouseup(node: HTMLElement, eventName: mouseup, handler: TaggedEventHandler[mouseup], options: Boolean): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_mouseup(
      node: HTMLElement,
      eventName: mouseup,
      handler: TaggedEventHandler[mouseup],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_paste(node: HTMLElement, eventName: paste, handler: TaggedEventHandler[paste]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_paste(node: HTMLElement, eventName: paste, handler: TaggedEventHandler[paste], options: Boolean): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_paste(
      node: HTMLElement,
      eventName: paste,
      handler: TaggedEventHandler[paste],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pause(node: HTMLElement, eventName: pause, handler: TaggedEventHandler[pause]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pause(node: HTMLElement, eventName: pause, handler: TaggedEventHandler[pause], options: Boolean): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pause(
      node: HTMLElement,
      eventName: pause,
      handler: TaggedEventHandler[pause],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_play(node: HTMLElement, eventName: play, handler: TaggedEventHandler[play]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_play(node: HTMLElement, eventName: play, handler: TaggedEventHandler[play], options: Boolean): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_play(
      node: HTMLElement,
      eventName: play,
      handler: TaggedEventHandler[play],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_playing(node: HTMLElement, eventName: playing, handler: TaggedEventHandler[playing]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_playing(node: HTMLElement, eventName: playing, handler: TaggedEventHandler[playing], options: Boolean): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_playing(
      node: HTMLElement,
      eventName: playing,
      handler: TaggedEventHandler[playing],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pointercancel(node: HTMLElement, eventName: pointercancel, handler: TaggedEventHandler[pointercancel]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pointercancel(
      node: HTMLElement,
      eventName: pointercancel,
      handler: TaggedEventHandler[pointercancel],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pointercancel(
      node: HTMLElement,
      eventName: pointercancel,
      handler: TaggedEventHandler[pointercancel],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pointerdown(node: HTMLElement, eventName: pointerdown, handler: TaggedEventHandler[pointerdown]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pointerdown(
      node: HTMLElement,
      eventName: pointerdown,
      handler: TaggedEventHandler[pointerdown],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pointerdown(
      node: HTMLElement,
      eventName: pointerdown,
      handler: TaggedEventHandler[pointerdown],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pointerenter(node: HTMLElement, eventName: pointerenter, handler: TaggedEventHandler[pointerenter]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pointerenter(
      node: HTMLElement,
      eventName: pointerenter,
      handler: TaggedEventHandler[pointerenter],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pointerenter(
      node: HTMLElement,
      eventName: pointerenter,
      handler: TaggedEventHandler[pointerenter],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pointerleave(node: HTMLElement, eventName: pointerleave, handler: TaggedEventHandler[pointerleave]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pointerleave(
      node: HTMLElement,
      eventName: pointerleave,
      handler: TaggedEventHandler[pointerleave],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pointerleave(
      node: HTMLElement,
      eventName: pointerleave,
      handler: TaggedEventHandler[pointerleave],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pointermove(node: HTMLElement, eventName: pointermove, handler: TaggedEventHandler[pointermove]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pointermove(
      node: HTMLElement,
      eventName: pointermove,
      handler: TaggedEventHandler[pointermove],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pointermove(
      node: HTMLElement,
      eventName: pointermove,
      handler: TaggedEventHandler[pointermove],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pointerout(node: HTMLElement, eventName: pointerout, handler: TaggedEventHandler[pointerout]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pointerout(
      node: HTMLElement,
      eventName: pointerout,
      handler: TaggedEventHandler[pointerout],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pointerout(
      node: HTMLElement,
      eventName: pointerout,
      handler: TaggedEventHandler[pointerout],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pointerover(node: HTMLElement, eventName: pointerover, handler: TaggedEventHandler[pointerover]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pointerover(
      node: HTMLElement,
      eventName: pointerover,
      handler: TaggedEventHandler[pointerover],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pointerover(
      node: HTMLElement,
      eventName: pointerover,
      handler: TaggedEventHandler[pointerover],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pointerup(node: HTMLElement, eventName: pointerup, handler: TaggedEventHandler[pointerup]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pointerup(node: HTMLElement, eventName: pointerup, handler: TaggedEventHandler[pointerup], options: Boolean): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pointerup(
      node: HTMLElement,
      eventName: pointerup,
      handler: TaggedEventHandler[pointerup],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_progress(node: HTMLElement, eventName: progress, handler: TaggedEventHandler[progress]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_progress(node: HTMLElement, eventName: progress, handler: TaggedEventHandler[progress], options: Boolean): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_progress(
      node: HTMLElement,
      eventName: progress,
      handler: TaggedEventHandler[progress],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_ratechange(node: HTMLElement, eventName: ratechange, handler: TaggedEventHandler[ratechange]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_ratechange(
      node: HTMLElement,
      eventName: ratechange,
      handler: TaggedEventHandler[ratechange],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_ratechange(
      node: HTMLElement,
      eventName: ratechange,
      handler: TaggedEventHandler[ratechange],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_reset(node: HTMLElement, eventName: reset, handler: TaggedEventHandler[reset]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_reset(node: HTMLElement, eventName: reset, handler: TaggedEventHandler[reset], options: Boolean): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_reset(
      node: HTMLElement,
      eventName: reset,
      handler: TaggedEventHandler[reset],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_resize(node: HTMLElement, eventName: resize, handler: TaggedEventHandler[resize]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_resize(node: HTMLElement, eventName: resize, handler: TaggedEventHandler[resize], options: Boolean): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_resize(
      node: HTMLElement,
      eventName: resize,
      handler: TaggedEventHandler[resize],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_scroll(node: HTMLElement, eventName: scroll, handler: TaggedEventHandler[scroll]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_scroll(node: HTMLElement, eventName: scroll, handler: TaggedEventHandler[scroll], options: Boolean): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_scroll(
      node: HTMLElement,
      eventName: scroll,
      handler: TaggedEventHandler[scroll],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_securitypolicyviolation(
      node: HTMLElement,
      eventName: securitypolicyviolation,
      handler: TaggedEventHandler[securitypolicyviolation]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_securitypolicyviolation(
      node: HTMLElement,
      eventName: securitypolicyviolation,
      handler: TaggedEventHandler[securitypolicyviolation],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_securitypolicyviolation(
      node: HTMLElement,
      eventName: securitypolicyviolation,
      handler: TaggedEventHandler[securitypolicyviolation],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_seeked(node: HTMLElement, eventName: seeked, handler: TaggedEventHandler[seeked]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_seeked(node: HTMLElement, eventName: seeked, handler: TaggedEventHandler[seeked], options: Boolean): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_seeked(
      node: HTMLElement,
      eventName: seeked,
      handler: TaggedEventHandler[seeked],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_seeking(node: HTMLElement, eventName: seeking, handler: TaggedEventHandler[seeking]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_seeking(node: HTMLElement, eventName: seeking, handler: TaggedEventHandler[seeking], options: Boolean): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_seeking(
      node: HTMLElement,
      eventName: seeking,
      handler: TaggedEventHandler[seeking],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_select(node: HTMLElement, eventName: select, handler: TaggedEventHandler[select]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_select(node: HTMLElement, eventName: select, handler: TaggedEventHandler[select], options: Boolean): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_select(
      node: HTMLElement,
      eventName: select,
      handler: TaggedEventHandler[select],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_selectionchange(node: HTMLElement, eventName: selectionchange, handler: TaggedEventHandler[selectionchange]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_selectionchange(
      node: HTMLElement,
      eventName: selectionchange,
      handler: TaggedEventHandler[selectionchange],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_selectionchange(
      node: HTMLElement,
      eventName: selectionchange,
      handler: TaggedEventHandler[selectionchange],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_selectstart(node: HTMLElement, eventName: selectstart, handler: TaggedEventHandler[selectstart]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_selectstart(
      node: HTMLElement,
      eventName: selectstart,
      handler: TaggedEventHandler[selectstart],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_selectstart(
      node: HTMLElement,
      eventName: selectstart,
      handler: TaggedEventHandler[selectstart],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_stalled(node: HTMLElement, eventName: stalled, handler: TaggedEventHandler[stalled]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_stalled(node: HTMLElement, eventName: stalled, handler: TaggedEventHandler[stalled], options: Boolean): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_stalled(
      node: HTMLElement,
      eventName: stalled,
      handler: TaggedEventHandler[stalled],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_submit(node: HTMLElement, eventName: submit, handler: TaggedEventHandler[submit]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_submit(node: HTMLElement, eventName: submit, handler: TaggedEventHandler[submit], options: Boolean): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_submit(
      node: HTMLElement,
      eventName: submit,
      handler: TaggedEventHandler[submit],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_suspend(node: HTMLElement, eventName: suspend, handler: TaggedEventHandler[suspend]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_suspend(node: HTMLElement, eventName: suspend, handler: TaggedEventHandler[suspend], options: Boolean): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_suspend(
      node: HTMLElement,
      eventName: suspend,
      handler: TaggedEventHandler[suspend],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_timeupdate(node: HTMLElement, eventName: timeupdate, handler: TaggedEventHandler[timeupdate]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_timeupdate(
      node: HTMLElement,
      eventName: timeupdate,
      handler: TaggedEventHandler[timeupdate],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_timeupdate(
      node: HTMLElement,
      eventName: timeupdate,
      handler: TaggedEventHandler[timeupdate],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_toggle(node: HTMLElement, eventName: toggle, handler: TaggedEventHandler[toggle]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_toggle(node: HTMLElement, eventName: toggle, handler: TaggedEventHandler[toggle], options: Boolean): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_toggle(
      node: HTMLElement,
      eventName: toggle,
      handler: TaggedEventHandler[toggle],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_touchcancel(node: HTMLElement, eventName: touchcancel, handler: TaggedEventHandler[touchcancel]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_touchcancel(
      node: HTMLElement,
      eventName: touchcancel,
      handler: TaggedEventHandler[touchcancel],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_touchcancel(
      node: HTMLElement,
      eventName: touchcancel,
      handler: TaggedEventHandler[touchcancel],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_touchend(node: HTMLElement, eventName: touchend, handler: TaggedEventHandler[touchend]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_touchend(node: HTMLElement, eventName: touchend, handler: TaggedEventHandler[touchend], options: Boolean): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_touchend(
      node: HTMLElement,
      eventName: touchend,
      handler: TaggedEventHandler[touchend],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_touchmove(node: HTMLElement, eventName: touchmove, handler: TaggedEventHandler[touchmove]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_touchmove(node: HTMLElement, eventName: touchmove, handler: TaggedEventHandler[touchmove], options: Boolean): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_touchmove(
      node: HTMLElement,
      eventName: touchmove,
      handler: TaggedEventHandler[touchmove],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_touchstart(node: HTMLElement, eventName: touchstart, handler: TaggedEventHandler[touchstart]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_touchstart(
      node: HTMLElement,
      eventName: touchstart,
      handler: TaggedEventHandler[touchstart],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_touchstart(
      node: HTMLElement,
      eventName: touchstart,
      handler: TaggedEventHandler[touchstart],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_transitioncancel(node: HTMLElement, eventName: transitioncancel, handler: TaggedEventHandler[transitioncancel]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_transitioncancel(
      node: HTMLElement,
      eventName: transitioncancel,
      handler: TaggedEventHandler[transitioncancel],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_transitioncancel(
      node: HTMLElement,
      eventName: transitioncancel,
      handler: TaggedEventHandler[transitioncancel],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_transitionend(node: HTMLElement, eventName: transitionend, handler: TaggedEventHandler[transitionend]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_transitionend(
      node: HTMLElement,
      eventName: transitionend,
      handler: TaggedEventHandler[transitionend],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_transitionend(
      node: HTMLElement,
      eventName: transitionend,
      handler: TaggedEventHandler[transitionend],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_transitionrun(node: HTMLElement, eventName: transitionrun, handler: TaggedEventHandler[transitionrun]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_transitionrun(
      node: HTMLElement,
      eventName: transitionrun,
      handler: TaggedEventHandler[transitionrun],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_transitionrun(
      node: HTMLElement,
      eventName: transitionrun,
      handler: TaggedEventHandler[transitionrun],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_transitionstart(node: HTMLElement, eventName: transitionstart, handler: TaggedEventHandler[transitionstart]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_transitionstart(
      node: HTMLElement,
      eventName: transitionstart,
      handler: TaggedEventHandler[transitionstart],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_transitionstart(
      node: HTMLElement,
      eventName: transitionstart,
      handler: TaggedEventHandler[transitionstart],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_volumechange(node: HTMLElement, eventName: volumechange, handler: TaggedEventHandler[volumechange]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_volumechange(
      node: HTMLElement,
      eventName: volumechange,
      handler: TaggedEventHandler[volumechange],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_volumechange(
      node: HTMLElement,
      eventName: volumechange,
      handler: TaggedEventHandler[volumechange],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_waiting(node: HTMLElement, eventName: waiting, handler: TaggedEventHandler[waiting]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_waiting(node: HTMLElement, eventName: waiting, handler: TaggedEventHandler[waiting], options: Boolean): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_waiting(
      node: HTMLElement,
      eventName: waiting,
      handler: TaggedEventHandler[waiting],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_wheel(node: HTMLElement, eventName: wheel, handler: TaggedEventHandler[wheel]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_wheel(node: HTMLElement, eventName: wheel, handler: TaggedEventHandler[wheel], options: Boolean): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_wheel(
      node: HTMLElement,
      eventName: wheel,
      handler: TaggedEventHandler[wheel],
      options: EventListenerOptions
    ): Unit = js.native
    def requestAnimationFrame(callback: FrameRequestCallback): Double = js.native
    def scrollParent(element: HTMLElement): Document | HTMLElement = js.native
    def scrollParent(element: HTMLElement, firstPossible: Boolean): Document | HTMLElement = js.native
    def scrollTop(node: Element): Double = js.native
    def scrollTop(node: Element, `val`: Double): js.UndefOr[scala.Nothing] = js.native
    def style(node: HTMLElement, property: Partial[Record[Property, String]]): Unit = js.native
    def style[T /* <: HyphenProperty */](node: HTMLElement, property: T): /* import warning: importer.ImportType#apply Failed type conversion: csstype.csstype.PropertiesHyphen<string | 0>[T] */ js.Any = js.native
    @JSName("style")
    def style_T_CamelProperty[T /* <: CamelProperty */](node: HTMLElement, property: T): /* import warning: importer.ImportType#apply Failed type conversion: csstype.csstype.Properties<string | 0>[T] */ js.Any = js.native
    def toggleClass(element: Element, className: String): Unit = js.native
    def toggleClass(element: SVGElement, className: String): Unit = js.native
    def width(node: HTMLElement): Double = js.native
    def width(node: HTMLElement, client: Boolean): Double = js.native
  }
  
}

