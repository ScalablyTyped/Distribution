package typings.expoPrebuildConfig

import typings.expoPrebuildConfig.anon.PickExpoConfiginternal
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildGetAutolinkedPackagesMod {
  
  @JSImport("@expo/prebuild-config/build/getAutolinkedPackages", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getAutolinkedPackagesAsync(projectRoot: String): js.Promise[js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAutolinkedPackagesAsync")(projectRoot.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[String]]]
  inline def getAutolinkedPackagesAsync(
    projectRoot: String,
    platforms: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ModPlatform */ Any
    ]
  ): js.Promise[js.Array[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getAutolinkedPackagesAsync")(projectRoot.asInstanceOf[js.Any], platforms.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[String]]]
  
  inline def resolvePackagesList(platformPaths: js.Array[Record[String, Any]]): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolvePackagesList")(platformPaths.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def shouldSkipAutoPlugin(config: PickExpoConfiginternal, plugin: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("shouldSkipAutoPlugin")(config.asInstanceOf[js.Any], plugin.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def shouldSkipAutoPlugin(
    config: PickExpoConfiginternal,
    plugin: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StaticPlugin */ Any
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("shouldSkipAutoPlugin")(config.asInstanceOf[js.Any], plugin.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
