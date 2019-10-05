package typings.easyDashXapiDashSupertest

import typings.easyDashXapiDashSupertest.netMod.Socket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tty", JSImport.Namespace)
@js.native
object ttyMod extends js.Object {
  @js.native
  trait ReadStream extends Socket {
    var isRaw: Boolean = js.native
    def setRawMode(mode: Boolean): Unit = js.native
  }
  
  @js.native
  trait WriteStream extends Socket {
    var columns: Double = js.native
    var rows: Double = js.native
  }
  
  def isatty(fd: Double): Boolean = js.native
}

