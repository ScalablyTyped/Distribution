package typings.firebaseFirestore

import typings.firebaseFirestore.distPackagesFirestoreSrcApiCredentialsMod.CredentialsSettings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distPackagesFirestoreSrcLiteApiSettingsMod {
  
  @JSImport("@firebase/firestore/dist/packages/firestore/src/lite-api/settings", "DEFAULT_HOST")
  @js.native
  val DEFAULT_HOST: /* "firestore.googleapis.com" */ String = js.native
  
  @JSImport("@firebase/firestore/dist/packages/firestore/src/lite-api/settings", "DEFAULT_SSL")
  @js.native
  val DEFAULT_SSL: /* true */ Boolean = js.native
  
  @JSImport("@firebase/firestore/dist/packages/firestore/src/lite-api/settings", "FirestoreSettingsImpl")
  @js.native
  open class FirestoreSettingsImpl protected () extends StObject {
    def this(settings: PrivateSettings) = this()
    
    val cacheSizeBytes: Double = js.native
    
    var credentials: js.UndefOr[Any] = js.native
    
    val experimentalAutoDetectLongPolling: Boolean = js.native
    
    val experimentalForceLongPolling: Boolean = js.native
    
    /** The hostname to connect to. */
    val host: String = js.native
    
    val ignoreUndefinedProperties: Boolean = js.native
    
    def isEqual(other: FirestoreSettingsImpl): Boolean = js.native
    
    /** Whether to use SSL when connecting. */
    val ssl: Boolean = js.native
    
    val useFetchStreams: Boolean = js.native
  }
  
  trait FirestoreSettings extends StObject {
    
    /** The hostname to connect to. */
    var host: js.UndefOr[String] = js.undefined
    
    /**
      * Whether to skip nested properties that are set to `undefined` during
      * object serialization. If set to `true`, these properties are skipped
      * and not written to Firestore. If set to `false` or omitted, the SDK
      * throws an exception when it encounters properties of type `undefined`.
      */
    var ignoreUndefinedProperties: js.UndefOr[Boolean] = js.undefined
    
    /** Whether to use SSL when connecting. */
    var ssl: js.UndefOr[Boolean] = js.undefined
  }
  object FirestoreSettings {
    
    inline def apply(): FirestoreSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FirestoreSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FirestoreSettings] (val x: Self) extends AnyVal {
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      inline def setIgnoreUndefinedProperties(value: Boolean): Self = StObject.set(x, "ignoreUndefinedProperties", value.asInstanceOf[js.Any])
      
      inline def setIgnoreUndefinedPropertiesUndefined: Self = StObject.set(x, "ignoreUndefinedProperties", js.undefined)
      
      inline def setSsl(value: Boolean): Self = StObject.set(x, "ssl", value.asInstanceOf[js.Any])
      
      inline def setSslUndefined: Self = StObject.set(x, "ssl", js.undefined)
    }
  }
  
  trait PrivateSettings
    extends StObject
       with FirestoreSettings {
    
    var cacheSizeBytes: js.UndefOr[Double] = js.undefined
    
    var credentials: js.UndefOr[CredentialsSettings] = js.undefined
    
    var experimentalAutoDetectLongPolling: js.UndefOr[Boolean] = js.undefined
    
    var experimentalForceLongPolling: js.UndefOr[Boolean] = js.undefined
    
    var useFetchStreams: js.UndefOr[Boolean] = js.undefined
  }
  object PrivateSettings {
    
    inline def apply(): PrivateSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PrivateSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PrivateSettings] (val x: Self) extends AnyVal {
      
      inline def setCacheSizeBytes(value: Double): Self = StObject.set(x, "cacheSizeBytes", value.asInstanceOf[js.Any])
      
      inline def setCacheSizeBytesUndefined: Self = StObject.set(x, "cacheSizeBytes", js.undefined)
      
      inline def setCredentials(value: CredentialsSettings): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
      
      inline def setCredentialsUndefined: Self = StObject.set(x, "credentials", js.undefined)
      
      inline def setExperimentalAutoDetectLongPolling(value: Boolean): Self = StObject.set(x, "experimentalAutoDetectLongPolling", value.asInstanceOf[js.Any])
      
      inline def setExperimentalAutoDetectLongPollingUndefined: Self = StObject.set(x, "experimentalAutoDetectLongPolling", js.undefined)
      
      inline def setExperimentalForceLongPolling(value: Boolean): Self = StObject.set(x, "experimentalForceLongPolling", value.asInstanceOf[js.Any])
      
      inline def setExperimentalForceLongPollingUndefined: Self = StObject.set(x, "experimentalForceLongPolling", js.undefined)
      
      inline def setUseFetchStreams(value: Boolean): Self = StObject.set(x, "useFetchStreams", value.asInstanceOf[js.Any])
      
      inline def setUseFetchStreamsUndefined: Self = StObject.set(x, "useFetchStreams", js.undefined)
    }
  }
}
