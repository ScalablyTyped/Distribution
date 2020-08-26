package typings.gapiClientAndroidpublisher.gapi.client.androidpublisher

import typings.gapiClient.gapi.client.Request
import typings.gapiClientAndroidpublisher.anon.Oauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestersResource extends js.Object {
  def get(request: Oauthtoken): Request[Testers] = js.native
  def patch(request: Oauthtoken): Request[Testers] = js.native
  def update(request: Oauthtoken): Request[Testers] = js.native
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
  @scala.inline
  implicit class TestersResourceOps[Self <: TestersResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGet(value: Oauthtoken => Request[Testers]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setPatch(value: Oauthtoken => Request[Testers]): Self = this.set("patch", js.Any.fromFunction1(value))
    @scala.inline
    def setUpdate(value: Oauthtoken => Request[Testers]): Self = this.set("update", js.Any.fromFunction1(value))
  }
  
}

