package typings
package elasticsearchLib.elasticsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IngestGetPipelineParams extends GenericParams {
  var id: java.lang.String
  var masterTimeout: js.UndefOr[scala.Double] = js.undefined
}

object IngestGetPipelineParams {
  @scala.inline
  def apply(
    id: java.lang.String,
    body: js.Any = null,
    filterPath: java.lang.String | js.Array[java.lang.String] = null,
    ignore: scala.Double | js.Array[scala.Double] = null,
    masterTimeout: scala.Int | scala.Double = null,
    maxRetries: scala.Int | scala.Double = null,
    method: java.lang.String = null,
    requestTimeout: scala.Int | scala.Double = null
  ): IngestGetPipelineParams = {
    val __obj = js.Dynamic.literal(id = id)
    if (body != null) __obj.updateDynamic("body")(body)
    if (filterPath != null) __obj.updateDynamic("filterPath")(filterPath.asInstanceOf[js.Any])
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (masterTimeout != null) __obj.updateDynamic("masterTimeout")(masterTimeout.asInstanceOf[js.Any])
    if (maxRetries != null) __obj.updateDynamic("maxRetries")(maxRetries.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method)
    if (requestTimeout != null) __obj.updateDynamic("requestTimeout")(requestTimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[IngestGetPipelineParams]
  }
}

