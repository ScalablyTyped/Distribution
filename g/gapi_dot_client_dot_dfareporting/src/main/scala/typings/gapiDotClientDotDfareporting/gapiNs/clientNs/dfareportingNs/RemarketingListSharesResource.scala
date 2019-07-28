package typings.gapiDotClientDotDfareporting.gapiNs.clientNs.dfareportingNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotDfareporting.Anon_AltFieldsKey
import typings.gapiDotClientDotDfareporting.Anon_AltFieldsKeyOauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemarketingListSharesResource extends js.Object {
  /** Gets one remarketing list share by remarketing list ID. */
  def get(request: Anon_AltFieldsKeyOauthtoken): Request[RemarketingListShare]
  /** Updates an existing remarketing list share. This method supports patch semantics. */
  def patch(request: Anon_AltFieldsKeyOauthtoken): Request[RemarketingListShare]
  /** Updates an existing remarketing list share. */
  def update(request: Anon_AltFieldsKey): Request[RemarketingListShare]
}

object RemarketingListSharesResource {
  @scala.inline
  def apply(
    get: Anon_AltFieldsKeyOauthtoken => Request[RemarketingListShare],
    patch: Anon_AltFieldsKeyOauthtoken => Request[RemarketingListShare],
    update: Anon_AltFieldsKey => Request[RemarketingListShare]
  ): RemarketingListSharesResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[RemarketingListSharesResource]
  }
}

