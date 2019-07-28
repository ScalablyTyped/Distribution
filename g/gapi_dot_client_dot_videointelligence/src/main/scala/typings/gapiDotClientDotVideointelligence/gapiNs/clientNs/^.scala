package typings.gapiDotClientDotVideointelligence.gapiNs.clientNs

import typings.gapiDotClientDotVideointelligence.gapiDotClientDotVideointelligenceStrings.v1beta1
import typings.gapiDotClientDotVideointelligence.gapiDotClientDotVideointelligenceStrings.videointelligence
import typings.gapiDotClientDotVideointelligence.gapiNs.clientNs.videointelligenceNs.VideosResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client")
@js.native
object ^ extends js.Object {
  val videos: VideosResource = js.native
  /** Load Cloud Video Intelligence API v1beta1 */
  def load(name: videointelligence, version: v1beta1): js.Thenable[Unit] = js.native
  def load(name: videointelligence, version: v1beta1, callback: js.Function0[_]): Unit = js.native
}

