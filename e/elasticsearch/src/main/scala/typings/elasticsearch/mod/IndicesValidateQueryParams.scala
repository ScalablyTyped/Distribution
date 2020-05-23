package typings.elasticsearch.mod

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
    maxRetries: js.UndefOr[Double] = js.undefined,
    method: String = null,
    operationThreading: js.Any = null,
    q: String = null,
    requestTimeout: js.UndefOr[Double] = js.undefined,
    rewrite: js.UndefOr[Boolean] = js.undefined,
    `type`: NameList = null
  ): IndicesValidateQueryParams = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    if (!js.isUndefined(allowNoIndices)) __obj.updateDynamic("allowNoIndices")(allowNoIndices.get.asInstanceOf[js.Any])
    if (!js.isUndefined(analyzeWildcard)) __obj.updateDynamic("analyzeWildcard")(analyzeWildcard.get.asInstanceOf[js.Any])
    if (analyzer != null) __obj.updateDynamic("analyzer")(analyzer.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (defaultOperator != null) __obj.updateDynamic("defaultOperator")(defaultOperator.asInstanceOf[js.Any])
    if (df != null) __obj.updateDynamic("df")(df.asInstanceOf[js.Any])
    if (expandWildcards != null) __obj.updateDynamic("expandWildcards")(expandWildcards.asInstanceOf[js.Any])
    if (!js.isUndefined(explain)) __obj.updateDynamic("explain")(explain.get.asInstanceOf[js.Any])
    if (filterPath != null) __obj.updateDynamic("filterPath")(filterPath.asInstanceOf[js.Any])
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreUnavailable)) __obj.updateDynamic("ignoreUnavailable")(ignoreUnavailable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(lenient)) __obj.updateDynamic("lenient")(lenient.get.asInstanceOf[js.Any])
    if (!js.isUndefined(lowercaseExpandedTerms)) __obj.updateDynamic("lowercaseExpandedTerms")(lowercaseExpandedTerms.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxRetries)) __obj.updateDynamic("maxRetries")(maxRetries.get.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (operationThreading != null) __obj.updateDynamic("operationThreading")(operationThreading.asInstanceOf[js.Any])
    if (q != null) __obj.updateDynamic("q")(q.asInstanceOf[js.Any])
    if (!js.isUndefined(requestTimeout)) __obj.updateDynamic("requestTimeout")(requestTimeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rewrite)) __obj.updateDynamic("rewrite")(rewrite.get.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndicesValidateQueryParams]
  }
}

