package typings.gapiClientSlides.gapi.client.slides

import typings.gapiClientSlides.anon.Bearertoken
import typings.gapiClientSlides.anon.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PresentationsResource extends js.Object {
  var pages: PagesResource = js.native
  /**
    * Applies one or more updates to the presentation.
    *
    * Each request is validated before
    * being applied. If any request is not valid, then the entire request will
    * fail and nothing will be applied.
    *
    * Some requests have replies to
    * give you some information about how they are applied. Other requests do
    * not need to return information; these each return an empty reply.
    * The order of replies matches that of the requests.
    *
    * For example, suppose you call batchUpdate with four updates, and only the
    * third one returns information. The response would have two empty replies:
    * the reply to the third request, and another empty reply, in that order.
    *
    * Because other users may be editing the presentation, the presentation
    * might not exactly reflect your changes: your changes may
    * be altered with respect to collaborator changes. If there are no
    * collaborators, the presentation should reflect your changes. In any case,
    * the updates in your request are guaranteed to be applied together
    * atomically.
    */
  def batchUpdate(request: Bearertoken): typings.gapiClient.gapi.client.Request[BatchUpdatePresentationResponse] = js.native
  /**
    * Creates a new presentation using the title given in the request. Other
    * fields in the request are ignored.
    * Returns the created presentation.
    */
  def create(request: Callback): typings.gapiClient.gapi.client.Request[Presentation] = js.native
  /** Gets the latest version of the specified presentation. */
  def get(request: Bearertoken): typings.gapiClient.gapi.client.Request[Presentation] = js.native
}

object PresentationsResource {
  @scala.inline
  def apply(
    batchUpdate: Bearertoken => typings.gapiClient.gapi.client.Request[BatchUpdatePresentationResponse],
    create: Callback => typings.gapiClient.gapi.client.Request[Presentation],
    get: Bearertoken => typings.gapiClient.gapi.client.Request[Presentation],
    pages: PagesResource
  ): PresentationsResource = {
    val __obj = js.Dynamic.literal(batchUpdate = js.Any.fromFunction1(batchUpdate), create = js.Any.fromFunction1(create), get = js.Any.fromFunction1(get), pages = pages.asInstanceOf[js.Any])
    __obj.asInstanceOf[PresentationsResource]
  }
  @scala.inline
  implicit class PresentationsResourceOps[Self <: PresentationsResource] (val x: Self) extends AnyVal {
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
    def setBatchUpdate(value: Bearertoken => typings.gapiClient.gapi.client.Request[BatchUpdatePresentationResponse]): Self = this.set("batchUpdate", js.Any.fromFunction1(value))
    @scala.inline
    def setCreate(value: Callback => typings.gapiClient.gapi.client.Request[Presentation]): Self = this.set("create", js.Any.fromFunction1(value))
    @scala.inline
    def setGet(value: Bearertoken => typings.gapiClient.gapi.client.Request[Presentation]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setPages(value: PagesResource): Self = this.set("pages", value.asInstanceOf[js.Any])
  }
  
}

