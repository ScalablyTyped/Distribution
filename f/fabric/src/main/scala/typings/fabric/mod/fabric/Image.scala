package typings.fabric.mod.fabric

import typings.fabric.fabricImplMod.IAllFilters
import typings.fabric.fabricImplMod.IImageOptions
import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import typings.std.HTMLVideoElement
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fabric", "fabric.Image")
@js.native
open class Image protected ()
  extends typings.fabric.fabricImplMod.Image {
  /**
    * Constructor
    * @param element Image element
    * @param [options] Options object
    */
  def this(element: String) = this()
  def this(element: HTMLCanvasElement) = this()
  def this(element: HTMLImageElement) = this()
  def this(element: HTMLVideoElement) = this()
  def this(element: String, options: IImageOptions) = this()
  def this(element: HTMLCanvasElement, options: IImageOptions) = this()
  def this(element: HTMLImageElement, options: IImageOptions) = this()
  def this(element: HTMLVideoElement, options: IImageOptions) = this()
}
/* static members */
object Image {
  
  @JSImport("fabric", "fabric.Image")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("fabric", "fabric.Image.ATTRIBUTE_NAMES")
  @js.native
  def ATTRIBUTE_NAMES: js.Array[String] = js.native
  inline def ATTRIBUTE_NAMES_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ATTRIBUTE_NAMES")(x.asInstanceOf[js.Any])
  
  /**
    * Default CSS class name for canvas
    */
  @JSImport("fabric", "fabric.Image.CSS_CANVAS")
  @js.native
  def CSS_CANVAS: String = js.native
  inline def CSS_CANVAS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CSS_CANVAS")(x.asInstanceOf[js.Any])
  
  @JSImport("fabric", "fabric.Image.filters")
  @js.native
  def filters: IAllFilters = js.native
  inline def filters_=(x: IAllFilters): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("filters")(x.asInstanceOf[js.Any])
  
  /**
    * Returns Image instance from an SVG element
    * @param element Element to parse
    * @param callback Callback to execute when fabric.Image object is created
    * @param [options] Options object
    */
  inline def fromElement(element: SVGElement, callback: js.Function): typings.fabric.fabricImplMod.Image = (^.asInstanceOf[js.Dynamic].applyDynamic("fromElement")(element.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typings.fabric.fabricImplMod.Image]
  inline def fromElement(element: SVGElement, callback: js.Function, options: IImageOptions): typings.fabric.fabricImplMod.Image = (^.asInstanceOf[js.Dynamic].applyDynamic("fromElement")(element.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.fabric.fabricImplMod.Image]
  
  /**
    * Creates an instance of fabric.Image from an URL string
    * @param url URL to create an image from
    * @param [callback] Callback to invoke when image is created (newly created image is passed as a first argument)
    * @param [imgOptions] Options object
    */
  inline def fromURL(url: String): typings.fabric.fabricImplMod.Image = ^.asInstanceOf[js.Dynamic].applyDynamic("fromURL")(url.asInstanceOf[js.Any]).asInstanceOf[typings.fabric.fabricImplMod.Image]
  inline def fromURL(url: String, callback: js.Function1[/* image */ this.type, Unit]): typings.fabric.fabricImplMod.Image = (^.asInstanceOf[js.Dynamic].applyDynamic("fromURL")(url.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typings.fabric.fabricImplMod.Image]
  inline def fromURL(url: String, callback: js.Function1[/* image */ this.type, Unit], imgOptions: IImageOptions): typings.fabric.fabricImplMod.Image = (^.asInstanceOf[js.Dynamic].applyDynamic("fromURL")(url.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], imgOptions.asInstanceOf[js.Any])).asInstanceOf[typings.fabric.fabricImplMod.Image]
  inline def fromURL(url: String, callback: Unit, imgOptions: IImageOptions): typings.fabric.fabricImplMod.Image = (^.asInstanceOf[js.Dynamic].applyDynamic("fromURL")(url.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], imgOptions.asInstanceOf[js.Any])).asInstanceOf[typings.fabric.fabricImplMod.Image]
}
