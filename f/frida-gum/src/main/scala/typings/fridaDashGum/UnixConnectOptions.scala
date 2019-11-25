package typings.fridaDashGum

import typings.fridaDashGum.fridaDashGumStrings.unix
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnixConnectOptions extends SocketConnectOptions {
  /**
    * Address family.
    */
  var family: unix
  /**
    * Path to UNIX socket to connect to.
    */
  var path: String
  /**
    * Whether to create a TLS connection. Defaults to `false`.
    */
  var tls: js.UndefOr[Boolean] = js.undefined
  /**
    * Type of UNIX socket to connect to. Defaults to UnixSocketType.Path.
    */
  var `type`: js.UndefOr[UnixSocketType] = js.undefined
}

object UnixConnectOptions {
  @scala.inline
  def apply(family: unix, path: String, tls: js.UndefOr[Boolean] = js.undefined, `type`: UnixSocketType = null): UnixConnectOptions = {
    val __obj = js.Dynamic.literal(family = family.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    if (!js.isUndefined(tls)) __obj.updateDynamic("tls")(tls.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnixConnectOptions]
  }
}

