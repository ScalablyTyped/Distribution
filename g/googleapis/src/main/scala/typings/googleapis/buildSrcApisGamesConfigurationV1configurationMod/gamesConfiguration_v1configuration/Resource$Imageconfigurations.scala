package typings.googleapis.buildSrcApisGamesConfigurationV1configurationMod.gamesConfiguration_v1configuration

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/gamesConfiguration/v1configuration", "gamesConfiguration_v1configuration.Resource$Imageconfigurations")
@js.native
class Resource$Imageconfigurations protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * gamesConfiguration.imageConfigurations.upload
    * @desc Uploads an image for a resource with the given ID and image type.
    * @alias gamesConfiguration.imageConfigurations.upload
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.imageType Selects which image in a resource for this method.
    * @param {string} params.resourceId The ID of the resource used by this method.
    * @param {object} params.media Media object
    * @param {string} params.media.mimeType Media mime-type
    * @param {string|object} params.media.body Media body contents
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def upload(): GaxiosPromise[Schema$ImageConfiguration] = js.native
  def upload(callback: BodyResponseCallback[Schema$ImageConfiguration]): Unit = js.native
  def upload(params: ParamsDollarResourceDollarImageconfigurationsDollarUpload): GaxiosPromise[Schema$ImageConfiguration] = js.native
  def upload(
    params: ParamsDollarResourceDollarImageconfigurationsDollarUpload,
    callback: BodyResponseCallback[Schema$ImageConfiguration]
  ): Unit = js.native
  def upload(
    params: ParamsDollarResourceDollarImageconfigurationsDollarUpload,
    options: BodyResponseCallback[Schema$ImageConfiguration],
    callback: BodyResponseCallback[Schema$ImageConfiguration]
  ): Unit = js.native
  def upload(params: ParamsDollarResourceDollarImageconfigurationsDollarUpload, options: MethodOptions): GaxiosPromise[Schema$ImageConfiguration] = js.native
  def upload(
    params: ParamsDollarResourceDollarImageconfigurationsDollarUpload,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ImageConfiguration]
  ): Unit = js.native
}

