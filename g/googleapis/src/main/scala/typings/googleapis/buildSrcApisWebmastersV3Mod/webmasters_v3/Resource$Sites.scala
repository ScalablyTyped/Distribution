package typings.googleapis.buildSrcApisWebmastersV3Mod.webmasters_v3

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/webmasters/v3", "webmasters_v3.Resource$Sites")
@js.native
class Resource$Sites protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * webmasters.sites.add
    * @desc Adds a site to the set of the user's sites in Search Console.
    * @alias webmasters.sites.add
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.siteUrl The URL of the site to add.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def add(): GaxiosPromise[Unit] = js.native
  def add(callback: BodyResponseCallback[Unit]): Unit = js.native
  def add(params: ParamsDollarResourceDollarSitesDollarAdd): GaxiosPromise[Unit] = js.native
  def add(params: ParamsDollarResourceDollarSitesDollarAdd, callback: BodyResponseCallback[Unit]): Unit = js.native
  def add(
    params: ParamsDollarResourceDollarSitesDollarAdd,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def add(params: ParamsDollarResourceDollarSitesDollarAdd, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def add(
    params: ParamsDollarResourceDollarSitesDollarAdd,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * webmasters.sites.delete
    * @desc Removes a site from the set of the user's Search Console sites.
    * @alias webmasters.sites.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.siteUrl The URI of the property as defined in Search Console. Examples: http://www.example.com/ or android-app://com.example/ Note: for property-sets, use the URI that starts with sc-set: which is used in Search Console URLs.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarSitesDollarDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsDollarResourceDollarSitesDollarDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarSitesDollarDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarSitesDollarDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsDollarResourceDollarSitesDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * webmasters.sites.get
    * @desc Retrieves information about specific site.
    * @alias webmasters.sites.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.siteUrl The URI of the property as defined in Search Console. Examples: http://www.example.com/ or android-app://com.example/ Note: for property-sets, use the URI that starts with sc-set: which is used in Search Console URLs.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$WmxSite] = js.native
  def get(callback: BodyResponseCallback[Schema$WmxSite]): Unit = js.native
  def get(params: ParamsDollarResourceDollarSitesDollarGet): GaxiosPromise[Schema$WmxSite] = js.native
  def get(params: ParamsDollarResourceDollarSitesDollarGet, callback: BodyResponseCallback[Schema$WmxSite]): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarSitesDollarGet,
    options: BodyResponseCallback[Schema$WmxSite],
    callback: BodyResponseCallback[Schema$WmxSite]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarSitesDollarGet, options: MethodOptions): GaxiosPromise[Schema$WmxSite] = js.native
  def get(
    params: ParamsDollarResourceDollarSitesDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$WmxSite]
  ): Unit = js.native
  /**
    * webmasters.sites.list
    * @desc Lists the user's Search Console sites.
    * @alias webmasters.sites.list
    * @memberOf! ()
    *
    * @param {object=} params Parameters for request
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$SitesListResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$SitesListResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarSitesDollarList): GaxiosPromise[Schema$SitesListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarSitesDollarList,
    callback: BodyResponseCallback[Schema$SitesListResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarSitesDollarList,
    options: BodyResponseCallback[Schema$SitesListResponse],
    callback: BodyResponseCallback[Schema$SitesListResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarSitesDollarList, options: MethodOptions): GaxiosPromise[Schema$SitesListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarSitesDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$SitesListResponse]
  ): Unit = js.native
}

