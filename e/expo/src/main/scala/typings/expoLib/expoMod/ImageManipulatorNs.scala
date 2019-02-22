package typings
package expoLib.expoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo", "ImageManipulator")
@js.native
object ImageManipulatorNs extends js.Object {
  trait Crop extends js.Object {
    var crop: expoLib.Anon_HeightOriginX
  }
  
  trait Flip extends js.Object {
    var flip: expoLib.Anon_Horizontal
  }
  
  trait ImageResult extends js.Object {
    var base64: js.UndefOr[java.lang.String] = js.undefined
    var height: scala.Double
    var uri: java.lang.String
    var width: scala.Double
  }
  
  trait Resize extends js.Object {
    var resize: expoLib.Anon_HeightWidth
  }
  
  trait Rotate extends js.Object {
    var rotate: scala.Double
  }
  
  trait SaveOptions extends js.Object {
    var base64: js.UndefOr[scala.Boolean] = js.undefined
    /** A value in range `0` - `1` specifying compression level of the result image. `1` means no compression and `0` the highest compression. */
    var compress: js.UndefOr[scala.Double] = js.undefined
    var format: js.UndefOr[expoLib.expoLibStrings.jpeg | expoLib.expoLibStrings.png] = js.undefined
  }
  
  def manipulateAsync(uri: java.lang.String, actions: js.Array[Action]): js.Promise[ImageResult] = js.native
  def manipulateAsync(uri: java.lang.String, actions: js.Array[Action], saveOptions: SaveOptions): js.Promise[ImageResult] = js.native
  type Action = Resize | Rotate | Flip | Crop
}

