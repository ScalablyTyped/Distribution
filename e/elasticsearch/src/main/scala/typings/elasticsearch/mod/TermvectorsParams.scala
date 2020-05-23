package typings.elasticsearch.mod

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
    maxRetries: js.UndefOr[Double] = js.undefined,
    method: String = null,
    offsets: js.UndefOr[Boolean] = js.undefined,
    parent: String = null,
    payloads: js.UndefOr[Boolean] = js.undefined,
    positions: js.UndefOr[Boolean] = js.undefined,
    preference: String = null,
    realtime: js.UndefOr[Boolean] = js.undefined,
    requestTimeout: js.UndefOr[Double] = js.undefined,
    routing: String = null,
    termStatistics: js.UndefOr[Boolean] = js.undefined,
    version: js.UndefOr[Double] = js.undefined,
    versionType: VersionType = null
  ): TermvectorsParams = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (!js.isUndefined(fieldStatistics)) __obj.updateDynamic("fieldStatistics")(fieldStatistics.get.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (filterPath != null) __obj.updateDynamic("filterPath")(filterPath.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (!js.isUndefined(maxRetries)) __obj.updateDynamic("maxRetries")(maxRetries.get.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (!js.isUndefined(offsets)) __obj.updateDynamic("offsets")(offsets.get.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (!js.isUndefined(payloads)) __obj.updateDynamic("payloads")(payloads.get.asInstanceOf[js.Any])
    if (!js.isUndefined(positions)) __obj.updateDynamic("positions")(positions.get.asInstanceOf[js.Any])
    if (preference != null) __obj.updateDynamic("preference")(preference.asInstanceOf[js.Any])
    if (!js.isUndefined(realtime)) __obj.updateDynamic("realtime")(realtime.get.asInstanceOf[js.Any])
    if (!js.isUndefined(requestTimeout)) __obj.updateDynamic("requestTimeout")(requestTimeout.get.asInstanceOf[js.Any])
    if (routing != null) __obj.updateDynamic("routing")(routing.asInstanceOf[js.Any])
    if (!js.isUndefined(termStatistics)) __obj.updateDynamic("termStatistics")(termStatistics.get.asInstanceOf[js.Any])
    if (!js.isUndefined(version)) __obj.updateDynamic("version")(version.get.asInstanceOf[js.Any])
    if (versionType != null) __obj.updateDynamic("versionType")(versionType.asInstanceOf[js.Any])
    __obj.asInstanceOf[TermvectorsParams]
  }
}

