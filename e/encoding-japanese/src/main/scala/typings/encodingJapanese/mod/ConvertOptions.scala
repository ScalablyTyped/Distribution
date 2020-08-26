package typings.encodingJapanese.mod

import typings.encodingJapanese.encodingJapaneseStrings.array
import typings.encodingJapanese.encodingJapaneseStrings.arraybuffer
import typings.encodingJapanese.encodingJapaneseStrings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConvertOptions extends js.Object {
  var bom: js.UndefOr[Boolean | String] = js.native
  var from: js.UndefOr[Encoding] = js.native
  var to: Encoding = js.native
  var `type`: js.UndefOr[string | arraybuffer | array] = js.native
}

object ConvertOptions {
  @scala.inline
  def apply(to: Encoding): ConvertOptions = {
    val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConvertOptions]
  }
  @scala.inline
  implicit class ConvertOptionsOps[Self <: ConvertOptions] (val x: Self) extends AnyVal {
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
    def setTo(value: Encoding): Self = this.set("to", value.asInstanceOf[js.Any])
    @scala.inline
    def setBom(value: Boolean | String): Self = this.set("bom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBom: Self = this.set("bom", js.undefined)
    @scala.inline
    def setFrom(value: Encoding): Self = this.set("from", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFrom: Self = this.set("from", js.undefined)
    @scala.inline
    def setType(value: string | arraybuffer | array): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

