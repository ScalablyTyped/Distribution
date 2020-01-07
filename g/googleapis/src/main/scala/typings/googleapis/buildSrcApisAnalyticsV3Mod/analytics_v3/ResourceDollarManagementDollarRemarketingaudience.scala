package typings.googleapis.buildSrcApisAnalyticsV3Mod.analytics_v3

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/analytics/v3", "analytics_v3.Resource$Management$Remarketingaudience")
@js.native
class ResourceDollarManagementDollarRemarketingaudience protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * analytics.management.remarketingAudience.delete
    * @desc Delete a remarketing audience.
    * @alias analytics.management.remarketingAudience.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Account ID to which the remarketing audience belongs.
    * @param {string} params.remarketingAudienceId The ID of the remarketing audience to delete.
    * @param {string} params.webPropertyId Web property ID to which the remarketing audience belongs.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarManagementDollarRemarketingaudienceDollarDelete): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsDollarResourceDollarManagementDollarRemarketingaudienceDollarDelete,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarManagementDollarRemarketingaudienceDollarDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarManagementDollarRemarketingaudienceDollarDelete,
    options: MethodOptions
  ): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsDollarResourceDollarManagementDollarRemarketingaudienceDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * analytics.management.remarketingAudience.get
    * @desc Gets a remarketing audience to which the user has access.
    * @alias analytics.management.remarketingAudience.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId The account ID of the remarketing audience to retrieve.
    * @param {string} params.remarketingAudienceId The ID of the remarketing audience to retrieve.
    * @param {string} params.webPropertyId The web property ID of the remarketing audience to retrieve.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$RemarketingAudience] = js.native
  def get(callback: BodyResponseCallback[Schema$RemarketingAudience]): Unit = js.native
  def get(params: ParamsDollarResourceDollarManagementDollarRemarketingaudienceDollarGet): GaxiosPromise[Schema$RemarketingAudience] = js.native
  def get(
    params: ParamsDollarResourceDollarManagementDollarRemarketingaudienceDollarGet,
    callback: BodyResponseCallback[Schema$RemarketingAudience]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarManagementDollarRemarketingaudienceDollarGet,
    options: BodyResponseCallback[Schema$RemarketingAudience],
    callback: BodyResponseCallback[Schema$RemarketingAudience]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarManagementDollarRemarketingaudienceDollarGet,
    options: MethodOptions
  ): GaxiosPromise[Schema$RemarketingAudience] = js.native
  def get(
    params: ParamsDollarResourceDollarManagementDollarRemarketingaudienceDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$RemarketingAudience]
  ): Unit = js.native
  /**
    * analytics.management.remarketingAudience.insert
    * @desc Creates a new remarketing audience.
    * @alias analytics.management.remarketingAudience.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId The account ID for which to create the remarketing audience.
    * @param {string} params.webPropertyId Web property ID for which to create the remarketing audience.
    * @param {().RemarketingAudience} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[Schema$RemarketingAudience] = js.native
  def insert(callback: BodyResponseCallback[Schema$RemarketingAudience]): Unit = js.native
  def insert(params: ParamsDollarResourceDollarManagementDollarRemarketingaudienceDollarInsert): GaxiosPromise[Schema$RemarketingAudience] = js.native
  def insert(
    params: ParamsDollarResourceDollarManagementDollarRemarketingaudienceDollarInsert,
    callback: BodyResponseCallback[Schema$RemarketingAudience]
  ): Unit = js.native
  def insert(
    params: ParamsDollarResourceDollarManagementDollarRemarketingaudienceDollarInsert,
    options: BodyResponseCallback[Schema$RemarketingAudience],
    callback: BodyResponseCallback[Schema$RemarketingAudience]
  ): Unit = js.native
  def insert(
    params: ParamsDollarResourceDollarManagementDollarRemarketingaudienceDollarInsert,
    options: MethodOptions
  ): GaxiosPromise[Schema$RemarketingAudience] = js.native
  def insert(
    params: ParamsDollarResourceDollarManagementDollarRemarketingaudienceDollarInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$RemarketingAudience]
  ): Unit = js.native
  /**
    * analytics.management.remarketingAudience.list
    * @desc Lists remarketing audiences to which the user has access.
    * @alias analytics.management.remarketingAudience.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId The account ID of the remarketing audiences to retrieve.
    * @param {integer=} params.max-results The maximum number of remarketing audiences to include in this response.
    * @param {integer=} params.start-index An index of the first entity to retrieve. Use this parameter as a pagination mechanism along with the max-results parameter.
    * @param {string=} params.type
    * @param {string} params.webPropertyId The web property ID of the remarketing audiences to retrieve.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$RemarketingAudiences] = js.native
  def list(callback: BodyResponseCallback[Schema$RemarketingAudiences]): Unit = js.native
  def list(params: ParamsDollarResourceDollarManagementDollarRemarketingaudienceDollarList): GaxiosPromise[Schema$RemarketingAudiences] = js.native
  def list(
    params: ParamsDollarResourceDollarManagementDollarRemarketingaudienceDollarList,
    callback: BodyResponseCallback[Schema$RemarketingAudiences]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarManagementDollarRemarketingaudienceDollarList,
    options: BodyResponseCallback[Schema$RemarketingAudiences],
    callback: BodyResponseCallback[Schema$RemarketingAudiences]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarManagementDollarRemarketingaudienceDollarList,
    options: MethodOptions
  ): GaxiosPromise[Schema$RemarketingAudiences] = js.native
  def list(
    params: ParamsDollarResourceDollarManagementDollarRemarketingaudienceDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$RemarketingAudiences]
  ): Unit = js.native
  /**
    * analytics.management.remarketingAudience.patch
    * @desc Updates an existing remarketing audience. This method supports
    * patch semantics.
    * @alias analytics.management.remarketingAudience.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId The account ID of the remarketing audience to update.
    * @param {string} params.remarketingAudienceId The ID of the remarketing audience to update.
    * @param {string} params.webPropertyId The web property ID of the remarketing audience to update.
    * @param {().RemarketingAudience} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[Schema$RemarketingAudience] = js.native
  def patch(callback: BodyResponseCallback[Schema$RemarketingAudience]): Unit = js.native
  def patch(params: ParamsDollarResourceDollarManagementDollarRemarketingaudienceDollarPatch): GaxiosPromise[Schema$RemarketingAudience] = js.native
  def patch(
    params: ParamsDollarResourceDollarManagementDollarRemarketingaudienceDollarPatch,
    callback: BodyResponseCallback[Schema$RemarketingAudience]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarManagementDollarRemarketingaudienceDollarPatch,
    options: BodyResponseCallback[Schema$RemarketingAudience],
    callback: BodyResponseCallback[Schema$RemarketingAudience]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarManagementDollarRemarketingaudienceDollarPatch,
    options: MethodOptions
  ): GaxiosPromise[Schema$RemarketingAudience] = js.native
  def patch(
    params: ParamsDollarResourceDollarManagementDollarRemarketingaudienceDollarPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$RemarketingAudience]
  ): Unit = js.native
  /**
    * analytics.management.remarketingAudience.update
    * @desc Updates an existing remarketing audience.
    * @alias analytics.management.remarketingAudience.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId The account ID of the remarketing audience to update.
    * @param {string} params.remarketingAudienceId The ID of the remarketing audience to update.
    * @param {string} params.webPropertyId The web property ID of the remarketing audience to update.
    * @param {().RemarketingAudience} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[Schema$RemarketingAudience] = js.native
  def update(callback: BodyResponseCallback[Schema$RemarketingAudience]): Unit = js.native
  def update(params: ParamsDollarResourceDollarManagementDollarRemarketingaudienceDollarUpdate): GaxiosPromise[Schema$RemarketingAudience] = js.native
  def update(
    params: ParamsDollarResourceDollarManagementDollarRemarketingaudienceDollarUpdate,
    callback: BodyResponseCallback[Schema$RemarketingAudience]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarManagementDollarRemarketingaudienceDollarUpdate,
    options: BodyResponseCallback[Schema$RemarketingAudience],
    callback: BodyResponseCallback[Schema$RemarketingAudience]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarManagementDollarRemarketingaudienceDollarUpdate,
    options: MethodOptions
  ): GaxiosPromise[Schema$RemarketingAudience] = js.native
  def update(
    params: ParamsDollarResourceDollarManagementDollarRemarketingaudienceDollarUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$RemarketingAudience]
  ): Unit = js.native
}

