package typings.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaUDPHealthCheck extends js.Object {
  /**
    * The UDP port number for the health check request. Valid values are 1
    * through 65535.
    */
  var port: js.UndefOr[Double] = js.native
  /**
    * Port name as defined in InstanceGroup#NamedPort#name. If both port and
    * port_name are defined, port takes precedence.
    */
  var portName: js.UndefOr[String] = js.native
  /**
    * Raw data of request to send in payload of UDP packet. It is an error if
    * this is empty. The request data can only be ASCII.
    */
  var request: js.UndefOr[String] = js.native
  /**
    * The bytes to match against the beginning of the response data. It is an
    * error if this is empty. The response data can only be ASCII.
    */
  var response: js.UndefOr[String] = js.native
}

object SchemaUDPHealthCheck {
  @scala.inline
  def apply(
    port: js.UndefOr[Double] = js.undefined,
    portName: String = null,
    request: String = null,
    response: String = null
  ): SchemaUDPHealthCheck = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(port)) __obj.updateDynamic("port")(port.get.asInstanceOf[js.Any])
    if (portName != null) __obj.updateDynamic("portName")(portName.asInstanceOf[js.Any])
    if (request != null) __obj.updateDynamic("request")(request.asInstanceOf[js.Any])
    if (response != null) __obj.updateDynamic("response")(response.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaUDPHealthCheck]
  }
}

