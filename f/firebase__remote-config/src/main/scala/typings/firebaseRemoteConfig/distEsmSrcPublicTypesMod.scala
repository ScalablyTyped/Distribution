package typings.firebaseRemoteConfig

import org.scalablytyped.runtime.StringDictionary
import typings.firebaseApp.mod.FirebaseApp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsmSrcPublicTypesMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.firebaseRemoteConfig.firebaseRemoteConfigStrings.`no-fetch-yet`
    - typings.firebaseRemoteConfig.firebaseRemoteConfigStrings.success
    - typings.firebaseRemoteConfig.firebaseRemoteConfigStrings.failure
    - typings.firebaseRemoteConfig.firebaseRemoteConfigStrings.throttle
  */
  trait FetchStatus extends StObject
  object FetchStatus {
    
    inline def failure: typings.firebaseRemoteConfig.firebaseRemoteConfigStrings.failure = "failure".asInstanceOf[typings.firebaseRemoteConfig.firebaseRemoteConfigStrings.failure]
    
    inline def `no-fetch-yet`: typings.firebaseRemoteConfig.firebaseRemoteConfigStrings.`no-fetch-yet` = "no-fetch-yet".asInstanceOf[typings.firebaseRemoteConfig.firebaseRemoteConfigStrings.`no-fetch-yet`]
    
    inline def success: typings.firebaseRemoteConfig.firebaseRemoteConfigStrings.success = "success".asInstanceOf[typings.firebaseRemoteConfig.firebaseRemoteConfigStrings.success]
    
    inline def throttle: typings.firebaseRemoteConfig.firebaseRemoteConfigStrings.throttle = "throttle".asInstanceOf[typings.firebaseRemoteConfig.firebaseRemoteConfigStrings.throttle]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.firebaseRemoteConfig.firebaseRemoteConfigStrings.debug
    - typings.firebaseRemoteConfig.firebaseRemoteConfigStrings.error
    - typings.firebaseRemoteConfig.firebaseRemoteConfigStrings.silent
  */
  trait LogLevel extends StObject
  object LogLevel {
    
    inline def debug: typings.firebaseRemoteConfig.firebaseRemoteConfigStrings.debug = "debug".asInstanceOf[typings.firebaseRemoteConfig.firebaseRemoteConfigStrings.debug]
    
    inline def error: typings.firebaseRemoteConfig.firebaseRemoteConfigStrings.error = "error".asInstanceOf[typings.firebaseRemoteConfig.firebaseRemoteConfigStrings.error]
    
    inline def silent: typings.firebaseRemoteConfig.firebaseRemoteConfigStrings.silent = "silent".asInstanceOf[typings.firebaseRemoteConfig.firebaseRemoteConfigStrings.silent]
  }
  
  trait RemoteConfig extends StObject {
    
    /**
      * The {@link @firebase/app#FirebaseApp} this `RemoteConfig` instance is associated with.
      */
    var app: FirebaseApp
    
    /**
      * Object containing default values for configs.
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
    var settings: RemoteConfigSettings
  }
  object RemoteConfig {
    
    inline def apply(
      app: FirebaseApp,
      defaultConfig: StringDictionary[String | Double | Boolean],
      fetchTimeMillis: Double,
      lastFetchStatus: FetchStatus,
      settings: RemoteConfigSettings
    ): RemoteConfig = {
      val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any], defaultConfig = defaultConfig.asInstanceOf[js.Any], fetchTimeMillis = fetchTimeMillis.asInstanceOf[js.Any], lastFetchStatus = lastFetchStatus.asInstanceOf[js.Any], settings = settings.asInstanceOf[js.Any])
      __obj.asInstanceOf[RemoteConfig]
    }
    
    extension [Self <: RemoteConfig](x: Self) {
      
      inline def setApp(value: FirebaseApp): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
      
      inline def setDefaultConfig(value: StringDictionary[String | Double | Boolean]): Self = StObject.set(x, "defaultConfig", value.asInstanceOf[js.Any])
      
      inline def setFetchTimeMillis(value: Double): Self = StObject.set(x, "fetchTimeMillis", value.asInstanceOf[js.Any])
      
      inline def setLastFetchStatus(value: FetchStatus): Self = StObject.set(x, "lastFetchStatus", value.asInstanceOf[js.Any])
      
      inline def setSettings(value: RemoteConfigSettings): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
    }
  }
  
  trait RemoteConfigSettings extends StObject {
    
    /**
      * Defines the maximum amount of milliseconds to wait for a response when fetching
      * configuration from the Remote Config server. Defaults to 60000 (One minute).
      */
    var fetchTimeoutMillis: Double
    
    /**
      * Defines the maximum age in milliseconds of an entry in the config cache before
      * it is considered stale. Defaults to 43200000 (Twelve hours).
      */
    var minimumFetchIntervalMillis: Double
  }
  object RemoteConfigSettings {
    
    inline def apply(fetchTimeoutMillis: Double, minimumFetchIntervalMillis: Double): RemoteConfigSettings = {
      val __obj = js.Dynamic.literal(fetchTimeoutMillis = fetchTimeoutMillis.asInstanceOf[js.Any], minimumFetchIntervalMillis = minimumFetchIntervalMillis.asInstanceOf[js.Any])
      __obj.asInstanceOf[RemoteConfigSettings]
    }
    
    extension [Self <: RemoteConfigSettings](x: Self) {
      
      inline def setFetchTimeoutMillis(value: Double): Self = StObject.set(x, "fetchTimeoutMillis", value.asInstanceOf[js.Any])
      
      inline def setMinimumFetchIntervalMillis(value: Double): Self = StObject.set(x, "minimumFetchIntervalMillis", value.asInstanceOf[js.Any])
    }
  }
  
  trait Value extends StObject {
    
    /**
      * Gets the value as a boolean.
      *
      * The following values (case insensitive) are interpreted as true:
      * "1", "true", "t", "yes", "y", "on". Other values are interpreted as false.
      */
    def asBoolean(): Boolean
    
    /**
      * Gets the value as a number. Comparable to calling <code>Number(value) || 0</code>.
      */
    def asNumber(): Double
    
    /**
      * Gets the value as a string.
      */
    def asString(): String
    
    /**
      * Gets the {@link ValueSource} for the given key.
      */
    def getSource(): ValueSource
  }
  object Value {
    
    inline def apply(
      asBoolean: () => Boolean,
      asNumber: () => Double,
      asString: () => String,
      getSource: () => ValueSource
    ): Value = {
      val __obj = js.Dynamic.literal(asBoolean = js.Any.fromFunction0(asBoolean), asNumber = js.Any.fromFunction0(asNumber), asString = js.Any.fromFunction0(asString), getSource = js.Any.fromFunction0(getSource))
      __obj.asInstanceOf[Value]
    }
    
    extension [Self <: Value](x: Self) {
      
      inline def setAsBoolean(value: () => Boolean): Self = StObject.set(x, "asBoolean", js.Any.fromFunction0(value))
      
      inline def setAsNumber(value: () => Double): Self = StObject.set(x, "asNumber", js.Any.fromFunction0(value))
      
      inline def setAsString(value: () => String): Self = StObject.set(x, "asString", js.Any.fromFunction0(value))
      
      inline def setGetSource(value: () => ValueSource): Self = StObject.set(x, "getSource", js.Any.fromFunction0(value))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.firebaseRemoteConfig.firebaseRemoteConfigStrings.static
    - typings.firebaseRemoteConfig.firebaseRemoteConfigStrings.default
    - typings.firebaseRemoteConfig.firebaseRemoteConfigStrings.remote
  */
  trait ValueSource extends StObject
  object ValueSource {
    
    inline def default: typings.firebaseRemoteConfig.firebaseRemoteConfigStrings.default = "default".asInstanceOf[typings.firebaseRemoteConfig.firebaseRemoteConfigStrings.default]
    
    inline def remote: typings.firebaseRemoteConfig.firebaseRemoteConfigStrings.remote = "remote".asInstanceOf[typings.firebaseRemoteConfig.firebaseRemoteConfigStrings.remote]
    
    inline def static: typings.firebaseRemoteConfig.firebaseRemoteConfigStrings.static = "static".asInstanceOf[typings.firebaseRemoteConfig.firebaseRemoteConfigStrings.static]
  }
  
  /* augmented module */
  object firebaseComponentAugmentingMod {
    
    trait NameServiceMapping extends StObject {
      
      var `remote-config`: RemoteConfig
    }
    object NameServiceMapping {
      
      inline def apply(`remote-config`: RemoteConfig): NameServiceMapping = {
        val __obj = js.Dynamic.literal()
        __obj.updateDynamic("remote-config")(`remote-config`.asInstanceOf[js.Any])
        __obj.asInstanceOf[NameServiceMapping]
      }
      
      extension [Self <: NameServiceMapping](x: Self) {
        
        inline def `setRemote-config`(value: RemoteConfig): Self = StObject.set(x, "remote-config", value.asInstanceOf[js.Any])
      }
    }
  }
}
