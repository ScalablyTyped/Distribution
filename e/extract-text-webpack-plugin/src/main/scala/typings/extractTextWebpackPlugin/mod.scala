package typings.extractTextWebpackPlugin

import typings.std.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Use an `ExtractTextPlugin` instance and a loader returned by `extract` in concert to write files to disk instead of loading them into others.
    * Usage example at https://github.com/webpack/extract-text-webpack-plugin#usage-example-with-css
    */
  @JSImport("extract-text-webpack-plugin", JSImport.Namespace)
  @js.native
  class ^ protected () extends ExtractTextPlugin {
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
  def extract: js.Function1[
    /* loader */ (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Loader */ js.Any) | (js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Loader */ js.Any
    ]) | LoaderOptions, 
    js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Loader */ js.Any
    ]
  ] = js.native
  @scala.inline
  def extract_=(
    x: js.Function1[
      /* loader */ (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Loader */ js.Any) | (js.Array[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Loader */ js.Any
      ]) | LoaderOptions, 
      js.Array[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Loader */ js.Any
      ]
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extract")(x.asInstanceOf[js.Any])
  
  /**
    * Use an `ExtractTextPlugin` instance and a loader returned by `extract` in concert to write files to disk instead of loading them into others.
    * Usage example at https://github.com/webpack/extract-text-webpack-plugin#usage-example-with-css
    */
  @js.native
  trait ExtractTextPlugin extends Plugin {
    
    /**
      * Creates an extracting loader from an existing loader (instance).
      * Use the resulting loader in `module.rules`/`module.loaders`.
      * @see {@link https://www.npmjs.com/package/extract-text-webpack-plugin#multiple-instances}
      */
    def extract(
      loader: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Loader */ js.Any
    ): js.Array[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Loader */ _
      ] = js.native
    def extract(
      loader: js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Loader */ _
        ]
    ): js.Array[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Loader */ _
      ] = js.native
    def extract(loader: LoaderOptions): js.Array[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Loader */ _
      ] = js.native
  }
  
  @js.native
  trait LoaderOptions extends StObject {
    
    /** the loader(s) that should be used when the css is not extracted (i.e. in an additional chunk when `allChunks: false`) */
    var fallback: js.UndefOr[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Loader */ js.Any) | (js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Loader */ _
        ])
      ] = js.native
    
    /** override the `publicPath` setting for this loader */
    var publicPath: js.UndefOr[String] = js.native
    
    /** the loader(s) that should be used for converting the resource to a css exporting module */
    var use: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Loader */ js.Any) | (js.Array[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Loader */ _
      ]) = js.native
  }
  object LoaderOptions {
    
    @scala.inline
    def apply(
      use: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Loader */ js.Any) | (js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Loader */ _
        ])
    ): LoaderOptions = {
      val __obj = js.Dynamic.literal(use = use.asInstanceOf[js.Any])
      __obj.asInstanceOf[LoaderOptions]
    }
    
    @scala.inline
    implicit class LoaderOptionsMutableBuilder[Self <: LoaderOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFallback(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Loader */ js.Any) | (js.Array[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Loader */ _
            ])
      ): Self = StObject.set(x, "fallback", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFallbackUndefined: Self = StObject.set(x, "fallback", js.undefined)
      
      @scala.inline
      def setFallbackVarargs(value: js.Any*): Self = StObject.set(x, "fallback", js.Array(value :_*))
      
      @scala.inline
      def setPublicPath(value: String): Self = StObject.set(x, "publicPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPublicPathUndefined: Self = StObject.set(x, "publicPath", js.undefined)
      
      @scala.inline
      def setUse(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Loader */ js.Any) | (js.Array[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Loader */ _
            ])
      ): Self = StObject.set(x, "use", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseVarargs(value: js.Any*): Self = StObject.set(x, "use", js.Array(value :_*))
    }
  }
  
  @js.native
  trait PluginOptions extends StObject {
    
    /** extract from all additional chunks too (by default it extracts only from the initial chunk(s)) */
    var allChunks: js.UndefOr[Boolean] = js.native
    
    /** disables the plugin */
    var disable: js.UndefOr[Boolean] = js.native
    
    /** the filename of the result file. May contain `[name]`, `[id]` and `[contenthash]` */
    var filename: String = js.native
    
    /** Unique ident for this plugin instance. (For advanced usage only, by default automatically generated) */
    var id: js.UndefOr[String] = js.native
  }
  object PluginOptions {
    
    @scala.inline
    def apply(filename: String): PluginOptions = {
      val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any])
      __obj.asInstanceOf[PluginOptions]
    }
    
    @scala.inline
    implicit class PluginOptionsMutableBuilder[Self <: PluginOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllChunks(value: Boolean): Self = StObject.set(x, "allChunks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllChunksUndefined: Self = StObject.set(x, "allChunks", js.undefined)
      
      @scala.inline
      def setDisable(value: Boolean): Self = StObject.set(x, "disable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableUndefined: Self = StObject.set(x, "disable", js.undefined)
      
      @scala.inline
      def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    }
  }
}
