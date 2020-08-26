package typings.elasticsearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BulkIndexDocumentsParams extends GenericParams {
  var _source: js.UndefOr[NameList] = js.native
  var _sourceExclude: js.UndefOr[NameList] = js.native
  var _sourceInclude: js.UndefOr[NameList] = js.native
  var fields: js.UndefOr[NameList] = js.native
  var index: js.UndefOr[String] = js.native
  var pipeline: js.UndefOr[String] = js.native
  var refresh: js.UndefOr[Refresh] = js.native
  var routing: js.UndefOr[String] = js.native
  var timeout: js.UndefOr[TimeSpan] = js.native
  var `type`: js.UndefOr[String] = js.native
  var waitForActiveShards: js.UndefOr[String] = js.native
}

object BulkIndexDocumentsParams {
  @scala.inline
  def apply(): BulkIndexDocumentsParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BulkIndexDocumentsParams]
  }
  @scala.inline
  implicit class BulkIndexDocumentsParamsOps[Self <: BulkIndexDocumentsParams] (val x: Self) extends AnyVal {
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
    def set_sourceVarargs(value: String*): Self = this.set("_source", js.Array(value :_*))
    @scala.inline
    def set_source(value: NameList): Self = this.set("_source", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_source: Self = this.set("_source", js.undefined)
    @scala.inline
    def set_sourceExcludeVarargs(value: String*): Self = this.set("_sourceExclude", js.Array(value :_*))
    @scala.inline
    def set_sourceExclude(value: NameList): Self = this.set("_sourceExclude", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_sourceExclude: Self = this.set("_sourceExclude", js.undefined)
    @scala.inline
    def set_sourceIncludeVarargs(value: String*): Self = this.set("_sourceInclude", js.Array(value :_*))
    @scala.inline
    def set_sourceInclude(value: NameList): Self = this.set("_sourceInclude", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_sourceInclude: Self = this.set("_sourceInclude", js.undefined)
    @scala.inline
    def setFieldsVarargs(value: String*): Self = this.set("fields", js.Array(value :_*))
    @scala.inline
    def setFields(value: NameList): Self = this.set("fields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
    @scala.inline
    def setIndex(value: String): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
    @scala.inline
    def setPipeline(value: String): Self = this.set("pipeline", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePipeline: Self = this.set("pipeline", js.undefined)
    @scala.inline
    def setRefresh(value: Refresh): Self = this.set("refresh", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRefresh: Self = this.set("refresh", js.undefined)
    @scala.inline
    def setRouting(value: String): Self = this.set("routing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRouting: Self = this.set("routing", js.undefined)
    @scala.inline
    def setTimeout(value: TimeSpan): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setWaitForActiveShards(value: String): Self = this.set("waitForActiveShards", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWaitForActiveShards: Self = this.set("waitForActiveShards", js.undefined)
  }
  
}

