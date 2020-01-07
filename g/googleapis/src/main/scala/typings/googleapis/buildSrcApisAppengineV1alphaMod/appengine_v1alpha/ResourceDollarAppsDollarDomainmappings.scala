package typings.googleapis.buildSrcApisAppengineV1alphaMod.appengine_v1alpha

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/appengine/v1alpha", "appengine_v1alpha.Resource$Apps$Domainmappings")
@js.native
class ResourceDollarAppsDollarDomainmappings protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * appengine.apps.domainMappings.create
    * @desc Maps a domain to an application. A user must be authorized to
    * administer a domain in order to map it to an application. For a list of
    * available authorized domains, see
    * AuthorizedDomains.ListAuthorizedDomains.
    * @alias appengine.apps.domainMappings.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.appsId Part of `parent`. Name of the parent Application resource. Example: apps/myapp.
    * @param {boolean=} params.noManagedCertificate Whether a managed certificate should be provided by App Engine. If true, a certificate ID must be manaually set in the DomainMapping resource to configure SSL for this domain. If false, a managed certificate will be provisioned and a certificate ID will be automatically populated.
    * @param {string=} params.overrideStrategy Whether the domain creation should override any existing mappings for this domain. By default, overrides are rejected.
    * @param {().DomainMapping} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[Schema$Operation] = js.native
  def create(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def create(params: ParamsDollarResourceDollarAppsDollarDomainmappingsDollarCreate): GaxiosPromise[Schema$Operation] = js.native
  def create(
    params: ParamsDollarResourceDollarAppsDollarDomainmappingsDollarCreate,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarAppsDollarDomainmappingsDollarCreate,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def create(params: ParamsDollarResourceDollarAppsDollarDomainmappingsDollarCreate, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def create(
    params: ParamsDollarResourceDollarAppsDollarDomainmappingsDollarCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * appengine.apps.domainMappings.delete
    * @desc Deletes the specified domain mapping. A user must be authorized to
    * administer the associated domain in order to delete a DomainMapping
    * resource.
    * @alias appengine.apps.domainMappings.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.appsId Part of `name`. Name of the resource to delete. Example: apps/myapp/domainMappings/example.com.
    * @param {string} params.domainMappingsId Part of `name`. See documentation of `appsId`.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Schema$Operation] = js.native
  def delete(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarAppsDollarDomainmappingsDollarDelete): GaxiosPromise[Schema$Operation] = js.native
  def delete(
    params: ParamsDollarResourceDollarAppsDollarDomainmappingsDollarDelete,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarAppsDollarDomainmappingsDollarDelete,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarAppsDollarDomainmappingsDollarDelete, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def delete(
    params: ParamsDollarResourceDollarAppsDollarDomainmappingsDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * appengine.apps.domainMappings.get
    * @desc Gets the specified domain mapping.
    * @alias appengine.apps.domainMappings.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.appsId Part of `name`. Name of the resource requested. Example: apps/myapp/domainMappings/example.com.
    * @param {string} params.domainMappingsId Part of `name`. See documentation of `appsId`.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$DomainMapping] = js.native
  def get(callback: BodyResponseCallback[Schema$DomainMapping]): Unit = js.native
  def get(params: ParamsDollarResourceDollarAppsDollarDomainmappingsDollarGet): GaxiosPromise[Schema$DomainMapping] = js.native
  def get(
    params: ParamsDollarResourceDollarAppsDollarDomainmappingsDollarGet,
    callback: BodyResponseCallback[Schema$DomainMapping]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarAppsDollarDomainmappingsDollarGet,
    options: BodyResponseCallback[Schema$DomainMapping],
    callback: BodyResponseCallback[Schema$DomainMapping]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarAppsDollarDomainmappingsDollarGet, options: MethodOptions): GaxiosPromise[Schema$DomainMapping] = js.native
  def get(
    params: ParamsDollarResourceDollarAppsDollarDomainmappingsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$DomainMapping]
  ): Unit = js.native
  /**
    * appengine.apps.domainMappings.list
    * @desc Lists the domain mappings on an application.
    * @alias appengine.apps.domainMappings.list
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
  def list(): GaxiosPromise[Schema$ListDomainMappingsResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListDomainMappingsResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarAppsDollarDomainmappingsDollarList): GaxiosPromise[Schema$ListDomainMappingsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarAppsDollarDomainmappingsDollarList,
    callback: BodyResponseCallback[Schema$ListDomainMappingsResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarAppsDollarDomainmappingsDollarList,
    options: BodyResponseCallback[Schema$ListDomainMappingsResponse],
    callback: BodyResponseCallback[Schema$ListDomainMappingsResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarAppsDollarDomainmappingsDollarList, options: MethodOptions): GaxiosPromise[Schema$ListDomainMappingsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarAppsDollarDomainmappingsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListDomainMappingsResponse]
  ): Unit = js.native
  /**
    * appengine.apps.domainMappings.patch
    * @desc Updates the specified domain mapping. To map an SSL certificate to
    * a domain mapping, update certificate_id to point to an
    * AuthorizedCertificate resource. A user must be authorized to administer
    * the associated domain in order to update a DomainMapping resource.
    * @alias appengine.apps.domainMappings.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.appsId Part of `name`. Name of the resource to update. Example: apps/myapp/domainMappings/example.com.
    * @param {string} params.domainMappingsId Part of `name`. See documentation of `appsId`.
    * @param {boolean=} params.noManagedCertificate Whether a managed certificate should be provided by App Engine. If true, a certificate ID must be manually set in the DomainMapping resource to configure SSL for this domain. If false, a managed certificate will be provisioned and a certificate ID will be automatically populated. Only applicable if ssl_settings.certificate_id is specified in the update mask.
    * @param {string=} params.updateMask Standard field mask for the set of fields to be updated.
    * @param {().DomainMapping} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[Schema$Operation] = js.native
  def patch(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def patch(params: ParamsDollarResourceDollarAppsDollarDomainmappingsDollarPatch): GaxiosPromise[Schema$Operation] = js.native
  def patch(
    params: ParamsDollarResourceDollarAppsDollarDomainmappingsDollarPatch,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarAppsDollarDomainmappingsDollarPatch,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def patch(params: ParamsDollarResourceDollarAppsDollarDomainmappingsDollarPatch, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def patch(
    params: ParamsDollarResourceDollarAppsDollarDomainmappingsDollarPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
}

