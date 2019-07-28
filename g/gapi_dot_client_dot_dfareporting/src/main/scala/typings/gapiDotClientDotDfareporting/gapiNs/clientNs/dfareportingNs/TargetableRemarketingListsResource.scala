package typings.gapiDotClientDotDfareporting.gapiNs.clientNs.dfareportingNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotDfareporting.Anon_ActiveAdvertiserIdAltFieldsKey
import typings.gapiDotClientDotDfareporting.Anon_AltFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TargetableRemarketingListsResource extends js.Object {
  /** Gets one remarketing list by ID. */
  def get(request: Anon_AltFields): Request[TargetableRemarketingList]
  /** Retrieves a list of targetable remarketing lists, possibly filtered. This method supports paging. */
  def list(request: Anon_ActiveAdvertiserIdAltFieldsKey): Request[TargetableRemarketingListsListResponse]
}

object TargetableRemarketingListsResource {
  @scala.inline
  def apply(
    get: Anon_AltFields => Request[TargetableRemarketingList],
    list: Anon_ActiveAdvertiserIdAltFieldsKey => Request[TargetableRemarketingListsListResponse]
  ): TargetableRemarketingListsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[TargetableRemarketingListsResource]
  }
}

