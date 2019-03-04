package typings
package elasticsearchLib.elasticsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IngestPutPipelineParams extends GenericParams {
  var id: java.lang.String
  var masterTimeout: js.UndefOr[scala.Double] = js.undefined
  var timeout: js.UndefOr[scala.Double] = js.undefined
}

object IngestPutPipelineParams {
  @scala.inline
  def apply(
    body: js.Any,
    id: java.lang.String,
    filterPath: java.lang.String | js.Array[java.lang.String] = null,
    ignore: scala.Double | js.Array[scala.Double] = null,
    masterTimeout: scala.Int | scala.Double = null,
    maxRetries: scala.Int | scala.Double = null,
    method: java.lang.String = null,
    requestTimeout: scala.Int | scala.Double = null,
    timeout: scala.Int | scala.Double = null
  ): IngestPutPipelineParams = {
    val __obj = js.Dynamic.literal(body = body, id = id)
    if (filterPath != null) __obj.updateDynamic("filterPath")(filterPath.asInstanceOf[js.Any])
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (masterTimeout != null) __obj.updateDynamic("masterTimeout")(masterTimeout.asInstanceOf[js.Any])
    if (maxRetries != null) __obj.updateDynamic("maxRetries")(maxRetries.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method)
    if (requestTimeout != null) __obj.updateDynamic("requestTimeout")(requestTimeout.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[IngestPutPipelineParams]
  }
}

