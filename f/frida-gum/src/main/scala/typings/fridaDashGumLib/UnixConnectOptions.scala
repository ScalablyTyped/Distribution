package typings
package fridaDashGumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnixConnectOptions extends SocketConnectOptions {
  /**
    * Address family.
    */
  var family: fridaDashGumLib.fridaDashGumLibStrings.unix
  /**
    * Path to UNIX socket to connect to.
    */
  var path: java.lang.String
  /**
    * Whether to create a TLS connection. Defaults to `false`.
    */
  var tls: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Type of UNIX socket to connect to. Defaults to UnixSocketType.Path.
    */
  var `type`: js.UndefOr[UnixSocketType] = js.undefined
}

object UnixConnectOptions {
  @scala.inline
  def apply(
    family: fridaDashGumLib.fridaDashGumLibStrings.unix,
    path: java.lang.String,
    tls: js.UndefOr[scala.Boolean] = js.undefined,
    `type`: UnixSocketType = null
  ): UnixConnectOptions = {
    val __obj = js.Dynamic.literal(family = family, path = path)
    if (!js.isUndefined(tls)) __obj.updateDynamic("tls")(tls)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[UnixConnectOptions]
  }
}

