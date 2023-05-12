package typings.embroiderMacros

import typings.babelCore.mod.PluginItem
import typings.embroiderMacros.anon.LazyParams
import typings.embroiderMacros.srcMacrosConfigMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNodeMod {
  
  @JSImport("@embroider/macros/src/node", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@embroider/macros/src/node", "MacrosConfig")
  @js.native
  /* private */ open class MacrosConfig () extends default
  /* static members */
  object MacrosConfig {
    
    @JSImport("@embroider/macros/src/node", "MacrosConfig")
    @js.native
    val ^ : js.Any = js.native
    
    inline def astPlugins(): LazyParams = ^.asInstanceOf[js.Dynamic].applyDynamic("astPlugins")().asInstanceOf[LazyParams]
    inline def astPlugins(owningPackageRoot: String): LazyParams = ^.asInstanceOf[js.Dynamic].applyDynamic("astPlugins")(owningPackageRoot.asInstanceOf[js.Any]).asInstanceOf[LazyParams]
    
    inline def `for`(key: Any, appRoot: String): typings.embroiderMacros.srcMacrosConfigMod.MacrosConfig = (^.asInstanceOf[js.Dynamic].applyDynamic("for")(key.asInstanceOf[js.Any], appRoot.asInstanceOf[js.Any])).asInstanceOf[typings.embroiderMacros.srcMacrosConfigMod.MacrosConfig]
    
    inline def transforms(): LazyParams = ^.asInstanceOf[js.Dynamic].applyDynamic("transforms")().asInstanceOf[LazyParams]
    inline def transforms(owningPackageRoot: String): LazyParams = ^.asInstanceOf[js.Dynamic].applyDynamic("transforms")(owningPackageRoot.asInstanceOf[js.Any]).asInstanceOf[LazyParams]
  }
  
  inline def isEmbroiderMacrosPlugin(item: PluginItem): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("isEmbroiderMacrosPlugin")(item.asInstanceOf[js.Any]).asInstanceOf[Any]
}
