package typings.firebaseFirestore.distLitePrivateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Undocumented, private additional settings not exposed in our public API. */
trait PrivateSettings
  extends StObject
     with Settings {
  
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
  
  extension [Self <: PrivateSettings](x: Self) {
    
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
