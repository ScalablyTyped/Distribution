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
  inline def dragEnd: dragEnd = "dragEnd".asInstanceOf[dragEnd]
  
  @js.native
  sealed trait dragMove
    extends StObject
       with DraggabillyMoveEventName
  inline def dragMove: dragMove = "dragMove".asInstanceOf[dragMove]
  
  @js.native
  sealed trait dragStart
    extends StObject
       with DraggabillyClickEventName
  inline def dragStart: dragStart = "dragStart".asInstanceOf[dragStart]
  
  @js.native
  sealed trait pointerDown
    extends StObject
       with DraggabillyClickEventName
  inline def pointerDown: pointerDown = "pointerDown".asInstanceOf[pointerDown]
  
  @js.native
  sealed trait pointerMove
    extends StObject
       with DraggabillyMoveEventName
  inline def pointerMove: pointerMove = "pointerMove".asInstanceOf[pointerMove]
  
  @js.native
  sealed trait pointerUp
    extends StObject
       with DraggabillyClickEventName
  inline def pointerUp: pointerUp = "pointerUp".asInstanceOf[pointerUp]
  
  @js.native
  sealed trait staticClick
    extends StObject
       with DraggabillyClickEventName
  inline def staticClick: staticClick = "staticClick".asInstanceOf[staticClick]
  
  @js.native
  sealed trait x extends StObject
  inline def x: x = "x".asInstanceOf[x]
  
  @js.native
  sealed trait y extends StObject
  inline def y: y = "y".asInstanceOf[y]
}
