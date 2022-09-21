package typings.expoMetroConfig

import typings.expoMetroConfig.anon.Folders
import typings.expoMetroConfig.anon.ModuleIds
import typings.expoMetroConfig.anon.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createMatcherMod {
  
  @JSImport("@expo/metro-config/build/transformer/createMatcher", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createExpoMatcher(hasFolders: `0`): js.RegExp = ^.asInstanceOf[js.Dynamic].applyDynamic("createExpoMatcher")(hasFolders.asInstanceOf[js.Any]).asInstanceOf[js.RegExp]
  
  inline def createKnownCommunityMatcher(): js.RegExp = ^.asInstanceOf[js.Dynamic].applyDynamic("createKnownCommunityMatcher")().asInstanceOf[js.RegExp]
  inline def createKnownCommunityMatcher(hasFoldersModuleIds: ModuleIds): js.RegExp = ^.asInstanceOf[js.Dynamic].applyDynamic("createKnownCommunityMatcher")(hasFoldersModuleIds.asInstanceOf[js.Any]).asInstanceOf[js.RegExp]
  
  inline def createModuleMatcher(hasFoldersModuleIds: Folders): js.RegExp = ^.asInstanceOf[js.Dynamic].applyDynamic("createModuleMatcher")(hasFoldersModuleIds.asInstanceOf[js.Any]).asInstanceOf[js.RegExp]
  
  inline def createReactNativeMatcher(hasFolders: `0`): js.RegExp = ^.asInstanceOf[js.Dynamic].applyDynamic("createReactNativeMatcher")(hasFolders.asInstanceOf[js.Any]).asInstanceOf[js.RegExp]
}
