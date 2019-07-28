package typings.gapiDotClientDotAndroidpublisher.gapiNs.clientNs.androidpublisherNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotAndroidpublisher.Anon_AltEditIdFieldsKeyOauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestersResource extends js.Object {
  def get(request: Anon_AltEditIdFieldsKeyOauthtoken): Request[Testers]
  def patch(request: Anon_AltEditIdFieldsKeyOauthtoken): Request[Testers]
  def update(request: Anon_AltEditIdFieldsKeyOauthtoken): Request[Testers]
}

object TestersResource {
  @scala.inline
  def apply(
    get: Anon_AltEditIdFieldsKeyOauthtoken => Request[Testers],
    patch: Anon_AltEditIdFieldsKeyOauthtoken => Request[Testers],
    update: Anon_AltEditIdFieldsKeyOauthtoken => Request[Testers]
  ): TestersResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[TestersResource]
  }
}

