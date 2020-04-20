package typings.gapiClientYoutubereporting.gapi.client.youtubereporting

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientYoutubereporting.AnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaResource extends js.Object {
  /**
    * Method for media download. Download is supported
    * on the URI `/v1/media/{+name}?alt=media`.
    */
  def download(request: AnonKey): Request_[Media]
}

object MediaResource {
  @scala.inline
  def apply(download: AnonKey => Request_[Media]): MediaResource = {
    val __obj = js.Dynamic.literal(download = js.Any.fromFunction1(download))
    __obj.asInstanceOf[MediaResource]
  }
}

