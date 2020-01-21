package typings.downscale.mod

import typings.downscale.AnonFalse
import typings.downscale.AnonReturnBlob
import typings.downscale.AnonReturnCanvas
import typings.std.HTMLCanvasElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("downscale", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * Overloads that automatically type the return value based on the selected options
    */
  def apply(source: ImageSource, width: Double, height: Double): js.Promise[HTMLCanvasElement] = js.native
  def apply(
    source: ImageSource,
    width: Double,
    height: Double,
    options: DownscaleOptions with AnonReturnCanvas with AnonReturnBlob with AnonFalse
  ): js.Promise[HTMLCanvasElement] = js.native
}

