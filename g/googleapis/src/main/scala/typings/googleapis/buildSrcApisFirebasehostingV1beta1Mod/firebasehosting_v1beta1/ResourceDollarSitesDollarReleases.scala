package typings.googleapis.buildSrcApisFirebasehostingV1beta1Mod.firebasehosting_v1beta1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/firebasehosting/v1beta1", "firebasehosting_v1beta1.Resource$Sites$Releases")
@js.native
class ResourceDollarSitesDollarReleases protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * firebasehosting.sites.releases.create
    * @desc Creates a new release which makes the content of the specified
    * version actively display on the site.
    * @alias firebasehosting.sites.releases.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent The site that the release belongs to, in the format: <code>sites/<var>site-name</var></code>
    * @param {string=} params.versionName The unique identifier for a version, in the format: <code>/sites/<var>site-name</var>/versions/<var>versionID</var></code> The <var>site-name</var> in this version identifier must match the <var>site-name</var> in the `parent` parameter. <br> <br>This query parameter must be empty if the `type` field in the request body is `SITE_DISABLE`.
    * @param {().Release} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[Schema$Release] = js.native
  def create(callback: BodyResponseCallback[Schema$Release]): Unit = js.native
  def create(params: ParamsDollarResourceDollarSitesDollarReleasesDollarCreate): GaxiosPromise[Schema$Release] = js.native
  def create(
    params: ParamsDollarResourceDollarSitesDollarReleasesDollarCreate,
    callback: BodyResponseCallback[Schema$Release]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarSitesDollarReleasesDollarCreate,
    options: BodyResponseCallback[Schema$Release],
    callback: BodyResponseCallback[Schema$Release]
  ): Unit = js.native
  def create(params: ParamsDollarResourceDollarSitesDollarReleasesDollarCreate, options: MethodOptions): GaxiosPromise[Schema$Release] = js.native
  def create(
    params: ParamsDollarResourceDollarSitesDollarReleasesDollarCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Release]
  ): Unit = js.native
  /**
    * firebasehosting.sites.releases.list
    * @desc Lists the releases that have been created on the specified site.
    * @alias firebasehosting.sites.releases.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.pageSize The page size to return. Defaults to 100.
    * @param {string=} params.pageToken The next_page_token from a previous request, if provided.
    * @param {string} params.parent Required. The parent for which to list files, in the format: <code>sites/<var>site-name</var></code>
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ListReleasesResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListReleasesResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarSitesDollarReleasesDollarList): GaxiosPromise[Schema$ListReleasesResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarSitesDollarReleasesDollarList,
    callback: BodyResponseCallback[Schema$ListReleasesResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarSitesDollarReleasesDollarList,
    options: BodyResponseCallback[Schema$ListReleasesResponse],
    callback: BodyResponseCallback[Schema$ListReleasesResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarSitesDollarReleasesDollarList, options: MethodOptions): GaxiosPromise[Schema$ListReleasesResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarSitesDollarReleasesDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListReleasesResponse]
  ): Unit = js.native
}

