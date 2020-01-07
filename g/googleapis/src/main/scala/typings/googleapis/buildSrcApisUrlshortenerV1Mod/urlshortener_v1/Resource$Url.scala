package typings.googleapis.buildSrcApisUrlshortenerV1Mod.urlshortener_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/urlshortener/v1", "urlshortener_v1.Resource$Url")
@js.native
class Resource$Url protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * urlshortener.url.get
    * @desc Expands a short URL or gets creation time and analytics.
    * @alias urlshortener.url.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.projection Additional information to return.
    * @param {string} params.shortUrl The short URL, including the protocol.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Url] = js.native
  def get(callback: BodyResponseCallback[Schema$Url]): Unit = js.native
  def get(params: ParamsDollarResourceDollarUrlDollarGet): GaxiosPromise[Schema$Url] = js.native
  def get(params: ParamsDollarResourceDollarUrlDollarGet, callback: BodyResponseCallback[Schema$Url]): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarUrlDollarGet,
    options: BodyResponseCallback[Schema$Url],
    callback: BodyResponseCallback[Schema$Url]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarUrlDollarGet, options: MethodOptions): GaxiosPromise[Schema$Url] = js.native
  def get(
    params: ParamsDollarResourceDollarUrlDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Url]
  ): Unit = js.native
  /**
    * urlshortener.url.insert
    * @desc Creates a new short URL.
    * @alias urlshortener.url.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().Url} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[Schema$Url] = js.native
  def insert(callback: BodyResponseCallback[Schema$Url]): Unit = js.native
  def insert(params: ParamsDollarResourceDollarUrlDollarInsert): GaxiosPromise[Schema$Url] = js.native
  def insert(params: ParamsDollarResourceDollarUrlDollarInsert, callback: BodyResponseCallback[Schema$Url]): Unit = js.native
  def insert(
    params: ParamsDollarResourceDollarUrlDollarInsert,
    options: BodyResponseCallback[Schema$Url],
    callback: BodyResponseCallback[Schema$Url]
  ): Unit = js.native
  def insert(params: ParamsDollarResourceDollarUrlDollarInsert, options: MethodOptions): GaxiosPromise[Schema$Url] = js.native
  def insert(
    params: ParamsDollarResourceDollarUrlDollarInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Url]
  ): Unit = js.native
  /**
    * urlshortener.url.list
    * @desc Retrieves a list of URLs shortened by a user.
    * @alias urlshortener.url.list
    * @memberOf! ()
    *
    * @param {object=} params Parameters for request
    * @param {string=} params.projection Additional information to return.
    * @param {string=} params.start-token Token for requesting successive pages of results.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$UrlHistory] = js.native
  def list(callback: BodyResponseCallback[Schema$UrlHistory]): Unit = js.native
  def list(params: ParamsDollarResourceDollarUrlDollarList): GaxiosPromise[Schema$UrlHistory] = js.native
  def list(params: ParamsDollarResourceDollarUrlDollarList, callback: BodyResponseCallback[Schema$UrlHistory]): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarUrlDollarList,
    options: BodyResponseCallback[Schema$UrlHistory],
    callback: BodyResponseCallback[Schema$UrlHistory]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarUrlDollarList, options: MethodOptions): GaxiosPromise[Schema$UrlHistory] = js.native
  def list(
    params: ParamsDollarResourceDollarUrlDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$UrlHistory]
  ): Unit = js.native
}

