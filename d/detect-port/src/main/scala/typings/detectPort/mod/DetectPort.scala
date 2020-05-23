package typings.detectPort.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DetectPort extends js.Object {
  def apply(port: Double): js.Promise[Double] = js.native
  def apply(port: Double, callback: DetectPortCallback): Unit = js.native
  def apply(port: PortConfig): js.Promise[Double] = js.native
  def apply(port: PortConfig, callback: DetectPortCallback): Unit = js.native
}

