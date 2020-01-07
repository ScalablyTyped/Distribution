package typings.googleapis.buildSrcApisAdminDirectoryUnderscoreV1Mod.admin_directory_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/admin/directory_v1", "admin_directory_v1.Resource$Domainaliases")
@js.native
class Resource$Domainaliases protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * directory.domainAliases.delete
    * @desc Deletes a Domain Alias of the customer.
    * @alias directory.domainAliases.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.customer Immutable ID of the G Suite account.
    * @param {string} params.domainAliasName Name of domain alias to be retrieved.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarDomainaliasesDollarDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsDollarResourceDollarDomainaliasesDollarDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarDomainaliasesDollarDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarDomainaliasesDollarDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsDollarResourceDollarDomainaliasesDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * directory.domainAliases.get
    * @desc Retrieves a domain alias of the customer.
    * @alias directory.domainAliases.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.customer Immutable ID of the G Suite account.
    * @param {string} params.domainAliasName Name of domain alias to be retrieved.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$DomainAlias] = js.native
  def get(callback: BodyResponseCallback[Schema$DomainAlias]): Unit = js.native
  def get(params: ParamsDollarResourceDollarDomainaliasesDollarGet): GaxiosPromise[Schema$DomainAlias] = js.native
  def get(
    params: ParamsDollarResourceDollarDomainaliasesDollarGet,
    callback: BodyResponseCallback[Schema$DomainAlias]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarDomainaliasesDollarGet,
    options: BodyResponseCallback[Schema$DomainAlias],
    callback: BodyResponseCallback[Schema$DomainAlias]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarDomainaliasesDollarGet, options: MethodOptions): GaxiosPromise[Schema$DomainAlias] = js.native
  def get(
    params: ParamsDollarResourceDollarDomainaliasesDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$DomainAlias]
  ): Unit = js.native
  /**
    * directory.domainAliases.insert
    * @desc Inserts a Domain alias of the customer.
    * @alias directory.domainAliases.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.customer Immutable ID of the G Suite account.
    * @param {().DomainAlias} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[Schema$DomainAlias] = js.native
  def insert(callback: BodyResponseCallback[Schema$DomainAlias]): Unit = js.native
  def insert(params: ParamsDollarResourceDollarDomainaliasesDollarInsert): GaxiosPromise[Schema$DomainAlias] = js.native
  def insert(
    params: ParamsDollarResourceDollarDomainaliasesDollarInsert,
    callback: BodyResponseCallback[Schema$DomainAlias]
  ): Unit = js.native
  def insert(
    params: ParamsDollarResourceDollarDomainaliasesDollarInsert,
    options: BodyResponseCallback[Schema$DomainAlias],
    callback: BodyResponseCallback[Schema$DomainAlias]
  ): Unit = js.native
  def insert(params: ParamsDollarResourceDollarDomainaliasesDollarInsert, options: MethodOptions): GaxiosPromise[Schema$DomainAlias] = js.native
  def insert(
    params: ParamsDollarResourceDollarDomainaliasesDollarInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$DomainAlias]
  ): Unit = js.native
  /**
    * directory.domainAliases.list
    * @desc Lists the domain aliases of the customer.
    * @alias directory.domainAliases.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.customer Immutable ID of the G Suite account.
    * @param {string=} params.parentDomainName Name of the parent domain for which domain aliases are to be fetched.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$DomainAliases] = js.native
  def list(callback: BodyResponseCallback[Schema$DomainAliases]): Unit = js.native
  def list(params: ParamsDollarResourceDollarDomainaliasesDollarList): GaxiosPromise[Schema$DomainAliases] = js.native
  def list(
    params: ParamsDollarResourceDollarDomainaliasesDollarList,
    callback: BodyResponseCallback[Schema$DomainAliases]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarDomainaliasesDollarList,
    options: BodyResponseCallback[Schema$DomainAliases],
    callback: BodyResponseCallback[Schema$DomainAliases]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarDomainaliasesDollarList, options: MethodOptions): GaxiosPromise[Schema$DomainAliases] = js.native
  def list(
    params: ParamsDollarResourceDollarDomainaliasesDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$DomainAliases]
  ): Unit = js.native
}

