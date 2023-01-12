package typings.firebaseFirestore.distLitePackagesFirestoreDistLiteIndexDotbrowserDotesm2017Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Removes all components associated with the provided instance. Must be called
  * when the `Firestore` instance is terminated.
  */
/**
  * A concrete type describing all the values that can be applied via a
  * user-supplied `FirestoreSettings` object. This is a separate type so that
  * defaults can be supplied and the value can be checked for equality.
  */
trait ln extends StObject {
  
  var cacheSizeBytes: Any
  
  var credentials: Any
  
  var experimentalAutoDetectLongPolling: Boolean
  
  var experimentalForceLongPolling: Boolean
  
  var host: Any
  
  var ignoreUndefinedProperties: Boolean
  
  def isEqual(t: Any): Boolean
  
  var ssl: Any
  
  var useFetchStreams: Boolean
}
object ln {
  
  inline def apply(
    cacheSizeBytes: Any,
    credentials: Any,
    experimentalAutoDetectLongPolling: Boolean,
    experimentalForceLongPolling: Boolean,
    host: Any,
    ignoreUndefinedProperties: Boolean,
    isEqual: Any => Boolean,
    ssl: Any,
    useFetchStreams: Boolean
  ): ln = {
    val __obj = js.Dynamic.literal(cacheSizeBytes = cacheSizeBytes.asInstanceOf[js.Any], credentials = credentials.asInstanceOf[js.Any], experimentalAutoDetectLongPolling = experimentalAutoDetectLongPolling.asInstanceOf[js.Any], experimentalForceLongPolling = experimentalForceLongPolling.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], ignoreUndefinedProperties = ignoreUndefinedProperties.asInstanceOf[js.Any], isEqual = js.Any.fromFunction1(isEqual), ssl = ssl.asInstanceOf[js.Any], useFetchStreams = useFetchStreams.asInstanceOf[js.Any])
    __obj.asInstanceOf[ln]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ln] (val x: Self) extends AnyVal {
    
    inline def setCacheSizeBytes(value: Any): Self = StObject.set(x, "cacheSizeBytes", value.asInstanceOf[js.Any])
    
    inline def setCredentials(value: Any): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
    
    inline def setExperimentalAutoDetectLongPolling(value: Boolean): Self = StObject.set(x, "experimentalAutoDetectLongPolling", value.asInstanceOf[js.Any])
    
    inline def setExperimentalForceLongPolling(value: Boolean): Self = StObject.set(x, "experimentalForceLongPolling", value.asInstanceOf[js.Any])
    
    inline def setHost(value: Any): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setIgnoreUndefinedProperties(value: Boolean): Self = StObject.set(x, "ignoreUndefinedProperties", value.asInstanceOf[js.Any])
    
    inline def setIsEqual(value: Any => Boolean): Self = StObject.set(x, "isEqual", js.Any.fromFunction1(value))
    
    inline def setSsl(value: Any): Self = StObject.set(x, "ssl", value.asInstanceOf[js.Any])
    
    inline def setUseFetchStreams(value: Boolean): Self = StObject.set(x, "useFetchStreams", value.asInstanceOf[js.Any])
  }
}
