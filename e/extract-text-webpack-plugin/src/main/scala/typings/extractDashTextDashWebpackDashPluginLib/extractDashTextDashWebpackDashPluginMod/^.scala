package typings
package extractDashTextDashWebpackDashPluginLib.extractDashTextDashWebpackDashPluginMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Use an `ExtractTextPlugin` instance and a loader returned by `extract` in concert to write files to disk instead of loading them into others.
  * Usage example at https://github.com/webpack/extract-text-webpack-plugin#usage-example-with-css
  */
@JSImport("extract-text-webpack-plugin", JSImport.Namespace)
@js.native
class ^ protected () extends ExtractTextPlugin {
  def this(options: PluginOptions) = this()
  /** Create a plugin instance defining the extraction target file(s) for the files loaded by `extract` */
  def this(options: java.lang.String) = this()
}

@JSImport("extract-text-webpack-plugin", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def extract(loader: LoaderOptions): js.Array[webpackLib.webpackMod.Loader] = js.native
  def extract(loader: js.Array[webpackLib.webpackMod.Loader]): js.Array[webpackLib.webpackMod.Loader] = js.native
  /**
    * Creates an extracting loader from an existing loader (static).
    * Use the resulting loader in `module.rules`/`module.loaders`.
    * @see {@link https://www.npmjs.com/package/extract-text-webpack-plugin#extract}
    */
  def extract(loader: webpackLib.webpackMod.Loader): js.Array[webpackLib.webpackMod.Loader] = js.native
}

