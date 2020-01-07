package typings.googleapis.buildSrcApisComputeBetaMod.compute_beta

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/compute/beta", "compute_beta.Resource$Licensecodes")
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
}

