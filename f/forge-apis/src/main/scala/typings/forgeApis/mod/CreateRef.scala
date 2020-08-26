package typings.forgeApis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateRef extends js.Object {
  var data: js.UndefOr[CreateRefData] = js.native
  var jsonapi: js.UndefOr[JsonApiVersionJsonapi] = js.native
}

object CreateRef {
  @scala.inline
  def apply(): CreateRef = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateRef]
  }
  @scala.inline
  implicit class CreateRefOps[Self <: CreateRef] (val x: Self) extends AnyVal {
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
    def setData(value: CreateRefData): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setJsonapi(value: JsonApiVersionJsonapi): Self = this.set("jsonapi", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJsonapi: Self = this.set("jsonapi", js.undefined)
  }
  
}

