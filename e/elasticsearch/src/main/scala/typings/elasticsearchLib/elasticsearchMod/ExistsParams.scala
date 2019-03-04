package typings
package elasticsearchLib.elasticsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExistsParams extends GenericParams {
  var id: java.lang.String
  var index: java.lang.String
  var parent: js.UndefOr[java.lang.String] = js.undefined
  var preference: js.UndefOr[java.lang.String] = js.undefined
  var realtime: js.UndefOr[scala.Boolean] = js.undefined
  var refresh: js.UndefOr[scala.Boolean] = js.undefined
  var routing: js.UndefOr[java.lang.String] = js.undefined
  var `type`: java.lang.String
}

object ExistsParams {
  @scala.inline
  def apply(
    id: java.lang.String,
    index: java.lang.String,
    `type`: java.lang.String,
    body: js.Any = null,
    filterPath: java.lang.String | js.Array[java.lang.String] = null,
    ignore: scala.Double | js.Array[scala.Double] = null,
    maxRetries: scala.Int | scala.Double = null,
    method: java.lang.String = null,
    parent: java.lang.String = null,
    preference: java.lang.String = null,
    realtime: js.UndefOr[scala.Boolean] = js.undefined,
    refresh: js.UndefOr[scala.Boolean] = js.undefined,
    requestTimeout: scala.Int | scala.Double = null,
    routing: java.lang.String = null
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

