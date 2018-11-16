package typings
package gapiDotClientDotPartnersLib.gapiNs.clientNs.partnersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait LeadsResource extends js.Object {
  /** Creates an advertiser lead for the given company ID. */
  def create(request: gapiDotClientDotPartnersLib.Anon_AccesstokenPrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[CreateLeadResponse]
  /**
               * Lists advertiser leads for a user's associated company.
               * Should only be called within the context of an authorized logged in user.
               */
  def list(
    request: gapiDotClientDotPartnersLib.Anon_RequestMetadataexperimentIdsAccesstokenRequestMetadatauserOverridesuserIdPageSizePrettyPrint
  ): gapiDotClientLib.gapiNs.clientNs.Request[ListLeadsResponse]
}

