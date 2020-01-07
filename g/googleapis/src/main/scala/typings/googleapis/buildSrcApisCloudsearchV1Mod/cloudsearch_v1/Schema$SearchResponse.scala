package typings.googleapis.buildSrcApisCloudsearchV1Mod.cloudsearch_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The search API response.
  */
@js.native
trait Schema$SearchResponse extends js.Object {
  /**
    * Debugging information about the response.
    */
  var debugInfo: js.UndefOr[Schema$ResponseDebugInfo] = js.native
  /**
    * Error information about the response.
    */
  var errorInfo: js.UndefOr[Schema$ErrorInfo] = js.native
  /**
    * Repeated facet results.
    */
  var facetResults: js.UndefOr[js.Array[Schema$FacetResult]] = js.native
  /**
    * Whether there are more search results matching the query.
    */
  var hasMoreResults: js.UndefOr[Boolean] = js.native
  /**
    * Query interpretation result for user query. Empty if query interpretation
    * is disabled.
    */
  var queryInterpretation: js.UndefOr[Schema$QueryInterpretation] = js.native
  /**
    * The estimated result count for this query.
    */
  var resultCountEstimate: js.UndefOr[String] = js.native
  /**
    * The exact result count for this query.
    */
  var resultCountExact: js.UndefOr[String] = js.native
  /**
    * Expanded result count information.
    */
  var resultCounts: js.UndefOr[Schema$ResultCounts] = js.native
  /**
    * Results from a search query.
    */
  var results: js.UndefOr[js.Array[Schema$SearchResult]] = js.native
  /**
    * Suggested spelling for the query.
    */
  var spellResults: js.UndefOr[js.Array[Schema$SpellResult]] = js.native
  /**
    * Structured results for the user query. These results are not counted
    * against the page_size.
    */
  var structuredResults: js.UndefOr[js.Array[Schema$StructuredResult]] = js.native
}

object Schema$SearchResponse {
  @scala.inline
  def apply(
    debugInfo: Schema$ResponseDebugInfo = null,
    errorInfo: Schema$ErrorInfo = null,
    facetResults: js.Array[Schema$FacetResult] = null,
    hasMoreResults: js.UndefOr[Boolean] = js.undefined,
    queryInterpretation: Schema$QueryInterpretation = null,
    resultCountEstimate: String = null,
    resultCountExact: String = null,
    resultCounts: Schema$ResultCounts = null,
    results: js.Array[Schema$SearchResult] = null,
    spellResults: js.Array[Schema$SpellResult] = null,
    structuredResults: js.Array[Schema$StructuredResult] = null
  ): Schema$SearchResponse = {
    val __obj = js.Dynamic.literal()
    if (debugInfo != null) __obj.updateDynamic("debugInfo")(debugInfo.asInstanceOf[js.Any])
    if (errorInfo != null) __obj.updateDynamic("errorInfo")(errorInfo.asInstanceOf[js.Any])
    if (facetResults != null) __obj.updateDynamic("facetResults")(facetResults.asInstanceOf[js.Any])
    if (!js.isUndefined(hasMoreResults)) __obj.updateDynamic("hasMoreResults")(hasMoreResults.asInstanceOf[js.Any])
    if (queryInterpretation != null) __obj.updateDynamic("queryInterpretation")(queryInterpretation.asInstanceOf[js.Any])
    if (resultCountEstimate != null) __obj.updateDynamic("resultCountEstimate")(resultCountEstimate.asInstanceOf[js.Any])
    if (resultCountExact != null) __obj.updateDynamic("resultCountExact")(resultCountExact.asInstanceOf[js.Any])
    if (resultCounts != null) __obj.updateDynamic("resultCounts")(resultCounts.asInstanceOf[js.Any])
    if (results != null) __obj.updateDynamic("results")(results.asInstanceOf[js.Any])
    if (spellResults != null) __obj.updateDynamic("spellResults")(spellResults.asInstanceOf[js.Any])
    if (structuredResults != null) __obj.updateDynamic("structuredResults")(structuredResults.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$SearchResponse]
  }
}

