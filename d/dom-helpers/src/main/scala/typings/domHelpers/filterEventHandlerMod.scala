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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object filterEventHandlerMod {
  
  @JSImport("dom-helpers/cjs/filterEventHandler", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default_abort(selector: String, handler: EventHandler[abort]): EventHandler[abort] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[abort]]
  
  inline def default_animationcancel(selector: String, handler: EventHandler[animationcancel]): EventHandler[animationcancel] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[animationcancel]]
  
  inline def default_animationend(selector: String, handler: EventHandler[animationend]): EventHandler[animationend] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[animationend]]
  
  inline def default_animationiteration(selector: String, handler: EventHandler[animationiteration]): EventHandler[animationiteration] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[animationiteration]]
  
  inline def default_animationstart(selector: String, handler: EventHandler[animationstart]): EventHandler[animationstart] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[animationstart]]
  
  inline def default_auxclick(selector: String, handler: EventHandler[auxclick]): EventHandler[auxclick] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[auxclick]]
  
  inline def default_blur(selector: String, handler: EventHandler[blur]): EventHandler[blur] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[blur]]
  
  inline def default_cancel(selector: String, handler: EventHandler[cancel]): EventHandler[cancel] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[cancel]]
  
  inline def default_canplay(selector: String, handler: EventHandler[canplay]): EventHandler[canplay] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[canplay]]
  
  inline def default_canplaythrough(selector: String, handler: EventHandler[canplaythrough]): EventHandler[canplaythrough] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[canplaythrough]]
  
  inline def default_change(selector: String, handler: EventHandler[change]): EventHandler[change] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[change]]
  
  inline def default_click(selector: String, handler: EventHandler[click]): EventHandler[click] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[click]]
  
  inline def default_close(selector: String, handler: EventHandler[close]): EventHandler[close] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[close]]
  
  inline def default_contextmenu(selector: String, handler: EventHandler[contextmenu]): EventHandler[contextmenu] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[contextmenu]]
  
  inline def default_copy(selector: String, handler: EventHandler[copy]): EventHandler[copy] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[copy]]
  
  inline def default_cuechange(selector: String, handler: EventHandler[cuechange]): EventHandler[cuechange] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[cuechange]]
  
  inline def default_cut(selector: String, handler: EventHandler[cut]): EventHandler[cut] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[cut]]
  
  inline def default_dblclick(selector: String, handler: EventHandler[dblclick]): EventHandler[dblclick] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[dblclick]]
  
  inline def default_drag(selector: String, handler: EventHandler[drag]): EventHandler[drag] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[drag]]
  
  inline def default_dragend(selector: String, handler: EventHandler[dragend]): EventHandler[dragend] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[dragend]]
  
  inline def default_dragenter(selector: String, handler: EventHandler[dragenter]): EventHandler[dragenter] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[dragenter]]
  
  inline def default_dragexit(selector: String, handler: EventHandler[dragexit]): EventHandler[dragexit] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[dragexit]]
  
  inline def default_dragleave(selector: String, handler: EventHandler[dragleave]): EventHandler[dragleave] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[dragleave]]
  
  inline def default_dragover(selector: String, handler: EventHandler[dragover]): EventHandler[dragover] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[dragover]]
  
  inline def default_dragstart(selector: String, handler: EventHandler[dragstart]): EventHandler[dragstart] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[dragstart]]
  
  inline def default_drop(selector: String, handler: EventHandler[drop]): EventHandler[drop] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[drop]]
  
  inline def default_durationchange(selector: String, handler: EventHandler[durationchange]): EventHandler[durationchange] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[durationchange]]
  
  inline def default_emptied(selector: String, handler: EventHandler[emptied]): EventHandler[emptied] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[emptied]]
  
  inline def default_ended(selector: String, handler: EventHandler[ended]): EventHandler[ended] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[ended]]
  
  inline def default_error(selector: String, handler: EventHandler[error]): EventHandler[error] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[error]]
  
  inline def default_focus(selector: String, handler: EventHandler[focus]): EventHandler[focus] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[focus]]
  
  inline def default_focusin(selector: String, handler: EventHandler[focusin]): EventHandler[focusin] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[focusin]]
  
  inline def default_focusout(selector: String, handler: EventHandler[focusout]): EventHandler[focusout] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[focusout]]
  
  inline def default_fullscreenchange(selector: String, handler: EventHandler[fullscreenchange]): EventHandler[fullscreenchange] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[fullscreenchange]]
  
  inline def default_fullscreenerror(selector: String, handler: EventHandler[fullscreenerror]): EventHandler[fullscreenerror] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[fullscreenerror]]
  
  inline def default_gotpointercapture(selector: String, handler: EventHandler[gotpointercapture]): EventHandler[gotpointercapture] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[gotpointercapture]]
  
  inline def default_input(selector: String, handler: EventHandler[input]): EventHandler[input] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[input]]
  
  inline def default_invalid(selector: String, handler: EventHandler[invalid]): EventHandler[invalid] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[invalid]]
  
  inline def default_keydown(selector: String, handler: EventHandler[keydown]): EventHandler[keydown] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[keydown]]
  
  inline def default_keypress(selector: String, handler: EventHandler[keypress]): EventHandler[keypress] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[keypress]]
  
  inline def default_keyup(selector: String, handler: EventHandler[keyup]): EventHandler[keyup] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[keyup]]
  
  inline def default_load(selector: String, handler: EventHandler[load]): EventHandler[load] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[load]]
  
  inline def default_loadeddata(selector: String, handler: EventHandler[loadeddata]): EventHandler[loadeddata] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[loadeddata]]
  
  inline def default_loadedmetadata(selector: String, handler: EventHandler[loadedmetadata]): EventHandler[loadedmetadata] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[loadedmetadata]]
  
  inline def default_loadstart(selector: String, handler: EventHandler[loadstart]): EventHandler[loadstart] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[loadstart]]
  
  inline def default_lostpointercapture(selector: String, handler: EventHandler[lostpointercapture]): EventHandler[lostpointercapture] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[lostpointercapture]]
  
  inline def default_mousedown(selector: String, handler: EventHandler[mousedown]): EventHandler[mousedown] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[mousedown]]
  
  inline def default_mouseenter(selector: String, handler: EventHandler[mouseenter]): EventHandler[mouseenter] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[mouseenter]]
  
  inline def default_mouseleave(selector: String, handler: EventHandler[mouseleave]): EventHandler[mouseleave] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[mouseleave]]
  
  inline def default_mousemove(selector: String, handler: EventHandler[mousemove]): EventHandler[mousemove] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[mousemove]]
  
  inline def default_mouseout(selector: String, handler: EventHandler[mouseout]): EventHandler[mouseout] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[mouseout]]
  
  inline def default_mouseover(selector: String, handler: EventHandler[mouseover]): EventHandler[mouseover] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[mouseover]]
  
  inline def default_mouseup(selector: String, handler: EventHandler[mouseup]): EventHandler[mouseup] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[mouseup]]
  
  inline def default_paste(selector: String, handler: EventHandler[paste]): EventHandler[paste] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[paste]]
  
  inline def default_pause(selector: String, handler: EventHandler[pause]): EventHandler[pause] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[pause]]
  
  inline def default_play(selector: String, handler: EventHandler[play]): EventHandler[play] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[play]]
  
  inline def default_playing(selector: String, handler: EventHandler[playing]): EventHandler[playing] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[playing]]
  
  inline def default_pointercancel(selector: String, handler: EventHandler[pointercancel]): EventHandler[pointercancel] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[pointercancel]]
  
  inline def default_pointerdown(selector: String, handler: EventHandler[pointerdown]): EventHandler[pointerdown] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[pointerdown]]
  
  inline def default_pointerenter(selector: String, handler: EventHandler[pointerenter]): EventHandler[pointerenter] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[pointerenter]]
  
  inline def default_pointerleave(selector: String, handler: EventHandler[pointerleave]): EventHandler[pointerleave] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[pointerleave]]
  
  inline def default_pointermove(selector: String, handler: EventHandler[pointermove]): EventHandler[pointermove] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[pointermove]]
  
  inline def default_pointerout(selector: String, handler: EventHandler[pointerout]): EventHandler[pointerout] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[pointerout]]
  
  inline def default_pointerover(selector: String, handler: EventHandler[pointerover]): EventHandler[pointerover] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[pointerover]]
  
  inline def default_pointerup(selector: String, handler: EventHandler[pointerup]): EventHandler[pointerup] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[pointerup]]
  
  inline def default_progress(selector: String, handler: EventHandler[progress]): EventHandler[progress] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[progress]]
  
  inline def default_ratechange(selector: String, handler: EventHandler[ratechange]): EventHandler[ratechange] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[ratechange]]
  
  inline def default_reset(selector: String, handler: EventHandler[reset]): EventHandler[reset] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[reset]]
  
  inline def default_resize(selector: String, handler: EventHandler[resize]): EventHandler[resize] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[resize]]
  
  inline def default_scroll(selector: String, handler: EventHandler[scroll]): EventHandler[scroll] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[scroll]]
  
  inline def default_securitypolicyviolation(selector: String, handler: EventHandler[securitypolicyviolation]): EventHandler[securitypolicyviolation] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[securitypolicyviolation]]
  
  inline def default_seeked(selector: String, handler: EventHandler[seeked]): EventHandler[seeked] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[seeked]]
  
  inline def default_seeking(selector: String, handler: EventHandler[seeking]): EventHandler[seeking] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[seeking]]
  
  inline def default_select(selector: String, handler: EventHandler[select]): EventHandler[select] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[select]]
  
  inline def default_selectionchange(selector: String, handler: EventHandler[selectionchange]): EventHandler[selectionchange] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[selectionchange]]
  
  inline def default_selectstart(selector: String, handler: EventHandler[selectstart]): EventHandler[selectstart] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[selectstart]]
  
  inline def default_stalled(selector: String, handler: EventHandler[stalled]): EventHandler[stalled] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[stalled]]
  
  inline def default_submit(selector: String, handler: EventHandler[submit]): EventHandler[submit] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[submit]]
  
  inline def default_suspend(selector: String, handler: EventHandler[suspend]): EventHandler[suspend] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[suspend]]
  
  inline def default_timeupdate(selector: String, handler: EventHandler[timeupdate]): EventHandler[timeupdate] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[timeupdate]]
  
  inline def default_toggle(selector: String, handler: EventHandler[toggle]): EventHandler[toggle] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[toggle]]
  
  inline def default_touchcancel(selector: String, handler: EventHandler[touchcancel]): EventHandler[touchcancel] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[touchcancel]]
  
  inline def default_touchend(selector: String, handler: EventHandler[touchend]): EventHandler[touchend] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[touchend]]
  
  inline def default_touchmove(selector: String, handler: EventHandler[touchmove]): EventHandler[touchmove] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[touchmove]]
  
  inline def default_touchstart(selector: String, handler: EventHandler[touchstart]): EventHandler[touchstart] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[touchstart]]
  
  inline def default_transitioncancel(selector: String, handler: EventHandler[transitioncancel]): EventHandler[transitioncancel] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[transitioncancel]]
  
  inline def default_transitionend(selector: String, handler: EventHandler[transitionend]): EventHandler[transitionend] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[transitionend]]
  
  inline def default_transitionrun(selector: String, handler: EventHandler[transitionrun]): EventHandler[transitionrun] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[transitionrun]]
  
  inline def default_transitionstart(selector: String, handler: EventHandler[transitionstart]): EventHandler[transitionstart] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[transitionstart]]
  
  inline def default_volumechange(selector: String, handler: EventHandler[volumechange]): EventHandler[volumechange] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[volumechange]]
  
  inline def default_waiting(selector: String, handler: EventHandler[waiting]): EventHandler[waiting] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[waiting]]
  
  inline def default_wheel(selector: String, handler: EventHandler[wheel]): EventHandler[wheel] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[wheel]]
}
