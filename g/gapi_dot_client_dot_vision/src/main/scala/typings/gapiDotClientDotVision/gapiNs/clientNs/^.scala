package typings.gapiDotClientDotVision.gapiNs.clientNs

import typings.gapiDotClientDotVision.gapiDotClientDotVisionStrings.v1
import typings.gapiDotClientDotVision.gapiDotClientDotVisionStrings.vision
import typings.gapiDotClientDotVision.gapiNs.clientNs.visionNs.ImagesResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client")
@js.native
object ^ extends js.Object {
  val images: ImagesResource = js.native
  /** Load Google Cloud Vision API v1 */
  def load(name: vision, version: v1): js.Thenable[Unit] = js.native
  def load(name: vision, version: v1, callback: js.Function0[_]): Unit = js.native
}

