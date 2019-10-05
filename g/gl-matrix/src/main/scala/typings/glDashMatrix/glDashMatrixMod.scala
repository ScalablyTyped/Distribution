package typings.glDashMatrix

import typings.glDashMatrix.glDashMatrixMod.mat2
import typings.glDashMatrix.glDashMatrixMod.mat2d
import typings.glDashMatrix.glDashMatrixMod.mat3
import typings.glDashMatrix.glDashMatrixMod.mat4
import typings.glDashMatrix.glDashMatrixMod.quat
import typings.glDashMatrix.glDashMatrixMod.vec2
import typings.glDashMatrix.glDashMatrixMod.vec3
import typings.glDashMatrix.glDashMatrixMod.vec4
import typings.std.Float32Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gl-matrix", JSImport.Namespace)
@js.native
object glDashMatrixMod extends js.Object {
  @js.native
  class glMatrix () extends js.Object
  
  @js.native
  class mat2 () extends Float32Array {
    var typeMat2: Double = js.native
  }
  
  @js.native
  class mat2d () extends Float32Array {
    var typeMat2d: Double = js.native
  }
  
  @js.native
  class mat3 () extends Float32Array {
    var typeMat3: Double = js.native
  }
  
  @js.native
  class mat4 () extends Float32Array {
    var typeMat4: Double = js.native
  }
  
  @js.native
  class quat () extends Float32Array {
    var typeQuat: Double = js.native
  }
  
  @js.native
  class vec2 () extends Float32Array {
    var typeVec2: Double = js.native
  }
  
  @js.native
  class vec3 () extends Float32Array {
    var typeVec3: Double = js.native
  }
  
  @js.native
  class vec4 () extends Float32Array {
    var typeVec3: Double = js.native
  }
  
  /* static members */
  @js.native
  object glMatrix extends js.Object {
    var ARRAY_TYPE: js.Any = js.native
    var ENABLE_SIMD: Boolean = js.native
    // Configuration constants
    var EPSILON: Double = js.native
    // Compatibility detection
    var SIMD_AVAILABLE: Boolean = js.native
    var USE_SIMD: Boolean = js.native
    def RANDOM(): Double = js.native
    /**
      * Tests whether or not the arguments have approximately the same value, within an absolute
      * or relative tolerance of glMatrix.EPSILON (an absolute tolerance is used for values less
      * than or equal to 1.0, and a relative tolerance is used for larger values)
      *
      * @param {number} a - The first number to test.
      * @param {number} b - The second number to test.
      * @returns {boolean} True if the numbers are approximately equal, false otherwise.
      */
    def equals(a: Double, b: Double): Boolean = js.native
    /**
      * Sets the type of array used when creating new vectors and matrices
      *
      * @param {any} type - Array type, such as Float32Array or Array
      */
    def setMatrixArrayType(`type`: js.Any): Unit = js.native
    /**
      * Convert Degree To Radian
      *
      * @param {number} a - Angle in Degrees
      */
    def toRadian(a: Double): Double = js.native
  }
  
  /* static members */
  @js.native
  object mat2 extends js.Object {
    /**
      * Returns L, D and U matrices (Lower triangular, Diagonal and Upper triangular) by factorizing the input matrix
      * @param L the lower triangular matrix
      * @param D the diagonal matrix
      * @param U the upper triangular matrix
      * @param a the input matrix to factorize
      */
    def LDU(L: mat2, D: mat2, U: mat2, a: mat2): mat2 = js.native
    /**
      * Adds two mat2's
      *
      * @param {mat2} out the receiving matrix
      * @param {mat2} a the first operand
      * @param {mat2} b the second operand
      * @returns {mat2} out
      */
    def add(out: mat2, a: mat2, b: mat2): mat2 = js.native
    /**
      * Calculates the adjugate of a mat2
      *
      * @param out the receiving matrix
      * @param a the source matrix
      * @returns out
      */
    def adjoint(out: mat2, a: mat2): mat2 = js.native
    /**
      * Creates a new mat2 initialized with values from an existing matrix
      *
      * @param a matrix to clone
      * @returns a new 2x2 matrix
      */
    def clone(a: mat2): mat2 = js.native
    /**
      * Copy the values from one mat2 to another
      *
      * @param out the receiving matrix
      * @param a the source matrix
      * @returns out
      */
    def copy(out: mat2, a: mat2): mat2 = js.native
    /**
      * Creates a new identity mat2
      *
      * @returns a new 2x2 matrix
      */
    def create(): mat2 = js.native
    /**
      * Calculates the determinant of a mat2
      *
      * @param a the source matrix
      * @returns determinant of a
      */
    def determinant(a: mat2): Double = js.native
    /**
      * Returns whether or not the matrices have approximately the same elements in the same position.
      *
      * @param {mat2} a The first matrix.
      * @param {mat2} b The second matrix.
      * @returns {boolean} True if the matrices are equal, false otherwise.
      */
    def equals(a: mat2, b: mat2): Boolean = js.native
    /**
      * Returns whether or not the matrices have exactly the same elements in the same position (when compared with ===)
      *
      * @param {mat2} a The first matrix.
      * @param {mat2} b The second matrix.
      * @returns {boolean} True if the matrices are equal, false otherwise.
      */
    def exactEquals(a: mat2, b: mat2): Boolean = js.native
    /**
      * Returns Frobenius norm of a mat2
      *
      * @param a the matrix to calculate Frobenius norm of
      * @returns Frobenius norm
      */
    def frob(a: mat2): Double = js.native
    /**
      * Creates a matrix from a given angle
      * This is equivalent to (but much faster than):
      *
      *     mat2.identity(dest);
      *     mat2.rotate(dest, dest, rad);
      *
      * @param {mat2} out mat2 receiving operation result
      * @param {number} rad the angle to rotate the matrix by
      * @returns {mat2} out
      */
    def fromRotation(out: mat2, rad: Double): mat2 = js.native
    def fromScaling(out: mat2, v: js.Array[Double]): mat2 = js.native
    /**
      * Creates a matrix from a vector scaling
      * This is equivalent to (but much faster than):
      *
      *     mat2.identity(dest);
      *     mat2.scale(dest, dest, vec);
      *
      * @param {mat2} out mat2 receiving operation result
      * @param {vec2} v Scaling vector
      * @returns {mat2} out
      */
    def fromScaling(out: mat2, v: vec2): mat2 = js.native
    /**
      * Create a new mat2 with the given values
      *
      * @param {number} m00 Component in column 0, row 0 position (index 0)
      * @param {number} m01 Component in column 0, row 1 position (index 1)
      * @param {number} m10 Component in column 1, row 0 position (index 2)
      * @param {number} m11 Component in column 1, row 1 position (index 3)
      * @returns {mat2} out A new 2x2 matrix
      */
    def fromValues(m00: Double, m01: Double, m10: Double, m11: Double): mat2 = js.native
    /**
      * Set a mat2 to the identity matrix
      *
      * @param out the receiving matrix
      * @returns out
      */
    def identity(out: mat2): mat2 = js.native
    /**
      * Inverts a mat2
      *
      * @param out the receiving matrix
      * @param a the source matrix
      * @returns out
      */
    def invert(out: mat2, a: mat2): mat2 | Null = js.native
    /**
      * Multiplies two mat2's
      *
      * @param out the receiving matrix
      * @param a the first operand
      * @param b the second operand
      * @returns out
      */
    def mul(out: mat2, a: mat2, b: mat2): mat2 = js.native
    /**
      * Multiplies two mat2's
      *
      * @param out the receiving matrix
      * @param a the first operand
      * @param b the second operand
      * @returns out
      */
    def multiply(out: mat2, a: mat2, b: mat2): mat2 = js.native
    /**
      * Multiply each element of the matrix by a scalar.
      *
      * @param {mat2} out the receiving matrix
      * @param {mat2} a the matrix to scale
      * @param {number} b amount to scale the matrix's elements by
      * @returns {mat2} out
      */
    def multiplyScalar(out: mat2, a: mat2, b: Double): mat2 = js.native
    /**
      * Adds two mat2's after multiplying each element of the second operand by a scalar value.
      *
      * @param {mat2} out the receiving vector
      * @param {mat2} a the first operand
      * @param {mat2} b the second operand
      * @param {number} scale the amount to scale b's elements by before adding
      * @returns {mat2} out
      */
    def multiplyScalarAndAdd(out: mat2, a: mat2, b: mat2, scale: Double): mat2 = js.native
    /**
      * Rotates a mat2 by the given angle
      *
      * @param out the receiving matrix
      * @param a the matrix to rotate
      * @param rad the angle to rotate the matrix by
      * @returns out
      */
    def rotate(out: mat2, a: mat2, rad: Double): mat2 = js.native
    def scale(out: mat2, a: mat2, v: js.Array[Double]): mat2 = js.native
    /**
      * Scales the mat2 by the dimensions in the given vec2
      *
      * @param out the receiving matrix
      * @param a the matrix to rotate
      * @param v the vec2 to scale the matrix by
      * @returns out
      **/
    def scale(out: mat2, a: mat2, v: vec2): mat2 = js.native
    /**
      * Set the components of a mat2 to the given values
      *
      * @param {mat2} out the receiving matrix
      * @param {number} m00 Component in column 0, row 0 position (index 0)
      * @param {number} m01 Component in column 0, row 1 position (index 1)
      * @param {number} m10 Component in column 1, row 0 position (index 2)
      * @param {number} m11 Component in column 1, row 1 position (index 3)
      * @returns {mat2} out
      */
    def set(out: mat2, m00: Double, m01: Double, m10: Double, m11: Double): mat2 = js.native
    /**
      * Returns a string representation of a mat2
      *
      * @param a matrix to represent as a string
      * @returns string representation of the matrix
      */
    def str(a: mat2): String = js.native
    /**
      * Subtracts matrix b from matrix a
      *
      * @param {mat2} out the receiving matrix
      * @param {mat2} a the first operand
      * @param {mat2} b the second operand
      * @returns {mat2} out
      */
    def sub(out: mat2, a: mat2, b: mat2): mat2 = js.native
    /**
      * Subtracts matrix b from matrix a
      *
      * @param {mat2} out the receiving matrix
      * @param {mat2} a the first operand
      * @param {mat2} b the second operand
      * @returns {mat2} out
      */
    def subtract(out: mat2, a: mat2, b: mat2): mat2 = js.native
    /**
      * Transpose the values of a mat2
      *
      * @param out the receiving matrix
      * @param a the source matrix
      * @returns out
      */
    def transpose(out: mat2, a: mat2): mat2 = js.native
  }
  
