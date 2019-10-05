package typings.gapiDotClientDotYoutube.gapi.client.youtube

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotYoutube.Anon_AltFieldsFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SponsorsResource extends js.Object {
  /** Lists sponsors for a channel. */
  def list(request: Anon_AltFieldsFilter): Request[SponsorListResponse]
}

object SponsorsResource {
  @scala.inline
  def apply(list: Anon_AltFieldsFilter => Request[SponsorListResponse]): SponsorsResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[SponsorsResource]
  }
}

