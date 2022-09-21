package typings.googleEarth.global.google.earth

import typings.googleEarth.google.earth.GEEventPhaseEnum
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("google.earth.KmlEvent")
@js.native
open class KmlEvent ()
  extends StObject
     with typings.googleEarth.google.earth.KmlEvent {
  
  /**
    * Indicates whether or not an event is a bubbling event.
    */
  /* CompleteClass */
  override def getBubbles(): Boolean = js.native
  
  /**
    * Indicates whether the event can be cancelled.
    *
    * Note: Currently, cancelable has no effect.
    */
  /* CompleteClass */
  override def getCancelable(): Boolean = js.native
  
  /**
    * The target whose event listeners are currently being processed.
    */
  /* CompleteClass */
  var getCurrentTarget: typings.googleEarth.google.earth.GEEventEmitter = js.native
  
  /**
    * The current stage of the flow of events.
    */
  /* CompleteClass */
  override def getEventPhase(): GEEventPhaseEnum = js.native
  
  /**
    * The object to which the KMLEvent was originally dispatched.
    */
  /* CompleteClass */
  override def getTarget(): typings.googleEarth.google.earth.GEEventEmitter = js.native
  
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
