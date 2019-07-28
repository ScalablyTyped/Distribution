package typings.elasticsearch.elasticsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IndicesValidateQueryParams extends GenericParams {
  var allowNoIndices: js.UndefOr[Boolean] = js.undefined
  var analyzeWildcard: js.UndefOr[Boolean] = js.undefined
  var analyzer: js.UndefOr[String] = js.undefined
  var defaultOperator: js.UndefOr[DefaultOperator] = js.undefined
  var df: js.UndefOr[String] = js.undefined
  var expandWildcards: js.UndefOr[ExpandWildcards] = js.undefined
  var explain: js.UndefOr[Boolean] = js.undefined
  var ignoreUnavailable: js.UndefOr[Boolean] = js.undefined
  var index: NameList
  var lenient: js.UndefOr[Boolean] = js.undefined
  var lowercaseExpandedTerms: js.UndefOr[Boolean] = js.undefined
  var operationThreading: js.UndefOr[js.Any] = js.undefined
     // even the docs don't know what this does
  var q: js.UndefOr[String] = js.undefined
  var rewrite: js.UndefOr[Boolean] = js.undefined
  var `type`: js.UndefOr[NameList] = js.undefined
}

object IndicesValidateQueryParams {
  @scala.inline
  def apply(
    index: NameList,
    allowNoIndices: js.UndefOr[Boolean] = js.undefined,
    analyzeWildcard: js.UndefOr[Boolean] = js.undefined,
    analyzer: String = null,
    body: js.Any = null,
    defaultOperator: DefaultOperator = null,
    df: String = null,
    expandWildcards: ExpandWildcards = null,
    explain: js.UndefOr[Boolean] = js.undefined,
    filterPath: String | js.Array[String] = null,
    ignore: Double | js.Array[Double] = null,
    ignoreUnavailable: js.UndefOr[Boolean] = js.undefined,
    lenient: js.UndefOr[Boolean] = js.undefined,
    lowercaseExpandedTerms: js.UndefOr[Boolean] = js.undefined,
    maxRetries: Int | Double = null,
    method: String = null,
    operationThreading: js.Any = null,
    q: String = null,
    requestTimeout: Int | Double = null,
    rewrite: js.UndefOr[Boolean] = js.undefined,
    `type`: NameList = null
  ): IndicesValidateQueryParams = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    if (!js.isUndefined(allowNoIndices)) __obj.updateDynamic("allowNoIndices")(allowNoIndices)
    if (!js.isUndefined(analyzeWildcard)) __obj.updateDynamic("analyzeWildcard")(analyzeWildcard)
    if (analyzer != null) __obj.updateDynamic("analyzer")(analyzer)
    if (body != null) __obj.updateDynamic("body")(body)
    if (defaultOperator != null) __obj.updateDynamic("defaultOperator")(defaultOperator)
    if (df != null) __obj.updateDynamic("df")(df)
    if (expandWildcards != null) __obj.updateDynamic("expandWildcards")(expandWildcards)
    if (!js.isUndefined(explain)) __obj.updateDynamic("explain")(explain)
    if (filterPath != null) __obj.updateDynamic("filterPath")(filterPath.asInstanceOf[js.Any])
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreUnavailable)) __obj.updateDynamic("ignoreUnavailable")(ignoreUnavailable)
    if (!js.isUndefined(lenient)) __obj.updateDynamic("lenient")(lenient)
    if (!js.isUndefined(lowercaseExpandedTerms)) __obj.updateDynamic("lowercaseExpandedTerms")(lowercaseExpandedTerms)
    if (maxRetries != null) __obj.updateDynamic("maxRetries")(maxRetries.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method)
    if (operationThreading != null) __obj.updateDynamic("operationThreading")(operationThreading)
    if (q != null) __obj.updateDynamic("q")(q)
    if (requestTimeout != null) __obj.updateDynamic("requestTimeout")(requestTimeout.asInstanceOf[js.Any])
    if (!js.isUndefined(rewrite)) __obj.updateDynamic("rewrite")(rewrite)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndicesValidateQueryParams]
  }
}

