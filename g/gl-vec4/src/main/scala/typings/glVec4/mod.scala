package typings.glVec4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("gl-vec4", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def add(out: js.Array[Double], a: js.Array[Double], b: js.Array[Double]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  inline def clone_(a: js.Array[Double]): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(a.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  
  inline def copy(out: js.Array[Double], a: js.Array[Double]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("copy")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  inline def create(): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[js.Array[Double]]
  
  inline def distance(a: js.Array[Double], b: js.Array[Double]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("distance")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def divide(out: js.Array[Double], a: js.Array[Double], b: js.Array[Double]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("divide")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  inline def dot(a: js.Array[Double], b: js.Array[Double]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("dot")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def fromValues(x: Double, y: Double, z: Double, w: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromValues")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], z.asInstanceOf[js.Any], w.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  inline def inverse(out: js.Array[Double], a: js.Array[Double]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("inverse")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  inline def length(a: js.Array[Double]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("length")(a.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def lerp(out: js.Array[Double], a: js.Array[Double], b: js.Array[Double], t: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("lerp")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], t.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  inline def max(out: js.Array[Double], a: js.Array[Double], b: js.Array[Double]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("max")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  inline def min(out: js.Array[Double], a: js.Array[Double], b: js.Array[Double]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("min")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  inline def multiply(out: js.Array[Double], a: js.Array[Double], b: js.Array[Double]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("multiply")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  inline def negate(out: js.Array[Double], a: js.Array[Double]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("negate")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  inline def normalize(out: js.Array[Double], a: js.Array[Double]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("normalize")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  inline def random(out: js.Array[Double], scale: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("random")(out.asInstanceOf[js.Any], scale.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  inline def scale(out: js.Array[Double], a: js.Array[Double], b: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("scale")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  inline def scaleAndAdd(out: js.Array[Double], a: js.Array[Double], b: js.Array[Double], scale: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("scaleAndAdd")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], scale.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  inline def set(out: js.Array[Double], x: js.Array[Double], y: js.Array[Double], z: Double, w: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(out.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], z.asInstanceOf[js.Any], w.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  inline def squaredDistance(a: js.Array[Double], b: js.Array[Double]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("squaredDistance")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def squaredLength(a: js.Array[Double]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("squaredLength")(a.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def subtract(out: js.Array[Double], a: js.Array[Double], b: js.Array[Double]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("subtract")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  inline def transformMat4(out: js.Array[Double], a: js.Array[Double], m: js.Array[Double]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("transformMat4")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], m.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  inline def transformQuat(out: js.Array[Double], a: js.Array[Double], q: js.Array[Double]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("transformQuat")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], q.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
}
