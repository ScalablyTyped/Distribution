package typings.atElasticElasticsearch.libTransportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransportRequestOptions extends js.Object {
  var asStream: js.UndefOr[Boolean] = js.undefined
  var compression: js.UndefOr[String] = js.undefined
  var context: js.UndefOr[js.Any] = js.undefined
  var headers: js.UndefOr[anyObject] = js.undefined
  var id: js.UndefOr[js.Any] = js.undefined
  var ignore: js.UndefOr[js.Array[Double]] = js.undefined
  var maxRetries: js.UndefOr[Double] = js.undefined
  var opaqueId: js.UndefOr[String] = js.undefined
  var querystring: js.UndefOr[anyObject] = js.undefined
  var requestTimeout: js.UndefOr[Double | String] = js.undefined
  var warnings: js.UndefOr[js.Array[String]] = js.undefined
}

object TransportRequestOptions {
  @scala.inline
  def apply(
    asStream: js.UndefOr[Boolean] = js.undefined,
    compression: String = null,
    context: js.Any = null,
    headers: anyObject = null,
    id: js.Any = null,
    ignore: js.Array[Double] = null,
    maxRetries: Int | Double = null,
    opaqueId: String = null,
    querystring: anyObject = null,
    requestTimeout: Double | String = null,
    warnings: js.Array[String] = null
  ): TransportRequestOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(asStream)) __obj.updateDynamic("asStream")(asStream.asInstanceOf[js.Any])
    if (compression != null) __obj.updateDynamic("compression")(compression.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (maxRetries != null) __obj.updateDynamic("maxRetries")(maxRetries.asInstanceOf[js.Any])
    if (opaqueId != null) __obj.updateDynamic("opaqueId")(opaqueId.asInstanceOf[js.Any])
    if (querystring != null) __obj.updateDynamic("querystring")(querystring.asInstanceOf[js.Any])
    if (requestTimeout != null) __obj.updateDynamic("requestTimeout")(requestTimeout.asInstanceOf[js.Any])
    if (warnings != null) __obj.updateDynamic("warnings")(warnings.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransportRequestOptions]
  }
}

