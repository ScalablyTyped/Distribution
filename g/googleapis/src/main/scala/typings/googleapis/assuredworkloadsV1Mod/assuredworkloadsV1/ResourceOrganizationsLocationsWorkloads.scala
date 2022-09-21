package typings.googleapis.assuredworkloadsV1Mod.assuredworkloadsV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/assuredworkloads/v1", "assuredworkloads_v1.Resource$Organizations$Locations$Workloads")
@js.native
open class ResourceOrganizationsLocationsWorkloads protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def create(callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def create(params: ParamsResourceOrganizationsLocationsWorkloadsCreate): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def create(
    params: ParamsResourceOrganizationsLocationsWorkloadsCreate,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def create(
    params: ParamsResourceOrganizationsLocationsWorkloadsCreate,
    options: BodyResponseCallback[Readable | SchemaGoogleLongrunningOperation],
    callback: BodyResponseCallback[Readable | SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def create(params: ParamsResourceOrganizationsLocationsWorkloadsCreate, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def create(
    params: ParamsResourceOrganizationsLocationsWorkloadsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  /**
    * Creates Assured Workload.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/assuredworkloads.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const assuredworkloads = google.assuredworkloads('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/cloud-platform'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await assuredworkloads.organizations.locations.workloads.create({
    *     // Optional. A identifier associated with the workload and underlying projects which allows for the break down of billing costs for a workload. The value provided for the identifier will add a label to the workload and contained projects with the identifier as the value.
    *     externalId: 'placeholder-value',
    *     // Required. The resource name of the new Workload's parent. Must be of the form `organizations/{org_id\}/locations/{location_id\}`.
    *     parent: 'organizations/my-organization/locations/my-location',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "billingAccount": "my_billingAccount",
    *       //   "complianceRegime": "my_complianceRegime",
    *       //   "createTime": "my_createTime",
    *       //   "displayName": "my_displayName",
    *       //   "enableSovereignControls": false,
    *       //   "etag": "my_etag",
    *       //   "kajEnrollmentState": "my_kajEnrollmentState",
    *       //   "kmsSettings": {},
    *       //   "labels": {},
    *       //   "name": "my_name",
    *       //   "provisionedResourcesParent": "my_provisionedResourcesParent",
    *       //   "resourceSettings": [],
    *       //   "resources": [],
    *       //   "saaEnrollmentResponse": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "done": false,
    *   //   "error": {},
    *   //   "metadata": {},
    *   //   "name": "my_name",
    *   //   "response": {}
    *   // }
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * ```
    *
    * @param params - Parameters for request
    * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param callback - Optional callback that handles the response.
    * @returns A promise if used with async/await, or void if used with a callback.
    */
  def create(params: ParamsResourceOrganizationsLocationsWorkloadsCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceOrganizationsLocationsWorkloadsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(params: ParamsResourceOrganizationsLocationsWorkloadsDelete): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(
    params: ParamsResourceOrganizationsLocationsWorkloadsDelete,
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsResourceOrganizationsLocationsWorkloadsDelete,
    options: BodyResponseCallback[Readable | SchemaGoogleProtobufEmpty],
    callback: BodyResponseCallback[Readable | SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceOrganizationsLocationsWorkloadsDelete, options: MethodOptions): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(
    params: ParamsResourceOrganizationsLocationsWorkloadsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  /**
    * Deletes the workload. Make sure that workload's direct children are already in a deleted state, otherwise the request will fail with a FAILED_PRECONDITION error.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/assuredworkloads.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const assuredworkloads = google.assuredworkloads('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/cloud-platform'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await assuredworkloads.organizations.locations.workloads.delete({
    *     // Optional. The etag of the workload. If this is provided, it must match the server's etag.
    *     etag: 'placeholder-value',
    *     // Required. The `name` field is used to identify the workload. Format: organizations/{org_id\}/locations/{location_id\}/workloads/{workload_id\}
    *     name: 'organizations/my-organization/locations/my-location/workloads/my-workload',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {}
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * ```
    *
    * @param params - Parameters for request
    * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param callback - Optional callback that handles the response.
    * @returns A promise if used with async/await, or void if used with a callback.
    */
  def delete(params: ParamsResourceOrganizationsLocationsWorkloadsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceOrganizationsLocationsWorkloadsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaGoogleCloudAssuredworkloadsV1Workload] = js.native
  def get(callback: BodyResponseCallback[SchemaGoogleCloudAssuredworkloadsV1Workload]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudAssuredworkloadsV1Workload] = js.native
  def get(params: ParamsResourceOrganizationsLocationsWorkloadsGet): GaxiosPromise[SchemaGoogleCloudAssuredworkloadsV1Workload] = js.native
  def get(
    params: ParamsResourceOrganizationsLocationsWorkloadsGet,
    callback: BodyResponseCallback[SchemaGoogleCloudAssuredworkloadsV1Workload]
  ): Unit = js.native
  def get(
    params: ParamsResourceOrganizationsLocationsWorkloadsGet,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudAssuredworkloadsV1Workload],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudAssuredworkloadsV1Workload]
  ): Unit = js.native
  def get(params: ParamsResourceOrganizationsLocationsWorkloadsGet, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudAssuredworkloadsV1Workload] = js.native
  def get(
    params: ParamsResourceOrganizationsLocationsWorkloadsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudAssuredworkloadsV1Workload]
  ): Unit = js.native
  /**
    * Gets Assured Workload associated with a CRM Node
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/assuredworkloads.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const assuredworkloads = google.assuredworkloads('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/cloud-platform'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await assuredworkloads.organizations.locations.workloads.get({
    *     // Required. The resource name of the Workload to fetch. This is the workloads's relative path in the API, formatted as "organizations/{organization_id\}/locations/{location_id\}/workloads/{workload_id\}". For example, "organizations/123/locations/us-east1/workloads/assured-workload-1".
    *     name: 'organizations/my-organization/locations/my-location/workloads/my-workload',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "billingAccount": "my_billingAccount",
    *   //   "complianceRegime": "my_complianceRegime",
    *   //   "createTime": "my_createTime",
    *   //   "displayName": "my_displayName",
    *   //   "enableSovereignControls": false,
    *   //   "etag": "my_etag",
    *   //   "kajEnrollmentState": "my_kajEnrollmentState",
    *   //   "kmsSettings": {},
    *   //   "labels": {},
    *   //   "name": "my_name",
    *   //   "provisionedResourcesParent": "my_provisionedResourcesParent",
    *   //   "resourceSettings": [],
    *   //   "resources": [],
    *   //   "saaEnrollmentResponse": {}
    *   // }
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * ```
    *
    * @param params - Parameters for request
    * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param callback - Optional callback that handles the response.
    * @returns A promise if used with async/await, or void if used with a callback.
    */
  def get(params: ParamsResourceOrganizationsLocationsWorkloadsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceOrganizationsLocationsWorkloadsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaGoogleCloudAssuredworkloadsV1ListWorkloadsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaGoogleCloudAssuredworkloadsV1ListWorkloadsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudAssuredworkloadsV1ListWorkloadsResponse] = js.native
  def list(params: ParamsResourceOrganizationsLocationsWorkloadsList): GaxiosPromise[SchemaGoogleCloudAssuredworkloadsV1ListWorkloadsResponse] = js.native
  def list(
    params: ParamsResourceOrganizationsLocationsWorkloadsList,
    callback: BodyResponseCallback[SchemaGoogleCloudAssuredworkloadsV1ListWorkloadsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceOrganizationsLocationsWorkloadsList,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudAssuredworkloadsV1ListWorkloadsResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudAssuredworkloadsV1ListWorkloadsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceOrganizationsLocationsWorkloadsList, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudAssuredworkloadsV1ListWorkloadsResponse] = js.native
  def list(
    params: ParamsResourceOrganizationsLocationsWorkloadsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudAssuredworkloadsV1ListWorkloadsResponse]
  ): Unit = js.native
  /**
    * Lists Assured Workloads under a CRM Node.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/assuredworkloads.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const assuredworkloads = google.assuredworkloads('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/cloud-platform'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await assuredworkloads.organizations.locations.workloads.list({
    *     // A custom filter for filtering by properties of a workload. At this time, only filtering by labels is supported.
    *     filter: 'placeholder-value',
    *     // Page size.
    *     pageSize: 'placeholder-value',
    *     // Page token returned from previous request. Page token contains context from previous request. Page token needs to be passed in the second and following requests.
    *     pageToken: 'placeholder-value',
    *     // Required. Parent Resource to list workloads from. Must be of the form `organizations/{org_id\}/locations/{location\}`.
    *     parent: 'organizations/my-organization/locations/my-location',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "workloads": []
    *   // }
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * ```
    *
    * @param params - Parameters for request
    * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param callback - Optional callback that handles the response.
    * @returns A promise if used with async/await, or void if used with a callback.
    */
  def list(params: ParamsResourceOrganizationsLocationsWorkloadsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceOrganizationsLocationsWorkloadsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaGoogleCloudAssuredworkloadsV1Workload] = js.native
  def patch(callback: BodyResponseCallback[SchemaGoogleCloudAssuredworkloadsV1Workload]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudAssuredworkloadsV1Workload] = js.native
  def patch(params: ParamsResourceOrganizationsLocationsWorkloadsPatch): GaxiosPromise[SchemaGoogleCloudAssuredworkloadsV1Workload] = js.native
  def patch(
    params: ParamsResourceOrganizationsLocationsWorkloadsPatch,
    callback: BodyResponseCallback[SchemaGoogleCloudAssuredworkloadsV1Workload]
  ): Unit = js.native
  def patch(
    params: ParamsResourceOrganizationsLocationsWorkloadsPatch,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudAssuredworkloadsV1Workload],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudAssuredworkloadsV1Workload]
  ): Unit = js.native
  def patch(params: ParamsResourceOrganizationsLocationsWorkloadsPatch, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudAssuredworkloadsV1Workload] = js.native
  def patch(
    params: ParamsResourceOrganizationsLocationsWorkloadsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudAssuredworkloadsV1Workload]
  ): Unit = js.native
  /**
    * Updates an existing workload. Currently allows updating of workload display_name and labels. For force updates don't set etag field in the Workload. Only one update operation per workload can be in progress.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/assuredworkloads.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const assuredworkloads = google.assuredworkloads('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/cloud-platform'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await assuredworkloads.organizations.locations.workloads.patch({
    *     // Optional. The resource name of the workload. Format: organizations/{organization\}/locations/{location\}/workloads/{workload\} Read-only.
    *     name: 'organizations/my-organization/locations/my-location/workloads/my-workload',
    *     // Required. The list of fields to be updated.
    *     updateMask: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "billingAccount": "my_billingAccount",
    *       //   "complianceRegime": "my_complianceRegime",
    *       //   "createTime": "my_createTime",
    *       //   "displayName": "my_displayName",
    *       //   "enableSovereignControls": false,
    *       //   "etag": "my_etag",
    *       //   "kajEnrollmentState": "my_kajEnrollmentState",
    *       //   "kmsSettings": {},
    *       //   "labels": {},
    *       //   "name": "my_name",
    *       //   "provisionedResourcesParent": "my_provisionedResourcesParent",
    *       //   "resourceSettings": [],
    *       //   "resources": [],
    *       //   "saaEnrollmentResponse": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "billingAccount": "my_billingAccount",
    *   //   "complianceRegime": "my_complianceRegime",
    *   //   "createTime": "my_createTime",
    *   //   "displayName": "my_displayName",
    *   //   "enableSovereignControls": false,
    *   //   "etag": "my_etag",
    *   //   "kajEnrollmentState": "my_kajEnrollmentState",
    *   //   "kmsSettings": {},
    *   //   "labels": {},
    *   //   "name": "my_name",
    *   //   "provisionedResourcesParent": "my_provisionedResourcesParent",
    *   //   "resourceSettings": [],
    *   //   "resources": [],
    *   //   "saaEnrollmentResponse": {}
    *   // }
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * ```
    *
    * @param params - Parameters for request
    * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param callback - Optional callback that handles the response.
    * @returns A promise if used with async/await, or void if used with a callback.
    */
  def patch(params: ParamsResourceOrganizationsLocationsWorkloadsPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceOrganizationsLocationsWorkloadsPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def restrictAllowedResources(): GaxiosPromise[SchemaGoogleCloudAssuredworkloadsV1RestrictAllowedResourcesResponse] = js.native
  def restrictAllowedResources(
    callback: BodyResponseCallback[SchemaGoogleCloudAssuredworkloadsV1RestrictAllowedResourcesResponse]
  ): Unit = js.native
  def restrictAllowedResources(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudAssuredworkloadsV1RestrictAllowedResourcesResponse] = js.native
  def restrictAllowedResources(params: ParamsResourceOrganizationsLocationsWorkloadsRestrictallowedresources): GaxiosPromise[SchemaGoogleCloudAssuredworkloadsV1RestrictAllowedResourcesResponse] = js.native
  def restrictAllowedResources(
    params: ParamsResourceOrganizationsLocationsWorkloadsRestrictallowedresources,
    callback: BodyResponseCallback[SchemaGoogleCloudAssuredworkloadsV1RestrictAllowedResourcesResponse]
  ): Unit = js.native
  def restrictAllowedResources(
    params: ParamsResourceOrganizationsLocationsWorkloadsRestrictallowedresources,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudAssuredworkloadsV1RestrictAllowedResourcesResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudAssuredworkloadsV1RestrictAllowedResourcesResponse]
  ): Unit = js.native
  def restrictAllowedResources(
    params: ParamsResourceOrganizationsLocationsWorkloadsRestrictallowedresources,
    options: MethodOptions
  ): GaxiosPromise[SchemaGoogleCloudAssuredworkloadsV1RestrictAllowedResourcesResponse] = js.native
  def restrictAllowedResources(
    params: ParamsResourceOrganizationsLocationsWorkloadsRestrictallowedresources,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudAssuredworkloadsV1RestrictAllowedResourcesResponse]
  ): Unit = js.native
  /**
    * Restrict the list of resources allowed in the Workload environment. The current list of allowed products can be found at https://cloud.google.com/assured-workloads/docs/supported-products In addition to assuredworkloads.workload.update permission, the user should also have orgpolicy.policy.set permission on the folder resource to use this functionality.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/assuredworkloads.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const assuredworkloads = google.assuredworkloads('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/cloud-platform'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res =
    *     await assuredworkloads.organizations.locations.workloads.restrictAllowedResources(
    *       {
    *         // Required. The resource name of the Workload. This is the workloads's relative path in the API, formatted as "organizations/{organization_id\}/locations/{location_id\}/workloads/{workload_id\}". For example, "organizations/123/locations/us-east1/workloads/assured-workload-1".
    *         name: 'organizations/my-organization/locations/my-location/workloads/my-workload',
    *
    *         // Request body metadata
    *         requestBody: {
    *           // request body parameters
    *           // {
    *           //   "restrictionType": "my_restrictionType"
    *           // }
    *         },
    *       }
    *     );
    *   console.log(res.data);
    *
    *   // Example response
    *   // {}
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * ```
    *
    * @param params - Parameters for request
    * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param callback - Optional callback that handles the response.
    * @returns A promise if used with async/await, or void if used with a callback.
    */
  def restrictAllowedResources(
    params: ParamsResourceOrganizationsLocationsWorkloadsRestrictallowedresources,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def restrictAllowedResources(
    params: ParamsResourceOrganizationsLocationsWorkloadsRestrictallowedresources,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
