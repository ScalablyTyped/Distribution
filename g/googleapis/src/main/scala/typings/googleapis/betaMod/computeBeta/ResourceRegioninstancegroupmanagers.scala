package typings.googleapis.betaMod.computeBeta

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/compute/beta", "compute_beta.Resource$Regioninstancegroupmanagers")
@js.native
class ResourceRegioninstancegroupmanagers protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * compute.regionInstanceGroupManagers.abandonInstances
    * @desc Flags the specified instances to be immediately removed from the
    * managed instance group. Abandoning an instance does not delete the
    * instance, but it does remove the instance from any target pools that are
    * applied by the managed instance group. This method reduces the targetSize
    * of the managed instance group by the number of instances that you
    * abandon. This operation is marked as DONE when the action is scheduled
    * even if the instances have not yet been removed from the group. You must
    * separately verify the status of the abandoning action with the
    * listmanagedinstances method.  If the group is part of a backend service
    * that has enabled connection draining, it can take up to 60 seconds after
    * the connection draining duration has elapsed before the VM instance is
    * removed or deleted.  You can specify a maximum of 1000 instances with
    * this method per request.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Compute Engine API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/compute
    * // 2. This sample uses Application Default Credentials for
    * authentication.
    * //    If not already done, install the gcloud CLI from
    * //    https://cloud.google.com/sdk and run
    * //    `gcloud beta auth application-default login`.
    * //    For more information, see
    * //
    * https://developers.google.com/identity/protocols/application-default-credentials
    * // 3. Install the Node.js client library by running
    * //    `npm install googleapis --save`
    *
    * var google = require('googleapis');
    * var compute = google.compute('beta');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // Project ID for this request.
    *     project: 'my-project',  // TODO: Update placeholder value.
    *
    *     // Name of the region scoping this request.
    *     region: 'my-region',  // TODO: Update placeholder value.
    *
    *     // Name of the managed instance group.
    *     instanceGroupManager: 'my-instance-group-manager',  // TODO: Update
    * placeholder value.
    *
    *     resource: {
    *       // TODO: Add desired properties to the request body.
    *     },
    *
    *     auth: authClient,
    *   };
    *
    *   compute.regionInstanceGroupManagers.abandonInstances(request,
    * function(err, response) { if (err) { console.error(err); return;
    *     }
    *
    *     // TODO: Change code below to process the `response` object:
    *     console.log(JSON.stringify(response, null, 2));
    *   });
    * });
    *
    * function authorize(callback) {
    *   google.auth.getApplicationDefault(function(err, authClient) {
    *     if (err) {
    *       console.error('authentication failed: ', err);
    *       return;
    *     }
    *     if (authClient.createScopedRequired &&
    * authClient.createScopedRequired()) { var scopes =
    * ['https://www.googleapis.com/auth/cloud-platform']; authClient =
    * authClient.createScoped(scopes);
    *     }
    *     callback(authClient);
    *   });
    * }
    * @alias compute.regionInstanceGroupManagers.abandonInstances
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.instanceGroupManager Name of the managed instance group.
    * @param {string} params.project Project ID for this request.
    * @param {string} params.region Name of the region scoping this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {().RegionInstanceGroupManagersAbandonInstancesRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def abandonInstances(): GaxiosPromise[SchemaOperation] = js.native
  def abandonInstances(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def abandonInstances(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def abandonInstances(params: ParamsResourceRegioninstancegroupmanagersAbandoninstances): GaxiosPromise[SchemaOperation] = js.native
  def abandonInstances(
    params: ParamsResourceRegioninstancegroupmanagersAbandoninstances,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def abandonInstances(
    params: ParamsResourceRegioninstancegroupmanagersAbandoninstances,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def abandonInstances(params: ParamsResourceRegioninstancegroupmanagersAbandoninstances, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def abandonInstances(
    params: ParamsResourceRegioninstancegroupmanagersAbandoninstances,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * compute.regionInstanceGroupManagers.applyUpdatesToInstances
    * @desc Apply updates to selected instances the managed instance group.
    * @alias compute.regionInstanceGroupManagers.applyUpdatesToInstances
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.instanceGroupManager The name of the managed instance group, should conform to RFC1035.
    * @param {string} params.project Project ID for this request.
    * @param {string} params.region Name of the region scoping this request, should conform to RFC1035.
    * @param {().RegionInstanceGroupManagersApplyUpdatesRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def applyUpdatesToInstances(): GaxiosPromise[SchemaOperation] = js.native
  def applyUpdatesToInstances(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def applyUpdatesToInstances(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def applyUpdatesToInstances(params: ParamsResourceRegioninstancegroupmanagersApplyupdatestoinstances): GaxiosPromise[SchemaOperation] = js.native
  def applyUpdatesToInstances(
    params: ParamsResourceRegioninstancegroupmanagersApplyupdatestoinstances,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def applyUpdatesToInstances(
    params: ParamsResourceRegioninstancegroupmanagersApplyupdatestoinstances,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def applyUpdatesToInstances(params: ParamsResourceRegioninstancegroupmanagersApplyupdatestoinstances, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def applyUpdatesToInstances(
    params: ParamsResourceRegioninstancegroupmanagersApplyupdatestoinstances,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * compute.regionInstanceGroupManagers.delete
    * @desc Deletes the specified managed instance group and all of the
    * instances in that group.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Compute Engine API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/compute
    * // 2. This sample uses Application Default Credentials for
    * authentication.
    * //    If not already done, install the gcloud CLI from
    * //    https://cloud.google.com/sdk and run
    * //    `gcloud beta auth application-default login`.
    * //    For more information, see
    * //
    * https://developers.google.com/identity/protocols/application-default-credentials
    * // 3. Install the Node.js client library by running
    * //    `npm install googleapis --save`
    *
    * var google = require('googleapis');
    * var compute = google.compute('beta');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // Project ID for this request.
    *     project: 'my-project',  // TODO: Update placeholder value.
    *
    *     // Name of the region scoping this request.
    *     region: 'my-region',  // TODO: Update placeholder value.
    *
    *     // Name of the managed instance group to delete.
    *     instanceGroupManager: 'my-instance-group-manager',  // TODO: Update
    * placeholder value.
    *
    *     auth: authClient,
    *   };
    *
    *   compute.regionInstanceGroupManagers.delete(request, function(err,
    * response) { if (err) { console.error(err); return;
    *     }
    *
    *     // TODO: Change code below to process the `response` object:
    *     console.log(JSON.stringify(response, null, 2));
    *   });
    * });
    *
    * function authorize(callback) {
    *   google.auth.getApplicationDefault(function(err, authClient) {
    *     if (err) {
    *       console.error('authentication failed: ', err);
    *       return;
    *     }
    *     if (authClient.createScopedRequired &&
    * authClient.createScopedRequired()) { var scopes =
    * ['https://www.googleapis.com/auth/cloud-platform']; authClient =
    * authClient.createScoped(scopes);
    *     }
    *     callback(authClient);
    *   });
    * }
    * @alias compute.regionInstanceGroupManagers.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.instanceGroupManager Name of the managed instance group to delete.
    * @param {string} params.project Project ID for this request.
    * @param {string} params.region Name of the region scoping this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[SchemaOperation] = js.native
  def delete(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def delete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(params: ParamsResourceRegioninstancegroupmanagersDelete): GaxiosPromise[SchemaOperation] = js.native
  def delete(
    params: ParamsResourceRegioninstancegroupmanagersDelete,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def delete(
    params: ParamsResourceRegioninstancegroupmanagersDelete,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def delete(params: ParamsResourceRegioninstancegroupmanagersDelete, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(
    params: ParamsResourceRegioninstancegroupmanagersDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * compute.regionInstanceGroupManagers.deleteInstances
    * @desc Flags the specified instances in the managed instance group to be
    * immediately deleted. The instances are also removed from any target pools
    * of which they were a member. This method reduces the targetSize of the
    * managed instance group by the number of instances that you delete. The
    * deleteInstances operation is marked DONE if the deleteInstances request
    * is successful. The underlying actions take additional time. You must
    * separately verify the status of the deleting action with the
    * listmanagedinstances method.  If the group is part of a backend service
    * that has enabled connection draining, it can take up to 60 seconds after
    * the connection draining duration has elapsed before the VM instance is
    * removed or deleted.  You can specify a maximum of 1000 instances with
    * this method per request.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Compute Engine API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/compute
    * // 2. This sample uses Application Default Credentials for
    * authentication.
    * //    If not already done, install the gcloud CLI from
    * //    https://cloud.google.com/sdk and run
    * //    `gcloud beta auth application-default login`.
    * //    For more information, see
    * //
    * https://developers.google.com/identity/protocols/application-default-credentials
    * // 3. Install the Node.js client library by running
    * //    `npm install googleapis --save`
    *
    * var google = require('googleapis');
    * var compute = google.compute('beta');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // Project ID for this request.
    *     project: 'my-project',  // TODO: Update placeholder value.
    *
    *     // Name of the region scoping this request.
    *     region: 'my-region',  // TODO: Update placeholder value.
    *
    *     // Name of the managed instance group.
    *     instanceGroupManager: 'my-instance-group-manager',  // TODO: Update
    * placeholder value.
    *
    *     resource: {
    *       // TODO: Add desired properties to the request body.
    *     },
    *
    *     auth: authClient,
    *   };
    *
    *   compute.regionInstanceGroupManagers.deleteInstances(request,
    * function(err, response) { if (err) { console.error(err); return;
    *     }
    *
    *     // TODO: Change code below to process the `response` object:
    *     console.log(JSON.stringify(response, null, 2));
    *   });
    * });
    *
    * function authorize(callback) {
    *   google.auth.getApplicationDefault(function(err, authClient) {
    *     if (err) {
    *       console.error('authentication failed: ', err);
    *       return;
    *     }
    *     if (authClient.createScopedRequired &&
    * authClient.createScopedRequired()) { var scopes =
    * ['https://www.googleapis.com/auth/cloud-platform']; authClient =
    * authClient.createScoped(scopes);
    *     }
    *     callback(authClient);
    *   });
    * }
    * @alias compute.regionInstanceGroupManagers.deleteInstances
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.instanceGroupManager Name of the managed instance group.
    * @param {string} params.project Project ID for this request.
    * @param {string} params.region Name of the region scoping this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {().RegionInstanceGroupManagersDeleteInstancesRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def deleteInstances(): GaxiosPromise[SchemaOperation] = js.native
  def deleteInstances(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def deleteInstances(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def deleteInstances(params: ParamsResourceRegioninstancegroupmanagersDeleteinstances): GaxiosPromise[SchemaOperation] = js.native
  def deleteInstances(
    params: ParamsResourceRegioninstancegroupmanagersDeleteinstances,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def deleteInstances(
    params: ParamsResourceRegioninstancegroupmanagersDeleteinstances,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def deleteInstances(params: ParamsResourceRegioninstancegroupmanagersDeleteinstances, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def deleteInstances(
    params: ParamsResourceRegioninstancegroupmanagersDeleteinstances,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * compute.regionInstanceGroupManagers.get
    * @desc Returns all of the details about the specified managed instance
    * group.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Compute Engine API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/compute
    * // 2. This sample uses Application Default Credentials for
    * authentication.
    * //    If not already done, install the gcloud CLI from
    * //    https://cloud.google.com/sdk and run
    * //    `gcloud beta auth application-default login`.
    * //    For more information, see
    * //
    * https://developers.google.com/identity/protocols/application-default-credentials
    * // 3. Install the Node.js client library by running
    * //    `npm install googleapis --save`
    *
    * var google = require('googleapis');
    * var compute = google.compute('beta');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // Project ID for this request.
    *     project: 'my-project',  // TODO: Update placeholder value.
    *
    *     // Name of the region scoping this request.
    *     region: 'my-region',  // TODO: Update placeholder value.
    *
    *     // Name of the managed instance group to return.
    *     instanceGroupManager: 'my-instance-group-manager',  // TODO: Update
    * placeholder value.
    *
    *     auth: authClient,
    *   };
    *
    *   compute.regionInstanceGroupManagers.get(request, function(err,
    * response) { if (err) { console.error(err); return;
    *     }
    *
    *     // TODO: Change code below to process the `response` object:
    *     console.log(JSON.stringify(response, null, 2));
    *   });
    * });
    *
    * function authorize(callback) {
    *   google.auth.getApplicationDefault(function(err, authClient) {
    *     if (err) {
    *       console.error('authentication failed: ', err);
    *       return;
    *     }
    *     if (authClient.createScopedRequired &&
    * authClient.createScopedRequired()) { var scopes =
    * ['https://www.googleapis.com/auth/cloud-platform']; authClient =
    * authClient.createScoped(scopes);
    *     }
    *     callback(authClient);
    *   });
    * }
    * @alias compute.regionInstanceGroupManagers.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.instanceGroupManager Name of the managed instance group to return.
    * @param {string} params.project Project ID for this request.
    * @param {string} params.region Name of the region scoping this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaInstanceGroupManager] = js.native
  def get(callback: BodyResponseCallback[SchemaInstanceGroupManager]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaInstanceGroupManager] = js.native
  def get(params: ParamsResourceRegioninstancegroupmanagersGet): GaxiosPromise[SchemaInstanceGroupManager] = js.native
  def get(
    params: ParamsResourceRegioninstancegroupmanagersGet,
    callback: BodyResponseCallback[SchemaInstanceGroupManager]
  ): Unit = js.native
  def get(
    params: ParamsResourceRegioninstancegroupmanagersGet,
    options: BodyResponseCallback[SchemaInstanceGroupManager],
    callback: BodyResponseCallback[SchemaInstanceGroupManager]
  ): Unit = js.native
  def get(params: ParamsResourceRegioninstancegroupmanagersGet, options: MethodOptions): GaxiosPromise[SchemaInstanceGroupManager] = js.native
  def get(
    params: ParamsResourceRegioninstancegroupmanagersGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaInstanceGroupManager]
  ): Unit = js.native
  /**
    * compute.regionInstanceGroupManagers.insert
    * @desc Creates a managed instance group using the information that you
    * specify in the request. After the group is created, instances in the
    * group are created using the specified instance template. This operation
    * is marked as DONE when the group is created even if the instances in the
    * group have not yet been created. You must separately verify the status of
    * the individual instances with the listmanagedinstances method.  A
    * regional managed instance group can contain up to 2000 instances.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Compute Engine API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/compute
    * // 2. This sample uses Application Default Credentials for
    * authentication.
    * //    If not already done, install the gcloud CLI from
    * //    https://cloud.google.com/sdk and run
    * //    `gcloud beta auth application-default login`.
    * //    For more information, see
    * //
    * https://developers.google.com/identity/protocols/application-default-credentials
    * // 3. Install the Node.js client library by running
    * //    `npm install googleapis --save`
    *
    * var google = require('googleapis');
    * var compute = google.compute('beta');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // Project ID for this request.
    *     project: 'my-project',  // TODO: Update placeholder value.
    *
    *     // Name of the region scoping this request.
    *     region: 'my-region',  // TODO: Update placeholder value.
    *
    *     resource: {
    *       // TODO: Add desired properties to the request body.
    *     },
    *
    *     auth: authClient,
    *   };
    *
    *   compute.regionInstanceGroupManagers.insert(request, function(err,
    * response) { if (err) { console.error(err); return;
    *     }
    *
    *     // TODO: Change code below to process the `response` object:
    *     console.log(JSON.stringify(response, null, 2));
    *   });
    * });
    *
    * function authorize(callback) {
    *   google.auth.getApplicationDefault(function(err, authClient) {
    *     if (err) {
    *       console.error('authentication failed: ', err);
    *       return;
    *     }
    *     if (authClient.createScopedRequired &&
    * authClient.createScopedRequired()) { var scopes =
    * ['https://www.googleapis.com/auth/cloud-platform']; authClient =
    * authClient.createScoped(scopes);
    *     }
    *     callback(authClient);
    *   });
    * }
    * @alias compute.regionInstanceGroupManagers.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.project Project ID for this request.
    * @param {string} params.region Name of the region scoping this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {().InstanceGroupManager} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[SchemaOperation] = js.native
  def insert(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def insert(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def insert(params: ParamsResourceRegioninstancegroupmanagersInsert): GaxiosPromise[SchemaOperation] = js.native
  def insert(
    params: ParamsResourceRegioninstancegroupmanagersInsert,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def insert(
    params: ParamsResourceRegioninstancegroupmanagersInsert,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def insert(params: ParamsResourceRegioninstancegroupmanagersInsert, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def insert(
    params: ParamsResourceRegioninstancegroupmanagersInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * compute.regionInstanceGroupManagers.list
    * @desc Retrieves the list of managed instance groups that are contained
    * within the specified region.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Compute Engine API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/compute
    * // 2. This sample uses Application Default Credentials for
    * authentication.
    * //    If not already done, install the gcloud CLI from
    * //    https://cloud.google.com/sdk and run
    * //    `gcloud beta auth application-default login`.
    * //    For more information, see
    * //
    * https://developers.google.com/identity/protocols/application-default-credentials
    * // 3. Install the Node.js client library by running
    * //    `npm install googleapis --save`
    *
    * var google = require('googleapis');
    * var compute = google.compute('beta');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // Project ID for this request.
    *     project: 'my-project',  // TODO: Update placeholder value.
    *
    *     // Name of the region scoping this request.
    *     region: 'my-region',  // TODO: Update placeholder value.
    *
    *     auth: authClient,
    *   };
    *
    *   var handlePage = function(err, response) {
    *     if (err) {
    *       console.error(err);
    *       return;
    *     }
    *
    *     var itemsPage = response['items'];
    *     if (!itemsPage) {
    *       return;
    *     }
    *     for (var i = 0; i < itemsPage.length; i++) {
    *       // TODO: Change code below to process each resource in `itemsPage`:
    *       console.log(JSON.stringify(itemsPage[i], null, 2));
    *     }
    *
    *     if (response.nextPageToken) {
    *       request.pageToken = response.nextPageToken;
    *       compute.regionInstanceGroupManagers.list(request, handlePage);
    *     }
    *   };
    *
    *   compute.regionInstanceGroupManagers.list(request, handlePage);
    * });
    *
    * function authorize(callback) {
    *   google.auth.getApplicationDefault(function(err, authClient) {
    *     if (err) {
    *       console.error('authentication failed: ', err);
    *       return;
    *     }
    *     if (authClient.createScopedRequired &&
    * authClient.createScopedRequired()) { var scopes =
    * ['https://www.googleapis.com/auth/cloud-platform']; authClient =
    * authClient.createScoped(scopes);
    *     }
    *     callback(authClient);
    *   });
    * }
    * @alias compute.regionInstanceGroupManagers.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.filter A filter expression that filters resources listed in the response. The expression must specify the field name, a comparison operator, and the value that you want to use for filtering. The value must be a string, a number, or a boolean. The comparison operator must be either =, !=, >, or <.  For example, if you are filtering Compute Engine instances, you can exclude instances named example-instance by specifying name != example-instance.  You can also filter nested fields. For example, you could specify scheduling.automaticRestart = false to include instances only if they are not scheduled for automatic restarts. You can use filtering on nested fields to filter based on resource labels.  To filter on multiple expressions, provide each separate expression within parentheses. For example, (scheduling.automaticRestart = true) (cpuPlatform = "Intel Skylake"). By default, each expression is an AND expression. However, you can include AND and OR expressions explicitly. For example, (cpuPlatform = "Intel Skylake") OR (cpuPlatform = "Intel Broadwell") AND (scheduling.automaticRestart = true).
    * @param {integer=} params.maxResults The maximum number of results per page that should be returned. If the number of available results is larger than maxResults, Compute Engine returns a nextPageToken that can be used to get the next page of results in subsequent list requests. Acceptable values are 0 to 500, inclusive. (Default: 500)
    * @param {string=} params.orderBy Sorts list results by a certain order. By default, results are returned in alphanumerical order based on the resource name.  You can also sort results in descending order based on the creation timestamp using orderBy="creationTimestamp desc". This sorts results based on the creationTimestamp field in reverse chronological order (newest result first). Use this to sort resources like operations so that the newest operation is returned first.  Currently, only sorting by name or creationTimestamp desc is supported.
    * @param {string=} params.pageToken Specifies a page token to use. Set pageToken to the nextPageToken returned by a previous list request to get the next page of results.
    * @param {string} params.project Project ID for this request.
    * @param {string} params.region Name of the region scoping this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaRegionInstanceGroupManagerList] = js.native
  def list(callback: BodyResponseCallback[SchemaRegionInstanceGroupManagerList]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaRegionInstanceGroupManagerList] = js.native
  def list(params: ParamsResourceRegioninstancegroupmanagersList): GaxiosPromise[SchemaRegionInstanceGroupManagerList] = js.native
  def list(
    params: ParamsResourceRegioninstancegroupmanagersList,
    callback: BodyResponseCallback[SchemaRegionInstanceGroupManagerList]
  ): Unit = js.native
  def list(
    params: ParamsResourceRegioninstancegroupmanagersList,
    options: BodyResponseCallback[SchemaRegionInstanceGroupManagerList],
    callback: BodyResponseCallback[SchemaRegionInstanceGroupManagerList]
  ): Unit = js.native
  def list(params: ParamsResourceRegioninstancegroupmanagersList, options: MethodOptions): GaxiosPromise[SchemaRegionInstanceGroupManagerList] = js.native
  def list(
    params: ParamsResourceRegioninstancegroupmanagersList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaRegionInstanceGroupManagerList]
  ): Unit = js.native
  /**
    * compute.regionInstanceGroupManagers.listManagedInstances
    * @desc Lists the instances in the managed instance group and instances
    * that are scheduled to be created. The list includes any current actions
    * that the group has scheduled for its instances.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Compute Engine API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/compute
    * // 2. This sample uses Application Default Credentials for
    * authentication.
    * //    If not already done, install the gcloud CLI from
    * //    https://cloud.google.com/sdk and run
    * //    `gcloud beta auth application-default login`.
    * //    For more information, see
    * //
    * https://developers.google.com/identity/protocols/application-default-credentials
    * // 3. Install the Node.js client library by running
    * //    `npm install googleapis --save`
    *
    * var google = require('googleapis');
    * var compute = google.compute('beta');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // Project ID for this request.
    *     project: 'my-project',  // TODO: Update placeholder value.
    *
    *     // Name of the region scoping this request.
    *     region: 'my-region',  // TODO: Update placeholder value.
    *
    *     // The name of the managed instance group.
    *     instanceGroupManager: 'my-instance-group-manager',  // TODO: Update
    * placeholder value.
    *
    *     auth: authClient,
    *   };
    *
    *   var handlePage = function(err, response) {
    *     if (err) {
    *       console.error(err);
    *       return;
    *     }
    *
    *     var managedInstancesPage = response['managedInstances'];
    *     if (!managedInstancesPage) {
    *       return;
    *     }
    *     for (var i = 0; i < managedInstancesPage.length; i++) {
    *       // TODO: Change code below to process each resource in
    * `managedInstancesPage`:
    *       console.log(JSON.stringify(managedInstancesPage[i], null, 2));
    *     }
    *
    *     if (response.nextPageToken) {
    *       request.pageToken = response.nextPageToken;
    *       compute.regionInstanceGroupManagers.listManagedInstances(request,
    * handlePage);
    *     }
    *   };
    *
    *   compute.regionInstanceGroupManagers.listManagedInstances(request,
    * handlePage);
    * });
    *
    * function authorize(callback) {
    *   google.auth.getApplicationDefault(function(err, authClient) {
    *     if (err) {
    *       console.error('authentication failed: ', err);
    *       return;
    *     }
    *     if (authClient.createScopedRequired &&
    * authClient.createScopedRequired()) { var scopes =
    * ['https://www.googleapis.com/auth/cloud-platform']; authClient =
    * authClient.createScoped(scopes);
    *     }
    *     callback(authClient);
    *   });
    * }
    * @alias compute.regionInstanceGroupManagers.listManagedInstances
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.filter A filter expression that filters resources listed in the response. The expression must specify the field name, a comparison operator, and the value that you want to use for filtering. The value must be a string, a number, or a boolean. The comparison operator must be either =, !=, >, or <.  For example, if you are filtering Compute Engine instances, you can exclude instances named example-instance by specifying name != example-instance.  You can also filter nested fields. For example, you could specify scheduling.automaticRestart = false to include instances only if they are not scheduled for automatic restarts. You can use filtering on nested fields to filter based on resource labels.  To filter on multiple expressions, provide each separate expression within parentheses. For example, (scheduling.automaticRestart = true) (cpuPlatform = "Intel Skylake"). By default, each expression is an AND expression. However, you can include AND and OR expressions explicitly. For example, (cpuPlatform = "Intel Skylake") OR (cpuPlatform = "Intel Broadwell") AND (scheduling.automaticRestart = true).
    * @param {string} params.instanceGroupManager The name of the managed instance group.
    * @param {integer=} params.maxResults The maximum number of results per page that should be returned. If the number of available results is larger than maxResults, Compute Engine returns a nextPageToken that can be used to get the next page of results in subsequent list requests. Acceptable values are 0 to 500, inclusive. (Default: 500)
    * @param {string=} params.order_by Sorts list results by a certain order. By default, results are returned in alphanumerical order based on the resource name.  You can also sort results in descending order based on the creation timestamp using orderBy="creationTimestamp desc". This sorts results based on the creationTimestamp field in reverse chronological order (newest result first). Use this to sort resources like operations so that the newest operation is returned first.  Currently, only sorting by name or creationTimestamp desc is supported.
    * @param {string=} params.pageToken Specifies a page token to use. Set pageToken to the nextPageToken returned by a previous list request to get the next page of results.
    * @param {string} params.project Project ID for this request.
    * @param {string} params.region Name of the region scoping this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def listManagedInstances(): GaxiosPromise[SchemaRegionInstanceGroupManagersListInstancesResponse] = js.native
  def listManagedInstances(callback: BodyResponseCallback[SchemaRegionInstanceGroupManagersListInstancesResponse]): Unit = js.native
  def listManagedInstances(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaRegionInstanceGroupManagersListInstancesResponse] = js.native
  def listManagedInstances(params: ParamsResourceRegioninstancegroupmanagersListmanagedinstances): GaxiosPromise[SchemaRegionInstanceGroupManagersListInstancesResponse] = js.native
  def listManagedInstances(
    params: ParamsResourceRegioninstancegroupmanagersListmanagedinstances,
    callback: BodyResponseCallback[SchemaRegionInstanceGroupManagersListInstancesResponse]
  ): Unit = js.native
  def listManagedInstances(
    params: ParamsResourceRegioninstancegroupmanagersListmanagedinstances,
    options: BodyResponseCallback[SchemaRegionInstanceGroupManagersListInstancesResponse],
    callback: BodyResponseCallback[SchemaRegionInstanceGroupManagersListInstancesResponse]
  ): Unit = js.native
  def listManagedInstances(params: ParamsResourceRegioninstancegroupmanagersListmanagedinstances, options: MethodOptions): GaxiosPromise[SchemaRegionInstanceGroupManagersListInstancesResponse] = js.native
  def listManagedInstances(
    params: ParamsResourceRegioninstancegroupmanagersListmanagedinstances,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaRegionInstanceGroupManagersListInstancesResponse]
  ): Unit = js.native
  /**
    * compute.regionInstanceGroupManagers.patch
    * @desc Updates a managed instance group using the information that you
    * specify in the request. This operation is marked as DONE when the group
    * is patched even if the instances in the group are still in the process of
    * being patched. You must separately verify the status of the individual
    * instances with the listmanagedinstances method. This method supports
    * PATCH semantics and uses the JSON merge patch format and processing
    * rules.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Compute Engine API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/compute
    * // 2. This sample uses Application Default Credentials for
    * authentication.
    * //    If not already done, install the gcloud CLI from
    * //    https://cloud.google.com/sdk and run
    * //    `gcloud beta auth application-default login`.
    * //    For more information, see
    * //
    * https://developers.google.com/identity/protocols/application-default-credentials
    * // 3. Install the Node.js client library by running
    * //    `npm install googleapis --save`
    *
    * var google = require('googleapis');
    * var compute = google.compute('beta');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // Project ID for this request.
    *     project: 'my-project',  // TODO: Update placeholder value.
    *
    *     // Name of the region scoping this request.
    *     region: 'my-region',  // TODO: Update placeholder value.
    *
    *     // The name of the instance group manager.
    *     instanceGroupManager: 'my-instance-group-manager',  // TODO: Update
    * placeholder value.
    *
    *     resource: {
    *       // TODO: Add desired properties to the request body. Only these
    * properties
    *       // will be changed.
    *     },
    *
    *     auth: authClient,
    *   };
    *
    *   compute.regionInstanceGroupManagers.patch(request, function(err,
    * response) { if (err) { console.error(err); return;
    *     }
    *
    *     // TODO: Change code below to process the `response` object:
    *     console.log(JSON.stringify(response, null, 2));
    *   });
    * });
    *
    * function authorize(callback) {
    *   google.auth.getApplicationDefault(function(err, authClient) {
    *     if (err) {
    *       console.error('authentication failed: ', err);
    *       return;
    *     }
    *     if (authClient.createScopedRequired &&
    * authClient.createScopedRequired()) { var scopes =
    * ['https://www.googleapis.com/auth/cloud-platform']; authClient =
    * authClient.createScoped(scopes);
    *     }
    *     callback(authClient);
    *   });
    * }
    * @alias compute.regionInstanceGroupManagers.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.instanceGroupManager The name of the instance group manager.
    * @param {string} params.project Project ID for this request.
    * @param {string} params.region Name of the region scoping this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {().InstanceGroupManager} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[SchemaOperation] = js.native
  def patch(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def patch(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def patch(params: ParamsResourceRegioninstancegroupmanagersPatch): GaxiosPromise[SchemaOperation] = js.native
  def patch(
    params: ParamsResourceRegioninstancegroupmanagersPatch,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def patch(
    params: ParamsResourceRegioninstancegroupmanagersPatch,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def patch(params: ParamsResourceRegioninstancegroupmanagersPatch, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def patch(
    params: ParamsResourceRegioninstancegroupmanagersPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * compute.regionInstanceGroupManagers.recreateInstances
    * @desc Flags the specified instances in the managed instance group to be
    * immediately recreated. The instances are deleted and recreated using the
    * current instance template for the managed instance group. This operation
    * is marked as DONE when the flag is set even if the instances have not yet
    * been recreated. You must separately verify the status of the recreating
    * action with the listmanagedinstances method.  If the group is part of a
    * backend service that has enabled connection draining, it can take up to
    * 60 seconds after the connection draining duration has elapsed before the
    * VM instance is removed or deleted.  You can specify a maximum of 1000
    * instances with this method per request.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Compute Engine API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/compute
    * // 2. This sample uses Application Default Credentials for
    * authentication.
    * //    If not already done, install the gcloud CLI from
    * //    https://cloud.google.com/sdk and run
    * //    `gcloud beta auth application-default login`.
    * //    For more information, see
    * //
    * https://developers.google.com/identity/protocols/application-default-credentials
    * // 3. Install the Node.js client library by running
    * //    `npm install googleapis --save`
    *
    * var google = require('googleapis');
    * var compute = google.compute('beta');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // Project ID for this request.
    *     project: 'my-project',  // TODO: Update placeholder value.
    *
    *     // Name of the region scoping this request.
    *     region: 'my-region',  // TODO: Update placeholder value.
    *
    *     // Name of the managed instance group.
    *     instanceGroupManager: 'my-instance-group-manager',  // TODO: Update
    * placeholder value.
    *
    *     resource: {
    *       // TODO: Add desired properties to the request body.
    *     },
    *
    *     auth: authClient,
    *   };
    *
    *   compute.regionInstanceGroupManagers.recreateInstances(request,
    * function(err, response) { if (err) { console.error(err); return;
    *     }
    *
    *     // TODO: Change code below to process the `response` object:
    *     console.log(JSON.stringify(response, null, 2));
    *   });
    * });
    *
    * function authorize(callback) {
    *   google.auth.getApplicationDefault(function(err, authClient) {
    *     if (err) {
    *       console.error('authentication failed: ', err);
    *       return;
    *     }
    *     if (authClient.createScopedRequired &&
    * authClient.createScopedRequired()) { var scopes =
    * ['https://www.googleapis.com/auth/cloud-platform']; authClient =
    * authClient.createScoped(scopes);
    *     }
    *     callback(authClient);
    *   });
    * }
    * @alias compute.regionInstanceGroupManagers.recreateInstances
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.instanceGroupManager Name of the managed instance group.
    * @param {string} params.project Project ID for this request.
    * @param {string} params.region Name of the region scoping this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {().RegionInstanceGroupManagersRecreateRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def recreateInstances(): GaxiosPromise[SchemaOperation] = js.native
  def recreateInstances(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def recreateInstances(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def recreateInstances(params: ParamsResourceRegioninstancegroupmanagersRecreateinstances): GaxiosPromise[SchemaOperation] = js.native
  def recreateInstances(
    params: ParamsResourceRegioninstancegroupmanagersRecreateinstances,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def recreateInstances(
    params: ParamsResourceRegioninstancegroupmanagersRecreateinstances,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def recreateInstances(params: ParamsResourceRegioninstancegroupmanagersRecreateinstances, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def recreateInstances(
    params: ParamsResourceRegioninstancegroupmanagersRecreateinstances,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * compute.regionInstanceGroupManagers.resize
    * @desc Changes the intended size of the managed instance group. If you
    * increase the size, the group creates new instances using the current
    * instance template. If you decrease the size, the group deletes one or
    * more instances.  The resize operation is marked DONE if the resize
    * request is successful. The underlying actions take additional time. You
    * must separately verify the status of the creating or deleting actions
    * with the listmanagedinstances method.  If the group is part of a backend
    * service that has enabled connection draining, it can take up to 60
    * seconds after the connection draining duration has elapsed before the VM
    * instance is removed or deleted.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Compute Engine API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/compute
    * // 2. This sample uses Application Default Credentials for
    * authentication.
    * //    If not already done, install the gcloud CLI from
    * //    https://cloud.google.com/sdk and run
    * //    `gcloud beta auth application-default login`.
    * //    For more information, see
    * //
    * https://developers.google.com/identity/protocols/application-default-credentials
    * // 3. Install the Node.js client library by running
    * //    `npm install googleapis --save`
    *
    * var google = require('googleapis');
    * var compute = google.compute('beta');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // Project ID for this request.
    *     project: 'my-project',  // TODO: Update placeholder value.
    *
    *     // Name of the region scoping this request.
    *     region: 'my-region',  // TODO: Update placeholder value.
    *
    *     // Name of the managed instance group.
    *     instanceGroupManager: 'my-instance-group-manager',  // TODO: Update
    * placeholder value.
    *
    *     // Number of instances that should exist in this instance group
    * manager. size: 0,  // TODO: Update placeholder value.
    *
    *     auth: authClient,
    *   };
    *
    *   compute.regionInstanceGroupManagers.resize(request, function(err,
    * response) { if (err) { console.error(err); return;
    *     }
    *
    *     // TODO: Change code below to process the `response` object:
    *     console.log(JSON.stringify(response, null, 2));
    *   });
    * });
    *
    * function authorize(callback) {
    *   google.auth.getApplicationDefault(function(err, authClient) {
    *     if (err) {
    *       console.error('authentication failed: ', err);
    *       return;
    *     }
    *     if (authClient.createScopedRequired &&
    * authClient.createScopedRequired()) { var scopes =
    * ['https://www.googleapis.com/auth/cloud-platform']; authClient =
    * authClient.createScoped(scopes);
    *     }
    *     callback(authClient);
    *   });
    * }
    * @alias compute.regionInstanceGroupManagers.resize
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.instanceGroupManager Name of the managed instance group.
    * @param {string} params.project Project ID for this request.
    * @param {string} params.region Name of the region scoping this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {integer} params.size Number of instances that should exist in this instance group manager.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def resize(): GaxiosPromise[SchemaOperation] = js.native
  def resize(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def resize(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def resize(params: ParamsResourceRegioninstancegroupmanagersResize): GaxiosPromise[SchemaOperation] = js.native
  def resize(
    params: ParamsResourceRegioninstancegroupmanagersResize,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def resize(
    params: ParamsResourceRegioninstancegroupmanagersResize,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def resize(params: ParamsResourceRegioninstancegroupmanagersResize, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def resize(
    params: ParamsResourceRegioninstancegroupmanagersResize,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * compute.regionInstanceGroupManagers.setAutoHealingPolicies
    * @desc Modifies the autohealing policy for the instances in this managed
    * instance group. [Deprecated] This method is deprecated. Please use Patch
    * instead.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Compute Engine API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/compute
    * // 2. This sample uses Application Default Credentials for
    * authentication.
    * //    If not already done, install the gcloud CLI from
    * //    https://cloud.google.com/sdk and run
    * //    `gcloud beta auth application-default login`.
    * //    For more information, see
    * //
    * https://developers.google.com/identity/protocols/application-default-credentials
    * // 3. Install the Node.js client library by running
    * //    `npm install googleapis --save`
    *
    * var google = require('googleapis');
    * var compute = google.compute('beta');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // Project ID for this request.
    *     project: 'my-project',  // TODO: Update placeholder value.
    *
    *     // Name of the region scoping this request.
    *     region: 'my-region',  // TODO: Update placeholder value.
    *
    *     // Name of the managed instance group.
    *     instanceGroupManager: 'my-instance-group-manager',  // TODO: Update
    * placeholder value.
    *
    *     resource: {
    *       // TODO: Add desired properties to the request body.
    *     },
    *
    *     auth: authClient,
    *   };
    *
    *   compute.regionInstanceGroupManagers.setAutoHealingPolicies(request,
    * function(err, response) { if (err) { console.error(err); return;
    *     }
    *
    *     // TODO: Change code below to process the `response` object:
    *     console.log(JSON.stringify(response, null, 2));
    *   });
    * });
    *
    * function authorize(callback) {
    *   google.auth.getApplicationDefault(function(err, authClient) {
    *     if (err) {
    *       console.error('authentication failed: ', err);
    *       return;
    *     }
    *     if (authClient.createScopedRequired &&
    * authClient.createScopedRequired()) { var scopes =
    * ['https://www.googleapis.com/auth/cloud-platform']; authClient =
    * authClient.createScoped(scopes);
    *     }
    *     callback(authClient);
    *   });
    * }
    * @alias compute.regionInstanceGroupManagers.setAutoHealingPolicies
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.instanceGroupManager Name of the managed instance group.
    * @param {string} params.project Project ID for this request.
    * @param {string} params.region Name of the region scoping this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {().RegionInstanceGroupManagersSetAutoHealingRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def setAutoHealingPolicies(): GaxiosPromise[SchemaOperation] = js.native
  def setAutoHealingPolicies(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def setAutoHealingPolicies(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def setAutoHealingPolicies(params: ParamsResourceRegioninstancegroupmanagersSetautohealingpolicies): GaxiosPromise[SchemaOperation] = js.native
  def setAutoHealingPolicies(
    params: ParamsResourceRegioninstancegroupmanagersSetautohealingpolicies,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def setAutoHealingPolicies(
    params: ParamsResourceRegioninstancegroupmanagersSetautohealingpolicies,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def setAutoHealingPolicies(params: ParamsResourceRegioninstancegroupmanagersSetautohealingpolicies, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def setAutoHealingPolicies(
    params: ParamsResourceRegioninstancegroupmanagersSetautohealingpolicies,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * compute.regionInstanceGroupManagers.setInstanceTemplate
    * @desc Sets the instance template to use when creating new instances or
    * recreating instances in this group. Existing instances are not affected.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Compute Engine API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/compute
    * // 2. This sample uses Application Default Credentials for
    * authentication.
    * //    If not already done, install the gcloud CLI from
    * //    https://cloud.google.com/sdk and run
    * //    `gcloud beta auth application-default login`.
    * //    For more information, see
    * //
    * https://developers.google.com/identity/protocols/application-default-credentials
    * // 3. Install the Node.js client library by running
    * //    `npm install googleapis --save`
    *
    * var google = require('googleapis');
    * var compute = google.compute('beta');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // Project ID for this request.
    *     project: 'my-project',  // TODO: Update placeholder value.
    *
    *     // Name of the region scoping this request.
    *     region: 'my-region',  // TODO: Update placeholder value.
    *
    *     // The name of the managed instance group.
    *     instanceGroupManager: 'my-instance-group-manager',  // TODO: Update
    * placeholder value.
    *
    *     resource: {
    *       // TODO: Add desired properties to the request body.
    *     },
    *
    *     auth: authClient,
    *   };
    *
    *   compute.regionInstanceGroupManagers.setInstanceTemplate(request,
    * function(err, response) { if (err) { console.error(err); return;
    *     }
    *
    *     // TODO: Change code below to process the `response` object:
    *     console.log(JSON.stringify(response, null, 2));
    *   });
    * });
    *
    * function authorize(callback) {
    *   google.auth.getApplicationDefault(function(err, authClient) {
    *     if (err) {
    *       console.error('authentication failed: ', err);
    *       return;
    *     }
    *     if (authClient.createScopedRequired &&
    * authClient.createScopedRequired()) { var scopes =
    * ['https://www.googleapis.com/auth/cloud-platform']; authClient =
    * authClient.createScoped(scopes);
    *     }
    *     callback(authClient);
    *   });
    * }
    * @alias compute.regionInstanceGroupManagers.setInstanceTemplate
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.instanceGroupManager The name of the managed instance group.
    * @param {string} params.project Project ID for this request.
    * @param {string} params.region Name of the region scoping this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {().RegionInstanceGroupManagersSetTemplateRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def setInstanceTemplate(): GaxiosPromise[SchemaOperation] = js.native
  def setInstanceTemplate(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def setInstanceTemplate(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def setInstanceTemplate(params: ParamsResourceRegioninstancegroupmanagersSetinstancetemplate): GaxiosPromise[SchemaOperation] = js.native
  def setInstanceTemplate(
    params: ParamsResourceRegioninstancegroupmanagersSetinstancetemplate,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def setInstanceTemplate(
    params: ParamsResourceRegioninstancegroupmanagersSetinstancetemplate,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def setInstanceTemplate(params: ParamsResourceRegioninstancegroupmanagersSetinstancetemplate, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def setInstanceTemplate(
    params: ParamsResourceRegioninstancegroupmanagersSetinstancetemplate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * compute.regionInstanceGroupManagers.setTargetPools
    * @desc Modifies the target pools to which all new instances in this group
    * are assigned. Existing instances in the group are not affected.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Compute Engine API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/compute
    * // 2. This sample uses Application Default Credentials for
    * authentication.
    * //    If not already done, install the gcloud CLI from
    * //    https://cloud.google.com/sdk and run
    * //    `gcloud beta auth application-default login`.
    * //    For more information, see
    * //
    * https://developers.google.com/identity/protocols/application-default-credentials
    * // 3. Install the Node.js client library by running
    * //    `npm install googleapis --save`
    *
    * var google = require('googleapis');
    * var compute = google.compute('beta');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // Project ID for this request.
    *     project: 'my-project',  // TODO: Update placeholder value.
    *
    *     // Name of the region scoping this request.
    *     region: 'my-region',  // TODO: Update placeholder value.
    *
    *     // Name of the managed instance group.
    *     instanceGroupManager: 'my-instance-group-manager',  // TODO: Update
    * placeholder value.
    *
    *     resource: {
    *       // TODO: Add desired properties to the request body.
    *     },
    *
    *     auth: authClient,
    *   };
    *
    *   compute.regionInstanceGroupManagers.setTargetPools(request,
    * function(err, response) { if (err) { console.error(err); return;
    *     }
    *
    *     // TODO: Change code below to process the `response` object:
    *     console.log(JSON.stringify(response, null, 2));
    *   });
    * });
    *
    * function authorize(callback) {
    *   google.auth.getApplicationDefault(function(err, authClient) {
    *     if (err) {
    *       console.error('authentication failed: ', err);
    *       return;
    *     }
    *     if (authClient.createScopedRequired &&
    * authClient.createScopedRequired()) { var scopes =
    * ['https://www.googleapis.com/auth/cloud-platform']; authClient =
    * authClient.createScoped(scopes);
    *     }
    *     callback(authClient);
    *   });
    * }
    * @alias compute.regionInstanceGroupManagers.setTargetPools
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.instanceGroupManager Name of the managed instance group.
    * @param {string} params.project Project ID for this request.
    * @param {string} params.region Name of the region scoping this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {().RegionInstanceGroupManagersSetTargetPoolsRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def setTargetPools(): GaxiosPromise[SchemaOperation] = js.native
  def setTargetPools(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def setTargetPools(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def setTargetPools(params: ParamsResourceRegioninstancegroupmanagersSettargetpools): GaxiosPromise[SchemaOperation] = js.native
  def setTargetPools(
    params: ParamsResourceRegioninstancegroupmanagersSettargetpools,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def setTargetPools(
    params: ParamsResourceRegioninstancegroupmanagersSettargetpools,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def setTargetPools(params: ParamsResourceRegioninstancegroupmanagersSettargetpools, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def setTargetPools(
    params: ParamsResourceRegioninstancegroupmanagersSettargetpools,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * compute.regionInstanceGroupManagers.testIamPermissions
    * @desc Returns permissions that a caller has on the specified resource.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Compute Engine API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/compute
    * // 2. This sample uses Application Default Credentials for
    * authentication.
    * //    If not already done, install the gcloud CLI from
    * //    https://cloud.google.com/sdk and run
    * //    `gcloud beta auth application-default login`.
    * //    For more information, see
    * //
    * https://developers.google.com/identity/protocols/application-default-credentials
    * // 3. Install the Node.js client library by running
    * //    `npm install googleapis --save`
    *
    * var google = require('googleapis');
    * var compute = google.compute('beta');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // Project ID for this request.
    *     project: 'my-project',  // TODO: Update placeholder value.
    *
    *     // The name of the region for this request.
    *     region: 'my-region',  // TODO: Update placeholder value.
    *
    *     // Name of the resource for this request.
    *     resource_: 'my-resource',  // TODO: Update placeholder value.
    *
    *     resource: {
    *       // TODO: Add desired properties to the request body.
    *     },
    *
    *     auth: authClient,
    *   };
    *
    *   compute.regionInstanceGroupManagers.testIamPermissions(request,
    * function(err, response) { if (err) { console.error(err); return;
    *     }
    *
    *     // TODO: Change code below to process the `response` object:
    *     console.log(JSON.stringify(response, null, 2));
    *   });
    * });
    *
    * function authorize(callback) {
    *   google.auth.getApplicationDefault(function(err, authClient) {
    *     if (err) {
    *       console.error('authentication failed: ', err);
    *       return;
    *     }
    *     if (authClient.createScopedRequired &&
    * authClient.createScopedRequired()) { var scopes =
    * ['https://www.googleapis.com/auth/cloud-platform']; authClient =
    * authClient.createScoped(scopes);
    *     }
    *     callback(authClient);
    *   });
    * }
    * @alias compute.regionInstanceGroupManagers.testIamPermissions
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.project Project ID for this request.
    * @param {string} params.region The name of the region for this request.
    * @param {string} params.resource_ Name or id of the resource for this request.
    * @param {().TestPermissionsRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def testIamPermissions(): GaxiosPromise[SchemaTestPermissionsResponse] = js.native
  def testIamPermissions(callback: BodyResponseCallback[SchemaTestPermissionsResponse]): Unit = js.native
  def testIamPermissions(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaTestPermissionsResponse] = js.native
  def testIamPermissions(params: ParamsResourceRegioninstancegroupmanagersTestiampermissions): GaxiosPromise[SchemaTestPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceRegioninstancegroupmanagersTestiampermissions,
    callback: BodyResponseCallback[SchemaTestPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsResourceRegioninstancegroupmanagersTestiampermissions,
    options: BodyResponseCallback[SchemaTestPermissionsResponse],
    callback: BodyResponseCallback[SchemaTestPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(params: ParamsResourceRegioninstancegroupmanagersTestiampermissions, options: MethodOptions): GaxiosPromise[SchemaTestPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceRegioninstancegroupmanagersTestiampermissions,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTestPermissionsResponse]
  ): Unit = js.native
  /**
    * compute.regionInstanceGroupManagers.update
    * @desc Updates a managed instance group using the information that you
    * specify in the request. This operation is marked as DONE when the group
    * is updated even if the instances in the group have not yet been updated.
    * You must separately verify the status of the individual instances with
    * the listmanagedinstances method.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Compute Engine API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/compute
    * // 2. This sample uses Application Default Credentials for
    * authentication.
    * //    If not already done, install the gcloud CLI from
    * //    https://cloud.google.com/sdk and run
    * //    `gcloud beta auth application-default login`.
    * //    For more information, see
    * //
    * https://developers.google.com/identity/protocols/application-default-credentials
    * // 3. Install the Node.js client library by running
    * //    `npm install googleapis --save`
    *
    * var google = require('googleapis');
    * var compute = google.compute('beta');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // Project ID for this request.
    *     project: 'my-project',  // TODO: Update placeholder value.
    *
    *     // Name of the region scoping this request.
    *     region: 'my-region',  // TODO: Update placeholder value.
    *
    *     // The name of the instance group manager.
    *     instanceGroupManager: 'my-instance-group-manager',  // TODO: Update
    * placeholder value.
    *
    *     resource: {
    *       // TODO: Add desired properties to the request body. All existing
    * properties
    *       // will be replaced.
    *     },
    *
    *     auth: authClient,
    *   };
    *
    *   compute.regionInstanceGroupManagers.update(request, function(err,
    * response) { if (err) { console.error(err); return;
    *     }
    *
    *     // TODO: Change code below to process the `response` object:
    *     console.log(JSON.stringify(response, null, 2));
    *   });
    * });
    *
    * function authorize(callback) {
    *   google.auth.getApplicationDefault(function(err, authClient) {
    *     if (err) {
    *       console.error('authentication failed: ', err);
    *       return;
    *     }
    *     if (authClient.createScopedRequired &&
    * authClient.createScopedRequired()) { var scopes =
    * ['https://www.googleapis.com/auth/cloud-platform']; authClient =
    * authClient.createScoped(scopes);
    *     }
    *     callback(authClient);
    *   });
    * }
    * @alias compute.regionInstanceGroupManagers.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.instanceGroupManager The name of the instance group manager.
    * @param {string} params.project Project ID for this request.
    * @param {string} params.region Name of the region scoping this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {().InstanceGroupManager} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[SchemaOperation] = js.native
  def update(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def update(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def update(params: ParamsResourceRegioninstancegroupmanagersUpdate): GaxiosPromise[SchemaOperation] = js.native
  def update(
    params: ParamsResourceRegioninstancegroupmanagersUpdate,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def update(
    params: ParamsResourceRegioninstancegroupmanagersUpdate,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def update(params: ParamsResourceRegioninstancegroupmanagersUpdate, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def update(
    params: ParamsResourceRegioninstancegroupmanagersUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
}

