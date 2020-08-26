package typings.googleAppsScript.GoogleAppsScript.Slides.Collection

import typings.googleAppsScript.GoogleAppsScript.Slides.Collection.Presentations.PagesCollection
import typings.googleAppsScript.GoogleAppsScript.Slides.Schema.BatchUpdatePresentationRequest
import typings.googleAppsScript.GoogleAppsScript.Slides.Schema.BatchUpdatePresentationResponse
import typings.googleAppsScript.GoogleAppsScript.Slides.Schema.Presentation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PresentationsCollection extends js.Object {
  var Pages: js.UndefOr[PagesCollection] = js.native
  // Applies one or more updates to the presentation.
  // Each request is validated before
  // being applied. If any request is not valid, then the entire request will
  // fail and nothing will be applied.
  // Some requests have replies to
  // give you some information about how they are applied. Other requests do
  // not need to return information; these each return an empty reply.
  // The order of replies matches that of the requests.
  // For example, suppose you call batchUpdate with four updates, and only the
  // third one returns information. The response would have two empty replies:
  // the reply to the third request, and another empty reply, in that order.
  // Because other users may be editing the presentation, the presentation
  // might not exactly reflect your changes: your changes may
  // be altered with respect to collaborator changes. If there are no
  // collaborators, the presentation should reflect your changes. In any case,
  // the updates in your request are guaranteed to be applied together
  // atomically.
  def batchUpdate(resource: BatchUpdatePresentationRequest, presentationId: String): BatchUpdatePresentationResponse = js.native
  // Creates a blank presentation using the title given in the request. If a
  // `presentationId` is provided, it is used as the ID of the new presentation.
  // Otherwise, a new ID is generated. Other fields in the request, including
  // any provided content, are ignored.
  // Returns the created presentation.
  def create(resource: Presentation): Presentation = js.native
  // Gets the latest version of the specified presentation.
  def get(presentationId: String): Presentation = js.native
}

object PresentationsCollection {
  @scala.inline
  def apply(
    batchUpdate: (BatchUpdatePresentationRequest, String) => BatchUpdatePresentationResponse,
    create: Presentation => Presentation,
    get: String => Presentation
  ): PresentationsCollection = {
    val __obj = js.Dynamic.literal(batchUpdate = js.Any.fromFunction2(batchUpdate), create = js.Any.fromFunction1(create), get = js.Any.fromFunction1(get))
    __obj.asInstanceOf[PresentationsCollection]
  }
  @scala.inline
  implicit class PresentationsCollectionOps[Self <: PresentationsCollection] (val x: Self) extends AnyVal {
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
    def setBatchUpdate(value: (BatchUpdatePresentationRequest, String) => BatchUpdatePresentationResponse): Self = this.set("batchUpdate", js.Any.fromFunction2(value))
    @scala.inline
    def setCreate(value: Presentation => Presentation): Self = this.set("create", js.Any.fromFunction1(value))
    @scala.inline
    def setGet(value: String => Presentation): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setPages(value: PagesCollection): Self = this.set("Pages", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePages: Self = this.set("Pages", js.undefined)
  }
  
}

