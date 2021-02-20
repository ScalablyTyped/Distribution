package typings.firebase.mod.default

import org.scalablytyped.runtime.StringDictionary
import typings.firebase.mod.firebase.app.App
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @webonly
  */
object remoteConfig {
  
  /**
    * Gets the {@link firebase.remoteConfig.RemoteConfig `RemoteConfig`} instance.
    *
    * @webonly
    *
    * @example
    * ```javascript
    * // Get the RemoteConfig instance for the default app
    * const defaultRemoteConfig = firebase.remoteConfig();
    * ```
    *
    * @param app The app to create a Remote Config service for. If not passed, uses the default app.
    */
  @JSImport("firebase", "default.remoteConfig")
  @js.native
  def apply(): typings.firebase.mod.firebase.remoteConfig.RemoteConfig = js.native
  @JSImport("firebase", "default.remoteConfig")
  @js.native
  def apply(app: App): typings.firebase.mod.firebase.remoteConfig.RemoteConfig = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.firebase.firebaseStrings.`no-fetch-yet`
    - typings.firebase.firebaseStrings.success
    - typings.firebase.firebaseStrings.failure
    - typings.firebase.firebaseStrings.throttle
  */
  trait FetchStatus extends StObject
  object FetchStatus {
    
    @scala.inline
    def failure: typings.firebase.firebaseStrings.failure = "failure".asInstanceOf[typings.firebase.firebaseStrings.failure]
    
    @scala.inline
    def `no-fetch-yet`: typings.firebase.firebaseStrings.`no-fetch-yet` = "no-fetch-yet".asInstanceOf[typings.firebase.firebaseStrings.`no-fetch-yet`]
    
    @scala.inline
    def success: typings.firebase.firebaseStrings.success = "success".asInstanceOf[typings.firebase.firebaseStrings.success]
    
    @scala.inline
    def throttle: typings.firebase.firebaseStrings.throttle = "throttle".asInstanceOf[typings.firebase.firebaseStrings.throttle]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.firebase.firebaseStrings.debug
    - typings.firebase.firebaseStrings.error
    - typings.firebase.firebaseStrings.silent
  */
  trait LogLevel extends StObject
  object LogLevel {
    
    @scala.inline
    def debug: typings.firebase.firebaseStrings.debug = "debug".asInstanceOf[typings.firebase.firebaseStrings.debug]
    
    @scala.inline
    def error: typings.firebase.firebaseStrings.error = "error".asInstanceOf[typings.firebase.firebaseStrings.error]
    
    @scala.inline
    def silent: typings.firebase.firebaseStrings.silent = "silent".asInstanceOf[typings.firebase.firebaseStrings.silent]
  }
  
  @js.native
  trait RemoteConfig extends StObject {
    
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
    def getAll(): StringDictionary[typings.firebase.mod.firebase.remoteConfig.Value] = js.native
    
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
    def getValue(key: String): typings.firebase.mod.firebase.remoteConfig.Value = js.native
    
    /**
      * The status of the last fetch <i>attempt</i>.
      */
    var lastFetchStatus: typings.firebase.mod.firebase.remoteConfig.FetchStatus = js.native
    
    /**
      * Defines the log level to use.
      */
    def setLogLevel(logLevel: typings.firebase.mod.firebase.remoteConfig.LogLevel): Unit = js.native
    
    /**
      * Defines configuration for the Remote Config SDK.
      */
    var settings: typings.firebase.mod.firebase.remoteConfig.Settings = js.native
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
      getAll: () => StringDictionary[typings.firebase.mod.firebase.remoteConfig.Value],
      getBoolean: String => Boolean,
      getNumber: String => Double,
      getString: String => String,
      getValue: String => typings.firebase.mod.firebase.remoteConfig.Value,
      lastFetchStatus: typings.firebase.mod.firebase.remoteConfig.FetchStatus,
      setLogLevel: typings.firebase.mod.firebase.remoteConfig.LogLevel => Unit,
      settings: typings.firebase.mod.firebase.remoteConfig.Settings
    ): RemoteConfig = {
      val __obj = js.Dynamic.literal(activate = js.Any.fromFunction0(activate), defaultConfig = defaultConfig.asInstanceOf[js.Any], ensureInitialized = js.Any.fromFunction0(ensureInitialized), fetch = js.Any.fromFunction0(fetch), fetchAndActivate = js.Any.fromFunction0(fetchAndActivate), fetchTimeMillis = fetchTimeMillis.asInstanceOf[js.Any], getAll = js.Any.fromFunction0(getAll), getBoolean = js.Any.fromFunction1(getBoolean), getNumber = js.Any.fromFunction1(getNumber), getString = js.Any.fromFunction1(getString), getValue = js.Any.fromFunction1(getValue), lastFetchStatus = lastFetchStatus.asInstanceOf[js.Any], setLogLevel = js.Any.fromFunction1(setLogLevel), settings = settings.asInstanceOf[js.Any])
      __obj.asInstanceOf[RemoteConfig]
    }
    
