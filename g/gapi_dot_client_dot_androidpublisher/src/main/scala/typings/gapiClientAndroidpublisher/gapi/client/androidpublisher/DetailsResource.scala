package typings.gapiClientAndroidpublisher.gapi.client.androidpublisher

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientAndroidpublisher.AnonAltEditId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DetailsResource extends js.Object {
  /** Fetches app details for this edit. This includes the default language and developer support contact information. */
  def get(request: AnonAltEditId): Request_[AppDetails]
  /** Updates app details for this edit. This method supports patch semantics. */
  def patch(request: AnonAltEditId): Request_[AppDetails]
  /** Updates app details for this edit. */
  def update(request: AnonAltEditId): Request_[AppDetails]
}

object DetailsResource {
  @scala.inline
  def apply(
    get: AnonAltEditId => Request_[AppDetails],
    patch: AnonAltEditId => Request_[AppDetails],
    update: AnonAltEditId => Request_[AppDetails]
  ): DetailsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[DetailsResource]
  }
}

