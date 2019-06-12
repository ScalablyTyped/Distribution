package typings
package fridaDashGumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnixListenOptions
  extends BaseListenOptions
     with SocketListenOptions {
  /**
    * Address family.
    */
  var family: fridaDashGumLib.fridaDashGumLibStrings.unix
  /**
    * UNIX socket path to listen on.
    */
  var path: java.lang.String
  /**
    * Type of UNIX socket to listen on. Defaults to UnixSocketType.Path.
    */
  var `type`: js.UndefOr[UnixSocketType] = js.undefined
}

object UnixListenOptions {
  @scala.inline
  def apply(
    family: fridaDashGumLib.fridaDashGumLibStrings.unix,
    path: java.lang.String,
    backlog: scala.Int | scala.Double = null,
    `type`: UnixSocketType = null
  ): UnixListenOptions = {
    val __obj = js.Dynamic.literal(family = family, path = path)
    if (backlog != null) __obj.updateDynamic("backlog")(backlog.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[UnixListenOptions]
  }
}

