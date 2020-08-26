package typings.elasticsearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IndicesDeleteTemplateParams extends GenericParams {
  var masterTimeout: js.UndefOr[TimeSpan] = js.native
  var name: String = js.native
  var timeout: js.UndefOr[TimeSpan] = js.native
}

object IndicesDeleteTemplateParams {
  @scala.inline
  def apply(name: String): IndicesDeleteTemplateParams = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndicesDeleteTemplateParams]
  }
  @scala.inline
  implicit class IndicesDeleteTemplateParamsOps[Self <: IndicesDeleteTemplateParams] (val x: Self) extends AnyVal {
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
    def setMasterTimeout(value: TimeSpan): Self = this.set("masterTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMasterTimeout: Self = this.set("masterTimeout", js.undefined)
    @scala.inline
    def setTimeout(value: TimeSpan): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
  }
  
}

