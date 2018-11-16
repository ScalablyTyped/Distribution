package typings
package fabricLib.fabricDashImplMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveDifficultInheritance: 
- Dropped Object */ @JSImport("fabric/fabric-impl", "Image")
@js.native
class Image protected () extends IImageOptions {
  /**
  	 * Constructor
  	 * @param element Image element
  	 * @param [options] Options object
  	 */
  def this(element: stdLib.HTMLImageElement, objObjects: IObjectOptions) = this()
  /**
  	 * Applies filters assigned to this image (from "filters" array)
  	 * @param callback Callback is invoked when all filters have been applied and new image is generated
  	 */
  def applyFilters(callback: js.Function): scala.Unit = js.native
  /**
  	 * Returns a clone of an instance
  	 * @param callback Callback is invoked with a clone as a first argument
  	 * @param [propertiesToInclude] Any properties that you might want to additionally include in the output
  	 */
  def clone(callback: js.Function): scala.Unit = js.native
  /**
  	 * Returns a clone of an instance
  	 * @param callback Callback is invoked with a clone as a first argument
  	 * @param [propertiesToInclude] Any properties that you might want to additionally include in the output
  	 */
  def clone(callback: js.Function, propertiesToInclude: js.Array[java.lang.String]): scala.Unit = js.native
  /**
  	 * Returns complexity of an instance
  	 * @return complexity of this instance
  	 */
  def complexity(): scala.Double = js.native
  /**
  	 * Returns image element which this instance if based on
  	 * @return Image element
  	 */
  def getElement(): stdLib.HTMLImageElement = js.native
  /**
  	 * Returns original size of an image
  	 * @return Object with "width" and "height" properties
  	 */
  def getOriginalSize(): fabricLib.Anon_Height = js.native
  /**
  	 * Returns source of an image
  	 * @return Source of an image
  	 */
  def getSrc(): java.lang.String = js.native
  def initialize(): scala.Unit = js.native
  def initialize(element: java.lang.String): scala.Unit = js.native
  def initialize(element: java.lang.String, options: IImageOptions): scala.Unit = js.native
  def initialize(element: stdLib.HTMLImageElement): scala.Unit = js.native
  def initialize(element: stdLib.HTMLImageElement, options: IImageOptions): scala.Unit = js.native
  def render(ctx: stdLib.CanvasRenderingContext2D, noTransform: scala.Boolean): scala.Unit = js.native
  /**
  	 * Sets crossOrigin value (on an instance and corresponding image element)
  	 */
  def setCrossOrigin(value: java.lang.String): Image = js.native
  /**
  	 * Sets image element for this instance to a specified one.
  	 * If filters defined they are applied to new image.
  	 * You might need to call `canvas.renderAll` and `object.setCoords` after replacing, to render new image and update controls area.
  	 * @param [callback] Callback is invoked when all filters have been applied and new image is generated
  	 * @param [options] Options object
  	 */
  def setElement(element: stdLib.HTMLImageElement, callback: js.Function, options: IImageOptions): Image = js.native
  /**
  	 * Sets source of an image
  	 * @param src Source string (URL)
  	 * @param [callback] Callback is invoked when image has been loaded (and all filters have been applied)
  	 * @param [options] Options object
  	 */
  def setSrc(src: java.lang.String): Image = js.native
  /**
  	 * Sets source of an image
  	 * @param src Source string (URL)
  	 * @param [callback] Callback is invoked when image has been loaded (and all filters have been applied)
  	 * @param [options] Options object
  	 */
  def setSrc(src: java.lang.String, callback: js.Function): Image = js.native
  /**
  	 * Sets source of an image
  	 * @param src Source string (URL)
  	 * @param [callback] Callback is invoked when image has been loaded (and all filters have been applied)
  	 * @param [options] Options object
  	 */
  def setSrc(src: java.lang.String, callback: js.Function, options: IImageOptions): Image = js.native
  /**
  	 * Returns object representation of an instance
  	 * @param [propertiesToInclude] Any properties that you might want to additionally include in the output
  	 * @return Object representation of an instance
  	 */
  def toObject(): js.Any = js.native
  /**
  	 * Returns object representation of an instance
  	 * @param [propertiesToInclude] Any properties that you might want to additionally include in the output
  	 * @return Object representation of an instance
  	 */
  def toObject(propertiesToInclude: js.Array[java.lang.String]): js.Any = js.native
  /**
  	 * Returns SVG representation of an instance
  	 * @param [reviver] Method for further parsing of svg representation.
  	 * @return svg representation of an instance
  	 */
  def toSVG(): java.lang.String = js.native
  /**
  	 * Returns SVG representation of an instance
  	 * @param [reviver] Method for further parsing of svg representation.
  	 * @return svg representation of an instance
  	 */
  def toSVG(reviver: js.Function): java.lang.String = js.native
}

/* RemoveDifficultInheritance: 
- Dropped Object */ @JSImport("fabric/fabric-impl", "Image")
@js.native
object Image extends js.Object {
  /**
  	 * Default CSS class name for canvas
  	 */
  var CSS_CANVAS: java.lang.String = js.native
  var filters: fabricLib.fabricDashImplMod.IAllFilters = js.native
  /**
  	 * Returns Image instance from an SVG element
  	 * @param element Element to parse
  	 * @param callback Callback to execute when fabric.Image object is created
  	 * @param [options] Options object
  	 */
  def fromElement(element: stdLib.SVGElement, callback: js.Function1[/* image */ this.type, scala.Unit]): scala.Unit = js.native
  /**
  	 * Returns Image instance from an SVG element
  	 * @param element Element to parse
  	 * @param callback Callback to execute when fabric.Image object is created
  	 * @param [options] Options object
  	 */
  def fromElement(
    element: stdLib.SVGElement,
    callback: js.Function1[/* image */ this.type, scala.Unit],
    options: fabricLib.fabricDashImplMod.IImageOptions
  ): scala.Unit = js.native
  /**
  	 * Creates an instance of fabric.Image from its object representation
  	 * @param object Object to create an instance from
  	 * @param [callback] Callback to invoke when an image instance is created
  	 */
  def fromObject(`object`: js.Any, callback: js.Function1[/* image */ this.type, scala.Unit]): scala.Unit = js.native
  /**
  	 * Creates an instance of fabric.Image from an URL string
  	 * @param url URL to create an image from
  	 * @param [callback] Callback to invoke when image is created (newly created image is passed as a first argument)
  	 * @param [imgOptions] Options object
  	 */
  def fromURL(url: java.lang.String): fabricLib.fabricDashImplMod.Image = js.native
  /**
  	 * Creates an instance of fabric.Image from an URL string
  	 * @param url URL to create an image from
  	 * @param [callback] Callback to invoke when image is created (newly created image is passed as a first argument)
  	 * @param [imgOptions] Options object
  	 */
  def fromURL(url: java.lang.String, callback: js.Function1[/* image */ this.type, scala.Unit]): fabricLib.fabricDashImplMod.Image = js.native
  /**
  	 * Creates an instance of fabric.Image from an URL string
  	 * @param url URL to create an image from
  	 * @param [callback] Callback to invoke when image is created (newly created image is passed as a first argument)
  	 * @param [imgOptions] Options object
  	 */
  def fromURL(
    url: java.lang.String,
    callback: js.Function1[/* image */ this.type, scala.Unit],
    imgOptions: fabricLib.fabricDashImplMod.IImageOptions
  ): fabricLib.fabricDashImplMod.Image = js.native
}

