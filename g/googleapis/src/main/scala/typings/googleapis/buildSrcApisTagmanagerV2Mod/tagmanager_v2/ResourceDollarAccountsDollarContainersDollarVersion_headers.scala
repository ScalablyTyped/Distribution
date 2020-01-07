package typings.googleapis.buildSrcApisTagmanagerV2Mod.tagmanager_v2

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/tagmanager/v2", "tagmanager_v2.Resource$Accounts$Containers$Version_headers")
@js.native
class ResourceDollarAccountsDollarContainersDollarVersion_headers protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * tagmanager.accounts.containers.version_headers.latest
    * @desc Gets the latest container version header
    * @alias tagmanager.accounts.containers.version_headers.latest
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent GTM Container's API relative path. Example: accounts/{account_id}/containers/{container_id}
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def latest(): GaxiosPromise[Schema$ContainerVersionHeader] = js.native
  def latest(callback: BodyResponseCallback[Schema$ContainerVersionHeader]): Unit = js.native
  def latest(params: ParamsDollarResourceDollarAccountsDollarContainersDollarVersion_headersDollarLatest): GaxiosPromise[Schema$ContainerVersionHeader] = js.native
  def latest(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarVersion_headersDollarLatest,
    callback: BodyResponseCallback[Schema$ContainerVersionHeader]
  ): Unit = js.native
  def latest(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarVersion_headersDollarLatest,
    options: BodyResponseCallback[Schema$ContainerVersionHeader],
    callback: BodyResponseCallback[Schema$ContainerVersionHeader]
  ): Unit = js.native
  def latest(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarVersion_headersDollarLatest,
    options: MethodOptions
  ): GaxiosPromise[Schema$ContainerVersionHeader] = js.native
  def latest(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarVersion_headersDollarLatest,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ContainerVersionHeader]
  ): Unit = js.native
  /**
    * tagmanager.accounts.containers.version_headers.list
    * @desc Lists all Container Versions of a GTM Container.
    * @alias tagmanager.accounts.containers.version_headers.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {boolean=} params.includeDeleted Also retrieve deleted (archived) versions when true.
    * @param {string=} params.pageToken Continuation token for fetching the next page of results.
    * @param {string} params.parent GTM Container's API relative path. Example: accounts/{account_id}/containers/{container_id}
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ListContainerVersionsResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListContainerVersionsResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarAccountsDollarContainersDollarVersion_headersDollarList): GaxiosPromise[Schema$ListContainerVersionsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarVersion_headersDollarList,
    callback: BodyResponseCallback[Schema$ListContainerVersionsResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarVersion_headersDollarList,
    options: BodyResponseCallback[Schema$ListContainerVersionsResponse],
    callback: BodyResponseCallback[Schema$ListContainerVersionsResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarVersion_headersDollarList,
    options: MethodOptions
  ): GaxiosPromise[Schema$ListContainerVersionsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarVersion_headersDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListContainerVersionsResponse]
  ): Unit = js.native
}

