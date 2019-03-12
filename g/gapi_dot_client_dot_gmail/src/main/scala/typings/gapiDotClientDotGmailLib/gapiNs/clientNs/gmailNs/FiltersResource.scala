package typings
package gapiDotClientDotGmailLib.gapiNs.clientNs.gmailNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FiltersResource extends js.Object {
  /** Creates a filter. */
  def create(request: gapiDotClientDotGmailLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[Filter]
  /** Deletes a filter. */
  def delete(request: gapiDotClientDotGmailLib.Anon_AltFields): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Gets a filter. */
  def get(request: gapiDotClientDotGmailLib.Anon_AltFields): gapiDotClientLib.gapiNs.clientNs.Request[Filter]
  /** Lists the message filters of a Gmail user. */
  def list(request: gapiDotClientDotGmailLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[ListFiltersResponse]
}

object FiltersResource {
  @scala.inline
  def apply(
    create: gapiDotClientDotGmailLib.Anon_Alt => gapiDotClientLib.gapiNs.clientNs.Request[Filter],
    delete: gapiDotClientDotGmailLib.Anon_AltFields => gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit],
    get: gapiDotClientDotGmailLib.Anon_AltFields => gapiDotClientLib.gapiNs.clientNs.Request[Filter],
    list: gapiDotClientDotGmailLib.Anon_Alt => gapiDotClientLib.gapiNs.clientNs.Request[ListFiltersResponse]
  ): FiltersResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[FiltersResource]
  }
}

