package typings.firebaseFirestore.distLiteInternalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A concrete type describing all the values that can be applied via a
  * user-supplied `FirestoreSettings` object. This is a separate type so that
  * defaults can be supplied and the value can be checked for equality.
  */
trait FirestoreSettingsImpl extends StObject {
  
  val cache: js.UndefOr[FirestoreLocalCache] = js.undefined
  
  val cacheSizeBytes: Double
  
  var credentials: js.UndefOr[Any] = js.undefined
  
  val experimentalAutoDetectLongPolling: Boolean
  
  val experimentalForceLongPolling: Boolean
  
  /** The hostname to connect to. */
  val host: String
  
  val ignoreUndefinedProperties: Boolean
  
  def isEqual(other: FirestoreSettingsImpl): Boolean
  
  /** Whether to use SSL when connecting. */
  val ssl: Boolean
  
  val useFetchStreams: Boolean
}
object FirestoreSettingsImpl {
  
  inline def apply(
    cacheSizeBytes: Double,
    experimentalAutoDetectLongPolling: Boolean,
    experimentalForceLongPolling: Boolean,
    host: String,
    ignoreUndefinedProperties: Boolean,
    isEqual: FirestoreSettingsImpl => Boolean,
    ssl: Boolean,
    useFetchStreams: Boolean
  ): FirestoreSettingsImpl = {
    val __obj = js.Dynamic.literal(cacheSizeBytes = cacheSizeBytes.asInstanceOf[js.Any], experimentalAutoDetectLongPolling = experimentalAutoDetectLongPolling.asInstanceOf[js.Any], experimentalForceLongPolling = experimentalForceLongPolling.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], ignoreUndefinedProperties = ignoreUndefinedProperties.asInstanceOf[js.Any], isEqual = js.Any.fromFunction1(isEqual), ssl = ssl.asInstanceOf[js.Any], useFetchStreams = useFetchStreams.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirestoreSettingsImpl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FirestoreSettingsImpl] (val x: Self) extends AnyVal {
    
    inline def setCache(value: FirestoreLocalCache): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
    
    inline def setCacheSizeBytes(value: Double): Self = StObject.set(x, "cacheSizeBytes", value.asInstanceOf[js.Any])
    
    inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
    
    inline def setCredentials(value: Any): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
    
    inline def setCredentialsUndefined: Self = StObject.set(x, "credentials", js.undefined)
    
    inline def setExperimentalAutoDetectLongPolling(value: Boolean): Self = StObject.set(x, "experimentalAutoDetectLongPolling", value.asInstanceOf[js.Any])
    
    inline def setExperimentalForceLongPolling(value: Boolean): Self = StObject.set(x, "experimentalForceLongPolling", value.asInstanceOf[js.Any])
    
    inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setIgnoreUndefinedProperties(value: Boolean): Self = StObject.set(x, "ignoreUndefinedProperties", value.asInstanceOf[js.Any])
    
    inline def setIsEqual(value: FirestoreSettingsImpl => Boolean): Self = StObject.set(x, "isEqual", js.Any.fromFunction1(value))
    
    inline def setSsl(value: Boolean): Self = StObject.set(x, "ssl", value.asInstanceOf[js.Any])
    
    inline def setUseFetchStreams(value: Boolean): Self = StObject.set(x, "useFetchStreams", value.asInstanceOf[js.Any])
  }
}
