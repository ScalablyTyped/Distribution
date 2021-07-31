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
  
  @scala.inline
  def default_abort(selector: String, handler: EventHandler[abort]): EventHandler[abort] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[abort]]
  
  @scala.inline
  def default_animationcancel(selector: String, handler: EventHandler[animationcancel]): EventHandler[animationcancel] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[animationcancel]]
  
  @scala.inline
  def default_animationend(selector: String, handler: EventHandler[animationend]): EventHandler[animationend] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[animationend]]
  
  @scala.inline
  def default_animationiteration(selector: String, handler: EventHandler[animationiteration]): EventHandler[animationiteration] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[animationiteration]]
  
  @scala.inline
  def default_animationstart(selector: String, handler: EventHandler[animationstart]): EventHandler[animationstart] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[animationstart]]
  
  @scala.inline
  def default_auxclick(selector: String, handler: EventHandler[auxclick]): EventHandler[auxclick] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[auxclick]]
  
  @scala.inline
  def default_blur(selector: String, handler: EventHandler[blur]): EventHandler[blur] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[blur]]
  
  @scala.inline
  def default_cancel(selector: String, handler: EventHandler[cancel]): EventHandler[cancel] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[cancel]]
  
  @scala.inline
  def default_canplay(selector: String, handler: EventHandler[canplay]): EventHandler[canplay] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[canplay]]
  
  @scala.inline
  def default_canplaythrough(selector: String, handler: EventHandler[canplaythrough]): EventHandler[canplaythrough] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[canplaythrough]]
  
  @scala.inline
  def default_change(selector: String, handler: EventHandler[change]): EventHandler[change] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[change]]
  
  @scala.inline
  def default_click(selector: String, handler: EventHandler[click]): EventHandler[click] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[click]]
  
  @scala.inline
  def default_close(selector: String, handler: EventHandler[close]): EventHandler[close] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[close]]
  
  @scala.inline
  def default_contextmenu(selector: String, handler: EventHandler[contextmenu]): EventHandler[contextmenu] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[contextmenu]]
  
  @scala.inline
  def default_copy(selector: String, handler: EventHandler[copy]): EventHandler[copy] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[copy]]
  
  @scala.inline
  def default_cuechange(selector: String, handler: EventHandler[cuechange]): EventHandler[cuechange] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[cuechange]]
  
  @scala.inline
  def default_cut(selector: String, handler: EventHandler[cut]): EventHandler[cut] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[cut]]
  
  @scala.inline
  def default_dblclick(selector: String, handler: EventHandler[dblclick]): EventHandler[dblclick] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[dblclick]]
  
  @scala.inline
  def default_drag(selector: String, handler: EventHandler[drag]): EventHandler[drag] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[drag]]
  
  @scala.inline
  def default_dragend(selector: String, handler: EventHandler[dragend]): EventHandler[dragend] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[dragend]]
  
  @scala.inline
  def default_dragenter(selector: String, handler: EventHandler[dragenter]): EventHandler[dragenter] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[dragenter]]
  
  @scala.inline
  def default_dragexit(selector: String, handler: EventHandler[dragexit]): EventHandler[dragexit] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[dragexit]]
  
  @scala.inline
  def default_dragleave(selector: String, handler: EventHandler[dragleave]): EventHandler[dragleave] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[dragleave]]
  
  @scala.inline
  def default_dragover(selector: String, handler: EventHandler[dragover]): EventHandler[dragover] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[dragover]]
  
  @scala.inline
  def default_dragstart(selector: String, handler: EventHandler[dragstart]): EventHandler[dragstart] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[dragstart]]
  
  @scala.inline
  def default_drop(selector: String, handler: EventHandler[drop]): EventHandler[drop] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[drop]]
  
  @scala.inline
  def default_durationchange(selector: String, handler: EventHandler[durationchange]): EventHandler[durationchange] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[durationchange]]
  
  @scala.inline
  def default_emptied(selector: String, handler: EventHandler[emptied]): EventHandler[emptied] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[emptied]]
  
  @scala.inline
  def default_ended(selector: String, handler: EventHandler[ended]): EventHandler[ended] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[ended]]
  
  @scala.inline
  def default_error(selector: String, handler: EventHandler[error]): EventHandler[error] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[error]]
  
  @scala.inline
  def default_focus(selector: String, handler: EventHandler[focus]): EventHandler[focus] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[focus]]
  
  @scala.inline
  def default_focusin(selector: String, handler: EventHandler[focusin]): EventHandler[focusin] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[focusin]]
  
  @scala.inline
  def default_focusout(selector: String, handler: EventHandler[focusout]): EventHandler[focusout] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[focusout]]
  
  @scala.inline
  def default_fullscreenchange(selector: String, handler: EventHandler[fullscreenchange]): EventHandler[fullscreenchange] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[fullscreenchange]]
  
  @scala.inline
  def default_fullscreenerror(selector: String, handler: EventHandler[fullscreenerror]): EventHandler[fullscreenerror] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[fullscreenerror]]
  
  @scala.inline
  def default_gotpointercapture(selector: String, handler: EventHandler[gotpointercapture]): EventHandler[gotpointercapture] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[gotpointercapture]]
  
  @scala.inline
  def default_input(selector: String, handler: EventHandler[input]): EventHandler[input] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[input]]
  
  @scala.inline
  def default_invalid(selector: String, handler: EventHandler[invalid]): EventHandler[invalid] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[invalid]]
  
  @scala.inline
  def default_keydown(selector: String, handler: EventHandler[keydown]): EventHandler[keydown] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[keydown]]
  
  @scala.inline
  def default_keypress(selector: String, handler: EventHandler[keypress]): EventHandler[keypress] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[keypress]]
  
  @scala.inline
  def default_keyup(selector: String, handler: EventHandler[keyup]): EventHandler[keyup] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[keyup]]
  
  @scala.inline
  def default_load(selector: String, handler: EventHandler[load]): EventHandler[load] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[load]]
  
  @scala.inline
  def default_loadeddata(selector: String, handler: EventHandler[loadeddata]): EventHandler[loadeddata] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[loadeddata]]
  
  @scala.inline
  def default_loadedmetadata(selector: String, handler: EventHandler[loadedmetadata]): EventHandler[loadedmetadata] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[loadedmetadata]]
  
  @scala.inline
  def default_loadstart(selector: String, handler: EventHandler[loadstart]): EventHandler[loadstart] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[loadstart]]
  
  @scala.inline
  def default_lostpointercapture(selector: String, handler: EventHandler[lostpointercapture]): EventHandler[lostpointercapture] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[lostpointercapture]]
  
  @scala.inline
  def default_mousedown(selector: String, handler: EventHandler[mousedown]): EventHandler[mousedown] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[mousedown]]
  
  @scala.inline
  def default_mouseenter(selector: String, handler: EventHandler[mouseenter]): EventHandler[mouseenter] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[mouseenter]]
  
  @scala.inline
  def default_mouseleave(selector: String, handler: EventHandler[mouseleave]): EventHandler[mouseleave] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[mouseleave]]
  
  @scala.inline
  def default_mousemove(selector: String, handler: EventHandler[mousemove]): EventHandler[mousemove] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[mousemove]]
  
  @scala.inline
  def default_mouseout(selector: String, handler: EventHandler[mouseout]): EventHandler[mouseout] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[mouseout]]
  
  @scala.inline
  def default_mouseover(selector: String, handler: EventHandler[mouseover]): EventHandler[mouseover] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[mouseover]]
  
  @scala.inline
  def default_mouseup(selector: String, handler: EventHandler[mouseup]): EventHandler[mouseup] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[mouseup]]
  
  @scala.inline
  def default_paste(selector: String, handler: EventHandler[paste]): EventHandler[paste] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[paste]]
  
  @scala.inline
  def default_pause(selector: String, handler: EventHandler[pause]): EventHandler[pause] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[pause]]
  
  @scala.inline
  def default_play(selector: String, handler: EventHandler[play]): EventHandler[play] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[play]]
  
  @scala.inline
  def default_playing(selector: String, handler: EventHandler[playing]): EventHandler[playing] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[playing]]
  
  @scala.inline
  def default_pointercancel(selector: String, handler: EventHandler[pointercancel]): EventHandler[pointercancel] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[pointercancel]]
  
  @scala.inline
  def default_pointerdown(selector: String, handler: EventHandler[pointerdown]): EventHandler[pointerdown] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[pointerdown]]
  
  @scala.inline
  def default_pointerenter(selector: String, handler: EventHandler[pointerenter]): EventHandler[pointerenter] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[pointerenter]]
  
  @scala.inline
  def default_pointerleave(selector: String, handler: EventHandler[pointerleave]): EventHandler[pointerleave] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[pointerleave]]
  
  @scala.inline
  def default_pointermove(selector: String, handler: EventHandler[pointermove]): EventHandler[pointermove] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[pointermove]]
  
  @scala.inline
  def default_pointerout(selector: String, handler: EventHandler[pointerout]): EventHandler[pointerout] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[pointerout]]
  
  @scala.inline
  def default_pointerover(selector: String, handler: EventHandler[pointerover]): EventHandler[pointerover] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[pointerover]]
  
  @scala.inline
  def default_pointerup(selector: String, handler: EventHandler[pointerup]): EventHandler[pointerup] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[pointerup]]
  
  @scala.inline
  def default_progress(selector: String, handler: EventHandler[progress]): EventHandler[progress] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[progress]]
  
  @scala.inline
  def default_ratechange(selector: String, handler: EventHandler[ratechange]): EventHandler[ratechange] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[ratechange]]
  
  @scala.inline
  def default_reset(selector: String, handler: EventHandler[reset]): EventHandler[reset] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[reset]]
  
  @scala.inline
  def default_resize(selector: String, handler: EventHandler[resize]): EventHandler[resize] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[resize]]
  
  @scala.inline
  def default_scroll(selector: String, handler: EventHandler[scroll]): EventHandler[scroll] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[scroll]]
  
  @scala.inline
  def default_securitypolicyviolation(selector: String, handler: EventHandler[securitypolicyviolation]): EventHandler[securitypolicyviolation] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[securitypolicyviolation]]
  
  @scala.inline
  def default_seeked(selector: String, handler: EventHandler[seeked]): EventHandler[seeked] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[seeked]]
  
  @scala.inline
  def default_seeking(selector: String, handler: EventHandler[seeking]): EventHandler[seeking] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[seeking]]
  
  @scala.inline
  def default_select(selector: String, handler: EventHandler[select]): EventHandler[select] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[select]]
  
  @scala.inline
  def default_selectionchange(selector: String, handler: EventHandler[selectionchange]): EventHandler[selectionchange] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[selectionchange]]
  
  @scala.inline
  def default_selectstart(selector: String, handler: EventHandler[selectstart]): EventHandler[selectstart] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[selectstart]]
  
  @scala.inline
  def default_stalled(selector: String, handler: EventHandler[stalled]): EventHandler[stalled] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[stalled]]
  
  @scala.inline
  def default_submit(selector: String, handler: EventHandler[submit]): EventHandler[submit] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[submit]]
  
  @scala.inline
  def default_suspend(selector: String, handler: EventHandler[suspend]): EventHandler[suspend] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[suspend]]
  
  @scala.inline
  def default_timeupdate(selector: String, handler: EventHandler[timeupdate]): EventHandler[timeupdate] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[timeupdate]]
  
  @scala.inline
  def default_toggle(selector: String, handler: EventHandler[toggle]): EventHandler[toggle] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[toggle]]
  
  @scala.inline
  def default_touchcancel(selector: String, handler: EventHandler[touchcancel]): EventHandler[touchcancel] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[touchcancel]]
  
  @scala.inline
  def default_touchend(selector: String, handler: EventHandler[touchend]): EventHandler[touchend] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[touchend]]
  
  @scala.inline
  def default_touchmove(selector: String, handler: EventHandler[touchmove]): EventHandler[touchmove] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[touchmove]]
  
  @scala.inline
  def default_touchstart(selector: String, handler: EventHandler[touchstart]): EventHandler[touchstart] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[touchstart]]
  
  @scala.inline
  def default_transitioncancel(selector: String, handler: EventHandler[transitioncancel]): EventHandler[transitioncancel] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[transitioncancel]]
  
  @scala.inline
  def default_transitionend(selector: String, handler: EventHandler[transitionend]): EventHandler[transitionend] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[transitionend]]
  
  @scala.inline
  def default_transitionrun(selector: String, handler: EventHandler[transitionrun]): EventHandler[transitionrun] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[transitionrun]]
  
  @scala.inline
  def default_transitionstart(selector: String, handler: EventHandler[transitionstart]): EventHandler[transitionstart] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[transitionstart]]
  
  @scala.inline
  def default_volumechange(selector: String, handler: EventHandler[volumechange]): EventHandler[volumechange] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[volumechange]]
  
  @scala.inline
  def default_waiting(selector: String, handler: EventHandler[waiting]): EventHandler[waiting] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[waiting]]
  
  @scala.inline
  def default_wheel(selector: String, handler: EventHandler[wheel]): EventHandler[wheel] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[wheel]]
}
