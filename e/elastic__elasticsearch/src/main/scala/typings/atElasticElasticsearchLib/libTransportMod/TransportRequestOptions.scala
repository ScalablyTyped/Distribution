package typings
package atElasticElasticsearchLib.libTransportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransportRequestOptions extends js.Object {
  var asStream: js.UndefOr[scala.Boolean] = js.undefined
  var compression: js.UndefOr[java.lang.String] = js.undefined
  var context: js.UndefOr[js.Any] = js.undefined
  var headers: js.UndefOr[anyObject] = js.undefined
  var id: js.UndefOr[js.Any] = js.undefined
  var ignore: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var maxRetries: js.UndefOr[scala.Double] = js.undefined
  var querystring: js.UndefOr[anyObject] = js.undefined
  var requestTimeout: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var warnings: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object TransportRequestOptions {
  @scala.inline
  def apply(
    asStream: js.UndefOr[scala.Boolean] = js.undefined,
    compression: java.lang.String = null,
    context: js.Any = null,
    headers: anyObject = null,
    id: js.Any = null,
    ignore: js.Array[scala.Double] = null,
    maxRetries: scala.Int | scala.Double = null,
    querystring: anyObject = null,
    requestTimeout: scala.Double | java.lang.String = null,
    warnings: js.Array[java.lang.String] = null
  ): TransportRequestOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(asStream)) __obj.updateDynamic("asStream")(asStream)
    if (compression != null) __obj.updateDynamic("compression")(compression)
    if (context != null) __obj.updateDynamic("context")(context)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (id != null) __obj.updateDynamic("id")(id)
    if (ignore != null) __obj.updateDynamic("ignore")(ignore)
    if (maxRetries != null) __obj.updateDynamic("maxRetries")(maxRetries.asInstanceOf[js.Any])
    if (querystring != null) __obj.updateDynamic("querystring")(querystring)
    if (requestTimeout != null) __obj.updateDynamic("requestTimeout")(requestTimeout.asInstanceOf[js.Any])
    if (warnings != null) __obj.updateDynamic("warnings")(warnings)
    __obj.asInstanceOf[TransportRequestOptions]
  }
}

