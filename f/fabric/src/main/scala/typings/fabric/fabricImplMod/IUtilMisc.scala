package typings.fabric.fabricImplMod

import typings.fabric.anon.Angle
import typings.fabric.anon.FlipX
import typings.fabric.anon.FlipY
import typings.fabric.anon.X
import typings.std.CanvasRenderingContext2D
import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IUtilMisc extends StObject {
  
  /**
    * Clear char widths cache for the given font family or all the cache if no
    * fontFamily is specified.
    * Use it if you know you are loading fonts in a lazy way and you are not waiting
    * for custom fonts to load properly when adding text objects to the canvas.
    * If a text object is added when its own font is not loaded yet, you will get wrong
    * measurement and so wrong bounding boxes.
    * After the font cache is cleared, either change the textObject text content or call
    * initDimensions() to trigger a recalculation
    * @memberOf fabric.util
    * @param {String} [fontFamily] font family to clear
    */
  def clearFabricFontCache(): Unit = js.native
  def clearFabricFontCache(fontFamily: String): Unit = js.native
  
  /**
    * @param receiver Object implementing `clipTo` method
    * @param ctx Context to clip
    */
  def clipContext(receiver: Object, ctx: CanvasRenderingContext2D): Unit = js.native
  
  /**
    * Returns a transform matrix starting from an object of the same kind of
    * the one returned from qrDecompose, useful also if you want to calculate some
    * transformations from an object that is not enlived yet
    * @static
    * @memberOf fabric.util
    * @param  {Object} options
    * @param  {Number} [options.angle]
    * @param  {Number} [options.scaleX]
    * @param  {Number} [options.scaleY]
    * @param  {Boolean} [options.flipX]
    * @param  {Boolean} [options.flipY]
    * @param  {Number} [options.skewX]
    * @param  {Number} [options.skewX]
    * @param  {Number} [options.translateX]
    * @param  {Number} [options.translateY]
    * @return {Number[]} transform matrix
    */
  def composeMatrix(options: FlipY): js.Array[Double] = js.native
  
  /**
    * Creates accessors (getXXX, setXXX) for a "class", based on "stateProperties" array
    * @param klass "Class" to create accessors for
    */
  def createAccessors(klass: Any): Any = js.native
  
  /**
    * Creates canvas element and initializes it via excanvas if necessary
    * @param [canvasEl] optional canvas element to initialize;
    * when not given, element is created implicitly
    */
  def createCanvasElement(): HTMLCanvasElement = js.native
  def createCanvasElement(canvasEl: HTMLCanvasElement): HTMLCanvasElement = js.native
  
  /**
    * Creates image element (works on client and node)
    */
  def createImage(): HTMLImageElement = js.native
  
  /**
    * Transforms degrees to radians.
    * @param degrees value in degrees
    */
  def degreesToRadians(degrees: Double): Double = js.native
  
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
  def drawDashedLine(ctx: CanvasRenderingContext2D, x: Double, y: Double, x2: Double, y2: Double, da: js.Array[Any]): Unit = js.native
  
  /**
    * Creates corresponding fabric instances from their object representations
    * @param objects Objects to enliven
    * @param callback Callback to invoke when all objects are created
    * @param namespace Namespace to get klass "Class" object from
    * @param reviver Method for further parsing of object elements, called after each fabric object created.
    */
  def enlivenObjects(objects: js.Array[Any], callback: js.Function, namespace: String): Unit = js.native
  def enlivenObjects(objects: js.Array[Any], callback: js.Function, namespace: String, reviver: js.Function): Unit = js.native
  
  /**
    * Function which always returns `false`.
    */
  def falseFunction(): Boolean = js.native
  
  /**
    * Returns string representation of function body
    * @param fn Function to get body of
    */
  def getFunctionBody(fn: js.Function): String = js.native
  
  /**
    * Returns klass "Class" object of given namespace
    * @param type Type of object (eg. 'circle')
    * @param namespace Namespace to get klass "Class" object from
    */
  def getKlass(`type`: String, namespace: String): Any = js.native
  
  /**
    * Returns random number between 2 specified ones.
    * @param min lower limit
    * @param max upper limit
    */
  def getRandomInt(min: Double, max: Double): Double = js.native
  
  /**
    * Groups SVG elements (usually those retrieved from SVG document)
    * @param elements SVG elements to group
    * @param [options] Options object
    */
  def groupSVGElements(elements: js.Array[Any]): Object | Group = js.native
  def groupSVGElements(elements: js.Array[Any], options: Any): Object | Group = js.native
  def groupSVGElements(elements: js.Array[Any], options: Any, path: String): Object | Group = js.native
  def groupSVGElements(elements: js.Array[Any], options: Unit, path: String): Object | Group = js.native
  
  /**
    * Invert transformation t
    * @param t The transform
    */
  def invertTransform(t: js.Array[Any]): js.Array[Any] = js.native
  
  /**
    * Returns true if context has transparent pixel
    * at specified location (taking tolerance into account)
    * @param ctx context
    * @param x x coordinate
    * @param y y coordinate
    * @param tolerance Tolerance
    */
  def isTransparent(ctx: CanvasRenderingContext2D, x: Double, y: Double, tolerance: Double): Boolean = js.native
  
  /**
    * Loads image element from given url and passes it to a callback
    * @param url URL representing an image
    * @param callback Callback; invoked with loaded image
    * @param [context] Context to invoke callback in
    * @param [crossOrigin] crossOrigin value to set image element to
    */
  def loadImage(url: String, callback: js.Function1[/* image */ HTMLImageElement, Unit]): Unit = js.native
  def loadImage(url: String, callback: js.Function1[/* image */ HTMLImageElement, Unit], context: Any): Unit = js.native
  def loadImage(
    url: String,
    callback: js.Function1[/* image */ HTMLImageElement, Unit],
    context: Any,
    crossOrigin: String
  ): Unit = js.native
  def loadImage(
    url: String,
    callback: js.Function1[/* image */ HTMLImageElement, Unit],
    context: Unit,
    crossOrigin: String
  ): Unit = js.native
  
  /**
    * Multiply matrix A by matrix B to nest transformations
    * @param  a First transformMatrix
    * @param  b Second transformMatrix
    */
  def multiplyTransformMatrices(a: js.Array[Double], b: js.Array[Double]): js.Array[Double] = js.native
  
  def parseUnit(value: String): Double | String = js.native
  def parseUnit(value: String, fontSize: Double): Double | String = js.native
  /**
    * Converts from attribute value to pixel value if applicable.
    * Returns converted pixels or original value not converted.
    * @param value number to operate on
    */
  def parseUnit(value: Double): Double | String = js.native
  def parseUnit(value: Double, fontSize: Double): Double | String = js.native
  
  /**
    * Populates an object with properties of another object
    * @param source Source object
    * @param destination Destination object
    * @param properties Propertie names to include
    */
  def populateWithProperties(source: Any, destination: Any, properties: Any): Unit = js.native
  
  /**
    * Decomposes standard 2x2 matrix into transform componentes
    * @param a transformMatrix
    */
  def qrDecompose(a: js.Array[Double]): Angle = js.native
  
  /**
    * Transforms radians to degrees.
    * @param radians value in radians
    */
  def radiansToDegrees(radians: Double): Double = js.native
  
  /**
    * Removes value from an array.
    * Presence of value (and its position in an array) is determined via `Array.prototype.indexOf`
    */
  def removeFromArray(array: js.Array[Any], value: Any): js.Array[Any] = js.native
  
  /**
    * reset an object transform state to neutral. Top and left are not accounted for
    * @static
    * @memberOf fabric.util
    * @param  {fabric.Object} target object to transform
    */
  def resetObjectTransform(target: Object): Unit = js.native
  
  /**
    * Returns object of given namespace
    * @param namespace Namespace string e.g. 'fabric.Image.filter' or 'fabric'
    */
  def resolveNamespace(namespace: String): Any = js.native
  
  /**
    * Rotates `point` around `origin` with `radians`
    * @param point The point to rotate
    * @param origin The origin of the rotation
    * @param radians The radians of the angle for the rotation
    */
  def rotatePoint(point: Point, origin: Point, radians: Double): Point = js.native
  
  /**
    * Rotates `vector` with `radians`
    * @param vector The vector to rotate (x and y)
    * @param radians The radians of the angle for the rotation
    */
  def rotateVector(vector: X, radians: Double): X = js.native
  
  /**
    * Extract Object transform values
    * @param  {fabric.Object} target object to read from
    * @return {Object} Components of transform
    */
  def saveObjectTransform(target: Object): FlipX = js.native
  
  /**
    * A wrapper around Number#toFixed, which contrary to native method returns number, not string.
    * @param number number to operate on
    * @param fractionDigits number of fraction digits to "leave"
    */
  def toFixed(number: Double, fractionDigits: Double): Double = js.native
  
  /**
    * Apply transform t to point p
    * @param  p The point to transform
    * @param  t The transform
    * @param  [ignoreOffset] Indicates that the offset should not be applied
    */
  def transformPoint(p: Point, t: js.Array[Any]): Point = js.native
  def transformPoint(p: Point, t: js.Array[Any], ignoreOffset: Boolean): Point = js.native
}
