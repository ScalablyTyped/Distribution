package typings.elasticsearch.elasticsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IndicesGetParams extends GenericParams {
  var allowNoIndices: js.UndefOr[Boolean] = js.undefined
  var expandWildcards: js.UndefOr[ExpandWildcards] = js.undefined
  var feature: js.UndefOr[NameList] = js.undefined
  var flatSettings: js.UndefOr[Boolean] = js.undefined
  var human: js.UndefOr[Boolean] = js.undefined
  var ignoreUnavailable: js.UndefOr[Boolean] = js.undefined
  var includeDefaults: js.UndefOr[Boolean] = js.undefined
  var index: js.UndefOr[NameList] = js.undefined
  var local: js.UndefOr[Boolean] = js.undefined
}

object IndicesGetParams {
  @scala.inline
  def apply(
    allowNoIndices: js.UndefOr[Boolean] = js.undefined,
    body: js.Any = null,
    expandWildcards: ExpandWildcards = null,
    feature: NameList = null,
    filterPath: String | js.Array[String] = null,
    flatSettings: js.UndefOr[Boolean] = js.undefined,
    human: js.UndefOr[Boolean] = js.undefined,
    ignore: Double | js.Array[Double] = null,
    ignoreUnavailable: js.UndefOr[Boolean] = js.undefined,
    includeDefaults: js.UndefOr[Boolean] = js.undefined,
    index: NameList = null,
    local: js.UndefOr[Boolean] = js.undefined,
    maxRetries: Int | Double = null,
    method: String = null,
    requestTimeout: Int | Double = null
  ): IndicesGetParams = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowNoIndices)) __obj.updateDynamic("allowNoIndices")(allowNoIndices)
    if (body != null) __obj.updateDynamic("body")(body)
    if (expandWildcards != null) __obj.updateDynamic("expandWildcards")(expandWildcards)
    if (feature != null) __obj.updateDynamic("feature")(feature.asInstanceOf[js.Any])
    if (filterPath != null) __obj.updateDynamic("filterPath")(filterPath.asInstanceOf[js.Any])
    if (!js.isUndefined(flatSettings)) __obj.updateDynamic("flatSettings")(flatSettings)
    if (!js.isUndefined(human)) __obj.updateDynamic("human")(human)
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreUnavailable)) __obj.updateDynamic("ignoreUnavailable")(ignoreUnavailable)
    if (!js.isUndefined(includeDefaults)) __obj.updateDynamic("includeDefaults")(includeDefaults)
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (!js.isUndefined(local)) __obj.updateDynamic("local")(local)
    if (maxRetries != null) __obj.updateDynamic("maxRetries")(maxRetries.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method)
    if (requestTimeout != null) __obj.updateDynamic("requestTimeout")(requestTimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndicesGetParams]
  }
}

