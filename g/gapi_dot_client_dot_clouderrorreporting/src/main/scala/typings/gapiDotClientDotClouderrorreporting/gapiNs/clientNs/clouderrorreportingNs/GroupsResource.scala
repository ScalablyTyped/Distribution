package typings.gapiDotClientDotClouderrorreporting.gapiNs.clientNs.clouderrorreportingNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotClouderrorreporting.Anon_AccesstokenAltBearertoken
import typings.gapiDotClientDotClouderrorreporting.Anon_AccesstokenAltBearertokenCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupsResource extends js.Object {
  /** Get the specified group. */
  def get(request: Anon_AccesstokenAltBearertoken): Request[ErrorGroup]
  /**
    * Replace the data for the specified group.
    * Fails if the group does not exist.
    */
  def update(request: Anon_AccesstokenAltBearertokenCallback): Request[ErrorGroup]
}

object GroupsResource {
  @scala.inline
  def apply(
    get: Anon_AccesstokenAltBearertoken => Request[ErrorGroup],
    update: Anon_AccesstokenAltBearertokenCallback => Request[ErrorGroup]
  ): GroupsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[GroupsResource]
  }
}

