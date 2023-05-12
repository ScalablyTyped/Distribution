package typings.falWorksEsbuildPluginGlobalExternals

import typings.esbuild.mod.Plugin
import typings.falWorksEsbuildPluginGlobalExternals.libModuleInfoMod.ModuleInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libWithRegExpMod {
  
  @JSImport("@fal-works/esbuild-plugin-global-externals/lib/with-reg-exp", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def globalExternalsWithRegExp[T /* <: String */](globals: GlobalsMapper[T]): Plugin = ^.asInstanceOf[js.Dynamic].applyDynamic("globalExternalsWithRegExp")(globals.asInstanceOf[js.Any]).asInstanceOf[Plugin]
  
  trait GlobalsMapper[T /* <: String */] extends StObject {
    
    /**
      * Function that returns either a corresponding global variable name or a
      * `ModuleInfo` object for the module at `modulePath`.
      */
    def getModuleInfo(modulePath: T): String | ModuleInfo
    
    /**
      * Regular expression that match module paths to be processed by this plugin.
      *
      * @see <https://esbuild.github.io/plugins/>
      */
    var modulePathFilter: js.RegExp
  }
  object GlobalsMapper {
    
    inline def apply[T /* <: String */](getModuleInfo: T => String | ModuleInfo, modulePathFilter: js.RegExp): GlobalsMapper[T] = {
      val __obj = js.Dynamic.literal(getModuleInfo = js.Any.fromFunction1(getModuleInfo), modulePathFilter = modulePathFilter.asInstanceOf[js.Any])
      __obj.asInstanceOf[GlobalsMapper[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GlobalsMapper[?], T /* <: String */] (val x: Self & GlobalsMapper[T]) extends AnyVal {
      
      inline def setGetModuleInfo(value: T => String | ModuleInfo): Self = StObject.set(x, "getModuleInfo", js.Any.fromFunction1(value))
      
      inline def setModulePathFilter(value: js.RegExp): Self = StObject.set(x, "modulePathFilter", value.asInstanceOf[js.Any])
    }
  }
}
