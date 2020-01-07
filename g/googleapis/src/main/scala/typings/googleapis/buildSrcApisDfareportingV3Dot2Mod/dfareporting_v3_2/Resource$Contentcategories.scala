package typings.googleapis.buildSrcApisDfareportingV3Dot2Mod.dfareporting_v3_2

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/dfareporting/v3.2", "dfareporting_v3_2.Resource$Contentcategories")
@js.native
class Resource$Contentcategories protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * dfareporting.contentCategories.delete
    * @desc Deletes an existing content category.
    * @alias dfareporting.contentCategories.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id Content category ID.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarContentcategoriesDollarDelete): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsDollarResourceDollarContentcategoriesDollarDelete,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarContentcategoriesDollarDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarContentcategoriesDollarDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsDollarResourceDollarContentcategoriesDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * dfareporting.contentCategories.get
    * @desc Gets one content category by ID.
    * @alias dfareporting.contentCategories.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id Content category ID.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$ContentCategory] = js.native
  def get(callback: BodyResponseCallback[Schema$ContentCategory]): Unit = js.native
  def get(params: ParamsDollarResourceDollarContentcategoriesDollarGet): GaxiosPromise[Schema$ContentCategory] = js.native
  def get(
    params: ParamsDollarResourceDollarContentcategoriesDollarGet,
    callback: BodyResponseCallback[Schema$ContentCategory]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarContentcategoriesDollarGet,
    options: BodyResponseCallback[Schema$ContentCategory],
    callback: BodyResponseCallback[Schema$ContentCategory]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarContentcategoriesDollarGet, options: MethodOptions): GaxiosPromise[Schema$ContentCategory] = js.native
  def get(
    params: ParamsDollarResourceDollarContentcategoriesDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ContentCategory]
  ): Unit = js.native
  /**
    * dfareporting.contentCategories.insert
    * @desc Inserts a new content category.
    * @alias dfareporting.contentCategories.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {().ContentCategory} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[Schema$ContentCategory] = js.native
  def insert(callback: BodyResponseCallback[Schema$ContentCategory]): Unit = js.native
  def insert(params: ParamsDollarResourceDollarContentcategoriesDollarInsert): GaxiosPromise[Schema$ContentCategory] = js.native
  def insert(
    params: ParamsDollarResourceDollarContentcategoriesDollarInsert,
    callback: BodyResponseCallback[Schema$ContentCategory]
  ): Unit = js.native
  def insert(
    params: ParamsDollarResourceDollarContentcategoriesDollarInsert,
    options: BodyResponseCallback[Schema$ContentCategory],
    callback: BodyResponseCallback[Schema$ContentCategory]
  ): Unit = js.native
  def insert(params: ParamsDollarResourceDollarContentcategoriesDollarInsert, options: MethodOptions): GaxiosPromise[Schema$ContentCategory] = js.native
  def insert(
    params: ParamsDollarResourceDollarContentcategoriesDollarInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ContentCategory]
  ): Unit = js.native
  /**
    * dfareporting.contentCategories.list
    * @desc Retrieves a list of content categories, possibly filtered. This
    * method supports paging.
    * @alias dfareporting.contentCategories.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.ids Select only content categories with these IDs.
    * @param {integer=} params.maxResults Maximum number of results to return.
    * @param {string=} params.pageToken Value of the nextPageToken from the previous result page.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {string=} params.searchString Allows searching for objects by name or ID. Wildcards (*) are allowed. For example, "contentcategory*2015" will return objects with names like "contentcategory June 2015", "contentcategory April 2015", or simply "contentcategory 2015". Most of the searches also add wildcards implicitly at the start and the end of the search string. For example, a search string of "contentcategory" will match objects with name "my contentcategory", "contentcategory 2015", or simply "contentcategory".
    * @param {string=} params.sortField Field by which to sort the list.
    * @param {string=} params.sortOrder Order of sorted results.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ContentCategoriesListResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ContentCategoriesListResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarContentcategoriesDollarList): GaxiosPromise[Schema$ContentCategoriesListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarContentcategoriesDollarList,
    callback: BodyResponseCallback[Schema$ContentCategoriesListResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarContentcategoriesDollarList,
    options: BodyResponseCallback[Schema$ContentCategoriesListResponse],
    callback: BodyResponseCallback[Schema$ContentCategoriesListResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarContentcategoriesDollarList, options: MethodOptions): GaxiosPromise[Schema$ContentCategoriesListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarContentcategoriesDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ContentCategoriesListResponse]
  ): Unit = js.native
  /**
    * dfareporting.contentCategories.patch
    * @desc Updates an existing content category. This method supports patch
    * semantics.
    * @alias dfareporting.contentCategories.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id Content category ID.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {().ContentCategory} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[Schema$ContentCategory] = js.native
  def patch(callback: BodyResponseCallback[Schema$ContentCategory]): Unit = js.native
  def patch(params: ParamsDollarResourceDollarContentcategoriesDollarPatch): GaxiosPromise[Schema$ContentCategory] = js.native
  def patch(
    params: ParamsDollarResourceDollarContentcategoriesDollarPatch,
    callback: BodyResponseCallback[Schema$ContentCategory]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarContentcategoriesDollarPatch,
    options: BodyResponseCallback[Schema$ContentCategory],
    callback: BodyResponseCallback[Schema$ContentCategory]
  ): Unit = js.native
  def patch(params: ParamsDollarResourceDollarContentcategoriesDollarPatch, options: MethodOptions): GaxiosPromise[Schema$ContentCategory] = js.native
  def patch(
    params: ParamsDollarResourceDollarContentcategoriesDollarPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ContentCategory]
  ): Unit = js.native
  /**
    * dfareporting.contentCategories.update
    * @desc Updates an existing content category.
    * @alias dfareporting.contentCategories.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {().ContentCategory} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[Schema$ContentCategory] = js.native
  def update(callback: BodyResponseCallback[Schema$ContentCategory]): Unit = js.native
  def update(params: ParamsDollarResourceDollarContentcategoriesDollarUpdate): GaxiosPromise[Schema$ContentCategory] = js.native
  def update(
    params: ParamsDollarResourceDollarContentcategoriesDollarUpdate,
    callback: BodyResponseCallback[Schema$ContentCategory]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarContentcategoriesDollarUpdate,
    options: BodyResponseCallback[Schema$ContentCategory],
    callback: BodyResponseCallback[Schema$ContentCategory]
  ): Unit = js.native
  def update(params: ParamsDollarResourceDollarContentcategoriesDollarUpdate, options: MethodOptions): GaxiosPromise[Schema$ContentCategory] = js.native
  def update(
    params: ParamsDollarResourceDollarContentcategoriesDollarUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ContentCategory]
  ): Unit = js.native
}

