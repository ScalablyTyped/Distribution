package typings.frac

import typings.frac.fracMod.Frac$Module
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("frac", JSImport.Namespace)
@js.native
object fracMod extends js.Object {
  @js.native
  trait Frac$Module extends js.Object {
    def apply(x: Double, D: Double): js.Tuple3[Double, Double, Double] = js.native
    def apply(x: Double, D: Double, mixed: Boolean): js.Tuple3[Double, Double, Double] = js.native
    def cont(x: Double, D: Double): js.Tuple3[Double, Double, Double] = js.native
    def cont(x: Double, D: Double, mixed: Boolean): js.Tuple3[Double, Double, Double] = js.native
  }
  
  val default: Frac$Module = js.native
  val frac: Frac$Module = js.native
}

