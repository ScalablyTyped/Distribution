package typings.elasticElasticsearch.requestParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MlDeleteTrainedModel extends Generic {
  var model_id: String = js.native
}

object MlDeleteTrainedModel {
  @scala.inline
  def apply(model_id: String): MlDeleteTrainedModel = {
    val __obj = js.Dynamic.literal(model_id = model_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlDeleteTrainedModel]
  }
  @scala.inline
  implicit class MlDeleteTrainedModelOps[Self <: MlDeleteTrainedModel] (val x: Self) extends AnyVal {
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
    def setModel_id(value: String): Self = this.set("model_id", value.asInstanceOf[js.Any])
  }
  
}