    @scala.inline
    implicit class RemoteConfigMutableBuilder[Self <: RemoteConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActivate(value: () => js.Promise[Boolean]): Self = StObject.set(x, "activate", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDefaultConfig(value: StringDictionary[String | Double | Boolean]): Self = StObject.set(x, "defaultConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnsureInitialized(value: () => js.Promise[Unit]): Self = StObject.set(x, "ensureInitialized", js.Any.fromFunction0(value))
      
      @scala.inline
      def setFetch(value: () => js.Promise[Unit]): Self = StObject.set(x, "fetch", js.Any.fromFunction0(value))
      
      @scala.inline
      def setFetchAndActivate(value: () => js.Promise[Boolean]): Self = StObject.set(x, "fetchAndActivate", js.Any.fromFunction0(value))
      
      @scala.inline
      def setFetchTimeMillis(value: Double): Self = StObject.set(x, "fetchTimeMillis", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetAll(value: () => StringDictionary[typings.firebase.mod.firebase.remoteConfig.Value]): Self = StObject.set(x, "getAll", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetBoolean(value: String => Boolean): Self = StObject.set(x, "getBoolean", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetNumber(value: String => Double): Self = StObject.set(x, "getNumber", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetString(value: String => String): Self = StObject.set(x, "getString", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetValue(value: String => typings.firebase.mod.firebase.remoteConfig.Value): Self = StObject.set(x, "getValue", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLastFetchStatus(value: typings.firebase.mod.firebase.remoteConfig.FetchStatus): Self = StObject.set(x, "lastFetchStatus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetLogLevel(value: typings.firebase.mod.firebase.remoteConfig.LogLevel => Unit): Self = StObject.set(x, "setLogLevel", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSettings(value: typings.firebase.mod.firebase.remoteConfig.Settings): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Settings extends StObject {
    
    /**
      * Defines the maximum amount of milliseconds to wait for a response when fetching
      * configuration from the Remote Config server. Defaults to 60000 (One minute).
      */
    var fetchTimeoutMillis: Double = js.native
    
    /**
      * Defines the maximum age in milliseconds of an entry in the config cache before
      * it is considered stale. Defaults to 43200000 (Twelve hours).
      */
    var minimumFetchIntervalMillis: Double = js.native
  }
  object Settings {
    
    @scala.inline
    def apply(fetchTimeoutMillis: Double, minimumFetchIntervalMillis: Double): Settings = {
      val __obj = js.Dynamic.literal(fetchTimeoutMillis = fetchTimeoutMillis.asInstanceOf[js.Any], minimumFetchIntervalMillis = minimumFetchIntervalMillis.asInstanceOf[js.Any])
      __obj.asInstanceOf[Settings]
    }
    
    @scala.inline
    implicit class SettingsMutableBuilder[Self <: Settings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFetchTimeoutMillis(value: Double): Self = StObject.set(x, "fetchTimeoutMillis", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinimumFetchIntervalMillis(value: Double): Self = StObject.set(x, "minimumFetchIntervalMillis", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Value extends StObject {
    
    /**
      * Gets the value as a boolean.
      *
      * The following values (case insensitive) are interpreted as true:
      * "1", "true", "t", "yes", "y", "on". Other values are interpreted as false.
      */
    def asBoolean(): Boolean = js.native
    
    /**
      * Gets the value as a number. Comparable to calling <code>Number(value) || 0</code>.
      */
    def asNumber(): Double = js.native
    
    /**
      * Gets the value as a string.
      */
    def asString(): String = js.native
    
    /**
      * Gets the {@link ValueSource} for the given key.
      */
    def getSource(): typings.firebase.mod.firebase.remoteConfig.ValueSource = js.native
  }
  object Value {
    
    @scala.inline
    def apply(
      asBoolean: () => Boolean,
      asNumber: () => Double,
      asString: () => String,
      getSource: () => typings.firebase.mod.firebase.remoteConfig.ValueSource
    ): Value = {
      val __obj = js.Dynamic.literal(asBoolean = js.Any.fromFunction0(asBoolean), asNumber = js.Any.fromFunction0(asNumber), asString = js.Any.fromFunction0(asString), getSource = js.Any.fromFunction0(getSource))
      __obj.asInstanceOf[Value]
    }
    
    @scala.inline
    implicit class ValueMutableBuilder[Self <: Value] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAsBoolean(value: () => Boolean): Self = StObject.set(x, "asBoolean", js.Any.fromFunction0(value))
      
      @scala.inline
      def setAsNumber(value: () => Double): Self = StObject.set(x, "asNumber", js.Any.fromFunction0(value))
      
      @scala.inline
      def setAsString(value: () => String): Self = StObject.set(x, "asString", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetSource(value: () => typings.firebase.mod.firebase.remoteConfig.ValueSource): Self = StObject.set(x, "getSource", js.Any.fromFunction0(value))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.firebase.firebaseStrings.static
    - typings.firebase.firebaseStrings.default
    - typings.firebase.firebaseStrings.remote
  */
  trait ValueSource extends StObject
  object ValueSource {
    
    @scala.inline
    def default: typings.firebase.firebaseStrings.default = "default".asInstanceOf[typings.firebase.firebaseStrings.default]
    
    @scala.inline
    def remote: typings.firebase.firebaseStrings.remote = "remote".asInstanceOf[typings.firebase.firebaseStrings.remote]
    
    @scala.inline
    def static: typings.firebase.firebaseStrings.static = "static".asInstanceOf[typings.firebase.firebaseStrings.static]
  }
}
