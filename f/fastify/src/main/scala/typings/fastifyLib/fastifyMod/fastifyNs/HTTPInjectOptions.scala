package typings
package fastifyLib.fastifyMod.fastifyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fake http inject options
  */
trait HTTPInjectOptions extends js.Object {
  var authority: js.UndefOr[java.lang.String] = js.undefined
  var headers: js.UndefOr[DefaultHeaders] = js.undefined
  var method: js.UndefOr[HTTPMethod] = js.undefined
  var payload: js.UndefOr[java.lang.String | js.Object | nodeLib.Buffer | nodeLib.NodeJSNs.ReadableStream] = js.undefined
  var query: js.UndefOr[DefaultQuery] = js.undefined
  var remoteAddress: js.UndefOr[java.lang.String] = js.undefined
  var simulate: js.UndefOr[fastifyLib.Anon_Close] = js.undefined
  var url: java.lang.String
  var validate: js.UndefOr[scala.Boolean] = js.undefined
}

object HTTPInjectOptions {
  @scala.inline
  def apply(
    url: java.lang.String,
    authority: java.lang.String = null,
    headers: DefaultHeaders = null,
    method: HTTPMethod = null,
    payload: java.lang.String | js.Object | nodeLib.Buffer | nodeLib.NodeJSNs.ReadableStream = null,
    query: DefaultQuery = null,
    remoteAddress: java.lang.String = null,
    simulate: fastifyLib.Anon_Close = null,
    validate: js.UndefOr[scala.Boolean] = js.undefined
  ): HTTPInjectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("url")(url)
    if (authority != null) __obj.updateDynamic("authority")(authority)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (method != null) __obj.updateDynamic("method")(method)
    if (payload != null) __obj.updateDynamic("payload")(payload.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query)
    if (remoteAddress != null) __obj.updateDynamic("remoteAddress")(remoteAddress)
    if (simulate != null) __obj.updateDynamic("simulate")(simulate)
    if (!js.isUndefined(validate)) __obj.updateDynamic("validate")(validate)
    __obj.asInstanceOf[HTTPInjectOptions]
  }
}

