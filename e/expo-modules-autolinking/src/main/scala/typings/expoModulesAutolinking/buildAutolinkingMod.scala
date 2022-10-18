package typings.expoModulesAutolinking

import typings.expoModulesAutolinking.buildTypesMod.GenerateOptions
import typings.expoModulesAutolinking.buildTypesMod.ModuleDescriptor
import typings.expoModulesAutolinking.buildTypesMod.ResolveOptions
import typings.expoModulesAutolinking.buildTypesMod.SearchOptions
import typings.expoModulesAutolinking.buildTypesMod.SearchResults
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildAutolinkingMod {
  
  @JSImport("expo-modules-autolinking/build/autolinking", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def findModulesAsync(providedOptions: SearchOptions): js.Promise[SearchResults] = ^.asInstanceOf[js.Dynamic].applyDynamic("findModulesAsync")(providedOptions.asInstanceOf[js.Any]).asInstanceOf[js.Promise[SearchResults]]
  
  inline def generatePackageListAsync(modules: js.Array[ModuleDescriptor], options: GenerateOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("generatePackageListAsync")(modules.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def mergeLinkingOptionsAsync[OptionsType /* <: SearchOptions */](providedOptions: OptionsType): js.Promise[OptionsType] = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeLinkingOptionsAsync")(providedOptions.asInstanceOf[js.Any]).asInstanceOf[js.Promise[OptionsType]]
  
  inline def resolveModulesAsync(searchResults: SearchResults, options: ResolveOptions): js.Promise[js.Array[ModuleDescriptor]] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveModulesAsync")(searchResults.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[ModuleDescriptor]]]
  
  inline def resolveSearchPathsAsync(searchPaths: js.Array[String], cwd: String): js.Promise[js.Array[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveSearchPathsAsync")(searchPaths.asInstanceOf[js.Any], cwd.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[String]]]
  inline def resolveSearchPathsAsync(searchPaths: Null, cwd: String): js.Promise[js.Array[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveSearchPathsAsync")(searchPaths.asInstanceOf[js.Any], cwd.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[String]]]
  
  inline def verifySearchResults(searchResults: SearchResults): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("verifySearchResults")(searchResults.asInstanceOf[js.Any]).asInstanceOf[Double]
}
