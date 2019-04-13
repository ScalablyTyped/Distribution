package typings
package extractDashTextDashWebpackDashPluginLib.extractDashTextDashWebpackDashPluginMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoaderOptions extends js.Object {
  /** the loader(s) that should be used when the css is not extracted (i.e. in an additional chunk when `allChunks: false`) */
  var fallback: js.UndefOr[webpackLib.webpackMod.Loader | js.Array[webpackLib.webpackMod.Loader]] = js.undefined
  /** override the `publicPath` setting for this loader */
  var publicPath: js.UndefOr[java.lang.String] = js.undefined
  /** the loader(s) that should be used for converting the resource to a css exporting module */
  var use: webpackLib.webpackMod.Loader | js.Array[webpackLib.webpackMod.Loader]
}

object LoaderOptions {
  @scala.inline
  def apply(
    use: webpackLib.webpackMod.Loader | js.Array[webpackLib.webpackMod.Loader],
    fallback: webpackLib.webpackMod.Loader | js.Array[webpackLib.webpackMod.Loader] = null,
    publicPath: java.lang.String = null
  ): LoaderOptions = {
    val __obj = js.Dynamic.literal(use = use.asInstanceOf[js.Any])
    if (fallback != null) __obj.updateDynamic("fallback")(fallback.asInstanceOf[js.Any])
    if (publicPath != null) __obj.updateDynamic("publicPath")(publicPath)
    __obj.asInstanceOf[LoaderOptions]
  }
}

