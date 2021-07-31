package typings.draggabilly

import typings.draggabilly.mod.DraggabillyClickEventName
import typings.draggabilly.mod.DraggabillyMoveEventName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object draggabillyStrings {
  
  @js.native
  sealed trait dragEnd
    extends StObject
       with DraggabillyClickEventName
  @scala.inline
  def dragEnd: dragEnd = "dragEnd".asInstanceOf[dragEnd]
  
  @js.native
  sealed trait dragMove
    extends StObject
       with DraggabillyMoveEventName
  @scala.inline
  def dragMove: dragMove = "dragMove".asInstanceOf[dragMove]
  
  @js.native
  sealed trait dragStart
    extends StObject
       with DraggabillyClickEventName
  @scala.inline
  def dragStart: dragStart = "dragStart".asInstanceOf[dragStart]
  
  @js.native
  sealed trait pointerDown
    extends StObject
       with DraggabillyClickEventName
  @scala.inline
  def pointerDown: pointerDown = "pointerDown".asInstanceOf[pointerDown]
  
  @js.native
  sealed trait pointerMove
    extends StObject
       with DraggabillyMoveEventName
  @scala.inline
  def pointerMove: pointerMove = "pointerMove".asInstanceOf[pointerMove]
  
  @js.native
  sealed trait pointerUp
    extends StObject
       with DraggabillyClickEventName
  @scala.inline
  def pointerUp: pointerUp = "pointerUp".asInstanceOf[pointerUp]
  
  @js.native
  sealed trait staticClick
    extends StObject
       with DraggabillyClickEventName
  @scala.inline
  def staticClick: staticClick = "staticClick".asInstanceOf[staticClick]
  
  @js.native
  sealed trait x extends StObject
  @scala.inline
  def x: x = "x".asInstanceOf[x]
  
  @js.native
  sealed trait y extends StObject
  @scala.inline
  def y: y = "y".asInstanceOf[y]
}
