package typings.googleapis.buildSrcApisDnsV1beta2Mod.dns_v1beta2

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/dns/v1beta2", "dns_v1beta2.Resource$Policies")
@js.native
class Resource$Policies protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * dns.policies.create
    * @alias dns.policies.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.clientOperationId
    * @param {string} params.project
    * @param {().Policy} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[Schema$Policy] = js.native
  def create(callback: BodyResponseCallback[Schema$Policy]): Unit = js.native
  def create(params: ParamsDollarResourceDollarPoliciesDollarCreate): GaxiosPromise[Schema$Policy] = js.native
  def create(
    params: ParamsDollarResourceDollarPoliciesDollarCreate,
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarPoliciesDollarCreate,
    options: BodyResponseCallback[Schema$Policy],
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  def create(params: ParamsDollarResourceDollarPoliciesDollarCreate, options: MethodOptions): GaxiosPromise[Schema$Policy] = js.native
  def create(
    params: ParamsDollarResourceDollarPoliciesDollarCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  /**
    * dns.policies.delete
    * @alias dns.policies.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.clientOperationId
    * @param {string} params.policy
    * @param {string} params.project
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarPoliciesDollarDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsDollarResourceDollarPoliciesDollarDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarPoliciesDollarDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarPoliciesDollarDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsDollarResourceDollarPoliciesDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * dns.policies.get
    * @alias dns.policies.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.clientOperationId
    * @param {string} params.policy
    * @param {string} params.project
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Policy] = js.native
  def get(callback: BodyResponseCallback[Schema$Policy]): Unit = js.native
  def get(params: ParamsDollarResourceDollarPoliciesDollarGet): GaxiosPromise[Schema$Policy] = js.native
  def get(params: ParamsDollarResourceDollarPoliciesDollarGet, callback: BodyResponseCallback[Schema$Policy]): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarPoliciesDollarGet,
    options: BodyResponseCallback[Schema$Policy],
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarPoliciesDollarGet, options: MethodOptions): GaxiosPromise[Schema$Policy] = js.native
  def get(
    params: ParamsDollarResourceDollarPoliciesDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  /**
    * dns.policies.list
    * @alias dns.policies.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.maxResults
    * @param {string=} params.pageToken
    * @param {string} params.project
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$PoliciesListResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$PoliciesListResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarPoliciesDollarList): GaxiosPromise[Schema$PoliciesListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarPoliciesDollarList,
    callback: BodyResponseCallback[Schema$PoliciesListResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarPoliciesDollarList,
    options: BodyResponseCallback[Schema$PoliciesListResponse],
    callback: BodyResponseCallback[Schema$PoliciesListResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarPoliciesDollarList, options: MethodOptions): GaxiosPromise[Schema$PoliciesListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarPoliciesDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$PoliciesListResponse]
  ): Unit = js.native
  /**
    * dns.policies.patch
    * @alias dns.policies.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.clientOperationId
    * @param {string} params.policy
    * @param {string} params.project
    * @param {().Policy} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[Schema$PoliciesPatchResponse] = js.native
  def patch(callback: BodyResponseCallback[Schema$PoliciesPatchResponse]): Unit = js.native
  def patch(params: ParamsDollarResourceDollarPoliciesDollarPatch): GaxiosPromise[Schema$PoliciesPatchResponse] = js.native
  def patch(
    params: ParamsDollarResourceDollarPoliciesDollarPatch,
    callback: BodyResponseCallback[Schema$PoliciesPatchResponse]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarPoliciesDollarPatch,
    options: BodyResponseCallback[Schema$PoliciesPatchResponse],
    callback: BodyResponseCallback[Schema$PoliciesPatchResponse]
  ): Unit = js.native
  def patch(params: ParamsDollarResourceDollarPoliciesDollarPatch, options: MethodOptions): GaxiosPromise[Schema$PoliciesPatchResponse] = js.native
  def patch(
    params: ParamsDollarResourceDollarPoliciesDollarPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$PoliciesPatchResponse]
  ): Unit = js.native
  /**
    * dns.policies.update
    * @alias dns.policies.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.clientOperationId
    * @param {string} params.policy
    * @param {string} params.project
    * @param {().Policy} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[Schema$PoliciesUpdateResponse] = js.native
  def update(callback: BodyResponseCallback[Schema$PoliciesUpdateResponse]): Unit = js.native
  def update(params: ParamsDollarResourceDollarPoliciesDollarUpdate): GaxiosPromise[Schema$PoliciesUpdateResponse] = js.native
  def update(
    params: ParamsDollarResourceDollarPoliciesDollarUpdate,
    callback: BodyResponseCallback[Schema$PoliciesUpdateResponse]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarPoliciesDollarUpdate,
    options: BodyResponseCallback[Schema$PoliciesUpdateResponse],
    callback: BodyResponseCallback[Schema$PoliciesUpdateResponse]
  ): Unit = js.native
  def update(params: ParamsDollarResourceDollarPoliciesDollarUpdate, options: MethodOptions): GaxiosPromise[Schema$PoliciesUpdateResponse] = js.native
  def update(
    params: ParamsDollarResourceDollarPoliciesDollarUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$PoliciesUpdateResponse]
  ): Unit = js.native
}

