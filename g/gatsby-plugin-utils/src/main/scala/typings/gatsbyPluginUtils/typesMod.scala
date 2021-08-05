package typings.gatsbyPluginUtils

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  trait IFlattenedPlugin
    extends StObject
       with IPluginInfo {
    
    var browserAPIs: js.Array[String]
    
    var nodeAPIs: js.Array[String]
    
    var skipSSR: js.UndefOr[Boolean] = js.undefined
    
    var ssrAPIs: js.Array[String]
  }
  object IFlattenedPlugin {
    
    inline def apply(
      browserAPIs: js.Array[String],
      id: String,
      name: String,
      nodeAPIs: js.Array[String],
      resolve: String,
      ssrAPIs: js.Array[String],
      version: String
    ): IFlattenedPlugin = {
      val __obj = js.Dynamic.literal(browserAPIs = browserAPIs.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nodeAPIs = nodeAPIs.asInstanceOf[js.Any], resolve = resolve.asInstanceOf[js.Any], ssrAPIs = ssrAPIs.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[IFlattenedPlugin]
    }
    
    extension [Self <: IFlattenedPlugin](x: Self) {
      
      inline def setBrowserAPIs(value: js.Array[String]): Self = StObject.set(x, "browserAPIs", value.asInstanceOf[js.Any])
      
      inline def setBrowserAPIsVarargs(value: String*): Self = StObject.set(x, "browserAPIs", js.Array(value :_*))
      
      inline def setNodeAPIs(value: js.Array[String]): Self = StObject.set(x, "nodeAPIs", value.asInstanceOf[js.Any])
      
      inline def setNodeAPIsVarargs(value: String*): Self = StObject.set(x, "nodeAPIs", js.Array(value :_*))
      
      inline def setSkipSSR(value: Boolean): Self = StObject.set(x, "skipSSR", value.asInstanceOf[js.Any])
      
      inline def setSkipSSRUndefined: Self = StObject.set(x, "skipSSR", js.undefined)
      
      inline def setSsrAPIs(value: js.Array[String]): Self = StObject.set(x, "ssrAPIs", value.asInstanceOf[js.Any])
      
      inline def setSsrAPIsVarargs(value: String*): Self = StObject.set(x, "ssrAPIs", js.Array(value :_*))
    }
  }
  
  trait IPluginInfo extends StObject {
    
    /** Unique ID describing a plugin */
    var id: String
    
    /** The plugin name */
    var name: String
    
    /** Options passed to the plugin */
    var pluginOptions: js.UndefOr[IPluginInfoOptions] = js.undefined
    
    /** The absolute path to the plugin */
    var resolve: String
    
    /** The plugin version (can be content hash) */
    var version: String
  }
  object IPluginInfo {
    
    inline def apply(id: String, name: String, resolve: String, version: String): IPluginInfo = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], resolve = resolve.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[IPluginInfo]
    }
    
    extension [Self <: IPluginInfo](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPluginOptions(value: IPluginInfoOptions): Self = StObject.set(x, "pluginOptions", value.asInstanceOf[js.Any])
      
      inline def setPluginOptionsUndefined: Self = StObject.set(x, "pluginOptions", js.undefined)
      
      inline def setResolve(value: String): Self = StObject.set(x, "resolve", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  trait IPluginInfoOptions
    extends StObject
       with /* option */ StringDictionary[js.Any] {
    
    var path: js.UndefOr[String] = js.undefined
    
    var plugins: js.UndefOr[js.Array[IPluginInfo]] = js.undefined
  }
  object IPluginInfoOptions {
    
    inline def apply(): IPluginInfoOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IPluginInfoOptions]
    }
    
    extension [Self <: IPluginInfoOptions](x: Self) {
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setPlugins(value: js.Array[IPluginInfo]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      inline def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
      
      inline def setPluginsVarargs(value: IPluginInfo*): Self = StObject.set(x, "plugins", js.Array(value :_*))
    }
  }
  
  trait IPluginRefObject extends StObject {
    
    var options: js.UndefOr[IPluginRefOptions] = js.undefined
    
    var parentDir: js.UndefOr[String] = js.undefined
    
    var resolve: String
  }
  object IPluginRefObject {
    
    inline def apply(resolve: String): IPluginRefObject = {
      val __obj = js.Dynamic.literal(resolve = resolve.asInstanceOf[js.Any])
      __obj.asInstanceOf[IPluginRefObject]
    }
    
    extension [Self <: IPluginRefObject](x: Self) {
      
      inline def setOptions(value: IPluginRefOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setParentDir(value: String): Self = StObject.set(x, "parentDir", value.asInstanceOf[js.Any])
      
      inline def setParentDirUndefined: Self = StObject.set(x, "parentDir", js.undefined)
      
      inline def setResolve(value: String): Self = StObject.set(x, "resolve", value.asInstanceOf[js.Any])
    }
  }
  
  trait IPluginRefOptions
    extends StObject
       with /* option */ StringDictionary[js.Any] {
    
    var path: js.UndefOr[String] = js.undefined
    
    var plugins: js.UndefOr[js.Array[PluginRef]] = js.undefined
  }
  object IPluginRefOptions {
    
    inline def apply(): IPluginRefOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IPluginRefOptions]
    }
    
    extension [Self <: IPluginRefOptions](x: Self) {
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setPlugins(value: js.Array[PluginRef]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      inline def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
      
      inline def setPluginsVarargs(value: PluginRef*): Self = StObject.set(x, "plugins", js.Array(value :_*))
    }
  }
  
  trait IRawSiteConfig extends StObject {
    
    var plugins: js.UndefOr[js.Array[PluginRef]] = js.undefined
  }
  object IRawSiteConfig {
    
    inline def apply(): IRawSiteConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IRawSiteConfig]
    }
    
    extension [Self <: IRawSiteConfig](x: Self) {
      
      inline def setPlugins(value: js.Array[PluginRef]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      inline def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
      
      inline def setPluginsVarargs(value: PluginRef*): Self = StObject.set(x, "plugins", js.Array(value :_*))
    }
  }
  
  trait ISiteConfig
    extends StObject
       with IRawSiteConfig {
    
    @JSName("plugins")
    var plugins_ISiteConfig: js.UndefOr[js.Array[IPluginRefObject]] = js.undefined
  }
  object ISiteConfig {
    
    inline def apply(): ISiteConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ISiteConfig]
    }
    
    extension [Self <: ISiteConfig](x: Self) {
      
      inline def setPlugins(value: js.Array[IPluginRefObject]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      inline def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
      
      inline def setPluginsVarargs(value: IPluginRefObject*): Self = StObject.set(x, "plugins", js.Array(value :_*))
    }
  }
  
  type PluginRef = String | IPluginRefObject
}
