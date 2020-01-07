package typings.googleapis.buildSrcApisGamesV1Mod.games_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/games/v1", "games_v1.Resource$Events")
@js.native
class Resource$Events protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * games.events.listByPlayer
    * @desc Returns a list showing the current progress on events in this
    * application for the currently authenticated user.
    * @alias games.events.listByPlayer
    * @memberOf! ()
    *
    * @param {object=} params Parameters for request
    * @param {string=} params.language The preferred language to use for strings returned by this method.
    * @param {integer=} params.maxResults The maximum number of events to return in the response, used for paging. For any response, the actual number of events to return may be less than the specified maxResults.
    * @param {string=} params.pageToken The token returned by the previous request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def listByPlayer(): GaxiosPromise[Schema$PlayerEventListResponse] = js.native
  def listByPlayer(callback: BodyResponseCallback[Schema$PlayerEventListResponse]): Unit = js.native
  def listByPlayer(params: ParamsDollarResourceDollarEventsDollarListbyplayer): GaxiosPromise[Schema$PlayerEventListResponse] = js.native
  def listByPlayer(
    params: ParamsDollarResourceDollarEventsDollarListbyplayer,
    callback: BodyResponseCallback[Schema$PlayerEventListResponse]
  ): Unit = js.native
  def listByPlayer(
    params: ParamsDollarResourceDollarEventsDollarListbyplayer,
    options: BodyResponseCallback[Schema$PlayerEventListResponse],
    callback: BodyResponseCallback[Schema$PlayerEventListResponse]
  ): Unit = js.native
  def listByPlayer(params: ParamsDollarResourceDollarEventsDollarListbyplayer, options: MethodOptions): GaxiosPromise[Schema$PlayerEventListResponse] = js.native
  def listByPlayer(
    params: ParamsDollarResourceDollarEventsDollarListbyplayer,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$PlayerEventListResponse]
  ): Unit = js.native
  /**
    * games.events.listDefinitions
    * @desc Returns a list of the event definitions in this application.
    * @alias games.events.listDefinitions
    * @memberOf! ()
    *
    * @param {object=} params Parameters for request
    * @param {string=} params.language The preferred language to use for strings returned by this method.
    * @param {integer=} params.maxResults The maximum number of event definitions to return in the response, used for paging. For any response, the actual number of event definitions to return may be less than the specified maxResults.
    * @param {string=} params.pageToken The token returned by the previous request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def listDefinitions(): GaxiosPromise[Schema$EventDefinitionListResponse] = js.native
  def listDefinitions(callback: BodyResponseCallback[Schema$EventDefinitionListResponse]): Unit = js.native
  def listDefinitions(params: ParamsDollarResourceDollarEventsDollarListdefinitions): GaxiosPromise[Schema$EventDefinitionListResponse] = js.native
  def listDefinitions(
    params: ParamsDollarResourceDollarEventsDollarListdefinitions,
    callback: BodyResponseCallback[Schema$EventDefinitionListResponse]
  ): Unit = js.native
  def listDefinitions(
    params: ParamsDollarResourceDollarEventsDollarListdefinitions,
    options: BodyResponseCallback[Schema$EventDefinitionListResponse],
    callback: BodyResponseCallback[Schema$EventDefinitionListResponse]
  ): Unit = js.native
  def listDefinitions(params: ParamsDollarResourceDollarEventsDollarListdefinitions, options: MethodOptions): GaxiosPromise[Schema$EventDefinitionListResponse] = js.native
  def listDefinitions(
    params: ParamsDollarResourceDollarEventsDollarListdefinitions,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$EventDefinitionListResponse]
  ): Unit = js.native
  /**
    * games.events.record
    * @desc Records a batch of changes to the number of times events have
    * occurred for the currently authenticated user of this application.
    * @alias games.events.record
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.language The preferred language to use for strings returned by this method.
    * @param {().EventRecordRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def record(): GaxiosPromise[Schema$EventUpdateResponse] = js.native
  def record(callback: BodyResponseCallback[Schema$EventUpdateResponse]): Unit = js.native
  def record(params: ParamsDollarResourceDollarEventsDollarRecord): GaxiosPromise[Schema$EventUpdateResponse] = js.native
  def record(
    params: ParamsDollarResourceDollarEventsDollarRecord,
    callback: BodyResponseCallback[Schema$EventUpdateResponse]
  ): Unit = js.native
  def record(
    params: ParamsDollarResourceDollarEventsDollarRecord,
    options: BodyResponseCallback[Schema$EventUpdateResponse],
    callback: BodyResponseCallback[Schema$EventUpdateResponse]
  ): Unit = js.native
  def record(params: ParamsDollarResourceDollarEventsDollarRecord, options: MethodOptions): GaxiosPromise[Schema$EventUpdateResponse] = js.native
  def record(
    params: ParamsDollarResourceDollarEventsDollarRecord,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$EventUpdateResponse]
  ): Unit = js.native
}

