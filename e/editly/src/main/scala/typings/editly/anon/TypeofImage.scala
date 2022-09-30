package typings.editly.anon

import org.scalablytyped.runtime.Instantiable1
import typings.fabric.fabricImplMod.IAllFilters
import typings.fabric.fabricImplMod.IImageOptions
import typings.fabric.mod.fabric.Image
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofImage
  extends StObject
     with Instantiable1[/* element */ String, Image] {
  
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
  def fromURL(url: String, callback: js.Function1[/* image */ this.type, Unit]): typings.fabric.fabricImplMod.Image = js.native
  def fromURL(url: String, callback: js.Function1[/* image */ this.type, Unit], imgOptions: IImageOptions): typings.fabric.fabricImplMod.Image = js.native
  def fromURL(url: String, callback: Unit, imgOptions: IImageOptions): typings.fabric.fabricImplMod.Image = js.native
}
