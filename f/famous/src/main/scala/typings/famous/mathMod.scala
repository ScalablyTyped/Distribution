package typings.famous

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("famous/math", JSImport.Namespace)
@js.native
object mathMod extends js.Object {
  @js.native
  class Mat33 () extends js.Object {
    var values: js.Array[Double] = js.native
  }
  
  @js.native
  class Quaternion () extends js.Object {
    var w: Double = js.native
    var x: Double = js.native
    var y: Double = js.native
    var z: Double = js.native
    def fromEuler(x: Double, y: Double, z: Double): Quaternion = js.native
    def toEuler(output: Vec3): Vec3 = js.native
  }
  
  @js.native
  class Vec2 () extends js.Object {
    def this(x: Double) = this()
    def this(x: Double, y: Double) = this()
    var x: Double = js.native
    var y: Double = js.native
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
    def set(x: Double): Vec3 = js.native
    def set(x: Double, y: Double): Vec3 = js.native
    def subtract(v: Vec2): Vec2 = js.native
    def toArray(): js.Array[Double] = js.native
  }
  
  @js.native
  class Vec3 () extends js.Object {
    def this(x: Double) = this()
    def this(x: Double, y: Double) = this()
    def this(x: Double, y: Double, z: Double) = this()
    var x: Double = js.native
    var y: Double = js.native
    var z: Double = js.native
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
    def set(x: Double): Vec3 = js.native
    def set(x: Double, y: Double): Vec3 = js.native
    def set(x: Double, y: Double, z: Double): Vec3 = js.native
    def subtract(v: Vec3): Vec3 = js.native
    def toArray(): js.Array[Double] = js.native
  }
  
  /* static members */
  @js.native
  object Vec2 extends js.Object {
    def add(v1: Vec2, v2: Vec2, output: Vec2): Vec2 = js.native
    def clone(v: Vec2): Vec2 = js.native
    def cross(v1: Vec2, v2: Vec2, output: Vec2): Vec2 = js.native
    def dot(v1: Vec2, v2: Vec2): Double = js.native
    def normalize(v: Vec2, output: Vec2): Vec2 = js.native
    def scale(v: Vec2, s: Vec2, output: Vec2): Vec2 = js.native
    def subtract(v1: Vec2, v2: Vec2, output: Vec2): Vec2 = js.native
  }
  
  /* static members */
  @js.native
  object Vec3 extends js.Object {
    def add(v1: Vec3, v2: Vec3, output: Vec3): Vec3 = js.native
    def applyRotation(v: Vec3, q: Quaternion, output: Vec3): Vec3 = js.native
    def clone(v: Vec3): Vec3 = js.native
    def cross(v1: Vec3, v2: Vec3, output: Vec3): Vec3 = js.native
    def dot(v1: Vec3, v2: Vec3): Double = js.native
    def normalize(v: Vec3, output: Vec3): Vec3 = js.native
    def project(v1: Vec3, v2: Vec3, output: Vec3): Vec3 = js.native
    def scale(v: Vec3, s: Vec3, output: Vec3): Vec3 = js.native
    def subtract(v1: Vec3, v2: Vec3, output: Vec3): Vec3 = js.native
  }
  
}

