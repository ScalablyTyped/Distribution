package typings.googleapis.buildSrcApisAccesscontextmanagerV1betaMod.accesscontextmanager_v1beta

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/accesscontextmanager/v1beta", "accesscontextmanager_v1beta.Resource$Accesspolicies$Serviceperimeters")
@js.native
class ResourceDollarAccesspoliciesDollarServiceperimeters protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * accesscontextmanager.accessPolicies.servicePerimeters.create
    * @desc Create an Service Perimeter. The longrunning operation from this
    * RPC will have a successful status once the Service Perimeter has
    * propagated to long-lasting storage. Service Perimeters containing errors
    * will result in an error response for the first error encountered.
    * @alias accesscontextmanager.accessPolicies.servicePerimeters.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent Required. Resource name for the access policy which owns this Service Perimeter.  Format: `accessPolicies/{policy_id}`
    * @param {().ServicePerimeter} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[Schema$Operation] = js.native
  def create(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def create(params: ParamsDollarResourceDollarAccesspoliciesDollarServiceperimetersDollarCreate): GaxiosPromise[Schema$Operation] = js.native
  def create(
    params: ParamsDollarResourceDollarAccesspoliciesDollarServiceperimetersDollarCreate,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarAccesspoliciesDollarServiceperimetersDollarCreate,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarAccesspoliciesDollarServiceperimetersDollarCreate,
    options: MethodOptions
  ): GaxiosPromise[Schema$Operation] = js.native
  def create(
    params: ParamsDollarResourceDollarAccesspoliciesDollarServiceperimetersDollarCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * accesscontextmanager.accessPolicies.servicePerimeters.delete
    * @desc Delete an Service Perimeter by resource name. The longrunning
    * operation from this RPC will have a successful status once the Service
    * Perimeter has been removed from long-lasting storage.
    * @alias accesscontextmanager.accessPolicies.servicePerimeters.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Required. Resource name for the Service Perimeter.  Format: `accessPolicies/{policy_id}/servicePerimeters/{service_perimeter_id}`
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Schema$Operation] = js.native
  def delete(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarAccesspoliciesDollarServiceperimetersDollarDelete): GaxiosPromise[Schema$Operation] = js.native
  def delete(
    params: ParamsDollarResourceDollarAccesspoliciesDollarServiceperimetersDollarDelete,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarAccesspoliciesDollarServiceperimetersDollarDelete,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarAccesspoliciesDollarServiceperimetersDollarDelete,
    options: MethodOptions
  ): GaxiosPromise[Schema$Operation] = js.native
  def delete(
    params: ParamsDollarResourceDollarAccesspoliciesDollarServiceperimetersDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * accesscontextmanager.accessPolicies.servicePerimeters.get
    * @desc Get an Service Perimeter by resource name.
    * @alias accesscontextmanager.accessPolicies.servicePerimeters.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Required. Resource name for the Service Perimeter.  Format: `accessPolicies/{policy_id}/servicePerimeters/{service_perimeters_id}`
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$ServicePerimeter] = js.native
  def get(callback: BodyResponseCallback[Schema$ServicePerimeter]): Unit = js.native
  def get(params: ParamsDollarResourceDollarAccesspoliciesDollarServiceperimetersDollarGet): GaxiosPromise[Schema$ServicePerimeter] = js.native
  def get(
    params: ParamsDollarResourceDollarAccesspoliciesDollarServiceperimetersDollarGet,
    callback: BodyResponseCallback[Schema$ServicePerimeter]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarAccesspoliciesDollarServiceperimetersDollarGet,
    options: BodyResponseCallback[Schema$ServicePerimeter],
    callback: BodyResponseCallback[Schema$ServicePerimeter]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarAccesspoliciesDollarServiceperimetersDollarGet,
    options: MethodOptions
  ): GaxiosPromise[Schema$ServicePerimeter] = js.native
  def get(
    params: ParamsDollarResourceDollarAccesspoliciesDollarServiceperimetersDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ServicePerimeter]
  ): Unit = js.native
  /**
    * accesscontextmanager.accessPolicies.servicePerimeters.list
    * @desc List all Service Perimeters for an access policy.
    * @alias accesscontextmanager.accessPolicies.servicePerimeters.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.pageSize Number of Service Perimeters to include in the list. Default 100.
    * @param {string=} params.pageToken Next page token for the next batch of Service Perimeter instances. Defaults to the first page of results.
    * @param {string} params.parent Required. Resource name for the access policy to list Service Perimeters from.  Format: `accessPolicies/{policy_id}`
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ListServicePerimetersResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListServicePerimetersResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarAccesspoliciesDollarServiceperimetersDollarList): GaxiosPromise[Schema$ListServicePerimetersResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarAccesspoliciesDollarServiceperimetersDollarList,
    callback: BodyResponseCallback[Schema$ListServicePerimetersResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarAccesspoliciesDollarServiceperimetersDollarList,
    options: BodyResponseCallback[Schema$ListServicePerimetersResponse],
    callback: BodyResponseCallback[Schema$ListServicePerimetersResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarAccesspoliciesDollarServiceperimetersDollarList,
    options: MethodOptions
  ): GaxiosPromise[Schema$ListServicePerimetersResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarAccesspoliciesDollarServiceperimetersDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListServicePerimetersResponse]
  ): Unit = js.native
  /**
    * accesscontextmanager.accessPolicies.servicePerimeters.patch
    * @desc Update an Service Perimeter. The longrunning operation from this
    * RPC will have a successful status once the changes to the Service
    * Perimeter have propagated to long-lasting storage. Service Perimeter
    * containing errors will result in an error response for the first error
    * encountered.
    * @alias accesscontextmanager.accessPolicies.servicePerimeters.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Required. Resource name for the ServicePerimeter.  The `short_name` component must begin with a letter and only include alphanumeric and '_'. Format: `accessPolicies/{policy_id}/servicePerimeters/{short_name}`
    * @param {string=} params.updateMask Required. Mask to control which fields get updated. Must be non-empty.
    * @param {().ServicePerimeter} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[Schema$Operation] = js.native
  def patch(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def patch(params: ParamsDollarResourceDollarAccesspoliciesDollarServiceperimetersDollarPatch): GaxiosPromise[Schema$Operation] = js.native
  def patch(
    params: ParamsDollarResourceDollarAccesspoliciesDollarServiceperimetersDollarPatch,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarAccesspoliciesDollarServiceperimetersDollarPatch,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarAccesspoliciesDollarServiceperimetersDollarPatch,
    options: MethodOptions
  ): GaxiosPromise[Schema$Operation] = js.native
  def patch(
    params: ParamsDollarResourceDollarAccesspoliciesDollarServiceperimetersDollarPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
}

