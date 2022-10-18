package typings.expoConfig

import typings.expoConfig.buildConfigDottypesMod.AppJSONConfig
import typings.expoConfig.buildConfigDottypesMod.ConfigContext
import typings.expoConfig.buildEvalConfigMod.DynamicConfigResults
import typings.expoConfigTypes.mod.ExpoConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildGetConfigMod {
  
  @JSImport("@expo/config/build/getConfig", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getDynamicConfig(configPath: String, request: ConfigContext): DynamicConfigResults = (^.asInstanceOf[js.Dynamic].applyDynamic("getDynamicConfig")(configPath.asInstanceOf[js.Any], request.asInstanceOf[js.Any])).asInstanceOf[DynamicConfigResults]
  
  inline def getStaticConfig(configPath: String): AppJSONConfig | ExpoConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("getStaticConfig")(configPath.asInstanceOf[js.Any]).asInstanceOf[AppJSONConfig | ExpoConfig]
}
