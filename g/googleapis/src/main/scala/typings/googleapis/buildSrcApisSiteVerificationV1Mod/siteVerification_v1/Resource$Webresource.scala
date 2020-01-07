package typings.googleapis.buildSrcApisSiteVerificationV1Mod.siteVerification_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/siteVerification/v1", "siteVerification_v1.Resource$Webresource")
@js.native
class Resource$Webresource protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * siteVerification.webResource.delete
    * @desc Relinquish ownership of a website or domain.
    * @alias siteVerification.webResource.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id The id of a verified site or domain.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarWebresourceDollarDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsDollarResourceDollarWebresourceDollarDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarWebresourceDollarDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarWebresourceDollarDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsDollarResourceDollarWebresourceDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * siteVerification.webResource.get
    * @desc Get the most current data for a website or domain.
    * @alias siteVerification.webResource.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id The id of a verified site or domain.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$SiteVerificationWebResourceResource] = js.native
  def get(callback: BodyResponseCallback[Schema$SiteVerificationWebResourceResource]): Unit = js.native
  def get(params: ParamsDollarResourceDollarWebresourceDollarGet): GaxiosPromise[Schema$SiteVerificationWebResourceResource] = js.native
  def get(
    params: ParamsDollarResourceDollarWebresourceDollarGet,
    callback: BodyResponseCallback[Schema$SiteVerificationWebResourceResource]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarWebresourceDollarGet,
    options: BodyResponseCallback[Schema$SiteVerificationWebResourceResource],
    callback: BodyResponseCallback[Schema$SiteVerificationWebResourceResource]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarWebresourceDollarGet, options: MethodOptions): GaxiosPromise[Schema$SiteVerificationWebResourceResource] = js.native
  def get(
    params: ParamsDollarResourceDollarWebresourceDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$SiteVerificationWebResourceResource]
  ): Unit = js.native
  /**
    * siteVerification.webResource.getToken
    * @desc Get a verification token for placing on a website or domain.
    * @alias siteVerification.webResource.getToken
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().SiteVerificationWebResourceGettokenRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getToken(): GaxiosPromise[Schema$SiteVerificationWebResourceGettokenResponse] = js.native
  def getToken(callback: BodyResponseCallback[Schema$SiteVerificationWebResourceGettokenResponse]): Unit = js.native
  def getToken(params: ParamsDollarResourceDollarWebresourceDollarGettoken): GaxiosPromise[Schema$SiteVerificationWebResourceGettokenResponse] = js.native
  def getToken(
    params: ParamsDollarResourceDollarWebresourceDollarGettoken,
    callback: BodyResponseCallback[Schema$SiteVerificationWebResourceGettokenResponse]
  ): Unit = js.native
  def getToken(
    params: ParamsDollarResourceDollarWebresourceDollarGettoken,
    options: BodyResponseCallback[Schema$SiteVerificationWebResourceGettokenResponse],
    callback: BodyResponseCallback[Schema$SiteVerificationWebResourceGettokenResponse]
  ): Unit = js.native
  def getToken(params: ParamsDollarResourceDollarWebresourceDollarGettoken, options: MethodOptions): GaxiosPromise[Schema$SiteVerificationWebResourceGettokenResponse] = js.native
  def getToken(
    params: ParamsDollarResourceDollarWebresourceDollarGettoken,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$SiteVerificationWebResourceGettokenResponse]
  ): Unit = js.native
  /**
    * siteVerification.webResource.insert
    * @desc Attempt verification of a website or domain.
    * @alias siteVerification.webResource.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.verificationMethod The method to use for verifying a site or domain.
    * @param {().SiteVerificationWebResourceResource} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[Schema$SiteVerificationWebResourceResource] = js.native
  def insert(callback: BodyResponseCallback[Schema$SiteVerificationWebResourceResource]): Unit = js.native
  def insert(params: ParamsDollarResourceDollarWebresourceDollarInsert): GaxiosPromise[Schema$SiteVerificationWebResourceResource] = js.native
  def insert(
    params: ParamsDollarResourceDollarWebresourceDollarInsert,
    callback: BodyResponseCallback[Schema$SiteVerificationWebResourceResource]
  ): Unit = js.native
  def insert(
    params: ParamsDollarResourceDollarWebresourceDollarInsert,
    options: BodyResponseCallback[Schema$SiteVerificationWebResourceResource],
    callback: BodyResponseCallback[Schema$SiteVerificationWebResourceResource]
  ): Unit = js.native
  def insert(params: ParamsDollarResourceDollarWebresourceDollarInsert, options: MethodOptions): GaxiosPromise[Schema$SiteVerificationWebResourceResource] = js.native
  def insert(
    params: ParamsDollarResourceDollarWebresourceDollarInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$SiteVerificationWebResourceResource]
  ): Unit = js.native
  /**
    * siteVerification.webResource.list
    * @desc Get the list of your verified websites and domains.
    * @alias siteVerification.webResource.list
    * @memberOf! ()
    *
    * @param {object=} params Parameters for request
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$SiteVerificationWebResourceListResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$SiteVerificationWebResourceListResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarWebresourceDollarList): GaxiosPromise[Schema$SiteVerificationWebResourceListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarWebresourceDollarList,
    callback: BodyResponseCallback[Schema$SiteVerificationWebResourceListResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarWebresourceDollarList,
    options: BodyResponseCallback[Schema$SiteVerificationWebResourceListResponse],
    callback: BodyResponseCallback[Schema$SiteVerificationWebResourceListResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarWebresourceDollarList, options: MethodOptions): GaxiosPromise[Schema$SiteVerificationWebResourceListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarWebresourceDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$SiteVerificationWebResourceListResponse]
  ): Unit = js.native
  /**
    * siteVerification.webResource.patch
    * @desc Modify the list of owners for your website or domain. This method
    * supports patch semantics.
    * @alias siteVerification.webResource.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id The id of a verified site or domain.
    * @param {().SiteVerificationWebResourceResource} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[Schema$SiteVerificationWebResourceResource] = js.native
  def patch(callback: BodyResponseCallback[Schema$SiteVerificationWebResourceResource]): Unit = js.native
  def patch(params: ParamsDollarResourceDollarWebresourceDollarPatch): GaxiosPromise[Schema$SiteVerificationWebResourceResource] = js.native
  def patch(
    params: ParamsDollarResourceDollarWebresourceDollarPatch,
    callback: BodyResponseCallback[Schema$SiteVerificationWebResourceResource]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarWebresourceDollarPatch,
    options: BodyResponseCallback[Schema$SiteVerificationWebResourceResource],
    callback: BodyResponseCallback[Schema$SiteVerificationWebResourceResource]
  ): Unit = js.native
  def patch(params: ParamsDollarResourceDollarWebresourceDollarPatch, options: MethodOptions): GaxiosPromise[Schema$SiteVerificationWebResourceResource] = js.native
  def patch(
    params: ParamsDollarResourceDollarWebresourceDollarPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$SiteVerificationWebResourceResource]
  ): Unit = js.native
  /**
    * siteVerification.webResource.update
    * @desc Modify the list of owners for your website or domain.
    * @alias siteVerification.webResource.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id The id of a verified site or domain.
    * @param {().SiteVerificationWebResourceResource} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[Schema$SiteVerificationWebResourceResource] = js.native
  def update(callback: BodyResponseCallback[Schema$SiteVerificationWebResourceResource]): Unit = js.native
  def update(params: ParamsDollarResourceDollarWebresourceDollarUpdate): GaxiosPromise[Schema$SiteVerificationWebResourceResource] = js.native
  def update(
    params: ParamsDollarResourceDollarWebresourceDollarUpdate,
    callback: BodyResponseCallback[Schema$SiteVerificationWebResourceResource]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarWebresourceDollarUpdate,
    options: BodyResponseCallback[Schema$SiteVerificationWebResourceResource],
    callback: BodyResponseCallback[Schema$SiteVerificationWebResourceResource]
  ): Unit = js.native
  def update(params: ParamsDollarResourceDollarWebresourceDollarUpdate, options: MethodOptions): GaxiosPromise[Schema$SiteVerificationWebResourceResource] = js.native
  def update(
    params: ParamsDollarResourceDollarWebresourceDollarUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$SiteVerificationWebResourceResource]
  ): Unit = js.native
}

