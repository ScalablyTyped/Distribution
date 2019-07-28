package typings.gapiDotClientDotDns.gapiNs.clientNs.dnsNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotDns.Anon_AltFieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectsResource extends js.Object {
  /** Fetch the representation of an existing Project. */
  def get(request: Anon_AltFieldsKey): Request[Project]
}

object ProjectsResource {
  @scala.inline
  def apply(get: Anon_AltFieldsKey => Request[Project]): ProjectsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
  
    __obj.asInstanceOf[ProjectsResource]
  }
}

