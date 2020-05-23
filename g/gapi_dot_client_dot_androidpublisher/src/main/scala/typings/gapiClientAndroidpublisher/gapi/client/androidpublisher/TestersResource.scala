package typings.gapiClientAndroidpublisher.gapi.client.androidpublisher

import typings.gapiClient.gapi.client.Request
import typings.gapiClientAndroidpublisher.anon.Oauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestersResource extends js.Object {
  def get(request: Oauthtoken): Request[Testers]
  def patch(request: Oauthtoken): Request[Testers]
  def update(request: Oauthtoken): Request[Testers]
}

object TestersResource {
  @scala.inline
  def apply(
    get: Oauthtoken => Request[Testers],
    patch: Oauthtoken => Request[Testers],
    update: Oauthtoken => Request[Testers]
  ): TestersResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[TestersResource]
  }
}

