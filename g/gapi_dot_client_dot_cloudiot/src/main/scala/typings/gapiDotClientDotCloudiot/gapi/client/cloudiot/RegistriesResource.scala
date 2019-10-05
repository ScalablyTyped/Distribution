package typings.gapiDotClientDotCloudiot.gapi.client.cloudiot

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotCloudiot.Anon_AccesstokenAltBearertoken
import typings.gapiDotClientDotCloudiot.Anon_AccesstokenAltBearertokenCallback
import typings.gapiDotClientDotCloudiot.Anon_AccesstokenAltBearertokenCallbackFields
import typings.gapiDotClientDotCloudiot.Anon_AccesstokenAltBearertokenCallbackFieldsKey
import typings.gapiDotClientDotCloudiot.Anon_AccesstokenAltBearertokenCallbackFieldsKeyOauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegistriesResource extends js.Object {
  var devices: DevicesResource
  /** Creates a device registry that contains devices. */
  def create(request: Anon_AccesstokenAltBearertoken): Request[DeviceRegistry]
  /** Deletes a device registry configuration. */
  def delete(request: Anon_AccesstokenAltBearertokenCallback): Request[js.Object]
  /** Gets a device registry configuration. */
  def get(request: Anon_AccesstokenAltBearertokenCallback): Request[DeviceRegistry]
  /**
    * Gets the access control policy for a resource.
    * Returns an empty policy if the resource exists and does not have a policy
    * set.
    */
  def getIamPolicy(request: Anon_AccesstokenAltBearertokenCallbackFieldsKey): Request[Policy]
  /** Lists device registries. */
  def list(request: Anon_AccesstokenAltBearertokenCallbackFieldsKeyOauthtoken): Request[ListDeviceRegistriesResponse]
  /** Updates a device registry configuration. */
  def patch(request: Anon_AccesstokenAltBearertokenCallbackFields): Request[DeviceRegistry]
  /**
    * Sets the access control policy on the specified resource. Replaces any
    * existing policy.
    */
  def setIamPolicy(request: Anon_AccesstokenAltBearertokenCallbackFieldsKey): Request[Policy]
  /**
    * Returns permissions that a caller has on the specified resource.
    * If the resource does not exist, this will return an empty set of
    * permissions, not a NOT_FOUND error.
    */
  def testIamPermissions(request: Anon_AccesstokenAltBearertokenCallbackFieldsKey): Request[TestIamPermissionsResponse]
}

object RegistriesResource {
  @scala.inline
  def apply(
    create: Anon_AccesstokenAltBearertoken => Request[DeviceRegistry],
    delete: Anon_AccesstokenAltBearertokenCallback => Request[js.Object],
    devices: DevicesResource,
    get: Anon_AccesstokenAltBearertokenCallback => Request[DeviceRegistry],
    getIamPolicy: Anon_AccesstokenAltBearertokenCallbackFieldsKey => Request[Policy],
    list: Anon_AccesstokenAltBearertokenCallbackFieldsKeyOauthtoken => Request[ListDeviceRegistriesResponse],
    patch: Anon_AccesstokenAltBearertokenCallbackFields => Request[DeviceRegistry],
    setIamPolicy: Anon_AccesstokenAltBearertokenCallbackFieldsKey => Request[Policy],
    testIamPermissions: Anon_AccesstokenAltBearertokenCallbackFieldsKey => Request[TestIamPermissionsResponse]
  ): RegistriesResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), devices = devices, get = js.Any.fromFunction1(get), getIamPolicy = js.Any.fromFunction1(getIamPolicy), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), setIamPolicy = js.Any.fromFunction1(setIamPolicy), testIamPermissions = js.Any.fromFunction1(testIamPermissions))
  
    __obj.asInstanceOf[RegistriesResource]
  }
}

