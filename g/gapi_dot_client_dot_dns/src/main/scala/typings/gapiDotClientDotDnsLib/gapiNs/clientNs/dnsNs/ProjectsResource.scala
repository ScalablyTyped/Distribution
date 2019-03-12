package typings
package gapiDotClientDotDnsLib.gapiNs.clientNs.dnsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectsResource extends js.Object {
  /** Fetch the representation of an existing Project. */
  def get(request: gapiDotClientDotDnsLib.Anon_AltFieldsKey): gapiDotClientLib.gapiNs.clientNs.Request[Project]
}

object ProjectsResource {
  @scala.inline
  def apply(get: gapiDotClientDotDnsLib.Anon_AltFieldsKey => gapiDotClientLib.gapiNs.clientNs.Request[Project]): ProjectsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
  
    __obj.asInstanceOf[ProjectsResource]
  }
}

