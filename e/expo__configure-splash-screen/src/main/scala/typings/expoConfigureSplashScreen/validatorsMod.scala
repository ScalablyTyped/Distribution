package typings.expoConfigureSplashScreen

import typings.expoConfigureSplashScreen.splashScreenConfigMod.AndroidSplashScreenConfig
import typings.expoConfigureSplashScreen.splashScreenConfigMod.AndroidSplashScreenConfigJSON
import typings.expoConfigureSplashScreen.splashScreenConfigMod.IosSplashScreenConfig
import typings.expoConfigureSplashScreen.splashScreenConfigMod.IosSplashScreenConfigJSON
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@expo/configure-splash-screen/build/validators", JSImport.Namespace)
@js.native
object validatorsMod extends js.Object {
  
  def validateAndroidConfig(config: AndroidSplashScreenConfigJSON): js.Promise[AndroidSplashScreenConfig] = js.native
  
  def validateEnumValue[T /* <: Record[String, String] */](value: String, availableValues: T): /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any = js.native
  
  def validateIosConfig(config: IosSplashScreenConfigJSON): js.Promise[IosSplashScreenConfig] = js.native
}
