package typings.extractDashTextDashWebpackDashPlugin.extractDashTextDashWebpackDashPluginMod

import typings.webpack.webpackMod.Loader
import typings.webpack.webpackMod.Plugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Use an `ExtractTextPlugin` instance and a loader returned by `extract` in concert to write files to disk instead of loading them into others.
  * Usage example at https://github.com/webpack/extract-text-webpack-plugin#usage-example-with-css
  */
@js.native
trait ExtractTextPlugin extends Plugin {
  def extract(loader: js.Array[Loader]): js.Array[Loader] = js.native
  def extract(loader: LoaderOptions): js.Array[Loader] = js.native
  /**
    * Creates an extracting loader from an existing loader (instance).
    * Use the resulting loader in `module.rules`/`module.loaders`.
    * @see {@link https://www.npmjs.com/package/extract-text-webpack-plugin#multiple-instances}
    */
  def extract(loader: Loader): js.Array[Loader] = js.native
}

