package typings
package extractDashTextDashWebpackDashPluginLib.extractDashTextDashWebpackDashPluginMod.ExtractTextPluginNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoaderOptions extends js.Object {
  /** the loader(s) that should be used when the css is not extracted (i.e. in an additional chunk when `allChunks: false`) */
  var fallback: js.UndefOr[
    webpackLib.webpackMod.webpackNs.Loader | js.Array[webpackLib.webpackMod.webpackNs.Loader]
  ] = js.undefined
  /** override the `publicPath` setting for this loader */
  var publicPath: js.UndefOr[java.lang.String] = js.undefined
  /** the loader(s) that should be used for converting the resource to a css exporting module */
  var use: webpackLib.webpackMod.webpackNs.Loader | js.Array[webpackLib.webpackMod.webpackNs.Loader]
}

