package typings.expressFrappe.anon

import typings.bodyParser.mod.OptionsJson
import typings.bodyParser.mod.OptionsUrlencoded
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Json extends js.Object {
  var json: js.UndefOr[Boolean | OptionsJson] = js.native
  var urlencoded: js.UndefOr[Boolean | OptionsUrlencoded] = js.native
}

object Json {
  @scala.inline
  def apply(): Json = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Json]
  }
  @scala.inline
  implicit class JsonOps[Self <: Json] (val x: Self) extends AnyVal {
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
    def setJson(value: Boolean | OptionsJson): Self = this.set("json", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJson: Self = this.set("json", js.undefined)
    @scala.inline
    def setUrlencoded(value: Boolean | OptionsUrlencoded): Self = this.set("urlencoded", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrlencoded: Self = this.set("urlencoded", js.undefined)
  }
  
}

