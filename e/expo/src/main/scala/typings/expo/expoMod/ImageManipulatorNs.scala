package typings.expo.expoMod

import typings.expo.Anon_HeightOriginX
import typings.expo.Anon_HeightWidth
import typings.expo.Anon_Horizontal
import typings.expo.expoMod.ImageManipulatorNs.Action
import typings.expo.expoMod.ImageManipulatorNs.ImageResult
import typings.expo.expoMod.ImageManipulatorNs.SaveOptions
import typings.expo.expoStrings.jpeg
import typings.expo.expoStrings.png
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo", "ImageManipulator")
@js.native
object ImageManipulatorNs extends js.Object {
  /* Rewritten from type alias, can be one of: 
    - typings.expo.expoMod.ImageManipulatorNs.Resize
    - typings.expo.expoMod.ImageManipulatorNs.Rotate
    - typings.expo.expoMod.ImageManipulatorNs.Flip
    - typings.expo.expoMod.ImageManipulatorNs.Crop
  */
  trait Action extends js.Object
  
  trait Crop extends Action {
    var crop: Anon_HeightOriginX
  }
  
  trait Flip extends Action {
    var flip: Anon_Horizontal
  }
  
  trait ImageResult extends js.Object {
    var base64: js.UndefOr[String] = js.undefined
    var height: Double
    var uri: String
    var width: Double
  }
  
  trait Resize extends Action {
    var resize: Anon_HeightWidth
  }
  
  trait Rotate extends Action {
    var rotate: Double
  }
  
  trait SaveOptions extends js.Object {
    var base64: js.UndefOr[Boolean] = js.undefined
    /** A value in range `0` - `1` specifying compression level of the result image. `1` means no compression and `0` the highest compression. */
    var compress: js.UndefOr[Double] = js.undefined
    var format: js.UndefOr[jpeg | png] = js.undefined
  }
  
  def manipulateAsync(uri: String, actions: js.Array[Action]): js.Promise[ImageResult] = js.native
  def manipulateAsync(uri: String, actions: js.Array[Action], saveOptions: SaveOptions): js.Promise[ImageResult] = js.native
}

