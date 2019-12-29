package typings.atFirebasePerformance

import typings.atFirebaseAppDashTypes.atFirebaseAppDashTypesMod.FirebaseApp
import typings.atFirebaseInstallationsDashTypes.atFirebaseInstallationsDashTypesMod.FirebaseInstallations
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/performance/dist/src/services/settings_service", JSImport.Namespace)
@js.native
object distSrcServicesSettingsUnderscoreServiceMod extends js.Object {
  @js.native
  class SettingsService () extends js.Object {
    var configTimeToLive: Double = js.native
    var dataCollectionEnabled: Boolean = js.native
    var firebaseAppInstance: FirebaseApp = js.native
    var installationsService: FirebaseInstallations = js.native
    var instrumentationEnabled: Boolean = js.native
    var logEndPointUrl: String = js.native
    var logNetworkAfterSampling: Boolean = js.native
    var logSource: Double = js.native
    var logTraceAfterSampling: Boolean = js.native
    var loggingEnabled: Boolean = js.native
    var networkRequestsSamplingRate: Double = js.native
    var tracesSamplingRate: Double = js.native
    def getApiKey(): String = js.native
    def getAppId(): String = js.native
    def getProjectId(): String = js.native
  }
  
  /* static members */
  @js.native
  object SettingsService extends js.Object {
    def getInstance(): SettingsService = js.native
  }
  
}

