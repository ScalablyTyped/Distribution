package typings
package extractDashTextDashWebpackDashPluginLib.extractDashTextDashWebpackDashPluginMod.ExtractTextPluginNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginOptions extends js.Object {
  /** extract from all additional chunks too (by default it extracts only from the initial chunk(s)) */
  var allChunks: js.UndefOr[scala.Boolean] = js.undefined
  /** disables the plugin */
  var disable: js.UndefOr[scala.Boolean] = js.undefined
  /** the filename of the result file. May contain `[name]`, `[id]` and `[contenthash]` */
  var filename: java.lang.String
  /** Unique ident for this plugin instance. (For advanced usage only, by default automatically generated) */
  var id: js.UndefOr[java.lang.String] = js.undefined
}

