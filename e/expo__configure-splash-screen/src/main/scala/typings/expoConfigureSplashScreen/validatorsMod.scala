package typings.expoConfigureSplashScreen

import typings.expoConfigureSplashScreen.splashScreenConfigMod.AndroidSplashScreenConfig
import typings.expoConfigureSplashScreen.splashScreenConfigMod.AndroidSplashScreenConfigJSON
import typings.expoConfigureSplashScreen.splashScreenConfigMod.IosSplashScreenConfig
import typings.expoConfigureSplashScreen.splashScreenConfigMod.IosSplashScreenConfigJSON
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object validatorsMod {
  
  @JSImport("@expo/configure-splash-screen/build/validators", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def validateAndroidConfig(config: AndroidSplashScreenConfigJSON): js.Promise[AndroidSplashScreenConfig] = ^.asInstanceOf[js.Dynamic].applyDynamic("validateAndroidConfig")(config.asInstanceOf[js.Any]).asInstanceOf[js.Promise[AndroidSplashScreenConfig]]
  
  @scala.inline
  def validateEnumValue[T /* <: Record[String, String] */](value: String, availableValues: T): /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("validateEnumValue")(value.asInstanceOf[js.Any], availableValues.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any]
  
  @scala.inline
  def validateIosConfig(config: IosSplashScreenConfigJSON): js.Promise[IosSplashScreenConfig] = ^.asInstanceOf[js.Dynamic].applyDynamic("validateIosConfig")(config.asInstanceOf[js.Any]).asInstanceOf[js.Promise[IosSplashScreenConfig]]
}
