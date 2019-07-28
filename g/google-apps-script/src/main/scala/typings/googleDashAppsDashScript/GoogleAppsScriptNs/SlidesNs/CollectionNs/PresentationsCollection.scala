package typings.googleDashAppsDashScript.GoogleAppsScriptNs.SlidesNs.CollectionNs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.SlidesNs.CollectionNs.PresentationsNs.PagesCollection
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.SlidesNs.SchemaNs.BatchUpdatePresentationRequest
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.SlidesNs.SchemaNs.BatchUpdatePresentationResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PresentationsCollection extends js.Object {
  var Pages: js.UndefOr[PagesCollection] = js.undefined
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
  def batchUpdate(resource: BatchUpdatePresentationRequest, presentationId: String): BatchUpdatePresentationResponse
  // Creates a blank presentation using the title given in the request. If a
  // `presentationId` is provided, it is used as the ID of the new presentation.
  // Otherwise, a new ID is generated. Other fields in the request, including
  // any provided content, are ignored.
  // Returns the created presentation.
  def create(resource: typings.googleDashAppsDashScript.GoogleAppsScriptNs.SlidesNs.SchemaNs.Presentation): typings.googleDashAppsDashScript.GoogleAppsScriptNs.SlidesNs.SchemaNs.Presentation
  // Gets the latest version of the specified presentation.
  def get(presentationId: String): typings.googleDashAppsDashScript.GoogleAppsScriptNs.SlidesNs.SchemaNs.Presentation
}

object PresentationsCollection {
  @scala.inline
  def apply(
    batchUpdate: (BatchUpdatePresentationRequest, String) => BatchUpdatePresentationResponse,
    create: typings.googleDashAppsDashScript.GoogleAppsScriptNs.SlidesNs.SchemaNs.Presentation => typings.googleDashAppsDashScript.GoogleAppsScriptNs.SlidesNs.SchemaNs.Presentation,
    get: String => typings.googleDashAppsDashScript.GoogleAppsScriptNs.SlidesNs.SchemaNs.Presentation,
    Pages: PagesCollection = null
  ): PresentationsCollection = {
    val __obj = js.Dynamic.literal(batchUpdate = js.Any.fromFunction2(batchUpdate), create = js.Any.fromFunction1(create), get = js.Any.fromFunction1(get))
    if (Pages != null) __obj.updateDynamic("Pages")(Pages)
    __obj.asInstanceOf[PresentationsCollection]
  }
}

