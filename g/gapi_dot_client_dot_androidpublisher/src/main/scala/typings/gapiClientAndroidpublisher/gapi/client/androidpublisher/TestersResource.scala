package typings.gapiClientAndroidpublisher.gapi.client.androidpublisher

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientAndroidpublisher.AnonOauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestersResource extends js.Object {
  def get(request: AnonOauthtoken): Request_[Testers]
  def patch(request: AnonOauthtoken): Request_[Testers]
  def update(request: AnonOauthtoken): Request_[Testers]
}

object TestersResource {
  @scala.inline
  def apply(
    get: AnonOauthtoken => Request_[Testers],
    patch: AnonOauthtoken => Request_[Testers],
    update: AnonOauthtoken => Request_[Testers]
  ): TestersResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[TestersResource]
  }
}

