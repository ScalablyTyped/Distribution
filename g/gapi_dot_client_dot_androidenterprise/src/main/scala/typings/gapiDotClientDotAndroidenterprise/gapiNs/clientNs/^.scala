package typings.gapiDotClientDotAndroidenterprise.gapiNs.clientNs

import typings.gapiDotClientDotAndroidenterprise.gapiDotClientDotAndroidenterpriseStrings.androidenterprise
import typings.gapiDotClientDotAndroidenterprise.gapiDotClientDotAndroidenterpriseStrings.v1
import typings.gapiDotClientDotAndroidenterprise.gapiNs.clientNs.androidenterpriseNs.DevicesResource
import typings.gapiDotClientDotAndroidenterprise.gapiNs.clientNs.androidenterpriseNs.EnterprisesResource
import typings.gapiDotClientDotAndroidenterprise.gapiNs.clientNs.androidenterpriseNs.EntitlementsResource
import typings.gapiDotClientDotAndroidenterprise.gapiNs.clientNs.androidenterpriseNs.GrouplicensesResource
import typings.gapiDotClientDotAndroidenterprise.gapiNs.clientNs.androidenterpriseNs.GrouplicenseusersResource
import typings.gapiDotClientDotAndroidenterprise.gapiNs.clientNs.androidenterpriseNs.InstallsResource
import typings.gapiDotClientDotAndroidenterprise.gapiNs.clientNs.androidenterpriseNs.ManagedconfigurationsfordeviceResource
import typings.gapiDotClientDotAndroidenterprise.gapiNs.clientNs.androidenterpriseNs.ManagedconfigurationsforuserResource
import typings.gapiDotClientDotAndroidenterprise.gapiNs.clientNs.androidenterpriseNs.PermissionsResource
import typings.gapiDotClientDotAndroidenterprise.gapiNs.clientNs.androidenterpriseNs.ProductsResource
import typings.gapiDotClientDotAndroidenterprise.gapiNs.clientNs.androidenterpriseNs.ServiceaccountkeysResource
import typings.gapiDotClientDotAndroidenterprise.gapiNs.clientNs.androidenterpriseNs.StorelayoutclustersResource
import typings.gapiDotClientDotAndroidenterprise.gapiNs.clientNs.androidenterpriseNs.StorelayoutpagesResource
import typings.gapiDotClientDotAndroidenterprise.gapiNs.clientNs.androidenterpriseNs.UsersResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client")
@js.native
object ^ extends js.Object {
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

