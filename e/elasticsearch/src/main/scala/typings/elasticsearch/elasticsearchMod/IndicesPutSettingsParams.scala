package typings.elasticsearch.elasticsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IndicesPutSettingsParams extends GenericParams {
  var allowNoIndices: js.UndefOr[Boolean] = js.undefined
  var expandWildcards: js.UndefOr[ExpandWildcards] = js.undefined
  var flatSettings: js.UndefOr[Boolean] = js.undefined
  var ignoreUnavailable: js.UndefOr[Boolean] = js.undefined
  var index: NameList
  var masterTimeout: js.UndefOr[TimeSpan] = js.undefined
  var preserveExisting: js.UndefOr[Boolean] = js.undefined
}

object IndicesPutSettingsParams {
  @scala.inline
  def apply(
    body: js.Any,
    index: NameList,
    allowNoIndices: js.UndefOr[Boolean] = js.undefined,
    expandWildcards: ExpandWildcards = null,
    filterPath: String | js.Array[String] = null,
    flatSettings: js.UndefOr[Boolean] = js.undefined,
    ignore: Double | js.Array[Double] = null,
    ignoreUnavailable: js.UndefOr[Boolean] = js.undefined,
    masterTimeout: TimeSpan = null,
    maxRetries: Int | Double = null,
    method: String = null,
    preserveExisting: js.UndefOr[Boolean] = js.undefined,
    requestTimeout: Int | Double = null
  ): IndicesPutSettingsParams = {
    val __obj = js.Dynamic.literal(body = body, index = index.asInstanceOf[js.Any])
    if (!js.isUndefined(allowNoIndices)) __obj.updateDynamic("allowNoIndices")(allowNoIndices)
    if (expandWildcards != null) __obj.updateDynamic("expandWildcards")(expandWildcards)
    if (filterPath != null) __obj.updateDynamic("filterPath")(filterPath.asInstanceOf[js.Any])
    if (!js.isUndefined(flatSettings)) __obj.updateDynamic("flatSettings")(flatSettings)
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreUnavailable)) __obj.updateDynamic("ignoreUnavailable")(ignoreUnavailable)
    if (masterTimeout != null) __obj.updateDynamic("masterTimeout")(masterTimeout)
    if (maxRetries != null) __obj.updateDynamic("maxRetries")(maxRetries.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method)
    if (!js.isUndefined(preserveExisting)) __obj.updateDynamic("preserveExisting")(preserveExisting)
    if (requestTimeout != null) __obj.updateDynamic("requestTimeout")(requestTimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndicesPutSettingsParams]
  }
}

