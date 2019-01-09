package typings
package firefoxDashWebextDashBrowserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_AlarmInfo extends js.Object {
  /* alarms events */
  /**
    * Fired when an alarm has expired. Useful for transient background pages.
    * @param name The alarm that has expired.
    */
  val onAlarm: WebExtEvent[
    js.Function1[/* name */ firefoxDashWebextDashBrowserLib.browserNs.alarmsNs.Alarm, scala.Unit]
  ] = js.native
  /**
    * Clears the alarm with the given name.
    * @param [name] The name of the alarm to clear. Defaults to the empty string.
    */
  def clear(): js.Promise[scala.Boolean] = js.native
  def clear(name: java.lang.String): js.Promise[scala.Boolean] = js.native
  /** Clears all alarms. */
  def clearAll(): js.Promise[scala.Boolean] = js.native
  /* alarms functions */
  /**
    * Creates an alarm. After the delay is expired, the onAlarm event is fired. If there is another alarm with the
    * same name (or no name if none is specified), it will be cancelled and replaced by this alarm.
    * @param alarmInfo Details about the alarm. The alarm first fires either at 'when' milliseconds past the epoch (if
    *     'when' is provided), after 'delayInMinutes' minutes from the current time (if 'delayInMinutes' is provided
    *     instead), or after 'periodInMinutes' minutes from the current time (if only 'periodInMinutes' is provided).
    *     Users should never provide both 'when' and 'delayInMinutes'. If 'periodInMinutes' is provided, then the
    *     alarm recurs repeatedly after that many minutes.
    */
  def create(alarmInfo: Anon_DelayInMinutes): scala.Unit = js.native
  /**
    * Creates an alarm. After the delay is expired, the onAlarm event is fired. If there is another alarm with the
    * same name (or no name if none is specified), it will be cancelled and replaced by this alarm.
    * @param name Optional name to identify this alarm. Defaults to the empty string.
    * @param alarmInfo Details about the alarm. The alarm first fires either at 'when' milliseconds past the epoch (if
    *     'when' is provided), after 'delayInMinutes' minutes from the current time (if 'delayInMinutes' is provided
    *     instead), or after 'periodInMinutes' minutes from the current time (if only 'periodInMinutes' is provided).
    *     Users should never provide both 'when' and 'delayInMinutes'. If 'periodInMinutes' is provided, then the
    *     alarm recurs repeatedly after that many minutes.
    */
  def create(name: java.lang.String, alarmInfo: Anon_DelayInMinutes): scala.Unit = js.native
  /**
    * Retrieves details about the specified alarm.
    * @param [name] The name of the alarm to get. Defaults to the empty string.
    */
  def get(): js.Promise[firefoxDashWebextDashBrowserLib.browserNs.alarmsNs.Alarm] = js.native
  def get(name: java.lang.String): js.Promise[firefoxDashWebextDashBrowserLib.browserNs.alarmsNs.Alarm] = js.native
  /** Gets an array of all the alarms. */
  def getAll(): js.Promise[js.Array[firefoxDashWebextDashBrowserLib.browserNs.alarmsNs.Alarm]] = js.native
}

