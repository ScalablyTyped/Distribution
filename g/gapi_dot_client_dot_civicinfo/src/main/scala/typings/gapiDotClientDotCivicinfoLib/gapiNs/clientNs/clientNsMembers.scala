package typings
package gapiDotClientDotCivicinfoLib.gapiNs.clientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client")
@js.native
object clientNsMembers extends js.Object {
  val divisions: gapiDotClientDotCivicinfoLib.gapiNs.clientNs.civicinfoNs.DivisionsResource = js.native
  val elections: gapiDotClientDotCivicinfoLib.gapiNs.clientNs.civicinfoNs.ElectionsResource = js.native
  val representatives: gapiDotClientDotCivicinfoLib.gapiNs.clientNs.civicinfoNs.RepresentativesResource = js.native
  /** Load Google Civic Information API v2 */
  def load(
    name: gapiDotClientDotCivicinfoLib.gapiDotClientDotCivicinfoLibStrings.civicinfo,
    version: gapiDotClientDotCivicinfoLib.gapiDotClientDotCivicinfoLibStrings.v2
  ): stdLib.PromiseLike[scala.Unit] = js.native
  def load(
    name: gapiDotClientDotCivicinfoLib.gapiDotClientDotCivicinfoLibStrings.civicinfo,
    version: gapiDotClientDotCivicinfoLib.gapiDotClientDotCivicinfoLibStrings.v2,
    callback: js.Function0[_]
  ): scala.Unit = js.native
}

