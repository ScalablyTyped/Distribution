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
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class IFlattenedPluginMutableBuilder[Self <: IFlattenedPlugin] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBrowserAPIs(value: js.Array[String]): Self = StObject.set(x, "browserAPIs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBrowserAPIsVarargs(value: String*): Self = StObject.set(x, "browserAPIs", js.Array(value :_*))
      
      @scala.inline
      def setNodeAPIs(value: js.Array[String]): Self = StObject.set(x, "nodeAPIs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodeAPIsVarargs(value: String*): Self = StObject.set(x, "nodeAPIs", js.Array(value :_*))
      
      @scala.inline
      def setSkipSSR(value: Boolean): Self = StObject.set(x, "skipSSR", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipSSRUndefined: Self = StObject.set(x, "skipSSR", js.undefined)
      
      @scala.inline
      def setSsrAPIs(value: js.Array[String]): Self = StObject.set(x, "ssrAPIs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSsrAPIsVarargs(value: String*): Self = StObject.set(x, "ssrAPIs", js.Array(value :_*))
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
    
    @scala.inline
    def apply(id: String, name: String, resolve: String, version: String): IPluginInfo = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], resolve = resolve.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[IPluginInfo]
    }
    
    @scala.inline
    implicit class IPluginInfoMutableBuilder[Self <: IPluginInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPluginOptions(value: IPluginInfoOptions): Self = StObject.set(x, "pluginOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPluginOptionsUndefined: Self = StObject.set(x, "pluginOptions", js.undefined)
      
      @scala.inline
      def setResolve(value: String): Self = StObject.set(x, "resolve", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  trait IPluginInfoOptions
    extends StObject
       with /* option */ StringDictionary[js.Any] {
    
    var path: js.UndefOr[String] = js.undefined
    
    var plugins: js.UndefOr[js.Array[IPluginInfo]] = js.undefined
  }
  object IPluginInfoOptions {
    
    @scala.inline
    def apply(): IPluginInfoOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IPluginInfoOptions]
    }
    
    @scala.inline
    implicit class IPluginInfoOptionsMutableBuilder[Self <: IPluginInfoOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setPlugins(value: js.Array[IPluginInfo]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
      
      @scala.inline
      def setPluginsVarargs(value: IPluginInfo*): Self = StObject.set(x, "plugins", js.Array(value :_*))
    }
  }
  
  trait IPluginRefObject extends StObject {
    
    var options: js.UndefOr[IPluginRefOptions] = js.undefined
    
    var parentDir: js.UndefOr[String] = js.undefined
    
    var resolve: String
  }
  object IPluginRefObject {
    
    @scala.inline
    def apply(resolve: String): IPluginRefObject = {
      val __obj = js.Dynamic.literal(resolve = resolve.asInstanceOf[js.Any])
      __obj.asInstanceOf[IPluginRefObject]
    }
    
    @scala.inline
    implicit class IPluginRefObjectMutableBuilder[Self <: IPluginRefObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOptions(value: IPluginRefOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      @scala.inline
      def setParentDir(value: String): Self = StObject.set(x, "parentDir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentDirUndefined: Self = StObject.set(x, "parentDir", js.undefined)
      
      @scala.inline
      def setResolve(value: String): Self = StObject.set(x, "resolve", value.asInstanceOf[js.Any])
    }
  }
  
  trait IPluginRefOptions
    extends StObject
       with /* option */ StringDictionary[js.Any] {
    
    var path: js.UndefOr[String] = js.undefined
    
    var plugins: js.UndefOr[js.Array[PluginRef]] = js.undefined
  }
  object IPluginRefOptions {
    
    @scala.inline
    def apply(): IPluginRefOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IPluginRefOptions]
    }
    
    @scala.inline
    implicit class IPluginRefOptionsMutableBuilder[Self <: IPluginRefOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setPlugins(value: js.Array[PluginRef]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
      
      @scala.inline
      def setPluginsVarargs(value: PluginRef*): Self = StObject.set(x, "plugins", js.Array(value :_*))
    }
  }
  
  trait IRawSiteConfig extends StObject {
    
    var plugins: js.UndefOr[js.Array[PluginRef]] = js.undefined
  }
  object IRawSiteConfig {
    
    @scala.inline
    def apply(): IRawSiteConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IRawSiteConfig]
    }
    
    @scala.inline
    implicit class IRawSiteConfigMutableBuilder[Self <: IRawSiteConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPlugins(value: js.Array[PluginRef]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
      
      @scala.inline
      def setPluginsVarargs(value: PluginRef*): Self = StObject.set(x, "plugins", js.Array(value :_*))
    }
  }
  
  trait ISiteConfig
    extends StObject
       with IRawSiteConfig {
    
    @JSName("plugins")
    var plugins_ISiteConfig: js.UndefOr[js.Array[IPluginRefObject]] = js.undefined
  }
  object ISiteConfig {
    
    @scala.inline
    def apply(): ISiteConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ISiteConfig]
    }
    
    @scala.inline
    implicit class ISiteConfigMutableBuilder[Self <: ISiteConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPlugins(value: js.Array[IPluginRefObject]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
      
      @scala.inline
      def setPluginsVarargs(value: IPluginRefObject*): Self = StObject.set(x, "plugins", js.Array(value :_*))
    }
  }
  
  type PluginRef = String | IPluginRefObject
}
