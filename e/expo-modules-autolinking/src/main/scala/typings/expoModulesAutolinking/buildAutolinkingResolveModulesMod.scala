package typings.expoModulesAutolinking

import typings.expoModulesAutolinking.buildTypesMod.ModuleDescriptor
import typings.expoModulesAutolinking.buildTypesMod.ResolveOptions
import typings.expoModulesAutolinking.buildTypesMod.SearchResults
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildAutolinkingResolveModulesMod {
  
  @JSImport("expo-modules-autolinking/build/autolinking/resolveModules", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def resolveModulesAsync(searchResults: SearchResults, options: ResolveOptions): js.Promise[js.Array[ModuleDescriptor]] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveModulesAsync")(searchResults.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[ModuleDescriptor]]]
}
