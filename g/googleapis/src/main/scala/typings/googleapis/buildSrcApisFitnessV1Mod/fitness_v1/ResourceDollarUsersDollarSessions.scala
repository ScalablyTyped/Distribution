package typings.googleapis.buildSrcApisFitnessV1Mod.fitness_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/fitness/v1", "fitness_v1.Resource$Users$Sessions")
@js.native
class ResourceDollarUsersDollarSessions protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * fitness.users.sessions.delete
    * @desc Deletes a session specified by the given session ID.
    * @alias fitness.users.sessions.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.currentTimeMillis The client's current time in milliseconds since epoch.
    * @param {string} params.sessionId The ID of the session to be deleted.
    * @param {string} params.userId Delete a session for the person identified. Use me to indicate the authenticated user. Only me is supported at this time.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarUsersDollarSessionsDollarDelete): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsDollarResourceDollarUsersDollarSessionsDollarDelete,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarUsersDollarSessionsDollarDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarUsersDollarSessionsDollarDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsDollarResourceDollarUsersDollarSessionsDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * fitness.users.sessions.list
    * @desc Lists sessions previously created.
    * @alias fitness.users.sessions.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.endTime An RFC3339 timestamp. Only sessions ending between the start and end times will be included in the response.
    * @param {boolean=} params.includeDeleted If true, deleted sessions will be returned. When set to true, sessions returned in this response will only have an ID and will not have any other fields.
    * @param {string=} params.pageToken The continuation token, which is used for incremental syncing. To get the next batch of changes, set this parameter to the value of nextPageToken from the previous response. This token is treated as a timestamp (in millis since epoch). If specified, the API returns sessions modified since this time. The page token is ignored if either start or end time is specified. If none of start time, end time, and the page token is specified, sessions modified in the last 30 days are returned.
    * @param {string=} params.startTime An RFC3339 timestamp. Only sessions ending between the start and end times will be included in the response.
    * @param {string} params.userId List sessions for the person identified. Use me to indicate the authenticated user. Only me is supported at this time.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ListSessionsResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListSessionsResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarUsersDollarSessionsDollarList): GaxiosPromise[Schema$ListSessionsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarUsersDollarSessionsDollarList,
    callback: BodyResponseCallback[Schema$ListSessionsResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarUsersDollarSessionsDollarList,
    options: BodyResponseCallback[Schema$ListSessionsResponse],
    callback: BodyResponseCallback[Schema$ListSessionsResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarUsersDollarSessionsDollarList, options: MethodOptions): GaxiosPromise[Schema$ListSessionsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarUsersDollarSessionsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListSessionsResponse]
  ): Unit = js.native
  /**
    * fitness.users.sessions.update
    * @desc Updates or insert a given session.
    * @alias fitness.users.sessions.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.currentTimeMillis The client's current time in milliseconds since epoch.
    * @param {string} params.sessionId The ID of the session to be created.
    * @param {string} params.userId Create sessions for the person identified. Use me to indicate the authenticated user. Only me is supported at this time.
    * @param {().Session} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[Schema$Session] = js.native
  def update(callback: BodyResponseCallback[Schema$Session]): Unit = js.native
  def update(params: ParamsDollarResourceDollarUsersDollarSessionsDollarUpdate): GaxiosPromise[Schema$Session] = js.native
  def update(
    params: ParamsDollarResourceDollarUsersDollarSessionsDollarUpdate,
    callback: BodyResponseCallback[Schema$Session]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarUsersDollarSessionsDollarUpdate,
    options: BodyResponseCallback[Schema$Session],
    callback: BodyResponseCallback[Schema$Session]
  ): Unit = js.native
  def update(params: ParamsDollarResourceDollarUsersDollarSessionsDollarUpdate, options: MethodOptions): GaxiosPromise[Schema$Session] = js.native
  def update(
    params: ParamsDollarResourceDollarUsersDollarSessionsDollarUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Session]
  ): Unit = js.native
}

