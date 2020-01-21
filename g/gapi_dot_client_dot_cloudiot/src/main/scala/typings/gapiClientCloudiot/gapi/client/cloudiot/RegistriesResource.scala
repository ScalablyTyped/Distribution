package typings.gapiClientCloudiot.gapi.client.cloudiot

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientCloudiot.AnonAccesstokenAltBearertoken
import typings.gapiClientCloudiot.AnonAccesstokenAltBearertokenCallback
import typings.gapiClientCloudiot.AnonAccesstokenAltBearertokenCallbackFields
import typings.gapiClientCloudiot.AnonAccesstokenAltBearertokenCallbackFieldsKey
import typings.gapiClientCloudiot.AnonAccesstokenAltBearertokenCallbackFieldsKeyOauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegistriesResource extends js.Object {
  var devices: DevicesResource
  /** Creates a device registry that contains devices. */
  def create(request: AnonAccesstokenAltBearertoken): Request_[DeviceRegistry]
  /** Deletes a device registry configuration. */
  def delete(request: AnonAccesstokenAltBearertokenCallback): Request_[js.Object]
  /** Gets a device registry configuration. */
  def get(request: AnonAccesstokenAltBearertokenCallback): Request_[DeviceRegistry]
  /**
    * Gets the access control policy for a resource.
    * Returns an empty policy if the resource exists and does not have a policy
    * set.
    */
  def getIamPolicy(request: AnonAccesstokenAltBearertokenCallbackFieldsKey): Request_[Policy]
  /** Lists device registries. */
  def list(request: AnonAccesstokenAltBearertokenCallbackFieldsKeyOauthtoken): Request_[ListDeviceRegistriesResponse]
  /** Updates a device registry configuration. */
  def patch(request: AnonAccesstokenAltBearertokenCallbackFields): Request_[DeviceRegistry]
  /**
    * Sets the access control policy on the specified resource. Replaces any
    * existing policy.
    */
  def setIamPolicy(request: AnonAccesstokenAltBearertokenCallbackFieldsKey): Request_[Policy]
  /**
    * Returns permissions that a caller has on the specified resource.
    * If the resource does not exist, this will return an empty set of
    * permissions, not a NOT_FOUND error.
    */
  def testIamPermissions(request: AnonAccesstokenAltBearertokenCallbackFieldsKey): Request_[TestIamPermissionsResponse]
}

object RegistriesResource {
  @scala.inline
  def apply(
    create: AnonAccesstokenAltBearertoken => Request_[DeviceRegistry],
    delete: AnonAccesstokenAltBearertokenCallback => Request_[js.Object],
    devices: DevicesResource,
    get: AnonAccesstokenAltBearertokenCallback => Request_[DeviceRegistry],
    getIamPolicy: AnonAccesstokenAltBearertokenCallbackFieldsKey => Request_[Policy],
    list: AnonAccesstokenAltBearertokenCallbackFieldsKeyOauthtoken => Request_[ListDeviceRegistriesResponse],
    patch: AnonAccesstokenAltBearertokenCallbackFields => Request_[DeviceRegistry],
    setIamPolicy: AnonAccesstokenAltBearertokenCallbackFieldsKey => Request_[Policy],
    testIamPermissions: AnonAccesstokenAltBearertokenCallbackFieldsKey => Request_[TestIamPermissionsResponse]
  ): RegistriesResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), devices = devices.asInstanceOf[js.Any], get = js.Any.fromFunction1(get), getIamPolicy = js.Any.fromFunction1(getIamPolicy), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), setIamPolicy = js.Any.fromFunction1(setIamPolicy), testIamPermissions = js.Any.fromFunction1(testIamPermissions))
  
    __obj.asInstanceOf[RegistriesResource]
  }
}

