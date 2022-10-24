package typings.expoMetroConfig

import typings.expoMetroConfig.anon.Folders
import typings.expoMetroConfig.anon.FoldersModuleIds
import typings.expoMetroConfig.anon.ModuleIds
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildTransformerCreateMatcherMod {
  
  @JSImport("@expo/metro-config/build/transformer/createMatcher", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createExpoMatcher(param0: Folders): js.RegExp = ^.asInstanceOf[js.Dynamic].applyDynamic("createExpoMatcher")(param0.asInstanceOf[js.Any]).asInstanceOf[js.RegExp]
  
  inline def createKnownCommunityMatcher(): js.RegExp = ^.asInstanceOf[js.Dynamic].applyDynamic("createKnownCommunityMatcher")().asInstanceOf[js.RegExp]
  inline def createKnownCommunityMatcher(param0: ModuleIds): js.RegExp = ^.asInstanceOf[js.Dynamic].applyDynamic("createKnownCommunityMatcher")(param0.asInstanceOf[js.Any]).asInstanceOf[js.RegExp]
  
  inline def createModuleMatcher(param0: FoldersModuleIds): js.RegExp = ^.asInstanceOf[js.Dynamic].applyDynamic("createModuleMatcher")(param0.asInstanceOf[js.Any]).asInstanceOf[js.RegExp]
  
  inline def createReactNativeMatcher(param0: Folders): js.RegExp = ^.asInstanceOf[js.Dynamic].applyDynamic("createReactNativeMatcher")(param0.asInstanceOf[js.Any]).asInstanceOf[js.RegExp]
}
