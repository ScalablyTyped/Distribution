package typings.elasticElasticsearch.requestParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransformStartTransform extends Generic {
  var timeout: js.UndefOr[String] = js.native
  var transform_id: String = js.native
}

object TransformStartTransform {
  @scala.inline
  def apply(transform_id: String): TransformStartTransform = {
    val __obj = js.Dynamic.literal(transform_id = transform_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransformStartTransform]
  }
  @scala.inline
  implicit class TransformStartTransformOps[Self <: TransformStartTransform] (val x: Self) extends AnyVal {
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
    def setTransform_id(value: String): Self = this.set("transform_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimeout(value: String): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
  }
  
}

