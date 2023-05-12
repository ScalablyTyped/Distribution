package typings.fullcalendarInteraction.mod

import typings.std.EventTarget
import typings.std.HTMLElement
import typings.std.MouseEvent
import typings.std.TouchEvent
import typings.std.UIEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PointerDragging extends StObject {
  
  def cancelTouchScroll(): Unit = js.native
  
  def cleanup(): Unit = js.native
  
  var containerEl: EventTarget = js.native
  
  def createEventFromMouse(ev: MouseEvent): Any = js.native
  def createEventFromMouse(ev: MouseEvent, isFirst: Boolean): Any = js.native
  
  def createEventFromTouch(ev: TouchEvent): Any = js.native
  def createEventFromTouch(ev: TouchEvent, isFirst: Boolean): Any = js.native
  
  def destroy(): Unit = js.native
  
  def destroyScrollWatch(): Unit = js.native
  
  var emitter: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Emitter<any> */ Any = js.native
  
  def handleMouseDown(ev: MouseEvent): Unit = js.native
  
  def handleMouseMove(ev: MouseEvent): Unit = js.native
  
  def handleMouseUp(ev: MouseEvent): Unit = js.native
  
  def handleScroll(ev: UIEvent): Unit = js.native
  
  var handleSelector: String = js.native
  
  def handleTouchEnd(ev: TouchEvent): Unit = js.native
  
  def handleTouchMove(ev: TouchEvent): Unit = js.native
  
  def handleTouchScroll(): Unit = js.native
  
  def handleTouchStart(ev: TouchEvent): Unit = js.native
  
  def initScrollWatch(
    ev: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PointerDragEvent */ Any
  ): Unit = js.native
  
  var isDragging: Boolean = js.native
  
  var isTouchDragging: Boolean = js.native
  
  var origPageX: Double = js.native
  
  var origPageY: Double = js.native
  
  var prevPageX: Double = js.native
  
  var prevPageY: Double = js.native
  
  var prevScrollX: Double = js.native
  
  var prevScrollY: Double = js.native
  
  def querySubjectEl(ev: UIEvent): HTMLElement = js.native
  
  def recordCoords(
    ev: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PointerDragEvent */ Any
  ): Unit = js.native
  
  var selector: String = js.native
  
  def shouldIgnoreMouse(): Double | Boolean = js.native
  
  var shouldIgnoreMove: Boolean = js.native
  
  var shouldWatchScroll: Boolean = js.native
  
  var subjectEl: HTMLElement | Null = js.native
  
  def tryStart(ev: UIEvent): Boolean = js.native
  
  var wasTouchScroll: Boolean = js.native
}