  /* static members */
  @js.native
  object mat2d extends js.Object {
    /**
      * Adds two mat2d's
      *
      * @param {mat2d} out the receiving matrix
      * @param {mat2d} a the first operand
      * @param {mat2d} b the second operand
      * @returns {mat2d} out
      */
    def add(out: mat2d, a: mat2d, b: mat2d): mat2d = js.native
    /**
      * Creates a new mat2d initialized with values from an existing matrix
      *
      * @param a matrix to clone
      * @returns a new 2x3 matrix
      */
    def clone(a: mat2d): mat2d = js.native
    /**
      * Copy the values from one mat2d to another
      *
      * @param out the receiving matrix
      * @param a the source matrix
      * @returns out
      */
    def copy(out: mat2d, a: mat2d): mat2d = js.native
    /**
      * Creates a new identity mat2d
      *
      * @returns a new 2x3 matrix
      */
    def create(): mat2d = js.native
    /**
      * Calculates the determinant of a mat2d
      *
      * @param a the source matrix
      * @returns determinant of a
      */
    def determinant(a: mat2d): Double = js.native
    /**
      * Returns whether or not the matrices have approximately the same elements in the same position.
      *
      * @param {mat2d} a The first matrix.
      * @param {mat2d} b The second matrix.
      * @returns {boolean} True if the matrices are equal, false otherwise.
      */
    def equals(a: mat2d, b: mat2d): Boolean = js.native
    /**
      * Returns whether or not the matrices have exactly the same elements in the same position (when compared with ===)
      *
      * @param {mat2d} a The first matrix.
      * @param {mat2d} b The second matrix.
      * @returns {boolean} True if the matrices are equal, false otherwise.
      */
    def exactEquals(a: mat2d, b: mat2d): Boolean = js.native
    /**
      * Returns Frobenius norm of a mat2d
      *
      * @param a the matrix to calculate Frobenius norm of
      * @returns Frobenius norm
      */
    def frob(a: mat2d): Double = js.native
    /**
      * Creates a matrix from a given angle
      * This is equivalent to (but much faster than):
      *
      *     mat2d.identity(dest);
      *     mat2d.rotate(dest, dest, rad);
      *
      * @param {mat2d} out mat2d receiving operation result
      * @param {number} rad the angle to rotate the matrix by
      * @returns {mat2d} out
      */
    def fromRotation(out: mat2d, rad: Double): mat2d = js.native
    def fromScaling(out: mat2d, v: js.Array[Double]): mat2d = js.native
    /**
      * Creates a matrix from a vector scaling
      * This is equivalent to (but much faster than):
      *
      *     mat2d.identity(dest);
      *     mat2d.scale(dest, dest, vec);
      *
      * @param {mat2d} out mat2d receiving operation result
      * @param {vec2} v Scaling vector
      * @returns {mat2d} out
      */
    def fromScaling(out: mat2d, v: vec2): mat2d = js.native
    def fromTranslation(out: mat2d, v: js.Array[Double]): mat2d = js.native
    /**
      * Creates a matrix from a vector translation
      * This is equivalent to (but much faster than):
      *
      *     mat2d.identity(dest);
      *     mat2d.translate(dest, dest, vec);
      *
      * @param {mat2d} out mat2d receiving operation result
      * @param {vec2} v Translation vector
      * @returns {mat2d} out
      */
    def fromTranslation(out: mat2d, v: vec2): mat2d = js.native
    /**
      * Create a new mat2d with the given values
      *
      * @param {number} a Component A (index 0)
      * @param {number} b Component B (index 1)
      * @param {number} c Component C (index 2)
      * @param {number} d Component D (index 3)
      * @param {number} tx Component TX (index 4)
      * @param {number} ty Component TY (index 5)
      * @returns {mat2d} A new mat2d
      */
    def fromValues(a: Double, b: Double, c: Double, d: Double, tx: Double, ty: Double): mat2d = js.native
    /**
      * Set a mat2d to the identity matrix
      *
      * @param out the receiving matrix
      * @returns out
      */
    def identity(out: mat2d): mat2d = js.native
    /**
      * Inverts a mat2d
      *
      * @param out the receiving matrix
      * @param a the source matrix
      * @returns out
      */
    def invert(out: mat2d, a: mat2d): mat2d | Null = js.native
    /**
      * Multiplies two mat2d's
      *
      * @param out the receiving matrix
      * @param a the first operand
      * @param b the second operand
      * @returns out
      */
    def mul(out: mat2d, a: mat2d, b: mat2d): mat2d = js.native
    /**
      * Multiplies two mat2d's
      *
      * @param out the receiving matrix
      * @param a the first operand
      * @param b the second operand
      * @returns out
      */
    def multiply(out: mat2d, a: mat2d, b: mat2d): mat2d = js.native
    /**
      * Multiply each element of the matrix by a scalar.
      *
      * @param {mat2d} out the receiving matrix
      * @param {mat2d} a the matrix to scale
      * @param {number} b amount to scale the matrix's elements by
      * @returns {mat2d} out
      */
    def multiplyScalar(out: mat2d, a: mat2d, b: Double): mat2d = js.native
    /**
      * Adds two mat2d's after multiplying each element of the second operand by a scalar value.
      *
      * @param {mat2d} out the receiving vector
      * @param {mat2d} a the first operand
      * @param {mat2d} b the second operand
      * @param {number} scale the amount to scale b's elements by before adding
      * @returns {mat2d} out
      */
    def multiplyScalarAndAdd(out: mat2d, a: mat2d, b: mat2d, scale: Double): mat2d = js.native
    /**
      * Rotates a mat2d by the given angle
      *
      * @param out the receiving matrix
      * @param a the matrix to rotate
      * @param rad the angle to rotate the matrix by
      * @returns out
      */
    def rotate(out: mat2d, a: mat2d, rad: Double): mat2d = js.native
    def scale(out: mat2d, a: mat2d, v: js.Array[Double]): mat2d = js.native
    /**
      * Scales the mat2d by the dimensions in the given vec2
      *
      * @param out the receiving matrix
      * @param a the matrix to translate
      * @param v the vec2 to scale the matrix by
      * @returns out
      **/
    def scale(out: mat2d, a: mat2d, v: vec2): mat2d = js.native
    /**
      * Set the components of a mat2d to the given values
      *
      * @param {mat2d} out the receiving matrix
      * @param {number} a Component A (index 0)
      * @param {number} b Component B (index 1)
      * @param {number} c Component C (index 2)
      * @param {number} d Component D (index 3)
      * @param {number} tx Component TX (index 4)
      * @param {number} ty Component TY (index 5)
      * @returns {mat2d} out
      */
    def set(out: mat2d, a: Double, b: Double, c: Double, d: Double, tx: Double, ty: Double): mat2d = js.native
    /**
      * Returns a string representation of a mat2d
      *
      * @param a matrix to represent as a string
      * @returns string representation of the matrix
      */
    def str(a: mat2d): String = js.native
    /**
      * Subtracts matrix b from matrix a
      *
      * @param {mat2d} out the receiving matrix
      * @param {mat2d} a the first operand
      * @param {mat2d} b the second operand
      * @returns {mat2d} out
      */
    def sub(out: mat2d, a: mat2d, b: mat2d): mat2d = js.native
    /**
      * Subtracts matrix b from matrix a
      *
      * @param {mat2d} out the receiving matrix
      * @param {mat2d} a the first operand
      * @param {mat2d} b the second operand
      * @returns {mat2d} out
      */
    def subtract(out: mat2d, a: mat2d, b: mat2d): mat2d = js.native
    def translate(out: mat2d, a: mat2d, v: js.Array[Double]): mat2d = js.native
    /**
      * Translates the mat2d by the dimensions in the given vec2
      *
      * @param out the receiving matrix
      * @param a the matrix to translate
      * @param v the vec2 to translate the matrix by
      * @returns out
      **/
    def translate(out: mat2d, a: mat2d, v: vec2): mat2d = js.native
  }
  
