package typings.googleapis.buildSrcApisFirebasehostingV1beta1Mod.firebasehosting_v1beta1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/firebasehosting/v1beta1", "firebasehosting_v1beta1.Resource$Sites$Domains")
@js.native
class ResourceDollarSitesDollarDomains protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * firebasehosting.sites.domains.create
    * @desc Creates a domain mapping on the specified site.
    * @alias firebasehosting.sites.domains.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent Required. The parent to create the domain association for, in the format: <code>sites/<var>site-name</var></code>
    * @param {().Domain} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[Schema$Domain] = js.native
  def create(callback: BodyResponseCallback[Schema$Domain]): Unit = js.native
  def create(params: ParamsDollarResourceDollarSitesDollarDomainsDollarCreate): GaxiosPromise[Schema$Domain] = js.native
  def create(
    params: ParamsDollarResourceDollarSitesDollarDomainsDollarCreate,
    callback: BodyResponseCallback[Schema$Domain]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarSitesDollarDomainsDollarCreate,
    options: BodyResponseCallback[Schema$Domain],
    callback: BodyResponseCallback[Schema$Domain]
  ): Unit = js.native
  def create(params: ParamsDollarResourceDollarSitesDollarDomainsDollarCreate, options: MethodOptions): GaxiosPromise[Schema$Domain] = js.native
  def create(
    params: ParamsDollarResourceDollarSitesDollarDomainsDollarCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Domain]
  ): Unit = js.native
  /**
    * firebasehosting.sites.domains.delete
    * @desc Deletes the existing domain mapping on the specified site.
    * @alias firebasehosting.sites.domains.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Required. The name of the domain association to delete.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Schema$Empty] = js.native
  def delete(callback: BodyResponseCallback[Schema$Empty]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarSitesDollarDomainsDollarDelete): GaxiosPromise[Schema$Empty] = js.native
  def delete(
    params: ParamsDollarResourceDollarSitesDollarDomainsDollarDelete,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarSitesDollarDomainsDollarDelete,
    options: BodyResponseCallback[Schema$Empty],
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarSitesDollarDomainsDollarDelete, options: MethodOptions): GaxiosPromise[Schema$Empty] = js.native
  def delete(
    params: ParamsDollarResourceDollarSitesDollarDomainsDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  /**
    * firebasehosting.sites.domains.get
    * @desc Gets a domain mapping on the specified site.
    * @alias firebasehosting.sites.domains.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Required. The name of the domain configuration to get.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Domain] = js.native
  def get(callback: BodyResponseCallback[Schema$Domain]): Unit = js.native
  def get(params: ParamsDollarResourceDollarSitesDollarDomainsDollarGet): GaxiosPromise[Schema$Domain] = js.native
  def get(
    params: ParamsDollarResourceDollarSitesDollarDomainsDollarGet,
    callback: BodyResponseCallback[Schema$Domain]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarSitesDollarDomainsDollarGet,
    options: BodyResponseCallback[Schema$Domain],
    callback: BodyResponseCallback[Schema$Domain]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarSitesDollarDomainsDollarGet, options: MethodOptions): GaxiosPromise[Schema$Domain] = js.native
  def get(
    params: ParamsDollarResourceDollarSitesDollarDomainsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Domain]
  ): Unit = js.native
  /**
    * firebasehosting.sites.domains.list
    * @desc Lists the domains for the specified site.
    * @alias firebasehosting.sites.domains.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.pageSize The page size to return. Defaults to 50.
    * @param {string=} params.pageToken The next_page_token from a previous request, if provided.
    * @param {string} params.parent Required. The parent for which to list domains, in the format: <code>sites/<var>site-name</var></code>
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ListDomainsResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListDomainsResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarSitesDollarDomainsDollarList): GaxiosPromise[Schema$ListDomainsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarSitesDollarDomainsDollarList,
    callback: BodyResponseCallback[Schema$ListDomainsResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarSitesDollarDomainsDollarList,
    options: BodyResponseCallback[Schema$ListDomainsResponse],
    callback: BodyResponseCallback[Schema$ListDomainsResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarSitesDollarDomainsDollarList, options: MethodOptions): GaxiosPromise[Schema$ListDomainsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarSitesDollarDomainsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListDomainsResponse]
  ): Unit = js.native
  /**
    * firebasehosting.sites.domains.update
    * @desc Updates the specified domain mapping, creating the mapping as if it
    * does not exist.
    * @alias firebasehosting.sites.domains.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Required. The name of the domain association to update or create, if an association doesn't already exist.
    * @param {().Domain} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[Schema$Domain] = js.native
  def update(callback: BodyResponseCallback[Schema$Domain]): Unit = js.native
  def update(params: ParamsDollarResourceDollarSitesDollarDomainsDollarUpdate): GaxiosPromise[Schema$Domain] = js.native
  def update(
    params: ParamsDollarResourceDollarSitesDollarDomainsDollarUpdate,
    callback: BodyResponseCallback[Schema$Domain]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarSitesDollarDomainsDollarUpdate,
    options: BodyResponseCallback[Schema$Domain],
    callback: BodyResponseCallback[Schema$Domain]
  ): Unit = js.native
  def update(params: ParamsDollarResourceDollarSitesDollarDomainsDollarUpdate, options: MethodOptions): GaxiosPromise[Schema$Domain] = js.native
  def update(
    params: ParamsDollarResourceDollarSitesDollarDomainsDollarUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Domain]
  ): Unit = js.native
}

