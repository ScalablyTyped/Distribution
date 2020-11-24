package typings.firebaseRemoteConfigTypes.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RemoteConfig extends js.Object {
  
  /**
    * Makes the last fetched config available to the getters.
    * Returns a promise which resolves to true if the current call activated the fetched configs.
    * If the fetched configs were already activated, the promise will resolve to false.
    */
  def activate(): js.Promise[Boolean] = js.native
  
  /**
    * Object containing default values for conigs.
    */
  var defaultConfig: StringDictionary[String | Double | Boolean] = js.native
  
  /**
    * Ensures the last activated config are available to the getters.
    */
  def ensureInitialized(): js.Promise[Unit] = js.native
  
  /**
    * Fetches and caches configuration from the Remote Config service.
    */
  def fetch(): js.Promise[Unit] = js.native
  
  /**
    * Performs fetch and activate operations, as a convenience.
    * Returns a promise which resolves to true if the current call activated the fetched configs.
    * If the fetched configs were already activated, the promise will resolve to false.
    */
  def fetchAndActivate(): js.Promise[Boolean] = js.native
  
  /**
    * The Unix timestamp in milliseconds of the last <i>successful</i> fetch, or negative one if
    * the {@link RemoteConfig} instance either hasn't fetched or initialization
    * is incomplete.
    */
  var fetchTimeMillis: Double = js.native
  
  /**
    * Gets all config.
    */
  def getAll(): StringDictionary[Value] = js.native
  
  /**
    * Gets the value for the given key as a boolean.
    *
    * Convenience method for calling <code>remoteConfig.getValue(key).asBoolean()</code>.
    */
  def getBoolean(key: String): Boolean = js.native
  
  /**
    * Gets the value for the given key as a number.
    *
    * Convenience method for calling <code>remoteConfig.getValue(key).asNumber()</code>.
    */
  def getNumber(key: String): Double = js.native
  
  /**
    * Gets the value for the given key as a String.
    *
    * Convenience method for calling <code>remoteConfig.getValue(key).asString()</code>.
    */
  def getString(key: String): String = js.native
  
  /**
    * Gets the {@link Value} for the given key.
    */
  def getValue(key: String): Value = js.native
  
  /**
    * The status of the last fetch <i>attempt</i>.
    */
  var lastFetchStatus: FetchStatus = js.native
  
  /**
    * Defines the log level to use.
    */
  def setLogLevel(logLevel: LogLevel): Unit = js.native
  
  /**
    * Defines configuration for the Remote Config SDK.
    */
  var settings: Settings = js.native
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
  
  @scala.inline
  implicit class RemoteConfigOps[Self <: RemoteConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setActivate(value: () => js.Promise[Boolean]): Self = this.set("activate", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDefaultConfig(value: StringDictionary[String | Double | Boolean]): Self = this.set("defaultConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnsureInitialized(value: () => js.Promise[Unit]): Self = this.set("ensureInitialized", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFetch(value: () => js.Promise[Unit]): Self = this.set("fetch", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFetchAndActivate(value: () => js.Promise[Boolean]): Self = this.set("fetchAndActivate", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFetchTimeMillis(value: Double): Self = this.set("fetchTimeMillis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetAll(value: () => StringDictionary[Value]): Self = this.set("getAll", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetBoolean(value: String => Boolean): Self = this.set("getBoolean", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetNumber(value: String => Double): Self = this.set("getNumber", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetString(value: String => String): Self = this.set("getString", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetValue(value: String => Value): Self = this.set("getValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLastFetchStatus(value: FetchStatus): Self = this.set("lastFetchStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetLogLevel(value: LogLevel => Unit): Self = this.set("setLogLevel", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSettings(value: Settings): Self = this.set("settings", value.asInstanceOf[js.Any])
  }
}
