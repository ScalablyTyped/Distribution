package typings.elasticsearch.elasticsearchMod

import typings.elasticsearch.elasticsearchStrings.green
import typings.elasticsearch.elasticsearchStrings.red
import typings.elasticsearch.elasticsearchStrings.yellow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CatIndicesParams extends CatCommonParams {
  var bytes: js.UndefOr[CatBytes] = js.undefined
  var health: js.UndefOr[green | yellow | red] = js.undefined
  var index: js.UndefOr[NameList] = js.undefined
  var pri: js.UndefOr[Boolean] = js.undefined
}

object CatIndicesParams {
  @scala.inline
  def apply(
    format: String,
    body: js.Any = null,
    bytes: CatBytes = null,
    filterPath: String | js.Array[String] = null,
    h: NameList = null,
    health: green | yellow | red = null,
    help: js.UndefOr[Boolean] = js.undefined,
    ignore: Double | js.Array[Double] = null,
    index: NameList = null,
    local: js.UndefOr[Boolean] = js.undefined,
    masterTimeout: TimeSpan = null,
    maxRetries: Int | Double = null,
    method: String = null,
    pri: js.UndefOr[Boolean] = js.undefined,
    requestTimeout: Int | Double = null,
    v: js.UndefOr[Boolean] = js.undefined
  ): CatIndicesParams = {
    val __obj = js.Dynamic.literal(format = format)
    if (body != null) __obj.updateDynamic("body")(body)
    if (bytes != null) __obj.updateDynamic("bytes")(bytes)
    if (filterPath != null) __obj.updateDynamic("filterPath")(filterPath.asInstanceOf[js.Any])
    if (h != null) __obj.updateDynamic("h")(h.asInstanceOf[js.Any])
    if (health != null) __obj.updateDynamic("health")(health.asInstanceOf[js.Any])
    if (!js.isUndefined(help)) __obj.updateDynamic("help")(help)
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (!js.isUndefined(local)) __obj.updateDynamic("local")(local)
    if (masterTimeout != null) __obj.updateDynamic("masterTimeout")(masterTimeout)
    if (maxRetries != null) __obj.updateDynamic("maxRetries")(maxRetries.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method)
    if (!js.isUndefined(pri)) __obj.updateDynamic("pri")(pri)
    if (requestTimeout != null) __obj.updateDynamic("requestTimeout")(requestTimeout.asInstanceOf[js.Any])
    if (!js.isUndefined(v)) __obj.updateDynamic("v")(v)
    __obj.asInstanceOf[CatIndicesParams]
  }
}

