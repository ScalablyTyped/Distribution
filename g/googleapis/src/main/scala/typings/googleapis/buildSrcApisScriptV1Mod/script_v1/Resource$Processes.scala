package typings.googleapis.buildSrcApisScriptV1Mod.script_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/script/v1", "script_v1.Resource$Processes")
@js.native
class Resource$Processes protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * script.processes.list
    * @desc List information about processes made by or on behalf of a user,
    * such as process type and current status.
    * @alias script.processes.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.pageSize The maximum number of returned processes per page of results. Defaults to 50.
    * @param {string=} params.pageToken The token for continuing a previous list request on the next page. This should be set to the value of `nextPageToken` from a previous response.
    * @param {string=} params.userProcessFilter.deploymentId Optional field used to limit returned processes to those originating from projects with a specific deployment ID.
    * @param {string=} params.userProcessFilter.endTime Optional field used to limit returned processes to those that completed on or before the given timestamp.
    * @param {string=} params.userProcessFilter.functionName Optional field used to limit returned processes to those originating from a script function with the given function name.
    * @param {string=} params.userProcessFilter.projectName Optional field used to limit returned processes to those originating from projects with project names containing a specific string.
    * @param {string=} params.userProcessFilter.scriptId Optional field used to limit returned processes to those originating from projects with a specific script ID.
    * @param {string=} params.userProcessFilter.startTime Optional field used to limit returned processes to those that were started on or after the given timestamp.
    * @param {string=} params.userProcessFilter.statuses Optional field used to limit returned processes to those having one of the specified process statuses.
    * @param {string=} params.userProcessFilter.types Optional field used to limit returned processes to those having one of the specified process types.
    * @param {string=} params.userProcessFilter.userAccessLevels Optional field used to limit returned processes to those having one of the specified user access levels.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ListUserProcessesResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListUserProcessesResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarProcessesDollarList): GaxiosPromise[Schema$ListUserProcessesResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProcessesDollarList,
    callback: BodyResponseCallback[Schema$ListUserProcessesResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProcessesDollarList,
    options: BodyResponseCallback[Schema$ListUserProcessesResponse],
    callback: BodyResponseCallback[Schema$ListUserProcessesResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarProcessesDollarList, options: MethodOptions): GaxiosPromise[Schema$ListUserProcessesResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProcessesDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListUserProcessesResponse]
  ): Unit = js.native
  /**
    * script.processes.listScriptProcesses
    * @desc List information about a script's executed processes, such as
    * process type and current status.
    * @alias script.processes.listScriptProcesses
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.pageSize The maximum number of returned processes per page of results. Defaults to 50.
    * @param {string=} params.pageToken The token for continuing a previous list request on the next page. This should be set to the value of `nextPageToken` from a previous response.
    * @param {string=} params.scriptId The script ID of the project whose processes are listed.
    * @param {string=} params.scriptProcessFilter.deploymentId Optional field used to limit returned processes to those originating from projects with a specific deployment ID.
    * @param {string=} params.scriptProcessFilter.endTime Optional field used to limit returned processes to those that completed on or before the given timestamp.
    * @param {string=} params.scriptProcessFilter.functionName Optional field used to limit returned processes to those originating from a script function with the given function name.
    * @param {string=} params.scriptProcessFilter.startTime Optional field used to limit returned processes to those that were started on or after the given timestamp.
    * @param {string=} params.scriptProcessFilter.statuses Optional field used to limit returned processes to those having one of the specified process statuses.
    * @param {string=} params.scriptProcessFilter.types Optional field used to limit returned processes to those having one of the specified process types.
    * @param {string=} params.scriptProcessFilter.userAccessLevels Optional field used to limit returned processes to those having one of the specified user access levels.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def listScriptProcesses(): GaxiosPromise[Schema$ListScriptProcessesResponse] = js.native
  def listScriptProcesses(callback: BodyResponseCallback[Schema$ListScriptProcessesResponse]): Unit = js.native
  def listScriptProcesses(params: ParamsDollarResourceDollarProcessesDollarListscriptprocesses): GaxiosPromise[Schema$ListScriptProcessesResponse] = js.native
  def listScriptProcesses(
    params: ParamsDollarResourceDollarProcessesDollarListscriptprocesses,
    callback: BodyResponseCallback[Schema$ListScriptProcessesResponse]
  ): Unit = js.native
  def listScriptProcesses(
    params: ParamsDollarResourceDollarProcessesDollarListscriptprocesses,
    options: BodyResponseCallback[Schema$ListScriptProcessesResponse],
    callback: BodyResponseCallback[Schema$ListScriptProcessesResponse]
  ): Unit = js.native
  def listScriptProcesses(params: ParamsDollarResourceDollarProcessesDollarListscriptprocesses, options: MethodOptions): GaxiosPromise[Schema$ListScriptProcessesResponse] = js.native
  def listScriptProcesses(
    params: ParamsDollarResourceDollarProcessesDollarListscriptprocesses,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListScriptProcessesResponse]
  ): Unit = js.native
}

