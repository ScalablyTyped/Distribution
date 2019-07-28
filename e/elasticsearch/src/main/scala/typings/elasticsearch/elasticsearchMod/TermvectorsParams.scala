package typings.elasticsearch.elasticsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TermvectorsParams extends GenericParams {
  var fieldStatistics: js.UndefOr[Boolean] = js.undefined
  var fields: js.UndefOr[NameList] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var index: String
  var offsets: js.UndefOr[Boolean] = js.undefined
  var parent: js.UndefOr[String] = js.undefined
  var payloads: js.UndefOr[Boolean] = js.undefined
  var positions: js.UndefOr[Boolean] = js.undefined
  var preference: js.UndefOr[String] = js.undefined
  var realtime: js.UndefOr[Boolean] = js.undefined
  var routing: js.UndefOr[String] = js.undefined
  var termStatistics: js.UndefOr[Boolean] = js.undefined
  var `type`: String
  var version: js.UndefOr[Double] = js.undefined
  var versionType: js.UndefOr[VersionType] = js.undefined
}

object TermvectorsParams {
  @scala.inline
  def apply(
    index: String,
    `type`: String,
    body: js.Any = null,
    fieldStatistics: js.UndefOr[Boolean] = js.undefined,
    fields: NameList = null,
    filterPath: String | js.Array[String] = null,
    id: String = null,
    ignore: Double | js.Array[Double] = null,
    maxRetries: Int | Double = null,
    method: String = null,
    offsets: js.UndefOr[Boolean] = js.undefined,
    parent: String = null,
    payloads: js.UndefOr[Boolean] = js.undefined,
    positions: js.UndefOr[Boolean] = js.undefined,
    preference: String = null,
    realtime: js.UndefOr[Boolean] = js.undefined,
    requestTimeout: Int | Double = null,
    routing: String = null,
    termStatistics: js.UndefOr[Boolean] = js.undefined,
    version: Int | Double = null,
    versionType: VersionType = null
  ): TermvectorsParams = {
    val __obj = js.Dynamic.literal(index = index)
    __obj.updateDynamic("type")(`type`)
    if (body != null) __obj.updateDynamic("body")(body)
    if (!js.isUndefined(fieldStatistics)) __obj.updateDynamic("fieldStatistics")(fieldStatistics)
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (filterPath != null) __obj.updateDynamic("filterPath")(filterPath.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id)
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (maxRetries != null) __obj.updateDynamic("maxRetries")(maxRetries.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method)
    if (!js.isUndefined(offsets)) __obj.updateDynamic("offsets")(offsets)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    if (!js.isUndefined(payloads)) __obj.updateDynamic("payloads")(payloads)
    if (!js.isUndefined(positions)) __obj.updateDynamic("positions")(positions)
    if (preference != null) __obj.updateDynamic("preference")(preference)
    if (!js.isUndefined(realtime)) __obj.updateDynamic("realtime")(realtime)
    if (requestTimeout != null) __obj.updateDynamic("requestTimeout")(requestTimeout.asInstanceOf[js.Any])
    if (routing != null) __obj.updateDynamic("routing")(routing)
    if (!js.isUndefined(termStatistics)) __obj.updateDynamic("termStatistics")(termStatistics)
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    if (versionType != null) __obj.updateDynamic("versionType")(versionType)
    __obj.asInstanceOf[TermvectorsParams]
  }
}

