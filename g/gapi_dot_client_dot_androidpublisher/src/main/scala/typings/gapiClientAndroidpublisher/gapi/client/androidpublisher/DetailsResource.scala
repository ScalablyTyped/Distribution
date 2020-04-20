package typings.gapiClientAndroidpublisher.gapi.client.androidpublisher

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientAndroidpublisher.AnonEditId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DetailsResource extends js.Object {
  /** Fetches app details for this edit. This includes the default language and developer support contact information. */
  def get(request: AnonEditId): Request_[AppDetails]
  /** Updates app details for this edit. This method supports patch semantics. */
  def patch(request: AnonEditId): Request_[AppDetails]
  /** Updates app details for this edit. */
  def update(request: AnonEditId): Request_[AppDetails]
}

object DetailsResource {
  @scala.inline
  def apply(
    get: AnonEditId => Request_[AppDetails],
    patch: AnonEditId => Request_[AppDetails],
    update: AnonEditId => Request_[AppDetails]
  ): DetailsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[DetailsResource]
  }
}

