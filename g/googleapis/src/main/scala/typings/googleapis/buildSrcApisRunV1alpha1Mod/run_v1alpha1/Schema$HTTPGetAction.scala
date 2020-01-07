package typings.googleapis.buildSrcApisRunV1alpha1Mod.run_v1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * HTTPGetAction describes an action based on HTTP Get requests.
  */
@js.native
trait Schema$HTTPGetAction extends js.Object {
  /**
    * Host name to connect to, defaults to the pod IP. You probably want to set
    * &quot;Host&quot; in httpHeaders instead. +optional
    */
  var host: js.UndefOr[String] = js.native
  /**
    * Custom headers to set in the request. HTTP allows repeated headers.
    * +optional
    */
  var httpHeaders: js.UndefOr[js.Array[Schema$HTTPHeader]] = js.native
  /**
    * Path to access on the HTTP server. +optional
    */
  var path: js.UndefOr[String] = js.native
  /**
    * Name or number of the port to access on the container. Number must be in
    * the range 1 to 65535. Name must be an IANA_SVC_NAME.
    */
  var port: js.UndefOr[Schema$IntOrString] = js.native
  /**
    * Scheme to use for connecting to the host. Defaults to HTTP. +optional
    */
  var scheme: js.UndefOr[String] = js.native
}

object Schema$HTTPGetAction {
  @scala.inline
  def apply(
    host: String = null,
    httpHeaders: js.Array[Schema$HTTPHeader] = null,
    path: String = null,
    port: Schema$IntOrString = null,
    scheme: String = null
  ): Schema$HTTPGetAction = {
    val __obj = js.Dynamic.literal()
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (httpHeaders != null) __obj.updateDynamic("httpHeaders")(httpHeaders.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (scheme != null) __obj.updateDynamic("scheme")(scheme.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$HTTPGetAction]
  }
}

