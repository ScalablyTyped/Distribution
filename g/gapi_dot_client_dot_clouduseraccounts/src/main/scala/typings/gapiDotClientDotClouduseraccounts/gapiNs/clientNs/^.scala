package typings.gapiDotClientDotClouduseraccounts.gapiNs.clientNs

import typings.gapiDotClientDotClouduseraccounts.gapiDotClientDotClouduseraccountsStrings.clouduseraccounts
import typings.gapiDotClientDotClouduseraccounts.gapiDotClientDotClouduseraccountsStrings.vm_alpha
import typings.gapiDotClientDotClouduseraccounts.gapiNs.clientNs.clouduseraccountsNs.GlobalAccountsOperationsResource
import typings.gapiDotClientDotClouduseraccounts.gapiNs.clientNs.clouduseraccountsNs.GroupsResource
import typings.gapiDotClientDotClouduseraccounts.gapiNs.clientNs.clouduseraccountsNs.LinuxResource
import typings.gapiDotClientDotClouduseraccounts.gapiNs.clientNs.clouduseraccountsNs.UsersResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client")
@js.native
object ^ extends js.Object {
  val globalAccountsOperations: GlobalAccountsOperationsResource = js.native
  val groups: GroupsResource = js.native
  val linux: LinuxResource = js.native
  val users: UsersResource = js.native
  /** Load Cloud User Accounts API vm_alpha */
  def load(name: clouduseraccounts, version: vm_alpha): js.Thenable[Unit] = js.native
  def load(name: clouduseraccounts, version: vm_alpha, callback: js.Function0[_]): Unit = js.native
}

