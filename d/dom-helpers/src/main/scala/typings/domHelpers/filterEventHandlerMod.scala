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
import typings.domHelpers.domHelpersStrings.loadend
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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dom-helpers/cjs/filterEventHandler", JSImport.Namespace)
@js.native
object filterEventHandlerMod extends js.Object {
  @JSName("default")
  def default_abort(selector: String, handler: EventHandler[abort]): EventHandler[abort] = js.native
  @JSName("default")
  def default_animationcancel(selector: String, handler: EventHandler[animationcancel]): EventHandler[animationcancel] = js.native
  @JSName("default")
  def default_animationend(selector: String, handler: EventHandler[animationend]): EventHandler[animationend] = js.native
  @JSName("default")
  def default_animationiteration(selector: String, handler: EventHandler[animationiteration]): EventHandler[animationiteration] = js.native
  @JSName("default")
  def default_animationstart(selector: String, handler: EventHandler[animationstart]): EventHandler[animationstart] = js.native
  @JSName("default")
  def default_auxclick(selector: String, handler: EventHandler[auxclick]): EventHandler[auxclick] = js.native
  @JSName("default")
  def default_blur(selector: String, handler: EventHandler[blur]): EventHandler[blur] = js.native
  @JSName("default")
  def default_cancel(selector: String, handler: EventHandler[cancel]): EventHandler[cancel] = js.native
  @JSName("default")
  def default_canplay(selector: String, handler: EventHandler[canplay]): EventHandler[canplay] = js.native
  @JSName("default")
  def default_canplaythrough(selector: String, handler: EventHandler[canplaythrough]): EventHandler[canplaythrough] = js.native
  @JSName("default")
  def default_change(selector: String, handler: EventHandler[change]): EventHandler[change] = js.native
  @JSName("default")
  def default_click(selector: String, handler: EventHandler[click]): EventHandler[click] = js.native
  @JSName("default")
  def default_close(selector: String, handler: EventHandler[close]): EventHandler[close] = js.native
  @JSName("default")
  def default_contextmenu(selector: String, handler: EventHandler[contextmenu]): EventHandler[contextmenu] = js.native
  @JSName("default")
  def default_copy(selector: String, handler: EventHandler[copy]): EventHandler[copy] = js.native
  @JSName("default")
  def default_cuechange(selector: String, handler: EventHandler[cuechange]): EventHandler[cuechange] = js.native
  @JSName("default")
  def default_cut(selector: String, handler: EventHandler[cut]): EventHandler[cut] = js.native
  @JSName("default")
  def default_dblclick(selector: String, handler: EventHandler[dblclick]): EventHandler[dblclick] = js.native
  @JSName("default")
  def default_drag(selector: String, handler: EventHandler[drag]): EventHandler[drag] = js.native
  @JSName("default")
  def default_dragend(selector: String, handler: EventHandler[dragend]): EventHandler[dragend] = js.native
  @JSName("default")
  def default_dragenter(selector: String, handler: EventHandler[dragenter]): EventHandler[dragenter] = js.native
  @JSName("default")
  def default_dragexit(selector: String, handler: EventHandler[dragexit]): EventHandler[dragexit] = js.native
  @JSName("default")
  def default_dragleave(selector: String, handler: EventHandler[dragleave]): EventHandler[dragleave] = js.native
  @JSName("default")
  def default_dragover(selector: String, handler: EventHandler[dragover]): EventHandler[dragover] = js.native
  @JSName("default")
  def default_dragstart(selector: String, handler: EventHandler[dragstart]): EventHandler[dragstart] = js.native
  @JSName("default")
  def default_drop(selector: String, handler: EventHandler[drop]): EventHandler[drop] = js.native
  @JSName("default")
  def default_durationchange(selector: String, handler: EventHandler[durationchange]): EventHandler[durationchange] = js.native
  @JSName("default")
  def default_emptied(selector: String, handler: EventHandler[emptied]): EventHandler[emptied] = js.native
  @JSName("default")
  def default_ended(selector: String, handler: EventHandler[ended]): EventHandler[ended] = js.native
  @JSName("default")
  def default_error(selector: String, handler: EventHandler[error]): EventHandler[error] = js.native
  @JSName("default")
  def default_focus(selector: String, handler: EventHandler[focus]): EventHandler[focus] = js.native
  @JSName("default")
  def default_focusin(selector: String, handler: EventHandler[focusin]): EventHandler[focusin] = js.native
  @JSName("default")
  def default_focusout(selector: String, handler: EventHandler[focusout]): EventHandler[focusout] = js.native
  @JSName("default")
  def default_fullscreenchange(selector: String, handler: EventHandler[fullscreenchange]): EventHandler[fullscreenchange] = js.native
  @JSName("default")
  def default_fullscreenerror(selector: String, handler: EventHandler[fullscreenerror]): EventHandler[fullscreenerror] = js.native
  @JSName("default")
  def default_gotpointercapture(selector: String, handler: EventHandler[gotpointercapture]): EventHandler[gotpointercapture] = js.native
  @JSName("default")
  def default_input(selector: String, handler: EventHandler[input]): EventHandler[input] = js.native
  @JSName("default")
  def default_invalid(selector: String, handler: EventHandler[invalid]): EventHandler[invalid] = js.native
  @JSName("default")
  def default_keydown(selector: String, handler: EventHandler[keydown]): EventHandler[keydown] = js.native
  @JSName("default")
  def default_keypress(selector: String, handler: EventHandler[keypress]): EventHandler[keypress] = js.native
  @JSName("default")
  def default_keyup(selector: String, handler: EventHandler[keyup]): EventHandler[keyup] = js.native
  @JSName("default")
  def default_load(selector: String, handler: EventHandler[load]): EventHandler[load] = js.native
  @JSName("default")
  def default_loadeddata(selector: String, handler: EventHandler[loadeddata]): EventHandler[loadeddata] = js.native
  @JSName("default")
  def default_loadedmetadata(selector: String, handler: EventHandler[loadedmetadata]): EventHandler[loadedmetadata] = js.native
  @JSName("default")
  def default_loadend(selector: String, handler: EventHandler[loadend]): EventHandler[loadend] = js.native
  @JSName("default")
  def default_loadstart(selector: String, handler: EventHandler[loadstart]): EventHandler[loadstart] = js.native
  @JSName("default")
  def default_lostpointercapture(selector: String, handler: EventHandler[lostpointercapture]): EventHandler[lostpointercapture] = js.native
  @JSName("default")
  def default_mousedown(selector: String, handler: EventHandler[mousedown]): EventHandler[mousedown] = js.native
  @JSName("default")
  def default_mouseenter(selector: String, handler: EventHandler[mouseenter]): EventHandler[mouseenter] = js.native
  @JSName("default")
  def default_mouseleave(selector: String, handler: EventHandler[mouseleave]): EventHandler[mouseleave] = js.native
  @JSName("default")
  def default_mousemove(selector: String, handler: EventHandler[mousemove]): EventHandler[mousemove] = js.native
  @JSName("default")
  def default_mouseout(selector: String, handler: EventHandler[mouseout]): EventHandler[mouseout] = js.native
  @JSName("default")
  def default_mouseover(selector: String, handler: EventHandler[mouseover]): EventHandler[mouseover] = js.native
  @JSName("default")
  def default_mouseup(selector: String, handler: EventHandler[mouseup]): EventHandler[mouseup] = js.native
  @JSName("default")
  def default_paste(selector: String, handler: EventHandler[paste]): EventHandler[paste] = js.native
  @JSName("default")
  def default_pause(selector: String, handler: EventHandler[pause]): EventHandler[pause] = js.native
  @JSName("default")
  def default_play(selector: String, handler: EventHandler[play]): EventHandler[play] = js.native
  @JSName("default")
  def default_playing(selector: String, handler: EventHandler[playing]): EventHandler[playing] = js.native
  @JSName("default")
  def default_pointercancel(selector: String, handler: EventHandler[pointercancel]): EventHandler[pointercancel] = js.native
  @JSName("default")
  def default_pointerdown(selector: String, handler: EventHandler[pointerdown]): EventHandler[pointerdown] = js.native
  @JSName("default")
  def default_pointerenter(selector: String, handler: EventHandler[pointerenter]): EventHandler[pointerenter] = js.native
  @JSName("default")
  def default_pointerleave(selector: String, handler: EventHandler[pointerleave]): EventHandler[pointerleave] = js.native
  @JSName("default")
  def default_pointermove(selector: String, handler: EventHandler[pointermove]): EventHandler[pointermove] = js.native
  @JSName("default")
  def default_pointerout(selector: String, handler: EventHandler[pointerout]): EventHandler[pointerout] = js.native
  @JSName("default")
  def default_pointerover(selector: String, handler: EventHandler[pointerover]): EventHandler[pointerover] = js.native
  @JSName("default")
  def default_pointerup(selector: String, handler: EventHandler[pointerup]): EventHandler[pointerup] = js.native
  @JSName("default")
  def default_progress(selector: String, handler: EventHandler[progress]): EventHandler[progress] = js.native
  @JSName("default")
  def default_ratechange(selector: String, handler: EventHandler[ratechange]): EventHandler[ratechange] = js.native
  @JSName("default")
  def default_reset(selector: String, handler: EventHandler[reset]): EventHandler[reset] = js.native
  @JSName("default")
  def default_resize(selector: String, handler: EventHandler[resize]): EventHandler[resize] = js.native
  @JSName("default")
  def default_scroll(selector: String, handler: EventHandler[scroll]): EventHandler[scroll] = js.native
  @JSName("default")
  def default_securitypolicyviolation(selector: String, handler: EventHandler[securitypolicyviolation]): EventHandler[securitypolicyviolation] = js.native
  @JSName("default")
  def default_seeked(selector: String, handler: EventHandler[seeked]): EventHandler[seeked] = js.native
  @JSName("default")
  def default_seeking(selector: String, handler: EventHandler[seeking]): EventHandler[seeking] = js.native
  @JSName("default")
  def default_select(selector: String, handler: EventHandler[select]): EventHandler[select] = js.native
  @JSName("default")
  def default_selectionchange(selector: String, handler: EventHandler[selectionchange]): EventHandler[selectionchange] = js.native
  @JSName("default")
  def default_selectstart(selector: String, handler: EventHandler[selectstart]): EventHandler[selectstart] = js.native
  @JSName("default")
  def default_stalled(selector: String, handler: EventHandler[stalled]): EventHandler[stalled] = js.native
  @JSName("default")
  def default_submit(selector: String, handler: EventHandler[submit]): EventHandler[submit] = js.native
  @JSName("default")
  def default_suspend(selector: String, handler: EventHandler[suspend]): EventHandler[suspend] = js.native
  @JSName("default")
  def default_timeupdate(selector: String, handler: EventHandler[timeupdate]): EventHandler[timeupdate] = js.native
  @JSName("default")
  def default_toggle(selector: String, handler: EventHandler[toggle]): EventHandler[toggle] = js.native
  @JSName("default")
  def default_touchcancel(selector: String, handler: EventHandler[touchcancel]): EventHandler[touchcancel] = js.native
  @JSName("default")
  def default_touchend(selector: String, handler: EventHandler[touchend]): EventHandler[touchend] = js.native
  @JSName("default")
  def default_touchmove(selector: String, handler: EventHandler[touchmove]): EventHandler[touchmove] = js.native
  @JSName("default")
  def default_touchstart(selector: String, handler: EventHandler[touchstart]): EventHandler[touchstart] = js.native
  @JSName("default")
  def default_transitioncancel(selector: String, handler: EventHandler[transitioncancel]): EventHandler[transitioncancel] = js.native
  @JSName("default")
  def default_transitionend(selector: String, handler: EventHandler[transitionend]): EventHandler[transitionend] = js.native
  @JSName("default")
  def default_transitionrun(selector: String, handler: EventHandler[transitionrun]): EventHandler[transitionrun] = js.native
  @JSName("default")
  def default_transitionstart(selector: String, handler: EventHandler[transitionstart]): EventHandler[transitionstart] = js.native
  @JSName("default")
  def default_volumechange(selector: String, handler: EventHandler[volumechange]): EventHandler[volumechange] = js.native
  @JSName("default")
  def default_waiting(selector: String, handler: EventHandler[waiting]): EventHandler[waiting] = js.native
  @JSName("default")
  def default_wheel(selector: String, handler: EventHandler[wheel]): EventHandler[wheel] = js.native
}

