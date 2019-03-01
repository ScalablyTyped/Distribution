package typings
package gapiDotClientDotSlidesLib.gapiNs.clientNs.slidesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PresentationsResource extends js.Object {
  var pages: PagesResource
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
  def batchUpdate(request: gapiDotClientDotSlidesLib.Anon_AccesstokenAltBearertoken): gapiDotClientLib.gapiNs.clientNs.Request[BatchUpdatePresentationResponse]
  /**
    * Creates a new presentation using the title given in the request. Other
    * fields in the request are ignored.
    * Returns the created presentation.
    */
  def create(request: gapiDotClientDotSlidesLib.Anon_AccesstokenAltBearertokenCallback): gapiDotClientLib.gapiNs.clientNs.Request[Presentation]
  /** Gets the latest version of the specified presentation. */
  def get(request: gapiDotClientDotSlidesLib.Anon_AccesstokenAltBearertoken): gapiDotClientLib.gapiNs.clientNs.Request[Presentation]
}

object PresentationsResource {
  @scala.inline
  def apply(
    batchUpdate: js.Function1[
      gapiDotClientDotSlidesLib.Anon_AccesstokenAltBearertoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[BatchUpdatePresentationResponse]
    ],
    create: js.Function1[
      gapiDotClientDotSlidesLib.Anon_AccesstokenAltBearertokenCallback, 
      gapiDotClientLib.gapiNs.clientNs.Request[Presentation]
    ],
    get: js.Function1[
      gapiDotClientDotSlidesLib.Anon_AccesstokenAltBearertoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[Presentation]
    ],
    pages: PagesResource
  ): PresentationsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("batchUpdate")(batchUpdate)
    __obj.updateDynamic("create")(create)
    __obj.updateDynamic("get")(get)
    __obj.updateDynamic("pages")(pages)
    __obj.asInstanceOf[PresentationsResource]
  }
}

