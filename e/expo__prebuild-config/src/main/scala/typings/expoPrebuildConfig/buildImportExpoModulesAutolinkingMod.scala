package typings.expoPrebuildConfig

import org.scalablytyped.runtime.StringDictionary
import typings.expoPrebuildConfig.expoPrebuildConfigStrings.android
import typings.expoPrebuildConfig.expoPrebuildConfigStrings.ios
import typings.expoPrebuildConfig.expoPrebuildConfigStrings.web
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildImportExpoModulesAutolinkingMod {
  
  @JSImport("@expo/prebuild-config/build/importExpoModulesAutolinking", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def importExpoModulesAutolinking(projectRoot: String): AutolinkingModule = ^.asInstanceOf[js.Dynamic].applyDynamic("importExpoModulesAutolinking")(projectRoot.asInstanceOf[js.Any]).asInstanceOf[AutolinkingModule]
  
  @js.native
  trait AutolinkingModule extends StObject {
    
    def findModulesAsync(providedOptions: SearchOptions): js.Promise[SearchResults] = js.native
    
    def resolveSearchPathsAsync(searchPaths: js.Array[String], cwd: String): js.Promise[js.Array[String]] = js.native
    def resolveSearchPathsAsync(searchPaths: Null, cwd: String): js.Promise[js.Array[String]] = js.native
  }
  
  trait SearchOptions extends StObject {
    
    var platform: ios | android | web
    
    var searchPaths: js.Array[String]
    
    var silent: js.UndefOr[Boolean] = js.undefined
  }
  object SearchOptions {
    
    inline def apply(platform: ios | android | web, searchPaths: js.Array[String]): SearchOptions = {
      val __obj = js.Dynamic.literal(platform = platform.asInstanceOf[js.Any], searchPaths = searchPaths.asInstanceOf[js.Any])
      __obj.asInstanceOf[SearchOptions]
    }
    
    extension [Self <: SearchOptions](x: Self) {
      
      inline def setPlatform(value: ios | android | web): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
      
      inline def setSearchPaths(value: js.Array[String]): Self = StObject.set(x, "searchPaths", value.asInstanceOf[js.Any])
      
      inline def setSearchPathsVarargs(value: String*): Self = StObject.set(x, "searchPaths", js.Array(value*))
      
      inline def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
      
      inline def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
    }
  }
  
  type SearchResults = StringDictionary[js.Object]
}
