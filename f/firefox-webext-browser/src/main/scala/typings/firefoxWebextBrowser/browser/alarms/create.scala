package typings.firefoxWebextBrowser.browser.alarms

import typings.firefoxWebextBrowser.AnonDelayInMinutes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.alarms.create")
@js.native
object create extends js.Object {
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
  def apply(alarmInfo: AnonDelayInMinutes): Unit = js.native
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
  def apply(name: String, alarmInfo: AnonDelayInMinutes): Unit = js.native
}

