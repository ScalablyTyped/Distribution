package typings.downscale.mod

import typings.downscale.anon.DownscaleOptionsreturnBlo
import typings.downscale.anon.DownscaleOptionsreturnBloImageType
import typings.downscale.anon.DownscaleOptionsreturnCan
import typings.std.Blob
import typings.std.HTMLCanvasElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("downscale", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  /**
    * Overloads that automatically type the return value based on the selected options
    */
  def apply(source: ImageSource, width: Double, height: Double): js.Promise[HTMLCanvasElement] = js.native
  def apply(source: ImageSource, width: Double, height: Double, options: DownscaleOptionsreturnBlo): js.Promise[Blob] = js.native
  def apply(source: ImageSource, width: Double, height: Double, options: DownscaleOptionsreturnBloImageType): js.Promise[String] = js.native
  def apply(source: ImageSource, width: Double, height: Double, options: DownscaleOptionsreturnCan): js.Promise[HTMLCanvasElement] = js.native
}
