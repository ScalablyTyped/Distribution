package typings.firebaseMessaging

import typings.firebaseApp.mod.FirebaseApp
import typings.firebaseMessaging.interfacesAppConfigMod.AppConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interfacesInternalDependenciesMod {
  
  trait FirebaseInternalDependencies extends StObject {
    
    var analyticsProvider: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Provider<FirebaseAnalyticsInternalName> */ Any
    
    var app: FirebaseApp
    
    var appConfig: AppConfig
    
    var installations: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _FirebaseInstallationsInternal */ Any
  }
  object FirebaseInternalDependencies {
    
    inline def apply(
      analyticsProvider: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Provider<FirebaseAnalyticsInternalName> */ Any,
      app: FirebaseApp,
      appConfig: AppConfig,
      installations: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _FirebaseInstallationsInternal */ Any
    ): FirebaseInternalDependencies = {
      val __obj = js.Dynamic.literal(analyticsProvider = analyticsProvider.asInstanceOf[js.Any], app = app.asInstanceOf[js.Any], appConfig = appConfig.asInstanceOf[js.Any], installations = installations.asInstanceOf[js.Any])
      __obj.asInstanceOf[FirebaseInternalDependencies]
    }
    
    extension [Self <: FirebaseInternalDependencies](x: Self) {
      
      inline def setAnalyticsProvider(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Provider<FirebaseAnalyticsInternalName> */ Any
      ): Self = StObject.set(x, "analyticsProvider", value.asInstanceOf[js.Any])
      
      inline def setApp(value: FirebaseApp): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
      
      inline def setAppConfig(value: AppConfig): Self = StObject.set(x, "appConfig", value.asInstanceOf[js.Any])
      
      inline def setInstallations(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _FirebaseInstallationsInternal */ Any
      ): Self = StObject.set(x, "installations", value.asInstanceOf[js.Any])
    }
  }
}
