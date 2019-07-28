package typings.getDashPort.getDashPortMod

import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof node.net.ListenOptions, 'port'> ]: node.net.ListenOptions[P]} */ trait Options extends js.Object {
  /**
  		The host on which port resolution should be performed. Can be either an IPv4 or IPv6 address.
  		*/
  val host: js.UndefOr[String] = js.undefined
  /**
  		A preferred port or an iterable of preferred ports to use.
  		*/
  val port: js.UndefOr[Double | Iterable[Double]] = js.undefined
}

object Options {
  @scala.inline
  def apply(host: String = null, port: Double | Iterable[Double] = null): Options = {
    val __obj = js.Dynamic.literal()
    if (host != null) __obj.updateDynamic("host")(host)
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

