package typings.googleapis.androidmanagementV1Mod.androidmanagementV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/androidmanagement/v1", "androidmanagement_v1.Resource$Enterprises$Enrollmenttokens")
@js.native
class ResourceEnterprisesEnrollmenttokens protected () extends js.Object {
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
  def create(): GaxiosPromise[SchemaEnrollmentToken] = js.native
  def create(callback: BodyResponseCallback[SchemaEnrollmentToken]): Unit = js.native
  def create(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaEnrollmentToken] = js.native
  def create(params: ParamsResourceEnterprisesEnrollmenttokensCreate): GaxiosPromise[SchemaEnrollmentToken] = js.native
  def create(
    params: ParamsResourceEnterprisesEnrollmenttokensCreate,
    callback: BodyResponseCallback[SchemaEnrollmentToken]
  ): Unit = js.native
  def create(
    params: ParamsResourceEnterprisesEnrollmenttokensCreate,
    options: BodyResponseCallback[SchemaEnrollmentToken],
    callback: BodyResponseCallback[SchemaEnrollmentToken]
  ): Unit = js.native
  def create(params: ParamsResourceEnterprisesEnrollmenttokensCreate, options: MethodOptions): GaxiosPromise[SchemaEnrollmentToken] = js.native
  def create(
    params: ParamsResourceEnterprisesEnrollmenttokensCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEnrollmentToken]
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
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceEnterprisesEnrollmenttokensDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceEnterprisesEnrollmenttokensDelete,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsResourceEnterprisesEnrollmenttokensDelete,
    options: BodyResponseCallback[SchemaEmpty],
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceEnterprisesEnrollmenttokensDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceEnterprisesEnrollmenttokensDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
}

