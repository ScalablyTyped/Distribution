package typings.googleapis.buildSrcApisTagmanagerV2Mod.tagmanager_v2

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/tagmanager/v2", "tagmanager_v2.Resource$Accounts$Containers$Versions")
@js.native
class ResourceDollarAccountsDollarContainersDollarVersions protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * tagmanager.accounts.containers.versions.delete
    * @desc Deletes a Container Version.
    * @alias tagmanager.accounts.containers.versions.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.path GTM ContainerVersion's API relative path. Example: accounts/{account_id}/containers/{container_id}/versions/{version_id}
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
    * @param {string=} params.containerVersionId The GTM ContainerVersion ID. Specify published to retrieve the currently published version.
    * @param {string} params.path GTM ContainerVersion's API relative path. Example: accounts/{account_id}/containers/{container_id}/versions/{version_id}
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
    * tagmanager.accounts.containers.versions.live
    * @desc Gets the live (i.e. published) container version
    * @alias tagmanager.accounts.containers.versions.live
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent GTM Container's API relative path. Example: accounts/{account_id}/containers/{container_id}
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def live(): GaxiosPromise[Schema$ContainerVersion] = js.native
  def live(callback: BodyResponseCallback[Schema$ContainerVersion]): Unit = js.native
  def live(params: ParamsDollarResourceDollarAccountsDollarContainersDollarVersionsDollarLive): GaxiosPromise[Schema$ContainerVersion] = js.native
  def live(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarVersionsDollarLive,
    callback: BodyResponseCallback[Schema$ContainerVersion]
  ): Unit = js.native
  def live(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarVersionsDollarLive,
    options: BodyResponseCallback[Schema$ContainerVersion],
    callback: BodyResponseCallback[Schema$ContainerVersion]
  ): Unit = js.native
  def live(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarVersionsDollarLive,
    options: MethodOptions
  ): GaxiosPromise[Schema$ContainerVersion] = js.native
  def live(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarVersionsDollarLive,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ContainerVersion]
  ): Unit = js.native
  /**
    * tagmanager.accounts.containers.versions.publish
    * @desc Publishes a Container Version.
    * @alias tagmanager.accounts.containers.versions.publish
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.fingerprint When provided, this fingerprint must match the fingerprint of the container version in storage.
    * @param {string} params.path GTM ContainerVersion's API relative path. Example: accounts/{account_id}/containers/{container_id}/versions/{version_id}
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
    * tagmanager.accounts.containers.versions.set_latest
    * @desc Sets the latest version used for synchronization of workspaces when
    * detecting conflicts and errors.
    * @alias tagmanager.accounts.containers.versions.set_latest
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.path GTM ContainerVersion's API relative path. Example: accounts/{account_id}/containers/{container_id}/versions/{version_id}
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def set_latest(): GaxiosPromise[Schema$ContainerVersion] = js.native
  def set_latest(callback: BodyResponseCallback[Schema$ContainerVersion]): Unit = js.native
  def set_latest(params: ParamsDollarResourceDollarAccountsDollarContainersDollarVersionsDollarSet_latest): GaxiosPromise[Schema$ContainerVersion] = js.native
  def set_latest(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarVersionsDollarSet_latest,
    callback: BodyResponseCallback[Schema$ContainerVersion]
  ): Unit = js.native
  def set_latest(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarVersionsDollarSet_latest,
    options: BodyResponseCallback[Schema$ContainerVersion],
    callback: BodyResponseCallback[Schema$ContainerVersion]
  ): Unit = js.native
  def set_latest(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarVersionsDollarSet_latest,
    options: MethodOptions
  ): GaxiosPromise[Schema$ContainerVersion] = js.native
  def set_latest(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarVersionsDollarSet_latest,
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
    * @param {string} params.path GTM ContainerVersion's API relative path. Example: accounts/{account_id}/containers/{container_id}/versions/{version_id}
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
    * @param {string=} params.fingerprint When provided, this fingerprint must match the fingerprint of the container version in storage.
    * @param {string} params.path GTM ContainerVersion's API relative path. Example: accounts/{account_id}/containers/{container_id}/versions/{version_id}
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

