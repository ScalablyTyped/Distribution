package typings.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientRequestConstructorOptions extends js.Object {
  /**
    * The server host provided as a concatenation of the hostname and the port number
    * 'hostname:port'.
    */
  var host: js.UndefOr[String] = js.undefined
  /**
    * The server host name.
    */
  var hostname: js.UndefOr[String] = js.undefined
  /**
    * The HTTP request method. Defaults to the GET method.
    */
  var method: js.UndefOr[String] = js.undefined
  /**
    * The name of the `partition` with which the request is associated. Defaults to
    * the empty string. The `session` option prevails on `partition`. Thus if a
    * `session` is explicitly specified, `partition` is ignored.
    */
  var partition: js.UndefOr[String] = js.undefined
  /**
    * The path part of the request URL.
    */
  var path: js.UndefOr[String] = js.undefined
  /**
    * The server's listening port number.
    */
  var port: js.UndefOr[Double] = js.undefined
  /**
    * The protocol scheme in the form 'scheme:'. Currently supported values are
    * 'http:' or 'https:'. Defaults to 'http:'.
    */
  var protocol: js.UndefOr[String] = js.undefined
  /**
    * The redirect mode for this request. Should be one of `follow`, `error` or
    * `manual`. Defaults to `follow`. When mode is `error`, any redirection will be
    * aborted. When mode is `manual` the redirection will be cancelled unless
    * `request.followRedirect` is invoked synchronously during the `redirect` event.
    */
  var redirect: js.UndefOr[String] = js.undefined
  /**
    * The `Session` instance with which the request is associated.
    */
  var session: js.UndefOr[Session_] = js.undefined
  /**
    * The request URL. Must be provided in the absolute form with the protocol scheme
    * specified as http or https.
    */
  var url: js.UndefOr[String] = js.undefined
}

object ClientRequestConstructorOptions {
  @scala.inline
  def apply(
    host: String = null,
    hostname: String = null,
    method: String = null,
    partition: String = null,
    path: String = null,
    port: Int | Double = null,
    protocol: String = null,
    redirect: String = null,
    session: Session_ = null,
    url: String = null
  ): ClientRequestConstructorOptions = {
    val __obj = js.Dynamic.literal()
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (hostname != null) __obj.updateDynamic("hostname")(hostname.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (partition != null) __obj.updateDynamic("partition")(partition.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (protocol != null) __obj.updateDynamic("protocol")(protocol.asInstanceOf[js.Any])
    if (redirect != null) __obj.updateDynamic("redirect")(redirect.asInstanceOf[js.Any])
    if (session != null) __obj.updateDynamic("session")(session.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientRequestConstructorOptions]
  }
}

