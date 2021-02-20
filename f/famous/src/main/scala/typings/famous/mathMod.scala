package typings.famous

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mathMod {
  
  @JSImport("famous/math", "Mat33")
  @js.native
  class Mat33 () extends StObject {
    
    var values: js.Array[Double] = js.native
  }
  
  @JSImport("famous/math", "Quaternion")
  @js.native
  class Quaternion () extends StObject {
    
    def fromEuler(x: Double, y: Double, z: Double): Quaternion = js.native
    
    def toEuler(output: Vec3): Vec3 = js.native
    
    var w: Double = js.native
    
    var x: Double = js.native
    
    var y: Double = js.native
    
    var z: Double = js.native
  }
  
  @JSImport("famous/math", "Vec2")
  @js.native
  class Vec2 () extends StObject {
    def this(x: Double) = this()
    def this(x: js.UndefOr[scala.Nothing], y: Double) = this()
    def this(x: Double, y: Double) = this()
    
    def add(v: Vec2): Vec2 = js.native
    
    def clear(): Vec2 = js.native
    
    def copy(v: Vec2): Vec2 = js.native
    
    def cross(v: Vec2): Vec2 = js.native
    
    def dot(v: Vec2): Double = js.native
    
    def invert(): Vec2 = js.native
    
    def isZero(): Boolean = js.native
    
    def length(): Double = js.native
    
    def map(fn: js.Function1[/* eachCoordinate */ Double, Double]): Vec2 = js.native
    
    def rotate(theta: Double): Vec2 = js.native
    
    def scale(s: Double): Vec2 = js.native
    
    def set(): Vec3 = js.native
    def set(x: js.UndefOr[scala.Nothing], y: Double): Vec3 = js.native
    def set(x: Double): Vec3 = js.native
    def set(x: Double, y: Double): Vec3 = js.native
    
    def subtract(v: Vec2): Vec2 = js.native
    
    def toArray(): js.Array[Double] = js.native
    
    var x: Double = js.native
    
    var y: Double = js.native
  }
  /* static members */
  object Vec2 {
    
    @JSImport("famous/math", "Vec2.add")
    @js.native
    def add(v1: Vec2, v2: Vec2, output: Vec2): Vec2 = js.native
    
    @JSImport("famous/math", "Vec2.clone")
    @js.native
    def clone(v: Vec2): Vec2 = js.native
    
    @JSImport("famous/math", "Vec2.cross")
    @js.native
    def cross(v1: Vec2, v2: Vec2, output: Vec2): Vec2 = js.native
    
    @JSImport("famous/math", "Vec2.dot")
    @js.native
    def dot(v1: Vec2, v2: Vec2): Double = js.native
    
    @JSImport("famous/math", "Vec2.normalize")
    @js.native
    def normalize(v: Vec2, output: Vec2): Vec2 = js.native
    
    @JSImport("famous/math", "Vec2.scale")
    @js.native
    def scale(v: Vec2, s: Vec2, output: Vec2): Vec2 = js.native
    
    @JSImport("famous/math", "Vec2.subtract")
    @js.native
    def subtract(v1: Vec2, v2: Vec2, output: Vec2): Vec2 = js.native
  }
  
  @JSImport("famous/math", "Vec3")
  @js.native
  class Vec3 () extends StObject {
    def this(x: Double) = this()
    def this(x: js.UndefOr[scala.Nothing], y: Double) = this()
    def this(x: Double, y: Double) = this()
    def this(x: js.UndefOr[scala.Nothing], y: js.UndefOr[scala.Nothing], z: Double) = this()
    def this(x: js.UndefOr[scala.Nothing], y: Double, z: Double) = this()
    def this(x: Double, y: js.UndefOr[scala.Nothing], z: Double) = this()
    def this(x: Double, y: Double, z: Double) = this()
    
    def add(v: Vec3): Vec3 = js.native
    
    def applyMatrix(matrix: Mat33): Vec3 = js.native
    
    def applyRotation(q: Quaternion): Vec3 = js.native
    
    def clear(): Vec3 = js.native
    
    def copy(v: Vec3): Vec3 = js.native
    
    def cross(v: Vec3): Vec3 = js.native
    
    def dot(v: Vec3): Double = js.native
    
    def insert(): Vec3 = js.native
    
    def isZero(): Boolean = js.native
    
    def length(): Double = js.native
    
    def lengthSq(): Double = js.native
    
    def map(fn: js.Function1[/* eachCoordinate */ Double, Double]): Vec3 = js.native
    
    def normalize(): Vec3 = js.native
    
    def rotateX(theta: Double): Vec3 = js.native
    
    def rotateY(theta: Double): Vec3 = js.native
    
    def rotateZ(theta: Double): Vec3 = js.native
    
    def scale(s: Double): Vec3 = js.native
    
    def set(): Vec3 = js.native
    def set(x: js.UndefOr[scala.Nothing], y: js.UndefOr[scala.Nothing], z: Double): Vec3 = js.native
    def set(x: js.UndefOr[scala.Nothing], y: Double): Vec3 = js.native
    def set(x: js.UndefOr[scala.Nothing], y: Double, z: Double): Vec3 = js.native
    def set(x: Double): Vec3 = js.native
    def set(x: Double, y: js.UndefOr[scala.Nothing], z: Double): Vec3 = js.native
    def set(x: Double, y: Double): Vec3 = js.native
    def set(x: Double, y: Double, z: Double): Vec3 = js.native
    
    def subtract(v: Vec3): Vec3 = js.native
    
    def toArray(): js.Array[Double] = js.native
    
    var x: Double = js.native
    
    var y: Double = js.native
    
    var z: Double = js.native
  }
  /* static members */
  object Vec3 {
    
    @JSImport("famous/math", "Vec3.add")
    @js.native
    def add(v1: Vec3, v2: Vec3, output: Vec3): Vec3 = js.native
    
    @JSImport("famous/math", "Vec3.applyRotation")
    @js.native
    def applyRotation(v: Vec3, q: Quaternion, output: Vec3): Vec3 = js.native
    
    @JSImport("famous/math", "Vec3.clone")
    @js.native
    def clone(v: Vec3): Vec3 = js.native
    
    @JSImport("famous/math", "Vec3.cross")
    @js.native
    def cross(v1: Vec3, v2: Vec3, output: Vec3): Vec3 = js.native
    
    @JSImport("famous/math", "Vec3.dot")
    @js.native
    def dot(v1: Vec3, v2: Vec3): Double = js.native
    
    @JSImport("famous/math", "Vec3.normalize")
    @js.native
    def normalize(v: Vec3, output: Vec3): Vec3 = js.native
    
    @JSImport("famous/math", "Vec3.project")
    @js.native
    def project(v1: Vec3, v2: Vec3, output: Vec3): Vec3 = js.native
    
    @JSImport("famous/math", "Vec3.scale")
    @js.native
    def scale(v: Vec3, s: Vec3, output: Vec3): Vec3 = js.native
    
    @JSImport("famous/math", "Vec3.subtract")
    @js.native
    def subtract(v1: Vec3, v2: Vec3, output: Vec3): Vec3 = js.native
  }
}
