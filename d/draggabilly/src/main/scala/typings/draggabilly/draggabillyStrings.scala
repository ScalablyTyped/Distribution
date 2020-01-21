package typings.draggabilly

import typings.draggabilly.mod.DraggabillyClickEventName
import typings.draggabilly.mod.DraggabillyMoveEventName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object draggabillyStrings {
  @js.native
  sealed trait dragEnd extends DraggabillyClickEventName
  
  @js.native
  sealed trait dragMove extends DraggabillyMoveEventName
  
  @js.native
  sealed trait dragStart extends DraggabillyClickEventName
  
  @js.native
  sealed trait pointerDown extends DraggabillyClickEventName
  
  @js.native
  sealed trait pointerMove extends DraggabillyMoveEventName
  
  @js.native
  sealed trait pointerUp extends DraggabillyClickEventName
  
  @js.native
  sealed trait staticClick extends DraggabillyClickEventName
  
  @js.native
  sealed trait x extends js.Object
  
  @js.native
  sealed trait y extends js.Object
  
  @scala.inline
  def dragEnd: dragEnd = "dragEnd".asInstanceOf[dragEnd]
  @scala.inline
  def dragMove: dragMove = "dragMove".asInstanceOf[dragMove]
  @scala.inline
  def dragStart: dragStart = "dragStart".asInstanceOf[dragStart]
  @scala.inline
  def pointerDown: pointerDown = "pointerDown".asInstanceOf[pointerDown]
  @scala.inline
  def pointerMove: pointerMove = "pointerMove".asInstanceOf[pointerMove]
  @scala.inline
  def pointerUp: pointerUp = "pointerUp".asInstanceOf[pointerUp]
  @scala.inline
  def staticClick: staticClick = "staticClick".asInstanceOf[staticClick]
  @scala.inline
  def x: x = "x".asInstanceOf[x]
  @scala.inline
  def y: y = "y".asInstanceOf[y]
}

