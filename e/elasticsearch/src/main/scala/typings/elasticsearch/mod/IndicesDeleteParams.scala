package typings.elasticsearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IndicesDeleteParams extends GenericParams {
  var ignoreUnavailable: js.UndefOr[Boolean] = js.native
  var index: NameList = js.native
  var masterTimeout: js.UndefOr[TimeSpan] = js.native
  var timeout: js.UndefOr[TimeSpan] = js.native
}

object IndicesDeleteParams {
  @scala.inline
  def apply(index: NameList): IndicesDeleteParams = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndicesDeleteParams]
  }
  @scala.inline
  implicit class IndicesDeleteParamsOps[Self <: IndicesDeleteParams] (val x: Self) extends AnyVal {
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
    def setIndexVarargs(value: String*): Self = this.set("index", js.Array(value :_*))
    @scala.inline
    def setIndex(value: NameList): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def setIgnoreUnavailable(value: Boolean): Self = this.set("ignoreUnavailable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnoreUnavailable: Self = this.set("ignoreUnavailable", js.undefined)
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

