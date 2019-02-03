package typings
package electronLib.electronMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("electron", "NativeImage")
@js.native
class NativeImage ()
  extends electronLib.ElectronNs.NativeImage

/* static members */
@JSImport("electron", "NativeImage")
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

