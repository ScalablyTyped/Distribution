package typings.elasticElasticsearch.requestParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransformGetTransformStats extends Generic {
  var allow_no_match: js.UndefOr[Boolean] = js.native
  var from: js.UndefOr[Double] = js.native
  var size: js.UndefOr[Double] = js.native
  var transform_id: String = js.native
}

object TransformGetTransformStats {
  @scala.inline
  def apply(transform_id: String): TransformGetTransformStats = {
    val __obj = js.Dynamic.literal(transform_id = transform_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransformGetTransformStats]
  }
  @scala.inline
  implicit class TransformGetTransformStatsOps[Self <: TransformGetTransformStats] (val x: Self) extends AnyVal {
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
    def setAllow_no_match(value: Boolean): Self = this.set("allow_no_match", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllow_no_match: Self = this.set("allow_no_match", js.undefined)
    @scala.inline
    def setFrom(value: Double): Self = this.set("from", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFrom: Self = this.set("from", js.undefined)
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
  }
  
}

