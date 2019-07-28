package typings.electron.ElectronNs

import org.scalablytyped.runtime.Instantiable0
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Electron.NativeImage")
@js.native
class NativeImage () extends js.Object {
  /**
    * Add an image representation for a specific scale factor. This can be used to
    * explicitly add different scale factor representations to an image. This can be
    * called on empty images.
    */
  def addRepresentation(options: AddRepresentationOptions): Unit = js.native
  def crop(rect: Rectangle): NativeImage = js.native
  def getAspectRatio(): Double = js.native
  /**
    * The difference between getBitmap() and toBitmap() is, getBitmap() does not copy
    * the bitmap data, so you have to use the returned Buffer immediately in current
    * event loop tick, otherwise the data might be changed or destroyed.
    */
  def getBitmap(): Buffer = js.native
  def getBitmap(options: BitmapOptions): Buffer = js.native
  /**
    * Notice that the returned pointer is a weak pointer to the underlying native
    * image instead of a copy, so you must ensure that the associated nativeImage
    * instance is kept around.
    */
  def getNativeHandle(): Buffer = js.native
  def getSize(): Size = js.native
  def isEmpty(): Boolean = js.native
  def isTemplateImage(): Boolean = js.native
  /**
    * If only the height or the width are specified then the current aspect ratio will
    * be preserved in the resized image.
    */
  def resize(options: ResizeOptions): NativeImage = js.native
  /**
    * Marks the image as a template image.
    */
  def setTemplateImage(option: Boolean): Unit = js.native
  def toBitmap(): Buffer = js.native
  def toBitmap(options: ToBitmapOptions): Buffer = js.native
  def toDataURL(): String = js.native
  def toDataURL(options: ToDataURLOptions): String = js.native
  def toJPEG(quality: Double): Buffer = js.native
  def toPNG(): Buffer = js.native
  def toPNG(options: ToPNGOptions): Buffer = js.native
}

@JSGlobal("Electron.nativeImage")
@js.native
class nativeImageCls () extends NativeImage

/* static members */
@JSGlobal("Electron.NativeImage")
@js.native
object NativeImage extends js.Object {
  // Docs: http://electronjs.org/docs/api/native-image
  /**
    * Creates an empty NativeImage instance.
    */
  def createEmpty(): NativeImage = js.native
  /**
    * Creates a new NativeImage instance from buffer.
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

@JSGlobal("Electron.nativeImage")
@js.native
object nativeImage extends Instantiable0[NativeImage] {
  // Docs: http://electronjs.org/docs/api/native-image
  /**
    * Creates an empty NativeImage instance.
    */
  def createEmpty(): NativeImage = js.native
  /**
    * Creates a new NativeImage instance from buffer.
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

