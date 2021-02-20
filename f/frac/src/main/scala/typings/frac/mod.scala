package typings.frac

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("frac", JSImport.Default)
  @js.native
  val default: FracModule = js.native
  
  @JSImport("frac", "frac")
  @js.native
  val frac: FracModule = js.native
  
  @js.native
  trait FracModule extends StObject {
    
    def apply(x: Double, D: Double): js.Tuple3[Double, Double, Double] = js.native
    def apply(x: Double, D: Double, mixed: Boolean): js.Tuple3[Double, Double, Double] = js.native
    
    def cont(x: Double, D: Double): js.Tuple3[Double, Double, Double] = js.native
    def cont(x: Double, D: Double, mixed: Boolean): js.Tuple3[Double, Double, Double] = js.native
  }
  
  type _To = FracModule
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: FracModule = default
}
