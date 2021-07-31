package typings.firebaseMessaging

import typings.firebaseComponent.mod.Provider
import typings.firebaseInstallationsTypes.mod.FirebaseInstallations
import typings.firebaseMessaging.appConfigMod.AppConfig
import typings.firebaseMessaging.mod.FirebaseApp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object internalDependenciesMod {
  
  trait FirebaseInternalDependencies extends StObject {
    
    var analyticsProvider: Provider[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FirebaseAnalyticsInternalName */ js.Any
      ]
    
    var app: FirebaseApp
    
    var appConfig: AppConfig
    
    var installations: FirebaseInstallations
  }
  object FirebaseInternalDependencies {
    
    @scala.inline
    def apply(
      analyticsProvider: Provider[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FirebaseAnalyticsInternalName */ js.Any
        ],
      app: FirebaseApp,
      appConfig: AppConfig,
      installations: FirebaseInstallations
    ): FirebaseInternalDependencies = {
      val __obj = js.Dynamic.literal(analyticsProvider = analyticsProvider.asInstanceOf[js.Any], app = app.asInstanceOf[js.Any], appConfig = appConfig.asInstanceOf[js.Any], installations = installations.asInstanceOf[js.Any])
      __obj.asInstanceOf[FirebaseInternalDependencies]
    }
    
    @scala.inline
    implicit class FirebaseInternalDependenciesMutableBuilder[Self <: FirebaseInternalDependencies] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnalyticsProvider(
        value: Provider[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FirebaseAnalyticsInternalName */ js.Any
            ]
      ): Self = StObject.set(x, "analyticsProvider", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApp(value: FirebaseApp): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppConfig(value: AppConfig): Self = StObject.set(x, "appConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstallations(value: FirebaseInstallations): Self = StObject.set(x, "installations", value.asInstanceOf[js.Any])
    }
  }
}
