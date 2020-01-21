package typings.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.fridaGum.fridaGumStrings.unix
  - typings.fridaGum.fridaGumStrings.ipv4
  - typings.fridaGum.fridaGumStrings.ipv6
*/
trait AddressFamily extends js.Object

object AddressFamily {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def ipv4: typings.fridaGum.fridaGumStrings.ipv4 = this.cast("ipv4")
  @scala.inline
  def ipv6: typings.fridaGum.fridaGumStrings.ipv6 = this.cast("ipv6")
  @scala.inline
  def unix: typings.fridaGum.fridaGumStrings.unix = this.cast("unix")
}

