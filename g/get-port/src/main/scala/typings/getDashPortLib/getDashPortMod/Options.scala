package typings
package getDashPortLib.getDashPortMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof node.net.ListenOptions, 'port'> ]: node.net.ListenOptions[P]} */ trait Options extends js.Object {
  /**
  		The host on which port resolution should be performed. Can be either an IPv4 or IPv6 address.
  		*/
  val host: js.UndefOr[java.lang.String] = js.undefined
  /**
  		A preferred port or an iterable of preferred ports to use.
  		*/
  val port: js.UndefOr[scala.Double | stdLib.Iterable[scala.Double]] = js.undefined
}

object Options {
  @scala.inline
  def apply(host: java.lang.String = null, port: scala.Double | stdLib.Iterable[scala.Double] = null): Options = {
    val __obj = js.Dynamic.literal()
    if (host != null) __obj.updateDynamic("host")(host)
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

