package typings.domDashToDashImage.domDashToDashImageMod

import org.scalablytyped.runtime.TopLevel
import typings.std.Blob
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DomToImage extends js.Object {
  def toBlob(node: Node): js.Promise[Blob] = js.native
  def toBlob(node: Node, options: Options): js.Promise[Blob] = js.native
  def toJpeg(node: Node): js.Promise[String] = js.native
  def toJpeg(node: Node, options: Options): js.Promise[String] = js.native
  def toPixelData(node: Node): js.Promise[String] = js.native
  def toPixelData(node: Node, options: Options): js.Promise[String] = js.native
  def toPng(node: Node): js.Promise[String] = js.native
  def toPng(node: Node, options: Options): js.Promise[String] = js.native
  def toSvg(node: Node): js.Promise[String] = js.native
  def toSvg(node: Node, options: Options): js.Promise[String] = js.native
}

@JSImport("dom-to-image", "DomToImage")
@js.native
object DomToImage extends TopLevel[DomToImage]

