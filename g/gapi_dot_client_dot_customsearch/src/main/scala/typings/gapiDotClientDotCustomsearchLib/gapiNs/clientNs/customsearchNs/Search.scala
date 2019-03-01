package typings
package gapiDotClientDotCustomsearchLib.gapiNs.clientNs.customsearchNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Search extends js.Object {
  var context: js.UndefOr[Context] = js.undefined
  var items: js.UndefOr[js.Array[Result]] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var promotions: js.UndefOr[js.Array[Promotion]] = js.undefined
  var queries: js.UndefOr[stdLib.Record[java.lang.String, js.Array[Query]]] = js.undefined
  var searchInformation: js.UndefOr[gapiDotClientDotCustomsearchLib.Anon_FormattedSearchTime] = js.undefined
  var spelling: js.UndefOr[gapiDotClientDotCustomsearchLib.Anon_CorrectedQuery] = js.undefined
  var url: js.UndefOr[gapiDotClientDotCustomsearchLib.Anon_Template] = js.undefined
}

object Search {
  @scala.inline
  def apply(
    context: Context = null,
    items: js.Array[Result] = null,
    kind: java.lang.String = null,
    promotions: js.Array[Promotion] = null,
    queries: stdLib.Record[java.lang.String, js.Array[Query]] = null,
    searchInformation: gapiDotClientDotCustomsearchLib.Anon_FormattedSearchTime = null,
    spelling: gapiDotClientDotCustomsearchLib.Anon_CorrectedQuery = null,
    url: gapiDotClientDotCustomsearchLib.Anon_Template = null
  ): Search = {
    val __obj = js.Dynamic.literal()
    if (context != null) __obj.updateDynamic("context")(context)
    if (items != null) __obj.updateDynamic("items")(items)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (promotions != null) __obj.updateDynamic("promotions")(promotions)
    if (queries != null) __obj.updateDynamic("queries")(queries)
    if (searchInformation != null) __obj.updateDynamic("searchInformation")(searchInformation)
    if (spelling != null) __obj.updateDynamic("spelling")(spelling)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[Search]
  }
}

