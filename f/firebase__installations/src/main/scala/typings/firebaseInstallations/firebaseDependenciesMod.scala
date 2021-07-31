package typings.firebaseInstallations

import typings.firebaseComponent.mod.Provider
import typings.firebaseInstallations.appConfigMod.AppConfig
import typings.firebaseInstallations.firebaseInstallationsStrings.`platform-logger`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object firebaseDependenciesMod {
  
  trait FirebaseDependencies extends StObject {
    
    val appConfig: AppConfig
    
    val platformLoggerProvider: Provider[`platform-logger`]
  }
  object FirebaseDependencies {
    
    @scala.inline
    def apply(appConfig: AppConfig, platformLoggerProvider: Provider[`platform-logger`]): FirebaseDependencies = {
      val __obj = js.Dynamic.literal(appConfig = appConfig.asInstanceOf[js.Any], platformLoggerProvider = platformLoggerProvider.asInstanceOf[js.Any])
      __obj.asInstanceOf[FirebaseDependencies]
    }
    
    @scala.inline
    implicit class FirebaseDependenciesMutableBuilder[Self <: FirebaseDependencies] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAppConfig(value: AppConfig): Self = StObject.set(x, "appConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlatformLoggerProvider(value: Provider[`platform-logger`]): Self = StObject.set(x, "platformLoggerProvider", value.asInstanceOf[js.Any])
    }
  }
}
