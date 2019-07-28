package typings.detectDashPort.detectDashPortMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DetectPort extends js.Object {
  def apply(port: Double): js.Promise[Double] = js.native
  def apply(port: Double, callback: js.Function2[/* err */ Error, /* _port */ Double, Unit]): Unit = js.native
}

