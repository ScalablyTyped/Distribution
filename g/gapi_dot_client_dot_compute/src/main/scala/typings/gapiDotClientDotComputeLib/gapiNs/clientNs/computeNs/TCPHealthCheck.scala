package typings
package gapiDotClientDotComputeLib.gapiNs.clientNs.computeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait TCPHealthCheck extends js.Object {
  /** The TCP port number for the health check request. The default value is 80. Valid values are 1 through 65535. */
  var port: js.UndefOr[scala.Double] = js.undefined
  /** Port name as defined in InstanceGroup#NamedPort#name. If both port and port_name are defined, port takes precedence. */
  var portName: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the type of proxy header to append before sending data to the backend, either NONE or PROXY_V1. The default is NONE. */
  var proxyHeader: js.UndefOr[java.lang.String] = js.undefined
  /**
               * The application data to send once the TCP connection has been established (default value is empty). If both request and response are empty, the
               * connection establishment alone will indicate health. The request data can only be ASCII.
               */
  var request: js.UndefOr[java.lang.String] = js.undefined
  /**
               * The bytes to match against the beginning of the response data. If left empty (the default value), any response will indicate health. The response data
               * can only be ASCII.
               */
  var response: js.UndefOr[java.lang.String] = js.undefined
}

