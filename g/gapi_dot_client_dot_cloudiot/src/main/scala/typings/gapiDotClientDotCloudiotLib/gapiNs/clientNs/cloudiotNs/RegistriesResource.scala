package typings
package gapiDotClientDotCloudiotLib.gapiNs.clientNs.cloudiotNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegistriesResource extends js.Object {
  var devices: DevicesResource
  /** Creates a device registry that contains devices. */
  def create(request: gapiDotClientDotCloudiotLib.Anon_AccesstokenAltBearertoken): gapiDotClientLib.gapiNs.clientNs.Request[DeviceRegistry]
  /** Deletes a device registry configuration. */
  def delete(request: gapiDotClientDotCloudiotLib.Anon_AccesstokenAltBearertokenCallback): gapiDotClientLib.gapiNs.clientNs.Request[js.Object]
  /** Gets a device registry configuration. */
  def get(request: gapiDotClientDotCloudiotLib.Anon_AccesstokenAltBearertokenCallback): gapiDotClientLib.gapiNs.clientNs.Request[DeviceRegistry]
  /**
    * Gets the access control policy for a resource.
    * Returns an empty policy if the resource exists and does not have a policy
    * set.
    */
  def getIamPolicy(request: gapiDotClientDotCloudiotLib.Anon_AccesstokenAltBearertokenCallbackFieldsKey): gapiDotClientLib.gapiNs.clientNs.Request[Policy]
  /** Lists device registries. */
  def list(request: gapiDotClientDotCloudiotLib.Anon_AccesstokenAltBearertokenCallbackFieldsKeyOauthtoken): gapiDotClientLib.gapiNs.clientNs.Request[ListDeviceRegistriesResponse]
  /** Updates a device registry configuration. */
  def patch(request: gapiDotClientDotCloudiotLib.Anon_AccesstokenAltBearertokenCallbackFields): gapiDotClientLib.gapiNs.clientNs.Request[DeviceRegistry]
  /**
    * Sets the access control policy on the specified resource. Replaces any
    * existing policy.
    */
  def setIamPolicy(request: gapiDotClientDotCloudiotLib.Anon_AccesstokenAltBearertokenCallbackFieldsKey): gapiDotClientLib.gapiNs.clientNs.Request[Policy]
  /**
    * Returns permissions that a caller has on the specified resource.
    * If the resource does not exist, this will return an empty set of
    * permissions, not a NOT_FOUND error.
    */
  def testIamPermissions(request: gapiDotClientDotCloudiotLib.Anon_AccesstokenAltBearertokenCallbackFieldsKey): gapiDotClientLib.gapiNs.clientNs.Request[TestIamPermissionsResponse]
}

object RegistriesResource {
  @scala.inline
  def apply(
    create: gapiDotClientDotCloudiotLib.Anon_AccesstokenAltBearertoken => gapiDotClientLib.gapiNs.clientNs.Request[DeviceRegistry],
    delete: gapiDotClientDotCloudiotLib.Anon_AccesstokenAltBearertokenCallback => gapiDotClientLib.gapiNs.clientNs.Request[js.Object],
    devices: DevicesResource,
    get: gapiDotClientDotCloudiotLib.Anon_AccesstokenAltBearertokenCallback => gapiDotClientLib.gapiNs.clientNs.Request[DeviceRegistry],
    getIamPolicy: gapiDotClientDotCloudiotLib.Anon_AccesstokenAltBearertokenCallbackFieldsKey => gapiDotClientLib.gapiNs.clientNs.Request[Policy],
    list: gapiDotClientDotCloudiotLib.Anon_AccesstokenAltBearertokenCallbackFieldsKeyOauthtoken => gapiDotClientLib.gapiNs.clientNs.Request[ListDeviceRegistriesResponse],
    patch: gapiDotClientDotCloudiotLib.Anon_AccesstokenAltBearertokenCallbackFields => gapiDotClientLib.gapiNs.clientNs.Request[DeviceRegistry],
    setIamPolicy: gapiDotClientDotCloudiotLib.Anon_AccesstokenAltBearertokenCallbackFieldsKey => gapiDotClientLib.gapiNs.clientNs.Request[Policy],
    testIamPermissions: gapiDotClientDotCloudiotLib.Anon_AccesstokenAltBearertokenCallbackFieldsKey => gapiDotClientLib.gapiNs.clientNs.Request[TestIamPermissionsResponse]
  ): RegistriesResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), devices = devices, get = js.Any.fromFunction1(get), getIamPolicy = js.Any.fromFunction1(getIamPolicy), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), setIamPolicy = js.Any.fromFunction1(setIamPolicy), testIamPermissions = js.Any.fromFunction1(testIamPermissions))
  
    __obj.asInstanceOf[RegistriesResource]
  }
}

