package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectorySitesResource extends js.Object {
  /** Gets one directory site by ID. */
  def get(request: gapiDotClientDotDfareportingLib.Anon_AltFields): gapiDotClientLib.gapiNs.clientNs.Request[DirectorySite]
  /** Inserts a new directory site. */
  def insert(request: gapiDotClientDotDfareportingLib.Anon_AltFieldsKey): gapiDotClientLib.gapiNs.clientNs.Request[DirectorySite]
  /** Retrieves a list of directory sites, possibly filtered. This method supports paging. */
  def list(request: gapiDotClientDotDfareportingLib.Anon_AcceptsInStreamVideoPlacements): gapiDotClientLib.gapiNs.clientNs.Request[DirectorySitesListResponse]
}

object DirectorySitesResource {
  @scala.inline
  def apply(
    get: js.Function1[
      gapiDotClientDotDfareportingLib.Anon_AltFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[DirectorySite]
    ],
    insert: js.Function1[
      gapiDotClientDotDfareportingLib.Anon_AltFieldsKey, 
      gapiDotClientLib.gapiNs.clientNs.Request[DirectorySite]
    ],
    list: js.Function1[
      gapiDotClientDotDfareportingLib.Anon_AcceptsInStreamVideoPlacements, 
      gapiDotClientLib.gapiNs.clientNs.Request[DirectorySitesListResponse]
    ]
  ): DirectorySitesResource = {
    val __obj = js.Dynamic.literal(get = get, insert = insert, list = list)
  
    __obj.asInstanceOf[DirectorySitesResource]
  }
}

