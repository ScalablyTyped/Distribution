package typings.firebaseRemoteConfigTypes

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.firebaseRemoteConfigTypes.firebaseRemoteConfigTypesStrings.`no-fetch-yet`
    - typings.firebaseRemoteConfigTypes.firebaseRemoteConfigTypesStrings.success
    - typings.firebaseRemoteConfigTypes.firebaseRemoteConfigTypesStrings.failure
    - typings.firebaseRemoteConfigTypes.firebaseRemoteConfigTypesStrings.throttle
  */
  trait FetchStatus extends StObject
  object FetchStatus {
    
    @scala.inline
    def failure: typings.firebaseRemoteConfigTypes.firebaseRemoteConfigTypesStrings.failure = "failure".asInstanceOf[typings.firebaseRemoteConfigTypes.firebaseRemoteConfigTypesStrings.failure]
    
    @scala.inline
    def `no-fetch-yet`: typings.firebaseRemoteConfigTypes.firebaseRemoteConfigTypesStrings.`no-fetch-yet` = "no-fetch-yet".asInstanceOf[typings.firebaseRemoteConfigTypes.firebaseRemoteConfigTypesStrings.`no-fetch-yet`]
    
    @scala.inline
    def success: typings.firebaseRemoteConfigTypes.firebaseRemoteConfigTypesStrings.success = "success".asInstanceOf[typings.firebaseRemoteConfigTypes.firebaseRemoteConfigTypesStrings.success]
    
    @scala.inline
    def throttle: typings.firebaseRemoteConfigTypes.firebaseRemoteConfigTypesStrings.throttle = "throttle".asInstanceOf[typings.firebaseRemoteConfigTypes.firebaseRemoteConfigTypesStrings.throttle]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.firebaseRemoteConfigTypes.firebaseRemoteConfigTypesStrings.debug
    - typings.firebaseRemoteConfigTypes.firebaseRemoteConfigTypesStrings.error
    - typings.firebaseRemoteConfigTypes.firebaseRemoteConfigTypesStrings.silent
  */
  trait LogLevel extends StObject
  object LogLevel {
    
    @scala.inline
    def debug: typings.firebaseRemoteConfigTypes.firebaseRemoteConfigTypesStrings.debug = "debug".asInstanceOf[typings.firebaseRemoteConfigTypes.firebaseRemoteConfigTypesStrings.debug]
    
    @scala.inline
    def error: typings.firebaseRemoteConfigTypes.firebaseRemoteConfigTypesStrings.error = "error".asInstanceOf[typings.firebaseRemoteConfigTypes.firebaseRemoteConfigTypesStrings.error]
    
    @scala.inline
    def silent: typings.firebaseRemoteConfigTypes.firebaseRemoteConfigTypesStrings.silent = "silent".asInstanceOf[typings.firebaseRemoteConfigTypes.firebaseRemoteConfigTypesStrings.silent]
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
      def setGetAll(value: () => StringDictionary[Value]): Self = StObject.set(x, "getAll", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetBoolean(value: String => Boolean): Self = StObject.set(x, "getBoolean", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetNumber(value: String => Double): Self = StObject.set(x, "getNumber", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetString(value: String => String): Self = StObject.set(x, "getString", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetValue(value: String => Value): Self = StObject.set(x, "getValue", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLastFetchStatus(value: FetchStatus): Self = StObject.set(x, "lastFetchStatus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetLogLevel(value: LogLevel => Unit): Self = StObject.set(x, "setLogLevel", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSettings(value: Settings): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
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
    def getSource(): ValueSource = js.native
  }
  object Value {
    
    @scala.inline
    def apply(
      asBoolean: () => Boolean,
      asNumber: () => Double,
      asString: () => String,
      getSource: () => ValueSource
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
      def setGetSource(value: () => ValueSource): Self = StObject.set(x, "getSource", js.Any.fromFunction0(value))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.firebaseRemoteConfigTypes.firebaseRemoteConfigTypesStrings.static
    - typings.firebaseRemoteConfigTypes.firebaseRemoteConfigTypesStrings.default
    - typings.firebaseRemoteConfigTypes.firebaseRemoteConfigTypesStrings.remote
  */
  trait ValueSource extends StObject
  object ValueSource {
    
    @scala.inline
    def default: typings.firebaseRemoteConfigTypes.firebaseRemoteConfigTypesStrings.default = "default".asInstanceOf[typings.firebaseRemoteConfigTypes.firebaseRemoteConfigTypesStrings.default]
    
    @scala.inline
    def remote: typings.firebaseRemoteConfigTypes.firebaseRemoteConfigTypesStrings.remote = "remote".asInstanceOf[typings.firebaseRemoteConfigTypes.firebaseRemoteConfigTypesStrings.remote]
    
    @scala.inline
    def static: typings.firebaseRemoteConfigTypes.firebaseRemoteConfigTypesStrings.static = "static".asInstanceOf[typings.firebaseRemoteConfigTypes.firebaseRemoteConfigTypesStrings.static]
  }
  
  object firebaseComponentAugmentingMod {
    
    @js.native
    trait NameServiceMapping extends StObject {
      
      var remoteConfig: RemoteConfig = js.native
    }
    object NameServiceMapping {
      
      @scala.inline
      def apply(remoteConfig: RemoteConfig): NameServiceMapping = {
        val __obj = js.Dynamic.literal(remoteConfig = remoteConfig.asInstanceOf[js.Any])
        __obj.asInstanceOf[NameServiceMapping]
      }
      
      @scala.inline
      implicit class NameServiceMappingMutableBuilder[Self <: NameServiceMapping] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setRemoteConfig(value: RemoteConfig): Self = StObject.set(x, "remoteConfig", value.asInstanceOf[js.Any])
      }
    }
  }
}
