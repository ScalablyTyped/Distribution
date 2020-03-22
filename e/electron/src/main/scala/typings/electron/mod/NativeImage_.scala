package typings.electron.mod

import typings.electron.Electron.CreateFromBitmapOptions
import typings.electron.Electron.CreateFromBufferOptions
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("electron", "NativeImage")
@js.native
class NativeImage_ ()
  extends typings.electron.Electron.NativeImage_

/* static members */
@JSImport("electron", "NativeImage")
@js.native
object NativeImage_ extends js.Object {
  // Docs: http://electronjs.org/docs/api/native-image
  /**
    * Creates an empty `NativeImage` instance.
    */
  def createEmpty(): typings.electron.Electron.NativeImage_ = js.native
  /**
    * Creates a new `NativeImage` instance from `buffer` that contains the raw bitmap
    * pixel data returned by `toBitmap()`. The specific format is platform-dependent.
    */
  def createFromBitmap(buffer: Buffer, options: CreateFromBitmapOptions): typings.electron.Electron.NativeImage_ = js.native
  /**
    * Creates a new `NativeImage` instance from `buffer`. Tries to decode as PNG or
    * JPEG first.
    */
  def createFromBuffer(buffer: Buffer): typings.electron.Electron.NativeImage_ = js.native
  def createFromBuffer(buffer: Buffer, options: CreateFromBufferOptions): typings.electron.Electron.NativeImage_ = js.native
  /**
    * Creates a new `NativeImage` instance from `dataURL`.
    */
  def createFromDataURL(dataURL: String): typings.electron.Electron.NativeImage_ = js.native
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
  def createFromNamedImage(imageName: String): typings.electron.Electron.NativeImage_ = js.native
  def createFromNamedImage(imageName: String, hslShift: js.Array[Double]): typings.electron.Electron.NativeImage_ = js.native
  /**
    * Creates a new `NativeImage` instance from a file located at `path`. This method
    * returns an empty image if the `path` does not exist, cannot be read, or is not a
    * valid image.
    */
  def createFromPath(path: String): typings.electron.Electron.NativeImage_ = js.native
}

