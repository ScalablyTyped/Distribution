package typings.elasticElasticsearch.requestParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Generic extends js.Object {
  var error_trace: js.UndefOr[Boolean] = js.native
  var filter_path: js.UndefOr[String | js.Array[String]] = js.native
  var human: js.UndefOr[Boolean] = js.native
  var ignore: js.UndefOr[Double | js.Array[Double]] = js.native
  var method: js.UndefOr[String] = js.native
  var pretty: js.UndefOr[Boolean] = js.native
  var source: js.UndefOr[String] = js.native
}

object Generic {
  @scala.inline
  def apply(): Generic = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Generic]
  }
  @scala.inline
  implicit class GenericOps[Self <: Generic] (val x: Self) extends AnyVal {
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
    def setError_trace(value: Boolean): Self = this.set("error_trace", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteError_trace: Self = this.set("error_trace", js.undefined)
    @scala.inline
    def setFilter_pathVarargs(value: String*): Self = this.set("filter_path", js.Array(value :_*))
    @scala.inline
    def setFilter_path(value: String | js.Array[String]): Self = this.set("filter_path", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilter_path: Self = this.set("filter_path", js.undefined)
    @scala.inline
    def setHuman(value: Boolean): Self = this.set("human", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHuman: Self = this.set("human", js.undefined)
    @scala.inline
    def setIgnoreVarargs(value: Double*): Self = this.set("ignore", js.Array(value :_*))
    @scala.inline
    def setIgnore(value: Double | js.Array[Double]): Self = this.set("ignore", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnore: Self = this.set("ignore", js.undefined)
    @scala.inline
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    @scala.inline
    def setPretty(value: Boolean): Self = this.set("pretty", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePretty: Self = this.set("pretty", js.undefined)
    @scala.inline
    def setSource(value: String): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
  }
  
}

