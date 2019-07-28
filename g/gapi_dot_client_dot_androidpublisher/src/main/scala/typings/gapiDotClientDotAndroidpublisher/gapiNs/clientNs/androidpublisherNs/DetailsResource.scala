package typings.gapiDotClientDotAndroidpublisher.gapiNs.clientNs.androidpublisherNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotAndroidpublisher.Anon_AltEditId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DetailsResource extends js.Object {
  /** Fetches app details for this edit. This includes the default language and developer support contact information. */
  def get(request: Anon_AltEditId): Request[AppDetails]
  /** Updates app details for this edit. This method supports patch semantics. */
  def patch(request: Anon_AltEditId): Request[AppDetails]
  /** Updates app details for this edit. */
  def update(request: Anon_AltEditId): Request[AppDetails]
}

object DetailsResource {
  @scala.inline
  def apply(
    get: Anon_AltEditId => Request[AppDetails],
    patch: Anon_AltEditId => Request[AppDetails],
    update: Anon_AltEditId => Request[AppDetails]
  ): DetailsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[DetailsResource]
  }
}

