package typings.gapiDotClientDotAndroidmanagement.gapiNs.clientNs

import typings.gapiDotClientDotAndroidmanagement.gapiDotClientDotAndroidmanagementStrings.androidmanagement
import typings.gapiDotClientDotAndroidmanagement.gapiDotClientDotAndroidmanagementStrings.v1
import typings.gapiDotClientDotAndroidmanagement.gapiNs.clientNs.androidmanagementNs.EnterprisesResource
import typings.gapiDotClientDotAndroidmanagement.gapiNs.clientNs.androidmanagementNs.SignupUrlsResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client")
@js.native
object ^ extends js.Object {
  val enterprises: EnterprisesResource = js.native
  val signupUrls: SignupUrlsResource = js.native
  /** Load Android Management API v1 */
  def load(name: androidmanagement, version: v1): js.Thenable[Unit] = js.native
  def load(name: androidmanagement, version: v1, callback: js.Function0[_]): Unit = js.native
}

