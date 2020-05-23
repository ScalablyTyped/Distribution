package typings.glur

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("glur", JSImport.Namespace)
@js.native
object mod extends js.Object {
  /**
    * Fast Gaussian Blur in pure JavaScript, via IIR filer.
    * Speed does not depend on blur radius
    * @param src - typed array with image RGBA data (will be updated with blurred image)
    * @param width - image width
    * @param height - image height
    * @param radius - blur radius
    */
  def apply(src: Uint8Array, width: Double, height: Double, radius: Double): Unit = js.native
}

