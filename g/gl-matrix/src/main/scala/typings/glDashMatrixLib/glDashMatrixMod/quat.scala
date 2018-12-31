package typings
package glDashMatrixLib.glDashMatrixMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gl-matrix", "quat")
@js.native
class quat ()
  extends stdLib.Float32Array {
  var typeQuat: scala.Double = js.native
}

@JSImport("gl-matrix", "quat")
@js.native
object quat extends js.Object {
  /**
    * Adds two quat's
    *
    * @param out the receiving quaternion
    * @param a the first operand
    * @param b the second operand
    * @returns out
    * @function
    */
  def add(
    out: glDashMatrixLib.glDashMatrixMod.quat,
    a: glDashMatrixLib.glDashMatrixMod.quat,
    b: glDashMatrixLib.glDashMatrixMod.quat
  ): glDashMatrixLib.glDashMatrixMod.quat = js.native
  /**
    * Calculates the W component of a quat from the X, Y, and Z components.
    * Assumes that quaternion is 1 unit in length.
    * Any existing W component will be ignored.
    *
    * @param out the receiving quaternion
    * @param a quat to calculate W component of
    * @returns out
    */
  def calculateW(out: glDashMatrixLib.glDashMatrixMod.quat, a: glDashMatrixLib.glDashMatrixMod.quat): glDashMatrixLib.glDashMatrixMod.quat = js.native
  /**
    * Creates a new quat initialized with values from an existing quaternion
    *
    * @param a quaternion to clone
    * @returns a new quaternion
    * @function
    */
  def clone(a: glDashMatrixLib.glDashMatrixMod.quat): glDashMatrixLib.glDashMatrixMod.quat = js.native
  /**
    * Calculates the conjugate of a quat
    * If the quaternion is normalized, this function is faster than quat.inverse and produces the same result.
    *
    * @param out the receiving quaternion
    * @param a quat to calculate conjugate of
    * @returns out
    */
  def conjugate(out: glDashMatrixLib.glDashMatrixMod.quat, a: glDashMatrixLib.glDashMatrixMod.quat): glDashMatrixLib.glDashMatrixMod.quat = js.native
  /**
    * Copy the values from one quat to another
    *
    * @param out the receiving quaternion
    * @param a the source quaternion
    * @returns out
    * @function
    */
  def copy(out: glDashMatrixLib.glDashMatrixMod.quat, a: glDashMatrixLib.glDashMatrixMod.quat): glDashMatrixLib.glDashMatrixMod.quat = js.native
  /**
    * Creates a new identity quat
    *
    * @returns a new quaternion
    */
  def create(): glDashMatrixLib.glDashMatrixMod.quat = js.native
  /**
    * Calculates the dot product of two quat's
    *
    * @param a the first operand
    * @param b the second operand
    * @returns dot product of a and b
    * @function
    */
  def dot(a: glDashMatrixLib.glDashMatrixMod.quat, b: glDashMatrixLib.glDashMatrixMod.quat): scala.Double = js.native
  /**
    * Returns whether or not the quaternions have approximately the same elements in the same position.
    *
    * @param {quat} a The first vector.
    * @param {quat} b The second vector.
    * @returns {boolean} True if the quaternions are equal, false otherwise.
    */
  def equals(a: glDashMatrixLib.glDashMatrixMod.quat, b: glDashMatrixLib.glDashMatrixMod.quat): scala.Boolean = js.native
  /**
    * Returns whether or not the quaternions have exactly the same elements in the same position (when compared with ===)
    *
    * @param {quat} a The first vector.
    * @param {quat} b The second vector.
    * @returns {boolean} True if the quaternions are equal, false otherwise.
    */
  def exactEquals(a: glDashMatrixLib.glDashMatrixMod.quat, b: glDashMatrixLib.glDashMatrixMod.quat): scala.Boolean = js.native
  /**
    * Creates a quaternion from the given euler angle x, y, z.
    *
    * @param {quat} out the receiving quaternion
    * @param {number} x Angle to rotate around X axis in degrees.
    * @param {number} y Angle to rotate around Y axis in degrees.
    * @param {number} z Angle to rotate around Z axis in degrees.
    * @returns {quat} out
    */
  def fromEuler(out: glDashMatrixLib.glDashMatrixMod.quat, x: scala.Double, y: scala.Double, z: scala.Double): glDashMatrixLib.glDashMatrixMod.quat = js.native
  /**
    * Creates a quaternion from the given 3x3 rotation matrix.
    *
    * NOTE: The resultant quaternion is not normalized, so you should be sure
    * to renormalize the quaternion yourself where necessary.
    *
    * @param out the receiving quaternion
    * @param m rotation matrix
    * @returns out
    * @function
    */
  def fromMat3(out: glDashMatrixLib.glDashMatrixMod.quat, m: glDashMatrixLib.glDashMatrixMod.mat3): glDashMatrixLib.glDashMatrixMod.quat = js.native
  /**
    * Creates a new quat initialized with the given values
    *
    * @param x X component
    * @param y Y component
    * @param z Z component
    * @param w W component
    * @returns a new quaternion
    * @function
    */
  def fromValues(x: scala.Double, y: scala.Double, z: scala.Double, w: scala.Double): glDashMatrixLib.glDashMatrixMod.quat = js.native
  /**
    * Gets the rotation axis and angle for a given
    *  quaternion. If a quaternion is created with
    *  setAxisAngle, this method will return the same
    *  values as providied in the original parameter list
    *  OR functionally equivalent values.
    * Example: The quaternion formed by axis [0, 0, 1] and
    *  angle -90 is the same as the quaternion formed by
    *  [0, 0, 1] and 270. This method favors the latter.
    * @param  {vec3} out_axis  Vector receiving the axis of rotation
    * @param  {quat} q     Quaternion to be decomposed
    * @return {number}     Angle, in radians, of the rotation
    */
  def getAxisAngle(out_axis: glDashMatrixLib.glDashMatrixMod.vec3, q: glDashMatrixLib.glDashMatrixMod.quat): scala.Double = js.native
  def getAxisAngle(out_axis: js.Array[scala.Double], q: glDashMatrixLib.glDashMatrixMod.quat): scala.Double = js.native
  /**
    * Set a quat to the identity quaternion
    *
    * @param out the receiving quaternion
    * @returns out
    */
  def identity(out: glDashMatrixLib.glDashMatrixMod.quat): glDashMatrixLib.glDashMatrixMod.quat = js.native
  /**
    * Calculates the inverse of a quat
    *
    * @param out the receiving quaternion
    * @param a quat to calculate inverse of
    * @returns out
    */
  def invert(out: glDashMatrixLib.glDashMatrixMod.quat, a: glDashMatrixLib.glDashMatrixMod.quat): glDashMatrixLib.glDashMatrixMod.quat = js.native
  /**
    * Calculates the length of a quat
    *
    * @param a vector to calculate length of
    * @returns length of a
    * @function
    */
  def len(a: glDashMatrixLib.glDashMatrixMod.quat): scala.Double = js.native
  /**
    * Calculates the length of a quat
    *
    * @param a vector to calculate length of
    * @returns length of a
    * @function
    */
  def length(a: glDashMatrixLib.glDashMatrixMod.quat): scala.Double = js.native
  /**
    * Performs a linear interpolation between two quat's
    *
    * @param out the receiving quaternion
    * @param a the first operand
    * @param b the second operand
    * @param t interpolation amount between the two inputs
    * @returns out
    * @function
    */
  def lerp(
    out: glDashMatrixLib.glDashMatrixMod.quat,
    a: glDashMatrixLib.glDashMatrixMod.quat,
    b: glDashMatrixLib.glDashMatrixMod.quat,
    t: scala.Double
  ): glDashMatrixLib.glDashMatrixMod.quat = js.native
  /**
    * Multiplies two quat's
    *
    * @param out the receiving quaternion
    * @param a the first operand
    * @param b the second operand
    * @returns out
    */
  def mul(
    out: glDashMatrixLib.glDashMatrixMod.quat,
    a: glDashMatrixLib.glDashMatrixMod.quat,
    b: glDashMatrixLib.glDashMatrixMod.quat
  ): glDashMatrixLib.glDashMatrixMod.quat = js.native
  /**
    * Multiplies two quat's
    *
    * @param out the receiving quaternion
    * @param a the first operand
    * @param b the second operand
    * @returns out
    */
  def multiply(
    out: glDashMatrixLib.glDashMatrixMod.quat,
    a: glDashMatrixLib.glDashMatrixMod.quat,
    b: glDashMatrixLib.glDashMatrixMod.quat
  ): glDashMatrixLib.glDashMatrixMod.quat = js.native
  /**
    * Normalize a quat
    *
    * @param out the receiving quaternion
    * @param a quaternion to normalize
    * @returns out
    * @function
    */
  def normalize(out: glDashMatrixLib.glDashMatrixMod.quat, a: glDashMatrixLib.glDashMatrixMod.quat): glDashMatrixLib.glDashMatrixMod.quat = js.native
  /**
    * Rotates a quaternion by the given angle about the X axis
    *
    * @param out quat receiving operation result
    * @param a quat to rotate
    * @param rad angle (in radians) to rotate
    * @returns out
    */
  def rotateX(
    out: glDashMatrixLib.glDashMatrixMod.quat,
    a: glDashMatrixLib.glDashMatrixMod.quat,
    rad: scala.Double
  ): glDashMatrixLib.glDashMatrixMod.quat = js.native
  /**
    * Rotates a quaternion by the given angle about the Y axis
    *
    * @param out quat receiving operation result
    * @param a quat to rotate
    * @param rad angle (in radians) to rotate
    * @returns out
    */
  def rotateY(
    out: glDashMatrixLib.glDashMatrixMod.quat,
    a: glDashMatrixLib.glDashMatrixMod.quat,
    rad: scala.Double
  ): glDashMatrixLib.glDashMatrixMod.quat = js.native
  /**
    * Rotates a quaternion by the given angle about the Z axis
    *
    * @param out quat receiving operation result
    * @param a quat to rotate
    * @param rad angle (in radians) to rotate
    * @returns out
    */
  def rotateZ(
    out: glDashMatrixLib.glDashMatrixMod.quat,
    a: glDashMatrixLib.glDashMatrixMod.quat,
    rad: scala.Double
  ): glDashMatrixLib.glDashMatrixMod.quat = js.native
  /**
    * Sets a quaternion to represent the shortest rotation from one
    * vector to another.
    *
    * Both vectors are assumed to be unit length.
    *
    * @param {quat} out the receiving quaternion.
    * @param {vec3} a the initial vector
    * @param {vec3} b the destination vector
    * @returns {quat} out
    */
  def rotationTo(
    out: glDashMatrixLib.glDashMatrixMod.quat,
    a: glDashMatrixLib.glDashMatrixMod.vec3,
    b: glDashMatrixLib.glDashMatrixMod.vec3
  ): glDashMatrixLib.glDashMatrixMod.quat = js.native
  def rotationTo(
    out: glDashMatrixLib.glDashMatrixMod.quat,
    a: glDashMatrixLib.glDashMatrixMod.vec3,
    b: js.Array[scala.Double]
  ): glDashMatrixLib.glDashMatrixMod.quat = js.native
  def rotationTo(
    out: glDashMatrixLib.glDashMatrixMod.quat,
    a: js.Array[scala.Double],
    b: glDashMatrixLib.glDashMatrixMod.vec3
  ): glDashMatrixLib.glDashMatrixMod.quat = js.native
  def rotationTo(out: glDashMatrixLib.glDashMatrixMod.quat, a: js.Array[scala.Double], b: js.Array[scala.Double]): glDashMatrixLib.glDashMatrixMod.quat = js.native
  /**
    * Scales a quat by a scalar number
    *
    * @param out the receiving vector
    * @param a the vector to scale
    * @param b amount to scale the vector by
    * @returns out
    * @function
    */
  def scale(
    out: glDashMatrixLib.glDashMatrixMod.quat,
    a: glDashMatrixLib.glDashMatrixMod.quat,
    b: scala.Double
  ): glDashMatrixLib.glDashMatrixMod.quat = js.native
  /**
    * Set the components of a quat to the given values
    *
    * @param out the receiving quaternion
    * @param x X component
    * @param y Y component
    * @param z Z component
    * @param w W component
    * @returns out
    * @function
    */
  def set(
    out: glDashMatrixLib.glDashMatrixMod.quat,
    x: scala.Double,
    y: scala.Double,
    z: scala.Double,
    w: scala.Double
  ): glDashMatrixLib.glDashMatrixMod.quat = js.native
  /**
    * Sets the specified quaternion with values corresponding to the given
    * axes. Each axis is a vec3 and is expected to be unit length and
    * perpendicular to all other specified axes.
    *
    * @param {vec3} view  the vector representing the viewing direction
    * @param {vec3} right the vector representing the local "right" direction
    * @param {vec3} up    the vector representing the local "up" direction
    * @returns {quat} out
    */
  def setAxes(
    out: glDashMatrixLib.glDashMatrixMod.quat,
    view: glDashMatrixLib.glDashMatrixMod.vec3,
    right: glDashMatrixLib.glDashMatrixMod.vec3,
    up: glDashMatrixLib.glDashMatrixMod.vec3
  ): glDashMatrixLib.glDashMatrixMod.quat = js.native
  def setAxes(
    out: glDashMatrixLib.glDashMatrixMod.quat,
    view: glDashMatrixLib.glDashMatrixMod.vec3,
    right: glDashMatrixLib.glDashMatrixMod.vec3,
    up: js.Array[scala.Double]
  ): glDashMatrixLib.glDashMatrixMod.quat = js.native
  def setAxes(
    out: glDashMatrixLib.glDashMatrixMod.quat,
    view: glDashMatrixLib.glDashMatrixMod.vec3,
    right: js.Array[scala.Double],
    up: glDashMatrixLib.glDashMatrixMod.vec3
  ): glDashMatrixLib.glDashMatrixMod.quat = js.native
  def setAxes(
    out: glDashMatrixLib.glDashMatrixMod.quat,
    view: glDashMatrixLib.glDashMatrixMod.vec3,
    right: js.Array[scala.Double],
    up: js.Array[scala.Double]
  ): glDashMatrixLib.glDashMatrixMod.quat = js.native
  def setAxes(
    out: glDashMatrixLib.glDashMatrixMod.quat,
    view: js.Array[scala.Double],
    right: glDashMatrixLib.glDashMatrixMod.vec3,
    up: glDashMatrixLib.glDashMatrixMod.vec3
  ): glDashMatrixLib.glDashMatrixMod.quat = js.native
  def setAxes(
    out: glDashMatrixLib.glDashMatrixMod.quat,
    view: js.Array[scala.Double],
    right: glDashMatrixLib.glDashMatrixMod.vec3,
    up: js.Array[scala.Double]
  ): glDashMatrixLib.glDashMatrixMod.quat = js.native
  def setAxes(
    out: glDashMatrixLib.glDashMatrixMod.quat,
    view: js.Array[scala.Double],
    right: js.Array[scala.Double],
    up: glDashMatrixLib.glDashMatrixMod.vec3
  ): glDashMatrixLib.glDashMatrixMod.quat = js.native
  def setAxes(
    out: glDashMatrixLib.glDashMatrixMod.quat,
    view: js.Array[scala.Double],
    right: js.Array[scala.Double],
    up: js.Array[scala.Double]
  ): glDashMatrixLib.glDashMatrixMod.quat = js.native
  /**
    * Sets a quat from the given angle and rotation axis,
    * then returns it.
    *
    * @param out the receiving quaternion
    * @param axis the axis around which to rotate
    * @param rad the angle in radians
    * @returns out
    **/
  def setAxisAngle(
    out: glDashMatrixLib.glDashMatrixMod.quat,
    axis: glDashMatrixLib.glDashMatrixMod.vec3,
    rad: scala.Double
  ): glDashMatrixLib.glDashMatrixMod.quat = js.native
  def setAxisAngle(out: glDashMatrixLib.glDashMatrixMod.quat, axis: js.Array[scala.Double], rad: scala.Double): glDashMatrixLib.glDashMatrixMod.quat = js.native
  /**
    * Performs a spherical linear interpolation between two quat
    *
    * @param out the receiving quaternion
    * @param a the first operand
    * @param b the second operand
    * @param t interpolation amount between the two inputs
    * @returns out
    */
  def slerp(
    out: glDashMatrixLib.glDashMatrixMod.quat,
    a: glDashMatrixLib.glDashMatrixMod.quat,
    b: glDashMatrixLib.glDashMatrixMod.quat,
    t: scala.Double
  ): glDashMatrixLib.glDashMatrixMod.quat = js.native
  /**
    * Performs a spherical linear interpolation with two control points
    *
    * @param {quat} out the receiving quaternion
    * @param {quat} a the first operand
    * @param {quat} b the second operand
    * @param {quat} c the third operand
    * @param {quat} d the fourth operand
    * @param {number} t interpolation amount
    * @returns {quat} out
    */
  def sqlerp(
    out: glDashMatrixLib.glDashMatrixMod.quat,
    a: glDashMatrixLib.glDashMatrixMod.quat,
    b: glDashMatrixLib.glDashMatrixMod.quat,
    c: glDashMatrixLib.glDashMatrixMod.quat,
    d: glDashMatrixLib.glDashMatrixMod.quat,
    t: scala.Double
  ): glDashMatrixLib.glDashMatrixMod.quat = js.native
  /**
    * Calculates the squared length of a quat
    *
    * @param a vector to calculate squared length of
    * @returns squared length of a
    * @function
    */
  def sqrLen(a: glDashMatrixLib.glDashMatrixMod.quat): scala.Double = js.native
  /**
    * Calculates the squared length of a quat
    *
    * @param a vector to calculate squared length of
    * @returns squared length of a
    * @function
    */
  def squaredLength(a: glDashMatrixLib.glDashMatrixMod.quat): scala.Double = js.native
  /**
    * Returns a string representation of a quaternion
    *
    * @param a quat to represent as a string
    * @returns string representation of the quat
    */
  def str(a: glDashMatrixLib.glDashMatrixMod.quat): java.lang.String = js.native
}

