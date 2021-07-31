package typings.glVec3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("gl-vec3", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def add(out: js.Array[Double], a: js.Array[Double], b: js.Array[Double]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  @scala.inline
  def angle(a: js.Array[Double], b: js.Array[Double]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("angle")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def ceil(out: js.Array[Double], a: js.Array[Double]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("ceil")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  @scala.inline
  def clone_(a: js.Array[Double]): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(a.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  
  @scala.inline
  def copy(out: js.Array[Double], a: js.Array[Double]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("copy")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  @scala.inline
  def create(): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[js.Array[Double]]
  
  @scala.inline
  def cross(out: js.Array[Double], a: js.Array[Double], b: js.Array[Double]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("cross")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  @scala.inline
  def dist(a: js.Array[Double], b: js.Array[Double]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("dist")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def div(out: js.Array[Double], a: js.Array[Double], b: js.Array[Double]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("div")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  @scala.inline
  def dot(a: js.Array[Double], b: js.Array[Double]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("dot")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def equals_(a: js.Array[Double], b: js.Array[Double]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def exactEquals(a: js.Array[Double], b: js.Array[Double]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("exactEquals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def floor(out: js.Array[Double], a: js.Array[Double]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("floor")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  @scala.inline
  def forEach(
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
  ): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("forEach")(a.asInstanceOf[js.Any], stride.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], count.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], arg.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  @scala.inline
  def fromValues(x: Double, y: Double, z: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromValues")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], z.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  @scala.inline
  def inverse(out: js.Array[Double], a: js.Array[Double]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("inverse")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  @scala.inline
  def len(a: js.Array[Double]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("len")(a.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def lerp(out: js.Array[Double], a: js.Array[Double], b: js.Array[Double], t: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("lerp")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], t.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  @scala.inline
  def max(out: js.Array[Double], a: js.Array[Double], b: js.Array[Double]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("max")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  @scala.inline
  def min(out: js.Array[Double], a: js.Array[Double], b: js.Array[Double]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("min")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  @scala.inline
  def mul(out: js.Array[Double], a: js.Array[Double], b: js.Array[Double]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("mul")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  @scala.inline
  def negate(out: js.Array[Double], a: js.Array[Double]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("negate")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  @scala.inline
  def normalize(out: js.Array[Double], a: js.Array[Double]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("normalize")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  @scala.inline
  def random(out: js.Array[Double], scale: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("random")(out.asInstanceOf[js.Any], scale.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  @scala.inline
  def rotateX(out: js.Array[Double], a: js.Array[Double], b: js.Array[Double], c: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("rotateX")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  @scala.inline
  def rotateY(out: js.Array[Double], a: js.Array[Double], b: js.Array[Double], c: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("rotateY")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  @scala.inline
  def rotateZ(out: js.Array[Double], a: js.Array[Double], b: js.Array[Double], c: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("rotateZ")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  @scala.inline
  def round(out: js.Array[Double], a: js.Array[Double]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("round")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  @scala.inline
  def scale(out: js.Array[Double], a: js.Array[Double], b: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("scale")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  @scala.inline
  def scaleAndAdd(out: js.Array[Double], a: js.Array[Double], b: js.Array[Double], scale: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("scaleAndAdd")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], scale.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  @scala.inline
  def set(out: js.Array[Double], x: Double, y: Double, z: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(out.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], z.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  @scala.inline
  def sqrDist(a: js.Array[Double], b: js.Array[Double]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("sqrDist")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  @scala.inline
  def sqrLen(a: js.Array[Double]): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("sqrLen")(a.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  
  @scala.inline
  def sub(out: js.Array[Double], a: js.Array[Double], b: js.Array[Double]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("sub")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  @scala.inline
  def transformMat3(out: js.Array[Double], a: js.Array[Double], m: js.Array[Double]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("transformMat3")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], m.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  @scala.inline
  def transformMat4(out: js.Array[Double], a: js.Array[Double], m: js.Array[Double]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("transformMat4")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], m.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  @scala.inline
  def transformQuat(out: js.Array[Double], a: js.Array[Double], q: js.Array[Double]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("transformQuat")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], q.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
}
