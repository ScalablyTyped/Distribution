package typings.googleapis.buildSrcApisDfareportingV3Dot1Mod.dfareporting_v3_1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/dfareporting/v3.1", "dfareporting_v3_1.Resource$Creativefields")
@js.native
class Resource$Creativefields protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * dfareporting.creativeFields.delete
    * @desc Deletes an existing creative field.
    * @alias dfareporting.creativeFields.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id Creative Field ID
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarCreativefieldsDollarDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsDollarResourceDollarCreativefieldsDollarDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarCreativefieldsDollarDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarCreativefieldsDollarDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsDollarResourceDollarCreativefieldsDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * dfareporting.creativeFields.get
    * @desc Gets one creative field by ID.
    * @alias dfareporting.creativeFields.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id Creative Field ID
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$CreativeField] = js.native
  def get(callback: BodyResponseCallback[Schema$CreativeField]): Unit = js.native
  def get(params: ParamsDollarResourceDollarCreativefieldsDollarGet): GaxiosPromise[Schema$CreativeField] = js.native
  def get(
    params: ParamsDollarResourceDollarCreativefieldsDollarGet,
    callback: BodyResponseCallback[Schema$CreativeField]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarCreativefieldsDollarGet,
    options: BodyResponseCallback[Schema$CreativeField],
    callback: BodyResponseCallback[Schema$CreativeField]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarCreativefieldsDollarGet, options: MethodOptions): GaxiosPromise[Schema$CreativeField] = js.native
  def get(
    params: ParamsDollarResourceDollarCreativefieldsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$CreativeField]
  ): Unit = js.native
  /**
    * dfareporting.creativeFields.insert
    * @desc Inserts a new creative field.
    * @alias dfareporting.creativeFields.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {().CreativeField} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[Schema$CreativeField] = js.native
  def insert(callback: BodyResponseCallback[Schema$CreativeField]): Unit = js.native
  def insert(params: ParamsDollarResourceDollarCreativefieldsDollarInsert): GaxiosPromise[Schema$CreativeField] = js.native
  def insert(
    params: ParamsDollarResourceDollarCreativefieldsDollarInsert,
    callback: BodyResponseCallback[Schema$CreativeField]
  ): Unit = js.native
  def insert(
    params: ParamsDollarResourceDollarCreativefieldsDollarInsert,
    options: BodyResponseCallback[Schema$CreativeField],
    callback: BodyResponseCallback[Schema$CreativeField]
  ): Unit = js.native
  def insert(params: ParamsDollarResourceDollarCreativefieldsDollarInsert, options: MethodOptions): GaxiosPromise[Schema$CreativeField] = js.native
  def insert(
    params: ParamsDollarResourceDollarCreativefieldsDollarInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$CreativeField]
  ): Unit = js.native
  /**
    * dfareporting.creativeFields.list
    * @desc Retrieves a list of creative fields, possibly filtered. This method
    * supports paging.
    * @alias dfareporting.creativeFields.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.advertiserIds Select only creative fields that belong to these advertisers.
    * @param {string=} params.ids Select only creative fields with these IDs.
    * @param {integer=} params.maxResults Maximum number of results to return.
    * @param {string=} params.pageToken Value of the nextPageToken from the previous result page.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {string=} params.searchString Allows searching for creative fields by name or ID. Wildcards (*) are allowed. For example, "creativefield*2015" will return creative fields with names like "creativefield June 2015", "creativefield April 2015", or simply "creativefield 2015". Most of the searches also add wild-cards implicitly at the start and the end of the search string. For example, a search string of "creativefield" will match creative fields with the name "my creativefield", "creativefield 2015", or simply "creativefield".
    * @param {string=} params.sortField Field by which to sort the list.
    * @param {string=} params.sortOrder Order of sorted results.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$CreativeFieldsListResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$CreativeFieldsListResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarCreativefieldsDollarList): GaxiosPromise[Schema$CreativeFieldsListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarCreativefieldsDollarList,
    callback: BodyResponseCallback[Schema$CreativeFieldsListResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarCreativefieldsDollarList,
    options: BodyResponseCallback[Schema$CreativeFieldsListResponse],
    callback: BodyResponseCallback[Schema$CreativeFieldsListResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarCreativefieldsDollarList, options: MethodOptions): GaxiosPromise[Schema$CreativeFieldsListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarCreativefieldsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$CreativeFieldsListResponse]
  ): Unit = js.native
  /**
    * dfareporting.creativeFields.patch
    * @desc Updates an existing creative field. This method supports patch
    * semantics.
    * @alias dfareporting.creativeFields.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id Creative Field ID
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {().CreativeField} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[Schema$CreativeField] = js.native
  def patch(callback: BodyResponseCallback[Schema$CreativeField]): Unit = js.native
  def patch(params: ParamsDollarResourceDollarCreativefieldsDollarPatch): GaxiosPromise[Schema$CreativeField] = js.native
  def patch(
    params: ParamsDollarResourceDollarCreativefieldsDollarPatch,
    callback: BodyResponseCallback[Schema$CreativeField]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarCreativefieldsDollarPatch,
    options: BodyResponseCallback[Schema$CreativeField],
    callback: BodyResponseCallback[Schema$CreativeField]
  ): Unit = js.native
  def patch(params: ParamsDollarResourceDollarCreativefieldsDollarPatch, options: MethodOptions): GaxiosPromise[Schema$CreativeField] = js.native
  def patch(
    params: ParamsDollarResourceDollarCreativefieldsDollarPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$CreativeField]
  ): Unit = js.native
  /**
    * dfareporting.creativeFields.update
    * @desc Updates an existing creative field.
    * @alias dfareporting.creativeFields.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {().CreativeField} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[Schema$CreativeField] = js.native
  def update(callback: BodyResponseCallback[Schema$CreativeField]): Unit = js.native
  def update(params: ParamsDollarResourceDollarCreativefieldsDollarUpdate): GaxiosPromise[Schema$CreativeField] = js.native
  def update(
    params: ParamsDollarResourceDollarCreativefieldsDollarUpdate,
    callback: BodyResponseCallback[Schema$CreativeField]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarCreativefieldsDollarUpdate,
    options: BodyResponseCallback[Schema$CreativeField],
    callback: BodyResponseCallback[Schema$CreativeField]
  ): Unit = js.native
  def update(params: ParamsDollarResourceDollarCreativefieldsDollarUpdate, options: MethodOptions): GaxiosPromise[Schema$CreativeField] = js.native
  def update(
    params: ParamsDollarResourceDollarCreativefieldsDollarUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$CreativeField]
  ): Unit = js.native
}

