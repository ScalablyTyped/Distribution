package typings
package gapiDotClientDotPartnersLib.gapiNs.clientNs.partnersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait AnalyticsResource extends js.Object {
  /**
               * Lists analytics data for a user's associated company.
               * Should only be called within the context of an authorized logged in user.
               */
  def list(
    request: gapiDotClientDotPartnersLib.Anon_RequestMetadataexperimentIdsAccesstokenRequestMetadatauserOverridesuserIdPageSize
  ): gapiDotClientLib.gapiNs.clientNs.Request[ListAnalyticsResponse]
}

