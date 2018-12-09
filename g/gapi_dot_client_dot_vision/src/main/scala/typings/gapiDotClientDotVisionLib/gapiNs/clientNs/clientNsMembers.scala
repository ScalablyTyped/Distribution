package typings
package gapiDotClientDotVisionLib.gapiNs.clientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client")
@js.native
object clientNsMembers extends js.Object {
  val images: gapiDotClientDotVisionLib.gapiNs.clientNs.visionNs.ImagesResource = js.native
  /** Load Google Cloud Vision API v1 */
  def load(
    name: gapiDotClientDotVisionLib.gapiDotClientDotVisionLibStrings.vision,
    version: gapiDotClientDotVisionLib.gapiDotClientDotVisionLibStrings.v1
  ): js.Thenable[scala.Unit] = js.native
  def load(
    name: gapiDotClientDotVisionLib.gapiDotClientDotVisionLibStrings.vision,
    version: gapiDotClientDotVisionLib.gapiDotClientDotVisionLibStrings.v1,
    callback: js.Function0[_]
  ): scala.Unit = js.native
}

