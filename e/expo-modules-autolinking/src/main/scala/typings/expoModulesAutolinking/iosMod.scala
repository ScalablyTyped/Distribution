package typings.expoModulesAutolinking

import typings.expoModulesAutolinking.typesMod.ModuleDescriptorIos
import typings.expoModulesAutolinking.typesMod.ModuleIosPodspecInfo
import typings.expoModulesAutolinking.typesMod.PackageRevision
import typings.expoModulesAutolinking.typesMod.SearchOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iosMod {
  
  @JSImport("expo-modules-autolinking/build/platforms/ios", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def formatArrayOfReactDelegateHandler(modules: js.Array[ModuleDescriptorIos]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatArrayOfReactDelegateHandler")(modules.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def generatePackageListAsync(modules: js.Array[ModuleDescriptorIos], targetPath: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("generatePackageListAsync")(modules.asInstanceOf[js.Any], targetPath.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def getSwiftModuleNames(pods: js.Array[ModuleIosPodspecInfo]): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSwiftModuleNames")(pods.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  inline def getSwiftModuleNames(pods: js.Array[ModuleIosPodspecInfo], swiftModuleNames: js.Array[String]): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSwiftModuleNames")(pods.asInstanceOf[js.Any], swiftModuleNames.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def resolveModuleAsync(packageName: String, revision: PackageRevision, options: SearchOptions): js.Promise[ModuleDescriptorIos | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveModuleAsync")(packageName.asInstanceOf[js.Any], revision.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ModuleDescriptorIos | Null]]
}
