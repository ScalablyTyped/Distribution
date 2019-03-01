package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectsResource extends js.Object {
  /** Gets one project by ID. */
  def get(request: gapiDotClientDotDfareportingLib.Anon_AltFields): gapiDotClientLib.gapiNs.clientNs.Request[Project]
  /** Retrieves a list of projects, possibly filtered. This method supports paging. */
  def list(request: gapiDotClientDotDfareportingLib.Anon_AdvertiserIds): gapiDotClientLib.gapiNs.clientNs.Request[ProjectsListResponse]
}

object ProjectsResource {
  @scala.inline
  def apply(
    get: js.Function1[
      gapiDotClientDotDfareportingLib.Anon_AltFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[Project]
    ],
    list: js.Function1[
      gapiDotClientDotDfareportingLib.Anon_AdvertiserIds, 
      gapiDotClientLib.gapiNs.clientNs.Request[ProjectsListResponse]
    ]
  ): ProjectsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(get)
    __obj.updateDynamic("list")(list)
    __obj.asInstanceOf[ProjectsResource]
  }
}

