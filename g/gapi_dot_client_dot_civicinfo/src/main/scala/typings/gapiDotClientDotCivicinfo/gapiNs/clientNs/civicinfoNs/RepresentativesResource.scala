package typings.gapiDotClientDotCivicinfo.gapiNs.clientNs.civicinfoNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotCivicinfo.Anon_AddressAlt
import typings.gapiDotClientDotCivicinfo.Anon_AltFieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RepresentativesResource extends js.Object {
  /** Looks up political geography and representative information for a single address. */
  def representativeInfoByAddress(request: Anon_AddressAlt): Request[RepresentativeInfoResponse]
  /** Looks up representative information for a single geographic division. */
  def representativeInfoByDivision(request: Anon_AltFieldsKey): Request[RepresentativeInfoData]
}

object RepresentativesResource {
  @scala.inline
  def apply(
    representativeInfoByAddress: Anon_AddressAlt => Request[RepresentativeInfoResponse],
    representativeInfoByDivision: Anon_AltFieldsKey => Request[RepresentativeInfoData]
  ): RepresentativesResource = {
    val __obj = js.Dynamic.literal(representativeInfoByAddress = js.Any.fromFunction1(representativeInfoByAddress), representativeInfoByDivision = js.Any.fromFunction1(representativeInfoByDivision))
  
    __obj.asInstanceOf[RepresentativesResource]
  }
}

