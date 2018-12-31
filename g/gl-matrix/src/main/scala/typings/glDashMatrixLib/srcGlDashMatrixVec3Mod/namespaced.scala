package typings
package glDashMatrixLib.srcGlDashMatrixVec3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gl-matrix/src/gl-matrix/vec3", JSImport.Namespace)
@js.native
class namespaced ()
  extends glDashMatrixLib.glDashMatrixMod.vec3

@JSImport("gl-matrix/src/gl-matrix/vec3", JSImport.Namespace)
@js.native
object namespaced extends js.Object {
  /**
    * Adds two vec3's
    *
    * @param out the receiving vector
    * @param a the first operand
    * @param b the second operand
    * @returns out
    */
  def add(
    out: glDashMatrixLib.glDashMatrixMod.vec3,
    a: glDashMatrixLib.glDashMatrixMod.vec3,
    b: glDashMatrixLib.glDashMatrixMod.vec3
  ): glDashMatrixLib.glDashMatrixMod.vec3 = js.native
  def add(
    out: glDashMatrixLib.glDashMatrixMod.vec3,
    a: glDashMatrixLib.glDashMatrixMod.vec3,
    b: js.Array[scala.Double]
  ): glDashMatrixLib.glDashMatrixMod.vec3 = js.native
  def add(
    out: glDashMatrixLib.glDashMatrixMod.vec3,
    a: js.Array[scala.Double],
    b: glDashMatrixLib.glDashMatrixMod.vec3
  ): glDashMatrixLib.glDashMatrixMod.vec3 = js.native
  def add(out: glDashMatrixLib.glDashMatrixMod.vec3, a: js.Array[scala.Double], b: js.Array[scala.Double]): glDashMatrixLib.glDashMatrixMod.vec3 = js.native
  /**
    * Get the angle between two 3D vectors
    * @param a The first operand
    * @param b The second operand
    * @returns The angle in radians
    */
  def angle(a: glDashMatrixLib.glDashMatrixMod.vec3, b: glDashMatrixLib.glDashMatrixMod.vec3): scala.Double = js.native
  def angle(a: glDashMatrixLib.glDashMatrixMod.vec3, b: js.Array[scala.Double]): scala.Double = js.native
  def angle(a: js.Array[scala.Double], b: glDashMatrixLib.glDashMatrixMod.vec3): scala.Double = js.native
  def angle(a: js.Array[scala.Double], b: js.Array[scala.Double]): scala.Double = js.native
  /**
    * Performs a bezier interpolation with two control points
    *
    * @param {vec3} out the receiving vector
    * @param {vec3} a the first operand
    * @param {vec3} b the second operand
    * @param {vec3} c the third operand
    * @param {vec3} d the fourth operand
    * @param {number} t interpolation amount between the two inputs
    * @returns {vec3} out
    */
  def bezier(
    out: glDashMatrixLib.glDashMatrixMod.vec3,
    a: glDashMatrixLib.glDashMatrixMod.vec3,
    b: glDashMatrixLib.glDashMatrixMod.vec3,
    c: glDashMatrixLib.glDashMatrixMod.vec3,
    d: glDashMatrixLib.glDashMatrixMod.vec3,
    t: scala.Double
  ): glDashMatrixLib.glDashMatrixMod.vec3 = js.native
  def bezier(
    out: glDashMatrixLib.glDashMatrixMod.vec3,
    a: glDashMatrixLib.glDashMatrixMod.vec3,
    b: glDashMatrixLib.glDashMatrixMod.vec3,
    c: glDashMatrixLib.glDashMatrixMod.vec3,
    d: js.Array[scala.Double],
    t: scala.Double
  ): glDashMatrixLib.glDashMatrixMod.vec3 = js.native
  def bezier(
    out: glDashMatrixLib.glDashMatrixMod.vec3,
    a: glDashMatrixLib.glDashMatrixMod.vec3,
    b: glDashMatrixLib.glDashMatrixMod.vec3,
    c: js.Array[scala.Double],
    d: glDashMatrixLib.glDashMatrixMod.vec3,
    t: scala.Double
  ): glDashMatrixLib.glDashMatrixMod.vec3 = js.native
  def bezier(
    out: glDashMatrixLib.glDashMatrixMod.vec3,
    a: glDashMatrixLib.glDashMatrixMod.vec3,
    b: glDashMatrixLib.glDashMatrixMod.vec3,
    c: js.Array[scala.Double],
    d: js.Array[scala.Double],
    t: scala.Double
  ): glDashMatrixLib.glDashMatrixMod.vec3 = js.native
  def bezier(
    out: glDashMatrixLib.glDashMatrixMod.vec3,
    a: glDashMatrixLib.glDashMatrixMod.vec3,
    b: js.Array[scala.Double],
    c: glDashMatrixLib.glDashMatrixMod.vec3,
    d: glDashMatrixLib.glDashMatrixMod.vec3,
    t: scala.Double
  ): glDashMatrixLib.glDashMatrixMod.vec3 = js.native
  def bezier(
    out: glDashMatrixLib.glDashMatrixMod.vec3,
    a: glDashMatrixLib.glDashMatrixMod.vec3,
    b: js.Array[scala.Double],
    c: glDashMatrixLib.glDashMatrixMod.vec3,
    d: js.Array[scala.Double],
    t: scala.Double
  ): glDashMatrixLib.glDashMatrixMod.vec3 = js.native
  def bezier(
    out: glDashMatrixLib.glDashMatrixMod.vec3,
    a: glDashMatrixLib.glDashMatrixMod.vec3,
    b: js.Array[scala.Double],
    c: js.Array[scala.Double],
    d: glDashMatrixLib.glDashMatrixMod.vec3,
    t: scala.Double
  ): glDashMatrixLib.glDashMatrixMod.vec3 = js.native
  def bezier(
    out: glDashMatrixLib.glDashMatrixMod.vec3,
    a: glDashMatrixLib.glDashMatrixMod.vec3,
    b: js.Array[scala.Double],
    c: js.Array[scala.Double],
    d: js.Array[scala.Double],
    t: scala.Double
  ): glDashMatrixLib.glDashMatrixMod.vec3 = js.native
  def bezier(
    out: glDashMatrixLib.glDashMatrixMod.vec3,
    a: js.Array[scala.Double],
    b: glDashMatrixLib.glDashMatrixMod.vec3,
    c: glDashMatrixLib.glDashMatrixMod.vec3,
    d: glDashMatrixLib.glDashMatrixMod.vec3,
    t: scala.Double
  ): glDashMatrixLib.glDashMatrixMod.vec3 = js.native
  def bezier(
    out: glDashMatrixLib.glDashMatrixMod.vec3,
    a: js.Array[scala.Double],
    b: glDashMatrixLib.glDashMatrixMod.vec3,
    c: glDashMatrixLib.glDashMatrixMod.vec3,
    d: js.Array[scala.Double],
    t: scala.Double
  ): glDashMatrixLib.glDashMatrixMod.vec3 = js.native
  def bezier(
    out: glDashMatrixLib.glDashMatrixMod.vec3,
    a: js.Array[scala.Double],
    b: glDashMatrixLib.glDashMatrixMod.vec3,
    c: js.Array[scala.Double],
    d: glDashMatrixLib.glDashMatrixMod.vec3,
    t: scala.Double
  ): glDashMatrixLib.glDashMatrixMod.vec3 = js.native
  def bezier(
    out: glDashMatrixLib.glDashMatrixMod.vec3,
    a: js.Array[scala.Double],
    b: glDashMatrixLib.glDashMatrixMod.vec3,
    c: js.Array[scala.Double],
    d: js.Array[scala.Double],
    t: scala.Double
  ): glDashMatrixLib.glDashMatrixMod.vec3 = js.native
  def bezier(
    out: glDashMatrixLib.glDashMatrixMod.vec3,
    a: js.Array[scala.Double],
    b: js.Array[scala.Double],
    c: glDashMatrixLib.glDashMatrixMod.vec3,
    d: glDashMatrixLib.glDashMatrixMod.vec3,
    t: scala.Double
  ): glDashMatrixLib.glDashMatrixMod.vec3 = js.native
  def bezier(
    out: glDashMatrixLib.glDashMatrixMod.vec3,
    a: js.Array[scala.Double],
    b: js.Array[scala.Double],
    c: glDashMatrixLib.glDashMatrixMod.vec3,
    d: js.Array[scala.Double],
    t: scala.Double
  ): glDashMatrixLib.glDashMatrixMod.vec3 = js.native
  def bezier(
    out: glDashMatrixLib.glDashMatrixMod.vec3,
    a: js.Array[scala.Double],
    b: js.Array[scala.Double],
    c: js.Array[scala.Double],
    d: glDashMatrixLib.glDashMatrixMod.vec3,
    t: scala.Double
  ): glDashMatrixLib.glDashMatrixMod.vec3 = js.native
  def bezier(
    out: glDashMatrixLib.glDashMatrixMod.vec3,
    a: js.Array[scala.Double],
    b: js.Array[scala.Double],
    c: js.Array[scala.Double],
    d: js.Array[scala.Double],
    t: scala.Double
  ): glDashMatrixLib.glDashMatrixMod.vec3 = js.native
  /**
    * Math.ceil the components of a vec3
    *
    * @param {vec3} out the receiving vector
    * @param {vec3} a vector to ceil
    * @returns {vec3} out
    */
  def ceil(out: glDashMatrixLib.glDashMatrixMod.vec3, a: glDashMatrixLib.glDashMatrixMod.vec3): glDashMatrixLib.glDashMatrixMod.vec3 = js.native
  def ceil(out: glDashMatrixLib.glDashMatrixMod.vec3, a: js.Array[scala.Double]): glDashMatrixLib.glDashMatrixMod.vec3 = js.native
  /**
    * Creates a new vec3 initialized with values from an existing vector
    *
    * @param a vector to clone
    * @returns a new 3D vector
    */
  def clone(a: glDashMatrixLib.glDashMatrixMod.vec3): glDashMatrixLib.glDashMatrixMod.vec3 = js.native
  def clone(a: js.Array[scala.Double]): glDashMatrixLib.glDashMatrixMod.vec3 = js.native
  /**
    * Copy the values from one vec3 to another
    *
    * @param out the receiving vector
    * @param a the source vector
    * @returns out
    */
  def copy(out: glDashMatrixLib.glDashMatrixMod.vec3, a: glDashMatrixLib.glDashMatrixMod.vec3): glDashMatrixLib.glDashMatrixMod.vec3 = js.native
  def copy(out: glDashMatrixLib.glDashMatrixMod.vec3, a: js.Array[scala.Double]): glDashMatrixLib.glDashMatrixMod.vec3 = js.native
  /**
    * Creates a new, empty vec3
    *
    * @returns a new 3D vector
    */
  def create(): glDashMatrixLib.glDashMatrixMod.vec3 = js.native
  /**
    * Computes the cross product of two vec3's
    *
    * @param out the receiving vector
    * @param a the first operand
    * @param b the second operand
    * @returns out
    */
  def cross(
    out: glDashMatrixLib.glDashMatrixMod.vec3,
    a: glDashMatrixLib.glDashMatrixMod.vec3,
    b: glDashMatrixLib.glDashMatrixMod.vec3
  ): glDashMatrixLib.glDashMatrixMod.vec3 = js.native
  def cross(
    out: glDashMatrixLib.glDashMatrixMod.vec3,
    a: glDashMatrixLib.glDashMatrixMod.vec3,
    b: js.Array[scala.Double]
  ): glDashMatrixLib.glDashMatrixMod.vec3 = js.native
  def cross(
    out: glDashMatrixLib.glDashMatrixMod.vec3,
    a: js.Array[scala.Double],
    b: glDashMatrixLib.glDashMatrixMod.vec3
  ): glDashMatrixLib.glDashMatrixMod.vec3 = js.native
  def cross(out: glDashMatrixLib.glDashMatrixMod.vec3, a: js.Array[scala.Double], b: js.Array[scala.Double]): glDashMatrixLib.glDashMatrixMod.vec3 = js.native
  /**
    * Calculates the euclidian distance between two vec3's
    *
    * @param a the first operand
    * @param b the second operand
    * @returns distance between a and b
    */
  def dist(a: glDashMatrixLib.glDashMatrixMod.vec3, b: glDashMatrixLib.glDashMatrixMod.vec3): scala.Double = js.native
  def dist(a: glDashMatrixLib.glDashMatrixMod.vec3, b: js.Array[scala.Double]): scala.Double = js.native
  def dist(a: js.Array[scala.Double], b: glDashMatrixLib.glDashMatrixMod.vec3): scala.Double = js.native
  def dist(a: js.Array[scala.Double], b: js.Array[scala.Double]): scala.Double = js.native
  /**
    * Calculates the euclidian distance between two vec3's
    *
    * @param a the first operand
    * @param b the second operand
    * @returns distance between a and b
    */
  def distance(a: glDashMatrixLib.glDashMatrixMod.vec3, b: glDashMatrixLib.glDashMatrixMod.vec3): scala.Double = js.native
  def distance(a: glDashMatrixLib.glDashMatrixMod.vec3, b: js.Array[scala.Double]): scala.Double = js.native
  def distance(a: js.Array[scala.Double], b: glDashMatrixLib.glDashMatrixMod.vec3): scala.Double = js.native
  def distance(a: js.Array[scala.Double], b: js.Array[scala.Double]): scala.Double = js.native
  /**
    * Divides two vec3's
    *
    * @param out the receiving vector
    * @param a the first operand
    * @param b the second operand
    * @returns out
    */
  def div(
    out: glDashMatrixLib.glDashMatrixMod.vec3,
    a: glDashMatrixLib.glDashMatrixMod.vec3,
    b: glDashMatrixLib.glDashMatrixMod.vec3
  ): glDashMatrixLib.glDashMatrixMod.vec3 = js.native
  def div(
    out: glDashMatrixLib.glDashMatrixMod.vec3,
    a: glDashMatrixLib.glDashMatrixMod.vec3,
    b: js.Array[scala.Double]
  ): glDashMatrixLib.glDashMatrixMod.vec3 = js.native
  def div(
    out: glDashMatrixLib.glDashMatrixMod.vec3,
    a: js.Array[scala.Double],
    b: glDashMatrixLib.glDashMatrixMod.vec3
  ): glDashMatrixLib.glDashMatrixMod.vec3 = js.native
  def div(out: glDashMatrixLib.glDashMatrixMod.vec3, a: js.Array[scala.Double], b: js.Array[scala.Double]): glDashMatrixLib.glDashMatrixMod.vec3 = js.native
  /**
    * Divides two vec3's
    *
    * @param out the receiving vector
    * @param a the first operand
    * @param b the second operand
    * @returns out
    */
  def divide(
    out: glDashMatrixLib.glDashMatrixMod.vec3,
    a: glDashMatrixLib.glDashMatrixMod.vec3,
    b: glDashMatrixLib.glDashMatrixMod.vec3
  ): glDashMatrixLib.glDashMatrixMod.vec3 = js.native
  def divide(
    out: glDashMatrixLib.glDashMatrixMod.vec3,
    a: glDashMatrixLib.glDashMatrixMod.vec3,
    b: js.Array[scala.Double]
  ): glDashMatrixLib.glDashMatrixMod.vec3 = js.native
  def divide(
    out: glDashMatrixLib.glDashMatrixMod.vec3,
    a: js.Array[scala.Double],
    b: glDashMatrixLib.glDashMatrixMod.vec3
  ): glDashMatrixLib.glDashMatrixMod.vec3 = js.native
  def divide(out: glDashMatrixLib.glDashMatrixMod.vec3, a: js.Array[scala.Double], b: js.Array[scala.Double]): glDashMatrixLib.glDashMatrixMod.vec3 = js.native
  /**
    * Calculates the dot product of two vec3's
    *
    * @param a the first operand
    * @param b the second operand
    * @returns dot product of a and b
    */
  def dot(a: glDashMatrixLib.glDashMatrixMod.vec3, b: glDashMatrixLib.glDashMatrixMod.vec3): scala.Double = js.native
  def dot(a: glDashMatrixLib.glDashMatrixMod.vec3, b: js.Array[scala.Double]): scala.Double = js.native
  def dot(a: js.Array[scala.Double], b: glDashMatrixLib.glDashMatrixMod.vec3): scala.Double = js.native
  def dot(a: js.Array[scala.Double], b: js.Array[scala.Double]): scala.Double = js.native
  /**
    * Returns whether or not the vectors have approximately the same elements in the same position.
    *
    * @param {vec3} a The first vector.
    * @param {vec3} b The second vector.
    * @returns {boolean} True if the vectors are equal, false otherwise.
    */
  def equals(a: glDashMatrixLib.glDashMatrixMod.vec3, b: glDashMatrixLib.glDashMatrixMod.vec3): scala.Boolean = js.native
  def equals(a: glDashMatrixLib.glDashMatrixMod.vec3, b: js.Array[scala.Double]): scala.Boolean = js.native
  def equals(a: js.Array[scala.Double], b: glDashMatrixLib.glDashMatrixMod.vec3): scala.Boolean = js.native
  def equals(a: js.Array[scala.Double], b: js.Array[scala.Double]): scala.Boolean = js.native
  /**
    * Returns whether or not the vectors have exactly the same elements in the same position (when compared with ===)
    *
    * @param {vec3} a The first vector.
    * @param {vec3} b The second vector.
    * @returns {boolean} True if the vectors are equal, false otherwise.
    */
  def exactEquals(a: glDashMatrixLib.glDashMatrixMod.vec3, b: glDashMatrixLib.glDashMatrixMod.vec3): scala.Boolean = js.native
  def exactEquals(a: glDashMatrixLib.glDashMatrixMod.vec3, b: js.Array[scala.Double]): scala.Boolean = js.native
  def exactEquals(a: js.Array[scala.Double], b: glDashMatrixLib.glDashMatrixMod.vec3): scala.Boolean = js.native
  def exactEquals(a: js.Array[scala.Double], b: js.Array[scala.Double]): scala.Boolean = js.native
  /**
    * Math.floor the components of a vec3
    *
    * @param {vec3} out the receiving vector
    * @param {vec3} a vector to floor
    * @returns {vec3} out
    */
  def floor(out: glDashMatrixLib.glDashMatrixMod.vec3, a: glDashMatrixLib.glDashMatrixMod.vec3): glDashMatrixLib.glDashMatrixMod.vec3 = js.native
  def floor(out: glDashMatrixLib.glDashMatrixMod.vec3, a: js.Array[scala.Double]): glDashMatrixLib.glDashMatrixMod.vec3 = js.native
  /**
    * Perform some operation over an array of vec3s.
    *
    * @param a the array of vectors to iterate over
    * @param stride Number of elements between the start of each vec3. If 0 assumes tightly packed
    * @param offset Number of elements to skip at the beginning of the array
    * @param count Number of vec3s to iterate over. If 0 iterates over entire array
    * @param fn Function to call for each vector in the array
    * @returns a
    * @function
    */
  def forEach(
    a: stdLib.Float32Array,
    stride: scala.Double,
    offset: scala.Double,
    count: scala.Double,
    fn: js.Function2[
      /* a */ glDashMatrixLib.glDashMatrixMod.vec3 | js.Array[scala.Double], 
      /* b */ glDashMatrixLib.glDashMatrixMod.vec3 | js.Array[scala.Double], 
      scala.Unit
    ]
  ): stdLib.Float32Array = js.native
  /**
    * Perform some operation over an array of vec3s.
    *
    * @param a the array of vectors to iterate over
    * @param stride Number of elements between the start of each vec3. If 0 assumes tightly packed
    * @param offset Number of elements to skip at the beginning of the array
    * @param count Number of vec3s to iterate over. If 0 iterates over entire array
    * @param fn Function to call for each vector in the array
    * @param arg additional argument to pass to fn
    * @returns a
    * @function
    */
  def forEach(
    a: stdLib.Float32Array,
    stride: scala.Double,
    offset: scala.Double,
    count: scala.Double,
    fn: js.Function3[
      /* a */ glDashMatrixLib.glDashMatrixMod.vec3 | js.Array[scala.Double], 
      /* b */ glDashMatrixLib.glDashMatrixMod.vec3 | js.Array[scala.Double], 
      /* arg */ js.Any, 
      scala.Unit
    ],
    arg: js.Any
  ): stdLib.Float32Array = js.native
  /**
    * Creates a new vec3 initialized with the given values
    *
    * @param x X component
    * @param y Y component
    * @param z Z component
    * @returns a new 3D vector
    */
  def fromValues(x: scala.Double, y: scala.Double, z: scala.Double): glDashMatrixLib.glDashMatrixMod.vec3 = js.native
  /**
    * Performs a hermite interpolation with two control points
    *
    * @param {vec3} out the receiving vector
    * @param {vec3} a the first operand
    * @param {vec3} b the second operand
    * @param {vec3} c the third operand
    * @param {vec3} d the fourth operand
    * @param {number} t interpolation amount between the two inputs
    * @returns {vec3} out
    */
  def hermite(
    out: glDashMatrixLib.glDashMatrixMod.vec3,
    a: glDashMatrixLib.glDashMatrixMod.vec3,
    b: glDashMatrixLib.glDashMatrixMod.vec3,
    c: glDashMatrixLib.glDashMatrixMod.vec3,
    d: glDashMatrixLib.glDashMatrixMod.vec3,
    t: scala.Double
  ): glDashMatrixLib.glDashMatrixMod.vec3 = js.native
  def hermite(
    out: glDashMatrixLib.glDashMatrixMod.vec3,
    a: glDashMatrixLib.glDashMatrixMod.vec3,
    b: glDashMatrixLib.glDashMatrixMod.vec3,
    c: glDashMatrixLib.glDashMatrixMod.vec3,
    d: js.Array[scala.Double],
    t: scala.Double
  ): glDashMatrixLib.glDashMatrixMod.vec3 = js.native
  def hermite(
    out: glDashMatrixLib.glDashMatrixMod.vec3,
    a: glDashMatrixLib.glDashMatrixMod.vec3,
    b: glDashMatrixLib.glDashMatrixMod.vec3,
    c: js.Array[scala.Double],
    d: glDashMatrixLib.glDashMatrixMod.vec3,
    t: scala.Double
  ): glDashMatrixLib.glDashMatrixMod.vec3 = js.native
  def hermite(
    out: glDashMatrixLib.glDashMatrixMod.vec3,
    a: glDashMatrixLib.glDashMatrixMod.vec3,
    b: glDashMatrixLib.glDashMatrixMod.vec3,
    c: js.Array[scala.Double],
    d: js.Array[scala.Double],
    t: scala.Double
  ): glDashMatrixLib.glDashMatrixMod.vec3 = js.native
  def hermite(
    out: glDashMatrixLib.glDashMatrixMod.vec3,
    a: glDashMatrixLib.glDashMatrixMod.vec3,
    b: js.Array[scala.Double],
    c: glDashMatrixLib.glDashMatrixMod.vec3,
    d: glDashMatrixLib.glDashMatrixMod.vec3,
    t: scala.Double
  ): glDashMatrixLib.glDashMatrixMod.vec3 = js.native
  def hermite(
    out: glDashMatrixLib.glDashMatrixMod.vec3,
    a: glDashMatrixLib.glDashMatrixMod.vec3,
    b: js.Array[scala.Double],
    c: glDashMatrixLib.glDashMatrixMod.vec3,
    d: js.Array[scala.Double],
    t: scala.Double
  ): glDashMatrixLib.glDashMatrixMod.vec3 = js.native
  def hermite(
    out: glDashMatrixLib.glDashMatrixMod.vec3,
    a: glDashMatrixLib.glDashMatrixMod.vec3,
    b: js.Array[scala.Double],
    c: js.Array[scala.Double],
    d: glDashMatrixLib.glDashMatrixMod.vec3,
    t: scala.Double
  ): glDashMatrixLib.glDashMatrixMod.vec3 = js.native
  def hermite(
    out: glDashMatrixLib.glDashMatrixMod.vec3,
    a: glDashMatrixLib.glDashMatrixMod.vec3,
    b: js.Array[scala.Double],
    c: js.Array[scala.Double],
    d: js.Array[scala.Double],
    t: scala.Double
  ): glDashMatrixLib.glDashMatrixMod.vec3 = js.native
  def hermite(
    out: glDashMatrixLib.glDashMatrixMod.vec3,
    a: js.Array[scala.Double],
    b: glDashMatrixLib.glDashMatrixMod.vec3,
    c: glDashMatrixLib.glDashMatrixMod.vec3,
    d: glDashMatrixLib.glDashMatrixMod.vec3,
    t: scala.Double
  ): glDashMatrixLib.glDashMatrixMod.vec3 = js.native
  def hermite(
    out: glDashMatrixLib.glDashMatrixMod.vec3,
    a: js.Array[scala.Double],
    b: glDashMatrixLib.glDashMatrixMod.vec3,
    c: glDashMatrixLib.glDashMatrixMod.vec3,
    d: js.Array[scala.Double],
    t: scala.Double
  ): glDashMatrixLib.glDashMatrixMod.vec3 = js.native
  def hermite(
    out: glDashMatrixLib.glDashMatrixMod.vec3,
    a: js.Array[scala.Double],
    b: glDashMatrixLib.glDashMatrixMod.vec3,
    c: js.Array[scala.Double],
    d: glDashMatrixLib.glDashMatrixMod.vec3,
    t: scala.Double
  ): glDashMatrixLib.glDashMatrixMod.vec3 = js.native
  def hermite(
    out: glDashMatrixLib.glDashMatrixMod.vec3,
    a: js.Array[scala.Double],
    b: glDashMatrixLib.glDashMatrixMod.vec3,
    c: js.Array[scala.Double],
    d: js.Array[scala.Double],
    t: scala.Double
  ): glDashMatrixLib.glDashMatrixMod.vec3 = js.native
  def hermite(
    out: glDashMatrixLib.glDashMatrixMod.vec3,
    a: js.Array[scala.Double],
    b: js.Array[scala.Double],
    c: glDashMatrixLib.glDashMatrixMod.vec3,
    d: glDashMatrixLib.glDashMatrixMod.vec3,
    t: scala.Double
  ): glDashMatrixLib.glDashMatrixMod.vec3 = js.native
  def hermite(
    out: glDashMatrixLib.glDashMatrixMod.vec3,
    a: js.Array[scala.Double],
    b: js.Array[scala.Double],
    c: glDashMatrixLib.glDashMatrixMod.vec3,
    d: js.Array[scala.Double],
    t: scala.Double
  ): glDashMatrixLib.glDashMatrixMod.vec3 = js.native
  def hermite(
    out: glDashMatrixLib.glDashMatrixMod.vec3,
    a: js.Array[scala.Double],
    b: js.Array[scala.Double],
    c: js.Array[scala.Double],
    d: glDashMatrixLib.glDashMatrixMod.vec3,
    t: scala.Double
  ): glDashMatrixLib.glDashMatrixMod.vec3 = js.native
  def hermite(
    out: glDashMatrixLib.glDashMatrixMod.vec3,
    a: js.Array[scala.Double],
    b: js.Array[scala.Double],
    c: js.Array[scala.Double],
    d: js.Array[scala.Double],
    t: scala.Double
  ): glDashMatrixLib.glDashMatrixMod.vec3 = js.native
  /**
    * Returns the inverse of the components of a vec3
    *
    * @param out the receiving vector
    * @param a vector to invert
    * @returns out
    */
  def inverse(out: glDashMatrixLib.glDashMatrixMod.vec3, a: glDashMatrixLib.glDashMatrixMod.vec3): glDashMatrixLib.glDashMatrixMod.vec3 = js.native
  def inverse(out: glDashMatrixLib.glDashMatrixMod.vec3, a: js.Array[scala.Double]): glDashMatrixLib.glDashMatrixMod.vec3 = js.native
  /**
    * Calculates the length of a vec3
    *
    * @param a vector to calculate length of
    * @returns length of a
    */
  def len(a: glDashMatrixLib.glDashMatrixMod.vec3): scala.Double = js.native
  def len(a: js.Array[scala.Double]): scala.Double = js.native
  /**
    * Calculates the length of a vec3
    *
    * @param a vector to calculate length of
    * @returns length of a
    */
  def length(a: glDashMatrixLib.glDashMatrixMod.vec3): scala.Double = js.native
  def length(a: js.Array[scala.Double]): scala.Double = js.native
  /**
    * Performs a linear interpolation between two vec3's
    *
    * @param out the receiving vector
    * @param a the first operand
    * @param b the second operand
    * @param t interpolation amount between the two inputs
    * @returns out
    */
  def lerp(
    out: glDashMatrixLib.glDashMatrixMod.vec3,
    a: glDashMatrixLib.glDashMatrixMod.vec3,
    b: glDashMatrixLib.glDashMatrixMod.vec3,
    t: scala.Double
  ): glDashMatrixLib.glDashMatrixMod.vec3 = js.native
  def lerp(
    out: glDashMatrixLib.glDashMatrixMod.vec3,
    a: glDashMatrixLib.glDashMatrixMod.vec3,
    b: js.Array[scala.Double],
    t: scala.Double
  ): glDashMatrixLib.glDashMatrixMod.vec3 = js.native
  def lerp(
    out: glDashMatrixLib.glDashMatrixMod.vec3,
    a: js.Array[scala.Double],
    b: glDashMatrixLib.glDashMatrixMod.vec3,
    t: scala.Double
  ): glDashMatrixLib.glDashMatrixMod.vec3 = js.native
  def lerp(
    out: glDashMatrixLib.glDashMatrixMod.vec3,
    a: js.Array[scala.Double],
    b: js.Array[scala.Double],
    t: scala.Double
  ): glDashMatrixLib.glDashMatrixMod.vec3 = js.native
  /**
    * Returns the maximum of two vec3's
    *
    * @param out the receiving vector
    * @param a the first operand
    * @param b the second operand
    * @returns out
    */
  def max(
    out: glDashMatrixLib.glDashMatrixMod.vec3,
    a: glDashMatrixLib.glDashMatrixMod.vec3,
    b: glDashMatrixLib.glDashMatrixMod.vec3
  ): glDashMatrixLib.glDashMatrixMod.vec3 = js.native
  def max(
    out: glDashMatrixLib.glDashMatrixMod.vec3,
    a: glDashMatrixLib.glDashMatrixMod.vec3,
    b: js.Array[scala.Double]
  ): glDashMatrixLib.glDashMatrixMod.vec3 = js.native
  def max(
    out: glDashMatrixLib.glDashMatrixMod.vec3,
    a: js.Array[scala.Double],
    b: glDashMatrixLib.glDashMatrixMod.vec3
  ): glDashMatrixLib.glDashMatrixMod.vec3 = js.native
  def max(out: glDashMatrixLib.glDashMatrixMod.vec3, a: js.Array[scala.Double], b: js.Array[scala.Double]): glDashMatrixLib.glDashMatrixMod.vec3 = js.native
  /**
    * Returns the minimum of two vec3's
    *
    * @param out the receiving vector
    * @param a the first operand
    * @param b the second operand
    * @returns out
    */
  def min(
    out: glDashMatrixLib.glDashMatrixMod.vec3,
    a: glDashMatrixLib.glDashMatrixMod.vec3,
    b: glDashMatrixLib.glDashMatrixMod.vec3
  ): glDashMatrixLib.glDashMatrixMod.vec3 = js.native
  def min(
    out: glDashMatrixLib.glDashMatrixMod.vec3,
    a: glDashMatrixLib.glDashMatrixMod.vec3,
    b: js.Array[scala.Double]
  ): glDashMatrixLib.glDashMatrixMod.vec3 = js.native
  def min(
    out: glDashMatrixLib.glDashMatrixMod.vec3,
    a: js.Array[scala.Double],
    b: glDashMatrixLib.glDashMatrixMod.vec3
  ): glDashMatrixLib.glDashMatrixMod.vec3 = js.native
  def min(out: glDashMatrixLib.glDashMatrixMod.vec3, a: js.Array[scala.Double], b: js.Array[scala.Double]): glDashMatrixLib.glDashMatrixMod.vec3 = js.native
  /**
    * Multiplies two vec3's
    *
    * @param out the receiving vector
    * @param a the first operand
    * @param b the second operand
    * @returns out
    */
  def mul(
    out: glDashMatrixLib.glDashMatrixMod.vec3,
    a: glDashMatrixLib.glDashMatrixMod.vec3,
    b: glDashMatrixLib.glDashMatrixMod.vec3
  ): glDashMatrixLib.glDashMatrixMod.vec3 = js.native
  def mul(
    out: glDashMatrixLib.glDashMatrixMod.vec3,
    a: glDashMatrixLib.glDashMatrixMod.vec3,
    b: js.Array[scala.Double]
  ): glDashMatrixLib.glDashMatrixMod.vec3 = js.native
  def mul(
    out: glDashMatrixLib.glDashMatrixMod.vec3,
    a: js.Array[scala.Double],
    b: glDashMatrixLib.glDashMatrixMod.vec3
  ): glDashMatrixLib.glDashMatrixMod.vec3 = js.native
  def mul(out: glDashMatrixLib.glDashMatrixMod.vec3, a: js.Array[scala.Double], b: js.Array[scala.Double]): glDashMatrixLib.glDashMatrixMod.vec3 = js.native
  /**
    * Multiplies two vec3's
    *
    * @param out the receiving vector
    * @param a the first operand
    * @param b the second operand
    * @returns out
    */
  def multiply(
    out: glDashMatrixLib.glDashMatrixMod.vec3,
    a: glDashMatrixLib.glDashMatrixMod.vec3,
    b: glDashMatrixLib.glDashMatrixMod.vec3
  ): glDashMatrixLib.glDashMatrixMod.vec3 = js.native
  def multiply(
    out: glDashMatrixLib.glDashMatrixMod.vec3,
    a: glDashMatrixLib.glDashMatrixMod.vec3,
    b: js.Array[scala.Double]
  ): glDashMatrixLib.glDashMatrixMod.vec3 = js.native
  def multiply(
    out: glDashMatrixLib.glDashMatrixMod.vec3,
    a: js.Array[scala.Double],
    b: glDashMatrixLib.glDashMatrixMod.vec3
  ): glDashMatrixLib.glDashMatrixMod.vec3 = js.native
  def multiply(out: glDashMatrixLib.glDashMatrixMod.vec3, a: js.Array[scala.Double], b: js.Array[scala.Double]): glDashMatrixLib.glDashMatrixMod.vec3 = js.native
  /**
    * Negates the components of a vec3
    *
    * @param out the receiving vector
    * @param a vector to negate
    * @returns out
    */
  def negate(out: glDashMatrixLib.glDashMatrixMod.vec3, a: glDashMatrixLib.glDashMatrixMod.vec3): glDashMatrixLib.glDashMatrixMod.vec3 = js.native
  def negate(out: glDashMatrixLib.glDashMatrixMod.vec3, a: js.Array[scala.Double]): glDashMatrixLib.glDashMatrixMod.vec3 = js.native
  /**
    * Normalize a vec3
    *
    * @param out the receiving vector
    * @param a vector to normalize
    * @returns out
    */
  def normalize(out: glDashMatrixLib.glDashMatrixMod.vec3, a: glDashMatrixLib.glDashMatrixMod.vec3): glDashMatrixLib.glDashMatrixMod.vec3 = js.native
  def normalize(out: glDashMatrixLib.glDashMatrixMod.vec3, a: js.Array[scala.Double]): glDashMatrixLib.glDashMatrixMod.vec3 = js.native
  /**
    * Generates a random unit vector
    *
    * @param out the receiving vector
    * @returns out
    */
  def random(out: glDashMatrixLib.glDashMatrixMod.vec3): glDashMatrixLib.glDashMatrixMod.vec3 = js.native
  /**
    * Generates a random vector with the given scale
    *
    * @param out the receiving vector
    * @param [scale] Length of the resulting vector. If omitted, a unit vector will be returned
    * @returns out
    */
  def random(out: glDashMatrixLib.glDashMatrixMod.vec3, scale: scala.Double): glDashMatrixLib.glDashMatrixMod.vec3 = js.native
  /**
    * Rotate a 3D vector around the x-axis
    * @param out The receiving vec3
    * @param a The vec3 point to rotate
    * @param b The origin of the rotation
    * @param c The angle of rotation
    * @returns out
    */
  def rotateX(
    out: glDashMatrixLib.glDashMatrixMod.vec3,
    a: glDashMatrixLib.glDashMatrixMod.vec3,
    b: glDashMatrixLib.glDashMatrixMod.vec3,
    c: scala.Double
  ): glDashMatrixLib.glDashMatrixMod.vec3 = js.native
  def rotateX(
    out: glDashMatrixLib.glDashMatrixMod.vec3,
    a: glDashMatrixLib.glDashMatrixMod.vec3,
    b: js.Array[scala.Double],
    c: scala.Double
  ): glDashMatrixLib.glDashMatrixMod.vec3 = js.native
  def rotateX(
    out: glDashMatrixLib.glDashMatrixMod.vec3,
    a: js.Array[scala.Double],
    b: glDashMatrixLib.glDashMatrixMod.vec3,
    c: scala.Double
  ): glDashMatrixLib.glDashMatrixMod.vec3 = js.native
  def rotateX(
    out: glDashMatrixLib.glDashMatrixMod.vec3,
    a: js.Array[scala.Double],
    b: js.Array[scala.Double],
    c: scala.Double
  ): glDashMatrixLib.glDashMatrixMod.vec3 = js.native
  /**
    * Rotate a 3D vector around the y-axis
    * @param out The receiving vec3
    * @param a The vec3 point to rotate
    * @param b The origin of the rotation
    * @param c The angle of rotation
    * @returns out
    */
  def rotateY(
    out: glDashMatrixLib.glDashMatrixMod.vec3,
    a: glDashMatrixLib.glDashMatrixMod.vec3,
    b: glDashMatrixLib.glDashMatrixMod.vec3,
    c: scala.Double
  ): glDashMatrixLib.glDashMatrixMod.vec3 = js.native
  def rotateY(
    out: glDashMatrixLib.glDashMatrixMod.vec3,
    a: glDashMatrixLib.glDashMatrixMod.vec3,
    b: js.Array[scala.Double],
    c: scala.Double
  ): glDashMatrixLib.glDashMatrixMod.vec3 = js.native
  def rotateY(
    out: glDashMatrixLib.glDashMatrixMod.vec3,
    a: js.Array[scala.Double],
    b: glDashMatrixLib.glDashMatrixMod.vec3,
    c: scala.Double
  ): glDashMatrixLib.glDashMatrixMod.vec3 = js.native
  def rotateY(
    out: glDashMatrixLib.glDashMatrixMod.vec3,
    a: js.Array[scala.Double],
    b: js.Array[scala.Double],
    c: scala.Double
  ): glDashMatrixLib.glDashMatrixMod.vec3 = js.native
  /**
    * Rotate a 3D vector around the z-axis
    * @param out The receiving vec3
    * @param a The vec3 point to rotate
    * @param b The origin of the rotation
    * @param c The angle of rotation
    * @returns out
    */
  def rotateZ(
    out: glDashMatrixLib.glDashMatrixMod.vec3,
    a: glDashMatrixLib.glDashMatrixMod.vec3,
    b: glDashMatrixLib.glDashMatrixMod.vec3,
    c: scala.Double
  ): glDashMatrixLib.glDashMatrixMod.vec3 = js.native
  def rotateZ(
    out: glDashMatrixLib.glDashMatrixMod.vec3,
    a: glDashMatrixLib.glDashMatrixMod.vec3,
    b: js.Array[scala.Double],
    c: scala.Double
  ): glDashMatrixLib.glDashMatrixMod.vec3 = js.native
  def rotateZ(
    out: glDashMatrixLib.glDashMatrixMod.vec3,
    a: js.Array[scala.Double],
    b: glDashMatrixLib.glDashMatrixMod.vec3,
    c: scala.Double
  ): glDashMatrixLib.glDashMatrixMod.vec3 = js.native
  def rotateZ(
    out: glDashMatrixLib.glDashMatrixMod.vec3,
    a: js.Array[scala.Double],
    b: js.Array[scala.Double],
    c: scala.Double
  ): glDashMatrixLib.glDashMatrixMod.vec3 = js.native
  /**
    * Math.round the components of a vec3
    *
    * @param {vec3} out the receiving vector
    * @param {vec3} a vector to round
    * @returns {vec3} out
    */
  def round(out: glDashMatrixLib.glDashMatrixMod.vec3, a: glDashMatrixLib.glDashMatrixMod.vec3): glDashMatrixLib.glDashMatrixMod.vec3 = js.native
  def round(out: glDashMatrixLib.glDashMatrixMod.vec3, a: js.Array[scala.Double]): glDashMatrixLib.glDashMatrixMod.vec3 = js.native
  /**
    * Scales a vec3 by a scalar number
    *
    * @param out the receiving vector
    * @param a the vector to scale
    * @param b amount to scale the vector by
    * @returns out
    */
  def scale(
    out: glDashMatrixLib.glDashMatrixMod.vec3,
    a: glDashMatrixLib.glDashMatrixMod.vec3,
    b: scala.Double
  ): glDashMatrixLib.glDashMatrixMod.vec3 = js.native
  def scale(out: glDashMatrixLib.glDashMatrixMod.vec3, a: js.Array[scala.Double], b: scala.Double): glDashMatrixLib.glDashMatrixMod.vec3 = js.native
  /**
    * Adds two vec3's after scaling the second operand by a scalar value
    *
    * @param out the receiving vector
    * @param a the first operand
    * @param b the second operand
    * @param scale the amount to scale b by before adding
    * @returns out
    */
  def scaleAndAdd(
    out: glDashMatrixLib.glDashMatrixMod.vec3,
    a: glDashMatrixLib.glDashMatrixMod.vec3,
    b: glDashMatrixLib.glDashMatrixMod.vec3,
    scale: scala.Double
  ): glDashMatrixLib.glDashMatrixMod.vec3 = js.native
  def scaleAndAdd(
    out: glDashMatrixLib.glDashMatrixMod.vec3,
    a: glDashMatrixLib.glDashMatrixMod.vec3,
    b: js.Array[scala.Double],
    scale: scala.Double
  ): glDashMatrixLib.glDashMatrixMod.vec3 = js.native
  def scaleAndAdd(
    out: glDashMatrixLib.glDashMatrixMod.vec3,
    a: js.Array[scala.Double],
    b: glDashMatrixLib.glDashMatrixMod.vec3,
    scale: scala.Double
  ): glDashMatrixLib.glDashMatrixMod.vec3 = js.native
  def scaleAndAdd(
    out: glDashMatrixLib.glDashMatrixMod.vec3,
    a: js.Array[scala.Double],
    b: js.Array[scala.Double],
    scale: scala.Double
  ): glDashMatrixLib.glDashMatrixMod.vec3 = js.native
  /**
    * Set the components of a vec3 to the given values
    *
    * @param out the receiving vector
    * @param x X component
    * @param y Y component
    * @param z Z component
    * @returns out
    */
  def set(out: glDashMatrixLib.glDashMatrixMod.vec3, x: scala.Double, y: scala.Double, z: scala.Double): glDashMatrixLib.glDashMatrixMod.vec3 = js.native
  /**
    * Calculates the squared euclidian distance between two vec3's
    *
    * @param a the first operand
    * @param b the second operand
    * @returns squared distance between a and b
    */
  def sqrDist(a: glDashMatrixLib.glDashMatrixMod.vec3, b: glDashMatrixLib.glDashMatrixMod.vec3): scala.Double = js.native
  def sqrDist(a: glDashMatrixLib.glDashMatrixMod.vec3, b: js.Array[scala.Double]): scala.Double = js.native
  def sqrDist(a: js.Array[scala.Double], b: glDashMatrixLib.glDashMatrixMod.vec3): scala.Double = js.native
  def sqrDist(a: js.Array[scala.Double], b: js.Array[scala.Double]): scala.Double = js.native
  /**
    * Calculates the squared length of a vec3
    *
    * @param a vector to calculate squared length of
    * @returns squared length of a
    */
  def sqrLen(a: glDashMatrixLib.glDashMatrixMod.vec3): scala.Double = js.native
  def sqrLen(a: js.Array[scala.Double]): scala.Double = js.native
  /**
    * Calculates the squared euclidian distance between two vec3's
    *
    * @param a the first operand
    * @param b the second operand
    * @returns squared distance between a and b
    */
  def squaredDistance(a: glDashMatrixLib.glDashMatrixMod.vec3, b: glDashMatrixLib.glDashMatrixMod.vec3): scala.Double = js.native
  def squaredDistance(a: glDashMatrixLib.glDashMatrixMod.vec3, b: js.Array[scala.Double]): scala.Double = js.native
  def squaredDistance(a: js.Array[scala.Double], b: glDashMatrixLib.glDashMatrixMod.vec3): scala.Double = js.native
  def squaredDistance(a: js.Array[scala.Double], b: js.Array[scala.Double]): scala.Double = js.native
  /**
    * Calculates the squared length of a vec3
    *
    * @param a vector to calculate squared length of
    * @returns squared length of a
    */
  def squaredLength(a: glDashMatrixLib.glDashMatrixMod.vec3): scala.Double = js.native
  def squaredLength(a: js.Array[scala.Double]): scala.Double = js.native
  /**
    * Returns a string representation of a vector
    *
    * @param a vector to represent as a string
    * @returns string representation of the vector
    */
  def str(a: glDashMatrixLib.glDashMatrixMod.vec3): java.lang.String = js.native
  def str(a: js.Array[scala.Double]): java.lang.String = js.native
  /**
    * Subtracts vector b from vector a
    *
    * @param out the receiving vector
    * @param a the first operand
    * @param b the second operand
    * @returns out
    */
  def sub(
    out: glDashMatrixLib.glDashMatrixMod.vec3,
    a: glDashMatrixLib.glDashMatrixMod.vec3,
    b: glDashMatrixLib.glDashMatrixMod.vec3
  ): glDashMatrixLib.glDashMatrixMod.vec3 = js.native
  def sub(
    out: glDashMatrixLib.glDashMatrixMod.vec3,
    a: glDashMatrixLib.glDashMatrixMod.vec3,
    b: js.Array[scala.Double]
  ): glDashMatrixLib.glDashMatrixMod.vec3 = js.native
  def sub(
    out: glDashMatrixLib.glDashMatrixMod.vec3,
    a: js.Array[scala.Double],
    b: glDashMatrixLib.glDashMatrixMod.vec3
  ): glDashMatrixLib.glDashMatrixMod.vec3 = js.native
  def sub(out: glDashMatrixLib.glDashMatrixMod.vec3, a: js.Array[scala.Double], b: js.Array[scala.Double]): glDashMatrixLib.glDashMatrixMod.vec3 = js.native
  /**
    * Subtracts vector b from vector a
    *
    * @param out the receiving vector
    * @param a the first operand
    * @param b the second operand
    * @returns out
    */
  def subtract(
    out: glDashMatrixLib.glDashMatrixMod.vec3,
    a: glDashMatrixLib.glDashMatrixMod.vec3,
    b: glDashMatrixLib.glDashMatrixMod.vec3
  ): glDashMatrixLib.glDashMatrixMod.vec3 = js.native
  def subtract(
    out: glDashMatrixLib.glDashMatrixMod.vec3,
    a: glDashMatrixLib.glDashMatrixMod.vec3,
    b: js.Array[scala.Double]
  ): glDashMatrixLib.glDashMatrixMod.vec3 = js.native
  def subtract(
    out: glDashMatrixLib.glDashMatrixMod.vec3,
    a: js.Array[scala.Double],
    b: glDashMatrixLib.glDashMatrixMod.vec3
  ): glDashMatrixLib.glDashMatrixMod.vec3 = js.native
  def subtract(out: glDashMatrixLib.glDashMatrixMod.vec3, a: js.Array[scala.Double], b: js.Array[scala.Double]): glDashMatrixLib.glDashMatrixMod.vec3 = js.native
  /**
    * Transforms the vec3 with a mat3.
    *
    * @param out the receiving vector
    * @param a the vector to transform
    * @param m the 3x3 matrix to transform with
    * @returns out
    */
  def transformMat3(
    out: glDashMatrixLib.glDashMatrixMod.vec3,
    a: glDashMatrixLib.glDashMatrixMod.vec3,
    m: glDashMatrixLib.glDashMatrixMod.mat3
  ): glDashMatrixLib.glDashMatrixMod.vec3 = js.native
  def transformMat3(
    out: glDashMatrixLib.glDashMatrixMod.vec3,
    a: js.Array[scala.Double],
    m: glDashMatrixLib.glDashMatrixMod.mat3
  ): glDashMatrixLib.glDashMatrixMod.vec3 = js.native
  /**
    * Transforms the vec3 with a mat4.
    * 4th vector component is implicitly '1'
    *
    * @param out the receiving vector
    * @param a the vector to transform
    * @param m matrix to transform with
    * @returns out
    */
  def transformMat4(
    out: glDashMatrixLib.glDashMatrixMod.vec3,
    a: glDashMatrixLib.glDashMatrixMod.vec3,
    m: glDashMatrixLib.glDashMatrixMod.mat4
  ): glDashMatrixLib.glDashMatrixMod.vec3 = js.native
  def transformMat4(
    out: glDashMatrixLib.glDashMatrixMod.vec3,
    a: js.Array[scala.Double],
    m: glDashMatrixLib.glDashMatrixMod.mat4
  ): glDashMatrixLib.glDashMatrixMod.vec3 = js.native
  /**
    * Transforms the vec3 with a quat
    *
    * @param out the receiving vector
    * @param a the vector to transform
    * @param q quaternion to transform with
    * @returns out
    */
  def transformQuat(
    out: glDashMatrixLib.glDashMatrixMod.vec3,
    a: glDashMatrixLib.glDashMatrixMod.vec3,
    q: glDashMatrixLib.glDashMatrixMod.quat
  ): glDashMatrixLib.glDashMatrixMod.vec3 = js.native
  def transformQuat(
    out: glDashMatrixLib.glDashMatrixMod.vec3,
    a: js.Array[scala.Double],
    q: glDashMatrixLib.glDashMatrixMod.quat
  ): glDashMatrixLib.glDashMatrixMod.vec3 = js.native
}

