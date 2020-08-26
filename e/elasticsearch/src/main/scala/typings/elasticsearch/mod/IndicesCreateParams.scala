package typings.elasticsearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IndicesCreateParams extends GenericParams {
  var index: String = js.native
  var masterTimeout: js.UndefOr[TimeSpan] = js.native
  var timeout: js.UndefOr[TimeSpan] = js.native
  var updateAllTypes: js.UndefOr[Boolean] = js.native
  var waitForActiveShards: js.UndefOr[String] = js.native
}

object IndicesCreateParams {
  @scala.inline
  def apply(index: String): IndicesCreateParams = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndicesCreateParams]
  }
  @scala.inline
  implicit class IndicesCreateParamsOps[Self <: IndicesCreateParams] (val x: Self) extends AnyVal {
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
    def setIndex(value: String): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def setMasterTimeout(value: TimeSpan): Self = this.set("masterTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMasterTimeout: Self = this.set("masterTimeout", js.undefined)
    @scala.inline
    def setTimeout(value: TimeSpan): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    @scala.inline
    def setUpdateAllTypes(value: Boolean): Self = this.set("updateAllTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdateAllTypes: Self = this.set("updateAllTypes", js.undefined)
    @scala.inline
    def setWaitForActiveShards(value: String): Self = this.set("waitForActiveShards", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWaitForActiveShards: Self = this.set("waitForActiveShards", js.undefined)
  }
  
}

