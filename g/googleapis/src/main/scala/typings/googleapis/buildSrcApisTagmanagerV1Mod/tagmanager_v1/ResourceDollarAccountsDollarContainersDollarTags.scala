package typings.googleapis.buildSrcApisTagmanagerV1Mod.tagmanager_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/tagmanager/v1", "tagmanager_v1.Resource$Accounts$Containers$Tags")
@js.native
class ResourceDollarAccountsDollarContainersDollarTags protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * tagmanager.accounts.containers.tags.create
    * @desc Creates a GTM Tag.
    * @alias tagmanager.accounts.containers.tags.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId The GTM Account ID.
    * @param {string} params.containerId The GTM Container ID.
    * @param {().Tag} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[Schema$Tag] = js.native
  def create(callback: BodyResponseCallback[Schema$Tag]): Unit = js.native
  def create(params: ParamsDollarResourceDollarAccountsDollarContainersDollarTagsDollarCreate): GaxiosPromise[Schema$Tag] = js.native
  def create(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarTagsDollarCreate,
    callback: BodyResponseCallback[Schema$Tag]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarTagsDollarCreate,
    options: BodyResponseCallback[Schema$Tag],
    callback: BodyResponseCallback[Schema$Tag]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarTagsDollarCreate,
    options: MethodOptions
  ): GaxiosPromise[Schema$Tag] = js.native
  def create(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarTagsDollarCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Tag]
  ): Unit = js.native
  /**
    * tagmanager.accounts.containers.tags.delete
    * @desc Deletes a GTM Tag.
    * @alias tagmanager.accounts.containers.tags.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId The GTM Account ID.
    * @param {string} params.containerId The GTM Container ID.
    * @param {string} params.tagId The GTM Tag ID.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarAccountsDollarContainersDollarTagsDollarDelete): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarTagsDollarDelete,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarTagsDollarDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarTagsDollarDelete,
    options: MethodOptions
  ): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarTagsDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * tagmanager.accounts.containers.tags.get
    * @desc Gets a GTM Tag.
    * @alias tagmanager.accounts.containers.tags.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId The GTM Account ID.
    * @param {string} params.containerId The GTM Container ID.
    * @param {string} params.tagId The GTM Tag ID.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Tag] = js.native
  def get(callback: BodyResponseCallback[Schema$Tag]): Unit = js.native
  def get(params: ParamsDollarResourceDollarAccountsDollarContainersDollarTagsDollarGet): GaxiosPromise[Schema$Tag] = js.native
  def get(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarTagsDollarGet,
    callback: BodyResponseCallback[Schema$Tag]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarTagsDollarGet,
    options: BodyResponseCallback[Schema$Tag],
    callback: BodyResponseCallback[Schema$Tag]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarTagsDollarGet,
    options: MethodOptions
  ): GaxiosPromise[Schema$Tag] = js.native
  def get(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarTagsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Tag]
  ): Unit = js.native
  /**
    * tagmanager.accounts.containers.tags.list
    * @desc Lists all GTM Tags of a Container.
    * @alias tagmanager.accounts.containers.tags.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId The GTM Account ID.
    * @param {string} params.containerId The GTM Container ID.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ListTagsResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListTagsResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarAccountsDollarContainersDollarTagsDollarList): GaxiosPromise[Schema$ListTagsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarTagsDollarList,
    callback: BodyResponseCallback[Schema$ListTagsResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarTagsDollarList,
    options: BodyResponseCallback[Schema$ListTagsResponse],
    callback: BodyResponseCallback[Schema$ListTagsResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarTagsDollarList,
    options: MethodOptions
  ): GaxiosPromise[Schema$ListTagsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarTagsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListTagsResponse]
  ): Unit = js.native
  /**
    * tagmanager.accounts.containers.tags.update
    * @desc Updates a GTM Tag.
    * @alias tagmanager.accounts.containers.tags.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId The GTM Account ID.
    * @param {string} params.containerId The GTM Container ID.
    * @param {string=} params.fingerprint When provided, this fingerprint must match the fingerprint of the tag in storage.
    * @param {string} params.tagId The GTM Tag ID.
    * @param {().Tag} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[Schema$Tag] = js.native
  def update(callback: BodyResponseCallback[Schema$Tag]): Unit = js.native
  def update(params: ParamsDollarResourceDollarAccountsDollarContainersDollarTagsDollarUpdate): GaxiosPromise[Schema$Tag] = js.native
  def update(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarTagsDollarUpdate,
    callback: BodyResponseCallback[Schema$Tag]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarTagsDollarUpdate,
    options: BodyResponseCallback[Schema$Tag],
    callback: BodyResponseCallback[Schema$Tag]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarTagsDollarUpdate,
    options: MethodOptions
  ): GaxiosPromise[Schema$Tag] = js.native
  def update(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarTagsDollarUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Tag]
  ): Unit = js.native
}

