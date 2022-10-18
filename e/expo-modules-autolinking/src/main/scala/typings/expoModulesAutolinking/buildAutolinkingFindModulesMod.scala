package typings.expoModulesAutolinking

import typings.expoModulesAutolinking.buildTypesMod.SearchOptions
import typings.expoModulesAutolinking.buildTypesMod.SearchResults
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildAutolinkingFindModulesMod {
  
  @JSImport("expo-modules-autolinking/build/autolinking/findModules", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def findModulesAsync(providedOptions: SearchOptions): js.Promise[SearchResults] = ^.asInstanceOf[js.Dynamic].applyDynamic("findModulesAsync")(providedOptions.asInstanceOf[js.Any]).asInstanceOf[js.Promise[SearchResults]]
}
