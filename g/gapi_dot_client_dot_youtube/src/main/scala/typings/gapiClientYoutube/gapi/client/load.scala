package typings.gapiClientYoutube.gapi.client

import typings.gapiClientYoutube.gapiClientYoutubeStrings.v3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client.load")
@js.native
object load extends js.Object {
  /** Load YouTube Data API v3 */
  def apply(name: typings.gapiClientYoutube.gapiClientYoutubeStrings.youtube, version: v3): js.Thenable[Unit] = js.native
  def apply(
    name: typings.gapiClientYoutube.gapiClientYoutubeStrings.youtube,
    version: v3,
    callback: js.Function0[_]
  ): Unit = js.native
}

