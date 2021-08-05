package typings.glVec4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dotMod {
  
  @JSImport("gl-vec4/dot", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(a: js.Array[Double], b: js.Array[Double]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
}
