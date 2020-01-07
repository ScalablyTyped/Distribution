package typings.googleapis.buildSrcApisDriveV2Mod.drive_v2

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/drive/v2", "drive_v2.Resource$Realtime")
@js.native
class Resource$Realtime protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * drive.realtime.get
    * @desc Exports the contents of the Realtime API data model associated with
    * this file as JSON.
    * @alias drive.realtime.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.fileId The ID of the file that the Realtime API data model is associated with.
    * @param {integer=} params.revision The revision of the Realtime API data model to export. Revisions start at 1 (the initial empty data model) and are incremented with each change. If this parameter is excluded, the most recent data model will be returned.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Unit] = js.native
  def get(callback: BodyResponseCallback[Unit]): Unit = js.native
  def get(params: ParamsDollarResourceDollarRealtimeDollarGet): GaxiosPromise[Unit] = js.native
  def get(params: ParamsDollarResourceDollarRealtimeDollarGet, callback: BodyResponseCallback[Unit]): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarRealtimeDollarGet,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarRealtimeDollarGet, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def get(
    params: ParamsDollarResourceDollarRealtimeDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * drive.realtime.update
    * @desc Overwrites the Realtime API data model associated with this file
    * with the provided JSON data model.
    * @alias drive.realtime.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.baseRevision The revision of the model to diff the uploaded model against. If set, the uploaded model is diffed against the provided revision and those differences are merged with any changes made to the model after the provided revision. If not set, the uploaded model replaces the current model on the server.
    * @param {string} params.fileId The ID of the file that the Realtime API data model is associated with.
    * @param {object} params.media Media object
    * @param {string} params.media.mimeType Media mime-type
    * @param {string|object} params.media.body Media body contents
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[Unit] = js.native
  def update(callback: BodyResponseCallback[Unit]): Unit = js.native
  def update(params: ParamsDollarResourceDollarRealtimeDollarUpdate): GaxiosPromise[Unit] = js.native
  def update(params: ParamsDollarResourceDollarRealtimeDollarUpdate, callback: BodyResponseCallback[Unit]): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarRealtimeDollarUpdate,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def update(params: ParamsDollarResourceDollarRealtimeDollarUpdate, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def update(
    params: ParamsDollarResourceDollarRealtimeDollarUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
}

