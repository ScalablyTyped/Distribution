package typings.gapiDotClientDotOslogin.gapiNs.clientNs

import typings.gapiDotClientDotOslogin.gapiDotClientDotOsloginStrings.oslogin
import typings.gapiDotClientDotOslogin.gapiDotClientDotOsloginStrings.v1alpha
import typings.gapiDotClientDotOslogin.gapiNs.clientNs.osloginNs.UsersResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client")
@js.native
object ^ extends js.Object {
  val users: UsersResource = js.native
  /** Load Google Cloud OS Login API v1alpha */
  def load(name: oslogin, version: v1alpha): js.Thenable[Unit] = js.native
  def load(name: oslogin, version: v1alpha, callback: js.Function0[_]): Unit = js.native
}

