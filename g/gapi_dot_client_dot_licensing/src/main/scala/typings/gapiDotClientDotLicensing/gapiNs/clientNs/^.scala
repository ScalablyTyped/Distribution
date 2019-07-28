package typings.gapiDotClientDotLicensing.gapiNs.clientNs

import typings.gapiDotClientDotLicensing.gapiDotClientDotLicensingStrings.licensing
import typings.gapiDotClientDotLicensing.gapiDotClientDotLicensingStrings.v1
import typings.gapiDotClientDotLicensing.gapiNs.clientNs.licensingNs.LicenseAssignmentsResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client")
@js.native
object ^ extends js.Object {
  val licenseAssignments: LicenseAssignmentsResource = js.native
  /** Load Enterprise License Manager API v1 */
  def load(name: licensing, version: v1): js.Thenable[Unit] = js.native
  def load(name: licensing, version: v1, callback: js.Function0[_]): Unit = js.native
}

