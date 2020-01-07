package typings.googleapis.buildSrcApisDfareportingV3Dot1Mod.dfareporting_v3_1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/dfareporting/v3.1", "dfareporting_v3_1.Resource$Remarketinglistshares")
@js.native
class Resource$Remarketinglistshares protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * dfareporting.remarketingListShares.get
    * @desc Gets one remarketing list share by remarketing list ID.
    * @alias dfareporting.remarketingListShares.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {string} params.remarketingListId Remarketing list ID.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$RemarketingListShare] = js.native
  def get(callback: BodyResponseCallback[Schema$RemarketingListShare]): Unit = js.native
  def get(params: ParamsDollarResourceDollarRemarketinglistsharesDollarGet): GaxiosPromise[Schema$RemarketingListShare] = js.native
  def get(
    params: ParamsDollarResourceDollarRemarketinglistsharesDollarGet,
    callback: BodyResponseCallback[Schema$RemarketingListShare]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarRemarketinglistsharesDollarGet,
    options: BodyResponseCallback[Schema$RemarketingListShare],
    callback: BodyResponseCallback[Schema$RemarketingListShare]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarRemarketinglistsharesDollarGet, options: MethodOptions): GaxiosPromise[Schema$RemarketingListShare] = js.native
  def get(
    params: ParamsDollarResourceDollarRemarketinglistsharesDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$RemarketingListShare]
  ): Unit = js.native
  /**
    * dfareporting.remarketingListShares.patch
    * @desc Updates an existing remarketing list share. This method supports
    * patch semantics.
    * @alias dfareporting.remarketingListShares.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {string} params.remarketingListId Remarketing list ID.
    * @param {().RemarketingListShare} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[Schema$RemarketingListShare] = js.native
  def patch(callback: BodyResponseCallback[Schema$RemarketingListShare]): Unit = js.native
  def patch(params: ParamsDollarResourceDollarRemarketinglistsharesDollarPatch): GaxiosPromise[Schema$RemarketingListShare] = js.native
  def patch(
    params: ParamsDollarResourceDollarRemarketinglistsharesDollarPatch,
    callback: BodyResponseCallback[Schema$RemarketingListShare]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarRemarketinglistsharesDollarPatch,
    options: BodyResponseCallback[Schema$RemarketingListShare],
    callback: BodyResponseCallback[Schema$RemarketingListShare]
  ): Unit = js.native
  def patch(params: ParamsDollarResourceDollarRemarketinglistsharesDollarPatch, options: MethodOptions): GaxiosPromise[Schema$RemarketingListShare] = js.native
  def patch(
    params: ParamsDollarResourceDollarRemarketinglistsharesDollarPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$RemarketingListShare]
  ): Unit = js.native
  /**
    * dfareporting.remarketingListShares.update
    * @desc Updates an existing remarketing list share.
    * @alias dfareporting.remarketingListShares.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {().RemarketingListShare} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[Schema$RemarketingListShare] = js.native
  def update(callback: BodyResponseCallback[Schema$RemarketingListShare]): Unit = js.native
  def update(params: ParamsDollarResourceDollarRemarketinglistsharesDollarUpdate): GaxiosPromise[Schema$RemarketingListShare] = js.native
  def update(
    params: ParamsDollarResourceDollarRemarketinglistsharesDollarUpdate,
    callback: BodyResponseCallback[Schema$RemarketingListShare]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarRemarketinglistsharesDollarUpdate,
    options: BodyResponseCallback[Schema$RemarketingListShare],
    callback: BodyResponseCallback[Schema$RemarketingListShare]
  ): Unit = js.native
  def update(params: ParamsDollarResourceDollarRemarketinglistsharesDollarUpdate, options: MethodOptions): GaxiosPromise[Schema$RemarketingListShare] = js.native
  def update(
    params: ParamsDollarResourceDollarRemarketinglistsharesDollarUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$RemarketingListShare]
  ): Unit = js.native
}

