package typings.glVec2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("gl-vec2", "add")
  @js.native
  def add(out: js.Array[Double], a: js.Array[Double], b: js.Array[Double]): js.Array[Double] = js.native
  
  @JSImport("gl-vec2", "clone")
  @js.native
  def clone_(a: js.Array[Double]): js.Array[Double] = js.native
  
  @JSImport("gl-vec2", "copy")
  @js.native
  def copy(out: js.Array[Double], a: js.Array[Double]): js.Array[Double] = js.native
  
  @JSImport("gl-vec2", "create")
  @js.native
  def create(): js.Array[Double] = js.native
  
  @JSImport("gl-vec2", "cross")
  @js.native
  def cross(out: js.Array[Double], a: js.Array[Double], b: js.Array[Double]): js.Array[Double] = js.native
  
  @JSImport("gl-vec2", "dist")
  @js.native
  def dist(a: js.Array[Double], b: js.Array[Double]): Double = js.native
  
  @JSImport("gl-vec2", "div")
  @js.native
  def div(out: js.Array[Double], a: js.Array[Double], b: js.Array[Double]): js.Array[Double] = js.native
  
  @JSImport("gl-vec2", "dot")
  @js.native
  def dot(a: js.Array[Double], b: js.Array[Double]): Double = js.native
  
  @JSImport("gl-vec2", "equals")
  @js.native
  def equals_(a: js.Array[Double], b: js.Array[Double]): Boolean = js.native
  
  @JSImport("gl-vec2", "exactEquals")
  @js.native
  def exactEquals(a: js.Array[Double], b: js.Array[Double]): Boolean = js.native
  
  @JSImport("gl-vec2", "floor")
  @js.native
  def floor(out: js.Array[Double], a: js.Array[Double]): js.Array[Double] = js.native
  
  @JSImport("gl-vec2", "forEach")
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
  
  @JSImport("gl-vec2", "fromValues")
  @js.native
  def fromValues(x: Double, y: Double): js.Array[Double] = js.native
  
  @JSImport("gl-vec2", "inverse")
  @js.native
  def inverse(out: js.Array[Double], a: js.Array[Double]): js.Array[Double] = js.native
  
  @JSImport("gl-vec2", "len")
  @js.native
  def len(a: js.Array[Double]): Double = js.native
  
  @JSImport("gl-vec2", "lerp")
  @js.native
  def lerp(out: js.Array[Double], a: js.Array[Double], b: js.Array[Double], t: Double): js.Array[Double] = js.native
  
  @JSImport("gl-vec2", "limit")
  @js.native
  def limit(out: js.Array[Double], a: js.Array[Double], max: Double): js.Array[Double] = js.native
  
  @JSImport("gl-vec2", "max")
  @js.native
  def max(out: js.Array[Double], a: js.Array[Double], b: js.Array[Double]): js.Array[Double] = js.native
  
  @JSImport("gl-vec2", "min")
  @js.native
  def min(out: js.Array[Double], a: js.Array[Double], b: js.Array[Double]): js.Array[Double] = js.native
  
  @JSImport("gl-vec2", "mul")
  @js.native
  def mul(out: js.Array[Double], a: js.Array[Double], b: js.Array[Double]): js.Array[Double] = js.native
  
  @JSImport("gl-vec2", "negate")
  @js.native
  def negate(out: js.Array[Double], a: js.Array[Double]): js.Array[Double] = js.native
  
  @JSImport("gl-vec2", "normalize")
  @js.native
  def normalize(out: js.Array[Double], a: js.Array[Double]): js.Array[Double] = js.native
  
  @JSImport("gl-vec2", "random")
  @js.native
  def random(out: js.Array[Double], scale: Double): js.Array[Double] = js.native
  
  @JSImport("gl-vec2", "scale")
  @js.native
  def scale(out: js.Array[Double], a: js.Array[Double], b: Double): js.Array[Double] = js.native
  
  @JSImport("gl-vec2", "scaleAndAdd")
  @js.native
  def scaleAndAdd(out: js.Array[Double], a: js.Array[Double], b: js.Array[Double], scale: Double): js.Array[Double] = js.native
  
  @JSImport("gl-vec2", "set")
  @js.native
  def set(out: js.Array[Double], x: Double, y: Double): js.Array[Double] = js.native
  
  @JSImport("gl-vec2", "sqrDist")
  @js.native
  def sqrDist(a: js.Array[Double], b: js.Array[Double]): js.Array[Double] = js.native
  
  @JSImport("gl-vec2", "sqrLen")
  @js.native
  def sqrLen(a: js.Array[Double]): js.Array[Double] = js.native
  
  @JSImport("gl-vec2", "sub")
  @js.native
  def sub(out: js.Array[Double], a: js.Array[Double], b: js.Array[Double]): js.Array[Double] = js.native
  
  @JSImport("gl-vec2", "transformMat2")
  @js.native
  def transformMat2(out: js.Array[Double], a: js.Array[Double], m: js.Array[Double]): js.Array[Double] = js.native
  
  @JSImport("gl-vec2", "transformMat2d")
  @js.native
  def transformMat2d(out: js.Array[Double], a: js.Array[Double], m: js.Array[Double]): js.Array[Double] = js.native
  
  @JSImport("gl-vec2", "transformMat3")
  @js.native
  def transformMat3(out: js.Array[Double], a: js.Array[Double], m: js.Array[Double]): js.Array[Double] = js.native
  
  @JSImport("gl-vec2", "transformMat4")
  @js.native
  def transformMat4(out: js.Array[Double], a: js.Array[Double], m: js.Array[Double]): js.Array[Double] = js.native
}
