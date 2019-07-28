package typings.glDashMatrix.srcGlDashMatrixMat4Mod

import typings.glDashMatrix.Anon_DownDegrees
import typings.glDashMatrix.glDashMatrixMod.mat4
import typings.glDashMatrix.glDashMatrixMod.quat
import typings.glDashMatrix.glDashMatrixMod.vec3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gl-matrix/src/gl-matrix/mat4", JSImport.Namespace)
@js.native
class ^ () extends mat4

@JSImport("gl-matrix/src/gl-matrix/mat4", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * Adds two mat4's
    *
    * @param {mat4} out the receiving matrix
    * @param {mat4} a the first operand
    * @param {mat4} b the second operand
    * @returns {mat4} out
    */
  def add(out: mat4, a: mat4, b: mat4): mat4 = js.native
  /**
    * Calculates the adjugate of a mat4
    *
    * @param out the receiving matrix
    * @param a the source matrix
    * @returns out
    */
  def adjoint(out: mat4, a: mat4): mat4 = js.native
  /**
    * Creates a new mat4 initialized with values from an existing matrix
    *
    * @param a matrix to clone
    * @returns a new 4x4 matrix
    */
  def clone(a: mat4): mat4 = js.native
  /**
    * Copy the values from one mat4 to another
    *
    * @param out the receiving matrix
    * @param a the source matrix
    * @returns out
    */
  def copy(out: mat4, a: mat4): mat4 = js.native
  /**
    * Creates a new identity mat4
    *
    * @returns a new 4x4 matrix
    */
  def create(): mat4 = js.native
  /**
    * Calculates the determinant of a mat4
    *
    * @param a the source matrix
    * @returns determinant of a
    */
  def determinant(a: mat4): Double = js.native
  /**
    * Returns whether or not the matrices have approximately the same elements in the same position.
    *
    * @param {mat4} a The first matrix.
    * @param {mat4} b The second matrix.
    * @returns {boolean} True if the matrices are equal, false otherwise.
    */
  def equals(a: mat4, b: mat4): Boolean = js.native
  /**
    * Returns whether or not the matrices have exactly the same elements in the same position (when compared with ===)
    *
    * @param {mat4} a The first matrix.
    * @param {mat4} b The second matrix.
    * @returns {boolean} True if the matrices are equal, false otherwise.
    */
  def exactEquals(a: mat4, b: mat4): Boolean = js.native
  /**
    * Returns Frobenius norm of a mat4
    *
    * @param a the matrix to calculate Frobenius norm of
    * @returns Frobenius norm
    */
  def frob(a: mat4): Double = js.native
  /**
    * Calculates a 4x4 matrix from the given quaternion
    *
    * @param {mat4} out mat4 receiving operation result
    * @param {quat} q Quaternion to create matrix from
    *
    * @returns {mat4} out
    */
  def fromQuat(out: mat4, q: quat): mat4 = js.native
  def fromRotation(out: mat4, rad: Double, axis: js.Array[Double]): mat4 = js.native
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
  def fromRotation(out: mat4, rad: Double, axis: vec3): mat4 = js.native
  def fromRotationTranslation(out: mat4, q: quat, v: js.Array[Double]): mat4 = js.native
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
  def fromRotationTranslation(out: mat4, q: quat, v: vec3): mat4 = js.native
  def fromRotationTranslationScale(out: mat4, q: quat, v: js.Array[Double], s: js.Array[Double]): mat4 = js.native
  def fromRotationTranslationScale(out: mat4, q: quat, v: js.Array[Double], s: vec3): mat4 = js.native
  def fromRotationTranslationScale(out: mat4, q: quat, v: vec3, s: js.Array[Double]): mat4 = js.native
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
  def fromRotationTranslationScale(out: mat4, q: quat, v: vec3, s: vec3): mat4 = js.native
  def fromRotationTranslationScaleOrigin(out: mat4, q: quat, v: js.Array[Double], s: js.Array[Double], o: js.Array[Double]): mat4 = js.native
  def fromRotationTranslationScaleOrigin(out: mat4, q: quat, v: js.Array[Double], s: js.Array[Double], o: vec3): mat4 = js.native
  def fromRotationTranslationScaleOrigin(out: mat4, q: quat, v: js.Array[Double], s: vec3, o: js.Array[Double]): mat4 = js.native
  def fromRotationTranslationScaleOrigin(out: mat4, q: quat, v: js.Array[Double], s: vec3, o: vec3): mat4 = js.native
  def fromRotationTranslationScaleOrigin(out: mat4, q: quat, v: vec3, s: js.Array[Double], o: js.Array[Double]): mat4 = js.native
  def fromRotationTranslationScaleOrigin(out: mat4, q: quat, v: vec3, s: js.Array[Double], o: vec3): mat4 = js.native
  def fromRotationTranslationScaleOrigin(out: mat4, q: quat, v: vec3, s: vec3, o: js.Array[Double]): mat4 = js.native
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
  def fromRotationTranslationScaleOrigin(out: mat4, q: quat, v: vec3, s: vec3, o: vec3): mat4 = js.native
  def fromScaling(out: mat4, v: js.Array[Double]): mat4 = js.native
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
  def fromScaling(out: mat4, v: vec3): mat4 = js.native
  def fromTranslation(out: mat4, v: js.Array[Double]): mat4 = js.native
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
  def fromTranslation(out: mat4, v: vec3): mat4 = js.native
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
    m00: Double,
    m01: Double,
    m02: Double,
    m03: Double,
    m10: Double,
    m11: Double,
    m12: Double,
    m13: Double,
    m20: Double,
    m21: Double,
    m22: Double,
    m23: Double,
    m30: Double,
    m31: Double,
    m32: Double,
    m33: Double
  ): mat4 = js.native
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
  def fromXRotation(out: mat4, rad: Double): mat4 = js.native
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
  def fromYRotation(out: mat4, rad: Double): mat4 = js.native
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
  def fromZRotation(out: mat4, rad: Double): mat4 = js.native
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
  def frustum(out: mat4, left: Double, right: Double, bottom: Double, top: Double, near: Double, far: Double): mat4 = js.native
  /**
    * Returns a quaternion representing the rotational component
    *  of a transformation matrix. If a matrix is built with
    *  fromRotationTranslation, the returned quaternion will be the
    *  same as the quaternion originally supplied.
    * @param {quat} out Quaternion to receive the rotation component
    * @param {mat4} mat Matrix to be decomposed (input)
    * @return {quat} out
    */
  def getRotation(out: quat, mat: mat4): quat = js.native
  /**
    * Returns the scaling factor component of a transformation matrix.
    * If a matrix is built with fromRotationTranslationScale with a
    * normalized Quaternion parameter, the returned vector will be
    * the same as the scaling vector originally supplied.
    * @param {vec3} out Vector to receive scaling factor component
    * @param {mat4} mat Matrix to be decomposed (input)
    * @return {vec3} out
    */
  def getScaling(out: vec3, mat: mat4): vec3 = js.native
  /**
    * Returns the translation vector component of a transformation
    *  matrix. If a matrix is built with fromRotationTranslation,
    *  the returned vector will be the same as the translation vector
    *  originally supplied.
    * @param  {vec3} out Vector to receive translation component
    * @param  {mat4} mat Matrix to be decomposed (input)
    * @return {vec3} out
    */
  def getTranslation(out: vec3, mat: mat4): vec3 = js.native
  /**
    * Set a mat4 to the identity matrix
    *
    * @param out the receiving matrix
    * @returns out
    */
  def identity(out: mat4): mat4 = js.native
  /**
    * Inverts a mat4
    *
    * @param out the receiving matrix
    * @param a the source matrix
    * @returns out
    */
  def invert(out: mat4, a: mat4): mat4 | Null = js.native
  def lookAt(out: mat4, eye: js.Array[Double], center: js.Array[Double], up: js.Array[Double]): mat4 = js.native
  def lookAt(out: mat4, eye: js.Array[Double], center: js.Array[Double], up: vec3): mat4 = js.native
  def lookAt(out: mat4, eye: js.Array[Double], center: vec3, up: js.Array[Double]): mat4 = js.native
  def lookAt(out: mat4, eye: js.Array[Double], center: vec3, up: vec3): mat4 = js.native
  def lookAt(out: mat4, eye: vec3, center: js.Array[Double], up: js.Array[Double]): mat4 = js.native
  def lookAt(out: mat4, eye: vec3, center: js.Array[Double], up: vec3): mat4 = js.native
  def lookAt(out: mat4, eye: vec3, center: vec3, up: js.Array[Double]): mat4 = js.native
  /**
    * Generates a look-at matrix with the given eye position, focal point, and up axis
    *
    * @param out mat4 frustum matrix will be written into
    * @param eye Position of the viewer
    * @param center Point the viewer is looking at
    * @param up vec3 pointing up
    * @returns out
    */
  def lookAt(out: mat4, eye: vec3, center: vec3, up: vec3): mat4 = js.native
  /**
    * Multiplies two mat4's
    *
    * @param out the receiving matrix
    * @param a the first operand
    * @param b the second operand
    * @returns out
    */
  def mul(out: mat4, a: mat4, b: mat4): mat4 = js.native
  /**
    * Multiplies two mat4's
    *
    * @param out the receiving matrix
    * @param a the first operand
    * @param b the second operand
    * @returns out
    */
  def multiply(out: mat4, a: mat4, b: mat4): mat4 = js.native
  /**
    * Multiply each element of the matrix by a scalar.
    *
    * @param {mat4} out the receiving matrix
    * @param {mat4} a the matrix to scale
    * @param {number} b amount to scale the matrix's elements by
    * @returns {mat4} out
    */
  def multiplyScalar(out: mat4, a: mat4, b: Double): mat4 = js.native
  /**
    * Adds two mat4's after multiplying each element of the second operand by a scalar value.
    *
    * @param {mat4} out the receiving vector
    * @param {mat4} a the first operand
    * @param {mat4} b the second operand
    * @param {number} scale the amount to scale b's elements by before adding
    * @returns {mat4} out
    */
  def multiplyScalarAndAdd(out: mat4, a: mat4, b: mat4, scale: Double): mat4 = js.native
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
  def ortho(out: mat4, left: Double, right: Double, bottom: Double, top: Double, near: Double, far: Double): mat4 = js.native
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
  def perspective(out: mat4, fovy: Double, aspect: Double, near: Double, far: Double): mat4 = js.native
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
  def perspectiveFromFieldOfView(out: mat4, fov: Anon_DownDegrees, near: Double, far: Double): mat4 = js.native
  def rotate(out: mat4, a: mat4, rad: Double, axis: js.Array[Double]): mat4 = js.native
  /**
    * Rotates a mat4 by the given angle
    *
    * @param out the receiving matrix
    * @param a the matrix to rotate
    * @param rad the angle to rotate the matrix by
    * @param axis the axis to rotate around
    * @returns out
    */
  def rotate(out: mat4, a: mat4, rad: Double, axis: vec3): mat4 = js.native
  /**
    * Rotates a matrix by the given angle around the X axis
    *
    * @param out the receiving matrix
    * @param a the matrix to rotate
    * @param rad the angle to rotate the matrix by
    * @returns out
    */
  def rotateX(out: mat4, a: mat4, rad: Double): mat4 = js.native
  /**
    * Rotates a matrix by the given angle around the Y axis
    *
    * @param out the receiving matrix
    * @param a the matrix to rotate
    * @param rad the angle to rotate the matrix by
    * @returns out
    */
  def rotateY(out: mat4, a: mat4, rad: Double): mat4 = js.native
  /**
    * Rotates a matrix by the given angle around the Z axis
    *
    * @param out the receiving matrix
    * @param a the matrix to rotate
    * @param rad the angle to rotate the matrix by
    * @returns out
    */
  def rotateZ(out: mat4, a: mat4, rad: Double): mat4 = js.native
  def scale(out: mat4, a: mat4, v: js.Array[Double]): mat4 = js.native
  /**
    * Scales the mat4 by the dimensions in the given vec3
    *
    * @param out the receiving matrix
    * @param a the matrix to scale
    * @param v the vec3 to scale the matrix by
    * @returns out
    **/
  def scale(out: mat4, a: mat4, v: vec3): mat4 = js.native
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
    out: mat4,
    m00: Double,
    m01: Double,
    m02: Double,
    m03: Double,
    m10: Double,
    m11: Double,
    m12: Double,
    m13: Double,
    m20: Double,
    m21: Double,
    m22: Double,
    m23: Double,
    m30: Double,
    m31: Double,
    m32: Double,
    m33: Double
  ): mat4 = js.native
  /**
    * Returns a string representation of a mat4
    *
    * @param mat matrix to represent as a string
    * @returns string representation of the matrix
    */
  def str(mat: mat4): String = js.native
  /**
    * Subtracts matrix b from matrix a
    *
    * @param {mat4} out the receiving matrix
    * @param {mat4} a the first operand
    * @param {mat4} b the second operand
    * @returns {mat4} out
    */
  def sub(out: mat4, a: mat4, b: mat4): mat4 = js.native
  /**
    * Subtracts matrix b from matrix a
    *
    * @param {mat4} out the receiving matrix
    * @param {mat4} a the first operand
    * @param {mat4} b the second operand
    * @returns {mat4} out
    */
  def subtract(out: mat4, a: mat4, b: mat4): mat4 = js.native
  def targetTo(out: mat4, eye: js.Array[Double], target: js.Array[Double], up: js.Array[Double]): mat4 = js.native
  def targetTo(out: mat4, eye: js.Array[Double], target: js.Array[Double], up: vec3): mat4 = js.native
  def targetTo(out: mat4, eye: js.Array[Double], target: vec3, up: js.Array[Double]): mat4 = js.native
  def targetTo(out: mat4, eye: js.Array[Double], target: vec3, up: vec3): mat4 = js.native
  def targetTo(out: mat4, eye: vec3, target: js.Array[Double], up: js.Array[Double]): mat4 = js.native
  def targetTo(out: mat4, eye: vec3, target: js.Array[Double], up: vec3): mat4 = js.native
  def targetTo(out: mat4, eye: vec3, target: vec3, up: js.Array[Double]): mat4 = js.native
  /**
    * Generates a matrix that makes something look at something else.
    *
    * @param out mat4 frustum matrix will be written into
    * @param eye Position of the viewer
    * @param target Point the viewer is looking at
    * @param up vec3 pointing up
    * @returns out
    */
  def targetTo(out: mat4, eye: vec3, target: vec3, up: vec3): mat4 = js.native
  def translate(out: mat4, a: mat4, v: js.Array[Double]): mat4 = js.native
  /**
    * Translate a mat4 by the given vector
    *
    * @param out the receiving matrix
    * @param a the matrix to translate
    * @param v vector to translate by
    * @returns out
    */
  def translate(out: mat4, a: mat4, v: vec3): mat4 = js.native
  /**
    * Transpose the values of a mat4
    *
    * @param out the receiving matrix
    * @param a the source matrix
    * @returns out
    */
  def transpose(out: mat4, a: mat4): mat4 = js.native
}

