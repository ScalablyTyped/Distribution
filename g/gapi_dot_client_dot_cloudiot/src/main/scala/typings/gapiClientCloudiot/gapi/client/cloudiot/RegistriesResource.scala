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

trait RegistriesResource extends js.Object {
  var devices: DevicesResource
  /** Creates a device registry that contains devices. */
  def create(request: Bearertoken): Request[DeviceRegistry]
  /** Deletes a device registry configuration. */
  def delete(request: Callback): Request[js.Object]
  /** Gets a device registry configuration. */
  def get(request: Callback): Request[DeviceRegistry]
  /**
    * Gets the access control policy for a resource.
    * Returns an empty policy if the resource exists and does not have a policy
    * set.
    */
  def getIamPolicy(request: Key): Request[Policy]
  /** Lists device registries. */
  def list(request: Oauthtoken): Request[ListDeviceRegistriesResponse]
  /** Updates a device registry configuration. */
  def patch(request: Fields): Request[DeviceRegistry]
  /**
    * Sets the access control policy on the specified resource. Replaces any
    * existing policy.
    */
  def setIamPolicy(request: Key): Request[Policy]
  /**
    * Returns permissions that a caller has on the specified resource.
    * If the resource does not exist, this will return an empty set of
    * permissions, not a NOT_FOUND error.
    */
  def testIamPermissions(request: Key): Request[TestIamPermissionsResponse]
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
}

