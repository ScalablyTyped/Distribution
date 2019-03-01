package typings
package elasticsearchLib.elasticsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IndicesValidateQueryParams extends GenericParams {
  var allowNoIndices: js.UndefOr[scala.Boolean] = js.undefined
  var analyzeWildcard: js.UndefOr[scala.Boolean] = js.undefined
  var analyzer: js.UndefOr[java.lang.String] = js.undefined
  var defaultOperator: js.UndefOr[DefaultOperator] = js.undefined
  var df: js.UndefOr[java.lang.String] = js.undefined
  var expandWildcards: js.UndefOr[ExpandWildcards] = js.undefined
  var explain: js.UndefOr[scala.Boolean] = js.undefined
  var ignoreUnavailable: js.UndefOr[scala.Boolean] = js.undefined
  var index: NameList
  var lenient: js.UndefOr[scala.Boolean] = js.undefined
  var lowercaseExpandedTerms: js.UndefOr[scala.Boolean] = js.undefined
  var operationThreading: js.UndefOr[js.Any] = js.undefined
     // even the docs don't know what this does
  var q: js.UndefOr[java.lang.String] = js.undefined
  var rewrite: js.UndefOr[scala.Boolean] = js.undefined
  var `type`: js.UndefOr[NameList] = js.undefined
}

object IndicesValidateQueryParams {
  @scala.inline
  def apply(
    index: NameList,
    allowNoIndices: js.UndefOr[scala.Boolean] = js.undefined,
    analyzeWildcard: js.UndefOr[scala.Boolean] = js.undefined,
    analyzer: java.lang.String = null,
    body: js.Any = null,
    defaultOperator: DefaultOperator = null,
    df: java.lang.String = null,
    expandWildcards: ExpandWildcards = null,
    explain: js.UndefOr[scala.Boolean] = js.undefined,
    filterPath: java.lang.String | js.Array[java.lang.String] = null,
    ignore: scala.Double | js.Array[scala.Double] = null,
    ignoreUnavailable: js.UndefOr[scala.Boolean] = js.undefined,
    lenient: js.UndefOr[scala.Boolean] = js.undefined,
    lowercaseExpandedTerms: js.UndefOr[scala.Boolean] = js.undefined,
    maxRetries: scala.Int | scala.Double = null,
    method: java.lang.String = null,
    operationThreading: js.Any = null,
    q: java.lang.String = null,
    requestTimeout: scala.Int | scala.Double = null,
    rewrite: js.UndefOr[scala.Boolean] = js.undefined,
    `type`: NameList = null
  ): IndicesValidateQueryParams = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
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

