package typings.googleapis.betaMod.computeBeta

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/compute/beta", "compute_beta.Resource$Licensecodes")
@js.native
class ResourceLicensecodes protected () extends js.Object {
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
  def get(): GaxiosPromise[SchemaLicenseCode] = js.native
  def get(callback: BodyResponseCallback[SchemaLicenseCode]): Unit = js.native
  def get(params: ParamsResourceLicensecodesGet): GaxiosPromise[SchemaLicenseCode] = js.native
  def get(params: ParamsResourceLicensecodesGet, callback: BodyResponseCallback[SchemaLicenseCode]): Unit = js.native
  def get(
    params: ParamsResourceLicensecodesGet,
    options: BodyResponseCallback[SchemaLicenseCode],
    callback: BodyResponseCallback[SchemaLicenseCode]
  ): Unit = js.native
  def get(params: ParamsResourceLicensecodesGet, options: MethodOptions): GaxiosPromise[SchemaLicenseCode] = js.native
  def get(
    params: ParamsResourceLicensecodesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaLicenseCode]
  ): Unit = js.native
}

