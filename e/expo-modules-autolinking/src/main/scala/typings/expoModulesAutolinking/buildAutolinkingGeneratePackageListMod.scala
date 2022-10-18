package typings.expoModulesAutolinking

import typings.expoModulesAutolinking.buildTypesMod.GenerateOptions
import typings.expoModulesAutolinking.buildTypesMod.ModuleDescriptor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildAutolinkingGeneratePackageListMod {
  
  @JSImport("expo-modules-autolinking/build/autolinking/generatePackageList", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def generatePackageListAsync(modules: js.Array[ModuleDescriptor], options: GenerateOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("generatePackageListAsync")(modules.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
}
