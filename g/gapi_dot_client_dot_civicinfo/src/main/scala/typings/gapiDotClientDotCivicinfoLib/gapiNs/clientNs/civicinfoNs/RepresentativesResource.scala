package typings
package gapiDotClientDotCivicinfoLib.gapiNs.clientNs.civicinfoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RepresentativesResource extends js.Object {
  /** Looks up political geography and representative information for a single address. */
  def representativeInfoByAddress(request: gapiDotClientDotCivicinfoLib.Anon_Levels): gapiDotClientLib.gapiNs.clientNs.Request[RepresentativeInfoResponse]
  /** Looks up representative information for a single geographic division. */
  def representativeInfoByDivision(request: gapiDotClientDotCivicinfoLib.Anon_OcdId): gapiDotClientLib.gapiNs.clientNs.Request[RepresentativeInfoData]
}

