package typings.electron.Electron

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Electron.NativeImage")
@js.native
class NativeImage_ () extends js.Object {
  var isMacTemplateImage: Boolean = js.native
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
    */
  def getAspectRatio(): Double = js.native
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
  def getSize(): Size = js.native
  /**
    * Whether the image is empty.
    */
  def isEmpty(): Boolean = js.native
  /**
    * Whether the image is a template image.
  **Deprecated**
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
  **Deprecated**
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

/* static members */
@JSGlobal("Electron.NativeImage")
@js.native
object NativeImage_ extends js.Object {
  // Docs: http://electronjs.org/docs/api/native-image
  /**
    * Creates an empty `NativeImage` instance.
    */
  def createEmpty(): NativeImage_ = js.native
  /**
    * Creates a new `NativeImage` instance from `buffer` that contains the raw bitmap
    * pixel data returned by `toBitmap()`. The specific format is platform-dependent.
    */
  def createFromBitmap(buffer: Buffer, options: CreateFromBitmapOptions): NativeImage_ = js.native
  /**
    * Creates a new `NativeImage` instance from `buffer`. Tries to decode as PNG or
    * JPEG first.
    */
  def createFromBuffer(buffer: Buffer): NativeImage_ = js.native
  def createFromBuffer(buffer: Buffer, options: CreateFromBufferOptions): NativeImage_ = js.native
  /**
    * Creates a new `NativeImage` instance from `dataURL`.
    */
  def createFromDataURL(dataURL: String): NativeImage_ = js.native
  /**
    * Creates a new `NativeImage` instance from the NSImage that maps to the given
    * image name. See `System Icons` for a list of possible values.
    *
    * The `hslShift` is applied to the image with the following rules:
    *
    * * `hsl_shift[0]` (hue): The absolute hue value for the image - 0 and 1 map to 0
    * and 360 on the hue color wheel (red).
    * * `hsl_shift[1]` (saturation): A saturation shift for the image, with the
    * following key values: 0 = remove all color. 0.5 = leave unchanged. 1 = fully
    * saturate the image.
    * * `hsl_shift[2]` (lightness): A lightness shift for the image, with the
    * following key values: 0 = remove all lightness (make all pixels black). 0.5 =
    * leave unchanged. 1 = full lightness (make all pixels white).
    *
    * This means that `[-1, 0, 1]` will make the image completely white and `[-1, 1,
    * 0]` will make the image completely black.
    *
    * In some cases, the `NSImageName` doesn't match its string representation; one
    * example of this is `NSFolderImageName`, whose string representation would
    * actually be `NSFolder`. Therefore, you'll need to determine the correct string
    * representation for your image before passing it in. This can be done with the
    * following:
    *
    * `echo -e '#import <Cocoa/Cocoa.h>\nint main() { NSLog(@"%@", SYSTEM_IMAGE_NAME);
    * }' | clang -otest -x objective-c -framework Cocoa - && ./test`
    * 
  where `SYSTEM_IMAGE_NAME` should be replaced with any value from this list.
    *
    * @platform darwin
    */
  def createFromNamedImage(imageName: String): NativeImage_ = js.native
  def createFromNamedImage(imageName: String, hslShift: js.Array[Double]): NativeImage_ = js.native
  /**
    * Creates a new `NativeImage` instance from a file located at `path`. This method
    * returns an empty image if the `path` does not exist, cannot be read, or is not a
    * valid image.
    */
  def createFromPath(path: String): NativeImage_ = js.native
}

