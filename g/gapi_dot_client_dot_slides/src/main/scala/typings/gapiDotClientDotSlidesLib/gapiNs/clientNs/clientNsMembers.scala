package typings
package gapiDotClientDotSlidesLib.gapiNs.clientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client")
@js.native
object clientNsMembers extends js.Object {
  val presentations: gapiDotClientDotSlidesLib.gapiNs.clientNs.slidesNs.PresentationsResource = js.native
  /** Load Google Slides API v1 */
  def load(
    name: gapiDotClientDotSlidesLib.gapiDotClientDotSlidesLibStrings.slides,
    version: gapiDotClientDotSlidesLib.gapiDotClientDotSlidesLibStrings.v1
  ): js.Thenable[scala.Unit] = js.native
  def load(
    name: gapiDotClientDotSlidesLib.gapiDotClientDotSlidesLibStrings.slides,
    version: gapiDotClientDotSlidesLib.gapiDotClientDotSlidesLibStrings.v1,
    callback: js.Function0[_]
  ): scala.Unit = js.native
}

