package typings.gapiClientFirebasedynamiclinks.gapi.client.firebasedynamiclinks

import typings.gapiClient.gapi.client.Request
import typings.gapiClientFirebasedynamiclinks.anon.Accesstoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShortLinksResource extends js.Object {
  /**
    * Creates a short Dynamic Link given either a valid long Dynamic Link or
    * details such as Dynamic Link domain, Android and iOS app information.
    * The created short Dynamic Link will not expire.
    *
    * Repeated calls with the same long Dynamic Link or Dynamic Link information
    * will produce the same short Dynamic Link.
    *
    * The Dynamic Link domain in the request must be owned by requester's
    * Firebase project.
    */
  def create(request: Accesstoken): Request[CreateShortDynamicLinkResponse]
}

object ShortLinksResource {
  @scala.inline
  def apply(create: Accesstoken => Request[CreateShortDynamicLinkResponse]): ShortLinksResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create))
    __obj.asInstanceOf[ShortLinksResource]
  }
}

