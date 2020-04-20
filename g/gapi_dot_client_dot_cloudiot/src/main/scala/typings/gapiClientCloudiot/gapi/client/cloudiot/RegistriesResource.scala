package typings.gapiClientCloudiot.gapi.client.cloudiot

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientCloudiot.AnonBearertoken
import typings.gapiClientCloudiot.AnonCallback
import typings.gapiClientCloudiot.AnonFields
import typings.gapiClientCloudiot.AnonKey
import typings.gapiClientCloudiot.AnonOauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegistriesResource extends js.Object {
  var devices: DevicesResource
  /** Creates a device registry that contains devices. */
  def create(request: AnonBearertoken): Request_[DeviceRegistry]
  /** Deletes a device registry configuration. */
  def delete(request: AnonCallback): Request_[js.Object]
  /** Gets a device registry configuration. */
  def get(request: AnonCallback): Request_[DeviceRegistry]
  /**
    * Gets the access control policy for a resource.
    * Returns an empty policy if the resource exists and does not have a policy
    * set.
    */
  def getIamPolicy(request: AnonKey): Request_[Policy]
  /** Lists device registries. */
  def list(request: AnonOauthtoken): Request_[ListDeviceRegistriesResponse]
  /** Updates a device registry configuration. */
  def patch(request: AnonFields): Request_[DeviceRegistry]
  /**
    * Sets the access control policy on the specified resource. Replaces any
    * existing policy.
    */
  def setIamPolicy(request: AnonKey): Request_[Policy]
  /**
    * Returns permissions that a caller has on the specified resource.
    * If the resource does not exist, this will return an empty set of
    * permissions, not a NOT_FOUND error.
    */
  def testIamPermissions(request: AnonKey): Request_[TestIamPermissionsResponse]
}

object RegistriesResource {
  @scala.inline
  def apply(
    create: AnonBearertoken => Request_[DeviceRegistry],
    delete: AnonCallback => Request_[js.Object],
    devices: DevicesResource,
    get: AnonCallback => Request_[DeviceRegistry],
    getIamPolicy: AnonKey => Request_[Policy],
    list: AnonOauthtoken => Request_[ListDeviceRegistriesResponse],
    patch: AnonFields => Request_[DeviceRegistry],
    setIamPolicy: AnonKey => Request_[Policy],
    testIamPermissions: AnonKey => Request_[TestIamPermissionsResponse]
  ): RegistriesResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), devices = devices.asInstanceOf[js.Any], get = js.Any.fromFunction1(get), getIamPolicy = js.Any.fromFunction1(getIamPolicy), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), setIamPolicy = js.Any.fromFunction1(setIamPolicy), testIamPermissions = js.Any.fromFunction1(testIamPermissions))
    __obj.asInstanceOf[RegistriesResource]
  }
}

