package typings.expoConfigPlugins

import typings.expoConfigPlugins.anon.BuildConfiguration
import typings.expoConfigPlugins.buildPluginDottypesMod.ConfigPlugin
import typings.expoConfigTypes.mod.ExpoConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildIosEntitlementsMod {
  
  @JSImport("@expo/config-plugins/build/ios/Entitlements", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ensureApplicationTargetEntitlementsFileConfigured(projectRoot: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("ensureApplicationTargetEntitlementsFileConfigured")(projectRoot.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def getEntitlementsPath(projectRoot: String): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getEntitlementsPath")(projectRoot.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  inline def getEntitlementsPath(projectRoot: String, hasTargetNameBuildConfiguration: BuildConfiguration): String | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getEntitlementsPath")(projectRoot.asInstanceOf[js.Any], hasTargetNameBuildConfiguration.asInstanceOf[js.Any])).asInstanceOf[String | Null]
  
  inline def setAssociatedDomains(
    config: ExpoConfig,
    has_EntitlementsPlist: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSONObject */ Any
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("setAssociatedDomains")(config.asInstanceOf[js.Any], has_EntitlementsPlist.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  @JSImport("@expo/config-plugins/build/ios/Entitlements", "withAssociatedDomains")
  @js.native
  val withAssociatedDomains: ConfigPlugin[Unit] = js.native
}
