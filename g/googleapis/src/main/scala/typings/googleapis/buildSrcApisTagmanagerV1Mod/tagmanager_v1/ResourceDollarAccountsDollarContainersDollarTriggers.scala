package typings.googleapis.buildSrcApisTagmanagerV1Mod.tagmanager_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/tagmanager/v1", "tagmanager_v1.Resource$Accounts$Containers$Triggers")
@js.native
class ResourceDollarAccountsDollarContainersDollarTriggers protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * tagmanager.accounts.containers.triggers.create
    * @desc Creates a GTM Trigger.
    * @alias tagmanager.accounts.containers.triggers.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId The GTM Account ID.
    * @param {string} params.containerId The GTM Container ID.
    * @param {().Trigger} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[Schema$Trigger] = js.native
  def create(callback: BodyResponseCallback[Schema$Trigger]): Unit = js.native
  def create(params: ParamsDollarResourceDollarAccountsDollarContainersDollarTriggersDollarCreate): GaxiosPromise[Schema$Trigger] = js.native
  def create(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarTriggersDollarCreate,
    callback: BodyResponseCallback[Schema$Trigger]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarTriggersDollarCreate,
    options: BodyResponseCallback[Schema$Trigger],
    callback: BodyResponseCallback[Schema$Trigger]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarTriggersDollarCreate,
    options: MethodOptions
  ): GaxiosPromise[Schema$Trigger] = js.native
  def create(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarTriggersDollarCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Trigger]
  ): Unit = js.native
  /**
    * tagmanager.accounts.containers.triggers.delete
    * @desc Deletes a GTM Trigger.
    * @alias tagmanager.accounts.containers.triggers.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId The GTM Account ID.
    * @param {string} params.containerId The GTM Container ID.
    * @param {string} params.triggerId The GTM Trigger ID.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarAccountsDollarContainersDollarTriggersDollarDelete): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarTriggersDollarDelete,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarTriggersDollarDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarTriggersDollarDelete,
    options: MethodOptions
  ): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarTriggersDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * tagmanager.accounts.containers.triggers.get
    * @desc Gets a GTM Trigger.
    * @alias tagmanager.accounts.containers.triggers.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId The GTM Account ID.
    * @param {string} params.containerId The GTM Container ID.
    * @param {string} params.triggerId The GTM Trigger ID.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Trigger] = js.native
  def get(callback: BodyResponseCallback[Schema$Trigger]): Unit = js.native
  def get(params: ParamsDollarResourceDollarAccountsDollarContainersDollarTriggersDollarGet): GaxiosPromise[Schema$Trigger] = js.native
  def get(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarTriggersDollarGet,
    callback: BodyResponseCallback[Schema$Trigger]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarTriggersDollarGet,
    options: BodyResponseCallback[Schema$Trigger],
    callback: BodyResponseCallback[Schema$Trigger]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarTriggersDollarGet,
    options: MethodOptions
  ): GaxiosPromise[Schema$Trigger] = js.native
  def get(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarTriggersDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Trigger]
  ): Unit = js.native
  /**
    * tagmanager.accounts.containers.triggers.list
    * @desc Lists all GTM Triggers of a Container.
    * @alias tagmanager.accounts.containers.triggers.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId The GTM Account ID.
    * @param {string} params.containerId The GTM Container ID.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ListTriggersResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListTriggersResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarAccountsDollarContainersDollarTriggersDollarList): GaxiosPromise[Schema$ListTriggersResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarTriggersDollarList,
    callback: BodyResponseCallback[Schema$ListTriggersResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarTriggersDollarList,
    options: BodyResponseCallback[Schema$ListTriggersResponse],
    callback: BodyResponseCallback[Schema$ListTriggersResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarTriggersDollarList,
    options: MethodOptions
  ): GaxiosPromise[Schema$ListTriggersResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarTriggersDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListTriggersResponse]
  ): Unit = js.native
  /**
    * tagmanager.accounts.containers.triggers.update
    * @desc Updates a GTM Trigger.
    * @alias tagmanager.accounts.containers.triggers.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId The GTM Account ID.
    * @param {string} params.containerId The GTM Container ID.
    * @param {string=} params.fingerprint When provided, this fingerprint must match the fingerprint of the trigger in storage.
    * @param {string} params.triggerId The GTM Trigger ID.
    * @param {().Trigger} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[Schema$Trigger] = js.native
  def update(callback: BodyResponseCallback[Schema$Trigger]): Unit = js.native
  def update(params: ParamsDollarResourceDollarAccountsDollarContainersDollarTriggersDollarUpdate): GaxiosPromise[Schema$Trigger] = js.native
  def update(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarTriggersDollarUpdate,
    callback: BodyResponseCallback[Schema$Trigger]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarTriggersDollarUpdate,
    options: BodyResponseCallback[Schema$Trigger],
    callback: BodyResponseCallback[Schema$Trigger]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarTriggersDollarUpdate,
    options: MethodOptions
  ): GaxiosPromise[Schema$Trigger] = js.native
  def update(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarTriggersDollarUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Trigger]
  ): Unit = js.native
}

