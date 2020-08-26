package typings.elasticElasticsearch.requestParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MlGetTrainedModelsStats extends Generic {
  var allow_no_match: js.UndefOr[Boolean] = js.native
  var from: js.UndefOr[Double] = js.native
  var model_id: js.UndefOr[String] = js.native
  var size: js.UndefOr[Double] = js.native
}

object MlGetTrainedModelsStats {
  @scala.inline
  def apply(): MlGetTrainedModelsStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MlGetTrainedModelsStats]
  }
  @scala.inline
  implicit class MlGetTrainedModelsStatsOps[Self <: MlGetTrainedModelsStats] (val x: Self) extends AnyVal {
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
    def setAllow_no_match(value: Boolean): Self = this.set("allow_no_match", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllow_no_match: Self = this.set("allow_no_match", js.undefined)
    @scala.inline
    def setFrom(value: Double): Self = this.set("from", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFrom: Self = this.set("from", js.undefined)
    @scala.inline
    def setModel_id(value: String): Self = this.set("model_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModel_id: Self = this.set("model_id", js.undefined)
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
  }
  
}

