package typings.extractTextWebpackPlugin.mod

import typings.webpack.mod.Loader_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoaderOptions extends js.Object {
  /** the loader(s) that should be used when the css is not extracted (i.e. in an additional chunk when `allChunks: false`) */
  var fallback: js.UndefOr[Loader_ | js.Array[Loader_]] = js.undefined
  /** override the `publicPath` setting for this loader */
  var publicPath: js.UndefOr[String] = js.undefined
  /** the loader(s) that should be used for converting the resource to a css exporting module */
  var use: Loader_ | js.Array[Loader_]
}

object LoaderOptions {
  @scala.inline
  def apply(
    use: Loader_ | js.Array[Loader_],
    fallback: Loader_ | js.Array[Loader_] = null,
    publicPath: String = null
  ): LoaderOptions = {
    val __obj = js.Dynamic.literal(use = use.asInstanceOf[js.Any])
    if (fallback != null) __obj.updateDynamic("fallback")(fallback.asInstanceOf[js.Any])
    if (publicPath != null) __obj.updateDynamic("publicPath")(publicPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoaderOptions]
  }
}

