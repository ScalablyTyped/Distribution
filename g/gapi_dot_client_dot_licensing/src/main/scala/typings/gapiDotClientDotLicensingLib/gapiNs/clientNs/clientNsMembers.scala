package typings
package gapiDotClientDotLicensingLib.gapiNs.clientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client")
@js.native
object clientNsMembers extends js.Object {
  val licenseAssignments: gapiDotClientDotLicensingLib.gapiNs.clientNs.licensingNs.LicenseAssignmentsResource = js.native
  /** Load Enterprise License Manager API v1 */
  def load(
    name: gapiDotClientDotLicensingLib.gapiDotClientDotLicensingLibStrings.licensing,
    version: gapiDotClientDotLicensingLib.gapiDotClientDotLicensingLibStrings.v1
  ): stdLib.PromiseLike[scala.Unit] = js.native
  def load(
    name: gapiDotClientDotLicensingLib.gapiDotClientDotLicensingLibStrings.licensing,
    version: gapiDotClientDotLicensingLib.gapiDotClientDotLicensingLibStrings.v1,
    callback: js.Function0[_]
  ): scala.Unit = js.native
}

