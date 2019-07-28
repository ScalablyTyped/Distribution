package typings.fibers.fibersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fibers", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var current: Fiber = js.native
  var fibersCreated: Double = js.native
  var poolSize: Double = js.native
  def apply(callback: js.Function0[Unit]): Fiber = js.native
  def `yield`(): js.Any = js.native
  def `yield`(value: js.Any): js.Any = js.native
}

