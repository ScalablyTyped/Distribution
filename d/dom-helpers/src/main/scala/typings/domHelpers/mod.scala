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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("dom-helpers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object default {
    
    @JSImport("dom-helpers", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def activeElement(): Element | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("activeElement")().asInstanceOf[Element | Null]
    inline def activeElement(doc: Document): Element | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("activeElement")(doc.asInstanceOf[js.Any]).asInstanceOf[Element | Null]
    @JSImport("dom-helpers", "default.activeElement")
    @js.native
    def activeElement_Fdefault: js.Function1[/* doc */ js.UndefOr[Document], Element | Null] = js.native
    
    inline def activeElement_Fdefault_=(x: js.Function1[/* doc */ js.UndefOr[Document], Element | Null]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("activeElement")(x.asInstanceOf[js.Any])
    
    @JSImport("dom-helpers", "default.addClass")
    @js.native
    def addClass: js.Function2[/* element */ Element | SVGElement, /* className */ String, Unit] = js.native
    inline def addClass(element: Element, className: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addClass")(element.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addClass(element: SVGElement, className: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addClass")(element.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addClass_=(x: js.Function2[/* element */ Element | SVGElement, /* className */ String, Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("addClass")(x.asInstanceOf[js.Any])
    
    @JSImport("dom-helpers", "default.addEventListener")
    @js.native
    def addEventListener: FnCallNodeEventNameHandlerOptions = js.native
    inline def addEventListener_=(x: FnCallNodeEventNameHandlerOptions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("addEventListener")(x.asInstanceOf[js.Any])
    
    inline def addEventListener_abort(node: HTMLElement, eventName: abort, handler: TaggedEventHandler[abort]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addEventListener_abort(node: HTMLElement, eventName: abort, handler: TaggedEventHandler[abort], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addEventListener_abort(
      node: HTMLElement,
      eventName: abort,
      handler: TaggedEventHandler[abort],
      options: AddEventListenerOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def addEventListener_animationcancel(node: HTMLElement, eventName: animationcancel, handler: TaggedEventHandler[animationcancel]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addEventListener_animationcancel(
      node: HTMLElement,
      eventName: animationcancel,
      handler: TaggedEventHandler[animationcancel],
      options: Boolean
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addEventListener_animationcancel(
      node: HTMLElement,
      eventName: animationcancel,
      handler: TaggedEventHandler[animationcancel],
      options: AddEventListenerOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def addEventListener_animationend(node: HTMLElement, eventName: animationend, handler: TaggedEventHandler[animationend]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addEventListener_animationend(
      node: HTMLElement,
      eventName: animationend,
      handler: TaggedEventHandler[animationend],
      options: Boolean
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addEventListener_animationend(
      node: HTMLElement,
      eventName: animationend,
      handler: TaggedEventHandler[animationend],
      options: AddEventListenerOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def addEventListener_animationiteration(node: HTMLElement, eventName: animationiteration, handler: TaggedEventHandler[animationiteration]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addEventListener_animationiteration(
      node: HTMLElement,
      eventName: animationiteration,
      handler: TaggedEventHandler[animationiteration],
      options: Boolean
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addEventListener_animationiteration(
      node: HTMLElement,
      eventName: animationiteration,
      handler: TaggedEventHandler[animationiteration],
      options: AddEventListenerOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def addEventListener_animationstart(node: HTMLElement, eventName: animationstart, handler: TaggedEventHandler[animationstart]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addEventListener_animationstart(
      node: HTMLElement,
      eventName: animationstart,
      handler: TaggedEventHandler[animationstart],
      options: Boolean
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addEventListener_animationstart(
      node: HTMLElement,
      eventName: animationstart,
      handler: TaggedEventHandler[animationstart],
      options: AddEventListenerOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def addEventListener_auxclick(node: HTMLElement, eventName: auxclick, handler: TaggedEventHandler[auxclick]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addEventListener_auxclick(node: HTMLElement, eventName: auxclick, handler: TaggedEventHandler[auxclick], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addEventListener_auxclick(
      node: HTMLElement,
      eventName: auxclick,
      handler: TaggedEventHandler[auxclick],
      options: AddEventListenerOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def addEventListener_blur(node: HTMLElement, eventName: blur, handler: TaggedEventHandler[blur]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addEventListener_blur(node: HTMLElement, eventName: blur, handler: TaggedEventHandler[blur], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addEventListener_blur(
      node: HTMLElement,
      eventName: blur,
      handler: TaggedEventHandler[blur],
      options: AddEventListenerOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def addEventListener_cancel(node: HTMLElement, eventName: cancel, handler: TaggedEventHandler[cancel]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addEventListener_cancel(node: HTMLElement, eventName: cancel, handler: TaggedEventHandler[cancel], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addEventListener_cancel(
      node: HTMLElement,
      eventName: cancel,
      handler: TaggedEventHandler[cancel],
      options: AddEventListenerOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def addEventListener_canplay(node: HTMLElement, eventName: canplay, handler: TaggedEventHandler[canplay]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addEventListener_canplay(node: HTMLElement, eventName: canplay, handler: TaggedEventHandler[canplay], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addEventListener_canplay(
      node: HTMLElement,
      eventName: canplay,
      handler: TaggedEventHandler[canplay],
      options: AddEventListenerOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def addEventListener_canplaythrough(node: HTMLElement, eventName: canplaythrough, handler: TaggedEventHandler[canplaythrough]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addEventListener_canplaythrough(
      node: HTMLElement,
      eventName: canplaythrough,
      handler: TaggedEventHandler[canplaythrough],
      options: Boolean
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addEventListener_canplaythrough(
      node: HTMLElement,
      eventName: canplaythrough,
      handler: TaggedEventHandler[canplaythrough],
      options: AddEventListenerOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def addEventListener_change(node: HTMLElement, eventName: change, handler: TaggedEventHandler[change]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addEventListener_change(node: HTMLElement, eventName: change, handler: TaggedEventHandler[change], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addEventListener_change(
      node: HTMLElement,
      eventName: change,
      handler: TaggedEventHandler[change],
      options: AddEventListenerOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def addEventListener_click(node: HTMLElement, eventName: click, handler: TaggedEventHandler[click]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addEventListener_click(node: HTMLElement, eventName: click, handler: TaggedEventHandler[click], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addEventListener_click(
      node: HTMLElement,
      eventName: click,
      handler: TaggedEventHandler[click],
      options: AddEventListenerOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def addEventListener_close(node: HTMLElement, eventName: close, handler: TaggedEventHandler[close]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addEventListener_close(node: HTMLElement, eventName: close, handler: TaggedEventHandler[close], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addEventListener_close(
      node: HTMLElement,
      eventName: close,
      handler: TaggedEventHandler[close],
      options: AddEventListenerOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def addEventListener_contextmenu(node: HTMLElement, eventName: contextmenu, handler: TaggedEventHandler[contextmenu]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addEventListener_contextmenu(
      node: HTMLElement,
      eventName: contextmenu,
      handler: TaggedEventHandler[contextmenu],
      options: Boolean
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addEventListener_contextmenu(
      node: HTMLElement,
      eventName: contextmenu,
      handler: TaggedEventHandler[contextmenu],
      options: AddEventListenerOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def addEventListener_copy(node: HTMLElement, eventName: copy, handler: TaggedEventHandler[copy]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addEventListener_copy(node: HTMLElement, eventName: copy, handler: TaggedEventHandler[copy], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addEventListener_copy(
      node: HTMLElement,
      eventName: copy,
      handler: TaggedEventHandler[copy],
      options: AddEventListenerOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def addEventListener_cuechange(node: HTMLElement, eventName: cuechange, handler: TaggedEventHandler[cuechange]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addEventListener_cuechange(node: HTMLElement, eventName: cuechange, handler: TaggedEventHandler[cuechange], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addEventListener_cuechange(
      node: HTMLElement,
      eventName: cuechange,
      handler: TaggedEventHandler[cuechange],
      options: AddEventListenerOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def addEventListener_cut(node: HTMLElement, eventName: cut, handler: TaggedEventHandler[cut]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addEventListener_cut(node: HTMLElement, eventName: cut, handler: TaggedEventHandler[cut], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addEventListener_cut(
      node: HTMLElement,
      eventName: cut,
      handler: TaggedEventHandler[cut],
      options: AddEventListenerOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def addEventListener_dblclick(node: HTMLElement, eventName: dblclick, handler: TaggedEventHandler[dblclick]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addEventListener_dblclick(node: HTMLElement, eventName: dblclick, handler: TaggedEventHandler[dblclick], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addEventListener_dblclick(
      node: HTMLElement,
      eventName: dblclick,
      handler: TaggedEventHandler[dblclick],
      options: AddEventListenerOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def addEventListener_drag(node: HTMLElement, eventName: drag, handler: TaggedEventHandler[drag]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addEventListener_drag(node: HTMLElement, eventName: drag, handler: TaggedEventHandler[drag], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addEventListener_drag(
      node: HTMLElement,
      eventName: drag,
      handler: TaggedEventHandler[drag],
      options: AddEventListenerOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def addEventListener_dragend(node: HTMLElement, eventName: dragend, handler: TaggedEventHandler[dragend]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addEventListener_dragend(node: HTMLElement, eventName: dragend, handler: TaggedEventHandler[dragend], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addEventListener_dragend(
      node: HTMLElement,
      eventName: dragend,
      handler: TaggedEventHandler[dragend],
      options: AddEventListenerOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def addEventListener_dragenter(node: HTMLElement, eventName: dragenter, handler: TaggedEventHandler[dragenter]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addEventListener_dragenter(node: HTMLElement, eventName: dragenter, handler: TaggedEventHandler[dragenter], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addEventListener_dragenter(
      node: HTMLElement,
      eventName: dragenter,
      handler: TaggedEventHandler[dragenter],
      options: AddEventListenerOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def addEventListener_dragexit(node: HTMLElement, eventName: dragexit, handler: TaggedEventHandler[dragexit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addEventListener_dragexit(node: HTMLElement, eventName: dragexit, handler: TaggedEventHandler[dragexit], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addEventListener_dragexit(
      node: HTMLElement,
      eventName: dragexit,
      handler: TaggedEventHandler[dragexit],
      options: AddEventListenerOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def addEventListener_dragleave(node: HTMLElement, eventName: dragleave, handler: TaggedEventHandler[dragleave]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addEventListener_dragleave(node: HTMLElement, eventName: dragleave, handler: TaggedEventHandler[dragleave], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addEventListener_dragleave(
      node: HTMLElement,
      eventName: dragleave,
      handler: TaggedEventHandler[dragleave],
      options: AddEventListenerOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def addEventListener_dragover(node: HTMLElement, eventName: dragover, handler: TaggedEventHandler[dragover]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addEventListener_dragover(node: HTMLElement, eventName: dragover, handler: TaggedEventHandler[dragover], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addEventListener_dragover(
      node: HTMLElement,
      eventName: dragover,
      handler: TaggedEventHandler[dragover],
      options: AddEventListenerOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def addEventListener_dragstart(node: HTMLElement, eventName: dragstart, handler: TaggedEventHandler[dragstart]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addEventListener_dragstart(node: HTMLElement, eventName: dragstart, handler: TaggedEventHandler[dragstart], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addEventListener_dragstart(
      node: HTMLElement,
      eventName: dragstart,
      handler: TaggedEventHandler[dragstart],
      options: AddEventListenerOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def addEventListener_drop(node: HTMLElement, eventName: drop, handler: TaggedEventHandler[drop]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addEventListener_drop(node: HTMLElement, eventName: drop, handler: TaggedEventHandler[drop], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addEventListener_drop(
      node: HTMLElement,
      eventName: drop,
      handler: TaggedEventHandler[drop],
      options: AddEventListenerOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def addEventListener_durationchange(node: HTMLElement, eventName: durationchange, handler: TaggedEventHandler[durationchange]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addEventListener_durationchange(
      node: HTMLElement,
      eventName: durationchange,
      handler: TaggedEventHandler[durationchange],
      options: Boolean
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addEventListener_durationchange(
      node: HTMLElement,
      eventName: durationchange,
      handler: TaggedEventHandler[durationchange],
      options: AddEventListenerOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def addEventListener_emptied(node: HTMLElement, eventName: emptied, handler: TaggedEventHandler[emptied]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addEventListener_emptied(node: HTMLElement, eventName: emptied, handler: TaggedEventHandler[emptied], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addEventListener_emptied(
      node: HTMLElement,
      eventName: emptied,
      handler: TaggedEventHandler[emptied],
      options: AddEventListenerOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def addEventListener_ended(node: HTMLElement, eventName: ended, handler: TaggedEventHandler[ended]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addEventListener_ended(node: HTMLElement, eventName: ended, handler: TaggedEventHandler[ended], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addEventListener_ended(
      node: HTMLElement,
      eventName: ended,
      handler: TaggedEventHandler[ended],
      options: AddEventListenerOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def addEventListener_error(node: HTMLElement, eventName: error, handler: TaggedEventHandler[error]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addEventListener_error(node: HTMLElement, eventName: error, handler: TaggedEventHandler[error], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addEventListener_error(
      node: HTMLElement,
      eventName: error,
      handler: TaggedEventHandler[error],
      options: AddEventListenerOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def addEventListener_focus(node: HTMLElement, eventName: focus, handler: TaggedEventHandler[focus]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addEventListener_focus(node: HTMLElement, eventName: focus, handler: TaggedEventHandler[focus], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addEventListener_focus(
      node: HTMLElement,
      eventName: focus,
      handler: TaggedEventHandler[focus],
      options: AddEventListenerOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def addEventListener_focusin(node: HTMLElement, eventName: focusin, handler: TaggedEventHandler[focusin]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addEventListener_focusin(node: HTMLElement, eventName: focusin, handler: TaggedEventHandler[focusin], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addEventListener_focusin(
      node: HTMLElement,
      eventName: focusin,
      handler: TaggedEventHandler[focusin],
      options: AddEventListenerOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def addEventListener_focusout(node: HTMLElement, eventName: focusout, handler: TaggedEventHandler[focusout]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addEventListener_focusout(node: HTMLElement, eventName: focusout, handler: TaggedEventHandler[focusout], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addEventListener_focusout(
      node: HTMLElement,
      eventName: focusout,
      handler: TaggedEventHandler[focusout],
      options: AddEventListenerOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def addEventListener_fullscreenchange(node: HTMLElement, eventName: fullscreenchange, handler: TaggedEventHandler[fullscreenchange]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addEventListener_fullscreenchange(
      node: HTMLElement,
      eventName: fullscreenchange,
      handler: TaggedEventHandler[fullscreenchange],
      options: Boolean
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addEventListener_fullscreenchange(
      node: HTMLElement,
      eventName: fullscreenchange,
      handler: TaggedEventHandler[fullscreenchange],
      options: AddEventListenerOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def addEventListener_fullscreenerror(node: HTMLElement, eventName: fullscreenerror, handler: TaggedEventHandler[fullscreenerror]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addEventListener_fullscreenerror(
      node: HTMLElement,
      eventName: fullscreenerror,
      handler: TaggedEventHandler[fullscreenerror],
      options: Boolean
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addEventListener_fullscreenerror(
      node: HTMLElement,
      eventName: fullscreenerror,
      handler: TaggedEventHandler[fullscreenerror],
      options: AddEventListenerOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def addEventListener_gotpointercapture(node: HTMLElement, eventName: gotpointercapture, handler: TaggedEventHandler[gotpointercapture]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addEventListener_gotpointercapture(
      node: HTMLElement,
      eventName: gotpointercapture,
      handler: TaggedEventHandler[gotpointercapture],
      options: Boolean
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addEventListener_gotpointercapture(
      node: HTMLElement,
      eventName: gotpointercapture,
      handler: TaggedEventHandler[gotpointercapture],
      options: AddEventListenerOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def addEventListener_input(node: HTMLElement, eventName: input, handler: TaggedEventHandler[input]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addEventListener_input(node: HTMLElement, eventName: input, handler: TaggedEventHandler[input], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addEventListener_input(
      node: HTMLElement,
      eventName: input,
      handler: TaggedEventHandler[input],
      options: AddEventListenerOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def addEventListener_invalid(node: HTMLElement, eventName: invalid, handler: TaggedEventHandler[invalid]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addEventListener_invalid(node: HTMLElement, eventName: invalid, handler: TaggedEventHandler[invalid], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addEventListener_invalid(
      node: HTMLElement,
      eventName: invalid,
      handler: TaggedEventHandler[invalid],
      options: AddEventListenerOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def addEventListener_keydown(node: HTMLElement, eventName: keydown, handler: TaggedEventHandler[keydown]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addEventListener_keydown(node: HTMLElement, eventName: keydown, handler: TaggedEventHandler[keydown], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addEventListener_keydown(
      node: HTMLElement,
      eventName: keydown,
      handler: TaggedEventHandler[keydown],
      options: AddEventListenerOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def addEventListener_keypress(node: HTMLElement, eventName: keypress, handler: TaggedEventHandler[keypress]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addEventListener_keypress(node: HTMLElement, eventName: keypress, handler: TaggedEventHandler[keypress], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addEventListener_keypress(
      node: HTMLElement,
      eventName: keypress,
      handler: TaggedEventHandler[keypress],
      options: AddEventListenerOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def addEventListener_keyup(node: HTMLElement, eventName: keyup, handler: TaggedEventHandler[keyup]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addEventListener_keyup(node: HTMLElement, eventName: keyup, handler: TaggedEventHandler[keyup], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addEventListener_keyup(
      node: HTMLElement,
      eventName: keyup,
      handler: TaggedEventHandler[keyup],
      options: AddEventListenerOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def addEventListener_load(node: HTMLElement, eventName: load, handler: TaggedEventHandler[load]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addEventListener_load(node: HTMLElement, eventName: load, handler: TaggedEventHandler[load], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addEventListener_load(
      node: HTMLElement,
      eventName: load,
      handler: TaggedEventHandler[load],
      options: AddEventListenerOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def addEventListener_loadeddata(node: HTMLElement, eventName: loadeddata, handler: TaggedEventHandler[loadeddata]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addEventListener_loadeddata(
      node: HTMLElement,
      eventName: loadeddata,
      handler: TaggedEventHandler[loadeddata],
      options: Boolean
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addEventListener_loadeddata(
      node: HTMLElement,
      eventName: loadeddata,
      handler: TaggedEventHandler[loadeddata],
      options: AddEventListenerOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def addEventListener_loadedmetadata(node: HTMLElement, eventName: loadedmetadata, handler: TaggedEventHandler[loadedmetadata]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addEventListener_loadedmetadata(
      node: HTMLElement,
      eventName: loadedmetadata,
      handler: TaggedEventHandler[loadedmetadata],
      options: Boolean
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addEventListener_loadedmetadata(
      node: HTMLElement,
      eventName: loadedmetadata,
      handler: TaggedEventHandler[loadedmetadata],
      options: AddEventListenerOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def addEventListener_loadstart(node: HTMLElement, eventName: loadstart, handler: TaggedEventHandler[loadstart]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addEventListener_loadstart(node: HTMLElement, eventName: loadstart, handler: TaggedEventHandler[loadstart], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addEventListener_loadstart(
      node: HTMLElement,
      eventName: loadstart,
      handler: TaggedEventHandler[loadstart],
      options: AddEventListenerOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def addEventListener_lostpointercapture(node: HTMLElement, eventName: lostpointercapture, handler: TaggedEventHandler[lostpointercapture]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addEventListener_lostpointercapture(
      node: HTMLElement,
      eventName: lostpointercapture,
      handler: TaggedEventHandler[lostpointercapture],
      options: Boolean
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addEventListener_lostpointercapture(
      node: HTMLElement,
      eventName: lostpointercapture,
      handler: TaggedEventHandler[lostpointercapture],
      options: AddEventListenerOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def addEventListener_mousedown(node: HTMLElement, eventName: mousedown, handler: TaggedEventHandler[mousedown]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addEventListener_mousedown(node: HTMLElement, eventName: mousedown, handler: TaggedEventHandler[mousedown], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addEventListener_mousedown(
      node: HTMLElement,
      eventName: mousedown,
      handler: TaggedEventHandler[mousedown],
      options: AddEventListenerOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def addEventListener_mouseenter(node: HTMLElement, eventName: mouseenter, handler: TaggedEventHandler[mouseenter]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addEventListener_mouseenter(
      node: HTMLElement,
      eventName: mouseenter,
      handler: TaggedEventHandler[mouseenter],
      options: Boolean
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addEventListener_mouseenter(
      node: HTMLElement,
      eventName: mouseenter,
      handler: TaggedEventHandler[mouseenter],
      options: AddEventListenerOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def addEventListener_mouseleave(node: HTMLElement, eventName: mouseleave, handler: TaggedEventHandler[mouseleave]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addEventListener_mouseleave(
      node: HTMLElement,
      eventName: mouseleave,
      handler: TaggedEventHandler[mouseleave],
      options: Boolean
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addEventListener_mouseleave(
      node: HTMLElement,
      eventName: mouseleave,
      handler: TaggedEventHandler[mouseleave],
      options: AddEventListenerOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def addEventListener_mousemove(node: HTMLElement, eventName: mousemove, handler: TaggedEventHandler[mousemove]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addEventListener_mousemove(node: HTMLElement, eventName: mousemove, handler: TaggedEventHandler[mousemove], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addEventListener_mousemove(
      node: HTMLElement,
      eventName: mousemove,
      handler: TaggedEventHandler[mousemove],
      options: AddEventListenerOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def addEventListener_mouseout(node: HTMLElement, eventName: mouseout, handler: TaggedEventHandler[mouseout]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addEventListener_mouseout(node: HTMLElement, eventName: mouseout, handler: TaggedEventHandler[mouseout], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addEventListener_mouseout(
      node: HTMLElement,
      eventName: mouseout,
      handler: TaggedEventHandler[mouseout],
      options: AddEventListenerOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def addEventListener_mouseover(node: HTMLElement, eventName: mouseover, handler: TaggedEventHandler[mouseover]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addEventListener_mouseover(node: HTMLElement, eventName: mouseover, handler: TaggedEventHandler[mouseover], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addEventListener_mouseover(
      node: HTMLElement,
      eventName: mouseover,
      handler: TaggedEventHandler[mouseover],
      options: AddEventListenerOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def addEventListener_mouseup(node: HTMLElement, eventName: mouseup, handler: TaggedEventHandler[mouseup]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addEventListener_mouseup(node: HTMLElement, eventName: mouseup, handler: TaggedEventHandler[mouseup], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addEventListener_mouseup(
      node: HTMLElement,
      eventName: mouseup,
      handler: TaggedEventHandler[mouseup],
      options: AddEventListenerOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def addEventListener_paste(node: HTMLElement, eventName: paste, handler: TaggedEventHandler[paste]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addEventListener_paste(node: HTMLElement, eventName: paste, handler: TaggedEventHandler[paste], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addEventListener_paste(
      node: HTMLElement,
      eventName: paste,
      handler: TaggedEventHandler[paste],
      options: AddEventListenerOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def addEventListener_pause(node: HTMLElement, eventName: pause, handler: TaggedEventHandler[pause]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addEventListener_pause(node: HTMLElement, eventName: pause, handler: TaggedEventHandler[pause], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addEventListener_pause(
      node: HTMLElement,
      eventName: pause,
      handler: TaggedEventHandler[pause],
      options: AddEventListenerOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def addEventListener_play(node: HTMLElement, eventName: play, handler: TaggedEventHandler[play]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addEventListener_play(node: HTMLElement, eventName: play, handler: TaggedEventHandler[play], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addEventListener_play(
      node: HTMLElement,
      eventName: play,
      handler: TaggedEventHandler[play],
      options: AddEventListenerOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def addEventListener_playing(node: HTMLElement, eventName: playing, handler: TaggedEventHandler[playing]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addEventListener_playing(node: HTMLElement, eventName: playing, handler: TaggedEventHandler[playing], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addEventListener_playing(
      node: HTMLElement,
      eventName: playing,
      handler: TaggedEventHandler[playing],
      options: AddEventListenerOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def addEventListener_pointercancel(node: HTMLElement, eventName: pointercancel, handler: TaggedEventHandler[pointercancel]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addEventListener_pointercancel(
      node: HTMLElement,
      eventName: pointercancel,
      handler: TaggedEventHandler[pointercancel],
      options: Boolean
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addEventListener_pointercancel(
      node: HTMLElement,
      eventName: pointercancel,
      handler: TaggedEventHandler[pointercancel],
      options: AddEventListenerOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def addEventListener_pointerdown(node: HTMLElement, eventName: pointerdown, handler: TaggedEventHandler[pointerdown]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addEventListener_pointerdown(
      node: HTMLElement,
      eventName: pointerdown,
      handler: TaggedEventHandler[pointerdown],
      options: Boolean
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addEventListener_pointerdown(
      node: HTMLElement,
      eventName: pointerdown,
      handler: TaggedEventHandler[pointerdown],
      options: AddEventListenerOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def addEventListener_pointerenter(node: HTMLElement, eventName: pointerenter, handler: TaggedEventHandler[pointerenter]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addEventListener_pointerenter(
      node: HTMLElement,
      eventName: pointerenter,
      handler: TaggedEventHandler[pointerenter],
      options: Boolean
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addEventListener_pointerenter(
      node: HTMLElement,
      eventName: pointerenter,
      handler: TaggedEventHandler[pointerenter],
      options: AddEventListenerOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def addEventListener_pointerleave(node: HTMLElement, eventName: pointerleave, handler: TaggedEventHandler[pointerleave]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addEventListener_pointerleave(
      node: HTMLElement,
      eventName: pointerleave,
      handler: TaggedEventHandler[pointerleave],
      options: Boolean
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addEventListener_pointerleave(
      node: HTMLElement,
      eventName: pointerleave,
      handler: TaggedEventHandler[pointerleave],
      options: AddEventListenerOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def addEventListener_pointermove(node: HTMLElement, eventName: pointermove, handler: TaggedEventHandler[pointermove]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addEventListener_pointermove(
      node: HTMLElement,
      eventName: pointermove,
      handler: TaggedEventHandler[pointermove],
      options: Boolean
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addEventListener_pointermove(
      node: HTMLElement,
      eventName: pointermove,
      handler: TaggedEventHandler[pointermove],
      options: AddEventListenerOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def addEventListener_pointerout(node: HTMLElement, eventName: pointerout, handler: TaggedEventHandler[pointerout]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addEventListener_pointerout(
      node: HTMLElement,
      eventName: pointerout,
      handler: TaggedEventHandler[pointerout],
      options: Boolean
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addEventListener_pointerout(
      node: HTMLElement,
      eventName: pointerout,
      handler: TaggedEventHandler[pointerout],
      options: AddEventListenerOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def addEventListener_pointerover(node: HTMLElement, eventName: pointerover, handler: TaggedEventHandler[pointerover]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addEventListener_pointerover(
      node: HTMLElement,
      eventName: pointerover,
      handler: TaggedEventHandler[pointerover],
      options: Boolean
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addEventListener_pointerover(
      node: HTMLElement,
      eventName: pointerover,
      handler: TaggedEventHandler[pointerover],
      options: AddEventListenerOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def addEventListener_pointerup(node: HTMLElement, eventName: pointerup, handler: TaggedEventHandler[pointerup]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addEventListener_pointerup(node: HTMLElement, eventName: pointerup, handler: TaggedEventHandler[pointerup], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addEventListener_pointerup(
      node: HTMLElement,
      eventName: pointerup,
      handler: TaggedEventHandler[pointerup],
      options: AddEventListenerOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def addEventListener_progress(node: HTMLElement, eventName: progress, handler: TaggedEventHandler[progress]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addEventListener_progress(node: HTMLElement, eventName: progress, handler: TaggedEventHandler[progress], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addEventListener_progress(
      node: HTMLElement,
      eventName: progress,
      handler: TaggedEventHandler[progress],
      options: AddEventListenerOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def addEventListener_ratechange(node: HTMLElement, eventName: ratechange, handler: TaggedEventHandler[ratechange]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addEventListener_ratechange(
      node: HTMLElement,
      eventName: ratechange,
      handler: TaggedEventHandler[ratechange],
      options: Boolean
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addEventListener_ratechange(
      node: HTMLElement,
      eventName: ratechange,
      handler: TaggedEventHandler[ratechange],
      options: AddEventListenerOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def addEventListener_reset(node: HTMLElement, eventName: reset, handler: TaggedEventHandler[reset]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addEventListener_reset(node: HTMLElement, eventName: reset, handler: TaggedEventHandler[reset], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addEventListener_reset(
      node: HTMLElement,
      eventName: reset,
      handler: TaggedEventHandler[reset],
      options: AddEventListenerOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def addEventListener_resize(node: HTMLElement, eventName: resize, handler: TaggedEventHandler[resize]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addEventListener_resize(node: HTMLElement, eventName: resize, handler: TaggedEventHandler[resize], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addEventListener_resize(
      node: HTMLElement,
      eventName: resize,
      handler: TaggedEventHandler[resize],
      options: AddEventListenerOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def addEventListener_scroll(node: HTMLElement, eventName: scroll, handler: TaggedEventHandler[scroll]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addEventListener_scroll(node: HTMLElement, eventName: scroll, handler: TaggedEventHandler[scroll], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addEventListener_scroll(
      node: HTMLElement,
      eventName: scroll,
      handler: TaggedEventHandler[scroll],
      options: AddEventListenerOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def addEventListener_securitypolicyviolation(
      node: HTMLElement,
      eventName: securitypolicyviolation,
      handler: TaggedEventHandler[securitypolicyviolation]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addEventListener_securitypolicyviolation(
      node: HTMLElement,
      eventName: securitypolicyviolation,
      handler: TaggedEventHandler[securitypolicyviolation],
      options: Boolean
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addEventListener_securitypolicyviolation(
      node: HTMLElement,
      eventName: securitypolicyviolation,
      handler: TaggedEventHandler[securitypolicyviolation],
      options: AddEventListenerOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def addEventListener_seeked(node: HTMLElement, eventName: seeked, handler: TaggedEventHandler[seeked]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addEventListener_seeked(node: HTMLElement, eventName: seeked, handler: TaggedEventHandler[seeked], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addEventListener_seeked(
      node: HTMLElement,
      eventName: seeked,
      handler: TaggedEventHandler[seeked],
      options: AddEventListenerOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def addEventListener_seeking(node: HTMLElement, eventName: seeking, handler: TaggedEventHandler[seeking]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addEventListener_seeking(node: HTMLElement, eventName: seeking, handler: TaggedEventHandler[seeking], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addEventListener_seeking(
      node: HTMLElement,
      eventName: seeking,
      handler: TaggedEventHandler[seeking],
      options: AddEventListenerOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def addEventListener_select(node: HTMLElement, eventName: select, handler: TaggedEventHandler[select]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addEventListener_select(node: HTMLElement, eventName: select, handler: TaggedEventHandler[select], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addEventListener_select(
      node: HTMLElement,
      eventName: select,
      handler: TaggedEventHandler[select],
      options: AddEventListenerOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def addEventListener_selectionchange(node: HTMLElement, eventName: selectionchange, handler: TaggedEventHandler[selectionchange]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addEventListener_selectionchange(
      node: HTMLElement,
      eventName: selectionchange,
      handler: TaggedEventHandler[selectionchange],
      options: Boolean
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addEventListener_selectionchange(
      node: HTMLElement,
      eventName: selectionchange,
      handler: TaggedEventHandler[selectionchange],
      options: AddEventListenerOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def addEventListener_selectstart(node: HTMLElement, eventName: selectstart, handler: TaggedEventHandler[selectstart]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addEventListener_selectstart(
      node: HTMLElement,
      eventName: selectstart,
      handler: TaggedEventHandler[selectstart],
      options: Boolean
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addEventListener_selectstart(
      node: HTMLElement,
      eventName: selectstart,
      handler: TaggedEventHandler[selectstart],
      options: AddEventListenerOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def addEventListener_stalled(node: HTMLElement, eventName: stalled, handler: TaggedEventHandler[stalled]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addEventListener_stalled(node: HTMLElement, eventName: stalled, handler: TaggedEventHandler[stalled], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addEventListener_stalled(
      node: HTMLElement,
      eventName: stalled,
      handler: TaggedEventHandler[stalled],
      options: AddEventListenerOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def addEventListener_submit(node: HTMLElement, eventName: submit, handler: TaggedEventHandler[submit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addEventListener_submit(node: HTMLElement, eventName: submit, handler: TaggedEventHandler[submit], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addEventListener_submit(
      node: HTMLElement,
      eventName: submit,
      handler: TaggedEventHandler[submit],
      options: AddEventListenerOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def addEventListener_suspend(node: HTMLElement, eventName: suspend, handler: TaggedEventHandler[suspend]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addEventListener_suspend(node: HTMLElement, eventName: suspend, handler: TaggedEventHandler[suspend], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addEventListener_suspend(
      node: HTMLElement,
      eventName: suspend,
      handler: TaggedEventHandler[suspend],
      options: AddEventListenerOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def addEventListener_timeupdate(node: HTMLElement, eventName: timeupdate, handler: TaggedEventHandler[timeupdate]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addEventListener_timeupdate(
      node: HTMLElement,
      eventName: timeupdate,
      handler: TaggedEventHandler[timeupdate],
      options: Boolean
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addEventListener_timeupdate(
      node: HTMLElement,
      eventName: timeupdate,
      handler: TaggedEventHandler[timeupdate],
      options: AddEventListenerOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def addEventListener_toggle(node: HTMLElement, eventName: toggle, handler: TaggedEventHandler[toggle]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addEventListener_toggle(node: HTMLElement, eventName: toggle, handler: TaggedEventHandler[toggle], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addEventListener_toggle(
      node: HTMLElement,
      eventName: toggle,
      handler: TaggedEventHandler[toggle],
      options: AddEventListenerOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def addEventListener_touchcancel(node: HTMLElement, eventName: touchcancel, handler: TaggedEventHandler[touchcancel]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addEventListener_touchcancel(
      node: HTMLElement,
      eventName: touchcancel,
      handler: TaggedEventHandler[touchcancel],
      options: Boolean
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addEventListener_touchcancel(
      node: HTMLElement,
      eventName: touchcancel,
      handler: TaggedEventHandler[touchcancel],
      options: AddEventListenerOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def addEventListener_touchend(node: HTMLElement, eventName: touchend, handler: TaggedEventHandler[touchend]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addEventListener_touchend(node: HTMLElement, eventName: touchend, handler: TaggedEventHandler[touchend], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addEventListener_touchend(
      node: HTMLElement,
      eventName: touchend,
      handler: TaggedEventHandler[touchend],
      options: AddEventListenerOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def addEventListener_touchmove(node: HTMLElement, eventName: touchmove, handler: TaggedEventHandler[touchmove]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addEventListener_touchmove(node: HTMLElement, eventName: touchmove, handler: TaggedEventHandler[touchmove], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addEventListener_touchmove(
      node: HTMLElement,
      eventName: touchmove,
      handler: TaggedEventHandler[touchmove],
      options: AddEventListenerOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def addEventListener_touchstart(node: HTMLElement, eventName: touchstart, handler: TaggedEventHandler[touchstart]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addEventListener_touchstart(
      node: HTMLElement,
      eventName: touchstart,
      handler: TaggedEventHandler[touchstart],
      options: Boolean
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addEventListener_touchstart(
      node: HTMLElement,
      eventName: touchstart,
      handler: TaggedEventHandler[touchstart],
      options: AddEventListenerOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def addEventListener_transitioncancel(node: HTMLElement, eventName: transitioncancel, handler: TaggedEventHandler[transitioncancel]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addEventListener_transitioncancel(
      node: HTMLElement,
      eventName: transitioncancel,
      handler: TaggedEventHandler[transitioncancel],
      options: Boolean
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addEventListener_transitioncancel(
      node: HTMLElement,
      eventName: transitioncancel,
      handler: TaggedEventHandler[transitioncancel],
      options: AddEventListenerOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def addEventListener_transitionend(node: HTMLElement, eventName: transitionend, handler: TaggedEventHandler[transitionend]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addEventListener_transitionend(
      node: HTMLElement,
      eventName: transitionend,
      handler: TaggedEventHandler[transitionend],
      options: Boolean
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addEventListener_transitionend(
      node: HTMLElement,
      eventName: transitionend,
      handler: TaggedEventHandler[transitionend],
      options: AddEventListenerOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def addEventListener_transitionrun(node: HTMLElement, eventName: transitionrun, handler: TaggedEventHandler[transitionrun]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addEventListener_transitionrun(
      node: HTMLElement,
      eventName: transitionrun,
      handler: TaggedEventHandler[transitionrun],
      options: Boolean
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addEventListener_transitionrun(
      node: HTMLElement,
      eventName: transitionrun,
      handler: TaggedEventHandler[transitionrun],
      options: AddEventListenerOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def addEventListener_transitionstart(node: HTMLElement, eventName: transitionstart, handler: TaggedEventHandler[transitionstart]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addEventListener_transitionstart(
      node: HTMLElement,
      eventName: transitionstart,
      handler: TaggedEventHandler[transitionstart],
      options: Boolean
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addEventListener_transitionstart(
      node: HTMLElement,
      eventName: transitionstart,
      handler: TaggedEventHandler[transitionstart],
      options: AddEventListenerOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def addEventListener_volumechange(node: HTMLElement, eventName: volumechange, handler: TaggedEventHandler[volumechange]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addEventListener_volumechange(
      node: HTMLElement,
      eventName: volumechange,
      handler: TaggedEventHandler[volumechange],
      options: Boolean
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addEventListener_volumechange(
      node: HTMLElement,
      eventName: volumechange,
      handler: TaggedEventHandler[volumechange],
      options: AddEventListenerOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def addEventListener_waiting(node: HTMLElement, eventName: waiting, handler: TaggedEventHandler[waiting]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addEventListener_waiting(node: HTMLElement, eventName: waiting, handler: TaggedEventHandler[waiting], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addEventListener_waiting(
      node: HTMLElement,
      eventName: waiting,
      handler: TaggedEventHandler[waiting],
      options: AddEventListenerOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def addEventListener_wheel(node: HTMLElement, eventName: wheel, handler: TaggedEventHandler[wheel]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addEventListener_wheel(node: HTMLElement, eventName: wheel, handler: TaggedEventHandler[wheel], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addEventListener_wheel(
      node: HTMLElement,
      eventName: wheel,
      handler: TaggedEventHandler[wheel],
      options: AddEventListenerOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSImport("dom-helpers", "default.animate")
    @js.native
    def animate: FnCallNodePropertiesDurationEasingCallback = js.native
    inline def animate(node: HTMLElement, properties: AnimateProperties, duration: Double): Cancel = (^.asInstanceOf[js.Dynamic].applyDynamic("animate")(node.asInstanceOf[js.Any], properties.asInstanceOf[js.Any], duration.asInstanceOf[js.Any])).asInstanceOf[Cancel]
    inline def animate(options: Options): Cancel = ^.asInstanceOf[js.Dynamic].applyDynamic("animate")(options.asInstanceOf[js.Any]).asInstanceOf[Cancel]
    inline def animate_=(x: FnCallNodePropertiesDurationEasingCallback): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("animate")(x.asInstanceOf[js.Any])
    
    inline def animate_transitionend(
      node: HTMLElement,
      properties: AnimateProperties,
      duration: Double,
      callback: EventHandler[transitionend]
    ): Cancel = (^.asInstanceOf[js.Dynamic].applyDynamic("animate")(node.asInstanceOf[js.Any], properties.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Cancel]
    inline def animate_transitionend(
      node: HTMLElement,
      properties: AnimateProperties,
      duration: Double,
      easing: String,
      callback: EventHandler[transitionend]
    ): Cancel = (^.asInstanceOf[js.Dynamic].applyDynamic("animate")(node.asInstanceOf[js.Any], properties.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], easing.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Cancel]
    
    inline def cancelAnimationFrame(id: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("cancelAnimationFrame")(id.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @JSImport("dom-helpers", "default.closest")
    @js.native
    def closest: js.Function3[
        /* node */ Element, 
        /* selector */ String, 
        /* stopAt */ js.UndefOr[Element], 
        Element | Null
      ] = js.native
    inline def closest(node: Element, selector: String): Element | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("closest")(node.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[Element | Null]
    inline def closest(node: Element, selector: String, stopAt: Element): Element | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("closest")(node.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], stopAt.asInstanceOf[js.Any])).asInstanceOf[Element | Null]
    inline def closest_=(
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
    inline def contains(context: Element, node: Element): js.UndefOr[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("contains")(context.asInstanceOf[js.Any], node.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Boolean]]
    inline def contains_=(x: js.Function2[/* context */ Element, /* node */ Element, js.UndefOr[Boolean]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contains")(x.asInstanceOf[js.Any])
    
    @JSImport("dom-helpers", "default.filter")
    @js.native
    def filter: FnCallSelectorHandler = js.native
    inline def filter_=(x: FnCallSelectorHandler): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("filter")(x.asInstanceOf[js.Any])
    
    inline def filter_abort(selector: String, handler: EventHandler[abort]): EventHandler[abort] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[abort]]
    
    inline def filter_animationcancel(selector: String, handler: EventHandler[animationcancel]): EventHandler[animationcancel] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[animationcancel]]
    
    inline def filter_animationend(selector: String, handler: EventHandler[animationend]): EventHandler[animationend] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[animationend]]
    
    inline def filter_animationiteration(selector: String, handler: EventHandler[animationiteration]): EventHandler[animationiteration] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[animationiteration]]
    
    inline def filter_animationstart(selector: String, handler: EventHandler[animationstart]): EventHandler[animationstart] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[animationstart]]
    
    inline def filter_auxclick(selector: String, handler: EventHandler[auxclick]): EventHandler[auxclick] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[auxclick]]
    
    inline def filter_blur(selector: String, handler: EventHandler[blur]): EventHandler[blur] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[blur]]
    
    inline def filter_cancel(selector: String, handler: EventHandler[cancel]): EventHandler[cancel] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[cancel]]
    
    inline def filter_canplay(selector: String, handler: EventHandler[canplay]): EventHandler[canplay] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[canplay]]
    
    inline def filter_canplaythrough(selector: String, handler: EventHandler[canplaythrough]): EventHandler[canplaythrough] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[canplaythrough]]
    
    inline def filter_change(selector: String, handler: EventHandler[change]): EventHandler[change] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[change]]
    
    inline def filter_click(selector: String, handler: EventHandler[click]): EventHandler[click] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[click]]
    
    inline def filter_close(selector: String, handler: EventHandler[close]): EventHandler[close] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[close]]
    
    inline def filter_contextmenu(selector: String, handler: EventHandler[contextmenu]): EventHandler[contextmenu] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[contextmenu]]
    
    inline def filter_copy(selector: String, handler: EventHandler[copy]): EventHandler[copy] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[copy]]
    
    inline def filter_cuechange(selector: String, handler: EventHandler[cuechange]): EventHandler[cuechange] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[cuechange]]
    
    inline def filter_cut(selector: String, handler: EventHandler[cut]): EventHandler[cut] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[cut]]
    
    inline def filter_dblclick(selector: String, handler: EventHandler[dblclick]): EventHandler[dblclick] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[dblclick]]
    
    inline def filter_drag(selector: String, handler: EventHandler[drag]): EventHandler[drag] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[drag]]
    
    inline def filter_dragend(selector: String, handler: EventHandler[dragend]): EventHandler[dragend] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[dragend]]
    
    inline def filter_dragenter(selector: String, handler: EventHandler[dragenter]): EventHandler[dragenter] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[dragenter]]
    
    inline def filter_dragexit(selector: String, handler: EventHandler[dragexit]): EventHandler[dragexit] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[dragexit]]
    
    inline def filter_dragleave(selector: String, handler: EventHandler[dragleave]): EventHandler[dragleave] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[dragleave]]
    
    inline def filter_dragover(selector: String, handler: EventHandler[dragover]): EventHandler[dragover] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[dragover]]
    
    inline def filter_dragstart(selector: String, handler: EventHandler[dragstart]): EventHandler[dragstart] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[dragstart]]
    
    inline def filter_drop(selector: String, handler: EventHandler[drop]): EventHandler[drop] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[drop]]
    
    inline def filter_durationchange(selector: String, handler: EventHandler[durationchange]): EventHandler[durationchange] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[durationchange]]
    
    inline def filter_emptied(selector: String, handler: EventHandler[emptied]): EventHandler[emptied] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[emptied]]
    
    inline def filter_ended(selector: String, handler: EventHandler[ended]): EventHandler[ended] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[ended]]
    
    inline def filter_error(selector: String, handler: EventHandler[error]): EventHandler[error] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[error]]
    
    inline def filter_focus(selector: String, handler: EventHandler[focus]): EventHandler[focus] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[focus]]
    
    inline def filter_focusin(selector: String, handler: EventHandler[focusin]): EventHandler[focusin] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[focusin]]
    
    inline def filter_focusout(selector: String, handler: EventHandler[focusout]): EventHandler[focusout] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[focusout]]
    
    inline def filter_fullscreenchange(selector: String, handler: EventHandler[fullscreenchange]): EventHandler[fullscreenchange] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[fullscreenchange]]
    
    inline def filter_fullscreenerror(selector: String, handler: EventHandler[fullscreenerror]): EventHandler[fullscreenerror] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[fullscreenerror]]
    
    inline def filter_gotpointercapture(selector: String, handler: EventHandler[gotpointercapture]): EventHandler[gotpointercapture] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[gotpointercapture]]
    
    inline def filter_input(selector: String, handler: EventHandler[input]): EventHandler[input] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[input]]
    
    inline def filter_invalid(selector: String, handler: EventHandler[invalid]): EventHandler[invalid] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[invalid]]
    
    inline def filter_keydown(selector: String, handler: EventHandler[keydown]): EventHandler[keydown] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[keydown]]
    
    inline def filter_keypress(selector: String, handler: EventHandler[keypress]): EventHandler[keypress] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[keypress]]
    
    inline def filter_keyup(selector: String, handler: EventHandler[keyup]): EventHandler[keyup] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[keyup]]
    
    inline def filter_load(selector: String, handler: EventHandler[load]): EventHandler[load] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[load]]
    
    inline def filter_loadeddata(selector: String, handler: EventHandler[loadeddata]): EventHandler[loadeddata] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[loadeddata]]
    
    inline def filter_loadedmetadata(selector: String, handler: EventHandler[loadedmetadata]): EventHandler[loadedmetadata] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[loadedmetadata]]
    
    inline def filter_loadstart(selector: String, handler: EventHandler[loadstart]): EventHandler[loadstart] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[loadstart]]
    
    inline def filter_lostpointercapture(selector: String, handler: EventHandler[lostpointercapture]): EventHandler[lostpointercapture] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[lostpointercapture]]
    
    inline def filter_mousedown(selector: String, handler: EventHandler[mousedown]): EventHandler[mousedown] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[mousedown]]
    
    inline def filter_mouseenter(selector: String, handler: EventHandler[mouseenter]): EventHandler[mouseenter] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[mouseenter]]
    
    inline def filter_mouseleave(selector: String, handler: EventHandler[mouseleave]): EventHandler[mouseleave] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[mouseleave]]
    
    inline def filter_mousemove(selector: String, handler: EventHandler[mousemove]): EventHandler[mousemove] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[mousemove]]
    
    inline def filter_mouseout(selector: String, handler: EventHandler[mouseout]): EventHandler[mouseout] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[mouseout]]
    
    inline def filter_mouseover(selector: String, handler: EventHandler[mouseover]): EventHandler[mouseover] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[mouseover]]
    
    inline def filter_mouseup(selector: String, handler: EventHandler[mouseup]): EventHandler[mouseup] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[mouseup]]
    
    inline def filter_paste(selector: String, handler: EventHandler[paste]): EventHandler[paste] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[paste]]
    
    inline def filter_pause(selector: String, handler: EventHandler[pause]): EventHandler[pause] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[pause]]
    
    inline def filter_play(selector: String, handler: EventHandler[play]): EventHandler[play] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[play]]
    
    inline def filter_playing(selector: String, handler: EventHandler[playing]): EventHandler[playing] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[playing]]
    
    inline def filter_pointercancel(selector: String, handler: EventHandler[pointercancel]): EventHandler[pointercancel] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[pointercancel]]
    
    inline def filter_pointerdown(selector: String, handler: EventHandler[pointerdown]): EventHandler[pointerdown] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[pointerdown]]
    
    inline def filter_pointerenter(selector: String, handler: EventHandler[pointerenter]): EventHandler[pointerenter] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[pointerenter]]
    
    inline def filter_pointerleave(selector: String, handler: EventHandler[pointerleave]): EventHandler[pointerleave] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[pointerleave]]
    
    inline def filter_pointermove(selector: String, handler: EventHandler[pointermove]): EventHandler[pointermove] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[pointermove]]
    
    inline def filter_pointerout(selector: String, handler: EventHandler[pointerout]): EventHandler[pointerout] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[pointerout]]
    
    inline def filter_pointerover(selector: String, handler: EventHandler[pointerover]): EventHandler[pointerover] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[pointerover]]
    
    inline def filter_pointerup(selector: String, handler: EventHandler[pointerup]): EventHandler[pointerup] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[pointerup]]
    
    inline def filter_progress(selector: String, handler: EventHandler[progress]): EventHandler[progress] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[progress]]
    
    inline def filter_ratechange(selector: String, handler: EventHandler[ratechange]): EventHandler[ratechange] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[ratechange]]
    
    inline def filter_reset(selector: String, handler: EventHandler[reset]): EventHandler[reset] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[reset]]
    
    inline def filter_resize(selector: String, handler: EventHandler[resize]): EventHandler[resize] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[resize]]
    
    inline def filter_scroll(selector: String, handler: EventHandler[scroll]): EventHandler[scroll] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[scroll]]
    
    inline def filter_securitypolicyviolation(selector: String, handler: EventHandler[securitypolicyviolation]): EventHandler[securitypolicyviolation] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[securitypolicyviolation]]
    
    inline def filter_seeked(selector: String, handler: EventHandler[seeked]): EventHandler[seeked] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[seeked]]
    
    inline def filter_seeking(selector: String, handler: EventHandler[seeking]): EventHandler[seeking] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[seeking]]
    
    inline def filter_select(selector: String, handler: EventHandler[select]): EventHandler[select] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[select]]
    
    inline def filter_selectionchange(selector: String, handler: EventHandler[selectionchange]): EventHandler[selectionchange] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[selectionchange]]
    
    inline def filter_selectstart(selector: String, handler: EventHandler[selectstart]): EventHandler[selectstart] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[selectstart]]
    
    inline def filter_stalled(selector: String, handler: EventHandler[stalled]): EventHandler[stalled] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[stalled]]
    
    inline def filter_submit(selector: String, handler: EventHandler[submit]): EventHandler[submit] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[submit]]
    
    inline def filter_suspend(selector: String, handler: EventHandler[suspend]): EventHandler[suspend] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[suspend]]
    
    inline def filter_timeupdate(selector: String, handler: EventHandler[timeupdate]): EventHandler[timeupdate] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[timeupdate]]
    
    inline def filter_toggle(selector: String, handler: EventHandler[toggle]): EventHandler[toggle] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[toggle]]
    
    inline def filter_touchcancel(selector: String, handler: EventHandler[touchcancel]): EventHandler[touchcancel] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[touchcancel]]
    
    inline def filter_touchend(selector: String, handler: EventHandler[touchend]): EventHandler[touchend] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[touchend]]
    
    inline def filter_touchmove(selector: String, handler: EventHandler[touchmove]): EventHandler[touchmove] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[touchmove]]
    
    inline def filter_touchstart(selector: String, handler: EventHandler[touchstart]): EventHandler[touchstart] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[touchstart]]
    
    inline def filter_transitioncancel(selector: String, handler: EventHandler[transitioncancel]): EventHandler[transitioncancel] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[transitioncancel]]
    
    inline def filter_transitionend(selector: String, handler: EventHandler[transitionend]): EventHandler[transitionend] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[transitionend]]
    
    inline def filter_transitionrun(selector: String, handler: EventHandler[transitionrun]): EventHandler[transitionrun] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[transitionrun]]
    
    inline def filter_transitionstart(selector: String, handler: EventHandler[transitionstart]): EventHandler[transitionstart] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[transitionstart]]
    
    inline def filter_volumechange(selector: String, handler: EventHandler[volumechange]): EventHandler[volumechange] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[volumechange]]
    
    inline def filter_waiting(selector: String, handler: EventHandler[waiting]): EventHandler[waiting] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[waiting]]
    
    inline def filter_wheel(selector: String, handler: EventHandler[wheel]): EventHandler[wheel] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[wheel]]
    
    @JSImport("dom-helpers", "default.getComputedStyle")
    @js.native
    def getComputedStyle: js.Function2[/* node */ HTMLElement, /* psuedoElement */ js.UndefOr[String], CSSStyleDeclaration] = js.native
    inline def getComputedStyle(node: HTMLElement): CSSStyleDeclaration = ^.asInstanceOf[js.Dynamic].applyDynamic("getComputedStyle")(node.asInstanceOf[js.Any]).asInstanceOf[CSSStyleDeclaration]
    inline def getComputedStyle(node: HTMLElement, psuedoElement: String): CSSStyleDeclaration = (^.asInstanceOf[js.Dynamic].applyDynamic("getComputedStyle")(node.asInstanceOf[js.Any], psuedoElement.asInstanceOf[js.Any])).asInstanceOf[CSSStyleDeclaration]
    inline def getComputedStyle_=(
      x: js.Function2[/* node */ HTMLElement, /* psuedoElement */ js.UndefOr[String], CSSStyleDeclaration]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getComputedStyle")(x.asInstanceOf[js.Any])
    
    @JSImport("dom-helpers", "default.hasClass")
    @js.native
    def hasClass: js.Function2[/* element */ Element | SVGElement, /* className */ String, Boolean] = js.native
    inline def hasClass(element: Element, className: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasClass")(element.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def hasClass(element: SVGElement, className: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasClass")(element.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def hasClass_=(x: js.Function2[/* element */ Element | SVGElement, /* className */ String, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hasClass")(x.asInstanceOf[js.Any])
    
    @JSImport("dom-helpers", "default.height")
    @js.native
    def height: js.Function2[/* node */ HTMLElement, /* client */ js.UndefOr[Boolean], Double] = js.native
    inline def height(node: HTMLElement): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("height")(node.asInstanceOf[js.Any]).asInstanceOf[Double]
    inline def height(node: HTMLElement, client: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("height")(node.asInstanceOf[js.Any], client.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def height_=(x: js.Function2[/* node */ HTMLElement, /* client */ js.UndefOr[Boolean], Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("height")(x.asInstanceOf[js.Any])
    
    @JSImport("dom-helpers", "default.listen")
    @js.native
    def listen: Fn1 = js.native
    inline def listen_=(x: Fn1): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("listen")(x.asInstanceOf[js.Any])
    
    inline def listen_abort(node: HTMLElement, eventName: abort, handler: EventHandler[abort]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    inline def listen_abort(node: HTMLElement, eventName: abort, handler: EventHandler[abort], options: Boolean): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    inline def listen_abort(
      node: HTMLElement,
      eventName: abort,
      handler: EventHandler[abort],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    
    inline def listen_animationcancel(node: HTMLElement, eventName: animationcancel, handler: EventHandler[animationcancel]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    inline def listen_animationcancel(
      node: HTMLElement,
      eventName: animationcancel,
      handler: EventHandler[animationcancel],
      options: Boolean
    ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    inline def listen_animationcancel(
      node: HTMLElement,
      eventName: animationcancel,
      handler: EventHandler[animationcancel],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    
    inline def listen_animationend(node: HTMLElement, eventName: animationend, handler: EventHandler[animationend]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    inline def listen_animationend(node: HTMLElement, eventName: animationend, handler: EventHandler[animationend], options: Boolean): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    inline def listen_animationend(
      node: HTMLElement,
      eventName: animationend,
      handler: EventHandler[animationend],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    
    inline def listen_animationiteration(node: HTMLElement, eventName: animationiteration, handler: EventHandler[animationiteration]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    inline def listen_animationiteration(
      node: HTMLElement,
      eventName: animationiteration,
      handler: EventHandler[animationiteration],
      options: Boolean
    ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    inline def listen_animationiteration(
      node: HTMLElement,
      eventName: animationiteration,
      handler: EventHandler[animationiteration],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    
    inline def listen_animationstart(node: HTMLElement, eventName: animationstart, handler: EventHandler[animationstart]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    inline def listen_animationstart(
      node: HTMLElement,
      eventName: animationstart,
      handler: EventHandler[animationstart],
      options: Boolean
    ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    inline def listen_animationstart(
      node: HTMLElement,
      eventName: animationstart,
      handler: EventHandler[animationstart],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    
    inline def listen_auxclick(node: HTMLElement, eventName: auxclick, handler: EventHandler[auxclick]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    inline def listen_auxclick(node: HTMLElement, eventName: auxclick, handler: EventHandler[auxclick], options: Boolean): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    inline def listen_auxclick(
      node: HTMLElement,
      eventName: auxclick,
      handler: EventHandler[auxclick],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    
    inline def listen_blur(node: HTMLElement, eventName: blur, handler: EventHandler[blur]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    inline def listen_blur(node: HTMLElement, eventName: blur, handler: EventHandler[blur], options: Boolean): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    inline def listen_blur(node: HTMLElement, eventName: blur, handler: EventHandler[blur], options: AddEventListenerOptions): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    
    inline def listen_cancel(node: HTMLElement, eventName: cancel, handler: EventHandler[cancel]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    inline def listen_cancel(node: HTMLElement, eventName: cancel, handler: EventHandler[cancel], options: Boolean): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    inline def listen_cancel(
      node: HTMLElement,
      eventName: cancel,
      handler: EventHandler[cancel],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    
    inline def listen_canplay(node: HTMLElement, eventName: canplay, handler: EventHandler[canplay]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    inline def listen_canplay(node: HTMLElement, eventName: canplay, handler: EventHandler[canplay], options: Boolean): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    inline def listen_canplay(
      node: HTMLElement,
      eventName: canplay,
      handler: EventHandler[canplay],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    
    inline def listen_canplaythrough(node: HTMLElement, eventName: canplaythrough, handler: EventHandler[canplaythrough]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    inline def listen_canplaythrough(
      node: HTMLElement,
      eventName: canplaythrough,
      handler: EventHandler[canplaythrough],
      options: Boolean
    ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    inline def listen_canplaythrough(
      node: HTMLElement,
      eventName: canplaythrough,
      handler: EventHandler[canplaythrough],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    
    inline def listen_change(node: HTMLElement, eventName: change, handler: EventHandler[change]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    inline def listen_change(node: HTMLElement, eventName: change, handler: EventHandler[change], options: Boolean): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    inline def listen_change(
      node: HTMLElement,
      eventName: change,
      handler: EventHandler[change],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    
    inline def listen_click(node: HTMLElement, eventName: click, handler: EventHandler[click]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    inline def listen_click(node: HTMLElement, eventName: click, handler: EventHandler[click], options: Boolean): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    inline def listen_click(
      node: HTMLElement,
      eventName: click,
      handler: EventHandler[click],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    
    inline def listen_close(node: HTMLElement, eventName: close, handler: EventHandler[close]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    inline def listen_close(node: HTMLElement, eventName: close, handler: EventHandler[close], options: Boolean): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    inline def listen_close(
      node: HTMLElement,
      eventName: close,
      handler: EventHandler[close],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    
    inline def listen_contextmenu(node: HTMLElement, eventName: contextmenu, handler: EventHandler[contextmenu]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    inline def listen_contextmenu(node: HTMLElement, eventName: contextmenu, handler: EventHandler[contextmenu], options: Boolean): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    inline def listen_contextmenu(
      node: HTMLElement,
      eventName: contextmenu,
      handler: EventHandler[contextmenu],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    
    inline def listen_copy(node: HTMLElement, eventName: copy, handler: EventHandler[copy]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    inline def listen_copy(node: HTMLElement, eventName: copy, handler: EventHandler[copy], options: Boolean): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    inline def listen_copy(node: HTMLElement, eventName: copy, handler: EventHandler[copy], options: AddEventListenerOptions): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    
    inline def listen_cuechange(node: HTMLElement, eventName: cuechange, handler: EventHandler[cuechange]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    inline def listen_cuechange(node: HTMLElement, eventName: cuechange, handler: EventHandler[cuechange], options: Boolean): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    inline def listen_cuechange(
      node: HTMLElement,
      eventName: cuechange,
      handler: EventHandler[cuechange],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    
    inline def listen_cut(node: HTMLElement, eventName: cut, handler: EventHandler[cut]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    inline def listen_cut(node: HTMLElement, eventName: cut, handler: EventHandler[cut], options: Boolean): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    inline def listen_cut(node: HTMLElement, eventName: cut, handler: EventHandler[cut], options: AddEventListenerOptions): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    
    inline def listen_dblclick(node: HTMLElement, eventName: dblclick, handler: EventHandler[dblclick]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    inline def listen_dblclick(node: HTMLElement, eventName: dblclick, handler: EventHandler[dblclick], options: Boolean): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    inline def listen_dblclick(
      node: HTMLElement,
      eventName: dblclick,
      handler: EventHandler[dblclick],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    
    inline def listen_drag(node: HTMLElement, eventName: drag, handler: EventHandler[drag]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    inline def listen_drag(node: HTMLElement, eventName: drag, handler: EventHandler[drag], options: Boolean): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    inline def listen_drag(node: HTMLElement, eventName: drag, handler: EventHandler[drag], options: AddEventListenerOptions): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    
    inline def listen_dragend(node: HTMLElement, eventName: dragend, handler: EventHandler[dragend]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    inline def listen_dragend(node: HTMLElement, eventName: dragend, handler: EventHandler[dragend], options: Boolean): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    inline def listen_dragend(
      node: HTMLElement,
      eventName: dragend,
      handler: EventHandler[dragend],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    
    inline def listen_dragenter(node: HTMLElement, eventName: dragenter, handler: EventHandler[dragenter]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    inline def listen_dragenter(node: HTMLElement, eventName: dragenter, handler: EventHandler[dragenter], options: Boolean): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    inline def listen_dragenter(
      node: HTMLElement,
      eventName: dragenter,
      handler: EventHandler[dragenter],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    
    inline def listen_dragexit(node: HTMLElement, eventName: dragexit, handler: EventHandler[dragexit]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    inline def listen_dragexit(node: HTMLElement, eventName: dragexit, handler: EventHandler[dragexit], options: Boolean): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    inline def listen_dragexit(
      node: HTMLElement,
      eventName: dragexit,
      handler: EventHandler[dragexit],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    
    inline def listen_dragleave(node: HTMLElement, eventName: dragleave, handler: EventHandler[dragleave]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    inline def listen_dragleave(node: HTMLElement, eventName: dragleave, handler: EventHandler[dragleave], options: Boolean): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    inline def listen_dragleave(
      node: HTMLElement,
      eventName: dragleave,
      handler: EventHandler[dragleave],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    
    inline def listen_dragover(node: HTMLElement, eventName: dragover, handler: EventHandler[dragover]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    inline def listen_dragover(node: HTMLElement, eventName: dragover, handler: EventHandler[dragover], options: Boolean): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    inline def listen_dragover(
      node: HTMLElement,
      eventName: dragover,
      handler: EventHandler[dragover],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    
    inline def listen_dragstart(node: HTMLElement, eventName: dragstart, handler: EventHandler[dragstart]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    inline def listen_dragstart(node: HTMLElement, eventName: dragstart, handler: EventHandler[dragstart], options: Boolean): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    inline def listen_dragstart(
      node: HTMLElement,
      eventName: dragstart,
      handler: EventHandler[dragstart],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    
    inline def listen_drop(node: HTMLElement, eventName: drop, handler: EventHandler[drop]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    inline def listen_drop(node: HTMLElement, eventName: drop, handler: EventHandler[drop], options: Boolean): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    inline def listen_drop(node: HTMLElement, eventName: drop, handler: EventHandler[drop], options: AddEventListenerOptions): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    
    inline def listen_durationchange(node: HTMLElement, eventName: durationchange, handler: EventHandler[durationchange]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    inline def listen_durationchange(
      node: HTMLElement,
      eventName: durationchange,
      handler: EventHandler[durationchange],
      options: Boolean
    ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    inline def listen_durationchange(
      node: HTMLElement,
      eventName: durationchange,
      handler: EventHandler[durationchange],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    
    inline def listen_emptied(node: HTMLElement, eventName: emptied, handler: EventHandler[emptied]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    inline def listen_emptied(node: HTMLElement, eventName: emptied, handler: EventHandler[emptied], options: Boolean): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    inline def listen_emptied(
      node: HTMLElement,
      eventName: emptied,
      handler: EventHandler[emptied],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    
    inline def listen_ended(node: HTMLElement, eventName: ended, handler: EventHandler[ended]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    inline def listen_ended(node: HTMLElement, eventName: ended, handler: EventHandler[ended], options: Boolean): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    inline def listen_ended(
      node: HTMLElement,
      eventName: ended,
      handler: EventHandler[ended],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    
    inline def listen_error(node: HTMLElement, eventName: error, handler: EventHandler[error]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    inline def listen_error(node: HTMLElement, eventName: error, handler: EventHandler[error], options: Boolean): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    inline def listen_error(
      node: HTMLElement,
      eventName: error,
      handler: EventHandler[error],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    
    inline def listen_focus(node: HTMLElement, eventName: focus, handler: EventHandler[focus]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    inline def listen_focus(node: HTMLElement, eventName: focus, handler: EventHandler[focus], options: Boolean): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    inline def listen_focus(
      node: HTMLElement,
      eventName: focus,
      handler: EventHandler[focus],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    
    inline def listen_focusin(node: HTMLElement, eventName: focusin, handler: EventHandler[focusin]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    inline def listen_focusin(node: HTMLElement, eventName: focusin, handler: EventHandler[focusin], options: Boolean): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    inline def listen_focusin(
      node: HTMLElement,
      eventName: focusin,
      handler: EventHandler[focusin],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    
    inline def listen_focusout(node: HTMLElement, eventName: focusout, handler: EventHandler[focusout]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    inline def listen_focusout(node: HTMLElement, eventName: focusout, handler: EventHandler[focusout], options: Boolean): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    inline def listen_focusout(
      node: HTMLElement,
      eventName: focusout,
      handler: EventHandler[focusout],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    
    inline def listen_fullscreenchange(node: HTMLElement, eventName: fullscreenchange, handler: EventHandler[fullscreenchange]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    inline def listen_fullscreenchange(
      node: HTMLElement,
      eventName: fullscreenchange,
      handler: EventHandler[fullscreenchange],
      options: Boolean
    ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    inline def listen_fullscreenchange(
      node: HTMLElement,
      eventName: fullscreenchange,
      handler: EventHandler[fullscreenchange],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    
    inline def listen_fullscreenerror(node: HTMLElement, eventName: fullscreenerror, handler: EventHandler[fullscreenerror]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    inline def listen_fullscreenerror(
      node: HTMLElement,
      eventName: fullscreenerror,
      handler: EventHandler[fullscreenerror],
      options: Boolean
    ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    inline def listen_fullscreenerror(
      node: HTMLElement,
      eventName: fullscreenerror,
      handler: EventHandler[fullscreenerror],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    
    inline def listen_gotpointercapture(node: HTMLElement, eventName: gotpointercapture, handler: EventHandler[gotpointercapture]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    inline def listen_gotpointercapture(
      node: HTMLElement,
      eventName: gotpointercapture,
      handler: EventHandler[gotpointercapture],
      options: Boolean
    ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    inline def listen_gotpointercapture(
      node: HTMLElement,
      eventName: gotpointercapture,
      handler: EventHandler[gotpointercapture],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    
    inline def listen_input(node: HTMLElement, eventName: input, handler: EventHandler[input]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    inline def listen_input(node: HTMLElement, eventName: input, handler: EventHandler[input], options: Boolean): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    inline def listen_input(
      node: HTMLElement,
      eventName: input,
      handler: EventHandler[input],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    
    inline def listen_invalid(node: HTMLElement, eventName: invalid, handler: EventHandler[invalid]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    inline def listen_invalid(node: HTMLElement, eventName: invalid, handler: EventHandler[invalid], options: Boolean): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    inline def listen_invalid(
      node: HTMLElement,
      eventName: invalid,
      handler: EventHandler[invalid],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    
    inline def listen_keydown(node: HTMLElement, eventName: keydown, handler: EventHandler[keydown]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    inline def listen_keydown(node: HTMLElement, eventName: keydown, handler: EventHandler[keydown], options: Boolean): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    inline def listen_keydown(
      node: HTMLElement,
      eventName: keydown,
      handler: EventHandler[keydown],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    
    inline def listen_keypress(node: HTMLElement, eventName: keypress, handler: EventHandler[keypress]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    inline def listen_keypress(node: HTMLElement, eventName: keypress, handler: EventHandler[keypress], options: Boolean): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    inline def listen_keypress(
      node: HTMLElement,
      eventName: keypress,
      handler: EventHandler[keypress],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    
    inline def listen_keyup(node: HTMLElement, eventName: keyup, handler: EventHandler[keyup]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    inline def listen_keyup(node: HTMLElement, eventName: keyup, handler: EventHandler[keyup], options: Boolean): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    inline def listen_keyup(
      node: HTMLElement,
      eventName: keyup,
      handler: EventHandler[keyup],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    
    inline def listen_load(node: HTMLElement, eventName: load, handler: EventHandler[load]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    inline def listen_load(node: HTMLElement, eventName: load, handler: EventHandler[load], options: Boolean): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    inline def listen_load(node: HTMLElement, eventName: load, handler: EventHandler[load], options: AddEventListenerOptions): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    
    inline def listen_loadeddata(node: HTMLElement, eventName: loadeddata, handler: EventHandler[loadeddata]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    inline def listen_loadeddata(node: HTMLElement, eventName: loadeddata, handler: EventHandler[loadeddata], options: Boolean): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    inline def listen_loadeddata(
      node: HTMLElement,
      eventName: loadeddata,
      handler: EventHandler[loadeddata],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    
    inline def listen_loadedmetadata(node: HTMLElement, eventName: loadedmetadata, handler: EventHandler[loadedmetadata]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    inline def listen_loadedmetadata(
      node: HTMLElement,
      eventName: loadedmetadata,
      handler: EventHandler[loadedmetadata],
      options: Boolean
    ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    inline def listen_loadedmetadata(
      node: HTMLElement,
      eventName: loadedmetadata,
      handler: EventHandler[loadedmetadata],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    
    inline def listen_loadstart(node: HTMLElement, eventName: loadstart, handler: EventHandler[loadstart]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    inline def listen_loadstart(node: HTMLElement, eventName: loadstart, handler: EventHandler[loadstart], options: Boolean): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    inline def listen_loadstart(
      node: HTMLElement,
      eventName: loadstart,
      handler: EventHandler[loadstart],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    
    inline def listen_lostpointercapture(node: HTMLElement, eventName: lostpointercapture, handler: EventHandler[lostpointercapture]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    inline def listen_lostpointercapture(
      node: HTMLElement,
      eventName: lostpointercapture,
      handler: EventHandler[lostpointercapture],
      options: Boolean
    ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    inline def listen_lostpointercapture(
      node: HTMLElement,
      eventName: lostpointercapture,
      handler: EventHandler[lostpointercapture],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    
    inline def listen_mousedown(node: HTMLElement, eventName: mousedown, handler: EventHandler[mousedown]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    inline def listen_mousedown(node: HTMLElement, eventName: mousedown, handler: EventHandler[mousedown], options: Boolean): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    inline def listen_mousedown(
      node: HTMLElement,
      eventName: mousedown,
      handler: EventHandler[mousedown],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    
    inline def listen_mouseenter(node: HTMLElement, eventName: mouseenter, handler: EventHandler[mouseenter]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    inline def listen_mouseenter(node: HTMLElement, eventName: mouseenter, handler: EventHandler[mouseenter], options: Boolean): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    inline def listen_mouseenter(
      node: HTMLElement,
      eventName: mouseenter,
      handler: EventHandler[mouseenter],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    
    inline def listen_mouseleave(node: HTMLElement, eventName: mouseleave, handler: EventHandler[mouseleave]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    inline def listen_mouseleave(node: HTMLElement, eventName: mouseleave, handler: EventHandler[mouseleave], options: Boolean): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    inline def listen_mouseleave(
      node: HTMLElement,
      eventName: mouseleave,
      handler: EventHandler[mouseleave],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    
    inline def listen_mousemove(node: HTMLElement, eventName: mousemove, handler: EventHandler[mousemove]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    inline def listen_mousemove(node: HTMLElement, eventName: mousemove, handler: EventHandler[mousemove], options: Boolean): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    inline def listen_mousemove(
      node: HTMLElement,
      eventName: mousemove,
      handler: EventHandler[mousemove],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    
    inline def listen_mouseout(node: HTMLElement, eventName: mouseout, handler: EventHandler[mouseout]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    inline def listen_mouseout(node: HTMLElement, eventName: mouseout, handler: EventHandler[mouseout], options: Boolean): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    inline def listen_mouseout(
      node: HTMLElement,
      eventName: mouseout,
      handler: EventHandler[mouseout],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    
    inline def listen_mouseover(node: HTMLElement, eventName: mouseover, handler: EventHandler[mouseover]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    inline def listen_mouseover(node: HTMLElement, eventName: mouseover, handler: EventHandler[mouseover], options: Boolean): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    inline def listen_mouseover(
      node: HTMLElement,
      eventName: mouseover,
      handler: EventHandler[mouseover],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    
    inline def listen_mouseup(node: HTMLElement, eventName: mouseup, handler: EventHandler[mouseup]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    inline def listen_mouseup(node: HTMLElement, eventName: mouseup, handler: EventHandler[mouseup], options: Boolean): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    inline def listen_mouseup(
      node: HTMLElement,
      eventName: mouseup,
      handler: EventHandler[mouseup],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    
    inline def listen_paste(node: HTMLElement, eventName: paste, handler: EventHandler[paste]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    inline def listen_paste(node: HTMLElement, eventName: paste, handler: EventHandler[paste], options: Boolean): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    inline def listen_paste(
      node: HTMLElement,
      eventName: paste,
      handler: EventHandler[paste],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    
    inline def listen_pause(node: HTMLElement, eventName: pause, handler: EventHandler[pause]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    inline def listen_pause(node: HTMLElement, eventName: pause, handler: EventHandler[pause], options: Boolean): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    inline def listen_pause(
      node: HTMLElement,
      eventName: pause,
      handler: EventHandler[pause],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    
    inline def listen_play(node: HTMLElement, eventName: play, handler: EventHandler[play]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    inline def listen_play(node: HTMLElement, eventName: play, handler: EventHandler[play], options: Boolean): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    inline def listen_play(node: HTMLElement, eventName: play, handler: EventHandler[play], options: AddEventListenerOptions): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    
    inline def listen_playing(node: HTMLElement, eventName: playing, handler: EventHandler[playing]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    inline def listen_playing(node: HTMLElement, eventName: playing, handler: EventHandler[playing], options: Boolean): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    inline def listen_playing(
      node: HTMLElement,
      eventName: playing,
      handler: EventHandler[playing],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    
    inline def listen_pointercancel(node: HTMLElement, eventName: pointercancel, handler: EventHandler[pointercancel]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    inline def listen_pointercancel(
      node: HTMLElement,
      eventName: pointercancel,
      handler: EventHandler[pointercancel],
      options: Boolean
    ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    inline def listen_pointercancel(
      node: HTMLElement,
      eventName: pointercancel,
      handler: EventHandler[pointercancel],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    
    inline def listen_pointerdown(node: HTMLElement, eventName: pointerdown, handler: EventHandler[pointerdown]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    inline def listen_pointerdown(node: HTMLElement, eventName: pointerdown, handler: EventHandler[pointerdown], options: Boolean): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    inline def listen_pointerdown(
      node: HTMLElement,
      eventName: pointerdown,
      handler: EventHandler[pointerdown],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    
    inline def listen_pointerenter(node: HTMLElement, eventName: pointerenter, handler: EventHandler[pointerenter]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    inline def listen_pointerenter(node: HTMLElement, eventName: pointerenter, handler: EventHandler[pointerenter], options: Boolean): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    inline def listen_pointerenter(
      node: HTMLElement,
      eventName: pointerenter,
      handler: EventHandler[pointerenter],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    
    inline def listen_pointerleave(node: HTMLElement, eventName: pointerleave, handler: EventHandler[pointerleave]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    inline def listen_pointerleave(node: HTMLElement, eventName: pointerleave, handler: EventHandler[pointerleave], options: Boolean): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    inline def listen_pointerleave(
      node: HTMLElement,
      eventName: pointerleave,
      handler: EventHandler[pointerleave],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    
    inline def listen_pointermove(node: HTMLElement, eventName: pointermove, handler: EventHandler[pointermove]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    inline def listen_pointermove(node: HTMLElement, eventName: pointermove, handler: EventHandler[pointermove], options: Boolean): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    inline def listen_pointermove(
      node: HTMLElement,
      eventName: pointermove,
      handler: EventHandler[pointermove],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    
    inline def listen_pointerout(node: HTMLElement, eventName: pointerout, handler: EventHandler[pointerout]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    inline def listen_pointerout(node: HTMLElement, eventName: pointerout, handler: EventHandler[pointerout], options: Boolean): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    inline def listen_pointerout(
      node: HTMLElement,
      eventName: pointerout,
      handler: EventHandler[pointerout],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    
    inline def listen_pointerover(node: HTMLElement, eventName: pointerover, handler: EventHandler[pointerover]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    inline def listen_pointerover(node: HTMLElement, eventName: pointerover, handler: EventHandler[pointerover], options: Boolean): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    inline def listen_pointerover(
      node: HTMLElement,
      eventName: pointerover,
      handler: EventHandler[pointerover],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    
    inline def listen_pointerup(node: HTMLElement, eventName: pointerup, handler: EventHandler[pointerup]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    inline def listen_pointerup(node: HTMLElement, eventName: pointerup, handler: EventHandler[pointerup], options: Boolean): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    inline def listen_pointerup(
      node: HTMLElement,
      eventName: pointerup,
      handler: EventHandler[pointerup],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    
    inline def listen_progress(node: HTMLElement, eventName: progress, handler: EventHandler[progress]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    inline def listen_progress(node: HTMLElement, eventName: progress, handler: EventHandler[progress], options: Boolean): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    inline def listen_progress(
      node: HTMLElement,
      eventName: progress,
      handler: EventHandler[progress],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    
    inline def listen_ratechange(node: HTMLElement, eventName: ratechange, handler: EventHandler[ratechange]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    inline def listen_ratechange(node: HTMLElement, eventName: ratechange, handler: EventHandler[ratechange], options: Boolean): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    inline def listen_ratechange(
      node: HTMLElement,
      eventName: ratechange,
      handler: EventHandler[ratechange],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    
    inline def listen_reset(node: HTMLElement, eventName: reset, handler: EventHandler[reset]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    inline def listen_reset(node: HTMLElement, eventName: reset, handler: EventHandler[reset], options: Boolean): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    inline def listen_reset(
      node: HTMLElement,
      eventName: reset,
      handler: EventHandler[reset],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    
    inline def listen_resize(node: HTMLElement, eventName: resize, handler: EventHandler[resize]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    inline def listen_resize(node: HTMLElement, eventName: resize, handler: EventHandler[resize], options: Boolean): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    inline def listen_resize(
      node: HTMLElement,
      eventName: resize,
      handler: EventHandler[resize],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    
    inline def listen_scroll(node: HTMLElement, eventName: scroll, handler: EventHandler[scroll]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    inline def listen_scroll(node: HTMLElement, eventName: scroll, handler: EventHandler[scroll], options: Boolean): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    inline def listen_scroll(
      node: HTMLElement,
      eventName: scroll,
      handler: EventHandler[scroll],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    
    inline def listen_securitypolicyviolation(
      node: HTMLElement,
      eventName: securitypolicyviolation,
      handler: EventHandler[securitypolicyviolation]
    ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    inline def listen_securitypolicyviolation(
      node: HTMLElement,
      eventName: securitypolicyviolation,
      handler: EventHandler[securitypolicyviolation],
      options: Boolean
    ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    inline def listen_securitypolicyviolation(
      node: HTMLElement,
      eventName: securitypolicyviolation,
      handler: EventHandler[securitypolicyviolation],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    
    inline def listen_seeked(node: HTMLElement, eventName: seeked, handler: EventHandler[seeked]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    inline def listen_seeked(node: HTMLElement, eventName: seeked, handler: EventHandler[seeked], options: Boolean): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    inline def listen_seeked(
      node: HTMLElement,
      eventName: seeked,
      handler: EventHandler[seeked],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    
    inline def listen_seeking(node: HTMLElement, eventName: seeking, handler: EventHandler[seeking]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    inline def listen_seeking(node: HTMLElement, eventName: seeking, handler: EventHandler[seeking], options: Boolean): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    inline def listen_seeking(
      node: HTMLElement,
      eventName: seeking,
      handler: EventHandler[seeking],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    
    inline def listen_select(node: HTMLElement, eventName: select, handler: EventHandler[select]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    inline def listen_select(node: HTMLElement, eventName: select, handler: EventHandler[select], options: Boolean): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    inline def listen_select(
      node: HTMLElement,
      eventName: select,
      handler: EventHandler[select],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    
    inline def listen_selectionchange(node: HTMLElement, eventName: selectionchange, handler: EventHandler[selectionchange]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    inline def listen_selectionchange(
      node: HTMLElement,
      eventName: selectionchange,
      handler: EventHandler[selectionchange],
      options: Boolean
    ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    inline def listen_selectionchange(
      node: HTMLElement,
      eventName: selectionchange,
      handler: EventHandler[selectionchange],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    
    inline def listen_selectstart(node: HTMLElement, eventName: selectstart, handler: EventHandler[selectstart]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    inline def listen_selectstart(node: HTMLElement, eventName: selectstart, handler: EventHandler[selectstart], options: Boolean): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    inline def listen_selectstart(
      node: HTMLElement,
      eventName: selectstart,
      handler: EventHandler[selectstart],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    
    inline def listen_stalled(node: HTMLElement, eventName: stalled, handler: EventHandler[stalled]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    inline def listen_stalled(node: HTMLElement, eventName: stalled, handler: EventHandler[stalled], options: Boolean): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    inline def listen_stalled(
      node: HTMLElement,
      eventName: stalled,
      handler: EventHandler[stalled],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    
    inline def listen_submit(node: HTMLElement, eventName: submit, handler: EventHandler[submit]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    inline def listen_submit(node: HTMLElement, eventName: submit, handler: EventHandler[submit], options: Boolean): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    inline def listen_submit(
      node: HTMLElement,
      eventName: submit,
      handler: EventHandler[submit],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    
    inline def listen_suspend(node: HTMLElement, eventName: suspend, handler: EventHandler[suspend]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    inline def listen_suspend(node: HTMLElement, eventName: suspend, handler: EventHandler[suspend], options: Boolean): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    inline def listen_suspend(
      node: HTMLElement,
      eventName: suspend,
      handler: EventHandler[suspend],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    
    inline def listen_timeupdate(node: HTMLElement, eventName: timeupdate, handler: EventHandler[timeupdate]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    inline def listen_timeupdate(node: HTMLElement, eventName: timeupdate, handler: EventHandler[timeupdate], options: Boolean): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    inline def listen_timeupdate(
      node: HTMLElement,
      eventName: timeupdate,
      handler: EventHandler[timeupdate],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    
    inline def listen_toggle(node: HTMLElement, eventName: toggle, handler: EventHandler[toggle]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    inline def listen_toggle(node: HTMLElement, eventName: toggle, handler: EventHandler[toggle], options: Boolean): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    inline def listen_toggle(
      node: HTMLElement,
      eventName: toggle,
      handler: EventHandler[toggle],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    
    inline def listen_touchcancel(node: HTMLElement, eventName: touchcancel, handler: EventHandler[touchcancel]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    inline def listen_touchcancel(node: HTMLElement, eventName: touchcancel, handler: EventHandler[touchcancel], options: Boolean): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    inline def listen_touchcancel(
      node: HTMLElement,
      eventName: touchcancel,
      handler: EventHandler[touchcancel],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    
    inline def listen_touchend(node: HTMLElement, eventName: touchend, handler: EventHandler[touchend]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    inline def listen_touchend(node: HTMLElement, eventName: touchend, handler: EventHandler[touchend], options: Boolean): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    inline def listen_touchend(
      node: HTMLElement,
      eventName: touchend,
      handler: EventHandler[touchend],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    
    inline def listen_touchmove(node: HTMLElement, eventName: touchmove, handler: EventHandler[touchmove]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    inline def listen_touchmove(node: HTMLElement, eventName: touchmove, handler: EventHandler[touchmove], options: Boolean): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    inline def listen_touchmove(
      node: HTMLElement,
      eventName: touchmove,
      handler: EventHandler[touchmove],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    
    inline def listen_touchstart(node: HTMLElement, eventName: touchstart, handler: EventHandler[touchstart]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    inline def listen_touchstart(node: HTMLElement, eventName: touchstart, handler: EventHandler[touchstart], options: Boolean): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    inline def listen_touchstart(
      node: HTMLElement,
      eventName: touchstart,
      handler: EventHandler[touchstart],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    
    inline def listen_transitioncancel(node: HTMLElement, eventName: transitioncancel, handler: EventHandler[transitioncancel]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    inline def listen_transitioncancel(
      node: HTMLElement,
      eventName: transitioncancel,
      handler: EventHandler[transitioncancel],
      options: Boolean
    ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    inline def listen_transitioncancel(
      node: HTMLElement,
      eventName: transitioncancel,
      handler: EventHandler[transitioncancel],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    
    inline def listen_transitionend(node: HTMLElement, eventName: transitionend, handler: EventHandler[transitionend]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    inline def listen_transitionend(
      node: HTMLElement,
      eventName: transitionend,
      handler: EventHandler[transitionend],
      options: Boolean
    ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    inline def listen_transitionend(
      node: HTMLElement,
      eventName: transitionend,
      handler: EventHandler[transitionend],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    
    inline def listen_transitionrun(node: HTMLElement, eventName: transitionrun, handler: EventHandler[transitionrun]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    inline def listen_transitionrun(
      node: HTMLElement,
      eventName: transitionrun,
      handler: EventHandler[transitionrun],
      options: Boolean
    ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    inline def listen_transitionrun(
      node: HTMLElement,
      eventName: transitionrun,
      handler: EventHandler[transitionrun],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    
    inline def listen_transitionstart(node: HTMLElement, eventName: transitionstart, handler: EventHandler[transitionstart]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    inline def listen_transitionstart(
      node: HTMLElement,
      eventName: transitionstart,
      handler: EventHandler[transitionstart],
      options: Boolean
    ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    inline def listen_transitionstart(
      node: HTMLElement,
      eventName: transitionstart,
      handler: EventHandler[transitionstart],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    
    inline def listen_volumechange(node: HTMLElement, eventName: volumechange, handler: EventHandler[volumechange]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    inline def listen_volumechange(node: HTMLElement, eventName: volumechange, handler: EventHandler[volumechange], options: Boolean): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    inline def listen_volumechange(
      node: HTMLElement,
      eventName: volumechange,
      handler: EventHandler[volumechange],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    
    inline def listen_waiting(node: HTMLElement, eventName: waiting, handler: EventHandler[waiting]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    inline def listen_waiting(node: HTMLElement, eventName: waiting, handler: EventHandler[waiting], options: Boolean): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    inline def listen_waiting(
      node: HTMLElement,
      eventName: waiting,
      handler: EventHandler[waiting],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    
    inline def listen_wheel(node: HTMLElement, eventName: wheel, handler: EventHandler[wheel]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    inline def listen_wheel(node: HTMLElement, eventName: wheel, handler: EventHandler[wheel], options: Boolean): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    inline def listen_wheel(
      node: HTMLElement,
      eventName: wheel,
      handler: EventHandler[wheel],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    
    @JSImport("dom-helpers", "default.matches")
    @js.native
    def matches: js.Function2[/* node */ Element, /* selector */ String, Boolean] = js.native
    inline def matches(node: Element, selector: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("matches")(node.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def matches_=(x: js.Function2[/* node */ Element, /* selector */ String, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("matches")(x.asInstanceOf[js.Any])
    
    @JSImport("dom-helpers", "default.offset")
    @js.native
    def offset: js.Function1[/* node */ HTMLElement, Height] = js.native
    inline def offset(node: HTMLElement): Height = ^.asInstanceOf[js.Dynamic].applyDynamic("offset")(node.asInstanceOf[js.Any]).asInstanceOf[Height]
    
    @JSImport("dom-helpers", "default.offsetParent")
    @js.native
    def offsetParent: js.Function1[/* node */ HTMLElement, HTMLElement] = js.native
    inline def offsetParent(node: HTMLElement): HTMLElement = ^.asInstanceOf[js.Dynamic].applyDynamic("offsetParent")(node.asInstanceOf[js.Any]).asInstanceOf[HTMLElement]
    inline def offsetParent_=(x: js.Function1[/* node */ HTMLElement, HTMLElement]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("offsetParent")(x.asInstanceOf[js.Any])
    
    inline def offset_=(x: js.Function1[/* node */ HTMLElement, Height]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("offset")(x.asInstanceOf[js.Any])
    
    inline def ownerDocument(): Document = ^.asInstanceOf[js.Dynamic].applyDynamic("ownerDocument")().asInstanceOf[Document]
    inline def ownerDocument(node: Element): Document = ^.asInstanceOf[js.Dynamic].applyDynamic("ownerDocument")(node.asInstanceOf[js.Any]).asInstanceOf[Document]
    @JSImport("dom-helpers", "default.ownerDocument")
    @js.native
    def ownerDocument_Fdefault: js.Function1[/* node */ js.UndefOr[Element], Document] = js.native
    
    inline def ownerDocument_Fdefault_=(x: js.Function1[/* node */ js.UndefOr[Element], Document]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ownerDocument")(x.asInstanceOf[js.Any])
    
    inline def ownerWindow(): Window = ^.asInstanceOf[js.Dynamic].applyDynamic("ownerWindow")().asInstanceOf[Window]
    inline def ownerWindow(node: Element): Window = ^.asInstanceOf[js.Dynamic].applyDynamic("ownerWindow")(node.asInstanceOf[js.Any]).asInstanceOf[Window]
    @JSImport("dom-helpers", "default.ownerWindow")
    @js.native
    def ownerWindow_Fdefault: js.Function1[/* node */ js.UndefOr[Element], Window] = js.native
    
    inline def ownerWindow_Fdefault_=(x: js.Function1[/* node */ js.UndefOr[Element], Window]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ownerWindow")(x.asInstanceOf[js.Any])
    
    @JSImport("dom-helpers", "default.position")
    @js.native
    def position: js.Function2[/* node */ HTMLElement, /* offsetParent */ js.UndefOr[HTMLElement], Height] = js.native
    inline def position(node: HTMLElement): Height = ^.asInstanceOf[js.Dynamic].applyDynamic("position")(node.asInstanceOf[js.Any]).asInstanceOf[Height]
    inline def position(node: HTMLElement, offsetParent: HTMLElement): Height = (^.asInstanceOf[js.Dynamic].applyDynamic("position")(node.asInstanceOf[js.Any], offsetParent.asInstanceOf[js.Any])).asInstanceOf[Height]
    inline def position_=(x: js.Function2[/* node */ HTMLElement, /* offsetParent */ js.UndefOr[HTMLElement], Height]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("position")(x.asInstanceOf[js.Any])
    
    @JSImport("dom-helpers", "default.querySelectorAll")
    @js.native
    def querySelectorAll: js.Function2[/* element */ HTMLElement | Document, /* selector */ String, js.Array[HTMLElement]] = js.native
    inline def querySelectorAll(element: Document, selector: String): js.Array[HTMLElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("querySelectorAll")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[js.Array[HTMLElement]]
    inline def querySelectorAll(element: HTMLElement, selector: String): js.Array[HTMLElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("querySelectorAll")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[js.Array[HTMLElement]]
    inline def querySelectorAll_=(
      x: js.Function2[/* element */ HTMLElement | Document, /* selector */ String, js.Array[HTMLElement]]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("querySelectorAll")(x.asInstanceOf[js.Any])
    
    @JSImport("dom-helpers", "default.removeClass")
    @js.native
    def removeClass: js.Function2[/* element */ Element | SVGElement, /* className */ String, Unit] = js.native
    inline def removeClass(element: Element, className: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeClass")(element.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeClass(element: SVGElement, className: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeClass")(element.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeClass_=(x: js.Function2[/* element */ Element | SVGElement, /* className */ String, Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("removeClass")(x.asInstanceOf[js.Any])
    
    @JSImport("dom-helpers", "default.removeEventListener")
    @js.native
    def removeEventListener: Fn0 = js.native
    inline def removeEventListener_=(x: Fn0): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("removeEventListener")(x.asInstanceOf[js.Any])
    
    inline def removeEventListener_abort(node: HTMLElement, eventName: abort, handler: TaggedEventHandler[abort]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeEventListener_abort(node: HTMLElement, eventName: abort, handler: TaggedEventHandler[abort], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeEventListener_abort(
      node: HTMLElement,
      eventName: abort,
      handler: TaggedEventHandler[abort],
      options: EventListenerOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def removeEventListener_animationcancel(node: HTMLElement, eventName: animationcancel, handler: TaggedEventHandler[animationcancel]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeEventListener_animationcancel(
      node: HTMLElement,
      eventName: animationcancel,
      handler: TaggedEventHandler[animationcancel],
      options: Boolean
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeEventListener_animationcancel(
      node: HTMLElement,
      eventName: animationcancel,
      handler: TaggedEventHandler[animationcancel],
      options: EventListenerOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def removeEventListener_animationend(node: HTMLElement, eventName: animationend, handler: TaggedEventHandler[animationend]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeEventListener_animationend(
      node: HTMLElement,
      eventName: animationend,
      handler: TaggedEventHandler[animationend],
      options: Boolean
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeEventListener_animationend(
      node: HTMLElement,
      eventName: animationend,
      handler: TaggedEventHandler[animationend],
      options: EventListenerOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def removeEventListener_animationiteration(node: HTMLElement, eventName: animationiteration, handler: TaggedEventHandler[animationiteration]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeEventListener_animationiteration(
      node: HTMLElement,
      eventName: animationiteration,
      handler: TaggedEventHandler[animationiteration],
      options: Boolean
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeEventListener_animationiteration(
      node: HTMLElement,
      eventName: animationiteration,
      handler: TaggedEventHandler[animationiteration],
      options: EventListenerOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def removeEventListener_animationstart(node: HTMLElement, eventName: animationstart, handler: TaggedEventHandler[animationstart]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeEventListener_animationstart(
      node: HTMLElement,
      eventName: animationstart,
      handler: TaggedEventHandler[animationstart],
      options: Boolean
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeEventListener_animationstart(
      node: HTMLElement,
      eventName: animationstart,
      handler: TaggedEventHandler[animationstart],
      options: EventListenerOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def removeEventListener_auxclick(node: HTMLElement, eventName: auxclick, handler: TaggedEventHandler[auxclick]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeEventListener_auxclick(node: HTMLElement, eventName: auxclick, handler: TaggedEventHandler[auxclick], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeEventListener_auxclick(
      node: HTMLElement,
      eventName: auxclick,
      handler: TaggedEventHandler[auxclick],
      options: EventListenerOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def removeEventListener_blur(node: HTMLElement, eventName: blur, handler: TaggedEventHandler[blur]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeEventListener_blur(node: HTMLElement, eventName: blur, handler: TaggedEventHandler[blur], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeEventListener_blur(
      node: HTMLElement,
      eventName: blur,
      handler: TaggedEventHandler[blur],
      options: EventListenerOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def removeEventListener_cancel(node: HTMLElement, eventName: cancel, handler: TaggedEventHandler[cancel]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeEventListener_cancel(node: HTMLElement, eventName: cancel, handler: TaggedEventHandler[cancel], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeEventListener_cancel(
      node: HTMLElement,
      eventName: cancel,
      handler: TaggedEventHandler[cancel],
      options: EventListenerOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def removeEventListener_canplay(node: HTMLElement, eventName: canplay, handler: TaggedEventHandler[canplay]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeEventListener_canplay(node: HTMLElement, eventName: canplay, handler: TaggedEventHandler[canplay], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeEventListener_canplay(
      node: HTMLElement,
      eventName: canplay,
      handler: TaggedEventHandler[canplay],
      options: EventListenerOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def removeEventListener_canplaythrough(node: HTMLElement, eventName: canplaythrough, handler: TaggedEventHandler[canplaythrough]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeEventListener_canplaythrough(
      node: HTMLElement,
      eventName: canplaythrough,
      handler: TaggedEventHandler[canplaythrough],
      options: Boolean
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeEventListener_canplaythrough(
      node: HTMLElement,
      eventName: canplaythrough,
      handler: TaggedEventHandler[canplaythrough],
      options: EventListenerOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def removeEventListener_change(node: HTMLElement, eventName: change, handler: TaggedEventHandler[change]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeEventListener_change(node: HTMLElement, eventName: change, handler: TaggedEventHandler[change], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeEventListener_change(
      node: HTMLElement,
      eventName: change,
      handler: TaggedEventHandler[change],
      options: EventListenerOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def removeEventListener_click(node: HTMLElement, eventName: click, handler: TaggedEventHandler[click]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeEventListener_click(node: HTMLElement, eventName: click, handler: TaggedEventHandler[click], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeEventListener_click(
      node: HTMLElement,
      eventName: click,
      handler: TaggedEventHandler[click],
      options: EventListenerOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def removeEventListener_close(node: HTMLElement, eventName: close, handler: TaggedEventHandler[close]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeEventListener_close(node: HTMLElement, eventName: close, handler: TaggedEventHandler[close], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeEventListener_close(
      node: HTMLElement,
      eventName: close,
      handler: TaggedEventHandler[close],
      options: EventListenerOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def removeEventListener_contextmenu(node: HTMLElement, eventName: contextmenu, handler: TaggedEventHandler[contextmenu]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeEventListener_contextmenu(
      node: HTMLElement,
      eventName: contextmenu,
      handler: TaggedEventHandler[contextmenu],
      options: Boolean
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeEventListener_contextmenu(
      node: HTMLElement,
      eventName: contextmenu,
      handler: TaggedEventHandler[contextmenu],
      options: EventListenerOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def removeEventListener_copy(node: HTMLElement, eventName: copy, handler: TaggedEventHandler[copy]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeEventListener_copy(node: HTMLElement, eventName: copy, handler: TaggedEventHandler[copy], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeEventListener_copy(
      node: HTMLElement,
      eventName: copy,
      handler: TaggedEventHandler[copy],
      options: EventListenerOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def removeEventListener_cuechange(node: HTMLElement, eventName: cuechange, handler: TaggedEventHandler[cuechange]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeEventListener_cuechange(node: HTMLElement, eventName: cuechange, handler: TaggedEventHandler[cuechange], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeEventListener_cuechange(
      node: HTMLElement,
      eventName: cuechange,
      handler: TaggedEventHandler[cuechange],
      options: EventListenerOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def removeEventListener_cut(node: HTMLElement, eventName: cut, handler: TaggedEventHandler[cut]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeEventListener_cut(node: HTMLElement, eventName: cut, handler: TaggedEventHandler[cut], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeEventListener_cut(node: HTMLElement, eventName: cut, handler: TaggedEventHandler[cut], options: EventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def removeEventListener_dblclick(node: HTMLElement, eventName: dblclick, handler: TaggedEventHandler[dblclick]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeEventListener_dblclick(node: HTMLElement, eventName: dblclick, handler: TaggedEventHandler[dblclick], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeEventListener_dblclick(
      node: HTMLElement,
      eventName: dblclick,
      handler: TaggedEventHandler[dblclick],
      options: EventListenerOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def removeEventListener_drag(node: HTMLElement, eventName: drag, handler: TaggedEventHandler[drag]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeEventListener_drag(node: HTMLElement, eventName: drag, handler: TaggedEventHandler[drag], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeEventListener_drag(
      node: HTMLElement,
      eventName: drag,
      handler: TaggedEventHandler[drag],
      options: EventListenerOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def removeEventListener_dragend(node: HTMLElement, eventName: dragend, handler: TaggedEventHandler[dragend]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeEventListener_dragend(node: HTMLElement, eventName: dragend, handler: TaggedEventHandler[dragend], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeEventListener_dragend(
      node: HTMLElement,
      eventName: dragend,
      handler: TaggedEventHandler[dragend],
      options: EventListenerOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def removeEventListener_dragenter(node: HTMLElement, eventName: dragenter, handler: TaggedEventHandler[dragenter]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeEventListener_dragenter(node: HTMLElement, eventName: dragenter, handler: TaggedEventHandler[dragenter], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeEventListener_dragenter(
      node: HTMLElement,
      eventName: dragenter,
      handler: TaggedEventHandler[dragenter],
      options: EventListenerOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def removeEventListener_dragexit(node: HTMLElement, eventName: dragexit, handler: TaggedEventHandler[dragexit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeEventListener_dragexit(node: HTMLElement, eventName: dragexit, handler: TaggedEventHandler[dragexit], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeEventListener_dragexit(
      node: HTMLElement,
      eventName: dragexit,
      handler: TaggedEventHandler[dragexit],
      options: EventListenerOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def removeEventListener_dragleave(node: HTMLElement, eventName: dragleave, handler: TaggedEventHandler[dragleave]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeEventListener_dragleave(node: HTMLElement, eventName: dragleave, handler: TaggedEventHandler[dragleave], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeEventListener_dragleave(
      node: HTMLElement,
      eventName: dragleave,
      handler: TaggedEventHandler[dragleave],
      options: EventListenerOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def removeEventListener_dragover(node: HTMLElement, eventName: dragover, handler: TaggedEventHandler[dragover]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeEventListener_dragover(node: HTMLElement, eventName: dragover, handler: TaggedEventHandler[dragover], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeEventListener_dragover(
      node: HTMLElement,
      eventName: dragover,
      handler: TaggedEventHandler[dragover],
      options: EventListenerOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def removeEventListener_dragstart(node: HTMLElement, eventName: dragstart, handler: TaggedEventHandler[dragstart]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeEventListener_dragstart(node: HTMLElement, eventName: dragstart, handler: TaggedEventHandler[dragstart], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeEventListener_dragstart(
      node: HTMLElement,
      eventName: dragstart,
      handler: TaggedEventHandler[dragstart],
      options: EventListenerOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def removeEventListener_drop(node: HTMLElement, eventName: drop, handler: TaggedEventHandler[drop]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeEventListener_drop(node: HTMLElement, eventName: drop, handler: TaggedEventHandler[drop], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeEventListener_drop(
      node: HTMLElement,
      eventName: drop,
      handler: TaggedEventHandler[drop],
      options: EventListenerOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def removeEventListener_durationchange(node: HTMLElement, eventName: durationchange, handler: TaggedEventHandler[durationchange]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeEventListener_durationchange(
      node: HTMLElement,
      eventName: durationchange,
      handler: TaggedEventHandler[durationchange],
      options: Boolean
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeEventListener_durationchange(
      node: HTMLElement,
      eventName: durationchange,
      handler: TaggedEventHandler[durationchange],
      options: EventListenerOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def removeEventListener_emptied(node: HTMLElement, eventName: emptied, handler: TaggedEventHandler[emptied]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeEventListener_emptied(node: HTMLElement, eventName: emptied, handler: TaggedEventHandler[emptied], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeEventListener_emptied(
      node: HTMLElement,
      eventName: emptied,
      handler: TaggedEventHandler[emptied],
      options: EventListenerOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def removeEventListener_ended(node: HTMLElement, eventName: ended, handler: TaggedEventHandler[ended]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeEventListener_ended(node: HTMLElement, eventName: ended, handler: TaggedEventHandler[ended], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeEventListener_ended(
      node: HTMLElement,
      eventName: ended,
      handler: TaggedEventHandler[ended],
      options: EventListenerOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def removeEventListener_error(node: HTMLElement, eventName: error, handler: TaggedEventHandler[error]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeEventListener_error(node: HTMLElement, eventName: error, handler: TaggedEventHandler[error], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeEventListener_error(
      node: HTMLElement,
      eventName: error,
      handler: TaggedEventHandler[error],
      options: EventListenerOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def removeEventListener_focus(node: HTMLElement, eventName: focus, handler: TaggedEventHandler[focus]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeEventListener_focus(node: HTMLElement, eventName: focus, handler: TaggedEventHandler[focus], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeEventListener_focus(
      node: HTMLElement,
      eventName: focus,
      handler: TaggedEventHandler[focus],
      options: EventListenerOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def removeEventListener_focusin(node: HTMLElement, eventName: focusin, handler: TaggedEventHandler[focusin]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeEventListener_focusin(node: HTMLElement, eventName: focusin, handler: TaggedEventHandler[focusin], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeEventListener_focusin(
      node: HTMLElement,
      eventName: focusin,
      handler: TaggedEventHandler[focusin],
      options: EventListenerOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def removeEventListener_focusout(node: HTMLElement, eventName: focusout, handler: TaggedEventHandler[focusout]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeEventListener_focusout(node: HTMLElement, eventName: focusout, handler: TaggedEventHandler[focusout], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeEventListener_focusout(
      node: HTMLElement,
      eventName: focusout,
      handler: TaggedEventHandler[focusout],
      options: EventListenerOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def removeEventListener_fullscreenchange(node: HTMLElement, eventName: fullscreenchange, handler: TaggedEventHandler[fullscreenchange]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeEventListener_fullscreenchange(
      node: HTMLElement,
      eventName: fullscreenchange,
      handler: TaggedEventHandler[fullscreenchange],
      options: Boolean
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeEventListener_fullscreenchange(
      node: HTMLElement,
      eventName: fullscreenchange,
      handler: TaggedEventHandler[fullscreenchange],
      options: EventListenerOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def removeEventListener_fullscreenerror(node: HTMLElement, eventName: fullscreenerror, handler: TaggedEventHandler[fullscreenerror]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeEventListener_fullscreenerror(
      node: HTMLElement,
      eventName: fullscreenerror,
      handler: TaggedEventHandler[fullscreenerror],
      options: Boolean
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeEventListener_fullscreenerror(
      node: HTMLElement,
      eventName: fullscreenerror,
      handler: TaggedEventHandler[fullscreenerror],
      options: EventListenerOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def removeEventListener_gotpointercapture(node: HTMLElement, eventName: gotpointercapture, handler: TaggedEventHandler[gotpointercapture]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeEventListener_gotpointercapture(
      node: HTMLElement,
      eventName: gotpointercapture,
      handler: TaggedEventHandler[gotpointercapture],
      options: Boolean
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeEventListener_gotpointercapture(
      node: HTMLElement,
      eventName: gotpointercapture,
      handler: TaggedEventHandler[gotpointercapture],
      options: EventListenerOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def removeEventListener_input(node: HTMLElement, eventName: input, handler: TaggedEventHandler[input]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeEventListener_input(node: HTMLElement, eventName: input, handler: TaggedEventHandler[input], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeEventListener_input(
      node: HTMLElement,
      eventName: input,
      handler: TaggedEventHandler[input],
      options: EventListenerOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def removeEventListener_invalid(node: HTMLElement, eventName: invalid, handler: TaggedEventHandler[invalid]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeEventListener_invalid(node: HTMLElement, eventName: invalid, handler: TaggedEventHandler[invalid], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeEventListener_invalid(
      node: HTMLElement,
      eventName: invalid,
      handler: TaggedEventHandler[invalid],
      options: EventListenerOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def removeEventListener_keydown(node: HTMLElement, eventName: keydown, handler: TaggedEventHandler[keydown]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeEventListener_keydown(node: HTMLElement, eventName: keydown, handler: TaggedEventHandler[keydown], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeEventListener_keydown(
      node: HTMLElement,
      eventName: keydown,
      handler: TaggedEventHandler[keydown],
      options: EventListenerOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def removeEventListener_keypress(node: HTMLElement, eventName: keypress, handler: TaggedEventHandler[keypress]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeEventListener_keypress(node: HTMLElement, eventName: keypress, handler: TaggedEventHandler[keypress], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeEventListener_keypress(
      node: HTMLElement,
      eventName: keypress,
      handler: TaggedEventHandler[keypress],
      options: EventListenerOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def removeEventListener_keyup(node: HTMLElement, eventName: keyup, handler: TaggedEventHandler[keyup]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeEventListener_keyup(node: HTMLElement, eventName: keyup, handler: TaggedEventHandler[keyup], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeEventListener_keyup(
      node: HTMLElement,
      eventName: keyup,
      handler: TaggedEventHandler[keyup],
      options: EventListenerOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def removeEventListener_load(node: HTMLElement, eventName: load, handler: TaggedEventHandler[load]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeEventListener_load(node: HTMLElement, eventName: load, handler: TaggedEventHandler[load], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeEventListener_load(
      node: HTMLElement,
      eventName: load,
      handler: TaggedEventHandler[load],
      options: EventListenerOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def removeEventListener_loadeddata(node: HTMLElement, eventName: loadeddata, handler: TaggedEventHandler[loadeddata]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeEventListener_loadeddata(
      node: HTMLElement,
      eventName: loadeddata,
      handler: TaggedEventHandler[loadeddata],
      options: Boolean
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeEventListener_loadeddata(
      node: HTMLElement,
      eventName: loadeddata,
      handler: TaggedEventHandler[loadeddata],
      options: EventListenerOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def removeEventListener_loadedmetadata(node: HTMLElement, eventName: loadedmetadata, handler: TaggedEventHandler[loadedmetadata]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeEventListener_loadedmetadata(
      node: HTMLElement,
      eventName: loadedmetadata,
      handler: TaggedEventHandler[loadedmetadata],
      options: Boolean
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeEventListener_loadedmetadata(
      node: HTMLElement,
      eventName: loadedmetadata,
      handler: TaggedEventHandler[loadedmetadata],
      options: EventListenerOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def removeEventListener_loadstart(node: HTMLElement, eventName: loadstart, handler: TaggedEventHandler[loadstart]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeEventListener_loadstart(node: HTMLElement, eventName: loadstart, handler: TaggedEventHandler[loadstart], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeEventListener_loadstart(
      node: HTMLElement,
      eventName: loadstart,
      handler: TaggedEventHandler[loadstart],
      options: EventListenerOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def removeEventListener_lostpointercapture(node: HTMLElement, eventName: lostpointercapture, handler: TaggedEventHandler[lostpointercapture]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeEventListener_lostpointercapture(
      node: HTMLElement,
      eventName: lostpointercapture,
      handler: TaggedEventHandler[lostpointercapture],
      options: Boolean
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeEventListener_lostpointercapture(
      node: HTMLElement,
      eventName: lostpointercapture,
      handler: TaggedEventHandler[lostpointercapture],
      options: EventListenerOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def removeEventListener_mousedown(node: HTMLElement, eventName: mousedown, handler: TaggedEventHandler[mousedown]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeEventListener_mousedown(node: HTMLElement, eventName: mousedown, handler: TaggedEventHandler[mousedown], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeEventListener_mousedown(
      node: HTMLElement,
      eventName: mousedown,
      handler: TaggedEventHandler[mousedown],
      options: EventListenerOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def removeEventListener_mouseenter(node: HTMLElement, eventName: mouseenter, handler: TaggedEventHandler[mouseenter]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeEventListener_mouseenter(
      node: HTMLElement,
      eventName: mouseenter,
      handler: TaggedEventHandler[mouseenter],
      options: Boolean
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeEventListener_mouseenter(
      node: HTMLElement,
      eventName: mouseenter,
      handler: TaggedEventHandler[mouseenter],
      options: EventListenerOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def removeEventListener_mouseleave(node: HTMLElement, eventName: mouseleave, handler: TaggedEventHandler[mouseleave]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeEventListener_mouseleave(
      node: HTMLElement,
      eventName: mouseleave,
      handler: TaggedEventHandler[mouseleave],
      options: Boolean
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeEventListener_mouseleave(
      node: HTMLElement,
      eventName: mouseleave,
      handler: TaggedEventHandler[mouseleave],
      options: EventListenerOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def removeEventListener_mousemove(node: HTMLElement, eventName: mousemove, handler: TaggedEventHandler[mousemove]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeEventListener_mousemove(node: HTMLElement, eventName: mousemove, handler: TaggedEventHandler[mousemove], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeEventListener_mousemove(
      node: HTMLElement,
      eventName: mousemove,
      handler: TaggedEventHandler[mousemove],
      options: EventListenerOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def removeEventListener_mouseout(node: HTMLElement, eventName: mouseout, handler: TaggedEventHandler[mouseout]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeEventListener_mouseout(node: HTMLElement, eventName: mouseout, handler: TaggedEventHandler[mouseout], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeEventListener_mouseout(
      node: HTMLElement,
      eventName: mouseout,
      handler: TaggedEventHandler[mouseout],
      options: EventListenerOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def removeEventListener_mouseover(node: HTMLElement, eventName: mouseover, handler: TaggedEventHandler[mouseover]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeEventListener_mouseover(node: HTMLElement, eventName: mouseover, handler: TaggedEventHandler[mouseover], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeEventListener_mouseover(
      node: HTMLElement,
      eventName: mouseover,
      handler: TaggedEventHandler[mouseover],
      options: EventListenerOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def removeEventListener_mouseup(node: HTMLElement, eventName: mouseup, handler: TaggedEventHandler[mouseup]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeEventListener_mouseup(node: HTMLElement, eventName: mouseup, handler: TaggedEventHandler[mouseup], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeEventListener_mouseup(
      node: HTMLElement,
      eventName: mouseup,
      handler: TaggedEventHandler[mouseup],
      options: EventListenerOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def removeEventListener_paste(node: HTMLElement, eventName: paste, handler: TaggedEventHandler[paste]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeEventListener_paste(node: HTMLElement, eventName: paste, handler: TaggedEventHandler[paste], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeEventListener_paste(
      node: HTMLElement,
      eventName: paste,
      handler: TaggedEventHandler[paste],
      options: EventListenerOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def removeEventListener_pause(node: HTMLElement, eventName: pause, handler: TaggedEventHandler[pause]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeEventListener_pause(node: HTMLElement, eventName: pause, handler: TaggedEventHandler[pause], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeEventListener_pause(
      node: HTMLElement,
      eventName: pause,
      handler: TaggedEventHandler[pause],
      options: EventListenerOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def removeEventListener_play(node: HTMLElement, eventName: play, handler: TaggedEventHandler[play]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeEventListener_play(node: HTMLElement, eventName: play, handler: TaggedEventHandler[play], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeEventListener_play(
      node: HTMLElement,
      eventName: play,
      handler: TaggedEventHandler[play],
      options: EventListenerOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def removeEventListener_playing(node: HTMLElement, eventName: playing, handler: TaggedEventHandler[playing]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeEventListener_playing(node: HTMLElement, eventName: playing, handler: TaggedEventHandler[playing], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeEventListener_playing(
      node: HTMLElement,
      eventName: playing,
      handler: TaggedEventHandler[playing],
      options: EventListenerOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def removeEventListener_pointercancel(node: HTMLElement, eventName: pointercancel, handler: TaggedEventHandler[pointercancel]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeEventListener_pointercancel(
      node: HTMLElement,
      eventName: pointercancel,
      handler: TaggedEventHandler[pointercancel],
      options: Boolean
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeEventListener_pointercancel(
      node: HTMLElement,
      eventName: pointercancel,
      handler: TaggedEventHandler[pointercancel],
      options: EventListenerOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def removeEventListener_pointerdown(node: HTMLElement, eventName: pointerdown, handler: TaggedEventHandler[pointerdown]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeEventListener_pointerdown(
      node: HTMLElement,
      eventName: pointerdown,
      handler: TaggedEventHandler[pointerdown],
      options: Boolean
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeEventListener_pointerdown(
      node: HTMLElement,
      eventName: pointerdown,
      handler: TaggedEventHandler[pointerdown],
      options: EventListenerOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def removeEventListener_pointerenter(node: HTMLElement, eventName: pointerenter, handler: TaggedEventHandler[pointerenter]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeEventListener_pointerenter(
      node: HTMLElement,
      eventName: pointerenter,
      handler: TaggedEventHandler[pointerenter],
      options: Boolean
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeEventListener_pointerenter(
      node: HTMLElement,
      eventName: pointerenter,
      handler: TaggedEventHandler[pointerenter],
      options: EventListenerOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def removeEventListener_pointerleave(node: HTMLElement, eventName: pointerleave, handler: TaggedEventHandler[pointerleave]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeEventListener_pointerleave(
      node: HTMLElement,
      eventName: pointerleave,
      handler: TaggedEventHandler[pointerleave],
      options: Boolean
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeEventListener_pointerleave(
      node: HTMLElement,
      eventName: pointerleave,
      handler: TaggedEventHandler[pointerleave],
      options: EventListenerOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def removeEventListener_pointermove(node: HTMLElement, eventName: pointermove, handler: TaggedEventHandler[pointermove]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeEventListener_pointermove(
      node: HTMLElement,
      eventName: pointermove,
      handler: TaggedEventHandler[pointermove],
      options: Boolean
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeEventListener_pointermove(
      node: HTMLElement,
      eventName: pointermove,
      handler: TaggedEventHandler[pointermove],
      options: EventListenerOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def removeEventListener_pointerout(node: HTMLElement, eventName: pointerout, handler: TaggedEventHandler[pointerout]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeEventListener_pointerout(
      node: HTMLElement,
      eventName: pointerout,
      handler: TaggedEventHandler[pointerout],
      options: Boolean
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeEventListener_pointerout(
      node: HTMLElement,
      eventName: pointerout,
      handler: TaggedEventHandler[pointerout],
      options: EventListenerOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def removeEventListener_pointerover(node: HTMLElement, eventName: pointerover, handler: TaggedEventHandler[pointerover]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeEventListener_pointerover(
      node: HTMLElement,
      eventName: pointerover,
      handler: TaggedEventHandler[pointerover],
      options: Boolean
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeEventListener_pointerover(
      node: HTMLElement,
      eventName: pointerover,
      handler: TaggedEventHandler[pointerover],
      options: EventListenerOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def removeEventListener_pointerup(node: HTMLElement, eventName: pointerup, handler: TaggedEventHandler[pointerup]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeEventListener_pointerup(node: HTMLElement, eventName: pointerup, handler: TaggedEventHandler[pointerup], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeEventListener_pointerup(
      node: HTMLElement,
      eventName: pointerup,
      handler: TaggedEventHandler[pointerup],
      options: EventListenerOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def removeEventListener_progress(node: HTMLElement, eventName: progress, handler: TaggedEventHandler[progress]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeEventListener_progress(node: HTMLElement, eventName: progress, handler: TaggedEventHandler[progress], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeEventListener_progress(
      node: HTMLElement,
      eventName: progress,
      handler: TaggedEventHandler[progress],
      options: EventListenerOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def removeEventListener_ratechange(node: HTMLElement, eventName: ratechange, handler: TaggedEventHandler[ratechange]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeEventListener_ratechange(
      node: HTMLElement,
      eventName: ratechange,
      handler: TaggedEventHandler[ratechange],
      options: Boolean
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeEventListener_ratechange(
      node: HTMLElement,
      eventName: ratechange,
      handler: TaggedEventHandler[ratechange],
      options: EventListenerOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def removeEventListener_reset(node: HTMLElement, eventName: reset, handler: TaggedEventHandler[reset]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeEventListener_reset(node: HTMLElement, eventName: reset, handler: TaggedEventHandler[reset], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeEventListener_reset(
      node: HTMLElement,
      eventName: reset,
      handler: TaggedEventHandler[reset],
      options: EventListenerOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def removeEventListener_resize(node: HTMLElement, eventName: resize, handler: TaggedEventHandler[resize]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeEventListener_resize(node: HTMLElement, eventName: resize, handler: TaggedEventHandler[resize], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeEventListener_resize(
      node: HTMLElement,
      eventName: resize,
      handler: TaggedEventHandler[resize],
      options: EventListenerOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def removeEventListener_scroll(node: HTMLElement, eventName: scroll, handler: TaggedEventHandler[scroll]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeEventListener_scroll(node: HTMLElement, eventName: scroll, handler: TaggedEventHandler[scroll], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeEventListener_scroll(
      node: HTMLElement,
      eventName: scroll,
      handler: TaggedEventHandler[scroll],
      options: EventListenerOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def removeEventListener_securitypolicyviolation(
      node: HTMLElement,
      eventName: securitypolicyviolation,
      handler: TaggedEventHandler[securitypolicyviolation]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeEventListener_securitypolicyviolation(
      node: HTMLElement,
      eventName: securitypolicyviolation,
      handler: TaggedEventHandler[securitypolicyviolation],
      options: Boolean
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeEventListener_securitypolicyviolation(
      node: HTMLElement,
      eventName: securitypolicyviolation,
      handler: TaggedEventHandler[securitypolicyviolation],
      options: EventListenerOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def removeEventListener_seeked(node: HTMLElement, eventName: seeked, handler: TaggedEventHandler[seeked]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeEventListener_seeked(node: HTMLElement, eventName: seeked, handler: TaggedEventHandler[seeked], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeEventListener_seeked(
      node: HTMLElement,
      eventName: seeked,
      handler: TaggedEventHandler[seeked],
      options: EventListenerOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def removeEventListener_seeking(node: HTMLElement, eventName: seeking, handler: TaggedEventHandler[seeking]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeEventListener_seeking(node: HTMLElement, eventName: seeking, handler: TaggedEventHandler[seeking], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeEventListener_seeking(
      node: HTMLElement,
      eventName: seeking,
      handler: TaggedEventHandler[seeking],
      options: EventListenerOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def removeEventListener_select(node: HTMLElement, eventName: select, handler: TaggedEventHandler[select]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeEventListener_select(node: HTMLElement, eventName: select, handler: TaggedEventHandler[select], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeEventListener_select(
      node: HTMLElement,
      eventName: select,
      handler: TaggedEventHandler[select],
      options: EventListenerOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def removeEventListener_selectionchange(node: HTMLElement, eventName: selectionchange, handler: TaggedEventHandler[selectionchange]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeEventListener_selectionchange(
      node: HTMLElement,
      eventName: selectionchange,
      handler: TaggedEventHandler[selectionchange],
      options: Boolean
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeEventListener_selectionchange(
      node: HTMLElement,
      eventName: selectionchange,
      handler: TaggedEventHandler[selectionchange],
      options: EventListenerOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def removeEventListener_selectstart(node: HTMLElement, eventName: selectstart, handler: TaggedEventHandler[selectstart]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeEventListener_selectstart(
      node: HTMLElement,
      eventName: selectstart,
      handler: TaggedEventHandler[selectstart],
      options: Boolean
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeEventListener_selectstart(
      node: HTMLElement,
      eventName: selectstart,
      handler: TaggedEventHandler[selectstart],
      options: EventListenerOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def removeEventListener_stalled(node: HTMLElement, eventName: stalled, handler: TaggedEventHandler[stalled]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeEventListener_stalled(node: HTMLElement, eventName: stalled, handler: TaggedEventHandler[stalled], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeEventListener_stalled(
      node: HTMLElement,
      eventName: stalled,
      handler: TaggedEventHandler[stalled],
      options: EventListenerOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def removeEventListener_submit(node: HTMLElement, eventName: submit, handler: TaggedEventHandler[submit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeEventListener_submit(node: HTMLElement, eventName: submit, handler: TaggedEventHandler[submit], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeEventListener_submit(
      node: HTMLElement,
      eventName: submit,
      handler: TaggedEventHandler[submit],
      options: EventListenerOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def removeEventListener_suspend(node: HTMLElement, eventName: suspend, handler: TaggedEventHandler[suspend]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeEventListener_suspend(node: HTMLElement, eventName: suspend, handler: TaggedEventHandler[suspend], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeEventListener_suspend(
      node: HTMLElement,
      eventName: suspend,
      handler: TaggedEventHandler[suspend],
      options: EventListenerOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def removeEventListener_timeupdate(node: HTMLElement, eventName: timeupdate, handler: TaggedEventHandler[timeupdate]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeEventListener_timeupdate(
      node: HTMLElement,
      eventName: timeupdate,
      handler: TaggedEventHandler[timeupdate],
      options: Boolean
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeEventListener_timeupdate(
      node: HTMLElement,
      eventName: timeupdate,
      handler: TaggedEventHandler[timeupdate],
      options: EventListenerOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def removeEventListener_toggle(node: HTMLElement, eventName: toggle, handler: TaggedEventHandler[toggle]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeEventListener_toggle(node: HTMLElement, eventName: toggle, handler: TaggedEventHandler[toggle], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeEventListener_toggle(
      node: HTMLElement,
      eventName: toggle,
      handler: TaggedEventHandler[toggle],
      options: EventListenerOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def removeEventListener_touchcancel(node: HTMLElement, eventName: touchcancel, handler: TaggedEventHandler[touchcancel]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeEventListener_touchcancel(
      node: HTMLElement,
      eventName: touchcancel,
      handler: TaggedEventHandler[touchcancel],
      options: Boolean
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeEventListener_touchcancel(
      node: HTMLElement,
      eventName: touchcancel,
      handler: TaggedEventHandler[touchcancel],
      options: EventListenerOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def removeEventListener_touchend(node: HTMLElement, eventName: touchend, handler: TaggedEventHandler[touchend]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeEventListener_touchend(node: HTMLElement, eventName: touchend, handler: TaggedEventHandler[touchend], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeEventListener_touchend(
      node: HTMLElement,
      eventName: touchend,
      handler: TaggedEventHandler[touchend],
      options: EventListenerOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def removeEventListener_touchmove(node: HTMLElement, eventName: touchmove, handler: TaggedEventHandler[touchmove]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeEventListener_touchmove(node: HTMLElement, eventName: touchmove, handler: TaggedEventHandler[touchmove], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeEventListener_touchmove(
      node: HTMLElement,
      eventName: touchmove,
      handler: TaggedEventHandler[touchmove],
      options: EventListenerOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def removeEventListener_touchstart(node: HTMLElement, eventName: touchstart, handler: TaggedEventHandler[touchstart]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeEventListener_touchstart(
      node: HTMLElement,
      eventName: touchstart,
      handler: TaggedEventHandler[touchstart],
      options: Boolean
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeEventListener_touchstart(
      node: HTMLElement,
      eventName: touchstart,
      handler: TaggedEventHandler[touchstart],
      options: EventListenerOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def removeEventListener_transitioncancel(node: HTMLElement, eventName: transitioncancel, handler: TaggedEventHandler[transitioncancel]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeEventListener_transitioncancel(
      node: HTMLElement,
      eventName: transitioncancel,
      handler: TaggedEventHandler[transitioncancel],
      options: Boolean
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeEventListener_transitioncancel(
      node: HTMLElement,
      eventName: transitioncancel,
      handler: TaggedEventHandler[transitioncancel],
      options: EventListenerOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def removeEventListener_transitionend(node: HTMLElement, eventName: transitionend, handler: TaggedEventHandler[transitionend]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeEventListener_transitionend(
      node: HTMLElement,
      eventName: transitionend,
      handler: TaggedEventHandler[transitionend],
      options: Boolean
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeEventListener_transitionend(
      node: HTMLElement,
      eventName: transitionend,
      handler: TaggedEventHandler[transitionend],
      options: EventListenerOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def removeEventListener_transitionrun(node: HTMLElement, eventName: transitionrun, handler: TaggedEventHandler[transitionrun]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeEventListener_transitionrun(
      node: HTMLElement,
      eventName: transitionrun,
      handler: TaggedEventHandler[transitionrun],
      options: Boolean
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeEventListener_transitionrun(
      node: HTMLElement,
      eventName: transitionrun,
      handler: TaggedEventHandler[transitionrun],
      options: EventListenerOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def removeEventListener_transitionstart(node: HTMLElement, eventName: transitionstart, handler: TaggedEventHandler[transitionstart]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeEventListener_transitionstart(
      node: HTMLElement,
      eventName: transitionstart,
      handler: TaggedEventHandler[transitionstart],
      options: Boolean
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeEventListener_transitionstart(
      node: HTMLElement,
      eventName: transitionstart,
      handler: TaggedEventHandler[transitionstart],
      options: EventListenerOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def removeEventListener_volumechange(node: HTMLElement, eventName: volumechange, handler: TaggedEventHandler[volumechange]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeEventListener_volumechange(
      node: HTMLElement,
      eventName: volumechange,
      handler: TaggedEventHandler[volumechange],
      options: Boolean
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeEventListener_volumechange(
      node: HTMLElement,
      eventName: volumechange,
      handler: TaggedEventHandler[volumechange],
      options: EventListenerOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def removeEventListener_waiting(node: HTMLElement, eventName: waiting, handler: TaggedEventHandler[waiting]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeEventListener_waiting(node: HTMLElement, eventName: waiting, handler: TaggedEventHandler[waiting], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeEventListener_waiting(
      node: HTMLElement,
      eventName: waiting,
      handler: TaggedEventHandler[waiting],
      options: EventListenerOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def removeEventListener_wheel(node: HTMLElement, eventName: wheel, handler: TaggedEventHandler[wheel]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeEventListener_wheel(node: HTMLElement, eventName: wheel, handler: TaggedEventHandler[wheel], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeEventListener_wheel(
      node: HTMLElement,
      eventName: wheel,
      handler: TaggedEventHandler[wheel],
      options: EventListenerOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSImport("dom-helpers", "default.requestAnimationFrame")
    @js.native
    def requestAnimationFrame: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof globalThis.requestAnimationFrame */ js.Any = js.native
    inline def requestAnimationFrame_=(
      x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof globalThis.requestAnimationFrame */ js.Any
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("requestAnimationFrame")(x.asInstanceOf[js.Any])
    
    inline def scrollLeft(node: Element): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("scrollLeft")(node.asInstanceOf[js.Any]).asInstanceOf[Double]
    inline def scrollLeft(node: Element, `val`: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("scrollLeft")(node.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSImport("dom-helpers", "default.scrollParent")
    @js.native
    def scrollParent: js.Function2[
        /* element */ HTMLElement, 
        /* firstPossible */ js.UndefOr[Boolean], 
        Document | HTMLElement
      ] = js.native
    inline def scrollParent(element: HTMLElement): Document | HTMLElement = ^.asInstanceOf[js.Dynamic].applyDynamic("scrollParent")(element.asInstanceOf[js.Any]).asInstanceOf[Document | HTMLElement]
    inline def scrollParent(element: HTMLElement, firstPossible: Boolean): Document | HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("scrollParent")(element.asInstanceOf[js.Any], firstPossible.asInstanceOf[js.Any])).asInstanceOf[Document | HTMLElement]
    inline def scrollParent_=(
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
    inline def scrollTo(selected: HTMLElement): js.UndefOr[js.Function0[Unit]] = ^.asInstanceOf[js.Dynamic].applyDynamic("scrollTo")(selected.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[js.Function0[Unit]]]
    inline def scrollTo(selected: HTMLElement, scrollParent: HTMLElement): js.UndefOr[js.Function0[Unit]] = (^.asInstanceOf[js.Dynamic].applyDynamic("scrollTo")(selected.asInstanceOf[js.Any], scrollParent.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Function0[Unit]]]
    inline def scrollTo_=(
      x: js.Function2[
          /* selected */ HTMLElement, 
          /* scrollParent */ js.UndefOr[HTMLElement], 
          js.UndefOr[js.Function0[Unit]]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("scrollTo")(x.asInstanceOf[js.Any])
    
    inline def scrollTop(node: Element): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("scrollTop")(node.asInstanceOf[js.Any]).asInstanceOf[Double]
    inline def scrollTop(node: Element, `val`: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("scrollTop")(node.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def scrollbarSize(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("scrollbarSize")().asInstanceOf[Double]
    inline def scrollbarSize(recalc: Boolean): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("scrollbarSize")(recalc.asInstanceOf[js.Any]).asInstanceOf[Double]
    @JSImport("dom-helpers", "default.scrollbarSize")
    @js.native
    def scrollbarSize_Fdefault: js.Function1[/* recalc */ js.UndefOr[Boolean], Double] = js.native
    
    inline def scrollbarSize_Fdefault_=(x: js.Function1[/* recalc */ js.UndefOr[Boolean], Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("scrollbarSize")(x.asInstanceOf[js.Any])
    
    @JSImport("dom-helpers", "default.style")
    @js.native
    def style: FnCallNodeProperty = js.native
    inline def style(node: HTMLElement, property: PartialRecordPropertystri): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("style")(node.asInstanceOf[js.Any], property.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def style[T /* <: HyphenProperty */](node: HTMLElement, property: T): /* import warning: importer.ImportType#apply Failed type conversion: csstype.csstype.PropertiesHyphen<string | 0>[T] */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("style")(node.asInstanceOf[js.Any], property.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: csstype.csstype.PropertiesHyphen<string | 0>[T] */ js.Any]
    inline def style_=(x: FnCallNodeProperty): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("style")(x.asInstanceOf[js.Any])
    
    inline def style_T_CamelProperty[T /* <: CamelProperty */](node: HTMLElement, property: T): /* import warning: importer.ImportType#apply Failed type conversion: csstype.csstype.Properties<string | 0>[T] */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("style")(node.asInstanceOf[js.Any], property.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: csstype.csstype.Properties<string | 0>[T] */ js.Any]
    
    @JSImport("dom-helpers", "default.toggleClass")
    @js.native
    def toggleClass: js.Function2[/* element */ Element | SVGElement, /* className */ String, Unit] = js.native
    inline def toggleClass(element: Element, className: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("toggleClass")(element.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def toggleClass(element: SVGElement, className: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("toggleClass")(element.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def toggleClass_=(x: js.Function2[/* element */ Element | SVGElement, /* className */ String, Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("toggleClass")(x.asInstanceOf[js.Any])
    
    @JSImport("dom-helpers", "default.transitionEnd")
    @js.native
    def transitionEnd: js.Function4[
        /* element */ HTMLElement, 
        /* handler */ Listener, 
        /* duration */ js.UndefOr[Double | Null], 
        /* padding */ js.UndefOr[Double], 
        js.Function0[Unit]
      ] = js.native
    inline def transitionEnd(element: HTMLElement, handler: Listener): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("transitionEnd")(element.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    inline def transitionEnd(element: HTMLElement, handler: Listener, duration: Double): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("transitionEnd")(element.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], duration.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    inline def transitionEnd(element: HTMLElement, handler: Listener, duration: Double, padding: Double): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("transitionEnd")(element.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], padding.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    inline def transitionEnd(element: HTMLElement, handler: Listener, duration: Null, padding: Double): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("transitionEnd")(element.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], padding.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    inline def transitionEnd(element: HTMLElement, handler: Listener, duration: Unit, padding: Double): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("transitionEnd")(element.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], padding.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    inline def transitionEnd_=(
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
    inline def width(node: HTMLElement): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("width")(node.asInstanceOf[js.Any]).asInstanceOf[Double]
    inline def width(node: HTMLElement, client: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("width")(node.asInstanceOf[js.Any], client.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def width_=(x: js.Function2[/* node */ HTMLElement, /* client */ js.UndefOr[Boolean], Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("width")(x.asInstanceOf[js.Any])
  }
  
  inline def activeElement(): Element | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("activeElement")().asInstanceOf[Element | Null]
  inline def activeElement(doc: Document): Element | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("activeElement")(doc.asInstanceOf[js.Any]).asInstanceOf[Element | Null]
  
  inline def addClass(element: Element, className: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addClass")(element.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addClass(element: SVGElement, className: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addClass")(element.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def addEventListener_abort(node: HTMLElement, eventName: abort, handler: TaggedEventHandler[abort]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addEventListener_abort(node: HTMLElement, eventName: abort, handler: TaggedEventHandler[abort], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addEventListener_abort(
    node: HTMLElement,
    eventName: abort,
    handler: TaggedEventHandler[abort],
    options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def addEventListener_animationcancel(node: HTMLElement, eventName: animationcancel, handler: TaggedEventHandler[animationcancel]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addEventListener_animationcancel(
    node: HTMLElement,
    eventName: animationcancel,
    handler: TaggedEventHandler[animationcancel],
    options: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addEventListener_animationcancel(
    node: HTMLElement,
    eventName: animationcancel,
    handler: TaggedEventHandler[animationcancel],
    options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def addEventListener_animationend(node: HTMLElement, eventName: animationend, handler: TaggedEventHandler[animationend]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addEventListener_animationend(
    node: HTMLElement,
    eventName: animationend,
    handler: TaggedEventHandler[animationend],
    options: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addEventListener_animationend(
    node: HTMLElement,
    eventName: animationend,
    handler: TaggedEventHandler[animationend],
    options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def addEventListener_animationiteration(node: HTMLElement, eventName: animationiteration, handler: TaggedEventHandler[animationiteration]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addEventListener_animationiteration(
    node: HTMLElement,
    eventName: animationiteration,
    handler: TaggedEventHandler[animationiteration],
    options: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addEventListener_animationiteration(
    node: HTMLElement,
    eventName: animationiteration,
    handler: TaggedEventHandler[animationiteration],
    options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def addEventListener_animationstart(node: HTMLElement, eventName: animationstart, handler: TaggedEventHandler[animationstart]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addEventListener_animationstart(
    node: HTMLElement,
    eventName: animationstart,
    handler: TaggedEventHandler[animationstart],
    options: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addEventListener_animationstart(
    node: HTMLElement,
    eventName: animationstart,
    handler: TaggedEventHandler[animationstart],
    options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def addEventListener_auxclick(node: HTMLElement, eventName: auxclick, handler: TaggedEventHandler[auxclick]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addEventListener_auxclick(node: HTMLElement, eventName: auxclick, handler: TaggedEventHandler[auxclick], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addEventListener_auxclick(
    node: HTMLElement,
    eventName: auxclick,
    handler: TaggedEventHandler[auxclick],
    options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def addEventListener_blur(node: HTMLElement, eventName: blur, handler: TaggedEventHandler[blur]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addEventListener_blur(node: HTMLElement, eventName: blur, handler: TaggedEventHandler[blur], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addEventListener_blur(
    node: HTMLElement,
    eventName: blur,
    handler: TaggedEventHandler[blur],
    options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def addEventListener_cancel(node: HTMLElement, eventName: cancel, handler: TaggedEventHandler[cancel]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addEventListener_cancel(node: HTMLElement, eventName: cancel, handler: TaggedEventHandler[cancel], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addEventListener_cancel(
    node: HTMLElement,
    eventName: cancel,
    handler: TaggedEventHandler[cancel],
    options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def addEventListener_canplay(node: HTMLElement, eventName: canplay, handler: TaggedEventHandler[canplay]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addEventListener_canplay(node: HTMLElement, eventName: canplay, handler: TaggedEventHandler[canplay], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addEventListener_canplay(
    node: HTMLElement,
    eventName: canplay,
    handler: TaggedEventHandler[canplay],
    options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def addEventListener_canplaythrough(node: HTMLElement, eventName: canplaythrough, handler: TaggedEventHandler[canplaythrough]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addEventListener_canplaythrough(
    node: HTMLElement,
    eventName: canplaythrough,
    handler: TaggedEventHandler[canplaythrough],
    options: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addEventListener_canplaythrough(
    node: HTMLElement,
    eventName: canplaythrough,
    handler: TaggedEventHandler[canplaythrough],
    options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def addEventListener_change(node: HTMLElement, eventName: change, handler: TaggedEventHandler[change]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addEventListener_change(node: HTMLElement, eventName: change, handler: TaggedEventHandler[change], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addEventListener_change(
    node: HTMLElement,
    eventName: change,
    handler: TaggedEventHandler[change],
    options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def addEventListener_click(node: HTMLElement, eventName: click, handler: TaggedEventHandler[click]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addEventListener_click(node: HTMLElement, eventName: click, handler: TaggedEventHandler[click], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addEventListener_click(
    node: HTMLElement,
    eventName: click,
    handler: TaggedEventHandler[click],
    options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def addEventListener_close(node: HTMLElement, eventName: close, handler: TaggedEventHandler[close]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addEventListener_close(node: HTMLElement, eventName: close, handler: TaggedEventHandler[close], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addEventListener_close(
    node: HTMLElement,
    eventName: close,
    handler: TaggedEventHandler[close],
    options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def addEventListener_contextmenu(node: HTMLElement, eventName: contextmenu, handler: TaggedEventHandler[contextmenu]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addEventListener_contextmenu(
    node: HTMLElement,
    eventName: contextmenu,
    handler: TaggedEventHandler[contextmenu],
    options: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addEventListener_contextmenu(
    node: HTMLElement,
    eventName: contextmenu,
    handler: TaggedEventHandler[contextmenu],
    options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def addEventListener_copy(node: HTMLElement, eventName: copy, handler: TaggedEventHandler[copy]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addEventListener_copy(node: HTMLElement, eventName: copy, handler: TaggedEventHandler[copy], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addEventListener_copy(
    node: HTMLElement,
    eventName: copy,
    handler: TaggedEventHandler[copy],
    options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def addEventListener_cuechange(node: HTMLElement, eventName: cuechange, handler: TaggedEventHandler[cuechange]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addEventListener_cuechange(node: HTMLElement, eventName: cuechange, handler: TaggedEventHandler[cuechange], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addEventListener_cuechange(
    node: HTMLElement,
    eventName: cuechange,
    handler: TaggedEventHandler[cuechange],
    options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def addEventListener_cut(node: HTMLElement, eventName: cut, handler: TaggedEventHandler[cut]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addEventListener_cut(node: HTMLElement, eventName: cut, handler: TaggedEventHandler[cut], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addEventListener_cut(
    node: HTMLElement,
    eventName: cut,
    handler: TaggedEventHandler[cut],
    options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def addEventListener_dblclick(node: HTMLElement, eventName: dblclick, handler: TaggedEventHandler[dblclick]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addEventListener_dblclick(node: HTMLElement, eventName: dblclick, handler: TaggedEventHandler[dblclick], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addEventListener_dblclick(
    node: HTMLElement,
    eventName: dblclick,
    handler: TaggedEventHandler[dblclick],
    options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def addEventListener_drag(node: HTMLElement, eventName: drag, handler: TaggedEventHandler[drag]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addEventListener_drag(node: HTMLElement, eventName: drag, handler: TaggedEventHandler[drag], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addEventListener_drag(
    node: HTMLElement,
    eventName: drag,
    handler: TaggedEventHandler[drag],
    options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def addEventListener_dragend(node: HTMLElement, eventName: dragend, handler: TaggedEventHandler[dragend]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addEventListener_dragend(node: HTMLElement, eventName: dragend, handler: TaggedEventHandler[dragend], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addEventListener_dragend(
    node: HTMLElement,
    eventName: dragend,
    handler: TaggedEventHandler[dragend],
    options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def addEventListener_dragenter(node: HTMLElement, eventName: dragenter, handler: TaggedEventHandler[dragenter]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addEventListener_dragenter(node: HTMLElement, eventName: dragenter, handler: TaggedEventHandler[dragenter], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addEventListener_dragenter(
    node: HTMLElement,
    eventName: dragenter,
    handler: TaggedEventHandler[dragenter],
    options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def addEventListener_dragexit(node: HTMLElement, eventName: dragexit, handler: TaggedEventHandler[dragexit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addEventListener_dragexit(node: HTMLElement, eventName: dragexit, handler: TaggedEventHandler[dragexit], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addEventListener_dragexit(
    node: HTMLElement,
    eventName: dragexit,
    handler: TaggedEventHandler[dragexit],
    options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def addEventListener_dragleave(node: HTMLElement, eventName: dragleave, handler: TaggedEventHandler[dragleave]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addEventListener_dragleave(node: HTMLElement, eventName: dragleave, handler: TaggedEventHandler[dragleave], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addEventListener_dragleave(
    node: HTMLElement,
    eventName: dragleave,
    handler: TaggedEventHandler[dragleave],
    options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def addEventListener_dragover(node: HTMLElement, eventName: dragover, handler: TaggedEventHandler[dragover]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addEventListener_dragover(node: HTMLElement, eventName: dragover, handler: TaggedEventHandler[dragover], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addEventListener_dragover(
    node: HTMLElement,
    eventName: dragover,
    handler: TaggedEventHandler[dragover],
    options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def addEventListener_dragstart(node: HTMLElement, eventName: dragstart, handler: TaggedEventHandler[dragstart]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addEventListener_dragstart(node: HTMLElement, eventName: dragstart, handler: TaggedEventHandler[dragstart], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addEventListener_dragstart(
    node: HTMLElement,
    eventName: dragstart,
    handler: TaggedEventHandler[dragstart],
    options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def addEventListener_drop(node: HTMLElement, eventName: drop, handler: TaggedEventHandler[drop]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addEventListener_drop(node: HTMLElement, eventName: drop, handler: TaggedEventHandler[drop], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addEventListener_drop(
    node: HTMLElement,
    eventName: drop,
    handler: TaggedEventHandler[drop],
    options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def addEventListener_durationchange(node: HTMLElement, eventName: durationchange, handler: TaggedEventHandler[durationchange]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addEventListener_durationchange(
    node: HTMLElement,
    eventName: durationchange,
    handler: TaggedEventHandler[durationchange],
    options: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addEventListener_durationchange(
    node: HTMLElement,
    eventName: durationchange,
    handler: TaggedEventHandler[durationchange],
    options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def addEventListener_emptied(node: HTMLElement, eventName: emptied, handler: TaggedEventHandler[emptied]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addEventListener_emptied(node: HTMLElement, eventName: emptied, handler: TaggedEventHandler[emptied], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addEventListener_emptied(
    node: HTMLElement,
    eventName: emptied,
    handler: TaggedEventHandler[emptied],
    options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def addEventListener_ended(node: HTMLElement, eventName: ended, handler: TaggedEventHandler[ended]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addEventListener_ended(node: HTMLElement, eventName: ended, handler: TaggedEventHandler[ended], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addEventListener_ended(
    node: HTMLElement,
    eventName: ended,
    handler: TaggedEventHandler[ended],
    options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def addEventListener_error(node: HTMLElement, eventName: error, handler: TaggedEventHandler[error]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addEventListener_error(node: HTMLElement, eventName: error, handler: TaggedEventHandler[error], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addEventListener_error(
    node: HTMLElement,
    eventName: error,
    handler: TaggedEventHandler[error],
    options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def addEventListener_focus(node: HTMLElement, eventName: focus, handler: TaggedEventHandler[focus]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addEventListener_focus(node: HTMLElement, eventName: focus, handler: TaggedEventHandler[focus], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addEventListener_focus(
    node: HTMLElement,
    eventName: focus,
    handler: TaggedEventHandler[focus],
    options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def addEventListener_focusin(node: HTMLElement, eventName: focusin, handler: TaggedEventHandler[focusin]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addEventListener_focusin(node: HTMLElement, eventName: focusin, handler: TaggedEventHandler[focusin], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addEventListener_focusin(
    node: HTMLElement,
    eventName: focusin,
    handler: TaggedEventHandler[focusin],
    options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def addEventListener_focusout(node: HTMLElement, eventName: focusout, handler: TaggedEventHandler[focusout]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addEventListener_focusout(node: HTMLElement, eventName: focusout, handler: TaggedEventHandler[focusout], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addEventListener_focusout(
    node: HTMLElement,
    eventName: focusout,
    handler: TaggedEventHandler[focusout],
    options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * An `addEventListener` ponyfill, supports the `once` option
    */
  inline def addEventListener_fullscreenchange(node: HTMLElement, eventName: fullscreenchange, handler: TaggedEventHandler[fullscreenchange]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addEventListener_fullscreenchange(
    node: HTMLElement,
    eventName: fullscreenchange,
    handler: TaggedEventHandler[fullscreenchange],
    options: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addEventListener_fullscreenchange(
    node: HTMLElement,
    eventName: fullscreenchange,
    handler: TaggedEventHandler[fullscreenchange],
    options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def addEventListener_fullscreenerror(node: HTMLElement, eventName: fullscreenerror, handler: TaggedEventHandler[fullscreenerror]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addEventListener_fullscreenerror(
    node: HTMLElement,
    eventName: fullscreenerror,
    handler: TaggedEventHandler[fullscreenerror],
    options: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addEventListener_fullscreenerror(
    node: HTMLElement,
    eventName: fullscreenerror,
    handler: TaggedEventHandler[fullscreenerror],
    options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def addEventListener_gotpointercapture(node: HTMLElement, eventName: gotpointercapture, handler: TaggedEventHandler[gotpointercapture]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addEventListener_gotpointercapture(
    node: HTMLElement,
    eventName: gotpointercapture,
    handler: TaggedEventHandler[gotpointercapture],
    options: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addEventListener_gotpointercapture(
    node: HTMLElement,
    eventName: gotpointercapture,
    handler: TaggedEventHandler[gotpointercapture],
    options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def addEventListener_input(node: HTMLElement, eventName: input, handler: TaggedEventHandler[input]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addEventListener_input(node: HTMLElement, eventName: input, handler: TaggedEventHandler[input], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addEventListener_input(
    node: HTMLElement,
    eventName: input,
    handler: TaggedEventHandler[input],
    options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def addEventListener_invalid(node: HTMLElement, eventName: invalid, handler: TaggedEventHandler[invalid]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addEventListener_invalid(node: HTMLElement, eventName: invalid, handler: TaggedEventHandler[invalid], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addEventListener_invalid(
    node: HTMLElement,
    eventName: invalid,
    handler: TaggedEventHandler[invalid],
    options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def addEventListener_keydown(node: HTMLElement, eventName: keydown, handler: TaggedEventHandler[keydown]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addEventListener_keydown(node: HTMLElement, eventName: keydown, handler: TaggedEventHandler[keydown], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addEventListener_keydown(
    node: HTMLElement,
    eventName: keydown,
    handler: TaggedEventHandler[keydown],
    options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def addEventListener_keypress(node: HTMLElement, eventName: keypress, handler: TaggedEventHandler[keypress]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addEventListener_keypress(node: HTMLElement, eventName: keypress, handler: TaggedEventHandler[keypress], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addEventListener_keypress(
    node: HTMLElement,
    eventName: keypress,
    handler: TaggedEventHandler[keypress],
    options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def addEventListener_keyup(node: HTMLElement, eventName: keyup, handler: TaggedEventHandler[keyup]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addEventListener_keyup(node: HTMLElement, eventName: keyup, handler: TaggedEventHandler[keyup], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addEventListener_keyup(
    node: HTMLElement,
    eventName: keyup,
    handler: TaggedEventHandler[keyup],
    options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def addEventListener_load(node: HTMLElement, eventName: load, handler: TaggedEventHandler[load]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addEventListener_load(node: HTMLElement, eventName: load, handler: TaggedEventHandler[load], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addEventListener_load(
    node: HTMLElement,
    eventName: load,
    handler: TaggedEventHandler[load],
    options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def addEventListener_loadeddata(node: HTMLElement, eventName: loadeddata, handler: TaggedEventHandler[loadeddata]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addEventListener_loadeddata(
    node: HTMLElement,
    eventName: loadeddata,
    handler: TaggedEventHandler[loadeddata],
    options: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addEventListener_loadeddata(
    node: HTMLElement,
    eventName: loadeddata,
    handler: TaggedEventHandler[loadeddata],
    options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def addEventListener_loadedmetadata(node: HTMLElement, eventName: loadedmetadata, handler: TaggedEventHandler[loadedmetadata]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addEventListener_loadedmetadata(
    node: HTMLElement,
    eventName: loadedmetadata,
    handler: TaggedEventHandler[loadedmetadata],
    options: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addEventListener_loadedmetadata(
    node: HTMLElement,
    eventName: loadedmetadata,
    handler: TaggedEventHandler[loadedmetadata],
    options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def addEventListener_loadstart(node: HTMLElement, eventName: loadstart, handler: TaggedEventHandler[loadstart]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addEventListener_loadstart(node: HTMLElement, eventName: loadstart, handler: TaggedEventHandler[loadstart], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addEventListener_loadstart(
    node: HTMLElement,
    eventName: loadstart,
    handler: TaggedEventHandler[loadstart],
    options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def addEventListener_lostpointercapture(node: HTMLElement, eventName: lostpointercapture, handler: TaggedEventHandler[lostpointercapture]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addEventListener_lostpointercapture(
    node: HTMLElement,
    eventName: lostpointercapture,
    handler: TaggedEventHandler[lostpointercapture],
    options: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addEventListener_lostpointercapture(
    node: HTMLElement,
    eventName: lostpointercapture,
    handler: TaggedEventHandler[lostpointercapture],
    options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def addEventListener_mousedown(node: HTMLElement, eventName: mousedown, handler: TaggedEventHandler[mousedown]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addEventListener_mousedown(node: HTMLElement, eventName: mousedown, handler: TaggedEventHandler[mousedown], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addEventListener_mousedown(
    node: HTMLElement,
    eventName: mousedown,
    handler: TaggedEventHandler[mousedown],
    options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def addEventListener_mouseenter(node: HTMLElement, eventName: mouseenter, handler: TaggedEventHandler[mouseenter]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addEventListener_mouseenter(
    node: HTMLElement,
    eventName: mouseenter,
    handler: TaggedEventHandler[mouseenter],
    options: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addEventListener_mouseenter(
    node: HTMLElement,
    eventName: mouseenter,
    handler: TaggedEventHandler[mouseenter],
    options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def addEventListener_mouseleave(node: HTMLElement, eventName: mouseleave, handler: TaggedEventHandler[mouseleave]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addEventListener_mouseleave(
    node: HTMLElement,
    eventName: mouseleave,
    handler: TaggedEventHandler[mouseleave],
    options: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addEventListener_mouseleave(
    node: HTMLElement,
    eventName: mouseleave,
    handler: TaggedEventHandler[mouseleave],
    options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def addEventListener_mousemove(node: HTMLElement, eventName: mousemove, handler: TaggedEventHandler[mousemove]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addEventListener_mousemove(node: HTMLElement, eventName: mousemove, handler: TaggedEventHandler[mousemove], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addEventListener_mousemove(
    node: HTMLElement,
    eventName: mousemove,
    handler: TaggedEventHandler[mousemove],
    options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def addEventListener_mouseout(node: HTMLElement, eventName: mouseout, handler: TaggedEventHandler[mouseout]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addEventListener_mouseout(node: HTMLElement, eventName: mouseout, handler: TaggedEventHandler[mouseout], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addEventListener_mouseout(
    node: HTMLElement,
    eventName: mouseout,
    handler: TaggedEventHandler[mouseout],
    options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def addEventListener_mouseover(node: HTMLElement, eventName: mouseover, handler: TaggedEventHandler[mouseover]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addEventListener_mouseover(node: HTMLElement, eventName: mouseover, handler: TaggedEventHandler[mouseover], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addEventListener_mouseover(
    node: HTMLElement,
    eventName: mouseover,
    handler: TaggedEventHandler[mouseover],
    options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def addEventListener_mouseup(node: HTMLElement, eventName: mouseup, handler: TaggedEventHandler[mouseup]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addEventListener_mouseup(node: HTMLElement, eventName: mouseup, handler: TaggedEventHandler[mouseup], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addEventListener_mouseup(
    node: HTMLElement,
    eventName: mouseup,
    handler: TaggedEventHandler[mouseup],
    options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def addEventListener_paste(node: HTMLElement, eventName: paste, handler: TaggedEventHandler[paste]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addEventListener_paste(node: HTMLElement, eventName: paste, handler: TaggedEventHandler[paste], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addEventListener_paste(
    node: HTMLElement,
    eventName: paste,
    handler: TaggedEventHandler[paste],
    options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def addEventListener_pause(node: HTMLElement, eventName: pause, handler: TaggedEventHandler[pause]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addEventListener_pause(node: HTMLElement, eventName: pause, handler: TaggedEventHandler[pause], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addEventListener_pause(
    node: HTMLElement,
    eventName: pause,
    handler: TaggedEventHandler[pause],
    options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def addEventListener_play(node: HTMLElement, eventName: play, handler: TaggedEventHandler[play]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addEventListener_play(node: HTMLElement, eventName: play, handler: TaggedEventHandler[play], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addEventListener_play(
    node: HTMLElement,
    eventName: play,
    handler: TaggedEventHandler[play],
    options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def addEventListener_playing(node: HTMLElement, eventName: playing, handler: TaggedEventHandler[playing]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addEventListener_playing(node: HTMLElement, eventName: playing, handler: TaggedEventHandler[playing], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addEventListener_playing(
    node: HTMLElement,
    eventName: playing,
    handler: TaggedEventHandler[playing],
    options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def addEventListener_pointercancel(node: HTMLElement, eventName: pointercancel, handler: TaggedEventHandler[pointercancel]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addEventListener_pointercancel(
    node: HTMLElement,
    eventName: pointercancel,
    handler: TaggedEventHandler[pointercancel],
    options: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addEventListener_pointercancel(
    node: HTMLElement,
    eventName: pointercancel,
    handler: TaggedEventHandler[pointercancel],
    options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def addEventListener_pointerdown(node: HTMLElement, eventName: pointerdown, handler: TaggedEventHandler[pointerdown]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addEventListener_pointerdown(
    node: HTMLElement,
    eventName: pointerdown,
    handler: TaggedEventHandler[pointerdown],
    options: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addEventListener_pointerdown(
    node: HTMLElement,
    eventName: pointerdown,
    handler: TaggedEventHandler[pointerdown],
    options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def addEventListener_pointerenter(node: HTMLElement, eventName: pointerenter, handler: TaggedEventHandler[pointerenter]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addEventListener_pointerenter(
    node: HTMLElement,
    eventName: pointerenter,
    handler: TaggedEventHandler[pointerenter],
    options: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addEventListener_pointerenter(
    node: HTMLElement,
    eventName: pointerenter,
    handler: TaggedEventHandler[pointerenter],
    options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def addEventListener_pointerleave(node: HTMLElement, eventName: pointerleave, handler: TaggedEventHandler[pointerleave]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addEventListener_pointerleave(
    node: HTMLElement,
    eventName: pointerleave,
    handler: TaggedEventHandler[pointerleave],
    options: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addEventListener_pointerleave(
    node: HTMLElement,
    eventName: pointerleave,
    handler: TaggedEventHandler[pointerleave],
    options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def addEventListener_pointermove(node: HTMLElement, eventName: pointermove, handler: TaggedEventHandler[pointermove]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addEventListener_pointermove(
    node: HTMLElement,
    eventName: pointermove,
    handler: TaggedEventHandler[pointermove],
    options: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addEventListener_pointermove(
    node: HTMLElement,
    eventName: pointermove,
    handler: TaggedEventHandler[pointermove],
    options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def addEventListener_pointerout(node: HTMLElement, eventName: pointerout, handler: TaggedEventHandler[pointerout]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addEventListener_pointerout(
    node: HTMLElement,
    eventName: pointerout,
    handler: TaggedEventHandler[pointerout],
    options: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addEventListener_pointerout(
    node: HTMLElement,
    eventName: pointerout,
    handler: TaggedEventHandler[pointerout],
    options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def addEventListener_pointerover(node: HTMLElement, eventName: pointerover, handler: TaggedEventHandler[pointerover]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addEventListener_pointerover(
    node: HTMLElement,
    eventName: pointerover,
    handler: TaggedEventHandler[pointerover],
    options: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addEventListener_pointerover(
    node: HTMLElement,
    eventName: pointerover,
    handler: TaggedEventHandler[pointerover],
    options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def addEventListener_pointerup(node: HTMLElement, eventName: pointerup, handler: TaggedEventHandler[pointerup]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addEventListener_pointerup(node: HTMLElement, eventName: pointerup, handler: TaggedEventHandler[pointerup], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addEventListener_pointerup(
    node: HTMLElement,
    eventName: pointerup,
    handler: TaggedEventHandler[pointerup],
    options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def addEventListener_progress(node: HTMLElement, eventName: progress, handler: TaggedEventHandler[progress]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addEventListener_progress(node: HTMLElement, eventName: progress, handler: TaggedEventHandler[progress], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addEventListener_progress(
    node: HTMLElement,
    eventName: progress,
    handler: TaggedEventHandler[progress],
    options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def addEventListener_ratechange(node: HTMLElement, eventName: ratechange, handler: TaggedEventHandler[ratechange]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addEventListener_ratechange(
    node: HTMLElement,
    eventName: ratechange,
    handler: TaggedEventHandler[ratechange],
    options: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addEventListener_ratechange(
    node: HTMLElement,
    eventName: ratechange,
    handler: TaggedEventHandler[ratechange],
    options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def addEventListener_reset(node: HTMLElement, eventName: reset, handler: TaggedEventHandler[reset]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addEventListener_reset(node: HTMLElement, eventName: reset, handler: TaggedEventHandler[reset], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addEventListener_reset(
    node: HTMLElement,
    eventName: reset,
    handler: TaggedEventHandler[reset],
    options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def addEventListener_resize(node: HTMLElement, eventName: resize, handler: TaggedEventHandler[resize]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addEventListener_resize(node: HTMLElement, eventName: resize, handler: TaggedEventHandler[resize], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addEventListener_resize(
    node: HTMLElement,
    eventName: resize,
    handler: TaggedEventHandler[resize],
    options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def addEventListener_scroll(node: HTMLElement, eventName: scroll, handler: TaggedEventHandler[scroll]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addEventListener_scroll(node: HTMLElement, eventName: scroll, handler: TaggedEventHandler[scroll], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addEventListener_scroll(
    node: HTMLElement,
    eventName: scroll,
    handler: TaggedEventHandler[scroll],
    options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def addEventListener_securitypolicyviolation(
    node: HTMLElement,
    eventName: securitypolicyviolation,
    handler: TaggedEventHandler[securitypolicyviolation]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addEventListener_securitypolicyviolation(
    node: HTMLElement,
    eventName: securitypolicyviolation,
    handler: TaggedEventHandler[securitypolicyviolation],
    options: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addEventListener_securitypolicyviolation(
    node: HTMLElement,
    eventName: securitypolicyviolation,
    handler: TaggedEventHandler[securitypolicyviolation],
    options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def addEventListener_seeked(node: HTMLElement, eventName: seeked, handler: TaggedEventHandler[seeked]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addEventListener_seeked(node: HTMLElement, eventName: seeked, handler: TaggedEventHandler[seeked], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addEventListener_seeked(
    node: HTMLElement,
    eventName: seeked,
    handler: TaggedEventHandler[seeked],
    options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def addEventListener_seeking(node: HTMLElement, eventName: seeking, handler: TaggedEventHandler[seeking]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addEventListener_seeking(node: HTMLElement, eventName: seeking, handler: TaggedEventHandler[seeking], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addEventListener_seeking(
    node: HTMLElement,
    eventName: seeking,
    handler: TaggedEventHandler[seeking],
    options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def addEventListener_select(node: HTMLElement, eventName: select, handler: TaggedEventHandler[select]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addEventListener_select(node: HTMLElement, eventName: select, handler: TaggedEventHandler[select], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addEventListener_select(
    node: HTMLElement,
    eventName: select,
    handler: TaggedEventHandler[select],
    options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def addEventListener_selectionchange(node: HTMLElement, eventName: selectionchange, handler: TaggedEventHandler[selectionchange]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addEventListener_selectionchange(
    node: HTMLElement,
    eventName: selectionchange,
    handler: TaggedEventHandler[selectionchange],
    options: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addEventListener_selectionchange(
    node: HTMLElement,
    eventName: selectionchange,
    handler: TaggedEventHandler[selectionchange],
    options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def addEventListener_selectstart(node: HTMLElement, eventName: selectstart, handler: TaggedEventHandler[selectstart]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addEventListener_selectstart(
    node: HTMLElement,
    eventName: selectstart,
    handler: TaggedEventHandler[selectstart],
    options: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addEventListener_selectstart(
    node: HTMLElement,
    eventName: selectstart,
    handler: TaggedEventHandler[selectstart],
    options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def addEventListener_stalled(node: HTMLElement, eventName: stalled, handler: TaggedEventHandler[stalled]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addEventListener_stalled(node: HTMLElement, eventName: stalled, handler: TaggedEventHandler[stalled], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addEventListener_stalled(
    node: HTMLElement,
    eventName: stalled,
    handler: TaggedEventHandler[stalled],
    options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def addEventListener_submit(node: HTMLElement, eventName: submit, handler: TaggedEventHandler[submit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addEventListener_submit(node: HTMLElement, eventName: submit, handler: TaggedEventHandler[submit], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addEventListener_submit(
    node: HTMLElement,
    eventName: submit,
    handler: TaggedEventHandler[submit],
    options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def addEventListener_suspend(node: HTMLElement, eventName: suspend, handler: TaggedEventHandler[suspend]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addEventListener_suspend(node: HTMLElement, eventName: suspend, handler: TaggedEventHandler[suspend], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addEventListener_suspend(
    node: HTMLElement,
    eventName: suspend,
    handler: TaggedEventHandler[suspend],
    options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def addEventListener_timeupdate(node: HTMLElement, eventName: timeupdate, handler: TaggedEventHandler[timeupdate]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addEventListener_timeupdate(
    node: HTMLElement,
    eventName: timeupdate,
    handler: TaggedEventHandler[timeupdate],
    options: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addEventListener_timeupdate(
    node: HTMLElement,
    eventName: timeupdate,
    handler: TaggedEventHandler[timeupdate],
    options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def addEventListener_toggle(node: HTMLElement, eventName: toggle, handler: TaggedEventHandler[toggle]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addEventListener_toggle(node: HTMLElement, eventName: toggle, handler: TaggedEventHandler[toggle], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addEventListener_toggle(
    node: HTMLElement,
    eventName: toggle,
    handler: TaggedEventHandler[toggle],
    options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def addEventListener_touchcancel(node: HTMLElement, eventName: touchcancel, handler: TaggedEventHandler[touchcancel]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addEventListener_touchcancel(
    node: HTMLElement,
    eventName: touchcancel,
    handler: TaggedEventHandler[touchcancel],
    options: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addEventListener_touchcancel(
    node: HTMLElement,
    eventName: touchcancel,
    handler: TaggedEventHandler[touchcancel],
    options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def addEventListener_touchend(node: HTMLElement, eventName: touchend, handler: TaggedEventHandler[touchend]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addEventListener_touchend(node: HTMLElement, eventName: touchend, handler: TaggedEventHandler[touchend], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addEventListener_touchend(
    node: HTMLElement,
    eventName: touchend,
    handler: TaggedEventHandler[touchend],
    options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def addEventListener_touchmove(node: HTMLElement, eventName: touchmove, handler: TaggedEventHandler[touchmove]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addEventListener_touchmove(node: HTMLElement, eventName: touchmove, handler: TaggedEventHandler[touchmove], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addEventListener_touchmove(
    node: HTMLElement,
    eventName: touchmove,
    handler: TaggedEventHandler[touchmove],
    options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def addEventListener_touchstart(node: HTMLElement, eventName: touchstart, handler: TaggedEventHandler[touchstart]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addEventListener_touchstart(
    node: HTMLElement,
    eventName: touchstart,
    handler: TaggedEventHandler[touchstart],
    options: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addEventListener_touchstart(
    node: HTMLElement,
    eventName: touchstart,
    handler: TaggedEventHandler[touchstart],
    options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def addEventListener_transitioncancel(node: HTMLElement, eventName: transitioncancel, handler: TaggedEventHandler[transitioncancel]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addEventListener_transitioncancel(
    node: HTMLElement,
    eventName: transitioncancel,
    handler: TaggedEventHandler[transitioncancel],
    options: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addEventListener_transitioncancel(
    node: HTMLElement,
    eventName: transitioncancel,
    handler: TaggedEventHandler[transitioncancel],
    options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def addEventListener_transitionend(node: HTMLElement, eventName: transitionend, handler: TaggedEventHandler[transitionend]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addEventListener_transitionend(
    node: HTMLElement,
    eventName: transitionend,
    handler: TaggedEventHandler[transitionend],
    options: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addEventListener_transitionend(
    node: HTMLElement,
    eventName: transitionend,
    handler: TaggedEventHandler[transitionend],
    options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def addEventListener_transitionrun(node: HTMLElement, eventName: transitionrun, handler: TaggedEventHandler[transitionrun]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addEventListener_transitionrun(
    node: HTMLElement,
    eventName: transitionrun,
    handler: TaggedEventHandler[transitionrun],
    options: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addEventListener_transitionrun(
    node: HTMLElement,
    eventName: transitionrun,
    handler: TaggedEventHandler[transitionrun],
    options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def addEventListener_transitionstart(node: HTMLElement, eventName: transitionstart, handler: TaggedEventHandler[transitionstart]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addEventListener_transitionstart(
    node: HTMLElement,
    eventName: transitionstart,
    handler: TaggedEventHandler[transitionstart],
    options: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addEventListener_transitionstart(
    node: HTMLElement,
    eventName: transitionstart,
    handler: TaggedEventHandler[transitionstart],
    options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def addEventListener_volumechange(node: HTMLElement, eventName: volumechange, handler: TaggedEventHandler[volumechange]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addEventListener_volumechange(
    node: HTMLElement,
    eventName: volumechange,
    handler: TaggedEventHandler[volumechange],
    options: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addEventListener_volumechange(
    node: HTMLElement,
    eventName: volumechange,
    handler: TaggedEventHandler[volumechange],
    options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def addEventListener_waiting(node: HTMLElement, eventName: waiting, handler: TaggedEventHandler[waiting]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addEventListener_waiting(node: HTMLElement, eventName: waiting, handler: TaggedEventHandler[waiting], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addEventListener_waiting(
    node: HTMLElement,
    eventName: waiting,
    handler: TaggedEventHandler[waiting],
    options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def addEventListener_wheel(node: HTMLElement, eventName: wheel, handler: TaggedEventHandler[wheel]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addEventListener_wheel(node: HTMLElement, eventName: wheel, handler: TaggedEventHandler[wheel], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addEventListener_wheel(
    node: HTMLElement,
    eventName: wheel,
    handler: TaggedEventHandler[wheel],
    options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def animate(node: HTMLElement, properties: AnimateProperties, duration: Double): Cancel = (^.asInstanceOf[js.Dynamic].applyDynamic("animate")(node.asInstanceOf[js.Any], properties.asInstanceOf[js.Any], duration.asInstanceOf[js.Any])).asInstanceOf[Cancel]
  inline def animate(options: Options): Cancel = ^.asInstanceOf[js.Dynamic].applyDynamic("animate")(options.asInstanceOf[js.Any]).asInstanceOf[Cancel]
  
  inline def animate_transitionend(
    node: HTMLElement,
    properties: AnimateProperties,
    duration: Double,
    callback: EventHandler[transitionend]
  ): Cancel = (^.asInstanceOf[js.Dynamic].applyDynamic("animate")(node.asInstanceOf[js.Any], properties.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Cancel]
  inline def animate_transitionend(
    node: HTMLElement,
    properties: AnimateProperties,
    duration: Double,
    easing: String,
    callback: EventHandler[transitionend]
  ): Cancel = (^.asInstanceOf[js.Dynamic].applyDynamic("animate")(node.asInstanceOf[js.Any], properties.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], easing.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Cancel]
  
  inline def cancelAnimationFrame(id: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("cancelAnimationFrame")(id.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def closest(node: Element, selector: String): Element | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("closest")(node.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[Element | Null]
  inline def closest(node: Element, selector: String, stopAt: Element): Element | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("closest")(node.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], stopAt.asInstanceOf[js.Any])).asInstanceOf[Element | Null]
  
  inline def contains(context: Element, node: Element): js.UndefOr[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("contains")(context.asInstanceOf[js.Any], node.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Boolean]]
  
  inline def filter_abort(selector: String, handler: EventHandler[abort]): EventHandler[abort] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[abort]]
  
  inline def filter_animationcancel(selector: String, handler: EventHandler[animationcancel]): EventHandler[animationcancel] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[animationcancel]]
  
  inline def filter_animationend(selector: String, handler: EventHandler[animationend]): EventHandler[animationend] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[animationend]]
  
  inline def filter_animationiteration(selector: String, handler: EventHandler[animationiteration]): EventHandler[animationiteration] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[animationiteration]]
  
  inline def filter_animationstart(selector: String, handler: EventHandler[animationstart]): EventHandler[animationstart] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[animationstart]]
  
  inline def filter_auxclick(selector: String, handler: EventHandler[auxclick]): EventHandler[auxclick] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[auxclick]]
  
  inline def filter_blur(selector: String, handler: EventHandler[blur]): EventHandler[blur] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[blur]]
  
  inline def filter_cancel(selector: String, handler: EventHandler[cancel]): EventHandler[cancel] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[cancel]]
  
  inline def filter_canplay(selector: String, handler: EventHandler[canplay]): EventHandler[canplay] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[canplay]]
  
  inline def filter_canplaythrough(selector: String, handler: EventHandler[canplaythrough]): EventHandler[canplaythrough] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[canplaythrough]]
  
  inline def filter_change(selector: String, handler: EventHandler[change]): EventHandler[change] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[change]]
  
  inline def filter_click(selector: String, handler: EventHandler[click]): EventHandler[click] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[click]]
  
  inline def filter_close(selector: String, handler: EventHandler[close]): EventHandler[close] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[close]]
  
  inline def filter_contextmenu(selector: String, handler: EventHandler[contextmenu]): EventHandler[contextmenu] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[contextmenu]]
  
  inline def filter_copy(selector: String, handler: EventHandler[copy]): EventHandler[copy] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[copy]]
  
  inline def filter_cuechange(selector: String, handler: EventHandler[cuechange]): EventHandler[cuechange] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[cuechange]]
  
  inline def filter_cut(selector: String, handler: EventHandler[cut]): EventHandler[cut] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[cut]]
  
  inline def filter_dblclick(selector: String, handler: EventHandler[dblclick]): EventHandler[dblclick] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[dblclick]]
  
  inline def filter_drag(selector: String, handler: EventHandler[drag]): EventHandler[drag] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[drag]]
  
  inline def filter_dragend(selector: String, handler: EventHandler[dragend]): EventHandler[dragend] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[dragend]]
  
  inline def filter_dragenter(selector: String, handler: EventHandler[dragenter]): EventHandler[dragenter] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[dragenter]]
  
  inline def filter_dragexit(selector: String, handler: EventHandler[dragexit]): EventHandler[dragexit] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[dragexit]]
  
  inline def filter_dragleave(selector: String, handler: EventHandler[dragleave]): EventHandler[dragleave] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[dragleave]]
  
  inline def filter_dragover(selector: String, handler: EventHandler[dragover]): EventHandler[dragover] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[dragover]]
  
  inline def filter_dragstart(selector: String, handler: EventHandler[dragstart]): EventHandler[dragstart] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[dragstart]]
  
  inline def filter_drop(selector: String, handler: EventHandler[drop]): EventHandler[drop] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[drop]]
  
  inline def filter_durationchange(selector: String, handler: EventHandler[durationchange]): EventHandler[durationchange] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[durationchange]]
  
  inline def filter_emptied(selector: String, handler: EventHandler[emptied]): EventHandler[emptied] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[emptied]]
  
  inline def filter_ended(selector: String, handler: EventHandler[ended]): EventHandler[ended] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[ended]]
  
  inline def filter_error(selector: String, handler: EventHandler[error]): EventHandler[error] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[error]]
  
  inline def filter_focus(selector: String, handler: EventHandler[focus]): EventHandler[focus] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[focus]]
  
  inline def filter_focusin(selector: String, handler: EventHandler[focusin]): EventHandler[focusin] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[focusin]]
  
  inline def filter_focusout(selector: String, handler: EventHandler[focusout]): EventHandler[focusout] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[focusout]]
  
  inline def filter_fullscreenchange(selector: String, handler: EventHandler[fullscreenchange]): EventHandler[fullscreenchange] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[fullscreenchange]]
  
  inline def filter_fullscreenerror(selector: String, handler: EventHandler[fullscreenerror]): EventHandler[fullscreenerror] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[fullscreenerror]]
  
  inline def filter_gotpointercapture(selector: String, handler: EventHandler[gotpointercapture]): EventHandler[gotpointercapture] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[gotpointercapture]]
  
  inline def filter_input(selector: String, handler: EventHandler[input]): EventHandler[input] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[input]]
  
  inline def filter_invalid(selector: String, handler: EventHandler[invalid]): EventHandler[invalid] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[invalid]]
  
  inline def filter_keydown(selector: String, handler: EventHandler[keydown]): EventHandler[keydown] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[keydown]]
  
  inline def filter_keypress(selector: String, handler: EventHandler[keypress]): EventHandler[keypress] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[keypress]]
  
  inline def filter_keyup(selector: String, handler: EventHandler[keyup]): EventHandler[keyup] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[keyup]]
  
  inline def filter_load(selector: String, handler: EventHandler[load]): EventHandler[load] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[load]]
  
  inline def filter_loadeddata(selector: String, handler: EventHandler[loadeddata]): EventHandler[loadeddata] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[loadeddata]]
  
  inline def filter_loadedmetadata(selector: String, handler: EventHandler[loadedmetadata]): EventHandler[loadedmetadata] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[loadedmetadata]]
  
  inline def filter_loadstart(selector: String, handler: EventHandler[loadstart]): EventHandler[loadstart] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[loadstart]]
  
  inline def filter_lostpointercapture(selector: String, handler: EventHandler[lostpointercapture]): EventHandler[lostpointercapture] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[lostpointercapture]]
  
  inline def filter_mousedown(selector: String, handler: EventHandler[mousedown]): EventHandler[mousedown] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[mousedown]]
  
  inline def filter_mouseenter(selector: String, handler: EventHandler[mouseenter]): EventHandler[mouseenter] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[mouseenter]]
  
  inline def filter_mouseleave(selector: String, handler: EventHandler[mouseleave]): EventHandler[mouseleave] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[mouseleave]]
  
  inline def filter_mousemove(selector: String, handler: EventHandler[mousemove]): EventHandler[mousemove] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[mousemove]]
  
  inline def filter_mouseout(selector: String, handler: EventHandler[mouseout]): EventHandler[mouseout] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[mouseout]]
  
  inline def filter_mouseover(selector: String, handler: EventHandler[mouseover]): EventHandler[mouseover] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[mouseover]]
  
  inline def filter_mouseup(selector: String, handler: EventHandler[mouseup]): EventHandler[mouseup] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[mouseup]]
  
  inline def filter_paste(selector: String, handler: EventHandler[paste]): EventHandler[paste] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[paste]]
  
  inline def filter_pause(selector: String, handler: EventHandler[pause]): EventHandler[pause] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[pause]]
  
  inline def filter_play(selector: String, handler: EventHandler[play]): EventHandler[play] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[play]]
  
  inline def filter_playing(selector: String, handler: EventHandler[playing]): EventHandler[playing] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[playing]]
  
  inline def filter_pointercancel(selector: String, handler: EventHandler[pointercancel]): EventHandler[pointercancel] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[pointercancel]]
  
  inline def filter_pointerdown(selector: String, handler: EventHandler[pointerdown]): EventHandler[pointerdown] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[pointerdown]]
  
  inline def filter_pointerenter(selector: String, handler: EventHandler[pointerenter]): EventHandler[pointerenter] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[pointerenter]]
  
  inline def filter_pointerleave(selector: String, handler: EventHandler[pointerleave]): EventHandler[pointerleave] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[pointerleave]]
  
  inline def filter_pointermove(selector: String, handler: EventHandler[pointermove]): EventHandler[pointermove] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[pointermove]]
  
  inline def filter_pointerout(selector: String, handler: EventHandler[pointerout]): EventHandler[pointerout] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[pointerout]]
  
  inline def filter_pointerover(selector: String, handler: EventHandler[pointerover]): EventHandler[pointerover] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[pointerover]]
  
  inline def filter_pointerup(selector: String, handler: EventHandler[pointerup]): EventHandler[pointerup] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[pointerup]]
  
  inline def filter_progress(selector: String, handler: EventHandler[progress]): EventHandler[progress] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[progress]]
  
  inline def filter_ratechange(selector: String, handler: EventHandler[ratechange]): EventHandler[ratechange] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[ratechange]]
  
  inline def filter_reset(selector: String, handler: EventHandler[reset]): EventHandler[reset] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[reset]]
  
  inline def filter_resize(selector: String, handler: EventHandler[resize]): EventHandler[resize] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[resize]]
  
  inline def filter_scroll(selector: String, handler: EventHandler[scroll]): EventHandler[scroll] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[scroll]]
  
  inline def filter_securitypolicyviolation(selector: String, handler: EventHandler[securitypolicyviolation]): EventHandler[securitypolicyviolation] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[securitypolicyviolation]]
  
  inline def filter_seeked(selector: String, handler: EventHandler[seeked]): EventHandler[seeked] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[seeked]]
  
  inline def filter_seeking(selector: String, handler: EventHandler[seeking]): EventHandler[seeking] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[seeking]]
  
  inline def filter_select(selector: String, handler: EventHandler[select]): EventHandler[select] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[select]]
  
  inline def filter_selectionchange(selector: String, handler: EventHandler[selectionchange]): EventHandler[selectionchange] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[selectionchange]]
  
  inline def filter_selectstart(selector: String, handler: EventHandler[selectstart]): EventHandler[selectstart] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[selectstart]]
  
  inline def filter_stalled(selector: String, handler: EventHandler[stalled]): EventHandler[stalled] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[stalled]]
  
  inline def filter_submit(selector: String, handler: EventHandler[submit]): EventHandler[submit] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[submit]]
  
  inline def filter_suspend(selector: String, handler: EventHandler[suspend]): EventHandler[suspend] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[suspend]]
  
  inline def filter_timeupdate(selector: String, handler: EventHandler[timeupdate]): EventHandler[timeupdate] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[timeupdate]]
  
  inline def filter_toggle(selector: String, handler: EventHandler[toggle]): EventHandler[toggle] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[toggle]]
  
  inline def filter_touchcancel(selector: String, handler: EventHandler[touchcancel]): EventHandler[touchcancel] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[touchcancel]]
  
  inline def filter_touchend(selector: String, handler: EventHandler[touchend]): EventHandler[touchend] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[touchend]]
  
  inline def filter_touchmove(selector: String, handler: EventHandler[touchmove]): EventHandler[touchmove] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[touchmove]]
  
  inline def filter_touchstart(selector: String, handler: EventHandler[touchstart]): EventHandler[touchstart] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[touchstart]]
  
  inline def filter_transitioncancel(selector: String, handler: EventHandler[transitioncancel]): EventHandler[transitioncancel] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[transitioncancel]]
  
  inline def filter_transitionend(selector: String, handler: EventHandler[transitionend]): EventHandler[transitionend] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[transitionend]]
  
  inline def filter_transitionrun(selector: String, handler: EventHandler[transitionrun]): EventHandler[transitionrun] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[transitionrun]]
  
  inline def filter_transitionstart(selector: String, handler: EventHandler[transitionstart]): EventHandler[transitionstart] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[transitionstart]]
  
  inline def filter_volumechange(selector: String, handler: EventHandler[volumechange]): EventHandler[volumechange] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[volumechange]]
  
  inline def filter_waiting(selector: String, handler: EventHandler[waiting]): EventHandler[waiting] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[waiting]]
  
  inline def filter_wheel(selector: String, handler: EventHandler[wheel]): EventHandler[wheel] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[wheel]]
  
  inline def getComputedStyle(node: HTMLElement): CSSStyleDeclaration = ^.asInstanceOf[js.Dynamic].applyDynamic("getComputedStyle")(node.asInstanceOf[js.Any]).asInstanceOf[CSSStyleDeclaration]
  inline def getComputedStyle(node: HTMLElement, psuedoElement: String): CSSStyleDeclaration = (^.asInstanceOf[js.Dynamic].applyDynamic("getComputedStyle")(node.asInstanceOf[js.Any], psuedoElement.asInstanceOf[js.Any])).asInstanceOf[CSSStyleDeclaration]
  
  inline def hasClass(element: Element, className: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasClass")(element.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def hasClass(element: SVGElement, className: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasClass")(element.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def height(node: HTMLElement): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("height")(node.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def height(node: HTMLElement, client: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("height")(node.asInstanceOf[js.Any], client.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def listen_abort(node: HTMLElement, eventName: abort, handler: EventHandler[abort]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listen_abort(node: HTMLElement, eventName: abort, handler: EventHandler[abort], options: Boolean): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listen_abort(
    node: HTMLElement,
    eventName: abort,
    handler: EventHandler[abort],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  
  inline def listen_animationcancel(node: HTMLElement, eventName: animationcancel, handler: EventHandler[animationcancel]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listen_animationcancel(
    node: HTMLElement,
    eventName: animationcancel,
    handler: EventHandler[animationcancel],
    options: Boolean
  ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listen_animationcancel(
    node: HTMLElement,
    eventName: animationcancel,
    handler: EventHandler[animationcancel],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  
  inline def listen_animationend(node: HTMLElement, eventName: animationend, handler: EventHandler[animationend]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listen_animationend(node: HTMLElement, eventName: animationend, handler: EventHandler[animationend], options: Boolean): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listen_animationend(
    node: HTMLElement,
    eventName: animationend,
    handler: EventHandler[animationend],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  
  inline def listen_animationiteration(node: HTMLElement, eventName: animationiteration, handler: EventHandler[animationiteration]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listen_animationiteration(
    node: HTMLElement,
    eventName: animationiteration,
    handler: EventHandler[animationiteration],
    options: Boolean
  ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listen_animationiteration(
    node: HTMLElement,
    eventName: animationiteration,
    handler: EventHandler[animationiteration],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  
  inline def listen_animationstart(node: HTMLElement, eventName: animationstart, handler: EventHandler[animationstart]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listen_animationstart(
    node: HTMLElement,
    eventName: animationstart,
    handler: EventHandler[animationstart],
    options: Boolean
  ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listen_animationstart(
    node: HTMLElement,
    eventName: animationstart,
    handler: EventHandler[animationstart],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  
  inline def listen_auxclick(node: HTMLElement, eventName: auxclick, handler: EventHandler[auxclick]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listen_auxclick(node: HTMLElement, eventName: auxclick, handler: EventHandler[auxclick], options: Boolean): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listen_auxclick(
    node: HTMLElement,
    eventName: auxclick,
    handler: EventHandler[auxclick],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  
  inline def listen_blur(node: HTMLElement, eventName: blur, handler: EventHandler[blur]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listen_blur(node: HTMLElement, eventName: blur, handler: EventHandler[blur], options: Boolean): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listen_blur(node: HTMLElement, eventName: blur, handler: EventHandler[blur], options: AddEventListenerOptions): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  
  inline def listen_cancel(node: HTMLElement, eventName: cancel, handler: EventHandler[cancel]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listen_cancel(node: HTMLElement, eventName: cancel, handler: EventHandler[cancel], options: Boolean): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listen_cancel(
    node: HTMLElement,
    eventName: cancel,
    handler: EventHandler[cancel],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  
  inline def listen_canplay(node: HTMLElement, eventName: canplay, handler: EventHandler[canplay]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listen_canplay(node: HTMLElement, eventName: canplay, handler: EventHandler[canplay], options: Boolean): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listen_canplay(
    node: HTMLElement,
    eventName: canplay,
    handler: EventHandler[canplay],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  
  inline def listen_canplaythrough(node: HTMLElement, eventName: canplaythrough, handler: EventHandler[canplaythrough]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listen_canplaythrough(
    node: HTMLElement,
    eventName: canplaythrough,
    handler: EventHandler[canplaythrough],
    options: Boolean
  ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listen_canplaythrough(
    node: HTMLElement,
    eventName: canplaythrough,
    handler: EventHandler[canplaythrough],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  
  inline def listen_change(node: HTMLElement, eventName: change, handler: EventHandler[change]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listen_change(node: HTMLElement, eventName: change, handler: EventHandler[change], options: Boolean): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listen_change(
    node: HTMLElement,
    eventName: change,
    handler: EventHandler[change],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  
  inline def listen_click(node: HTMLElement, eventName: click, handler: EventHandler[click]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listen_click(node: HTMLElement, eventName: click, handler: EventHandler[click], options: Boolean): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listen_click(
    node: HTMLElement,
    eventName: click,
    handler: EventHandler[click],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  
  inline def listen_close(node: HTMLElement, eventName: close, handler: EventHandler[close]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listen_close(node: HTMLElement, eventName: close, handler: EventHandler[close], options: Boolean): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listen_close(
    node: HTMLElement,
    eventName: close,
    handler: EventHandler[close],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  
  inline def listen_contextmenu(node: HTMLElement, eventName: contextmenu, handler: EventHandler[contextmenu]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listen_contextmenu(node: HTMLElement, eventName: contextmenu, handler: EventHandler[contextmenu], options: Boolean): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listen_contextmenu(
    node: HTMLElement,
    eventName: contextmenu,
    handler: EventHandler[contextmenu],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  
  inline def listen_copy(node: HTMLElement, eventName: copy, handler: EventHandler[copy]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listen_copy(node: HTMLElement, eventName: copy, handler: EventHandler[copy], options: Boolean): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listen_copy(node: HTMLElement, eventName: copy, handler: EventHandler[copy], options: AddEventListenerOptions): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  
  inline def listen_cuechange(node: HTMLElement, eventName: cuechange, handler: EventHandler[cuechange]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listen_cuechange(node: HTMLElement, eventName: cuechange, handler: EventHandler[cuechange], options: Boolean): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listen_cuechange(
    node: HTMLElement,
    eventName: cuechange,
    handler: EventHandler[cuechange],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  
  inline def listen_cut(node: HTMLElement, eventName: cut, handler: EventHandler[cut]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listen_cut(node: HTMLElement, eventName: cut, handler: EventHandler[cut], options: Boolean): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listen_cut(node: HTMLElement, eventName: cut, handler: EventHandler[cut], options: AddEventListenerOptions): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  
  inline def listen_dblclick(node: HTMLElement, eventName: dblclick, handler: EventHandler[dblclick]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listen_dblclick(node: HTMLElement, eventName: dblclick, handler: EventHandler[dblclick], options: Boolean): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listen_dblclick(
    node: HTMLElement,
    eventName: dblclick,
    handler: EventHandler[dblclick],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  
  inline def listen_drag(node: HTMLElement, eventName: drag, handler: EventHandler[drag]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listen_drag(node: HTMLElement, eventName: drag, handler: EventHandler[drag], options: Boolean): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listen_drag(node: HTMLElement, eventName: drag, handler: EventHandler[drag], options: AddEventListenerOptions): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  
  inline def listen_dragend(node: HTMLElement, eventName: dragend, handler: EventHandler[dragend]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listen_dragend(node: HTMLElement, eventName: dragend, handler: EventHandler[dragend], options: Boolean): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listen_dragend(
    node: HTMLElement,
    eventName: dragend,
    handler: EventHandler[dragend],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  
  inline def listen_dragenter(node: HTMLElement, eventName: dragenter, handler: EventHandler[dragenter]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listen_dragenter(node: HTMLElement, eventName: dragenter, handler: EventHandler[dragenter], options: Boolean): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listen_dragenter(
    node: HTMLElement,
    eventName: dragenter,
    handler: EventHandler[dragenter],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  
  inline def listen_dragexit(node: HTMLElement, eventName: dragexit, handler: EventHandler[dragexit]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listen_dragexit(node: HTMLElement, eventName: dragexit, handler: EventHandler[dragexit], options: Boolean): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listen_dragexit(
    node: HTMLElement,
    eventName: dragexit,
    handler: EventHandler[dragexit],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  
  inline def listen_dragleave(node: HTMLElement, eventName: dragleave, handler: EventHandler[dragleave]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listen_dragleave(node: HTMLElement, eventName: dragleave, handler: EventHandler[dragleave], options: Boolean): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listen_dragleave(
    node: HTMLElement,
    eventName: dragleave,
    handler: EventHandler[dragleave],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  
  inline def listen_dragover(node: HTMLElement, eventName: dragover, handler: EventHandler[dragover]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listen_dragover(node: HTMLElement, eventName: dragover, handler: EventHandler[dragover], options: Boolean): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listen_dragover(
    node: HTMLElement,
    eventName: dragover,
    handler: EventHandler[dragover],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  
  inline def listen_dragstart(node: HTMLElement, eventName: dragstart, handler: EventHandler[dragstart]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listen_dragstart(node: HTMLElement, eventName: dragstart, handler: EventHandler[dragstart], options: Boolean): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listen_dragstart(
    node: HTMLElement,
    eventName: dragstart,
    handler: EventHandler[dragstart],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  
  inline def listen_drop(node: HTMLElement, eventName: drop, handler: EventHandler[drop]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listen_drop(node: HTMLElement, eventName: drop, handler: EventHandler[drop], options: Boolean): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listen_drop(node: HTMLElement, eventName: drop, handler: EventHandler[drop], options: AddEventListenerOptions): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  
  inline def listen_durationchange(node: HTMLElement, eventName: durationchange, handler: EventHandler[durationchange]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listen_durationchange(
    node: HTMLElement,
    eventName: durationchange,
    handler: EventHandler[durationchange],
    options: Boolean
  ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listen_durationchange(
    node: HTMLElement,
    eventName: durationchange,
    handler: EventHandler[durationchange],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  
  inline def listen_emptied(node: HTMLElement, eventName: emptied, handler: EventHandler[emptied]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listen_emptied(node: HTMLElement, eventName: emptied, handler: EventHandler[emptied], options: Boolean): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listen_emptied(
    node: HTMLElement,
    eventName: emptied,
    handler: EventHandler[emptied],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  
  inline def listen_ended(node: HTMLElement, eventName: ended, handler: EventHandler[ended]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listen_ended(node: HTMLElement, eventName: ended, handler: EventHandler[ended], options: Boolean): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listen_ended(
    node: HTMLElement,
    eventName: ended,
    handler: EventHandler[ended],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  
  inline def listen_error(node: HTMLElement, eventName: error, handler: EventHandler[error]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listen_error(node: HTMLElement, eventName: error, handler: EventHandler[error], options: Boolean): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listen_error(
    node: HTMLElement,
    eventName: error,
    handler: EventHandler[error],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  
  inline def listen_focus(node: HTMLElement, eventName: focus, handler: EventHandler[focus]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listen_focus(node: HTMLElement, eventName: focus, handler: EventHandler[focus], options: Boolean): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listen_focus(
    node: HTMLElement,
    eventName: focus,
    handler: EventHandler[focus],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  
  inline def listen_focusin(node: HTMLElement, eventName: focusin, handler: EventHandler[focusin]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listen_focusin(node: HTMLElement, eventName: focusin, handler: EventHandler[focusin], options: Boolean): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listen_focusin(
    node: HTMLElement,
    eventName: focusin,
    handler: EventHandler[focusin],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  
  inline def listen_focusout(node: HTMLElement, eventName: focusout, handler: EventHandler[focusout]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listen_focusout(node: HTMLElement, eventName: focusout, handler: EventHandler[focusout], options: Boolean): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listen_focusout(
    node: HTMLElement,
    eventName: focusout,
    handler: EventHandler[focusout],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  
  inline def listen_fullscreenchange(node: HTMLElement, eventName: fullscreenchange, handler: EventHandler[fullscreenchange]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listen_fullscreenchange(
    node: HTMLElement,
    eventName: fullscreenchange,
    handler: EventHandler[fullscreenchange],
    options: Boolean
  ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listen_fullscreenchange(
    node: HTMLElement,
    eventName: fullscreenchange,
    handler: EventHandler[fullscreenchange],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  
  inline def listen_fullscreenerror(node: HTMLElement, eventName: fullscreenerror, handler: EventHandler[fullscreenerror]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listen_fullscreenerror(
    node: HTMLElement,
    eventName: fullscreenerror,
    handler: EventHandler[fullscreenerror],
    options: Boolean
  ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listen_fullscreenerror(
    node: HTMLElement,
    eventName: fullscreenerror,
    handler: EventHandler[fullscreenerror],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  
  inline def listen_gotpointercapture(node: HTMLElement, eventName: gotpointercapture, handler: EventHandler[gotpointercapture]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listen_gotpointercapture(
    node: HTMLElement,
    eventName: gotpointercapture,
    handler: EventHandler[gotpointercapture],
    options: Boolean
  ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listen_gotpointercapture(
    node: HTMLElement,
    eventName: gotpointercapture,
    handler: EventHandler[gotpointercapture],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  
  inline def listen_input(node: HTMLElement, eventName: input, handler: EventHandler[input]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listen_input(node: HTMLElement, eventName: input, handler: EventHandler[input], options: Boolean): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listen_input(
    node: HTMLElement,
    eventName: input,
    handler: EventHandler[input],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  
  inline def listen_invalid(node: HTMLElement, eventName: invalid, handler: EventHandler[invalid]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listen_invalid(node: HTMLElement, eventName: invalid, handler: EventHandler[invalid], options: Boolean): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listen_invalid(
    node: HTMLElement,
    eventName: invalid,
    handler: EventHandler[invalid],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  
  inline def listen_keydown(node: HTMLElement, eventName: keydown, handler: EventHandler[keydown]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listen_keydown(node: HTMLElement, eventName: keydown, handler: EventHandler[keydown], options: Boolean): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listen_keydown(
    node: HTMLElement,
    eventName: keydown,
    handler: EventHandler[keydown],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  
  inline def listen_keypress(node: HTMLElement, eventName: keypress, handler: EventHandler[keypress]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listen_keypress(node: HTMLElement, eventName: keypress, handler: EventHandler[keypress], options: Boolean): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listen_keypress(
    node: HTMLElement,
    eventName: keypress,
    handler: EventHandler[keypress],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  
  inline def listen_keyup(node: HTMLElement, eventName: keyup, handler: EventHandler[keyup]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listen_keyup(node: HTMLElement, eventName: keyup, handler: EventHandler[keyup], options: Boolean): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listen_keyup(
    node: HTMLElement,
    eventName: keyup,
    handler: EventHandler[keyup],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  
  inline def listen_load(node: HTMLElement, eventName: load, handler: EventHandler[load]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listen_load(node: HTMLElement, eventName: load, handler: EventHandler[load], options: Boolean): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listen_load(node: HTMLElement, eventName: load, handler: EventHandler[load], options: AddEventListenerOptions): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  
  inline def listen_loadeddata(node: HTMLElement, eventName: loadeddata, handler: EventHandler[loadeddata]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listen_loadeddata(node: HTMLElement, eventName: loadeddata, handler: EventHandler[loadeddata], options: Boolean): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listen_loadeddata(
    node: HTMLElement,
    eventName: loadeddata,
    handler: EventHandler[loadeddata],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  
  inline def listen_loadedmetadata(node: HTMLElement, eventName: loadedmetadata, handler: EventHandler[loadedmetadata]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listen_loadedmetadata(
    node: HTMLElement,
    eventName: loadedmetadata,
    handler: EventHandler[loadedmetadata],
    options: Boolean
  ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listen_loadedmetadata(
    node: HTMLElement,
    eventName: loadedmetadata,
    handler: EventHandler[loadedmetadata],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  
  inline def listen_loadstart(node: HTMLElement, eventName: loadstart, handler: EventHandler[loadstart]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listen_loadstart(node: HTMLElement, eventName: loadstart, handler: EventHandler[loadstart], options: Boolean): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listen_loadstart(
    node: HTMLElement,
    eventName: loadstart,
    handler: EventHandler[loadstart],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  
  inline def listen_lostpointercapture(node: HTMLElement, eventName: lostpointercapture, handler: EventHandler[lostpointercapture]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listen_lostpointercapture(
    node: HTMLElement,
    eventName: lostpointercapture,
    handler: EventHandler[lostpointercapture],
    options: Boolean
  ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listen_lostpointercapture(
    node: HTMLElement,
    eventName: lostpointercapture,
    handler: EventHandler[lostpointercapture],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  
  inline def listen_mousedown(node: HTMLElement, eventName: mousedown, handler: EventHandler[mousedown]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listen_mousedown(node: HTMLElement, eventName: mousedown, handler: EventHandler[mousedown], options: Boolean): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listen_mousedown(
    node: HTMLElement,
    eventName: mousedown,
    handler: EventHandler[mousedown],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  
  inline def listen_mouseenter(node: HTMLElement, eventName: mouseenter, handler: EventHandler[mouseenter]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listen_mouseenter(node: HTMLElement, eventName: mouseenter, handler: EventHandler[mouseenter], options: Boolean): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listen_mouseenter(
    node: HTMLElement,
    eventName: mouseenter,
    handler: EventHandler[mouseenter],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  
  inline def listen_mouseleave(node: HTMLElement, eventName: mouseleave, handler: EventHandler[mouseleave]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listen_mouseleave(node: HTMLElement, eventName: mouseleave, handler: EventHandler[mouseleave], options: Boolean): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listen_mouseleave(
    node: HTMLElement,
    eventName: mouseleave,
    handler: EventHandler[mouseleave],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  
  inline def listen_mousemove(node: HTMLElement, eventName: mousemove, handler: EventHandler[mousemove]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listen_mousemove(node: HTMLElement, eventName: mousemove, handler: EventHandler[mousemove], options: Boolean): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listen_mousemove(
    node: HTMLElement,
    eventName: mousemove,
    handler: EventHandler[mousemove],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  
  inline def listen_mouseout(node: HTMLElement, eventName: mouseout, handler: EventHandler[mouseout]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listen_mouseout(node: HTMLElement, eventName: mouseout, handler: EventHandler[mouseout], options: Boolean): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listen_mouseout(
    node: HTMLElement,
    eventName: mouseout,
    handler: EventHandler[mouseout],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  
  inline def listen_mouseover(node: HTMLElement, eventName: mouseover, handler: EventHandler[mouseover]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listen_mouseover(node: HTMLElement, eventName: mouseover, handler: EventHandler[mouseover], options: Boolean): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listen_mouseover(
    node: HTMLElement,
    eventName: mouseover,
    handler: EventHandler[mouseover],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  
  inline def listen_mouseup(node: HTMLElement, eventName: mouseup, handler: EventHandler[mouseup]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listen_mouseup(node: HTMLElement, eventName: mouseup, handler: EventHandler[mouseup], options: Boolean): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listen_mouseup(
    node: HTMLElement,
    eventName: mouseup,
    handler: EventHandler[mouseup],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  
  inline def listen_paste(node: HTMLElement, eventName: paste, handler: EventHandler[paste]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listen_paste(node: HTMLElement, eventName: paste, handler: EventHandler[paste], options: Boolean): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listen_paste(
    node: HTMLElement,
    eventName: paste,
    handler: EventHandler[paste],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  
  inline def listen_pause(node: HTMLElement, eventName: pause, handler: EventHandler[pause]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listen_pause(node: HTMLElement, eventName: pause, handler: EventHandler[pause], options: Boolean): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listen_pause(
    node: HTMLElement,
    eventName: pause,
    handler: EventHandler[pause],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  
  inline def listen_play(node: HTMLElement, eventName: play, handler: EventHandler[play]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listen_play(node: HTMLElement, eventName: play, handler: EventHandler[play], options: Boolean): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listen_play(node: HTMLElement, eventName: play, handler: EventHandler[play], options: AddEventListenerOptions): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  
  inline def listen_playing(node: HTMLElement, eventName: playing, handler: EventHandler[playing]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listen_playing(node: HTMLElement, eventName: playing, handler: EventHandler[playing], options: Boolean): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listen_playing(
    node: HTMLElement,
    eventName: playing,
    handler: EventHandler[playing],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  
  inline def listen_pointercancel(node: HTMLElement, eventName: pointercancel, handler: EventHandler[pointercancel]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listen_pointercancel(
    node: HTMLElement,
    eventName: pointercancel,
    handler: EventHandler[pointercancel],
    options: Boolean
  ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listen_pointercancel(
    node: HTMLElement,
    eventName: pointercancel,
    handler: EventHandler[pointercancel],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  
  inline def listen_pointerdown(node: HTMLElement, eventName: pointerdown, handler: EventHandler[pointerdown]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listen_pointerdown(node: HTMLElement, eventName: pointerdown, handler: EventHandler[pointerdown], options: Boolean): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listen_pointerdown(
    node: HTMLElement,
    eventName: pointerdown,
    handler: EventHandler[pointerdown],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  
  inline def listen_pointerenter(node: HTMLElement, eventName: pointerenter, handler: EventHandler[pointerenter]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listen_pointerenter(node: HTMLElement, eventName: pointerenter, handler: EventHandler[pointerenter], options: Boolean): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listen_pointerenter(
    node: HTMLElement,
    eventName: pointerenter,
    handler: EventHandler[pointerenter],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  
  inline def listen_pointerleave(node: HTMLElement, eventName: pointerleave, handler: EventHandler[pointerleave]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listen_pointerleave(node: HTMLElement, eventName: pointerleave, handler: EventHandler[pointerleave], options: Boolean): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listen_pointerleave(
    node: HTMLElement,
    eventName: pointerleave,
    handler: EventHandler[pointerleave],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  
  inline def listen_pointermove(node: HTMLElement, eventName: pointermove, handler: EventHandler[pointermove]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listen_pointermove(node: HTMLElement, eventName: pointermove, handler: EventHandler[pointermove], options: Boolean): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listen_pointermove(
    node: HTMLElement,
    eventName: pointermove,
    handler: EventHandler[pointermove],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  
  inline def listen_pointerout(node: HTMLElement, eventName: pointerout, handler: EventHandler[pointerout]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listen_pointerout(node: HTMLElement, eventName: pointerout, handler: EventHandler[pointerout], options: Boolean): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listen_pointerout(
    node: HTMLElement,
    eventName: pointerout,
    handler: EventHandler[pointerout],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  
  inline def listen_pointerover(node: HTMLElement, eventName: pointerover, handler: EventHandler[pointerover]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listen_pointerover(node: HTMLElement, eventName: pointerover, handler: EventHandler[pointerover], options: Boolean): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listen_pointerover(
    node: HTMLElement,
    eventName: pointerover,
    handler: EventHandler[pointerover],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  
  inline def listen_pointerup(node: HTMLElement, eventName: pointerup, handler: EventHandler[pointerup]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listen_pointerup(node: HTMLElement, eventName: pointerup, handler: EventHandler[pointerup], options: Boolean): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listen_pointerup(
    node: HTMLElement,
    eventName: pointerup,
    handler: EventHandler[pointerup],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  
  inline def listen_progress(node: HTMLElement, eventName: progress, handler: EventHandler[progress]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listen_progress(node: HTMLElement, eventName: progress, handler: EventHandler[progress], options: Boolean): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listen_progress(
    node: HTMLElement,
    eventName: progress,
    handler: EventHandler[progress],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  
  inline def listen_ratechange(node: HTMLElement, eventName: ratechange, handler: EventHandler[ratechange]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listen_ratechange(node: HTMLElement, eventName: ratechange, handler: EventHandler[ratechange], options: Boolean): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listen_ratechange(
    node: HTMLElement,
    eventName: ratechange,
    handler: EventHandler[ratechange],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  
  inline def listen_reset(node: HTMLElement, eventName: reset, handler: EventHandler[reset]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listen_reset(node: HTMLElement, eventName: reset, handler: EventHandler[reset], options: Boolean): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listen_reset(
    node: HTMLElement,
    eventName: reset,
    handler: EventHandler[reset],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  
  inline def listen_resize(node: HTMLElement, eventName: resize, handler: EventHandler[resize]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listen_resize(node: HTMLElement, eventName: resize, handler: EventHandler[resize], options: Boolean): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listen_resize(
    node: HTMLElement,
    eventName: resize,
    handler: EventHandler[resize],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  
  inline def listen_scroll(node: HTMLElement, eventName: scroll, handler: EventHandler[scroll]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listen_scroll(node: HTMLElement, eventName: scroll, handler: EventHandler[scroll], options: Boolean): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listen_scroll(
    node: HTMLElement,
    eventName: scroll,
    handler: EventHandler[scroll],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  
  inline def listen_securitypolicyviolation(
    node: HTMLElement,
    eventName: securitypolicyviolation,
    handler: EventHandler[securitypolicyviolation]
  ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listen_securitypolicyviolation(
    node: HTMLElement,
    eventName: securitypolicyviolation,
    handler: EventHandler[securitypolicyviolation],
    options: Boolean
  ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listen_securitypolicyviolation(
    node: HTMLElement,
    eventName: securitypolicyviolation,
    handler: EventHandler[securitypolicyviolation],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  
  inline def listen_seeked(node: HTMLElement, eventName: seeked, handler: EventHandler[seeked]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listen_seeked(node: HTMLElement, eventName: seeked, handler: EventHandler[seeked], options: Boolean): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listen_seeked(
    node: HTMLElement,
    eventName: seeked,
    handler: EventHandler[seeked],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  
  inline def listen_seeking(node: HTMLElement, eventName: seeking, handler: EventHandler[seeking]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listen_seeking(node: HTMLElement, eventName: seeking, handler: EventHandler[seeking], options: Boolean): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listen_seeking(
    node: HTMLElement,
    eventName: seeking,
    handler: EventHandler[seeking],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  
  inline def listen_select(node: HTMLElement, eventName: select, handler: EventHandler[select]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listen_select(node: HTMLElement, eventName: select, handler: EventHandler[select], options: Boolean): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listen_select(
    node: HTMLElement,
    eventName: select,
    handler: EventHandler[select],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  
  inline def listen_selectionchange(node: HTMLElement, eventName: selectionchange, handler: EventHandler[selectionchange]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listen_selectionchange(
    node: HTMLElement,
    eventName: selectionchange,
    handler: EventHandler[selectionchange],
    options: Boolean
  ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listen_selectionchange(
    node: HTMLElement,
    eventName: selectionchange,
    handler: EventHandler[selectionchange],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  
  inline def listen_selectstart(node: HTMLElement, eventName: selectstart, handler: EventHandler[selectstart]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listen_selectstart(node: HTMLElement, eventName: selectstart, handler: EventHandler[selectstart], options: Boolean): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listen_selectstart(
    node: HTMLElement,
    eventName: selectstart,
    handler: EventHandler[selectstart],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  
  inline def listen_stalled(node: HTMLElement, eventName: stalled, handler: EventHandler[stalled]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listen_stalled(node: HTMLElement, eventName: stalled, handler: EventHandler[stalled], options: Boolean): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listen_stalled(
    node: HTMLElement,
    eventName: stalled,
    handler: EventHandler[stalled],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  
  inline def listen_submit(node: HTMLElement, eventName: submit, handler: EventHandler[submit]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listen_submit(node: HTMLElement, eventName: submit, handler: EventHandler[submit], options: Boolean): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listen_submit(
    node: HTMLElement,
    eventName: submit,
    handler: EventHandler[submit],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  
  inline def listen_suspend(node: HTMLElement, eventName: suspend, handler: EventHandler[suspend]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listen_suspend(node: HTMLElement, eventName: suspend, handler: EventHandler[suspend], options: Boolean): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listen_suspend(
    node: HTMLElement,
    eventName: suspend,
    handler: EventHandler[suspend],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  
  inline def listen_timeupdate(node: HTMLElement, eventName: timeupdate, handler: EventHandler[timeupdate]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listen_timeupdate(node: HTMLElement, eventName: timeupdate, handler: EventHandler[timeupdate], options: Boolean): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listen_timeupdate(
    node: HTMLElement,
    eventName: timeupdate,
    handler: EventHandler[timeupdate],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  
  inline def listen_toggle(node: HTMLElement, eventName: toggle, handler: EventHandler[toggle]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listen_toggle(node: HTMLElement, eventName: toggle, handler: EventHandler[toggle], options: Boolean): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listen_toggle(
    node: HTMLElement,
    eventName: toggle,
    handler: EventHandler[toggle],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  
  inline def listen_touchcancel(node: HTMLElement, eventName: touchcancel, handler: EventHandler[touchcancel]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listen_touchcancel(node: HTMLElement, eventName: touchcancel, handler: EventHandler[touchcancel], options: Boolean): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listen_touchcancel(
    node: HTMLElement,
    eventName: touchcancel,
    handler: EventHandler[touchcancel],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  
  inline def listen_touchend(node: HTMLElement, eventName: touchend, handler: EventHandler[touchend]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listen_touchend(node: HTMLElement, eventName: touchend, handler: EventHandler[touchend], options: Boolean): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listen_touchend(
    node: HTMLElement,
    eventName: touchend,
    handler: EventHandler[touchend],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  
  inline def listen_touchmove(node: HTMLElement, eventName: touchmove, handler: EventHandler[touchmove]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listen_touchmove(node: HTMLElement, eventName: touchmove, handler: EventHandler[touchmove], options: Boolean): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listen_touchmove(
    node: HTMLElement,
    eventName: touchmove,
    handler: EventHandler[touchmove],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  
  inline def listen_touchstart(node: HTMLElement, eventName: touchstart, handler: EventHandler[touchstart]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listen_touchstart(node: HTMLElement, eventName: touchstart, handler: EventHandler[touchstart], options: Boolean): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listen_touchstart(
    node: HTMLElement,
    eventName: touchstart,
    handler: EventHandler[touchstart],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  
  inline def listen_transitioncancel(node: HTMLElement, eventName: transitioncancel, handler: EventHandler[transitioncancel]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listen_transitioncancel(
    node: HTMLElement,
    eventName: transitioncancel,
    handler: EventHandler[transitioncancel],
    options: Boolean
  ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listen_transitioncancel(
    node: HTMLElement,
    eventName: transitioncancel,
    handler: EventHandler[transitioncancel],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  
  inline def listen_transitionend(node: HTMLElement, eventName: transitionend, handler: EventHandler[transitionend]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listen_transitionend(
    node: HTMLElement,
    eventName: transitionend,
    handler: EventHandler[transitionend],
    options: Boolean
  ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listen_transitionend(
    node: HTMLElement,
    eventName: transitionend,
    handler: EventHandler[transitionend],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  
  inline def listen_transitionrun(node: HTMLElement, eventName: transitionrun, handler: EventHandler[transitionrun]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listen_transitionrun(
    node: HTMLElement,
    eventName: transitionrun,
    handler: EventHandler[transitionrun],
    options: Boolean
  ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listen_transitionrun(
    node: HTMLElement,
    eventName: transitionrun,
    handler: EventHandler[transitionrun],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  
  inline def listen_transitionstart(node: HTMLElement, eventName: transitionstart, handler: EventHandler[transitionstart]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listen_transitionstart(
    node: HTMLElement,
    eventName: transitionstart,
    handler: EventHandler[transitionstart],
    options: Boolean
  ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listen_transitionstart(
    node: HTMLElement,
    eventName: transitionstart,
    handler: EventHandler[transitionstart],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  
  inline def listen_volumechange(node: HTMLElement, eventName: volumechange, handler: EventHandler[volumechange]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listen_volumechange(node: HTMLElement, eventName: volumechange, handler: EventHandler[volumechange], options: Boolean): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listen_volumechange(
    node: HTMLElement,
    eventName: volumechange,
    handler: EventHandler[volumechange],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  
  inline def listen_waiting(node: HTMLElement, eventName: waiting, handler: EventHandler[waiting]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listen_waiting(node: HTMLElement, eventName: waiting, handler: EventHandler[waiting], options: Boolean): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listen_waiting(
    node: HTMLElement,
    eventName: waiting,
    handler: EventHandler[waiting],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  
  inline def listen_wheel(node: HTMLElement, eventName: wheel, handler: EventHandler[wheel]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listen_wheel(node: HTMLElement, eventName: wheel, handler: EventHandler[wheel], options: Boolean): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listen_wheel(
    node: HTMLElement,
    eventName: wheel,
    handler: EventHandler[wheel],
    options: AddEventListenerOptions
  ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  
  inline def matches(node: Element, selector: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("matches")(node.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def offset(node: HTMLElement): Height = ^.asInstanceOf[js.Dynamic].applyDynamic("offset")(node.asInstanceOf[js.Any]).asInstanceOf[Height]
  
  inline def offsetParent(node: HTMLElement): HTMLElement = ^.asInstanceOf[js.Dynamic].applyDynamic("offsetParent")(node.asInstanceOf[js.Any]).asInstanceOf[HTMLElement]
  
  inline def ownerDocument(): Document = ^.asInstanceOf[js.Dynamic].applyDynamic("ownerDocument")().asInstanceOf[Document]
  inline def ownerDocument(node: Element): Document = ^.asInstanceOf[js.Dynamic].applyDynamic("ownerDocument")(node.asInstanceOf[js.Any]).asInstanceOf[Document]
  
  inline def ownerWindow(): Window = ^.asInstanceOf[js.Dynamic].applyDynamic("ownerWindow")().asInstanceOf[Window]
  inline def ownerWindow(node: Element): Window = ^.asInstanceOf[js.Dynamic].applyDynamic("ownerWindow")(node.asInstanceOf[js.Any]).asInstanceOf[Window]
  
  inline def position(node: HTMLElement): Height = ^.asInstanceOf[js.Dynamic].applyDynamic("position")(node.asInstanceOf[js.Any]).asInstanceOf[Height]
  inline def position(node: HTMLElement, offsetParent: HTMLElement): Height = (^.asInstanceOf[js.Dynamic].applyDynamic("position")(node.asInstanceOf[js.Any], offsetParent.asInstanceOf[js.Any])).asInstanceOf[Height]
  
  inline def querySelectorAll(element: Document, selector: String): js.Array[HTMLElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("querySelectorAll")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[js.Array[HTMLElement]]
  inline def querySelectorAll(element: HTMLElement, selector: String): js.Array[HTMLElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("querySelectorAll")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[js.Array[HTMLElement]]
  
  inline def removeClass(element: Element, className: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeClass")(element.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeClass(element: SVGElement, className: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeClass")(element.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def removeEventListener_abort(node: HTMLElement, eventName: abort, handler: TaggedEventHandler[abort]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeEventListener_abort(node: HTMLElement, eventName: abort, handler: TaggedEventHandler[abort], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeEventListener_abort(
    node: HTMLElement,
    eventName: abort,
    handler: TaggedEventHandler[abort],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def removeEventListener_animationcancel(node: HTMLElement, eventName: animationcancel, handler: TaggedEventHandler[animationcancel]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeEventListener_animationcancel(
    node: HTMLElement,
    eventName: animationcancel,
    handler: TaggedEventHandler[animationcancel],
    options: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeEventListener_animationcancel(
    node: HTMLElement,
    eventName: animationcancel,
    handler: TaggedEventHandler[animationcancel],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def removeEventListener_animationend(node: HTMLElement, eventName: animationend, handler: TaggedEventHandler[animationend]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeEventListener_animationend(
    node: HTMLElement,
    eventName: animationend,
    handler: TaggedEventHandler[animationend],
    options: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeEventListener_animationend(
    node: HTMLElement,
    eventName: animationend,
    handler: TaggedEventHandler[animationend],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def removeEventListener_animationiteration(node: HTMLElement, eventName: animationiteration, handler: TaggedEventHandler[animationiteration]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeEventListener_animationiteration(
    node: HTMLElement,
    eventName: animationiteration,
    handler: TaggedEventHandler[animationiteration],
    options: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeEventListener_animationiteration(
    node: HTMLElement,
    eventName: animationiteration,
    handler: TaggedEventHandler[animationiteration],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def removeEventListener_animationstart(node: HTMLElement, eventName: animationstart, handler: TaggedEventHandler[animationstart]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeEventListener_animationstart(
    node: HTMLElement,
    eventName: animationstart,
    handler: TaggedEventHandler[animationstart],
    options: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeEventListener_animationstart(
    node: HTMLElement,
    eventName: animationstart,
    handler: TaggedEventHandler[animationstart],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def removeEventListener_auxclick(node: HTMLElement, eventName: auxclick, handler: TaggedEventHandler[auxclick]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeEventListener_auxclick(node: HTMLElement, eventName: auxclick, handler: TaggedEventHandler[auxclick], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeEventListener_auxclick(
    node: HTMLElement,
    eventName: auxclick,
    handler: TaggedEventHandler[auxclick],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def removeEventListener_blur(node: HTMLElement, eventName: blur, handler: TaggedEventHandler[blur]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeEventListener_blur(node: HTMLElement, eventName: blur, handler: TaggedEventHandler[blur], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeEventListener_blur(
    node: HTMLElement,
    eventName: blur,
    handler: TaggedEventHandler[blur],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def removeEventListener_cancel(node: HTMLElement, eventName: cancel, handler: TaggedEventHandler[cancel]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeEventListener_cancel(node: HTMLElement, eventName: cancel, handler: TaggedEventHandler[cancel], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeEventListener_cancel(
    node: HTMLElement,
    eventName: cancel,
    handler: TaggedEventHandler[cancel],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def removeEventListener_canplay(node: HTMLElement, eventName: canplay, handler: TaggedEventHandler[canplay]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeEventListener_canplay(node: HTMLElement, eventName: canplay, handler: TaggedEventHandler[canplay], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeEventListener_canplay(
    node: HTMLElement,
    eventName: canplay,
    handler: TaggedEventHandler[canplay],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def removeEventListener_canplaythrough(node: HTMLElement, eventName: canplaythrough, handler: TaggedEventHandler[canplaythrough]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeEventListener_canplaythrough(
    node: HTMLElement,
    eventName: canplaythrough,
    handler: TaggedEventHandler[canplaythrough],
    options: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeEventListener_canplaythrough(
    node: HTMLElement,
    eventName: canplaythrough,
    handler: TaggedEventHandler[canplaythrough],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def removeEventListener_change(node: HTMLElement, eventName: change, handler: TaggedEventHandler[change]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeEventListener_change(node: HTMLElement, eventName: change, handler: TaggedEventHandler[change], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeEventListener_change(
    node: HTMLElement,
    eventName: change,
    handler: TaggedEventHandler[change],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def removeEventListener_click(node: HTMLElement, eventName: click, handler: TaggedEventHandler[click]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeEventListener_click(node: HTMLElement, eventName: click, handler: TaggedEventHandler[click], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeEventListener_click(
    node: HTMLElement,
    eventName: click,
    handler: TaggedEventHandler[click],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def removeEventListener_close(node: HTMLElement, eventName: close, handler: TaggedEventHandler[close]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeEventListener_close(node: HTMLElement, eventName: close, handler: TaggedEventHandler[close], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeEventListener_close(
    node: HTMLElement,
    eventName: close,
    handler: TaggedEventHandler[close],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def removeEventListener_contextmenu(node: HTMLElement, eventName: contextmenu, handler: TaggedEventHandler[contextmenu]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeEventListener_contextmenu(
    node: HTMLElement,
    eventName: contextmenu,
    handler: TaggedEventHandler[contextmenu],
    options: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeEventListener_contextmenu(
    node: HTMLElement,
    eventName: contextmenu,
    handler: TaggedEventHandler[contextmenu],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def removeEventListener_copy(node: HTMLElement, eventName: copy, handler: TaggedEventHandler[copy]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeEventListener_copy(node: HTMLElement, eventName: copy, handler: TaggedEventHandler[copy], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeEventListener_copy(
    node: HTMLElement,
    eventName: copy,
    handler: TaggedEventHandler[copy],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def removeEventListener_cuechange(node: HTMLElement, eventName: cuechange, handler: TaggedEventHandler[cuechange]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeEventListener_cuechange(node: HTMLElement, eventName: cuechange, handler: TaggedEventHandler[cuechange], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeEventListener_cuechange(
    node: HTMLElement,
    eventName: cuechange,
    handler: TaggedEventHandler[cuechange],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def removeEventListener_cut(node: HTMLElement, eventName: cut, handler: TaggedEventHandler[cut]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeEventListener_cut(node: HTMLElement, eventName: cut, handler: TaggedEventHandler[cut], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeEventListener_cut(node: HTMLElement, eventName: cut, handler: TaggedEventHandler[cut], options: EventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def removeEventListener_dblclick(node: HTMLElement, eventName: dblclick, handler: TaggedEventHandler[dblclick]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeEventListener_dblclick(node: HTMLElement, eventName: dblclick, handler: TaggedEventHandler[dblclick], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeEventListener_dblclick(
    node: HTMLElement,
    eventName: dblclick,
    handler: TaggedEventHandler[dblclick],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def removeEventListener_drag(node: HTMLElement, eventName: drag, handler: TaggedEventHandler[drag]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeEventListener_drag(node: HTMLElement, eventName: drag, handler: TaggedEventHandler[drag], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeEventListener_drag(
    node: HTMLElement,
    eventName: drag,
    handler: TaggedEventHandler[drag],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def removeEventListener_dragend(node: HTMLElement, eventName: dragend, handler: TaggedEventHandler[dragend]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeEventListener_dragend(node: HTMLElement, eventName: dragend, handler: TaggedEventHandler[dragend], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeEventListener_dragend(
    node: HTMLElement,
    eventName: dragend,
    handler: TaggedEventHandler[dragend],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def removeEventListener_dragenter(node: HTMLElement, eventName: dragenter, handler: TaggedEventHandler[dragenter]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeEventListener_dragenter(node: HTMLElement, eventName: dragenter, handler: TaggedEventHandler[dragenter], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeEventListener_dragenter(
    node: HTMLElement,
    eventName: dragenter,
    handler: TaggedEventHandler[dragenter],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def removeEventListener_dragexit(node: HTMLElement, eventName: dragexit, handler: TaggedEventHandler[dragexit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeEventListener_dragexit(node: HTMLElement, eventName: dragexit, handler: TaggedEventHandler[dragexit], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeEventListener_dragexit(
    node: HTMLElement,
    eventName: dragexit,
    handler: TaggedEventHandler[dragexit],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def removeEventListener_dragleave(node: HTMLElement, eventName: dragleave, handler: TaggedEventHandler[dragleave]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeEventListener_dragleave(node: HTMLElement, eventName: dragleave, handler: TaggedEventHandler[dragleave], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeEventListener_dragleave(
    node: HTMLElement,
    eventName: dragleave,
    handler: TaggedEventHandler[dragleave],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def removeEventListener_dragover(node: HTMLElement, eventName: dragover, handler: TaggedEventHandler[dragover]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeEventListener_dragover(node: HTMLElement, eventName: dragover, handler: TaggedEventHandler[dragover], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeEventListener_dragover(
    node: HTMLElement,
    eventName: dragover,
    handler: TaggedEventHandler[dragover],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def removeEventListener_dragstart(node: HTMLElement, eventName: dragstart, handler: TaggedEventHandler[dragstart]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeEventListener_dragstart(node: HTMLElement, eventName: dragstart, handler: TaggedEventHandler[dragstart], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeEventListener_dragstart(
    node: HTMLElement,
    eventName: dragstart,
    handler: TaggedEventHandler[dragstart],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def removeEventListener_drop(node: HTMLElement, eventName: drop, handler: TaggedEventHandler[drop]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeEventListener_drop(node: HTMLElement, eventName: drop, handler: TaggedEventHandler[drop], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeEventListener_drop(
    node: HTMLElement,
    eventName: drop,
    handler: TaggedEventHandler[drop],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def removeEventListener_durationchange(node: HTMLElement, eventName: durationchange, handler: TaggedEventHandler[durationchange]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeEventListener_durationchange(
    node: HTMLElement,
    eventName: durationchange,
    handler: TaggedEventHandler[durationchange],
    options: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeEventListener_durationchange(
    node: HTMLElement,
    eventName: durationchange,
    handler: TaggedEventHandler[durationchange],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def removeEventListener_emptied(node: HTMLElement, eventName: emptied, handler: TaggedEventHandler[emptied]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeEventListener_emptied(node: HTMLElement, eventName: emptied, handler: TaggedEventHandler[emptied], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeEventListener_emptied(
    node: HTMLElement,
    eventName: emptied,
    handler: TaggedEventHandler[emptied],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def removeEventListener_ended(node: HTMLElement, eventName: ended, handler: TaggedEventHandler[ended]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeEventListener_ended(node: HTMLElement, eventName: ended, handler: TaggedEventHandler[ended], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeEventListener_ended(
    node: HTMLElement,
    eventName: ended,
    handler: TaggedEventHandler[ended],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def removeEventListener_error(node: HTMLElement, eventName: error, handler: TaggedEventHandler[error]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeEventListener_error(node: HTMLElement, eventName: error, handler: TaggedEventHandler[error], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeEventListener_error(
    node: HTMLElement,
    eventName: error,
    handler: TaggedEventHandler[error],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def removeEventListener_focus(node: HTMLElement, eventName: focus, handler: TaggedEventHandler[focus]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeEventListener_focus(node: HTMLElement, eventName: focus, handler: TaggedEventHandler[focus], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeEventListener_focus(
    node: HTMLElement,
    eventName: focus,
    handler: TaggedEventHandler[focus],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def removeEventListener_focusin(node: HTMLElement, eventName: focusin, handler: TaggedEventHandler[focusin]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeEventListener_focusin(node: HTMLElement, eventName: focusin, handler: TaggedEventHandler[focusin], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeEventListener_focusin(
    node: HTMLElement,
    eventName: focusin,
    handler: TaggedEventHandler[focusin],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def removeEventListener_focusout(node: HTMLElement, eventName: focusout, handler: TaggedEventHandler[focusout]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeEventListener_focusout(node: HTMLElement, eventName: focusout, handler: TaggedEventHandler[focusout], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeEventListener_focusout(
    node: HTMLElement,
    eventName: focusout,
    handler: TaggedEventHandler[focusout],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def removeEventListener_fullscreenchange(node: HTMLElement, eventName: fullscreenchange, handler: TaggedEventHandler[fullscreenchange]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeEventListener_fullscreenchange(
    node: HTMLElement,
    eventName: fullscreenchange,
    handler: TaggedEventHandler[fullscreenchange],
    options: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeEventListener_fullscreenchange(
    node: HTMLElement,
    eventName: fullscreenchange,
    handler: TaggedEventHandler[fullscreenchange],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def removeEventListener_fullscreenerror(node: HTMLElement, eventName: fullscreenerror, handler: TaggedEventHandler[fullscreenerror]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeEventListener_fullscreenerror(
    node: HTMLElement,
    eventName: fullscreenerror,
    handler: TaggedEventHandler[fullscreenerror],
    options: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeEventListener_fullscreenerror(
    node: HTMLElement,
    eventName: fullscreenerror,
    handler: TaggedEventHandler[fullscreenerror],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def removeEventListener_gotpointercapture(node: HTMLElement, eventName: gotpointercapture, handler: TaggedEventHandler[gotpointercapture]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeEventListener_gotpointercapture(
    node: HTMLElement,
    eventName: gotpointercapture,
    handler: TaggedEventHandler[gotpointercapture],
    options: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeEventListener_gotpointercapture(
    node: HTMLElement,
    eventName: gotpointercapture,
    handler: TaggedEventHandler[gotpointercapture],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def removeEventListener_input(node: HTMLElement, eventName: input, handler: TaggedEventHandler[input]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeEventListener_input(node: HTMLElement, eventName: input, handler: TaggedEventHandler[input], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeEventListener_input(
    node: HTMLElement,
    eventName: input,
    handler: TaggedEventHandler[input],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def removeEventListener_invalid(node: HTMLElement, eventName: invalid, handler: TaggedEventHandler[invalid]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeEventListener_invalid(node: HTMLElement, eventName: invalid, handler: TaggedEventHandler[invalid], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeEventListener_invalid(
    node: HTMLElement,
    eventName: invalid,
    handler: TaggedEventHandler[invalid],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def removeEventListener_keydown(node: HTMLElement, eventName: keydown, handler: TaggedEventHandler[keydown]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeEventListener_keydown(node: HTMLElement, eventName: keydown, handler: TaggedEventHandler[keydown], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeEventListener_keydown(
    node: HTMLElement,
    eventName: keydown,
    handler: TaggedEventHandler[keydown],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def removeEventListener_keypress(node: HTMLElement, eventName: keypress, handler: TaggedEventHandler[keypress]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeEventListener_keypress(node: HTMLElement, eventName: keypress, handler: TaggedEventHandler[keypress], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeEventListener_keypress(
    node: HTMLElement,
    eventName: keypress,
    handler: TaggedEventHandler[keypress],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def removeEventListener_keyup(node: HTMLElement, eventName: keyup, handler: TaggedEventHandler[keyup]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeEventListener_keyup(node: HTMLElement, eventName: keyup, handler: TaggedEventHandler[keyup], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeEventListener_keyup(
    node: HTMLElement,
    eventName: keyup,
    handler: TaggedEventHandler[keyup],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def removeEventListener_load(node: HTMLElement, eventName: load, handler: TaggedEventHandler[load]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeEventListener_load(node: HTMLElement, eventName: load, handler: TaggedEventHandler[load], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeEventListener_load(
    node: HTMLElement,
    eventName: load,
    handler: TaggedEventHandler[load],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def removeEventListener_loadeddata(node: HTMLElement, eventName: loadeddata, handler: TaggedEventHandler[loadeddata]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeEventListener_loadeddata(
    node: HTMLElement,
    eventName: loadeddata,
    handler: TaggedEventHandler[loadeddata],
    options: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeEventListener_loadeddata(
    node: HTMLElement,
    eventName: loadeddata,
    handler: TaggedEventHandler[loadeddata],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def removeEventListener_loadedmetadata(node: HTMLElement, eventName: loadedmetadata, handler: TaggedEventHandler[loadedmetadata]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeEventListener_loadedmetadata(
    node: HTMLElement,
    eventName: loadedmetadata,
    handler: TaggedEventHandler[loadedmetadata],
    options: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeEventListener_loadedmetadata(
    node: HTMLElement,
    eventName: loadedmetadata,
    handler: TaggedEventHandler[loadedmetadata],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def removeEventListener_loadstart(node: HTMLElement, eventName: loadstart, handler: TaggedEventHandler[loadstart]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeEventListener_loadstart(node: HTMLElement, eventName: loadstart, handler: TaggedEventHandler[loadstart], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeEventListener_loadstart(
    node: HTMLElement,
    eventName: loadstart,
    handler: TaggedEventHandler[loadstart],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def removeEventListener_lostpointercapture(node: HTMLElement, eventName: lostpointercapture, handler: TaggedEventHandler[lostpointercapture]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeEventListener_lostpointercapture(
    node: HTMLElement,
    eventName: lostpointercapture,
    handler: TaggedEventHandler[lostpointercapture],
    options: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeEventListener_lostpointercapture(
    node: HTMLElement,
    eventName: lostpointercapture,
    handler: TaggedEventHandler[lostpointercapture],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def removeEventListener_mousedown(node: HTMLElement, eventName: mousedown, handler: TaggedEventHandler[mousedown]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeEventListener_mousedown(node: HTMLElement, eventName: mousedown, handler: TaggedEventHandler[mousedown], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeEventListener_mousedown(
    node: HTMLElement,
    eventName: mousedown,
    handler: TaggedEventHandler[mousedown],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def removeEventListener_mouseenter(node: HTMLElement, eventName: mouseenter, handler: TaggedEventHandler[mouseenter]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeEventListener_mouseenter(
    node: HTMLElement,
    eventName: mouseenter,
    handler: TaggedEventHandler[mouseenter],
    options: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeEventListener_mouseenter(
    node: HTMLElement,
    eventName: mouseenter,
    handler: TaggedEventHandler[mouseenter],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def removeEventListener_mouseleave(node: HTMLElement, eventName: mouseleave, handler: TaggedEventHandler[mouseleave]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeEventListener_mouseleave(
    node: HTMLElement,
    eventName: mouseleave,
    handler: TaggedEventHandler[mouseleave],
    options: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeEventListener_mouseleave(
    node: HTMLElement,
    eventName: mouseleave,
    handler: TaggedEventHandler[mouseleave],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def removeEventListener_mousemove(node: HTMLElement, eventName: mousemove, handler: TaggedEventHandler[mousemove]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeEventListener_mousemove(node: HTMLElement, eventName: mousemove, handler: TaggedEventHandler[mousemove], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeEventListener_mousemove(
    node: HTMLElement,
    eventName: mousemove,
    handler: TaggedEventHandler[mousemove],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def removeEventListener_mouseout(node: HTMLElement, eventName: mouseout, handler: TaggedEventHandler[mouseout]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeEventListener_mouseout(node: HTMLElement, eventName: mouseout, handler: TaggedEventHandler[mouseout], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeEventListener_mouseout(
    node: HTMLElement,
    eventName: mouseout,
    handler: TaggedEventHandler[mouseout],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def removeEventListener_mouseover(node: HTMLElement, eventName: mouseover, handler: TaggedEventHandler[mouseover]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeEventListener_mouseover(node: HTMLElement, eventName: mouseover, handler: TaggedEventHandler[mouseover], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeEventListener_mouseover(
    node: HTMLElement,
    eventName: mouseover,
    handler: TaggedEventHandler[mouseover],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def removeEventListener_mouseup(node: HTMLElement, eventName: mouseup, handler: TaggedEventHandler[mouseup]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeEventListener_mouseup(node: HTMLElement, eventName: mouseup, handler: TaggedEventHandler[mouseup], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeEventListener_mouseup(
    node: HTMLElement,
    eventName: mouseup,
    handler: TaggedEventHandler[mouseup],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def removeEventListener_paste(node: HTMLElement, eventName: paste, handler: TaggedEventHandler[paste]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeEventListener_paste(node: HTMLElement, eventName: paste, handler: TaggedEventHandler[paste], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeEventListener_paste(
    node: HTMLElement,
    eventName: paste,
    handler: TaggedEventHandler[paste],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def removeEventListener_pause(node: HTMLElement, eventName: pause, handler: TaggedEventHandler[pause]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeEventListener_pause(node: HTMLElement, eventName: pause, handler: TaggedEventHandler[pause], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeEventListener_pause(
    node: HTMLElement,
    eventName: pause,
    handler: TaggedEventHandler[pause],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def removeEventListener_play(node: HTMLElement, eventName: play, handler: TaggedEventHandler[play]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeEventListener_play(node: HTMLElement, eventName: play, handler: TaggedEventHandler[play], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeEventListener_play(
    node: HTMLElement,
    eventName: play,
    handler: TaggedEventHandler[play],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def removeEventListener_playing(node: HTMLElement, eventName: playing, handler: TaggedEventHandler[playing]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeEventListener_playing(node: HTMLElement, eventName: playing, handler: TaggedEventHandler[playing], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeEventListener_playing(
    node: HTMLElement,
    eventName: playing,
    handler: TaggedEventHandler[playing],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def removeEventListener_pointercancel(node: HTMLElement, eventName: pointercancel, handler: TaggedEventHandler[pointercancel]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeEventListener_pointercancel(
    node: HTMLElement,
    eventName: pointercancel,
    handler: TaggedEventHandler[pointercancel],
    options: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeEventListener_pointercancel(
    node: HTMLElement,
    eventName: pointercancel,
    handler: TaggedEventHandler[pointercancel],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def removeEventListener_pointerdown(node: HTMLElement, eventName: pointerdown, handler: TaggedEventHandler[pointerdown]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeEventListener_pointerdown(
    node: HTMLElement,
    eventName: pointerdown,
    handler: TaggedEventHandler[pointerdown],
    options: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeEventListener_pointerdown(
    node: HTMLElement,
    eventName: pointerdown,
    handler: TaggedEventHandler[pointerdown],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def removeEventListener_pointerenter(node: HTMLElement, eventName: pointerenter, handler: TaggedEventHandler[pointerenter]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeEventListener_pointerenter(
    node: HTMLElement,
    eventName: pointerenter,
    handler: TaggedEventHandler[pointerenter],
    options: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeEventListener_pointerenter(
    node: HTMLElement,
    eventName: pointerenter,
    handler: TaggedEventHandler[pointerenter],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def removeEventListener_pointerleave(node: HTMLElement, eventName: pointerleave, handler: TaggedEventHandler[pointerleave]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeEventListener_pointerleave(
    node: HTMLElement,
    eventName: pointerleave,
    handler: TaggedEventHandler[pointerleave],
    options: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeEventListener_pointerleave(
    node: HTMLElement,
    eventName: pointerleave,
    handler: TaggedEventHandler[pointerleave],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def removeEventListener_pointermove(node: HTMLElement, eventName: pointermove, handler: TaggedEventHandler[pointermove]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeEventListener_pointermove(
    node: HTMLElement,
    eventName: pointermove,
    handler: TaggedEventHandler[pointermove],
    options: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeEventListener_pointermove(
    node: HTMLElement,
    eventName: pointermove,
    handler: TaggedEventHandler[pointermove],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def removeEventListener_pointerout(node: HTMLElement, eventName: pointerout, handler: TaggedEventHandler[pointerout]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeEventListener_pointerout(
    node: HTMLElement,
    eventName: pointerout,
    handler: TaggedEventHandler[pointerout],
    options: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeEventListener_pointerout(
    node: HTMLElement,
    eventName: pointerout,
    handler: TaggedEventHandler[pointerout],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def removeEventListener_pointerover(node: HTMLElement, eventName: pointerover, handler: TaggedEventHandler[pointerover]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeEventListener_pointerover(
    node: HTMLElement,
    eventName: pointerover,
    handler: TaggedEventHandler[pointerover],
    options: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeEventListener_pointerover(
    node: HTMLElement,
    eventName: pointerover,
    handler: TaggedEventHandler[pointerover],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def removeEventListener_pointerup(node: HTMLElement, eventName: pointerup, handler: TaggedEventHandler[pointerup]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeEventListener_pointerup(node: HTMLElement, eventName: pointerup, handler: TaggedEventHandler[pointerup], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeEventListener_pointerup(
    node: HTMLElement,
    eventName: pointerup,
    handler: TaggedEventHandler[pointerup],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def removeEventListener_progress(node: HTMLElement, eventName: progress, handler: TaggedEventHandler[progress]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeEventListener_progress(node: HTMLElement, eventName: progress, handler: TaggedEventHandler[progress], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeEventListener_progress(
    node: HTMLElement,
    eventName: progress,
    handler: TaggedEventHandler[progress],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def removeEventListener_ratechange(node: HTMLElement, eventName: ratechange, handler: TaggedEventHandler[ratechange]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeEventListener_ratechange(
    node: HTMLElement,
    eventName: ratechange,
    handler: TaggedEventHandler[ratechange],
    options: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeEventListener_ratechange(
    node: HTMLElement,
    eventName: ratechange,
    handler: TaggedEventHandler[ratechange],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def removeEventListener_reset(node: HTMLElement, eventName: reset, handler: TaggedEventHandler[reset]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeEventListener_reset(node: HTMLElement, eventName: reset, handler: TaggedEventHandler[reset], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeEventListener_reset(
    node: HTMLElement,
    eventName: reset,
    handler: TaggedEventHandler[reset],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def removeEventListener_resize(node: HTMLElement, eventName: resize, handler: TaggedEventHandler[resize]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeEventListener_resize(node: HTMLElement, eventName: resize, handler: TaggedEventHandler[resize], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeEventListener_resize(
    node: HTMLElement,
    eventName: resize,
    handler: TaggedEventHandler[resize],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def removeEventListener_scroll(node: HTMLElement, eventName: scroll, handler: TaggedEventHandler[scroll]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeEventListener_scroll(node: HTMLElement, eventName: scroll, handler: TaggedEventHandler[scroll], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeEventListener_scroll(
    node: HTMLElement,
    eventName: scroll,
    handler: TaggedEventHandler[scroll],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def removeEventListener_securitypolicyviolation(
    node: HTMLElement,
    eventName: securitypolicyviolation,
    handler: TaggedEventHandler[securitypolicyviolation]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeEventListener_securitypolicyviolation(
    node: HTMLElement,
    eventName: securitypolicyviolation,
    handler: TaggedEventHandler[securitypolicyviolation],
    options: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeEventListener_securitypolicyviolation(
    node: HTMLElement,
    eventName: securitypolicyviolation,
    handler: TaggedEventHandler[securitypolicyviolation],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def removeEventListener_seeked(node: HTMLElement, eventName: seeked, handler: TaggedEventHandler[seeked]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeEventListener_seeked(node: HTMLElement, eventName: seeked, handler: TaggedEventHandler[seeked], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeEventListener_seeked(
    node: HTMLElement,
    eventName: seeked,
    handler: TaggedEventHandler[seeked],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def removeEventListener_seeking(node: HTMLElement, eventName: seeking, handler: TaggedEventHandler[seeking]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeEventListener_seeking(node: HTMLElement, eventName: seeking, handler: TaggedEventHandler[seeking], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeEventListener_seeking(
    node: HTMLElement,
    eventName: seeking,
    handler: TaggedEventHandler[seeking],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def removeEventListener_select(node: HTMLElement, eventName: select, handler: TaggedEventHandler[select]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeEventListener_select(node: HTMLElement, eventName: select, handler: TaggedEventHandler[select], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeEventListener_select(
    node: HTMLElement,
    eventName: select,
    handler: TaggedEventHandler[select],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def removeEventListener_selectionchange(node: HTMLElement, eventName: selectionchange, handler: TaggedEventHandler[selectionchange]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeEventListener_selectionchange(
    node: HTMLElement,
    eventName: selectionchange,
    handler: TaggedEventHandler[selectionchange],
    options: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeEventListener_selectionchange(
    node: HTMLElement,
    eventName: selectionchange,
    handler: TaggedEventHandler[selectionchange],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def removeEventListener_selectstart(node: HTMLElement, eventName: selectstart, handler: TaggedEventHandler[selectstart]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeEventListener_selectstart(
    node: HTMLElement,
    eventName: selectstart,
    handler: TaggedEventHandler[selectstart],
    options: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeEventListener_selectstart(
    node: HTMLElement,
    eventName: selectstart,
    handler: TaggedEventHandler[selectstart],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def removeEventListener_stalled(node: HTMLElement, eventName: stalled, handler: TaggedEventHandler[stalled]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeEventListener_stalled(node: HTMLElement, eventName: stalled, handler: TaggedEventHandler[stalled], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeEventListener_stalled(
    node: HTMLElement,
    eventName: stalled,
    handler: TaggedEventHandler[stalled],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def removeEventListener_submit(node: HTMLElement, eventName: submit, handler: TaggedEventHandler[submit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeEventListener_submit(node: HTMLElement, eventName: submit, handler: TaggedEventHandler[submit], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeEventListener_submit(
    node: HTMLElement,
    eventName: submit,
    handler: TaggedEventHandler[submit],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def removeEventListener_suspend(node: HTMLElement, eventName: suspend, handler: TaggedEventHandler[suspend]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeEventListener_suspend(node: HTMLElement, eventName: suspend, handler: TaggedEventHandler[suspend], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeEventListener_suspend(
    node: HTMLElement,
    eventName: suspend,
    handler: TaggedEventHandler[suspend],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def removeEventListener_timeupdate(node: HTMLElement, eventName: timeupdate, handler: TaggedEventHandler[timeupdate]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeEventListener_timeupdate(
    node: HTMLElement,
    eventName: timeupdate,
    handler: TaggedEventHandler[timeupdate],
    options: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeEventListener_timeupdate(
    node: HTMLElement,
    eventName: timeupdate,
    handler: TaggedEventHandler[timeupdate],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def removeEventListener_toggle(node: HTMLElement, eventName: toggle, handler: TaggedEventHandler[toggle]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeEventListener_toggle(node: HTMLElement, eventName: toggle, handler: TaggedEventHandler[toggle], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeEventListener_toggle(
    node: HTMLElement,
    eventName: toggle,
    handler: TaggedEventHandler[toggle],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def removeEventListener_touchcancel(node: HTMLElement, eventName: touchcancel, handler: TaggedEventHandler[touchcancel]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeEventListener_touchcancel(
    node: HTMLElement,
    eventName: touchcancel,
    handler: TaggedEventHandler[touchcancel],
    options: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeEventListener_touchcancel(
    node: HTMLElement,
    eventName: touchcancel,
    handler: TaggedEventHandler[touchcancel],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def removeEventListener_touchend(node: HTMLElement, eventName: touchend, handler: TaggedEventHandler[touchend]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeEventListener_touchend(node: HTMLElement, eventName: touchend, handler: TaggedEventHandler[touchend], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeEventListener_touchend(
    node: HTMLElement,
    eventName: touchend,
    handler: TaggedEventHandler[touchend],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def removeEventListener_touchmove(node: HTMLElement, eventName: touchmove, handler: TaggedEventHandler[touchmove]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeEventListener_touchmove(node: HTMLElement, eventName: touchmove, handler: TaggedEventHandler[touchmove], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeEventListener_touchmove(
    node: HTMLElement,
    eventName: touchmove,
    handler: TaggedEventHandler[touchmove],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def removeEventListener_touchstart(node: HTMLElement, eventName: touchstart, handler: TaggedEventHandler[touchstart]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeEventListener_touchstart(
    node: HTMLElement,
    eventName: touchstart,
    handler: TaggedEventHandler[touchstart],
    options: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeEventListener_touchstart(
    node: HTMLElement,
    eventName: touchstart,
    handler: TaggedEventHandler[touchstart],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def removeEventListener_transitioncancel(node: HTMLElement, eventName: transitioncancel, handler: TaggedEventHandler[transitioncancel]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeEventListener_transitioncancel(
    node: HTMLElement,
    eventName: transitioncancel,
    handler: TaggedEventHandler[transitioncancel],
    options: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeEventListener_transitioncancel(
    node: HTMLElement,
    eventName: transitioncancel,
    handler: TaggedEventHandler[transitioncancel],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def removeEventListener_transitionend(node: HTMLElement, eventName: transitionend, handler: TaggedEventHandler[transitionend]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeEventListener_transitionend(
    node: HTMLElement,
    eventName: transitionend,
    handler: TaggedEventHandler[transitionend],
    options: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeEventListener_transitionend(
    node: HTMLElement,
    eventName: transitionend,
    handler: TaggedEventHandler[transitionend],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def removeEventListener_transitionrun(node: HTMLElement, eventName: transitionrun, handler: TaggedEventHandler[transitionrun]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeEventListener_transitionrun(
    node: HTMLElement,
    eventName: transitionrun,
    handler: TaggedEventHandler[transitionrun],
    options: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeEventListener_transitionrun(
    node: HTMLElement,
    eventName: transitionrun,
    handler: TaggedEventHandler[transitionrun],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def removeEventListener_transitionstart(node: HTMLElement, eventName: transitionstart, handler: TaggedEventHandler[transitionstart]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeEventListener_transitionstart(
    node: HTMLElement,
    eventName: transitionstart,
    handler: TaggedEventHandler[transitionstart],
    options: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeEventListener_transitionstart(
    node: HTMLElement,
    eventName: transitionstart,
    handler: TaggedEventHandler[transitionstart],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def removeEventListener_volumechange(node: HTMLElement, eventName: volumechange, handler: TaggedEventHandler[volumechange]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeEventListener_volumechange(
    node: HTMLElement,
    eventName: volumechange,
    handler: TaggedEventHandler[volumechange],
    options: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeEventListener_volumechange(
    node: HTMLElement,
    eventName: volumechange,
    handler: TaggedEventHandler[volumechange],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def removeEventListener_waiting(node: HTMLElement, eventName: waiting, handler: TaggedEventHandler[waiting]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeEventListener_waiting(node: HTMLElement, eventName: waiting, handler: TaggedEventHandler[waiting], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeEventListener_waiting(
    node: HTMLElement,
    eventName: waiting,
    handler: TaggedEventHandler[waiting],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def removeEventListener_wheel(node: HTMLElement, eventName: wheel, handler: TaggedEventHandler[wheel]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeEventListener_wheel(node: HTMLElement, eventName: wheel, handler: TaggedEventHandler[wheel], options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeEventListener_wheel(
    node: HTMLElement,
    eventName: wheel,
    handler: TaggedEventHandler[wheel],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("dom-helpers", "requestAnimationFrame")
  @js.native
  val requestAnimationFrame: js.Function1[/* callback */ FrameRequestCallback, Double] = js.native
  
  inline def scrollLeft(node: Element): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("scrollLeft")(node.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def scrollLeft(node: Element, `val`: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("scrollLeft")(node.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def scrollParent(element: HTMLElement): Document | HTMLElement = ^.asInstanceOf[js.Dynamic].applyDynamic("scrollParent")(element.asInstanceOf[js.Any]).asInstanceOf[Document | HTMLElement]
  inline def scrollParent(element: HTMLElement, firstPossible: Boolean): Document | HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("scrollParent")(element.asInstanceOf[js.Any], firstPossible.asInstanceOf[js.Any])).asInstanceOf[Document | HTMLElement]
  
  inline def scrollTo(selected: HTMLElement): js.UndefOr[js.Function0[Unit]] = ^.asInstanceOf[js.Dynamic].applyDynamic("scrollTo")(selected.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[js.Function0[Unit]]]
  inline def scrollTo(selected: HTMLElement, scrollParent: HTMLElement): js.UndefOr[js.Function0[Unit]] = (^.asInstanceOf[js.Dynamic].applyDynamic("scrollTo")(selected.asInstanceOf[js.Any], scrollParent.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Function0[Unit]]]
  
  inline def scrollTop(node: Element): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("scrollTop")(node.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def scrollTop(node: Element, `val`: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("scrollTop")(node.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def scrollbarSize(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("scrollbarSize")().asInstanceOf[Double]
  inline def scrollbarSize(recalc: Boolean): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("scrollbarSize")(recalc.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def style(node: HTMLElement, property: PartialRecordPropertystri): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("style")(node.asInstanceOf[js.Any], property.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def style[T /* <: HyphenProperty */](node: HTMLElement, property: T): /* import warning: importer.ImportType#apply Failed type conversion: csstype.csstype.PropertiesHyphen<string | 0>[T] */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("style")(node.asInstanceOf[js.Any], property.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: csstype.csstype.PropertiesHyphen<string | 0>[T] */ js.Any]
  
  inline def style_T_CamelProperty[T /* <: CamelProperty */](node: HTMLElement, property: T): /* import warning: importer.ImportType#apply Failed type conversion: csstype.csstype.Properties<string | 0>[T] */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("style")(node.asInstanceOf[js.Any], property.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: csstype.csstype.Properties<string | 0>[T] */ js.Any]
  
  inline def toggleClass(element: Element, className: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("toggleClass")(element.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def toggleClass(element: SVGElement, className: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("toggleClass")(element.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def transitionEnd(element: HTMLElement, handler: Listener): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("transitionEnd")(element.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def transitionEnd(element: HTMLElement, handler: Listener, duration: Double): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("transitionEnd")(element.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], duration.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def transitionEnd(element: HTMLElement, handler: Listener, duration: Double, padding: Double): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("transitionEnd")(element.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], padding.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def transitionEnd(element: HTMLElement, handler: Listener, duration: Null, padding: Double): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("transitionEnd")(element.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], padding.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def transitionEnd(element: HTMLElement, handler: Listener, duration: Unit, padding: Double): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("transitionEnd")(element.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], padding.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  
  inline def width(node: HTMLElement): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("width")(node.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def width(node: HTMLElement, client: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("width")(node.asInstanceOf[js.Any], client.asInstanceOf[js.Any])).asInstanceOf[Double]
}
