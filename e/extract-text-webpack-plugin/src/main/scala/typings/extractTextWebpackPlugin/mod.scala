package typings.extractTextWebpackPlugin

import typings.webpack.mod.Loader
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Use an `ExtractTextPlugin` instance and a loader returned by `extract` in concert to write files to disk instead of loading them into others.
    * Usage example at https://github.com/webpack/extract-text-webpack-plugin#usage-example-with-css
    */
  @JSImport("extract-text-webpack-plugin", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with ExtractTextPlugin {
    /** Create a plugin instance defining the extraction target file(s) for the files loaded by `extract` */
    def this(options: String) = this()
    def this(options: PluginOptions) = this()
  }
  @JSImport("extract-text-webpack-plugin", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates an extracting loader from an existing loader (static).
    * Use the resulting loader in `module.rules`/`module.loaders`.
    * @see {@link https://www.npmjs.com/package/extract-text-webpack-plugin#extract}
    */
  /* static member */
  @JSImport("extract-text-webpack-plugin", "extract")
  @js.native
  def extract: js.Function1[/* loader */ Loader | js.Array[Loader] | LoaderOptions, js.Array[Loader]] = js.native
  inline def extract_=(x: js.Function1[/* loader */ Loader | js.Array[Loader] | LoaderOptions, js.Array[Loader]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extract")(x.asInstanceOf[js.Any])
  
  /**
    * Use an `ExtractTextPlugin` instance and a loader returned by `extract` in concert to write files to disk instead of loading them into others.
    * Usage example at https://github.com/webpack/extract-text-webpack-plugin#usage-example-with-css
    */
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped webpack.anon.Apply | (this : webpack.webpack.Resolver, arg1 : webpack.webpack.Resolver): void */ @js.native
  trait ExtractTextPlugin extends StObject {
    
    def extract(loader: js.Array[Loader]): js.Array[Loader] = js.native
    def extract(loader: LoaderOptions): js.Array[Loader] = js.native
    /**
      * Creates an extracting loader from an existing loader (instance).
      * Use the resulting loader in `module.rules`/`module.loaders`.
      * @see {@link https://www.npmjs.com/package/extract-text-webpack-plugin#multiple-instances}
      */
    def extract(loader: Loader): js.Array[Loader] = js.native
  }
  
  trait LoaderOptions extends StObject {
    
    /** the loader(s) that should be used when the css is not extracted (i.e. in an additional chunk when `allChunks: false`) */
    var fallback: js.UndefOr[Loader | js.Array[Loader]] = js.undefined
    
    /** override the `publicPath` setting for this loader */
    var publicPath: js.UndefOr[String] = js.undefined
    
    /** the loader(s) that should be used for converting the resource to a css exporting module */
    var use: Loader | js.Array[Loader]
  }
  object LoaderOptions {
    
    inline def apply(use: Loader | js.Array[Loader]): LoaderOptions = {
      val __obj = js.Dynamic.literal(use = use.asInstanceOf[js.Any])
      __obj.asInstanceOf[LoaderOptions]
    }
    
    extension [Self <: LoaderOptions](x: Self) {
      
      inline def setFallback(value: Loader | js.Array[Loader]): Self = StObject.set(x, "fallback", value.asInstanceOf[js.Any])
      
      inline def setFallbackUndefined: Self = StObject.set(x, "fallback", js.undefined)
      
      inline def setFallbackVarargs(value: Loader*): Self = StObject.set(x, "fallback", js.Array(value*))
      
      inline def setPublicPath(value: String): Self = StObject.set(x, "publicPath", value.asInstanceOf[js.Any])
      
      inline def setPublicPathUndefined: Self = StObject.set(x, "publicPath", js.undefined)
      
      inline def setUse(value: Loader | js.Array[Loader]): Self = StObject.set(x, "use", value.asInstanceOf[js.Any])
      
      inline def setUseVarargs(value: Loader*): Self = StObject.set(x, "use", js.Array(value*))
    }
  }
  
  trait PluginOptions extends StObject {
    
    /** extract from all additional chunks too (by default it extracts only from the initial chunk(s)) */
    var allChunks: js.UndefOr[Boolean] = js.undefined
    
    /** disables the plugin */
    var disable: js.UndefOr[Boolean] = js.undefined
    
    /** the filename of the result file. May contain `[name]`, `[id]` and `[contenthash]` */
    var filename: String
    
    /** Unique ident for this plugin instance. (For advanced usage only, by default automatically generated) */
    var id: js.UndefOr[String] = js.undefined
  }
  object PluginOptions {
    
    inline def apply(filename: String): PluginOptions = {
      val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any])
      __obj.asInstanceOf[PluginOptions]
    }
    
    extension [Self <: PluginOptions](x: Self) {
      
      inline def setAllChunks(value: Boolean): Self = StObject.set(x, "allChunks", value.asInstanceOf[js.Any])
      
      inline def setAllChunksUndefined: Self = StObject.set(x, "allChunks", js.undefined)
      
      inline def setDisable(value: Boolean): Self = StObject.set(x, "disable", value.asInstanceOf[js.Any])
      
      inline def setDisableUndefined: Self = StObject.set(x, "disable", js.undefined)
      
      inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    }
  }
}
