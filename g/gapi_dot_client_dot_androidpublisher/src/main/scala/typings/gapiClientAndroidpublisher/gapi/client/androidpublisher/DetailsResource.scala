package typings.gapiClientAndroidpublisher.gapi.client.androidpublisher

import typings.gapiClient.gapi.client.Request
import typings.gapiClientAndroidpublisher.anon.EditId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DetailsResource extends js.Object {
  /** Fetches app details for this edit. This includes the default language and developer support contact information. */
  def get(request: EditId): Request[AppDetails] = js.native
  /** Updates app details for this edit. This method supports patch semantics. */
  def patch(request: EditId): Request[AppDetails] = js.native
  /** Updates app details for this edit. */
  def update(request: EditId): Request[AppDetails] = js.native
}

object DetailsResource {
  @scala.inline
  def apply(
    get: EditId => Request[AppDetails],
    patch: EditId => Request[AppDetails],
    update: EditId => Request[AppDetails]
  ): DetailsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[DetailsResource]
  }
  @scala.inline
  implicit class DetailsResourceOps[Self <: DetailsResource] (val x: Self) extends AnyVal {
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
    def setGet(value: EditId => Request[AppDetails]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setPatch(value: EditId => Request[AppDetails]): Self = this.set("patch", js.Any.fromFunction1(value))
    @scala.inline
    def setUpdate(value: EditId => Request[AppDetails]): Self = this.set("update", js.Any.fromFunction1(value))
  }
  
}

