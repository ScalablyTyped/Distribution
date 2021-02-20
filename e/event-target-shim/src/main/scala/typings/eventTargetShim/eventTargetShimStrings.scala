package typings.eventTargetShim

import typings.eventTargetShim.mod.EventTarget.Mode
import typings.eventTargetShim.mod.EventTarget.OmittableEventKeys
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eventTargetShimStrings {
  
  @js.native
  sealed trait AT_TARGET extends OmittableEventKeys
  @scala.inline
  def AT_TARGET: AT_TARGET = "AT_TARGET".asInstanceOf[AT_TARGET]
  
  @js.native
  sealed trait BUBBLING_PHASE extends OmittableEventKeys
  @scala.inline
  def BUBBLING_PHASE: BUBBLING_PHASE = "BUBBLING_PHASE".asInstanceOf[BUBBLING_PHASE]
  
  @js.native
  sealed trait CAPTURING_PHASE extends OmittableEventKeys
  @scala.inline
  def CAPTURING_PHASE: CAPTURING_PHASE = "CAPTURING_PHASE".asInstanceOf[CAPTURING_PHASE]
  
  @js.native
  sealed trait EventAttributes extends StObject
  @scala.inline
  def EventAttributes: EventAttributes = "EventAttributes".asInstanceOf[EventAttributes]
  
  @js.native
  sealed trait NONE extends OmittableEventKeys
  @scala.inline
  def NONE: NONE = "NONE".asInstanceOf[NONE]
  
  @js.native
  sealed trait bubbles extends OmittableEventKeys
  @scala.inline
  def bubbles: bubbles = "bubbles".asInstanceOf[bubbles]
  
  @js.native
  sealed trait cancelBubble extends OmittableEventKeys
  @scala.inline
  def cancelBubble: cancelBubble = "cancelBubble".asInstanceOf[cancelBubble]
  
  @js.native
  sealed trait cancelable extends OmittableEventKeys
  @scala.inline
  def cancelable: cancelable = "cancelable".asInstanceOf[cancelable]
  
  @js.native
  sealed trait composed extends OmittableEventKeys
  @scala.inline
  def composed: composed = "composed".asInstanceOf[composed]
  
  @js.native
  sealed trait composedPath extends OmittableEventKeys
  @scala.inline
  def composedPath: composedPath = "composedPath".asInstanceOf[composedPath]
  
  @js.native
  sealed trait currentTarget extends OmittableEventKeys
  @scala.inline
  def currentTarget: currentTarget = "currentTarget".asInstanceOf[currentTarget]
  
  @js.native
  sealed trait defaultPrevented extends OmittableEventKeys
  @scala.inline
  def defaultPrevented: defaultPrevented = "defaultPrevented".asInstanceOf[defaultPrevented]
  
  @js.native
  sealed trait eventPhase extends OmittableEventKeys
  @scala.inline
  def eventPhase: eventPhase = "eventPhase".asInstanceOf[eventPhase]
  
  @js.native
  sealed trait initEvent extends OmittableEventKeys
  @scala.inline
  def initEvent: initEvent = "initEvent".asInstanceOf[initEvent]
  
  @js.native
  sealed trait isTrusted extends OmittableEventKeys
  @scala.inline
  def isTrusted: isTrusted = "isTrusted".asInstanceOf[isTrusted]
  
  @js.native
  sealed trait loose extends Mode
  @scala.inline
  def loose: loose = "loose".asInstanceOf[loose]
  
  @js.native
  sealed trait preventDefault extends OmittableEventKeys
  @scala.inline
  def preventDefault: preventDefault = "preventDefault".asInstanceOf[preventDefault]
  
  @js.native
  sealed trait returnValue extends OmittableEventKeys
  @scala.inline
  def returnValue: returnValue = "returnValue".asInstanceOf[returnValue]
  
  @js.native
  sealed trait srcElement extends OmittableEventKeys
  @scala.inline
  def srcElement: srcElement = "srcElement".asInstanceOf[srcElement]
  
  @js.native
  sealed trait standard extends Mode
  @scala.inline
  def standard: standard = "standard".asInstanceOf[standard]
  
  @js.native
  sealed trait stopImmediatePropagation extends OmittableEventKeys
  @scala.inline
  def stopImmediatePropagation: stopImmediatePropagation = "stopImmediatePropagation".asInstanceOf[stopImmediatePropagation]
  
  @js.native
  sealed trait stopPropagation extends OmittableEventKeys
  @scala.inline
  def stopPropagation: stopPropagation = "stopPropagation".asInstanceOf[stopPropagation]
  
  @js.native
  sealed trait strict extends Mode
  @scala.inline
  def strict: strict = "strict".asInstanceOf[strict]
  
  @js.native
  sealed trait target extends OmittableEventKeys
  @scala.inline
  def target: target = "target".asInstanceOf[target]
  
  @js.native
  sealed trait timeStamp extends OmittableEventKeys
  @scala.inline
  def timeStamp: timeStamp = "timeStamp".asInstanceOf[timeStamp]
}
