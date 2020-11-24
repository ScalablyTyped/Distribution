package typings.extractTextWebpackPlugin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
object ^ extends js.Object {
  
  /**
    * Creates an extracting loader from an existing loader (static).
    * Use the resulting loader in `module.rules`/`module.loaders`.
    * @see {@link https://www.npmjs.com/package/extract-text-webpack-plugin#extract}
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
