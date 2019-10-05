package typings.fibers

import typings.fibers.fibersMod.Fiber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fibers", JSImport.Namespace)
@js.native
object fibersMod extends js.Object {
  @js.native
  trait Fiber extends js.Object {
    def run(): js.Any = js.native
    def run(value: js.Any): js.Any = js.native
  }
  
  var current: Fiber = js.native
  var fibersCreated: Double = js.native
  var poolSize: Double = js.native
  def apply(callback: js.Function0[Unit]): Fiber = js.native
  def `yield`(): js.Any = js.native
  def `yield`(value: js.Any): js.Any = js.native
}

