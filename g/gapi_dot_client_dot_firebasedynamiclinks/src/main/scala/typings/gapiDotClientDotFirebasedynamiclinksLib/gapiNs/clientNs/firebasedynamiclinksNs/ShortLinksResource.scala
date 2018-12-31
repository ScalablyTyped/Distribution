package typings
package gapiDotClientDotFirebasedynamiclinksLib.gapiNs.clientNs.firebasedynamiclinksNs

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
  def create(request: gapiDotClientDotFirebasedynamiclinksLib.Anon_Accesstoken): gapiDotClientLib.gapiNs.clientNs.Request[CreateShortDynamicLinkResponse]
}