  /* static members */
  @js.native
  object mat3 extends js.Object {
    /**
      * Adds two mat3's
      *
      * @param {mat3} out the receiving matrix
      * @param {mat3} a the first operand
      * @param {mat3} b the second operand
      * @returns {mat3} out
      */
    def add(out: mat3, a: mat3, b: mat3): mat3 = js.native
    /**
      * Calculates the adjugate of a mat3
      *
      * @param out the receiving matrix
      * @param a the source matrix
      * @returns out
      */
    def adjoint(out: mat3, a: mat3): mat3 = js.native
    /**
      * Creates a new mat3 initialized with values from an existing matrix
      *
      * @param a matrix to clone
      * @returns a new 3x3 matrix
      */
    def clone(a: mat3): mat3 = js.native
    /**
      * Copy the values from one mat3 to another
      *
      * @param out the receiving matrix
      * @param a the source matrix
      * @returns out
      */
    def copy(out: mat3, a: mat3): mat3 = js.native
    /**
      * Creates a new identity mat3
      *
      * @returns a new 3x3 matrix
      */
    def create(): mat3 = js.native
    /**
      * Calculates the determinant of a mat3
      *
      * @param a the source matrix
      * @returns determinant of a
      */
    def determinant(a: mat3): Double = js.native
    /**
      * Returns whether or not the matrices have approximately the same elements in the same position.
      *
      * @param {mat3} a The first matrix.
      * @param {mat3} b The second matrix.
      * @returns {boolean} True if the matrices are equal, false otherwise.
      */
    def equals(a: mat3, b: mat3): Boolean = js.native
    /**
      * Returns whether or not the matrices have exactly the same elements in the same position (when compared with ===)
      *
      * @param {mat3} a The first matrix.
      * @param {mat3} b The second matrix.
      * @returns {boolean} True if the matrices are equal, false otherwise.
      */
    def exactEquals(a: mat3, b: mat3): Boolean = js.native
    /**
      * Returns Frobenius norm of a mat3
      *
      * @param a the matrix to calculate Frobenius norm of
      * @returns Frobenius norm
      */
    def frob(a: mat3): Double = js.native
    /**
      * Copies the values from a mat2d into a mat3
      *
      * @param out the receiving matrix
      * @param {mat2d} a the matrix to copy
      * @returns out
      **/
    def fromMat2d(out: mat3, a: mat2d): mat3 = js.native
    /**
      * Copies the upper-left 3x3 values into the given mat3.
      *
      * @param {mat3} out the receiving 3x3 matrix
      * @param {mat4} a   the source 4x4 matrix
      * @returns {mat3} out
      */
    def fromMat4(out: mat3, a: mat4): mat3 = js.native
    /**
      * Calculates a 3x3 matrix from the given quaternion
      *
      * @param out mat3 receiving operation result
      * @param q Quaternion to create matrix from
      *
      * @returns out
      */
    def fromQuat(out: mat3, q: quat): mat3 = js.native
    /**
      * Creates a matrix from a given angle
      * This is equivalent to (but much faster than):
      *
      *     mat3.identity(dest);
      *     mat3.rotate(dest, dest, rad);
      *
      * @param {mat3} out mat3 receiving operation result
      * @param {number} rad the angle to rotate the matrix by
      * @returns {mat3} out
      */
    def fromRotation(out: mat3, rad: Double): mat3 = js.native
    def fromScaling(out: mat3, v: js.Array[Double]): mat3 = js.native
    /**
      * Creates a matrix from a vector scaling
      * This is equivalent to (but much faster than):
      *
      *     mat3.identity(dest);
      *     mat3.scale(dest, dest, vec);
      *
      * @param {mat3} out mat3 receiving operation result
      * @param {vec2} v Scaling vector
      * @returns {mat3} out
      */
    def fromScaling(out: mat3, v: vec2): mat3 = js.native
    def fromTranslation(out: mat3, v: js.Array[Double]): mat3 = js.native
    /**
      * Creates a matrix from a vector translation
      * This is equivalent to (but much faster than):
      *
      *     mat3.identity(dest);
      *     mat3.translate(dest, dest, vec);
      *
      * @param {mat3} out mat3 receiving operation result
      * @param {vec2} v Translation vector
      * @returns {mat3} out
      */
    def fromTranslation(out: mat3, v: vec2): mat3 = js.native
    /**
      * Create a new mat3 with the given values
      *
      * @param {number} m00 Component in column 0, row 0 position (index 0)
      * @param {number} m01 Component in column 0, row 1 position (index 1)
      * @param {number} m02 Component in column 0, row 2 position (index 2)
      * @param {number} m10 Component in column 1, row 0 position (index 3)
      * @param {number} m11 Component in column 1, row 1 position (index 4)
      * @param {number} m12 Component in column 1, row 2 position (index 5)
      * @param {number} m20 Component in column 2, row 0 position (index 6)
      * @param {number} m21 Component in column 2, row 1 position (index 7)
      * @param {number} m22 Component in column 2, row 2 position (index 8)
      * @returns {mat3} A new mat3
      */
    def fromValues(
      m00: Double,
      m01: Double,
      m02: Double,
      m10: Double,
      m11: Double,
      m12: Double,
      m20: Double,
      m21: Double,
      m22: Double
    ): mat3 = js.native
    /**
      * Set a mat3 to the identity matrix
      *
      * @param out the receiving matrix
      * @returns out
      */
    def identity(out: mat3): mat3 = js.native
    /**
      * Inverts a mat3
      *
      * @param out the receiving matrix
      * @param a the source matrix
      * @returns out
      */
    def invert(out: mat3, a: mat3): mat3 | Null = js.native
    /**
      * Multiplies two mat3's
      *
      * @param out the receiving matrix
      * @param a the first operand
      * @param b the second operand
      * @returns out
      */
    def mul(out: mat3, a: mat3, b: mat3): mat3 = js.native
    /**
      * Multiplies two mat3's
      *
      * @param out the receiving matrix
      * @param a the first operand
      * @param b the second operand
      * @returns out
      */
    def multiply(out: mat3, a: mat3, b: mat3): mat3 = js.native
    /**
      * Multiply each element of the matrix by a scalar.
      *
      * @param {mat3} out the receiving matrix
      * @param {mat3} a the matrix to scale
      * @param {number} b amount to scale the matrix's elements by
      * @returns {mat3} out
      */
    def multiplyScalar(out: mat3, a: mat3, b: Double): mat3 = js.native
    /**
      * Adds two mat3's after multiplying each element of the second operand by a scalar value.
      *
      * @param {mat3} out the receiving vector
      * @param {mat3} a the first operand
      * @param {mat3} b the second operand
      * @param {number} scale the amount to scale b's elements by before adding
      * @returns {mat3} out
      */
    def multiplyScalarAndAdd(out: mat3, a: mat3, b: mat3, scale: Double): mat3 = js.native
    /**
      * Calculates a 3x3 normal matrix (transpose inverse) from the 4x4 matrix
      *
      * @param out mat3 receiving operation result
      * @param a Mat4 to derive the normal matrix from
      *
      * @returns out
      */
    def normalFromMat4(out: mat3, a: mat4): mat3 | Null = js.native
    /**
      * Generates a 2D projection matrix with the given bounds
      *
      * @param out the receiving matrix
      * @param width width of your gl context
      * @param height height of gl context
      * @returns out
      */
    def projection(out: mat3, width: Double, height: Double): mat3 = js.native
    /**
      * Rotates a mat3 by the given angle
      *
      * @param out the receiving matrix
      * @param a the matrix to rotate
      * @param rad the angle to rotate the matrix by
      * @returns out
      */
    def rotate(out: mat3, a: mat3, rad: Double): mat3 = js.native
    def scale(out: mat3, a: mat3, v: js.Array[Double]): mat3 = js.native
    /**
      * Scales the mat3 by the dimensions in the given vec2
      *
      * @param out the receiving matrix
      * @param a the matrix to rotate
      * @param v the vec2 to scale the matrix by
      * @returns out
      **/
    def scale(out: mat3, a: mat3, v: vec2): mat3 = js.native
    /**
      * Set the components of a mat3 to the given values
      *
      * @param {mat3} out the receiving matrix
      * @param {number} m00 Component in column 0, row 0 position (index 0)
      * @param {number} m01 Component in column 0, row 1 position (index 1)
      * @param {number} m02 Component in column 0, row 2 position (index 2)
      * @param {number} m10 Component in column 1, row 0 position (index 3)
      * @param {number} m11 Component in column 1, row 1 position (index 4)
      * @param {number} m12 Component in column 1, row 2 position (index 5)
      * @param {number} m20 Component in column 2, row 0 position (index 6)
      * @param {number} m21 Component in column 2, row 1 position (index 7)
      * @param {number} m22 Component in column 2, row 2 position (index 8)
      * @returns {mat3} out
      */
    def set(
      out: mat3,
      m00: Double,
      m01: Double,
      m02: Double,
      m10: Double,
      m11: Double,
      m12: Double,
      m20: Double,
      m21: Double,
      m22: Double
    ): mat3 = js.native
    /**
      * Returns a string representation of a mat3
      *
      * @param mat matrix to represent as a string
      * @returns string representation of the matrix
      */
    def str(mat: mat3): String = js.native
    /**
      * Subtracts matrix b from matrix a
      *
      * @param {mat3} out the receiving matrix
      * @param {mat3} a the first operand
      * @param {mat3} b the second operand
      * @returns {mat3} out
      */
    def sub(out: mat3, a: mat3, b: mat3): mat3 = js.native
    /**
      * Subtracts matrix b from matrix a
      *
      * @param {mat3} out the receiving matrix
      * @param {mat3} a the first operand
      * @param {mat3} b the second operand
      * @returns {mat3} out
      */
    def subtract(out: mat3, a: mat3, b: mat3): mat3 = js.native
    def translate(out: mat3, a: mat3, v: js.Array[Double]): mat3 = js.native
    /**
      * Translate a mat3 by the given vector
      *
      * @param out the receiving matrix
      * @param a the matrix to translate
      * @param v vector to translate by
      * @returns out
      */
    def translate(out: mat3, a: mat3, v: vec2): mat3 = js.native
    /**
      * Transpose the values of a mat3
      *
      * @param out the receiving matrix
      * @param a the source matrix
      * @returns out
      */
    def transpose(out: mat3, a: mat3): mat3 = js.native
  }
  
