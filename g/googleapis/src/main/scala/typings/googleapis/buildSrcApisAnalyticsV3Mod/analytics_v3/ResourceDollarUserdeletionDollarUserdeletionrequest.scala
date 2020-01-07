package typings.googleapis.buildSrcApisAnalyticsV3Mod.analytics_v3

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/analytics/v3", "analytics_v3.Resource$Userdeletion$Userdeletionrequest")
@js.native
class ResourceDollarUserdeletionDollarUserdeletionrequest protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * analytics.userDeletion.userDeletionRequest.upsert
    * @desc Insert or update a user deletion requests.
    * @alias analytics.userDeletion.userDeletionRequest.upsert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().UserDeletionRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def upsert(): GaxiosPromise[Schema$UserDeletionRequest] = js.native
  def upsert(callback: BodyResponseCallback[Schema$UserDeletionRequest]): Unit = js.native
  def upsert(params: ParamsDollarResourceDollarUserdeletionDollarUserdeletionrequestDollarUpsert): GaxiosPromise[Schema$UserDeletionRequest] = js.native
  def upsert(
    params: ParamsDollarResourceDollarUserdeletionDollarUserdeletionrequestDollarUpsert,
    callback: BodyResponseCallback[Schema$UserDeletionRequest]
  ): Unit = js.native
  def upsert(
    params: ParamsDollarResourceDollarUserdeletionDollarUserdeletionrequestDollarUpsert,
    options: BodyResponseCallback[Schema$UserDeletionRequest],
    callback: BodyResponseCallback[Schema$UserDeletionRequest]
  ): Unit = js.native
  def upsert(
    params: ParamsDollarResourceDollarUserdeletionDollarUserdeletionrequestDollarUpsert,
    options: MethodOptions
  ): GaxiosPromise[Schema$UserDeletionRequest] = js.native
  def upsert(
    params: ParamsDollarResourceDollarUserdeletionDollarUserdeletionrequestDollarUpsert,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$UserDeletionRequest]
  ): Unit = js.native
}

