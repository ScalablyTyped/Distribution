package typings
package glDashMatrixLib.glDashMatrixMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gl-matrix", "mat4")
@js.native
class mat4 ()
  extends stdLib.Float32Array {
  var typeMat4: scala.Double = js.native
}

@JSImport("gl-matrix", "mat4")
@js.native
object mat4 extends js.Object {
  /**
    * Adds two mat4's
    *
    * @param {mat4} out the receiving matrix
    * @param {mat4} a the first operand
    * @param {mat4} b the second operand
    * @returns {mat4} out
    */
  def add(
    out: glDashMatrixLib.glDashMatrixMod.mat4,
    a: glDashMatrixLib.glDashMatrixMod.mat4,
    b: glDashMatrixLib.glDashMatrixMod.mat4
  ): glDashMatrixLib.glDashMatrixMod.mat4 = js.native
  /**
    * Calculates the adjugate of a mat4
    *
    * @param out the receiving matrix
    * @param a the source matrix
    * @returns out
    */
  def adjoint(out: glDashMatrixLib.glDashMatrixMod.mat4, a: glDashMatrixLib.glDashMatrixMod.mat4): glDashMatrixLib.glDashMatrixMod.mat4 = js.native
  /**
    * Creates a new mat4 initialized with values from an existing matrix
    *
    * @param a matrix to clone
    * @returns a new 4x4 matrix
    */
  def clone(a: glDashMatrixLib.glDashMatrixMod.mat4): glDashMatrixLib.glDashMatrixMod.mat4 = js.native
  /**
    * Copy the values from one mat4 to another
    *
    * @param out the receiving matrix
    * @param a the source matrix
    * @returns out
    */
  def copy(out: glDashMatrixLib.glDashMatrixMod.mat4, a: glDashMatrixLib.glDashMatrixMod.mat4): glDashMatrixLib.glDashMatrixMod.mat4 = js.native
  /**
    * Creates a new identity mat4
    *
    * @returns a new 4x4 matrix
    */
  def create(): glDashMatrixLib.glDashMatrixMod.mat4 = js.native
  /**
    * Calculates the determinant of a mat4
    *
    * @param a the source matrix
    * @returns determinant of a
    */
  def determinant(a: glDashMatrixLib.glDashMatrixMod.mat4): scala.Double = js.native
  /**
    * Returns whether or not the matrices have approximately the same elements in the same position.
    *
    * @param {mat4} a The first matrix.
    * @param {mat4} b The second matrix.
    * @returns {boolean} True if the matrices are equal, false otherwise.
    */
  def equals(a: glDashMatrixLib.glDashMatrixMod.mat4, b: glDashMatrixLib.glDashMatrixMod.mat4): scala.Boolean = js.native
  /**
    * Returns whether or not the matrices have exactly the same elements in the same position (when compared with ===)
    *
    * @param {mat4} a The first matrix.
    * @param {mat4} b The second matrix.
    * @returns {boolean} True if the matrices are equal, false otherwise.
    */
  def exactEquals(a: glDashMatrixLib.glDashMatrixMod.mat4, b: glDashMatrixLib.glDashMatrixMod.mat4): scala.Boolean = js.native
  /**
    * Returns Frobenius norm of a mat4
    *
    * @param a the matrix to calculate Frobenius norm of
    * @returns Frobenius norm
    */
  def frob(a: glDashMatrixLib.glDashMatrixMod.mat4): scala.Double = js.native
  /**
    * Calculates a 4x4 matrix from the given quaternion
    *
    * @param {mat4} out mat4 receiving operation result
    * @param {quat} q Quaternion to create matrix from
    *
    * @returns {mat4} out
    */
  def fromQuat(out: glDashMatrixLib.glDashMatrixMod.mat4, q: glDashMatrixLib.glDashMatrixMod.quat): glDashMatrixLib.glDashMatrixMod.mat4 = js.native
  /**
    * Creates a matrix from a given angle around a given axis
    * This is equivalent to (but much faster than):
    *
    *     mat4.identity(dest);
    *     mat4.rotate(dest, dest, rad, axis);
    *
    * @param {mat4} out mat4 receiving operation result
    * @param {number} rad the angle to rotate the matrix by
    * @param {vec3} axis the axis to rotate around
    * @returns {mat4} out
    */
  def fromRotation(
    out: glDashMatrixLib.glDashMatrixMod.mat4,
    rad: scala.Double,
    axis: glDashMatrixLib.glDashMatrixMod.vec3
  ): glDashMatrixLib.glDashMatrixMod.mat4 = js.native
  def fromRotation(out: glDashMatrixLib.glDashMatrixMod.mat4, rad: scala.Double, axis: js.Array[scala.Double]): glDashMatrixLib.glDashMatrixMod.mat4 = js.native
  /**
    * Creates a matrix from a quaternion rotation and vector translation
    * This is equivalent to (but much faster than):
    *
    *     mat4.identity(dest);
    *     mat4.translate(dest, vec);
    *     var quatMat = mat4.create();
    *     quat4.toMat4(quat, quatMat);
    *     mat4.multiply(dest, quatMat);
    *
    * @param out mat4 receiving operation result
    * @param q Rotation quaternion
    * @param v Translation vector
    * @returns out
    */
  def fromRotationTranslation(
    out: glDashMatrixLib.glDashMatrixMod.mat4,
    q: glDashMatrixLib.glDashMatrixMod.quat,
    v: glDashMatrixLib.glDashMatrixMod.vec3
  ): glDashMatrixLib.glDashMatrixMod.mat4 = js.native
  def fromRotationTranslation(
    out: glDashMatrixLib.glDashMatrixMod.mat4,
    q: glDashMatrixLib.glDashMatrixMod.quat,
    v: js.Array[scala.Double]
  ): glDashMatrixLib.glDashMatrixMod.mat4 = js.native
  /**
    * Creates a matrix from a quaternion rotation, vector translation and vector scale
    * This is equivalent to (but much faster than):
    *
    *     mat4.identity(dest);
    *     mat4.translate(dest, vec);
    *     var quatMat = mat4.create();
    *     quat4.toMat4(quat, quatMat);
    *     mat4.multiply(dest, quatMat);
    *     mat4.scale(dest, scale)
    *
    * @param out mat4 receiving operation result
    * @param q Rotation quaternion
    * @param v Translation vector
    * @param s Scaling vector
    * @returns out
    */
  def fromRotationTranslationScale(
    out: glDashMatrixLib.glDashMatrixMod.mat4,
    q: glDashMatrixLib.glDashMatrixMod.quat,
    v: glDashMatrixLib.glDashMatrixMod.vec3,
    s: glDashMatrixLib.glDashMatrixMod.vec3
  ): glDashMatrixLib.glDashMatrixMod.mat4 = js.native
  def fromRotationTranslationScale(
    out: glDashMatrixLib.glDashMatrixMod.mat4,
    q: glDashMatrixLib.glDashMatrixMod.quat,
    v: glDashMatrixLib.glDashMatrixMod.vec3,
    s: js.Array[scala.Double]
  ): glDashMatrixLib.glDashMatrixMod.mat4 = js.native
  def fromRotationTranslationScale(
    out: glDashMatrixLib.glDashMatrixMod.mat4,
    q: glDashMatrixLib.glDashMatrixMod.quat,
    v: js.Array[scala.Double],
    s: glDashMatrixLib.glDashMatrixMod.vec3
  ): glDashMatrixLib.glDashMatrixMod.mat4 = js.native
  def fromRotationTranslationScale(
    out: glDashMatrixLib.glDashMatrixMod.mat4,
    q: glDashMatrixLib.glDashMatrixMod.quat,
    v: js.Array[scala.Double],
    s: js.Array[scala.Double]
  ): glDashMatrixLib.glDashMatrixMod.mat4 = js.native
  /**
    * Creates a matrix from a quaternion rotation, vector translation and vector scale, rotating and scaling around the given origin
    * This is equivalent to (but much faster than):
    *
    *     mat4.identity(dest);
    *     mat4.translate(dest, vec);
    *     mat4.translate(dest, origin);
    *     var quatMat = mat4.create();
    *     quat4.toMat4(quat, quatMat);
    *     mat4.multiply(dest, quatMat);
    *     mat4.scale(dest, scale)
    *     mat4.translate(dest, negativeOrigin);
    *
    * @param {mat4} out mat4 receiving operation result
    * @param {quat} q Rotation quaternion
    * @param {vec3} v Translation vector
    * @param {vec3} s Scaling vector
    * @param {vec3} o The origin vector around which to scale and rotate
    * @returns {mat4} out
    */
  def fromRotationTranslationScaleOrigin(
    out: glDashMatrixLib.glDashMatrixMod.mat4,
    q: glDashMatrixLib.glDashMatrixMod.quat,
    v: glDashMatrixLib.glDashMatrixMod.vec3,
    s: glDashMatrixLib.glDashMatrixMod.vec3,
    o: glDashMatrixLib.glDashMatrixMod.vec3
  ): glDashMatrixLib.glDashMatrixMod.mat4 = js.native
  def fromRotationTranslationScaleOrigin(
    out: glDashMatrixLib.glDashMatrixMod.mat4,
    q: glDashMatrixLib.glDashMatrixMod.quat,
    v: glDashMatrixLib.glDashMatrixMod.vec3,
    s: glDashMatrixLib.glDashMatrixMod.vec3,
    o: js.Array[scala.Double]
  ): glDashMatrixLib.glDashMatrixMod.mat4 = js.native
  def fromRotationTranslationScaleOrigin(
    out: glDashMatrixLib.glDashMatrixMod.mat4,
    q: glDashMatrixLib.glDashMatrixMod.quat,
    v: glDashMatrixLib.glDashMatrixMod.vec3,
    s: js.Array[scala.Double],
    o: glDashMatrixLib.glDashMatrixMod.vec3
  ): glDashMatrixLib.glDashMatrixMod.mat4 = js.native
  def fromRotationTranslationScaleOrigin(
    out: glDashMatrixLib.glDashMatrixMod.mat4,
    q: glDashMatrixLib.glDashMatrixMod.quat,
    v: glDashMatrixLib.glDashMatrixMod.vec3,
    s: js.Array[scala.Double],
    o: js.Array[scala.Double]
  ): glDashMatrixLib.glDashMatrixMod.mat4 = js.native
  def fromRotationTranslationScaleOrigin(
    out: glDashMatrixLib.glDashMatrixMod.mat4,
    q: glDashMatrixLib.glDashMatrixMod.quat,
    v: js.Array[scala.Double],
    s: glDashMatrixLib.glDashMatrixMod.vec3,
    o: glDashMatrixLib.glDashMatrixMod.vec3
  ): glDashMatrixLib.glDashMatrixMod.mat4 = js.native
  def fromRotationTranslationScaleOrigin(
    out: glDashMatrixLib.glDashMatrixMod.mat4,
    q: glDashMatrixLib.glDashMatrixMod.quat,
    v: js.Array[scala.Double],
    s: glDashMatrixLib.glDashMatrixMod.vec3,
    o: js.Array[scala.Double]
  ): glDashMatrixLib.glDashMatrixMod.mat4 = js.native
  def fromRotationTranslationScaleOrigin(
    out: glDashMatrixLib.glDashMatrixMod.mat4,
    q: glDashMatrixLib.glDashMatrixMod.quat,
    v: js.Array[scala.Double],
    s: js.Array[scala.Double],
    o: glDashMatrixLib.glDashMatrixMod.vec3
  ): glDashMatrixLib.glDashMatrixMod.mat4 = js.native
  def fromRotationTranslationScaleOrigin(
    out: glDashMatrixLib.glDashMatrixMod.mat4,
    q: glDashMatrixLib.glDashMatrixMod.quat,
    v: js.Array[scala.Double],
    s: js.Array[scala.Double],
    o: js.Array[scala.Double]
  ): glDashMatrixLib.glDashMatrixMod.mat4 = js.native
  /**
    * Creates a matrix from a vector scaling
    * This is equivalent to (but much faster than):
    *
    *     mat4.identity(dest);
    *     mat4.scale(dest, dest, vec);
    *
    * @param {mat4} out mat4 receiving operation result
    * @param {vec3} v Scaling vector
    * @returns {mat4} out
    */
  def fromScaling(out: glDashMatrixLib.glDashMatrixMod.mat4, v: glDashMatrixLib.glDashMatrixMod.vec3): glDashMatrixLib.glDashMatrixMod.mat4 = js.native
  def fromScaling(out: glDashMatrixLib.glDashMatrixMod.mat4, v: js.Array[scala.Double]): glDashMatrixLib.glDashMatrixMod.mat4 = js.native
  /**
    * Creates a matrix from a vector translation
    * This is equivalent to (but much faster than):
    *
    *     mat4.identity(dest);
    *     mat4.translate(dest, dest, vec);
    *
    * @param {mat4} out mat4 receiving operation result
    * @param {vec3} v Translation vector
    * @returns {mat4} out
    */
  def fromTranslation(out: glDashMatrixLib.glDashMatrixMod.mat4, v: glDashMatrixLib.glDashMatrixMod.vec3): glDashMatrixLib.glDashMatrixMod.mat4 = js.native
  def fromTranslation(out: glDashMatrixLib.glDashMatrixMod.mat4, v: js.Array[scala.Double]): glDashMatrixLib.glDashMatrixMod.mat4 = js.native
  /**
    * Create a new mat4 with the given values
    *
    * @param {number} m00 Component in column 0, row 0 position (index 0)
    * @param {number} m01 Component in column 0, row 1 position (index 1)
    * @param {number} m02 Component in column 0, row 2 position (index 2)
    * @param {number} m03 Component in column 0, row 3 position (index 3)
    * @param {number} m10 Component in column 1, row 0 position (index 4)
    * @param {number} m11 Component in column 1, row 1 position (index 5)
    * @param {number} m12 Component in column 1, row 2 position (index 6)
    * @param {number} m13 Component in column 1, row 3 position (index 7)
    * @param {number} m20 Component in column 2, row 0 position (index 8)
    * @param {number} m21 Component in column 2, row 1 position (index 9)
    * @param {number} m22 Component in column 2, row 2 position (index 10)
    * @param {number} m23 Component in column 2, row 3 position (index 11)
    * @param {number} m30 Component in column 3, row 0 position (index 12)
    * @param {number} m31 Component in column 3, row 1 position (index 13)
    * @param {number} m32 Component in column 3, row 2 position (index 14)
    * @param {number} m33 Component in column 3, row 3 position (index 15)
    * @returns {mat4} A new mat4
    */
  def fromValues(
    m00: scala.Double,
    m01: scala.Double,
    m02: scala.Double,
    m03: scala.Double,
    m10: scala.Double,
    m11: scala.Double,
    m12: scala.Double,
    m13: scala.Double,
    m20: scala.Double,
    m21: scala.Double,
    m22: scala.Double,
    m23: scala.Double,
    m30: scala.Double,
    m31: scala.Double,
    m32: scala.Double,
    m33: scala.Double
  ): glDashMatrixLib.glDashMatrixMod.mat4 = js.native
  /**
    * Creates a matrix from the given angle around the X axis
    * This is equivalent to (but much faster than):
    *
    *     mat4.identity(dest);
    *     mat4.rotateX(dest, dest, rad);
    *
    * @param {mat4} out mat4 receiving operation result
    * @param {number} rad the angle to rotate the matrix by
    * @returns {mat4} out
    */
  def fromXRotation(out: glDashMatrixLib.glDashMatrixMod.mat4, rad: scala.Double): glDashMatrixLib.glDashMatrixMod.mat4 = js.native
  /**
    * Creates a matrix from the given angle around the Y axis
    * This is equivalent to (but much faster than):
    *
    *     mat4.identity(dest);
    *     mat4.rotateY(dest, dest, rad);
    *
    * @param {mat4} out mat4 receiving operation result
    * @param {number} rad the angle to rotate the matrix by
    * @returns {mat4} out
    */
  def fromYRotation(out: glDashMatrixLib.glDashMatrixMod.mat4, rad: scala.Double): glDashMatrixLib.glDashMatrixMod.mat4 = js.native
  /**
    * Creates a matrix from the given angle around the Z axis
    * This is equivalent to (but much faster than):
    *
    *     mat4.identity(dest);
    *     mat4.rotateZ(dest, dest, rad);
    *
    * @param {mat4} out mat4 receiving operation result
    * @param {number} rad the angle to rotate the matrix by
    * @returns {mat4} out
    */
  def fromZRotation(out: glDashMatrixLib.glDashMatrixMod.mat4, rad: scala.Double): glDashMatrixLib.glDashMatrixMod.mat4 = js.native
  /**
    * Generates a frustum matrix with the given bounds
    *
    * @param out mat4 frustum matrix will be written into
    * @param left Left bound of the frustum
    * @param right Right bound of the frustum
    * @param bottom Bottom bound of the frustum
    * @param top Top bound of the frustum
    * @param near Near bound of the frustum
    * @param far Far bound of the frustum
    * @returns out
    */
  def frustum(
    out: glDashMatrixLib.glDashMatrixMod.mat4,
    left: scala.Double,
    right: scala.Double,
    bottom: scala.Double,
    top: scala.Double,
    near: scala.Double,
    far: scala.Double
  ): glDashMatrixLib.glDashMatrixMod.mat4 = js.native
  /**
    * Returns a quaternion representing the rotational component
    *  of a transformation matrix. If a matrix is built with
    *  fromRotationTranslation, the returned quaternion will be the
    *  same as the quaternion originally supplied.
    * @param {quat} out Quaternion to receive the rotation component
    * @param {mat4} mat Matrix to be decomposed (input)
    * @return {quat} out
    */
  def getRotation(out: glDashMatrixLib.glDashMatrixMod.quat, mat: glDashMatrixLib.glDashMatrixMod.mat4): glDashMatrixLib.glDashMatrixMod.quat = js.native
  /**
    * Returns the scaling factor component of a transformation matrix.
    * If a matrix is built with fromRotationTranslationScale with a
    * normalized Quaternion parameter, the returned vector will be
    * the same as the scaling vector originally supplied.
    * @param {vec3} out Vector to receive scaling factor component
    * @param {mat4} mat Matrix to be decomposed (input)
    * @return {vec3} out
    */
  def getScaling(out: glDashMatrixLib.glDashMatrixMod.vec3, mat: glDashMatrixLib.glDashMatrixMod.mat4): glDashMatrixLib.glDashMatrixMod.vec3 = js.native
  /**
    * Returns the translation vector component of a transformation
    *  matrix. If a matrix is built with fromRotationTranslation,
    *  the returned vector will be the same as the translation vector
    *  originally supplied.
    * @param  {vec3} out Vector to receive translation component
    * @param  {mat4} mat Matrix to be decomposed (input)
    * @return {vec3} out
    */
  def getTranslation(out: glDashMatrixLib.glDashMatrixMod.vec3, mat: glDashMatrixLib.glDashMatrixMod.mat4): glDashMatrixLib.glDashMatrixMod.vec3 = js.native
  /**
    * Set a mat4 to the identity matrix
    *
    * @param out the receiving matrix
    * @returns out
    */
  def identity(out: glDashMatrixLib.glDashMatrixMod.mat4): glDashMatrixLib.glDashMatrixMod.mat4 = js.native
  /**
    * Inverts a mat4
    *
    * @param out the receiving matrix
    * @param a the source matrix
    * @returns out
    */
  def invert(out: glDashMatrixLib.glDashMatrixMod.mat4, a: glDashMatrixLib.glDashMatrixMod.mat4): glDashMatrixLib.glDashMatrixMod.mat4 | scala.Null = js.native
  /**
    * Generates a look-at matrix with the given eye position, focal point, and up axis
    *
    * @param out mat4 frustum matrix will be written into
    * @param eye Position of the viewer
    * @param center Point the viewer is looking at
    * @param up vec3 pointing up
    * @returns out
    */
  def lookAt(
    out: glDashMatrixLib.glDashMatrixMod.mat4,
    eye: glDashMatrixLib.glDashMatrixMod.vec3,
    center: glDashMatrixLib.glDashMatrixMod.vec3,
    up: glDashMatrixLib.glDashMatrixMod.vec3
  ): glDashMatrixLib.glDashMatrixMod.mat4 = js.native
  def lookAt(
    out: glDashMatrixLib.glDashMatrixMod.mat4,
    eye: glDashMatrixLib.glDashMatrixMod.vec3,
    center: glDashMatrixLib.glDashMatrixMod.vec3,
    up: js.Array[scala.Double]
  ): glDashMatrixLib.glDashMatrixMod.mat4 = js.native
  def lookAt(
    out: glDashMatrixLib.glDashMatrixMod.mat4,
    eye: glDashMatrixLib.glDashMatrixMod.vec3,
    center: js.Array[scala.Double],
    up: glDashMatrixLib.glDashMatrixMod.vec3
  ): glDashMatrixLib.glDashMatrixMod.mat4 = js.native
  def lookAt(
    out: glDashMatrixLib.glDashMatrixMod.mat4,
    eye: glDashMatrixLib.glDashMatrixMod.vec3,
    center: js.Array[scala.Double],
    up: js.Array[scala.Double]
  ): glDashMatrixLib.glDashMatrixMod.mat4 = js.native
  def lookAt(
    out: glDashMatrixLib.glDashMatrixMod.mat4,
    eye: js.Array[scala.Double],
    center: glDashMatrixLib.glDashMatrixMod.vec3,
    up: glDashMatrixLib.glDashMatrixMod.vec3
  ): glDashMatrixLib.glDashMatrixMod.mat4 = js.native
  def lookAt(
    out: glDashMatrixLib.glDashMatrixMod.mat4,
    eye: js.Array[scala.Double],
    center: glDashMatrixLib.glDashMatrixMod.vec3,
    up: js.Array[scala.Double]
  ): glDashMatrixLib.glDashMatrixMod.mat4 = js.native
  def lookAt(
    out: glDashMatrixLib.glDashMatrixMod.mat4,
    eye: js.Array[scala.Double],
    center: js.Array[scala.Double],
    up: glDashMatrixLib.glDashMatrixMod.vec3
  ): glDashMatrixLib.glDashMatrixMod.mat4 = js.native
  def lookAt(
    out: glDashMatrixLib.glDashMatrixMod.mat4,
    eye: js.Array[scala.Double],
    center: js.Array[scala.Double],
    up: js.Array[scala.Double]
  ): glDashMatrixLib.glDashMatrixMod.mat4 = js.native
  /**
    * Multiplies two mat4's
    *
    * @param out the receiving matrix
    * @param a the first operand
    * @param b the second operand
    * @returns out
    */
  def mul(
    out: glDashMatrixLib.glDashMatrixMod.mat4,
    a: glDashMatrixLib.glDashMatrixMod.mat4,
    b: glDashMatrixLib.glDashMatrixMod.mat4
  ): glDashMatrixLib.glDashMatrixMod.mat4 = js.native
  /**
    * Multiplies two mat4's
    *
    * @param out the receiving matrix
    * @param a the first operand
    * @param b the second operand
    * @returns out
    */
  def multiply(
    out: glDashMatrixLib.glDashMatrixMod.mat4,
    a: glDashMatrixLib.glDashMatrixMod.mat4,
    b: glDashMatrixLib.glDashMatrixMod.mat4
  ): glDashMatrixLib.glDashMatrixMod.mat4 = js.native
  /**
    * Multiply each element of the matrix by a scalar.
    *
    * @param {mat4} out the receiving matrix
    * @param {mat4} a the matrix to scale
    * @param {number} b amount to scale the matrix's elements by
    * @returns {mat4} out
    */
  def multiplyScalar(
    out: glDashMatrixLib.glDashMatrixMod.mat4,
    a: glDashMatrixLib.glDashMatrixMod.mat4,
    b: scala.Double
  ): glDashMatrixLib.glDashMatrixMod.mat4 = js.native
  /**
    * Adds two mat4's after multiplying each element of the second operand by a scalar value.
    *
    * @param {mat4} out the receiving vector
    * @param {mat4} a the first operand
    * @param {mat4} b the second operand
    * @param {number} scale the amount to scale b's elements by before adding
    * @returns {mat4} out
    */
  def multiplyScalarAndAdd(
    out: glDashMatrixLib.glDashMatrixMod.mat4,
    a: glDashMatrixLib.glDashMatrixMod.mat4,
    b: glDashMatrixLib.glDashMatrixMod.mat4,
    scale: scala.Double
  ): glDashMatrixLib.glDashMatrixMod.mat4 = js.native
  /**
    * Generates a orthogonal projection matrix with the given bounds
    *
    * @param out mat4 frustum matrix will be written into
    * @param left Left bound of the frustum
    * @param right Right bound of the frustum
    * @param bottom Bottom bound of the frustum
    * @param top Top bound of the frustum
    * @param near Near bound of the frustum
    * @param far Far bound of the frustum
    * @returns out
    */
  def ortho(
    out: glDashMatrixLib.glDashMatrixMod.mat4,
    left: scala.Double,
    right: scala.Double,
    bottom: scala.Double,
    top: scala.Double,
    near: scala.Double,
    far: scala.Double
  ): glDashMatrixLib.glDashMatrixMod.mat4 = js.native
  /**
    * Generates a perspective projection matrix with the given bounds
    *
    * @param out mat4 frustum matrix will be written into
    * @param fovy Vertical field of view in radians
    * @param aspect Aspect ratio. typically viewport width/height
    * @param near Near bound of the frustum
    * @param far Far bound of the frustum
    * @returns out
    */
  def perspective(
    out: glDashMatrixLib.glDashMatrixMod.mat4,
    fovy: scala.Double,
    aspect: scala.Double,
    near: scala.Double,
    far: scala.Double
  ): glDashMatrixLib.glDashMatrixMod.mat4 = js.native
  /**
    * Generates a perspective projection matrix with the given field of view.
    * This is primarily useful for generating projection matrices to be used
    * with the still experimental WebVR API.
    *
    * @param {mat4} out mat4 frustum matrix will be written into
    * @param {Object} fov Object containing the following values: upDegrees, downDegrees, leftDegrees, rightDegrees
    * @param {number} near Near bound of the frustum
    * @param {number} far Far bound of the frustum
    * @returns {mat4} out
    */
  def perspectiveFromFieldOfView(
    out: glDashMatrixLib.glDashMatrixMod.mat4,
    fov: glDashMatrixLib.Anon_DownDegrees,
    near: scala.Double,
    far: scala.Double
  ): glDashMatrixLib.glDashMatrixMod.mat4 = js.native
  /**
    * Rotates a mat4 by the given angle
    *
    * @param out the receiving matrix
    * @param a the matrix to rotate
    * @param rad the angle to rotate the matrix by
    * @param axis the axis to rotate around
    * @returns out
    */
  def rotate(
    out: glDashMatrixLib.glDashMatrixMod.mat4,
    a: glDashMatrixLib.glDashMatrixMod.mat4,
    rad: scala.Double,
    axis: glDashMatrixLib.glDashMatrixMod.vec3
  ): glDashMatrixLib.glDashMatrixMod.mat4 = js.native
  def rotate(
    out: glDashMatrixLib.glDashMatrixMod.mat4,
    a: glDashMatrixLib.glDashMatrixMod.mat4,
    rad: scala.Double,
    axis: js.Array[scala.Double]
  ): glDashMatrixLib.glDashMatrixMod.mat4 = js.native
  /**
    * Rotates a matrix by the given angle around the X axis
    *
    * @param out the receiving matrix
    * @param a the matrix to rotate
    * @param rad the angle to rotate the matrix by
    * @returns out
    */
  def rotateX(
    out: glDashMatrixLib.glDashMatrixMod.mat4,
    a: glDashMatrixLib.glDashMatrixMod.mat4,
    rad: scala.Double
  ): glDashMatrixLib.glDashMatrixMod.mat4 = js.native
  /**
    * Rotates a matrix by the given angle around the Y axis
    *
    * @param out the receiving matrix
    * @param a the matrix to rotate
    * @param rad the angle to rotate the matrix by
    * @returns out
    */
  def rotateY(
    out: glDashMatrixLib.glDashMatrixMod.mat4,
    a: glDashMatrixLib.glDashMatrixMod.mat4,
    rad: scala.Double
  ): glDashMatrixLib.glDashMatrixMod.mat4 = js.native
  /**
    * Rotates a matrix by the given angle around the Z axis
    *
    * @param out the receiving matrix
    * @param a the matrix to rotate
    * @param rad the angle to rotate the matrix by
    * @returns out
    */
  def rotateZ(
    out: glDashMatrixLib.glDashMatrixMod.mat4,
    a: glDashMatrixLib.glDashMatrixMod.mat4,
    rad: scala.Double
  ): glDashMatrixLib.glDashMatrixMod.mat4 = js.native
  /**
    * Scales the mat4 by the dimensions in the given vec3
    *
    * @param out the receiving matrix
    * @param a the matrix to scale
    * @param v the vec3 to scale the matrix by
    * @returns out
    **/
  def scale(
    out: glDashMatrixLib.glDashMatrixMod.mat4,
    a: glDashMatrixLib.glDashMatrixMod.mat4,
    v: glDashMatrixLib.glDashMatrixMod.vec3
  ): glDashMatrixLib.glDashMatrixMod.mat4 = js.native
  def scale(
    out: glDashMatrixLib.glDashMatrixMod.mat4,
    a: glDashMatrixLib.glDashMatrixMod.mat4,
    v: js.Array[scala.Double]
  ): glDashMatrixLib.glDashMatrixMod.mat4 = js.native
  /**
    * Set the components of a mat4 to the given values
    *
    * @param {mat4} out the receiving matrix
    * @param {number} m00 Component in column 0, row 0 position (index 0)
    * @param {number} m01 Component in column 0, row 1 position (index 1)
    * @param {number} m02 Component in column 0, row 2 position (index 2)
    * @param {number} m03 Component in column 0, row 3 position (index 3)
    * @param {number} m10 Component in column 1, row 0 position (index 4)
    * @param {number} m11 Component in column 1, row 1 position (index 5)
    * @param {number} m12 Component in column 1, row 2 position (index 6)
    * @param {number} m13 Component in column 1, row 3 position (index 7)
    * @param {number} m20 Component in column 2, row 0 position (index 8)
    * @param {number} m21 Component in column 2, row 1 position (index 9)
    * @param {number} m22 Component in column 2, row 2 position (index 10)
    * @param {number} m23 Component in column 2, row 3 position (index 11)
    * @param {number} m30 Component in column 3, row 0 position (index 12)
    * @param {number} m31 Component in column 3, row 1 position (index 13)
    * @param {number} m32 Component in column 3, row 2 position (index 14)
    * @param {number} m33 Component in column 3, row 3 position (index 15)
    * @returns {mat4} out
    */
  def set(
    out: glDashMatrixLib.glDashMatrixMod.mat4,
    m00: scala.Double,
    m01: scala.Double,
    m02: scala.Double,
    m03: scala.Double,
    m10: scala.Double,
    m11: scala.Double,
    m12: scala.Double,
    m13: scala.Double,
    m20: scala.Double,
    m21: scala.Double,
    m22: scala.Double,
    m23: scala.Double,
    m30: scala.Double,
    m31: scala.Double,
    m32: scala.Double,
    m33: scala.Double
  ): glDashMatrixLib.glDashMatrixMod.mat4 = js.native
  /**
    * Returns a string representation of a mat4
    *
    * @param mat matrix to represent as a string
    * @returns string representation of the matrix
    */
  def str(mat: glDashMatrixLib.glDashMatrixMod.mat4): java.lang.String = js.native
  /**
    * Subtracts matrix b from matrix a
    *
    * @param {mat4} out the receiving matrix
    * @param {mat4} a the first operand
    * @param {mat4} b the second operand
    * @returns {mat4} out
    */
  def sub(
    out: glDashMatrixLib.glDashMatrixMod.mat4,
    a: glDashMatrixLib.glDashMatrixMod.mat4,
    b: glDashMatrixLib.glDashMatrixMod.mat4
  ): glDashMatrixLib.glDashMatrixMod.mat4 = js.native
  /**
    * Subtracts matrix b from matrix a
    *
    * @param {mat4} out the receiving matrix
    * @param {mat4} a the first operand
    * @param {mat4} b the second operand
    * @returns {mat4} out
    */
  def subtract(
    out: glDashMatrixLib.glDashMatrixMod.mat4,
    a: glDashMatrixLib.glDashMatrixMod.mat4,
    b: glDashMatrixLib.glDashMatrixMod.mat4
  ): glDashMatrixLib.glDashMatrixMod.mat4 = js.native
  /**
    * Translate a mat4 by the given vector
    *
    * @param out the receiving matrix
    * @param a the matrix to translate
    * @param v vector to translate by
    * @returns out
    */
  def translate(
    out: glDashMatrixLib.glDashMatrixMod.mat4,
    a: glDashMatrixLib.glDashMatrixMod.mat4,
    v: glDashMatrixLib.glDashMatrixMod.vec3
  ): glDashMatrixLib.glDashMatrixMod.mat4 = js.native
  def translate(
    out: glDashMatrixLib.glDashMatrixMod.mat4,
    a: glDashMatrixLib.glDashMatrixMod.mat4,
    v: js.Array[scala.Double]
  ): glDashMatrixLib.glDashMatrixMod.mat4 = js.native
  /**
    * Transpose the values of a mat4
    *
    * @param out the receiving matrix
    * @param a the source matrix
    * @returns out
    */
  def transpose(out: glDashMatrixLib.glDashMatrixMod.mat4, a: glDashMatrixLib.glDashMatrixMod.mat4): glDashMatrixLib.glDashMatrixMod.mat4 = js.native
}

