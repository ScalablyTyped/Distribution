package typings.eventTargetShim

import typings.eventTargetShim.mod.EventTarget.Mode
import typings.eventTargetShim.mod.EventTarget.OmittableEventKeys
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eventTargetShimStrings {
  
  @scala.inline
  def AT_TARGET: AT_TARGET = "AT_TARGET".asInstanceOf[AT_TARGET]
  
  @scala.inline
  def BUBBLING_PHASE: BUBBLING_PHASE = "BUBBLING_PHASE".asInstanceOf[BUBBLING_PHASE]
  
  @scala.inline
  def CAPTURING_PHASE: CAPTURING_PHASE = "CAPTURING_PHASE".asInstanceOf[CAPTURING_PHASE]
  
  @scala.inline
  def EventAttributes: EventAttributes = "EventAttributes".asInstanceOf[EventAttributes]
  
  @scala.inline
  def NONE: NONE = "NONE".asInstanceOf[NONE]
  
  @scala.inline
  def bubbles: bubbles = "bubbles".asInstanceOf[bubbles]
  
  @scala.inline
  def cancelBubble: cancelBubble = "cancelBubble".asInstanceOf[cancelBubble]
  
  @scala.inline
  def cancelable: cancelable = "cancelable".asInstanceOf[cancelable]
  
  @scala.inline
  def composed: composed = "composed".asInstanceOf[composed]
  
  @scala.inline
  def composedPath: composedPath = "composedPath".asInstanceOf[composedPath]
  
  @scala.inline
  def currentTarget: currentTarget = "currentTarget".asInstanceOf[currentTarget]
  
  @scala.inline
  def defaultPrevented: defaultPrevented = "defaultPrevented".asInstanceOf[defaultPrevented]
  
  @scala.inline
  def eventPhase: eventPhase = "eventPhase".asInstanceOf[eventPhase]
  
  @scala.inline
  def initEvent: initEvent = "initEvent".asInstanceOf[initEvent]
  
  @scala.inline
  def isTrusted: isTrusted = "isTrusted".asInstanceOf[isTrusted]
  
  @scala.inline
  def loose: loose = "loose".asInstanceOf[loose]
  
  @scala.inline
  def preventDefault: preventDefault = "preventDefault".asInstanceOf[preventDefault]
  
  @scala.inline
  def returnValue: returnValue = "returnValue".asInstanceOf[returnValue]
  
  @scala.inline
  def srcElement: srcElement = "srcElement".asInstanceOf[srcElement]
  
  @scala.inline
  def standard: standard = "standard".asInstanceOf[standard]
  
  @scala.inline
  def stopImmediatePropagation: stopImmediatePropagation = "stopImmediatePropagation".asInstanceOf[stopImmediatePropagation]
  
  @scala.inline
  def stopPropagation: stopPropagation = "stopPropagation".asInstanceOf[stopPropagation]
  
  @scala.inline
  def strict: strict = "strict".asInstanceOf[strict]
  
  @scala.inline
  def target: target = "target".asInstanceOf[target]
  
  @scala.inline
  def timeStamp: timeStamp = "timeStamp".asInstanceOf[timeStamp]
  
  @js.native
  sealed trait AT_TARGET extends OmittableEventKeys
  
  @js.native
  sealed trait BUBBLING_PHASE extends OmittableEventKeys
  
  @js.native
  sealed trait CAPTURING_PHASE extends OmittableEventKeys
  
  @js.native
  sealed trait EventAttributes extends js.Object
  
  @js.native
  sealed trait NONE extends OmittableEventKeys
  
  @js.native
  sealed trait bubbles extends OmittableEventKeys
  
  @js.native
  sealed trait cancelBubble extends OmittableEventKeys
  
  @js.native
  sealed trait cancelable extends OmittableEventKeys
  
  @js.native
  sealed trait composed extends OmittableEventKeys
  
  @js.native
  sealed trait composedPath extends OmittableEventKeys
  
  @js.native
  sealed trait currentTarget extends OmittableEventKeys
  
  @js.native
  sealed trait defaultPrevented extends OmittableEventKeys
  
  @js.native
  sealed trait eventPhase extends OmittableEventKeys
  
  @js.native
  sealed trait initEvent extends OmittableEventKeys
  
  @js.native
  sealed trait isTrusted extends OmittableEventKeys
  
  @js.native
  sealed trait loose extends Mode
  
  @js.native
  sealed trait preventDefault extends OmittableEventKeys
  
  @js.native
  sealed trait returnValue extends OmittableEventKeys
  
  @js.native
  sealed trait srcElement extends OmittableEventKeys
  
  @js.native
  sealed trait standard extends Mode
  
  @js.native
  sealed trait stopImmediatePropagation extends OmittableEventKeys
  
  @js.native
  sealed trait stopPropagation extends OmittableEventKeys
  
  @js.native
  sealed trait strict extends Mode
  
  @js.native
  sealed trait target extends OmittableEventKeys
  
  @js.native
  sealed trait timeStamp extends OmittableEventKeys
}
