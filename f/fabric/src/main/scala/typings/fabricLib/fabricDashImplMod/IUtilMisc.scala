package typings
package fabricLib.fabricDashImplMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IUtilMisc extends js.Object {
  /**
  	 * @param receiver Object implementing `clipTo` method
  	 * @param ctx Context to clip
  	 */
  def clipContext(receiver: Object, ctx: stdLib.CanvasRenderingContext2D): scala.Unit = js.native
  /**
  	 * Creates accessors (getXXX, setXXX) for a "class", based on "stateProperties" array
  	 * @param klass "Class" to create accessors for
  	 */
  def createAccessors(klass: js.Any): js.Any = js.native
  /**
  	 * Creates canvas element and initializes it via excanvas if necessary
  	 * @param [canvasEl] optional canvas element to initialize;
  	 * when not given, element is created implicitly
  	 */
  def createCanvasElement(): stdLib.HTMLCanvasElement = js.native
  def createCanvasElement(canvasEl: stdLib.HTMLCanvasElement): stdLib.HTMLCanvasElement = js.native
  /**
  	 * Creates image element (works on client and node)
  	 */
  def createImage(): stdLib.HTMLImageElement = js.native
  /**
  	 * Creates a transform matrix with the specified scale and skew
  	 */
  def customTransformMatrix(scaleX: scala.Double, scaleY: scala.Double, skewX: scala.Double): js.Array[scala.Double] = js.native
  /**
  	 * Transforms degrees to radians.
  	 * @param degrees value in degrees
  	 */
  def degreesToRadians(degrees: scala.Double): scala.Double = js.native
  /**
  	 * Draws a dashed line between two points
  	 * This method is used to draw dashed line around selection area.
  	 * @param ctx context
  	 * @param x  start x coordinate
  	 * @param y start y coordinate
  	 * @param x2 end x coordinate
  	 * @param y2 end y coordinate
  	 * @param da dash array pattern
  	 */
  def drawDashedLine(
    ctx: stdLib.CanvasRenderingContext2D,
    x: scala.Double,
    y: scala.Double,
    x2: scala.Double,
    y2: scala.Double,
    da: js.Array[_]
  ): scala.Unit = js.native
  /**
  	 * Creates corresponding fabric instances from their object representations
  	 * @param objects Objects to enliven
  	 * @param callback Callback to invoke when all objects are created
  	 * @param namespace Namespace to get klass "Class" object from
  	 * @param reviver Method for further parsing of object elements, called after each fabric object created.
  	 */
  def enlivenObjects(objects: js.Array[_], callback: js.Function, namespace: java.lang.String): scala.Unit = js.native
  def enlivenObjects(objects: js.Array[_], callback: js.Function, namespace: java.lang.String, reviver: js.Function): scala.Unit = js.native
  /**
  	 * Function which always returns `false`.
  	 */
  def falseFunction(): scala.Boolean = js.native
  /**
  	 * Returns string representation of function body
  	 * @param fn Function to get body of
  	 */
  def getFunctionBody(fn: js.Function): java.lang.String = js.native
  /**
  	 * Returns klass "Class" object of given namespace
  	 * @param type Type of object (eg. 'circle')
  	 * @param namespace Namespace to get klass "Class" object from
  	 */
  def getKlass(`type`: java.lang.String, namespace: java.lang.String): js.Any = js.native
  /**
  	 * Returns random number between 2 specified ones.
  	 * @param min lower limit
  	 * @param max upper limit
  	 */
  def getRandomInt(min: scala.Double, max: scala.Double): scala.Double = js.native
  /**
  	 * Groups SVG elements (usually those retrieved from SVG document)
  	 * @param elements SVG elements to group
  	 * @param [options] Options object
  	 */
  def groupSVGElements(elements: js.Array[_]): Object | Group = js.native
  def groupSVGElements(elements: js.Array[_], options: js.Any): Object | Group = js.native
  def groupSVGElements(elements: js.Array[_], options: js.Any, path: java.lang.String): Object | Group = js.native
  /**
  	 * Invert transformation t
  	 * @param t The transform
  	 */
  def invertTransform(t: js.Array[_]): js.Array[_] = js.native
  /**
  	 * Returns true if context has transparent pixel
  	 * at specified location (taking tolerance into account)
  	 * @param ctx context
  	 * @param x x coordinate
  	 * @param y y coordinate
  	 * @param tolerance Tolerance
  	 */
  def isTransparent(ctx: stdLib.CanvasRenderingContext2D, x: scala.Double, y: scala.Double, tolerance: scala.Double): scala.Boolean = js.native
  /**
  	 * Loads image element from given url and passes it to a callback
  	 * @param url URL representing an image
  	 * @param callback Callback; invoked with loaded image
  	 * @param [context] Context to invoke callback in
  	 * @param [crossOrigin] crossOrigin value to set image element to
  	 */
  def loadImage(url: java.lang.String, callback: js.Function1[/* image */ stdLib.HTMLImageElement, scala.Unit]): scala.Unit = js.native
  def loadImage(
    url: java.lang.String,
    callback: js.Function1[/* image */ stdLib.HTMLImageElement, scala.Unit],
    context: js.Any
  ): scala.Unit = js.native
  def loadImage(
    url: java.lang.String,
    callback: js.Function1[/* image */ stdLib.HTMLImageElement, scala.Unit],
    context: js.Any,
    crossOrigin: java.lang.String
  ): scala.Unit = js.native
  /**
  	 * Multiply matrix A by matrix B to nest transformations
  	 * @param  a First transformMatrix
  	 * @param  b Second transformMatrix
  	 */
  def multiplyTransformMatrices(a: js.Array[scala.Double], b: js.Array[scala.Double]): js.Array[scala.Double] = js.native
  def parseUnit(value: java.lang.String): scala.Double | java.lang.String = js.native
  def parseUnit(value: java.lang.String, fontSize: scala.Double): scala.Double | java.lang.String = js.native
  /**
  	 * Converts from attribute value to pixel value if applicable.
  	 * Returns converted pixels or original value not converted.
  	 * @param value number to operate on
  	 */
  def parseUnit(value: scala.Double): scala.Double | java.lang.String = js.native
  def parseUnit(value: scala.Double, fontSize: scala.Double): scala.Double | java.lang.String = js.native
  /**
  	 * Populates an object with properties of another object
  	 * @param source Source object
  	 * @param destination Destination object
  	 * @param properties Propertie names to include
  	 */
  def populateWithProperties(source: js.Any, destination: js.Any, properties: js.Any): scala.Unit = js.native
  /**
  	 * Decomposes standard 2x2 matrix into transform componentes
  	 * @param a transformMatrix
  	 */
  def qrDecompose(a: js.Array[scala.Double]): fabricLib.Anon_Angle = js.native
  /**
  	 * Transforms radians to degrees.
  	 * @param radians value in radians
  	 */
  def radiansToDegrees(radians: scala.Double): scala.Double = js.native
  /**
  	 * Removes value from an array.
  	 * Presence of value (and its position in an array) is determined via `Array.prototype.indexOf`
  	 */
  def removeFromArray(array: js.Array[_], value: js.Any): js.Array[_] = js.native
  /**
  	 * Returns object of given namespace
  	 * @param namespace Namespace string e.g. 'fabric.Image.filter' or 'fabric'
  	 */
  def resolveNamespace(namespace: java.lang.String): js.Any = js.native
  /**
  	 * Rotates `point` around `origin` with `radians`
  	 * @param point The point to rotate
  	 * @param origin The origin of the rotation
  	 * @param radians The radians of the angle for the rotation
  	 */
  def rotatePoint(point: Point, origin: Point, radians: scala.Double): Point = js.native
  /**
  	 * Rotates `vector` with `radians`
  	 * @param vector The vector to rotate (x and y)
  	 * @param radians The radians of the angle for the rotation
  	 */
  def rotateVector(vector: fabricLib.Anon_X, radians: scala.Double): fabricLib.Anon_X = js.native
  /**
  	 * A wrapper around Number#toFixed, which contrary to native method returns number, not string.
  	 * @param number number to operate on
  	 * @param fractionDigits number of fraction digits to "leave"
  	 */
  def toFixed(number: scala.Double, fractionDigits: scala.Double): scala.Double = js.native
  /**
  	 * Apply transform t to point p
  	 * @param  p The point to transform
  	 * @param  t The transform
  	 * @param  [ignoreOffset] Indicates that the offset should not be applied
  	 */
  def transformPoint(p: Point, t: js.Array[_]): Point = js.native
  def transformPoint(p: Point, t: js.Array[_], ignoreOffset: scala.Boolean): Point = js.native
}

