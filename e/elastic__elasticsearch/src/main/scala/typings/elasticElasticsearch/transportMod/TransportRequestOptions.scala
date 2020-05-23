package typings.elasticElasticsearch.transportMod

import typings.elasticElasticsearch.elasticElasticsearchStrings.gzip
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransportRequestOptions extends js.Object {
  var asStream: js.UndefOr[Boolean] = js.undefined
  var compression: js.UndefOr[gzip] = js.undefined
  var context: js.UndefOr[js.Any] = js.undefined
  var headers: js.UndefOr[Record[String, _]] = js.undefined
  var id: js.UndefOr[js.Any] = js.undefined
  var ignore: js.UndefOr[js.Array[Double]] = js.undefined
  var maxRetries: js.UndefOr[Double] = js.undefined
  var opaqueId: js.UndefOr[String] = js.undefined
  var querystring: js.UndefOr[Record[String, _]] = js.undefined
  var requestTimeout: js.UndefOr[Double | String] = js.undefined
  var warnings: js.UndefOr[js.Array[String]] = js.undefined
}

object TransportRequestOptions {
  @scala.inline
  def apply(
    asStream: js.UndefOr[Boolean] = js.undefined,
    compression: gzip = null,
    context: js.Any = null,
    headers: Record[String, _] = null,
    id: js.Any = null,
    ignore: js.Array[Double] = null,
    maxRetries: js.UndefOr[Double] = js.undefined,
    opaqueId: String = null,
    querystring: Record[String, _] = null,
    requestTimeout: Double | String = null,
    warnings: js.Array[String] = null
  ): TransportRequestOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(asStream)) __obj.updateDynamic("asStream")(asStream.get.asInstanceOf[js.Any])
    if (compression != null) __obj.updateDynamic("compression")(compression.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (!js.isUndefined(maxRetries)) __obj.updateDynamic("maxRetries")(maxRetries.get.asInstanceOf[js.Any])
    if (opaqueId != null) __obj.updateDynamic("opaqueId")(opaqueId.asInstanceOf[js.Any])
    if (querystring != null) __obj.updateDynamic("querystring")(querystring.asInstanceOf[js.Any])
    if (requestTimeout != null) __obj.updateDynamic("requestTimeout")(requestTimeout.asInstanceOf[js.Any])
    if (warnings != null) __obj.updateDynamic("warnings")(warnings.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransportRequestOptions]
  }
}

