package typings
package gapiDotClientDotAndroidpublisherLib.gapiNs.clientNs.androidpublisherNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DetailsResource extends js.Object {
  /** Fetches app details for this edit. This includes the default language and developer support contact information. */
  def get(request: gapiDotClientDotAndroidpublisherLib.Anon_AltEditId): gapiDotClientLib.gapiNs.clientNs.Request[AppDetails]
  /** Updates app details for this edit. This method supports patch semantics. */
  def patch(request: gapiDotClientDotAndroidpublisherLib.Anon_AltEditId): gapiDotClientLib.gapiNs.clientNs.Request[AppDetails]
  /** Updates app details for this edit. */
  def update(request: gapiDotClientDotAndroidpublisherLib.Anon_AltEditId): gapiDotClientLib.gapiNs.clientNs.Request[AppDetails]
}

object DetailsResource {
  @scala.inline
  def apply(
    get: js.Function1[
      gapiDotClientDotAndroidpublisherLib.Anon_AltEditId, 
      gapiDotClientLib.gapiNs.clientNs.Request[AppDetails]
    ],
    patch: js.Function1[
      gapiDotClientDotAndroidpublisherLib.Anon_AltEditId, 
      gapiDotClientLib.gapiNs.clientNs.Request[AppDetails]
    ],
    update: js.Function1[
      gapiDotClientDotAndroidpublisherLib.Anon_AltEditId, 
      gapiDotClientLib.gapiNs.clientNs.Request[AppDetails]
    ]
  ): DetailsResource = {
    val __obj = js.Dynamic.literal(get = get, patch = patch, update = update)
  
    __obj.asInstanceOf[DetailsResource]
  }
}

