package typings.downscale.downscaleMod

import typings.downscale.Anon_False
import typings.downscale.Anon_ReturnBlob
import typings.downscale.Anon_ReturnCanvas
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
    options: DownscaleOptions with Anon_ReturnCanvas with Anon_ReturnBlob with Anon_False
  ): js.Promise[HTMLCanvasElement] = js.native
}

