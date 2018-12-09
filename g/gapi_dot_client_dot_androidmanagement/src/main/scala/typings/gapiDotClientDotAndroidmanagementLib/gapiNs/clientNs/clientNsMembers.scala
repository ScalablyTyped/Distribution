package typings
package gapiDotClientDotAndroidmanagementLib.gapiNs.clientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client")
@js.native
object clientNsMembers extends js.Object {
  val enterprises: gapiDotClientDotAndroidmanagementLib.gapiNs.clientNs.androidmanagementNs.EnterprisesResource = js.native
  val signupUrls: gapiDotClientDotAndroidmanagementLib.gapiNs.clientNs.androidmanagementNs.SignupUrlsResource = js.native
  /** Load Android Management API v1 */
  def load(
    name: gapiDotClientDotAndroidmanagementLib.gapiDotClientDotAndroidmanagementLibStrings.androidmanagement,
    version: gapiDotClientDotAndroidmanagementLib.gapiDotClientDotAndroidmanagementLibStrings.v1
  ): js.Thenable[scala.Unit] = js.native
  def load(
    name: gapiDotClientDotAndroidmanagementLib.gapiDotClientDotAndroidmanagementLibStrings.androidmanagement,
    version: gapiDotClientDotAndroidmanagementLib.gapiDotClientDotAndroidmanagementLibStrings.v1,
    callback: js.Function0[_]
  ): scala.Unit = js.native
}

