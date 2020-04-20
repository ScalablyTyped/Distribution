package typings.gapiClientBooks.gapi.client.books

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientBooks.AnonMaxAllowedMaturityRating
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PersonalizedstreamResource extends js.Object {
  /** Returns a stream of personalized book clusters */
  def get(request: AnonMaxAllowedMaturityRating): Request_[Discoveryclusters]
}

object PersonalizedstreamResource {
  @scala.inline
  def apply(get: AnonMaxAllowedMaturityRating => Request_[Discoveryclusters]): PersonalizedstreamResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
    __obj.asInstanceOf[PersonalizedstreamResource]
  }
}

