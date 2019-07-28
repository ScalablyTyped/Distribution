package typings.gapiDotClientDotSlides.gapiNs.clientNs

import typings.gapiDotClientDotSlides.gapiDotClientDotSlidesStrings.slides
import typings.gapiDotClientDotSlides.gapiDotClientDotSlidesStrings.v1
import typings.gapiDotClientDotSlides.gapiNs.clientNs.slidesNs.PresentationsResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client")
@js.native
object ^ extends js.Object {
  val presentations: PresentationsResource = js.native
  /** Load Google Slides API v1 */
  def load(name: slides, version: v1): js.Thenable[Unit] = js.native
  def load(name: slides, version: v1, callback: js.Function0[_]): Unit = js.native
}

