package typings.googleapis.buildSrcApisDfareportingV3Dot2Mod.dfareporting_v3_2

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/dfareporting/v3.2", "dfareporting_v3_2.Resource$Creativeassets")
@js.native
class Resource$Creativeassets protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * dfareporting.creativeAssets.insert
    * @desc Inserts a new creative asset.
    * @alias dfareporting.creativeAssets.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.advertiserId Advertiser ID of this creative. This is a required field.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param  {object} params.resource Media resource metadata
    * @param {object} params.media Media object
    * @param {string} params.media.mimeType Media mime-type
    * @param {string|object} params.media.body Media body contents
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[Schema$CreativeAssetMetadata] = js.native
  def insert(callback: BodyResponseCallback[Schema$CreativeAssetMetadata]): Unit = js.native
  def insert(params: ParamsDollarResourceDollarCreativeassetsDollarInsert): GaxiosPromise[Schema$CreativeAssetMetadata] = js.native
  def insert(
    params: ParamsDollarResourceDollarCreativeassetsDollarInsert,
    callback: BodyResponseCallback[Schema$CreativeAssetMetadata]
  ): Unit = js.native
  def insert(
    params: ParamsDollarResourceDollarCreativeassetsDollarInsert,
    options: BodyResponseCallback[Schema$CreativeAssetMetadata],
    callback: BodyResponseCallback[Schema$CreativeAssetMetadata]
  ): Unit = js.native
  def insert(params: ParamsDollarResourceDollarCreativeassetsDollarInsert, options: MethodOptions): GaxiosPromise[Schema$CreativeAssetMetadata] = js.native
  def insert(
    params: ParamsDollarResourceDollarCreativeassetsDollarInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$CreativeAssetMetadata]
  ): Unit = js.native
}

