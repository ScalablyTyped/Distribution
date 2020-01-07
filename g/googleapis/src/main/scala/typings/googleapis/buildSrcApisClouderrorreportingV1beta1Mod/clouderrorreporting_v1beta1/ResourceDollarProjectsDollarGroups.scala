package typings.googleapis.buildSrcApisClouderrorreportingV1beta1Mod.clouderrorreporting_v1beta1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/clouderrorreporting/v1beta1", "clouderrorreporting_v1beta1.Resource$Projects$Groups")
@js.native
class ResourceDollarProjectsDollarGroups protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * clouderrorreporting.projects.groups.get
    * @desc Get the specified group.
    * @alias clouderrorreporting.projects.groups.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.groupName [Required] The group resource name. Written as <code>projects/<var>projectID</var>/groups/<var>group_name</var></code>. Call <a href="/error-reporting/reference/rest/v1beta1/projects.groupStats/list"> <code>groupStats.list</code></a> to return a list of groups belonging to this project.  Example: <code>projects/my-project-123/groups/my-group</code>
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$ErrorGroup] = js.native
  def get(callback: BodyResponseCallback[Schema$ErrorGroup]): Unit = js.native
  def get(params: ParamsDollarResourceDollarProjectsDollarGroupsDollarGet): GaxiosPromise[Schema$ErrorGroup] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarGroupsDollarGet,
    callback: BodyResponseCallback[Schema$ErrorGroup]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarGroupsDollarGet,
    options: BodyResponseCallback[Schema$ErrorGroup],
    callback: BodyResponseCallback[Schema$ErrorGroup]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarProjectsDollarGroupsDollarGet, options: MethodOptions): GaxiosPromise[Schema$ErrorGroup] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarGroupsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ErrorGroup]
  ): Unit = js.native
  /**
    * clouderrorreporting.projects.groups.update
    * @desc Replace the data for the specified group. Fails if the group does
    * not exist.
    * @alias clouderrorreporting.projects.groups.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The group resource name. Example: <code>projects/my-project-123/groups/my-groupid</code>
    * @param {().ErrorGroup} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[Schema$ErrorGroup] = js.native
  def update(callback: BodyResponseCallback[Schema$ErrorGroup]): Unit = js.native
  def update(params: ParamsDollarResourceDollarProjectsDollarGroupsDollarUpdate): GaxiosPromise[Schema$ErrorGroup] = js.native
  def update(
    params: ParamsDollarResourceDollarProjectsDollarGroupsDollarUpdate,
    callback: BodyResponseCallback[Schema$ErrorGroup]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarProjectsDollarGroupsDollarUpdate,
    options: BodyResponseCallback[Schema$ErrorGroup],
    callback: BodyResponseCallback[Schema$ErrorGroup]
  ): Unit = js.native
  def update(params: ParamsDollarResourceDollarProjectsDollarGroupsDollarUpdate, options: MethodOptions): GaxiosPromise[Schema$ErrorGroup] = js.native
  def update(
    params: ParamsDollarResourceDollarProjectsDollarGroupsDollarUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ErrorGroup]
  ): Unit = js.native
}

