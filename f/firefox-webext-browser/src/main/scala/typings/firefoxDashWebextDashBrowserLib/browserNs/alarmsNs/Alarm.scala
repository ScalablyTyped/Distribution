package typings
package firefoxDashWebextDashBrowserLib.browserNs.alarmsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* alarms types */

trait Alarm extends js.Object {
  /** Name of this alarm. */
  var name: java.lang.String
  /** When present, signals that the alarm triggers periodically after so many minutes. */
  var periodInMinutes: js.UndefOr[scala.Double] = js.undefined
  /** Time when the alarm is scheduled to fire, in milliseconds past the epoch. */
  var scheduledTime: scala.Double
}

