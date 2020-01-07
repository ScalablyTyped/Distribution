package typings.googleapis.buildSrcApisCloudkmsV1Mod.cloudkms_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/cloudkms/v1", "cloudkms_v1.Resource$Projects$Locations$Keyrings")
@js.native
class ResourceDollarProjectsDollarLocationsDollarKeyrings protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  var cryptoKeys: ResourceDollarProjectsDollarLocationsDollarKeyringsDollarCryptokeys = js.native
  var importJobs: ResourceDollarProjectsDollarLocationsDollarKeyringsDollarImportjobs = js.native
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
  def create(): GaxiosPromise[Schema$KeyRing] = js.native
  def create(callback: BodyResponseCallback[Schema$KeyRing]): Unit = js.native
  def create(params: ParamsDollarResourceDollarProjectsDollarLocationsDollarKeyringsDollarCreate): GaxiosPromise[Schema$KeyRing] = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarKeyringsDollarCreate,
    callback: BodyResponseCallback[Schema$KeyRing]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarKeyringsDollarCreate,
    options: BodyResponseCallback[Schema$KeyRing],
    callback: BodyResponseCallback[Schema$KeyRing]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarKeyringsDollarCreate,
    options: MethodOptions
  ): GaxiosPromise[Schema$KeyRing] = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarKeyringsDollarCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$KeyRing]
  ): Unit = js.native
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
  def get(): GaxiosPromise[Schema$KeyRing] = js.native
  def get(callback: BodyResponseCallback[Schema$KeyRing]): Unit = js.native
  def get(params: ParamsDollarResourceDollarProjectsDollarLocationsDollarKeyringsDollarGet): GaxiosPromise[Schema$KeyRing] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarKeyringsDollarGet,
    callback: BodyResponseCallback[Schema$KeyRing]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarKeyringsDollarGet,
    options: BodyResponseCallback[Schema$KeyRing],
    callback: BodyResponseCallback[Schema$KeyRing]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarKeyringsDollarGet,
    options: MethodOptions
  ): GaxiosPromise[Schema$KeyRing] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarKeyringsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$KeyRing]
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
  def getIamPolicy(): GaxiosPromise[Schema$Policy] = js.native
  def getIamPolicy(callback: BodyResponseCallback[Schema$Policy]): Unit = js.native
  def getIamPolicy(params: ParamsDollarResourceDollarProjectsDollarLocationsDollarKeyringsDollarGetiampolicy): GaxiosPromise[Schema$Policy] = js.native
  def getIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarKeyringsDollarGetiampolicy,
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  def getIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarKeyringsDollarGetiampolicy,
    options: BodyResponseCallback[Schema$Policy],
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  def getIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarKeyringsDollarGetiampolicy,
    options: MethodOptions
  ): GaxiosPromise[Schema$Policy] = js.native
  def getIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarKeyringsDollarGetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
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
  def list(): GaxiosPromise[Schema$ListKeyRingsResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListKeyRingsResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarProjectsDollarLocationsDollarKeyringsDollarList): GaxiosPromise[Schema$ListKeyRingsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarKeyringsDollarList,
    callback: BodyResponseCallback[Schema$ListKeyRingsResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarKeyringsDollarList,
    options: BodyResponseCallback[Schema$ListKeyRingsResponse],
    callback: BodyResponseCallback[Schema$ListKeyRingsResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarKeyringsDollarList,
    options: MethodOptions
  ): GaxiosPromise[Schema$ListKeyRingsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarKeyringsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListKeyRingsResponse]
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
  def setIamPolicy(): GaxiosPromise[Schema$Policy] = js.native
  def setIamPolicy(callback: BodyResponseCallback[Schema$Policy]): Unit = js.native
  def setIamPolicy(params: ParamsDollarResourceDollarProjectsDollarLocationsDollarKeyringsDollarSetiampolicy): GaxiosPromise[Schema$Policy] = js.native
  def setIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarKeyringsDollarSetiampolicy,
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  def setIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarKeyringsDollarSetiampolicy,
    options: BodyResponseCallback[Schema$Policy],
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  def setIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarKeyringsDollarSetiampolicy,
    options: MethodOptions
  ): GaxiosPromise[Schema$Policy] = js.native
  def setIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarKeyringsDollarSetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Policy]
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
  def testIamPermissions(): GaxiosPromise[Schema$TestIamPermissionsResponse] = js.native
  def testIamPermissions(callback: BodyResponseCallback[Schema$TestIamPermissionsResponse]): Unit = js.native
  def testIamPermissions(params: ParamsDollarResourceDollarProjectsDollarLocationsDollarKeyringsDollarTestiampermissions): GaxiosPromise[Schema$TestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarKeyringsDollarTestiampermissions,
    callback: BodyResponseCallback[Schema$TestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarKeyringsDollarTestiampermissions,
    options: BodyResponseCallback[Schema$TestIamPermissionsResponse],
    callback: BodyResponseCallback[Schema$TestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarKeyringsDollarTestiampermissions,
    options: MethodOptions
  ): GaxiosPromise[Schema$TestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarKeyringsDollarTestiampermissions,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$TestIamPermissionsResponse]
  ): Unit = js.native
}

