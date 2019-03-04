package typings
package elasticsearchLib.elasticsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IndicesRecoveryParams extends GenericParams {
  var activeOnly: js.UndefOr[scala.Boolean] = js.undefined
  var detailed: js.UndefOr[scala.Boolean] = js.undefined
  var human: js.UndefOr[scala.Boolean] = js.undefined
  var index: NameList
}

object IndicesRecoveryParams {
  @scala.inline
  def apply(
    index: NameList,
    activeOnly: js.UndefOr[scala.Boolean] = js.undefined,
    body: js.Any = null,
    detailed: js.UndefOr[scala.Boolean] = js.undefined,
    filterPath: java.lang.String | js.Array[java.lang.String] = null,
    human: js.UndefOr[scala.Boolean] = js.undefined,
    ignore: scala.Double | js.Array[scala.Double] = null,
    maxRetries: scala.Int | scala.Double = null,
    method: java.lang.String = null,
    requestTimeout: scala.Int | scala.Double = null
  ): IndicesRecoveryParams = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    if (!js.isUndefined(activeOnly)) __obj.updateDynamic("activeOnly")(activeOnly)
    if (body != null) __obj.updateDynamic("body")(body)
    if (!js.isUndefined(detailed)) __obj.updateDynamic("detailed")(detailed)
    if (filterPath != null) __obj.updateDynamic("filterPath")(filterPath.asInstanceOf[js.Any])
    if (!js.isUndefined(human)) __obj.updateDynamic("human")(human)
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (maxRetries != null) __obj.updateDynamic("maxRetries")(maxRetries.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method)
    if (requestTimeout != null) __obj.updateDynamic("requestTimeout")(requestTimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndicesRecoveryParams]
  }
}

