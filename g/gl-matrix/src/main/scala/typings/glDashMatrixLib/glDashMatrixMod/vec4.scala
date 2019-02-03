package typings
package glDashMatrixLib.glDashMatrixMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gl-matrix", "vec4")
@js.native
class vec4 ()
  extends stdLib.Float32Array {
  var typeVec3: scala.Double = js.native
}

/* static members */
@JSImport("gl-matrix", "vec4")
@js.native
object vec4 extends js.Object {
  /**
    * Adds two vec4's
    *
    * @param out the receiving vector
    * @param a the first operand
    * @param b the second operand
    * @returns out
    */
  def add(
    out: glDashMatrixLib.glDashMatrixMod.vec4,
    a: glDashMatrixLib.glDashMatrixMod.vec4,
    b: glDashMatrixLib.glDashMatrixMod.vec4
  ): glDashMatrixLib.glDashMatrixMod.vec4 = js.native
  def add(
    out: glDashMatrixLib.glDashMatrixMod.vec4,
    a: glDashMatrixLib.glDashMatrixMod.vec4,
    b: js.Array[scala.Double]
  ): glDashMatrixLib.glDashMatrixMod.vec4 = js.native
  def add(
    out: glDashMatrixLib.glDashMatrixMod.vec4,
    a: js.Array[scala.Double],
    b: glDashMatrixLib.glDashMatrixMod.vec4
  ): glDashMatrixLib.glDashMatrixMod.vec4 = js.native
  def add(out: glDashMatrixLib.glDashMatrixMod.vec4, a: js.Array[scala.Double], b: js.Array[scala.Double]): glDashMatrixLib.glDashMatrixMod.vec4 = js.native
  /**
    * Math.ceil the components of a vec4
    *
    * @param {vec4} out the receiving vector
    * @param {vec4} a vector to ceil
    * @returns {vec4} out
    */
  def ceil(out: glDashMatrixLib.glDashMatrixMod.vec4, a: glDashMatrixLib.glDashMatrixMod.vec4): glDashMatrixLib.glDashMatrixMod.vec4 = js.native
  def ceil(out: glDashMatrixLib.glDashMatrixMod.vec4, a: js.Array[scala.Double]): glDashMatrixLib.glDashMatrixMod.vec4 = js.native
  /**
    * Creates a new vec4 initialized with values from an existing vector
    *
    * @param a vector to clone
    * @returns a new 4D vector
    */
  def clone(a: glDashMatrixLib.glDashMatrixMod.vec4): glDashMatrixLib.glDashMatrixMod.vec4 = js.native
  def clone(a: js.Array[scala.Double]): glDashMatrixLib.glDashMatrixMod.vec4 = js.native
  /**
    * Copy the values from one vec4 to another
    *
    * @param out the receiving vector
    * @param a the source vector
    * @returns out
    */
  def copy(out: glDashMatrixLib.glDashMatrixMod.vec4, a: glDashMatrixLib.glDashMatrixMod.vec4): glDashMatrixLib.glDashMatrixMod.vec4 = js.native
  def copy(out: glDashMatrixLib.glDashMatrixMod.vec4, a: js.Array[scala.Double]): glDashMatrixLib.glDashMatrixMod.vec4 = js.native
  /**
    * Creates a new, empty vec4
    *
    * @returns a new 4D vector
    */
  def create(): glDashMatrixLib.glDashMatrixMod.vec4 = js.native
  /**
    * Calculates the euclidian distance between two vec4's
    *
    * @param a the first operand
    * @param b the second operand
    * @returns distance between a and b
    */
  def dist(a: glDashMatrixLib.glDashMatrixMod.vec4, b: glDashMatrixLib.glDashMatrixMod.vec4): scala.Double = js.native
  def dist(a: glDashMatrixLib.glDashMatrixMod.vec4, b: js.Array[scala.Double]): scala.Double = js.native
  def dist(a: js.Array[scala.Double], b: glDashMatrixLib.glDashMatrixMod.vec4): scala.Double = js.native
  def dist(a: js.Array[scala.Double], b: js.Array[scala.Double]): scala.Double = js.native
  /**
    * Calculates the euclidian distance between two vec4's
    *
    * @param a the first operand
    * @param b the second operand
    * @returns distance between a and b
    */
  def distance(a: glDashMatrixLib.glDashMatrixMod.vec4, b: glDashMatrixLib.glDashMatrixMod.vec4): scala.Double = js.native
  def distance(a: glDashMatrixLib.glDashMatrixMod.vec4, b: js.Array[scala.Double]): scala.Double = js.native
  def distance(a: js.Array[scala.Double], b: glDashMatrixLib.glDashMatrixMod.vec4): scala.Double = js.native
  def distance(a: js.Array[scala.Double], b: js.Array[scala.Double]): scala.Double = js.native
  /**
    * Divides two vec4's
    *
    * @param out the receiving vector
    * @param a the first operand
    * @param b the second operand
    * @returns out
    */
  def div(
    out: glDashMatrixLib.glDashMatrixMod.vec4,
    a: glDashMatrixLib.glDashMatrixMod.vec4,
    b: glDashMatrixLib.glDashMatrixMod.vec4
  ): glDashMatrixLib.glDashMatrixMod.vec4 = js.native
  def div(
    out: glDashMatrixLib.glDashMatrixMod.vec4,
    a: glDashMatrixLib.glDashMatrixMod.vec4,
    b: js.Array[scala.Double]
  ): glDashMatrixLib.glDashMatrixMod.vec4 = js.native
  def div(
    out: glDashMatrixLib.glDashMatrixMod.vec4,
    a: js.Array[scala.Double],
    b: glDashMatrixLib.glDashMatrixMod.vec4
  ): glDashMatrixLib.glDashMatrixMod.vec4 = js.native
  def div(out: glDashMatrixLib.glDashMatrixMod.vec4, a: js.Array[scala.Double], b: js.Array[scala.Double]): glDashMatrixLib.glDashMatrixMod.vec4 = js.native
  /**
    * Divides two vec4's
    *
    * @param out the receiving vector
    * @param a the first operand
    * @param b the second operand
    * @returns out
    */
  def divide(
    out: glDashMatrixLib.glDashMatrixMod.vec4,
    a: glDashMatrixLib.glDashMatrixMod.vec4,
    b: glDashMatrixLib.glDashMatrixMod.vec4
  ): glDashMatrixLib.glDashMatrixMod.vec4 = js.native
  def divide(
    out: glDashMatrixLib.glDashMatrixMod.vec4,
    a: glDashMatrixLib.glDashMatrixMod.vec4,
    b: js.Array[scala.Double]
  ): glDashMatrixLib.glDashMatrixMod.vec4 = js.native
  def divide(
    out: glDashMatrixLib.glDashMatrixMod.vec4,
    a: js.Array[scala.Double],
    b: glDashMatrixLib.glDashMatrixMod.vec4
  ): glDashMatrixLib.glDashMatrixMod.vec4 = js.native
  def divide(out: glDashMatrixLib.glDashMatrixMod.vec4, a: js.Array[scala.Double], b: js.Array[scala.Double]): glDashMatrixLib.glDashMatrixMod.vec4 = js.native
  /**
    * Calculates the dot product of two vec4's
    *
    * @param a the first operand
    * @param b the second operand
    * @returns dot product of a and b
    */
  def dot(a: glDashMatrixLib.glDashMatrixMod.vec4, b: glDashMatrixLib.glDashMatrixMod.vec4): scala.Double = js.native
  def dot(a: glDashMatrixLib.glDashMatrixMod.vec4, b: js.Array[scala.Double]): scala.Double = js.native
  def dot(a: js.Array[scala.Double], b: glDashMatrixLib.glDashMatrixMod.vec4): scala.Double = js.native
  def dot(a: js.Array[scala.Double], b: js.Array[scala.Double]): scala.Double = js.native
  /**
    * Returns whether or not the vectors have approximately the same elements in the same position.
    *
    * @param {vec4} a The first vector.
    * @param {vec4} b The second vector.
    * @returns {boolean} True if the vectors are equal, false otherwise.
    */
  def equals(a: glDashMatrixLib.glDashMatrixMod.vec4, b: glDashMatrixLib.glDashMatrixMod.vec4): scala.Boolean = js.native
  def equals(a: glDashMatrixLib.glDashMatrixMod.vec4, b: js.Array[scala.Double]): scala.Boolean = js.native
  def equals(a: js.Array[scala.Double], b: glDashMatrixLib.glDashMatrixMod.vec4): scala.Boolean = js.native
  def equals(a: js.Array[scala.Double], b: js.Array[scala.Double]): scala.Boolean = js.native
  /**
    * Returns whether or not the vectors have exactly the same elements in the same position (when compared with ===)
    *
    * @param {vec4} a The first vector.
    * @param {vec4} b The second vector.
    * @returns {boolean} True if the vectors are equal, false otherwise.
    */
  def exactEquals(a: glDashMatrixLib.glDashMatrixMod.vec4, b: glDashMatrixLib.glDashMatrixMod.vec4): scala.Boolean = js.native
  def exactEquals(a: glDashMatrixLib.glDashMatrixMod.vec4, b: js.Array[scala.Double]): scala.Boolean = js.native
  def exactEquals(a: js.Array[scala.Double], b: glDashMatrixLib.glDashMatrixMod.vec4): scala.Boolean = js.native
  def exactEquals(a: js.Array[scala.Double], b: js.Array[scala.Double]): scala.Boolean = js.native
  /**
    * Math.floor the components of a vec4
    *
    * @param {vec4} out the receiving vector
    * @param {vec4} a vector to floor
    * @returns {vec4} out
    */
  def floor(out: glDashMatrixLib.glDashMatrixMod.vec4, a: glDashMatrixLib.glDashMatrixMod.vec4): glDashMatrixLib.glDashMatrixMod.vec4 = js.native
  def floor(out: glDashMatrixLib.glDashMatrixMod.vec4, a: js.Array[scala.Double]): glDashMatrixLib.glDashMatrixMod.vec4 = js.native
  /**
    * Perform some operation over an array of vec4s.
    *
    * @param a the array of vectors to iterate over
    * @param stride Number of elements between the start of each vec4. If 0 assumes tightly packed
    * @param offset Number of elements to skip at the beginning of the array
    * @param count Number of vec4s to iterate over. If 0 iterates over entire array
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
      /* a */ this.type | js.Array[scala.Double], 
      /* b */ this.type | js.Array[scala.Double], 
      scala.Unit
    ]
  ): stdLib.Float32Array = js.native
  /**
    * Perform some operation over an array of vec4s.
    *
    * @param a the array of vectors to iterate over
    * @param stride Number of elements between the start of each vec4. If 0 assumes tightly packed
    * @param offset Number of elements to skip at the beginning of the array
    * @param count Number of vec4s to iterate over. If 0 iterates over entire array
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
      /* a */ this.type | js.Array[scala.Double], 
      /* b */ this.type | js.Array[scala.Double], 
      /* arg */ js.Any, 
      scala.Unit
    ],
    arg: js.Any
  ): stdLib.Float32Array = js.native
  /**
    * Creates a new vec4 initialized with the given values
    *
    * @param x X component
    * @param y Y component
    * @param z Z component
    * @param w W component
    * @returns a new 4D vector
    */
  def fromValues(x: scala.Double, y: scala.Double, z: scala.Double, w: scala.Double): glDashMatrixLib.glDashMatrixMod.vec4 = js.native
  /**
    * Returns the inverse of the components of a vec4
    *
    * @param out the receiving vector
    * @param a vector to invert
    * @returns out
    */
  def inverse(out: glDashMatrixLib.glDashMatrixMod.vec4, a: glDashMatrixLib.glDashMatrixMod.vec4): glDashMatrixLib.glDashMatrixMod.vec4 = js.native
  def inverse(out: glDashMatrixLib.glDashMatrixMod.vec4, a: js.Array[scala.Double]): glDashMatrixLib.glDashMatrixMod.vec4 = js.native
  /**
    * Calculates the length of a vec4
    *
    * @param a vector to calculate length of
    * @returns length of a
    */
  def len(a: glDashMatrixLib.glDashMatrixMod.vec4): scala.Double = js.native
  def len(a: js.Array[scala.Double]): scala.Double = js.native
  /**
    * Calculates the length of a vec4
    *
    * @param a vector to calculate length of
    * @returns length of a
    */
  def length(a: glDashMatrixLib.glDashMatrixMod.vec4): scala.Double = js.native
  def length(a: js.Array[scala.Double]): scala.Double = js.native
  /**
    * Performs a linear interpolation between two vec4's
    *
    * @param out the receiving vector
    * @param a the first operand
    * @param b the second operand
    * @param t interpolation amount between the two inputs
    * @returns out
    */
  def lerp(
    out: glDashMatrixLib.glDashMatrixMod.vec4,
    a: glDashMatrixLib.glDashMatrixMod.vec4,
    b: glDashMatrixLib.glDashMatrixMod.vec4,
    t: scala.Double
  ): glDashMatrixLib.glDashMatrixMod.vec4 = js.native
  def lerp(
    out: glDashMatrixLib.glDashMatrixMod.vec4,
    a: glDashMatrixLib.glDashMatrixMod.vec4,
    b: js.Array[scala.Double],
    t: scala.Double
  ): glDashMatrixLib.glDashMatrixMod.vec4 = js.native
  def lerp(
    out: glDashMatrixLib.glDashMatrixMod.vec4,
    a: js.Array[scala.Double],
    b: glDashMatrixLib.glDashMatrixMod.vec4,
    t: scala.Double
  ): glDashMatrixLib.glDashMatrixMod.vec4 = js.native
  def lerp(
    out: glDashMatrixLib.glDashMatrixMod.vec4,
    a: js.Array[scala.Double],
    b: js.Array[scala.Double],
    t: scala.Double
  ): glDashMatrixLib.glDashMatrixMod.vec4 = js.native
  /**
    * Returns the maximum of two vec4's
    *
    * @param out the receiving vector
    * @param a the first operand
    * @param b the second operand
    * @returns out
    */
  def max(
    out: glDashMatrixLib.glDashMatrixMod.vec4,
    a: glDashMatrixLib.glDashMatrixMod.vec4,
    b: glDashMatrixLib.glDashMatrixMod.vec4
  ): glDashMatrixLib.glDashMatrixMod.vec4 = js.native
  def max(
    out: glDashMatrixLib.glDashMatrixMod.vec4,
    a: glDashMatrixLib.glDashMatrixMod.vec4,
    b: js.Array[scala.Double]
  ): glDashMatrixLib.glDashMatrixMod.vec4 = js.native
  def max(
    out: glDashMatrixLib.glDashMatrixMod.vec4,
    a: js.Array[scala.Double],
    b: glDashMatrixLib.glDashMatrixMod.vec4
  ): glDashMatrixLib.glDashMatrixMod.vec4 = js.native
  def max(out: glDashMatrixLib.glDashMatrixMod.vec4, a: js.Array[scala.Double], b: js.Array[scala.Double]): glDashMatrixLib.glDashMatrixMod.vec4 = js.native
  /**
    * Returns the minimum of two vec4's
    *
    * @param out the receiving vector
    * @param a the first operand
    * @param b the second operand
    * @returns out
    */
  def min(
    out: glDashMatrixLib.glDashMatrixMod.vec4,
    a: glDashMatrixLib.glDashMatrixMod.vec4,
    b: glDashMatrixLib.glDashMatrixMod.vec4
  ): glDashMatrixLib.glDashMatrixMod.vec4 = js.native
  def min(
    out: glDashMatrixLib.glDashMatrixMod.vec4,
    a: glDashMatrixLib.glDashMatrixMod.vec4,
    b: js.Array[scala.Double]
  ): glDashMatrixLib.glDashMatrixMod.vec4 = js.native
  def min(
    out: glDashMatrixLib.glDashMatrixMod.vec4,
    a: js.Array[scala.Double],
    b: glDashMatrixLib.glDashMatrixMod.vec4
  ): glDashMatrixLib.glDashMatrixMod.vec4 = js.native
  def min(out: glDashMatrixLib.glDashMatrixMod.vec4, a: js.Array[scala.Double], b: js.Array[scala.Double]): glDashMatrixLib.glDashMatrixMod.vec4 = js.native
  /**
    * Multiplies two vec4's
    *
    * @param out the receiving vector
    * @param a the first operand
    * @param b the second operand
    * @returns out
    */
  def mul(
    out: glDashMatrixLib.glDashMatrixMod.vec4,
    a: glDashMatrixLib.glDashMatrixMod.vec4,
    b: glDashMatrixLib.glDashMatrixMod.vec4
  ): glDashMatrixLib.glDashMatrixMod.vec4 = js.native
  def mul(
    out: glDashMatrixLib.glDashMatrixMod.vec4,
    a: glDashMatrixLib.glDashMatrixMod.vec4,
    b: js.Array[scala.Double]
  ): glDashMatrixLib.glDashMatrixMod.vec4 = js.native
  def mul(
    out: glDashMatrixLib.glDashMatrixMod.vec4,
    a: js.Array[scala.Double],
    b: glDashMatrixLib.glDashMatrixMod.vec4
  ): glDashMatrixLib.glDashMatrixMod.vec4 = js.native
  def mul(out: glDashMatrixLib.glDashMatrixMod.vec4, a: js.Array[scala.Double], b: js.Array[scala.Double]): glDashMatrixLib.glDashMatrixMod.vec4 = js.native
  /**
    * Multiplies two vec4's
    *
    * @param out the receiving vector
    * @param a the first operand
    * @param b the second operand
    * @returns out
    */
  def multiply(
    out: glDashMatrixLib.glDashMatrixMod.vec4,
    a: glDashMatrixLib.glDashMatrixMod.vec4,
    b: glDashMatrixLib.glDashMatrixMod.vec4
  ): glDashMatrixLib.glDashMatrixMod.vec4 = js.native
  def multiply(
    out: glDashMatrixLib.glDashMatrixMod.vec4,
    a: glDashMatrixLib.glDashMatrixMod.vec4,
    b: js.Array[scala.Double]
  ): glDashMatrixLib.glDashMatrixMod.vec4 = js.native
  def multiply(
    out: glDashMatrixLib.glDashMatrixMod.vec4,
    a: js.Array[scala.Double],
    b: glDashMatrixLib.glDashMatrixMod.vec4
  ): glDashMatrixLib.glDashMatrixMod.vec4 = js.native
  def multiply(out: glDashMatrixLib.glDashMatrixMod.vec4, a: js.Array[scala.Double], b: js.Array[scala.Double]): glDashMatrixLib.glDashMatrixMod.vec4 = js.native
  /**
    * Negates the components of a vec4
    *
    * @param out the receiving vector
    * @param a vector to negate
    * @returns out
    */
  def negate(out: glDashMatrixLib.glDashMatrixMod.vec4, a: glDashMatrixLib.glDashMatrixMod.vec4): glDashMatrixLib.glDashMatrixMod.vec4 = js.native
  def negate(out: glDashMatrixLib.glDashMatrixMod.vec4, a: js.Array[scala.Double]): glDashMatrixLib.glDashMatrixMod.vec4 = js.native
  /**
    * Normalize a vec4
    *
    * @param out the receiving vector
    * @param a vector to normalize
    * @returns out
    */
  def normalize(out: glDashMatrixLib.glDashMatrixMod.vec4, a: glDashMatrixLib.glDashMatrixMod.vec4): glDashMatrixLib.glDashMatrixMod.vec4 = js.native
  def normalize(out: glDashMatrixLib.glDashMatrixMod.vec4, a: js.Array[scala.Double]): glDashMatrixLib.glDashMatrixMod.vec4 = js.native
  /**
    * Generates a random unit vector
    *
    * @param out the receiving vector
    * @returns out
    */
  def random(out: glDashMatrixLib.glDashMatrixMod.vec4): glDashMatrixLib.glDashMatrixMod.vec4 = js.native
  /**
    * Generates a random vector with the given scale
    *
    * @param out the receiving vector
    * @param scale length of the resulting vector. If ommitted, a unit vector will be returned
    * @returns out
    */
  def random(out: glDashMatrixLib.glDashMatrixMod.vec4, scale: scala.Double): glDashMatrixLib.glDashMatrixMod.vec4 = js.native
  /**
    * Math.round the components of a vec4
    *
    * @param {vec4} out the receiving vector
    * @param {vec4} a vector to round
    * @returns {vec4} out
    */
  def round(out: glDashMatrixLib.glDashMatrixMod.vec4, a: glDashMatrixLib.glDashMatrixMod.vec4): glDashMatrixLib.glDashMatrixMod.vec4 = js.native
  def round(out: glDashMatrixLib.glDashMatrixMod.vec4, a: js.Array[scala.Double]): glDashMatrixLib.glDashMatrixMod.vec4 = js.native
  /**
    * Scales a vec4 by a scalar number
    *
    * @param out the receiving vector
    * @param a the vector to scale
    * @param b amount to scale the vector by
    * @returns out
    */
  def scale(
    out: glDashMatrixLib.glDashMatrixMod.vec4,
    a: glDashMatrixLib.glDashMatrixMod.vec4,
    b: scala.Double
  ): glDashMatrixLib.glDashMatrixMod.vec4 = js.native
  def scale(out: glDashMatrixLib.glDashMatrixMod.vec4, a: js.Array[scala.Double], b: scala.Double): glDashMatrixLib.glDashMatrixMod.vec4 = js.native
  /**
    * Adds two vec4's after scaling the second operand by a scalar value
    *
    * @param out the receiving vector
    * @param a the first operand
    * @param b the second operand
    * @param scale the amount to scale b by before adding
    * @returns out
    */
  def scaleAndAdd(
    out: glDashMatrixLib.glDashMatrixMod.vec4,
    a: glDashMatrixLib.glDashMatrixMod.vec4,
    b: glDashMatrixLib.glDashMatrixMod.vec4,
    scale: scala.Double
  ): glDashMatrixLib.glDashMatrixMod.vec4 = js.native
  def scaleAndAdd(
    out: glDashMatrixLib.glDashMatrixMod.vec4,
    a: glDashMatrixLib.glDashMatrixMod.vec4,
    b: js.Array[scala.Double],
    scale: scala.Double
  ): glDashMatrixLib.glDashMatrixMod.vec4 = js.native
  def scaleAndAdd(
    out: glDashMatrixLib.glDashMatrixMod.vec4,
    a: js.Array[scala.Double],
    b: glDashMatrixLib.glDashMatrixMod.vec4,
    scale: scala.Double
  ): glDashMatrixLib.glDashMatrixMod.vec4 = js.native
  def scaleAndAdd(
    out: glDashMatrixLib.glDashMatrixMod.vec4,
    a: js.Array[scala.Double],
    b: js.Array[scala.Double],
    scale: scala.Double
  ): glDashMatrixLib.glDashMatrixMod.vec4 = js.native
  /**
    * Set the components of a vec4 to the given values
    *
    * @param out the receiving vector
    * @param x X component
    * @param y Y component
    * @param z Z component
    * @param w W component
    * @returns out
    */
  def set(
    out: glDashMatrixLib.glDashMatrixMod.vec4,
    x: scala.Double,
    y: scala.Double,
    z: scala.Double,
    w: scala.Double
  ): glDashMatrixLib.glDashMatrixMod.vec4 = js.native
  /**
    * Calculates the squared euclidian distance between two vec4's
    *
    * @param a the first operand
    * @param b the second operand
    * @returns squared distance between a and b
    */
  def sqrDist(a: glDashMatrixLib.glDashMatrixMod.vec4, b: glDashMatrixLib.glDashMatrixMod.vec4): scala.Double = js.native
  def sqrDist(a: glDashMatrixLib.glDashMatrixMod.vec4, b: js.Array[scala.Double]): scala.Double = js.native
  def sqrDist(a: js.Array[scala.Double], b: glDashMatrixLib.glDashMatrixMod.vec4): scala.Double = js.native
  def sqrDist(a: js.Array[scala.Double], b: js.Array[scala.Double]): scala.Double = js.native
  /**
    * Calculates the squared length of a vec4
    *
    * @param a vector to calculate squared length of
    * @returns squared length of a
    */
  def sqrLen(a: glDashMatrixLib.glDashMatrixMod.vec4): scala.Double = js.native
  def sqrLen(a: js.Array[scala.Double]): scala.Double = js.native
  /**
    * Calculates the squared euclidian distance between two vec4's
    *
    * @param a the first operand
    * @param b the second operand
    * @returns squared distance between a and b
    */
  def squaredDistance(a: glDashMatrixLib.glDashMatrixMod.vec4, b: glDashMatrixLib.glDashMatrixMod.vec4): scala.Double = js.native
  def squaredDistance(a: glDashMatrixLib.glDashMatrixMod.vec4, b: js.Array[scala.Double]): scala.Double = js.native
  def squaredDistance(a: js.Array[scala.Double], b: glDashMatrixLib.glDashMatrixMod.vec4): scala.Double = js.native
  def squaredDistance(a: js.Array[scala.Double], b: js.Array[scala.Double]): scala.Double = js.native
  /**
    * Calculates the squared length of a vec4
    *
    * @param a vector to calculate squared length of
    * @returns squared length of a
    */
  def squaredLength(a: glDashMatrixLib.glDashMatrixMod.vec4): scala.Double = js.native
  def squaredLength(a: js.Array[scala.Double]): scala.Double = js.native
  /**
    * Returns a string representation of a vector
    *
    * @param a vector to represent as a string
    * @returns string representation of the vector
    */
  def str(a: glDashMatrixLib.glDashMatrixMod.vec4): java.lang.String = js.native
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
    out: glDashMatrixLib.glDashMatrixMod.vec4,
    a: glDashMatrixLib.glDashMatrixMod.vec4,
    b: glDashMatrixLib.glDashMatrixMod.vec4
  ): glDashMatrixLib.glDashMatrixMod.vec4 = js.native
  def sub(
    out: glDashMatrixLib.glDashMatrixMod.vec4,
    a: glDashMatrixLib.glDashMatrixMod.vec4,
    b: js.Array[scala.Double]
  ): glDashMatrixLib.glDashMatrixMod.vec4 = js.native
  def sub(
    out: glDashMatrixLib.glDashMatrixMod.vec4,
    a: js.Array[scala.Double],
    b: glDashMatrixLib.glDashMatrixMod.vec4
  ): glDashMatrixLib.glDashMatrixMod.vec4 = js.native
  def sub(out: glDashMatrixLib.glDashMatrixMod.vec4, a: js.Array[scala.Double], b: js.Array[scala.Double]): glDashMatrixLib.glDashMatrixMod.vec4 = js.native
  /**
    * Subtracts vector b from vector a
    *
    * @param out the receiving vector
    * @param a the first operand
    * @param b the second operand
    * @returns out
    */
  def subtract(
    out: glDashMatrixLib.glDashMatrixMod.vec4,
    a: glDashMatrixLib.glDashMatrixMod.vec4,
    b: glDashMatrixLib.glDashMatrixMod.vec4
  ): glDashMatrixLib.glDashMatrixMod.vec4 = js.native
  def subtract(
    out: glDashMatrixLib.glDashMatrixMod.vec4,
    a: glDashMatrixLib.glDashMatrixMod.vec4,
    b: js.Array[scala.Double]
  ): glDashMatrixLib.glDashMatrixMod.vec4 = js.native
  def subtract(
    out: glDashMatrixLib.glDashMatrixMod.vec4,
    a: js.Array[scala.Double],
    b: glDashMatrixLib.glDashMatrixMod.vec4
  ): glDashMatrixLib.glDashMatrixMod.vec4 = js.native
  def subtract(out: glDashMatrixLib.glDashMatrixMod.vec4, a: js.Array[scala.Double], b: js.Array[scala.Double]): glDashMatrixLib.glDashMatrixMod.vec4 = js.native
  /**
    * Transforms the vec4 with a mat4.
    *
    * @param out the receiving vector
    * @param a the vector to transform
    * @param m matrix to transform with
    * @returns out
    */
  def transformMat4(
    out: glDashMatrixLib.glDashMatrixMod.vec4,
    a: glDashMatrixLib.glDashMatrixMod.vec4,
    m: glDashMatrixLib.glDashMatrixMod.mat4
  ): glDashMatrixLib.glDashMatrixMod.vec4 = js.native
  def transformMat4(
    out: glDashMatrixLib.glDashMatrixMod.vec4,
    a: js.Array[scala.Double],
    m: glDashMatrixLib.glDashMatrixMod.mat4
  ): glDashMatrixLib.glDashMatrixMod.vec4 = js.native
  /**
    * Transforms the vec4 with a quat
    *
    * @param out the receiving vector
    * @param a the vector to transform
    * @param q quaternion to transform with
    * @returns out
    */
  def transformQuat(
    out: glDashMatrixLib.glDashMatrixMod.vec4,
    a: glDashMatrixLib.glDashMatrixMod.vec4,
    q: glDashMatrixLib.glDashMatrixMod.quat
  ): glDashMatrixLib.glDashMatrixMod.vec4 = js.native
  def transformQuat(
    out: glDashMatrixLib.glDashMatrixMod.vec4,
    a: js.Array[scala.Double],
    q: glDashMatrixLib.glDashMatrixMod.quat
  ): glDashMatrixLib.glDashMatrixMod.vec4 = js.native
}

