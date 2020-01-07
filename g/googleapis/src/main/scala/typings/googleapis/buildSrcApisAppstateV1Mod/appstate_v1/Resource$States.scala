package typings.googleapis.buildSrcApisAppstateV1Mod.appstate_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/appstate/v1", "appstate_v1.Resource$States")
@js.native
class Resource$States protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * appstate.states.clear
    * @desc Clears (sets to empty) the data for the passed key if and only if
    * the passed version matches the currently stored version. This method
    * results in a conflict error on version mismatch.
    * @alias appstate.states.clear
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.currentDataVersion The version of the data to be cleared. Version strings are returned by the server.
    * @param {integer} params.stateKey The key for the data to be retrieved.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def clear(): GaxiosPromise[Schema$WriteResult] = js.native
  def clear(callback: BodyResponseCallback[Schema$WriteResult]): Unit = js.native
  def clear(params: ParamsDollarResourceDollarStatesDollarClear): GaxiosPromise[Schema$WriteResult] = js.native
  def clear(
    params: ParamsDollarResourceDollarStatesDollarClear,
    callback: BodyResponseCallback[Schema$WriteResult]
  ): Unit = js.native
  def clear(
    params: ParamsDollarResourceDollarStatesDollarClear,
    options: BodyResponseCallback[Schema$WriteResult],
    callback: BodyResponseCallback[Schema$WriteResult]
  ): Unit = js.native
  def clear(params: ParamsDollarResourceDollarStatesDollarClear, options: MethodOptions): GaxiosPromise[Schema$WriteResult] = js.native
  def clear(
    params: ParamsDollarResourceDollarStatesDollarClear,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$WriteResult]
  ): Unit = js.native
  /**
    * appstate.states.delete
    * @desc Deletes a key and the data associated with it. The key is removed
    * and no longer counts against the key quota. Note that since this method
    * is not safe in the face of concurrent modifications, it should only be
    * used for development and testing purposes. Invoking this method in
    * shipping code can result in data loss and data corruption.
    * @alias appstate.states.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer} params.stateKey The key for the data to be retrieved.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarStatesDollarDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsDollarResourceDollarStatesDollarDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarStatesDollarDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarStatesDollarDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsDollarResourceDollarStatesDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * appstate.states.get
    * @desc Retrieves the data corresponding to the passed key. If the key does
    * not exist on the server, an HTTP 404 will be returned.
    * @alias appstate.states.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer} params.stateKey The key for the data to be retrieved.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$GetResponse] = js.native
  def get(callback: BodyResponseCallback[Schema$GetResponse]): Unit = js.native
  def get(params: ParamsDollarResourceDollarStatesDollarGet): GaxiosPromise[Schema$GetResponse] = js.native
  def get(
    params: ParamsDollarResourceDollarStatesDollarGet,
    callback: BodyResponseCallback[Schema$GetResponse]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarStatesDollarGet,
    options: BodyResponseCallback[Schema$GetResponse],
    callback: BodyResponseCallback[Schema$GetResponse]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarStatesDollarGet, options: MethodOptions): GaxiosPromise[Schema$GetResponse] = js.native
  def get(
    params: ParamsDollarResourceDollarStatesDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GetResponse]
  ): Unit = js.native
  /**
    * appstate.states.list
    * @desc Lists all the states keys, and optionally the state data.
    * @alias appstate.states.list
    * @memberOf! ()
    *
    * @param {object=} params Parameters for request
    * @param {boolean=} params.includeData Whether to include the full data in addition to the version number
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ListResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarStatesDollarList): GaxiosPromise[Schema$ListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarStatesDollarList,
    callback: BodyResponseCallback[Schema$ListResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarStatesDollarList,
    options: BodyResponseCallback[Schema$ListResponse],
    callback: BodyResponseCallback[Schema$ListResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarStatesDollarList, options: MethodOptions): GaxiosPromise[Schema$ListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarStatesDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListResponse]
  ): Unit = js.native
  /**
    * appstate.states.update
    * @desc Update the data associated with the input key if and only if the
    * passed version matches the currently stored version. This method is safe
    * in the face of concurrent writes. Maximum per-key size is 128KB.
    * @alias appstate.states.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.currentStateVersion The version of the app state your application is attempting to update. If this does not match the current version, this method will return a conflict error. If there is no data stored on the server for this key, the update will succeed irrespective of the value of this parameter.
    * @param {integer} params.stateKey The key for the data to be retrieved.
    * @param {().UpdateRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[Schema$WriteResult] = js.native
  def update(callback: BodyResponseCallback[Schema$WriteResult]): Unit = js.native
  def update(params: ParamsDollarResourceDollarStatesDollarUpdate): GaxiosPromise[Schema$WriteResult] = js.native
  def update(
    params: ParamsDollarResourceDollarStatesDollarUpdate,
    callback: BodyResponseCallback[Schema$WriteResult]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarStatesDollarUpdate,
    options: BodyResponseCallback[Schema$WriteResult],
    callback: BodyResponseCallback[Schema$WriteResult]
  ): Unit = js.native
  def update(params: ParamsDollarResourceDollarStatesDollarUpdate, options: MethodOptions): GaxiosPromise[Schema$WriteResult] = js.native
  def update(
    params: ParamsDollarResourceDollarStatesDollarUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$WriteResult]
  ): Unit = js.native
}

