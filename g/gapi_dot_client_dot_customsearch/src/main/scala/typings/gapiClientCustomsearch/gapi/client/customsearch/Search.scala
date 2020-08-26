package typings.gapiClientCustomsearch.gapi.client.customsearch

import typings.gapiClientCustomsearch.anon.CorrectedQuery
import typings.gapiClientCustomsearch.anon.FormattedSearchTime
import typings.gapiClientCustomsearch.anon.Template
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Search extends js.Object {
  var context: js.UndefOr[Context] = js.native
  var items: js.UndefOr[js.Array[Result]] = js.native
  var kind: js.UndefOr[String] = js.native
  var promotions: js.UndefOr[js.Array[Promotion]] = js.native
  var queries: js.UndefOr[Record[String, js.Array[Query]]] = js.native
  var searchInformation: js.UndefOr[FormattedSearchTime] = js.native
  var spelling: js.UndefOr[CorrectedQuery] = js.native
  var url: js.UndefOr[Template] = js.native
}

object Search {
  @scala.inline
  def apply(): Search = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Search]
  }
  @scala.inline
  implicit class SearchOps[Self <: Search] (val x: Self) extends AnyVal {
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
    def setContext(value: Context): Self = this.set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    @scala.inline
    def setItemsVarargs(value: Result*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[Result]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setPromotionsVarargs(value: Promotion*): Self = this.set("promotions", js.Array(value :_*))
    @scala.inline
    def setPromotions(value: js.Array[Promotion]): Self = this.set("promotions", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePromotions: Self = this.set("promotions", js.undefined)
    @scala.inline
    def setQueries(value: Record[String, js.Array[Query]]): Self = this.set("queries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQueries: Self = this.set("queries", js.undefined)
    @scala.inline
    def setSearchInformation(value: FormattedSearchTime): Self = this.set("searchInformation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSearchInformation: Self = this.set("searchInformation", js.undefined)
    @scala.inline
    def setSpelling(value: CorrectedQuery): Self = this.set("spelling", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpelling: Self = this.set("spelling", js.undefined)
    @scala.inline
    def setUrl(value: Template): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
  
}

