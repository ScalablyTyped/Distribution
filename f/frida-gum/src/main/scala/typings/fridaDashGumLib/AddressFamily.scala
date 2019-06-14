package typings
package fridaDashGumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - fridaDashGumLib.fridaDashGumLibStrings.unix
  - fridaDashGumLib.fridaDashGumLibStrings.ipv4
  - fridaDashGumLib.fridaDashGumLibStrings.ipv6
*/
trait AddressFamily extends js.Object

object AddressFamily {
  @scala.inline
  def IPv4: fridaDashGumLib.fridaDashGumLibStrings.ipv4 = this.cast("ipv4")
  @scala.inline
  def IPv6: fridaDashGumLib.fridaDashGumLibStrings.ipv6 = this.cast("ipv6")
  @scala.inline
  def Unix: fridaDashGumLib.fridaDashGumLibStrings.unix = this.cast("unix")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

