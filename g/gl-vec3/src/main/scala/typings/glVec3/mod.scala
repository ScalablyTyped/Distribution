package typings.glVec3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("gl-vec3", "add")
  @js.native
  def add(out: js.Array[Double], a: js.Array[Double], b: js.Array[Double]): js.Array[Double] = js.native
  
  @JSImport("gl-vec3", "angle")
  @js.native
  def angle(a: js.Array[Double], b: js.Array[Double]): Double = js.native
  
  @JSImport("gl-vec3", "ceil")
  @js.native
  def ceil(out: js.Array[Double], a: js.Array[Double]): js.Array[Double] = js.native
  
  @JSImport("gl-vec3", "clone")
  @js.native
  def clone_(a: js.Array[Double]): js.Array[Double] = js.native
  
  @JSImport("gl-vec3", "copy")
  @js.native
  def copy(out: js.Array[Double], a: js.Array[Double]): js.Array[Double] = js.native
  
  @JSImport("gl-vec3", "create")
  @js.native
  def create(): js.Array[Double] = js.native
  
  @JSImport("gl-vec3", "cross")
  @js.native
  def cross(out: js.Array[Double], a: js.Array[Double], b: js.Array[Double]): js.Array[Double] = js.native
  
  @JSImport("gl-vec3", "dist")
  @js.native
  def dist(a: js.Array[Double], b: js.Array[Double]): Double = js.native
  
  @JSImport("gl-vec3", "div")
  @js.native
  def div(out: js.Array[Double], a: js.Array[Double], b: js.Array[Double]): js.Array[Double] = js.native
  
  @JSImport("gl-vec3", "dot")
  @js.native
  def dot(a: js.Array[Double], b: js.Array[Double]): Double = js.native
  
  @JSImport("gl-vec3", "equals")
  @js.native
  def equals_(a: js.Array[Double], b: js.Array[Double]): Boolean = js.native
  
  @JSImport("gl-vec3", "exactEquals")
  @js.native
  def exactEquals(a: js.Array[Double], b: js.Array[Double]): Boolean = js.native
  
  @JSImport("gl-vec3", "floor")
  @js.native
  def floor(out: js.Array[Double], a: js.Array[Double]): js.Array[Double] = js.native
  
  @JSImport("gl-vec3", "forEach")
  @js.native
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
  ): js.Array[Double] = js.native
  
  @JSImport("gl-vec3", "fromValues")
  @js.native
  def fromValues(x: Double, y: Double, z: Double): js.Array[Double] = js.native
  
  @JSImport("gl-vec3", "inverse")
  @js.native
  def inverse(out: js.Array[Double], a: js.Array[Double]): js.Array[Double] = js.native
  
  @JSImport("gl-vec3", "len")
  @js.native
  def len(a: js.Array[Double]): Double = js.native
  
  @JSImport("gl-vec3", "lerp")
  @js.native
  def lerp(out: js.Array[Double], a: js.Array[Double], b: js.Array[Double], t: Double): js.Array[Double] = js.native
  
  @JSImport("gl-vec3", "max")
  @js.native
  def max(out: js.Array[Double], a: js.Array[Double], b: js.Array[Double]): js.Array[Double] = js.native
  
  @JSImport("gl-vec3", "min")
  @js.native
  def min(out: js.Array[Double], a: js.Array[Double], b: js.Array[Double]): js.Array[Double] = js.native
  
  @JSImport("gl-vec3", "mul")
  @js.native
  def mul(out: js.Array[Double], a: js.Array[Double], b: js.Array[Double]): js.Array[Double] = js.native
  
  @JSImport("gl-vec3", "negate")
  @js.native
  def negate(out: js.Array[Double], a: js.Array[Double]): js.Array[Double] = js.native
  
  @JSImport("gl-vec3", "normalize")
  @js.native
  def normalize(out: js.Array[Double], a: js.Array[Double]): js.Array[Double] = js.native
  
  @JSImport("gl-vec3", "random")
  @js.native
  def random(out: js.Array[Double], scale: Double): js.Array[Double] = js.native
  
  @JSImport("gl-vec3", "rotateX")
  @js.native
  def rotateX(out: js.Array[Double], a: js.Array[Double], b: js.Array[Double], c: Double): js.Array[Double] = js.native
  
  @JSImport("gl-vec3", "rotateY")
  @js.native
  def rotateY(out: js.Array[Double], a: js.Array[Double], b: js.Array[Double], c: Double): js.Array[Double] = js.native
  
  @JSImport("gl-vec3", "rotateZ")
  @js.native
  def rotateZ(out: js.Array[Double], a: js.Array[Double], b: js.Array[Double], c: Double): js.Array[Double] = js.native
  
  @JSImport("gl-vec3", "round")
  @js.native
  def round(out: js.Array[Double], a: js.Array[Double]): js.Array[Double] = js.native
  
  @JSImport("gl-vec3", "scale")
  @js.native
  def scale(out: js.Array[Double], a: js.Array[Double], b: Double): js.Array[Double] = js.native
  
  @JSImport("gl-vec3", "scaleAndAdd")
  @js.native
  def scaleAndAdd(out: js.Array[Double], a: js.Array[Double], b: js.Array[Double], scale: Double): js.Array[Double] = js.native
  
  @JSImport("gl-vec3", "set")
  @js.native
  def set(out: js.Array[Double], x: Double, y: Double, z: Double): js.Array[Double] = js.native
  
  @JSImport("gl-vec3", "sqrDist")
  @js.native
  def sqrDist(a: js.Array[Double], b: js.Array[Double]): js.Array[Double] = js.native
  
  @JSImport("gl-vec3", "sqrLen")
  @js.native
  def sqrLen(a: js.Array[Double]): js.Array[Double] = js.native
  
  @JSImport("gl-vec3", "sub")
  @js.native
  def sub(out: js.Array[Double], a: js.Array[Double], b: js.Array[Double]): js.Array[Double] = js.native
  
  @JSImport("gl-vec3", "transformMat3")
  @js.native
  def transformMat3(out: js.Array[Double], a: js.Array[Double], m: js.Array[Double]): js.Array[Double] = js.native
  
  @JSImport("gl-vec3", "transformMat4")
  @js.native
  def transformMat4(out: js.Array[Double], a: js.Array[Double], m: js.Array[Double]): js.Array[Double] = js.native
  
  @JSImport("gl-vec3", "transformQuat")
  @js.native
  def transformQuat(out: js.Array[Double], a: js.Array[Double], q: js.Array[Double]): js.Array[Double] = js.native
}
