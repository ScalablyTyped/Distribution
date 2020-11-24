package typings.firebaseInstallations.firebaseDependenciesMod

import typings.firebaseComponent.mod.Provider
import typings.firebaseInstallations.appConfigMod.AppConfig
import typings.firebaseInstallations.firebaseInstallationsStrings.`platform-logger`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FirebaseDependencies extends js.Object {
  
  val appConfig: AppConfig = js.native
  
  val platformLoggerProvider: Provider[`platform-logger`] = js.native
}
object FirebaseDependencies {
  
  @scala.inline
  def apply(appConfig: AppConfig, platformLoggerProvider: Provider[`platform-logger`]): FirebaseDependencies = {
    val __obj = js.Dynamic.literal(appConfig = appConfig.asInstanceOf[js.Any], platformLoggerProvider = platformLoggerProvider.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirebaseDependencies]
  }
  
  @scala.inline
  implicit class FirebaseDependenciesOps[Self <: FirebaseDependencies] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAppConfig(value: AppConfig): Self = this.set("appConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatformLoggerProvider(value: Provider[`platform-logger`]): Self = this.set("platformLoggerProvider", value.asInstanceOf[js.Any])
  }
}
