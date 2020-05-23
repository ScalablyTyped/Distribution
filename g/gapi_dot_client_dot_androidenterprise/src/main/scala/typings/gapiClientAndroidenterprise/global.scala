package typings.gapiClientAndroidenterprise

import typings.gapiClientAndroidenterprise.gapi.client.androidenterprise.DevicesResource
import typings.gapiClientAndroidenterprise.gapi.client.androidenterprise.EnterprisesResource
import typings.gapiClientAndroidenterprise.gapi.client.androidenterprise.EntitlementsResource
import typings.gapiClientAndroidenterprise.gapi.client.androidenterprise.GrouplicensesResource
import typings.gapiClientAndroidenterprise.gapi.client.androidenterprise.GrouplicenseusersResource
import typings.gapiClientAndroidenterprise.gapi.client.androidenterprise.InstallsResource
import typings.gapiClientAndroidenterprise.gapi.client.androidenterprise.ManagedconfigurationsfordeviceResource
import typings.gapiClientAndroidenterprise.gapi.client.androidenterprise.ManagedconfigurationsforuserResource
import typings.gapiClientAndroidenterprise.gapi.client.androidenterprise.PermissionsResource
import typings.gapiClientAndroidenterprise.gapi.client.androidenterprise.ProductsResource
import typings.gapiClientAndroidenterprise.gapi.client.androidenterprise.ServiceaccountkeysResource
import typings.gapiClientAndroidenterprise.gapi.client.androidenterprise.StorelayoutclustersResource
import typings.gapiClientAndroidenterprise.gapi.client.androidenterprise.StorelayoutpagesResource
import typings.gapiClientAndroidenterprise.gapi.client.androidenterprise.UsersResource
import typings.gapiClientAndroidenterprise.gapiClientAndroidenterpriseStrings.androidenterprise
import typings.gapiClientAndroidenterprise.gapiClientAndroidenterpriseStrings.v1
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
      val devices: DevicesResource = js.native
      val enterprises: EnterprisesResource = js.native
      val entitlements: EntitlementsResource = js.native
      val grouplicenses: GrouplicensesResource = js.native
      val grouplicenseusers: GrouplicenseusersResource = js.native
      val installs: InstallsResource = js.native
      val managedconfigurationsfordevice: ManagedconfigurationsfordeviceResource = js.native
      val managedconfigurationsforuser: ManagedconfigurationsforuserResource = js.native
      val permissions: PermissionsResource = js.native
      val products: ProductsResource = js.native
      val serviceaccountkeys: ServiceaccountkeysResource = js.native
      val storelayoutclusters: StorelayoutclustersResource = js.native
      val storelayoutpages: StorelayoutpagesResource = js.native
      val users: UsersResource = js.native
      /** Load Google Play EMM API v1 */
      def load(name: androidenterprise, version: v1): js.Thenable[Unit] = js.native
      def load(name: androidenterprise, version: v1, callback: js.Function0[_]): Unit = js.native
    }
    
  }
  
}

