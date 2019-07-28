package typings.elasticsearch.elasticsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExplainParams extends GenericParams {
  var _source: js.UndefOr[NameList] = js.undefined
  var _sourceExclude: js.UndefOr[NameList] = js.undefined
  var _sourceInclude: js.UndefOr[NameList] = js.undefined
  var analyzeWildcard: js.UndefOr[Boolean] = js.undefined
  var analyzer: js.UndefOr[String] = js.undefined
  var defaultOperator: js.UndefOr[DefaultOperator] = js.undefined
  var df: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var index: js.UndefOr[String] = js.undefined
  var lenient: js.UndefOr[Boolean] = js.undefined
  var lowercaseExpandedTerms: js.UndefOr[Boolean] = js.undefined
  var parent: js.UndefOr[String] = js.undefined
  var preference: js.UndefOr[String] = js.undefined
  var q: js.UndefOr[String] = js.undefined
  var routing: js.UndefOr[String] = js.undefined
  var storedFields: js.UndefOr[NameList] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object ExplainParams {
  @scala.inline
  def apply(
    _source: NameList = null,
    _sourceExclude: NameList = null,
    _sourceInclude: NameList = null,
    analyzeWildcard: js.UndefOr[Boolean] = js.undefined,
    analyzer: String = null,
    body: js.Any = null,
    defaultOperator: DefaultOperator = null,
    df: String = null,
    filterPath: String | js.Array[String] = null,
    id: String = null,
    ignore: Double | js.Array[Double] = null,
    index: String = null,
    lenient: js.UndefOr[Boolean] = js.undefined,
    lowercaseExpandedTerms: js.UndefOr[Boolean] = js.undefined,
    maxRetries: Int | Double = null,
    method: String = null,
    parent: String = null,
    preference: String = null,
    q: String = null,
    requestTimeout: Int | Double = null,
    routing: String = null,
    storedFields: NameList = null,
    `type`: String = null
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

