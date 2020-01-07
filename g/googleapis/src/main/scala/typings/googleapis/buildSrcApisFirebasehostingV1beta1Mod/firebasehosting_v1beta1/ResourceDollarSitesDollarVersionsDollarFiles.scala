package typings.googleapis.buildSrcApisFirebasehostingV1beta1Mod.firebasehosting_v1beta1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/firebasehosting/v1beta1", "firebasehosting_v1beta1.Resource$Sites$Versions$Files")
@js.native
class ResourceDollarSitesDollarVersionsDollarFiles protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * firebasehosting.sites.versions.files.list
    * @desc Lists the remaining files to be uploaded for the specified version.
    * @alias firebasehosting.sites.versions.files.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.pageSize The page size to return. Defaults to 1000.
    * @param {string=} params.pageToken The next_page_token from a previous request, if provided. This will be the encoded version of a firebase.hosting.proto.metadata.ListFilesPageToken.
    * @param {string} params.parent Required. The parent to list files for, in the format: <code>sites/<var>site-name</var>/versions/<var>versionID</var></code>
    * @param {string=} params.status The type of files in the version that should be listed.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ListVersionFilesResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListVersionFilesResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarSitesDollarVersionsDollarFilesDollarList): GaxiosPromise[Schema$ListVersionFilesResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarSitesDollarVersionsDollarFilesDollarList,
    callback: BodyResponseCallback[Schema$ListVersionFilesResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarSitesDollarVersionsDollarFilesDollarList,
    options: BodyResponseCallback[Schema$ListVersionFilesResponse],
    callback: BodyResponseCallback[Schema$ListVersionFilesResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarSitesDollarVersionsDollarFilesDollarList, options: MethodOptions): GaxiosPromise[Schema$ListVersionFilesResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarSitesDollarVersionsDollarFilesDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListVersionFilesResponse]
  ): Unit = js.native
}

