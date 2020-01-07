package typings.googleapis.buildSrcApisAdexchangebuyerV1Dot4Mod.adexchangebuyer_v1_4

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/adexchangebuyer/v1.4", "adexchangebuyer_v1_4.Resource$Pretargetingconfig")
@js.native
class Resource$Pretargetingconfig protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * adexchangebuyer.pretargetingConfig.delete
    * @desc Deletes an existing pretargeting config.
    * @alias adexchangebuyer.pretargetingConfig.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId The account id to delete the pretargeting config for.
    * @param {string} params.configId The specific id of the configuration to delete.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarPretargetingconfigDollarDelete): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsDollarResourceDollarPretargetingconfigDollarDelete,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarPretargetingconfigDollarDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarPretargetingconfigDollarDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsDollarResourceDollarPretargetingconfigDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * adexchangebuyer.pretargetingConfig.get
    * @desc Gets a specific pretargeting configuration
    * @alias adexchangebuyer.pretargetingConfig.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId The account id to get the pretargeting config for.
    * @param {string} params.configId The specific id of the configuration to retrieve.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$PretargetingConfig] = js.native
  def get(callback: BodyResponseCallback[Schema$PretargetingConfig]): Unit = js.native
  def get(params: ParamsDollarResourceDollarPretargetingconfigDollarGet): GaxiosPromise[Schema$PretargetingConfig] = js.native
  def get(
    params: ParamsDollarResourceDollarPretargetingconfigDollarGet,
    callback: BodyResponseCallback[Schema$PretargetingConfig]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarPretargetingconfigDollarGet,
    options: BodyResponseCallback[Schema$PretargetingConfig],
    callback: BodyResponseCallback[Schema$PretargetingConfig]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarPretargetingconfigDollarGet, options: MethodOptions): GaxiosPromise[Schema$PretargetingConfig] = js.native
  def get(
    params: ParamsDollarResourceDollarPretargetingconfigDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$PretargetingConfig]
  ): Unit = js.native
  /**
    * adexchangebuyer.pretargetingConfig.insert
    * @desc Inserts a new pretargeting configuration.
    * @alias adexchangebuyer.pretargetingConfig.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId The account id to insert the pretargeting config for.
    * @param {().PretargetingConfig} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[Schema$PretargetingConfig] = js.native
  def insert(callback: BodyResponseCallback[Schema$PretargetingConfig]): Unit = js.native
  def insert(params: ParamsDollarResourceDollarPretargetingconfigDollarInsert): GaxiosPromise[Schema$PretargetingConfig] = js.native
  def insert(
    params: ParamsDollarResourceDollarPretargetingconfigDollarInsert,
    callback: BodyResponseCallback[Schema$PretargetingConfig]
  ): Unit = js.native
  def insert(
    params: ParamsDollarResourceDollarPretargetingconfigDollarInsert,
    options: BodyResponseCallback[Schema$PretargetingConfig],
    callback: BodyResponseCallback[Schema$PretargetingConfig]
  ): Unit = js.native
  def insert(params: ParamsDollarResourceDollarPretargetingconfigDollarInsert, options: MethodOptions): GaxiosPromise[Schema$PretargetingConfig] = js.native
  def insert(
    params: ParamsDollarResourceDollarPretargetingconfigDollarInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$PretargetingConfig]
  ): Unit = js.native
  /**
    * adexchangebuyer.pretargetingConfig.list
    * @desc Retrieves a list of the authenticated user's pretargeting
    * configurations.
    * @alias adexchangebuyer.pretargetingConfig.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId The account id to get the pretargeting configs for.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$PretargetingConfigList] = js.native
  def list(callback: BodyResponseCallback[Schema$PretargetingConfigList]): Unit = js.native
  def list(params: ParamsDollarResourceDollarPretargetingconfigDollarList): GaxiosPromise[Schema$PretargetingConfigList] = js.native
  def list(
    params: ParamsDollarResourceDollarPretargetingconfigDollarList,
    callback: BodyResponseCallback[Schema$PretargetingConfigList]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarPretargetingconfigDollarList,
    options: BodyResponseCallback[Schema$PretargetingConfigList],
    callback: BodyResponseCallback[Schema$PretargetingConfigList]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarPretargetingconfigDollarList, options: MethodOptions): GaxiosPromise[Schema$PretargetingConfigList] = js.native
  def list(
    params: ParamsDollarResourceDollarPretargetingconfigDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$PretargetingConfigList]
  ): Unit = js.native
  /**
    * adexchangebuyer.pretargetingConfig.patch
    * @desc Updates an existing pretargeting config. This method supports patch
    * semantics.
    * @alias adexchangebuyer.pretargetingConfig.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId The account id to update the pretargeting config for.
    * @param {string} params.configId The specific id of the configuration to update.
    * @param {().PretargetingConfig} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[Schema$PretargetingConfig] = js.native
  def patch(callback: BodyResponseCallback[Schema$PretargetingConfig]): Unit = js.native
  def patch(params: ParamsDollarResourceDollarPretargetingconfigDollarPatch): GaxiosPromise[Schema$PretargetingConfig] = js.native
  def patch(
    params: ParamsDollarResourceDollarPretargetingconfigDollarPatch,
    callback: BodyResponseCallback[Schema$PretargetingConfig]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarPretargetingconfigDollarPatch,
    options: BodyResponseCallback[Schema$PretargetingConfig],
    callback: BodyResponseCallback[Schema$PretargetingConfig]
  ): Unit = js.native
  def patch(params: ParamsDollarResourceDollarPretargetingconfigDollarPatch, options: MethodOptions): GaxiosPromise[Schema$PretargetingConfig] = js.native
  def patch(
    params: ParamsDollarResourceDollarPretargetingconfigDollarPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$PretargetingConfig]
  ): Unit = js.native
  /**
    * adexchangebuyer.pretargetingConfig.update
    * @desc Updates an existing pretargeting config.
    * @alias adexchangebuyer.pretargetingConfig.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId The account id to update the pretargeting config for.
    * @param {string} params.configId The specific id of the configuration to update.
    * @param {().PretargetingConfig} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[Schema$PretargetingConfig] = js.native
  def update(callback: BodyResponseCallback[Schema$PretargetingConfig]): Unit = js.native
  def update(params: ParamsDollarResourceDollarPretargetingconfigDollarUpdate): GaxiosPromise[Schema$PretargetingConfig] = js.native
  def update(
    params: ParamsDollarResourceDollarPretargetingconfigDollarUpdate,
    callback: BodyResponseCallback[Schema$PretargetingConfig]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarPretargetingconfigDollarUpdate,
    options: BodyResponseCallback[Schema$PretargetingConfig],
    callback: BodyResponseCallback[Schema$PretargetingConfig]
  ): Unit = js.native
  def update(params: ParamsDollarResourceDollarPretargetingconfigDollarUpdate, options: MethodOptions): GaxiosPromise[Schema$PretargetingConfig] = js.native
  def update(
    params: ParamsDollarResourceDollarPretargetingconfigDollarUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$PretargetingConfig]
  ): Unit = js.native
}

