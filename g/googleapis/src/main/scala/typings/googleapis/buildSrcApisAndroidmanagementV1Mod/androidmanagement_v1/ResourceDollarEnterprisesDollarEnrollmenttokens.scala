package typings.googleapis.buildSrcApisAndroidmanagementV1Mod.androidmanagement_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/androidmanagement/v1", "androidmanagement_v1.Resource$Enterprises$Enrollmenttokens")
@js.native
class ResourceDollarEnterprisesDollarEnrollmenttokens protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * androidmanagement.enterprises.enrollmentTokens.create
    * @desc Creates an enrollment token for a given enterprise.
    * @alias androidmanagement.enterprises.enrollmentTokens.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent The name of the enterprise in the form enterprises/{enterpriseId}.
    * @param {().EnrollmentToken} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[Schema$EnrollmentToken] = js.native
  def create(callback: BodyResponseCallback[Schema$EnrollmentToken]): Unit = js.native
  def create(params: ParamsDollarResourceDollarEnterprisesDollarEnrollmenttokensDollarCreate): GaxiosPromise[Schema$EnrollmentToken] = js.native
  def create(
    params: ParamsDollarResourceDollarEnterprisesDollarEnrollmenttokensDollarCreate,
    callback: BodyResponseCallback[Schema$EnrollmentToken]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarEnterprisesDollarEnrollmenttokensDollarCreate,
    options: BodyResponseCallback[Schema$EnrollmentToken],
    callback: BodyResponseCallback[Schema$EnrollmentToken]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarEnterprisesDollarEnrollmenttokensDollarCreate,
    options: MethodOptions
  ): GaxiosPromise[Schema$EnrollmentToken] = js.native
  def create(
    params: ParamsDollarResourceDollarEnterprisesDollarEnrollmenttokensDollarCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$EnrollmentToken]
  ): Unit = js.native
  /**
    * androidmanagement.enterprises.enrollmentTokens.delete
    * @desc Deletes an enrollment token. This operation invalidates the token,
    * preventing its future use.
    * @alias androidmanagement.enterprises.enrollmentTokens.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name of the enrollment token in the form enterprises/{enterpriseId}/enrollmentTokens/{enrollmentTokenId}.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Schema$Empty] = js.native
  def delete(callback: BodyResponseCallback[Schema$Empty]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarEnterprisesDollarEnrollmenttokensDollarDelete): GaxiosPromise[Schema$Empty] = js.native
  def delete(
    params: ParamsDollarResourceDollarEnterprisesDollarEnrollmenttokensDollarDelete,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarEnterprisesDollarEnrollmenttokensDollarDelete,
    options: BodyResponseCallback[Schema$Empty],
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarEnterprisesDollarEnrollmenttokensDollarDelete,
    options: MethodOptions
  ): GaxiosPromise[Schema$Empty] = js.native
  def delete(
    params: ParamsDollarResourceDollarEnterprisesDollarEnrollmenttokensDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
}

