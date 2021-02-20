package typings.domHelpers

import typings.domHelpers.addEventListenerMod.EventHandler
import typings.domHelpers.addEventListenerMod.TaggedEventHandler
import typings.domHelpers.animateMod.AnimateProperties
import typings.domHelpers.animateMod.Cancel
import typings.domHelpers.animateMod.Options
import typings.domHelpers.anon.Fn0
import typings.domHelpers.anon.Fn1
import typings.domHelpers.anon.FnCallNodeEventNameHandlerOptions
import typings.domHelpers.anon.FnCallNodePropertiesDurationEasingCallback
import typings.domHelpers.anon.FnCallNodeProperty
import typings.domHelpers.anon.FnCallSelectorHandler
import typings.domHelpers.anon.Height
import typings.domHelpers.anon.PartialRecordPropertystri
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
import typings.domHelpers.transitionEndMod.Listener
import typings.domHelpers.typesMod.CamelProperty
import typings.domHelpers.typesMod.HyphenProperty
import typings.std.AddEventListenerOptions
import typings.std.CSSStyleDeclaration
import typings.std.Document
import typings.std.Element
import typings.std.EventListenerOptions
import typings.std.FrameRequestCallback
import typings.std.HTMLElement
import typings.std.SVGElement
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default {
    
    @JSImport("dom-helpers", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("dom-helpers", "default.activeElement")
    @js.native
    def activeElement(): Element | Null = js.native
    @JSImport("dom-helpers", "default.activeElement")
    @js.native
    def activeElement(doc: Document): Element | Null = js.native
    @JSImport("dom-helpers", "default.activeElement")
    @js.native
    def activeElement_Fdefault: js.Function1[/* doc */ js.UndefOr[Document], Element | Null] = js.native
    
    @scala.inline
    def activeElement_Fdefault_=(x: js.Function1[/* doc */ js.UndefOr[Document], Element | Null]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("activeElement")(x.asInstanceOf[js.Any])
    
    @JSImport("dom-helpers", "default.addClass")
    @js.native
    def addClass: js.Function2[/* element */ Element | SVGElement, /* className */ String, Unit] = js.native
    @JSImport("dom-helpers", "default.addClass")
    @js.native
    def addClass(element: Element, className: String): Unit = js.native
    @JSImport("dom-helpers", "default.addClass")
    @js.native
    def addClass(element: SVGElement, className: String): Unit = js.native
    @scala.inline
    def addClass_=(x: js.Function2[/* element */ Element | SVGElement, /* className */ String, Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("addClass")(x.asInstanceOf[js.Any])
    
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener: FnCallNodeEventNameHandlerOptions = js.native
    @scala.inline
    def addEventListener_=(x: FnCallNodeEventNameHandlerOptions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("addEventListener")(x.asInstanceOf[js.Any])
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_abort(node: HTMLElement, eventName: abort, handler: TaggedEventHandler[abort]): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_abort(node: HTMLElement, eventName: abort, handler: TaggedEventHandler[abort], options: Boolean): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_abort(
      node: HTMLElement,
      eventName: abort,
      handler: TaggedEventHandler[abort],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_animationcancel(node: HTMLElement, eventName: animationcancel, handler: TaggedEventHandler[animationcancel]): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_animationcancel(
      node: HTMLElement,
      eventName: animationcancel,
      handler: TaggedEventHandler[animationcancel],
      options: Boolean
    ): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_animationcancel(
      node: HTMLElement,
      eventName: animationcancel,
      handler: TaggedEventHandler[animationcancel],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_animationend(node: HTMLElement, eventName: animationend, handler: TaggedEventHandler[animationend]): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_animationend(
      node: HTMLElement,
      eventName: animationend,
      handler: TaggedEventHandler[animationend],
      options: Boolean
    ): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_animationend(
      node: HTMLElement,
      eventName: animationend,
      handler: TaggedEventHandler[animationend],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_animationiteration(node: HTMLElement, eventName: animationiteration, handler: TaggedEventHandler[animationiteration]): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_animationiteration(
      node: HTMLElement,
      eventName: animationiteration,
      handler: TaggedEventHandler[animationiteration],
      options: Boolean
    ): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_animationiteration(
      node: HTMLElement,
      eventName: animationiteration,
      handler: TaggedEventHandler[animationiteration],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_animationstart(node: HTMLElement, eventName: animationstart, handler: TaggedEventHandler[animationstart]): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_animationstart(
      node: HTMLElement,
      eventName: animationstart,
      handler: TaggedEventHandler[animationstart],
      options: Boolean
    ): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_animationstart(
      node: HTMLElement,
      eventName: animationstart,
      handler: TaggedEventHandler[animationstart],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_auxclick(node: HTMLElement, eventName: auxclick, handler: TaggedEventHandler[auxclick]): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_auxclick(node: HTMLElement, eventName: auxclick, handler: TaggedEventHandler[auxclick], options: Boolean): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_auxclick(
      node: HTMLElement,
      eventName: auxclick,
      handler: TaggedEventHandler[auxclick],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_blur(node: HTMLElement, eventName: blur, handler: TaggedEventHandler[blur]): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_blur(node: HTMLElement, eventName: blur, handler: TaggedEventHandler[blur], options: Boolean): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_blur(
      node: HTMLElement,
      eventName: blur,
      handler: TaggedEventHandler[blur],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_cancel(node: HTMLElement, eventName: cancel, handler: TaggedEventHandler[cancel]): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_cancel(node: HTMLElement, eventName: cancel, handler: TaggedEventHandler[cancel], options: Boolean): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_cancel(
      node: HTMLElement,
      eventName: cancel,
      handler: TaggedEventHandler[cancel],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_canplay(node: HTMLElement, eventName: canplay, handler: TaggedEventHandler[canplay]): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_canplay(node: HTMLElement, eventName: canplay, handler: TaggedEventHandler[canplay], options: Boolean): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_canplay(
      node: HTMLElement,
      eventName: canplay,
      handler: TaggedEventHandler[canplay],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_canplaythrough(node: HTMLElement, eventName: canplaythrough, handler: TaggedEventHandler[canplaythrough]): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_canplaythrough(
      node: HTMLElement,
      eventName: canplaythrough,
      handler: TaggedEventHandler[canplaythrough],
      options: Boolean
    ): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_canplaythrough(
      node: HTMLElement,
      eventName: canplaythrough,
      handler: TaggedEventHandler[canplaythrough],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_change(node: HTMLElement, eventName: change, handler: TaggedEventHandler[change]): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_change(node: HTMLElement, eventName: change, handler: TaggedEventHandler[change], options: Boolean): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_change(
      node: HTMLElement,
      eventName: change,
      handler: TaggedEventHandler[change],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_click(node: HTMLElement, eventName: click, handler: TaggedEventHandler[click]): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_click(node: HTMLElement, eventName: click, handler: TaggedEventHandler[click], options: Boolean): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_click(
      node: HTMLElement,
      eventName: click,
      handler: TaggedEventHandler[click],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_close(node: HTMLElement, eventName: close, handler: TaggedEventHandler[close]): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_close(node: HTMLElement, eventName: close, handler: TaggedEventHandler[close], options: Boolean): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_close(
      node: HTMLElement,
      eventName: close,
      handler: TaggedEventHandler[close],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_contextmenu(node: HTMLElement, eventName: contextmenu, handler: TaggedEventHandler[contextmenu]): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_contextmenu(
      node: HTMLElement,
      eventName: contextmenu,
      handler: TaggedEventHandler[contextmenu],
      options: Boolean
    ): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_contextmenu(
      node: HTMLElement,
      eventName: contextmenu,
      handler: TaggedEventHandler[contextmenu],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_copy(node: HTMLElement, eventName: copy, handler: TaggedEventHandler[copy]): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_copy(node: HTMLElement, eventName: copy, handler: TaggedEventHandler[copy], options: Boolean): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_copy(
      node: HTMLElement,
      eventName: copy,
      handler: TaggedEventHandler[copy],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_cuechange(node: HTMLElement, eventName: cuechange, handler: TaggedEventHandler[cuechange]): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_cuechange(node: HTMLElement, eventName: cuechange, handler: TaggedEventHandler[cuechange], options: Boolean): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_cuechange(
      node: HTMLElement,
      eventName: cuechange,
      handler: TaggedEventHandler[cuechange],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_cut(node: HTMLElement, eventName: cut, handler: TaggedEventHandler[cut]): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_cut(node: HTMLElement, eventName: cut, handler: TaggedEventHandler[cut], options: Boolean): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_cut(
      node: HTMLElement,
      eventName: cut,
      handler: TaggedEventHandler[cut],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_dblclick(node: HTMLElement, eventName: dblclick, handler: TaggedEventHandler[dblclick]): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_dblclick(node: HTMLElement, eventName: dblclick, handler: TaggedEventHandler[dblclick], options: Boolean): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_dblclick(
      node: HTMLElement,
      eventName: dblclick,
      handler: TaggedEventHandler[dblclick],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_drag(node: HTMLElement, eventName: drag, handler: TaggedEventHandler[drag]): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_drag(node: HTMLElement, eventName: drag, handler: TaggedEventHandler[drag], options: Boolean): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_drag(
      node: HTMLElement,
      eventName: drag,
      handler: TaggedEventHandler[drag],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_dragend(node: HTMLElement, eventName: dragend, handler: TaggedEventHandler[dragend]): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_dragend(node: HTMLElement, eventName: dragend, handler: TaggedEventHandler[dragend], options: Boolean): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_dragend(
      node: HTMLElement,
      eventName: dragend,
      handler: TaggedEventHandler[dragend],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_dragenter(node: HTMLElement, eventName: dragenter, handler: TaggedEventHandler[dragenter]): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_dragenter(node: HTMLElement, eventName: dragenter, handler: TaggedEventHandler[dragenter], options: Boolean): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_dragenter(
      node: HTMLElement,
      eventName: dragenter,
      handler: TaggedEventHandler[dragenter],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_dragexit(node: HTMLElement, eventName: dragexit, handler: TaggedEventHandler[dragexit]): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_dragexit(node: HTMLElement, eventName: dragexit, handler: TaggedEventHandler[dragexit], options: Boolean): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_dragexit(
      node: HTMLElement,
      eventName: dragexit,
      handler: TaggedEventHandler[dragexit],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_dragleave(node: HTMLElement, eventName: dragleave, handler: TaggedEventHandler[dragleave]): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_dragleave(node: HTMLElement, eventName: dragleave, handler: TaggedEventHandler[dragleave], options: Boolean): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_dragleave(
      node: HTMLElement,
      eventName: dragleave,
      handler: TaggedEventHandler[dragleave],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_dragover(node: HTMLElement, eventName: dragover, handler: TaggedEventHandler[dragover]): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_dragover(node: HTMLElement, eventName: dragover, handler: TaggedEventHandler[dragover], options: Boolean): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_dragover(
      node: HTMLElement,
      eventName: dragover,
      handler: TaggedEventHandler[dragover],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_dragstart(node: HTMLElement, eventName: dragstart, handler: TaggedEventHandler[dragstart]): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_dragstart(node: HTMLElement, eventName: dragstart, handler: TaggedEventHandler[dragstart], options: Boolean): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_dragstart(
      node: HTMLElement,
      eventName: dragstart,
      handler: TaggedEventHandler[dragstart],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_drop(node: HTMLElement, eventName: drop, handler: TaggedEventHandler[drop]): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_drop(node: HTMLElement, eventName: drop, handler: TaggedEventHandler[drop], options: Boolean): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_drop(
      node: HTMLElement,
      eventName: drop,
      handler: TaggedEventHandler[drop],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_durationchange(node: HTMLElement, eventName: durationchange, handler: TaggedEventHandler[durationchange]): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_durationchange(
      node: HTMLElement,
      eventName: durationchange,
      handler: TaggedEventHandler[durationchange],
      options: Boolean
    ): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_durationchange(
      node: HTMLElement,
      eventName: durationchange,
      handler: TaggedEventHandler[durationchange],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_emptied(node: HTMLElement, eventName: emptied, handler: TaggedEventHandler[emptied]): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_emptied(node: HTMLElement, eventName: emptied, handler: TaggedEventHandler[emptied], options: Boolean): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_emptied(
      node: HTMLElement,
      eventName: emptied,
      handler: TaggedEventHandler[emptied],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_ended(node: HTMLElement, eventName: ended, handler: TaggedEventHandler[ended]): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_ended(node: HTMLElement, eventName: ended, handler: TaggedEventHandler[ended], options: Boolean): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_ended(
      node: HTMLElement,
      eventName: ended,
      handler: TaggedEventHandler[ended],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_error(node: HTMLElement, eventName: error, handler: TaggedEventHandler[error]): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_error(node: HTMLElement, eventName: error, handler: TaggedEventHandler[error], options: Boolean): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_error(
      node: HTMLElement,
      eventName: error,
      handler: TaggedEventHandler[error],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_focus(node: HTMLElement, eventName: focus, handler: TaggedEventHandler[focus]): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_focus(node: HTMLElement, eventName: focus, handler: TaggedEventHandler[focus], options: Boolean): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_focus(
      node: HTMLElement,
      eventName: focus,
      handler: TaggedEventHandler[focus],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_focusin(node: HTMLElement, eventName: focusin, handler: TaggedEventHandler[focusin]): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_focusin(node: HTMLElement, eventName: focusin, handler: TaggedEventHandler[focusin], options: Boolean): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_focusin(
      node: HTMLElement,
      eventName: focusin,
      handler: TaggedEventHandler[focusin],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_focusout(node: HTMLElement, eventName: focusout, handler: TaggedEventHandler[focusout]): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_focusout(node: HTMLElement, eventName: focusout, handler: TaggedEventHandler[focusout], options: Boolean): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_focusout(
      node: HTMLElement,
      eventName: focusout,
      handler: TaggedEventHandler[focusout],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_fullscreenchange(node: HTMLElement, eventName: fullscreenchange, handler: TaggedEventHandler[fullscreenchange]): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_fullscreenchange(
      node: HTMLElement,
      eventName: fullscreenchange,
      handler: TaggedEventHandler[fullscreenchange],
      options: Boolean
    ): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_fullscreenchange(
      node: HTMLElement,
      eventName: fullscreenchange,
      handler: TaggedEventHandler[fullscreenchange],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_fullscreenerror(node: HTMLElement, eventName: fullscreenerror, handler: TaggedEventHandler[fullscreenerror]): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_fullscreenerror(
      node: HTMLElement,
      eventName: fullscreenerror,
      handler: TaggedEventHandler[fullscreenerror],
      options: Boolean
    ): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_fullscreenerror(
      node: HTMLElement,
      eventName: fullscreenerror,
      handler: TaggedEventHandler[fullscreenerror],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_gotpointercapture(node: HTMLElement, eventName: gotpointercapture, handler: TaggedEventHandler[gotpointercapture]): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_gotpointercapture(
      node: HTMLElement,
      eventName: gotpointercapture,
      handler: TaggedEventHandler[gotpointercapture],
      options: Boolean
    ): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_gotpointercapture(
      node: HTMLElement,
      eventName: gotpointercapture,
      handler: TaggedEventHandler[gotpointercapture],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_input(node: HTMLElement, eventName: input, handler: TaggedEventHandler[input]): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_input(node: HTMLElement, eventName: input, handler: TaggedEventHandler[input], options: Boolean): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_input(
      node: HTMLElement,
      eventName: input,
      handler: TaggedEventHandler[input],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_invalid(node: HTMLElement, eventName: invalid, handler: TaggedEventHandler[invalid]): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_invalid(node: HTMLElement, eventName: invalid, handler: TaggedEventHandler[invalid], options: Boolean): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_invalid(
      node: HTMLElement,
      eventName: invalid,
      handler: TaggedEventHandler[invalid],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_keydown(node: HTMLElement, eventName: keydown, handler: TaggedEventHandler[keydown]): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_keydown(node: HTMLElement, eventName: keydown, handler: TaggedEventHandler[keydown], options: Boolean): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_keydown(
      node: HTMLElement,
      eventName: keydown,
      handler: TaggedEventHandler[keydown],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_keypress(node: HTMLElement, eventName: keypress, handler: TaggedEventHandler[keypress]): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_keypress(node: HTMLElement, eventName: keypress, handler: TaggedEventHandler[keypress], options: Boolean): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_keypress(
      node: HTMLElement,
      eventName: keypress,
      handler: TaggedEventHandler[keypress],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_keyup(node: HTMLElement, eventName: keyup, handler: TaggedEventHandler[keyup]): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_keyup(node: HTMLElement, eventName: keyup, handler: TaggedEventHandler[keyup], options: Boolean): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_keyup(
      node: HTMLElement,
      eventName: keyup,
      handler: TaggedEventHandler[keyup],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_load(node: HTMLElement, eventName: load, handler: TaggedEventHandler[load]): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_load(node: HTMLElement, eventName: load, handler: TaggedEventHandler[load], options: Boolean): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_load(
      node: HTMLElement,
      eventName: load,
      handler: TaggedEventHandler[load],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_loadeddata(node: HTMLElement, eventName: loadeddata, handler: TaggedEventHandler[loadeddata]): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_loadeddata(
      node: HTMLElement,
      eventName: loadeddata,
      handler: TaggedEventHandler[loadeddata],
      options: Boolean
    ): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_loadeddata(
      node: HTMLElement,
      eventName: loadeddata,
      handler: TaggedEventHandler[loadeddata],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_loadedmetadata(node: HTMLElement, eventName: loadedmetadata, handler: TaggedEventHandler[loadedmetadata]): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_loadedmetadata(
      node: HTMLElement,
      eventName: loadedmetadata,
      handler: TaggedEventHandler[loadedmetadata],
      options: Boolean
    ): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_loadedmetadata(
      node: HTMLElement,
      eventName: loadedmetadata,
      handler: TaggedEventHandler[loadedmetadata],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_loadstart(node: HTMLElement, eventName: loadstart, handler: TaggedEventHandler[loadstart]): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_loadstart(node: HTMLElement, eventName: loadstart, handler: TaggedEventHandler[loadstart], options: Boolean): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_loadstart(
      node: HTMLElement,
      eventName: loadstart,
      handler: TaggedEventHandler[loadstart],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_lostpointercapture(node: HTMLElement, eventName: lostpointercapture, handler: TaggedEventHandler[lostpointercapture]): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_lostpointercapture(
      node: HTMLElement,
      eventName: lostpointercapture,
      handler: TaggedEventHandler[lostpointercapture],
      options: Boolean
    ): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_lostpointercapture(
      node: HTMLElement,
      eventName: lostpointercapture,
      handler: TaggedEventHandler[lostpointercapture],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_mousedown(node: HTMLElement, eventName: mousedown, handler: TaggedEventHandler[mousedown]): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_mousedown(node: HTMLElement, eventName: mousedown, handler: TaggedEventHandler[mousedown], options: Boolean): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_mousedown(
      node: HTMLElement,
      eventName: mousedown,
      handler: TaggedEventHandler[mousedown],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_mouseenter(node: HTMLElement, eventName: mouseenter, handler: TaggedEventHandler[mouseenter]): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_mouseenter(
      node: HTMLElement,
      eventName: mouseenter,
      handler: TaggedEventHandler[mouseenter],
      options: Boolean
    ): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_mouseenter(
      node: HTMLElement,
      eventName: mouseenter,
      handler: TaggedEventHandler[mouseenter],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_mouseleave(node: HTMLElement, eventName: mouseleave, handler: TaggedEventHandler[mouseleave]): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_mouseleave(
      node: HTMLElement,
      eventName: mouseleave,
      handler: TaggedEventHandler[mouseleave],
      options: Boolean
    ): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_mouseleave(
      node: HTMLElement,
      eventName: mouseleave,
      handler: TaggedEventHandler[mouseleave],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_mousemove(node: HTMLElement, eventName: mousemove, handler: TaggedEventHandler[mousemove]): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_mousemove(node: HTMLElement, eventName: mousemove, handler: TaggedEventHandler[mousemove], options: Boolean): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_mousemove(
      node: HTMLElement,
      eventName: mousemove,
      handler: TaggedEventHandler[mousemove],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_mouseout(node: HTMLElement, eventName: mouseout, handler: TaggedEventHandler[mouseout]): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_mouseout(node: HTMLElement, eventName: mouseout, handler: TaggedEventHandler[mouseout], options: Boolean): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_mouseout(
      node: HTMLElement,
      eventName: mouseout,
      handler: TaggedEventHandler[mouseout],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_mouseover(node: HTMLElement, eventName: mouseover, handler: TaggedEventHandler[mouseover]): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_mouseover(node: HTMLElement, eventName: mouseover, handler: TaggedEventHandler[mouseover], options: Boolean): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_mouseover(
      node: HTMLElement,
      eventName: mouseover,
      handler: TaggedEventHandler[mouseover],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_mouseup(node: HTMLElement, eventName: mouseup, handler: TaggedEventHandler[mouseup]): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_mouseup(node: HTMLElement, eventName: mouseup, handler: TaggedEventHandler[mouseup], options: Boolean): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_mouseup(
      node: HTMLElement,
      eventName: mouseup,
      handler: TaggedEventHandler[mouseup],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_paste(node: HTMLElement, eventName: paste, handler: TaggedEventHandler[paste]): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_paste(node: HTMLElement, eventName: paste, handler: TaggedEventHandler[paste], options: Boolean): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_paste(
      node: HTMLElement,
      eventName: paste,
      handler: TaggedEventHandler[paste],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_pause(node: HTMLElement, eventName: pause, handler: TaggedEventHandler[pause]): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_pause(node: HTMLElement, eventName: pause, handler: TaggedEventHandler[pause], options: Boolean): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_pause(
      node: HTMLElement,
      eventName: pause,
      handler: TaggedEventHandler[pause],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_play(node: HTMLElement, eventName: play, handler: TaggedEventHandler[play]): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_play(node: HTMLElement, eventName: play, handler: TaggedEventHandler[play], options: Boolean): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_play(
      node: HTMLElement,
      eventName: play,
      handler: TaggedEventHandler[play],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_playing(node: HTMLElement, eventName: playing, handler: TaggedEventHandler[playing]): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_playing(node: HTMLElement, eventName: playing, handler: TaggedEventHandler[playing], options: Boolean): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_playing(
      node: HTMLElement,
      eventName: playing,
      handler: TaggedEventHandler[playing],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_pointercancel(node: HTMLElement, eventName: pointercancel, handler: TaggedEventHandler[pointercancel]): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_pointercancel(
      node: HTMLElement,
      eventName: pointercancel,
      handler: TaggedEventHandler[pointercancel],
      options: Boolean
    ): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_pointercancel(
      node: HTMLElement,
      eventName: pointercancel,
      handler: TaggedEventHandler[pointercancel],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_pointerdown(node: HTMLElement, eventName: pointerdown, handler: TaggedEventHandler[pointerdown]): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_pointerdown(
      node: HTMLElement,
      eventName: pointerdown,
      handler: TaggedEventHandler[pointerdown],
      options: Boolean
    ): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_pointerdown(
      node: HTMLElement,
      eventName: pointerdown,
      handler: TaggedEventHandler[pointerdown],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_pointerenter(node: HTMLElement, eventName: pointerenter, handler: TaggedEventHandler[pointerenter]): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_pointerenter(
      node: HTMLElement,
      eventName: pointerenter,
      handler: TaggedEventHandler[pointerenter],
      options: Boolean
    ): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_pointerenter(
      node: HTMLElement,
      eventName: pointerenter,
      handler: TaggedEventHandler[pointerenter],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_pointerleave(node: HTMLElement, eventName: pointerleave, handler: TaggedEventHandler[pointerleave]): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_pointerleave(
      node: HTMLElement,
      eventName: pointerleave,
      handler: TaggedEventHandler[pointerleave],
      options: Boolean
    ): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_pointerleave(
      node: HTMLElement,
      eventName: pointerleave,
      handler: TaggedEventHandler[pointerleave],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_pointermove(node: HTMLElement, eventName: pointermove, handler: TaggedEventHandler[pointermove]): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_pointermove(
      node: HTMLElement,
      eventName: pointermove,
      handler: TaggedEventHandler[pointermove],
      options: Boolean
    ): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_pointermove(
      node: HTMLElement,
      eventName: pointermove,
      handler: TaggedEventHandler[pointermove],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_pointerout(node: HTMLElement, eventName: pointerout, handler: TaggedEventHandler[pointerout]): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_pointerout(
      node: HTMLElement,
      eventName: pointerout,
      handler: TaggedEventHandler[pointerout],
      options: Boolean
    ): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_pointerout(
      node: HTMLElement,
      eventName: pointerout,
      handler: TaggedEventHandler[pointerout],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_pointerover(node: HTMLElement, eventName: pointerover, handler: TaggedEventHandler[pointerover]): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_pointerover(
      node: HTMLElement,
      eventName: pointerover,
      handler: TaggedEventHandler[pointerover],
      options: Boolean
    ): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_pointerover(
      node: HTMLElement,
      eventName: pointerover,
      handler: TaggedEventHandler[pointerover],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_pointerup(node: HTMLElement, eventName: pointerup, handler: TaggedEventHandler[pointerup]): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_pointerup(node: HTMLElement, eventName: pointerup, handler: TaggedEventHandler[pointerup], options: Boolean): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_pointerup(
      node: HTMLElement,
      eventName: pointerup,
      handler: TaggedEventHandler[pointerup],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_progress(node: HTMLElement, eventName: progress, handler: TaggedEventHandler[progress]): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_progress(node: HTMLElement, eventName: progress, handler: TaggedEventHandler[progress], options: Boolean): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_progress(
      node: HTMLElement,
      eventName: progress,
      handler: TaggedEventHandler[progress],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_ratechange(node: HTMLElement, eventName: ratechange, handler: TaggedEventHandler[ratechange]): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_ratechange(
      node: HTMLElement,
      eventName: ratechange,
      handler: TaggedEventHandler[ratechange],
      options: Boolean
    ): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_ratechange(
      node: HTMLElement,
      eventName: ratechange,
      handler: TaggedEventHandler[ratechange],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_reset(node: HTMLElement, eventName: reset, handler: TaggedEventHandler[reset]): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_reset(node: HTMLElement, eventName: reset, handler: TaggedEventHandler[reset], options: Boolean): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_reset(
      node: HTMLElement,
      eventName: reset,
      handler: TaggedEventHandler[reset],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_resize(node: HTMLElement, eventName: resize, handler: TaggedEventHandler[resize]): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_resize(node: HTMLElement, eventName: resize, handler: TaggedEventHandler[resize], options: Boolean): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_resize(
      node: HTMLElement,
      eventName: resize,
      handler: TaggedEventHandler[resize],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_scroll(node: HTMLElement, eventName: scroll, handler: TaggedEventHandler[scroll]): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_scroll(node: HTMLElement, eventName: scroll, handler: TaggedEventHandler[scroll], options: Boolean): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_scroll(
      node: HTMLElement,
      eventName: scroll,
      handler: TaggedEventHandler[scroll],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_securitypolicyviolation(
      node: HTMLElement,
      eventName: securitypolicyviolation,
      handler: TaggedEventHandler[securitypolicyviolation]
    ): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_securitypolicyviolation(
      node: HTMLElement,
      eventName: securitypolicyviolation,
      handler: TaggedEventHandler[securitypolicyviolation],
      options: Boolean
    ): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_securitypolicyviolation(
      node: HTMLElement,
      eventName: securitypolicyviolation,
      handler: TaggedEventHandler[securitypolicyviolation],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_seeked(node: HTMLElement, eventName: seeked, handler: TaggedEventHandler[seeked]): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_seeked(node: HTMLElement, eventName: seeked, handler: TaggedEventHandler[seeked], options: Boolean): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_seeked(
      node: HTMLElement,
      eventName: seeked,
      handler: TaggedEventHandler[seeked],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_seeking(node: HTMLElement, eventName: seeking, handler: TaggedEventHandler[seeking]): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_seeking(node: HTMLElement, eventName: seeking, handler: TaggedEventHandler[seeking], options: Boolean): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_seeking(
      node: HTMLElement,
      eventName: seeking,
      handler: TaggedEventHandler[seeking],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_select(node: HTMLElement, eventName: select, handler: TaggedEventHandler[select]): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_select(node: HTMLElement, eventName: select, handler: TaggedEventHandler[select], options: Boolean): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_select(
      node: HTMLElement,
      eventName: select,
      handler: TaggedEventHandler[select],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_selectionchange(node: HTMLElement, eventName: selectionchange, handler: TaggedEventHandler[selectionchange]): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_selectionchange(
      node: HTMLElement,
      eventName: selectionchange,
      handler: TaggedEventHandler[selectionchange],
      options: Boolean
    ): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_selectionchange(
      node: HTMLElement,
      eventName: selectionchange,
      handler: TaggedEventHandler[selectionchange],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_selectstart(node: HTMLElement, eventName: selectstart, handler: TaggedEventHandler[selectstart]): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_selectstart(
      node: HTMLElement,
      eventName: selectstart,
      handler: TaggedEventHandler[selectstart],
      options: Boolean
    ): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_selectstart(
      node: HTMLElement,
      eventName: selectstart,
      handler: TaggedEventHandler[selectstart],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_stalled(node: HTMLElement, eventName: stalled, handler: TaggedEventHandler[stalled]): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_stalled(node: HTMLElement, eventName: stalled, handler: TaggedEventHandler[stalled], options: Boolean): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_stalled(
      node: HTMLElement,
      eventName: stalled,
      handler: TaggedEventHandler[stalled],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_submit(node: HTMLElement, eventName: submit, handler: TaggedEventHandler[submit]): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_submit(node: HTMLElement, eventName: submit, handler: TaggedEventHandler[submit], options: Boolean): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_submit(
      node: HTMLElement,
      eventName: submit,
      handler: TaggedEventHandler[submit],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_suspend(node: HTMLElement, eventName: suspend, handler: TaggedEventHandler[suspend]): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_suspend(node: HTMLElement, eventName: suspend, handler: TaggedEventHandler[suspend], options: Boolean): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_suspend(
      node: HTMLElement,
      eventName: suspend,
      handler: TaggedEventHandler[suspend],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_timeupdate(node: HTMLElement, eventName: timeupdate, handler: TaggedEventHandler[timeupdate]): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_timeupdate(
      node: HTMLElement,
      eventName: timeupdate,
      handler: TaggedEventHandler[timeupdate],
      options: Boolean
    ): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_timeupdate(
      node: HTMLElement,
      eventName: timeupdate,
      handler: TaggedEventHandler[timeupdate],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_toggle(node: HTMLElement, eventName: toggle, handler: TaggedEventHandler[toggle]): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_toggle(node: HTMLElement, eventName: toggle, handler: TaggedEventHandler[toggle], options: Boolean): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_toggle(
      node: HTMLElement,
      eventName: toggle,
      handler: TaggedEventHandler[toggle],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_touchcancel(node: HTMLElement, eventName: touchcancel, handler: TaggedEventHandler[touchcancel]): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_touchcancel(
      node: HTMLElement,
      eventName: touchcancel,
      handler: TaggedEventHandler[touchcancel],
      options: Boolean
    ): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_touchcancel(
      node: HTMLElement,
      eventName: touchcancel,
      handler: TaggedEventHandler[touchcancel],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_touchend(node: HTMLElement, eventName: touchend, handler: TaggedEventHandler[touchend]): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_touchend(node: HTMLElement, eventName: touchend, handler: TaggedEventHandler[touchend], options: Boolean): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_touchend(
      node: HTMLElement,
      eventName: touchend,
      handler: TaggedEventHandler[touchend],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_touchmove(node: HTMLElement, eventName: touchmove, handler: TaggedEventHandler[touchmove]): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_touchmove(node: HTMLElement, eventName: touchmove, handler: TaggedEventHandler[touchmove], options: Boolean): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_touchmove(
      node: HTMLElement,
      eventName: touchmove,
      handler: TaggedEventHandler[touchmove],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_touchstart(node: HTMLElement, eventName: touchstart, handler: TaggedEventHandler[touchstart]): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_touchstart(
      node: HTMLElement,
      eventName: touchstart,
      handler: TaggedEventHandler[touchstart],
      options: Boolean
    ): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_touchstart(
      node: HTMLElement,
      eventName: touchstart,
      handler: TaggedEventHandler[touchstart],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_transitioncancel(node: HTMLElement, eventName: transitioncancel, handler: TaggedEventHandler[transitioncancel]): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_transitioncancel(
      node: HTMLElement,
      eventName: transitioncancel,
      handler: TaggedEventHandler[transitioncancel],
      options: Boolean
    ): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_transitioncancel(
      node: HTMLElement,
      eventName: transitioncancel,
      handler: TaggedEventHandler[transitioncancel],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_transitionend(node: HTMLElement, eventName: transitionend, handler: TaggedEventHandler[transitionend]): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_transitionend(
      node: HTMLElement,
      eventName: transitionend,
      handler: TaggedEventHandler[transitionend],
      options: Boolean
    ): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_transitionend(
      node: HTMLElement,
      eventName: transitionend,
      handler: TaggedEventHandler[transitionend],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_transitionrun(node: HTMLElement, eventName: transitionrun, handler: TaggedEventHandler[transitionrun]): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_transitionrun(
      node: HTMLElement,
      eventName: transitionrun,
      handler: TaggedEventHandler[transitionrun],
      options: Boolean
    ): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_transitionrun(
      node: HTMLElement,
      eventName: transitionrun,
      handler: TaggedEventHandler[transitionrun],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_transitionstart(node: HTMLElement, eventName: transitionstart, handler: TaggedEventHandler[transitionstart]): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_transitionstart(
      node: HTMLElement,
      eventName: transitionstart,
      handler: TaggedEventHandler[transitionstart],
      options: Boolean
    ): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_transitionstart(
      node: HTMLElement,
      eventName: transitionstart,
      handler: TaggedEventHandler[transitionstart],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_volumechange(node: HTMLElement, eventName: volumechange, handler: TaggedEventHandler[volumechange]): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_volumechange(
      node: HTMLElement,
      eventName: volumechange,
      handler: TaggedEventHandler[volumechange],
      options: Boolean
    ): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_volumechange(
      node: HTMLElement,
      eventName: volumechange,
      handler: TaggedEventHandler[volumechange],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_waiting(node: HTMLElement, eventName: waiting, handler: TaggedEventHandler[waiting]): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_waiting(node: HTMLElement, eventName: waiting, handler: TaggedEventHandler[waiting], options: Boolean): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_waiting(
      node: HTMLElement,
      eventName: waiting,
      handler: TaggedEventHandler[waiting],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_wheel(node: HTMLElement, eventName: wheel, handler: TaggedEventHandler[wheel]): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_wheel(node: HTMLElement, eventName: wheel, handler: TaggedEventHandler[wheel], options: Boolean): Unit = js.native
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener_wheel(
      node: HTMLElement,
      eventName: wheel,
      handler: TaggedEventHandler[wheel],
      options: AddEventListenerOptions
    ): Unit = js.native
    
    @JSImport("dom-helpers", "default.animate")
    @js.native
    def animate: FnCallNodePropertiesDurationEasingCallback = js.native
    @JSImport("dom-helpers", "default.animate")
    @js.native
    def animate(node: HTMLElement, properties: AnimateProperties, duration: Double): Cancel = js.native
    @JSImport("dom-helpers", "default.animate")
    @js.native
    def animate(options: Options): Cancel = js.native
    @scala.inline
    def animate_=(x: FnCallNodePropertiesDurationEasingCallback): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("animate")(x.asInstanceOf[js.Any])
    @JSImport("dom-helpers", "default.animate")
    @js.native
    def animate_transitionend(
      node: HTMLElement,
      properties: AnimateProperties,
      duration: Double,
      callback: EventHandler[transitionend]
    ): Cancel = js.native
    @JSImport("dom-helpers", "default.animate")
    @js.native
    def animate_transitionend(
      node: HTMLElement,
      properties: AnimateProperties,
      duration: Double,
      easing: String,
      callback: EventHandler[transitionend]
    ): Cancel = js.native
    
    @JSImport("dom-helpers", "default.cancelAnimationFrame")
    @js.native
    def cancelAnimationFrame(id: Double): Unit = js.native
    
    @JSImport("dom-helpers", "default.closest")
    @js.native
    def closest: js.Function3[
        /* node */ Element, 
        /* selector */ String, 
        /* stopAt */ js.UndefOr[Element], 
        Element | Null
      ] = js.native
    @JSImport("dom-helpers", "default.closest")
    @js.native
    def closest(node: Element, selector: String): Element | Null = js.native
    @JSImport("dom-helpers", "default.closest")
    @js.native
    def closest(node: Element, selector: String, stopAt: Element): Element | Null = js.native
    @scala.inline
    def closest_=(
      x: js.Function3[
          /* node */ Element, 
          /* selector */ String, 
          /* stopAt */ js.UndefOr[Element], 
          Element | Null
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("closest")(x.asInstanceOf[js.Any])
    
    @JSImport("dom-helpers", "default.contains")
    @js.native
    def contains: js.Function2[/* context */ Element, /* node */ Element, js.UndefOr[Boolean]] = js.native
    @JSImport("dom-helpers", "default.contains")
    @js.native
    def contains(context: Element, node: Element): js.UndefOr[Boolean] = js.native
    @scala.inline
    def contains_=(x: js.Function2[/* context */ Element, /* node */ Element, js.UndefOr[Boolean]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contains")(x.asInstanceOf[js.Any])
    
    @JSImport("dom-helpers", "default.filter")
    @js.native
    def filter: FnCallSelectorHandler = js.native
    @scala.inline
    def filter_=(x: FnCallSelectorHandler): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("filter")(x.asInstanceOf[js.Any])
    @JSImport("dom-helpers", "default.filter")
    @js.native
    def filter_abort(selector: String, handler: EventHandler[abort]): EventHandler[abort] = js.native
    @JSImport("dom-helpers", "default.filter")
    @js.native
    def filter_animationcancel(selector: String, handler: EventHandler[animationcancel]): EventHandler[animationcancel] = js.native
    @JSImport("dom-helpers", "default.filter")
    @js.native
    def filter_animationend(selector: String, handler: EventHandler[animationend]): EventHandler[animationend] = js.native
    @JSImport("dom-helpers", "default.filter")
    @js.native
    def filter_animationiteration(selector: String, handler: EventHandler[animationiteration]): EventHandler[animationiteration] = js.native
    @JSImport("dom-helpers", "default.filter")
    @js.native
    def filter_animationstart(selector: String, handler: EventHandler[animationstart]): EventHandler[animationstart] = js.native
    @JSImport("dom-helpers", "default.filter")
    @js.native
    def filter_auxclick(selector: String, handler: EventHandler[auxclick]): EventHandler[auxclick] = js.native
    @JSImport("dom-helpers", "default.filter")
    @js.native
    def filter_blur(selector: String, handler: EventHandler[blur]): EventHandler[blur] = js.native
    @JSImport("dom-helpers", "default.filter")
    @js.native
    def filter_cancel(selector: String, handler: EventHandler[cancel]): EventHandler[cancel] = js.native
    @JSImport("dom-helpers", "default.filter")
    @js.native
    def filter_canplay(selector: String, handler: EventHandler[canplay]): EventHandler[canplay] = js.native
    @JSImport("dom-helpers", "default.filter")
    @js.native
    def filter_canplaythrough(selector: String, handler: EventHandler[canplaythrough]): EventHandler[canplaythrough] = js.native
    @JSImport("dom-helpers", "default.filter")
    @js.native
    def filter_change(selector: String, handler: EventHandler[change]): EventHandler[change] = js.native
    @JSImport("dom-helpers", "default.filter")
    @js.native
    def filter_click(selector: String, handler: EventHandler[click]): EventHandler[click] = js.native
    @JSImport("dom-helpers", "default.filter")
    @js.native
    def filter_close(selector: String, handler: EventHandler[close]): EventHandler[close] = js.native
    @JSImport("dom-helpers", "default.filter")
    @js.native
    def filter_contextmenu(selector: String, handler: EventHandler[contextmenu]): EventHandler[contextmenu] = js.native
    @JSImport("dom-helpers", "default.filter")
    @js.native
    def filter_copy(selector: String, handler: EventHandler[copy]): EventHandler[copy] = js.native
    @JSImport("dom-helpers", "default.filter")
    @js.native
    def filter_cuechange(selector: String, handler: EventHandler[cuechange]): EventHandler[cuechange] = js.native
    @JSImport("dom-helpers", "default.filter")
    @js.native
    def filter_cut(selector: String, handler: EventHandler[cut]): EventHandler[cut] = js.native
    @JSImport("dom-helpers", "default.filter")
    @js.native
    def filter_dblclick(selector: String, handler: EventHandler[dblclick]): EventHandler[dblclick] = js.native
    @JSImport("dom-helpers", "default.filter")
    @js.native
    def filter_drag(selector: String, handler: EventHandler[drag]): EventHandler[drag] = js.native
    @JSImport("dom-helpers", "default.filter")
    @js.native
    def filter_dragend(selector: String, handler: EventHandler[dragend]): EventHandler[dragend] = js.native
    @JSImport("dom-helpers", "default.filter")
    @js.native
    def filter_dragenter(selector: String, handler: EventHandler[dragenter]): EventHandler[dragenter] = js.native
    @JSImport("dom-helpers", "default.filter")
    @js.native
    def filter_dragexit(selector: String, handler: EventHandler[dragexit]): EventHandler[dragexit] = js.native
    @JSImport("dom-helpers", "default.filter")
    @js.native
    def filter_dragleave(selector: String, handler: EventHandler[dragleave]): EventHandler[dragleave] = js.native
    @JSImport("dom-helpers", "default.filter")
    @js.native
    def filter_dragover(selector: String, handler: EventHandler[dragover]): EventHandler[dragover] = js.native
    @JSImport("dom-helpers", "default.filter")
    @js.native
    def filter_dragstart(selector: String, handler: EventHandler[dragstart]): EventHandler[dragstart] = js.native
    @JSImport("dom-helpers", "default.filter")
    @js.native
    def filter_drop(selector: String, handler: EventHandler[drop]): EventHandler[drop] = js.native
    @JSImport("dom-helpers", "default.filter")
    @js.native
    def filter_durationchange(selector: String, handler: EventHandler[durationchange]): EventHandler[durationchange] = js.native
    @JSImport("dom-helpers", "default.filter")
    @js.native
    def filter_emptied(selector: String, handler: EventHandler[emptied]): EventHandler[emptied] = js.native
    @JSImport("dom-helpers", "default.filter")
    @js.native
    def filter_ended(selector: String, handler: EventHandler[ended]): EventHandler[ended] = js.native
    @JSImport("dom-helpers", "default.filter")
    @js.native
    def filter_error(selector: String, handler: EventHandler[error]): EventHandler[error] = js.native
    @JSImport("dom-helpers", "default.filter")
    @js.native
    def filter_focus(selector: String, handler: EventHandler[focus]): EventHandler[focus] = js.native
    @JSImport("dom-helpers", "default.filter")
    @js.native
    def filter_focusin(selector: String, handler: EventHandler[focusin]): EventHandler[focusin] = js.native
    @JSImport("dom-helpers", "default.filter")
    @js.native
    def filter_focusout(selector: String, handler: EventHandler[focusout]): EventHandler[focusout] = js.native
    @JSImport("dom-helpers", "default.filter")
    @js.native
    def filter_fullscreenchange(selector: String, handler: EventHandler[fullscreenchange]): EventHandler[fullscreenchange] = js.native
    @JSImport("dom-helpers", "default.filter")
    @js.native
    def filter_fullscreenerror(selector: String, handler: EventHandler[fullscreenerror]): EventHandler[fullscreenerror] = js.native
    @JSImport("dom-helpers", "default.filter")
    @js.native
    def filter_gotpointercapture(selector: String, handler: EventHandler[gotpointercapture]): EventHandler[gotpointercapture] = js.native
    @JSImport("dom-helpers", "default.filter")
    @js.native
    def filter_input(selector: String, handler: EventHandler[input]): EventHandler[input] = js.native
    @JSImport("dom-helpers", "default.filter")
    @js.native
    def filter_invalid(selector: String, handler: EventHandler[invalid]): EventHandler[invalid] = js.native
    @JSImport("dom-helpers", "default.filter")
    @js.native
    def filter_keydown(selector: String, handler: EventHandler[keydown]): EventHandler[keydown] = js.native
    @JSImport("dom-helpers", "default.filter")
    @js.native
    def filter_keypress(selector: String, handler: EventHandler[keypress]): EventHandler[keypress] = js.native
    @JSImport("dom-helpers", "default.filter")
    @js.native
    def filter_keyup(selector: String, handler: EventHandler[keyup]): EventHandler[keyup] = js.native
    @JSImport("dom-helpers", "default.filter")
    @js.native
    def filter_load(selector: String, handler: EventHandler[load]): EventHandler[load] = js.native
    @JSImport("dom-helpers", "default.filter")
    @js.native
    def filter_loadeddata(selector: String, handler: EventHandler[loadeddata]): EventHandler[loadeddata] = js.native
    @JSImport("dom-helpers", "default.filter")
    @js.native
    def filter_loadedmetadata(selector: String, handler: EventHandler[loadedmetadata]): EventHandler[loadedmetadata] = js.native
    @JSImport("dom-helpers", "default.filter")
    @js.native
    def filter_loadstart(selector: String, handler: EventHandler[loadstart]): EventHandler[loadstart] = js.native
    @JSImport("dom-helpers", "default.filter")
    @js.native
    def filter_lostpointercapture(selector: String, handler: EventHandler[lostpointercapture]): EventHandler[lostpointercapture] = js.native
    @JSImport("dom-helpers", "default.filter")
    @js.native
    def filter_mousedown(selector: String, handler: EventHandler[mousedown]): EventHandler[mousedown] = js.native
    @JSImport("dom-helpers", "default.filter")
    @js.native
    def filter_mouseenter(selector: String, handler: EventHandler[mouseenter]): EventHandler[mouseenter] = js.native
    @JSImport("dom-helpers", "default.filter")
    @js.native
    def filter_mouseleave(selector: String, handler: EventHandler[mouseleave]): EventHandler[mouseleave] = js.native
    @JSImport("dom-helpers", "default.filter")
    @js.native
    def filter_mousemove(selector: String, handler: EventHandler[mousemove]): EventHandler[mousemove] = js.native
    @JSImport("dom-helpers", "default.filter")
    @js.native
    def filter_mouseout(selector: String, handler: EventHandler[mouseout]): EventHandler[mouseout] = js.native
    @JSImport("dom-helpers", "default.filter")
    @js.native
    def filter_mouseover(selector: String, handler: EventHandler[mouseover]): EventHandler[mouseover] = js.native
    @JSImport("dom-helpers", "default.filter")
    @js.native
    def filter_mouseup(selector: String, handler: EventHandler[mouseup]): EventHandler[mouseup] = js.native
    @JSImport("dom-helpers", "default.filter")
    @js.native
    def filter_paste(selector: String, handler: EventHandler[paste]): EventHandler[paste] = js.native
    @JSImport("dom-helpers", "default.filter")
    @js.native
    def filter_pause(selector: String, handler: EventHandler[pause]): EventHandler[pause] = js.native
    @JSImport("dom-helpers", "default.filter")
    @js.native
    def filter_play(selector: String, handler: EventHandler[play]): EventHandler[play] = js.native
    @JSImport("dom-helpers", "default.filter")
    @js.native
    def filter_playing(selector: String, handler: EventHandler[playing]): EventHandler[playing] = js.native
    @JSImport("dom-helpers", "default.filter")
    @js.native
    def filter_pointercancel(selector: String, handler: EventHandler[pointercancel]): EventHandler[pointercancel] = js.native
    @JSImport("dom-helpers", "default.filter")
    @js.native
    def filter_pointerdown(selector: String, handler: EventHandler[pointerdown]): EventHandler[pointerdown] = js.native
    @JSImport("dom-helpers", "default.filter")
    @js.native
    def filter_pointerenter(selector: String, handler: EventHandler[pointerenter]): EventHandler[pointerenter] = js.native
    @JSImport("dom-helpers", "default.filter")
    @js.native
    def filter_pointerleave(selector: String, handler: EventHandler[pointerleave]): EventHandler[pointerleave] = js.native
    @JSImport("dom-helpers", "default.filter")
    @js.native
    def filter_pointermove(selector: String, handler: EventHandler[pointermove]): EventHandler[pointermove] = js.native
    @JSImport("dom-helpers", "default.filter")
    @js.native
    def filter_pointerout(selector: String, handler: EventHandler[pointerout]): EventHandler[pointerout] = js.native
    @JSImport("dom-helpers", "default.filter")
    @js.native
    def filter_pointerover(selector: String, handler: EventHandler[pointerover]): EventHandler[pointerover] = js.native
    @JSImport("dom-helpers", "default.filter")
    @js.native
    def filter_pointerup(selector: String, handler: EventHandler[pointerup]): EventHandler[pointerup] = js.native
    @JSImport("dom-helpers", "default.filter")
    @js.native
    def filter_progress(selector: String, handler: EventHandler[progress]): EventHandler[progress] = js.native
    @JSImport("dom-helpers", "default.filter")
    @js.native
    def filter_ratechange(selector: String, handler: EventHandler[ratechange]): EventHandler[ratechange] = js.native
    @JSImport("dom-helpers", "default.filter")
    @js.native
    def filter_reset(selector: String, handler: EventHandler[reset]): EventHandler[reset] = js.native
    @JSImport("dom-helpers", "default.filter")
    @js.native
    def filter_resize(selector: String, handler: EventHandler[resize]): EventHandler[resize] = js.native
    @JSImport("dom-helpers", "default.filter")
    @js.native
    def filter_scroll(selector: String, handler: EventHandler[scroll]): EventHandler[scroll] = js.native
    @JSImport("dom-helpers", "default.filter")
    @js.native
    def filter_securitypolicyviolation(selector: String, handler: EventHandler[securitypolicyviolation]): EventHandler[securitypolicyviolation] = js.native
    @JSImport("dom-helpers", "default.filter")
    @js.native
    def filter_seeked(selector: String, handler: EventHandler[seeked]): EventHandler[seeked] = js.native
    @JSImport("dom-helpers", "default.filter")
    @js.native
    def filter_seeking(selector: String, handler: EventHandler[seeking]): EventHandler[seeking] = js.native
    @JSImport("dom-helpers", "default.filter")
    @js.native
    def filter_select(selector: String, handler: EventHandler[select]): EventHandler[select] = js.native
    @JSImport("dom-helpers", "default.filter")
    @js.native
    def filter_selectionchange(selector: String, handler: EventHandler[selectionchange]): EventHandler[selectionchange] = js.native
    @JSImport("dom-helpers", "default.filter")
    @js.native
    def filter_selectstart(selector: String, handler: EventHandler[selectstart]): EventHandler[selectstart] = js.native
    @JSImport("dom-helpers", "default.filter")
    @js.native
    def filter_stalled(selector: String, handler: EventHandler[stalled]): EventHandler[stalled] = js.native
    @JSImport("dom-helpers", "default.filter")
    @js.native
    def filter_submit(selector: String, handler: EventHandler[submit]): EventHandler[submit] = js.native
    @JSImport("dom-helpers", "default.filter")
    @js.native
    def filter_suspend(selector: String, handler: EventHandler[suspend]): EventHandler[suspend] = js.native
    @JSImport("dom-helpers", "default.filter")
    @js.native
    def filter_timeupdate(selector: String, handler: EventHandler[timeupdate]): EventHandler[timeupdate] = js.native
    @JSImport("dom-helpers", "default.filter")
    @js.native
    def filter_toggle(selector: String, handler: EventHandler[toggle]): EventHandler[toggle] = js.native
    @JSImport("dom-helpers", "default.filter")
    @js.native
    def filter_touchcancel(selector: String, handler: EventHandler[touchcancel]): EventHandler[touchcancel] = js.native
    @JSImport("dom-helpers", "default.filter")
    @js.native
    def filter_touchend(selector: String, handler: EventHandler[touchend]): EventHandler[touchend] = js.native
    @JSImport("dom-helpers", "default.filter")
    @js.native
    def filter_touchmove(selector: String, handler: EventHandler[touchmove]): EventHandler[touchmove] = js.native
    @JSImport("dom-helpers", "default.filter")
    @js.native
    def filter_touchstart(selector: String, handler: EventHandler[touchstart]): EventHandler[touchstart] = js.native
    @JSImport("dom-helpers", "default.filter")
    @js.native
    def filter_transitioncancel(selector: String, handler: EventHandler[transitioncancel]): EventHandler[transitioncancel] = js.native
    @JSImport("dom-helpers", "default.filter")
    @js.native
    def filter_transitionend(selector: String, handler: EventHandler[transitionend]): EventHandler[transitionend] = js.native
    @JSImport("dom-helpers", "default.filter")
    @js.native
    def filter_transitionrun(selector: String, handler: EventHandler[transitionrun]): EventHandler[transitionrun] = js.native
    @JSImport("dom-helpers", "default.filter")
    @js.native
    def filter_transitionstart(selector: String, handler: EventHandler[transitionstart]): EventHandler[transitionstart] = js.native
    @JSImport("dom-helpers", "default.filter")
    @js.native
    def filter_volumechange(selector: String, handler: EventHandler[volumechange]): EventHandler[volumechange] = js.native
    @JSImport("dom-helpers", "default.filter")
    @js.native
    def filter_waiting(selector: String, handler: EventHandler[waiting]): EventHandler[waiting] = js.native
    @JSImport("dom-helpers", "default.filter")
    @js.native
    def filter_wheel(selector: String, handler: EventHandler[wheel]): EventHandler[wheel] = js.native
    
    @JSImport("dom-helpers", "default.getComputedStyle")
    @js.native
    def getComputedStyle: js.Function2[/* node */ HTMLElement, /* psuedoElement */ js.UndefOr[String], CSSStyleDeclaration] = js.native
    @JSImport("dom-helpers", "default.getComputedStyle")
    @js.native
    def getComputedStyle(node: HTMLElement): CSSStyleDeclaration = js.native
    @JSImport("dom-helpers", "default.getComputedStyle")
    @js.native
    def getComputedStyle(node: HTMLElement, psuedoElement: String): CSSStyleDeclaration = js.native
    @scala.inline
    def getComputedStyle_=(
      x: js.Function2[/* node */ HTMLElement, /* psuedoElement */ js.UndefOr[String], CSSStyleDeclaration]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getComputedStyle")(x.asInstanceOf[js.Any])
    
    @JSImport("dom-helpers", "default.hasClass")
    @js.native
    def hasClass: js.Function2[/* element */ Element | SVGElement, /* className */ String, Boolean] = js.native
    @JSImport("dom-helpers", "default.hasClass")
    @js.native
    def hasClass(element: Element, className: String): Boolean = js.native
    @JSImport("dom-helpers", "default.hasClass")
    @js.native
    def hasClass(element: SVGElement, className: String): Boolean = js.native
    @scala.inline
    def hasClass_=(x: js.Function2[/* element */ Element | SVGElement, /* className */ String, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hasClass")(x.asInstanceOf[js.Any])
    
    @JSImport("dom-helpers", "default.height")
    @js.native
    def height: js.Function2[/* node */ HTMLElement, /* client */ js.UndefOr[Boolean], Double] = js.native
    @JSImport("dom-helpers", "default.height")
    @js.native
    def height(node: HTMLElement): Double = js.native
    @JSImport("dom-helpers", "default.height")
    @js.native
    def height(node: HTMLElement, client: Boolean): Double = js.native
    @scala.inline
    def height_=(x: js.Function2[/* node */ HTMLElement, /* client */ js.UndefOr[Boolean], Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("height")(x.asInstanceOf[js.Any])
    
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen: Fn1 = js.native
    @scala.inline
    def listen_=(x: Fn1): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("listen")(x.asInstanceOf[js.Any])
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_abort(node: HTMLElement, eventName: abort, handler: EventHandler[abort]): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_abort(node: HTMLElement, eventName: abort, handler: EventHandler[abort], options: Boolean): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_abort(
      node: HTMLElement,
      eventName: abort,
      handler: EventHandler[abort],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_animationcancel(node: HTMLElement, eventName: animationcancel, handler: EventHandler[animationcancel]): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_animationcancel(
      node: HTMLElement,
      eventName: animationcancel,
      handler: EventHandler[animationcancel],
      options: Boolean
    ): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_animationcancel(
      node: HTMLElement,
      eventName: animationcancel,
      handler: EventHandler[animationcancel],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_animationend(node: HTMLElement, eventName: animationend, handler: EventHandler[animationend]): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_animationend(node: HTMLElement, eventName: animationend, handler: EventHandler[animationend], options: Boolean): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_animationend(
      node: HTMLElement,
      eventName: animationend,
      handler: EventHandler[animationend],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_animationiteration(node: HTMLElement, eventName: animationiteration, handler: EventHandler[animationiteration]): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_animationiteration(
      node: HTMLElement,
      eventName: animationiteration,
      handler: EventHandler[animationiteration],
      options: Boolean
    ): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_animationiteration(
      node: HTMLElement,
      eventName: animationiteration,
      handler: EventHandler[animationiteration],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_animationstart(node: HTMLElement, eventName: animationstart, handler: EventHandler[animationstart]): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_animationstart(
      node: HTMLElement,
      eventName: animationstart,
      handler: EventHandler[animationstart],
      options: Boolean
    ): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_animationstart(
      node: HTMLElement,
      eventName: animationstart,
      handler: EventHandler[animationstart],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_auxclick(node: HTMLElement, eventName: auxclick, handler: EventHandler[auxclick]): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_auxclick(node: HTMLElement, eventName: auxclick, handler: EventHandler[auxclick], options: Boolean): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_auxclick(
      node: HTMLElement,
      eventName: auxclick,
      handler: EventHandler[auxclick],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_blur(node: HTMLElement, eventName: blur, handler: EventHandler[blur]): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_blur(node: HTMLElement, eventName: blur, handler: EventHandler[blur], options: Boolean): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_blur(node: HTMLElement, eventName: blur, handler: EventHandler[blur], options: AddEventListenerOptions): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_cancel(node: HTMLElement, eventName: cancel, handler: EventHandler[cancel]): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_cancel(node: HTMLElement, eventName: cancel, handler: EventHandler[cancel], options: Boolean): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_cancel(
      node: HTMLElement,
      eventName: cancel,
      handler: EventHandler[cancel],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_canplay(node: HTMLElement, eventName: canplay, handler: EventHandler[canplay]): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_canplay(node: HTMLElement, eventName: canplay, handler: EventHandler[canplay], options: Boolean): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_canplay(
      node: HTMLElement,
      eventName: canplay,
      handler: EventHandler[canplay],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_canplaythrough(node: HTMLElement, eventName: canplaythrough, handler: EventHandler[canplaythrough]): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_canplaythrough(
      node: HTMLElement,
      eventName: canplaythrough,
      handler: EventHandler[canplaythrough],
      options: Boolean
    ): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_canplaythrough(
      node: HTMLElement,
      eventName: canplaythrough,
      handler: EventHandler[canplaythrough],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_change(node: HTMLElement, eventName: change, handler: EventHandler[change]): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_change(node: HTMLElement, eventName: change, handler: EventHandler[change], options: Boolean): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_change(
      node: HTMLElement,
      eventName: change,
      handler: EventHandler[change],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_click(node: HTMLElement, eventName: click, handler: EventHandler[click]): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_click(node: HTMLElement, eventName: click, handler: EventHandler[click], options: Boolean): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_click(
      node: HTMLElement,
      eventName: click,
      handler: EventHandler[click],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_close(node: HTMLElement, eventName: close, handler: EventHandler[close]): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_close(node: HTMLElement, eventName: close, handler: EventHandler[close], options: Boolean): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_close(
      node: HTMLElement,
      eventName: close,
      handler: EventHandler[close],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_contextmenu(node: HTMLElement, eventName: contextmenu, handler: EventHandler[contextmenu]): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_contextmenu(node: HTMLElement, eventName: contextmenu, handler: EventHandler[contextmenu], options: Boolean): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_contextmenu(
      node: HTMLElement,
      eventName: contextmenu,
      handler: EventHandler[contextmenu],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_copy(node: HTMLElement, eventName: copy, handler: EventHandler[copy]): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_copy(node: HTMLElement, eventName: copy, handler: EventHandler[copy], options: Boolean): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_copy(node: HTMLElement, eventName: copy, handler: EventHandler[copy], options: AddEventListenerOptions): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_cuechange(node: HTMLElement, eventName: cuechange, handler: EventHandler[cuechange]): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_cuechange(node: HTMLElement, eventName: cuechange, handler: EventHandler[cuechange], options: Boolean): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_cuechange(
      node: HTMLElement,
      eventName: cuechange,
      handler: EventHandler[cuechange],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_cut(node: HTMLElement, eventName: cut, handler: EventHandler[cut]): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_cut(node: HTMLElement, eventName: cut, handler: EventHandler[cut], options: Boolean): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_cut(node: HTMLElement, eventName: cut, handler: EventHandler[cut], options: AddEventListenerOptions): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_dblclick(node: HTMLElement, eventName: dblclick, handler: EventHandler[dblclick]): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_dblclick(node: HTMLElement, eventName: dblclick, handler: EventHandler[dblclick], options: Boolean): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_dblclick(
      node: HTMLElement,
      eventName: dblclick,
      handler: EventHandler[dblclick],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_drag(node: HTMLElement, eventName: drag, handler: EventHandler[drag]): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_drag(node: HTMLElement, eventName: drag, handler: EventHandler[drag], options: Boolean): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_drag(node: HTMLElement, eventName: drag, handler: EventHandler[drag], options: AddEventListenerOptions): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_dragend(node: HTMLElement, eventName: dragend, handler: EventHandler[dragend]): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_dragend(node: HTMLElement, eventName: dragend, handler: EventHandler[dragend], options: Boolean): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_dragend(
      node: HTMLElement,
      eventName: dragend,
      handler: EventHandler[dragend],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_dragenter(node: HTMLElement, eventName: dragenter, handler: EventHandler[dragenter]): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_dragenter(node: HTMLElement, eventName: dragenter, handler: EventHandler[dragenter], options: Boolean): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_dragenter(
      node: HTMLElement,
      eventName: dragenter,
      handler: EventHandler[dragenter],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_dragexit(node: HTMLElement, eventName: dragexit, handler: EventHandler[dragexit]): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_dragexit(node: HTMLElement, eventName: dragexit, handler: EventHandler[dragexit], options: Boolean): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_dragexit(
      node: HTMLElement,
      eventName: dragexit,
      handler: EventHandler[dragexit],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_dragleave(node: HTMLElement, eventName: dragleave, handler: EventHandler[dragleave]): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_dragleave(node: HTMLElement, eventName: dragleave, handler: EventHandler[dragleave], options: Boolean): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_dragleave(
      node: HTMLElement,
      eventName: dragleave,
      handler: EventHandler[dragleave],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_dragover(node: HTMLElement, eventName: dragover, handler: EventHandler[dragover]): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_dragover(node: HTMLElement, eventName: dragover, handler: EventHandler[dragover], options: Boolean): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_dragover(
      node: HTMLElement,
      eventName: dragover,
      handler: EventHandler[dragover],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_dragstart(node: HTMLElement, eventName: dragstart, handler: EventHandler[dragstart]): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_dragstart(node: HTMLElement, eventName: dragstart, handler: EventHandler[dragstart], options: Boolean): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_dragstart(
      node: HTMLElement,
      eventName: dragstart,
      handler: EventHandler[dragstart],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_drop(node: HTMLElement, eventName: drop, handler: EventHandler[drop]): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_drop(node: HTMLElement, eventName: drop, handler: EventHandler[drop], options: Boolean): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_drop(node: HTMLElement, eventName: drop, handler: EventHandler[drop], options: AddEventListenerOptions): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_durationchange(node: HTMLElement, eventName: durationchange, handler: EventHandler[durationchange]): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_durationchange(
      node: HTMLElement,
      eventName: durationchange,
      handler: EventHandler[durationchange],
      options: Boolean
    ): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_durationchange(
      node: HTMLElement,
      eventName: durationchange,
      handler: EventHandler[durationchange],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_emptied(node: HTMLElement, eventName: emptied, handler: EventHandler[emptied]): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_emptied(node: HTMLElement, eventName: emptied, handler: EventHandler[emptied], options: Boolean): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_emptied(
      node: HTMLElement,
      eventName: emptied,
      handler: EventHandler[emptied],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_ended(node: HTMLElement, eventName: ended, handler: EventHandler[ended]): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_ended(node: HTMLElement, eventName: ended, handler: EventHandler[ended], options: Boolean): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_ended(
      node: HTMLElement,
      eventName: ended,
      handler: EventHandler[ended],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_error(node: HTMLElement, eventName: error, handler: EventHandler[error]): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_error(node: HTMLElement, eventName: error, handler: EventHandler[error], options: Boolean): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_error(
      node: HTMLElement,
      eventName: error,
      handler: EventHandler[error],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_focus(node: HTMLElement, eventName: focus, handler: EventHandler[focus]): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_focus(node: HTMLElement, eventName: focus, handler: EventHandler[focus], options: Boolean): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_focus(
      node: HTMLElement,
      eventName: focus,
      handler: EventHandler[focus],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_focusin(node: HTMLElement, eventName: focusin, handler: EventHandler[focusin]): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_focusin(node: HTMLElement, eventName: focusin, handler: EventHandler[focusin], options: Boolean): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_focusin(
      node: HTMLElement,
      eventName: focusin,
      handler: EventHandler[focusin],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_focusout(node: HTMLElement, eventName: focusout, handler: EventHandler[focusout]): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_focusout(node: HTMLElement, eventName: focusout, handler: EventHandler[focusout], options: Boolean): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_focusout(
      node: HTMLElement,
      eventName: focusout,
      handler: EventHandler[focusout],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_fullscreenchange(node: HTMLElement, eventName: fullscreenchange, handler: EventHandler[fullscreenchange]): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_fullscreenchange(
      node: HTMLElement,
      eventName: fullscreenchange,
      handler: EventHandler[fullscreenchange],
      options: Boolean
    ): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_fullscreenchange(
      node: HTMLElement,
      eventName: fullscreenchange,
      handler: EventHandler[fullscreenchange],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_fullscreenerror(node: HTMLElement, eventName: fullscreenerror, handler: EventHandler[fullscreenerror]): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_fullscreenerror(
      node: HTMLElement,
      eventName: fullscreenerror,
      handler: EventHandler[fullscreenerror],
      options: Boolean
    ): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_fullscreenerror(
      node: HTMLElement,
      eventName: fullscreenerror,
      handler: EventHandler[fullscreenerror],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_gotpointercapture(node: HTMLElement, eventName: gotpointercapture, handler: EventHandler[gotpointercapture]): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_gotpointercapture(
      node: HTMLElement,
      eventName: gotpointercapture,
      handler: EventHandler[gotpointercapture],
      options: Boolean
    ): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_gotpointercapture(
      node: HTMLElement,
      eventName: gotpointercapture,
      handler: EventHandler[gotpointercapture],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_input(node: HTMLElement, eventName: input, handler: EventHandler[input]): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_input(node: HTMLElement, eventName: input, handler: EventHandler[input], options: Boolean): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_input(
      node: HTMLElement,
      eventName: input,
      handler: EventHandler[input],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_invalid(node: HTMLElement, eventName: invalid, handler: EventHandler[invalid]): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_invalid(node: HTMLElement, eventName: invalid, handler: EventHandler[invalid], options: Boolean): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_invalid(
      node: HTMLElement,
      eventName: invalid,
      handler: EventHandler[invalid],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_keydown(node: HTMLElement, eventName: keydown, handler: EventHandler[keydown]): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_keydown(node: HTMLElement, eventName: keydown, handler: EventHandler[keydown], options: Boolean): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_keydown(
      node: HTMLElement,
      eventName: keydown,
      handler: EventHandler[keydown],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_keypress(node: HTMLElement, eventName: keypress, handler: EventHandler[keypress]): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_keypress(node: HTMLElement, eventName: keypress, handler: EventHandler[keypress], options: Boolean): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_keypress(
      node: HTMLElement,
      eventName: keypress,
      handler: EventHandler[keypress],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_keyup(node: HTMLElement, eventName: keyup, handler: EventHandler[keyup]): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_keyup(node: HTMLElement, eventName: keyup, handler: EventHandler[keyup], options: Boolean): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_keyup(
      node: HTMLElement,
      eventName: keyup,
      handler: EventHandler[keyup],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_load(node: HTMLElement, eventName: load, handler: EventHandler[load]): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_load(node: HTMLElement, eventName: load, handler: EventHandler[load], options: Boolean): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_load(node: HTMLElement, eventName: load, handler: EventHandler[load], options: AddEventListenerOptions): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_loadeddata(node: HTMLElement, eventName: loadeddata, handler: EventHandler[loadeddata]): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_loadeddata(node: HTMLElement, eventName: loadeddata, handler: EventHandler[loadeddata], options: Boolean): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_loadeddata(
      node: HTMLElement,
      eventName: loadeddata,
      handler: EventHandler[loadeddata],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_loadedmetadata(node: HTMLElement, eventName: loadedmetadata, handler: EventHandler[loadedmetadata]): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_loadedmetadata(
      node: HTMLElement,
      eventName: loadedmetadata,
      handler: EventHandler[loadedmetadata],
      options: Boolean
    ): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_loadedmetadata(
      node: HTMLElement,
      eventName: loadedmetadata,
      handler: EventHandler[loadedmetadata],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_loadstart(node: HTMLElement, eventName: loadstart, handler: EventHandler[loadstart]): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_loadstart(node: HTMLElement, eventName: loadstart, handler: EventHandler[loadstart], options: Boolean): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_loadstart(
      node: HTMLElement,
      eventName: loadstart,
      handler: EventHandler[loadstart],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_lostpointercapture(node: HTMLElement, eventName: lostpointercapture, handler: EventHandler[lostpointercapture]): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_lostpointercapture(
      node: HTMLElement,
      eventName: lostpointercapture,
      handler: EventHandler[lostpointercapture],
      options: Boolean
    ): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_lostpointercapture(
      node: HTMLElement,
      eventName: lostpointercapture,
      handler: EventHandler[lostpointercapture],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_mousedown(node: HTMLElement, eventName: mousedown, handler: EventHandler[mousedown]): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_mousedown(node: HTMLElement, eventName: mousedown, handler: EventHandler[mousedown], options: Boolean): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_mousedown(
      node: HTMLElement,
      eventName: mousedown,
      handler: EventHandler[mousedown],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_mouseenter(node: HTMLElement, eventName: mouseenter, handler: EventHandler[mouseenter]): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_mouseenter(node: HTMLElement, eventName: mouseenter, handler: EventHandler[mouseenter], options: Boolean): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_mouseenter(
      node: HTMLElement,
      eventName: mouseenter,
      handler: EventHandler[mouseenter],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_mouseleave(node: HTMLElement, eventName: mouseleave, handler: EventHandler[mouseleave]): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_mouseleave(node: HTMLElement, eventName: mouseleave, handler: EventHandler[mouseleave], options: Boolean): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_mouseleave(
      node: HTMLElement,
      eventName: mouseleave,
      handler: EventHandler[mouseleave],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_mousemove(node: HTMLElement, eventName: mousemove, handler: EventHandler[mousemove]): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_mousemove(node: HTMLElement, eventName: mousemove, handler: EventHandler[mousemove], options: Boolean): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_mousemove(
      node: HTMLElement,
      eventName: mousemove,
      handler: EventHandler[mousemove],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_mouseout(node: HTMLElement, eventName: mouseout, handler: EventHandler[mouseout]): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_mouseout(node: HTMLElement, eventName: mouseout, handler: EventHandler[mouseout], options: Boolean): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_mouseout(
      node: HTMLElement,
      eventName: mouseout,
      handler: EventHandler[mouseout],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_mouseover(node: HTMLElement, eventName: mouseover, handler: EventHandler[mouseover]): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_mouseover(node: HTMLElement, eventName: mouseover, handler: EventHandler[mouseover], options: Boolean): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_mouseover(
      node: HTMLElement,
      eventName: mouseover,
      handler: EventHandler[mouseover],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_mouseup(node: HTMLElement, eventName: mouseup, handler: EventHandler[mouseup]): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_mouseup(node: HTMLElement, eventName: mouseup, handler: EventHandler[mouseup], options: Boolean): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_mouseup(
      node: HTMLElement,
      eventName: mouseup,
      handler: EventHandler[mouseup],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_paste(node: HTMLElement, eventName: paste, handler: EventHandler[paste]): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_paste(node: HTMLElement, eventName: paste, handler: EventHandler[paste], options: Boolean): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_paste(
      node: HTMLElement,
      eventName: paste,
      handler: EventHandler[paste],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_pause(node: HTMLElement, eventName: pause, handler: EventHandler[pause]): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_pause(node: HTMLElement, eventName: pause, handler: EventHandler[pause], options: Boolean): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_pause(
      node: HTMLElement,
      eventName: pause,
      handler: EventHandler[pause],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_play(node: HTMLElement, eventName: play, handler: EventHandler[play]): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_play(node: HTMLElement, eventName: play, handler: EventHandler[play], options: Boolean): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_play(node: HTMLElement, eventName: play, handler: EventHandler[play], options: AddEventListenerOptions): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_playing(node: HTMLElement, eventName: playing, handler: EventHandler[playing]): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_playing(node: HTMLElement, eventName: playing, handler: EventHandler[playing], options: Boolean): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_playing(
      node: HTMLElement,
      eventName: playing,
      handler: EventHandler[playing],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_pointercancel(node: HTMLElement, eventName: pointercancel, handler: EventHandler[pointercancel]): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_pointercancel(
      node: HTMLElement,
      eventName: pointercancel,
      handler: EventHandler[pointercancel],
      options: Boolean
    ): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_pointercancel(
      node: HTMLElement,
      eventName: pointercancel,
      handler: EventHandler[pointercancel],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_pointerdown(node: HTMLElement, eventName: pointerdown, handler: EventHandler[pointerdown]): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_pointerdown(node: HTMLElement, eventName: pointerdown, handler: EventHandler[pointerdown], options: Boolean): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_pointerdown(
      node: HTMLElement,
      eventName: pointerdown,
      handler: EventHandler[pointerdown],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_pointerenter(node: HTMLElement, eventName: pointerenter, handler: EventHandler[pointerenter]): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_pointerenter(node: HTMLElement, eventName: pointerenter, handler: EventHandler[pointerenter], options: Boolean): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_pointerenter(
      node: HTMLElement,
      eventName: pointerenter,
      handler: EventHandler[pointerenter],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_pointerleave(node: HTMLElement, eventName: pointerleave, handler: EventHandler[pointerleave]): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_pointerleave(node: HTMLElement, eventName: pointerleave, handler: EventHandler[pointerleave], options: Boolean): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_pointerleave(
      node: HTMLElement,
      eventName: pointerleave,
      handler: EventHandler[pointerleave],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_pointermove(node: HTMLElement, eventName: pointermove, handler: EventHandler[pointermove]): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_pointermove(node: HTMLElement, eventName: pointermove, handler: EventHandler[pointermove], options: Boolean): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_pointermove(
      node: HTMLElement,
      eventName: pointermove,
      handler: EventHandler[pointermove],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_pointerout(node: HTMLElement, eventName: pointerout, handler: EventHandler[pointerout]): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_pointerout(node: HTMLElement, eventName: pointerout, handler: EventHandler[pointerout], options: Boolean): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_pointerout(
      node: HTMLElement,
      eventName: pointerout,
      handler: EventHandler[pointerout],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_pointerover(node: HTMLElement, eventName: pointerover, handler: EventHandler[pointerover]): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_pointerover(node: HTMLElement, eventName: pointerover, handler: EventHandler[pointerover], options: Boolean): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_pointerover(
      node: HTMLElement,
      eventName: pointerover,
      handler: EventHandler[pointerover],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_pointerup(node: HTMLElement, eventName: pointerup, handler: EventHandler[pointerup]): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_pointerup(node: HTMLElement, eventName: pointerup, handler: EventHandler[pointerup], options: Boolean): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_pointerup(
      node: HTMLElement,
      eventName: pointerup,
      handler: EventHandler[pointerup],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_progress(node: HTMLElement, eventName: progress, handler: EventHandler[progress]): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_progress(node: HTMLElement, eventName: progress, handler: EventHandler[progress], options: Boolean): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_progress(
      node: HTMLElement,
      eventName: progress,
      handler: EventHandler[progress],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_ratechange(node: HTMLElement, eventName: ratechange, handler: EventHandler[ratechange]): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_ratechange(node: HTMLElement, eventName: ratechange, handler: EventHandler[ratechange], options: Boolean): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_ratechange(
      node: HTMLElement,
      eventName: ratechange,
      handler: EventHandler[ratechange],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_reset(node: HTMLElement, eventName: reset, handler: EventHandler[reset]): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_reset(node: HTMLElement, eventName: reset, handler: EventHandler[reset], options: Boolean): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_reset(
      node: HTMLElement,
      eventName: reset,
      handler: EventHandler[reset],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_resize(node: HTMLElement, eventName: resize, handler: EventHandler[resize]): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_resize(node: HTMLElement, eventName: resize, handler: EventHandler[resize], options: Boolean): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_resize(
      node: HTMLElement,
      eventName: resize,
      handler: EventHandler[resize],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_scroll(node: HTMLElement, eventName: scroll, handler: EventHandler[scroll]): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_scroll(node: HTMLElement, eventName: scroll, handler: EventHandler[scroll], options: Boolean): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_scroll(
      node: HTMLElement,
      eventName: scroll,
      handler: EventHandler[scroll],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_securitypolicyviolation(
      node: HTMLElement,
      eventName: securitypolicyviolation,
      handler: EventHandler[securitypolicyviolation]
    ): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_securitypolicyviolation(
      node: HTMLElement,
      eventName: securitypolicyviolation,
      handler: EventHandler[securitypolicyviolation],
      options: Boolean
    ): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_securitypolicyviolation(
      node: HTMLElement,
      eventName: securitypolicyviolation,
      handler: EventHandler[securitypolicyviolation],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_seeked(node: HTMLElement, eventName: seeked, handler: EventHandler[seeked]): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_seeked(node: HTMLElement, eventName: seeked, handler: EventHandler[seeked], options: Boolean): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_seeked(
      node: HTMLElement,
      eventName: seeked,
      handler: EventHandler[seeked],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_seeking(node: HTMLElement, eventName: seeking, handler: EventHandler[seeking]): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_seeking(node: HTMLElement, eventName: seeking, handler: EventHandler[seeking], options: Boolean): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_seeking(
      node: HTMLElement,
      eventName: seeking,
      handler: EventHandler[seeking],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_select(node: HTMLElement, eventName: select, handler: EventHandler[select]): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_select(node: HTMLElement, eventName: select, handler: EventHandler[select], options: Boolean): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_select(
      node: HTMLElement,
      eventName: select,
      handler: EventHandler[select],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_selectionchange(node: HTMLElement, eventName: selectionchange, handler: EventHandler[selectionchange]): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_selectionchange(
      node: HTMLElement,
      eventName: selectionchange,
      handler: EventHandler[selectionchange],
      options: Boolean
    ): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_selectionchange(
      node: HTMLElement,
      eventName: selectionchange,
      handler: EventHandler[selectionchange],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_selectstart(node: HTMLElement, eventName: selectstart, handler: EventHandler[selectstart]): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_selectstart(node: HTMLElement, eventName: selectstart, handler: EventHandler[selectstart], options: Boolean): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_selectstart(
      node: HTMLElement,
      eventName: selectstart,
      handler: EventHandler[selectstart],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_stalled(node: HTMLElement, eventName: stalled, handler: EventHandler[stalled]): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_stalled(node: HTMLElement, eventName: stalled, handler: EventHandler[stalled], options: Boolean): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_stalled(
      node: HTMLElement,
      eventName: stalled,
      handler: EventHandler[stalled],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_submit(node: HTMLElement, eventName: submit, handler: EventHandler[submit]): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_submit(node: HTMLElement, eventName: submit, handler: EventHandler[submit], options: Boolean): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_submit(
      node: HTMLElement,
      eventName: submit,
      handler: EventHandler[submit],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_suspend(node: HTMLElement, eventName: suspend, handler: EventHandler[suspend]): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_suspend(node: HTMLElement, eventName: suspend, handler: EventHandler[suspend], options: Boolean): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_suspend(
      node: HTMLElement,
      eventName: suspend,
      handler: EventHandler[suspend],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_timeupdate(node: HTMLElement, eventName: timeupdate, handler: EventHandler[timeupdate]): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_timeupdate(node: HTMLElement, eventName: timeupdate, handler: EventHandler[timeupdate], options: Boolean): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_timeupdate(
      node: HTMLElement,
      eventName: timeupdate,
      handler: EventHandler[timeupdate],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_toggle(node: HTMLElement, eventName: toggle, handler: EventHandler[toggle]): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_toggle(node: HTMLElement, eventName: toggle, handler: EventHandler[toggle], options: Boolean): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_toggle(
      node: HTMLElement,
      eventName: toggle,
      handler: EventHandler[toggle],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_touchcancel(node: HTMLElement, eventName: touchcancel, handler: EventHandler[touchcancel]): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_touchcancel(node: HTMLElement, eventName: touchcancel, handler: EventHandler[touchcancel], options: Boolean): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_touchcancel(
      node: HTMLElement,
      eventName: touchcancel,
      handler: EventHandler[touchcancel],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_touchend(node: HTMLElement, eventName: touchend, handler: EventHandler[touchend]): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_touchend(node: HTMLElement, eventName: touchend, handler: EventHandler[touchend], options: Boolean): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_touchend(
      node: HTMLElement,
      eventName: touchend,
      handler: EventHandler[touchend],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_touchmove(node: HTMLElement, eventName: touchmove, handler: EventHandler[touchmove]): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_touchmove(node: HTMLElement, eventName: touchmove, handler: EventHandler[touchmove], options: Boolean): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_touchmove(
      node: HTMLElement,
      eventName: touchmove,
      handler: EventHandler[touchmove],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_touchstart(node: HTMLElement, eventName: touchstart, handler: EventHandler[touchstart]): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_touchstart(node: HTMLElement, eventName: touchstart, handler: EventHandler[touchstart], options: Boolean): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_touchstart(
      node: HTMLElement,
      eventName: touchstart,
      handler: EventHandler[touchstart],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_transitioncancel(node: HTMLElement, eventName: transitioncancel, handler: EventHandler[transitioncancel]): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_transitioncancel(
      node: HTMLElement,
      eventName: transitioncancel,
      handler: EventHandler[transitioncancel],
      options: Boolean
    ): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_transitioncancel(
      node: HTMLElement,
      eventName: transitioncancel,
      handler: EventHandler[transitioncancel],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_transitionend(node: HTMLElement, eventName: transitionend, handler: EventHandler[transitionend]): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_transitionend(
      node: HTMLElement,
      eventName: transitionend,
      handler: EventHandler[transitionend],
      options: Boolean
    ): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_transitionend(
      node: HTMLElement,
      eventName: transitionend,
      handler: EventHandler[transitionend],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_transitionrun(node: HTMLElement, eventName: transitionrun, handler: EventHandler[transitionrun]): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_transitionrun(
      node: HTMLElement,
      eventName: transitionrun,
      handler: EventHandler[transitionrun],
      options: Boolean
    ): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_transitionrun(
      node: HTMLElement,
      eventName: transitionrun,
      handler: EventHandler[transitionrun],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_transitionstart(node: HTMLElement, eventName: transitionstart, handler: EventHandler[transitionstart]): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_transitionstart(
      node: HTMLElement,
      eventName: transitionstart,
      handler: EventHandler[transitionstart],
      options: Boolean
    ): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_transitionstart(
      node: HTMLElement,
      eventName: transitionstart,
      handler: EventHandler[transitionstart],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_volumechange(node: HTMLElement, eventName: volumechange, handler: EventHandler[volumechange]): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_volumechange(node: HTMLElement, eventName: volumechange, handler: EventHandler[volumechange], options: Boolean): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_volumechange(
      node: HTMLElement,
      eventName: volumechange,
      handler: EventHandler[volumechange],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_waiting(node: HTMLElement, eventName: waiting, handler: EventHandler[waiting]): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_waiting(node: HTMLElement, eventName: waiting, handler: EventHandler[waiting], options: Boolean): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_waiting(
      node: HTMLElement,
      eventName: waiting,
      handler: EventHandler[waiting],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_wheel(node: HTMLElement, eventName: wheel, handler: EventHandler[wheel]): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_wheel(node: HTMLElement, eventName: wheel, handler: EventHandler[wheel], options: Boolean): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen_wheel(
      node: HTMLElement,
      eventName: wheel,
      handler: EventHandler[wheel],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = js.native
    
    @JSImport("dom-helpers", "default.matches")
    @js.native
    def matches: js.Function2[/* node */ Element, /* selector */ String, Boolean] = js.native
    @JSImport("dom-helpers", "default.matches")
    @js.native
    def matches(node: Element, selector: String): Boolean = js.native
    @scala.inline
    def matches_=(x: js.Function2[/* node */ Element, /* selector */ String, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("matches")(x.asInstanceOf[js.Any])
    
    @JSImport("dom-helpers", "default.offset")
    @js.native
    def offset: js.Function1[/* node */ HTMLElement, Height] = js.native
    @JSImport("dom-helpers", "default.offset")
    @js.native
    def offset(node: HTMLElement): Height = js.native
    
    @JSImport("dom-helpers", "default.offsetParent")
    @js.native
    def offsetParent: js.Function1[/* node */ HTMLElement, HTMLElement] = js.native
    @JSImport("dom-helpers", "default.offsetParent")
    @js.native
    def offsetParent(node: HTMLElement): HTMLElement = js.native
    @scala.inline
    def offsetParent_=(x: js.Function1[/* node */ HTMLElement, HTMLElement]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("offsetParent")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def offset_=(x: js.Function1[/* node */ HTMLElement, Height]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("offset")(x.asInstanceOf[js.Any])
    
    @JSImport("dom-helpers", "default.ownerDocument")
    @js.native
    def ownerDocument(): Document = js.native
    @JSImport("dom-helpers", "default.ownerDocument")
    @js.native
    def ownerDocument(node: Element): Document = js.native
    @JSImport("dom-helpers", "default.ownerDocument")
    @js.native
    def ownerDocument_Fdefault: js.Function1[/* node */ js.UndefOr[Element], Document] = js.native
    
    @scala.inline
    def ownerDocument_Fdefault_=(x: js.Function1[/* node */ js.UndefOr[Element], Document]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ownerDocument")(x.asInstanceOf[js.Any])
    
    @JSImport("dom-helpers", "default.ownerWindow")
    @js.native
    def ownerWindow(): Window = js.native
    @JSImport("dom-helpers", "default.ownerWindow")
    @js.native
    def ownerWindow(node: Element): Window = js.native
    @JSImport("dom-helpers", "default.ownerWindow")
    @js.native
    def ownerWindow_Fdefault: js.Function1[/* node */ js.UndefOr[Element], Window] = js.native
    
    @scala.inline
    def ownerWindow_Fdefault_=(x: js.Function1[/* node */ js.UndefOr[Element], Window]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ownerWindow")(x.asInstanceOf[js.Any])
    
    @JSImport("dom-helpers", "default.position")
    @js.native
    def position: js.Function2[/* node */ HTMLElement, /* offsetParent */ js.UndefOr[HTMLElement], Height] = js.native
    @JSImport("dom-helpers", "default.position")
    @js.native
    def position(node: HTMLElement): Height = js.native
    @JSImport("dom-helpers", "default.position")
    @js.native
    def position(node: HTMLElement, offsetParent: HTMLElement): Height = js.native
    @scala.inline
    def position_=(x: js.Function2[/* node */ HTMLElement, /* offsetParent */ js.UndefOr[HTMLElement], Height]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("position")(x.asInstanceOf[js.Any])
    
    @JSImport("dom-helpers", "default.querySelectorAll")
    @js.native
    def querySelectorAll: js.Function2[/* element */ HTMLElement | Document, /* selector */ String, js.Array[HTMLElement]] = js.native
    @JSImport("dom-helpers", "default.querySelectorAll")
    @js.native
    def querySelectorAll(element: Document, selector: String): js.Array[HTMLElement] = js.native
    @JSImport("dom-helpers", "default.querySelectorAll")
    @js.native
    def querySelectorAll(element: HTMLElement, selector: String): js.Array[HTMLElement] = js.native
    @scala.inline
    def querySelectorAll_=(
      x: js.Function2[/* element */ HTMLElement | Document, /* selector */ String, js.Array[HTMLElement]]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("querySelectorAll")(x.asInstanceOf[js.Any])
    
    @JSImport("dom-helpers", "default.removeClass")
    @js.native
    def removeClass: js.Function2[/* element */ Element | SVGElement, /* className */ String, Unit] = js.native
    @JSImport("dom-helpers", "default.removeClass")
    @js.native
    def removeClass(element: Element, className: String): Unit = js.native
    @JSImport("dom-helpers", "default.removeClass")
    @js.native
    def removeClass(element: SVGElement, className: String): Unit = js.native
    @scala.inline
    def removeClass_=(x: js.Function2[/* element */ Element | SVGElement, /* className */ String, Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("removeClass")(x.asInstanceOf[js.Any])
    
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener: Fn0 = js.native
    @scala.inline
    def removeEventListener_=(x: Fn0): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("removeEventListener")(x.asInstanceOf[js.Any])
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_abort(node: HTMLElement, eventName: abort, handler: TaggedEventHandler[abort]): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_abort(node: HTMLElement, eventName: abort, handler: TaggedEventHandler[abort], options: Boolean): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_abort(
      node: HTMLElement,
      eventName: abort,
      handler: TaggedEventHandler[abort],
      options: EventListenerOptions
    ): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_animationcancel(node: HTMLElement, eventName: animationcancel, handler: TaggedEventHandler[animationcancel]): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_animationcancel(
      node: HTMLElement,
      eventName: animationcancel,
      handler: TaggedEventHandler[animationcancel],
      options: Boolean
    ): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_animationcancel(
      node: HTMLElement,
      eventName: animationcancel,
      handler: TaggedEventHandler[animationcancel],
      options: EventListenerOptions
    ): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_animationend(node: HTMLElement, eventName: animationend, handler: TaggedEventHandler[animationend]): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_animationend(
      node: HTMLElement,
      eventName: animationend,
      handler: TaggedEventHandler[animationend],
      options: Boolean
    ): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_animationend(
      node: HTMLElement,
      eventName: animationend,
      handler: TaggedEventHandler[animationend],
      options: EventListenerOptions
    ): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_animationiteration(node: HTMLElement, eventName: animationiteration, handler: TaggedEventHandler[animationiteration]): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_animationiteration(
      node: HTMLElement,
      eventName: animationiteration,
      handler: TaggedEventHandler[animationiteration],
      options: Boolean
    ): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_animationiteration(
      node: HTMLElement,
      eventName: animationiteration,
      handler: TaggedEventHandler[animationiteration],
      options: EventListenerOptions
    ): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_animationstart(node: HTMLElement, eventName: animationstart, handler: TaggedEventHandler[animationstart]): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_animationstart(
      node: HTMLElement,
      eventName: animationstart,
      handler: TaggedEventHandler[animationstart],
      options: Boolean
    ): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_animationstart(
      node: HTMLElement,
      eventName: animationstart,
      handler: TaggedEventHandler[animationstart],
      options: EventListenerOptions
    ): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_auxclick(node: HTMLElement, eventName: auxclick, handler: TaggedEventHandler[auxclick]): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_auxclick(node: HTMLElement, eventName: auxclick, handler: TaggedEventHandler[auxclick], options: Boolean): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_auxclick(
      node: HTMLElement,
      eventName: auxclick,
      handler: TaggedEventHandler[auxclick],
      options: EventListenerOptions
    ): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_blur(node: HTMLElement, eventName: blur, handler: TaggedEventHandler[blur]): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_blur(node: HTMLElement, eventName: blur, handler: TaggedEventHandler[blur], options: Boolean): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_blur(
      node: HTMLElement,
      eventName: blur,
      handler: TaggedEventHandler[blur],
      options: EventListenerOptions
    ): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_cancel(node: HTMLElement, eventName: cancel, handler: TaggedEventHandler[cancel]): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_cancel(node: HTMLElement, eventName: cancel, handler: TaggedEventHandler[cancel], options: Boolean): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_cancel(
      node: HTMLElement,
      eventName: cancel,
      handler: TaggedEventHandler[cancel],
      options: EventListenerOptions
    ): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_canplay(node: HTMLElement, eventName: canplay, handler: TaggedEventHandler[canplay]): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_canplay(node: HTMLElement, eventName: canplay, handler: TaggedEventHandler[canplay], options: Boolean): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_canplay(
      node: HTMLElement,
      eventName: canplay,
      handler: TaggedEventHandler[canplay],
      options: EventListenerOptions
    ): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_canplaythrough(node: HTMLElement, eventName: canplaythrough, handler: TaggedEventHandler[canplaythrough]): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_canplaythrough(
      node: HTMLElement,
      eventName: canplaythrough,
      handler: TaggedEventHandler[canplaythrough],
      options: Boolean
    ): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_canplaythrough(
      node: HTMLElement,
      eventName: canplaythrough,
      handler: TaggedEventHandler[canplaythrough],
      options: EventListenerOptions
    ): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_change(node: HTMLElement, eventName: change, handler: TaggedEventHandler[change]): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_change(node: HTMLElement, eventName: change, handler: TaggedEventHandler[change], options: Boolean): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_change(
      node: HTMLElement,
      eventName: change,
      handler: TaggedEventHandler[change],
      options: EventListenerOptions
    ): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_click(node: HTMLElement, eventName: click, handler: TaggedEventHandler[click]): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_click(node: HTMLElement, eventName: click, handler: TaggedEventHandler[click], options: Boolean): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_click(
      node: HTMLElement,
      eventName: click,
      handler: TaggedEventHandler[click],
      options: EventListenerOptions
    ): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_close(node: HTMLElement, eventName: close, handler: TaggedEventHandler[close]): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_close(node: HTMLElement, eventName: close, handler: TaggedEventHandler[close], options: Boolean): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_close(
      node: HTMLElement,
      eventName: close,
      handler: TaggedEventHandler[close],
      options: EventListenerOptions
    ): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_contextmenu(node: HTMLElement, eventName: contextmenu, handler: TaggedEventHandler[contextmenu]): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_contextmenu(
      node: HTMLElement,
      eventName: contextmenu,
      handler: TaggedEventHandler[contextmenu],
      options: Boolean
    ): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_contextmenu(
      node: HTMLElement,
      eventName: contextmenu,
      handler: TaggedEventHandler[contextmenu],
      options: EventListenerOptions
    ): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_copy(node: HTMLElement, eventName: copy, handler: TaggedEventHandler[copy]): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_copy(node: HTMLElement, eventName: copy, handler: TaggedEventHandler[copy], options: Boolean): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_copy(
      node: HTMLElement,
      eventName: copy,
      handler: TaggedEventHandler[copy],
      options: EventListenerOptions
    ): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_cuechange(node: HTMLElement, eventName: cuechange, handler: TaggedEventHandler[cuechange]): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_cuechange(node: HTMLElement, eventName: cuechange, handler: TaggedEventHandler[cuechange], options: Boolean): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_cuechange(
      node: HTMLElement,
      eventName: cuechange,
      handler: TaggedEventHandler[cuechange],
      options: EventListenerOptions
    ): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_cut(node: HTMLElement, eventName: cut, handler: TaggedEventHandler[cut]): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_cut(node: HTMLElement, eventName: cut, handler: TaggedEventHandler[cut], options: Boolean): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_cut(node: HTMLElement, eventName: cut, handler: TaggedEventHandler[cut], options: EventListenerOptions): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_dblclick(node: HTMLElement, eventName: dblclick, handler: TaggedEventHandler[dblclick]): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_dblclick(node: HTMLElement, eventName: dblclick, handler: TaggedEventHandler[dblclick], options: Boolean): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_dblclick(
      node: HTMLElement,
      eventName: dblclick,
      handler: TaggedEventHandler[dblclick],
      options: EventListenerOptions
    ): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_drag(node: HTMLElement, eventName: drag, handler: TaggedEventHandler[drag]): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_drag(node: HTMLElement, eventName: drag, handler: TaggedEventHandler[drag], options: Boolean): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_drag(
      node: HTMLElement,
      eventName: drag,
      handler: TaggedEventHandler[drag],
      options: EventListenerOptions
    ): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_dragend(node: HTMLElement, eventName: dragend, handler: TaggedEventHandler[dragend]): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_dragend(node: HTMLElement, eventName: dragend, handler: TaggedEventHandler[dragend], options: Boolean): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_dragend(
      node: HTMLElement,
      eventName: dragend,
      handler: TaggedEventHandler[dragend],
      options: EventListenerOptions
    ): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_dragenter(node: HTMLElement, eventName: dragenter, handler: TaggedEventHandler[dragenter]): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_dragenter(node: HTMLElement, eventName: dragenter, handler: TaggedEventHandler[dragenter], options: Boolean): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_dragenter(
      node: HTMLElement,
      eventName: dragenter,
      handler: TaggedEventHandler[dragenter],
      options: EventListenerOptions
    ): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_dragexit(node: HTMLElement, eventName: dragexit, handler: TaggedEventHandler[dragexit]): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_dragexit(node: HTMLElement, eventName: dragexit, handler: TaggedEventHandler[dragexit], options: Boolean): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_dragexit(
      node: HTMLElement,
      eventName: dragexit,
      handler: TaggedEventHandler[dragexit],
      options: EventListenerOptions
    ): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_dragleave(node: HTMLElement, eventName: dragleave, handler: TaggedEventHandler[dragleave]): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_dragleave(node: HTMLElement, eventName: dragleave, handler: TaggedEventHandler[dragleave], options: Boolean): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_dragleave(
      node: HTMLElement,
      eventName: dragleave,
      handler: TaggedEventHandler[dragleave],
      options: EventListenerOptions
    ): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_dragover(node: HTMLElement, eventName: dragover, handler: TaggedEventHandler[dragover]): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_dragover(node: HTMLElement, eventName: dragover, handler: TaggedEventHandler[dragover], options: Boolean): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_dragover(
      node: HTMLElement,
      eventName: dragover,
      handler: TaggedEventHandler[dragover],
      options: EventListenerOptions
    ): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_dragstart(node: HTMLElement, eventName: dragstart, handler: TaggedEventHandler[dragstart]): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_dragstart(node: HTMLElement, eventName: dragstart, handler: TaggedEventHandler[dragstart], options: Boolean): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_dragstart(
      node: HTMLElement,
      eventName: dragstart,
      handler: TaggedEventHandler[dragstart],
      options: EventListenerOptions
    ): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_drop(node: HTMLElement, eventName: drop, handler: TaggedEventHandler[drop]): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_drop(node: HTMLElement, eventName: drop, handler: TaggedEventHandler[drop], options: Boolean): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_drop(
      node: HTMLElement,
      eventName: drop,
      handler: TaggedEventHandler[drop],
      options: EventListenerOptions
    ): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_durationchange(node: HTMLElement, eventName: durationchange, handler: TaggedEventHandler[durationchange]): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_durationchange(
      node: HTMLElement,
      eventName: durationchange,
      handler: TaggedEventHandler[durationchange],
      options: Boolean
    ): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_durationchange(
      node: HTMLElement,
      eventName: durationchange,
      handler: TaggedEventHandler[durationchange],
      options: EventListenerOptions
    ): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_emptied(node: HTMLElement, eventName: emptied, handler: TaggedEventHandler[emptied]): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_emptied(node: HTMLElement, eventName: emptied, handler: TaggedEventHandler[emptied], options: Boolean): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_emptied(
      node: HTMLElement,
      eventName: emptied,
      handler: TaggedEventHandler[emptied],
      options: EventListenerOptions
    ): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_ended(node: HTMLElement, eventName: ended, handler: TaggedEventHandler[ended]): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_ended(node: HTMLElement, eventName: ended, handler: TaggedEventHandler[ended], options: Boolean): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_ended(
      node: HTMLElement,
      eventName: ended,
      handler: TaggedEventHandler[ended],
      options: EventListenerOptions
    ): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_error(node: HTMLElement, eventName: error, handler: TaggedEventHandler[error]): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_error(node: HTMLElement, eventName: error, handler: TaggedEventHandler[error], options: Boolean): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_error(
      node: HTMLElement,
      eventName: error,
      handler: TaggedEventHandler[error],
      options: EventListenerOptions
    ): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_focus(node: HTMLElement, eventName: focus, handler: TaggedEventHandler[focus]): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_focus(node: HTMLElement, eventName: focus, handler: TaggedEventHandler[focus], options: Boolean): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_focus(
      node: HTMLElement,
      eventName: focus,
      handler: TaggedEventHandler[focus],
      options: EventListenerOptions
    ): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_focusin(node: HTMLElement, eventName: focusin, handler: TaggedEventHandler[focusin]): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_focusin(node: HTMLElement, eventName: focusin, handler: TaggedEventHandler[focusin], options: Boolean): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_focusin(
      node: HTMLElement,
      eventName: focusin,
      handler: TaggedEventHandler[focusin],
      options: EventListenerOptions
    ): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_focusout(node: HTMLElement, eventName: focusout, handler: TaggedEventHandler[focusout]): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_focusout(node: HTMLElement, eventName: focusout, handler: TaggedEventHandler[focusout], options: Boolean): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_focusout(
      node: HTMLElement,
      eventName: focusout,
      handler: TaggedEventHandler[focusout],
      options: EventListenerOptions
    ): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_fullscreenchange(node: HTMLElement, eventName: fullscreenchange, handler: TaggedEventHandler[fullscreenchange]): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_fullscreenchange(
      node: HTMLElement,
      eventName: fullscreenchange,
      handler: TaggedEventHandler[fullscreenchange],
      options: Boolean
    ): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_fullscreenchange(
      node: HTMLElement,
      eventName: fullscreenchange,
      handler: TaggedEventHandler[fullscreenchange],
      options: EventListenerOptions
    ): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_fullscreenerror(node: HTMLElement, eventName: fullscreenerror, handler: TaggedEventHandler[fullscreenerror]): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_fullscreenerror(
      node: HTMLElement,
      eventName: fullscreenerror,
      handler: TaggedEventHandler[fullscreenerror],
      options: Boolean
    ): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_fullscreenerror(
      node: HTMLElement,
      eventName: fullscreenerror,
      handler: TaggedEventHandler[fullscreenerror],
      options: EventListenerOptions
    ): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_gotpointercapture(node: HTMLElement, eventName: gotpointercapture, handler: TaggedEventHandler[gotpointercapture]): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_gotpointercapture(
      node: HTMLElement,
      eventName: gotpointercapture,
      handler: TaggedEventHandler[gotpointercapture],
      options: Boolean
    ): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_gotpointercapture(
      node: HTMLElement,
      eventName: gotpointercapture,
      handler: TaggedEventHandler[gotpointercapture],
      options: EventListenerOptions
    ): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_input(node: HTMLElement, eventName: input, handler: TaggedEventHandler[input]): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_input(node: HTMLElement, eventName: input, handler: TaggedEventHandler[input], options: Boolean): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_input(
      node: HTMLElement,
      eventName: input,
      handler: TaggedEventHandler[input],
      options: EventListenerOptions
    ): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_invalid(node: HTMLElement, eventName: invalid, handler: TaggedEventHandler[invalid]): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_invalid(node: HTMLElement, eventName: invalid, handler: TaggedEventHandler[invalid], options: Boolean): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_invalid(
      node: HTMLElement,
      eventName: invalid,
      handler: TaggedEventHandler[invalid],
      options: EventListenerOptions
    ): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_keydown(node: HTMLElement, eventName: keydown, handler: TaggedEventHandler[keydown]): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_keydown(node: HTMLElement, eventName: keydown, handler: TaggedEventHandler[keydown], options: Boolean): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_keydown(
      node: HTMLElement,
      eventName: keydown,
      handler: TaggedEventHandler[keydown],
      options: EventListenerOptions
    ): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_keypress(node: HTMLElement, eventName: keypress, handler: TaggedEventHandler[keypress]): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_keypress(node: HTMLElement, eventName: keypress, handler: TaggedEventHandler[keypress], options: Boolean): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_keypress(
      node: HTMLElement,
      eventName: keypress,
      handler: TaggedEventHandler[keypress],
      options: EventListenerOptions
    ): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_keyup(node: HTMLElement, eventName: keyup, handler: TaggedEventHandler[keyup]): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_keyup(node: HTMLElement, eventName: keyup, handler: TaggedEventHandler[keyup], options: Boolean): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_keyup(
      node: HTMLElement,
      eventName: keyup,
      handler: TaggedEventHandler[keyup],
      options: EventListenerOptions
    ): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_load(node: HTMLElement, eventName: load, handler: TaggedEventHandler[load]): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_load(node: HTMLElement, eventName: load, handler: TaggedEventHandler[load], options: Boolean): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_load(
      node: HTMLElement,
      eventName: load,
      handler: TaggedEventHandler[load],
      options: EventListenerOptions
    ): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_loadeddata(node: HTMLElement, eventName: loadeddata, handler: TaggedEventHandler[loadeddata]): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_loadeddata(
      node: HTMLElement,
      eventName: loadeddata,
      handler: TaggedEventHandler[loadeddata],
      options: Boolean
    ): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_loadeddata(
      node: HTMLElement,
      eventName: loadeddata,
      handler: TaggedEventHandler[loadeddata],
      options: EventListenerOptions
    ): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_loadedmetadata(node: HTMLElement, eventName: loadedmetadata, handler: TaggedEventHandler[loadedmetadata]): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_loadedmetadata(
      node: HTMLElement,
      eventName: loadedmetadata,
      handler: TaggedEventHandler[loadedmetadata],
      options: Boolean
    ): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_loadedmetadata(
      node: HTMLElement,
      eventName: loadedmetadata,
      handler: TaggedEventHandler[loadedmetadata],
      options: EventListenerOptions
    ): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_loadstart(node: HTMLElement, eventName: loadstart, handler: TaggedEventHandler[loadstart]): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_loadstart(node: HTMLElement, eventName: loadstart, handler: TaggedEventHandler[loadstart], options: Boolean): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_loadstart(
      node: HTMLElement,
      eventName: loadstart,
      handler: TaggedEventHandler[loadstart],
      options: EventListenerOptions
    ): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_lostpointercapture(node: HTMLElement, eventName: lostpointercapture, handler: TaggedEventHandler[lostpointercapture]): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_lostpointercapture(
      node: HTMLElement,
      eventName: lostpointercapture,
      handler: TaggedEventHandler[lostpointercapture],
      options: Boolean
    ): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_lostpointercapture(
      node: HTMLElement,
      eventName: lostpointercapture,
      handler: TaggedEventHandler[lostpointercapture],
      options: EventListenerOptions
    ): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_mousedown(node: HTMLElement, eventName: mousedown, handler: TaggedEventHandler[mousedown]): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_mousedown(node: HTMLElement, eventName: mousedown, handler: TaggedEventHandler[mousedown], options: Boolean): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_mousedown(
      node: HTMLElement,
      eventName: mousedown,
      handler: TaggedEventHandler[mousedown],
      options: EventListenerOptions
    ): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_mouseenter(node: HTMLElement, eventName: mouseenter, handler: TaggedEventHandler[mouseenter]): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_mouseenter(
      node: HTMLElement,
      eventName: mouseenter,
      handler: TaggedEventHandler[mouseenter],
      options: Boolean
    ): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_mouseenter(
      node: HTMLElement,
      eventName: mouseenter,
      handler: TaggedEventHandler[mouseenter],
      options: EventListenerOptions
    ): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_mouseleave(node: HTMLElement, eventName: mouseleave, handler: TaggedEventHandler[mouseleave]): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_mouseleave(
      node: HTMLElement,
      eventName: mouseleave,
      handler: TaggedEventHandler[mouseleave],
      options: Boolean
    ): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_mouseleave(
      node: HTMLElement,
      eventName: mouseleave,
      handler: TaggedEventHandler[mouseleave],
      options: EventListenerOptions
    ): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_mousemove(node: HTMLElement, eventName: mousemove, handler: TaggedEventHandler[mousemove]): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_mousemove(node: HTMLElement, eventName: mousemove, handler: TaggedEventHandler[mousemove], options: Boolean): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_mousemove(
      node: HTMLElement,
      eventName: mousemove,
      handler: TaggedEventHandler[mousemove],
      options: EventListenerOptions
    ): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_mouseout(node: HTMLElement, eventName: mouseout, handler: TaggedEventHandler[mouseout]): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_mouseout(node: HTMLElement, eventName: mouseout, handler: TaggedEventHandler[mouseout], options: Boolean): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_mouseout(
      node: HTMLElement,
      eventName: mouseout,
      handler: TaggedEventHandler[mouseout],
      options: EventListenerOptions
    ): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_mouseover(node: HTMLElement, eventName: mouseover, handler: TaggedEventHandler[mouseover]): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_mouseover(node: HTMLElement, eventName: mouseover, handler: TaggedEventHandler[mouseover], options: Boolean): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_mouseover(
      node: HTMLElement,
      eventName: mouseover,
      handler: TaggedEventHandler[mouseover],
      options: EventListenerOptions
    ): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_mouseup(node: HTMLElement, eventName: mouseup, handler: TaggedEventHandler[mouseup]): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_mouseup(node: HTMLElement, eventName: mouseup, handler: TaggedEventHandler[mouseup], options: Boolean): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_mouseup(
      node: HTMLElement,
      eventName: mouseup,
      handler: TaggedEventHandler[mouseup],
      options: EventListenerOptions
    ): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_paste(node: HTMLElement, eventName: paste, handler: TaggedEventHandler[paste]): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_paste(node: HTMLElement, eventName: paste, handler: TaggedEventHandler[paste], options: Boolean): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_paste(
      node: HTMLElement,
      eventName: paste,
      handler: TaggedEventHandler[paste],
      options: EventListenerOptions
    ): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_pause(node: HTMLElement, eventName: pause, handler: TaggedEventHandler[pause]): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_pause(node: HTMLElement, eventName: pause, handler: TaggedEventHandler[pause], options: Boolean): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_pause(
      node: HTMLElement,
      eventName: pause,
      handler: TaggedEventHandler[pause],
      options: EventListenerOptions
    ): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_play(node: HTMLElement, eventName: play, handler: TaggedEventHandler[play]): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_play(node: HTMLElement, eventName: play, handler: TaggedEventHandler[play], options: Boolean): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_play(
      node: HTMLElement,
      eventName: play,
      handler: TaggedEventHandler[play],
      options: EventListenerOptions
    ): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_playing(node: HTMLElement, eventName: playing, handler: TaggedEventHandler[playing]): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_playing(node: HTMLElement, eventName: playing, handler: TaggedEventHandler[playing], options: Boolean): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_playing(
      node: HTMLElement,
      eventName: playing,
      handler: TaggedEventHandler[playing],
      options: EventListenerOptions
    ): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_pointercancel(node: HTMLElement, eventName: pointercancel, handler: TaggedEventHandler[pointercancel]): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_pointercancel(
      node: HTMLElement,
      eventName: pointercancel,
      handler: TaggedEventHandler[pointercancel],
      options: Boolean
    ): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_pointercancel(
      node: HTMLElement,
      eventName: pointercancel,
      handler: TaggedEventHandler[pointercancel],
      options: EventListenerOptions
    ): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_pointerdown(node: HTMLElement, eventName: pointerdown, handler: TaggedEventHandler[pointerdown]): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_pointerdown(
      node: HTMLElement,
      eventName: pointerdown,
      handler: TaggedEventHandler[pointerdown],
      options: Boolean
    ): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_pointerdown(
      node: HTMLElement,
      eventName: pointerdown,
      handler: TaggedEventHandler[pointerdown],
      options: EventListenerOptions
    ): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_pointerenter(node: HTMLElement, eventName: pointerenter, handler: TaggedEventHandler[pointerenter]): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_pointerenter(
      node: HTMLElement,
      eventName: pointerenter,
      handler: TaggedEventHandler[pointerenter],
      options: Boolean
    ): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_pointerenter(
      node: HTMLElement,
      eventName: pointerenter,
      handler: TaggedEventHandler[pointerenter],
      options: EventListenerOptions
    ): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_pointerleave(node: HTMLElement, eventName: pointerleave, handler: TaggedEventHandler[pointerleave]): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_pointerleave(
      node: HTMLElement,
      eventName: pointerleave,
      handler: TaggedEventHandler[pointerleave],
      options: Boolean
    ): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_pointerleave(
      node: HTMLElement,
      eventName: pointerleave,
      handler: TaggedEventHandler[pointerleave],
      options: EventListenerOptions
    ): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_pointermove(node: HTMLElement, eventName: pointermove, handler: TaggedEventHandler[pointermove]): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_pointermove(
      node: HTMLElement,
      eventName: pointermove,
      handler: TaggedEventHandler[pointermove],
      options: Boolean
    ): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_pointermove(
      node: HTMLElement,
      eventName: pointermove,
      handler: TaggedEventHandler[pointermove],
      options: EventListenerOptions
    ): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_pointerout(node: HTMLElement, eventName: pointerout, handler: TaggedEventHandler[pointerout]): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_pointerout(
      node: HTMLElement,
      eventName: pointerout,
      handler: TaggedEventHandler[pointerout],
      options: Boolean
    ): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_pointerout(
      node: HTMLElement,
      eventName: pointerout,
      handler: TaggedEventHandler[pointerout],
      options: EventListenerOptions
    ): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_pointerover(node: HTMLElement, eventName: pointerover, handler: TaggedEventHandler[pointerover]): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_pointerover(
      node: HTMLElement,
      eventName: pointerover,
      handler: TaggedEventHandler[pointerover],
      options: Boolean
    ): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_pointerover(
      node: HTMLElement,
      eventName: pointerover,
      handler: TaggedEventHandler[pointerover],
      options: EventListenerOptions
    ): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_pointerup(node: HTMLElement, eventName: pointerup, handler: TaggedEventHandler[pointerup]): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_pointerup(node: HTMLElement, eventName: pointerup, handler: TaggedEventHandler[pointerup], options: Boolean): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_pointerup(
      node: HTMLElement,
      eventName: pointerup,
      handler: TaggedEventHandler[pointerup],
      options: EventListenerOptions
    ): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_progress(node: HTMLElement, eventName: progress, handler: TaggedEventHandler[progress]): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_progress(node: HTMLElement, eventName: progress, handler: TaggedEventHandler[progress], options: Boolean): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_progress(
      node: HTMLElement,
      eventName: progress,
      handler: TaggedEventHandler[progress],
      options: EventListenerOptions
    ): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_ratechange(node: HTMLElement, eventName: ratechange, handler: TaggedEventHandler[ratechange]): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_ratechange(
      node: HTMLElement,
      eventName: ratechange,
      handler: TaggedEventHandler[ratechange],
      options: Boolean
    ): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_ratechange(
      node: HTMLElement,
      eventName: ratechange,
      handler: TaggedEventHandler[ratechange],
      options: EventListenerOptions
    ): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_reset(node: HTMLElement, eventName: reset, handler: TaggedEventHandler[reset]): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_reset(node: HTMLElement, eventName: reset, handler: TaggedEventHandler[reset], options: Boolean): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_reset(
      node: HTMLElement,
      eventName: reset,
      handler: TaggedEventHandler[reset],
      options: EventListenerOptions
    ): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_resize(node: HTMLElement, eventName: resize, handler: TaggedEventHandler[resize]): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_resize(node: HTMLElement, eventName: resize, handler: TaggedEventHandler[resize], options: Boolean): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_resize(
      node: HTMLElement,
      eventName: resize,
      handler: TaggedEventHandler[resize],
      options: EventListenerOptions
    ): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_scroll(node: HTMLElement, eventName: scroll, handler: TaggedEventHandler[scroll]): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_scroll(node: HTMLElement, eventName: scroll, handler: TaggedEventHandler[scroll], options: Boolean): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_scroll(
      node: HTMLElement,
      eventName: scroll,
      handler: TaggedEventHandler[scroll],
      options: EventListenerOptions
    ): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_securitypolicyviolation(
      node: HTMLElement,
      eventName: securitypolicyviolation,
      handler: TaggedEventHandler[securitypolicyviolation]
    ): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_securitypolicyviolation(
      node: HTMLElement,
      eventName: securitypolicyviolation,
      handler: TaggedEventHandler[securitypolicyviolation],
      options: Boolean
    ): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_securitypolicyviolation(
      node: HTMLElement,
      eventName: securitypolicyviolation,
      handler: TaggedEventHandler[securitypolicyviolation],
      options: EventListenerOptions
    ): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_seeked(node: HTMLElement, eventName: seeked, handler: TaggedEventHandler[seeked]): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_seeked(node: HTMLElement, eventName: seeked, handler: TaggedEventHandler[seeked], options: Boolean): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_seeked(
      node: HTMLElement,
      eventName: seeked,
      handler: TaggedEventHandler[seeked],
      options: EventListenerOptions
    ): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_seeking(node: HTMLElement, eventName: seeking, handler: TaggedEventHandler[seeking]): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_seeking(node: HTMLElement, eventName: seeking, handler: TaggedEventHandler[seeking], options: Boolean): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_seeking(
      node: HTMLElement,
      eventName: seeking,
      handler: TaggedEventHandler[seeking],
      options: EventListenerOptions
    ): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_select(node: HTMLElement, eventName: select, handler: TaggedEventHandler[select]): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_select(node: HTMLElement, eventName: select, handler: TaggedEventHandler[select], options: Boolean): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_select(
      node: HTMLElement,
      eventName: select,
      handler: TaggedEventHandler[select],
      options: EventListenerOptions
    ): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_selectionchange(node: HTMLElement, eventName: selectionchange, handler: TaggedEventHandler[selectionchange]): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_selectionchange(
      node: HTMLElement,
      eventName: selectionchange,
      handler: TaggedEventHandler[selectionchange],
      options: Boolean
    ): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_selectionchange(
      node: HTMLElement,
      eventName: selectionchange,
      handler: TaggedEventHandler[selectionchange],
      options: EventListenerOptions
    ): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_selectstart(node: HTMLElement, eventName: selectstart, handler: TaggedEventHandler[selectstart]): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_selectstart(
      node: HTMLElement,
      eventName: selectstart,
      handler: TaggedEventHandler[selectstart],
      options: Boolean
    ): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_selectstart(
      node: HTMLElement,
      eventName: selectstart,
      handler: TaggedEventHandler[selectstart],
      options: EventListenerOptions
    ): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_stalled(node: HTMLElement, eventName: stalled, handler: TaggedEventHandler[stalled]): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_stalled(node: HTMLElement, eventName: stalled, handler: TaggedEventHandler[stalled], options: Boolean): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_stalled(
      node: HTMLElement,
      eventName: stalled,
      handler: TaggedEventHandler[stalled],
      options: EventListenerOptions
    ): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_submit(node: HTMLElement, eventName: submit, handler: TaggedEventHandler[submit]): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_submit(node: HTMLElement, eventName: submit, handler: TaggedEventHandler[submit], options: Boolean): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_submit(
      node: HTMLElement,
      eventName: submit,
      handler: TaggedEventHandler[submit],
      options: EventListenerOptions
    ): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_suspend(node: HTMLElement, eventName: suspend, handler: TaggedEventHandler[suspend]): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_suspend(node: HTMLElement, eventName: suspend, handler: TaggedEventHandler[suspend], options: Boolean): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_suspend(
      node: HTMLElement,
      eventName: suspend,
      handler: TaggedEventHandler[suspend],
      options: EventListenerOptions
    ): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_timeupdate(node: HTMLElement, eventName: timeupdate, handler: TaggedEventHandler[timeupdate]): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_timeupdate(
      node: HTMLElement,
      eventName: timeupdate,
      handler: TaggedEventHandler[timeupdate],
      options: Boolean
    ): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_timeupdate(
      node: HTMLElement,
      eventName: timeupdate,
      handler: TaggedEventHandler[timeupdate],
      options: EventListenerOptions
    ): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_toggle(node: HTMLElement, eventName: toggle, handler: TaggedEventHandler[toggle]): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_toggle(node: HTMLElement, eventName: toggle, handler: TaggedEventHandler[toggle], options: Boolean): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_toggle(
      node: HTMLElement,
      eventName: toggle,
      handler: TaggedEventHandler[toggle],
      options: EventListenerOptions
    ): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_touchcancel(node: HTMLElement, eventName: touchcancel, handler: TaggedEventHandler[touchcancel]): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_touchcancel(
      node: HTMLElement,
      eventName: touchcancel,
      handler: TaggedEventHandler[touchcancel],
      options: Boolean
    ): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_touchcancel(
      node: HTMLElement,
      eventName: touchcancel,
      handler: TaggedEventHandler[touchcancel],
      options: EventListenerOptions
    ): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_touchend(node: HTMLElement, eventName: touchend, handler: TaggedEventHandler[touchend]): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_touchend(node: HTMLElement, eventName: touchend, handler: TaggedEventHandler[touchend], options: Boolean): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_touchend(
      node: HTMLElement,
      eventName: touchend,
      handler: TaggedEventHandler[touchend],
      options: EventListenerOptions
    ): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_touchmove(node: HTMLElement, eventName: touchmove, handler: TaggedEventHandler[touchmove]): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_touchmove(node: HTMLElement, eventName: touchmove, handler: TaggedEventHandler[touchmove], options: Boolean): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_touchmove(
      node: HTMLElement,
      eventName: touchmove,
      handler: TaggedEventHandler[touchmove],
      options: EventListenerOptions
    ): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_touchstart(node: HTMLElement, eventName: touchstart, handler: TaggedEventHandler[touchstart]): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_touchstart(
      node: HTMLElement,
      eventName: touchstart,
      handler: TaggedEventHandler[touchstart],
      options: Boolean
    ): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_touchstart(
      node: HTMLElement,
      eventName: touchstart,
      handler: TaggedEventHandler[touchstart],
      options: EventListenerOptions
    ): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_transitioncancel(node: HTMLElement, eventName: transitioncancel, handler: TaggedEventHandler[transitioncancel]): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_transitioncancel(
      node: HTMLElement,
      eventName: transitioncancel,
      handler: TaggedEventHandler[transitioncancel],
      options: Boolean
    ): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_transitioncancel(
      node: HTMLElement,
      eventName: transitioncancel,
      handler: TaggedEventHandler[transitioncancel],
      options: EventListenerOptions
    ): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_transitionend(node: HTMLElement, eventName: transitionend, handler: TaggedEventHandler[transitionend]): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_transitionend(
      node: HTMLElement,
      eventName: transitionend,
      handler: TaggedEventHandler[transitionend],
      options: Boolean
    ): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_transitionend(
      node: HTMLElement,
      eventName: transitionend,
      handler: TaggedEventHandler[transitionend],
      options: EventListenerOptions
    ): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_transitionrun(node: HTMLElement, eventName: transitionrun, handler: TaggedEventHandler[transitionrun]): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_transitionrun(
      node: HTMLElement,
      eventName: transitionrun,
      handler: TaggedEventHandler[transitionrun],
      options: Boolean
    ): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_transitionrun(
      node: HTMLElement,
      eventName: transitionrun,
      handler: TaggedEventHandler[transitionrun],
      options: EventListenerOptions
    ): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_transitionstart(node: HTMLElement, eventName: transitionstart, handler: TaggedEventHandler[transitionstart]): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_transitionstart(
      node: HTMLElement,
      eventName: transitionstart,
      handler: TaggedEventHandler[transitionstart],
      options: Boolean
    ): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_transitionstart(
      node: HTMLElement,
      eventName: transitionstart,
      handler: TaggedEventHandler[transitionstart],
      options: EventListenerOptions
    ): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_volumechange(node: HTMLElement, eventName: volumechange, handler: TaggedEventHandler[volumechange]): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_volumechange(
      node: HTMLElement,
      eventName: volumechange,
      handler: TaggedEventHandler[volumechange],
      options: Boolean
    ): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_volumechange(
      node: HTMLElement,
      eventName: volumechange,
      handler: TaggedEventHandler[volumechange],
      options: EventListenerOptions
    ): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_waiting(node: HTMLElement, eventName: waiting, handler: TaggedEventHandler[waiting]): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_waiting(node: HTMLElement, eventName: waiting, handler: TaggedEventHandler[waiting], options: Boolean): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_waiting(
      node: HTMLElement,
      eventName: waiting,
      handler: TaggedEventHandler[waiting],
      options: EventListenerOptions
    ): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_wheel(node: HTMLElement, eventName: wheel, handler: TaggedEventHandler[wheel]): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_wheel(node: HTMLElement, eventName: wheel, handler: TaggedEventHandler[wheel], options: Boolean): Unit = js.native
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener_wheel(
      node: HTMLElement,
      eventName: wheel,
      handler: TaggedEventHandler[wheel],
      options: EventListenerOptions
    ): Unit = js.native
    
    @JSImport("dom-helpers", "default.requestAnimationFrame")
    @js.native
    def requestAnimationFrame: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof globalThis.requestAnimationFrame */ js.Any = js.native
    @scala.inline
    def requestAnimationFrame_=(
      x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof globalThis.requestAnimationFrame */ js.Any
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("requestAnimationFrame")(x.asInstanceOf[js.Any])
    
    @JSImport("dom-helpers", "default.scrollLeft")
    @js.native
    def scrollLeft(node: Element): Double = js.native
    @JSImport("dom-helpers", "default.scrollLeft")
    @js.native
    def scrollLeft(node: Element, `val`: Double): js.UndefOr[scala.Nothing] = js.native
    
    @JSImport("dom-helpers", "default.scrollParent")
    @js.native
    def scrollParent: js.Function2[
        /* element */ HTMLElement, 
        /* firstPossible */ js.UndefOr[Boolean], 
        Document | HTMLElement
      ] = js.native
    @JSImport("dom-helpers", "default.scrollParent")
    @js.native
    def scrollParent(element: HTMLElement): Document | HTMLElement = js.native
    @JSImport("dom-helpers", "default.scrollParent")
    @js.native
    def scrollParent(element: HTMLElement, firstPossible: Boolean): Document | HTMLElement = js.native
    @scala.inline
    def scrollParent_=(
      x: js.Function2[
          /* element */ HTMLElement, 
          /* firstPossible */ js.UndefOr[Boolean], 
          Document | HTMLElement
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("scrollParent")(x.asInstanceOf[js.Any])
    
    @JSImport("dom-helpers", "default.scrollTo")
    @js.native
    def scrollTo: js.Function2[
        /* selected */ HTMLElement, 
        /* scrollParent */ js.UndefOr[HTMLElement], 
        js.UndefOr[js.Function0[Unit]]
      ] = js.native
    @JSImport("dom-helpers", "default.scrollTo")
    @js.native
    def scrollTo(selected: HTMLElement): js.UndefOr[js.Function0[Unit]] = js.native
    @JSImport("dom-helpers", "default.scrollTo")
    @js.native
    def scrollTo(selected: HTMLElement, scrollParent: HTMLElement): js.UndefOr[js.Function0[Unit]] = js.native
    @scala.inline
    def scrollTo_=(
      x: js.Function2[
          /* selected */ HTMLElement, 
          /* scrollParent */ js.UndefOr[HTMLElement], 
          js.UndefOr[js.Function0[Unit]]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("scrollTo")(x.asInstanceOf[js.Any])
    
    @JSImport("dom-helpers", "default.scrollTop")
    @js.native
    def scrollTop(node: Element): Double = js.native
    @JSImport("dom-helpers", "default.scrollTop")
    @js.native
    def scrollTop(node: Element, `val`: Double): js.UndefOr[scala.Nothing] = js.native
    
    @JSImport("dom-helpers", "default.scrollbarSize")
    @js.native
    def scrollbarSize(): Double = js.native
    @JSImport("dom-helpers", "default.scrollbarSize")
    @js.native
    def scrollbarSize(recalc: Boolean): Double = js.native
    @JSImport("dom-helpers", "default.scrollbarSize")
    @js.native
    def scrollbarSize_Fdefault: js.Function1[/* recalc */ js.UndefOr[Boolean], Double] = js.native
    
    @scala.inline
    def scrollbarSize_Fdefault_=(x: js.Function1[/* recalc */ js.UndefOr[Boolean], Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("scrollbarSize")(x.asInstanceOf[js.Any])
    
    @JSImport("dom-helpers", "default.style")
    @js.native
    def style: FnCallNodeProperty = js.native
    @JSImport("dom-helpers", "default.style")
    @js.native
    def style(node: HTMLElement, property: PartialRecordPropertystri): Unit = js.native
    @JSImport("dom-helpers", "default.style")
    @js.native
    def style[T /* <: HyphenProperty */](node: HTMLElement, property: T): /* import warning: importer.ImportType#apply Failed type conversion: csstype.csstype.PropertiesHyphen<string | 0>[T] */ js.Any = js.native
    @scala.inline
    def style_=(x: FnCallNodeProperty): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("style")(x.asInstanceOf[js.Any])
    @JSImport("dom-helpers", "default.style")
    @js.native
    def style_T_CamelProperty[T /* <: CamelProperty */](node: HTMLElement, property: T): /* import warning: importer.ImportType#apply Failed type conversion: csstype.csstype.Properties<string | 0>[T] */ js.Any = js.native
    
    @JSImport("dom-helpers", "default.toggleClass")
    @js.native
    def toggleClass: js.Function2[/* element */ Element | SVGElement, /* className */ String, Unit] = js.native
    @JSImport("dom-helpers", "default.toggleClass")
    @js.native
    def toggleClass(element: Element, className: String): Unit = js.native
    @JSImport("dom-helpers", "default.toggleClass")
    @js.native
    def toggleClass(element: SVGElement, className: String): Unit = js.native
    @scala.inline
    def toggleClass_=(x: js.Function2[/* element */ Element | SVGElement, /* className */ String, Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("toggleClass")(x.asInstanceOf[js.Any])
    
    @JSImport("dom-helpers", "default.transitionEnd")
    @js.native
    def transitionEnd: js.Function4[
        /* element */ HTMLElement, 
        /* handler */ Listener, 
        /* duration */ js.UndefOr[Double | Null], 
        /* padding */ js.UndefOr[Double], 
        js.Function0[Unit]
      ] = js.native
    @JSImport("dom-helpers", "default.transitionEnd")
    @js.native
    def transitionEnd(element: HTMLElement, handler: Listener): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.transitionEnd")
    @js.native
    def transitionEnd(element: HTMLElement, handler: Listener, duration: js.UndefOr[scala.Nothing], padding: Double): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.transitionEnd")
    @js.native
    def transitionEnd(element: HTMLElement, handler: Listener, duration: Double): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.transitionEnd")
    @js.native
    def transitionEnd(element: HTMLElement, handler: Listener, duration: Double, padding: Double): js.Function0[Unit] = js.native
    @JSImport("dom-helpers", "default.transitionEnd")
    @js.native
    def transitionEnd(element: HTMLElement, handler: Listener, duration: Null, padding: Double): js.Function0[Unit] = js.native
    @scala.inline
    def transitionEnd_=(
      x: js.Function4[
          /* element */ HTMLElement, 
          /* handler */ Listener, 
          /* duration */ js.UndefOr[Double | Null], 
          /* padding */ js.UndefOr[Double], 
          js.Function0[Unit]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("transitionEnd")(x.asInstanceOf[js.Any])
    
    @JSImport("dom-helpers", "default.width")
    @js.native
    def width: js.Function2[/* node */ HTMLElement, /* client */ js.UndefOr[Boolean], Double] = js.native
    @JSImport("dom-helpers", "default.width")
    @js.native
    def width(node: HTMLElement): Double = js.native
    @JSImport("dom-helpers", "default.width")
    @js.native
    def width(node: HTMLElement, client: Boolean): Double = js.native
    @scala.inline
    def width_=(x: js.Function2[/* node */ HTMLElement, /* client */ js.UndefOr[Boolean], Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("width")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("dom-helpers", "activeElement")
  @js.native
  def activeElement(): Element | Null = js.native
  @JSImport("dom-helpers", "activeElement")
  @js.native
  def activeElement(doc: Document): Element | Null = js.native
  
  @JSImport("dom-helpers", "addClass")
  @js.native
  def addClass(element: Element, className: String): Unit = js.native
  @JSImport("dom-helpers", "addClass")
  @js.native
  def addClass(element: SVGElement, className: String): Unit = js.native
  
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_abort(node: HTMLElement, eventName: abort, handler: TaggedEventHandler[abort]): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_abort(node: HTMLElement, eventName: abort, handler: TaggedEventHandler[abort], options: Boolean): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_abort(
    node: HTMLElement,
    eventName: abort,
    handler: TaggedEventHandler[abort],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_animationcancel(node: HTMLElement, eventName: animationcancel, handler: TaggedEventHandler[animationcancel]): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_animationcancel(
    node: HTMLElement,
    eventName: animationcancel,
    handler: TaggedEventHandler[animationcancel],
    options: Boolean
  ): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_animationcancel(
    node: HTMLElement,
    eventName: animationcancel,
    handler: TaggedEventHandler[animationcancel],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_animationend(node: HTMLElement, eventName: animationend, handler: TaggedEventHandler[animationend]): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_animationend(
    node: HTMLElement,
    eventName: animationend,
    handler: TaggedEventHandler[animationend],
    options: Boolean
  ): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_animationend(
    node: HTMLElement,
    eventName: animationend,
    handler: TaggedEventHandler[animationend],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_animationiteration(node: HTMLElement, eventName: animationiteration, handler: TaggedEventHandler[animationiteration]): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_animationiteration(
    node: HTMLElement,
    eventName: animationiteration,
    handler: TaggedEventHandler[animationiteration],
    options: Boolean
  ): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_animationiteration(
    node: HTMLElement,
    eventName: animationiteration,
    handler: TaggedEventHandler[animationiteration],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_animationstart(node: HTMLElement, eventName: animationstart, handler: TaggedEventHandler[animationstart]): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_animationstart(
    node: HTMLElement,
    eventName: animationstart,
    handler: TaggedEventHandler[animationstart],
    options: Boolean
  ): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_animationstart(
    node: HTMLElement,
    eventName: animationstart,
    handler: TaggedEventHandler[animationstart],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_auxclick(node: HTMLElement, eventName: auxclick, handler: TaggedEventHandler[auxclick]): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_auxclick(node: HTMLElement, eventName: auxclick, handler: TaggedEventHandler[auxclick], options: Boolean): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_auxclick(
    node: HTMLElement,
    eventName: auxclick,
    handler: TaggedEventHandler[auxclick],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_blur(node: HTMLElement, eventName: blur, handler: TaggedEventHandler[blur]): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_blur(node: HTMLElement, eventName: blur, handler: TaggedEventHandler[blur], options: Boolean): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_blur(
    node: HTMLElement,
    eventName: blur,
    handler: TaggedEventHandler[blur],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_cancel(node: HTMLElement, eventName: cancel, handler: TaggedEventHandler[cancel]): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_cancel(node: HTMLElement, eventName: cancel, handler: TaggedEventHandler[cancel], options: Boolean): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_cancel(
    node: HTMLElement,
    eventName: cancel,
    handler: TaggedEventHandler[cancel],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_canplay(node: HTMLElement, eventName: canplay, handler: TaggedEventHandler[canplay]): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_canplay(node: HTMLElement, eventName: canplay, handler: TaggedEventHandler[canplay], options: Boolean): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_canplay(
    node: HTMLElement,
    eventName: canplay,
    handler: TaggedEventHandler[canplay],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_canplaythrough(node: HTMLElement, eventName: canplaythrough, handler: TaggedEventHandler[canplaythrough]): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_canplaythrough(
    node: HTMLElement,
    eventName: canplaythrough,
    handler: TaggedEventHandler[canplaythrough],
    options: Boolean
  ): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_canplaythrough(
    node: HTMLElement,
    eventName: canplaythrough,
    handler: TaggedEventHandler[canplaythrough],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_change(node: HTMLElement, eventName: change, handler: TaggedEventHandler[change]): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_change(node: HTMLElement, eventName: change, handler: TaggedEventHandler[change], options: Boolean): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_change(
    node: HTMLElement,
    eventName: change,
    handler: TaggedEventHandler[change],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_click(node: HTMLElement, eventName: click, handler: TaggedEventHandler[click]): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_click(node: HTMLElement, eventName: click, handler: TaggedEventHandler[click], options: Boolean): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_click(
    node: HTMLElement,
    eventName: click,
    handler: TaggedEventHandler[click],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_close(node: HTMLElement, eventName: close, handler: TaggedEventHandler[close]): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_close(node: HTMLElement, eventName: close, handler: TaggedEventHandler[close], options: Boolean): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_close(
    node: HTMLElement,
    eventName: close,
    handler: TaggedEventHandler[close],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_contextmenu(node: HTMLElement, eventName: contextmenu, handler: TaggedEventHandler[contextmenu]): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_contextmenu(
    node: HTMLElement,
    eventName: contextmenu,
    handler: TaggedEventHandler[contextmenu],
    options: Boolean
  ): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_contextmenu(
    node: HTMLElement,
    eventName: contextmenu,
    handler: TaggedEventHandler[contextmenu],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_copy(node: HTMLElement, eventName: copy, handler: TaggedEventHandler[copy]): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_copy(node: HTMLElement, eventName: copy, handler: TaggedEventHandler[copy], options: Boolean): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_copy(
    node: HTMLElement,
    eventName: copy,
    handler: TaggedEventHandler[copy],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_cuechange(node: HTMLElement, eventName: cuechange, handler: TaggedEventHandler[cuechange]): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_cuechange(node: HTMLElement, eventName: cuechange, handler: TaggedEventHandler[cuechange], options: Boolean): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_cuechange(
    node: HTMLElement,
    eventName: cuechange,
    handler: TaggedEventHandler[cuechange],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_cut(node: HTMLElement, eventName: cut, handler: TaggedEventHandler[cut]): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_cut(node: HTMLElement, eventName: cut, handler: TaggedEventHandler[cut], options: Boolean): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_cut(
    node: HTMLElement,
    eventName: cut,
    handler: TaggedEventHandler[cut],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_dblclick(node: HTMLElement, eventName: dblclick, handler: TaggedEventHandler[dblclick]): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_dblclick(node: HTMLElement, eventName: dblclick, handler: TaggedEventHandler[dblclick], options: Boolean): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_dblclick(
    node: HTMLElement,
    eventName: dblclick,
    handler: TaggedEventHandler[dblclick],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_drag(node: HTMLElement, eventName: drag, handler: TaggedEventHandler[drag]): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_drag(node: HTMLElement, eventName: drag, handler: TaggedEventHandler[drag], options: Boolean): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_drag(
    node: HTMLElement,
    eventName: drag,
    handler: TaggedEventHandler[drag],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_dragend(node: HTMLElement, eventName: dragend, handler: TaggedEventHandler[dragend]): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_dragend(node: HTMLElement, eventName: dragend, handler: TaggedEventHandler[dragend], options: Boolean): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_dragend(
    node: HTMLElement,
    eventName: dragend,
    handler: TaggedEventHandler[dragend],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_dragenter(node: HTMLElement, eventName: dragenter, handler: TaggedEventHandler[dragenter]): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_dragenter(node: HTMLElement, eventName: dragenter, handler: TaggedEventHandler[dragenter], options: Boolean): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_dragenter(
    node: HTMLElement,
    eventName: dragenter,
    handler: TaggedEventHandler[dragenter],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_dragexit(node: HTMLElement, eventName: dragexit, handler: TaggedEventHandler[dragexit]): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_dragexit(node: HTMLElement, eventName: dragexit, handler: TaggedEventHandler[dragexit], options: Boolean): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_dragexit(
    node: HTMLElement,
    eventName: dragexit,
    handler: TaggedEventHandler[dragexit],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_dragleave(node: HTMLElement, eventName: dragleave, handler: TaggedEventHandler[dragleave]): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_dragleave(node: HTMLElement, eventName: dragleave, handler: TaggedEventHandler[dragleave], options: Boolean): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_dragleave(
    node: HTMLElement,
    eventName: dragleave,
    handler: TaggedEventHandler[dragleave],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_dragover(node: HTMLElement, eventName: dragover, handler: TaggedEventHandler[dragover]): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_dragover(node: HTMLElement, eventName: dragover, handler: TaggedEventHandler[dragover], options: Boolean): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_dragover(
    node: HTMLElement,
    eventName: dragover,
    handler: TaggedEventHandler[dragover],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_dragstart(node: HTMLElement, eventName: dragstart, handler: TaggedEventHandler[dragstart]): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_dragstart(node: HTMLElement, eventName: dragstart, handler: TaggedEventHandler[dragstart], options: Boolean): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_dragstart(
    node: HTMLElement,
    eventName: dragstart,
    handler: TaggedEventHandler[dragstart],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_drop(node: HTMLElement, eventName: drop, handler: TaggedEventHandler[drop]): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_drop(node: HTMLElement, eventName: drop, handler: TaggedEventHandler[drop], options: Boolean): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_drop(
    node: HTMLElement,
    eventName: drop,
    handler: TaggedEventHandler[drop],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_durationchange(node: HTMLElement, eventName: durationchange, handler: TaggedEventHandler[durationchange]): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_durationchange(
    node: HTMLElement,
    eventName: durationchange,
    handler: TaggedEventHandler[durationchange],
    options: Boolean
  ): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_durationchange(
    node: HTMLElement,
    eventName: durationchange,
    handler: TaggedEventHandler[durationchange],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_emptied(node: HTMLElement, eventName: emptied, handler: TaggedEventHandler[emptied]): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_emptied(node: HTMLElement, eventName: emptied, handler: TaggedEventHandler[emptied], options: Boolean): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_emptied(
    node: HTMLElement,
    eventName: emptied,
    handler: TaggedEventHandler[emptied],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_ended(node: HTMLElement, eventName: ended, handler: TaggedEventHandler[ended]): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_ended(node: HTMLElement, eventName: ended, handler: TaggedEventHandler[ended], options: Boolean): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_ended(
    node: HTMLElement,
    eventName: ended,
    handler: TaggedEventHandler[ended],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_error(node: HTMLElement, eventName: error, handler: TaggedEventHandler[error]): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_error(node: HTMLElement, eventName: error, handler: TaggedEventHandler[error], options: Boolean): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_error(
    node: HTMLElement,
    eventName: error,
    handler: TaggedEventHandler[error],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_focus(node: HTMLElement, eventName: focus, handler: TaggedEventHandler[focus]): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_focus(node: HTMLElement, eventName: focus, handler: TaggedEventHandler[focus], options: Boolean): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_focus(
    node: HTMLElement,
    eventName: focus,
    handler: TaggedEventHandler[focus],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_focusin(node: HTMLElement, eventName: focusin, handler: TaggedEventHandler[focusin]): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_focusin(node: HTMLElement, eventName: focusin, handler: TaggedEventHandler[focusin], options: Boolean): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_focusin(
    node: HTMLElement,
    eventName: focusin,
    handler: TaggedEventHandler[focusin],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_focusout(node: HTMLElement, eventName: focusout, handler: TaggedEventHandler[focusout]): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_focusout(node: HTMLElement, eventName: focusout, handler: TaggedEventHandler[focusout], options: Boolean): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_focusout(
    node: HTMLElement,
    eventName: focusout,
    handler: TaggedEventHandler[focusout],
    options: AddEventListenerOptions
  ): Unit = js.native
  /**
    * An `addEventListener` ponyfill, supports the `once` option
    */
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_fullscreenchange(node: HTMLElement, eventName: fullscreenchange, handler: TaggedEventHandler[fullscreenchange]): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_fullscreenchange(
    node: HTMLElement,
    eventName: fullscreenchange,
    handler: TaggedEventHandler[fullscreenchange],
    options: Boolean
  ): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_fullscreenchange(
    node: HTMLElement,
    eventName: fullscreenchange,
    handler: TaggedEventHandler[fullscreenchange],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_fullscreenerror(node: HTMLElement, eventName: fullscreenerror, handler: TaggedEventHandler[fullscreenerror]): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_fullscreenerror(
    node: HTMLElement,
    eventName: fullscreenerror,
    handler: TaggedEventHandler[fullscreenerror],
    options: Boolean
  ): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_fullscreenerror(
    node: HTMLElement,
    eventName: fullscreenerror,
    handler: TaggedEventHandler[fullscreenerror],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_gotpointercapture(node: HTMLElement, eventName: gotpointercapture, handler: TaggedEventHandler[gotpointercapture]): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_gotpointercapture(
    node: HTMLElement,
    eventName: gotpointercapture,
    handler: TaggedEventHandler[gotpointercapture],
    options: Boolean
  ): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_gotpointercapture(
    node: HTMLElement,
    eventName: gotpointercapture,
    handler: TaggedEventHandler[gotpointercapture],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_input(node: HTMLElement, eventName: input, handler: TaggedEventHandler[input]): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_input(node: HTMLElement, eventName: input, handler: TaggedEventHandler[input], options: Boolean): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_input(
    node: HTMLElement,
    eventName: input,
    handler: TaggedEventHandler[input],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_invalid(node: HTMLElement, eventName: invalid, handler: TaggedEventHandler[invalid]): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_invalid(node: HTMLElement, eventName: invalid, handler: TaggedEventHandler[invalid], options: Boolean): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_invalid(
    node: HTMLElement,
    eventName: invalid,
    handler: TaggedEventHandler[invalid],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_keydown(node: HTMLElement, eventName: keydown, handler: TaggedEventHandler[keydown]): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_keydown(node: HTMLElement, eventName: keydown, handler: TaggedEventHandler[keydown], options: Boolean): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_keydown(
    node: HTMLElement,
    eventName: keydown,
    handler: TaggedEventHandler[keydown],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_keypress(node: HTMLElement, eventName: keypress, handler: TaggedEventHandler[keypress]): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_keypress(node: HTMLElement, eventName: keypress, handler: TaggedEventHandler[keypress], options: Boolean): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_keypress(
    node: HTMLElement,
    eventName: keypress,
    handler: TaggedEventHandler[keypress],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_keyup(node: HTMLElement, eventName: keyup, handler: TaggedEventHandler[keyup]): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_keyup(node: HTMLElement, eventName: keyup, handler: TaggedEventHandler[keyup], options: Boolean): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_keyup(
    node: HTMLElement,
    eventName: keyup,
    handler: TaggedEventHandler[keyup],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_load(node: HTMLElement, eventName: load, handler: TaggedEventHandler[load]): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_load(node: HTMLElement, eventName: load, handler: TaggedEventHandler[load], options: Boolean): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_load(
    node: HTMLElement,
    eventName: load,
    handler: TaggedEventHandler[load],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_loadeddata(node: HTMLElement, eventName: loadeddata, handler: TaggedEventHandler[loadeddata]): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_loadeddata(
    node: HTMLElement,
    eventName: loadeddata,
    handler: TaggedEventHandler[loadeddata],
    options: Boolean
  ): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_loadeddata(
    node: HTMLElement,
    eventName: loadeddata,
    handler: TaggedEventHandler[loadeddata],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_loadedmetadata(node: HTMLElement, eventName: loadedmetadata, handler: TaggedEventHandler[loadedmetadata]): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_loadedmetadata(
    node: HTMLElement,
    eventName: loadedmetadata,
    handler: TaggedEventHandler[loadedmetadata],
    options: Boolean
  ): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_loadedmetadata(
    node: HTMLElement,
    eventName: loadedmetadata,
    handler: TaggedEventHandler[loadedmetadata],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_loadstart(node: HTMLElement, eventName: loadstart, handler: TaggedEventHandler[loadstart]): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_loadstart(node: HTMLElement, eventName: loadstart, handler: TaggedEventHandler[loadstart], options: Boolean): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_loadstart(
    node: HTMLElement,
    eventName: loadstart,
    handler: TaggedEventHandler[loadstart],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_lostpointercapture(node: HTMLElement, eventName: lostpointercapture, handler: TaggedEventHandler[lostpointercapture]): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_lostpointercapture(
    node: HTMLElement,
    eventName: lostpointercapture,
    handler: TaggedEventHandler[lostpointercapture],
    options: Boolean
  ): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_lostpointercapture(
    node: HTMLElement,
    eventName: lostpointercapture,
    handler: TaggedEventHandler[lostpointercapture],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_mousedown(node: HTMLElement, eventName: mousedown, handler: TaggedEventHandler[mousedown]): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_mousedown(node: HTMLElement, eventName: mousedown, handler: TaggedEventHandler[mousedown], options: Boolean): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_mousedown(
    node: HTMLElement,
    eventName: mousedown,
    handler: TaggedEventHandler[mousedown],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_mouseenter(node: HTMLElement, eventName: mouseenter, handler: TaggedEventHandler[mouseenter]): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_mouseenter(
    node: HTMLElement,
    eventName: mouseenter,
    handler: TaggedEventHandler[mouseenter],
    options: Boolean
  ): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_mouseenter(
    node: HTMLElement,
    eventName: mouseenter,
    handler: TaggedEventHandler[mouseenter],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_mouseleave(node: HTMLElement, eventName: mouseleave, handler: TaggedEventHandler[mouseleave]): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_mouseleave(
    node: HTMLElement,
    eventName: mouseleave,
    handler: TaggedEventHandler[mouseleave],
    options: Boolean
  ): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_mouseleave(
    node: HTMLElement,
    eventName: mouseleave,
    handler: TaggedEventHandler[mouseleave],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_mousemove(node: HTMLElement, eventName: mousemove, handler: TaggedEventHandler[mousemove]): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_mousemove(node: HTMLElement, eventName: mousemove, handler: TaggedEventHandler[mousemove], options: Boolean): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_mousemove(
    node: HTMLElement,
    eventName: mousemove,
    handler: TaggedEventHandler[mousemove],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_mouseout(node: HTMLElement, eventName: mouseout, handler: TaggedEventHandler[mouseout]): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_mouseout(node: HTMLElement, eventName: mouseout, handler: TaggedEventHandler[mouseout], options: Boolean): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_mouseout(
    node: HTMLElement,
    eventName: mouseout,
    handler: TaggedEventHandler[mouseout],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_mouseover(node: HTMLElement, eventName: mouseover, handler: TaggedEventHandler[mouseover]): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_mouseover(node: HTMLElement, eventName: mouseover, handler: TaggedEventHandler[mouseover], options: Boolean): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_mouseover(
    node: HTMLElement,
    eventName: mouseover,
    handler: TaggedEventHandler[mouseover],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_mouseup(node: HTMLElement, eventName: mouseup, handler: TaggedEventHandler[mouseup]): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_mouseup(node: HTMLElement, eventName: mouseup, handler: TaggedEventHandler[mouseup], options: Boolean): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_mouseup(
    node: HTMLElement,
    eventName: mouseup,
    handler: TaggedEventHandler[mouseup],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_paste(node: HTMLElement, eventName: paste, handler: TaggedEventHandler[paste]): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_paste(node: HTMLElement, eventName: paste, handler: TaggedEventHandler[paste], options: Boolean): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_paste(
    node: HTMLElement,
    eventName: paste,
    handler: TaggedEventHandler[paste],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_pause(node: HTMLElement, eventName: pause, handler: TaggedEventHandler[pause]): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_pause(node: HTMLElement, eventName: pause, handler: TaggedEventHandler[pause], options: Boolean): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_pause(
    node: HTMLElement,
    eventName: pause,
    handler: TaggedEventHandler[pause],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_play(node: HTMLElement, eventName: play, handler: TaggedEventHandler[play]): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_play(node: HTMLElement, eventName: play, handler: TaggedEventHandler[play], options: Boolean): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_play(
    node: HTMLElement,
    eventName: play,
    handler: TaggedEventHandler[play],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_playing(node: HTMLElement, eventName: playing, handler: TaggedEventHandler[playing]): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_playing(node: HTMLElement, eventName: playing, handler: TaggedEventHandler[playing], options: Boolean): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_playing(
    node: HTMLElement,
    eventName: playing,
    handler: TaggedEventHandler[playing],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_pointercancel(node: HTMLElement, eventName: pointercancel, handler: TaggedEventHandler[pointercancel]): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_pointercancel(
    node: HTMLElement,
    eventName: pointercancel,
    handler: TaggedEventHandler[pointercancel],
    options: Boolean
  ): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_pointercancel(
    node: HTMLElement,
    eventName: pointercancel,
    handler: TaggedEventHandler[pointercancel],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_pointerdown(node: HTMLElement, eventName: pointerdown, handler: TaggedEventHandler[pointerdown]): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_pointerdown(
    node: HTMLElement,
    eventName: pointerdown,
    handler: TaggedEventHandler[pointerdown],
    options: Boolean
  ): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_pointerdown(
    node: HTMLElement,
    eventName: pointerdown,
    handler: TaggedEventHandler[pointerdown],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_pointerenter(node: HTMLElement, eventName: pointerenter, handler: TaggedEventHandler[pointerenter]): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_pointerenter(
    node: HTMLElement,
    eventName: pointerenter,
    handler: TaggedEventHandler[pointerenter],
    options: Boolean
  ): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_pointerenter(
    node: HTMLElement,
    eventName: pointerenter,
    handler: TaggedEventHandler[pointerenter],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_pointerleave(node: HTMLElement, eventName: pointerleave, handler: TaggedEventHandler[pointerleave]): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_pointerleave(
    node: HTMLElement,
    eventName: pointerleave,
    handler: TaggedEventHandler[pointerleave],
    options: Boolean
  ): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_pointerleave(
    node: HTMLElement,
    eventName: pointerleave,
    handler: TaggedEventHandler[pointerleave],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_pointermove(node: HTMLElement, eventName: pointermove, handler: TaggedEventHandler[pointermove]): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_pointermove(
    node: HTMLElement,
    eventName: pointermove,
    handler: TaggedEventHandler[pointermove],
    options: Boolean
  ): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_pointermove(
    node: HTMLElement,
    eventName: pointermove,
    handler: TaggedEventHandler[pointermove],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_pointerout(node: HTMLElement, eventName: pointerout, handler: TaggedEventHandler[pointerout]): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_pointerout(
    node: HTMLElement,
    eventName: pointerout,
    handler: TaggedEventHandler[pointerout],
    options: Boolean
  ): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_pointerout(
    node: HTMLElement,
    eventName: pointerout,
    handler: TaggedEventHandler[pointerout],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_pointerover(node: HTMLElement, eventName: pointerover, handler: TaggedEventHandler[pointerover]): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_pointerover(
    node: HTMLElement,
    eventName: pointerover,
    handler: TaggedEventHandler[pointerover],
    options: Boolean
  ): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_pointerover(
    node: HTMLElement,
    eventName: pointerover,
    handler: TaggedEventHandler[pointerover],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_pointerup(node: HTMLElement, eventName: pointerup, handler: TaggedEventHandler[pointerup]): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_pointerup(node: HTMLElement, eventName: pointerup, handler: TaggedEventHandler[pointerup], options: Boolean): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_pointerup(
    node: HTMLElement,
    eventName: pointerup,
    handler: TaggedEventHandler[pointerup],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_progress(node: HTMLElement, eventName: progress, handler: TaggedEventHandler[progress]): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_progress(node: HTMLElement, eventName: progress, handler: TaggedEventHandler[progress], options: Boolean): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_progress(
    node: HTMLElement,
    eventName: progress,
    handler: TaggedEventHandler[progress],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_ratechange(node: HTMLElement, eventName: ratechange, handler: TaggedEventHandler[ratechange]): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_ratechange(
    node: HTMLElement,
    eventName: ratechange,
    handler: TaggedEventHandler[ratechange],
    options: Boolean
  ): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_ratechange(
    node: HTMLElement,
    eventName: ratechange,
    handler: TaggedEventHandler[ratechange],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_reset(node: HTMLElement, eventName: reset, handler: TaggedEventHandler[reset]): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_reset(node: HTMLElement, eventName: reset, handler: TaggedEventHandler[reset], options: Boolean): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_reset(
    node: HTMLElement,
    eventName: reset,
    handler: TaggedEventHandler[reset],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_resize(node: HTMLElement, eventName: resize, handler: TaggedEventHandler[resize]): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_resize(node: HTMLElement, eventName: resize, handler: TaggedEventHandler[resize], options: Boolean): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_resize(
    node: HTMLElement,
    eventName: resize,
    handler: TaggedEventHandler[resize],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_scroll(node: HTMLElement, eventName: scroll, handler: TaggedEventHandler[scroll]): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_scroll(node: HTMLElement, eventName: scroll, handler: TaggedEventHandler[scroll], options: Boolean): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_scroll(
    node: HTMLElement,
    eventName: scroll,
    handler: TaggedEventHandler[scroll],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_securitypolicyviolation(
    node: HTMLElement,
    eventName: securitypolicyviolation,
    handler: TaggedEventHandler[securitypolicyviolation]
  ): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_securitypolicyviolation(
    node: HTMLElement,
    eventName: securitypolicyviolation,
    handler: TaggedEventHandler[securitypolicyviolation],
    options: Boolean
  ): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_securitypolicyviolation(
    node: HTMLElement,
    eventName: securitypolicyviolation,
    handler: TaggedEventHandler[securitypolicyviolation],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_seeked(node: HTMLElement, eventName: seeked, handler: TaggedEventHandler[seeked]): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_seeked(node: HTMLElement, eventName: seeked, handler: TaggedEventHandler[seeked], options: Boolean): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_seeked(
    node: HTMLElement,
    eventName: seeked,
    handler: TaggedEventHandler[seeked],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_seeking(node: HTMLElement, eventName: seeking, handler: TaggedEventHandler[seeking]): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_seeking(node: HTMLElement, eventName: seeking, handler: TaggedEventHandler[seeking], options: Boolean): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_seeking(
    node: HTMLElement,
    eventName: seeking,
    handler: TaggedEventHandler[seeking],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_select(node: HTMLElement, eventName: select, handler: TaggedEventHandler[select]): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_select(node: HTMLElement, eventName: select, handler: TaggedEventHandler[select], options: Boolean): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_select(
    node: HTMLElement,
    eventName: select,
    handler: TaggedEventHandler[select],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_selectionchange(node: HTMLElement, eventName: selectionchange, handler: TaggedEventHandler[selectionchange]): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_selectionchange(
    node: HTMLElement,
    eventName: selectionchange,
    handler: TaggedEventHandler[selectionchange],
    options: Boolean
  ): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_selectionchange(
    node: HTMLElement,
    eventName: selectionchange,
    handler: TaggedEventHandler[selectionchange],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_selectstart(node: HTMLElement, eventName: selectstart, handler: TaggedEventHandler[selectstart]): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_selectstart(
    node: HTMLElement,
    eventName: selectstart,
    handler: TaggedEventHandler[selectstart],
    options: Boolean
  ): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_selectstart(
    node: HTMLElement,
    eventName: selectstart,
    handler: TaggedEventHandler[selectstart],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_stalled(node: HTMLElement, eventName: stalled, handler: TaggedEventHandler[stalled]): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_stalled(node: HTMLElement, eventName: stalled, handler: TaggedEventHandler[stalled], options: Boolean): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_stalled(
    node: HTMLElement,
    eventName: stalled,
    handler: TaggedEventHandler[stalled],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_submit(node: HTMLElement, eventName: submit, handler: TaggedEventHandler[submit]): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_submit(node: HTMLElement, eventName: submit, handler: TaggedEventHandler[submit], options: Boolean): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_submit(
    node: HTMLElement,
    eventName: submit,
    handler: TaggedEventHandler[submit],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_suspend(node: HTMLElement, eventName: suspend, handler: TaggedEventHandler[suspend]): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_suspend(node: HTMLElement, eventName: suspend, handler: TaggedEventHandler[suspend], options: Boolean): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_suspend(
    node: HTMLElement,
    eventName: suspend,
    handler: TaggedEventHandler[suspend],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_timeupdate(node: HTMLElement, eventName: timeupdate, handler: TaggedEventHandler[timeupdate]): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_timeupdate(
    node: HTMLElement,
    eventName: timeupdate,
    handler: TaggedEventHandler[timeupdate],
    options: Boolean
  ): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_timeupdate(
    node: HTMLElement,
    eventName: timeupdate,
    handler: TaggedEventHandler[timeupdate],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_toggle(node: HTMLElement, eventName: toggle, handler: TaggedEventHandler[toggle]): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_toggle(node: HTMLElement, eventName: toggle, handler: TaggedEventHandler[toggle], options: Boolean): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_toggle(
    node: HTMLElement,
    eventName: toggle,
    handler: TaggedEventHandler[toggle],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_touchcancel(node: HTMLElement, eventName: touchcancel, handler: TaggedEventHandler[touchcancel]): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_touchcancel(
    node: HTMLElement,
    eventName: touchcancel,
    handler: TaggedEventHandler[touchcancel],
    options: Boolean
  ): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_touchcancel(
    node: HTMLElement,
    eventName: touchcancel,
    handler: TaggedEventHandler[touchcancel],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_touchend(node: HTMLElement, eventName: touchend, handler: TaggedEventHandler[touchend]): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_touchend(node: HTMLElement, eventName: touchend, handler: TaggedEventHandler[touchend], options: Boolean): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_touchend(
    node: HTMLElement,
    eventName: touchend,
    handler: TaggedEventHandler[touchend],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_touchmove(node: HTMLElement, eventName: touchmove, handler: TaggedEventHandler[touchmove]): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_touchmove(node: HTMLElement, eventName: touchmove, handler: TaggedEventHandler[touchmove], options: Boolean): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_touchmove(
    node: HTMLElement,
    eventName: touchmove,
    handler: TaggedEventHandler[touchmove],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_touchstart(node: HTMLElement, eventName: touchstart, handler: TaggedEventHandler[touchstart]): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_touchstart(
    node: HTMLElement,
    eventName: touchstart,
    handler: TaggedEventHandler[touchstart],
    options: Boolean
  ): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_touchstart(
    node: HTMLElement,
    eventName: touchstart,
    handler: TaggedEventHandler[touchstart],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_transitioncancel(node: HTMLElement, eventName: transitioncancel, handler: TaggedEventHandler[transitioncancel]): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_transitioncancel(
    node: HTMLElement,
    eventName: transitioncancel,
    handler: TaggedEventHandler[transitioncancel],
    options: Boolean
  ): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_transitioncancel(
    node: HTMLElement,
    eventName: transitioncancel,
    handler: TaggedEventHandler[transitioncancel],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_transitionend(node: HTMLElement, eventName: transitionend, handler: TaggedEventHandler[transitionend]): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_transitionend(
    node: HTMLElement,
    eventName: transitionend,
    handler: TaggedEventHandler[transitionend],
    options: Boolean
  ): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_transitionend(
    node: HTMLElement,
    eventName: transitionend,
    handler: TaggedEventHandler[transitionend],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_transitionrun(node: HTMLElement, eventName: transitionrun, handler: TaggedEventHandler[transitionrun]): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_transitionrun(
    node: HTMLElement,
    eventName: transitionrun,
    handler: TaggedEventHandler[transitionrun],
    options: Boolean
  ): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_transitionrun(
    node: HTMLElement,
    eventName: transitionrun,
    handler: TaggedEventHandler[transitionrun],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_transitionstart(node: HTMLElement, eventName: transitionstart, handler: TaggedEventHandler[transitionstart]): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_transitionstart(
    node: HTMLElement,
    eventName: transitionstart,
    handler: TaggedEventHandler[transitionstart],
    options: Boolean
  ): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_transitionstart(
    node: HTMLElement,
    eventName: transitionstart,
    handler: TaggedEventHandler[transitionstart],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_volumechange(node: HTMLElement, eventName: volumechange, handler: TaggedEventHandler[volumechange]): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_volumechange(
    node: HTMLElement,
    eventName: volumechange,
    handler: TaggedEventHandler[volumechange],
    options: Boolean
  ): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_volumechange(
    node: HTMLElement,
    eventName: volumechange,
    handler: TaggedEventHandler[volumechange],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_waiting(node: HTMLElement, eventName: waiting, handler: TaggedEventHandler[waiting]): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_waiting(node: HTMLElement, eventName: waiting, handler: TaggedEventHandler[waiting], options: Boolean): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_waiting(
    node: HTMLElement,
    eventName: waiting,
    handler: TaggedEventHandler[waiting],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_wheel(node: HTMLElement, eventName: wheel, handler: TaggedEventHandler[wheel]): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_wheel(node: HTMLElement, eventName: wheel, handler: TaggedEventHandler[wheel], options: Boolean): Unit = js.native
  @JSImport("dom-helpers", "addEventListener")
  @js.native
  def addEventListener_wheel(
    node: HTMLElement,
    eventName: wheel,
    handler: TaggedEventHandler[wheel],
    options: AddEventListenerOptions
  ): Unit = js.native
  
  @JSImport("dom-helpers", "animate")
  @js.native
  def animate(node: HTMLElement, properties: AnimateProperties, duration: Double): Cancel = js.native
  @JSImport("dom-helpers", "animate")
  @js.native
  def animate(options: Options): Cancel = js.native
  @JSImport("dom-helpers", "animate")
  @js.native
  def animate_transitionend(
    node: HTMLElement,
    properties: AnimateProperties,
    duration: Double,
    callback: EventHandler[transitionend]
  ): Cancel = js.native
  @JSImport("dom-helpers", "animate")
  @js.native
  def animate_transitionend(
    node: HTMLElement,
    properties: AnimateProperties,
    duration: Double,
    easing: String,
    callback: EventHandler[transitionend]
  ): Cancel = js.native
  
  @JSImport("dom-helpers", "cancelAnimationFrame")
  @js.native
  def cancelAnimationFrame(id: Double): Unit = js.native
  
  @JSImport("dom-helpers", "closest")
  @js.native
  def closest(node: Element, selector: String): Element | Null = js.native
  @JSImport("dom-helpers", "closest")
  @js.native
  def closest(node: Element, selector: String, stopAt: Element): Element | Null = js.native
  
  @JSImport("dom-helpers", "contains")
  @js.native
  def contains(context: Element, node: Element): js.UndefOr[Boolean] = js.native
  
  @JSImport("dom-helpers", "filter")
  @js.native
  def filter_abort(selector: String, handler: EventHandler[abort]): EventHandler[abort] = js.native
  @JSImport("dom-helpers", "filter")
  @js.native
  def filter_animationcancel(selector: String, handler: EventHandler[animationcancel]): EventHandler[animationcancel] = js.native
  @JSImport("dom-helpers", "filter")
  @js.native
  def filter_animationend(selector: String, handler: EventHandler[animationend]): EventHandler[animationend] = js.native
  @JSImport("dom-helpers", "filter")
  @js.native
  def filter_animationiteration(selector: String, handler: EventHandler[animationiteration]): EventHandler[animationiteration] = js.native
  @JSImport("dom-helpers", "filter")
  @js.native
  def filter_animationstart(selector: String, handler: EventHandler[animationstart]): EventHandler[animationstart] = js.native
  @JSImport("dom-helpers", "filter")
  @js.native
  def filter_auxclick(selector: String, handler: EventHandler[auxclick]): EventHandler[auxclick] = js.native
  @JSImport("dom-helpers", "filter")
  @js.native
  def filter_blur(selector: String, handler: EventHandler[blur]): EventHandler[blur] = js.native
  @JSImport("dom-helpers", "filter")
  @js.native
  def filter_cancel(selector: String, handler: EventHandler[cancel]): EventHandler[cancel] = js.native
  @JSImport("dom-helpers", "filter")
  @js.native
  def filter_canplay(selector: String, handler: EventHandler[canplay]): EventHandler[canplay] = js.native
  @JSImport("dom-helpers", "filter")
  @js.native
  def filter_canplaythrough(selector: String, handler: EventHandler[canplaythrough]): EventHandler[canplaythrough] = js.native
  @JSImport("dom-helpers", "filter")
  @js.native
  def filter_change(selector: String, handler: EventHandler[change]): EventHandler[change] = js.native
  @JSImport("dom-helpers", "filter")
  @js.native
  def filter_click(selector: String, handler: EventHandler[click]): EventHandler[click] = js.native
  @JSImport("dom-helpers", "filter")
  @js.native
  def filter_close(selector: String, handler: EventHandler[close]): EventHandler[close] = js.native
  @JSImport("dom-helpers", "filter")
  @js.native
  def filter_contextmenu(selector: String, handler: EventHandler[contextmenu]): EventHandler[contextmenu] = js.native
  @JSImport("dom-helpers", "filter")
  @js.native
  def filter_copy(selector: String, handler: EventHandler[copy]): EventHandler[copy] = js.native
  @JSImport("dom-helpers", "filter")
  @js.native
  def filter_cuechange(selector: String, handler: EventHandler[cuechange]): EventHandler[cuechange] = js.native
  @JSImport("dom-helpers", "filter")
  @js.native
  def filter_cut(selector: String, handler: EventHandler[cut]): EventHandler[cut] = js.native
  @JSImport("dom-helpers", "filter")
  @js.native
  def filter_dblclick(selector: String, handler: EventHandler[dblclick]): EventHandler[dblclick] = js.native
  @JSImport("dom-helpers", "filter")
  @js.native
  def filter_drag(selector: String, handler: EventHandler[drag]): EventHandler[drag] = js.native
  @JSImport("dom-helpers", "filter")
  @js.native
  def filter_dragend(selector: String, handler: EventHandler[dragend]): EventHandler[dragend] = js.native
  @JSImport("dom-helpers", "filter")
  @js.native
  def filter_dragenter(selector: String, handler: EventHandler[dragenter]): EventHandler[dragenter] = js.native
  @JSImport("dom-helpers", "filter")
  @js.native
  def filter_dragexit(selector: String, handler: EventHandler[dragexit]): EventHandler[dragexit] = js.native
  @JSImport("dom-helpers", "filter")
  @js.native
  def filter_dragleave(selector: String, handler: EventHandler[dragleave]): EventHandler[dragleave] = js.native
  @JSImport("dom-helpers", "filter")
  @js.native
  def filter_dragover(selector: String, handler: EventHandler[dragover]): EventHandler[dragover] = js.native
  @JSImport("dom-helpers", "filter")
  @js.native
  def filter_dragstart(selector: String, handler: EventHandler[dragstart]): EventHandler[dragstart] = js.native
  @JSImport("dom-helpers", "filter")
  @js.native
  def filter_drop(selector: String, handler: EventHandler[drop]): EventHandler[drop] = js.native
  @JSImport("dom-helpers", "filter")
  @js.native
  def filter_durationchange(selector: String, handler: EventHandler[durationchange]): EventHandler[durationchange] = js.native
  @JSImport("dom-helpers", "filter")
  @js.native
  def filter_emptied(selector: String, handler: EventHandler[emptied]): EventHandler[emptied] = js.native
  @JSImport("dom-helpers", "filter")
  @js.native
  def filter_ended(selector: String, handler: EventHandler[ended]): EventHandler[ended] = js.native
  @JSImport("dom-helpers", "filter")
  @js.native
  def filter_error(selector: String, handler: EventHandler[error]): EventHandler[error] = js.native
  @JSImport("dom-helpers", "filter")
  @js.native
  def filter_focus(selector: String, handler: EventHandler[focus]): EventHandler[focus] = js.native
  @JSImport("dom-helpers", "filter")
  @js.native
  def filter_focusin(selector: String, handler: EventHandler[focusin]): EventHandler[focusin] = js.native
  @JSImport("dom-helpers", "filter")
  @js.native
  def filter_focusout(selector: String, handler: EventHandler[focusout]): EventHandler[focusout] = js.native
  @JSImport("dom-helpers", "filter")
  @js.native
  def filter_fullscreenchange(selector: String, handler: EventHandler[fullscreenchange]): EventHandler[fullscreenchange] = js.native
  @JSImport("dom-helpers", "filter")
  @js.native
  def filter_fullscreenerror(selector: String, handler: EventHandler[fullscreenerror]): EventHandler[fullscreenerror] = js.native
  @JSImport("dom-helpers", "filter")
  @js.native
  def filter_gotpointercapture(selector: String, handler: EventHandler[gotpointercapture]): EventHandler[gotpointercapture] = js.native
  @JSImport("dom-helpers", "filter")
  @js.native
  def filter_input(selector: String, handler: EventHandler[input]): EventHandler[input] = js.native
  @JSImport("dom-helpers", "filter")
  @js.native
  def filter_invalid(selector: String, handler: EventHandler[invalid]): EventHandler[invalid] = js.native
  @JSImport("dom-helpers", "filter")
  @js.native
  def filter_keydown(selector: String, handler: EventHandler[keydown]): EventHandler[keydown] = js.native
  @JSImport("dom-helpers", "filter")
  @js.native
  def filter_keypress(selector: String, handler: EventHandler[keypress]): EventHandler[keypress] = js.native
  @JSImport("dom-helpers", "filter")
  @js.native
  def filter_keyup(selector: String, handler: EventHandler[keyup]): EventHandler[keyup] = js.native
  @JSImport("dom-helpers", "filter")
  @js.native
  def filter_load(selector: String, handler: EventHandler[load]): EventHandler[load] = js.native
  @JSImport("dom-helpers", "filter")
  @js.native
  def filter_loadeddata(selector: String, handler: EventHandler[loadeddata]): EventHandler[loadeddata] = js.native
  @JSImport("dom-helpers", "filter")
  @js.native
  def filter_loadedmetadata(selector: String, handler: EventHandler[loadedmetadata]): EventHandler[loadedmetadata] = js.native
  @JSImport("dom-helpers", "filter")
  @js.native
  def filter_loadstart(selector: String, handler: EventHandler[loadstart]): EventHandler[loadstart] = js.native
  @JSImport("dom-helpers", "filter")
  @js.native
  def filter_lostpointercapture(selector: String, handler: EventHandler[lostpointercapture]): EventHandler[lostpointercapture] = js.native
  @JSImport("dom-helpers", "filter")
  @js.native
  def filter_mousedown(selector: String, handler: EventHandler[mousedown]): EventHandler[mousedown] = js.native
  @JSImport("dom-helpers", "filter")
  @js.native
  def filter_mouseenter(selector: String, handler: EventHandler[mouseenter]): EventHandler[mouseenter] = js.native
  @JSImport("dom-helpers", "filter")
  @js.native
  def filter_mouseleave(selector: String, handler: EventHandler[mouseleave]): EventHandler[mouseleave] = js.native
  @JSImport("dom-helpers", "filter")
  @js.native
  def filter_mousemove(selector: String, handler: EventHandler[mousemove]): EventHandler[mousemove] = js.native
  @JSImport("dom-helpers", "filter")
  @js.native
  def filter_mouseout(selector: String, handler: EventHandler[mouseout]): EventHandler[mouseout] = js.native
  @JSImport("dom-helpers", "filter")
  @js.native
  def filter_mouseover(selector: String, handler: EventHandler[mouseover]): EventHandler[mouseover] = js.native
  @JSImport("dom-helpers", "filter")
  @js.native
  def filter_mouseup(selector: String, handler: EventHandler[mouseup]): EventHandler[mouseup] = js.native
  @JSImport("dom-helpers", "filter")
  @js.native
  def filter_paste(selector: String, handler: EventHandler[paste]): EventHandler[paste] = js.native
  @JSImport("dom-helpers", "filter")
  @js.native
  def filter_pause(selector: String, handler: EventHandler[pause]): EventHandler[pause] = js.native
  @JSImport("dom-helpers", "filter")
  @js.native
  def filter_play(selector: String, handler: EventHandler[play]): EventHandler[play] = js.native
  @JSImport("dom-helpers", "filter")
  @js.native
  def filter_playing(selector: String, handler: EventHandler[playing]): EventHandler[playing] = js.native
  @JSImport("dom-helpers", "filter")
  @js.native
  def filter_pointercancel(selector: String, handler: EventHandler[pointercancel]): EventHandler[pointercancel] = js.native
  @JSImport("dom-helpers", "filter")
  @js.native
  def filter_pointerdown(selector: String, handler: EventHandler[pointerdown]): EventHandler[pointerdown] = js.native
  @JSImport("dom-helpers", "filter")
  @js.native
  def filter_pointerenter(selector: String, handler: EventHandler[pointerenter]): EventHandler[pointerenter] = js.native
  @JSImport("dom-helpers", "filter")
  @js.native
  def filter_pointerleave(selector: String, handler: EventHandler[pointerleave]): EventHandler[pointerleave] = js.native
  @JSImport("dom-helpers", "filter")
  @js.native
  def filter_pointermove(selector: String, handler: EventHandler[pointermove]): EventHandler[pointermove] = js.native
  @JSImport("dom-helpers", "filter")
  @js.native
  def filter_pointerout(selector: String, handler: EventHandler[pointerout]): EventHandler[pointerout] = js.native
  @JSImport("dom-helpers", "filter")
  @js.native
  def filter_pointerover(selector: String, handler: EventHandler[pointerover]): EventHandler[pointerover] = js.native
  @JSImport("dom-helpers", "filter")
  @js.native
  def filter_pointerup(selector: String, handler: EventHandler[pointerup]): EventHandler[pointerup] = js.native
  @JSImport("dom-helpers", "filter")
  @js.native
  def filter_progress(selector: String, handler: EventHandler[progress]): EventHandler[progress] = js.native
  @JSImport("dom-helpers", "filter")
  @js.native
  def filter_ratechange(selector: String, handler: EventHandler[ratechange]): EventHandler[ratechange] = js.native
  @JSImport("dom-helpers", "filter")
  @js.native
  def filter_reset(selector: String, handler: EventHandler[reset]): EventHandler[reset] = js.native
  @JSImport("dom-helpers", "filter")
  @js.native
  def filter_resize(selector: String, handler: EventHandler[resize]): EventHandler[resize] = js.native
  @JSImport("dom-helpers", "filter")
  @js.native
  def filter_scroll(selector: String, handler: EventHandler[scroll]): EventHandler[scroll] = js.native
  @JSImport("dom-helpers", "filter")
  @js.native
  def filter_securitypolicyviolation(selector: String, handler: EventHandler[securitypolicyviolation]): EventHandler[securitypolicyviolation] = js.native
  @JSImport("dom-helpers", "filter")
  @js.native
  def filter_seeked(selector: String, handler: EventHandler[seeked]): EventHandler[seeked] = js.native
  @JSImport("dom-helpers", "filter")
  @js.native
  def filter_seeking(selector: String, handler: EventHandler[seeking]): EventHandler[seeking] = js.native
  @JSImport("dom-helpers", "filter")
  @js.native
  def filter_select(selector: String, handler: EventHandler[select]): EventHandler[select] = js.native
  @JSImport("dom-helpers", "filter")
  @js.native
  def filter_selectionchange(selector: String, handler: EventHandler[selectionchange]): EventHandler[selectionchange] = js.native
  @JSImport("dom-helpers", "filter")
  @js.native
  def filter_selectstart(selector: String, handler: EventHandler[selectstart]): EventHandler[selectstart] = js.native
  @JSImport("dom-helpers", "filter")
  @js.native
  def filter_stalled(selector: String, handler: EventHandler[stalled]): EventHandler[stalled] = js.native
  @JSImport("dom-helpers", "filter")
  @js.native
  def filter_submit(selector: String, handler: EventHandler[submit]): EventHandler[submit] = js.native
  @JSImport("dom-helpers", "filter")
  @js.native
  def filter_suspend(selector: String, handler: EventHandler[suspend]): EventHandler[suspend] = js.native
  @JSImport("dom-helpers", "filter")
  @js.native
  def filter_timeupdate(selector: String, handler: EventHandler[timeupdate]): EventHandler[timeupdate] = js.native
  @JSImport("dom-helpers", "filter")
  @js.native
  def filter_toggle(selector: String, handler: EventHandler[toggle]): EventHandler[toggle] = js.native
  @JSImport("dom-helpers", "filter")
  @js.native
  def filter_touchcancel(selector: String, handler: EventHandler[touchcancel]): EventHandler[touchcancel] = js.native
  @JSImport("dom-helpers", "filter")
  @js.native
  def filter_touchend(selector: String, handler: EventHandler[touchend]): EventHandler[touchend] = js.native
  @JSImport("dom-helpers", "filter")
  @js.native
  def filter_touchmove(selector: String, handler: EventHandler[touchmove]): EventHandler[touchmove] = js.native
  @JSImport("dom-helpers", "filter")
  @js.native
  def filter_touchstart(selector: String, handler: EventHandler[touchstart]): EventHandler[touchstart] = js.native
  @JSImport("dom-helpers", "filter")
  @js.native
  def filter_transitioncancel(selector: String, handler: EventHandler[transitioncancel]): EventHandler[transitioncancel] = js.native
  @JSImport("dom-helpers", "filter")
  @js.native
  def filter_transitionend(selector: String, handler: EventHandler[transitionend]): EventHandler[transitionend] = js.native
  @JSImport("dom-helpers", "filter")
  @js.native
  def filter_transitionrun(selector: String, handler: EventHandler[transitionrun]): EventHandler[transitionrun] = js.native
  @JSImport("dom-helpers", "filter")
  @js.native
  def filter_transitionstart(selector: String, handler: EventHandler[transitionstart]): EventHandler[transitionstart] = js.native
  @JSImport("dom-helpers", "filter")
  @js.native
  def filter_volumechange(selector: String, handler: EventHandler[volumechange]): EventHandler[volumechange] = js.native
  @JSImport("dom-helpers", "filter")
  @js.native
  def filter_waiting(selector: String, handler: EventHandler[waiting]): EventHandler[waiting] = js.native
  @JSImport("dom-helpers", "filter")
  @js.native
  def filter_wheel(selector: String, handler: EventHandler[wheel]): EventHandler[wheel] = js.native
  
  @JSImport("dom-helpers", "getComputedStyle")
  @js.native
  def getComputedStyle(node: HTMLElement): CSSStyleDeclaration = js.native
  @JSImport("dom-helpers", "getComputedStyle")
  @js.native
  def getComputedStyle(node: HTMLElement, psuedoElement: String): CSSStyleDeclaration = js.native
  
  @JSImport("dom-helpers", "hasClass")
  @js.native
  def hasClass(element: Element, className: String): Boolean = js.native
  @JSImport("dom-helpers", "hasClass")
  @js.native
  def hasClass(element: SVGElement, className: String): Boolean = js.native
  
  @JSImport("dom-helpers", "height")
  @js.native
  def height(node: HTMLElement): Double = js.native
  @JSImport("dom-helpers", "height")
  @js.native
  def height(node: HTMLElement, client: Boolean): Double = js.native
  
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_abort(node: HTMLElement, eventName: abort, handler: EventHandler[abort]): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_abort(node: HTMLElement, eventName: abort, handler: EventHandler[abort], options: Boolean): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_abort(
    node: HTMLElement,
    eventName: abort,
    handler: EventHandler[abort],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_animationcancel(node: HTMLElement, eventName: animationcancel, handler: EventHandler[animationcancel]): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_animationcancel(
    node: HTMLElement,
    eventName: animationcancel,
    handler: EventHandler[animationcancel],
    options: Boolean
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_animationcancel(
    node: HTMLElement,
    eventName: animationcancel,
    handler: EventHandler[animationcancel],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_animationend(node: HTMLElement, eventName: animationend, handler: EventHandler[animationend]): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_animationend(node: HTMLElement, eventName: animationend, handler: EventHandler[animationend], options: Boolean): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_animationend(
    node: HTMLElement,
    eventName: animationend,
    handler: EventHandler[animationend],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_animationiteration(node: HTMLElement, eventName: animationiteration, handler: EventHandler[animationiteration]): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_animationiteration(
    node: HTMLElement,
    eventName: animationiteration,
    handler: EventHandler[animationiteration],
    options: Boolean
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_animationiteration(
    node: HTMLElement,
    eventName: animationiteration,
    handler: EventHandler[animationiteration],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_animationstart(node: HTMLElement, eventName: animationstart, handler: EventHandler[animationstart]): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_animationstart(
    node: HTMLElement,
    eventName: animationstart,
    handler: EventHandler[animationstart],
    options: Boolean
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_animationstart(
    node: HTMLElement,
    eventName: animationstart,
    handler: EventHandler[animationstart],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_auxclick(node: HTMLElement, eventName: auxclick, handler: EventHandler[auxclick]): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_auxclick(node: HTMLElement, eventName: auxclick, handler: EventHandler[auxclick], options: Boolean): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_auxclick(
    node: HTMLElement,
    eventName: auxclick,
    handler: EventHandler[auxclick],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_blur(node: HTMLElement, eventName: blur, handler: EventHandler[blur]): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_blur(node: HTMLElement, eventName: blur, handler: EventHandler[blur], options: Boolean): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_blur(node: HTMLElement, eventName: blur, handler: EventHandler[blur], options: AddEventListenerOptions): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_cancel(node: HTMLElement, eventName: cancel, handler: EventHandler[cancel]): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_cancel(node: HTMLElement, eventName: cancel, handler: EventHandler[cancel], options: Boolean): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_cancel(
    node: HTMLElement,
    eventName: cancel,
    handler: EventHandler[cancel],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_canplay(node: HTMLElement, eventName: canplay, handler: EventHandler[canplay]): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_canplay(node: HTMLElement, eventName: canplay, handler: EventHandler[canplay], options: Boolean): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_canplay(
    node: HTMLElement,
    eventName: canplay,
    handler: EventHandler[canplay],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_canplaythrough(node: HTMLElement, eventName: canplaythrough, handler: EventHandler[canplaythrough]): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_canplaythrough(
    node: HTMLElement,
    eventName: canplaythrough,
    handler: EventHandler[canplaythrough],
    options: Boolean
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_canplaythrough(
    node: HTMLElement,
    eventName: canplaythrough,
    handler: EventHandler[canplaythrough],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_change(node: HTMLElement, eventName: change, handler: EventHandler[change]): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_change(node: HTMLElement, eventName: change, handler: EventHandler[change], options: Boolean): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_change(
    node: HTMLElement,
    eventName: change,
    handler: EventHandler[change],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_click(node: HTMLElement, eventName: click, handler: EventHandler[click]): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_click(node: HTMLElement, eventName: click, handler: EventHandler[click], options: Boolean): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_click(
    node: HTMLElement,
    eventName: click,
    handler: EventHandler[click],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_close(node: HTMLElement, eventName: close, handler: EventHandler[close]): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_close(node: HTMLElement, eventName: close, handler: EventHandler[close], options: Boolean): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_close(
    node: HTMLElement,
    eventName: close,
    handler: EventHandler[close],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_contextmenu(node: HTMLElement, eventName: contextmenu, handler: EventHandler[contextmenu]): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_contextmenu(node: HTMLElement, eventName: contextmenu, handler: EventHandler[contextmenu], options: Boolean): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_contextmenu(
    node: HTMLElement,
    eventName: contextmenu,
    handler: EventHandler[contextmenu],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_copy(node: HTMLElement, eventName: copy, handler: EventHandler[copy]): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_copy(node: HTMLElement, eventName: copy, handler: EventHandler[copy], options: Boolean): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_copy(node: HTMLElement, eventName: copy, handler: EventHandler[copy], options: AddEventListenerOptions): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_cuechange(node: HTMLElement, eventName: cuechange, handler: EventHandler[cuechange]): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_cuechange(node: HTMLElement, eventName: cuechange, handler: EventHandler[cuechange], options: Boolean): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_cuechange(
    node: HTMLElement,
    eventName: cuechange,
    handler: EventHandler[cuechange],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_cut(node: HTMLElement, eventName: cut, handler: EventHandler[cut]): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_cut(node: HTMLElement, eventName: cut, handler: EventHandler[cut], options: Boolean): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_cut(node: HTMLElement, eventName: cut, handler: EventHandler[cut], options: AddEventListenerOptions): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_dblclick(node: HTMLElement, eventName: dblclick, handler: EventHandler[dblclick]): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_dblclick(node: HTMLElement, eventName: dblclick, handler: EventHandler[dblclick], options: Boolean): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_dblclick(
    node: HTMLElement,
    eventName: dblclick,
    handler: EventHandler[dblclick],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_drag(node: HTMLElement, eventName: drag, handler: EventHandler[drag]): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_drag(node: HTMLElement, eventName: drag, handler: EventHandler[drag], options: Boolean): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_drag(node: HTMLElement, eventName: drag, handler: EventHandler[drag], options: AddEventListenerOptions): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_dragend(node: HTMLElement, eventName: dragend, handler: EventHandler[dragend]): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_dragend(node: HTMLElement, eventName: dragend, handler: EventHandler[dragend], options: Boolean): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_dragend(
    node: HTMLElement,
    eventName: dragend,
    handler: EventHandler[dragend],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_dragenter(node: HTMLElement, eventName: dragenter, handler: EventHandler[dragenter]): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_dragenter(node: HTMLElement, eventName: dragenter, handler: EventHandler[dragenter], options: Boolean): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_dragenter(
    node: HTMLElement,
    eventName: dragenter,
    handler: EventHandler[dragenter],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_dragexit(node: HTMLElement, eventName: dragexit, handler: EventHandler[dragexit]): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_dragexit(node: HTMLElement, eventName: dragexit, handler: EventHandler[dragexit], options: Boolean): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_dragexit(
    node: HTMLElement,
    eventName: dragexit,
    handler: EventHandler[dragexit],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_dragleave(node: HTMLElement, eventName: dragleave, handler: EventHandler[dragleave]): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_dragleave(node: HTMLElement, eventName: dragleave, handler: EventHandler[dragleave], options: Boolean): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_dragleave(
    node: HTMLElement,
    eventName: dragleave,
    handler: EventHandler[dragleave],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_dragover(node: HTMLElement, eventName: dragover, handler: EventHandler[dragover]): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_dragover(node: HTMLElement, eventName: dragover, handler: EventHandler[dragover], options: Boolean): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_dragover(
    node: HTMLElement,
    eventName: dragover,
    handler: EventHandler[dragover],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_dragstart(node: HTMLElement, eventName: dragstart, handler: EventHandler[dragstart]): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_dragstart(node: HTMLElement, eventName: dragstart, handler: EventHandler[dragstart], options: Boolean): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_dragstart(
    node: HTMLElement,
    eventName: dragstart,
    handler: EventHandler[dragstart],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_drop(node: HTMLElement, eventName: drop, handler: EventHandler[drop]): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_drop(node: HTMLElement, eventName: drop, handler: EventHandler[drop], options: Boolean): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_drop(node: HTMLElement, eventName: drop, handler: EventHandler[drop], options: AddEventListenerOptions): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_durationchange(node: HTMLElement, eventName: durationchange, handler: EventHandler[durationchange]): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_durationchange(
    node: HTMLElement,
    eventName: durationchange,
    handler: EventHandler[durationchange],
    options: Boolean
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_durationchange(
    node: HTMLElement,
    eventName: durationchange,
    handler: EventHandler[durationchange],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_emptied(node: HTMLElement, eventName: emptied, handler: EventHandler[emptied]): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_emptied(node: HTMLElement, eventName: emptied, handler: EventHandler[emptied], options: Boolean): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_emptied(
    node: HTMLElement,
    eventName: emptied,
    handler: EventHandler[emptied],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_ended(node: HTMLElement, eventName: ended, handler: EventHandler[ended]): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_ended(node: HTMLElement, eventName: ended, handler: EventHandler[ended], options: Boolean): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_ended(
    node: HTMLElement,
    eventName: ended,
    handler: EventHandler[ended],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_error(node: HTMLElement, eventName: error, handler: EventHandler[error]): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_error(node: HTMLElement, eventName: error, handler: EventHandler[error], options: Boolean): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_error(
    node: HTMLElement,
    eventName: error,
    handler: EventHandler[error],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_focus(node: HTMLElement, eventName: focus, handler: EventHandler[focus]): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_focus(node: HTMLElement, eventName: focus, handler: EventHandler[focus], options: Boolean): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_focus(
    node: HTMLElement,
    eventName: focus,
    handler: EventHandler[focus],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_focusin(node: HTMLElement, eventName: focusin, handler: EventHandler[focusin]): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_focusin(node: HTMLElement, eventName: focusin, handler: EventHandler[focusin], options: Boolean): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_focusin(
    node: HTMLElement,
    eventName: focusin,
    handler: EventHandler[focusin],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_focusout(node: HTMLElement, eventName: focusout, handler: EventHandler[focusout]): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_focusout(node: HTMLElement, eventName: focusout, handler: EventHandler[focusout], options: Boolean): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_focusout(
    node: HTMLElement,
    eventName: focusout,
    handler: EventHandler[focusout],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_fullscreenchange(node: HTMLElement, eventName: fullscreenchange, handler: EventHandler[fullscreenchange]): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_fullscreenchange(
    node: HTMLElement,
    eventName: fullscreenchange,
    handler: EventHandler[fullscreenchange],
    options: Boolean
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_fullscreenchange(
    node: HTMLElement,
    eventName: fullscreenchange,
    handler: EventHandler[fullscreenchange],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_fullscreenerror(node: HTMLElement, eventName: fullscreenerror, handler: EventHandler[fullscreenerror]): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_fullscreenerror(
    node: HTMLElement,
    eventName: fullscreenerror,
    handler: EventHandler[fullscreenerror],
    options: Boolean
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_fullscreenerror(
    node: HTMLElement,
    eventName: fullscreenerror,
    handler: EventHandler[fullscreenerror],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_gotpointercapture(node: HTMLElement, eventName: gotpointercapture, handler: EventHandler[gotpointercapture]): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_gotpointercapture(
    node: HTMLElement,
    eventName: gotpointercapture,
    handler: EventHandler[gotpointercapture],
    options: Boolean
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_gotpointercapture(
    node: HTMLElement,
    eventName: gotpointercapture,
    handler: EventHandler[gotpointercapture],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_input(node: HTMLElement, eventName: input, handler: EventHandler[input]): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_input(node: HTMLElement, eventName: input, handler: EventHandler[input], options: Boolean): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_input(
    node: HTMLElement,
    eventName: input,
    handler: EventHandler[input],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_invalid(node: HTMLElement, eventName: invalid, handler: EventHandler[invalid]): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_invalid(node: HTMLElement, eventName: invalid, handler: EventHandler[invalid], options: Boolean): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_invalid(
    node: HTMLElement,
    eventName: invalid,
    handler: EventHandler[invalid],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_keydown(node: HTMLElement, eventName: keydown, handler: EventHandler[keydown]): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_keydown(node: HTMLElement, eventName: keydown, handler: EventHandler[keydown], options: Boolean): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_keydown(
    node: HTMLElement,
    eventName: keydown,
    handler: EventHandler[keydown],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_keypress(node: HTMLElement, eventName: keypress, handler: EventHandler[keypress]): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_keypress(node: HTMLElement, eventName: keypress, handler: EventHandler[keypress], options: Boolean): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_keypress(
    node: HTMLElement,
    eventName: keypress,
    handler: EventHandler[keypress],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_keyup(node: HTMLElement, eventName: keyup, handler: EventHandler[keyup]): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_keyup(node: HTMLElement, eventName: keyup, handler: EventHandler[keyup], options: Boolean): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_keyup(
    node: HTMLElement,
    eventName: keyup,
    handler: EventHandler[keyup],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_load(node: HTMLElement, eventName: load, handler: EventHandler[load]): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_load(node: HTMLElement, eventName: load, handler: EventHandler[load], options: Boolean): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_load(node: HTMLElement, eventName: load, handler: EventHandler[load], options: AddEventListenerOptions): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_loadeddata(node: HTMLElement, eventName: loadeddata, handler: EventHandler[loadeddata]): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_loadeddata(node: HTMLElement, eventName: loadeddata, handler: EventHandler[loadeddata], options: Boolean): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_loadeddata(
    node: HTMLElement,
    eventName: loadeddata,
    handler: EventHandler[loadeddata],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_loadedmetadata(node: HTMLElement, eventName: loadedmetadata, handler: EventHandler[loadedmetadata]): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_loadedmetadata(
    node: HTMLElement,
    eventName: loadedmetadata,
    handler: EventHandler[loadedmetadata],
    options: Boolean
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_loadedmetadata(
    node: HTMLElement,
    eventName: loadedmetadata,
    handler: EventHandler[loadedmetadata],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_loadstart(node: HTMLElement, eventName: loadstart, handler: EventHandler[loadstart]): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_loadstart(node: HTMLElement, eventName: loadstart, handler: EventHandler[loadstart], options: Boolean): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_loadstart(
    node: HTMLElement,
    eventName: loadstart,
    handler: EventHandler[loadstart],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_lostpointercapture(node: HTMLElement, eventName: lostpointercapture, handler: EventHandler[lostpointercapture]): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_lostpointercapture(
    node: HTMLElement,
    eventName: lostpointercapture,
    handler: EventHandler[lostpointercapture],
    options: Boolean
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_lostpointercapture(
    node: HTMLElement,
    eventName: lostpointercapture,
    handler: EventHandler[lostpointercapture],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_mousedown(node: HTMLElement, eventName: mousedown, handler: EventHandler[mousedown]): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_mousedown(node: HTMLElement, eventName: mousedown, handler: EventHandler[mousedown], options: Boolean): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_mousedown(
    node: HTMLElement,
    eventName: mousedown,
    handler: EventHandler[mousedown],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_mouseenter(node: HTMLElement, eventName: mouseenter, handler: EventHandler[mouseenter]): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_mouseenter(node: HTMLElement, eventName: mouseenter, handler: EventHandler[mouseenter], options: Boolean): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_mouseenter(
    node: HTMLElement,
    eventName: mouseenter,
    handler: EventHandler[mouseenter],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_mouseleave(node: HTMLElement, eventName: mouseleave, handler: EventHandler[mouseleave]): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_mouseleave(node: HTMLElement, eventName: mouseleave, handler: EventHandler[mouseleave], options: Boolean): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_mouseleave(
    node: HTMLElement,
    eventName: mouseleave,
    handler: EventHandler[mouseleave],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_mousemove(node: HTMLElement, eventName: mousemove, handler: EventHandler[mousemove]): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_mousemove(node: HTMLElement, eventName: mousemove, handler: EventHandler[mousemove], options: Boolean): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_mousemove(
    node: HTMLElement,
    eventName: mousemove,
    handler: EventHandler[mousemove],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_mouseout(node: HTMLElement, eventName: mouseout, handler: EventHandler[mouseout]): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_mouseout(node: HTMLElement, eventName: mouseout, handler: EventHandler[mouseout], options: Boolean): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_mouseout(
    node: HTMLElement,
    eventName: mouseout,
    handler: EventHandler[mouseout],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_mouseover(node: HTMLElement, eventName: mouseover, handler: EventHandler[mouseover]): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_mouseover(node: HTMLElement, eventName: mouseover, handler: EventHandler[mouseover], options: Boolean): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_mouseover(
    node: HTMLElement,
    eventName: mouseover,
    handler: EventHandler[mouseover],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_mouseup(node: HTMLElement, eventName: mouseup, handler: EventHandler[mouseup]): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_mouseup(node: HTMLElement, eventName: mouseup, handler: EventHandler[mouseup], options: Boolean): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_mouseup(
    node: HTMLElement,
    eventName: mouseup,
    handler: EventHandler[mouseup],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_paste(node: HTMLElement, eventName: paste, handler: EventHandler[paste]): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_paste(node: HTMLElement, eventName: paste, handler: EventHandler[paste], options: Boolean): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_paste(
    node: HTMLElement,
    eventName: paste,
    handler: EventHandler[paste],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_pause(node: HTMLElement, eventName: pause, handler: EventHandler[pause]): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_pause(node: HTMLElement, eventName: pause, handler: EventHandler[pause], options: Boolean): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_pause(
    node: HTMLElement,
    eventName: pause,
    handler: EventHandler[pause],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_play(node: HTMLElement, eventName: play, handler: EventHandler[play]): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_play(node: HTMLElement, eventName: play, handler: EventHandler[play], options: Boolean): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_play(node: HTMLElement, eventName: play, handler: EventHandler[play], options: AddEventListenerOptions): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_playing(node: HTMLElement, eventName: playing, handler: EventHandler[playing]): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_playing(node: HTMLElement, eventName: playing, handler: EventHandler[playing], options: Boolean): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_playing(
    node: HTMLElement,
    eventName: playing,
    handler: EventHandler[playing],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_pointercancel(node: HTMLElement, eventName: pointercancel, handler: EventHandler[pointercancel]): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_pointercancel(
    node: HTMLElement,
    eventName: pointercancel,
    handler: EventHandler[pointercancel],
    options: Boolean
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_pointercancel(
    node: HTMLElement,
    eventName: pointercancel,
    handler: EventHandler[pointercancel],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_pointerdown(node: HTMLElement, eventName: pointerdown, handler: EventHandler[pointerdown]): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_pointerdown(node: HTMLElement, eventName: pointerdown, handler: EventHandler[pointerdown], options: Boolean): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_pointerdown(
    node: HTMLElement,
    eventName: pointerdown,
    handler: EventHandler[pointerdown],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_pointerenter(node: HTMLElement, eventName: pointerenter, handler: EventHandler[pointerenter]): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_pointerenter(node: HTMLElement, eventName: pointerenter, handler: EventHandler[pointerenter], options: Boolean): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_pointerenter(
    node: HTMLElement,
    eventName: pointerenter,
    handler: EventHandler[pointerenter],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_pointerleave(node: HTMLElement, eventName: pointerleave, handler: EventHandler[pointerleave]): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_pointerleave(node: HTMLElement, eventName: pointerleave, handler: EventHandler[pointerleave], options: Boolean): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_pointerleave(
    node: HTMLElement,
    eventName: pointerleave,
    handler: EventHandler[pointerleave],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_pointermove(node: HTMLElement, eventName: pointermove, handler: EventHandler[pointermove]): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_pointermove(node: HTMLElement, eventName: pointermove, handler: EventHandler[pointermove], options: Boolean): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_pointermove(
    node: HTMLElement,
    eventName: pointermove,
    handler: EventHandler[pointermove],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_pointerout(node: HTMLElement, eventName: pointerout, handler: EventHandler[pointerout]): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_pointerout(node: HTMLElement, eventName: pointerout, handler: EventHandler[pointerout], options: Boolean): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_pointerout(
    node: HTMLElement,
    eventName: pointerout,
    handler: EventHandler[pointerout],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_pointerover(node: HTMLElement, eventName: pointerover, handler: EventHandler[pointerover]): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_pointerover(node: HTMLElement, eventName: pointerover, handler: EventHandler[pointerover], options: Boolean): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_pointerover(
    node: HTMLElement,
    eventName: pointerover,
    handler: EventHandler[pointerover],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_pointerup(node: HTMLElement, eventName: pointerup, handler: EventHandler[pointerup]): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_pointerup(node: HTMLElement, eventName: pointerup, handler: EventHandler[pointerup], options: Boolean): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_pointerup(
    node: HTMLElement,
    eventName: pointerup,
    handler: EventHandler[pointerup],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_progress(node: HTMLElement, eventName: progress, handler: EventHandler[progress]): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_progress(node: HTMLElement, eventName: progress, handler: EventHandler[progress], options: Boolean): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_progress(
    node: HTMLElement,
    eventName: progress,
    handler: EventHandler[progress],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_ratechange(node: HTMLElement, eventName: ratechange, handler: EventHandler[ratechange]): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_ratechange(node: HTMLElement, eventName: ratechange, handler: EventHandler[ratechange], options: Boolean): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_ratechange(
    node: HTMLElement,
    eventName: ratechange,
    handler: EventHandler[ratechange],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_reset(node: HTMLElement, eventName: reset, handler: EventHandler[reset]): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_reset(node: HTMLElement, eventName: reset, handler: EventHandler[reset], options: Boolean): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_reset(
    node: HTMLElement,
    eventName: reset,
    handler: EventHandler[reset],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_resize(node: HTMLElement, eventName: resize, handler: EventHandler[resize]): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_resize(node: HTMLElement, eventName: resize, handler: EventHandler[resize], options: Boolean): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_resize(
    node: HTMLElement,
    eventName: resize,
    handler: EventHandler[resize],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_scroll(node: HTMLElement, eventName: scroll, handler: EventHandler[scroll]): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_scroll(node: HTMLElement, eventName: scroll, handler: EventHandler[scroll], options: Boolean): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_scroll(
    node: HTMLElement,
    eventName: scroll,
    handler: EventHandler[scroll],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_securitypolicyviolation(
    node: HTMLElement,
    eventName: securitypolicyviolation,
    handler: EventHandler[securitypolicyviolation]
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_securitypolicyviolation(
    node: HTMLElement,
    eventName: securitypolicyviolation,
    handler: EventHandler[securitypolicyviolation],
    options: Boolean
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_securitypolicyviolation(
    node: HTMLElement,
    eventName: securitypolicyviolation,
    handler: EventHandler[securitypolicyviolation],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_seeked(node: HTMLElement, eventName: seeked, handler: EventHandler[seeked]): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_seeked(node: HTMLElement, eventName: seeked, handler: EventHandler[seeked], options: Boolean): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_seeked(
    node: HTMLElement,
    eventName: seeked,
    handler: EventHandler[seeked],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_seeking(node: HTMLElement, eventName: seeking, handler: EventHandler[seeking]): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_seeking(node: HTMLElement, eventName: seeking, handler: EventHandler[seeking], options: Boolean): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_seeking(
    node: HTMLElement,
    eventName: seeking,
    handler: EventHandler[seeking],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_select(node: HTMLElement, eventName: select, handler: EventHandler[select]): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_select(node: HTMLElement, eventName: select, handler: EventHandler[select], options: Boolean): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_select(
    node: HTMLElement,
    eventName: select,
    handler: EventHandler[select],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_selectionchange(node: HTMLElement, eventName: selectionchange, handler: EventHandler[selectionchange]): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_selectionchange(
    node: HTMLElement,
    eventName: selectionchange,
    handler: EventHandler[selectionchange],
    options: Boolean
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_selectionchange(
    node: HTMLElement,
    eventName: selectionchange,
    handler: EventHandler[selectionchange],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_selectstart(node: HTMLElement, eventName: selectstart, handler: EventHandler[selectstart]): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_selectstart(node: HTMLElement, eventName: selectstart, handler: EventHandler[selectstart], options: Boolean): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_selectstart(
    node: HTMLElement,
    eventName: selectstart,
    handler: EventHandler[selectstart],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_stalled(node: HTMLElement, eventName: stalled, handler: EventHandler[stalled]): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_stalled(node: HTMLElement, eventName: stalled, handler: EventHandler[stalled], options: Boolean): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_stalled(
    node: HTMLElement,
    eventName: stalled,
    handler: EventHandler[stalled],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_submit(node: HTMLElement, eventName: submit, handler: EventHandler[submit]): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_submit(node: HTMLElement, eventName: submit, handler: EventHandler[submit], options: Boolean): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_submit(
    node: HTMLElement,
    eventName: submit,
    handler: EventHandler[submit],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_suspend(node: HTMLElement, eventName: suspend, handler: EventHandler[suspend]): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_suspend(node: HTMLElement, eventName: suspend, handler: EventHandler[suspend], options: Boolean): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_suspend(
    node: HTMLElement,
    eventName: suspend,
    handler: EventHandler[suspend],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_timeupdate(node: HTMLElement, eventName: timeupdate, handler: EventHandler[timeupdate]): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_timeupdate(node: HTMLElement, eventName: timeupdate, handler: EventHandler[timeupdate], options: Boolean): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_timeupdate(
    node: HTMLElement,
    eventName: timeupdate,
    handler: EventHandler[timeupdate],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_toggle(node: HTMLElement, eventName: toggle, handler: EventHandler[toggle]): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_toggle(node: HTMLElement, eventName: toggle, handler: EventHandler[toggle], options: Boolean): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_toggle(
    node: HTMLElement,
    eventName: toggle,
    handler: EventHandler[toggle],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_touchcancel(node: HTMLElement, eventName: touchcancel, handler: EventHandler[touchcancel]): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_touchcancel(node: HTMLElement, eventName: touchcancel, handler: EventHandler[touchcancel], options: Boolean): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_touchcancel(
    node: HTMLElement,
    eventName: touchcancel,
    handler: EventHandler[touchcancel],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_touchend(node: HTMLElement, eventName: touchend, handler: EventHandler[touchend]): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_touchend(node: HTMLElement, eventName: touchend, handler: EventHandler[touchend], options: Boolean): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_touchend(
    node: HTMLElement,
    eventName: touchend,
    handler: EventHandler[touchend],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_touchmove(node: HTMLElement, eventName: touchmove, handler: EventHandler[touchmove]): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_touchmove(node: HTMLElement, eventName: touchmove, handler: EventHandler[touchmove], options: Boolean): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_touchmove(
    node: HTMLElement,
    eventName: touchmove,
    handler: EventHandler[touchmove],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_touchstart(node: HTMLElement, eventName: touchstart, handler: EventHandler[touchstart]): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_touchstart(node: HTMLElement, eventName: touchstart, handler: EventHandler[touchstart], options: Boolean): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_touchstart(
    node: HTMLElement,
    eventName: touchstart,
    handler: EventHandler[touchstart],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_transitioncancel(node: HTMLElement, eventName: transitioncancel, handler: EventHandler[transitioncancel]): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_transitioncancel(
    node: HTMLElement,
    eventName: transitioncancel,
    handler: EventHandler[transitioncancel],
    options: Boolean
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_transitioncancel(
    node: HTMLElement,
    eventName: transitioncancel,
    handler: EventHandler[transitioncancel],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_transitionend(node: HTMLElement, eventName: transitionend, handler: EventHandler[transitionend]): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_transitionend(
    node: HTMLElement,
    eventName: transitionend,
    handler: EventHandler[transitionend],
    options: Boolean
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_transitionend(
    node: HTMLElement,
    eventName: transitionend,
    handler: EventHandler[transitionend],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_transitionrun(node: HTMLElement, eventName: transitionrun, handler: EventHandler[transitionrun]): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_transitionrun(
    node: HTMLElement,
    eventName: transitionrun,
    handler: EventHandler[transitionrun],
    options: Boolean
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_transitionrun(
    node: HTMLElement,
    eventName: transitionrun,
    handler: EventHandler[transitionrun],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_transitionstart(node: HTMLElement, eventName: transitionstart, handler: EventHandler[transitionstart]): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_transitionstart(
    node: HTMLElement,
    eventName: transitionstart,
    handler: EventHandler[transitionstart],
    options: Boolean
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_transitionstart(
    node: HTMLElement,
    eventName: transitionstart,
    handler: EventHandler[transitionstart],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_volumechange(node: HTMLElement, eventName: volumechange, handler: EventHandler[volumechange]): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_volumechange(node: HTMLElement, eventName: volumechange, handler: EventHandler[volumechange], options: Boolean): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_volumechange(
    node: HTMLElement,
    eventName: volumechange,
    handler: EventHandler[volumechange],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_waiting(node: HTMLElement, eventName: waiting, handler: EventHandler[waiting]): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_waiting(node: HTMLElement, eventName: waiting, handler: EventHandler[waiting], options: Boolean): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_waiting(
    node: HTMLElement,
    eventName: waiting,
    handler: EventHandler[waiting],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_wheel(node: HTMLElement, eventName: wheel, handler: EventHandler[wheel]): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_wheel(node: HTMLElement, eventName: wheel, handler: EventHandler[wheel], options: Boolean): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "listen")
  @js.native
  def listen_wheel(
    node: HTMLElement,
    eventName: wheel,
    handler: EventHandler[wheel],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = js.native
  
  @JSImport("dom-helpers", "matches")
  @js.native
  def matches(node: Element, selector: String): Boolean = js.native
  
  @JSImport("dom-helpers", "offset")
  @js.native
  def offset(node: HTMLElement): Height = js.native
  
  @JSImport("dom-helpers", "offsetParent")
  @js.native
  def offsetParent(node: HTMLElement): HTMLElement = js.native
  
  @JSImport("dom-helpers", "ownerDocument")
  @js.native
  def ownerDocument(): Document = js.native
  @JSImport("dom-helpers", "ownerDocument")
  @js.native
  def ownerDocument(node: Element): Document = js.native
  
  @JSImport("dom-helpers", "ownerWindow")
  @js.native
  def ownerWindow(): Window = js.native
  @JSImport("dom-helpers", "ownerWindow")
  @js.native
  def ownerWindow(node: Element): Window = js.native
  
  @JSImport("dom-helpers", "position")
  @js.native
  def position(node: HTMLElement): Height = js.native
  @JSImport("dom-helpers", "position")
  @js.native
  def position(node: HTMLElement, offsetParent: HTMLElement): Height = js.native
  
  @JSImport("dom-helpers", "querySelectorAll")
  @js.native
  def querySelectorAll(element: Document, selector: String): js.Array[HTMLElement] = js.native
  @JSImport("dom-helpers", "querySelectorAll")
  @js.native
  def querySelectorAll(element: HTMLElement, selector: String): js.Array[HTMLElement] = js.native
  
  @JSImport("dom-helpers", "removeClass")
  @js.native
  def removeClass(element: Element, className: String): Unit = js.native
  @JSImport("dom-helpers", "removeClass")
  @js.native
  def removeClass(element: SVGElement, className: String): Unit = js.native
  
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_abort(node: HTMLElement, eventName: abort, handler: TaggedEventHandler[abort]): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_abort(node: HTMLElement, eventName: abort, handler: TaggedEventHandler[abort], options: Boolean): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_abort(
    node: HTMLElement,
    eventName: abort,
    handler: TaggedEventHandler[abort],
    options: EventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_animationcancel(node: HTMLElement, eventName: animationcancel, handler: TaggedEventHandler[animationcancel]): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_animationcancel(
    node: HTMLElement,
    eventName: animationcancel,
    handler: TaggedEventHandler[animationcancel],
    options: Boolean
  ): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_animationcancel(
    node: HTMLElement,
    eventName: animationcancel,
    handler: TaggedEventHandler[animationcancel],
    options: EventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_animationend(node: HTMLElement, eventName: animationend, handler: TaggedEventHandler[animationend]): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_animationend(
    node: HTMLElement,
    eventName: animationend,
    handler: TaggedEventHandler[animationend],
    options: Boolean
  ): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_animationend(
    node: HTMLElement,
    eventName: animationend,
    handler: TaggedEventHandler[animationend],
    options: EventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_animationiteration(node: HTMLElement, eventName: animationiteration, handler: TaggedEventHandler[animationiteration]): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_animationiteration(
    node: HTMLElement,
    eventName: animationiteration,
    handler: TaggedEventHandler[animationiteration],
    options: Boolean
  ): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_animationiteration(
    node: HTMLElement,
    eventName: animationiteration,
    handler: TaggedEventHandler[animationiteration],
    options: EventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_animationstart(node: HTMLElement, eventName: animationstart, handler: TaggedEventHandler[animationstart]): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_animationstart(
    node: HTMLElement,
    eventName: animationstart,
    handler: TaggedEventHandler[animationstart],
    options: Boolean
  ): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_animationstart(
    node: HTMLElement,
    eventName: animationstart,
    handler: TaggedEventHandler[animationstart],
    options: EventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_auxclick(node: HTMLElement, eventName: auxclick, handler: TaggedEventHandler[auxclick]): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_auxclick(node: HTMLElement, eventName: auxclick, handler: TaggedEventHandler[auxclick], options: Boolean): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_auxclick(
    node: HTMLElement,
    eventName: auxclick,
    handler: TaggedEventHandler[auxclick],
    options: EventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_blur(node: HTMLElement, eventName: blur, handler: TaggedEventHandler[blur]): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_blur(node: HTMLElement, eventName: blur, handler: TaggedEventHandler[blur], options: Boolean): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_blur(
    node: HTMLElement,
    eventName: blur,
    handler: TaggedEventHandler[blur],
    options: EventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_cancel(node: HTMLElement, eventName: cancel, handler: TaggedEventHandler[cancel]): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_cancel(node: HTMLElement, eventName: cancel, handler: TaggedEventHandler[cancel], options: Boolean): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_cancel(
    node: HTMLElement,
    eventName: cancel,
    handler: TaggedEventHandler[cancel],
    options: EventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_canplay(node: HTMLElement, eventName: canplay, handler: TaggedEventHandler[canplay]): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_canplay(node: HTMLElement, eventName: canplay, handler: TaggedEventHandler[canplay], options: Boolean): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_canplay(
    node: HTMLElement,
    eventName: canplay,
    handler: TaggedEventHandler[canplay],
    options: EventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_canplaythrough(node: HTMLElement, eventName: canplaythrough, handler: TaggedEventHandler[canplaythrough]): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_canplaythrough(
    node: HTMLElement,
    eventName: canplaythrough,
    handler: TaggedEventHandler[canplaythrough],
    options: Boolean
  ): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_canplaythrough(
    node: HTMLElement,
    eventName: canplaythrough,
    handler: TaggedEventHandler[canplaythrough],
    options: EventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_change(node: HTMLElement, eventName: change, handler: TaggedEventHandler[change]): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_change(node: HTMLElement, eventName: change, handler: TaggedEventHandler[change], options: Boolean): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_change(
    node: HTMLElement,
    eventName: change,
    handler: TaggedEventHandler[change],
    options: EventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_click(node: HTMLElement, eventName: click, handler: TaggedEventHandler[click]): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_click(node: HTMLElement, eventName: click, handler: TaggedEventHandler[click], options: Boolean): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_click(
    node: HTMLElement,
    eventName: click,
    handler: TaggedEventHandler[click],
    options: EventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_close(node: HTMLElement, eventName: close, handler: TaggedEventHandler[close]): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_close(node: HTMLElement, eventName: close, handler: TaggedEventHandler[close], options: Boolean): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_close(
    node: HTMLElement,
    eventName: close,
    handler: TaggedEventHandler[close],
    options: EventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_contextmenu(node: HTMLElement, eventName: contextmenu, handler: TaggedEventHandler[contextmenu]): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_contextmenu(
    node: HTMLElement,
    eventName: contextmenu,
    handler: TaggedEventHandler[contextmenu],
    options: Boolean
  ): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_contextmenu(
    node: HTMLElement,
    eventName: contextmenu,
    handler: TaggedEventHandler[contextmenu],
    options: EventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_copy(node: HTMLElement, eventName: copy, handler: TaggedEventHandler[copy]): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_copy(node: HTMLElement, eventName: copy, handler: TaggedEventHandler[copy], options: Boolean): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_copy(
    node: HTMLElement,
    eventName: copy,
    handler: TaggedEventHandler[copy],
    options: EventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_cuechange(node: HTMLElement, eventName: cuechange, handler: TaggedEventHandler[cuechange]): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_cuechange(node: HTMLElement, eventName: cuechange, handler: TaggedEventHandler[cuechange], options: Boolean): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_cuechange(
    node: HTMLElement,
    eventName: cuechange,
    handler: TaggedEventHandler[cuechange],
    options: EventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_cut(node: HTMLElement, eventName: cut, handler: TaggedEventHandler[cut]): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_cut(node: HTMLElement, eventName: cut, handler: TaggedEventHandler[cut], options: Boolean): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_cut(node: HTMLElement, eventName: cut, handler: TaggedEventHandler[cut], options: EventListenerOptions): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_dblclick(node: HTMLElement, eventName: dblclick, handler: TaggedEventHandler[dblclick]): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_dblclick(node: HTMLElement, eventName: dblclick, handler: TaggedEventHandler[dblclick], options: Boolean): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_dblclick(
    node: HTMLElement,
    eventName: dblclick,
    handler: TaggedEventHandler[dblclick],
    options: EventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_drag(node: HTMLElement, eventName: drag, handler: TaggedEventHandler[drag]): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_drag(node: HTMLElement, eventName: drag, handler: TaggedEventHandler[drag], options: Boolean): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_drag(
    node: HTMLElement,
    eventName: drag,
    handler: TaggedEventHandler[drag],
    options: EventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_dragend(node: HTMLElement, eventName: dragend, handler: TaggedEventHandler[dragend]): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_dragend(node: HTMLElement, eventName: dragend, handler: TaggedEventHandler[dragend], options: Boolean): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_dragend(
    node: HTMLElement,
    eventName: dragend,
    handler: TaggedEventHandler[dragend],
    options: EventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_dragenter(node: HTMLElement, eventName: dragenter, handler: TaggedEventHandler[dragenter]): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_dragenter(node: HTMLElement, eventName: dragenter, handler: TaggedEventHandler[dragenter], options: Boolean): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_dragenter(
    node: HTMLElement,
    eventName: dragenter,
    handler: TaggedEventHandler[dragenter],
    options: EventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_dragexit(node: HTMLElement, eventName: dragexit, handler: TaggedEventHandler[dragexit]): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_dragexit(node: HTMLElement, eventName: dragexit, handler: TaggedEventHandler[dragexit], options: Boolean): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_dragexit(
    node: HTMLElement,
    eventName: dragexit,
    handler: TaggedEventHandler[dragexit],
    options: EventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_dragleave(node: HTMLElement, eventName: dragleave, handler: TaggedEventHandler[dragleave]): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_dragleave(node: HTMLElement, eventName: dragleave, handler: TaggedEventHandler[dragleave], options: Boolean): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_dragleave(
    node: HTMLElement,
    eventName: dragleave,
    handler: TaggedEventHandler[dragleave],
    options: EventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_dragover(node: HTMLElement, eventName: dragover, handler: TaggedEventHandler[dragover]): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_dragover(node: HTMLElement, eventName: dragover, handler: TaggedEventHandler[dragover], options: Boolean): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_dragover(
    node: HTMLElement,
    eventName: dragover,
    handler: TaggedEventHandler[dragover],
    options: EventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_dragstart(node: HTMLElement, eventName: dragstart, handler: TaggedEventHandler[dragstart]): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_dragstart(node: HTMLElement, eventName: dragstart, handler: TaggedEventHandler[dragstart], options: Boolean): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_dragstart(
    node: HTMLElement,
    eventName: dragstart,
    handler: TaggedEventHandler[dragstart],
    options: EventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_drop(node: HTMLElement, eventName: drop, handler: TaggedEventHandler[drop]): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_drop(node: HTMLElement, eventName: drop, handler: TaggedEventHandler[drop], options: Boolean): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_drop(
    node: HTMLElement,
    eventName: drop,
    handler: TaggedEventHandler[drop],
    options: EventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_durationchange(node: HTMLElement, eventName: durationchange, handler: TaggedEventHandler[durationchange]): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_durationchange(
    node: HTMLElement,
    eventName: durationchange,
    handler: TaggedEventHandler[durationchange],
    options: Boolean
  ): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_durationchange(
    node: HTMLElement,
    eventName: durationchange,
    handler: TaggedEventHandler[durationchange],
    options: EventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_emptied(node: HTMLElement, eventName: emptied, handler: TaggedEventHandler[emptied]): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_emptied(node: HTMLElement, eventName: emptied, handler: TaggedEventHandler[emptied], options: Boolean): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_emptied(
    node: HTMLElement,
    eventName: emptied,
    handler: TaggedEventHandler[emptied],
    options: EventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_ended(node: HTMLElement, eventName: ended, handler: TaggedEventHandler[ended]): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_ended(node: HTMLElement, eventName: ended, handler: TaggedEventHandler[ended], options: Boolean): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_ended(
    node: HTMLElement,
    eventName: ended,
    handler: TaggedEventHandler[ended],
    options: EventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_error(node: HTMLElement, eventName: error, handler: TaggedEventHandler[error]): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_error(node: HTMLElement, eventName: error, handler: TaggedEventHandler[error], options: Boolean): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_error(
    node: HTMLElement,
    eventName: error,
    handler: TaggedEventHandler[error],
    options: EventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_focus(node: HTMLElement, eventName: focus, handler: TaggedEventHandler[focus]): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_focus(node: HTMLElement, eventName: focus, handler: TaggedEventHandler[focus], options: Boolean): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_focus(
    node: HTMLElement,
    eventName: focus,
    handler: TaggedEventHandler[focus],
    options: EventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_focusin(node: HTMLElement, eventName: focusin, handler: TaggedEventHandler[focusin]): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_focusin(node: HTMLElement, eventName: focusin, handler: TaggedEventHandler[focusin], options: Boolean): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_focusin(
    node: HTMLElement,
    eventName: focusin,
    handler: TaggedEventHandler[focusin],
    options: EventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_focusout(node: HTMLElement, eventName: focusout, handler: TaggedEventHandler[focusout]): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_focusout(node: HTMLElement, eventName: focusout, handler: TaggedEventHandler[focusout], options: Boolean): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_focusout(
    node: HTMLElement,
    eventName: focusout,
    handler: TaggedEventHandler[focusout],
    options: EventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_fullscreenchange(node: HTMLElement, eventName: fullscreenchange, handler: TaggedEventHandler[fullscreenchange]): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_fullscreenchange(
    node: HTMLElement,
    eventName: fullscreenchange,
    handler: TaggedEventHandler[fullscreenchange],
    options: Boolean
  ): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_fullscreenchange(
    node: HTMLElement,
    eventName: fullscreenchange,
    handler: TaggedEventHandler[fullscreenchange],
    options: EventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_fullscreenerror(node: HTMLElement, eventName: fullscreenerror, handler: TaggedEventHandler[fullscreenerror]): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_fullscreenerror(
    node: HTMLElement,
    eventName: fullscreenerror,
    handler: TaggedEventHandler[fullscreenerror],
    options: Boolean
  ): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_fullscreenerror(
    node: HTMLElement,
    eventName: fullscreenerror,
    handler: TaggedEventHandler[fullscreenerror],
    options: EventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_gotpointercapture(node: HTMLElement, eventName: gotpointercapture, handler: TaggedEventHandler[gotpointercapture]): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_gotpointercapture(
    node: HTMLElement,
    eventName: gotpointercapture,
    handler: TaggedEventHandler[gotpointercapture],
    options: Boolean
  ): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_gotpointercapture(
    node: HTMLElement,
    eventName: gotpointercapture,
    handler: TaggedEventHandler[gotpointercapture],
    options: EventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_input(node: HTMLElement, eventName: input, handler: TaggedEventHandler[input]): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_input(node: HTMLElement, eventName: input, handler: TaggedEventHandler[input], options: Boolean): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_input(
    node: HTMLElement,
    eventName: input,
    handler: TaggedEventHandler[input],
    options: EventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_invalid(node: HTMLElement, eventName: invalid, handler: TaggedEventHandler[invalid]): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_invalid(node: HTMLElement, eventName: invalid, handler: TaggedEventHandler[invalid], options: Boolean): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_invalid(
    node: HTMLElement,
    eventName: invalid,
    handler: TaggedEventHandler[invalid],
    options: EventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_keydown(node: HTMLElement, eventName: keydown, handler: TaggedEventHandler[keydown]): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_keydown(node: HTMLElement, eventName: keydown, handler: TaggedEventHandler[keydown], options: Boolean): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_keydown(
    node: HTMLElement,
    eventName: keydown,
    handler: TaggedEventHandler[keydown],
    options: EventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_keypress(node: HTMLElement, eventName: keypress, handler: TaggedEventHandler[keypress]): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_keypress(node: HTMLElement, eventName: keypress, handler: TaggedEventHandler[keypress], options: Boolean): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_keypress(
    node: HTMLElement,
    eventName: keypress,
    handler: TaggedEventHandler[keypress],
    options: EventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_keyup(node: HTMLElement, eventName: keyup, handler: TaggedEventHandler[keyup]): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_keyup(node: HTMLElement, eventName: keyup, handler: TaggedEventHandler[keyup], options: Boolean): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_keyup(
    node: HTMLElement,
    eventName: keyup,
    handler: TaggedEventHandler[keyup],
    options: EventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_load(node: HTMLElement, eventName: load, handler: TaggedEventHandler[load]): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_load(node: HTMLElement, eventName: load, handler: TaggedEventHandler[load], options: Boolean): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_load(
    node: HTMLElement,
    eventName: load,
    handler: TaggedEventHandler[load],
    options: EventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_loadeddata(node: HTMLElement, eventName: loadeddata, handler: TaggedEventHandler[loadeddata]): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_loadeddata(
    node: HTMLElement,
    eventName: loadeddata,
    handler: TaggedEventHandler[loadeddata],
    options: Boolean
  ): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_loadeddata(
    node: HTMLElement,
    eventName: loadeddata,
    handler: TaggedEventHandler[loadeddata],
    options: EventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_loadedmetadata(node: HTMLElement, eventName: loadedmetadata, handler: TaggedEventHandler[loadedmetadata]): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_loadedmetadata(
    node: HTMLElement,
    eventName: loadedmetadata,
    handler: TaggedEventHandler[loadedmetadata],
    options: Boolean
  ): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_loadedmetadata(
    node: HTMLElement,
    eventName: loadedmetadata,
    handler: TaggedEventHandler[loadedmetadata],
    options: EventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_loadstart(node: HTMLElement, eventName: loadstart, handler: TaggedEventHandler[loadstart]): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_loadstart(node: HTMLElement, eventName: loadstart, handler: TaggedEventHandler[loadstart], options: Boolean): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_loadstart(
    node: HTMLElement,
    eventName: loadstart,
    handler: TaggedEventHandler[loadstart],
    options: EventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_lostpointercapture(node: HTMLElement, eventName: lostpointercapture, handler: TaggedEventHandler[lostpointercapture]): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_lostpointercapture(
    node: HTMLElement,
    eventName: lostpointercapture,
    handler: TaggedEventHandler[lostpointercapture],
    options: Boolean
  ): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_lostpointercapture(
    node: HTMLElement,
    eventName: lostpointercapture,
    handler: TaggedEventHandler[lostpointercapture],
    options: EventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_mousedown(node: HTMLElement, eventName: mousedown, handler: TaggedEventHandler[mousedown]): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_mousedown(node: HTMLElement, eventName: mousedown, handler: TaggedEventHandler[mousedown], options: Boolean): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_mousedown(
    node: HTMLElement,
    eventName: mousedown,
    handler: TaggedEventHandler[mousedown],
    options: EventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_mouseenter(node: HTMLElement, eventName: mouseenter, handler: TaggedEventHandler[mouseenter]): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_mouseenter(
    node: HTMLElement,
    eventName: mouseenter,
    handler: TaggedEventHandler[mouseenter],
    options: Boolean
  ): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_mouseenter(
    node: HTMLElement,
    eventName: mouseenter,
    handler: TaggedEventHandler[mouseenter],
    options: EventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_mouseleave(node: HTMLElement, eventName: mouseleave, handler: TaggedEventHandler[mouseleave]): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_mouseleave(
    node: HTMLElement,
    eventName: mouseleave,
    handler: TaggedEventHandler[mouseleave],
    options: Boolean
  ): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_mouseleave(
    node: HTMLElement,
    eventName: mouseleave,
    handler: TaggedEventHandler[mouseleave],
    options: EventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_mousemove(node: HTMLElement, eventName: mousemove, handler: TaggedEventHandler[mousemove]): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_mousemove(node: HTMLElement, eventName: mousemove, handler: TaggedEventHandler[mousemove], options: Boolean): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_mousemove(
    node: HTMLElement,
    eventName: mousemove,
    handler: TaggedEventHandler[mousemove],
    options: EventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_mouseout(node: HTMLElement, eventName: mouseout, handler: TaggedEventHandler[mouseout]): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_mouseout(node: HTMLElement, eventName: mouseout, handler: TaggedEventHandler[mouseout], options: Boolean): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_mouseout(
    node: HTMLElement,
    eventName: mouseout,
    handler: TaggedEventHandler[mouseout],
    options: EventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_mouseover(node: HTMLElement, eventName: mouseover, handler: TaggedEventHandler[mouseover]): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_mouseover(node: HTMLElement, eventName: mouseover, handler: TaggedEventHandler[mouseover], options: Boolean): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_mouseover(
    node: HTMLElement,
    eventName: mouseover,
    handler: TaggedEventHandler[mouseover],
    options: EventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_mouseup(node: HTMLElement, eventName: mouseup, handler: TaggedEventHandler[mouseup]): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_mouseup(node: HTMLElement, eventName: mouseup, handler: TaggedEventHandler[mouseup], options: Boolean): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_mouseup(
    node: HTMLElement,
    eventName: mouseup,
    handler: TaggedEventHandler[mouseup],
    options: EventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_paste(node: HTMLElement, eventName: paste, handler: TaggedEventHandler[paste]): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_paste(node: HTMLElement, eventName: paste, handler: TaggedEventHandler[paste], options: Boolean): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_paste(
    node: HTMLElement,
    eventName: paste,
    handler: TaggedEventHandler[paste],
    options: EventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_pause(node: HTMLElement, eventName: pause, handler: TaggedEventHandler[pause]): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_pause(node: HTMLElement, eventName: pause, handler: TaggedEventHandler[pause], options: Boolean): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_pause(
    node: HTMLElement,
    eventName: pause,
    handler: TaggedEventHandler[pause],
    options: EventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_play(node: HTMLElement, eventName: play, handler: TaggedEventHandler[play]): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_play(node: HTMLElement, eventName: play, handler: TaggedEventHandler[play], options: Boolean): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_play(
    node: HTMLElement,
    eventName: play,
    handler: TaggedEventHandler[play],
    options: EventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_playing(node: HTMLElement, eventName: playing, handler: TaggedEventHandler[playing]): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_playing(node: HTMLElement, eventName: playing, handler: TaggedEventHandler[playing], options: Boolean): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_playing(
    node: HTMLElement,
    eventName: playing,
    handler: TaggedEventHandler[playing],
    options: EventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_pointercancel(node: HTMLElement, eventName: pointercancel, handler: TaggedEventHandler[pointercancel]): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_pointercancel(
    node: HTMLElement,
    eventName: pointercancel,
    handler: TaggedEventHandler[pointercancel],
    options: Boolean
  ): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_pointercancel(
    node: HTMLElement,
    eventName: pointercancel,
    handler: TaggedEventHandler[pointercancel],
    options: EventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_pointerdown(node: HTMLElement, eventName: pointerdown, handler: TaggedEventHandler[pointerdown]): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_pointerdown(
    node: HTMLElement,
    eventName: pointerdown,
    handler: TaggedEventHandler[pointerdown],
    options: Boolean
  ): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_pointerdown(
    node: HTMLElement,
    eventName: pointerdown,
    handler: TaggedEventHandler[pointerdown],
    options: EventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_pointerenter(node: HTMLElement, eventName: pointerenter, handler: TaggedEventHandler[pointerenter]): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_pointerenter(
    node: HTMLElement,
    eventName: pointerenter,
    handler: TaggedEventHandler[pointerenter],
    options: Boolean
  ): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_pointerenter(
    node: HTMLElement,
    eventName: pointerenter,
    handler: TaggedEventHandler[pointerenter],
    options: EventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_pointerleave(node: HTMLElement, eventName: pointerleave, handler: TaggedEventHandler[pointerleave]): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_pointerleave(
    node: HTMLElement,
    eventName: pointerleave,
    handler: TaggedEventHandler[pointerleave],
    options: Boolean
  ): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_pointerleave(
    node: HTMLElement,
    eventName: pointerleave,
    handler: TaggedEventHandler[pointerleave],
    options: EventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_pointermove(node: HTMLElement, eventName: pointermove, handler: TaggedEventHandler[pointermove]): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_pointermove(
    node: HTMLElement,
    eventName: pointermove,
    handler: TaggedEventHandler[pointermove],
    options: Boolean
  ): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_pointermove(
    node: HTMLElement,
    eventName: pointermove,
    handler: TaggedEventHandler[pointermove],
    options: EventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_pointerout(node: HTMLElement, eventName: pointerout, handler: TaggedEventHandler[pointerout]): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_pointerout(
    node: HTMLElement,
    eventName: pointerout,
    handler: TaggedEventHandler[pointerout],
    options: Boolean
  ): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_pointerout(
    node: HTMLElement,
    eventName: pointerout,
    handler: TaggedEventHandler[pointerout],
    options: EventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_pointerover(node: HTMLElement, eventName: pointerover, handler: TaggedEventHandler[pointerover]): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_pointerover(
    node: HTMLElement,
    eventName: pointerover,
    handler: TaggedEventHandler[pointerover],
    options: Boolean
  ): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_pointerover(
    node: HTMLElement,
    eventName: pointerover,
    handler: TaggedEventHandler[pointerover],
    options: EventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_pointerup(node: HTMLElement, eventName: pointerup, handler: TaggedEventHandler[pointerup]): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_pointerup(node: HTMLElement, eventName: pointerup, handler: TaggedEventHandler[pointerup], options: Boolean): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_pointerup(
    node: HTMLElement,
    eventName: pointerup,
    handler: TaggedEventHandler[pointerup],
    options: EventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_progress(node: HTMLElement, eventName: progress, handler: TaggedEventHandler[progress]): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_progress(node: HTMLElement, eventName: progress, handler: TaggedEventHandler[progress], options: Boolean): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_progress(
    node: HTMLElement,
    eventName: progress,
    handler: TaggedEventHandler[progress],
    options: EventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_ratechange(node: HTMLElement, eventName: ratechange, handler: TaggedEventHandler[ratechange]): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_ratechange(
    node: HTMLElement,
    eventName: ratechange,
    handler: TaggedEventHandler[ratechange],
    options: Boolean
  ): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_ratechange(
    node: HTMLElement,
    eventName: ratechange,
    handler: TaggedEventHandler[ratechange],
    options: EventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_reset(node: HTMLElement, eventName: reset, handler: TaggedEventHandler[reset]): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_reset(node: HTMLElement, eventName: reset, handler: TaggedEventHandler[reset], options: Boolean): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_reset(
    node: HTMLElement,
    eventName: reset,
    handler: TaggedEventHandler[reset],
    options: EventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_resize(node: HTMLElement, eventName: resize, handler: TaggedEventHandler[resize]): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_resize(node: HTMLElement, eventName: resize, handler: TaggedEventHandler[resize], options: Boolean): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_resize(
    node: HTMLElement,
    eventName: resize,
    handler: TaggedEventHandler[resize],
    options: EventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_scroll(node: HTMLElement, eventName: scroll, handler: TaggedEventHandler[scroll]): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_scroll(node: HTMLElement, eventName: scroll, handler: TaggedEventHandler[scroll], options: Boolean): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_scroll(
    node: HTMLElement,
    eventName: scroll,
    handler: TaggedEventHandler[scroll],
    options: EventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_securitypolicyviolation(
    node: HTMLElement,
    eventName: securitypolicyviolation,
    handler: TaggedEventHandler[securitypolicyviolation]
  ): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_securitypolicyviolation(
    node: HTMLElement,
    eventName: securitypolicyviolation,
    handler: TaggedEventHandler[securitypolicyviolation],
    options: Boolean
  ): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_securitypolicyviolation(
    node: HTMLElement,
    eventName: securitypolicyviolation,
    handler: TaggedEventHandler[securitypolicyviolation],
    options: EventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_seeked(node: HTMLElement, eventName: seeked, handler: TaggedEventHandler[seeked]): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_seeked(node: HTMLElement, eventName: seeked, handler: TaggedEventHandler[seeked], options: Boolean): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_seeked(
    node: HTMLElement,
    eventName: seeked,
    handler: TaggedEventHandler[seeked],
    options: EventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_seeking(node: HTMLElement, eventName: seeking, handler: TaggedEventHandler[seeking]): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_seeking(node: HTMLElement, eventName: seeking, handler: TaggedEventHandler[seeking], options: Boolean): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_seeking(
    node: HTMLElement,
    eventName: seeking,
    handler: TaggedEventHandler[seeking],
    options: EventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_select(node: HTMLElement, eventName: select, handler: TaggedEventHandler[select]): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_select(node: HTMLElement, eventName: select, handler: TaggedEventHandler[select], options: Boolean): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_select(
    node: HTMLElement,
    eventName: select,
    handler: TaggedEventHandler[select],
    options: EventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_selectionchange(node: HTMLElement, eventName: selectionchange, handler: TaggedEventHandler[selectionchange]): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_selectionchange(
    node: HTMLElement,
    eventName: selectionchange,
    handler: TaggedEventHandler[selectionchange],
    options: Boolean
  ): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_selectionchange(
    node: HTMLElement,
    eventName: selectionchange,
    handler: TaggedEventHandler[selectionchange],
    options: EventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_selectstart(node: HTMLElement, eventName: selectstart, handler: TaggedEventHandler[selectstart]): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_selectstart(
    node: HTMLElement,
    eventName: selectstart,
    handler: TaggedEventHandler[selectstart],
    options: Boolean
  ): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_selectstart(
    node: HTMLElement,
    eventName: selectstart,
    handler: TaggedEventHandler[selectstart],
    options: EventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_stalled(node: HTMLElement, eventName: stalled, handler: TaggedEventHandler[stalled]): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_stalled(node: HTMLElement, eventName: stalled, handler: TaggedEventHandler[stalled], options: Boolean): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_stalled(
    node: HTMLElement,
    eventName: stalled,
    handler: TaggedEventHandler[stalled],
    options: EventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_submit(node: HTMLElement, eventName: submit, handler: TaggedEventHandler[submit]): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_submit(node: HTMLElement, eventName: submit, handler: TaggedEventHandler[submit], options: Boolean): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_submit(
    node: HTMLElement,
    eventName: submit,
    handler: TaggedEventHandler[submit],
    options: EventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_suspend(node: HTMLElement, eventName: suspend, handler: TaggedEventHandler[suspend]): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_suspend(node: HTMLElement, eventName: suspend, handler: TaggedEventHandler[suspend], options: Boolean): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_suspend(
    node: HTMLElement,
    eventName: suspend,
    handler: TaggedEventHandler[suspend],
    options: EventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_timeupdate(node: HTMLElement, eventName: timeupdate, handler: TaggedEventHandler[timeupdate]): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_timeupdate(
    node: HTMLElement,
    eventName: timeupdate,
    handler: TaggedEventHandler[timeupdate],
    options: Boolean
  ): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_timeupdate(
    node: HTMLElement,
    eventName: timeupdate,
    handler: TaggedEventHandler[timeupdate],
    options: EventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_toggle(node: HTMLElement, eventName: toggle, handler: TaggedEventHandler[toggle]): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_toggle(node: HTMLElement, eventName: toggle, handler: TaggedEventHandler[toggle], options: Boolean): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_toggle(
    node: HTMLElement,
    eventName: toggle,
    handler: TaggedEventHandler[toggle],
    options: EventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_touchcancel(node: HTMLElement, eventName: touchcancel, handler: TaggedEventHandler[touchcancel]): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_touchcancel(
    node: HTMLElement,
    eventName: touchcancel,
    handler: TaggedEventHandler[touchcancel],
    options: Boolean
  ): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_touchcancel(
    node: HTMLElement,
    eventName: touchcancel,
    handler: TaggedEventHandler[touchcancel],
    options: EventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_touchend(node: HTMLElement, eventName: touchend, handler: TaggedEventHandler[touchend]): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_touchend(node: HTMLElement, eventName: touchend, handler: TaggedEventHandler[touchend], options: Boolean): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_touchend(
    node: HTMLElement,
    eventName: touchend,
    handler: TaggedEventHandler[touchend],
    options: EventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_touchmove(node: HTMLElement, eventName: touchmove, handler: TaggedEventHandler[touchmove]): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_touchmove(node: HTMLElement, eventName: touchmove, handler: TaggedEventHandler[touchmove], options: Boolean): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_touchmove(
    node: HTMLElement,
    eventName: touchmove,
    handler: TaggedEventHandler[touchmove],
    options: EventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_touchstart(node: HTMLElement, eventName: touchstart, handler: TaggedEventHandler[touchstart]): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_touchstart(
    node: HTMLElement,
    eventName: touchstart,
    handler: TaggedEventHandler[touchstart],
    options: Boolean
  ): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_touchstart(
    node: HTMLElement,
    eventName: touchstart,
    handler: TaggedEventHandler[touchstart],
    options: EventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_transitioncancel(node: HTMLElement, eventName: transitioncancel, handler: TaggedEventHandler[transitioncancel]): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_transitioncancel(
    node: HTMLElement,
    eventName: transitioncancel,
    handler: TaggedEventHandler[transitioncancel],
    options: Boolean
  ): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_transitioncancel(
    node: HTMLElement,
    eventName: transitioncancel,
    handler: TaggedEventHandler[transitioncancel],
    options: EventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_transitionend(node: HTMLElement, eventName: transitionend, handler: TaggedEventHandler[transitionend]): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_transitionend(
    node: HTMLElement,
    eventName: transitionend,
    handler: TaggedEventHandler[transitionend],
    options: Boolean
  ): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_transitionend(
    node: HTMLElement,
    eventName: transitionend,
    handler: TaggedEventHandler[transitionend],
    options: EventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_transitionrun(node: HTMLElement, eventName: transitionrun, handler: TaggedEventHandler[transitionrun]): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_transitionrun(
    node: HTMLElement,
    eventName: transitionrun,
    handler: TaggedEventHandler[transitionrun],
    options: Boolean
  ): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_transitionrun(
    node: HTMLElement,
    eventName: transitionrun,
    handler: TaggedEventHandler[transitionrun],
    options: EventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_transitionstart(node: HTMLElement, eventName: transitionstart, handler: TaggedEventHandler[transitionstart]): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_transitionstart(
    node: HTMLElement,
    eventName: transitionstart,
    handler: TaggedEventHandler[transitionstart],
    options: Boolean
  ): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_transitionstart(
    node: HTMLElement,
    eventName: transitionstart,
    handler: TaggedEventHandler[transitionstart],
    options: EventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_volumechange(node: HTMLElement, eventName: volumechange, handler: TaggedEventHandler[volumechange]): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_volumechange(
    node: HTMLElement,
    eventName: volumechange,
    handler: TaggedEventHandler[volumechange],
    options: Boolean
  ): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_volumechange(
    node: HTMLElement,
    eventName: volumechange,
    handler: TaggedEventHandler[volumechange],
    options: EventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_waiting(node: HTMLElement, eventName: waiting, handler: TaggedEventHandler[waiting]): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_waiting(node: HTMLElement, eventName: waiting, handler: TaggedEventHandler[waiting], options: Boolean): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_waiting(
    node: HTMLElement,
    eventName: waiting,
    handler: TaggedEventHandler[waiting],
    options: EventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_wheel(node: HTMLElement, eventName: wheel, handler: TaggedEventHandler[wheel]): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_wheel(node: HTMLElement, eventName: wheel, handler: TaggedEventHandler[wheel], options: Boolean): Unit = js.native
  @JSImport("dom-helpers", "removeEventListener")
  @js.native
  def removeEventListener_wheel(
    node: HTMLElement,
    eventName: wheel,
    handler: TaggedEventHandler[wheel],
    options: EventListenerOptions
  ): Unit = js.native
  
  @JSImport("dom-helpers", "requestAnimationFrame")
  @js.native
  val requestAnimationFrame: js.Function1[/* callback */ FrameRequestCallback, Double] = js.native
  
  @JSImport("dom-helpers", "scrollLeft")
  @js.native
  def scrollLeft(node: Element): Double = js.native
  @JSImport("dom-helpers", "scrollLeft")
  @js.native
  def scrollLeft(node: Element, `val`: Double): js.UndefOr[scala.Nothing] = js.native
  
  @JSImport("dom-helpers", "scrollParent")
  @js.native
  def scrollParent(element: HTMLElement): Document | HTMLElement = js.native
  @JSImport("dom-helpers", "scrollParent")
  @js.native
  def scrollParent(element: HTMLElement, firstPossible: Boolean): Document | HTMLElement = js.native
  
  @JSImport("dom-helpers", "scrollTo")
  @js.native
  def scrollTo(selected: HTMLElement): js.UndefOr[js.Function0[Unit]] = js.native
  @JSImport("dom-helpers", "scrollTo")
  @js.native
  def scrollTo(selected: HTMLElement, scrollParent: HTMLElement): js.UndefOr[js.Function0[Unit]] = js.native
  
  @JSImport("dom-helpers", "scrollTop")
  @js.native
  def scrollTop(node: Element): Double = js.native
  @JSImport("dom-helpers", "scrollTop")
  @js.native
  def scrollTop(node: Element, `val`: Double): js.UndefOr[scala.Nothing] = js.native
  
  @JSImport("dom-helpers", "scrollbarSize")
  @js.native
  def scrollbarSize(): Double = js.native
  @JSImport("dom-helpers", "scrollbarSize")
  @js.native
  def scrollbarSize(recalc: Boolean): Double = js.native
  
  @JSImport("dom-helpers", "style")
  @js.native
  def style(node: HTMLElement, property: PartialRecordPropertystri): Unit = js.native
  @JSImport("dom-helpers", "style")
  @js.native
  def style[T /* <: HyphenProperty */](node: HTMLElement, property: T): /* import warning: importer.ImportType#apply Failed type conversion: csstype.csstype.PropertiesHyphen<string | 0>[T] */ js.Any = js.native
  @JSImport("dom-helpers", "style")
  @js.native
  def style_T_CamelProperty[T /* <: CamelProperty */](node: HTMLElement, property: T): /* import warning: importer.ImportType#apply Failed type conversion: csstype.csstype.Properties<string | 0>[T] */ js.Any = js.native
  
  @JSImport("dom-helpers", "toggleClass")
  @js.native
  def toggleClass(element: Element, className: String): Unit = js.native
  @JSImport("dom-helpers", "toggleClass")
  @js.native
  def toggleClass(element: SVGElement, className: String): Unit = js.native
  
  @JSImport("dom-helpers", "transitionEnd")
  @js.native
  def transitionEnd(element: HTMLElement, handler: Listener): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "transitionEnd")
  @js.native
  def transitionEnd(element: HTMLElement, handler: Listener, duration: js.UndefOr[scala.Nothing], padding: Double): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "transitionEnd")
  @js.native
  def transitionEnd(element: HTMLElement, handler: Listener, duration: Double): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "transitionEnd")
  @js.native
  def transitionEnd(element: HTMLElement, handler: Listener, duration: Double, padding: Double): js.Function0[Unit] = js.native
  @JSImport("dom-helpers", "transitionEnd")
  @js.native
  def transitionEnd(element: HTMLElement, handler: Listener, duration: Null, padding: Double): js.Function0[Unit] = js.native
  
  @JSImport("dom-helpers", "width")
  @js.native
  def width(node: HTMLElement): Double = js.native
  @JSImport("dom-helpers", "width")
  @js.native
  def width(node: HTMLElement, client: Boolean): Double = js.native
}
