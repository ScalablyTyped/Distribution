package typings.gapiClientAndroidpublisher.gapi.client.androidpublisher

import typings.gapiClient.gapi.client.Request
import typings.gapiClientAndroidpublisher.anon.EditId
import typings.gapiClientAndroidpublisher.anon.Oauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TracksResource extends js.Object {
  /** Fetches the track configuration for the specified track type. Includes the APK version codes that are in this track. */
  def get(request: Oauthtoken): Request[Track] = js.native
  /** Lists all the track configurations for this edit. */
  def list(request: EditId): Request[TracksListResponse] = js.native
  /**
    * Updates the track configuration for the specified track type. When halted, the rollout track cannot be updated without adding new APKs, and adding new
    * APKs will cause it to resume. This method supports patch semantics.
    */
  def patch(request: Oauthtoken): Request[Track] = js.native
  /**
    * Updates the track configuration for the specified track type. When halted, the rollout track cannot be updated without adding new APKs, and adding new
    * APKs will cause it to resume.
    */
  def update(request: Oauthtoken): Request[Track] = js.native
}

object TracksResource {
  @scala.inline
  def apply(
    get: Oauthtoken => Request[Track],
    list: EditId => Request[TracksListResponse],
    patch: Oauthtoken => Request[Track],
    update: Oauthtoken => Request[Track]
  ): TracksResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[TracksResource]
  }
  @scala.inline
  implicit class TracksResourceOps[Self <: TracksResource] (val x: Self) extends AnyVal {
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
    def setGet(value: Oauthtoken => Request[Track]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: EditId => Request[TracksListResponse]): Self = this.set("list", js.Any.fromFunction1(value))
    @scala.inline
    def setPatch(value: Oauthtoken => Request[Track]): Self = this.set("patch", js.Any.fromFunction1(value))
    @scala.inline
    def setUpdate(value: Oauthtoken => Request[Track]): Self = this.set("update", js.Any.fromFunction1(value))
  }
  
}

