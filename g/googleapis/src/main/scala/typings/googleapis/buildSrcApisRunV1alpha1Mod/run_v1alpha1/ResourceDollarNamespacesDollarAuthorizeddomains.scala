package typings.googleapis.buildSrcApisRunV1alpha1Mod.run_v1alpha1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/run/v1alpha1", "run_v1alpha1.Resource$Namespaces$Authorizeddomains")
@js.native
class ResourceDollarNamespacesDollarAuthorizeddomains protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * run.namespaces.authorizeddomains.list
    * @desc RPC to list authorized domains.
    * @alias run.namespaces.authorizeddomains.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.pageSize Maximum results to return per page.
    * @param {string=} params.pageToken Continuation token for fetching the next page of results.
    * @param {string} params.parent Name of the parent Application resource. Example: `apps/myapp`.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ListAuthorizedDomainsResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListAuthorizedDomainsResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarNamespacesDollarAuthorizeddomainsDollarList): GaxiosPromise[Schema$ListAuthorizedDomainsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarNamespacesDollarAuthorizeddomainsDollarList,
    callback: BodyResponseCallback[Schema$ListAuthorizedDomainsResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarNamespacesDollarAuthorizeddomainsDollarList,
    options: BodyResponseCallback[Schema$ListAuthorizedDomainsResponse],
    callback: BodyResponseCallback[Schema$ListAuthorizedDomainsResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarNamespacesDollarAuthorizeddomainsDollarList,
    options: MethodOptions
  ): GaxiosPromise[Schema$ListAuthorizedDomainsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarNamespacesDollarAuthorizeddomainsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListAuthorizedDomainsResponse]
  ): Unit = js.native
}

