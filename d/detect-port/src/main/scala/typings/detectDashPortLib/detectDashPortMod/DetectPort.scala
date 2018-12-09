package typings
package detectDashPortLib.detectDashPortMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DetectPort extends js.Object {
  def apply(port: scala.Double): js.Promise[scala.Double] = js.native
  def apply(
    port: scala.Double,
    callback: js.Function2[/* err */ stdLib.Error, /* _port */ scala.Double, scala.Unit]
  ): scala.Unit = js.native
}

