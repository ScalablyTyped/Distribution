package typings.googleapis.buildSrcApisAdexchangebuyer2V2beta1Mod.adexchangebuyer2_v2beta1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/adexchangebuyer2/v2beta1", "adexchangebuyer2_v2beta1.Resource$Accounts$Clients")
@js.native
class ResourceDollarAccountsDollarClients protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  var invitations: ResourceDollarAccountsDollarClientsDollarInvitations = js.native
  var users: ResourceDollarAccountsDollarClientsDollarUsers = js.native
  /**
    * adexchangebuyer2.accounts.clients.create
    * @desc Creates a new client buyer.
    * @alias adexchangebuyer2.accounts.clients.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Unique numerical account ID for the buyer of which the client buyer is a customer; the sponsor buyer to create a client for. (required)
    * @param {().Client} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[Schema$Client] = js.native
  def create(callback: BodyResponseCallback[Schema$Client]): Unit = js.native
  def create(params: ParamsDollarResourceDollarAccountsDollarClientsDollarCreate): GaxiosPromise[Schema$Client] = js.native
  def create(
    params: ParamsDollarResourceDollarAccountsDollarClientsDollarCreate,
    callback: BodyResponseCallback[Schema$Client]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarAccountsDollarClientsDollarCreate,
    options: BodyResponseCallback[Schema$Client],
    callback: BodyResponseCallback[Schema$Client]
  ): Unit = js.native
  def create(params: ParamsDollarResourceDollarAccountsDollarClientsDollarCreate, options: MethodOptions): GaxiosPromise[Schema$Client] = js.native
  def create(
    params: ParamsDollarResourceDollarAccountsDollarClientsDollarCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Client]
  ): Unit = js.native
  /**
    * adexchangebuyer2.accounts.clients.get
    * @desc Gets a client buyer with a given client account ID.
    * @alias adexchangebuyer2.accounts.clients.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Numerical account ID of the client's sponsor buyer. (required)
    * @param {string} params.clientAccountId Numerical account ID of the client buyer to retrieve. (required)
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Client] = js.native
  def get(callback: BodyResponseCallback[Schema$Client]): Unit = js.native
  def get(params: ParamsDollarResourceDollarAccountsDollarClientsDollarGet): GaxiosPromise[Schema$Client] = js.native
  def get(
    params: ParamsDollarResourceDollarAccountsDollarClientsDollarGet,
    callback: BodyResponseCallback[Schema$Client]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarAccountsDollarClientsDollarGet,
    options: BodyResponseCallback[Schema$Client],
    callback: BodyResponseCallback[Schema$Client]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarAccountsDollarClientsDollarGet, options: MethodOptions): GaxiosPromise[Schema$Client] = js.native
  def get(
    params: ParamsDollarResourceDollarAccountsDollarClientsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Client]
  ): Unit = js.native
  /**
    * adexchangebuyer2.accounts.clients.list
    * @desc Lists all the clients for the current sponsor buyer.
    * @alias adexchangebuyer2.accounts.clients.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Unique numerical account ID of the sponsor buyer to list the clients for.
    * @param {integer=} params.pageSize Requested page size. The server may return fewer clients than requested. If unspecified, the server will pick an appropriate default.
    * @param {string=} params.pageToken A token identifying a page of results the server should return. Typically, this is the value of ListClientsResponse.nextPageToken returned from the previous call to the accounts.clients.list method.
    * @param {string=} params.partnerClientId Optional unique identifier (from the standpoint of an Ad Exchange sponsor buyer partner) of the client to return. If specified, at most one client will be returned in the response.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ListClientsResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListClientsResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarAccountsDollarClientsDollarList): GaxiosPromise[Schema$ListClientsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarAccountsDollarClientsDollarList,
    callback: BodyResponseCallback[Schema$ListClientsResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarAccountsDollarClientsDollarList,
    options: BodyResponseCallback[Schema$ListClientsResponse],
    callback: BodyResponseCallback[Schema$ListClientsResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarAccountsDollarClientsDollarList, options: MethodOptions): GaxiosPromise[Schema$ListClientsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarAccountsDollarClientsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListClientsResponse]
  ): Unit = js.native
  /**
    * adexchangebuyer2.accounts.clients.update
    * @desc Updates an existing client buyer.
    * @alias adexchangebuyer2.accounts.clients.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Unique numerical account ID for the buyer of which the client buyer is a customer; the sponsor buyer to update a client for. (required)
    * @param {string} params.clientAccountId Unique numerical account ID of the client to update. (required)
    * @param {().Client} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[Schema$Client] = js.native
  def update(callback: BodyResponseCallback[Schema$Client]): Unit = js.native
  def update(params: ParamsDollarResourceDollarAccountsDollarClientsDollarUpdate): GaxiosPromise[Schema$Client] = js.native
  def update(
    params: ParamsDollarResourceDollarAccountsDollarClientsDollarUpdate,
    callback: BodyResponseCallback[Schema$Client]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarAccountsDollarClientsDollarUpdate,
    options: BodyResponseCallback[Schema$Client],
    callback: BodyResponseCallback[Schema$Client]
  ): Unit = js.native
  def update(params: ParamsDollarResourceDollarAccountsDollarClientsDollarUpdate, options: MethodOptions): GaxiosPromise[Schema$Client] = js.native
  def update(
    params: ParamsDollarResourceDollarAccountsDollarClientsDollarUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Client]
  ): Unit = js.native
}

