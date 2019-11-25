package typings.googleDashGax.buildSrcGrpcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientStubOptions extends js.Object {
  var port: Double
  var protocol: js.UndefOr[String] = js.undefined
  var servicePath: String
  var sslCreds: js.UndefOr[js.Any] = js.undefined
}

object ClientStubOptions {
  @scala.inline
  def apply(port: Double, servicePath: String, protocol: String = null, sslCreds: js.Any = null): ClientStubOptions = {
    val __obj = js.Dynamic.literal(port = port.asInstanceOf[js.Any], servicePath = servicePath.asInstanceOf[js.Any])
    if (protocol != null) __obj.updateDynamic("protocol")(protocol.asInstanceOf[js.Any])
    if (sslCreds != null) __obj.updateDynamic("sslCreds")(sslCreds.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientStubOptions]
  }
}

