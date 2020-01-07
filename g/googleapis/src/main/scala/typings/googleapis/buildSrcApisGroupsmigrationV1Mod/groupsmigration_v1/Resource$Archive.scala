package typings.googleapis.buildSrcApisGroupsmigrationV1Mod.groupsmigration_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/groupsmigration/v1", "groupsmigration_v1.Resource$Archive")
@js.native
class Resource$Archive protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * groupsmigration.archive.insert
    * @desc Inserts a new mail into the archive of the Google group.
    * @alias groupsmigration.archive.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.groupId The group ID
    * @param {object} params.media Media object
    * @param {string} params.media.mimeType Media mime-type
    * @param {string|object} params.media.body Media body contents
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[Schema$Groups] = js.native
  def insert(callback: BodyResponseCallback[Schema$Groups]): Unit = js.native
  def insert(params: ParamsDollarResourceDollarArchiveDollarInsert): GaxiosPromise[Schema$Groups] = js.native
  def insert(
    params: ParamsDollarResourceDollarArchiveDollarInsert,
    callback: BodyResponseCallback[Schema$Groups]
  ): Unit = js.native
  def insert(
    params: ParamsDollarResourceDollarArchiveDollarInsert,
    options: BodyResponseCallback[Schema$Groups],
    callback: BodyResponseCallback[Schema$Groups]
  ): Unit = js.native
  def insert(params: ParamsDollarResourceDollarArchiveDollarInsert, options: MethodOptions): GaxiosPromise[Schema$Groups] = js.native
  def insert(
    params: ParamsDollarResourceDollarArchiveDollarInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Groups]
  ): Unit = js.native
}

