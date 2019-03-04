package typings
package elasticsearchLib.elasticsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MTermVectorsParams extends GenericParams {
  var fieldStatistics: js.UndefOr[scala.Boolean] = js.undefined
  var fields: js.UndefOr[NameList] = js.undefined
  var ids: js.UndefOr[NameList] = js.undefined
  var index: java.lang.String
  var offsets: js.UndefOr[scala.Boolean] = js.undefined
  var parent: js.UndefOr[java.lang.String] = js.undefined
  var payloads: js.UndefOr[scala.Boolean] = js.undefined
  var positions: js.UndefOr[scala.Boolean] = js.undefined
  var preference: js.UndefOr[java.lang.String] = js.undefined
  var realtime: js.UndefOr[scala.Boolean] = js.undefined
  var routing: js.UndefOr[java.lang.String] = js.undefined
  var termStatistics: js.UndefOr[scala.Boolean] = js.undefined
  var `type`: java.lang.String
  var version: js.UndefOr[scala.Double] = js.undefined
  var versionType: js.UndefOr[VersionType] = js.undefined
}

object MTermVectorsParams {
  @scala.inline
  def apply(
    index: java.lang.String,
    `type`: java.lang.String,
    body: js.Any = null,
    fieldStatistics: js.UndefOr[scala.Boolean] = js.undefined,
    fields: NameList = null,
    filterPath: java.lang.String | js.Array[java.lang.String] = null,
    ids: NameList = null,
    ignore: scala.Double | js.Array[scala.Double] = null,
    maxRetries: scala.Int | scala.Double = null,
    method: java.lang.String = null,
    offsets: js.UndefOr[scala.Boolean] = js.undefined,
    parent: java.lang.String = null,
    payloads: js.UndefOr[scala.Boolean] = js.undefined,
    positions: js.UndefOr[scala.Boolean] = js.undefined,
    preference: java.lang.String = null,
    realtime: js.UndefOr[scala.Boolean] = js.undefined,
    requestTimeout: scala.Int | scala.Double = null,
    routing: java.lang.String = null,
    termStatistics: js.UndefOr[scala.Boolean] = js.undefined,
    version: scala.Int | scala.Double = null,
    versionType: VersionType = null
  ): MTermVectorsParams = {
    val __obj = js.Dynamic.literal(index = index)
    __obj.updateDynamic("type")(`type`)
    if (body != null) __obj.updateDynamic("body")(body)
    if (!js.isUndefined(fieldStatistics)) __obj.updateDynamic("fieldStatistics")(fieldStatistics)
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (filterPath != null) __obj.updateDynamic("filterPath")(filterPath.asInstanceOf[js.Any])
    if (ids != null) __obj.updateDynamic("ids")(ids.asInstanceOf[js.Any])
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
    __obj.asInstanceOf[MTermVectorsParams]
  }
}

