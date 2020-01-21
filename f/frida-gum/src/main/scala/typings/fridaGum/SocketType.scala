package typings.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.fridaGum.fridaGumStrings.tcp
  - typings.fridaGum.fridaGumStrings.udp
  - typings.fridaGum.fridaGumStrings.tcp6
  - typings.fridaGum.fridaGumStrings.udp6
  - typings.fridaGum.fridaGumStrings.unixColonstream
  - typings.fridaGum.fridaGumStrings.unixColondgram
*/
trait SocketType extends js.Object

object SocketType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def tcp: typings.fridaGum.fridaGumStrings.tcp = this.cast("tcp")
  @scala.inline
  def tcp6: typings.fridaGum.fridaGumStrings.tcp6 = this.cast("tcp6")
  @scala.inline
  def udp: typings.fridaGum.fridaGumStrings.udp = this.cast("udp")
  @scala.inline
  def udp6: typings.fridaGum.fridaGumStrings.udp6 = this.cast("udp6")
  @scala.inline
  def unixColondgram: typings.fridaGum.fridaGumStrings.unixColondgram = this.cast("unix:dgram")
  @scala.inline
  def unixColonstream: typings.fridaGum.fridaGumStrings.unixColonstream = this.cast("unix:stream")
}

