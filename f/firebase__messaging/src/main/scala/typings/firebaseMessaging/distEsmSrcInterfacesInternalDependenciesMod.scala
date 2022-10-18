package typings.firebaseMessaging

import typings.firebaseApp.mod.FirebaseApp
import typings.firebaseComponent.mod.Provider
import typings.firebaseMessaging.distEsmSrcInterfacesAppConfigMod.AppConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsmSrcInterfacesInternalDependenciesMod {
  
  trait FirebaseInternalDependencies extends StObject {
    
    var analyticsProvider: Provider[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FirebaseAnalyticsInternalName */ Any
      ]
    
    var app: FirebaseApp
    
    var appConfig: AppConfig
    
    var installations: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _FirebaseInstallationsInternal */ Any
  }
  object FirebaseInternalDependencies {
    
    inline def apply(
      analyticsProvider: Provider[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FirebaseAnalyticsInternalName */ Any
        ],
      app: FirebaseApp,
      appConfig: AppConfig,
      installations: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _FirebaseInstallationsInternal */ Any
    ): FirebaseInternalDependencies = {
      val __obj = js.Dynamic.literal(analyticsProvider = analyticsProvider.asInstanceOf[js.Any], app = app.asInstanceOf[js.Any], appConfig = appConfig.asInstanceOf[js.Any], installations = installations.asInstanceOf[js.Any])
      __obj.asInstanceOf[FirebaseInternalDependencies]
    }
    
    extension [Self <: FirebaseInternalDependencies](x: Self) {
      
      inline def setAnalyticsProvider(
        value: Provider[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FirebaseAnalyticsInternalName */ Any
            ]
      ): Self = StObject.set(x, "analyticsProvider", value.asInstanceOf[js.Any])
      
      inline def setApp(value: FirebaseApp): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
      
      inline def setAppConfig(value: AppConfig): Self = StObject.set(x, "appConfig", value.asInstanceOf[js.Any])
      
      inline def setInstallations(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _FirebaseInstallationsInternal */ Any
      ): Self = StObject.set(x, "installations", value.asInstanceOf[js.Any])
    }
  }
}
