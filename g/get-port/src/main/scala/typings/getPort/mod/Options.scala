package typings.getPort.mod

import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Omit<node.net.ListenOptions, 'port'> */
trait Options extends js.Object {
  var backlog: js.UndefOr[Double] = js.undefined
  var exclusive: js.UndefOr[Boolean] = js.undefined
  /**
  		The host on which port resolution should be performed. Can be either an IPv4 or IPv6 address.
  		*/
  val host: js.UndefOr[String] = js.undefined
  var ipv6Only: js.UndefOr[Boolean] = js.undefined
  var path: js.UndefOr[String] = js.undefined
  /**
  		A preferred port or an iterable of preferred ports to use.
  		*/
  val port: js.UndefOr[Double | Iterable[Double]] = js.undefined
  var readableAll: js.UndefOr[Boolean] = js.undefined
  var writableAll: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    backlog: Int | Double = null,
    exclusive: js.UndefOr[Boolean] = js.undefined,
    host: String = null,
    ipv6Only: js.UndefOr[Boolean] = js.undefined,
    path: String = null,
    port: Double | Iterable[Double] = null,
    readableAll: js.UndefOr[Boolean] = js.undefined,
    writableAll: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (backlog != null) __obj.updateDynamic("backlog")(backlog.asInstanceOf[js.Any])
    if (!js.isUndefined(exclusive)) __obj.updateDynamic("exclusive")(exclusive.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (!js.isUndefined(ipv6Only)) __obj.updateDynamic("ipv6Only")(ipv6Only.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (!js.isUndefined(readableAll)) __obj.updateDynamic("readableAll")(readableAll.asInstanceOf[js.Any])
    if (!js.isUndefined(writableAll)) __obj.updateDynamic("writableAll")(writableAll.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

