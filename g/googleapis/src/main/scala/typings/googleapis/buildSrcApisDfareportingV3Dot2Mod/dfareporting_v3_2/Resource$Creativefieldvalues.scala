package typings.googleapis.buildSrcApisDfareportingV3Dot2Mod.dfareporting_v3_2

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/dfareporting/v3.2", "dfareporting_v3_2.Resource$Creativefieldvalues")
@js.native
class Resource$Creativefieldvalues protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * dfareporting.creativeFieldValues.delete
    * @desc Deletes an existing creative field value.
    * @alias dfareporting.creativeFieldValues.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.creativeFieldId Creative field ID for this creative field value.
    * @param {string} params.id Creative Field Value ID
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarCreativefieldvaluesDollarDelete): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsDollarResourceDollarCreativefieldvaluesDollarDelete,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarCreativefieldvaluesDollarDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarCreativefieldvaluesDollarDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsDollarResourceDollarCreativefieldvaluesDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * dfareporting.creativeFieldValues.get
    * @desc Gets one creative field value by ID.
    * @alias dfareporting.creativeFieldValues.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.creativeFieldId Creative field ID for this creative field value.
    * @param {string} params.id Creative Field Value ID
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$CreativeFieldValue] = js.native
  def get(callback: BodyResponseCallback[Schema$CreativeFieldValue]): Unit = js.native
  def get(params: ParamsDollarResourceDollarCreativefieldvaluesDollarGet): GaxiosPromise[Schema$CreativeFieldValue] = js.native
  def get(
    params: ParamsDollarResourceDollarCreativefieldvaluesDollarGet,
    callback: BodyResponseCallback[Schema$CreativeFieldValue]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarCreativefieldvaluesDollarGet,
    options: BodyResponseCallback[Schema$CreativeFieldValue],
    callback: BodyResponseCallback[Schema$CreativeFieldValue]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarCreativefieldvaluesDollarGet, options: MethodOptions): GaxiosPromise[Schema$CreativeFieldValue] = js.native
  def get(
    params: ParamsDollarResourceDollarCreativefieldvaluesDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$CreativeFieldValue]
  ): Unit = js.native
  /**
    * dfareporting.creativeFieldValues.insert
    * @desc Inserts a new creative field value.
    * @alias dfareporting.creativeFieldValues.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.creativeFieldId Creative field ID for this creative field value.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {().CreativeFieldValue} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[Schema$CreativeFieldValue] = js.native
  def insert(callback: BodyResponseCallback[Schema$CreativeFieldValue]): Unit = js.native
  def insert(params: ParamsDollarResourceDollarCreativefieldvaluesDollarInsert): GaxiosPromise[Schema$CreativeFieldValue] = js.native
  def insert(
    params: ParamsDollarResourceDollarCreativefieldvaluesDollarInsert,
    callback: BodyResponseCallback[Schema$CreativeFieldValue]
  ): Unit = js.native
  def insert(
    params: ParamsDollarResourceDollarCreativefieldvaluesDollarInsert,
    options: BodyResponseCallback[Schema$CreativeFieldValue],
    callback: BodyResponseCallback[Schema$CreativeFieldValue]
  ): Unit = js.native
  def insert(params: ParamsDollarResourceDollarCreativefieldvaluesDollarInsert, options: MethodOptions): GaxiosPromise[Schema$CreativeFieldValue] = js.native
  def insert(
    params: ParamsDollarResourceDollarCreativefieldvaluesDollarInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$CreativeFieldValue]
  ): Unit = js.native
  /**
    * dfareporting.creativeFieldValues.list
    * @desc Retrieves a list of creative field values, possibly filtered. This
    * method supports paging.
    * @alias dfareporting.creativeFieldValues.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.creativeFieldId Creative field ID for this creative field value.
    * @param {string=} params.ids Select only creative field values with these IDs.
    * @param {integer=} params.maxResults Maximum number of results to return.
    * @param {string=} params.pageToken Value of the nextPageToken from the previous result page.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {string=} params.searchString Allows searching for creative field values by their values. Wildcards (e.g. *) are not allowed.
    * @param {string=} params.sortField Field by which to sort the list.
    * @param {string=} params.sortOrder Order of sorted results.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$CreativeFieldValuesListResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$CreativeFieldValuesListResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarCreativefieldvaluesDollarList): GaxiosPromise[Schema$CreativeFieldValuesListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarCreativefieldvaluesDollarList,
    callback: BodyResponseCallback[Schema$CreativeFieldValuesListResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarCreativefieldvaluesDollarList,
    options: BodyResponseCallback[Schema$CreativeFieldValuesListResponse],
    callback: BodyResponseCallback[Schema$CreativeFieldValuesListResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarCreativefieldvaluesDollarList, options: MethodOptions): GaxiosPromise[Schema$CreativeFieldValuesListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarCreativefieldvaluesDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$CreativeFieldValuesListResponse]
  ): Unit = js.native
  /**
    * dfareporting.creativeFieldValues.patch
    * @desc Updates an existing creative field value. This method supports
    * patch semantics.
    * @alias dfareporting.creativeFieldValues.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.creativeFieldId Creative field ID for this creative field value.
    * @param {string} params.id Creative Field Value ID
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {().CreativeFieldValue} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[Schema$CreativeFieldValue] = js.native
  def patch(callback: BodyResponseCallback[Schema$CreativeFieldValue]): Unit = js.native
  def patch(params: ParamsDollarResourceDollarCreativefieldvaluesDollarPatch): GaxiosPromise[Schema$CreativeFieldValue] = js.native
  def patch(
    params: ParamsDollarResourceDollarCreativefieldvaluesDollarPatch,
    callback: BodyResponseCallback[Schema$CreativeFieldValue]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarCreativefieldvaluesDollarPatch,
    options: BodyResponseCallback[Schema$CreativeFieldValue],
    callback: BodyResponseCallback[Schema$CreativeFieldValue]
  ): Unit = js.native
  def patch(params: ParamsDollarResourceDollarCreativefieldvaluesDollarPatch, options: MethodOptions): GaxiosPromise[Schema$CreativeFieldValue] = js.native
  def patch(
    params: ParamsDollarResourceDollarCreativefieldvaluesDollarPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$CreativeFieldValue]
  ): Unit = js.native
  /**
    * dfareporting.creativeFieldValues.update
    * @desc Updates an existing creative field value.
    * @alias dfareporting.creativeFieldValues.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.creativeFieldId Creative field ID for this creative field value.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {().CreativeFieldValue} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[Schema$CreativeFieldValue] = js.native
  def update(callback: BodyResponseCallback[Schema$CreativeFieldValue]): Unit = js.native
  def update(params: ParamsDollarResourceDollarCreativefieldvaluesDollarUpdate): GaxiosPromise[Schema$CreativeFieldValue] = js.native
  def update(
    params: ParamsDollarResourceDollarCreativefieldvaluesDollarUpdate,
    callback: BodyResponseCallback[Schema$CreativeFieldValue]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarCreativefieldvaluesDollarUpdate,
    options: BodyResponseCallback[Schema$CreativeFieldValue],
    callback: BodyResponseCallback[Schema$CreativeFieldValue]
  ): Unit = js.native
  def update(params: ParamsDollarResourceDollarCreativefieldvaluesDollarUpdate, options: MethodOptions): GaxiosPromise[Schema$CreativeFieldValue] = js.native
  def update(
    params: ParamsDollarResourceDollarCreativefieldvaluesDollarUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$CreativeFieldValue]
  ): Unit = js.native
}

