package typings.glVec3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object transformMat4Mod {
  
  @JSImport("gl-vec3/transformMat4", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(out: js.Array[Double], a: js.Array[Double], m: js.Array[Double]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], m.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
}
