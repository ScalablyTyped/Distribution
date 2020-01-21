package typings.firebase.mod.remoteConfig

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemoteConfig extends js.Object {
  /**
    * Object containing default values for conigs.
    */
  var defaultConfig: StringDictionary[String | Double | Boolean]
  /**
    * The Unix timestamp in milliseconds of the last <i>successful</i> fetch, or negative one if
    * the {@link RemoteConfig} instance either hasn't fetched or initialization
    * is incomplete.
    */
  var fetchTimeMillis: Double
  /**
    * The status of the last fetch <i>attempt</i>.
    */
  var lastFetchStatus: FetchStatus
  /**
    * Defines configuration for the Remote Config SDK.
    */
  var settings: Settings
  /**
    * Makes the last fetched config available to the getters.
    * Returns a promise which resolves to true if the current call activated the fetched configs.
    * If the fetched configs were already activated, the promise will resolve to false.
    */
  def activate(): js.Promise[Boolean]
  /**
    * Ensures the last activated config are available to the getters.
    */
  def ensureInitialized(): js.Promise[Unit]
  /**
    * Fetches and caches configuration from the Remote Config service.
    */
  def fetch(): js.Promise[Unit]
  /**
    * Performs fetch and activate operations, as a convenience.
    * Returns a promise which resolves to true if the current call activated the fetched configs.
    * If the fetched configs were already activated, the promise will resolve to false.
    */
  def fetchAndActivate(): js.Promise[Boolean]
  /**
    * Gets all config.
    */
  def getAll(): StringDictionary[Value]
  /**
    * Gets the value for the given key as a boolean.
    *
    * Convenience method for calling <code>remoteConfig.getValue(key).asBoolean()</code>.
    */
  def getBoolean(key: String): Boolean
  /**
    * Gets the value for the given key as a number.
    *
    * Convenience method for calling <code>remoteConfig.getValue(key).asNumber()</code>.
    */
  def getNumber(key: String): Double
  /**
    * Gets the value for the given key as a String.
    *
    * Convenience method for calling <code>remoteConfig.getValue(key).asString()</code>.
    */
  def getString(key: String): String
  /**
    * Gets the {@link Value} for the given key.
    */
  def getValue(key: String): Value
  /**
    * Defines the log level to use.
    */
  def setLogLevel(logLevel: LogLevel): Unit
}

object RemoteConfig {
  @scala.inline
  def apply(
    activate: () => js.Promise[Boolean],
    defaultConfig: StringDictionary[String | Double | Boolean],
    ensureInitialized: () => js.Promise[Unit],
    fetch: () => js.Promise[Unit],
    fetchAndActivate: () => js.Promise[Boolean],
    fetchTimeMillis: Double,
    getAll: () => StringDictionary[Value],
    getBoolean: String => Boolean,
    getNumber: String => Double,
    getString: String => String,
    getValue: String => Value,
    lastFetchStatus: FetchStatus,
    setLogLevel: LogLevel => Unit,
    settings: Settings
  ): RemoteConfig = {
    val __obj = js.Dynamic.literal(activate = js.Any.fromFunction0(activate), defaultConfig = defaultConfig.asInstanceOf[js.Any], ensureInitialized = js.Any.fromFunction0(ensureInitialized), fetch = js.Any.fromFunction0(fetch), fetchAndActivate = js.Any.fromFunction0(fetchAndActivate), fetchTimeMillis = fetchTimeMillis.asInstanceOf[js.Any], getAll = js.Any.fromFunction0(getAll), getBoolean = js.Any.fromFunction1(getBoolean), getNumber = js.Any.fromFunction1(getNumber), getString = js.Any.fromFunction1(getString), getValue = js.Any.fromFunction1(getValue), lastFetchStatus = lastFetchStatus.asInstanceOf[js.Any], setLogLevel = js.Any.fromFunction1(setLogLevel), settings = settings.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RemoteConfig]
  }
}

