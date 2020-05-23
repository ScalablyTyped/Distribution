package typings.gapiClientAndroidpublisher.gapi.client.androidpublisher

import typings.gapiClient.gapi.client.Request
import typings.gapiClientAndroidpublisher.anon.EditId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DetailsResource extends js.Object {
  /** Fetches app details for this edit. This includes the default language and developer support contact information. */
  def get(request: EditId): Request[AppDetails]
  /** Updates app details for this edit. This method supports patch semantics. */
  def patch(request: EditId): Request[AppDetails]
  /** Updates app details for this edit. */
  def update(request: EditId): Request[AppDetails]
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
}

