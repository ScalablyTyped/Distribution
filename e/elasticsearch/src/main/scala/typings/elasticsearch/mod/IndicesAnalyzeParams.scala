package typings.elasticsearch.mod

import typings.elasticsearch.elasticsearchStrings._empty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IndicesAnalyzeParams extends GenericParams {
  var analyzer: js.UndefOr[String] = js.native
  var attributes: js.UndefOr[NameList] = js.native
  var charFilter: js.UndefOr[NameList] = js.native
  var explain: js.UndefOr[Boolean] = js.native
  var field: js.UndefOr[String] = js.native
  var filter: js.UndefOr[NameList] = js.native
  var format: js.UndefOr[_empty] = js.native
  var index: js.UndefOr[String] = js.native
  var perferLocal: js.UndefOr[Boolean] = js.native
  var text: js.UndefOr[NameList] = js.native
  var tokenizer: js.UndefOr[String] = js.native
}

object IndicesAnalyzeParams {
  @scala.inline
  def apply(): IndicesAnalyzeParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IndicesAnalyzeParams]
  }
  @scala.inline
  implicit class IndicesAnalyzeParamsOps[Self <: IndicesAnalyzeParams] (val x: Self) extends AnyVal {
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
    def setAnalyzer(value: String): Self = this.set("analyzer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnalyzer: Self = this.set("analyzer", js.undefined)
    @scala.inline
    def setAttributesVarargs(value: String*): Self = this.set("attributes", js.Array(value :_*))
    @scala.inline
    def setAttributes(value: NameList): Self = this.set("attributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttributes: Self = this.set("attributes", js.undefined)
    @scala.inline
    def setCharFilterVarargs(value: String*): Self = this.set("charFilter", js.Array(value :_*))
    @scala.inline
    def setCharFilter(value: NameList): Self = this.set("charFilter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCharFilter: Self = this.set("charFilter", js.undefined)
    @scala.inline
    def setExplain(value: Boolean): Self = this.set("explain", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExplain: Self = this.set("explain", js.undefined)
    @scala.inline
    def setField(value: String): Self = this.set("field", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteField: Self = this.set("field", js.undefined)
    @scala.inline
    def setFilterVarargs(value: String*): Self = this.set("filter", js.Array(value :_*))
    @scala.inline
    def setFilter(value: NameList): Self = this.set("filter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    @scala.inline
    def setFormat(value: _empty): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    @scala.inline
    def setIndex(value: String): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
    @scala.inline
    def setPerferLocal(value: Boolean): Self = this.set("perferLocal", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePerferLocal: Self = this.set("perferLocal", js.undefined)
    @scala.inline
    def setTextVarargs(value: String*): Self = this.set("text", js.Array(value :_*))
    @scala.inline
    def setText(value: NameList): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    @scala.inline
    def setTokenizer(value: String): Self = this.set("tokenizer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTokenizer: Self = this.set("tokenizer", js.undefined)
  }
  
}

