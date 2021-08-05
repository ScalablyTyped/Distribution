package typings.firefoxWebextBrowser.global.browser

import typings.firefoxWebextBrowser.WebExtEvent
import typings.firefoxWebextBrowser.browser.alarms.Alarm
import typings.firefoxWebextBrowser.browser.alarms.CreateAlarmInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Permissions: `alarms`
  *
  * Not allowed in: Content scripts, Devtools pages
  */
object alarms {
  
  @JSGlobal("browser.alarms")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Clears the alarm with the given name.
    * @param [name] The name of the alarm to clear. Defaults to the empty string.
    */
  inline def clear(): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("clear")().asInstanceOf[js.Promise[Boolean]]
  inline def clear(name: String): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("clear")(name.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
  
  /** Clears all alarms. */
  inline def clearAll(): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("clearAll")().asInstanceOf[js.Promise[Boolean]]
  
  /* alarms functions */
  /**
    * Creates an alarm. After the delay is expired, the onAlarm event is fired. If there is another alarm with the same name (or no name if none is specified), it will be cancelled and replaced by this alarm.
    * @param alarmInfo Details about the alarm. The alarm first fires either at 'when' milliseconds past the epoch (if 'when' is provided), after 'delayInMinutes' minutes from the current time (if 'delayInMinutes' is provided instead), or after 'periodInMinutes' minutes from the current time (if only 'periodInMinutes' is provided). Users should never provide both 'when' and 'delayInMinutes'. If 'periodInMinutes' is provided, then the alarm recurs repeatedly after that many minutes.
    */
  inline def create(alarmInfo: CreateAlarmInfo): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(alarmInfo.asInstanceOf[js.Any]).asInstanceOf[Unit]
  /**
    * Creates an alarm. After the delay is expired, the onAlarm event is fired. If there is another alarm with the same name (or no name if none is specified), it will be cancelled and replaced by this alarm.
    * @param name Optional name to identify this alarm. Defaults to the empty string.
    * @param alarmInfo Details about the alarm. The alarm first fires either at 'when' milliseconds past the epoch (if 'when' is provided), after 'delayInMinutes' minutes from the current time (if 'delayInMinutes' is provided instead), or after 'periodInMinutes' minutes from the current time (if only 'periodInMinutes' is provided). Users should never provide both 'when' and 'delayInMinutes'. If 'periodInMinutes' is provided, then the alarm recurs repeatedly after that many minutes.
    */
  inline def create(name: String, alarmInfo: CreateAlarmInfo): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any], alarmInfo.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Retrieves details about the specified alarm.
    * @param [name] The name of the alarm to get. Defaults to the empty string.
    */
  inline def get(): js.Promise[js.UndefOr[Alarm]] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")().asInstanceOf[js.Promise[js.UndefOr[Alarm]]]
  inline def get(name: String): js.Promise[js.UndefOr[Alarm]] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[Alarm]]]
  
  /** Gets an array of all the alarms. */
  inline def getAll(): js.Promise[js.Array[Alarm]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAll")().asInstanceOf[js.Promise[js.Array[Alarm]]]
  
  /* alarms events */
  /**
    * Fired when an alarm has expired. Useful for transient background pages.
    * @param name The alarm that has expired.
    */
  @JSGlobal("browser.alarms.onAlarm")
  @js.native
  val onAlarm: WebExtEvent[js.Function1[/* name */ Alarm, Unit]] = js.native
}
