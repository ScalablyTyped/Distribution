package typings
package elasticsearchLib.elasticsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExplainParams extends GenericParams {
  var _source: js.UndefOr[NameList] = js.undefined
  var _sourceExclude: js.UndefOr[NameList] = js.undefined
  var _sourceInclude: js.UndefOr[NameList] = js.undefined
  var analyzeWildcard: js.UndefOr[scala.Boolean] = js.undefined
  var analyzer: js.UndefOr[java.lang.String] = js.undefined
  var defaultOperator: js.UndefOr[DefaultOperator] = js.undefined
  var df: js.UndefOr[java.lang.String] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var index: js.UndefOr[java.lang.String] = js.undefined
  var lenient: js.UndefOr[scala.Boolean] = js.undefined
  var lowercaseExpandedTerms: js.UndefOr[scala.Boolean] = js.undefined
  var parent: js.UndefOr[java.lang.String] = js.undefined
  var preference: js.UndefOr[java.lang.String] = js.undefined
  var q: js.UndefOr[java.lang.String] = js.undefined
  var routing: js.UndefOr[java.lang.String] = js.undefined
  var storedFields: js.UndefOr[NameList] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object ExplainParams {
  @scala.inline
  def apply(
    _source: NameList = null,
    _sourceExclude: NameList = null,
    _sourceInclude: NameList = null,
    analyzeWildcard: js.UndefOr[scala.Boolean] = js.undefined,
    analyzer: java.lang.String = null,
    body: js.Any = null,
    defaultOperator: DefaultOperator = null,
    df: java.lang.String = null,
    filterPath: java.lang.String | js.Array[java.lang.String] = null,
    id: java.lang.String = null,
    ignore: scala.Double | js.Array[scala.Double] = null,
    index: java.lang.String = null,
    lenient: js.UndefOr[scala.Boolean] = js.undefined,
    lowercaseExpandedTerms: js.UndefOr[scala.Boolean] = js.undefined,
    maxRetries: scala.Int | scala.Double = null,
    method: java.lang.String = null,
    parent: java.lang.String = null,
    preference: java.lang.String = null,
    q: java.lang.String = null,
    requestTimeout: scala.Int | scala.Double = null,
    routing: java.lang.String = null,
    storedFields: NameList = null,
    `type`: java.lang.String = null
  ): ExplainParams = {
    val __obj = js.Dynamic.literal()
    if (_source != null) __obj.updateDynamic("_source")(_source.asInstanceOf[js.Any])
    if (_sourceExclude != null) __obj.updateDynamic("_sourceExclude")(_sourceExclude.asInstanceOf[js.Any])
    if (_sourceInclude != null) __obj.updateDynamic("_sourceInclude")(_sourceInclude.asInstanceOf[js.Any])
    if (!js.isUndefined(analyzeWildcard)) __obj.updateDynamic("analyzeWildcard")(analyzeWildcard)
    if (analyzer != null) __obj.updateDynamic("analyzer")(analyzer)
    if (body != null) __obj.updateDynamic("body")(body)
    if (defaultOperator != null) __obj.updateDynamic("defaultOperator")(defaultOperator)
    if (df != null) __obj.updateDynamic("df")(df)
    if (filterPath != null) __obj.updateDynamic("filterPath")(filterPath.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id)
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index)
    if (!js.isUndefined(lenient)) __obj.updateDynamic("lenient")(lenient)
    if (!js.isUndefined(lowercaseExpandedTerms)) __obj.updateDynamic("lowercaseExpandedTerms")(lowercaseExpandedTerms)
    if (maxRetries != null) __obj.updateDynamic("maxRetries")(maxRetries.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    if (preference != null) __obj.updateDynamic("preference")(preference)
    if (q != null) __obj.updateDynamic("q")(q)
    if (requestTimeout != null) __obj.updateDynamic("requestTimeout")(requestTimeout.asInstanceOf[js.Any])
    if (routing != null) __obj.updateDynamic("routing")(routing)
    if (storedFields != null) __obj.updateDynamic("storedFields")(storedFields.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ExplainParams]
  }
}

