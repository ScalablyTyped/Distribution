package typings.gapiDotClientDotYoutubereporting.gapiNs.clientNs.youtubereportingNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotYoutubereporting.Anon_AccesstokenAltBearertokenCallbackFieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaResource extends js.Object {
  /**
    * Method for media download. Download is supported
    * on the URI `/v1/media/{+name}?alt=media`.
    */
  def download(request: Anon_AccesstokenAltBearertokenCallbackFieldsKey): Request[Media]
}

object MediaResource {
  @scala.inline
  def apply(download: Anon_AccesstokenAltBearertokenCallbackFieldsKey => Request[Media]): MediaResource = {
    val __obj = js.Dynamic.literal(download = js.Any.fromFunction1(download))
  
    __obj.asInstanceOf[MediaResource]
  }
}

