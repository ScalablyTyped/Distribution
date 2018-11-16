package typings
package googleDashEarthLib.googleNs.earthNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.earth.GETourPlayer")
@js.native
class GETourPlayer () extends js.Object {
  /**
       * The current elapsed playing time of the active tour, in seconds.
       */
  def getCurrentTime(): scala.Double = js.native
  /**
       * The total duration of the active tour, in seconds. If no tour is loaded, the behavior of this method is undefined.
       */
  def getDuration(): scala.Double = js.native
  /**
       * Pauses the currently active tour.
       */
  def pause(): scala.Unit = js.native
  /**
       * Plays the currently active tour.
       */
  def play(): scala.Unit = js.native
  /**
       * Resets the currently active tour, stopping playback and rewinding to the start of the tour.
       */
  def reset(): scala.Unit = js.native
  /**
       * The current elapsed playing time of the active tour, in seconds.
       */
  def setCurrentTime(currentTime: scala.Double): scala.Unit = js.native
  /**
       * Enters the given tour object, exiting any other currently active tour.
       * This method does not automatically begin playing the tour. 
       * If the argument is null, then any currently active tour is exited and normal globe navigation is enabled.
       */
  def setTour(tour: KmlTour): scala.Unit = js.native
}

