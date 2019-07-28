package typings.electron.electronMod

import org.scalablytyped.runtime.Instantiable0
import typings.electron.ElectronNs.CreateFromBufferOptions
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("electron", "NativeImage")
@js.native
class NativeImage ()
  extends typings.electron.ElectronNs.NativeImage

@JSImport("electron", "nativeImage")
@js.native
class nativeImageCls ()
  extends typings.electron.ElectronNs.NativeImage

/* static members */
@JSImport("electron", "NativeImage")
@js.native
object NativeImage extends js.Object {
  // Docs: http://electronjs.org/docs/api/native-image
  /**
    * Creates an empty NativeImage instance.
    */
  def createEmpty(): typings.electron.ElectronNs.NativeImage = js.native
  /**
    * Creates a new NativeImage instance from buffer.
    */
  def createFromBuffer(buffer: Buffer): typings.electron.ElectronNs.NativeImage = js.native
  def createFromBuffer(buffer: Buffer, options: CreateFromBufferOptions): typings.electron.ElectronNs.NativeImage = js.native
  /**
    * Creates a new NativeImage instance from dataURL.
    */
  def createFromDataURL(dataURL: String): typings.electron.ElectronNs.NativeImage = js.native
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
  def createFromNamedImage(imageName: String, hslShift: js.Array[Double]): typings.electron.ElectronNs.NativeImage = js.native
  /**
    * Creates a new NativeImage instance from a file located at path. This method
    * returns an empty image if the path does not exist, cannot be read, or is not a
    * valid image.
    */
  def createFromPath(path: String): typings.electron.ElectronNs.NativeImage = js.native
}

@JSImport("electron", "nativeImage")
@js.native
object nativeImage
  extends Instantiable0[typings.electron.ElectronNs.NativeImage] {
  // Docs: http://electronjs.org/docs/api/native-image
  /**
    * Creates an empty NativeImage instance.
    */
  def createEmpty(): typings.electron.ElectronNs.NativeImage = js.native
  /**
    * Creates a new NativeImage instance from buffer.
    */
  def createFromBuffer(buffer: Buffer): typings.electron.ElectronNs.NativeImage = js.native
  def createFromBuffer(buffer: Buffer, options: CreateFromBufferOptions): typings.electron.ElectronNs.NativeImage = js.native
  /**
    * Creates a new NativeImage instance from dataURL.
    */
  def createFromDataURL(dataURL: String): typings.electron.ElectronNs.NativeImage = js.native
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
  def createFromNamedImage(imageName: String, hslShift: js.Array[Double]): typings.electron.ElectronNs.NativeImage = js.native
  /**
    * Creates a new NativeImage instance from a file located at path. This method
    * returns an empty image if the path does not exist, cannot be read, or is not a
    * valid image.
    */
  def createFromPath(path: String): typings.electron.ElectronNs.NativeImage = js.native
}

