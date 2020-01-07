package typings.googleapis.buildSrcApisComposerV1beta1Mod.composer_v1beta1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/composer/v1beta1", "composer_v1beta1.Resource$Projects$Locations$Imageversions")
@js.native
class ResourceDollarProjectsDollarLocationsDollarImageversions protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * composer.projects.locations.imageVersions.list
    * @desc List ImageVersions for provided location.
    * @alias composer.projects.locations.imageVersions.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.pageSize The maximum number of image_versions to return.
    * @param {string=} params.pageToken The next_page_token value returned from a previous List request, if any.
    * @param {string} params.parent List ImageVersions in the given project and location, in the form: "projects/{projectId}/locations/{locationId}"
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ListImageVersionsResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListImageVersionsResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarProjectsDollarLocationsDollarImageversionsDollarList): GaxiosPromise[Schema$ListImageVersionsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarImageversionsDollarList,
    callback: BodyResponseCallback[Schema$ListImageVersionsResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarImageversionsDollarList,
    options: BodyResponseCallback[Schema$ListImageVersionsResponse],
    callback: BodyResponseCallback[Schema$ListImageVersionsResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarImageversionsDollarList,
    options: MethodOptions
  ): GaxiosPromise[Schema$ListImageVersionsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarImageversionsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListImageVersionsResponse]
  ): Unit = js.native
}

