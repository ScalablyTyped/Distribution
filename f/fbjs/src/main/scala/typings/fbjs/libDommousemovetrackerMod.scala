package typings.fbjs

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDommousemovetrackerMod {
  
  @JSImport("fbjs/lib/DOMMouseMoveTracker", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with DOMMouseMoveTracker {
    // tslint:disable-next-line:ban-types
    def this(onMove: js.Function, onMoveEnd: js.Function, domNode: HTMLElement) = this()
    
    /* CompleteClass */
    override def _didMouseMove(): Unit = js.native
    
    /**
      * Calls onMove passed into constructor and updates internal state.
      */
    /* CompleteClass */
    override def _onMouseMove(/*object*/
    event: js.Object): Unit = js.native
    
    /**
      * Calls onMoveEnd passed into constructor and updates internal state.
      */
    /* CompleteClass */
    override def _onMouseUp(): Unit = js.native
    
    /**
      * This is to set up the listeners for listening to mouse move
      * and mouse up signaling the movement has ended. Please note that these
      * listeners are added at the document.body level. It takes in an event
      * in order to grab inital state.
      */
    /* CompleteClass */
    override def captureMouseMoves(event: js.Object): Unit = js.native
    
    /**
      * Returns whether or not if the mouse movement is being tracked.
      */
    /* CompleteClass */
    override def isDragging(): Boolean = js.native
    
    /**
      * These releases all of the listeners on document.body.
      */
    /* CompleteClass */
    override def releaseMouseMoves(): Unit = js.native
  }
  
  trait DOMMouseMoveTracker extends StObject {
    
    def _didMouseMove(): Unit
    
    /**
      * Calls onMove passed into constructor and updates internal state.
      */
    def _onMouseMove(/*object*/
    event: js.Object): Unit
    
    /**
      * Calls onMoveEnd passed into constructor and updates internal state.
      */
    def _onMouseUp(): Unit
    
    /**
      * This is to set up the listeners for listening to mouse move
      * and mouse up signaling the movement has ended. Please note that these
      * listeners are added at the document.body level. It takes in an event
      * in order to grab inital state.
      */
    def captureMouseMoves(event: js.Object): Unit
    
    /**
      * Returns whether or not if the mouse movement is being tracked.
      */
    def isDragging(): Boolean
    
    /**
      * These releases all of the listeners on document.body.
      */
    def releaseMouseMoves(): Unit
  }
  object DOMMouseMoveTracker {
    
    inline def apply(
      _didMouseMove: () => Unit,
      _onMouseMove: js.Object => Unit,
      _onMouseUp: () => Unit,
      captureMouseMoves: js.Object => Unit,
      isDragging: () => Boolean,
      releaseMouseMoves: () => Unit
    ): DOMMouseMoveTracker = {
      val __obj = js.Dynamic.literal(_didMouseMove = js.Any.fromFunction0(_didMouseMove), _onMouseMove = js.Any.fromFunction1(_onMouseMove), _onMouseUp = js.Any.fromFunction0(_onMouseUp), captureMouseMoves = js.Any.fromFunction1(captureMouseMoves), isDragging = js.Any.fromFunction0(isDragging), releaseMouseMoves = js.Any.fromFunction0(releaseMouseMoves))
      __obj.asInstanceOf[DOMMouseMoveTracker]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DOMMouseMoveTracker] (val x: Self) extends AnyVal {
      
      inline def setCaptureMouseMoves(value: js.Object => Unit): Self = StObject.set(x, "captureMouseMoves", js.Any.fromFunction1(value))
      
      inline def setIsDragging(value: () => Boolean): Self = StObject.set(x, "isDragging", js.Any.fromFunction0(value))
      
      inline def setReleaseMouseMoves(value: () => Unit): Self = StObject.set(x, "releaseMouseMoves", js.Any.fromFunction0(value))
      
      inline def set_didMouseMove(value: () => Unit): Self = StObject.set(x, "_didMouseMove", js.Any.fromFunction0(value))
      
      inline def set_onMouseMove(value: js.Object => Unit): Self = StObject.set(x, "_onMouseMove", js.Any.fromFunction1(value))
      
      inline def set_onMouseUp(value: () => Unit): Self = StObject.set(x, "_onMouseUp", js.Any.fromFunction0(value))
    }
  }
}
