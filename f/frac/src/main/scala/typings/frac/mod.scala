package typings.frac

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("frac", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  val default: FracModule = js.native
  
  val frac: FracModule = js.native
  
  @js.native
  trait FracModule extends js.Object {
    
    def apply(x: Double, D: Double): js.Tuple3[Double, Double, Double] = js.native
    def apply(x: Double, D: Double, mixed: Boolean): js.Tuple3[Double, Double, Double] = js.native
    
    def cont(x: Double, D: Double): js.Tuple3[Double, Double, Double] = js.native
    def cont(x: Double, D: Double, mixed: Boolean): js.Tuple3[Double, Double, Double] = js.native
  }
}
