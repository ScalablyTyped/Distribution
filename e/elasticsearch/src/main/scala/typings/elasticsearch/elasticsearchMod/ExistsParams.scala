package typings.elasticsearch.elasticsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExistsParams extends GenericParams {
  var id: String
  var index: String
  var parent: js.UndefOr[String] = js.undefined
  var preference: js.UndefOr[String] = js.undefined
  var realtime: js.UndefOr[Boolean] = js.undefined
  var refresh: js.UndefOr[Boolean] = js.undefined
  var routing: js.UndefOr[String] = js.undefined
  var `type`: String
}

object ExistsParams {
  @scala.inline
  def apply(
    id: String,
    index: String,
    `type`: String,
    body: js.Any = null,
    filterPath: String | js.Array[String] = null,
    ignore: Double | js.Array[Double] = null,
    maxRetries: Int | Double = null,
    method: String = null,
    parent: String = null,
    preference: String = null,
    realtime: js.UndefOr[Boolean] = js.undefined,
    refresh: js.UndefOr[Boolean] = js.undefined,
    requestTimeout: Int | Double = null,
    routing: String = null
  ): ExistsParams = {
    val __obj = js.Dynamic.literal(id = id, index = index)
    __obj.updateDynamic("type")(`type`)
    if (body != null) __obj.updateDynamic("body")(body)
    if (filterPath != null) __obj.updateDynamic("filterPath")(filterPath.asInstanceOf[js.Any])
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (maxRetries != null) __obj.updateDynamic("maxRetries")(maxRetries.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    if (preference != null) __obj.updateDynamic("preference")(preference)
    if (!js.isUndefined(realtime)) __obj.updateDynamic("realtime")(realtime)
    if (!js.isUndefined(refresh)) __obj.updateDynamic("refresh")(refresh)
    if (requestTimeout != null) __obj.updateDynamic("requestTimeout")(requestTimeout.asInstanceOf[js.Any])
    if (routing != null) __obj.updateDynamic("routing")(routing)
    __obj.asInstanceOf[ExistsParams]
  }
}

