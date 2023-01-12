package typings.fileLoader

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("file-loader", JSImport.Namespace)
  @js.native
  val ^ : /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify loader.Loader */ Any = js.native
  
  /**
    * @param url
    * @param resourcePath original absolute path to the asset
    * @param context directory where assets are stored (`rootContext`), or the value of the `context` option if set.
    *
    * @return the path to use for the asset
    */
  type BuildResourcePathFn = js.Function3[/* url */ String, /* resourcePath */ String, /* context */ String, String]
  
  trait Options extends StObject {
    
    /**
      * Specifies a custom file context.
      *
      * @example
      * module.exports = {
      *   module: {
      *     rules: [
      *       {
      *         test: /\.(png|jpe?g|gif)$/i,
      *         use: [
      *           {
      *             loader: 'file-loader',
      *             options: {
      *               context: 'project',
      *             },
      *           },
      *         ],
      *       },
      *     ],
      *   },
      * };
      *
      * @default {@link https://webpack.js.org/configuration/entry-context/#context context}
      */
    var context: js.UndefOr[String] = js.undefined
    
    /**
      * If `true`, emits a file (writes a file to the filesystem); otherwise, the loader will return a public URI
      * but will not emit the file. It is often useful to disable this option for server-side packages.
      *
      * @default true
      */
    var emitFile: js.UndefOr[Boolean] = js.undefined
    
    /**
      * By default, file-loader generates JS modules that use the ES modules syntax.
      * There are some cases in which using ES modules is beneficial, like in the case of module concatenation and tree shaking.
      * @default true
      */
    var esModule: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Specifies a custom filename template for the target file(s) using the query parameter name.
      *
      * By default the path and name you specify will output the file in that same directory,
      * and will also use the same URI path to access the file.
      *
      * For example, to emit a file from your context directory into the output directory retaining the full
      * directory structure, you might use:
      *
      * @example
      * module.exports = {
      *   module: {
      *     rules: [
      *       {
      *         test: /\.(png|jpe?g|gif)$/i,
      *         loader: 'file-loader',
      *         options: {
      *           name: '[path][name].[ext]',
      *         },
      *       },
      *     ],
      *   },
      * };
      *
      * @example
      * module.exports = {
      *  module: {
      *    rules: [
      *      {
      *        test: /\.(png|jpe?g|gif)$/i,
      *        loader: 'file-loader',
      *        options: {
      *          name(file) {
      *            if (process.env.NODE_ENV === 'development') {
      *              return '[path][name].[ext]';
      *            }
      *
      *            return '[contenthash].[ext]';
      *          },
      *        },
      *      },
      *    ],
      *  },
      * };
      *
      * @default '[contenthash].[ext]'
      */
    var name: js.UndefOr[String | (js.Function1[/* file */ String, String])] = js.undefined
    
    /**
      * Specify a filesystem path where the target file(s) will be placed.
      *
      * Function gets passes the original absolute path to the asset,
      * as well as the directory where assets are stored.
      *
      * @example
      * module.exports = {
      *   module: {
      *     rules: [
      *       {
      *         test: /\.(png|jpe?g|gif)$/i,
      *         loader: 'file-loader',
      *         options: {
      *           outputPath: (url, resourcePath, context) => {
      *             if (/my-custom-image\.png/.test(resourcePath)) {
      *               return `other_output_path/${url}`;
      *             }
      *
      *             if (/images/.test(context)) {
      *               return `image_output_path/${url}`;
      *             }
      *
      *             return `output_path/${url}`;
      *           },
      *         },
      *       },
      *     ],
      *   },
      * };
      *
      * @default undefined
      */
    var outputPath: js.UndefOr[String | BuildResourcePathFn] = js.undefined
    
    /**
      * Specifies a custom function to post-process the generated public path.
      *
      * This can be used to prepend or append dynamic global variables that are only available at runtime, like
      * `__webpack_public_path__`. This would not be possible with just publicPath, since it stringifies the values.
      *
      * @example
      * module.exports = {
      *   module: {
      *     rules: [
      *       {
      *         test: /\.(png|jpg|gif)$/i,
      *         loader: 'file-loader',
      *         options: {
      *           publicPath: '/some/path/',
      *           postTransformPublicPath: (p) => `__webpack_public_path__ + ${p}`,
      *         },
      *       },
      *     ],
      *   },
      * };
      *
      * @default undefined
      */
    var postTransformPublicPath: js.UndefOr[js.Function1[/* p */ String, String]] = js.undefined
    
    /**
      * Specifies a custom public path for the target file(s).
      *
      * Function gets passes the original absolute path to the asset,
      * as well as the directory where assets are stored.
      *
      * @example
      * module.exports = {
      *  module: {
      *    rules: [
      *      {
      *        test: /\.(png|jpe?g|gif)$/i,
      *        loader: 'file-loader',
      *        options: {
      *          publicPath: (url, resourcePath, context) => {
      *            if (/my-custom-image\.png/.test(resourcePath)) {
      *              return `other_public_path/${url}`;
      *            }
      *
      *            if (/images/.test(context)) {
      *              return `image_output_path/${url}`;
      *            }
      *
      *            return `public_path/${url}`;
      *          },
      *        },
      *      },
      *    ],
      *  },
      * };
      *
      * @default {@link https://webpack.js.org/api/module-variables/#__webpack_public_path__-webpack-specific __webpack_public_path__}
      */
    var publicPath: js.UndefOr[String | BuildResourcePathFn] = js.undefined
    
    /**
      * Specifies a Regular Expression to one or many parts of the target file path.
      * The capture groups can be reused in the name property using [N]
      * {@link https://github.com/webpack-contrib/file-loader#placeholders placeholder}.
      *
      * If [0] is used, it will be replaced by the entire tested string,
      * whereas [1] will contain the first capturing parenthesis of your regex and so on...
      *
      * @example
      * // file.js
      * import img from './customer01/file.png';
      *
      * // webpack.config.js
      * module.exports = {
      *   module: {
      *     rules: [
      *       {
      *         test: /\.(png|jpe?g|gif)$/i,
      *         use: [
      *           {
      *             loader: 'file-loader',
      *             options: {
      *               regExp: /\/([a-z0-9]+)\/[a-z0-9]+\.png$/i,
      *               name: '[1]-[name].[ext]',
      *             },
      *           },
      *         ],
      *       },
      *     ],
      *   },
      * };
      *
      * @default undefined
      */
    var regExp: js.UndefOr[js.RegExp] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setContext(value: String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      inline def setEmitFile(value: Boolean): Self = StObject.set(x, "emitFile", value.asInstanceOf[js.Any])
      
      inline def setEmitFileUndefined: Self = StObject.set(x, "emitFile", js.undefined)
      
      inline def setEsModule(value: Boolean): Self = StObject.set(x, "esModule", value.asInstanceOf[js.Any])
      
      inline def setEsModuleUndefined: Self = StObject.set(x, "esModule", js.undefined)
      
      inline def setName(value: String | (js.Function1[/* file */ String, String])): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameFunction1(value: /* file */ String => String): Self = StObject.set(x, "name", js.Any.fromFunction1(value))
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOutputPath(value: String | BuildResourcePathFn): Self = StObject.set(x, "outputPath", value.asInstanceOf[js.Any])
      
      inline def setOutputPathFunction3(value: (/* url */ String, /* resourcePath */ String, /* context */ String) => String): Self = StObject.set(x, "outputPath", js.Any.fromFunction3(value))
      
      inline def setOutputPathUndefined: Self = StObject.set(x, "outputPath", js.undefined)
      
      inline def setPostTransformPublicPath(value: /* p */ String => String): Self = StObject.set(x, "postTransformPublicPath", js.Any.fromFunction1(value))
      
      inline def setPostTransformPublicPathUndefined: Self = StObject.set(x, "postTransformPublicPath", js.undefined)
      
      inline def setPublicPath(value: String | BuildResourcePathFn): Self = StObject.set(x, "publicPath", value.asInstanceOf[js.Any])
      
      inline def setPublicPathFunction3(value: (/* url */ String, /* resourcePath */ String, /* context */ String) => String): Self = StObject.set(x, "publicPath", js.Any.fromFunction3(value))
      
      inline def setPublicPathUndefined: Self = StObject.set(x, "publicPath", js.undefined)
      
      inline def setRegExp(value: js.RegExp): Self = StObject.set(x, "regExp", value.asInstanceOf[js.Any])
      
      inline def setRegExpUndefined: Self = StObject.set(x, "regExp", js.undefined)
    }
  }
  
  type _To = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify loader.Loader */ Any
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify loader.Loader */ Any = ^
}
