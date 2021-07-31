package typings.googleapis.cloudkmsV1Mod.cloudkmsV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/cloudkms/v1", "cloudkms_v1.Resource$Projects$Locations$Keyrings")
@js.native
class ResourceProjectsLocationsKeyrings protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * cloudkms.projects.locations.keyRings.create
    * @desc Create a new KeyRing in a given Project and Location.
    * @alias cloudkms.projects.locations.keyRings.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.keyRingId Required. It must be unique within a location and match the regular expression `[a-zA-Z0-9_-]{1,63}`
    * @param {string} params.parent Required. The resource name of the location associated with the KeyRings, in the format `projects/x/locations/x`.
    * @param {().KeyRing} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[SchemaKeyRing] = js.native
  def create(callback: BodyResponseCallback[SchemaKeyRing]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaKeyRing] = js.native
  def create(params: ParamsResourceProjectsLocationsKeyringsCreate): GaxiosPromise[SchemaKeyRing] = js.native
  def create(
    params: ParamsResourceProjectsLocationsKeyringsCreate,
    callback: BodyResponseCallback[SchemaKeyRing]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsLocationsKeyringsCreate,
    options: BodyResponseCallback[SchemaKeyRing],
    callback: BodyResponseCallback[SchemaKeyRing]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsLocationsKeyringsCreate, options: MethodOptions): GaxiosPromise[SchemaKeyRing] = js.native
  def create(
    params: ParamsResourceProjectsLocationsKeyringsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaKeyRing]
  ): Unit = js.native
  
  var cryptoKeys: ResourceProjectsLocationsKeyringsCryptokeys = js.native
  
  /**
    * cloudkms.projects.locations.keyRings.get
    * @desc Returns metadata for a given KeyRing.
    * @alias cloudkms.projects.locations.keyRings.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name of the KeyRing to get.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaKeyRing] = js.native
  def get(callback: BodyResponseCallback[SchemaKeyRing]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaKeyRing] = js.native
  def get(params: ParamsResourceProjectsLocationsKeyringsGet): GaxiosPromise[SchemaKeyRing] = js.native
  def get(params: ParamsResourceProjectsLocationsKeyringsGet, callback: BodyResponseCallback[SchemaKeyRing]): Unit = js.native
  def get(
    params: ParamsResourceProjectsLocationsKeyringsGet,
    options: BodyResponseCallback[SchemaKeyRing],
    callback: BodyResponseCallback[SchemaKeyRing]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsLocationsKeyringsGet, options: MethodOptions): GaxiosPromise[SchemaKeyRing] = js.native
  def get(
    params: ParamsResourceProjectsLocationsKeyringsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaKeyRing]
  ): Unit = js.native
  
  /**
    * cloudkms.projects.locations.keyRings.getIamPolicy
    * @desc Gets the access control policy for a resource. Returns an empty
    * policy if the resource exists and does not have a policy set.
    * @alias cloudkms.projects.locations.keyRings.getIamPolicy
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.resource_ REQUIRED: The resource for which the policy is being requested. See the operation documentation for the appropriate value for this field.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getIamPolicy(): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(callback: BodyResponseCallback[SchemaPolicy]): Unit = js.native
  def getIamPolicy(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(params: ParamsResourceProjectsLocationsKeyringsGetiampolicy): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(
    params: ParamsResourceProjectsLocationsKeyringsGetiampolicy,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  def getIamPolicy(
    params: ParamsResourceProjectsLocationsKeyringsGetiampolicy,
    options: BodyResponseCallback[SchemaPolicy],
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  def getIamPolicy(params: ParamsResourceProjectsLocationsKeyringsGetiampolicy, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(
    params: ParamsResourceProjectsLocationsKeyringsGetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  
  var importJobs: ResourceProjectsLocationsKeyringsImportjobs = js.native
  
  /**
    * cloudkms.projects.locations.keyRings.list
    * @desc Lists KeyRings.
    * @alias cloudkms.projects.locations.keyRings.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.pageSize Optional limit on the number of KeyRings to include in the response.  Further KeyRings can subsequently be obtained by including the ListKeyRingsResponse.next_page_token in a subsequent request.  If unspecified, the server will pick an appropriate default.
    * @param {string=} params.pageToken Optional pagination token, returned earlier via ListKeyRingsResponse.next_page_token.
    * @param {string} params.parent Required. The resource name of the location associated with the KeyRings, in the format `projects/x/locations/x`.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaListKeyRingsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListKeyRingsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListKeyRingsResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsKeyringsList): GaxiosPromise[SchemaListKeyRingsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsKeyringsList,
    callback: BodyResponseCallback[SchemaListKeyRingsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsKeyringsList,
    options: BodyResponseCallback[SchemaListKeyRingsResponse],
    callback: BodyResponseCallback[SchemaListKeyRingsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsKeyringsList, options: MethodOptions): GaxiosPromise[SchemaListKeyRingsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsKeyringsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListKeyRingsResponse]
  ): Unit = js.native
  
  /**
    * cloudkms.projects.locations.keyRings.setIamPolicy
    * @desc Sets the access control policy on the specified resource. Replaces
    * any existing policy.
    * @alias cloudkms.projects.locations.keyRings.setIamPolicy
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.resource_ REQUIRED: The resource for which the policy is being specified. See the operation documentation for the appropriate value for this field.
    * @param {().SetIamPolicyRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def setIamPolicy(): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(callback: BodyResponseCallback[SchemaPolicy]): Unit = js.native
  def setIamPolicy(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(params: ParamsResourceProjectsLocationsKeyringsSetiampolicy): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(
    params: ParamsResourceProjectsLocationsKeyringsSetiampolicy,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  def setIamPolicy(
    params: ParamsResourceProjectsLocationsKeyringsSetiampolicy,
    options: BodyResponseCallback[SchemaPolicy],
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  def setIamPolicy(params: ParamsResourceProjectsLocationsKeyringsSetiampolicy, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(
    params: ParamsResourceProjectsLocationsKeyringsSetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  
  /**
    * cloudkms.projects.locations.keyRings.testIamPermissions
    * @desc Returns permissions that a caller has on the specified resource. If
    * the resource does not exist, this will return an empty set of
    * permissions, not a NOT_FOUND error.  Note: This operation is designed to
    * be used for building permission-aware UIs and command-line tools, not for
    * authorization checking. This operation may "fail open" without warning.
    * @alias cloudkms.projects.locations.keyRings.testIamPermissions
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.resource_ REQUIRED: The resource for which the policy detail is being requested. See the operation documentation for the appropriate value for this field.
    * @param {().TestIamPermissionsRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def testIamPermissions(): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]): Unit = js.native
  def testIamPermissions(params: Unit, options: MethodOptions): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(params: ParamsResourceProjectsLocationsKeyringsTestiampermissions): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsLocationsKeyringsTestiampermissions,
    callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsLocationsKeyringsTestiampermissions,
    options: BodyResponseCallback[SchemaTestIamPermissionsResponse],
    callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(params: ParamsResourceProjectsLocationsKeyringsTestiampermissions, options: MethodOptions): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsLocationsKeyringsTestiampermissions,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]
  ): Unit = js.native
}
