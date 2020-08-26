package typings.elasticElasticsearch.requestParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MlGetFilters extends Generic {
  var filter_id: js.UndefOr[String] = js.native
  var from: js.UndefOr[Double] = js.native
  var size: js.UndefOr[Double] = js.native
}

object MlGetFilters {
  @scala.inline
  def apply(): MlGetFilters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MlGetFilters]
  }
  @scala.inline
  implicit class MlGetFiltersOps[Self <: MlGetFilters] (val x: Self) extends AnyVal {
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
    def setFilter_id(value: String): Self = this.set("filter_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilter_id: Self = this.set("filter_id", js.undefined)
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

