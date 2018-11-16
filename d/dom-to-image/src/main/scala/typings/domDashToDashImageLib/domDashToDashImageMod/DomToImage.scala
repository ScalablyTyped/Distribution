package typings
package domDashToDashImageLib.domDashToDashImageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DomToImage extends js.Object {
  def toBlob(node: stdLib.Node): stdLib.Promise[stdLib.Blob] = js.native
  def toBlob(node: stdLib.Node, options: Options): stdLib.Promise[stdLib.Blob] = js.native
  def toJpeg(node: stdLib.Node): stdLib.Promise[java.lang.String] = js.native
  def toJpeg(node: stdLib.Node, options: Options): stdLib.Promise[java.lang.String] = js.native
  def toPixelData(node: stdLib.Node): stdLib.Promise[java.lang.String] = js.native
  def toPixelData(node: stdLib.Node, options: Options): stdLib.Promise[java.lang.String] = js.native
  def toPng(node: stdLib.Node): stdLib.Promise[java.lang.String] = js.native
  def toPng(node: stdLib.Node, options: Options): stdLib.Promise[java.lang.String] = js.native
  def toSvg(node: stdLib.Node): stdLib.Promise[java.lang.String] = js.native
  def toSvg(node: stdLib.Node, options: Options): stdLib.Promise[java.lang.String] = js.native
}

