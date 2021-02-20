package typings.googleEarth.google.earth

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GETourPlayer extends StObject {
  
  /**
    * The current elapsed playing time of the active tour, in seconds.
    */
  def getCurrentTime(): Double = js.native
  
  /**
    * The total duration of the active tour, in seconds. If no tour is loaded, the behavior of this method is undefined.
    */
  def getDuration(): Double = js.native
  
  /**
    * Pauses the currently active tour.
    */
  def pause(): Unit = js.native
  
  /**
    * Plays the currently active tour.
    */
  def play(): Unit = js.native
  
  /**
    * Resets the currently active tour, stopping playback and rewinding to the start of the tour.
    */
  def reset(): Unit = js.native
  
  /**
    * The current elapsed playing time of the active tour, in seconds.
    */
  def setCurrentTime(currentTime: Double): Unit = js.native
  
  /**
    * Enters the given tour object, exiting any other currently active tour.
    * This method does not automatically begin playing the tour. 
    * If the argument is null, then any currently active tour is exited and normal globe navigation is enabled.
    */
  def setTour(tour: KmlTour): Unit = js.native
}
object GETourPlayer {
  
  @scala.inline
  def apply(
    getCurrentTime: () => Double,
    getDuration: () => Double,
    pause: () => Unit,
    play: () => Unit,
    reset: () => Unit,
    setCurrentTime: Double => Unit,
    setTour: KmlTour => Unit
  ): GETourPlayer = {
    val __obj = js.Dynamic.literal(getCurrentTime = js.Any.fromFunction0(getCurrentTime), getDuration = js.Any.fromFunction0(getDuration), pause = js.Any.fromFunction0(pause), play = js.Any.fromFunction0(play), reset = js.Any.fromFunction0(reset), setCurrentTime = js.Any.fromFunction1(setCurrentTime), setTour = js.Any.fromFunction1(setTour))
    __obj.asInstanceOf[GETourPlayer]
  }
  
  @scala.inline
  implicit class GETourPlayerMutableBuilder[Self <: GETourPlayer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetCurrentTime(value: () => Double): Self = StObject.set(x, "getCurrentTime", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetDuration(value: () => Double): Self = StObject.set(x, "getDuration", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPause(value: () => Unit): Self = StObject.set(x, "pause", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPlay(value: () => Unit): Self = StObject.set(x, "play", js.Any.fromFunction0(value))
    
    @scala.inline
    def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetCurrentTime(value: Double => Unit): Self = StObject.set(x, "setCurrentTime", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetTour(value: KmlTour => Unit): Self = StObject.set(x, "setTour", js.Any.fromFunction1(value))
  }
}
