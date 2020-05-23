package typings.gapiClientClouduseraccounts

import typings.gapiClientClouduseraccounts.gapi.client.clouduseraccounts.GlobalAccountsOperationsResource
import typings.gapiClientClouduseraccounts.gapi.client.clouduseraccounts.GroupsResource
import typings.gapiClientClouduseraccounts.gapi.client.clouduseraccounts.LinuxResource
import typings.gapiClientClouduseraccounts.gapi.client.clouduseraccounts.UsersResource
import typings.gapiClientClouduseraccounts.gapiClientClouduseraccountsStrings.clouduseraccounts
import typings.gapiClientClouduseraccounts.gapiClientClouduseraccountsStrings.vm_alpha
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  @js.native
  object gapi extends js.Object {
    @js.native
    object client extends js.Object {
      val globalAccountsOperations: GlobalAccountsOperationsResource = js.native
      val groups: GroupsResource = js.native
      val linux: LinuxResource = js.native
      val users: UsersResource = js.native
      /** Load Cloud User Accounts API vm_alpha */
      def load(name: clouduseraccounts, version: vm_alpha): js.Thenable[Unit] = js.native
      def load(name: clouduseraccounts, version: vm_alpha, callback: js.Function0[_]): Unit = js.native
    }
    
  }
  
}

