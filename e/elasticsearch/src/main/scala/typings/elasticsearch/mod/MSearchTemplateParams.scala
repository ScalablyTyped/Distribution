package typings.elasticsearch.mod

import typings.elasticsearch.elasticsearchStrings.dfs_query_and_fetch
import typings.elasticsearch.elasticsearchStrings.dfs_query_then_fetch
import typings.elasticsearch.elasticsearchStrings.query_and_fetch
import typings.elasticsearch.elasticsearchStrings.query_then_fetch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MSearchTemplateParams extends GenericParams {
  var index: js.UndefOr[NameList] = js.native
  var search_type: js.UndefOr[query_then_fetch | query_and_fetch | dfs_query_then_fetch | dfs_query_and_fetch] = js.native
  var `type`: js.UndefOr[NameList] = js.native
}

object MSearchTemplateParams {
  @scala.inline
  def apply(): MSearchTemplateParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MSearchTemplateParams]
  }
  @scala.inline
  implicit class MSearchTemplateParamsOps[Self <: MSearchTemplateParams] (val x: Self) extends AnyVal {
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
    def deleteIndex: Self = this.set("index", js.undefined)
    @scala.inline
    def setSearch_type(value: query_then_fetch | query_and_fetch | dfs_query_then_fetch | dfs_query_and_fetch): Self = this.set("search_type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSearch_type: Self = this.set("search_type", js.undefined)
    @scala.inline
    def setTypeVarargs(value: String*): Self = this.set("type", js.Array(value :_*))
    @scala.inline
    def setType(value: NameList): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

