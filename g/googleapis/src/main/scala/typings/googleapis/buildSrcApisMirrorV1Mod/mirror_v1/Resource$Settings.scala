package typings.googleapis.buildSrcApisMirrorV1Mod.mirror_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/mirror/v1", "mirror_v1.Resource$Settings")
@js.native
class Resource$Settings protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * mirror.settings.get
    * @desc Gets a single setting by ID.
    * @alias mirror.settings.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id The ID of the setting. The following IDs are valid:  - locale - The key to the user’s language/locale (BCP 47 identifier) that Glassware should use to render localized content.  - timezone - The key to the user’s current time zone region as defined in the tz database. Example: America/Los_Angeles.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Setting] = js.native
  def get(callback: BodyResponseCallback[Schema$Setting]): Unit = js.native
  def get(params: ParamsDollarResourceDollarSettingsDollarGet): GaxiosPromise[Schema$Setting] = js.native
  def get(
    params: ParamsDollarResourceDollarSettingsDollarGet,
    callback: BodyResponseCallback[Schema$Setting]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarSettingsDollarGet,
    options: BodyResponseCallback[Schema$Setting],
    callback: BodyResponseCallback[Schema$Setting]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarSettingsDollarGet, options: MethodOptions): GaxiosPromise[Schema$Setting] = js.native
  def get(
    params: ParamsDollarResourceDollarSettingsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Setting]
  ): Unit = js.native
}

