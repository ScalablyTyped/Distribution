package typings.gapiDotClientDotCloudkms.gapiNs.clientNs

import typings.gapiDotClientDotCloudkms.gapiDotClientDotCloudkmsStrings.cloudkms
import typings.gapiDotClientDotCloudkms.gapiDotClientDotCloudkmsStrings.v1
import typings.gapiDotClientDotCloudkms.gapiNs.clientNs.cloudkmsNs.ProjectsResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client")
@js.native
object ^ extends js.Object {
  val projects: ProjectsResource = js.native
  /** Load Google Cloud Key Management Service (KMS) API v1 */
  def load(name: cloudkms, version: v1): js.Thenable[Unit] = js.native
  def load(name: cloudkms, version: v1, callback: js.Function0[_]): Unit = js.native
}

