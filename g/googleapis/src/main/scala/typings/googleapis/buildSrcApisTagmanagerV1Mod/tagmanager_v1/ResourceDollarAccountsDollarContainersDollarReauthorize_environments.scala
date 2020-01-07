package typings.googleapis.buildSrcApisTagmanagerV1Mod.tagmanager_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/tagmanager/v1", "tagmanager_v1.Resource$Accounts$Containers$Reauthorize_environments")
@js.native
class ResourceDollarAccountsDollarContainersDollarReauthorize_environments protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * tagmanager.accounts.containers.reauthorize_environments.update
    * @desc Re-generates the authorization code for a GTM Environment.
    * @alias tagmanager.accounts.containers.reauthorize_environments.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId The GTM Account ID.
    * @param {string} params.containerId The GTM Container ID.
    * @param {string} params.environmentId The GTM Environment ID.
    * @param {().Environment} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[Schema$Environment] = js.native
  def update(callback: BodyResponseCallback[Schema$Environment]): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarReauthorize_environmentsDollarUpdate
  ): GaxiosPromise[Schema$Environment] = js.native
  def update(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarReauthorize_environmentsDollarUpdate,
    callback: BodyResponseCallback[Schema$Environment]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarReauthorize_environmentsDollarUpdate,
    options: BodyResponseCallback[Schema$Environment],
    callback: BodyResponseCallback[Schema$Environment]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarReauthorize_environmentsDollarUpdate,
    options: MethodOptions
  ): GaxiosPromise[Schema$Environment] = js.native
  def update(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarReauthorize_environmentsDollarUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Environment]
  ): Unit = js.native
}

