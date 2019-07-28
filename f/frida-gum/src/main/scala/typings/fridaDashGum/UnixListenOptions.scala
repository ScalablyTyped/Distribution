package typings.fridaDashGum

import typings.fridaDashGum.fridaDashGumStrings.unix
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnixListenOptions
  extends BaseListenOptions
     with SocketListenOptions {
  /**
    * Address family.
    */
  var family: unix
  /**
    * UNIX socket path to listen on.
    */
  var path: String
  /**
    * Type of UNIX socket to listen on. Defaults to UnixSocketType.Path.
    */
  var `type`: js.UndefOr[UnixSocketType] = js.undefined
}

object UnixListenOptions {
  @scala.inline
  def apply(family: unix, path: String, backlog: Int | Double = null, `type`: UnixSocketType = null): UnixListenOptions = {
    val __obj = js.Dynamic.literal(family = family, path = path)
    if (backlog != null) __obj.updateDynamic("backlog")(backlog.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[UnixListenOptions]
  }
}

