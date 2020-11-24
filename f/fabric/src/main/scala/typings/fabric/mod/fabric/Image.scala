package typings.fabric.mod.fabric

import typings.fabric.fabricImplMod.IAllFilters
import typings.fabric.fabricImplMod.IImageOptions
import typings.std.HTMLImageElement
import typings.std.HTMLVideoElement
import typings.std.SVGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fabric", "fabric.Image")
@js.native
/**
  * Constructor
  * @param element Image or Video element
  * @param [options] Options object
  */
class Image ()
  extends typings.fabric.fabricImplMod.Image {
  def this(element: String) = this()
  def this(element: HTMLImageElement) = this()
  def this(element: HTMLVideoElement) = this()
  def this(element: js.UndefOr[scala.Nothing], options: IImageOptions) = this()
  def this(element: String, options: IImageOptions) = this()
  def this(element: HTMLImageElement, options: IImageOptions) = this()
  def this(element: HTMLVideoElement, options: IImageOptions) = this()
}
/* static members */
@JSImport("fabric", "fabric.Image")
@js.native
object Image extends js.Object {
  
  var ATTRIBUTE_NAMES: js.Array[String] = js.native
  
  /**
    * Default CSS class name for canvas
    */
  var CSS_CANVAS: String = js.native
  
  var filters: IAllFilters = js.native
  
  /**
    * Returns Image instance from an SVG element
    * @param element Element to parse
    * @param callback Callback to execute when fabric.Image object is created
    * @param [options] Options object
    */
  def fromElement(element: SVGElement, callback: js.Function): typings.fabric.fabricImplMod.Image = js.native
  def fromElement(element: SVGElement, callback: js.Function, options: IImageOptions): typings.fabric.fabricImplMod.Image = js.native
  
  /**
    * Creates an instance of fabric.Image from an URL string
    * @param url URL to create an image from
    * @param [callback] Callback to invoke when image is created (newly created image is passed as a first argument)
    * @param [imgOptions] Options object
    */
  def fromURL(url: String): typings.fabric.fabricImplMod.Image = js.native
  def fromURL(url: String, callback: js.UndefOr[scala.Nothing], imgOptions: IImageOptions): typings.fabric.fabricImplMod.Image = js.native
  def fromURL(url: String, callback: js.Function1[/* image */ this.type, Unit]): typings.fabric.fabricImplMod.Image = js.native
  def fromURL(url: String, callback: js.Function1[/* image */ this.type, Unit], imgOptions: IImageOptions): typings.fabric.fabricImplMod.Image = js.native
}
