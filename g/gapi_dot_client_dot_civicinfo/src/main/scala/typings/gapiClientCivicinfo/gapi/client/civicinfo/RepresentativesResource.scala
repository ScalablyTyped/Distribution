package typings.gapiClientCivicinfo.gapi.client.civicinfo

import typings.gapiClient.gapi.client.Request
import typings.gapiClientCivicinfo.anon.IncludeOffices
import typings.gapiClientCivicinfo.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RepresentativesResource extends js.Object {
  /** Looks up political geography and representative information for a single address. */
  def representativeInfoByAddress(request: IncludeOffices): Request[RepresentativeInfoResponse]
  /** Looks up representative information for a single geographic division. */
  def representativeInfoByDivision(request: Key): Request[RepresentativeInfoData]
}

object RepresentativesResource {
  @scala.inline
  def apply(
    representativeInfoByAddress: IncludeOffices => Request[RepresentativeInfoResponse],
    representativeInfoByDivision: Key => Request[RepresentativeInfoData]
  ): RepresentativesResource = {
    val __obj = js.Dynamic.literal(representativeInfoByAddress = js.Any.fromFunction1(representativeInfoByAddress), representativeInfoByDivision = js.Any.fromFunction1(representativeInfoByDivision))
    __obj.asInstanceOf[RepresentativesResource]
  }
}

