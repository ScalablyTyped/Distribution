package typings.gapiClientBooks.gapi.client.books

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientBooks.AnonAltFieldsKeyLocaleMaxAllowedMaturityRating
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PersonalizedstreamResource extends js.Object {
  /** Returns a stream of personalized book clusters */
  def get(request: AnonAltFieldsKeyLocaleMaxAllowedMaturityRating): Request_[Discoveryclusters]
}

object PersonalizedstreamResource {
  @scala.inline
  def apply(get: AnonAltFieldsKeyLocaleMaxAllowedMaturityRating => Request_[Discoveryclusters]): PersonalizedstreamResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
  
    __obj.asInstanceOf[PersonalizedstreamResource]
  }
}

