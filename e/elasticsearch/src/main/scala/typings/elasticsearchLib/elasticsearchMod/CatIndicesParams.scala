package typings
package elasticsearchLib.elasticsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CatIndicesParams extends CatCommonParams {
  var bytes: js.UndefOr[CatBytes] = js.undefined
  var health: js.UndefOr[
    elasticsearchLib.elasticsearchLibStrings.green | elasticsearchLib.elasticsearchLibStrings.yellow | elasticsearchLib.elasticsearchLibStrings.red
  ] = js.undefined
  var index: js.UndefOr[NameList] = js.undefined
  var pri: js.UndefOr[scala.Boolean] = js.undefined
}

object CatIndicesParams {
  @scala.inline
  def apply(
    format: java.lang.String,
    body: js.Any = null,
    bytes: CatBytes = null,
    filterPath: java.lang.String | js.Array[java.lang.String] = null,
    h: NameList = null,
    health: elasticsearchLib.elasticsearchLibStrings.green | elasticsearchLib.elasticsearchLibStrings.yellow | elasticsearchLib.elasticsearchLibStrings.red = null,
    help: js.UndefOr[scala.Boolean] = js.undefined,
    ignore: scala.Double | js.Array[scala.Double] = null,
    index: NameList = null,
    local: js.UndefOr[scala.Boolean] = js.undefined,
    masterTimeout: TimeSpan = null,
    maxRetries: scala.Int | scala.Double = null,
    method: java.lang.String = null,
    pri: js.UndefOr[scala.Boolean] = js.undefined,
    requestTimeout: scala.Int | scala.Double = null,
    v: js.UndefOr[scala.Boolean] = js.undefined
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

