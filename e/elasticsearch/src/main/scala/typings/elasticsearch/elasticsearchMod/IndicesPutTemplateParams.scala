package typings.elasticsearch.elasticsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IndicesPutTemplateParams extends GenericParams {
  var create: js.UndefOr[Boolean] = js.undefined
  var flatSettings: js.UndefOr[Boolean] = js.undefined
  var masterTimeout: js.UndefOr[TimeSpan] = js.undefined
  var name: String
  var order: js.UndefOr[Double] = js.undefined
  var timeout: js.UndefOr[TimeSpan] = js.undefined
}

object IndicesPutTemplateParams {
  @scala.inline
  def apply(
    body: js.Any,
    name: String,
    create: js.UndefOr[Boolean] = js.undefined,
    filterPath: String | js.Array[String] = null,
    flatSettings: js.UndefOr[Boolean] = js.undefined,
    ignore: Double | js.Array[Double] = null,
    masterTimeout: TimeSpan = null,
    maxRetries: Int | Double = null,
    method: String = null,
    order: Int | Double = null,
    requestTimeout: Int | Double = null,
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

