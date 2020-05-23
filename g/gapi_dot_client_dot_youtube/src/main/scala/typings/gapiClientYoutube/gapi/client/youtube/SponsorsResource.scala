package typings.gapiClientYoutube.gapi.client.youtube

import typings.gapiClient.gapi.client.Request
import typings.gapiClientYoutube.anon.Filter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SponsorsResource extends js.Object {
  /** Lists sponsors for a channel. */
  def list(request: Filter): Request[SponsorListResponse]
}

object SponsorsResource {
  @scala.inline
  def apply(list: Filter => Request[SponsorListResponse]): SponsorsResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[SponsorsResource]
  }
}

