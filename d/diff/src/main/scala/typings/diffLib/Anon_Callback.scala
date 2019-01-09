package typings
package diffLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Callback extends js.Object {
  def complete(): scala.Unit = js.native
  def complete(err: stdLib.Error): scala.Unit = js.native
  def loadFile(
    index: scala.Double,
    callback: js.Function2[/* err */ stdLib.Error, /* data */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def patched(index: scala.Double, content: java.lang.String): scala.Unit = js.native
}

