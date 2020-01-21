package typings.googleEarth.google.earth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.earth.GETourPlayer")
@js.native
class GETourPlayer () extends js.Object {
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

