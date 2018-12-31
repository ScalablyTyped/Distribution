package typings
package extractDashTextDashWebpackDashPluginLib.extractDashTextDashWebpackDashPluginMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Use an `ExtractTextPlugin` instance and a loader returned by `extract` in concert to write files to disk instead of loading them into others.
  * Usage example at https://github.com/webpack/extract-text-webpack-plugin#usage-example-with-css
  */
@js.native
trait ExtractTextPlugin
  extends webpackLib.webpackMod.Plugin {
  def extract(
    loader: extractDashTextDashWebpackDashPluginLib.extractDashTextDashWebpackDashPluginMod.ExtractTextPluginNs.LoaderOptions
  ): js.Array[webpackLib.webpackMod.webpackNs.Loader] = js.native
  def extract(loader: js.Array[webpackLib.webpackMod.webpackNs.Loader]): js.Array[webpackLib.webpackMod.webpackNs.Loader] = js.native
  /**
    * Creates an extracting loader from an existing loader (instance).
    * Use the resulting loader in `module.rules`/`module.loaders`.
    * @see {@link https://www.npmjs.com/package/extract-text-webpack-plugin#multiple-instances}
    */
  def extract(loader: webpackLib.webpackMod.webpackNs.Loader): js.Array[webpackLib.webpackMod.webpackNs.Loader] = js.native
}

