package typings.googleapis.buildSrcApisCustomsearchV1Mod.customsearch_v1

import org.scalablytyped.runtime.StringDictionary
import typings.googleapis.Anon_CorrectedQuery
import typings.googleapis.Anon_FormattedSearchTime
import typings.googleapis.Anon_Template
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$Search extends js.Object {
  var context: js.UndefOr[Schema$Context] = js.native
  var items: js.UndefOr[js.Array[Schema$Result]] = js.native
  var kind: js.UndefOr[String] = js.native
  var promotions: js.UndefOr[js.Array[Schema$Promotion]] = js.native
  var queries: js.UndefOr[StringDictionary[js.Array[Schema$Query]]] = js.native
  var searchInformation: js.UndefOr[Anon_FormattedSearchTime] = js.native
  var spelling: js.UndefOr[Anon_CorrectedQuery] = js.native
  var url: js.UndefOr[Anon_Template] = js.native
}

object Schema$Search {
  @scala.inline
  def apply(
    context: Schema$Context = null,
    items: js.Array[Schema$Result] = null,
    kind: String = null,
    promotions: js.Array[Schema$Promotion] = null,
    queries: StringDictionary[js.Array[Schema$Query]] = null,
    searchInformation: Anon_FormattedSearchTime = null,
    spelling: Anon_CorrectedQuery = null,
    url: Anon_Template = null
  ): Schema$Search = {
    val __obj = js.Dynamic.literal()
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (promotions != null) __obj.updateDynamic("promotions")(promotions.asInstanceOf[js.Any])
    if (queries != null) __obj.updateDynamic("queries")(queries.asInstanceOf[js.Any])
    if (searchInformation != null) __obj.updateDynamic("searchInformation")(searchInformation.asInstanceOf[js.Any])
    if (spelling != null) __obj.updateDynamic("spelling")(spelling.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Search]
  }
}

