package typings.expoConfigPlugins

import typings.expoConfigPlugins.anon.Configuration
import typings.expoConfigPlugins.anon.OsType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildIosBuildSchemeMod {
  
  @JSImport("@expo/config-plugins/build/ios/BuildScheme", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getApplicationTargetNameForSchemeAsync(projectRoot: String, scheme: String): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getApplicationTargetNameForSchemeAsync")(projectRoot.asInstanceOf[js.Any], scheme.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  inline def getArchiveBuildConfigurationForSchemeAsync(projectRoot: String, scheme: String): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getArchiveBuildConfigurationForSchemeAsync")(projectRoot.asInstanceOf[js.Any], scheme.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  inline def getRunnableSchemesFromXcodeproj(projectRoot: String): js.Array[OsType] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRunnableSchemesFromXcodeproj")(projectRoot.asInstanceOf[js.Any]).asInstanceOf[js.Array[OsType]]
  inline def getRunnableSchemesFromXcodeproj(projectRoot: String, param1: Configuration): js.Array[OsType] = (^.asInstanceOf[js.Dynamic].applyDynamic("getRunnableSchemesFromXcodeproj")(projectRoot.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[js.Array[OsType]]
  
  inline def getSchemesFromXcodeproj(projectRoot: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSchemesFromXcodeproj")(projectRoot.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
}
