package typings.fridaDashGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.fridaDashGum.fridaDashGumStrings.unix
  - typings.fridaDashGum.fridaDashGumStrings.ipv4
  - typings.fridaDashGum.fridaDashGumStrings.ipv6
*/
trait AddressFamily extends js.Object

object AddressFamily {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def ipv4: typings.fridaDashGum.fridaDashGumStrings.ipv4 = this.cast("ipv4")
  @scala.inline
  def ipv6: typings.fridaDashGum.fridaDashGumStrings.ipv6 = this.cast("ipv6")
  @scala.inline
  def unix: typings.fridaDashGum.fridaDashGumStrings.unix = this.cast("unix")
}

