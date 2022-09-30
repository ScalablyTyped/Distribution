package typings.electron.Electron

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NativeImage_ extends StObject {
  
  /**
    * Add an image representation for a specific scale factor. This can be used to
    * explicitly add different scale factor representations to an image. This can be
    * called on empty images.
    */
  def addRepresentation(options: AddRepresentationOptions): Unit = js.native
  
  /**
    * The cropped image.
    */
  def crop(rect: Rectangle): NativeImage_ = js.native
  
  /**
    * The image's aspect ratio.
    *
    * If `scaleFactor` is passed, this will return the aspect ratio corresponding to
    * the image representation most closely matching the passed value.
    */
  def getAspectRatio(): Double = js.native
  def getAspectRatio(scaleFactor: Double): Double = js.native
  
  /**
    * A Buffer that contains the image's raw bitmap pixel data.
    *
    * The difference between `getBitmap()` and `toBitmap()` is that `getBitmap()` does
    * not copy the bitmap data, so you have to use the returned Buffer immediately in
    * current event loop tick; otherwise the data might be changed or destroyed.
    */
  def getBitmap(): Buffer = js.native
  def getBitmap(options: BitmapOptions): Buffer = js.native
  
  /**
    * A Buffer that stores C pointer to underlying native handle of the image. On
    * macOS, a pointer to `NSImage` instance would be returned.
    *
    * Notice that the returned pointer is a weak pointer to the underlying native
    * image instead of a copy, so you _must_ ensure that the associated `nativeImage`
    * instance is kept around.
    *
    * @platform darwin
    */
  def getNativeHandle(): Buffer = js.native
  
  /**
    * An array of all scale factors corresponding to representations for a given
    * nativeImage.
    */
  def getScaleFactors(): js.Array[Double] = js.native
  
  /**
    * If `scaleFactor` is passed, this will return the size corresponding to the image
    * representation most closely matching the passed value.
    */
  def getSize(): Size = js.native
  def getSize(scaleFactor: Double): Size = js.native
  
  /**
    * Whether the image is empty.
    */
  def isEmpty(): Boolean = js.native
  
  /**
    * A `boolean` property that determines whether the image is considered a template
    * image.
    *
    * Please note that this property only has an effect on macOS.
    *
    * @platform darwin
    */
  var isMacTemplateImage: Boolean = js.native
  
  /**
    * Whether the image is a template image.
    */
  def isTemplateImage(): Boolean = js.native
  
  /**
    * The resized image.
    *
    * If only the `height` or the `width` are specified then the current aspect ratio
    * will be preserved in the resized image.
    */
  def resize(options: ResizeOptions): NativeImage_ = js.native
  
  /**
    * Marks the image as a template image.
    */
  def setTemplateImage(option: Boolean): Unit = js.native
  
  /**
    * A Buffer that contains a copy of the image's raw bitmap pixel data.
    */
  def toBitmap(): Buffer = js.native
  def toBitmap(options: ToBitmapOptions): Buffer = js.native
  
  /**
    * The data URL of the image.
    */
  def toDataURL(): String = js.native
  def toDataURL(options: ToDataURLOptions): String = js.native
  
  /**
    * A Buffer that contains the image's `JPEG` encoded data.
    */
  def toJPEG(quality: Double): Buffer = js.native
  
  /**
    * A Buffer that contains the image's `PNG` encoded data.
    */
  def toPNG(): Buffer = js.native
  def toPNG(options: ToPNGOptions): Buffer = js.native
}
