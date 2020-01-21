package typings.gapiClientAndroidpublisher.gapi.client.androidpublisher

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientAndroidpublisher.AnonAltEditIdFieldsKeyOauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestersResource extends js.Object {
  def get(request: AnonAltEditIdFieldsKeyOauthtoken): Request_[Testers]
  def patch(request: AnonAltEditIdFieldsKeyOauthtoken): Request_[Testers]
  def update(request: AnonAltEditIdFieldsKeyOauthtoken): Request_[Testers]
}

object TestersResource {
  @scala.inline
  def apply(
    get: AnonAltEditIdFieldsKeyOauthtoken => Request_[Testers],
    patch: AnonAltEditIdFieldsKeyOauthtoken => Request_[Testers],
    update: AnonAltEditIdFieldsKeyOauthtoken => Request_[Testers]
  ): TestersResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[TestersResource]
  }
}

