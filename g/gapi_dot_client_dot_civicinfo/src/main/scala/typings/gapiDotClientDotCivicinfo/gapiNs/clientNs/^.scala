package typings.gapiDotClientDotCivicinfo.gapiNs.clientNs

import typings.gapiDotClientDotCivicinfo.gapiDotClientDotCivicinfoStrings.civicinfo
import typings.gapiDotClientDotCivicinfo.gapiDotClientDotCivicinfoStrings.v2
import typings.gapiDotClientDotCivicinfo.gapiNs.clientNs.civicinfoNs.DivisionsResource
import typings.gapiDotClientDotCivicinfo.gapiNs.clientNs.civicinfoNs.ElectionsResource
import typings.gapiDotClientDotCivicinfo.gapiNs.clientNs.civicinfoNs.RepresentativesResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client")
@js.native
object ^ extends js.Object {
  val divisions: DivisionsResource = js.native
  val elections: ElectionsResource = js.native
  val representatives: RepresentativesResource = js.native
  /** Load Google Civic Information API v2 */
  def load(name: civicinfo, version: v2): js.Thenable[Unit] = js.native
  def load(name: civicinfo, version: v2, callback: js.Function0[_]): Unit = js.native
}

