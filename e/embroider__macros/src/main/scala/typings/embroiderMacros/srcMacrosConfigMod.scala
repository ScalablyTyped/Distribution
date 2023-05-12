package typings.embroiderMacros

import typings.babelCore.mod.PluginItem
import typings.embroiderMacros.anon.LazyParams
import typings.embroiderMacros.anon.Root
import typings.embroiderMacros.embroiderMacrosStrings.cjs
import typings.embroiderMacros.embroiderMacrosStrings.eager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcMacrosConfigMod {
  
  @JSImport("@embroider/macros/src/macros-config", JSImport.Default)
  @js.native
  /* private */ open class default ()
    extends StObject
       with MacrosConfig
  /* static members */
  object default {
    
    @JSImport("@embroider/macros/src/macros-config", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def astPlugins(): LazyParams = ^.asInstanceOf[js.Dynamic].applyDynamic("astPlugins")().asInstanceOf[LazyParams]
    inline def astPlugins(owningPackageRoot: String): LazyParams = ^.asInstanceOf[js.Dynamic].applyDynamic("astPlugins")(owningPackageRoot.asInstanceOf[js.Any]).asInstanceOf[LazyParams]
    
    inline def `for`(key: Any, appRoot: String): MacrosConfig = (^.asInstanceOf[js.Dynamic].applyDynamic("for")(key.asInstanceOf[js.Any], appRoot.asInstanceOf[js.Any])).asInstanceOf[MacrosConfig]
    
    inline def transforms(): LazyParams = ^.asInstanceOf[js.Dynamic].applyDynamic("transforms")().asInstanceOf[LazyParams]
    inline def transforms(owningPackageRoot: String): LazyParams = ^.asInstanceOf[js.Dynamic].applyDynamic("transforms")(owningPackageRoot.asInstanceOf[js.Any]).asInstanceOf[LazyParams]
  }
  
  @js.native
  trait MacrosConfig extends StObject {
    
    /* private */ var _configWritable: Any = js.native
    
    /* private */ var _importSyncImplementation: Any = js.native
    
    /* private */ def appRoot: Any = js.native
    
    def babelPluginConfig(): js.Array[PluginItem] = js.native
    def babelPluginConfig(appOrAddonInstance: Any): js.Array[PluginItem] = js.native
    
    /* private */ var cachedUserConfigs: Any = js.native
    
    /* private */ var configSources: Any = js.native
    
    /* private */ var configs: Any = js.native
    
    def enablePackageDevelopment(packageRoot: String): Unit = js.native
    
    def enableRuntimeMode(): Unit = js.native
    
    /* private */ var globalConfig: Any = js.native
    
    def importSyncImplementation: cjs | eager = js.native
    def importSyncImplementation_=(value: cjs | eager): Unit = js.native
    
    /* private */ var internalSetConfig: Any = js.native
    
    /* private */ var isDevelopingPackageRoots: Any = js.native
    
    /* private */ var makeConfigSourcer: Any = js.native
    
    /* private */ var mergerFor: Any = js.native
    
    /* private */ var mergers: Any = js.native
    
    /* private */ var mode: Any = js.native
    
    /* private */ var moves: Any = js.native
    
    /* private */ var origAppRoot: Any = js.native
    
    /* private */ def packageCache: Any = js.native
    
    def packageMoved(oldPath: String, newPath: String): Unit = js.native
    
    /* private */ var resolvePackage: Any = js.native
    
    def setConfig(fromPath: String, packageName: String, config: js.Object): Unit = js.native
    
    def setGlobalConfig(fromPath: String, key: String, value: js.Object): Unit = js.native
    
    def setOwnConfig(fromPath: String, config: js.Object): Unit = js.native
    
    def useMerger(fromPath: String, merger: Merger): Unit = js.native
    
    /* private */ def userConfigs: Any = js.native
  }
  
  type Merger = js.Function2[
    /* configs */ js.Array[js.Object], 
    /* params */ typings.embroiderMacros.anon.SourceOfConfig, 
    js.Object
  ]
  
  type SourceOfConfig = js.Function1[/* config */ js.Object, Root]
}
