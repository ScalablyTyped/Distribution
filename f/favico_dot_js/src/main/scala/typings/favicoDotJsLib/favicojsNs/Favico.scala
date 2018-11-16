package typings
package favicoDotJsLib.favicojsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Favico extends js.Object {
  def badge(number: scala.Double): scala.Unit = js.native
  def badge(number: scala.Double, animation: java.lang.String): scala.Unit = js.native
  def badge(number: scala.Double, opts: FavicoJsOptions): scala.Unit = js.native
  def image(imageElement: stdLib.HTMLElement): scala.Unit = js.native
  def reset(): scala.Unit = js.native
  def video(imageElement: stdLib.HTMLElement): scala.Unit = js.native
  def webcam(): scala.Unit = js.native
}

