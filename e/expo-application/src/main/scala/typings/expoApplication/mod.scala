package typings.expoApplication

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("expo-application", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait ApplicationReleaseType extends StObject
  @JSImport("expo-application", "ApplicationReleaseType")
  @js.native
  object ApplicationReleaseType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ApplicationReleaseType & Double] = js.native
    
    @js.native
    sealed trait AD_HOC
      extends StObject
         with ApplicationReleaseType
    /* 4 */ val AD_HOC: typings.expoApplication.mod.ApplicationReleaseType.AD_HOC & Double = js.native
    
    @js.native
    sealed trait APP_STORE
      extends StObject
         with ApplicationReleaseType
    /* 5 */ val APP_STORE: typings.expoApplication.mod.ApplicationReleaseType.APP_STORE & Double = js.native
    
    @js.native
    sealed trait DEVELOPMENT
      extends StObject
         with ApplicationReleaseType
    /* 3 */ val DEVELOPMENT: typings.expoApplication.mod.ApplicationReleaseType.DEVELOPMENT & Double = js.native
    
    @js.native
    sealed trait ENTERPRISE
      extends StObject
         with ApplicationReleaseType
    /* 2 */ val ENTERPRISE: typings.expoApplication.mod.ApplicationReleaseType.ENTERPRISE & Double = js.native
    
    @js.native
    sealed trait SIMULATOR
      extends StObject
         with ApplicationReleaseType
    /* 1 */ val SIMULATOR: typings.expoApplication.mod.ApplicationReleaseType.SIMULATOR & Double = js.native
    
    @js.native
    sealed trait UNKNOWN
      extends StObject
         with ApplicationReleaseType
    /* 0 */ val UNKNOWN: typings.expoApplication.mod.ApplicationReleaseType.UNKNOWN & Double = js.native
  }
  
  @JSImport("expo-application", "androidId")
  @js.native
  val androidId: String | Null = js.native
  
  @JSImport("expo-application", "applicationId")
  @js.native
  val applicationId: String | Null = js.native
  
  @JSImport("expo-application", "applicationName")
  @js.native
  val applicationName: String | Null = js.native
  
  inline def getInstallReferrerAsync(): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstallReferrerAsync")().asInstanceOf[js.Promise[String]]
  
  inline def getInstallationTimeAsync(): js.Promise[js.Date] = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstallationTimeAsync")().asInstanceOf[js.Promise[js.Date]]
  
  inline def getIosApplicationReleaseTypeAsync(): js.Promise[ApplicationReleaseType] = ^.asInstanceOf[js.Dynamic].applyDynamic("getIosApplicationReleaseTypeAsync")().asInstanceOf[js.Promise[ApplicationReleaseType]]
  
  inline def getIosIdForVendorAsync(): js.Promise[String | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("getIosIdForVendorAsync")().asInstanceOf[js.Promise[String | Null]]
  
  inline def getIosPushNotificationServiceEnvironmentAsync(): js.Promise[PushNotificationServiceEnvironment] = ^.asInstanceOf[js.Dynamic].applyDynamic("getIosPushNotificationServiceEnvironmentAsync")().asInstanceOf[js.Promise[PushNotificationServiceEnvironment]]
  
  inline def getLastUpdateTimeAsync(): js.Promise[js.Date] = ^.asInstanceOf[js.Dynamic].applyDynamic("getLastUpdateTimeAsync")().asInstanceOf[js.Promise[js.Date]]
  
  @JSImport("expo-application", "nativeApplicationVersion")
  @js.native
  val nativeApplicationVersion: String | Null = js.native
  
  @JSImport("expo-application", "nativeBuildVersion")
  @js.native
  val nativeBuildVersion: String | Null = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.expoApplication.expoApplicationStrings.development
    - typings.expoApplication.expoApplicationStrings.production
    - scala.Null
  */
  type PushNotificationServiceEnvironment = _PushNotificationServiceEnvironment | Null
  
  trait _PushNotificationServiceEnvironment extends StObject
}
