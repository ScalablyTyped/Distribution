package typings.elasticsearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IndicesPutTemplateParams extends GenericParams {
  var create: js.UndefOr[Boolean] = js.native
  var flatSettings: js.UndefOr[Boolean] = js.native
  var masterTimeout: js.UndefOr[TimeSpan] = js.native
  var name: String = js.native
  var order: js.UndefOr[Double] = js.native
  var timeout: js.UndefOr[TimeSpan] = js.native
}

object IndicesPutTemplateParams {
  @scala.inline
  def apply(name: String): IndicesPutTemplateParams = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndicesPutTemplateParams]
  }
  @scala.inline
  implicit class IndicesPutTemplateParamsOps[Self <: IndicesPutTemplateParams] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreate(value: Boolean): Self = this.set("create", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreate: Self = this.set("create", js.undefined)
    @scala.inline
    def setFlatSettings(value: Boolean): Self = this.set("flatSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlatSettings: Self = this.set("flatSettings", js.undefined)
    @scala.inline
    def setMasterTimeout(value: TimeSpan): Self = this.set("masterTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMasterTimeout: Self = this.set("masterTimeout", js.undefined)
    @scala.inline
    def setOrder(value: Double): Self = this.set("order", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrder: Self = this.set("order", js.undefined)
    @scala.inline
    def setTimeout(value: TimeSpan): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
  }
  
}

