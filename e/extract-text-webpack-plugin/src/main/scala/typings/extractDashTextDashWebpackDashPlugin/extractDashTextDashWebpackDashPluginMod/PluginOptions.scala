package typings.extractDashTextDashWebpackDashPlugin.extractDashTextDashWebpackDashPluginMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginOptions extends js.Object {
  /** extract from all additional chunks too (by default it extracts only from the initial chunk(s)) */
  var allChunks: js.UndefOr[Boolean] = js.undefined
  /** disables the plugin */
  var disable: js.UndefOr[Boolean] = js.undefined
  /** the filename of the result file. May contain `[name]`, `[id]` and `[contenthash]` */
  var filename: String
  /** Unique ident for this plugin instance. (For advanced usage only, by default automatically generated) */
  var id: js.UndefOr[String] = js.undefined
}

object PluginOptions {
  @scala.inline
  def apply(
    filename: String,
    allChunks: js.UndefOr[Boolean] = js.undefined,
    disable: js.UndefOr[Boolean] = js.undefined,
    id: String = null
  ): PluginOptions = {
    val __obj = js.Dynamic.literal(filename = filename)
    if (!js.isUndefined(allChunks)) __obj.updateDynamic("allChunks")(allChunks)
    if (!js.isUndefined(disable)) __obj.updateDynamic("disable")(disable)
    if (id != null) __obj.updateDynamic("id")(id)
    __obj.asInstanceOf[PluginOptions]
  }
}

