package typings.glVec3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object setMod {
  
  @JSImport("gl-vec3/set", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(out: js.Array[Double], x: Double, y: Double, z: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(out.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], z.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
}
