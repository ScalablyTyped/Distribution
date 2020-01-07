package typings.googleapis.buildSrcApisRunV1alpha1Mod.run_v1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * TCPSocketAction describes an action based on opening a socket
  */
@js.native
trait Schema$TCPSocketAction extends js.Object {
  /**
    * Optional: Host name to connect to, defaults to the pod IP. +optional
    */
  var host: js.UndefOr[String] = js.native
  /**
    * Number or name of the port to access on the container. Number must be in
    * the range 1 to 65535. Name must be an IANA_SVC_NAME.
    */
  var port: js.UndefOr[Schema$IntOrString] = js.native
}

object Schema$TCPSocketAction {
  @scala.inline
  def apply(host: String = null, port: Schema$IntOrString = null): Schema$TCPSocketAction = {
    val __obj = js.Dynamic.literal()
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$TCPSocketAction]
  }
}

