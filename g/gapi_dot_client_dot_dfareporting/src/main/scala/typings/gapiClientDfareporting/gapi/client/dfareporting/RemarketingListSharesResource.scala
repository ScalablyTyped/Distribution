package typings.gapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientDfareporting.AnonAltFieldsKey
import typings.gapiClientDfareporting.AnonAltFieldsKeyOauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemarketingListSharesResource extends js.Object {
  /** Gets one remarketing list share by remarketing list ID. */
  def get(request: AnonAltFieldsKeyOauthtoken): Request_[RemarketingListShare]
  /** Updates an existing remarketing list share. This method supports patch semantics. */
  def patch(request: AnonAltFieldsKeyOauthtoken): Request_[RemarketingListShare]
  /** Updates an existing remarketing list share. */
  def update(request: AnonAltFieldsKey): Request_[RemarketingListShare]
}

object RemarketingListSharesResource {
  @scala.inline
  def apply(
    get: AnonAltFieldsKeyOauthtoken => Request_[RemarketingListShare],
    patch: AnonAltFieldsKeyOauthtoken => Request_[RemarketingListShare],
    update: AnonAltFieldsKey => Request_[RemarketingListShare]
  ): RemarketingListSharesResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[RemarketingListSharesResource]
  }
}

