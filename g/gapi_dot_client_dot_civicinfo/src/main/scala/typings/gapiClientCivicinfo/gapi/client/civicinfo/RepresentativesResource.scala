package typings.gapiClientCivicinfo.gapi.client.civicinfo

import typings.gapiClient.gapi.client.Request
import typings.gapiClientCivicinfo.anon.IncludeOffices
import typings.gapiClientCivicinfo.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RepresentativesResource extends js.Object {
  /** Looks up political geography and representative information for a single address. */
  def representativeInfoByAddress(request: IncludeOffices): Request[RepresentativeInfoResponse] = js.native
  /** Looks up representative information for a single geographic division. */
  def representativeInfoByDivision(request: Key): Request[RepresentativeInfoData] = js.native
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
  @scala.inline
  implicit class RepresentativesResourceOps[Self <: RepresentativesResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setRepresentativeInfoByAddress(value: IncludeOffices => Request[RepresentativeInfoResponse]): Self = this.set("representativeInfoByAddress", js.Any.fromFunction1(value))
    @scala.inline
    def setRepresentativeInfoByDivision(value: Key => Request[RepresentativeInfoData]): Self = this.set("representativeInfoByDivision", js.Any.fromFunction1(value))
  }
  
}

