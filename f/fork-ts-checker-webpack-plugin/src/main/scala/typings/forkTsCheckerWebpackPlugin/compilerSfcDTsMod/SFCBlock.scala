package typings.forkTsCheckerWebpackPlugin.compilerSfcDTsMod

import typings.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginBooleans.`true`
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SFCBlock extends js.Object {
  var attrs: Record[String, String | `true`] = js.native
  var content: String = js.native
  var lang: js.UndefOr[String] = js.native
  var loc: SourceLocation = js.native
  var src: js.UndefOr[String] = js.native
  var `type`: String = js.native
}

object SFCBlock {
  @scala.inline
  def apply(attrs: Record[String, String | `true`], content: String, loc: SourceLocation, `type`: String): SFCBlock = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SFCBlock]
  }
  @scala.inline
  implicit class SFCBlockOps[Self <: SFCBlock] (val x: Self) extends AnyVal {
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
    def setAttrs(value: Record[String, String | `true`]): Self = this.set("attrs", value.asInstanceOf[js.Any])
    @scala.inline
    def setContent(value: String): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def setLoc(value: SourceLocation): Self = this.set("loc", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setLang(value: String): Self = this.set("lang", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLang: Self = this.set("lang", js.undefined)
    @scala.inline
    def setSrc(value: String): Self = this.set("src", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSrc: Self = this.set("src", js.undefined)
  }
  
}

