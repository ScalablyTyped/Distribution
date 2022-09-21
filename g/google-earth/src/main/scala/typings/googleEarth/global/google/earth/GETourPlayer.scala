package typings.googleEarth.global.google.earth

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("google.earth.GETourPlayer")
@js.native
open class GETourPlayer ()
  extends StObject
     with typings.googleEarth.google.earth.GETourPlayer {
  
  /**
    * The current elapsed playing time of the active tour, in seconds.
    */
  /* CompleteClass */
  override def getCurrentTime(): Double = js.native
  
  /**
    * The total duration of the active tour, in seconds. If no tour is loaded, the behavior of this method is undefined.
    */
  /* CompleteClass */
  override def getDuration(): Double = js.native
  
  /**
    * Pauses the currently active tour.
    */
  /* CompleteClass */
  override def pause(): Unit = js.native
  
  /**
    * Plays the currently active tour.
    */
  /* CompleteClass */
  override def play(): Unit = js.native
  
  /**
    * Resets the currently active tour, stopping playback and rewinding to the start of the tour.
    */
  /* CompleteClass */
  override def reset(): Unit = js.native
  
  /**
    * The current elapsed playing time of the active tour, in seconds.
    */
  /* CompleteClass */
  override def setCurrentTime(currentTime: Double): Unit = js.native
  
  /**
    * Enters the given tour object, exiting any other currently active tour.
    * This method does not automatically begin playing the tour. 
    * If the argument is null, then any currently active tour is exited and normal globe navigation is enabled.
    */
  /* CompleteClass */
  override def setTour(tour: typings.googleEarth.google.earth.KmlTour): Unit = js.native
}