  /* static members */
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
  
  /* static members */
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
    def add(out: quat, a: quat, b: quat): quat = js.native
    /**
      * Calculates the W component of a quat from the X, Y, and Z components.
      * Assumes that quaternion is 1 unit in length.
      * Any existing W component will be ignored.
      *
      * @param out the receiving quaternion
      * @param a quat to calculate W component of
      * @returns out
      */
    def calculateW(out: quat, a: quat): quat = js.native
    /**
      * Creates a new quat initialized with values from an existing quaternion
      *
      * @param a quaternion to clone
      * @returns a new quaternion
      * @function
      */
    def clone(a: quat): quat = js.native
    /**
      * Calculates the conjugate of a quat
      * If the quaternion is normalized, this function is faster than quat.inverse and produces the same result.
      *
      * @param out the receiving quaternion
      * @param a quat to calculate conjugate of
      * @returns out
      */
    def conjugate(out: quat, a: quat): quat = js.native
    /**
      * Copy the values from one quat to another
      *
      * @param out the receiving quaternion
      * @param a the source quaternion
      * @returns out
      * @function
      */
    def copy(out: quat, a: quat): quat = js.native
    /**
      * Creates a new identity quat
      *
      * @returns a new quaternion
      */
    def create(): quat = js.native
    /**
      * Calculates the dot product of two quat's
      *
      * @param a the first operand
      * @param b the second operand
      * @returns dot product of a and b
      * @function
      */
    def dot(a: quat, b: quat): Double = js.native
    /**
      * Returns whether or not the quaternions have approximately the same elements in the same position.
      *
      * @param {quat} a The first vector.
      * @param {quat} b The second vector.
      * @returns {boolean} True if the quaternions are equal, false otherwise.
      */
    def equals(a: quat, b: quat): Boolean = js.native
    /**
      * Returns whether or not the quaternions have exactly the same elements in the same position (when compared with ===)
      *
      * @param {quat} a The first vector.
      * @param {quat} b The second vector.
      * @returns {boolean} True if the quaternions are equal, false otherwise.
      */
    def exactEquals(a: quat, b: quat): Boolean = js.native
    /**
      * Creates a quaternion from the given euler angle x, y, z.
      *
      * @param {quat} out the receiving quaternion
      * @param {number} x Angle to rotate around X axis in degrees.
      * @param {number} y Angle to rotate around Y axis in degrees.
      * @param {number} z Angle to rotate around Z axis in degrees.
      * @returns {quat} out
      */
    def fromEuler(out: quat, x: Double, y: Double, z: Double): quat = js.native
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
    def fromMat3(out: quat, m: mat3): quat = js.native
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
    def fromValues(x: Double, y: Double, z: Double, w: Double): quat = js.native
    def getAxisAngle(out_axis: js.Array[Double], q: quat): Double = js.native
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
    def getAxisAngle(out_axis: vec3, q: quat): Double = js.native
    /**
      * Set a quat to the identity quaternion
      *
      * @param out the receiving quaternion
      * @returns out
      */
    def identity(out: quat): quat = js.native
    /**
      * Calculates the inverse of a quat
      *
      * @param out the receiving quaternion
      * @param a quat to calculate inverse of
      * @returns out
      */
    def invert(out: quat, a: quat): quat = js.native
    /**
      * Calculates the length of a quat
      *
      * @param a vector to calculate length of
      * @returns length of a
      * @function
      */
    def len(a: quat): Double = js.native
    /**
      * Calculates the length of a quat
      *
      * @param a vector to calculate length of
      * @returns length of a
      * @function
      */
    def length(a: quat): Double = js.native
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
    def lerp(out: quat, a: quat, b: quat, t: Double): quat = js.native
    /**
      * Multiplies two quat's
      *
      * @param out the receiving quaternion
      * @param a the first operand
      * @param b the second operand
      * @returns out
      */
    def mul(out: quat, a: quat, b: quat): quat = js.native
    /**
      * Multiplies two quat's
      *
      * @param out the receiving quaternion
      * @param a the first operand
      * @param b the second operand
      * @returns out
      */
    def multiply(out: quat, a: quat, b: quat): quat = js.native
    /**
      * Normalize a quat
      *
      * @param out the receiving quaternion
      * @param a quaternion to normalize
      * @returns out
      * @function
      */
    def normalize(out: quat, a: quat): quat = js.native
    /**
      * Rotates a quaternion by the given angle about the X axis
      *
      * @param out quat receiving operation result
      * @param a quat to rotate
      * @param rad angle (in radians) to rotate
      * @returns out
      */
    def rotateX(out: quat, a: quat, rad: Double): quat = js.native
    /**
      * Rotates a quaternion by the given angle about the Y axis
      *
      * @param out quat receiving operation result
      * @param a quat to rotate
      * @param rad angle (in radians) to rotate
      * @returns out
      */
    def rotateY(out: quat, a: quat, rad: Double): quat = js.native
    /**
      * Rotates a quaternion by the given angle about the Z axis
      *
      * @param out quat receiving operation result
      * @param a quat to rotate
      * @param rad angle (in radians) to rotate
      * @returns out
      */
    def rotateZ(out: quat, a: quat, rad: Double): quat = js.native
    def rotationTo(out: quat, a: js.Array[Double], b: js.Array[Double]): quat = js.native
    def rotationTo(out: quat, a: js.Array[Double], b: vec3): quat = js.native
    def rotationTo(out: quat, a: vec3, b: js.Array[Double]): quat = js.native
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
    def rotationTo(out: quat, a: vec3, b: vec3): quat = js.native
    /**
      * Scales a quat by a scalar number
      *
      * @param out the receiving vector
      * @param a the vector to scale
      * @param b amount to scale the vector by
      * @returns out
      * @function
      */
    def scale(out: quat, a: quat, b: Double): quat = js.native
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
    def set(out: quat, x: Double, y: Double, z: Double, w: Double): quat = js.native
    def setAxes(out: quat, view: js.Array[Double], right: js.Array[Double], up: js.Array[Double]): quat = js.native
    def setAxes(out: quat, view: js.Array[Double], right: js.Array[Double], up: vec3): quat = js.native
    def setAxes(out: quat, view: js.Array[Double], right: vec3, up: js.Array[Double]): quat = js.native
    def setAxes(out: quat, view: js.Array[Double], right: vec3, up: vec3): quat = js.native
    def setAxes(out: quat, view: vec3, right: js.Array[Double], up: js.Array[Double]): quat = js.native
    def setAxes(out: quat, view: vec3, right: js.Array[Double], up: vec3): quat = js.native
    def setAxes(out: quat, view: vec3, right: vec3, up: js.Array[Double]): quat = js.native
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
    def setAxes(out: quat, view: vec3, right: vec3, up: vec3): quat = js.native
    def setAxisAngle(out: quat, axis: js.Array[Double], rad: Double): quat = js.native
    /**
      * Sets a quat from the given angle and rotation axis,
      * then returns it.
      *
      * @param out the receiving quaternion
      * @param axis the axis around which to rotate
      * @param rad the angle in radians
      * @returns out
      **/
    def setAxisAngle(out: quat, axis: vec3, rad: Double): quat = js.native
    /**
      * Performs a spherical linear interpolation between two quat
      *
      * @param out the receiving quaternion
      * @param a the first operand
      * @param b the second operand
      * @param t interpolation amount between the two inputs
      * @returns out
      */
    def slerp(out: quat, a: quat, b: quat, t: Double): quat = js.native
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
    def sqlerp(out: quat, a: quat, b: quat, c: quat, d: quat, t: Double): quat = js.native
    /**
      * Calculates the squared length of a quat
      *
      * @param a vector to calculate squared length of
      * @returns squared length of a
      * @function
      */
    def sqrLen(a: quat): Double = js.native
    /**
      * Calculates the squared length of a quat
      *
      * @param a vector to calculate squared length of
      * @returns squared length of a
      * @function
      */
    def squaredLength(a: quat): Double = js.native
    /**
      * Returns a string representation of a quaternion
      *
      * @param a quat to represent as a string
      * @returns string representation of the quat
      */
    def str(a: quat): String = js.native
  }
  
  /* static members */
  @js.native
  object vec2 extends js.Object {
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
      fn: js.Function2[/* a */ this.type | js.Array[Double], /* b */ this.type | js.Array[Double], Unit]
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
          /* a */ this.type | js.Array[Double], 
          /* b */ this.type | js.Array[Double], 
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
  
  /* static members */
  @js.native
  object vec3 extends js.Object {
    def add(out: vec3, a: js.Array[Double], b: js.Array[Double]): vec3 = js.native
    def add(out: vec3, a: js.Array[Double], b: vec3): vec3 = js.native
    def add(out: vec3, a: vec3, b: js.Array[Double]): vec3 = js.native
    /**
      * Adds two vec3's
      *
      * @param out the receiving vector
      * @param a the first operand
      * @param b the second operand
      * @returns out
      */
    def add(out: vec3, a: vec3, b: vec3): vec3 = js.native
    def angle(a: js.Array[Double], b: js.Array[Double]): Double = js.native
    def angle(a: js.Array[Double], b: vec3): Double = js.native
    def angle(a: vec3, b: js.Array[Double]): Double = js.native
    /**
      * Get the angle between two 3D vectors
      * @param a The first operand
      * @param b The second operand
      * @returns The angle in radians
      */
    def angle(a: vec3, b: vec3): Double = js.native
    def bezier(
      out: vec3,
      a: js.Array[Double],
      b: js.Array[Double],
      c: js.Array[Double],
      d: js.Array[Double],
      t: Double
    ): vec3 = js.native
    def bezier(out: vec3, a: js.Array[Double], b: js.Array[Double], c: js.Array[Double], d: vec3, t: Double): vec3 = js.native
    def bezier(out: vec3, a: js.Array[Double], b: js.Array[Double], c: vec3, d: js.Array[Double], t: Double): vec3 = js.native
    def bezier(out: vec3, a: js.Array[Double], b: js.Array[Double], c: vec3, d: vec3, t: Double): vec3 = js.native
    def bezier(out: vec3, a: js.Array[Double], b: vec3, c: js.Array[Double], d: js.Array[Double], t: Double): vec3 = js.native
    def bezier(out: vec3, a: js.Array[Double], b: vec3, c: js.Array[Double], d: vec3, t: Double): vec3 = js.native
    def bezier(out: vec3, a: js.Array[Double], b: vec3, c: vec3, d: js.Array[Double], t: Double): vec3 = js.native
    def bezier(out: vec3, a: js.Array[Double], b: vec3, c: vec3, d: vec3, t: Double): vec3 = js.native
    def bezier(out: vec3, a: vec3, b: js.Array[Double], c: js.Array[Double], d: js.Array[Double], t: Double): vec3 = js.native
    def bezier(out: vec3, a: vec3, b: js.Array[Double], c: js.Array[Double], d: vec3, t: Double): vec3 = js.native
    def bezier(out: vec3, a: vec3, b: js.Array[Double], c: vec3, d: js.Array[Double], t: Double): vec3 = js.native
    def bezier(out: vec3, a: vec3, b: js.Array[Double], c: vec3, d: vec3, t: Double): vec3 = js.native
    def bezier(out: vec3, a: vec3, b: vec3, c: js.Array[Double], d: js.Array[Double], t: Double): vec3 = js.native
    def bezier(out: vec3, a: vec3, b: vec3, c: js.Array[Double], d: vec3, t: Double): vec3 = js.native
    def bezier(out: vec3, a: vec3, b: vec3, c: vec3, d: js.Array[Double], t: Double): vec3 = js.native
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
    def bezier(out: vec3, a: vec3, b: vec3, c: vec3, d: vec3, t: Double): vec3 = js.native
    def ceil(out: vec3, a: js.Array[Double]): vec3 = js.native
    /**
      * Math.ceil the components of a vec3
      *
      * @param {vec3} out the receiving vector
      * @param {vec3} a vector to ceil
      * @returns {vec3} out
      */
    def ceil(out: vec3, a: vec3): vec3 = js.native
    def clone(a: js.Array[Double]): vec3 = js.native
    /**
      * Creates a new vec3 initialized with values from an existing vector
      *
      * @param a vector to clone
      * @returns a new 3D vector
      */
    def clone(a: vec3): vec3 = js.native
    def copy(out: vec3, a: js.Array[Double]): vec3 = js.native
    /**
      * Copy the values from one vec3 to another
      *
      * @param out the receiving vector
      * @param a the source vector
      * @returns out
      */
    def copy(out: vec3, a: vec3): vec3 = js.native
    /**
      * Creates a new, empty vec3
      *
      * @returns a new 3D vector
      */
    def create(): vec3 = js.native
    def cross(out: vec3, a: js.Array[Double], b: js.Array[Double]): vec3 = js.native
    def cross(out: vec3, a: js.Array[Double], b: vec3): vec3 = js.native
    def cross(out: vec3, a: vec3, b: js.Array[Double]): vec3 = js.native
    /**
      * Computes the cross product of two vec3's
      *
      * @param out the receiving vector
      * @param a the first operand
      * @param b the second operand
      * @returns out
      */
    def cross(out: vec3, a: vec3, b: vec3): vec3 = js.native
    def dist(a: js.Array[Double], b: js.Array[Double]): Double = js.native
    def dist(a: js.Array[Double], b: vec3): Double = js.native
    def dist(a: vec3, b: js.Array[Double]): Double = js.native
    /**
      * Calculates the euclidian distance between two vec3's
      *
      * @param a the first operand
      * @param b the second operand
      * @returns distance between a and b
      */
    def dist(a: vec3, b: vec3): Double = js.native
    def distance(a: js.Array[Double], b: js.Array[Double]): Double = js.native
    def distance(a: js.Array[Double], b: vec3): Double = js.native
    def distance(a: vec3, b: js.Array[Double]): Double = js.native
    /**
      * Calculates the euclidian distance between two vec3's
      *
      * @param a the first operand
      * @param b the second operand
      * @returns distance between a and b
      */
    def distance(a: vec3, b: vec3): Double = js.native
    def div(out: vec3, a: js.Array[Double], b: js.Array[Double]): vec3 = js.native
    def div(out: vec3, a: js.Array[Double], b: vec3): vec3 = js.native
    def div(out: vec3, a: vec3, b: js.Array[Double]): vec3 = js.native
    /**
      * Divides two vec3's
      *
      * @param out the receiving vector
      * @param a the first operand
      * @param b the second operand
      * @returns out
      */
    def div(out: vec3, a: vec3, b: vec3): vec3 = js.native
    def divide(out: vec3, a: js.Array[Double], b: js.Array[Double]): vec3 = js.native
    def divide(out: vec3, a: js.Array[Double], b: vec3): vec3 = js.native
    def divide(out: vec3, a: vec3, b: js.Array[Double]): vec3 = js.native
    /**
      * Divides two vec3's
      *
      * @param out the receiving vector
      * @param a the first operand
      * @param b the second operand
      * @returns out
      */
    def divide(out: vec3, a: vec3, b: vec3): vec3 = js.native
    def dot(a: js.Array[Double], b: js.Array[Double]): Double = js.native
    def dot(a: js.Array[Double], b: vec3): Double = js.native
    def dot(a: vec3, b: js.Array[Double]): Double = js.native
    /**
      * Calculates the dot product of two vec3's
      *
      * @param a the first operand
      * @param b the second operand
      * @returns dot product of a and b
      */
    def dot(a: vec3, b: vec3): Double = js.native
    def equals(a: js.Array[Double], b: js.Array[Double]): Boolean = js.native
    def equals(a: js.Array[Double], b: vec3): Boolean = js.native
    def equals(a: vec3, b: js.Array[Double]): Boolean = js.native
    /**
      * Returns whether or not the vectors have approximately the same elements in the same position.
      *
      * @param {vec3} a The first vector.
      * @param {vec3} b The second vector.
      * @returns {boolean} True if the vectors are equal, false otherwise.
      */
    def equals(a: vec3, b: vec3): Boolean = js.native
    def exactEquals(a: js.Array[Double], b: js.Array[Double]): Boolean = js.native
    def exactEquals(a: js.Array[Double], b: vec3): Boolean = js.native
    def exactEquals(a: vec3, b: js.Array[Double]): Boolean = js.native
    /**
      * Returns whether or not the vectors have exactly the same elements in the same position (when compared with ===)
      *
      * @param {vec3} a The first vector.
      * @param {vec3} b The second vector.
      * @returns {boolean} True if the vectors are equal, false otherwise.
      */
    def exactEquals(a: vec3, b: vec3): Boolean = js.native
    def floor(out: vec3, a: js.Array[Double]): vec3 = js.native
    /**
      * Math.floor the components of a vec3
      *
      * @param {vec3} out the receiving vector
      * @param {vec3} a vector to floor
      * @returns {vec3} out
      */
    def floor(out: vec3, a: vec3): vec3 = js.native
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
      a: Float32Array,
      stride: Double,
      offset: Double,
      count: Double,
      fn: js.Function2[/* a */ this.type | js.Array[Double], /* b */ this.type | js.Array[Double], Unit]
    ): Float32Array = js.native
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
      a: Float32Array,
      stride: Double,
      offset: Double,
      count: Double,
      fn: js.Function3[
          /* a */ this.type | js.Array[Double], 
          /* b */ this.type | js.Array[Double], 
          /* arg */ js.Any, 
          Unit
        ],
      arg: js.Any
    ): Float32Array = js.native
    /**
      * Creates a new vec3 initialized with the given values
      *
      * @param x X component
      * @param y Y component
      * @param z Z component
      * @returns a new 3D vector
      */
    def fromValues(x: Double, y: Double, z: Double): vec3 = js.native
    def hermite(
      out: vec3,
      a: js.Array[Double],
      b: js.Array[Double],
      c: js.Array[Double],
      d: js.Array[Double],
      t: Double
    ): vec3 = js.native
    def hermite(out: vec3, a: js.Array[Double], b: js.Array[Double], c: js.Array[Double], d: vec3, t: Double): vec3 = js.native
    def hermite(out: vec3, a: js.Array[Double], b: js.Array[Double], c: vec3, d: js.Array[Double], t: Double): vec3 = js.native
    def hermite(out: vec3, a: js.Array[Double], b: js.Array[Double], c: vec3, d: vec3, t: Double): vec3 = js.native
    def hermite(out: vec3, a: js.Array[Double], b: vec3, c: js.Array[Double], d: js.Array[Double], t: Double): vec3 = js.native
    def hermite(out: vec3, a: js.Array[Double], b: vec3, c: js.Array[Double], d: vec3, t: Double): vec3 = js.native
    def hermite(out: vec3, a: js.Array[Double], b: vec3, c: vec3, d: js.Array[Double], t: Double): vec3 = js.native
    def hermite(out: vec3, a: js.Array[Double], b: vec3, c: vec3, d: vec3, t: Double): vec3 = js.native
    def hermite(out: vec3, a: vec3, b: js.Array[Double], c: js.Array[Double], d: js.Array[Double], t: Double): vec3 = js.native
    def hermite(out: vec3, a: vec3, b: js.Array[Double], c: js.Array[Double], d: vec3, t: Double): vec3 = js.native
    def hermite(out: vec3, a: vec3, b: js.Array[Double], c: vec3, d: js.Array[Double], t: Double): vec3 = js.native
    def hermite(out: vec3, a: vec3, b: js.Array[Double], c: vec3, d: vec3, t: Double): vec3 = js.native
    def hermite(out: vec3, a: vec3, b: vec3, c: js.Array[Double], d: js.Array[Double], t: Double): vec3 = js.native
    def hermite(out: vec3, a: vec3, b: vec3, c: js.Array[Double], d: vec3, t: Double): vec3 = js.native
    def hermite(out: vec3, a: vec3, b: vec3, c: vec3, d: js.Array[Double], t: Double): vec3 = js.native
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
    def hermite(out: vec3, a: vec3, b: vec3, c: vec3, d: vec3, t: Double): vec3 = js.native
    def inverse(out: vec3, a: js.Array[Double]): vec3 = js.native
    /**
      * Returns the inverse of the components of a vec3
      *
      * @param out the receiving vector
      * @param a vector to invert
      * @returns out
      */
    def inverse(out: vec3, a: vec3): vec3 = js.native
    def len(a: js.Array[Double]): Double = js.native
    /**
      * Calculates the length of a vec3
      *
      * @param a vector to calculate length of
      * @returns length of a
      */
    def len(a: vec3): Double = js.native
    def length(a: js.Array[Double]): Double = js.native
    /**
      * Calculates the length of a vec3
      *
      * @param a vector to calculate length of
      * @returns length of a
      */
    def length(a: vec3): Double = js.native
    def lerp(out: vec3, a: js.Array[Double], b: js.Array[Double], t: Double): vec3 = js.native
    def lerp(out: vec3, a: js.Array[Double], b: vec3, t: Double): vec3 = js.native
    def lerp(out: vec3, a: vec3, b: js.Array[Double], t: Double): vec3 = js.native
    /**
      * Performs a linear interpolation between two vec3's
      *
      * @param out the receiving vector
      * @param a the first operand
      * @param b the second operand
      * @param t interpolation amount between the two inputs
      * @returns out
      */
    def lerp(out: vec3, a: vec3, b: vec3, t: Double): vec3 = js.native
    def max(out: vec3, a: js.Array[Double], b: js.Array[Double]): vec3 = js.native
    def max(out: vec3, a: js.Array[Double], b: vec3): vec3 = js.native
    def max(out: vec3, a: vec3, b: js.Array[Double]): vec3 = js.native
    /**
      * Returns the maximum of two vec3's
      *
      * @param out the receiving vector
      * @param a the first operand
      * @param b the second operand
      * @returns out
      */
    def max(out: vec3, a: vec3, b: vec3): vec3 = js.native
    def min(out: vec3, a: js.Array[Double], b: js.Array[Double]): vec3 = js.native
    def min(out: vec3, a: js.Array[Double], b: vec3): vec3 = js.native
    def min(out: vec3, a: vec3, b: js.Array[Double]): vec3 = js.native
    /**
      * Returns the minimum of two vec3's
      *
      * @param out the receiving vector
      * @param a the first operand
      * @param b the second operand
      * @returns out
      */
    def min(out: vec3, a: vec3, b: vec3): vec3 = js.native
    def mul(out: vec3, a: js.Array[Double], b: js.Array[Double]): vec3 = js.native
    def mul(out: vec3, a: js.Array[Double], b: vec3): vec3 = js.native
    def mul(out: vec3, a: vec3, b: js.Array[Double]): vec3 = js.native
    /**
      * Multiplies two vec3's
      *
      * @param out the receiving vector
      * @param a the first operand
      * @param b the second operand
      * @returns out
      */
    def mul(out: vec3, a: vec3, b: vec3): vec3 = js.native
    def multiply(out: vec3, a: js.Array[Double], b: js.Array[Double]): vec3 = js.native
    def multiply(out: vec3, a: js.Array[Double], b: vec3): vec3 = js.native
    def multiply(out: vec3, a: vec3, b: js.Array[Double]): vec3 = js.native
    /**
      * Multiplies two vec3's
      *
      * @param out the receiving vector
      * @param a the first operand
      * @param b the second operand
      * @returns out
      */
    def multiply(out: vec3, a: vec3, b: vec3): vec3 = js.native
    def negate(out: vec3, a: js.Array[Double]): vec3 = js.native
    /**
      * Negates the components of a vec3
      *
      * @param out the receiving vector
      * @param a vector to negate
      * @returns out
      */
    def negate(out: vec3, a: vec3): vec3 = js.native
    def normalize(out: vec3, a: js.Array[Double]): vec3 = js.native
    /**
      * Normalize a vec3
      *
      * @param out the receiving vector
      * @param a vector to normalize
      * @returns out
      */
    def normalize(out: vec3, a: vec3): vec3 = js.native
    /**
      * Generates a random unit vector
      *
      * @param out the receiving vector
      * @returns out
      */
    def random(out: vec3): vec3 = js.native
    /**
      * Generates a random vector with the given scale
      *
      * @param out the receiving vector
      * @param [scale] Length of the resulting vector. If omitted, a unit vector will be returned
      * @returns out
      */
    def random(out: vec3, scale: Double): vec3 = js.native
    def rotateX(out: vec3, a: js.Array[Double], b: js.Array[Double], c: Double): vec3 = js.native
    def rotateX(out: vec3, a: js.Array[Double], b: vec3, c: Double): vec3 = js.native
    def rotateX(out: vec3, a: vec3, b: js.Array[Double], c: Double): vec3 = js.native
    /**
      * Rotate a 3D vector around the x-axis
      * @param out The receiving vec3
      * @param a The vec3 point to rotate
      * @param b The origin of the rotation
      * @param c The angle of rotation
      * @returns out
      */
    def rotateX(out: vec3, a: vec3, b: vec3, c: Double): vec3 = js.native
    def rotateY(out: vec3, a: js.Array[Double], b: js.Array[Double], c: Double): vec3 = js.native
    def rotateY(out: vec3, a: js.Array[Double], b: vec3, c: Double): vec3 = js.native
    def rotateY(out: vec3, a: vec3, b: js.Array[Double], c: Double): vec3 = js.native
    /**
      * Rotate a 3D vector around the y-axis
      * @param out The receiving vec3
      * @param a The vec3 point to rotate
      * @param b The origin of the rotation
      * @param c The angle of rotation
      * @returns out
      */
    def rotateY(out: vec3, a: vec3, b: vec3, c: Double): vec3 = js.native
    def rotateZ(out: vec3, a: js.Array[Double], b: js.Array[Double], c: Double): vec3 = js.native
    def rotateZ(out: vec3, a: js.Array[Double], b: vec3, c: Double): vec3 = js.native
    def rotateZ(out: vec3, a: vec3, b: js.Array[Double], c: Double): vec3 = js.native
    /**
      * Rotate a 3D vector around the z-axis
      * @param out The receiving vec3
      * @param a The vec3 point to rotate
      * @param b The origin of the rotation
      * @param c The angle of rotation
      * @returns out
      */
    def rotateZ(out: vec3, a: vec3, b: vec3, c: Double): vec3 = js.native
    def round(out: vec3, a: js.Array[Double]): vec3 = js.native
    /**
      * Math.round the components of a vec3
      *
      * @param {vec3} out the receiving vector
      * @param {vec3} a vector to round
      * @returns {vec3} out
      */
    def round(out: vec3, a: vec3): vec3 = js.native
    def scale(out: vec3, a: js.Array[Double], b: Double): vec3 = js.native
    /**
      * Scales a vec3 by a scalar number
      *
      * @param out the receiving vector
      * @param a the vector to scale
      * @param b amount to scale the vector by
      * @returns out
      */
    def scale(out: vec3, a: vec3, b: Double): vec3 = js.native
    def scaleAndAdd(out: vec3, a: js.Array[Double], b: js.Array[Double], scale: Double): vec3 = js.native
    def scaleAndAdd(out: vec3, a: js.Array[Double], b: vec3, scale: Double): vec3 = js.native
    def scaleAndAdd(out: vec3, a: vec3, b: js.Array[Double], scale: Double): vec3 = js.native
    /**
      * Adds two vec3's after scaling the second operand by a scalar value
      *
      * @param out the receiving vector
      * @param a the first operand
      * @param b the second operand
      * @param scale the amount to scale b by before adding
      * @returns out
      */
    def scaleAndAdd(out: vec3, a: vec3, b: vec3, scale: Double): vec3 = js.native
    /**
      * Set the components of a vec3 to the given values
      *
      * @param out the receiving vector
      * @param x X component
      * @param y Y component
      * @param z Z component
      * @returns out
      */
    def set(out: vec3, x: Double, y: Double, z: Double): vec3 = js.native
    def sqrDist(a: js.Array[Double], b: js.Array[Double]): Double = js.native
    def sqrDist(a: js.Array[Double], b: vec3): Double = js.native
    def sqrDist(a: vec3, b: js.Array[Double]): Double = js.native
    /**
      * Calculates the squared euclidian distance between two vec3's
      *
      * @param a the first operand
      * @param b the second operand
      * @returns squared distance between a and b
      */
    def sqrDist(a: vec3, b: vec3): Double = js.native
    def sqrLen(a: js.Array[Double]): Double = js.native
    /**
      * Calculates the squared length of a vec3
      *
      * @param a vector to calculate squared length of
      * @returns squared length of a
      */
    def sqrLen(a: vec3): Double = js.native
    def squaredDistance(a: js.Array[Double], b: js.Array[Double]): Double = js.native
    def squaredDistance(a: js.Array[Double], b: vec3): Double = js.native
    def squaredDistance(a: vec3, b: js.Array[Double]): Double = js.native
    /**
      * Calculates the squared euclidian distance between two vec3's
      *
      * @param a the first operand
      * @param b the second operand
      * @returns squared distance between a and b
      */
    def squaredDistance(a: vec3, b: vec3): Double = js.native
    def squaredLength(a: js.Array[Double]): Double = js.native
    /**
      * Calculates the squared length of a vec3
      *
      * @param a vector to calculate squared length of
      * @returns squared length of a
      */
    def squaredLength(a: vec3): Double = js.native
    def str(a: js.Array[Double]): String = js.native
    /**
      * Returns a string representation of a vector
      *
      * @param a vector to represent as a string
      * @returns string representation of the vector
      */
    def str(a: vec3): String = js.native
    def sub(out: vec3, a: js.Array[Double], b: js.Array[Double]): vec3 = js.native
    def sub(out: vec3, a: js.Array[Double], b: vec3): vec3 = js.native
    def sub(out: vec3, a: vec3, b: js.Array[Double]): vec3 = js.native
    /**
      * Subtracts vector b from vector a
      *
      * @param out the receiving vector
      * @param a the first operand
      * @param b the second operand
      * @returns out
      */
    def sub(out: vec3, a: vec3, b: vec3): vec3 = js.native
    def subtract(out: vec3, a: js.Array[Double], b: js.Array[Double]): vec3 = js.native
    def subtract(out: vec3, a: js.Array[Double], b: vec3): vec3 = js.native
    def subtract(out: vec3, a: vec3, b: js.Array[Double]): vec3 = js.native
    /**
      * Subtracts vector b from vector a
      *
      * @param out the receiving vector
      * @param a the first operand
      * @param b the second operand
      * @returns out
      */
    def subtract(out: vec3, a: vec3, b: vec3): vec3 = js.native
    def transformMat3(out: vec3, a: js.Array[Double], m: mat3): vec3 = js.native
    /**
      * Transforms the vec3 with a mat3.
      *
      * @param out the receiving vector
      * @param a the vector to transform
      * @param m the 3x3 matrix to transform with
      * @returns out
      */
    def transformMat3(out: vec3, a: vec3, m: mat3): vec3 = js.native
    def transformMat4(out: vec3, a: js.Array[Double], m: mat4): vec3 = js.native
    /**
      * Transforms the vec3 with a mat4.
      * 4th vector component is implicitly '1'
      *
      * @param out the receiving vector
      * @param a the vector to transform
      * @param m matrix to transform with
      * @returns out
      */
    def transformMat4(out: vec3, a: vec3, m: mat4): vec3 = js.native
    def transformQuat(out: vec3, a: js.Array[Double], q: quat): vec3 = js.native
    /**
      * Transforms the vec3 with a quat
      *
      * @param out the receiving vector
      * @param a the vector to transform
      * @param q quaternion to transform with
      * @returns out
      */
    def transformQuat(out: vec3, a: vec3, q: quat): vec3 = js.native
  }
  
  /* static members */
  @js.native
  object vec4 extends js.Object {
    def add(out: vec4, a: js.Array[Double], b: js.Array[Double]): vec4 = js.native
    def add(out: vec4, a: js.Array[Double], b: vec4): vec4 = js.native
    def add(out: vec4, a: vec4, b: js.Array[Double]): vec4 = js.native
    /**
      * Adds two vec4's
      *
      * @param out the receiving vector
      * @param a the first operand
      * @param b the second operand
      * @returns out
      */
    def add(out: vec4, a: vec4, b: vec4): vec4 = js.native
    def ceil(out: vec4, a: js.Array[Double]): vec4 = js.native
    /**
      * Math.ceil the components of a vec4
      *
      * @param {vec4} out the receiving vector
      * @param {vec4} a vector to ceil
      * @returns {vec4} out
      */
    def ceil(out: vec4, a: vec4): vec4 = js.native
    def clone(a: js.Array[Double]): vec4 = js.native
    /**
      * Creates a new vec4 initialized with values from an existing vector
      *
      * @param a vector to clone
      * @returns a new 4D vector
      */
    def clone(a: vec4): vec4 = js.native
    def copy(out: vec4, a: js.Array[Double]): vec4 = js.native
    /**
      * Copy the values from one vec4 to another
      *
      * @param out the receiving vector
      * @param a the source vector
      * @returns out
      */
    def copy(out: vec4, a: vec4): vec4 = js.native
    /**
      * Creates a new, empty vec4
      *
      * @returns a new 4D vector
      */
    def create(): vec4 = js.native
    def dist(a: js.Array[Double], b: js.Array[Double]): Double = js.native
    def dist(a: js.Array[Double], b: vec4): Double = js.native
    def dist(a: vec4, b: js.Array[Double]): Double = js.native
    /**
      * Calculates the euclidian distance between two vec4's
      *
      * @param a the first operand
      * @param b the second operand
      * @returns distance between a and b
      */
    def dist(a: vec4, b: vec4): Double = js.native
    def distance(a: js.Array[Double], b: js.Array[Double]): Double = js.native
    def distance(a: js.Array[Double], b: vec4): Double = js.native
    def distance(a: vec4, b: js.Array[Double]): Double = js.native
    /**
      * Calculates the euclidian distance between two vec4's
      *
      * @param a the first operand
      * @param b the second operand
      * @returns distance between a and b
      */
    def distance(a: vec4, b: vec4): Double = js.native
    def div(out: vec4, a: js.Array[Double], b: js.Array[Double]): vec4 = js.native
    def div(out: vec4, a: js.Array[Double], b: vec4): vec4 = js.native
    def div(out: vec4, a: vec4, b: js.Array[Double]): vec4 = js.native
    /**
      * Divides two vec4's
      *
      * @param out the receiving vector
      * @param a the first operand
      * @param b the second operand
      * @returns out
      */
    def div(out: vec4, a: vec4, b: vec4): vec4 = js.native
    def divide(out: vec4, a: js.Array[Double], b: js.Array[Double]): vec4 = js.native
    def divide(out: vec4, a: js.Array[Double], b: vec4): vec4 = js.native
    def divide(out: vec4, a: vec4, b: js.Array[Double]): vec4 = js.native
    /**
      * Divides two vec4's
      *
      * @param out the receiving vector
      * @param a the first operand
      * @param b the second operand
      * @returns out
      */
    def divide(out: vec4, a: vec4, b: vec4): vec4 = js.native
    def dot(a: js.Array[Double], b: js.Array[Double]): Double = js.native
    def dot(a: js.Array[Double], b: vec4): Double = js.native
    def dot(a: vec4, b: js.Array[Double]): Double = js.native
    /**
      * Calculates the dot product of two vec4's
      *
      * @param a the first operand
      * @param b the second operand
      * @returns dot product of a and b
      */
    def dot(a: vec4, b: vec4): Double = js.native
    def equals(a: js.Array[Double], b: js.Array[Double]): Boolean = js.native
    def equals(a: js.Array[Double], b: vec4): Boolean = js.native
    def equals(a: vec4, b: js.Array[Double]): Boolean = js.native
    /**
      * Returns whether or not the vectors have approximately the same elements in the same position.
      *
      * @param {vec4} a The first vector.
      * @param {vec4} b The second vector.
      * @returns {boolean} True if the vectors are equal, false otherwise.
      */
    def equals(a: vec4, b: vec4): Boolean = js.native
    def exactEquals(a: js.Array[Double], b: js.Array[Double]): Boolean = js.native
    def exactEquals(a: js.Array[Double], b: vec4): Boolean = js.native
    def exactEquals(a: vec4, b: js.Array[Double]): Boolean = js.native
    /**
      * Returns whether or not the vectors have exactly the same elements in the same position (when compared with ===)
      *
      * @param {vec4} a The first vector.
      * @param {vec4} b The second vector.
      * @returns {boolean} True if the vectors are equal, false otherwise.
      */
    def exactEquals(a: vec4, b: vec4): Boolean = js.native
    def floor(out: vec4, a: js.Array[Double]): vec4 = js.native
    /**
      * Math.floor the components of a vec4
      *
      * @param {vec4} out the receiving vector
      * @param {vec4} a vector to floor
      * @returns {vec4} out
      */
    def floor(out: vec4, a: vec4): vec4 = js.native
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
      a: Float32Array,
      stride: Double,
      offset: Double,
      count: Double,
      fn: js.Function2[/* a */ this.type | js.Array[Double], /* b */ this.type | js.Array[Double], Unit]
    ): Float32Array = js.native
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
      a: Float32Array,
      stride: Double,
      offset: Double,
      count: Double,
      fn: js.Function3[
          /* a */ this.type | js.Array[Double], 
          /* b */ this.type | js.Array[Double], 
          /* arg */ js.Any, 
          Unit
        ],
      arg: js.Any
    ): Float32Array = js.native
    /**
      * Creates a new vec4 initialized with the given values
      *
      * @param x X component
      * @param y Y component
      * @param z Z component
      * @param w W component
      * @returns a new 4D vector
      */
    def fromValues(x: Double, y: Double, z: Double, w: Double): vec4 = js.native
    def inverse(out: vec4, a: js.Array[Double]): vec4 = js.native
    /**
      * Returns the inverse of the components of a vec4
      *
      * @param out the receiving vector
      * @param a vector to invert
      * @returns out
      */
    def inverse(out: vec4, a: vec4): vec4 = js.native
    def len(a: js.Array[Double]): Double = js.native
    /**
      * Calculates the length of a vec4
      *
      * @param a vector to calculate length of
      * @returns length of a
      */
    def len(a: vec4): Double = js.native
    def length(a: js.Array[Double]): Double = js.native
    /**
      * Calculates the length of a vec4
      *
      * @param a vector to calculate length of
      * @returns length of a
      */
    def length(a: vec4): Double = js.native
    def lerp(out: vec4, a: js.Array[Double], b: js.Array[Double], t: Double): vec4 = js.native
    def lerp(out: vec4, a: js.Array[Double], b: vec4, t: Double): vec4 = js.native
    def lerp(out: vec4, a: vec4, b: js.Array[Double], t: Double): vec4 = js.native
    /**
      * Performs a linear interpolation between two vec4's
      *
      * @param out the receiving vector
      * @param a the first operand
      * @param b the second operand
      * @param t interpolation amount between the two inputs
      * @returns out
      */
    def lerp(out: vec4, a: vec4, b: vec4, t: Double): vec4 = js.native
    def max(out: vec4, a: js.Array[Double], b: js.Array[Double]): vec4 = js.native
    def max(out: vec4, a: js.Array[Double], b: vec4): vec4 = js.native
    def max(out: vec4, a: vec4, b: js.Array[Double]): vec4 = js.native
    /**
      * Returns the maximum of two vec4's
      *
      * @param out the receiving vector
      * @param a the first operand
      * @param b the second operand
      * @returns out
      */
    def max(out: vec4, a: vec4, b: vec4): vec4 = js.native
    def min(out: vec4, a: js.Array[Double], b: js.Array[Double]): vec4 = js.native
    def min(out: vec4, a: js.Array[Double], b: vec4): vec4 = js.native
    def min(out: vec4, a: vec4, b: js.Array[Double]): vec4 = js.native
    /**
      * Returns the minimum of two vec4's
      *
      * @param out the receiving vector
      * @param a the first operand
      * @param b the second operand
      * @returns out
      */
    def min(out: vec4, a: vec4, b: vec4): vec4 = js.native
    def mul(out: vec4, a: js.Array[Double], b: js.Array[Double]): vec4 = js.native
    def mul(out: vec4, a: js.Array[Double], b: vec4): vec4 = js.native
    def mul(out: vec4, a: vec4, b: js.Array[Double]): vec4 = js.native
    /**
      * Multiplies two vec4's
      *
      * @param out the receiving vector
      * @param a the first operand
      * @param b the second operand
      * @returns out
      */
    def mul(out: vec4, a: vec4, b: vec4): vec4 = js.native
    def multiply(out: vec4, a: js.Array[Double], b: js.Array[Double]): vec4 = js.native
    def multiply(out: vec4, a: js.Array[Double], b: vec4): vec4 = js.native
    def multiply(out: vec4, a: vec4, b: js.Array[Double]): vec4 = js.native
    /**
      * Multiplies two vec4's
      *
      * @param out the receiving vector
      * @param a the first operand
      * @param b the second operand
      * @returns out
      */
    def multiply(out: vec4, a: vec4, b: vec4): vec4 = js.native
    def negate(out: vec4, a: js.Array[Double]): vec4 = js.native
    /**
      * Negates the components of a vec4
      *
      * @param out the receiving vector
      * @param a vector to negate
      * @returns out
      */
    def negate(out: vec4, a: vec4): vec4 = js.native
    def normalize(out: vec4, a: js.Array[Double]): vec4 = js.native
    /**
      * Normalize a vec4
      *
      * @param out the receiving vector
      * @param a vector to normalize
      * @returns out
      */
    def normalize(out: vec4, a: vec4): vec4 = js.native
    /**
      * Generates a random unit vector
      *
      * @param out the receiving vector
      * @returns out
      */
    def random(out: vec4): vec4 = js.native
    /**
      * Generates a random vector with the given scale
      *
      * @param out the receiving vector
      * @param scale length of the resulting vector. If ommitted, a unit vector will be returned
      * @returns out
      */
    def random(out: vec4, scale: Double): vec4 = js.native
    def round(out: vec4, a: js.Array[Double]): vec4 = js.native
    /**
      * Math.round the components of a vec4
      *
      * @param {vec4} out the receiving vector
      * @param {vec4} a vector to round
      * @returns {vec4} out
      */
    def round(out: vec4, a: vec4): vec4 = js.native
    def scale(out: vec4, a: js.Array[Double], b: Double): vec4 = js.native
    /**
      * Scales a vec4 by a scalar number
      *
      * @param out the receiving vector
      * @param a the vector to scale
      * @param b amount to scale the vector by
      * @returns out
      */
    def scale(out: vec4, a: vec4, b: Double): vec4 = js.native
    def scaleAndAdd(out: vec4, a: js.Array[Double], b: js.Array[Double], scale: Double): vec4 = js.native
    def scaleAndAdd(out: vec4, a: js.Array[Double], b: vec4, scale: Double): vec4 = js.native
    def scaleAndAdd(out: vec4, a: vec4, b: js.Array[Double], scale: Double): vec4 = js.native
    /**
      * Adds two vec4's after scaling the second operand by a scalar value
      *
      * @param out the receiving vector
      * @param a the first operand
      * @param b the second operand
      * @param scale the amount to scale b by before adding
      * @returns out
      */
    def scaleAndAdd(out: vec4, a: vec4, b: vec4, scale: Double): vec4 = js.native
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
    def set(out: vec4, x: Double, y: Double, z: Double, w: Double): vec4 = js.native
    def sqrDist(a: js.Array[Double], b: js.Array[Double]): Double = js.native
    def sqrDist(a: js.Array[Double], b: vec4): Double = js.native
    def sqrDist(a: vec4, b: js.Array[Double]): Double = js.native
    /**
      * Calculates the squared euclidian distance between two vec4's
      *
      * @param a the first operand
      * @param b the second operand
      * @returns squared distance between a and b
      */
    def sqrDist(a: vec4, b: vec4): Double = js.native
    def sqrLen(a: js.Array[Double]): Double = js.native
    /**
      * Calculates the squared length of a vec4
      *
      * @param a vector to calculate squared length of
      * @returns squared length of a
      */
    def sqrLen(a: vec4): Double = js.native
    def squaredDistance(a: js.Array[Double], b: js.Array[Double]): Double = js.native
    def squaredDistance(a: js.Array[Double], b: vec4): Double = js.native
    def squaredDistance(a: vec4, b: js.Array[Double]): Double = js.native
    /**
      * Calculates the squared euclidian distance between two vec4's
      *
      * @param a the first operand
      * @param b the second operand
      * @returns squared distance between a and b
      */
    def squaredDistance(a: vec4, b: vec4): Double = js.native
    def squaredLength(a: js.Array[Double]): Double = js.native
    /**
      * Calculates the squared length of a vec4
      *
      * @param a vector to calculate squared length of
      * @returns squared length of a
      */
    def squaredLength(a: vec4): Double = js.native
    def str(a: js.Array[Double]): String = js.native
    /**
      * Returns a string representation of a vector
      *
      * @param a vector to represent as a string
      * @returns string representation of the vector
      */
    def str(a: vec4): String = js.native
    def sub(out: vec4, a: js.Array[Double], b: js.Array[Double]): vec4 = js.native
    def sub(out: vec4, a: js.Array[Double], b: vec4): vec4 = js.native
    def sub(out: vec4, a: vec4, b: js.Array[Double]): vec4 = js.native
    /**
      * Subtracts vector b from vector a
      *
      * @param out the receiving vector
      * @param a the first operand
      * @param b the second operand
      * @returns out
      */
    def sub(out: vec4, a: vec4, b: vec4): vec4 = js.native
    def subtract(out: vec4, a: js.Array[Double], b: js.Array[Double]): vec4 = js.native
    def subtract(out: vec4, a: js.Array[Double], b: vec4): vec4 = js.native
    def subtract(out: vec4, a: vec4, b: js.Array[Double]): vec4 = js.native
    /**
      * Subtracts vector b from vector a
      *
      * @param out the receiving vector
      * @param a the first operand
      * @param b the second operand
      * @returns out
      */
    def subtract(out: vec4, a: vec4, b: vec4): vec4 = js.native
    def transformMat4(out: vec4, a: js.Array[Double], m: mat4): vec4 = js.native
    /**
      * Transforms the vec4 with a mat4.
      *
      * @param out the receiving vector
      * @param a the vector to transform
      * @param m matrix to transform with
      * @returns out
      */
    def transformMat4(out: vec4, a: vec4, m: mat4): vec4 = js.native
    def transformQuat(out: vec4, a: js.Array[Double], q: quat): vec4 = js.native
    /**
      * Transforms the vec4 with a quat
      *
      * @param out the receiving vector
      * @param a the vector to transform
      * @param q quaternion to transform with
      * @returns out
      */
    def transformQuat(out: vec4, a: vec4, q: quat): vec4 = js.native
  }
  
}

