package typings
package domDashClipboardDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Clipboard
  extends stdLib.EventTarget {
  def read(): stdLib.Promise[stdLib.DataTransfer] = js.native
  def readText(): stdLib.Promise[java.lang.String] = js.native
  def write(data: stdLib.DataTransfer): stdLib.Promise[scala.Unit] = js.native
  def writeText(data: java.lang.String): stdLib.Promise[scala.Unit] = js.native
}

