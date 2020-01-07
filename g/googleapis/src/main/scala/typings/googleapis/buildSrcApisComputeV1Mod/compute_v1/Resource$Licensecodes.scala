package typings.googleapis.buildSrcApisComputeV1Mod.compute_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/compute/v1", "compute_v1.Resource$Licensecodes")
@js.native
class Resource$Licensecodes protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * compute.licenseCodes.get
    * @desc Return a specified license code. License codes are mirrored across
    * all projects that have permissions to read the License Code.
    * @alias compute.licenseCodes.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.licenseCode Number corresponding to the License code resource to return.
    * @param {string} params.project Project ID for this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$LicenseCode] = js.native
  def get(callback: BodyResponseCallback[Schema$LicenseCode]): Unit = js.native
  def get(params: ParamsDollarResourceDollarLicensecodesDollarGet): GaxiosPromise[Schema$LicenseCode] = js.native
  def get(
    params: ParamsDollarResourceDollarLicensecodesDollarGet,
    callback: BodyResponseCallback[Schema$LicenseCode]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarLicensecodesDollarGet,
    options: BodyResponseCallback[Schema$LicenseCode],
    callback: BodyResponseCallback[Schema$LicenseCode]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarLicensecodesDollarGet, options: MethodOptions): GaxiosPromise[Schema$LicenseCode] = js.native
  def get(
    params: ParamsDollarResourceDollarLicensecodesDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$LicenseCode]
  ): Unit = js.native
  /**
    * compute.licenseCodes.testIamPermissions
    * @desc Returns permissions that a caller has on the specified resource.
    * @alias compute.licenseCodes.testIamPermissions
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.project Project ID for this request.
    * @param {string} params.resource_ Name or id of the resource for this request.
    * @param {().TestPermissionsRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def testIamPermissions(): GaxiosPromise[Schema$TestPermissionsResponse] = js.native
  def testIamPermissions(callback: BodyResponseCallback[Schema$TestPermissionsResponse]): Unit = js.native
  def testIamPermissions(params: ParamsDollarResourceDollarLicensecodesDollarTestiampermissions): GaxiosPromise[Schema$TestPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarLicensecodesDollarTestiampermissions,
    callback: BodyResponseCallback[Schema$TestPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarLicensecodesDollarTestiampermissions,
    options: BodyResponseCallback[Schema$TestPermissionsResponse],
    callback: BodyResponseCallback[Schema$TestPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(params: ParamsDollarResourceDollarLicensecodesDollarTestiampermissions, options: MethodOptions): GaxiosPromise[Schema$TestPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarLicensecodesDollarTestiampermissions,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$TestPermissionsResponse]
  ): Unit = js.native
}

