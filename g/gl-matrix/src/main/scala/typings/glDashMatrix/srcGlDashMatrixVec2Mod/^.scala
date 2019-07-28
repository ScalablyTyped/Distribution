package typings.glDashMatrix.srcGlDashMatrixVec2Mod

import typings.glDashMatrix.glDashMatrixMod.mat2
import typings.glDashMatrix.glDashMatrixMod.mat2d
import typings.glDashMatrix.glDashMatrixMod.mat3
import typings.glDashMatrix.glDashMatrixMod.mat4
import typings.glDashMatrix.glDashMatrixMod.vec2
import typings.glDashMatrix.glDashMatrixMod.vec3
import typings.std.Float32Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gl-matrix/src/gl-matrix/vec2", JSImport.Namespace)
@js.native
class ^ () extends vec2

@JSImport("gl-matrix/src/gl-matrix/vec2", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def add(out: vec2, a: js.Array[Double], b: js.Array[Double]): vec2 = js.native
  def add(out: vec2, a: js.Array[Double], b: vec2): vec2 = js.native
  def add(out: vec2, a: vec2, b: js.Array[Double]): vec2 = js.native
  /**
    * Adds two vec2's
    *
    * @param out the receiving vector
    * @param a the first operand
    * @param b the second operand
    * @returns out
    */
  def add(out: vec2, a: vec2, b: vec2): vec2 = js.native
  def angle(a: js.Array[Double], b: js.Array[Double]): Double = js.native
  def angle(a: js.Array[Double], b: vec2): Double = js.native
  def angle(a: vec2, b: js.Array[Double]): Double = js.native
  /**
    * Get the angle between two 2D vectors
    * @param a The first operand
    * @param b The second operand
    * @returns The angle in radians
    */
  def angle(a: vec2, b: vec2): Double = js.native
  def ceil(out: vec2, a: js.Array[Double]): vec2 = js.native
  /**
    * Math.ceil the components of a vec2
    *
    * @param {vec2} out the receiving vector
    * @param {vec2} a vector to ceil
    * @returns {vec2} out
    */
  def ceil(out: vec2, a: vec2): vec2 = js.native
  def clone(a: js.Array[Double]): vec2 = js.native
  /**
    * Creates a new vec2 initialized with values from an existing vector
    *
    * @param a a vector to clone
    * @returns a new 2D vector
    */
  def clone(a: vec2): vec2 = js.native
  def copy(out: vec2, a: js.Array[Double]): vec2 = js.native
  /**
    * Copy the values from one vec2 to another
    *
    * @param out the receiving vector
    * @param a the source vector
    * @returns out
    */
  def copy(out: vec2, a: vec2): vec2 = js.native
  /**
    * Creates a new, empty vec2
    *
    * @returns a new 2D vector
    */
  def create(): vec2 = js.native
  def cross(out: vec3, a: js.Array[Double], b: js.Array[Double]): vec3 = js.native
  def cross(out: vec3, a: js.Array[Double], b: vec2): vec3 = js.native
  def cross(out: vec3, a: vec2, b: js.Array[Double]): vec3 = js.native
  /**
    * Computes the cross product of two vec2's
    * Note that the cross product must by definition produce a 3D vector
    *
    * @param out the receiving vector
    * @param a the first operand
    * @param b the second operand
    * @returns out
    */
  def cross(out: vec3, a: vec2, b: vec2): vec3 = js.native
  def dist(a: js.Array[Double], b: js.Array[Double]): Double = js.native
  def dist(a: js.Array[Double], b: vec2): Double = js.native
  def dist(a: vec2, b: js.Array[Double]): Double = js.native
  /**
    * Calculates the euclidian distance between two vec2's
    *
    * @param a the first operand
    * @param b the second operand
    * @returns distance between a and b
    */
  def dist(a: vec2, b: vec2): Double = js.native
  def distance(a: js.Array[Double], b: js.Array[Double]): Double = js.native
  def distance(a: js.Array[Double], b: vec2): Double = js.native
  def distance(a: vec2, b: js.Array[Double]): Double = js.native
  /**
    * Calculates the euclidian distance between two vec2's
    *
    * @param a the first operand
    * @param b the second operand
    * @returns distance between a and b
    */
  def distance(a: vec2, b: vec2): Double = js.native
  def div(out: vec2, a: js.Array[Double], b: js.Array[Double]): vec2 = js.native
  def div(out: vec2, a: js.Array[Double], b: vec2): vec2 = js.native
  def div(out: vec2, a: vec2, b: js.Array[Double]): vec2 = js.native
  /**
    * Divides two vec2's
    *
    * @param out the receiving vector
    * @param a the first operand
    * @param b the second operand
    * @returns out
    */
  def div(out: vec2, a: vec2, b: vec2): vec2 = js.native
  def divide(out: vec2, a: js.Array[Double], b: js.Array[Double]): vec2 = js.native
  def divide(out: vec2, a: js.Array[Double], b: vec2): vec2 = js.native
  def divide(out: vec2, a: vec2, b: js.Array[Double]): vec2 = js.native
  /**
    * Divides two vec2's
    *
    * @param out the receiving vector
    * @param a the first operand
    * @param b the second operand
    * @returns out
    */
  def divide(out: vec2, a: vec2, b: vec2): vec2 = js.native
  def dot(a: js.Array[Double], b: js.Array[Double]): Double = js.native
  def dot(a: js.Array[Double], b: vec2): Double = js.native
  def dot(a: vec2, b: js.Array[Double]): Double = js.native
  /**
    * Calculates the dot product of two vec2's
    *
    * @param a the first operand
    * @param b the second operand
    * @returns dot product of a and b
    */
  def dot(a: vec2, b: vec2): Double = js.native
  def equals(a: js.Array[Double], b: js.Array[Double]): Boolean = js.native
  def equals(a: js.Array[Double], b: vec2): Boolean = js.native
  def equals(a: vec2, b: js.Array[Double]): Boolean = js.native
  /**
    * Returns whether or not the vectors have approximately the same elements in the same position.
    *
    * @param {vec2} a The first vector.
    * @param {vec2} b The second vector.
    * @returns {boolean} True if the vectors are equal, false otherwise.
    */
  def equals(a: vec2, b: vec2): Boolean = js.native
  def exactEquals(a: js.Array[Double], b: js.Array[Double]): Boolean = js.native
  def exactEquals(a: js.Array[Double], b: vec2): Boolean = js.native
  def exactEquals(a: vec2, b: js.Array[Double]): Boolean = js.native
  /**
    * Returns whether or not the vectors exactly have the same elements in the same position (when compared with ===)
    *
    * @param {vec2} a The first vector.
    * @param {vec2} b The second vector.
    * @returns {boolean} True if the vectors are equal, false otherwise.
    */
  def exactEquals(a: vec2, b: vec2): Boolean = js.native
  def floor(out: vec2, a: js.Array[Double]): vec2 = js.native
  /**
    * Math.floor the components of a vec2
    *
    * @param {vec2} out the receiving vector
    * @param {vec2} a vector to floor
    * @returns {vec2} out
    */
  def floor(out: vec2, a: vec2): vec2 = js.native
  /**
    * Perform some operation over an array of vec2s.
    *
    * @param a the array of vectors to iterate over
    * @param stride Number of elements between the start of each vec2. If 0 assumes tightly packed
    * @param offset Number of elements to skip at the beginning of the array
    * @param count Number of vec2s to iterate over. If 0 iterates over entire array
    * @param fn Function to call for each vector in the array
    * @returns a
    */
  def forEach(
    a: Float32Array,
    stride: Double,
    offset: Double,
    count: Double,
    fn: js.Function2[/* a */ vec2 | js.Array[Double], /* b */ vec2 | js.Array[Double], Unit]
  ): Float32Array = js.native
  /**
    * Perform some operation over an array of vec2s.
    *
    * @param a the array of vectors to iterate over
    * @param stride Number of elements between the start of each vec2. If 0 assumes tightly packed
    * @param offset Number of elements to skip at the beginning of the array
    * @param count Number of vec2s to iterate over. If 0 iterates over entire array
    * @param fn Function to call for each vector in the array
    * @param arg additional argument to pass to fn
    * @returns a
    */
  def forEach(
    a: Float32Array,
    stride: Double,
    offset: Double,
    count: Double,
    fn: js.Function3[
      /* a */ vec2 | js.Array[Double], 
      /* b */ vec2 | js.Array[Double], 
      /* arg */ js.Any, 
      Unit
    ],
    arg: js.Any
  ): Float32Array = js.native
  /**
    * Creates a new vec2 initialized with the given values
    *
    * @param x X component
    * @param y Y component
    * @returns a new 2D vector
    */
  def fromValues(x: Double, y: Double): vec2 = js.native
  def inverse(out: vec2, a: js.Array[Double]): vec2 = js.native
  /**
    * Returns the inverse of the components of a vec2
    *
    * @param out the receiving vector
    * @param a vector to invert
    * @returns out
    */
  def inverse(out: vec2, a: vec2): vec2 = js.native
  def len(a: js.Array[Double]): Double = js.native
  /**
    * Calculates the length of a vec2
    *
    * @param a vector to calculate length of
    * @returns length of a
    */
  def len(a: vec2): Double = js.native
  def length(a: js.Array[Double]): Double = js.native
  /**
    * Calculates the length of a vec2
    *
    * @param a vector to calculate length of
    * @returns length of a
    */
  def length(a: vec2): Double = js.native
  def lerp(out: vec2, a: js.Array[Double], b: js.Array[Double], t: Double): vec2 = js.native
  def lerp(out: vec2, a: js.Array[Double], b: vec2, t: Double): vec2 = js.native
  def lerp(out: vec2, a: vec2, b: js.Array[Double], t: Double): vec2 = js.native
  /**
    * Performs a linear interpolation between two vec2's
    *
    * @param out the receiving vector
    * @param a the first operand
    * @param b the second operand
    * @param t interpolation amount between the two inputs
    * @returns out
    */
  def lerp(out: vec2, a: vec2, b: vec2, t: Double): vec2 = js.native
  def max(out: vec2, a: js.Array[Double], b: js.Array[Double]): vec2 = js.native
  def max(out: vec2, a: js.Array[Double], b: vec2): vec2 = js.native
  def max(out: vec2, a: vec2, b: js.Array[Double]): vec2 = js.native
  /**
    * Returns the maximum of two vec2's
    *
    * @param out the receiving vector
    * @param a the first operand
    * @param b the second operand
    * @returns out
    */
  def max(out: vec2, a: vec2, b: vec2): vec2 = js.native
  def min(out: vec2, a: js.Array[Double], b: js.Array[Double]): vec2 = js.native
  def min(out: vec2, a: js.Array[Double], b: vec2): vec2 = js.native
  def min(out: vec2, a: vec2, b: js.Array[Double]): vec2 = js.native
  /**
    * Returns the minimum of two vec2's
    *
    * @param out the receiving vector
    * @param a the first operand
    * @param b the second operand
    * @returns out
    */
  def min(out: vec2, a: vec2, b: vec2): vec2 = js.native
  def mul(out: vec2, a: js.Array[Double], b: js.Array[Double]): vec2 = js.native
  def mul(out: vec2, a: js.Array[Double], b: vec2): vec2 = js.native
  def mul(out: vec2, a: vec2, b: js.Array[Double]): vec2 = js.native
  /**
    * Multiplies two vec2's
    *
    * @param out the receiving vector
    * @param a the first operand
    * @param b the second operand
    * @returns out
    */
  def mul(out: vec2, a: vec2, b: vec2): vec2 = js.native
  def multiply(out: vec2, a: js.Array[Double], b: js.Array[Double]): vec2 = js.native
  def multiply(out: vec2, a: js.Array[Double], b: vec2): vec2 = js.native
  def multiply(out: vec2, a: vec2, b: js.Array[Double]): vec2 = js.native
  /**
    * Multiplies two vec2's
    *
    * @param out the receiving vector
    * @param a the first operand
    * @param b the second operand
    * @returns out
    */
  def multiply(out: vec2, a: vec2, b: vec2): vec2 = js.native
  def negate(out: vec2, a: js.Array[Double]): vec2 = js.native
  /**
    * Negates the components of a vec2
    *
    * @param out the receiving vector
    * @param a vector to negate
    * @returns out
    */
  def negate(out: vec2, a: vec2): vec2 = js.native
  def normalize(out: vec2, a: js.Array[Double]): vec2 = js.native
  /**
    * Normalize a vec2
    *
    * @param out the receiving vector
    * @param a vector to normalize
    * @returns out
    */
  def normalize(out: vec2, a: vec2): vec2 = js.native
  /**
    * Generates a random unit vector
    *
    * @param out the receiving vector
    * @returns out
    */
  def random(out: vec2): vec2 = js.native
  /**
    * Generates a random vector with the given scale
    *
    * @param out the receiving vector
    * @param scale Length of the resulting vector. If ommitted, a unit vector will be returned
    * @returns out
    */
  def random(out: vec2, scale: Double): vec2 = js.native
  /**
    * Rotate a 2D vector
    *
    * @param out The receiving vec2
    * @param a The vec2 point to rotate
    * @param b The origin of the rotation
    * @param c The angle of rotation
    * @returns out
    */
  def rotate(out: vec2, a: vec2, b: vec2, c: Double): vec2 = js.native
  def round(out: vec2, a: js.Array[Double]): vec2 = js.native
  /**
    * Math.round the components of a vec2
    *
    * @param {vec2} out the receiving vector
    * @param {vec2} a vector to round
    * @returns {vec2} out
    */
  def round(out: vec2, a: vec2): vec2 = js.native
  def scale(out: vec2, a: js.Array[Double], b: Double): vec2 = js.native
  /**
    * Scales a vec2 by a scalar number
    *
    * @param out the receiving vector
    * @param a the vector to scale
    * @param b amount to scale the vector by
    * @returns out
    */
  def scale(out: vec2, a: vec2, b: Double): vec2 = js.native
  def scaleAndAdd(out: vec2, a: js.Array[Double], b: js.Array[Double], scale: Double): vec2 = js.native
  def scaleAndAdd(out: vec2, a: js.Array[Double], b: vec2, scale: Double): vec2 = js.native
  def scaleAndAdd(out: vec2, a: vec2, b: js.Array[Double], scale: Double): vec2 = js.native
  /**
    * Adds two vec2's after scaling the second operand by a scalar value
    *
    * @param out the receiving vector
    * @param a the first operand
    * @param b the second operand
    * @param scale the amount to scale b by before adding
    * @returns out
    */
  def scaleAndAdd(out: vec2, a: vec2, b: vec2, scale: Double): vec2 = js.native
  /**
    * Set the components of a vec2 to the given values
    *
    * @param out the receiving vector
    * @param x X component
    * @param y Y component
    * @returns out
    */
  def set(out: vec2, x: Double, y: Double): vec2 = js.native
  def sqrDist(a: js.Array[Double], b: js.Array[Double]): Double = js.native
  def sqrDist(a: js.Array[Double], b: vec2): Double = js.native
  def sqrDist(a: vec2, b: js.Array[Double]): Double = js.native
  /**
    * Calculates the squared euclidian distance between two vec2's
    *
    * @param a the first operand
    * @param b the second operand
    * @returns squared distance between a and b
    */
  def sqrDist(a: vec2, b: vec2): Double = js.native
  def sqrLen(a: js.Array[Double]): Double = js.native
  /**
    * Calculates the squared length of a vec2
    *
    * @param a vector to calculate squared length of
    * @returns squared length of a
    */
  def sqrLen(a: vec2): Double = js.native
  def squaredDistance(a: js.Array[Double], b: js.Array[Double]): Double = js.native
  def squaredDistance(a: js.Array[Double], b: vec2): Double = js.native
  def squaredDistance(a: vec2, b: js.Array[Double]): Double = js.native
  /**
    * Calculates the squared euclidian distance between two vec2's
    *
    * @param a the first operand
    * @param b the second operand
    * @returns squared distance between a and b
    */
  def squaredDistance(a: vec2, b: vec2): Double = js.native
  def squaredLength(a: js.Array[Double]): Double = js.native
  /**
    * Calculates the squared length of a vec2
    *
    * @param a vector to calculate squared length of
    * @returns squared length of a
    */
  def squaredLength(a: vec2): Double = js.native
  def str(a: js.Array[Double]): String = js.native
  /**
    * Returns a string representation of a vector
    *
    * @param a vector to represent as a string
    * @returns string representation of the vector
    */
  def str(a: vec2): String = js.native
  def sub(out: vec2, a: js.Array[Double], b: js.Array[Double]): vec2 = js.native
  def sub(out: vec2, a: js.Array[Double], b: vec2): vec2 = js.native
  def sub(out: vec2, a: vec2, b: js.Array[Double]): vec2 = js.native
  /**
    * Subtracts vector b from vector a
    *
    * @param out the receiving vector
    * @param a the first operand
    * @param b the second operand
    * @returns out
    */
  def sub(out: vec2, a: vec2, b: vec2): vec2 = js.native
  def subtract(out: vec2, a: js.Array[Double], b: js.Array[Double]): vec2 = js.native
  def subtract(out: vec2, a: js.Array[Double], b: vec2): vec2 = js.native
  def subtract(out: vec2, a: vec2, b: js.Array[Double]): vec2 = js.native
  /**
    * Subtracts vector b from vector a
    *
    * @param out the receiving vector
    * @param a the first operand
    * @param b the second operand
    * @returns out
    */
  def subtract(out: vec2, a: vec2, b: vec2): vec2 = js.native
  def transformMat2(out: vec2, a: js.Array[Double], m: mat2): vec2 = js.native
  /**
    * Transforms the vec2 with a mat2
    *
    * @param out the receiving vector
    * @param a the vector to transform
    * @param m matrix to transform with
    * @returns out
    */
  def transformMat2(out: vec2, a: vec2, m: mat2): vec2 = js.native
  def transformMat2d(out: vec2, a: js.Array[Double], m: mat2d): vec2 = js.native
  /**
    * Transforms the vec2 with a mat2d
    *
    * @param out the receiving vector
    * @param a the vector to transform
    * @param m matrix to transform with
    * @returns out
    */
  def transformMat2d(out: vec2, a: vec2, m: mat2d): vec2 = js.native
  def transformMat3(out: vec2, a: js.Array[Double], m: mat3): vec2 = js.native
  /**
    * Transforms the vec2 with a mat3
    * 3rd vector component is implicitly '1'
    *
    * @param out the receiving vector
    * @param a the vector to transform
    * @param m matrix to transform with
    * @returns out
    */
  def transformMat3(out: vec2, a: vec2, m: mat3): vec2 = js.native
  def transformMat4(out: vec2, a: js.Array[Double], m: mat4): vec2 = js.native
  /**
    * Transforms the vec2 with a mat4
    * 3rd vector component is implicitly '0'
    * 4th vector component is implicitly '1'
    *
    * @param out the receiving vector
    * @param a the vector to transform
    * @param m matrix to transform with
    * @returns out
    */
  def transformMat4(out: vec2, a: vec2, m: mat4): vec2 = js.native
}

