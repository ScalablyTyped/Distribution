package typings.gapiClientCustomsearch.gapi.client.customsearch

import typings.gapiClientCustomsearch.AnonCorrectedQuery
import typings.gapiClientCustomsearch.AnonFormattedSearchTime
import typings.gapiClientCustomsearch.AnonTemplate
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Search extends js.Object {
  var context: js.UndefOr[Context] = js.undefined
  var items: js.UndefOr[js.Array[Result]] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var promotions: js.UndefOr[js.Array[Promotion]] = js.undefined
  var queries: js.UndefOr[Record[String, js.Array[Query]]] = js.undefined
  var searchInformation: js.UndefOr[AnonFormattedSearchTime] = js.undefined
  var spelling: js.UndefOr[AnonCorrectedQuery] = js.undefined
  var url: js.UndefOr[AnonTemplate] = js.undefined
}

object Search {
  @scala.inline
  def apply(
    context: Context = null,
    items: js.Array[Result] = null,
    kind: String = null,
    promotions: js.Array[Promotion] = null,
    queries: Record[String, js.Array[Query]] = null,
    searchInformation: AnonFormattedSearchTime = null,
    spelling: AnonCorrectedQuery = null,
    url: AnonTemplate = null
  ): Search = {
    val __obj = js.Dynamic.literal()
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (promotions != null) __obj.updateDynamic("promotions")(promotions.asInstanceOf[js.Any])
    if (queries != null) __obj.updateDynamic("queries")(queries.asInstanceOf[js.Any])
    if (searchInformation != null) __obj.updateDynamic("searchInformation")(searchInformation.asInstanceOf[js.Any])
    if (spelling != null) __obj.updateDynamic("spelling")(spelling.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Search]
  }
}

