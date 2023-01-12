package typings.firefoxWebextBrowser.browser

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Use the `browser.telemetry` API to send telemetry data to the Mozilla Telemetry service. Restricted to Mozilla privileged webextensions.
  *
  * Permissions: `telemetry`
  *
  * Not allowed in: Content scripts, Devtools pages
  */
object telemetry {
  
  /** Represents registration data for a Telemetry event. */
  trait EventData extends StObject {
    
    /**
      * True if this event entry is expired. This allows recording it without error, but it will be discarded.
      */
    var expired: js.UndefOr[Boolean] = js.undefined
    
    /** List of allowed extra keys for this event entry. */
    var extra_keys: js.Array[String]
    
    /** List of methods for this event entry. */
    var methods: js.Array[String]
    
    /** List of objects for this event entry. */
    var objects: js.Array[String]
    
    /** True if this data should be recorded on release. */
    var record_on_release: js.UndefOr[Boolean] = js.undefined
  }
  object EventData {
    
    inline def apply(extra_keys: js.Array[String], methods: js.Array[String], objects: js.Array[String]): EventData = {
      val __obj = js.Dynamic.literal(extra_keys = extra_keys.asInstanceOf[js.Any], methods = methods.asInstanceOf[js.Any], objects = objects.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EventData] (val x: Self) extends AnyVal {
      
      inline def setExpired(value: Boolean): Self = StObject.set(x, "expired", value.asInstanceOf[js.Any])
      
      inline def setExpiredUndefined: Self = StObject.set(x, "expired", js.undefined)
      
      inline def setExtra_keys(value: js.Array[String]): Self = StObject.set(x, "extra_keys", value.asInstanceOf[js.Any])
      
      inline def setExtra_keysVarargs(value: String*): Self = StObject.set(x, "extra_keys", js.Array(value*))
      
      inline def setMethods(value: js.Array[String]): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
      
      inline def setMethodsVarargs(value: String*): Self = StObject.set(x, "methods", js.Array(value*))
      
      inline def setObjects(value: js.Array[String]): Self = StObject.set(x, "objects", value.asInstanceOf[js.Any])
      
      inline def setObjectsVarargs(value: String*): Self = StObject.set(x, "objects", js.Array(value*))
      
      inline def setRecord_on_release(value: Boolean): Self = StObject.set(x, "record_on_release", value.asInstanceOf[js.Any])
      
      inline def setRecord_on_releaseUndefined: Self = StObject.set(x, "record_on_release", js.undefined)
    }
  }
  
  /** Represents registration data for a Telemetry scalar. */
  trait ScalarData extends StObject {
    
    /**
      * True if this scalar entry is expired. This allows recording it without error, but it will be discarded.
      */
    var expired: js.UndefOr[Boolean] = js.undefined
    
    /** True if this is a keyed scalar. */
    var keyed: js.UndefOr[Boolean] = js.undefined
    
    var kind: ScalarType
    
    /** True if this data should be recorded on release. */
    var record_on_release: js.UndefOr[Boolean] = js.undefined
  }
  object ScalarData {
    
    inline def apply(kind: ScalarType): ScalarData = {
      val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScalarData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ScalarData] (val x: Self) extends AnyVal {
      
      inline def setExpired(value: Boolean): Self = StObject.set(x, "expired", value.asInstanceOf[js.Any])
      
      inline def setExpiredUndefined: Self = StObject.set(x, "expired", js.undefined)
      
      inline def setKeyed(value: Boolean): Self = StObject.set(x, "keyed", value.asInstanceOf[js.Any])
      
      inline def setKeyedUndefined: Self = StObject.set(x, "keyed", js.undefined)
      
      inline def setKind(value: ScalarType): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setRecord_on_release(value: Boolean): Self = StObject.set(x, "record_on_release", value.asInstanceOf[js.Any])
      
      inline def setRecord_on_releaseUndefined: Self = StObject.set(x, "record_on_release", js.undefined)
    }
  }
  
  /* telemetry types */
  /**
    * Type of scalar: 'count' for numeric values, 'string' for string values, 'boolean' for boolean values. Maps to `nsITelemetry.SCALAR_TYPE_*`.
    */
  /* Rewritten from type alias, can be one of: 
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.count
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.string
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.boolean
  */
  trait ScalarType extends StObject
  object ScalarType {
    
    inline def boolean: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.boolean = "boolean".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.boolean]
    
    inline def count: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.count = "count".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.count]
    
    inline def string: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.string = "string".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.string]
  }
  
  /** Options object. */
  trait SubmitEncryptedPingOptions extends StObject {
    
    /** Schema name used for payload. */
    var schemaName: String
    
    /** Schema version used for payload. */
    var schemaVersion: Double
  }
  object SubmitEncryptedPingOptions {
    
    inline def apply(schemaName: String, schemaVersion: Double): SubmitEncryptedPingOptions = {
      val __obj = js.Dynamic.literal(schemaName = schemaName.asInstanceOf[js.Any], schemaVersion = schemaVersion.asInstanceOf[js.Any])
      __obj.asInstanceOf[SubmitEncryptedPingOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SubmitEncryptedPingOptions] (val x: Self) extends AnyVal {
      
      inline def setSchemaName(value: String): Self = StObject.set(x, "schemaName", value.asInstanceOf[js.Any])
      
      inline def setSchemaVersion(value: Double): Self = StObject.set(x, "schemaVersion", value.asInstanceOf[js.Any])
    }
  }
  
  /** Options object. */
  trait SubmitPingOptions extends StObject {
    
    /** True if the ping should contain the client id. */
    var addClientId: js.UndefOr[Boolean] = js.undefined
    
    /** True if the ping should contain the environment data. */
    var addEnvironment: js.UndefOr[Boolean] = js.undefined
    
    /** Set to override the environment data. */
    var overrideEnvironment: js.UndefOr[StringDictionary[Any]] = js.undefined
    
    /** If true, send the ping using the PingSender. */
    var usePingSender: js.UndefOr[Boolean] = js.undefined
  }
  object SubmitPingOptions {
    
    inline def apply(): SubmitPingOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SubmitPingOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SubmitPingOptions] (val x: Self) extends AnyVal {
      
      inline def setAddClientId(value: Boolean): Self = StObject.set(x, "addClientId", value.asInstanceOf[js.Any])
      
      inline def setAddClientIdUndefined: Self = StObject.set(x, "addClientId", js.undefined)
      
      inline def setAddEnvironment(value: Boolean): Self = StObject.set(x, "addEnvironment", value.asInstanceOf[js.Any])
      
      inline def setAddEnvironmentUndefined: Self = StObject.set(x, "addEnvironment", js.undefined)
      
      inline def setOverrideEnvironment(value: StringDictionary[Any]): Self = StObject.set(x, "overrideEnvironment", value.asInstanceOf[js.Any])
      
      inline def setOverrideEnvironmentUndefined: Self = StObject.set(x, "overrideEnvironment", js.undefined)
      
      inline def setUsePingSender(value: Boolean): Self = StObject.set(x, "usePingSender", value.asInstanceOf[js.Any])
      
      inline def setUsePingSenderUndefined: Self = StObject.set(x, "usePingSender", js.undefined)
    }
  }
}
