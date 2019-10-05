package typings.dojo.dojox.gfx

import typings.dojo.dojox.gfx.matrix.Matrix2D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/gfx/matrix.html
  *
  *
  */
@js.native
trait matrix extends js.Object {
  /**
    * a matrix, which reflects points at x = 0 line: flipX * (x, y) == (-x, y)
    *
    */
  var flipX: js.Object = js.native
  /**
    * a matrix, which reflects points at the origin of coordinates: flipXY * (x, y) == (-x, -y)
    *
    */
  var flipXY: js.Object = js.native
  /**
    * a matrix, which reflects points at y = 0 line: flipY * (x, y) == (x, -y)
    *
    */
  var flipY: js.Object = js.native
  /**
    * an identity matrix constant: identity * (x, y) == (x, y)
    *
    */
  var identity: js.Object = js.native
  /**
    * creates a copy of a 2D matrix
    *
    * @param matrix a 2D matrix-like object to be cloned
    */
  def clone(matrix: Matrix2D): Matrix2D = js.native
  /**
    * inverts a 2D matrix
    *
    * @param matrix a 2D matrix-like object to be inverted
    */
  def invert(matrix: Matrix2D): Matrix2D = js.native
  /**
    * returns whether the specified matrix is the identity.
    *
    * @param matrix a 2D matrix object to be tested
    */
  def isIdentity(matrix: Matrix2D): Boolean = js.native
  /**
    * combines matrices by multiplying them sequentially in the given order
    *
    * @param matrix a 2D matrix-like object,all subsequent arguments are matrix-like objects too
    */
  def multiply(matrix: Matrix2D): js.Any = js.native
  /**
    * applies a matrix to a point
    *
    * @param matrix a 2D matrix object to be applied
    * @param a an x coordinate of a point, or a point
    * @param b               Optionala y coordinate of a point
    */
  def multiplyPoint(matrix: Matrix2D, a: Double, b: Double): Point = js.native
  /**
    * applies a matrix to a point
    *
    * @param matrix a 2D matrix object to be applied
    * @param a an x coordinate of a point, or a point
    * @param b               Optionala y coordinate of a point
    */
  def multiplyPoint(matrix: Matrix2D, a: Point, b: Double): Point = js.native
  /**
    * Applies a matrix to a rectangle.
    * The method applies the transformation on all corners of the
    * rectangle and returns the smallest rectangle enclosing the 4 transformed
    * points.
    *
    * @param matrix a 2D matrix object to be applied.
    * @param rect the rectangle to transform.
    */
  def multiplyRectangle(matrix: Matrix2D, rect: typings.dojo.dojox.gfx.shape.Rect): Rectangle = js.native
  /**
    * converts an object to a matrix, if necessary
    * Converts any 2D matrix-like object or an array of
    * such objects to a valid dojox/gfx/matrix.Matrix2D object.
    *
    * @param matrix an object, which is converted to a matrix, if necessary
    */
  def normalize(matrix: js.Object): Matrix2D = js.native
  /**
    * forms an orthogonal projection matrix
    * The resulting matrix is used to project points orthogonally on a vector,
    * which goes through the origin.
    *
    * @param a a point-like object, which specifies a vector of projection, oran x coordinate value
    * @param b               Optionala y coordinate value
    */
  def project(a: Double, b: Double): Matrix2D = js.native
  /**
    * forms an orthogonal projection matrix
    * The resulting matrix is used to project points orthogonally on a vector,
    * which goes through the origin.
    *
    * @param a a point-like object, which specifies a vector of projection, oran x coordinate value
    * @param b               Optionala y coordinate value
    */
  def project(a: Point, b: Double): Matrix2D = js.native
  /**
    * forms a reflection matrix
    * The resulting matrix is used to reflect points around a vector,
    * which goes through the origin.
    *
    * @param a a point-like object, which specifies a vector of reflection, or an X value
    * @param b               Optionala Y value
    */
  def reflect(a: Double, b: Double): Matrix2D = js.native
  /**
    * forms a reflection matrix
    * The resulting matrix is used to reflect points around a vector,
    * which goes through the origin.
    *
    * @param a a point-like object, which specifies a vector of reflection, or an X value
    * @param b               Optionala Y value
    */
  def reflect(a: Point, b: Double): Matrix2D = js.native
  /**
    * forms a rotating matrix
    * The resulting matrix is used to rotate points
    * around the origin of coordinates (0, 0) by specified angle.
    *
    * @param angle an angle of rotation in radians (>0 for CW)
    */
  def rotate(angle: Double): Matrix2D = js.native
  /**
    * rotates a picture using a specified point as a center of rotation
    * Compare with dojox/gfx/matrix.rotate().
    *
    * @param angle an angle of rotation in radians (>0 for CW)
    * @param a an x component of a central point, or a central point
    * @param b               Optionala y component of a central point
    */
  def rotateAt(angle: Double, a: Double, b: Double): Matrix2D = js.native
  /**
    * rotates a picture using a specified point as a center of rotation
    * Compare with dojox/gfx/matrix.rotate().
    *
    * @param angle an angle of rotation in radians (>0 for CW)
    * @param a an x component of a central point, or a central point
    * @param b               Optionala y component of a central point
    */
  def rotateAt(angle: Double, a: Point, b: Double): Matrix2D = js.native
  /**
    * forms a rotating matrix
    * The resulting matrix is used to rotate points
    * around the origin of coordinates (0, 0) by specified degree.
    * See dojox/gfx/matrix.rotate() for comparison.
    *
    * @param degree an angle of rotation in degrees (>0 for CW)
    */
  def rotateg(degree: Double): Matrix2D = js.native
  /**
    * rotates a picture using a specified point as a center of rotation
    * Compare with dojox/gfx/matrix.rotateg().
    *
    * @param degree an angle of rotation in degrees (>0 for CW)
    * @param a an x component of a central point, or a central point
    * @param b               Optionala y component of a central point
    */
  def rotategAt(degree: Double, a: Double, b: Double): Matrix2D = js.native
  /**
    * rotates a picture using a specified point as a center of rotation
    * Compare with dojox/gfx/matrix.rotateg().
    *
    * @param degree an angle of rotation in degrees (>0 for CW)
    * @param a an x component of a central point, or a central point
    * @param b               Optionala y component of a central point
    */
  def rotategAt(degree: Double, a: Point, b: Double): Matrix2D = js.native
  /**
    * forms a scaling matrix
    * The resulting matrix is used to scale (magnify) points by specified offsets.
    *
    * @param a a scaling factor used for the x coordinate, ora uniform scaling factor used for the both coordinates, ora point-like object, which specifies scale factors for both dimensions
    * @param b               Optionala scaling factor used for the y coordinate
    */
  def scale(a: Double, b: Double): Matrix2D = js.native
  /**
    * forms a scaling matrix
    * The resulting matrix is used to scale (magnify) points by specified offsets.
    *
    * @param a a scaling factor used for the x coordinate, ora uniform scaling factor used for the both coordinates, ora point-like object, which specifies scale factors for both dimensions
    * @param b               Optionala scaling factor used for the y coordinate
    */
  def scale(a: Point, b: Double): Matrix2D = js.native
  /**
    * scales a picture using a specified point as a center of scaling
    * Compare with dojox/gfx/matrix.scale().
    *
    * @param a a scaling factor used for the x coordinate, or a uniform scaling factor used for both coordinates
    * @param b               Optionala scaling factor used for the y coordinate
    * @param c an x component of a central point, or a central point
    * @param d a y component of a central point
    */
  def scaleAt(a: Double, b: Double, c: Double, d: Double): Matrix2D = js.native
  /**
    * scales a picture using a specified point as a center of scaling
    * Compare with dojox/gfx/matrix.scale().
    *
    * @param a a scaling factor used for the x coordinate, or a uniform scaling factor used for both coordinates
    * @param b               Optionala scaling factor used for the y coordinate
    * @param c an x component of a central point, or a central point
    * @param d a y component of a central point
    */
  def scaleAt(a: Double, b: Double, c: Point, d: Double): Matrix2D = js.native
  /**
    * forms an x skewing matrix
    * The resulting matrix is used to skew points in the x dimension
    * around the origin of coordinates (0, 0) by specified angle.
    *
    * @param angle a skewing angle in radians
    */
  def skewX(angle: Double): Matrix2D = js.native
  /**
    * skews a picture along the x axis using a specified point as a center of skewing
    * Compare with dojox/gfx/matrix.skewX().
    *
    * @param angle a skewing angle in radians
    * @param a an x component of a central point, or a central point
    * @param b               Optionala y component of a central point
    */
  def skewXAt(angle: Double, a: Double, b: Double): Matrix2D = js.native
  /**
    * skews a picture along the x axis using a specified point as a center of skewing
    * Compare with dojox/gfx/matrix.skewX().
    *
    * @param angle a skewing angle in radians
    * @param a an x component of a central point, or a central point
    * @param b               Optionala y component of a central point
    */
  def skewXAt(angle: Double, a: Point, b: Double): Matrix2D = js.native
  /**
    * forms an x skewing matrix
    * The resulting matrix is used to skew points in the x dimension
    * around the origin of coordinates (0, 0) by specified degree.
    * See dojox/gfx/matrix.skewX() for comparison.
    *
    * @param degree a skewing angle in degrees
    */
  def skewXg(degree: Double): Matrix2D = js.native
  /**
    * skews a picture along the x axis using a specified point as a center of skewing
    * Compare with dojox/gfx/matrix.skewXg().
    *
    * @param degree a skewing angle in degrees
    * @param a an x component of a central point, or a central point
    * @param b               Optionala y component of a central point
    */
  def skewXgAt(degree: Double, a: Double, b: Double): Matrix2D = js.native
  /**
    * skews a picture along the x axis using a specified point as a center of skewing
    * Compare with dojox/gfx/matrix.skewXg().
    *
    * @param degree a skewing angle in degrees
    * @param a an x component of a central point, or a central point
    * @param b               Optionala y component of a central point
    */
  def skewXgAt(degree: Double, a: Point, b: Double): Matrix2D = js.native
  /**
    * forms a y skewing matrix
    * The resulting matrix is used to skew points in the y dimension
    * around the origin of coordinates (0, 0) by specified angle.
    *
    * @param angle a skewing angle in radians
    */
  def skewY(angle: Double): Matrix2D = js.native
  /**
    * skews a picture along the y axis using a specified point as a center of skewing
    * Compare with dojox/gfx/matrix.skewY().
    *
    * @param angle a skewing angle in radians
    * @param a an x component of a central point, or a central point
    * @param b               Optionala y component of a central point
    */
  def skewYAt(angle: Double, a: Double, b: Double): Matrix2D = js.native
  /**
    * skews a picture along the y axis using a specified point as a center of skewing
    * Compare with dojox/gfx/matrix.skewY().
    *
    * @param angle a skewing angle in radians
    * @param a an x component of a central point, or a central point
    * @param b               Optionala y component of a central point
    */
  def skewYAt(angle: Double, a: Point, b: Double): Matrix2D = js.native
  /**
    * forms a y skewing matrix
    * The resulting matrix is used to skew points in the y dimension
    * around the origin of coordinates (0, 0) by specified degree.
    * See dojox/gfx/matrix.skewY() for comparison.
    *
    * @param degree a skewing angle in degrees
    */
  def skewYg(degree: Double): Matrix2D = js.native
  /**
    * skews a picture along the y axis using a specified point as a center of skewing
    * Compare with dojox/gfx/matrix.skewYg().
    *
    * @param degree a skewing angle in degrees
    * @param a an x component of a central point, or a central point
    * @param b               Optionala y component of a central point
    */
  def skewYgAt(degree: Double, a: Double, b: Double): Matrix2D = js.native
  /**
    * skews a picture along the y axis using a specified point as a center of skewing
    * Compare with dojox/gfx/matrix.skewYg().
    *
    * @param degree a skewing angle in degrees
    * @param a an x component of a central point, or a central point
    * @param b               Optionala y component of a central point
    */
  def skewYgAt(degree: Double, a: Point, b: Double): Matrix2D = js.native
  /**
    * forms a translation matrix
    * The resulting matrix is used to translate (move) points by specified offsets.
    *
    * @param a an x coordinate value, or a point-like object, which specifies offsets for both dimensions
    * @param b               Optionala y coordinate value
    */
  def translate(a: Double, b: Double): Matrix2D = js.native
  /**
    * forms a translation matrix
    * The resulting matrix is used to translate (move) points by specified offsets.
    *
    * @param a an x coordinate value, or a point-like object, which specifies offsets for both dimensions
    * @param b               Optionala y coordinate value
    */
  def translate(a: Point, b: Double): Matrix2D = js.native
}

@JSGlobal("dojox.gfx.matrix")
@js.native
object matrix extends js.Object {
  /**
    * a 2D matrix object
    * Normalizes a 2D matrix-like object. If arrays is passed,
    * all objects of the array are normalized and multiplied sequentially.
    *
    * @param arg a 2D matrix-like object, a number, or an array of such objects
    */
  @js.native
  class Matrix2D protected () extends js.Object {
    def this(arg: js.Object) = this()
  }
  
}

