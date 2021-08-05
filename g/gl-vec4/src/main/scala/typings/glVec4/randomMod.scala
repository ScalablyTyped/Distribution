package typings.glVec4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object randomMod {
  
  @JSImport("gl-vec4/random", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(out: js.Array[Double], scale: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(out.asInstanceOf[js.Any], scale.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
}
