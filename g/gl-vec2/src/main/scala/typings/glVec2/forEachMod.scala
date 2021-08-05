package typings.glVec2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object forEachMod {
  
  inline def apply(
    a: js.Array[Double],
    stride: Double,
    offset: Double,
    count: Double,
    fn: js.Function3[
      /* a */ js.Array[Double], 
      /* b */ js.Array[Double], 
      /* arg */ js.Object, 
      js.Array[Double]
    ],
    arg: js.Object
  ): js.Array[Double] = (^.asInstanceOf[js.Dynamic].apply(a.asInstanceOf[js.Any], stride.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], count.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], arg.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  @JSImport("gl-vec2/forEach", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
