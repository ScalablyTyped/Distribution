package typings.glDashMatrix.srcGlDashMatrixCommonMod

import typings.glDashMatrix.glDashMatrixMod.glMatrix
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gl-matrix/src/gl-matrix/common", JSImport.Namespace)
@js.native
class ^ () extends glMatrix

@JSImport("gl-matrix/src/gl-matrix/common", JSImport.Namespace)
@js.native
object ^ extends js.Object {
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

