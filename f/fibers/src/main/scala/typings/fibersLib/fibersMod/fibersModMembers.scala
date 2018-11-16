package typings
package fibersLib.fibersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fibers", JSImport.Namespace)
@js.native
object fibersModMembers extends js.Object {
  var current: fibersLib.fibersMod.fibersNs.Fiber = js.native
  var fibersCreated: scala.Double = js.native
  var poolSize: scala.Double = js.native
  def apply(callback: js.Function0[scala.Unit]): fibersLib.fibersMod.fibersNs.Fiber = js.native
  def `yield`(): js.Any = js.native
  def `yield`(value: js.Any): js.Any = js.native
}

