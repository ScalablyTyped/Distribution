package typings.gapiClientCloudiot.gapi.client.cloudiot

import typings.gapiClient.gapi.client.Request
import typings.gapiClientCloudiot.anon.Bearertoken
import typings.gapiClientCloudiot.anon.Callback
import typings.gapiClientCloudiot.anon.Fields
import typings.gapiClientCloudiot.anon.Key
import typings.gapiClientCloudiot.anon.Oauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegistriesResource extends js.Object {
  var devices: DevicesResource = js.native
  /** Creates a device registry that contains devices. */
  def create(request: Bearertoken): Request[DeviceRegistry] = js.native
  /** Deletes a device registry configuration. */
  def delete(request: Callback): Request[js.Object] = js.native
  /** Gets a device registry configuration. */
  def get(request: Callback): Request[DeviceRegistry] = js.native
  /**
    * Gets the access control policy for a resource.
    * Returns an empty policy if the resource exists and does not have a policy
    * set.
    */
  def getIamPolicy(request: Key): Request[Policy] = js.native
  /** Lists device registries. */
  def list(request: Oauthtoken): Request[ListDeviceRegistriesResponse] = js.native
  /** Updates a device registry configuration. */
  def patch(request: Fields): Request[DeviceRegistry] = js.native
  /**
    * Sets the access control policy on the specified resource. Replaces any
    * existing policy.
    */
  def setIamPolicy(request: Key): Request[Policy] = js.native
  /**
    * Returns permissions that a caller has on the specified resource.
    * If the resource does not exist, this will return an empty set of
    * permissions, not a NOT_FOUND error.
    */
  def testIamPermissions(request: Key): Request[TestIamPermissionsResponse] = js.native
}

object RegistriesResource {
  @scala.inline
  def apply(
    create: Bearertoken => Request[DeviceRegistry],
    delete: Callback => Request[js.Object],
    devices: DevicesResource,
    get: Callback => Request[DeviceRegistry],
    getIamPolicy: Key => Request[Policy],
    list: Oauthtoken => Request[ListDeviceRegistriesResponse],
    patch: Fields => Request[DeviceRegistry],
    setIamPolicy: Key => Request[Policy],
    testIamPermissions: Key => Request[TestIamPermissionsResponse]
  ): RegistriesResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), devices = devices.asInstanceOf[js.Any], get = js.Any.fromFunction1(get), getIamPolicy = js.Any.fromFunction1(getIamPolicy), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), setIamPolicy = js.Any.fromFunction1(setIamPolicy), testIamPermissions = js.Any.fromFunction1(testIamPermissions))
    __obj.asInstanceOf[RegistriesResource]
  }
  @scala.inline
  implicit class RegistriesResourceOps[Self <: RegistriesResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCreate(value: Bearertoken => Request[DeviceRegistry]): Self = this.set("create", js.Any.fromFunction1(value))
    @scala.inline
    def setDelete(value: Callback => Request[js.Object]): Self = this.set("delete", js.Any.fromFunction1(value))
    @scala.inline
    def setDevices(value: DevicesResource): Self = this.set("devices", value.asInstanceOf[js.Any])
    @scala.inline
    def setGet(value: Callback => Request[DeviceRegistry]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setGetIamPolicy(value: Key => Request[Policy]): Self = this.set("getIamPolicy", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: Oauthtoken => Request[ListDeviceRegistriesResponse]): Self = this.set("list", js.Any.fromFunction1(value))
    @scala.inline
    def setPatch(value: Fields => Request[DeviceRegistry]): Self = this.set("patch", js.Any.fromFunction1(value))
    @scala.inline
    def setSetIamPolicy(value: Key => Request[Policy]): Self = this.set("setIamPolicy", js.Any.fromFunction1(value))
    @scala.inline
    def setTestIamPermissions(value: Key => Request[TestIamPermissionsResponse]): Self = this.set("testIamPermissions", js.Any.fromFunction1(value))
  }
  
}

