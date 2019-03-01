package typings
package elasticsearchLib.elasticsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CountParams extends GenericParams {
  var allowNoIndices: js.UndefOr[scala.Boolean] = js.undefined
  var analyzeWildcard: js.UndefOr[scala.Boolean] = js.undefined
  var analyzer: js.UndefOr[java.lang.String] = js.undefined
  var defaultOperator: js.UndefOr[DefaultOperator] = js.undefined
  var df: js.UndefOr[java.lang.String] = js.undefined
  var expandWildcards: js.UndefOr[ExpandWildcards] = js.undefined
  var ignoreUnavailable: js.UndefOr[scala.Boolean] = js.undefined
  var index: js.UndefOr[NameList] = js.undefined
  var lenient: js.UndefOr[scala.Boolean] = js.undefined
  var lowercaseExpandedTerms: js.UndefOr[scala.Boolean] = js.undefined
  var minScore: js.UndefOr[scala.Double] = js.undefined
  var preference: js.UndefOr[java.lang.String] = js.undefined
  var q: js.UndefOr[java.lang.String] = js.undefined
  var routing: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[NameList] = js.undefined
}

object CountParams {
  @scala.inline
  def apply(
    allowNoIndices: js.UndefOr[scala.Boolean] = js.undefined,
    analyzeWildcard: js.UndefOr[scala.Boolean] = js.undefined,
    analyzer: java.lang.String = null,
    body: js.Any = null,
    defaultOperator: DefaultOperator = null,
    df: java.lang.String = null,
    expandWildcards: ExpandWildcards = null,
    filterPath: java.lang.String | js.Array[java.lang.String] = null,
    ignore: scala.Double | js.Array[scala.Double] = null,
    ignoreUnavailable: js.UndefOr[scala.Boolean] = js.undefined,
    index: NameList = null,
    lenient: js.UndefOr[scala.Boolean] = js.undefined,
    lowercaseExpandedTerms: js.UndefOr[scala.Boolean] = js.undefined,
    maxRetries: scala.Int | scala.Double = null,
    method: java.lang.String = null,
    minScore: scala.Int | scala.Double = null,
    preference: java.lang.String = null,
    q: java.lang.String = null,
    requestTimeout: scala.Int | scala.Double = null,
    routing: java.lang.String = null,
    `type`: NameList = null
  ): CountParams = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowNoIndices)) __obj.updateDynamic("allowNoIndices")(allowNoIndices)
    if (!js.isUndefined(analyzeWildcard)) __obj.updateDynamic("analyzeWildcard")(analyzeWildcard)
    if (analyzer != null) __obj.updateDynamic("analyzer")(analyzer)
    if (body != null) __obj.updateDynamic("body")(body)
    if (defaultOperator != null) __obj.updateDynamic("defaultOperator")(defaultOperator)
    if (df != null) __obj.updateDynamic("df")(df)
    if (expandWildcards != null) __obj.updateDynamic("expandWildcards")(expandWildcards)
    if (filterPath != null) __obj.updateDynamic("filterPath")(filterPath.asInstanceOf[js.Any])
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreUnavailable)) __obj.updateDynamic("ignoreUnavailable")(ignoreUnavailable)
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (!js.isUndefined(lenient)) __obj.updateDynamic("lenient")(lenient)
    if (!js.isUndefined(lowercaseExpandedTerms)) __obj.updateDynamic("lowercaseExpandedTerms")(lowercaseExpandedTerms)
    if (maxRetries != null) __obj.updateDynamic("maxRetries")(maxRetries.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method)
    if (minScore != null) __obj.updateDynamic("minScore")(minScore.asInstanceOf[js.Any])
    if (preference != null) __obj.updateDynamic("preference")(preference)
    if (q != null) __obj.updateDynamic("q")(q)
    if (requestTimeout != null) __obj.updateDynamic("requestTimeout")(requestTimeout.asInstanceOf[js.Any])
    if (routing != null) __obj.updateDynamic("routing")(routing)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CountParams]
  }
}

