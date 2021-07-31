package typings.googleEarth.global.google.earth

import typings.googleEarth.google.earth.GEEventPhaseEnum
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("google.earth.KmlMouseEvent")
@js.native
class KmlMouseEvent ()
  extends StObject
     with typings.googleEarth.google.earth.KmlMouseEvent {
  
  /**
    * Indicates whether the ALT key was held down when an event occurred.
    */
  /* CompleteClass */
  override def getAltKey(): Boolean = js.native
  
  /**
    * The altitude at which the event occurred, in meters.
    */
  /* CompleteClass */
  override def getAltitude(): Double = js.native
  
  /**
    * Indicates whether or not an event is a bubbling event.
    */
  /* CompleteClass */
  override def getBubbles(): Boolean = js.native
  
  /**
    * The button on the mouse was pressed.
    * Possible values include 0, 1, 2, where 0 is left, 1 is middle, and 2 is right mouse key.
    */
  /* CompleteClass */
  override def getButton(): Double = js.native
  
  /**
    * Indicates whether the event can be cancelled.
    *
    * Note: Currently, cancelable has no effect.
    */
  /* CompleteClass */
  override def getCancelable(): Boolean = js.native
  
  /**
    * The x coordinate at which the event occurred, measured in pixels from the left edge of the plug-in window.
    */
  /* CompleteClass */
  override def getClientX(): Double = js.native
  
  /**
    * The y coordinate at which the event occurred, measured in pixels from the top edge of the plug-in window.
    */
  /* CompleteClass */
  override def getClientY(): Double = js.native
  
  /**
    * Indicates whether the CTRL key was held down when an event occurred.
    */
  /* CompleteClass */
  override def getCtrlKey(): Boolean = js.native
  
  /**
    * The target whose event listeners are currently being processed.
    */
  /* CompleteClass */
  var getCurrentTarget: typings.googleEarth.google.earth.GEEventEmitter = js.native
  
  /**
    * Indicates whether a mouse action occurred while on the Google Earth globe.
    */
  /* CompleteClass */
  override def getDidHitGlobe(): Boolean = js.native
  
  /**
    * The current stage of the flow of events.
    */
  /* CompleteClass */
  override def getEventPhase(): GEEventPhaseEnum = js.native
  
  /**
    * The latitude at which the event occurred, in decimal degrees.
    */
  /* CompleteClass */
  override def getLatitude(): Double = js.native
  
  /**
    * The longitude at which the event occurred, in decimal degrees.
    */
  /* CompleteClass */
  override def getLongitude(): Double = js.native
  
  /**
    * Used with the mouseover and mouseout events to specify a secondary target.
    * For mouseover, it specifies the object that the mouse was over.
    * For mouseout, it specifies the new object that the mouse is over.
    */
  /* CompleteClass */
  override def getRelatedTarget(): typings.googleEarth.google.earth.GEEventEmitter = js.native
  
  /**
    * The x coordinate at which the event occurred, measured in pixels from the left edge of the computer screen.
    */
  /* CompleteClass */
  override def getScreenX(): Double = js.native
  
  /**
    * The y coordinate at which the event occurred, measured in pixels from the top edge of the computer screen.
    */
  /* CompleteClass */
  override def getScreenY(): Double = js.native
  
  /**
    * Indicates whether the SHIFT key was held down when an event occurred.
    */
  /* CompleteClass */
  override def getShiftKey(): Boolean = js.native
  
  /**
    * The object to which the KMLEvent was originally dispatched.
    */
  /* CompleteClass */
  override def getTarget(): typings.googleEarth.google.earth.GEEventEmitter = js.native
  
  /**
    * Returns the timestamp of the event, in Unix time.
    */
  /* CompleteClass */
  override def getTimeStamp(): Double = js.native
  
  /**
    * Cancels the default action of the event.
    * For example, calling this method in a placemark click handler prevents the placemark's default balloon from popping up.
    */
  /* CompleteClass */
  override def preventDefault(): Unit = js.native
  
  /**
    * Prevents event propagation.
    * For example, if click event handlers are set up on both the GEGlobe and GEWindow objects,
    * and stopPropagation is called in the GEGlobe click event handler, the GEWindow event handler will not be triggered when the globe is clicked.
    */
  /* CompleteClass */
  override def stopPropagation(): Unit = js.native
}
