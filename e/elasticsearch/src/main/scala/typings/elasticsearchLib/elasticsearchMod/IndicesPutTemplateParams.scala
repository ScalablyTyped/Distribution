package typings
package elasticsearchLib.elasticsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IndicesPutTemplateParams extends GenericParams {
  var create: js.UndefOr[scala.Boolean] = js.undefined
  var flatSettings: js.UndefOr[scala.Boolean] = js.undefined
  var masterTimeout: js.UndefOr[TimeSpan] = js.undefined
  var name: java.lang.String
  var order: js.UndefOr[scala.Double] = js.undefined
  var timeout: js.UndefOr[TimeSpan] = js.undefined
}

object IndicesPutTemplateParams {
  @scala.inline
  def apply(
    body: js.Any,
    name: java.lang.String,
    create: js.UndefOr[scala.Boolean] = js.undefined,
    filterPath: java.lang.String | js.Array[java.lang.String] = null,
    flatSettings: js.UndefOr[scala.Boolean] = js.undefined,
    ignore: scala.Double | js.Array[scala.Double] = null,
    masterTimeout: TimeSpan = null,
    maxRetries: scala.Int | scala.Double = null,
    method: java.lang.String = null,
    order: scala.Int | scala.Double = null,
    requestTimeout: scala.Int | scala.Double = null,
    timeout: TimeSpan = null
  ): IndicesPutTemplateParams = {
    val __obj = js.Dynamic.literal(body = body, name = name)
    if (!js.isUndefined(create)) __obj.updateDynamic("create")(create)
    if (filterPath != null) __obj.updateDynamic("filterPath")(filterPath.asInstanceOf[js.Any])
    if (!js.isUndefined(flatSettings)) __obj.updateDynamic("flatSettings")(flatSettings)
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (masterTimeout != null) __obj.updateDynamic("masterTimeout")(masterTimeout)
    if (maxRetries != null) __obj.updateDynamic("maxRetries")(maxRetries.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method)
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    if (requestTimeout != null) __obj.updateDynamic("requestTimeout")(requestTimeout.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout)
    __obj.asInstanceOf[IndicesPutTemplateParams]
  }
}

