package typings.fridaDashGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.fridaDashGum.fridaDashGumStrings.tcp
  - typings.fridaDashGum.fridaDashGumStrings.udp
  - typings.fridaDashGum.fridaDashGumStrings.tcp6
  - typings.fridaDashGum.fridaDashGumStrings.udp6
  - typings.fridaDashGum.fridaDashGumStrings.`unix:stream`
  - typings.fridaDashGum.fridaDashGumStrings.`unix:dgram`
*/
trait SocketType extends js.Object

object SocketType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def tcp: typings.fridaDashGum.fridaDashGumStrings.tcp = this.cast("tcp")
  @scala.inline
  def tcp6: typings.fridaDashGum.fridaDashGumStrings.tcp6 = this.cast("tcp6")
  @scala.inline
  def udp: typings.fridaDashGum.fridaDashGumStrings.udp = this.cast("udp")
  @scala.inline
  def udp6: typings.fridaDashGum.fridaDashGumStrings.udp6 = this.cast("udp6")
  @scala.inline
  def `unix:dgram`: typings.fridaDashGum.fridaDashGumStrings.`unix:dgram` = this.cast("unix:dgram")
  @scala.inline
  def `unix:stream`: typings.fridaDashGum.fridaDashGumStrings.`unix:stream` = this.cast("unix:stream")
}

