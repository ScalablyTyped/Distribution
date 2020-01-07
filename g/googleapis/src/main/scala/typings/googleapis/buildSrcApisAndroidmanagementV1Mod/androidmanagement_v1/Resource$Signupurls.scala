package typings.googleapis.buildSrcApisAndroidmanagementV1Mod.androidmanagement_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/androidmanagement/v1", "androidmanagement_v1.Resource$Signupurls")
@js.native
class Resource$Signupurls protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * androidmanagement.signupUrls.create
    * @desc Creates an enterprise signup URL.
    * @alias androidmanagement.signupUrls.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.callbackUrl The callback URL that the admin will be redirected to after successfully creating an enterprise. Before redirecting there the system will add a query parameter to this URL named enterpriseToken which will contain an opaque token to be used for the create enterprise request. The URL will be parsed then reformatted in order to add the enterpriseToken parameter, so there may be some minor formatting changes.
    * @param {string=} params.projectId The ID of the Google Cloud Platform project which will own the enterprise.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[Schema$SignupUrl] = js.native
  def create(callback: BodyResponseCallback[Schema$SignupUrl]): Unit = js.native
  def create(params: ParamsDollarResourceDollarSignupurlsDollarCreate): GaxiosPromise[Schema$SignupUrl] = js.native
  def create(
    params: ParamsDollarResourceDollarSignupurlsDollarCreate,
    callback: BodyResponseCallback[Schema$SignupUrl]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarSignupurlsDollarCreate,
    options: BodyResponseCallback[Schema$SignupUrl],
    callback: BodyResponseCallback[Schema$SignupUrl]
  ): Unit = js.native
  def create(params: ParamsDollarResourceDollarSignupurlsDollarCreate, options: MethodOptions): GaxiosPromise[Schema$SignupUrl] = js.native
  def create(
    params: ParamsDollarResourceDollarSignupurlsDollarCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$SignupUrl]
  ): Unit = js.native
}

