package typings.dragControls.anon

import typings.std.CanvasImageSource
import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import typings.std.ImageBitmap
import typings.std.ImageData
import typings.three.anon.Data
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofImageUtils extends StObject {
  
  def getDataURL(image: CanvasImageSource): String = js.native
  def getDataURL(image: HTMLCanvasElement): String = js.native
  /**
    * Returns a data URI containing a representation of the given image.
    * @param image The image object.
    */
  def getDataURL(image: HTMLImageElement): String = js.native
  def getDataURL(image: ImageBitmap): String = js.native
  def getDataURL(image: ImageData): String = js.native
  
  def sRGBToLinear(image: HTMLCanvasElement): HTMLCanvasElement = js.native
  /**
    * Converts the given sRGB image data to linear color space.
    * @param image
    */
  def sRGBToLinear(image: HTMLImageElement): HTMLCanvasElement = js.native
  def sRGBToLinear(image: ImageBitmap): HTMLCanvasElement = js.native
  /**
    * Converts the given sRGB image data to linear color space.
    * @param image
    */
  def sRGBToLinear(image: ImageData): Data = js.native
}
