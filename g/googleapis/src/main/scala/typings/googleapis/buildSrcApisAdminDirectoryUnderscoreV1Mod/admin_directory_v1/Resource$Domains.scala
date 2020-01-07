package typings.googleapis.buildSrcApisAdminDirectoryUnderscoreV1Mod.admin_directory_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/admin/directory_v1", "admin_directory_v1.Resource$Domains")
@js.native
class Resource$Domains protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * directory.domains.delete
    * @desc Deletes a domain of the customer.
    * @alias directory.domains.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.customer Immutable ID of the G Suite account.
    * @param {string} params.domainName Name of domain to be deleted
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarDomainsDollarDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsDollarResourceDollarDomainsDollarDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarDomainsDollarDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarDomainsDollarDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsDollarResourceDollarDomainsDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * directory.domains.get
    * @desc Retrieves a domain of the customer.
    * @alias directory.domains.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.customer Immutable ID of the G Suite account.
    * @param {string} params.domainName Name of domain to be retrieved
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Domains] = js.native
  def get(callback: BodyResponseCallback[Schema$Domains]): Unit = js.native
  def get(params: ParamsDollarResourceDollarDomainsDollarGet): GaxiosPromise[Schema$Domains] = js.native
  def get(params: ParamsDollarResourceDollarDomainsDollarGet, callback: BodyResponseCallback[Schema$Domains]): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarDomainsDollarGet,
    options: BodyResponseCallback[Schema$Domains],
    callback: BodyResponseCallback[Schema$Domains]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarDomainsDollarGet, options: MethodOptions): GaxiosPromise[Schema$Domains] = js.native
  def get(
    params: ParamsDollarResourceDollarDomainsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Domains]
  ): Unit = js.native
  /**
    * directory.domains.insert
    * @desc Inserts a domain of the customer.
    * @alias directory.domains.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.customer Immutable ID of the G Suite account.
    * @param {().Domains} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[Schema$Domains] = js.native
  def insert(callback: BodyResponseCallback[Schema$Domains]): Unit = js.native
  def insert(params: ParamsDollarResourceDollarDomainsDollarInsert): GaxiosPromise[Schema$Domains] = js.native
  def insert(
    params: ParamsDollarResourceDollarDomainsDollarInsert,
    callback: BodyResponseCallback[Schema$Domains]
  ): Unit = js.native
  def insert(
    params: ParamsDollarResourceDollarDomainsDollarInsert,
    options: BodyResponseCallback[Schema$Domains],
    callback: BodyResponseCallback[Schema$Domains]
  ): Unit = js.native
  def insert(params: ParamsDollarResourceDollarDomainsDollarInsert, options: MethodOptions): GaxiosPromise[Schema$Domains] = js.native
  def insert(
    params: ParamsDollarResourceDollarDomainsDollarInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Domains]
  ): Unit = js.native
  /**
    * directory.domains.list
    * @desc Lists the domains of the customer.
    * @alias directory.domains.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.customer Immutable ID of the G Suite account.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$Domains2] = js.native
  def list(callback: BodyResponseCallback[Schema$Domains2]): Unit = js.native
  def list(params: ParamsDollarResourceDollarDomainsDollarList): GaxiosPromise[Schema$Domains2] = js.native
  def list(
    params: ParamsDollarResourceDollarDomainsDollarList,
    callback: BodyResponseCallback[Schema$Domains2]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarDomainsDollarList,
    options: BodyResponseCallback[Schema$Domains2],
    callback: BodyResponseCallback[Schema$Domains2]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarDomainsDollarList, options: MethodOptions): GaxiosPromise[Schema$Domains2] = js.native
  def list(
    params: ParamsDollarResourceDollarDomainsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Domains2]
  ): Unit = js.native
}

