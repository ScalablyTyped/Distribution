package typings.electron

import org.scalablytyped.runtime.Instantiable0
import typings.electron.Electron.CreateFromBitmapOptions
import typings.electron.Electron.CreateFromBufferOptions
import typings.electron.Electron.NativeImage
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofClassNativeImage extends Instantiable0[NativeImage] {
  // Docs: http://electronjs.org/docs/api/native-image
  /**
    * Creates an empty NativeImage instance.
    */
  def createEmpty(): NativeImage = js.native
  /**
    * Creates a new NativeImage instance from buffer that contains the raw bitmap
    * pixel data returned by toBitmap(). The specific format is platform-dependent.
    */
  def createFromBitmap(buffer: Buffer, options: CreateFromBitmapOptions): NativeImage = js.native
  /**
    * Creates a new NativeImage instance from buffer. Tries to decode as PNG or JPEG
    * first.
    */
  def createFromBuffer(buffer: Buffer): NativeImage = js.native
  def createFromBuffer(buffer: Buffer, options: CreateFromBufferOptions): NativeImage = js.native
  /**
    * Creates a new NativeImage instance from dataURL.
    */
  def createFromDataURL(dataURL: String): NativeImage = js.native
  /**
    * Creates a new NativeImage instance from the NSImage that maps to the given image
    * name. See NSImageName for a list of possible values. The hslShift is applied to
    * the image with the following rules This means that [-1, 0, 1] will make the
    * image completely white and [-1, 1, 0] will make the image completely black. In
    * some cases, the NSImageName doesn't match its string representation; one example
    * of this is NSFolderImageName, whose string representation would actually be
    * NSFolder. Therefore, you'll need to determine the correct string representation
    * for your image before passing it in. This can be done with the following: echo
    * -e '#import <Cocoa/Cocoa.h>\nint main() { NSLog(@"%@", SYSTEM_IMAGE_NAME); }' |
    * clang -otest -x objective-c -framework Cocoa - && ./test where SYSTEM_IMAGE_NAME
    * should be replaced with any value from this list.
    */
  def createFromNamedImage(imageName: String, hslShift: js.Array[Double]): NativeImage = js.native
  /**
    * Creates a new NativeImage instance from a file located at path. This method
    * returns an empty image if the path does not exist, cannot be read, or is not a
    * valid image.
    */
  def createFromPath(path: String): NativeImage = js.native
}

