package typings.gapiDotClientDotBooks.gapi.client.books

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotBooks.Anon_AltFieldsKeyLocaleMaxAllowedMaturityRating
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PersonalizedstreamResource extends js.Object {
  /** Returns a stream of personalized book clusters */
  def get(request: Anon_AltFieldsKeyLocaleMaxAllowedMaturityRating): Request[Discoveryclusters]
}

object PersonalizedstreamResource {
  @scala.inline
  def apply(get: Anon_AltFieldsKeyLocaleMaxAllowedMaturityRating => Request[Discoveryclusters]): PersonalizedstreamResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
  
    __obj.asInstanceOf[PersonalizedstreamResource]
  }
}

