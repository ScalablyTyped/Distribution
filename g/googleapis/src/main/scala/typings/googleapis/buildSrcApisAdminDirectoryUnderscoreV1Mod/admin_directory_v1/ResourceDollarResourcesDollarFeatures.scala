package typings.googleapis.buildSrcApisAdminDirectoryUnderscoreV1Mod.admin_directory_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/admin/directory_v1", "admin_directory_v1.Resource$Resources$Features")
@js.native
class ResourceDollarResourcesDollarFeatures protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * directory.resources.features.delete
    * @desc Deletes a feature.
    * @alias directory.resources.features.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.customer The unique ID for the customer's G Suite account. As an account administrator, you can also use the my_customer alias to represent your account's customer ID.
    * @param {string} params.featureKey The unique ID of the feature to delete.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarResourcesDollarFeaturesDollarDelete): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsDollarResourceDollarResourcesDollarFeaturesDollarDelete,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarResourcesDollarFeaturesDollarDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarResourcesDollarFeaturesDollarDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsDollarResourceDollarResourcesDollarFeaturesDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * directory.resources.features.get
    * @desc Retrieves a feature.
    * @alias directory.resources.features.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.customer The unique ID for the customer's G Suite account. As an account administrator, you can also use the my_customer alias to represent your account's customer ID.
    * @param {string} params.featureKey The unique ID of the feature to retrieve.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Feature] = js.native
  def get(callback: BodyResponseCallback[Schema$Feature]): Unit = js.native
  def get(params: ParamsDollarResourceDollarResourcesDollarFeaturesDollarGet): GaxiosPromise[Schema$Feature] = js.native
  def get(
    params: ParamsDollarResourceDollarResourcesDollarFeaturesDollarGet,
    callback: BodyResponseCallback[Schema$Feature]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarResourcesDollarFeaturesDollarGet,
    options: BodyResponseCallback[Schema$Feature],
    callback: BodyResponseCallback[Schema$Feature]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarResourcesDollarFeaturesDollarGet, options: MethodOptions): GaxiosPromise[Schema$Feature] = js.native
  def get(
    params: ParamsDollarResourceDollarResourcesDollarFeaturesDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Feature]
  ): Unit = js.native
  /**
    * directory.resources.features.insert
    * @desc Inserts a feature.
    * @alias directory.resources.features.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.customer The unique ID for the customer's G Suite account. As an account administrator, you can also use the my_customer alias to represent your account's customer ID.
    * @param {().Feature} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[Schema$Feature] = js.native
  def insert(callback: BodyResponseCallback[Schema$Feature]): Unit = js.native
  def insert(params: ParamsDollarResourceDollarResourcesDollarFeaturesDollarInsert): GaxiosPromise[Schema$Feature] = js.native
  def insert(
    params: ParamsDollarResourceDollarResourcesDollarFeaturesDollarInsert,
    callback: BodyResponseCallback[Schema$Feature]
  ): Unit = js.native
  def insert(
    params: ParamsDollarResourceDollarResourcesDollarFeaturesDollarInsert,
    options: BodyResponseCallback[Schema$Feature],
    callback: BodyResponseCallback[Schema$Feature]
  ): Unit = js.native
  def insert(params: ParamsDollarResourceDollarResourcesDollarFeaturesDollarInsert, options: MethodOptions): GaxiosPromise[Schema$Feature] = js.native
  def insert(
    params: ParamsDollarResourceDollarResourcesDollarFeaturesDollarInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Feature]
  ): Unit = js.native
  /**
    * directory.resources.features.list
    * @desc Retrieves a list of features for an account.
    * @alias directory.resources.features.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.customer The unique ID for the customer's G Suite account. As an account administrator, you can also use the my_customer alias to represent your account's customer ID.
    * @param {integer=} params.maxResults Maximum number of results to return.
    * @param {string=} params.pageToken Token to specify the next page in the list.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$Features] = js.native
  def list(callback: BodyResponseCallback[Schema$Features]): Unit = js.native
  def list(params: ParamsDollarResourceDollarResourcesDollarFeaturesDollarList): GaxiosPromise[Schema$Features] = js.native
  def list(
    params: ParamsDollarResourceDollarResourcesDollarFeaturesDollarList,
    callback: BodyResponseCallback[Schema$Features]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarResourcesDollarFeaturesDollarList,
    options: BodyResponseCallback[Schema$Features],
    callback: BodyResponseCallback[Schema$Features]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarResourcesDollarFeaturesDollarList, options: MethodOptions): GaxiosPromise[Schema$Features] = js.native
  def list(
    params: ParamsDollarResourceDollarResourcesDollarFeaturesDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Features]
  ): Unit = js.native
  /**
    * directory.resources.features.patch
    * @desc Updates a feature. This method supports patch semantics.
    * @alias directory.resources.features.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.customer The unique ID for the customer's G Suite account. As an account administrator, you can also use the my_customer alias to represent your account's customer ID.
    * @param {string} params.featureKey The unique ID of the feature to update.
    * @param {().Feature} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[Schema$Feature] = js.native
  def patch(callback: BodyResponseCallback[Schema$Feature]): Unit = js.native
  def patch(params: ParamsDollarResourceDollarResourcesDollarFeaturesDollarPatch): GaxiosPromise[Schema$Feature] = js.native
  def patch(
    params: ParamsDollarResourceDollarResourcesDollarFeaturesDollarPatch,
    callback: BodyResponseCallback[Schema$Feature]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarResourcesDollarFeaturesDollarPatch,
    options: BodyResponseCallback[Schema$Feature],
    callback: BodyResponseCallback[Schema$Feature]
  ): Unit = js.native
  def patch(params: ParamsDollarResourceDollarResourcesDollarFeaturesDollarPatch, options: MethodOptions): GaxiosPromise[Schema$Feature] = js.native
  def patch(
    params: ParamsDollarResourceDollarResourcesDollarFeaturesDollarPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Feature]
  ): Unit = js.native
  /**
    * directory.resources.features.rename
    * @desc Renames a feature.
    * @alias directory.resources.features.rename
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.customer The unique ID for the customer's G Suite account. As an account administrator, you can also use the my_customer alias to represent your account's customer ID.
    * @param {string} params.oldName The unique ID of the feature to rename.
    * @param {().FeatureRename} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def rename(): GaxiosPromise[Unit] = js.native
  def rename(callback: BodyResponseCallback[Unit]): Unit = js.native
  def rename(params: ParamsDollarResourceDollarResourcesDollarFeaturesDollarRename): GaxiosPromise[Unit] = js.native
  def rename(
    params: ParamsDollarResourceDollarResourcesDollarFeaturesDollarRename,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def rename(
    params: ParamsDollarResourceDollarResourcesDollarFeaturesDollarRename,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def rename(params: ParamsDollarResourceDollarResourcesDollarFeaturesDollarRename, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def rename(
    params: ParamsDollarResourceDollarResourcesDollarFeaturesDollarRename,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * directory.resources.features.update
    * @desc Updates a feature.
    * @alias directory.resources.features.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.customer The unique ID for the customer's G Suite account. As an account administrator, you can also use the my_customer alias to represent your account's customer ID.
    * @param {string} params.featureKey The unique ID of the feature to update.
    * @param {().Feature} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[Schema$Feature] = js.native
  def update(callback: BodyResponseCallback[Schema$Feature]): Unit = js.native
  def update(params: ParamsDollarResourceDollarResourcesDollarFeaturesDollarUpdate): GaxiosPromise[Schema$Feature] = js.native
  def update(
    params: ParamsDollarResourceDollarResourcesDollarFeaturesDollarUpdate,
    callback: BodyResponseCallback[Schema$Feature]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarResourcesDollarFeaturesDollarUpdate,
    options: BodyResponseCallback[Schema$Feature],
    callback: BodyResponseCallback[Schema$Feature]
  ): Unit = js.native
  def update(params: ParamsDollarResourceDollarResourcesDollarFeaturesDollarUpdate, options: MethodOptions): GaxiosPromise[Schema$Feature] = js.native
  def update(
    params: ParamsDollarResourceDollarResourcesDollarFeaturesDollarUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Feature]
  ): Unit = js.native
}

