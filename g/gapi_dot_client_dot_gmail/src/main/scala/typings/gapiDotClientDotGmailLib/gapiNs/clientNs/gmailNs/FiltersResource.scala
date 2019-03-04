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
    create: js.Function1[
      gapiDotClientDotGmailLib.Anon_Alt, 
      gapiDotClientLib.gapiNs.clientNs.Request[Filter]
    ],
    delete: js.Function1[
      gapiDotClientDotGmailLib.Anon_AltFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
    ],
    get: js.Function1[
      gapiDotClientDotGmailLib.Anon_AltFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[Filter]
    ],
    list: js.Function1[
      gapiDotClientDotGmailLib.Anon_Alt, 
      gapiDotClientLib.gapiNs.clientNs.Request[ListFiltersResponse]
    ]
  ): FiltersResource = {
    val __obj = js.Dynamic.literal(create = create, delete = delete, get = get, list = list)
  
    __obj.asInstanceOf[FiltersResource]
  }
}

