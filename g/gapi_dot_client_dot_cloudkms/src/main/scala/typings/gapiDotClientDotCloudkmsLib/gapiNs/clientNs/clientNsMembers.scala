package typings
package gapiDotClientDotCloudkmsLib.gapiNs.clientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client")
@js.native
object clientNsMembers extends js.Object {
  val projects: gapiDotClientDotCloudkmsLib.gapiNs.clientNs.cloudkmsNs.ProjectsResource = js.native
  /** Load Google Cloud Key Management Service (KMS) API v1 */
  def load(
    name: gapiDotClientDotCloudkmsLib.gapiDotClientDotCloudkmsLibStrings.cloudkms,
    version: gapiDotClientDotCloudkmsLib.gapiDotClientDotCloudkmsLibStrings.v1
  ): stdLib.PromiseLike[scala.Unit] = js.native
  def load(
    name: gapiDotClientDotCloudkmsLib.gapiDotClientDotCloudkmsLibStrings.cloudkms,
    version: gapiDotClientDotCloudkmsLib.gapiDotClientDotCloudkmsLibStrings.v1,
    callback: js.Function0[_]
  ): scala.Unit = js.native
}

