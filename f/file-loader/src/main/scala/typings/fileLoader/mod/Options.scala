package typings.fileLoader.mod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
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
  var context: js.UndefOr[String] = js.native
  
  /**
    * If `true`, emits a file (writes a file to the filesystem); otherwise, the loader will return a public URI
    * but will not emit the file. It is often useful to disable this option for server-side packages.
    *
    * @default true
    */
  var emitFile: js.UndefOr[Boolean] = js.native
  
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
  var name: js.UndefOr[String | (js.Function1[/* file */ String, String])] = js.native
  
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
  var outputPath: js.UndefOr[String | BuildResourcePathFn] = js.native
  
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
  var postTransformPublicPath: js.UndefOr[js.Function1[/* p */ String, String]] = js.native
  
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
  var publicPath: js.UndefOr[String | BuildResourcePathFn] = js.native
  
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
  var regExp: js.UndefOr[RegExp] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setContext(value: String): Self = this.set("context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    
    @scala.inline
    def setEmitFile(value: Boolean): Self = this.set("emitFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmitFile: Self = this.set("emitFile", js.undefined)
    
    @scala.inline
    def setNameFunction1(value: /* file */ String => String): Self = this.set("name", js.Any.fromFunction1(value))
    
    @scala.inline
    def setName(value: String | (js.Function1[/* file */ String, String])): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setOutputPathFunction3(value: (/* url */ String, /* resourcePath */ String, /* context */ String) => String): Self = this.set("outputPath", js.Any.fromFunction3(value))
    
    @scala.inline
    def setOutputPath(value: String | BuildResourcePathFn): Self = this.set("outputPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutputPath: Self = this.set("outputPath", js.undefined)
    
    @scala.inline
    def setPostTransformPublicPath(value: /* p */ String => String): Self = this.set("postTransformPublicPath", js.Any.fromFunction1(value))
    
    @scala.inline
    def deletePostTransformPublicPath: Self = this.set("postTransformPublicPath", js.undefined)
    
    @scala.inline
    def setPublicPathFunction3(value: (/* url */ String, /* resourcePath */ String, /* context */ String) => String): Self = this.set("publicPath", js.Any.fromFunction3(value))
    
    @scala.inline
    def setPublicPath(value: String | BuildResourcePathFn): Self = this.set("publicPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublicPath: Self = this.set("publicPath", js.undefined)
    
    @scala.inline
    def setRegExp(value: RegExp): Self = this.set("regExp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegExp: Self = this.set("regExp", js.undefined)
  }
}
