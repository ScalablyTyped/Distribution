package typings
package electronLib.ElectronNs

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
  def addRepresentation(options: AddRepresentationOptions): scala.Unit = js.native
  def crop(rect: Rectangle): NativeImage = js.native
  def getAspectRatio(): scala.Double = js.native
  /**
    * The difference between getBitmap() and toBitmap() is, getBitmap() does not copy
    * the bitmap data, so you have to use the returned Buffer immediately in current
    * event loop tick, otherwise the data might be changed or destroyed.
    */
  def getBitmap(): nodeLib.Buffer = js.native
  def getBitmap(options: BitmapOptions): nodeLib.Buffer = js.native
  /**
    * Notice that the returned pointer is a weak pointer to the underlying native
    * image instead of a copy, so you must ensure that the associated nativeImage
    * instance is kept around.
    */
  def getNativeHandle(): nodeLib.Buffer = js.native
  def getSize(): Size = js.native
  def isEmpty(): scala.Boolean = js.native
  def isTemplateImage(): scala.Boolean = js.native
  /**
    * If only the height or the width are specified then the current aspect ratio will
    * be preserved in the resized image.
    */
  def resize(options: ResizeOptions): NativeImage = js.native
  /**
    * Marks the image as a template image.
    */
  def setTemplateImage(option: scala.Boolean): scala.Unit = js.native
  def toBitmap(): nodeLib.Buffer = js.native
  def toBitmap(options: ToBitmapOptions): nodeLib.Buffer = js.native
  def toDataURL(): java.lang.String = js.native
  def toDataURL(options: ToDataURLOptions): java.lang.String = js.native
  def toJPEG(quality: scala.Double): nodeLib.Buffer = js.native
  def toPNG(): nodeLib.Buffer = js.native
  def toPNG(options: ToPNGOptions): nodeLib.Buffer = js.native
}

@JSGlobal("Electron.NativeImage")
@js.native
object NativeImage extends js.Object {
  // Docs: http://electronjs.org/docs/api/native-image
  /**
    * Creates an empty NativeImage instance.
    */
  def createEmpty(): electronLib.ElectronNs.NativeImage = js.native
  /**
    * Creates a new NativeImage instance from buffer.
    */
  def createFromBuffer(buffer: nodeLib.Buffer): electronLib.ElectronNs.NativeImage = js.native
  def createFromBuffer(buffer: nodeLib.Buffer, options: electronLib.ElectronNs.CreateFromBufferOptions): electronLib.ElectronNs.NativeImage = js.native
  /**
    * Creates a new NativeImage instance from dataURL.
    */
  def createFromDataURL(dataURL: java.lang.String): electronLib.ElectronNs.NativeImage = js.native
  /**
    * Creates a new NativeImage instance from the NSImage that maps to the given image
    * name. See NSImageName for a list of possible values. The hslShift is applied to
    * the image with the following rules This means that [-1, 0, 1] will make the
    * image completely white and [-1, 1, 0] will make the image completely black.
    */
  def createFromNamedImage(imageName: java.lang.String, hslShift: js.Array[scala.Double]): electronLib.ElectronNs.NativeImage = js.native
  /**
    * Creates a new NativeImage instance from a file located at path. This method
    * returns an empty image if the path does not exist, cannot be read, or is not a
    * valid image.
    */
  def createFromPath(path: java.lang.String): electronLib.ElectronNs.NativeImage = js.native
}

