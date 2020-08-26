package typings.elasticElasticsearch.requestParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MlPreviewDatafeed extends Generic {
  var datafeed_id: String = js.native
}

object MlPreviewDatafeed {
  @scala.inline
  def apply(datafeed_id: String): MlPreviewDatafeed = {
    val __obj = js.Dynamic.literal(datafeed_id = datafeed_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlPreviewDatafeed]
  }
  @scala.inline
  implicit class MlPreviewDatafeedOps[Self <: MlPreviewDatafeed] (val x: Self) extends AnyVal {
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
    def setDatafeed_id(value: String): Self = this.set("datafeed_id", value.asInstanceOf[js.Any])
  }
  
}

