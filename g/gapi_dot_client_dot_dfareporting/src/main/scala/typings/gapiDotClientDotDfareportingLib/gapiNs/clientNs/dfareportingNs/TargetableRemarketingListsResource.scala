package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TargetableRemarketingListsResource extends js.Object {
  /** Gets one remarketing list by ID. */
  def get(request: gapiDotClientDotDfareportingLib.Anon_AltFields): gapiDotClientLib.gapiNs.clientNs.Request[TargetableRemarketingList]
  /** Retrieves a list of targetable remarketing lists, possibly filtered. This method supports paging. */
  def list(request: gapiDotClientDotDfareportingLib.Anon_ActiveAdvertiserIdAltFieldsKey): gapiDotClientLib.gapiNs.clientNs.Request[TargetableRemarketingListsListResponse]
}

object TargetableRemarketingListsResource {
  @scala.inline
  def apply(
    get: js.Function1[
      gapiDotClientDotDfareportingLib.Anon_AltFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[TargetableRemarketingList]
    ],
    list: js.Function1[
      gapiDotClientDotDfareportingLib.Anon_ActiveAdvertiserIdAltFieldsKey, 
      gapiDotClientLib.gapiNs.clientNs.Request[TargetableRemarketingListsListResponse]
    ]
  ): TargetableRemarketingListsResource = {
    val __obj = js.Dynamic.literal(get = get, list = list)
  
    __obj.asInstanceOf[TargetableRemarketingListsResource]
  }
}

