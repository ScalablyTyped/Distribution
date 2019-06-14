package typings
package fridaDashGumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - fridaDashGumLib.fridaDashGumLibStrings.tcp
  - fridaDashGumLib.fridaDashGumLibStrings.udp
  - fridaDashGumLib.fridaDashGumLibStrings.tcp6
  - fridaDashGumLib.fridaDashGumLibStrings.udp6
  - fridaDashGumLib.fridaDashGumLibStrings.`unix:stream`
  - fridaDashGumLib.fridaDashGumLibStrings.`unix:dgram`
*/
trait SocketType extends js.Object

object SocketType {
  @scala.inline
  def Tcp: fridaDashGumLib.fridaDashGumLibStrings.tcp = this.cast("tcp")
  @scala.inline
  def Tcp6: fridaDashGumLib.fridaDashGumLibStrings.tcp6 = this.cast("tcp6")
  @scala.inline
  def Udp: fridaDashGumLib.fridaDashGumLibStrings.udp = this.cast("udp")
  @scala.inline
  def Udp6: fridaDashGumLib.fridaDashGumLibStrings.udp6 = this.cast("udp6")
  @scala.inline
  def UnixDatagram: fridaDashGumLib.fridaDashGumLibStrings.`unix:dgram` = this.cast("unix:dgram")
  @scala.inline
  def UnixStream: fridaDashGumLib.fridaDashGumLibStrings.`unix:stream` = this.cast("unix:stream")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

