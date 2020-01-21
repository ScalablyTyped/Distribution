package typings.dojo.dojox.gfx3d.base

import typings.dojo.dojox.geo.openlayers.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/gfx3d/_base.matrix.html
  *
  *
  */
@js.native
trait matrix extends js.Object {
  /**
    * an identity matrix constant: identity * (x, y, z) == (x, y, z)
    *
    */
  var identity: Object = js.native
  /**
    * a 3D matrix object
    * Normalizes a 3D matrix-like object. If arrays is passed,
    * all objects of the array are normalized and multiplied sequentially.
    *
    * @param arg a 3D matrix-like object, a number, or an array of such objects
    */
  def Matrix3D(arg: Object): Unit = js.native
  /**
    * forms a rotating matrix (about the x axis) in cameraTransform manner
    * The resulting matrix is used to rotate points
    * around the origin of coordinates (0, 0) by specified angle.
    *
    * @param angle an angle of rotation in radians (>0 for CW)
    */
  def cameraRotateX(angle: Double): js.Any = js.native
  /**
    * forms a rotating matrix (about the x axis)in cameraTransform manner
    * The resulting matrix is used to rotate points
    * around the origin of coordinates (0, 0) by specified degree.
    * See dojox.gfx3d.matrix.rotateX() for comparison.
    *
    * @param degree an angle of rotation in degrees (>0 for CW)
    */
  def cameraRotateXg(degree: Double): js.Any = js.native
  /**
    * forms a rotating matrix (about the y axis) in cameraTransform manner
    * The resulting matrix is used to rotate points
    * around the origin of coordinates (0, 0) by specified angle.
    *
    * @param angle an angle of rotation in radians (>0 for CW)
    */
  def cameraRotateY(angle: Double): js.Any = js.native
  /**
    * forms a rotating matrix (about the y axis) in cameraTransform manner
    * The resulting matrix is used to rotate points
    * around the origin of coordinates (0, 0) by specified degree.
    * See dojox.gfx3d.matrix.rotateY() for comparison.
    *
    * @param degree an angle of rotation in degrees (>0 for CW)
    */
  def cameraRotateYg(degree: Double): js.Any = js.native
  /**
    * forms a rotating matrix (about the z axis) in cameraTransform manner
    * The resulting matrix is used to rotate points
    * around the origin of coordinates (0, 0) by specified angle.
    *
    * @param angle an angle of rotation in radians (>0 for CW)
    */
  def cameraRotateZ(angle: Double): js.Any = js.native
  /**
    * forms a rotating matrix (about the z axis) in cameraTransform manner
    * The resulting matrix is used to rotate points
    * around the origin of coordinates (0, 0) by specified degree.
    * See dojox.gfx3d.matrix.rotateZ() for comparison.
    *
    * @param degree an angle of rotation in degrees (>0 for CW)
    */
  def cameraRotateZg(degree: Double): js.Any = js.native
  /**
    * forms a translation matrix
    * The resulting matrix is used to translate (move) points by specified offsets.
    *
    * @param a an x coordinate value, or a point-like object, which specifies offsets for 3 dimensions
    * @param b               Optionala y coordinate value
    * @param c               Optionala z coordinate value
    */
  def cameraTranslate(a: Double, b: Double, c: Double): js.Any = js.native
  /**
    * forms a translation matrix
    * The resulting matrix is used to translate (move) points by specified offsets.
    *
    * @param a an x coordinate value, or a point-like object, which specifies offsets for 3 dimensions
    * @param b               Optionala y coordinate value
    * @param c               Optionala z coordinate value
    */
  def cameraTranslate(a: Object, b: Double, c: Double): js.Any = js.native
  /**
    * creates a copy of a 3D matrix
    *
    * @param matrix a 3D matrix-like object to be cloned
    */
  def clone(matrix: Object): js.Any = js.native
  /**
    * inverts a 2D matrix
    *
    * @param matrix a 3D matrix object to be applied
    */
  def invert(matrix: Object): js.Any = js.native
  /**
    * combines matrices by multiplying them sequentially in the given order
    *
    * @param matrix a 3D matrix object to be applied
    */
  def multiply(matrix: Object): js.Any = js.native
  /**
    * applies a matrix to a point
    *
    * @param matrix a 3D matrix object to be applied
    * @param a an x coordinate of a point, or an Object specifying the whole point
    * @param b               Optionala y coordinate of a point
    * @param c               Optionala z coordinate of a point
    */
  def multiplyPoint(matrix: Object, a: Double, b: Double, c: Double): js.Any = js.native
  /**
    * applies a matrix to a point
    *
    * @param matrix a 3D matrix object to be applied
    * @param a an x coordinate of a point, or an Object specifying the whole point
    * @param b               Optionala y coordinate of a point
    * @param c               Optionala z coordinate of a point
    */
  def multiplyPoint(matrix: Object, a: Object, b: Double, c: Double): js.Any = js.native
  /**
    * converts an object to a matrix, if necessary
    * Converts any 3D matrix-like object or an array of
    * such objects to a valid dojox.gfx3d.matrix.Matrix3D3D object.
    *
    * @param matrix an object, which is converted to a matrix, if necessary
    */
  def normalize(matrix: Object): js.Any = js.native
  /**
    * applies a matrix to a point
    *
    * @param matrix a 3D matrix object to be applied
    * @param a an x coordinate of a point, or an Object specifying the whole point
    * @param b               Optionala y coordinate of a point
    * @param c               Optionala z coordinate of a point
    */
  def project(matrix: Object, a: Double, b: Double, c: Double): js.Any = js.native
  /**
    * applies a matrix to a point
    *
    * @param matrix a 3D matrix object to be applied
    * @param a an x coordinate of a point, or an Object specifying the whole point
    * @param b               Optionala y coordinate of a point
    * @param c               Optionala z coordinate of a point
    */
  def project(matrix: Object, a: Point, b: Double, c: Double): js.Any = js.native
  /**
    * forms a rotating matrix (about the x axis)
    * The resulting matrix is used to rotate points
    * around the origin of coordinates (0, 0) by specified angle.
    *
    * @param angle an angle of rotation in radians (>0 for CW)
    */
  def rotateX(angle: Double): js.Any = js.native
  /**
    * forms a rotating matrix (about the x axis)
    * The resulting matrix is used to rotate points
    * around the origin of coordinates (0, 0) by specified degree.
    * See dojox.gfx3d.matrix.rotateX() for comparison.
    *
    * @param degree an angle of rotation in degrees (>0 for CW)
    */
  def rotateXg(degree: Double): js.Any = js.native
  /**
    * forms a rotating matrix (about the y axis)
    * The resulting matrix is used to rotate points
    * around the origin of coordinates (0, 0) by specified angle.
    *
    * @param angle an angle of rotation in radians (>0 for CW)
    */
  def rotateY(angle: Double): js.Any = js.native
  /**
    * forms a rotating matrix (about the y axis)
    * The resulting matrix is used to rotate points
    * around the origin of coordinates (0, 0) by specified degree.
    * See dojox.gfx3d.matrix.rotateY() for comparison.
    *
    * @param degree an angle of rotation in degrees (>0 for CW)
    */
  def rotateYg(degree: Double): js.Any = js.native
  /**
    * forms a rotating matrix (about the z axis)
    * The resulting matrix is used to rotate points
    * around the origin of coordinates (0, 0) by specified angle.
    *
    * @param angle an angle of rotation in radians (>0 for CW)
    */
  def rotateZ(angle: Double): js.Any = js.native
  /**
    * forms a rotating matrix (about the z axis)
    * The resulting matrix is used to rotate points
    * around the origin of coordinates (0, 0) by specified degree.
    * See dojox.gfx3d.matrix.rotateZ() for comparison.
    *
    * @param degree an angle of rotation in degrees (>0 for CW)
    */
  def rotateZg(degree: Double): js.Any = js.native
  /**
    * forms a scaling matrix
    * The resulting matrix is used to scale (magnify) points by specified offsets.
    *
    * @param a a scaling factor used for the x coordinate, or a uniform scaling factor used for the all coordinates,or a point-like object, which specifies scale factors for 3 dimensions
    * @param b               Optionala scaling factor used for the y coordinate
    * @param c               Optionala scaling factor used for the z coordinate
    */
  def scale(a: Double, b: Double, c: Double): js.Any = js.native
  /**
    * forms a scaling matrix
    * The resulting matrix is used to scale (magnify) points by specified offsets.
    *
    * @param a a scaling factor used for the x coordinate, or a uniform scaling factor used for the all coordinates,or a point-like object, which specifies scale factors for 3 dimensions
    * @param b               Optionala scaling factor used for the y coordinate
    * @param c               Optionala scaling factor used for the z coordinate
    */
  def scale(a: Object, b: Double, c: Double): js.Any = js.native
  /**
    * forms a translation matrix
    * The resulting matrix is used to translate (move) points by specified offsets.
    *
    * @param a an x coordinate value, or a point-like object, which specifies offsets for 3 dimensions
    * @param b               Optionala y coordinate value
    * @param c               Optionala z coordinate value
    */
  def translate(a: Double, b: Double, c: Double): js.Any = js.native
  /**
    * forms a translation matrix
    * The resulting matrix is used to translate (move) points by specified offsets.
    *
    * @param a an x coordinate value, or a point-like object, which specifies offsets for 3 dimensions
    * @param b               Optionala y coordinate value
    * @param c               Optionala z coordinate value
    */
  def translate(a: Object, b: Double, c: Double): js.Any = js.native
}

