package typings.googleapis.buildSrcApisTagmanagerV1Mod.tagmanager_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/tagmanager/v1", "tagmanager_v1.Resource$Accounts$Containers$Versions")
@js.native
class ResourceDollarAccountsDollarContainersDollarVersions protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * tagmanager.accounts.containers.versions.create
    * @desc Creates a Container Version.
    * @alias tagmanager.accounts.containers.versions.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId The GTM Account ID.
    * @param {string} params.containerId The GTM Container ID.
    * @param {().CreateContainerVersionRequestVersionOptions} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[Schema$CreateContainerVersionResponse] = js.native
  def create(callback: BodyResponseCallback[Schema$CreateContainerVersionResponse]): Unit = js.native
  def create(params: ParamsDollarResourceDollarAccountsDollarContainersDollarVersionsDollarCreate): GaxiosPromise[Schema$CreateContainerVersionResponse] = js.native
  def create(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarVersionsDollarCreate,
    callback: BodyResponseCallback[Schema$CreateContainerVersionResponse]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarVersionsDollarCreate,
    options: BodyResponseCallback[Schema$CreateContainerVersionResponse],
    callback: BodyResponseCallback[Schema$CreateContainerVersionResponse]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarVersionsDollarCreate,
    options: MethodOptions
  ): GaxiosPromise[Schema$CreateContainerVersionResponse] = js.native
  def create(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarVersionsDollarCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$CreateContainerVersionResponse]
  ): Unit = js.native
  /**
    * tagmanager.accounts.containers.versions.delete
    * @desc Deletes a Container Version.
    * @alias tagmanager.accounts.containers.versions.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId The GTM Account ID.
    * @param {string} params.containerId The GTM Container ID.
    * @param {string} params.containerVersionId The GTM Container Version ID.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarAccountsDollarContainersDollarVersionsDollarDelete): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarVersionsDollarDelete,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarVersionsDollarDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarVersionsDollarDelete,
    options: MethodOptions
  ): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarVersionsDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * tagmanager.accounts.containers.versions.get
    * @desc Gets a Container Version.
    * @alias tagmanager.accounts.containers.versions.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId The GTM Account ID.
    * @param {string} params.containerId The GTM Container ID.
    * @param {string} params.containerVersionId The GTM Container Version ID. Specify published to retrieve the currently published version.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$ContainerVersion] = js.native
  def get(callback: BodyResponseCallback[Schema$ContainerVersion]): Unit = js.native
  def get(params: ParamsDollarResourceDollarAccountsDollarContainersDollarVersionsDollarGet): GaxiosPromise[Schema$ContainerVersion] = js.native
  def get(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarVersionsDollarGet,
    callback: BodyResponseCallback[Schema$ContainerVersion]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarVersionsDollarGet,
    options: BodyResponseCallback[Schema$ContainerVersion],
    callback: BodyResponseCallback[Schema$ContainerVersion]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarVersionsDollarGet,
    options: MethodOptions
  ): GaxiosPromise[Schema$ContainerVersion] = js.native
  def get(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarVersionsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ContainerVersion]
  ): Unit = js.native
  /**
    * tagmanager.accounts.containers.versions.list
    * @desc Lists all Container Versions of a GTM Container.
    * @alias tagmanager.accounts.containers.versions.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId The GTM Account ID.
    * @param {string} params.containerId The GTM Container ID.
    * @param {boolean=} params.headers Retrieve headers only when true.
    * @param {boolean=} params.includeDeleted Also retrieve deleted (archived) versions when true.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ListContainerVersionsResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListContainerVersionsResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarAccountsDollarContainersDollarVersionsDollarList): GaxiosPromise[Schema$ListContainerVersionsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarVersionsDollarList,
    callback: BodyResponseCallback[Schema$ListContainerVersionsResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarVersionsDollarList,
    options: BodyResponseCallback[Schema$ListContainerVersionsResponse],
    callback: BodyResponseCallback[Schema$ListContainerVersionsResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarVersionsDollarList,
    options: MethodOptions
  ): GaxiosPromise[Schema$ListContainerVersionsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarVersionsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListContainerVersionsResponse]
  ): Unit = js.native
  /**
    * tagmanager.accounts.containers.versions.publish
    * @desc Publishes a Container Version.
    * @alias tagmanager.accounts.containers.versions.publish
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId The GTM Account ID.
    * @param {string} params.containerId The GTM Container ID.
    * @param {string} params.containerVersionId The GTM Container Version ID.
    * @param {string=} params.fingerprint When provided, this fingerprint must match the fingerprint of the container version in storage.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def publish(): GaxiosPromise[Schema$PublishContainerVersionResponse] = js.native
  def publish(callback: BodyResponseCallback[Schema$PublishContainerVersionResponse]): Unit = js.native
  def publish(params: ParamsDollarResourceDollarAccountsDollarContainersDollarVersionsDollarPublish): GaxiosPromise[Schema$PublishContainerVersionResponse] = js.native
  def publish(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarVersionsDollarPublish,
    callback: BodyResponseCallback[Schema$PublishContainerVersionResponse]
  ): Unit = js.native
  def publish(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarVersionsDollarPublish,
    options: BodyResponseCallback[Schema$PublishContainerVersionResponse],
    callback: BodyResponseCallback[Schema$PublishContainerVersionResponse]
  ): Unit = js.native
  def publish(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarVersionsDollarPublish,
    options: MethodOptions
  ): GaxiosPromise[Schema$PublishContainerVersionResponse] = js.native
  def publish(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarVersionsDollarPublish,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$PublishContainerVersionResponse]
  ): Unit = js.native
  /**
    * tagmanager.accounts.containers.versions.restore
    * @desc Restores a Container Version. This will overwrite the container's
    * current configuration (including its variables, triggers and tags). The
    * operation will not have any effect on the version that is being served
    * (i.e. the published version).
    * @alias tagmanager.accounts.containers.versions.restore
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId The GTM Account ID.
    * @param {string} params.containerId The GTM Container ID.
    * @param {string} params.containerVersionId The GTM Container Version ID.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def restore(): GaxiosPromise[Schema$ContainerVersion] = js.native
  def restore(callback: BodyResponseCallback[Schema$ContainerVersion]): Unit = js.native
  def restore(params: ParamsDollarResourceDollarAccountsDollarContainersDollarVersionsDollarRestore): GaxiosPromise[Schema$ContainerVersion] = js.native
  def restore(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarVersionsDollarRestore,
    callback: BodyResponseCallback[Schema$ContainerVersion]
  ): Unit = js.native
  def restore(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarVersionsDollarRestore,
    options: BodyResponseCallback[Schema$ContainerVersion],
    callback: BodyResponseCallback[Schema$ContainerVersion]
  ): Unit = js.native
  def restore(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarVersionsDollarRestore,
    options: MethodOptions
  ): GaxiosPromise[Schema$ContainerVersion] = js.native
  def restore(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarVersionsDollarRestore,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ContainerVersion]
  ): Unit = js.native
  /**
    * tagmanager.accounts.containers.versions.undelete
    * @desc Undeletes a Container Version.
    * @alias tagmanager.accounts.containers.versions.undelete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId The GTM Account ID.
    * @param {string} params.containerId The GTM Container ID.
    * @param {string} params.containerVersionId The GTM Container Version ID.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def undelete(): GaxiosPromise[Schema$ContainerVersion] = js.native
  def undelete(callback: BodyResponseCallback[Schema$ContainerVersion]): Unit = js.native
  def undelete(params: ParamsDollarResourceDollarAccountsDollarContainersDollarVersionsDollarUndelete): GaxiosPromise[Schema$ContainerVersion] = js.native
  def undelete(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarVersionsDollarUndelete,
    callback: BodyResponseCallback[Schema$ContainerVersion]
  ): Unit = js.native
  def undelete(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarVersionsDollarUndelete,
    options: BodyResponseCallback[Schema$ContainerVersion],
    callback: BodyResponseCallback[Schema$ContainerVersion]
  ): Unit = js.native
  def undelete(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarVersionsDollarUndelete,
    options: MethodOptions
  ): GaxiosPromise[Schema$ContainerVersion] = js.native
  def undelete(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarVersionsDollarUndelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ContainerVersion]
  ): Unit = js.native
  /**
    * tagmanager.accounts.containers.versions.update
    * @desc Updates a Container Version.
    * @alias tagmanager.accounts.containers.versions.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId The GTM Account ID.
    * @param {string} params.containerId The GTM Container ID.
    * @param {string} params.containerVersionId The GTM Container Version ID.
    * @param {string=} params.fingerprint When provided, this fingerprint must match the fingerprint of the container version in storage.
    * @param {().ContainerVersion} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[Schema$ContainerVersion] = js.native
  def update(callback: BodyResponseCallback[Schema$ContainerVersion]): Unit = js.native
  def update(params: ParamsDollarResourceDollarAccountsDollarContainersDollarVersionsDollarUpdate): GaxiosPromise[Schema$ContainerVersion] = js.native
  def update(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarVersionsDollarUpdate,
    callback: BodyResponseCallback[Schema$ContainerVersion]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarVersionsDollarUpdate,
    options: BodyResponseCallback[Schema$ContainerVersion],
    callback: BodyResponseCallback[Schema$ContainerVersion]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarVersionsDollarUpdate,
    options: MethodOptions
  ): GaxiosPromise[Schema$ContainerVersion] = js.native
  def update(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarVersionsDollarUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ContainerVersion]
  ): Unit = js.native
}

