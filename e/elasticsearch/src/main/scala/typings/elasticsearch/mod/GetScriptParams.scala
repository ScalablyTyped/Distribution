package typings.elasticsearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetScriptParams extends GenericParams {
  var id: String
  var lang: String
}

object GetScriptParams {
  @scala.inline
  def apply(
    id: String,
    lang: String,
    body: js.Any = null,
    filterPath: String | js.Array[String] = null,
    ignore: Double | js.Array[Double] = null,
    maxRetries: js.UndefOr[Double] = js.undefined,
    method: String = null,
    requestTimeout: js.UndefOr[Double] = js.undefined
  ): GetScriptParams = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], lang = lang.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (filterPath != null) __obj.updateDynamic("filterPath")(filterPath.asInstanceOf[js.Any])
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (!js.isUndefined(maxRetries)) __obj.updateDynamic("maxRetries")(maxRetries.get.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (!js.isUndefined(requestTimeout)) __obj.updateDynamic("requestTimeout")(requestTimeout.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetScriptParams]
  }
}

