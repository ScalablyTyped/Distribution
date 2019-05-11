package typings
package googleDashGaxLib.buildSrcGrpcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientStubOptions extends js.Object {
  var port: scala.Double
  var servicePath: java.lang.String
  var sslCreds: js.UndefOr[grpcLib.grpcMod.ChannelCredentials] = js.undefined
}

object ClientStubOptions {
  @scala.inline
  def apply(
    port: scala.Double,
    servicePath: java.lang.String,
    sslCreds: grpcLib.grpcMod.ChannelCredentials = null
  ): ClientStubOptions = {
    val __obj = js.Dynamic.literal(port = port, servicePath = servicePath)
    if (sslCreds != null) __obj.updateDynamic("sslCreds")(sslCreds)
    __obj.asInstanceOf[ClientStubOptions]
  }
}

