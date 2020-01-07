package typings.googleapis.buildSrcApisDlpV2Mod.dlp_v2

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/dlp/v2", "dlp_v2.Resource$Projects$Content")
@js.native
class ResourceDollarProjectsDollarContent protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * dlp.projects.content.deidentify
    * @desc De-identifies potentially sensitive info from a ContentItem. This
    * method has limits on input size and output size. See
    * https://cloud.google.com/dlp/docs/deidentify-sensitive-data to learn
    * more.  When no InfoTypes or CustomInfoTypes are specified in this
    * request, the system will automatically choose what detectors to run. By
    * default this may be all types, but may change over time as detectors are
    * updated.
    * @alias dlp.projects.content.deidentify
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent The parent resource name, for example projects/my-project-id.
    * @param {().GooglePrivacyDlpV2DeidentifyContentRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def deidentify(): GaxiosPromise[Schema$GooglePrivacyDlpV2DeidentifyContentResponse] = js.native
  def deidentify(callback: BodyResponseCallback[Schema$GooglePrivacyDlpV2DeidentifyContentResponse]): Unit = js.native
  def deidentify(params: ParamsDollarResourceDollarProjectsDollarContentDollarDeidentify): GaxiosPromise[Schema$GooglePrivacyDlpV2DeidentifyContentResponse] = js.native
  def deidentify(
    params: ParamsDollarResourceDollarProjectsDollarContentDollarDeidentify,
    callback: BodyResponseCallback[Schema$GooglePrivacyDlpV2DeidentifyContentResponse]
  ): Unit = js.native
  def deidentify(
    params: ParamsDollarResourceDollarProjectsDollarContentDollarDeidentify,
    options: BodyResponseCallback[Schema$GooglePrivacyDlpV2DeidentifyContentResponse],
    callback: BodyResponseCallback[Schema$GooglePrivacyDlpV2DeidentifyContentResponse]
  ): Unit = js.native
  def deidentify(params: ParamsDollarResourceDollarProjectsDollarContentDollarDeidentify, options: MethodOptions): GaxiosPromise[Schema$GooglePrivacyDlpV2DeidentifyContentResponse] = js.native
  def deidentify(
    params: ParamsDollarResourceDollarProjectsDollarContentDollarDeidentify,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GooglePrivacyDlpV2DeidentifyContentResponse]
  ): Unit = js.native
  /**
    * dlp.projects.content.inspect
    * @desc Finds potentially sensitive info in content. This method has limits
    * on input size, processing time, and output size.  When no InfoTypes or
    * CustomInfoTypes are specified in this request, the system will
    * automatically choose what detectors to run. By default this may be all
    * types, but may change over time as detectors are updated.  For how to
    * guides, see https://cloud.google.com/dlp/docs/inspecting-images and
    * https://cloud.google.com/dlp/docs/inspecting-text,
    * @alias dlp.projects.content.inspect
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent The parent resource name, for example projects/my-project-id.
    * @param {().GooglePrivacyDlpV2InspectContentRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def inspect(): GaxiosPromise[Schema$GooglePrivacyDlpV2InspectContentResponse] = js.native
  def inspect(callback: BodyResponseCallback[Schema$GooglePrivacyDlpV2InspectContentResponse]): Unit = js.native
  def inspect(params: ParamsDollarResourceDollarProjectsDollarContentDollarInspect): GaxiosPromise[Schema$GooglePrivacyDlpV2InspectContentResponse] = js.native
  def inspect(
    params: ParamsDollarResourceDollarProjectsDollarContentDollarInspect,
    callback: BodyResponseCallback[Schema$GooglePrivacyDlpV2InspectContentResponse]
  ): Unit = js.native
  def inspect(
    params: ParamsDollarResourceDollarProjectsDollarContentDollarInspect,
    options: BodyResponseCallback[Schema$GooglePrivacyDlpV2InspectContentResponse],
    callback: BodyResponseCallback[Schema$GooglePrivacyDlpV2InspectContentResponse]
  ): Unit = js.native
  def inspect(params: ParamsDollarResourceDollarProjectsDollarContentDollarInspect, options: MethodOptions): GaxiosPromise[Schema$GooglePrivacyDlpV2InspectContentResponse] = js.native
  def inspect(
    params: ParamsDollarResourceDollarProjectsDollarContentDollarInspect,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GooglePrivacyDlpV2InspectContentResponse]
  ): Unit = js.native
  /**
    * dlp.projects.content.reidentify
    * @desc Re-identifies content that has been de-identified. See
    * https://cloud.google.com/dlp/docs/pseudonymization#re-identification_in_free_text_code_example
    * to learn more.
    * @alias dlp.projects.content.reidentify
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent The parent resource name.
    * @param {().GooglePrivacyDlpV2ReidentifyContentRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def reidentify(): GaxiosPromise[Schema$GooglePrivacyDlpV2ReidentifyContentResponse] = js.native
  def reidentify(callback: BodyResponseCallback[Schema$GooglePrivacyDlpV2ReidentifyContentResponse]): Unit = js.native
  def reidentify(params: ParamsDollarResourceDollarProjectsDollarContentDollarReidentify): GaxiosPromise[Schema$GooglePrivacyDlpV2ReidentifyContentResponse] = js.native
  def reidentify(
    params: ParamsDollarResourceDollarProjectsDollarContentDollarReidentify,
    callback: BodyResponseCallback[Schema$GooglePrivacyDlpV2ReidentifyContentResponse]
  ): Unit = js.native
  def reidentify(
    params: ParamsDollarResourceDollarProjectsDollarContentDollarReidentify,
    options: BodyResponseCallback[Schema$GooglePrivacyDlpV2ReidentifyContentResponse],
    callback: BodyResponseCallback[Schema$GooglePrivacyDlpV2ReidentifyContentResponse]
  ): Unit = js.native
  def reidentify(params: ParamsDollarResourceDollarProjectsDollarContentDollarReidentify, options: MethodOptions): GaxiosPromise[Schema$GooglePrivacyDlpV2ReidentifyContentResponse] = js.native
  def reidentify(
    params: ParamsDollarResourceDollarProjectsDollarContentDollarReidentify,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GooglePrivacyDlpV2ReidentifyContentResponse]
  ): Unit = js.native
}

