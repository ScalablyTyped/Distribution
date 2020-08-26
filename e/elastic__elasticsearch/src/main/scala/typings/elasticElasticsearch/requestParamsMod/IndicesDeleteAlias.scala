package typings.elasticElasticsearch.requestParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IndicesDeleteAlias extends Generic {
  var index: String | js.Array[String] = js.native
  var master_timeout: js.UndefOr[String] = js.native
  var name: String | js.Array[String] = js.native
  var timeout: js.UndefOr[String] = js.native
}

object IndicesDeleteAlias {
  @scala.inline
  def apply(index: String | js.Array[String], name: String | js.Array[String]): IndicesDeleteAlias = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndicesDeleteAlias]
  }
  @scala.inline
  implicit class IndicesDeleteAliasOps[Self <: IndicesDeleteAlias] (val x: Self) extends AnyVal {
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
    def setIndex(value: String | js.Array[String]): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def setNameVarargs(value: String*): Self = this.set("name", js.Array(value :_*))
    @scala.inline
    def setName(value: String | js.Array[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaster_timeout(value: String): Self = this.set("master_timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaster_timeout: Self = this.set("master_timeout", js.undefined)
    @scala.inline
    def setTimeout(value: String): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
  }
  
}

