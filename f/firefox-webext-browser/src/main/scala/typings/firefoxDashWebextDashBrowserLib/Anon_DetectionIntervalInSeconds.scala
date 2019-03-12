package typings
package firefoxDashWebextDashBrowserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DetectionIntervalInSeconds extends js.Object {
  /* idle events */
  /**
    * Fired when the system changes to an active or idle state. The event fires with "idle" if the the user has not
    * generated any input for a specified number of seconds, and "active" when the user generates input on an idle
    * system.
    */
  val onStateChanged: WebExtEvent[
    js.Function1[
      /* newState */ firefoxDashWebextDashBrowserLib.browserNs.idleNs.IdleState, 
      scala.Unit
    ]
  ]
  /* idle functions */
  /**
    * Returns "idle" if the user has not generated any input for a specified number of seconds, or "active" otherwise.
    * @param detectionIntervalInSeconds The system is considered idle if detectionIntervalInSeconds seconds have
    *     elapsed since the last user input detected.
    */
  def queryState(detectionIntervalInSeconds: scala.Double): js.Promise[firefoxDashWebextDashBrowserLib.browserNs.idleNs.IdleState]
  /**
    * Sets the interval, in seconds, used to determine when the system is in an idle state for onStateChanged events.
    * The default interval is 60 seconds.
    * @param intervalInSeconds Threshold, in seconds, used to determine when the system is in an idle state.
    */
  def setDetectionInterval(intervalInSeconds: scala.Double): scala.Unit
}

object Anon_DetectionIntervalInSeconds {
  @scala.inline
  def apply(
    onStateChanged: WebExtEvent[
      js.Function1[
        /* newState */ firefoxDashWebextDashBrowserLib.browserNs.idleNs.IdleState, 
        scala.Unit
      ]
    ],
    queryState: scala.Double => js.Promise[firefoxDashWebextDashBrowserLib.browserNs.idleNs.IdleState],
    setDetectionInterval: scala.Double => scala.Unit
  ): Anon_DetectionIntervalInSeconds = {
    val __obj = js.Dynamic.literal(onStateChanged = onStateChanged, queryState = js.Any.fromFunction1(queryState), setDetectionInterval = js.Any.fromFunction1(setDetectionInterval))
  
    __obj.asInstanceOf[Anon_DetectionIntervalInSeconds]
  }
}

