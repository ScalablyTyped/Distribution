package typings.firebaseInstallations

import typings.firebaseApp.mod.FirebaseApp
import typings.firebaseComponent.mod.Provider
import typings.firebaseInstallations.distEsmSrcInterfacesPublicTypesMod.Installations
import typings.firebaseInstallations.firebaseInstallationsStrings.heartbeat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsmSrcInterfacesInstallationImplMod {
  
  trait AppConfig extends StObject {
    
    val apiKey: String
    
    val appId: String
    
    val appName: String
    
    val projectId: String
  }
  object AppConfig {
    
    inline def apply(apiKey: String, appId: String, appName: String, projectId: String): AppConfig = {
      val __obj = js.Dynamic.literal(apiKey = apiKey.asInstanceOf[js.Any], appId = appId.asInstanceOf[js.Any], appName = appName.asInstanceOf[js.Any], projectId = projectId.asInstanceOf[js.Any])
      __obj.asInstanceOf[AppConfig]
    }
    
    extension [Self <: AppConfig](x: Self) {
      
      inline def setApiKey(value: String): Self = StObject.set(x, "apiKey", value.asInstanceOf[js.Any])
      
      inline def setAppId(value: String): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
      
      inline def setAppName(value: String): Self = StObject.set(x, "appName", value.asInstanceOf[js.Any])
      
      inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _FirebaseService * / any */ trait FirebaseInstallationsImpl
    extends StObject
       with Installations {
    
    val appConfig: AppConfig
    
    val heartbeatServiceProvider: Provider[heartbeat]
  }
  object FirebaseInstallationsImpl {
    
    inline def apply(app: FirebaseApp, appConfig: AppConfig, heartbeatServiceProvider: Provider[heartbeat]): FirebaseInstallationsImpl = {
      val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any], appConfig = appConfig.asInstanceOf[js.Any], heartbeatServiceProvider = heartbeatServiceProvider.asInstanceOf[js.Any])
      __obj.asInstanceOf[FirebaseInstallationsImpl]
    }
    
    extension [Self <: FirebaseInstallationsImpl](x: Self) {
      
      inline def setAppConfig(value: AppConfig): Self = StObject.set(x, "appConfig", value.asInstanceOf[js.Any])
      
      inline def setHeartbeatServiceProvider(value: Provider[heartbeat]): Self = StObject.set(x, "heartbeatServiceProvider", value.asInstanceOf[js.Any])
    }
  }
}
