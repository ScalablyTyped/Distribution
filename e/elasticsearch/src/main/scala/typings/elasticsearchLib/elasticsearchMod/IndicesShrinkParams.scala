package typings
package elasticsearchLib.elasticsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IndicesShrinkParams extends GenericParams {
  var index: java.lang.String
  var masterTimeout: js.UndefOr[TimeSpan] = js.undefined
  var target: java.lang.String
  var timeout: js.UndefOr[TimeSpan] = js.undefined
  var waitForActiveShards: js.UndefOr[java.lang.String | scala.Double] = js.undefined
}

object IndicesShrinkParams {
  @scala.inline
  def apply(
    index: java.lang.String,
    target: java.lang.String,
    body: js.Any = null,
    filterPath: java.lang.String | js.Array[java.lang.String] = null,
    ignore: scala.Double | js.Array[scala.Double] = null,
    masterTimeout: TimeSpan = null,
    maxRetries: scala.Int | scala.Double = null,
    method: java.lang.String = null,
    requestTimeout: scala.Int | scala.Double = null,
    timeout: TimeSpan = null,
    waitForActiveShards: java.lang.String | scala.Double = null
  ): IndicesShrinkParams = {
    val __obj = js.Dynamic.literal(index = index, target = target)
    if (body != null) __obj.updateDynamic("body")(body)
    if (filterPath != null) __obj.updateDynamic("filterPath")(filterPath.asInstanceOf[js.Any])
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (masterTimeout != null) __obj.updateDynamic("masterTimeout")(masterTimeout)
    if (maxRetries != null) __obj.updateDynamic("maxRetries")(maxRetries.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method)
    if (requestTimeout != null) __obj.updateDynamic("requestTimeout")(requestTimeout.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout)
    if (waitForActiveShards != null) __obj.updateDynamic("waitForActiveShards")(waitForActiveShards.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndicesShrinkParams]
  }
}

