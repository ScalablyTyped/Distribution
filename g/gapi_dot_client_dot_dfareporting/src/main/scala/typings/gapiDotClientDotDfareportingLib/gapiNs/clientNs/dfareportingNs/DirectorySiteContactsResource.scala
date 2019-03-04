package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectorySiteContactsResource extends js.Object {
  /** Gets one directory site contact by ID. */
  def get(request: gapiDotClientDotDfareportingLib.Anon_AltFields): gapiDotClientLib.gapiNs.clientNs.Request[DirectorySiteContact]
  /** Retrieves a list of directory site contacts, possibly filtered. This method supports paging. */
  def list(request: gapiDotClientDotDfareportingLib.Anon_AltDirectorySiteIds): gapiDotClientLib.gapiNs.clientNs.Request[DirectorySiteContactsListResponse]
}

object DirectorySiteContactsResource {
  @scala.inline
  def apply(
    get: js.Function1[
      gapiDotClientDotDfareportingLib.Anon_AltFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[DirectorySiteContact]
    ],
    list: js.Function1[
      gapiDotClientDotDfareportingLib.Anon_AltDirectorySiteIds, 
      gapiDotClientLib.gapiNs.clientNs.Request[DirectorySiteContactsListResponse]
    ]
  ): DirectorySiteContactsResource = {
    val __obj = js.Dynamic.literal(get = get, list = list)
  
    __obj.asInstanceOf[DirectorySiteContactsResource]
  }
}

