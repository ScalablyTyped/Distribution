package typings.firebasePerformance

import typings.firebaseAppTypes.mod.FirebaseApp
import typings.firebaseInstallationsTypes.mod.FirebaseInstallations
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object settingsServiceMod {
  
  @JSImport("@firebase/performance/dist/src/services/settings_service", "SettingsService")
  @js.native
  class SettingsService () extends StObject {
    
    var configTimeToLive: Double = js.native
    
    var dataCollectionEnabled: Boolean = js.native
    
    var firebaseAppInstance: FirebaseApp = js.native
    
    var flTransportEndpointUrl: String = js.native
    
    def getApiKey(): String = js.native
    
    def getAppId(): String = js.native
    
    def getFlTransportFullUrl(): String = js.native
    
    def getProjectId(): String = js.native
    
    var installationsService: FirebaseInstallations = js.native
    
    var instrumentationEnabled: Boolean = js.native
    
    var logEndPointUrl: String = js.native
    
    var logNetworkAfterSampling: Boolean = js.native
    
    var logSource: Double = js.native
    
    var logTraceAfterSampling: Boolean = js.native
    
    var loggingEnabled: Boolean = js.native
    
    var networkRequestsSamplingRate: Double = js.native
    
    var tracesSamplingRate: Double = js.native
    
    var transportKey: String = js.native
  }
  /* static members */
  object SettingsService {
    
    @JSImport("@firebase/performance/dist/src/services/settings_service", "SettingsService")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getInstance(): SettingsService = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")().asInstanceOf[SettingsService]
  }
}
