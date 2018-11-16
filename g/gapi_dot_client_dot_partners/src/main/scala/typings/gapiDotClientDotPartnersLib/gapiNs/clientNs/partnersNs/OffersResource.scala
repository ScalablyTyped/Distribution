package typings
package gapiDotClientDotPartnersLib.gapiNs.clientNs.partnersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait OffersResource extends js.Object {
  var history: HistoryResource
  /** Lists the Offers available for the current user */
  def list(request: gapiDotClientDotPartnersLib.Anon_RequestMetadataexperimentIds): gapiDotClientLib.gapiNs.clientNs.Request[ListOffersResponse]
}

