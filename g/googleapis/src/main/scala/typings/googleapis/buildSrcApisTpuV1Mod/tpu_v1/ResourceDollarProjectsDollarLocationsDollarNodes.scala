package typings.googleapis.buildSrcApisTpuV1Mod.tpu_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/tpu/v1", "tpu_v1.Resource$Projects$Locations$Nodes")
@js.native
class ResourceDollarProjectsDollarLocationsDollarNodes protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * tpu.projects.locations.nodes.create
    * @desc Creates a node.
    * @alias tpu.projects.locations.nodes.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.nodeId The unqualified resource name.
    * @param {string} params.parent The parent resource name.
    * @param {().Node} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[Schema$Operation] = js.native
  def create(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def create(params: ParamsDollarResourceDollarProjectsDollarLocationsDollarNodesDollarCreate): GaxiosPromise[Schema$Operation] = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarNodesDollarCreate,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarNodesDollarCreate,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarNodesDollarCreate,
    options: MethodOptions
  ): GaxiosPromise[Schema$Operation] = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarNodesDollarCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * tpu.projects.locations.nodes.delete
    * @desc Deletes a node.
    * @alias tpu.projects.locations.nodes.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The resource name.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Schema$Operation] = js.native
  def delete(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarProjectsDollarLocationsDollarNodesDollarDelete): GaxiosPromise[Schema$Operation] = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarNodesDollarDelete,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarNodesDollarDelete,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarNodesDollarDelete,
    options: MethodOptions
  ): GaxiosPromise[Schema$Operation] = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarNodesDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * tpu.projects.locations.nodes.get
    * @desc Gets the details of a node.
    * @alias tpu.projects.locations.nodes.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The resource name.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Node] = js.native
  def get(callback: BodyResponseCallback[Schema$Node]): Unit = js.native
  def get(params: ParamsDollarResourceDollarProjectsDollarLocationsDollarNodesDollarGet): GaxiosPromise[Schema$Node] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarNodesDollarGet,
    callback: BodyResponseCallback[Schema$Node]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarNodesDollarGet,
    options: BodyResponseCallback[Schema$Node],
    callback: BodyResponseCallback[Schema$Node]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarNodesDollarGet,
    options: MethodOptions
  ): GaxiosPromise[Schema$Node] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarNodesDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Node]
  ): Unit = js.native
  /**
    * tpu.projects.locations.nodes.list
    * @desc Lists nodes.
    * @alias tpu.projects.locations.nodes.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.pageSize The maximum number of items to return.
    * @param {string=} params.pageToken The next_page_token value returned from a previous List request, if any.
    * @param {string} params.parent The parent resource name.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ListNodesResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListNodesResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarProjectsDollarLocationsDollarNodesDollarList): GaxiosPromise[Schema$ListNodesResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarNodesDollarList,
    callback: BodyResponseCallback[Schema$ListNodesResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarNodesDollarList,
    options: BodyResponseCallback[Schema$ListNodesResponse],
    callback: BodyResponseCallback[Schema$ListNodesResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarNodesDollarList,
    options: MethodOptions
  ): GaxiosPromise[Schema$ListNodesResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarNodesDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListNodesResponse]
  ): Unit = js.native
  /**
    * tpu.projects.locations.nodes.reimage
    * @desc Reimages a node's OS.
    * @alias tpu.projects.locations.nodes.reimage
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The resource name.
    * @param {().ReimageNodeRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def reimage(): GaxiosPromise[Schema$Operation] = js.native
  def reimage(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def reimage(params: ParamsDollarResourceDollarProjectsDollarLocationsDollarNodesDollarReimage): GaxiosPromise[Schema$Operation] = js.native
  def reimage(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarNodesDollarReimage,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def reimage(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarNodesDollarReimage,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def reimage(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarNodesDollarReimage,
    options: MethodOptions
  ): GaxiosPromise[Schema$Operation] = js.native
  def reimage(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarNodesDollarReimage,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * tpu.projects.locations.nodes.start
    * @desc Starts a node.
    * @alias tpu.projects.locations.nodes.start
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The resource name.
    * @param {().StartNodeRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def start(): GaxiosPromise[Schema$Operation] = js.native
  def start(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def start(params: ParamsDollarResourceDollarProjectsDollarLocationsDollarNodesDollarStart): GaxiosPromise[Schema$Operation] = js.native
  def start(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarNodesDollarStart,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def start(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarNodesDollarStart,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def start(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarNodesDollarStart,
    options: MethodOptions
  ): GaxiosPromise[Schema$Operation] = js.native
  def start(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarNodesDollarStart,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * tpu.projects.locations.nodes.stop
    * @desc Stops a node.
    * @alias tpu.projects.locations.nodes.stop
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The resource name.
    * @param {().StopNodeRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def stop(): GaxiosPromise[Schema$Operation] = js.native
  def stop(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def stop(params: ParamsDollarResourceDollarProjectsDollarLocationsDollarNodesDollarStop): GaxiosPromise[Schema$Operation] = js.native
  def stop(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarNodesDollarStop,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def stop(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarNodesDollarStop,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def stop(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarNodesDollarStop,
    options: MethodOptions
  ): GaxiosPromise[Schema$Operation] = js.native
  def stop(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarNodesDollarStop,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
}

