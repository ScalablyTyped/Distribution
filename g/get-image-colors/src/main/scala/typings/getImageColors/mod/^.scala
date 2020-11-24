package typings.getImageColors.mod

import typings.chromaJs.mod.Color
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("get-image-colors", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def apply(input: String): js.Promise[js.Array[Color]] = js.native
  def apply(input: String, callback: Callback): Unit = js.native
  def apply(input: String, options: Options): js.Promise[js.Array[Color]] = js.native
  /**
    * Extract colors from images. Supports GIF, JPG, PNG, and even SVG!
    */
  def apply(input: Buffer, options: Options, callback: js.Array[Color]): Unit = js.native
  def apply(input: Buffer, `type`: String): js.Promise[js.Array[Color]] = js.native
  def apply(input: Buffer, `type`: String, callback: Callback): Unit = js.native
}
