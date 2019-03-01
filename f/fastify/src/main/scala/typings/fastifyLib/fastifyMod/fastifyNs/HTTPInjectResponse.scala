package typings
package fastifyLib.fastifyMod.fastifyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fake http inject response
  */
trait HTTPInjectResponse extends js.Object {
  var headers: js.Object
  var payload: java.lang.String
  var raw: fastifyLib.Anon_Req
  var rawPayload: nodeLib.Buffer
  var statusCode: scala.Double
  var statusMessage: java.lang.String
  var trailers: js.Object
}

object HTTPInjectResponse {
  @scala.inline
  def apply(
    headers: js.Object,
    payload: java.lang.String,
    raw: fastifyLib.Anon_Req,
    rawPayload: nodeLib.Buffer,
    statusCode: scala.Double,
    statusMessage: java.lang.String,
    trailers: js.Object
  ): HTTPInjectResponse = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("headers")(headers)
    __obj.updateDynamic("payload")(payload)
    __obj.updateDynamic("raw")(raw)
    __obj.updateDynamic("rawPayload")(rawPayload)
    __obj.updateDynamic("statusCode")(statusCode)
    __obj.updateDynamic("statusMessage")(statusMessage)
    __obj.updateDynamic("trailers")(trailers)
    __obj.asInstanceOf[HTTPInjectResponse]
  }
}

