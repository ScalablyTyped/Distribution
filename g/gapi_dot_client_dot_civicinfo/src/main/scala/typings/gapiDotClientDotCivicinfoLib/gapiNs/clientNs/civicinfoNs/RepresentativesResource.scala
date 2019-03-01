package typings
package gapiDotClientDotCivicinfoLib.gapiNs.clientNs.civicinfoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RepresentativesResource extends js.Object {
  /** Looks up political geography and representative information for a single address. */
  def representativeInfoByAddress(request: gapiDotClientDotCivicinfoLib.Anon_AddressAlt): gapiDotClientLib.gapiNs.clientNs.Request[RepresentativeInfoResponse]
  /** Looks up representative information for a single geographic division. */
  def representativeInfoByDivision(request: gapiDotClientDotCivicinfoLib.Anon_AltFieldsKey): gapiDotClientLib.gapiNs.clientNs.Request[RepresentativeInfoData]
}

object RepresentativesResource {
  @scala.inline
  def apply(
    representativeInfoByAddress: js.Function1[
      gapiDotClientDotCivicinfoLib.Anon_AddressAlt, 
      gapiDotClientLib.gapiNs.clientNs.Request[RepresentativeInfoResponse]
    ],
    representativeInfoByDivision: js.Function1[
      gapiDotClientDotCivicinfoLib.Anon_AltFieldsKey, 
      gapiDotClientLib.gapiNs.clientNs.Request[RepresentativeInfoData]
    ]
  ): RepresentativesResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("representativeInfoByAddress")(representativeInfoByAddress)
    __obj.updateDynamic("representativeInfoByDivision")(representativeInfoByDivision)
    __obj.asInstanceOf[RepresentativesResource]
  }
}

