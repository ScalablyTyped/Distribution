package typings.googleapis.buildSrcApisAppengineV1alphaMod.appengine_v1alpha

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/appengine/v1alpha", "appengine_v1alpha.Resource$Apps$Authorizeddomains")
@js.native
class ResourceDollarAppsDollarAuthorizeddomains protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * appengine.apps.authorizedDomains.list
    * @desc Lists all domains the user is authorized to administer.
    * @alias appengine.apps.authorizedDomains.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.appsId Part of `parent`. Name of the parent Application resource. Example: apps/myapp.
    * @param {integer=} params.pageSize Maximum results to return per page.
    * @param {string=} params.pageToken Continuation token for fetching the next page of results.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ListAuthorizedDomainsResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListAuthorizedDomainsResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarAppsDollarAuthorizeddomainsDollarList): GaxiosPromise[Schema$ListAuthorizedDomainsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarAppsDollarAuthorizeddomainsDollarList,
    callback: BodyResponseCallback[Schema$ListAuthorizedDomainsResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarAppsDollarAuthorizeddomainsDollarList,
    options: BodyResponseCallback[Schema$ListAuthorizedDomainsResponse],
    callback: BodyResponseCallback[Schema$ListAuthorizedDomainsResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarAppsDollarAuthorizeddomainsDollarList, options: MethodOptions): GaxiosPromise[Schema$ListAuthorizedDomainsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarAppsDollarAuthorizeddomainsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListAuthorizedDomainsResponse]
  ): Unit = js.native
}

