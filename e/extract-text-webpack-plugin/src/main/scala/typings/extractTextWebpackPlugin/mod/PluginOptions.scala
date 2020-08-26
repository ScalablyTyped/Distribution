package typings.extractTextWebpackPlugin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PluginOptions extends js.Object {
  /** extract from all additional chunks too (by default it extracts only from the initial chunk(s)) */
  var allChunks: js.UndefOr[Boolean] = js.native
  /** disables the plugin */
  var disable: js.UndefOr[Boolean] = js.native
  /** the filename of the result file. May contain `[name]`, `[id]` and `[contenthash]` */
  var filename: String = js.native
  /** Unique ident for this plugin instance. (For advanced usage only, by default automatically generated) */
  var id: js.UndefOr[String] = js.native
}

object PluginOptions {
  @scala.inline
  def apply(filename: String): PluginOptions = {
    val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginOptions]
  }
  @scala.inline
  implicit class PluginOptionsOps[Self <: PluginOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFilename(value: String): Self = this.set("filename", value.asInstanceOf[js.Any])
    @scala.inline
    def setAllChunks(value: Boolean): Self = this.set("allChunks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllChunks: Self = this.set("allChunks", js.undefined)
    @scala.inline
    def setDisable(value: Boolean): Self = this.set("disable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisable: Self = this.set("disable", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
  }
  
}

