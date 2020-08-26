package typings.elasticsearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IndicesShardStoresParams extends GenericParams {
  var allowNoIndices: js.UndefOr[Boolean] = js.native
  var expandWildcards: js.UndefOr[ExpandWildcards] = js.native
  var ignoreUnavailable: js.UndefOr[Boolean] = js.native
     // even the docs don't know what this does
  var index: NameList = js.native
  var operationThreading: js.UndefOr[js.Any] = js.native
  var status: js.UndefOr[NameList] = js.native
}

object IndicesShardStoresParams {
  @scala.inline
  def apply(index: NameList): IndicesShardStoresParams = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndicesShardStoresParams]
  }
  @scala.inline
  implicit class IndicesShardStoresParamsOps[Self <: IndicesShardStoresParams] (val x: Self) extends AnyVal {
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
    def setAllowNoIndices(value: Boolean): Self = this.set("allowNoIndices", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowNoIndices: Self = this.set("allowNoIndices", js.undefined)
    @scala.inline
    def setExpandWildcards(value: ExpandWildcards): Self = this.set("expandWildcards", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpandWildcards: Self = this.set("expandWildcards", js.undefined)
    @scala.inline
    def setIgnoreUnavailable(value: Boolean): Self = this.set("ignoreUnavailable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnoreUnavailable: Self = this.set("ignoreUnavailable", js.undefined)
    @scala.inline
    def setOperationThreading(value: js.Any): Self = this.set("operationThreading", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOperationThreading: Self = this.set("operationThreading", js.undefined)
    @scala.inline
    def setStatusVarargs(value: String*): Self = this.set("status", js.Array(value :_*))
    @scala.inline
    def setStatus(value: NameList): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
  
}

