package typings
package gapiDotClientDotPartnersLib.gapiNs.clientNs.partnersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HistoryResource extends js.Object {
  /** Lists the Historical Offers for the current user (or user's entire company) */
  def list(
    request: gapiDotClientDotPartnersLib.Anon_RequestMetadataexperimentIdsAccesstokenRequestMetadatauserOverridesuserId
  ): gapiDotClientLib.gapiNs.clientNs.Request[ListOffersHistoryResponse]
}

