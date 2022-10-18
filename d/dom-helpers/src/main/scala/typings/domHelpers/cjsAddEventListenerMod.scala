package typings.domHelpers

import typings.domHelpers.domHelpersStrings.abort
import typings.domHelpers.domHelpersStrings.animationcancel
import typings.domHelpers.domHelpersStrings.animationend
import typings.domHelpers.domHelpersStrings.animationiteration
import typings.domHelpers.domHelpersStrings.animationstart
import typings.domHelpers.domHelpersStrings.auxclick
import typings.domHelpers.domHelpersStrings.beforeinput
import typings.domHelpers.domHelpersStrings.blur
import typings.domHelpers.domHelpersStrings.canplay
import typings.domHelpers.domHelpersStrings.canplaythrough
import typings.domHelpers.domHelpersStrings.change
import typings.domHelpers.domHelpersStrings.click
import typings.domHelpers.domHelpersStrings.close
import typings.domHelpers.domHelpersStrings.compositionend
import typings.domHelpers.domHelpersStrings.compositionstart
import typings.domHelpers.domHelpersStrings.compositionupdate
import typings.domHelpers.domHelpersStrings.contextmenu
import typings.domHelpers.domHelpersStrings.copy
import typings.domHelpers.domHelpersStrings.cuechange
import typings.domHelpers.domHelpersStrings.cut
import typings.domHelpers.domHelpersStrings.dblclick
import typings.domHelpers.domHelpersStrings.drag
import typings.domHelpers.domHelpersStrings.dragend
import typings.domHelpers.domHelpersStrings.dragenter
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
import typings.domHelpers.domHelpersStrings.formdata
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
import typings.domHelpers.domHelpersStrings.slotchange
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
import typings.domHelpers.domHelpersStrings.webkitanimationend
import typings.domHelpers.domHelpersStrings.webkitanimationiteration
import typings.domHelpers.domHelpersStrings.webkitanimationstart
import typings.domHelpers.domHelpersStrings.webkittransitionend
import typings.domHelpers.domHelpersStrings.wheel
import typings.std.AddEventListenerOptions
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cjsAddEventListenerMod {
  
  @JSImport("dom-helpers/cjs/addEventListener", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default_abort(node: HTMLElement, eventName: abort, handler: TaggedEventHandler[abort]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_abort(node: HTMLElement, eventName: abort, handler: TaggedEventHandler[abort], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_abort(
    node: HTMLElement,
    eventName: abort,
    handler: TaggedEventHandler[abort],
    options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_animationcancel(node: HTMLElement, eventName: animationcancel, handler: TaggedEventHandler[animationcancel]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_animationcancel(
    node: HTMLElement,
    eventName: animationcancel,
    handler: TaggedEventHandler[animationcancel],
    options: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_animationcancel(
    node: HTMLElement,
    eventName: animationcancel,
    handler: TaggedEventHandler[animationcancel],
    options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_animationend(node: HTMLElement, eventName: animationend, handler: TaggedEventHandler[animationend]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_animationend(
    node: HTMLElement,
    eventName: animationend,
    handler: TaggedEventHandler[animationend],
    options: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_animationend(
    node: HTMLElement,
    eventName: animationend,
    handler: TaggedEventHandler[animationend],
    options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_animationiteration(node: HTMLElement, eventName: animationiteration, handler: TaggedEventHandler[animationiteration]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_animationiteration(
    node: HTMLElement,
    eventName: animationiteration,
    handler: TaggedEventHandler[animationiteration],
    options: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_animationiteration(
    node: HTMLElement,
    eventName: animationiteration,
    handler: TaggedEventHandler[animationiteration],
    options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_animationstart(node: HTMLElement, eventName: animationstart, handler: TaggedEventHandler[animationstart]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_animationstart(
    node: HTMLElement,
    eventName: animationstart,
    handler: TaggedEventHandler[animationstart],
    options: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_animationstart(
    node: HTMLElement,
    eventName: animationstart,
    handler: TaggedEventHandler[animationstart],
    options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_auxclick(node: HTMLElement, eventName: auxclick, handler: TaggedEventHandler[auxclick]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_auxclick(node: HTMLElement, eventName: auxclick, handler: TaggedEventHandler[auxclick], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_auxclick(
    node: HTMLElement,
    eventName: auxclick,
    handler: TaggedEventHandler[auxclick],
    options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_beforeinput(node: HTMLElement, eventName: beforeinput, handler: TaggedEventHandler[beforeinput]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_beforeinput(
    node: HTMLElement,
    eventName: beforeinput,
    handler: TaggedEventHandler[beforeinput],
    options: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_beforeinput(
    node: HTMLElement,
    eventName: beforeinput,
    handler: TaggedEventHandler[beforeinput],
    options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_blur(node: HTMLElement, eventName: blur, handler: TaggedEventHandler[blur]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_blur(node: HTMLElement, eventName: blur, handler: TaggedEventHandler[blur], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_blur(
    node: HTMLElement,
    eventName: blur,
    handler: TaggedEventHandler[blur],
    options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_canplay(node: HTMLElement, eventName: canplay, handler: TaggedEventHandler[canplay]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_canplay(node: HTMLElement, eventName: canplay, handler: TaggedEventHandler[canplay], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_canplay(
    node: HTMLElement,
    eventName: canplay,
    handler: TaggedEventHandler[canplay],
    options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_canplaythrough(node: HTMLElement, eventName: canplaythrough, handler: TaggedEventHandler[canplaythrough]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_canplaythrough(
    node: HTMLElement,
    eventName: canplaythrough,
    handler: TaggedEventHandler[canplaythrough],
    options: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_canplaythrough(
    node: HTMLElement,
    eventName: canplaythrough,
    handler: TaggedEventHandler[canplaythrough],
    options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_change(node: HTMLElement, eventName: change, handler: TaggedEventHandler[change]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_change(node: HTMLElement, eventName: change, handler: TaggedEventHandler[change], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_change(
    node: HTMLElement,
    eventName: change,
    handler: TaggedEventHandler[change],
    options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_click(node: HTMLElement, eventName: click, handler: TaggedEventHandler[click]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_click(node: HTMLElement, eventName: click, handler: TaggedEventHandler[click], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_click(
    node: HTMLElement,
    eventName: click,
    handler: TaggedEventHandler[click],
    options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_close(node: HTMLElement, eventName: close, handler: TaggedEventHandler[close]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_close(node: HTMLElement, eventName: close, handler: TaggedEventHandler[close], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_close(
    node: HTMLElement,
    eventName: close,
    handler: TaggedEventHandler[close],
    options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_compositionend(node: HTMLElement, eventName: compositionend, handler: TaggedEventHandler[compositionend]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_compositionend(
    node: HTMLElement,
    eventName: compositionend,
    handler: TaggedEventHandler[compositionend],
    options: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_compositionend(
    node: HTMLElement,
    eventName: compositionend,
    handler: TaggedEventHandler[compositionend],
    options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_compositionstart(node: HTMLElement, eventName: compositionstart, handler: TaggedEventHandler[compositionstart]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_compositionstart(
    node: HTMLElement,
    eventName: compositionstart,
    handler: TaggedEventHandler[compositionstart],
    options: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_compositionstart(
    node: HTMLElement,
    eventName: compositionstart,
    handler: TaggedEventHandler[compositionstart],
    options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_compositionupdate(node: HTMLElement, eventName: compositionupdate, handler: TaggedEventHandler[compositionupdate]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_compositionupdate(
    node: HTMLElement,
    eventName: compositionupdate,
    handler: TaggedEventHandler[compositionupdate],
    options: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_compositionupdate(
    node: HTMLElement,
    eventName: compositionupdate,
    handler: TaggedEventHandler[compositionupdate],
    options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_contextmenu(node: HTMLElement, eventName: contextmenu, handler: TaggedEventHandler[contextmenu]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_contextmenu(
    node: HTMLElement,
    eventName: contextmenu,
    handler: TaggedEventHandler[contextmenu],
    options: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_contextmenu(
    node: HTMLElement,
    eventName: contextmenu,
    handler: TaggedEventHandler[contextmenu],
    options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_copy(node: HTMLElement, eventName: copy, handler: TaggedEventHandler[copy]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_copy(node: HTMLElement, eventName: copy, handler: TaggedEventHandler[copy], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_copy(
    node: HTMLElement,
    eventName: copy,
    handler: TaggedEventHandler[copy],
    options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_cuechange(node: HTMLElement, eventName: cuechange, handler: TaggedEventHandler[cuechange]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_cuechange(node: HTMLElement, eventName: cuechange, handler: TaggedEventHandler[cuechange], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_cuechange(
    node: HTMLElement,
    eventName: cuechange,
    handler: TaggedEventHandler[cuechange],
    options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_cut(node: HTMLElement, eventName: cut, handler: TaggedEventHandler[cut]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_cut(node: HTMLElement, eventName: cut, handler: TaggedEventHandler[cut], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_cut(
    node: HTMLElement,
    eventName: cut,
    handler: TaggedEventHandler[cut],
    options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_dblclick(node: HTMLElement, eventName: dblclick, handler: TaggedEventHandler[dblclick]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_dblclick(node: HTMLElement, eventName: dblclick, handler: TaggedEventHandler[dblclick], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_dblclick(
    node: HTMLElement,
    eventName: dblclick,
    handler: TaggedEventHandler[dblclick],
    options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_drag(node: HTMLElement, eventName: drag, handler: TaggedEventHandler[drag]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_drag(node: HTMLElement, eventName: drag, handler: TaggedEventHandler[drag], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_drag(
    node: HTMLElement,
    eventName: drag,
    handler: TaggedEventHandler[drag],
    options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_dragend(node: HTMLElement, eventName: dragend, handler: TaggedEventHandler[dragend]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_dragend(node: HTMLElement, eventName: dragend, handler: TaggedEventHandler[dragend], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_dragend(
    node: HTMLElement,
    eventName: dragend,
    handler: TaggedEventHandler[dragend],
    options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_dragenter(node: HTMLElement, eventName: dragenter, handler: TaggedEventHandler[dragenter]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_dragenter(node: HTMLElement, eventName: dragenter, handler: TaggedEventHandler[dragenter], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_dragenter(
    node: HTMLElement,
    eventName: dragenter,
    handler: TaggedEventHandler[dragenter],
    options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_dragleave(node: HTMLElement, eventName: dragleave, handler: TaggedEventHandler[dragleave]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_dragleave(node: HTMLElement, eventName: dragleave, handler: TaggedEventHandler[dragleave], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_dragleave(
    node: HTMLElement,
    eventName: dragleave,
    handler: TaggedEventHandler[dragleave],
    options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_dragover(node: HTMLElement, eventName: dragover, handler: TaggedEventHandler[dragover]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_dragover(node: HTMLElement, eventName: dragover, handler: TaggedEventHandler[dragover], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_dragover(
    node: HTMLElement,
    eventName: dragover,
    handler: TaggedEventHandler[dragover],
    options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_dragstart(node: HTMLElement, eventName: dragstart, handler: TaggedEventHandler[dragstart]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_dragstart(node: HTMLElement, eventName: dragstart, handler: TaggedEventHandler[dragstart], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_dragstart(
    node: HTMLElement,
    eventName: dragstart,
    handler: TaggedEventHandler[dragstart],
    options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_drop(node: HTMLElement, eventName: drop, handler: TaggedEventHandler[drop]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_drop(node: HTMLElement, eventName: drop, handler: TaggedEventHandler[drop], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_drop(
    node: HTMLElement,
    eventName: drop,
    handler: TaggedEventHandler[drop],
    options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_durationchange(node: HTMLElement, eventName: durationchange, handler: TaggedEventHandler[durationchange]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_durationchange(
    node: HTMLElement,
    eventName: durationchange,
    handler: TaggedEventHandler[durationchange],
    options: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_durationchange(
    node: HTMLElement,
    eventName: durationchange,
    handler: TaggedEventHandler[durationchange],
    options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_emptied(node: HTMLElement, eventName: emptied, handler: TaggedEventHandler[emptied]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_emptied(node: HTMLElement, eventName: emptied, handler: TaggedEventHandler[emptied], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_emptied(
    node: HTMLElement,
    eventName: emptied,
    handler: TaggedEventHandler[emptied],
    options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_ended(node: HTMLElement, eventName: ended, handler: TaggedEventHandler[ended]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_ended(node: HTMLElement, eventName: ended, handler: TaggedEventHandler[ended], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_ended(
    node: HTMLElement,
    eventName: ended,
    handler: TaggedEventHandler[ended],
    options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_error(node: HTMLElement, eventName: error, handler: TaggedEventHandler[error]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_error(node: HTMLElement, eventName: error, handler: TaggedEventHandler[error], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_error(
    node: HTMLElement,
    eventName: error,
    handler: TaggedEventHandler[error],
    options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_focus(node: HTMLElement, eventName: focus, handler: TaggedEventHandler[focus]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_focus(node: HTMLElement, eventName: focus, handler: TaggedEventHandler[focus], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_focus(
    node: HTMLElement,
    eventName: focus,
    handler: TaggedEventHandler[focus],
    options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_focusin(node: HTMLElement, eventName: focusin, handler: TaggedEventHandler[focusin]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_focusin(node: HTMLElement, eventName: focusin, handler: TaggedEventHandler[focusin], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_focusin(
    node: HTMLElement,
    eventName: focusin,
    handler: TaggedEventHandler[focusin],
    options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_focusout(node: HTMLElement, eventName: focusout, handler: TaggedEventHandler[focusout]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_focusout(node: HTMLElement, eventName: focusout, handler: TaggedEventHandler[focusout], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_focusout(
    node: HTMLElement,
    eventName: focusout,
    handler: TaggedEventHandler[focusout],
    options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_formdata(node: HTMLElement, eventName: formdata, handler: TaggedEventHandler[formdata]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_formdata(node: HTMLElement, eventName: formdata, handler: TaggedEventHandler[formdata], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_formdata(
    node: HTMLElement,
    eventName: formdata,
    handler: TaggedEventHandler[formdata],
    options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * An `addEventListener` ponyfill, supports the `once` option
    *
    * @param node the element
    * @param eventName the event name
    * @param handle the handler
    * @param options event options
    */
  inline def default_fullscreenchange(node: HTMLElement, eventName: fullscreenchange, handler: TaggedEventHandler[fullscreenchange]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_fullscreenchange(
    node: HTMLElement,
    eventName: fullscreenchange,
    handler: TaggedEventHandler[fullscreenchange],
    options: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_fullscreenchange(
    node: HTMLElement,
    eventName: fullscreenchange,
    handler: TaggedEventHandler[fullscreenchange],
    options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_fullscreenerror(node: HTMLElement, eventName: fullscreenerror, handler: TaggedEventHandler[fullscreenerror]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_fullscreenerror(
    node: HTMLElement,
    eventName: fullscreenerror,
    handler: TaggedEventHandler[fullscreenerror],
    options: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_fullscreenerror(
    node: HTMLElement,
    eventName: fullscreenerror,
    handler: TaggedEventHandler[fullscreenerror],
    options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_gotpointercapture(node: HTMLElement, eventName: gotpointercapture, handler: TaggedEventHandler[gotpointercapture]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_gotpointercapture(
    node: HTMLElement,
    eventName: gotpointercapture,
    handler: TaggedEventHandler[gotpointercapture],
    options: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_gotpointercapture(
    node: HTMLElement,
    eventName: gotpointercapture,
    handler: TaggedEventHandler[gotpointercapture],
    options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_input(node: HTMLElement, eventName: input, handler: TaggedEventHandler[input]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_input(node: HTMLElement, eventName: input, handler: TaggedEventHandler[input], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_input(
    node: HTMLElement,
    eventName: input,
    handler: TaggedEventHandler[input],
    options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_invalid(node: HTMLElement, eventName: invalid, handler: TaggedEventHandler[invalid]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_invalid(node: HTMLElement, eventName: invalid, handler: TaggedEventHandler[invalid], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_invalid(
    node: HTMLElement,
    eventName: invalid,
    handler: TaggedEventHandler[invalid],
    options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_keydown(node: HTMLElement, eventName: keydown, handler: TaggedEventHandler[keydown]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_keydown(node: HTMLElement, eventName: keydown, handler: TaggedEventHandler[keydown], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_keydown(
    node: HTMLElement,
    eventName: keydown,
    handler: TaggedEventHandler[keydown],
    options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_keypress(node: HTMLElement, eventName: keypress, handler: TaggedEventHandler[keypress]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_keypress(node: HTMLElement, eventName: keypress, handler: TaggedEventHandler[keypress], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_keypress(
    node: HTMLElement,
    eventName: keypress,
    handler: TaggedEventHandler[keypress],
    options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_keyup(node: HTMLElement, eventName: keyup, handler: TaggedEventHandler[keyup]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_keyup(node: HTMLElement, eventName: keyup, handler: TaggedEventHandler[keyup], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_keyup(
    node: HTMLElement,
    eventName: keyup,
    handler: TaggedEventHandler[keyup],
    options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_load(node: HTMLElement, eventName: load, handler: TaggedEventHandler[load]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_load(node: HTMLElement, eventName: load, handler: TaggedEventHandler[load], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_load(
    node: HTMLElement,
    eventName: load,
    handler: TaggedEventHandler[load],
    options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_loadeddata(node: HTMLElement, eventName: loadeddata, handler: TaggedEventHandler[loadeddata]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_loadeddata(
    node: HTMLElement,
    eventName: loadeddata,
    handler: TaggedEventHandler[loadeddata],
    options: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_loadeddata(
    node: HTMLElement,
    eventName: loadeddata,
    handler: TaggedEventHandler[loadeddata],
    options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_loadedmetadata(node: HTMLElement, eventName: loadedmetadata, handler: TaggedEventHandler[loadedmetadata]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_loadedmetadata(
    node: HTMLElement,
    eventName: loadedmetadata,
    handler: TaggedEventHandler[loadedmetadata],
    options: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_loadedmetadata(
    node: HTMLElement,
    eventName: loadedmetadata,
    handler: TaggedEventHandler[loadedmetadata],
    options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_loadstart(node: HTMLElement, eventName: loadstart, handler: TaggedEventHandler[loadstart]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_loadstart(node: HTMLElement, eventName: loadstart, handler: TaggedEventHandler[loadstart], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_loadstart(
    node: HTMLElement,
    eventName: loadstart,
    handler: TaggedEventHandler[loadstart],
    options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_lostpointercapture(node: HTMLElement, eventName: lostpointercapture, handler: TaggedEventHandler[lostpointercapture]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_lostpointercapture(
    node: HTMLElement,
    eventName: lostpointercapture,
    handler: TaggedEventHandler[lostpointercapture],
    options: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_lostpointercapture(
    node: HTMLElement,
    eventName: lostpointercapture,
    handler: TaggedEventHandler[lostpointercapture],
    options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_mousedown(node: HTMLElement, eventName: mousedown, handler: TaggedEventHandler[mousedown]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_mousedown(node: HTMLElement, eventName: mousedown, handler: TaggedEventHandler[mousedown], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_mousedown(
    node: HTMLElement,
    eventName: mousedown,
    handler: TaggedEventHandler[mousedown],
    options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_mouseenter(node: HTMLElement, eventName: mouseenter, handler: TaggedEventHandler[mouseenter]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_mouseenter(
    node: HTMLElement,
    eventName: mouseenter,
    handler: TaggedEventHandler[mouseenter],
    options: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_mouseenter(
    node: HTMLElement,
    eventName: mouseenter,
    handler: TaggedEventHandler[mouseenter],
    options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_mouseleave(node: HTMLElement, eventName: mouseleave, handler: TaggedEventHandler[mouseleave]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_mouseleave(
    node: HTMLElement,
    eventName: mouseleave,
    handler: TaggedEventHandler[mouseleave],
    options: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_mouseleave(
    node: HTMLElement,
    eventName: mouseleave,
    handler: TaggedEventHandler[mouseleave],
    options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_mousemove(node: HTMLElement, eventName: mousemove, handler: TaggedEventHandler[mousemove]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_mousemove(node: HTMLElement, eventName: mousemove, handler: TaggedEventHandler[mousemove], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_mousemove(
    node: HTMLElement,
    eventName: mousemove,
    handler: TaggedEventHandler[mousemove],
    options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_mouseout(node: HTMLElement, eventName: mouseout, handler: TaggedEventHandler[mouseout]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_mouseout(node: HTMLElement, eventName: mouseout, handler: TaggedEventHandler[mouseout], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_mouseout(
    node: HTMLElement,
    eventName: mouseout,
    handler: TaggedEventHandler[mouseout],
    options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_mouseover(node: HTMLElement, eventName: mouseover, handler: TaggedEventHandler[mouseover]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_mouseover(node: HTMLElement, eventName: mouseover, handler: TaggedEventHandler[mouseover], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_mouseover(
    node: HTMLElement,
    eventName: mouseover,
    handler: TaggedEventHandler[mouseover],
    options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_mouseup(node: HTMLElement, eventName: mouseup, handler: TaggedEventHandler[mouseup]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_mouseup(node: HTMLElement, eventName: mouseup, handler: TaggedEventHandler[mouseup], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_mouseup(
    node: HTMLElement,
    eventName: mouseup,
    handler: TaggedEventHandler[mouseup],
    options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_paste(node: HTMLElement, eventName: paste, handler: TaggedEventHandler[paste]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_paste(node: HTMLElement, eventName: paste, handler: TaggedEventHandler[paste], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_paste(
    node: HTMLElement,
    eventName: paste,
    handler: TaggedEventHandler[paste],
    options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_pause(node: HTMLElement, eventName: pause, handler: TaggedEventHandler[pause]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_pause(node: HTMLElement, eventName: pause, handler: TaggedEventHandler[pause], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_pause(
    node: HTMLElement,
    eventName: pause,
    handler: TaggedEventHandler[pause],
    options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_play(node: HTMLElement, eventName: play, handler: TaggedEventHandler[play]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_play(node: HTMLElement, eventName: play, handler: TaggedEventHandler[play], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_play(
    node: HTMLElement,
    eventName: play,
    handler: TaggedEventHandler[play],
    options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_playing(node: HTMLElement, eventName: playing, handler: TaggedEventHandler[playing]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_playing(node: HTMLElement, eventName: playing, handler: TaggedEventHandler[playing], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_playing(
    node: HTMLElement,
    eventName: playing,
    handler: TaggedEventHandler[playing],
    options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_pointercancel(node: HTMLElement, eventName: pointercancel, handler: TaggedEventHandler[pointercancel]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_pointercancel(
    node: HTMLElement,
    eventName: pointercancel,
    handler: TaggedEventHandler[pointercancel],
    options: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_pointercancel(
    node: HTMLElement,
    eventName: pointercancel,
    handler: TaggedEventHandler[pointercancel],
    options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_pointerdown(node: HTMLElement, eventName: pointerdown, handler: TaggedEventHandler[pointerdown]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_pointerdown(
    node: HTMLElement,
    eventName: pointerdown,
    handler: TaggedEventHandler[pointerdown],
    options: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_pointerdown(
    node: HTMLElement,
    eventName: pointerdown,
    handler: TaggedEventHandler[pointerdown],
    options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_pointerenter(node: HTMLElement, eventName: pointerenter, handler: TaggedEventHandler[pointerenter]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_pointerenter(
    node: HTMLElement,
    eventName: pointerenter,
    handler: TaggedEventHandler[pointerenter],
    options: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_pointerenter(
    node: HTMLElement,
    eventName: pointerenter,
    handler: TaggedEventHandler[pointerenter],
    options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_pointerleave(node: HTMLElement, eventName: pointerleave, handler: TaggedEventHandler[pointerleave]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_pointerleave(
    node: HTMLElement,
    eventName: pointerleave,
    handler: TaggedEventHandler[pointerleave],
    options: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_pointerleave(
    node: HTMLElement,
    eventName: pointerleave,
    handler: TaggedEventHandler[pointerleave],
    options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_pointermove(node: HTMLElement, eventName: pointermove, handler: TaggedEventHandler[pointermove]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_pointermove(
    node: HTMLElement,
    eventName: pointermove,
    handler: TaggedEventHandler[pointermove],
    options: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_pointermove(
    node: HTMLElement,
    eventName: pointermove,
    handler: TaggedEventHandler[pointermove],
    options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_pointerout(node: HTMLElement, eventName: pointerout, handler: TaggedEventHandler[pointerout]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_pointerout(
    node: HTMLElement,
    eventName: pointerout,
    handler: TaggedEventHandler[pointerout],
    options: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_pointerout(
    node: HTMLElement,
    eventName: pointerout,
    handler: TaggedEventHandler[pointerout],
    options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_pointerover(node: HTMLElement, eventName: pointerover, handler: TaggedEventHandler[pointerover]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_pointerover(
    node: HTMLElement,
    eventName: pointerover,
    handler: TaggedEventHandler[pointerover],
    options: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_pointerover(
    node: HTMLElement,
    eventName: pointerover,
    handler: TaggedEventHandler[pointerover],
    options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_pointerup(node: HTMLElement, eventName: pointerup, handler: TaggedEventHandler[pointerup]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_pointerup(node: HTMLElement, eventName: pointerup, handler: TaggedEventHandler[pointerup], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_pointerup(
    node: HTMLElement,
    eventName: pointerup,
    handler: TaggedEventHandler[pointerup],
    options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_progress(node: HTMLElement, eventName: progress, handler: TaggedEventHandler[progress]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_progress(node: HTMLElement, eventName: progress, handler: TaggedEventHandler[progress], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_progress(
    node: HTMLElement,
    eventName: progress,
    handler: TaggedEventHandler[progress],
    options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_ratechange(node: HTMLElement, eventName: ratechange, handler: TaggedEventHandler[ratechange]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_ratechange(
    node: HTMLElement,
    eventName: ratechange,
    handler: TaggedEventHandler[ratechange],
    options: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_ratechange(
    node: HTMLElement,
    eventName: ratechange,
    handler: TaggedEventHandler[ratechange],
    options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_reset(node: HTMLElement, eventName: reset, handler: TaggedEventHandler[reset]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_reset(node: HTMLElement, eventName: reset, handler: TaggedEventHandler[reset], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_reset(
    node: HTMLElement,
    eventName: reset,
    handler: TaggedEventHandler[reset],
    options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_resize(node: HTMLElement, eventName: resize, handler: TaggedEventHandler[resize]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_resize(node: HTMLElement, eventName: resize, handler: TaggedEventHandler[resize], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_resize(
    node: HTMLElement,
    eventName: resize,
    handler: TaggedEventHandler[resize],
    options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_scroll(node: HTMLElement, eventName: scroll, handler: TaggedEventHandler[scroll]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_scroll(node: HTMLElement, eventName: scroll, handler: TaggedEventHandler[scroll], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_scroll(
    node: HTMLElement,
    eventName: scroll,
    handler: TaggedEventHandler[scroll],
    options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_securitypolicyviolation(
    node: HTMLElement,
    eventName: securitypolicyviolation,
    handler: TaggedEventHandler[securitypolicyviolation]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_securitypolicyviolation(
    node: HTMLElement,
    eventName: securitypolicyviolation,
    handler: TaggedEventHandler[securitypolicyviolation],
    options: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_securitypolicyviolation(
    node: HTMLElement,
    eventName: securitypolicyviolation,
    handler: TaggedEventHandler[securitypolicyviolation],
    options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_seeked(node: HTMLElement, eventName: seeked, handler: TaggedEventHandler[seeked]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_seeked(node: HTMLElement, eventName: seeked, handler: TaggedEventHandler[seeked], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_seeked(
    node: HTMLElement,
    eventName: seeked,
    handler: TaggedEventHandler[seeked],
    options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_seeking(node: HTMLElement, eventName: seeking, handler: TaggedEventHandler[seeking]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_seeking(node: HTMLElement, eventName: seeking, handler: TaggedEventHandler[seeking], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_seeking(
    node: HTMLElement,
    eventName: seeking,
    handler: TaggedEventHandler[seeking],
    options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_select(node: HTMLElement, eventName: select, handler: TaggedEventHandler[select]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_select(node: HTMLElement, eventName: select, handler: TaggedEventHandler[select], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_select(
    node: HTMLElement,
    eventName: select,
    handler: TaggedEventHandler[select],
    options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_selectionchange(node: HTMLElement, eventName: selectionchange, handler: TaggedEventHandler[selectionchange]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_selectionchange(
    node: HTMLElement,
    eventName: selectionchange,
    handler: TaggedEventHandler[selectionchange],
    options: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_selectionchange(
    node: HTMLElement,
    eventName: selectionchange,
    handler: TaggedEventHandler[selectionchange],
    options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_selectstart(node: HTMLElement, eventName: selectstart, handler: TaggedEventHandler[selectstart]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_selectstart(
    node: HTMLElement,
    eventName: selectstart,
    handler: TaggedEventHandler[selectstart],
    options: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_selectstart(
    node: HTMLElement,
    eventName: selectstart,
    handler: TaggedEventHandler[selectstart],
    options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_slotchange(node: HTMLElement, eventName: slotchange, handler: TaggedEventHandler[slotchange]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_slotchange(
    node: HTMLElement,
    eventName: slotchange,
    handler: TaggedEventHandler[slotchange],
    options: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_slotchange(
    node: HTMLElement,
    eventName: slotchange,
    handler: TaggedEventHandler[slotchange],
    options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_stalled(node: HTMLElement, eventName: stalled, handler: TaggedEventHandler[stalled]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_stalled(node: HTMLElement, eventName: stalled, handler: TaggedEventHandler[stalled], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_stalled(
    node: HTMLElement,
    eventName: stalled,
    handler: TaggedEventHandler[stalled],
    options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_submit(node: HTMLElement, eventName: submit, handler: TaggedEventHandler[submit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_submit(node: HTMLElement, eventName: submit, handler: TaggedEventHandler[submit], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_submit(
    node: HTMLElement,
    eventName: submit,
    handler: TaggedEventHandler[submit],
    options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_suspend(node: HTMLElement, eventName: suspend, handler: TaggedEventHandler[suspend]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_suspend(node: HTMLElement, eventName: suspend, handler: TaggedEventHandler[suspend], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_suspend(
    node: HTMLElement,
    eventName: suspend,
    handler: TaggedEventHandler[suspend],
    options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_timeupdate(node: HTMLElement, eventName: timeupdate, handler: TaggedEventHandler[timeupdate]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_timeupdate(
    node: HTMLElement,
    eventName: timeupdate,
    handler: TaggedEventHandler[timeupdate],
    options: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_timeupdate(
    node: HTMLElement,
    eventName: timeupdate,
    handler: TaggedEventHandler[timeupdate],
    options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_toggle(node: HTMLElement, eventName: toggle, handler: TaggedEventHandler[toggle]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_toggle(node: HTMLElement, eventName: toggle, handler: TaggedEventHandler[toggle], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_toggle(
    node: HTMLElement,
    eventName: toggle,
    handler: TaggedEventHandler[toggle],
    options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_touchcancel(node: HTMLElement, eventName: touchcancel, handler: TaggedEventHandler[touchcancel]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_touchcancel(
    node: HTMLElement,
    eventName: touchcancel,
    handler: TaggedEventHandler[touchcancel],
    options: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_touchcancel(
    node: HTMLElement,
    eventName: touchcancel,
    handler: TaggedEventHandler[touchcancel],
    options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_touchend(node: HTMLElement, eventName: touchend, handler: TaggedEventHandler[touchend]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_touchend(node: HTMLElement, eventName: touchend, handler: TaggedEventHandler[touchend], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_touchend(
    node: HTMLElement,
    eventName: touchend,
    handler: TaggedEventHandler[touchend],
    options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_touchmove(node: HTMLElement, eventName: touchmove, handler: TaggedEventHandler[touchmove]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_touchmove(node: HTMLElement, eventName: touchmove, handler: TaggedEventHandler[touchmove], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_touchmove(
    node: HTMLElement,
    eventName: touchmove,
    handler: TaggedEventHandler[touchmove],
    options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_touchstart(node: HTMLElement, eventName: touchstart, handler: TaggedEventHandler[touchstart]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_touchstart(
    node: HTMLElement,
    eventName: touchstart,
    handler: TaggedEventHandler[touchstart],
    options: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_touchstart(
    node: HTMLElement,
    eventName: touchstart,
    handler: TaggedEventHandler[touchstart],
    options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_transitioncancel(node: HTMLElement, eventName: transitioncancel, handler: TaggedEventHandler[transitioncancel]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_transitioncancel(
    node: HTMLElement,
    eventName: transitioncancel,
    handler: TaggedEventHandler[transitioncancel],
    options: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_transitioncancel(
    node: HTMLElement,
    eventName: transitioncancel,
    handler: TaggedEventHandler[transitioncancel],
    options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_transitionend(node: HTMLElement, eventName: transitionend, handler: TaggedEventHandler[transitionend]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_transitionend(
    node: HTMLElement,
    eventName: transitionend,
    handler: TaggedEventHandler[transitionend],
    options: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_transitionend(
    node: HTMLElement,
    eventName: transitionend,
    handler: TaggedEventHandler[transitionend],
    options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_transitionrun(node: HTMLElement, eventName: transitionrun, handler: TaggedEventHandler[transitionrun]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_transitionrun(
    node: HTMLElement,
    eventName: transitionrun,
    handler: TaggedEventHandler[transitionrun],
    options: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_transitionrun(
    node: HTMLElement,
    eventName: transitionrun,
    handler: TaggedEventHandler[transitionrun],
    options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_transitionstart(node: HTMLElement, eventName: transitionstart, handler: TaggedEventHandler[transitionstart]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_transitionstart(
    node: HTMLElement,
    eventName: transitionstart,
    handler: TaggedEventHandler[transitionstart],
    options: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_transitionstart(
    node: HTMLElement,
    eventName: transitionstart,
    handler: TaggedEventHandler[transitionstart],
    options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_volumechange(node: HTMLElement, eventName: volumechange, handler: TaggedEventHandler[volumechange]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_volumechange(
    node: HTMLElement,
    eventName: volumechange,
    handler: TaggedEventHandler[volumechange],
    options: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_volumechange(
    node: HTMLElement,
    eventName: volumechange,
    handler: TaggedEventHandler[volumechange],
    options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_waiting(node: HTMLElement, eventName: waiting, handler: TaggedEventHandler[waiting]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_waiting(node: HTMLElement, eventName: waiting, handler: TaggedEventHandler[waiting], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_waiting(
    node: HTMLElement,
    eventName: waiting,
    handler: TaggedEventHandler[waiting],
    options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_webkitanimationend(node: HTMLElement, eventName: webkitanimationend, handler: TaggedEventHandler[webkitanimationend]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_webkitanimationend(
    node: HTMLElement,
    eventName: webkitanimationend,
    handler: TaggedEventHandler[webkitanimationend],
    options: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_webkitanimationend(
    node: HTMLElement,
    eventName: webkitanimationend,
    handler: TaggedEventHandler[webkitanimationend],
    options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_webkitanimationiteration(
    node: HTMLElement,
    eventName: webkitanimationiteration,
    handler: TaggedEventHandler[webkitanimationiteration]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_webkitanimationiteration(
    node: HTMLElement,
    eventName: webkitanimationiteration,
    handler: TaggedEventHandler[webkitanimationiteration],
    options: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_webkitanimationiteration(
    node: HTMLElement,
    eventName: webkitanimationiteration,
    handler: TaggedEventHandler[webkitanimationiteration],
    options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_webkitanimationstart(
    node: HTMLElement,
    eventName: webkitanimationstart,
    handler: TaggedEventHandler[webkitanimationstart]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_webkitanimationstart(
    node: HTMLElement,
    eventName: webkitanimationstart,
    handler: TaggedEventHandler[webkitanimationstart],
    options: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_webkitanimationstart(
    node: HTMLElement,
    eventName: webkitanimationstart,
    handler: TaggedEventHandler[webkitanimationstart],
    options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_webkittransitionend(
    node: HTMLElement,
    eventName: webkittransitionend,
    handler: TaggedEventHandler[webkittransitionend]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_webkittransitionend(
    node: HTMLElement,
    eventName: webkittransitionend,
    handler: TaggedEventHandler[webkittransitionend],
    options: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_webkittransitionend(
    node: HTMLElement,
    eventName: webkittransitionend,
    handler: TaggedEventHandler[webkittransitionend],
    options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_wheel(node: HTMLElement, eventName: wheel, handler: TaggedEventHandler[wheel]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_wheel(node: HTMLElement, eventName: wheel, handler: TaggedEventHandler[wheel], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_wheel(
    node: HTMLElement,
    eventName: wheel,
    handler: TaggedEventHandler[wheel],
    options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("dom-helpers/cjs/addEventListener", "onceSupported")
  @js.native
  def onceSupported: Boolean = js.native
  inline def onceSupported_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onceSupported")(x.asInstanceOf[js.Any])
  
  @JSImport("dom-helpers/cjs/addEventListener", "optionsSupported")
  @js.native
  def optionsSupported: Boolean = js.native
  inline def optionsSupported_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("optionsSupported")(x.asInstanceOf[js.Any])
  
  type EventHandler[K /* <: /* keyof std.HTMLElementEventMap */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 100, starting with typings.domHelpers.domHelpersStrings.fullscreenchange, typings.domHelpers.domHelpersStrings.fullscreenerror, typings.domHelpers.domHelpersStrings.copy */ Any */] = js.ThisFunction1[
    /* this */ HTMLElement, 
    /* import warning: importer.ImportType#apply Failed type conversion: std.HTMLElementEventMap[K] */ /* event */ js.Any, 
    Any
  ]
  
  @js.native
  trait TaggedEventHandler[K /* <: /* keyof std.HTMLElementEventMap */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 100, starting with typings.domHelpers.domHelpersStrings.fullscreenchange, typings.domHelpers.domHelpersStrings.fullscreenerror, typings.domHelpers.domHelpersStrings.copy */ Any */] extends EventHandler[K] {
    
    var __once: js.UndefOr[EventHandler[K]] = js.native
  }
}
