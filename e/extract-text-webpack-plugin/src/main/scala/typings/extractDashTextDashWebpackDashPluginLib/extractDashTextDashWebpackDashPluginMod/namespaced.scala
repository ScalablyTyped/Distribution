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
class namespaced protected () extends ExtractTextPlugin {
  def this(options: extractDashTextDashWebpackDashPluginLib.extractDashTextDashWebpackDashPluginMod.ExtractTextPluginNs.PluginOptions) = this()
  /** Create a plugin instance defining the extraction target file(s) for the files loaded by `extract` */
  def this(options: java.lang.String) = this()
}

/* static members */
@JSImport("extract-text-webpack-plugin", JSImport.Namespace)
@js.native
object namespaced extends js.Object {
  def extract(
    loader: extractDashTextDashWebpackDashPluginLib.extractDashTextDashWebpackDashPluginMod.ExtractTextPluginNs.LoaderOptions
  ): js.Array[webpackLib.webpackMod.webpackNs.Loader] = js.native
  def extract(loader: js.Array[webpackLib.webpackMod.webpackNs.Loader]): js.Array[webpackLib.webpackMod.webpackNs.Loader] = js.native
  /**
    * Creates an extracting loader from an existing loader (static).
    * Use the resulting loader in `module.rules`/`module.loaders`.
    * @see {@link https://www.npmjs.com/package/extract-text-webpack-plugin#extract}
    */
  def extract(loader: webpackLib.webpackMod.webpackNs.Loader): js.Array[webpackLib.webpackMod.webpackNs.Loader] = js.native
}

