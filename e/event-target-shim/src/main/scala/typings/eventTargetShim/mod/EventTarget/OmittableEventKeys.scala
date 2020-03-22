package typings.eventTargetShim.mod.EventTarget

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Exclude<keyof event-target-shim.event-target-shim.Event, 'type'> */
/* Rewritten from type alias, can be one of: 
  - typings.eventTargetShim.eventTargetShimStrings.BUBBLING_PHASE
  - typings.eventTargetShim.eventTargetShimStrings.currentTarget
  - typings.eventTargetShim.eventTargetShimStrings.NONE
  - typings.eventTargetShim.eventTargetShimStrings.initEvent
  - typings.eventTargetShim.eventTargetShimStrings.cancelBubble
  - typings.eventTargetShim.eventTargetShimStrings.target
  - typings.eventTargetShim.eventTargetShimStrings.composed
  - typings.eventTargetShim.eventTargetShimStrings.composedPath
  - typings.eventTargetShim.eventTargetShimStrings.preventDefault
  - typings.eventTargetShim.eventTargetShimStrings.eventPhase
  - typings.eventTargetShim.eventTargetShimStrings.cancelable
  - typings.eventTargetShim.eventTargetShimStrings.isTrusted
  - typings.eventTargetShim.eventTargetShimStrings.returnValue
  - typings.eventTargetShim.eventTargetShimStrings.AT_TARGET
  - typings.eventTargetShim.eventTargetShimStrings.bubbles
  - typings.eventTargetShim.eventTargetShimStrings.stopPropagation
  - typings.eventTargetShim.eventTargetShimStrings.stopImmediatePropagation
  - typings.eventTargetShim.eventTargetShimStrings.CAPTURING_PHASE
  - typings.eventTargetShim.eventTargetShimStrings.srcElement
  - typings.eventTargetShim.eventTargetShimStrings.defaultPrevented
  - typings.eventTargetShim.eventTargetShimStrings.timeStamp
*/
trait OmittableEventKeys extends js.Object

object OmittableEventKeys {
  @scala.inline
  def AT_TARGET: typings.eventTargetShim.eventTargetShimStrings.AT_TARGET = this.cast("AT_TARGET")
  @scala.inline
  def BUBBLING_PHASE: typings.eventTargetShim.eventTargetShimStrings.BUBBLING_PHASE = this.cast("BUBBLING_PHASE")
  @scala.inline
  def CAPTURING_PHASE: typings.eventTargetShim.eventTargetShimStrings.CAPTURING_PHASE = this.cast("CAPTURING_PHASE")
  @scala.inline
  def NONE: typings.eventTargetShim.eventTargetShimStrings.NONE = this.cast("NONE")
  @scala.inline
  def bubbles: typings.eventTargetShim.eventTargetShimStrings.bubbles = this.cast("bubbles")
  @scala.inline
  def cancelBubble: typings.eventTargetShim.eventTargetShimStrings.cancelBubble = this.cast("cancelBubble")
  @scala.inline
  def cancelable: typings.eventTargetShim.eventTargetShimStrings.cancelable = this.cast("cancelable")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def composed: typings.eventTargetShim.eventTargetShimStrings.composed = this.cast("composed")
  @scala.inline
  def composedPath: typings.eventTargetShim.eventTargetShimStrings.composedPath = this.cast("composedPath")
  @scala.inline
  def currentTarget: typings.eventTargetShim.eventTargetShimStrings.currentTarget = this.cast("currentTarget")
  @scala.inline
  def defaultPrevented: typings.eventTargetShim.eventTargetShimStrings.defaultPrevented = this.cast("defaultPrevented")
  @scala.inline
  def eventPhase: typings.eventTargetShim.eventTargetShimStrings.eventPhase = this.cast("eventPhase")
  @scala.inline
  def initEvent: typings.eventTargetShim.eventTargetShimStrings.initEvent = this.cast("initEvent")
  @scala.inline
  def isTrusted: typings.eventTargetShim.eventTargetShimStrings.isTrusted = this.cast("isTrusted")
  @scala.inline
  def preventDefault: typings.eventTargetShim.eventTargetShimStrings.preventDefault = this.cast("preventDefault")
  @scala.inline
  def returnValue: typings.eventTargetShim.eventTargetShimStrings.returnValue = this.cast("returnValue")
  @scala.inline
  def srcElement: typings.eventTargetShim.eventTargetShimStrings.srcElement = this.cast("srcElement")
  @scala.inline
  def stopImmediatePropagation: typings.eventTargetShim.eventTargetShimStrings.stopImmediatePropagation = this.cast("stopImmediatePropagation")
  @scala.inline
  def stopPropagation: typings.eventTargetShim.eventTargetShimStrings.stopPropagation = this.cast("stopPropagation")
  @scala.inline
  def target: typings.eventTargetShim.eventTargetShimStrings.target = this.cast("target")
  @scala.inline
  def timeStamp: typings.eventTargetShim.eventTargetShimStrings.timeStamp = this.cast("timeStamp")
}

