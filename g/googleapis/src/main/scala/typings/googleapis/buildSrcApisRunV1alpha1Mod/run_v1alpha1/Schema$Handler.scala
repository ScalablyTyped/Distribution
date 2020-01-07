package typings.googleapis.buildSrcApisRunV1alpha1Mod.run_v1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Handler defines a specific action that should be taken
  */
@js.native
trait Schema$Handler extends js.Object {
  /**
    * One and only one of the following should be specified. Exec specifies the
    * action to take. +optional
    */
  var exec: js.UndefOr[Schema$ExecAction] = js.native
  /**
    * HTTPGet specifies the http request to perform. +optional
    */
  var httpGet: js.UndefOr[Schema$HTTPGetAction] = js.native
  /**
    * TCPSocket specifies an action involving a TCP port. TCP hooks not yet
    * supported
    */
  var tcpSocket: js.UndefOr[Schema$TCPSocketAction] = js.native
}

object Schema$Handler {
  @scala.inline
  def apply(
    exec: Schema$ExecAction = null,
    httpGet: Schema$HTTPGetAction = null,
    tcpSocket: Schema$TCPSocketAction = null
  ): Schema$Handler = {
    val __obj = js.Dynamic.literal()
    if (exec != null) __obj.updateDynamic("exec")(exec.asInstanceOf[js.Any])
    if (httpGet != null) __obj.updateDynamic("httpGet")(httpGet.asInstanceOf[js.Any])
    if (tcpSocket != null) __obj.updateDynamic("tcpSocket")(tcpSocket.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Handler]
  }
}

