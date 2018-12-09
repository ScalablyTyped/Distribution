package typings
package domDashClipboardDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Clipboard
  extends stdLib.EventTarget {
  def read(): js.Promise[stdLib.DataTransfer] = js.native
  def readText(): js.Promise[java.lang.String] = js.native
  def write(data: stdLib.DataTransfer): js.Promise[scala.Unit] = js.native
  def writeText(data: java.lang.String): js.Promise[scala.Unit] = js.native
}

