package typings.fridaGum

import typings.fridaGum.fridaGumStrings.unix
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
  def apply(
    family: unix,
    path: String,
    backlog: js.UndefOr[Double] = js.undefined,
    `type`: UnixSocketType = null
  ): UnixListenOptions = {
    val __obj = js.Dynamic.literal(family = family.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    if (!js.isUndefined(backlog)) __obj.updateDynamic("backlog")(backlog.get.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnixListenOptions]
  }
}

