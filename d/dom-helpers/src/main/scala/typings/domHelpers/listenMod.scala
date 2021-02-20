package typings.domHelpers

import typings.domHelpers.addEventListenerMod.EventHandler
import typings.domHelpers.domHelpersStrings.abort
import typings.domHelpers.domHelpersStrings.animationcancel
import typings.domHelpers.domHelpersStrings.animationend
import typings.domHelpers.domHelpersStrings.animationiteration
import typings.domHelpers.domHelpersStrings.animationstart
import typings.domHelpers.domHelpersStrings.auxclick
import typings.domHelpers.domHelpersStrings.blur
import typings.domHelpers.domHelpersStrings.cancel
import typings.domHelpers.domHelpersStrings.canplay
import typings.domHelpers.domHelpersStrings.canplaythrough
import typings.domHelpers.domHelpersStrings.change
import typings.domHelpers.domHelpersStrings.click
import typings.domHelpers.domHelpersStrings.close
import typings.domHelpers.domHelpersStrings.contextmenu
import typings.domHelpers.domHelpersStrings.copy
import typings.domHelpers.domHelpersStrings.cuechange
import typings.domHelpers.domHelpersStrings.cut
import typings.domHelpers.domHelpersStrings.dblclick
import typings.domHelpers.domHelpersStrings.drag
import typings.domHelpers.domHelpersStrings.dragend
import typings.domHelpers.domHelpersStrings.dragenter
import typings.domHelpers.domHelpersStrings.dragexit
import typings.domHelpers.domHelpersStrings.dragleave
import typings.domHelpers.domHelpersStrings.dragover
import typings.domHelpers.domHelpersStrings.dragstart
import typings.domHelpers.domHelpersStrings.drop
import typings.domHelpers.domHelpersStrings.durationchange
import typings.domHelpers.domHelpersStrings.emptied
import typings.domHelpers.domHelpersStrings.ended
import typings.domHelpers.domHelpersStrings.error
import typings.domHelpers.domHelpersStrings.focus
import typings.domHelpers.domHelpersStrings.focusin
import typings.domHelpers.domHelpersStrings.focusout
import typings.domHelpers.domHelpersStrings.fullscreenchange
import typings.domHelpers.domHelpersStrings.fullscreenerror
import typings.domHelpers.domHelpersStrings.gotpointercapture
import typings.domHelpers.domHelpersStrings.input
import typings.domHelpers.domHelpersStrings.invalid
import typings.domHelpers.domHelpersStrings.keydown
import typings.domHelpers.domHelpersStrings.keypress
import typings.domHelpers.domHelpersStrings.keyup
import typings.domHelpers.domHelpersStrings.load
import typings.domHelpers.domHelpersStrings.loadeddata
import typings.domHelpers.domHelpersStrings.loadedmetadata
import typings.domHelpers.domHelpersStrings.loadstart
import typings.domHelpers.domHelpersStrings.lostpointercapture
import typings.domHelpers.domHelpersStrings.mousedown
import typings.domHelpers.domHelpersStrings.mouseenter
import typings.domHelpers.domHelpersStrings.mouseleave
import typings.domHelpers.domHelpersStrings.mousemove
import typings.domHelpers.domHelpersStrings.mouseout
import typings.domHelpers.domHelpersStrings.mouseover
import typings.domHelpers.domHelpersStrings.mouseup
import typings.domHelpers.domHelpersStrings.paste
import typings.domHelpers.domHelpersStrings.pause
import typings.domHelpers.domHelpersStrings.play
import typings.domHelpers.domHelpersStrings.playing
import typings.domHelpers.domHelpersStrings.pointercancel
import typings.domHelpers.domHelpersStrings.pointerdown
import typings.domHelpers.domHelpersStrings.pointerenter
import typings.domHelpers.domHelpersStrings.pointerleave
import typings.domHelpers.domHelpersStrings.pointermove
import typings.domHelpers.domHelpersStrings.pointerout
import typings.domHelpers.domHelpersStrings.pointerover
import typings.domHelpers.domHelpersStrings.pointerup
import typings.domHelpers.domHelpersStrings.progress
import typings.domHelpers.domHelpersStrings.ratechange
import typings.domHelpers.domHelpersStrings.reset
import typings.domHelpers.domHelpersStrings.resize
import typings.domHelpers.domHelpersStrings.scroll
import typings.domHelpers.domHelpersStrings.securitypolicyviolation
import typings.domHelpers.domHelpersStrings.seeked
import typings.domHelpers.domHelpersStrings.seeking
import typings.domHelpers.domHelpersStrings.select
import typings.domHelpers.domHelpersStrings.selectionchange
import typings.domHelpers.domHelpersStrings.selectstart
import typings.domHelpers.domHelpersStrings.stalled
import typings.domHelpers.domHelpersStrings.submit
import typings.domHelpers.domHelpersStrings.suspend
import typings.domHelpers.domHelpersStrings.timeupdate
import typings.domHelpers.domHelpersStrings.toggle
import typings.domHelpers.domHelpersStrings.touchcancel
import typings.domHelpers.domHelpersStrings.touchend
import typings.domHelpers.domHelpersStrings.touchmove
import typings.domHelpers.domHelpersStrings.touchstart
import typings.domHelpers.domHelpersStrings.transitioncancel
import typings.domHelpers.domHelpersStrings.transitionend
import typings.domHelpers.domHelpersStrings.transitionrun
import typings.domHelpers.domHelpersStrings.transitionstart
import typings.domHelpers.domHelpersStrings.volumechange
import typings.domHelpers.domHelpersStrings.waiting
import typings.domHelpers.domHelpersStrings.wheel
import typings.std.AddEventListenerOptions
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listenMod {
  
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_abort(node: HTMLElement, eventName: abort, handler: EventHandler[abort]): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_abort(node: HTMLElement, eventName: abort, handler: EventHandler[abort], options: Boolean): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_abort(
    node: HTMLElement,
    eventName: abort,
    handler: EventHandler[abort],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_animationcancel(node: HTMLElement, eventName: animationcancel, handler: EventHandler[animationcancel]): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_animationcancel(
    node: HTMLElement,
    eventName: animationcancel,
    handler: EventHandler[animationcancel],
    options: Boolean
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_animationcancel(
    node: HTMLElement,
    eventName: animationcancel,
    handler: EventHandler[animationcancel],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_animationend(node: HTMLElement, eventName: animationend, handler: EventHandler[animationend]): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_animationend(node: HTMLElement, eventName: animationend, handler: EventHandler[animationend], options: Boolean): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_animationend(
    node: HTMLElement,
    eventName: animationend,
    handler: EventHandler[animationend],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_animationiteration(node: HTMLElement, eventName: animationiteration, handler: EventHandler[animationiteration]): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_animationiteration(
    node: HTMLElement,
    eventName: animationiteration,
    handler: EventHandler[animationiteration],
    options: Boolean
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_animationiteration(
    node: HTMLElement,
    eventName: animationiteration,
    handler: EventHandler[animationiteration],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_animationstart(node: HTMLElement, eventName: animationstart, handler: EventHandler[animationstart]): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_animationstart(
    node: HTMLElement,
    eventName: animationstart,
    handler: EventHandler[animationstart],
    options: Boolean
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_animationstart(
    node: HTMLElement,
    eventName: animationstart,
    handler: EventHandler[animationstart],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_auxclick(node: HTMLElement, eventName: auxclick, handler: EventHandler[auxclick]): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_auxclick(node: HTMLElement, eventName: auxclick, handler: EventHandler[auxclick], options: Boolean): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_auxclick(
    node: HTMLElement,
    eventName: auxclick,
    handler: EventHandler[auxclick],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_blur(node: HTMLElement, eventName: blur, handler: EventHandler[blur]): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_blur(node: HTMLElement, eventName: blur, handler: EventHandler[blur], options: Boolean): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_blur(node: HTMLElement, eventName: blur, handler: EventHandler[blur], options: AddEventListenerOptions): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_cancel(node: HTMLElement, eventName: cancel, handler: EventHandler[cancel]): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_cancel(node: HTMLElement, eventName: cancel, handler: EventHandler[cancel], options: Boolean): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_cancel(
    node: HTMLElement,
    eventName: cancel,
    handler: EventHandler[cancel],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_canplay(node: HTMLElement, eventName: canplay, handler: EventHandler[canplay]): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_canplay(node: HTMLElement, eventName: canplay, handler: EventHandler[canplay], options: Boolean): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_canplay(
    node: HTMLElement,
    eventName: canplay,
    handler: EventHandler[canplay],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_canplaythrough(node: HTMLElement, eventName: canplaythrough, handler: EventHandler[canplaythrough]): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_canplaythrough(
    node: HTMLElement,
    eventName: canplaythrough,
    handler: EventHandler[canplaythrough],
    options: Boolean
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_canplaythrough(
    node: HTMLElement,
    eventName: canplaythrough,
    handler: EventHandler[canplaythrough],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_change(node: HTMLElement, eventName: change, handler: EventHandler[change]): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_change(node: HTMLElement, eventName: change, handler: EventHandler[change], options: Boolean): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_change(
    node: HTMLElement,
    eventName: change,
    handler: EventHandler[change],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_click(node: HTMLElement, eventName: click, handler: EventHandler[click]): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_click(node: HTMLElement, eventName: click, handler: EventHandler[click], options: Boolean): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_click(
    node: HTMLElement,
    eventName: click,
    handler: EventHandler[click],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_close(node: HTMLElement, eventName: close, handler: EventHandler[close]): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_close(node: HTMLElement, eventName: close, handler: EventHandler[close], options: Boolean): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_close(
    node: HTMLElement,
    eventName: close,
    handler: EventHandler[close],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_contextmenu(node: HTMLElement, eventName: contextmenu, handler: EventHandler[contextmenu]): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_contextmenu(node: HTMLElement, eventName: contextmenu, handler: EventHandler[contextmenu], options: Boolean): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_contextmenu(
    node: HTMLElement,
    eventName: contextmenu,
    handler: EventHandler[contextmenu],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_copy(node: HTMLElement, eventName: copy, handler: EventHandler[copy]): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_copy(node: HTMLElement, eventName: copy, handler: EventHandler[copy], options: Boolean): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_copy(node: HTMLElement, eventName: copy, handler: EventHandler[copy], options: AddEventListenerOptions): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_cuechange(node: HTMLElement, eventName: cuechange, handler: EventHandler[cuechange]): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_cuechange(node: HTMLElement, eventName: cuechange, handler: EventHandler[cuechange], options: Boolean): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_cuechange(
    node: HTMLElement,
    eventName: cuechange,
    handler: EventHandler[cuechange],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_cut(node: HTMLElement, eventName: cut, handler: EventHandler[cut]): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_cut(node: HTMLElement, eventName: cut, handler: EventHandler[cut], options: Boolean): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_cut(node: HTMLElement, eventName: cut, handler: EventHandler[cut], options: AddEventListenerOptions): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_dblclick(node: HTMLElement, eventName: dblclick, handler: EventHandler[dblclick]): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_dblclick(node: HTMLElement, eventName: dblclick, handler: EventHandler[dblclick], options: Boolean): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_dblclick(
    node: HTMLElement,
    eventName: dblclick,
    handler: EventHandler[dblclick],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_drag(node: HTMLElement, eventName: drag, handler: EventHandler[drag]): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_drag(node: HTMLElement, eventName: drag, handler: EventHandler[drag], options: Boolean): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_drag(node: HTMLElement, eventName: drag, handler: EventHandler[drag], options: AddEventListenerOptions): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_dragend(node: HTMLElement, eventName: dragend, handler: EventHandler[dragend]): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_dragend(node: HTMLElement, eventName: dragend, handler: EventHandler[dragend], options: Boolean): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_dragend(
    node: HTMLElement,
    eventName: dragend,
    handler: EventHandler[dragend],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_dragenter(node: HTMLElement, eventName: dragenter, handler: EventHandler[dragenter]): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_dragenter(node: HTMLElement, eventName: dragenter, handler: EventHandler[dragenter], options: Boolean): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_dragenter(
    node: HTMLElement,
    eventName: dragenter,
    handler: EventHandler[dragenter],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_dragexit(node: HTMLElement, eventName: dragexit, handler: EventHandler[dragexit]): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_dragexit(node: HTMLElement, eventName: dragexit, handler: EventHandler[dragexit], options: Boolean): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_dragexit(
    node: HTMLElement,
    eventName: dragexit,
    handler: EventHandler[dragexit],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_dragleave(node: HTMLElement, eventName: dragleave, handler: EventHandler[dragleave]): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_dragleave(node: HTMLElement, eventName: dragleave, handler: EventHandler[dragleave], options: Boolean): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_dragleave(
    node: HTMLElement,
    eventName: dragleave,
    handler: EventHandler[dragleave],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_dragover(node: HTMLElement, eventName: dragover, handler: EventHandler[dragover]): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_dragover(node: HTMLElement, eventName: dragover, handler: EventHandler[dragover], options: Boolean): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_dragover(
    node: HTMLElement,
    eventName: dragover,
    handler: EventHandler[dragover],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_dragstart(node: HTMLElement, eventName: dragstart, handler: EventHandler[dragstart]): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_dragstart(node: HTMLElement, eventName: dragstart, handler: EventHandler[dragstart], options: Boolean): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_dragstart(
    node: HTMLElement,
    eventName: dragstart,
    handler: EventHandler[dragstart],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_drop(node: HTMLElement, eventName: drop, handler: EventHandler[drop]): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_drop(node: HTMLElement, eventName: drop, handler: EventHandler[drop], options: Boolean): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_drop(node: HTMLElement, eventName: drop, handler: EventHandler[drop], options: AddEventListenerOptions): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_durationchange(node: HTMLElement, eventName: durationchange, handler: EventHandler[durationchange]): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_durationchange(
    node: HTMLElement,
    eventName: durationchange,
    handler: EventHandler[durationchange],
    options: Boolean
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_durationchange(
    node: HTMLElement,
    eventName: durationchange,
    handler: EventHandler[durationchange],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_emptied(node: HTMLElement, eventName: emptied, handler: EventHandler[emptied]): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_emptied(node: HTMLElement, eventName: emptied, handler: EventHandler[emptied], options: Boolean): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_emptied(
    node: HTMLElement,
    eventName: emptied,
    handler: EventHandler[emptied],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_ended(node: HTMLElement, eventName: ended, handler: EventHandler[ended]): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_ended(node: HTMLElement, eventName: ended, handler: EventHandler[ended], options: Boolean): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_ended(
    node: HTMLElement,
    eventName: ended,
    handler: EventHandler[ended],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_error(node: HTMLElement, eventName: error, handler: EventHandler[error]): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_error(node: HTMLElement, eventName: error, handler: EventHandler[error], options: Boolean): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_error(
    node: HTMLElement,
    eventName: error,
    handler: EventHandler[error],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_focus(node: HTMLElement, eventName: focus, handler: EventHandler[focus]): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_focus(node: HTMLElement, eventName: focus, handler: EventHandler[focus], options: Boolean): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_focus(
    node: HTMLElement,
    eventName: focus,
    handler: EventHandler[focus],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_focusin(node: HTMLElement, eventName: focusin, handler: EventHandler[focusin]): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_focusin(node: HTMLElement, eventName: focusin, handler: EventHandler[focusin], options: Boolean): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_focusin(
    node: HTMLElement,
    eventName: focusin,
    handler: EventHandler[focusin],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_focusout(node: HTMLElement, eventName: focusout, handler: EventHandler[focusout]): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_focusout(node: HTMLElement, eventName: focusout, handler: EventHandler[focusout], options: Boolean): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_focusout(
    node: HTMLElement,
    eventName: focusout,
    handler: EventHandler[focusout],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_fullscreenchange(node: HTMLElement, eventName: fullscreenchange, handler: EventHandler[fullscreenchange]): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_fullscreenchange(
    node: HTMLElement,
    eventName: fullscreenchange,
    handler: EventHandler[fullscreenchange],
    options: Boolean
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_fullscreenchange(
    node: HTMLElement,
    eventName: fullscreenchange,
    handler: EventHandler[fullscreenchange],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_fullscreenerror(node: HTMLElement, eventName: fullscreenerror, handler: EventHandler[fullscreenerror]): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_fullscreenerror(
    node: HTMLElement,
    eventName: fullscreenerror,
    handler: EventHandler[fullscreenerror],
    options: Boolean
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_fullscreenerror(
    node: HTMLElement,
    eventName: fullscreenerror,
    handler: EventHandler[fullscreenerror],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_gotpointercapture(node: HTMLElement, eventName: gotpointercapture, handler: EventHandler[gotpointercapture]): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_gotpointercapture(
    node: HTMLElement,
    eventName: gotpointercapture,
    handler: EventHandler[gotpointercapture],
    options: Boolean
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_gotpointercapture(
    node: HTMLElement,
    eventName: gotpointercapture,
    handler: EventHandler[gotpointercapture],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_input(node: HTMLElement, eventName: input, handler: EventHandler[input]): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_input(node: HTMLElement, eventName: input, handler: EventHandler[input], options: Boolean): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_input(
    node: HTMLElement,
    eventName: input,
    handler: EventHandler[input],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_invalid(node: HTMLElement, eventName: invalid, handler: EventHandler[invalid]): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_invalid(node: HTMLElement, eventName: invalid, handler: EventHandler[invalid], options: Boolean): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_invalid(
    node: HTMLElement,
    eventName: invalid,
    handler: EventHandler[invalid],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_keydown(node: HTMLElement, eventName: keydown, handler: EventHandler[keydown]): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_keydown(node: HTMLElement, eventName: keydown, handler: EventHandler[keydown], options: Boolean): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_keydown(
    node: HTMLElement,
    eventName: keydown,
    handler: EventHandler[keydown],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_keypress(node: HTMLElement, eventName: keypress, handler: EventHandler[keypress]): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_keypress(node: HTMLElement, eventName: keypress, handler: EventHandler[keypress], options: Boolean): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_keypress(
    node: HTMLElement,
    eventName: keypress,
    handler: EventHandler[keypress],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_keyup(node: HTMLElement, eventName: keyup, handler: EventHandler[keyup]): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_keyup(node: HTMLElement, eventName: keyup, handler: EventHandler[keyup], options: Boolean): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_keyup(
    node: HTMLElement,
    eventName: keyup,
    handler: EventHandler[keyup],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_load(node: HTMLElement, eventName: load, handler: EventHandler[load]): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_load(node: HTMLElement, eventName: load, handler: EventHandler[load], options: Boolean): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_load(node: HTMLElement, eventName: load, handler: EventHandler[load], options: AddEventListenerOptions): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_loadeddata(node: HTMLElement, eventName: loadeddata, handler: EventHandler[loadeddata]): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_loadeddata(node: HTMLElement, eventName: loadeddata, handler: EventHandler[loadeddata], options: Boolean): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_loadeddata(
    node: HTMLElement,
    eventName: loadeddata,
    handler: EventHandler[loadeddata],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_loadedmetadata(node: HTMLElement, eventName: loadedmetadata, handler: EventHandler[loadedmetadata]): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_loadedmetadata(
    node: HTMLElement,
    eventName: loadedmetadata,
    handler: EventHandler[loadedmetadata],
    options: Boolean
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_loadedmetadata(
    node: HTMLElement,
    eventName: loadedmetadata,
    handler: EventHandler[loadedmetadata],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_loadstart(node: HTMLElement, eventName: loadstart, handler: EventHandler[loadstart]): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_loadstart(node: HTMLElement, eventName: loadstart, handler: EventHandler[loadstart], options: Boolean): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_loadstart(
    node: HTMLElement,
    eventName: loadstart,
    handler: EventHandler[loadstart],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_lostpointercapture(node: HTMLElement, eventName: lostpointercapture, handler: EventHandler[lostpointercapture]): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_lostpointercapture(
    node: HTMLElement,
    eventName: lostpointercapture,
    handler: EventHandler[lostpointercapture],
    options: Boolean
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_lostpointercapture(
    node: HTMLElement,
    eventName: lostpointercapture,
    handler: EventHandler[lostpointercapture],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_mousedown(node: HTMLElement, eventName: mousedown, handler: EventHandler[mousedown]): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_mousedown(node: HTMLElement, eventName: mousedown, handler: EventHandler[mousedown], options: Boolean): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_mousedown(
    node: HTMLElement,
    eventName: mousedown,
    handler: EventHandler[mousedown],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_mouseenter(node: HTMLElement, eventName: mouseenter, handler: EventHandler[mouseenter]): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_mouseenter(node: HTMLElement, eventName: mouseenter, handler: EventHandler[mouseenter], options: Boolean): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_mouseenter(
    node: HTMLElement,
    eventName: mouseenter,
    handler: EventHandler[mouseenter],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_mouseleave(node: HTMLElement, eventName: mouseleave, handler: EventHandler[mouseleave]): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_mouseleave(node: HTMLElement, eventName: mouseleave, handler: EventHandler[mouseleave], options: Boolean): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_mouseleave(
    node: HTMLElement,
    eventName: mouseleave,
    handler: EventHandler[mouseleave],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_mousemove(node: HTMLElement, eventName: mousemove, handler: EventHandler[mousemove]): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_mousemove(node: HTMLElement, eventName: mousemove, handler: EventHandler[mousemove], options: Boolean): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_mousemove(
    node: HTMLElement,
    eventName: mousemove,
    handler: EventHandler[mousemove],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_mouseout(node: HTMLElement, eventName: mouseout, handler: EventHandler[mouseout]): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_mouseout(node: HTMLElement, eventName: mouseout, handler: EventHandler[mouseout], options: Boolean): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_mouseout(
    node: HTMLElement,
    eventName: mouseout,
    handler: EventHandler[mouseout],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_mouseover(node: HTMLElement, eventName: mouseover, handler: EventHandler[mouseover]): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_mouseover(node: HTMLElement, eventName: mouseover, handler: EventHandler[mouseover], options: Boolean): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_mouseover(
    node: HTMLElement,
    eventName: mouseover,
    handler: EventHandler[mouseover],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_mouseup(node: HTMLElement, eventName: mouseup, handler: EventHandler[mouseup]): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_mouseup(node: HTMLElement, eventName: mouseup, handler: EventHandler[mouseup], options: Boolean): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_mouseup(
    node: HTMLElement,
    eventName: mouseup,
    handler: EventHandler[mouseup],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_paste(node: HTMLElement, eventName: paste, handler: EventHandler[paste]): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_paste(node: HTMLElement, eventName: paste, handler: EventHandler[paste], options: Boolean): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_paste(
    node: HTMLElement,
    eventName: paste,
    handler: EventHandler[paste],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_pause(node: HTMLElement, eventName: pause, handler: EventHandler[pause]): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_pause(node: HTMLElement, eventName: pause, handler: EventHandler[pause], options: Boolean): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_pause(
    node: HTMLElement,
    eventName: pause,
    handler: EventHandler[pause],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_play(node: HTMLElement, eventName: play, handler: EventHandler[play]): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_play(node: HTMLElement, eventName: play, handler: EventHandler[play], options: Boolean): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_play(node: HTMLElement, eventName: play, handler: EventHandler[play], options: AddEventListenerOptions): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_playing(node: HTMLElement, eventName: playing, handler: EventHandler[playing]): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_playing(node: HTMLElement, eventName: playing, handler: EventHandler[playing], options: Boolean): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_playing(
    node: HTMLElement,
    eventName: playing,
    handler: EventHandler[playing],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_pointercancel(node: HTMLElement, eventName: pointercancel, handler: EventHandler[pointercancel]): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_pointercancel(
    node: HTMLElement,
    eventName: pointercancel,
    handler: EventHandler[pointercancel],
    options: Boolean
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_pointercancel(
    node: HTMLElement,
    eventName: pointercancel,
    handler: EventHandler[pointercancel],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_pointerdown(node: HTMLElement, eventName: pointerdown, handler: EventHandler[pointerdown]): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_pointerdown(node: HTMLElement, eventName: pointerdown, handler: EventHandler[pointerdown], options: Boolean): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_pointerdown(
    node: HTMLElement,
    eventName: pointerdown,
    handler: EventHandler[pointerdown],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_pointerenter(node: HTMLElement, eventName: pointerenter, handler: EventHandler[pointerenter]): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_pointerenter(node: HTMLElement, eventName: pointerenter, handler: EventHandler[pointerenter], options: Boolean): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_pointerenter(
    node: HTMLElement,
    eventName: pointerenter,
    handler: EventHandler[pointerenter],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_pointerleave(node: HTMLElement, eventName: pointerleave, handler: EventHandler[pointerleave]): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_pointerleave(node: HTMLElement, eventName: pointerleave, handler: EventHandler[pointerleave], options: Boolean): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_pointerleave(
    node: HTMLElement,
    eventName: pointerleave,
    handler: EventHandler[pointerleave],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_pointermove(node: HTMLElement, eventName: pointermove, handler: EventHandler[pointermove]): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_pointermove(node: HTMLElement, eventName: pointermove, handler: EventHandler[pointermove], options: Boolean): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_pointermove(
    node: HTMLElement,
    eventName: pointermove,
    handler: EventHandler[pointermove],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_pointerout(node: HTMLElement, eventName: pointerout, handler: EventHandler[pointerout]): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_pointerout(node: HTMLElement, eventName: pointerout, handler: EventHandler[pointerout], options: Boolean): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_pointerout(
    node: HTMLElement,
    eventName: pointerout,
    handler: EventHandler[pointerout],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_pointerover(node: HTMLElement, eventName: pointerover, handler: EventHandler[pointerover]): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_pointerover(node: HTMLElement, eventName: pointerover, handler: EventHandler[pointerover], options: Boolean): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_pointerover(
    node: HTMLElement,
    eventName: pointerover,
    handler: EventHandler[pointerover],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_pointerup(node: HTMLElement, eventName: pointerup, handler: EventHandler[pointerup]): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_pointerup(node: HTMLElement, eventName: pointerup, handler: EventHandler[pointerup], options: Boolean): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_pointerup(
    node: HTMLElement,
    eventName: pointerup,
    handler: EventHandler[pointerup],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_progress(node: HTMLElement, eventName: progress, handler: EventHandler[progress]): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_progress(node: HTMLElement, eventName: progress, handler: EventHandler[progress], options: Boolean): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_progress(
    node: HTMLElement,
    eventName: progress,
    handler: EventHandler[progress],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_ratechange(node: HTMLElement, eventName: ratechange, handler: EventHandler[ratechange]): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_ratechange(node: HTMLElement, eventName: ratechange, handler: EventHandler[ratechange], options: Boolean): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_ratechange(
    node: HTMLElement,
    eventName: ratechange,
    handler: EventHandler[ratechange],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_reset(node: HTMLElement, eventName: reset, handler: EventHandler[reset]): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_reset(node: HTMLElement, eventName: reset, handler: EventHandler[reset], options: Boolean): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_reset(
    node: HTMLElement,
    eventName: reset,
    handler: EventHandler[reset],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_resize(node: HTMLElement, eventName: resize, handler: EventHandler[resize]): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_resize(node: HTMLElement, eventName: resize, handler: EventHandler[resize], options: Boolean): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_resize(
    node: HTMLElement,
    eventName: resize,
    handler: EventHandler[resize],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_scroll(node: HTMLElement, eventName: scroll, handler: EventHandler[scroll]): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_scroll(node: HTMLElement, eventName: scroll, handler: EventHandler[scroll], options: Boolean): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_scroll(
    node: HTMLElement,
    eventName: scroll,
    handler: EventHandler[scroll],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_securitypolicyviolation(
    node: HTMLElement,
    eventName: securitypolicyviolation,
    handler: EventHandler[securitypolicyviolation]
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_securitypolicyviolation(
    node: HTMLElement,
    eventName: securitypolicyviolation,
    handler: EventHandler[securitypolicyviolation],
    options: Boolean
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_securitypolicyviolation(
    node: HTMLElement,
    eventName: securitypolicyviolation,
    handler: EventHandler[securitypolicyviolation],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_seeked(node: HTMLElement, eventName: seeked, handler: EventHandler[seeked]): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_seeked(node: HTMLElement, eventName: seeked, handler: EventHandler[seeked], options: Boolean): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_seeked(
    node: HTMLElement,
    eventName: seeked,
    handler: EventHandler[seeked],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_seeking(node: HTMLElement, eventName: seeking, handler: EventHandler[seeking]): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_seeking(node: HTMLElement, eventName: seeking, handler: EventHandler[seeking], options: Boolean): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_seeking(
    node: HTMLElement,
    eventName: seeking,
    handler: EventHandler[seeking],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_select(node: HTMLElement, eventName: select, handler: EventHandler[select]): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_select(node: HTMLElement, eventName: select, handler: EventHandler[select], options: Boolean): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_select(
    node: HTMLElement,
    eventName: select,
    handler: EventHandler[select],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_selectionchange(node: HTMLElement, eventName: selectionchange, handler: EventHandler[selectionchange]): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_selectionchange(
    node: HTMLElement,
    eventName: selectionchange,
    handler: EventHandler[selectionchange],
    options: Boolean
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_selectionchange(
    node: HTMLElement,
    eventName: selectionchange,
    handler: EventHandler[selectionchange],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_selectstart(node: HTMLElement, eventName: selectstart, handler: EventHandler[selectstart]): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_selectstart(node: HTMLElement, eventName: selectstart, handler: EventHandler[selectstart], options: Boolean): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_selectstart(
    node: HTMLElement,
    eventName: selectstart,
    handler: EventHandler[selectstart],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_stalled(node: HTMLElement, eventName: stalled, handler: EventHandler[stalled]): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_stalled(node: HTMLElement, eventName: stalled, handler: EventHandler[stalled], options: Boolean): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_stalled(
    node: HTMLElement,
    eventName: stalled,
    handler: EventHandler[stalled],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_submit(node: HTMLElement, eventName: submit, handler: EventHandler[submit]): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_submit(node: HTMLElement, eventName: submit, handler: EventHandler[submit], options: Boolean): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_submit(
    node: HTMLElement,
    eventName: submit,
    handler: EventHandler[submit],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_suspend(node: HTMLElement, eventName: suspend, handler: EventHandler[suspend]): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_suspend(node: HTMLElement, eventName: suspend, handler: EventHandler[suspend], options: Boolean): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_suspend(
    node: HTMLElement,
    eventName: suspend,
    handler: EventHandler[suspend],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_timeupdate(node: HTMLElement, eventName: timeupdate, handler: EventHandler[timeupdate]): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_timeupdate(node: HTMLElement, eventName: timeupdate, handler: EventHandler[timeupdate], options: Boolean): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_timeupdate(
    node: HTMLElement,
    eventName: timeupdate,
    handler: EventHandler[timeupdate],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_toggle(node: HTMLElement, eventName: toggle, handler: EventHandler[toggle]): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_toggle(node: HTMLElement, eventName: toggle, handler: EventHandler[toggle], options: Boolean): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_toggle(
    node: HTMLElement,
    eventName: toggle,
    handler: EventHandler[toggle],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_touchcancel(node: HTMLElement, eventName: touchcancel, handler: EventHandler[touchcancel]): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_touchcancel(node: HTMLElement, eventName: touchcancel, handler: EventHandler[touchcancel], options: Boolean): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_touchcancel(
    node: HTMLElement,
    eventName: touchcancel,
    handler: EventHandler[touchcancel],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_touchend(node: HTMLElement, eventName: touchend, handler: EventHandler[touchend]): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_touchend(node: HTMLElement, eventName: touchend, handler: EventHandler[touchend], options: Boolean): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_touchend(
    node: HTMLElement,
    eventName: touchend,
    handler: EventHandler[touchend],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_touchmove(node: HTMLElement, eventName: touchmove, handler: EventHandler[touchmove]): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_touchmove(node: HTMLElement, eventName: touchmove, handler: EventHandler[touchmove], options: Boolean): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_touchmove(
    node: HTMLElement,
    eventName: touchmove,
    handler: EventHandler[touchmove],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_touchstart(node: HTMLElement, eventName: touchstart, handler: EventHandler[touchstart]): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_touchstart(node: HTMLElement, eventName: touchstart, handler: EventHandler[touchstart], options: Boolean): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_touchstart(
    node: HTMLElement,
    eventName: touchstart,
    handler: EventHandler[touchstart],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_transitioncancel(node: HTMLElement, eventName: transitioncancel, handler: EventHandler[transitioncancel]): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_transitioncancel(
    node: HTMLElement,
    eventName: transitioncancel,
    handler: EventHandler[transitioncancel],
    options: Boolean
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_transitioncancel(
    node: HTMLElement,
    eventName: transitioncancel,
    handler: EventHandler[transitioncancel],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_transitionend(node: HTMLElement, eventName: transitionend, handler: EventHandler[transitionend]): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_transitionend(
    node: HTMLElement,
    eventName: transitionend,
    handler: EventHandler[transitionend],
    options: Boolean
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_transitionend(
    node: HTMLElement,
    eventName: transitionend,
    handler: EventHandler[transitionend],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_transitionrun(node: HTMLElement, eventName: transitionrun, handler: EventHandler[transitionrun]): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_transitionrun(
    node: HTMLElement,
    eventName: transitionrun,
    handler: EventHandler[transitionrun],
    options: Boolean
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_transitionrun(
    node: HTMLElement,
    eventName: transitionrun,
    handler: EventHandler[transitionrun],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_transitionstart(node: HTMLElement, eventName: transitionstart, handler: EventHandler[transitionstart]): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_transitionstart(
    node: HTMLElement,
    eventName: transitionstart,
    handler: EventHandler[transitionstart],
    options: Boolean
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_transitionstart(
    node: HTMLElement,
    eventName: transitionstart,
    handler: EventHandler[transitionstart],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_volumechange(node: HTMLElement, eventName: volumechange, handler: EventHandler[volumechange]): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_volumechange(node: HTMLElement, eventName: volumechange, handler: EventHandler[volumechange], options: Boolean): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_volumechange(
    node: HTMLElement,
    eventName: volumechange,
    handler: EventHandler[volumechange],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_waiting(node: HTMLElement, eventName: waiting, handler: EventHandler[waiting]): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_waiting(node: HTMLElement, eventName: waiting, handler: EventHandler[waiting], options: Boolean): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_waiting(
    node: HTMLElement,
    eventName: waiting,
    handler: EventHandler[waiting],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_wheel(node: HTMLElement, eventName: wheel, handler: EventHandler[wheel]): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_wheel(node: HTMLElement, eventName: wheel, handler: EventHandler[wheel], options: Boolean): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/listen", JSImport.Default)
  @js.native
  def default_wheel(
    node: HTMLElement,
    eventName: wheel,
    handler: EventHandler[wheel],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
}
