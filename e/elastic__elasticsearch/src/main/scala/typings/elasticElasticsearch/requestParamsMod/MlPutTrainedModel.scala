package typings.elasticElasticsearch.requestParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MlPutTrainedModel[T] extends Generic {
  var body: T = js.native
  var model_id: String = js.native
}

object MlPutTrainedModel {
  @scala.inline
  def apply[T](body: T, model_id: String): MlPutTrainedModel[T] = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], model_id = model_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlPutTrainedModel[T]]
  }
  @scala.inline
  implicit class MlPutTrainedModelOps[Self <: MlPutTrainedModel[_], T] (val x: Self with MlPutTrainedModel[T]) extends AnyVal {
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
    def setBody(value: T): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def setModel_id(value: String): Self = this.set("model_id", value.asInstanceOf[js.Any])
  }
  
}

