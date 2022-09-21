package typings.googleapis.bigqueryreservationV1Mod.bigqueryreservationV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/bigqueryreservation/v1", "bigqueryreservation_v1.Resource$Projects$Locations$Capacitycommitments")
@js.native
open class ResourceProjectsLocationsCapacitycommitments protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaCapacityCommitment] = js.native
  def create(callback: BodyResponseCallback[SchemaCapacityCommitment]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCapacityCommitment] = js.native
  def create(params: ParamsResourceProjectsLocationsCapacitycommitmentsCreate): GaxiosPromise[SchemaCapacityCommitment] = js.native
  def create(
    params: ParamsResourceProjectsLocationsCapacitycommitmentsCreate,
    callback: BodyResponseCallback[SchemaCapacityCommitment]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsLocationsCapacitycommitmentsCreate,
    options: BodyResponseCallback[Readable | SchemaCapacityCommitment],
    callback: BodyResponseCallback[Readable | SchemaCapacityCommitment]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsLocationsCapacitycommitmentsCreate, options: MethodOptions): GaxiosPromise[SchemaCapacityCommitment] = js.native
  def create(
    params: ParamsResourceProjectsLocationsCapacitycommitmentsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCapacityCommitment]
  ): Unit = js.native
  /**
    * Creates a new capacity commitment resource.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/bigqueryreservation.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const bigqueryreservation = google.bigqueryreservation('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/bigquery',
    *       'https://www.googleapis.com/auth/cloud-platform',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res =
    *     await bigqueryreservation.projects.locations.capacityCommitments.create({
    *       // The optional capacity commitment ID. Capacity commitment name will be generated automatically if this field is empty. This field must only contain lower case alphanumeric characters or dashes. The first and last character cannot be a dash. Max length is 64 characters. NOTE: this ID won't be kept if the capacity commitment is split or merged.
    *       capacityCommitmentId: 'placeholder-value',
    *       // If true, fail the request if another project in the organization has a capacity commitment.
    *       enforceSingleAdminProjectPerOrg: 'placeholder-value',
    *       // Required. Resource name of the parent reservation. E.g., `projects/myproject/locations/US`
    *       parent: 'projects/my-project/locations/my-location',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "commitmentEndTime": "my_commitmentEndTime",
    *         //   "commitmentStartTime": "my_commitmentStartTime",
    *         //   "failureStatus": {},
    *         //   "multiRegionAuxiliary": false,
    *         //   "name": "my_name",
    *         //   "plan": "my_plan",
    *         //   "renewalPlan": "my_renewalPlan",
    *         //   "slotCount": "my_slotCount",
    *         //   "state": "my_state"
    *         // }
    *       },
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "commitmentEndTime": "my_commitmentEndTime",
    *   //   "commitmentStartTime": "my_commitmentStartTime",
    *   //   "failureStatus": {},
    *   //   "multiRegionAuxiliary": false,
    *   //   "name": "my_name",
    *   //   "plan": "my_plan",
    *   //   "renewalPlan": "my_renewalPlan",
    *   //   "slotCount": "my_slotCount",
    *   //   "state": "my_state"
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
  def create(params: ParamsResourceProjectsLocationsCapacitycommitmentsCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceProjectsLocationsCapacitycommitmentsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceProjectsLocationsCapacitycommitmentsDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsCapacitycommitmentsDelete,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsLocationsCapacitycommitmentsDelete,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsLocationsCapacitycommitmentsDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsCapacitycommitmentsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * Deletes a capacity commitment. Attempting to delete capacity commitment before its commitment_end_time will fail with the error code `google.rpc.Code.FAILED_PRECONDITION`.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/bigqueryreservation.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const bigqueryreservation = google.bigqueryreservation('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/bigquery',
    *       'https://www.googleapis.com/auth/cloud-platform',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res =
    *     await bigqueryreservation.projects.locations.capacityCommitments.delete({
    *       // Can be used to force delete commitments even if assignments exist. Deleting commitments with assignments may cause queries to fail if they no longer have access to slots.
    *       force: 'placeholder-value',
    *       // Required. Resource name of the capacity commitment to delete. E.g., `projects/myproject/locations/US/capacityCommitments/123`
    *       name: 'projects/my-project/locations/my-location/capacityCommitments/my-capacityCommitment',
    *     });
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
  def delete(params: ParamsResourceProjectsLocationsCapacitycommitmentsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsCapacitycommitmentsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaCapacityCommitment] = js.native
  def get(callback: BodyResponseCallback[SchemaCapacityCommitment]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCapacityCommitment] = js.native
  def get(params: ParamsResourceProjectsLocationsCapacitycommitmentsGet): GaxiosPromise[SchemaCapacityCommitment] = js.native
  def get(
    params: ParamsResourceProjectsLocationsCapacitycommitmentsGet,
    callback: BodyResponseCallback[SchemaCapacityCommitment]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsLocationsCapacitycommitmentsGet,
    options: BodyResponseCallback[Readable | SchemaCapacityCommitment],
    callback: BodyResponseCallback[Readable | SchemaCapacityCommitment]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsLocationsCapacitycommitmentsGet, options: MethodOptions): GaxiosPromise[SchemaCapacityCommitment] = js.native
  def get(
    params: ParamsResourceProjectsLocationsCapacitycommitmentsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCapacityCommitment]
  ): Unit = js.native
  /**
    * Returns information about the capacity commitment.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/bigqueryreservation.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const bigqueryreservation = google.bigqueryreservation('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/bigquery',
    *       'https://www.googleapis.com/auth/cloud-platform',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res =
    *     await bigqueryreservation.projects.locations.capacityCommitments.get({
    *       // Required. Resource name of the capacity commitment to retrieve. E.g., `projects/myproject/locations/US/capacityCommitments/123`
    *       name: 'projects/my-project/locations/my-location/capacityCommitments/my-capacityCommitment',
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "commitmentEndTime": "my_commitmentEndTime",
    *   //   "commitmentStartTime": "my_commitmentStartTime",
    *   //   "failureStatus": {},
    *   //   "multiRegionAuxiliary": false,
    *   //   "name": "my_name",
    *   //   "plan": "my_plan",
    *   //   "renewalPlan": "my_renewalPlan",
    *   //   "slotCount": "my_slotCount",
    *   //   "state": "my_state"
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
  def get(params: ParamsResourceProjectsLocationsCapacitycommitmentsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsLocationsCapacitycommitmentsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListCapacityCommitmentsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListCapacityCommitmentsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListCapacityCommitmentsResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsCapacitycommitmentsList): GaxiosPromise[SchemaListCapacityCommitmentsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsCapacitycommitmentsList,
    callback: BodyResponseCallback[SchemaListCapacityCommitmentsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsCapacitycommitmentsList,
    options: BodyResponseCallback[Readable | SchemaListCapacityCommitmentsResponse],
    callback: BodyResponseCallback[Readable | SchemaListCapacityCommitmentsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsCapacitycommitmentsList, options: MethodOptions): GaxiosPromise[SchemaListCapacityCommitmentsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsCapacitycommitmentsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListCapacityCommitmentsResponse]
  ): Unit = js.native
  /**
    * Lists all the capacity commitments for the admin project.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/bigqueryreservation.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const bigqueryreservation = google.bigqueryreservation('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/bigquery',
    *       'https://www.googleapis.com/auth/cloud-platform',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res =
    *     await bigqueryreservation.projects.locations.capacityCommitments.list({
    *       // The maximum number of items to return.
    *       pageSize: 'placeholder-value',
    *       // The next_page_token value returned from a previous List request, if any.
    *       pageToken: 'placeholder-value',
    *       // Required. Resource name of the parent reservation. E.g., `projects/myproject/locations/US`
    *       parent: 'projects/my-project/locations/my-location',
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "capacityCommitments": [],
    *   //   "nextPageToken": "my_nextPageToken"
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
  def list(params: ParamsResourceProjectsLocationsCapacitycommitmentsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsLocationsCapacitycommitmentsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def merge(): GaxiosPromise[SchemaCapacityCommitment] = js.native
  def merge(callback: BodyResponseCallback[SchemaCapacityCommitment]): Unit = js.native
  def merge(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCapacityCommitment] = js.native
  def merge(params: ParamsResourceProjectsLocationsCapacitycommitmentsMerge): GaxiosPromise[SchemaCapacityCommitment] = js.native
  def merge(
    params: ParamsResourceProjectsLocationsCapacitycommitmentsMerge,
    callback: BodyResponseCallback[SchemaCapacityCommitment]
  ): Unit = js.native
  def merge(
    params: ParamsResourceProjectsLocationsCapacitycommitmentsMerge,
    options: BodyResponseCallback[Readable | SchemaCapacityCommitment],
    callback: BodyResponseCallback[Readable | SchemaCapacityCommitment]
  ): Unit = js.native
  def merge(params: ParamsResourceProjectsLocationsCapacitycommitmentsMerge, options: MethodOptions): GaxiosPromise[SchemaCapacityCommitment] = js.native
  def merge(
    params: ParamsResourceProjectsLocationsCapacitycommitmentsMerge,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCapacityCommitment]
  ): Unit = js.native
  /**
    * Merges capacity commitments of the same plan into a single commitment. The resulting capacity commitment has the greater commitment_end_time out of the to-be-merged capacity commitments. Attempting to merge capacity commitments of different plan will fail with the error code `google.rpc.Code.FAILED_PRECONDITION`.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/bigqueryreservation.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const bigqueryreservation = google.bigqueryreservation('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/bigquery',
    *       'https://www.googleapis.com/auth/cloud-platform',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res =
    *     await bigqueryreservation.projects.locations.capacityCommitments.merge({
    *       // Parent resource that identifies admin project and location e.g., `projects/myproject/locations/us`
    *       parent: 'projects/my-project/locations/my-location',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "capacityCommitmentIds": []
    *         // }
    *       },
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "commitmentEndTime": "my_commitmentEndTime",
    *   //   "commitmentStartTime": "my_commitmentStartTime",
    *   //   "failureStatus": {},
    *   //   "multiRegionAuxiliary": false,
    *   //   "name": "my_name",
    *   //   "plan": "my_plan",
    *   //   "renewalPlan": "my_renewalPlan",
    *   //   "slotCount": "my_slotCount",
    *   //   "state": "my_state"
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
  def merge(params: ParamsResourceProjectsLocationsCapacitycommitmentsMerge, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def merge(
    params: ParamsResourceProjectsLocationsCapacitycommitmentsMerge,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaCapacityCommitment] = js.native
  def patch(callback: BodyResponseCallback[SchemaCapacityCommitment]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCapacityCommitment] = js.native
  def patch(params: ParamsResourceProjectsLocationsCapacitycommitmentsPatch): GaxiosPromise[SchemaCapacityCommitment] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsCapacitycommitmentsPatch,
    callback: BodyResponseCallback[SchemaCapacityCommitment]
  ): Unit = js.native
  def patch(
    params: ParamsResourceProjectsLocationsCapacitycommitmentsPatch,
    options: BodyResponseCallback[Readable | SchemaCapacityCommitment],
    callback: BodyResponseCallback[Readable | SchemaCapacityCommitment]
  ): Unit = js.native
  def patch(params: ParamsResourceProjectsLocationsCapacitycommitmentsPatch, options: MethodOptions): GaxiosPromise[SchemaCapacityCommitment] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsCapacitycommitmentsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCapacityCommitment]
  ): Unit = js.native
  /**
    * Updates an existing capacity commitment. Only `plan` and `renewal_plan` fields can be updated. Plan can only be changed to a plan of a longer commitment period. Attempting to change to a plan with shorter commitment period will fail with the error code `google.rpc.Code.FAILED_PRECONDITION`.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/bigqueryreservation.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const bigqueryreservation = google.bigqueryreservation('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/bigquery',
    *       'https://www.googleapis.com/auth/cloud-platform',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res =
    *     await bigqueryreservation.projects.locations.capacityCommitments.patch({
    *       // Output only. The resource name of the capacity commitment, e.g., `projects/myproject/locations/US/capacityCommitments/123` The commitment_id must only contain lower case alphanumeric characters or dashes. It must start with a letter and must not end with a dash. Its maximum length is 64 characters.
    *       name: 'projects/my-project/locations/my-location/capacityCommitments/my-capacityCommitment',
    *       // Standard field mask for the set of fields to be updated.
    *       updateMask: 'placeholder-value',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "commitmentEndTime": "my_commitmentEndTime",
    *         //   "commitmentStartTime": "my_commitmentStartTime",
    *         //   "failureStatus": {},
    *         //   "multiRegionAuxiliary": false,
    *         //   "name": "my_name",
    *         //   "plan": "my_plan",
    *         //   "renewalPlan": "my_renewalPlan",
    *         //   "slotCount": "my_slotCount",
    *         //   "state": "my_state"
    *         // }
    *       },
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "commitmentEndTime": "my_commitmentEndTime",
    *   //   "commitmentStartTime": "my_commitmentStartTime",
    *   //   "failureStatus": {},
    *   //   "multiRegionAuxiliary": false,
    *   //   "name": "my_name",
    *   //   "plan": "my_plan",
    *   //   "renewalPlan": "my_renewalPlan",
    *   //   "slotCount": "my_slotCount",
    *   //   "state": "my_state"
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
  def patch(params: ParamsResourceProjectsLocationsCapacitycommitmentsPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsCapacitycommitmentsPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def split(): GaxiosPromise[SchemaSplitCapacityCommitmentResponse] = js.native
  def split(callback: BodyResponseCallback[SchemaSplitCapacityCommitmentResponse]): Unit = js.native
  def split(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSplitCapacityCommitmentResponse] = js.native
  def split(params: ParamsResourceProjectsLocationsCapacitycommitmentsSplit): GaxiosPromise[SchemaSplitCapacityCommitmentResponse] = js.native
  def split(
    params: ParamsResourceProjectsLocationsCapacitycommitmentsSplit,
    callback: BodyResponseCallback[SchemaSplitCapacityCommitmentResponse]
  ): Unit = js.native
  def split(
    params: ParamsResourceProjectsLocationsCapacitycommitmentsSplit,
    options: BodyResponseCallback[Readable | SchemaSplitCapacityCommitmentResponse],
    callback: BodyResponseCallback[Readable | SchemaSplitCapacityCommitmentResponse]
  ): Unit = js.native
  def split(params: ParamsResourceProjectsLocationsCapacitycommitmentsSplit, options: MethodOptions): GaxiosPromise[SchemaSplitCapacityCommitmentResponse] = js.native
  def split(
    params: ParamsResourceProjectsLocationsCapacitycommitmentsSplit,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSplitCapacityCommitmentResponse]
  ): Unit = js.native
  /**
    * Splits capacity commitment to two commitments of the same plan and `commitment_end_time`. A common use case is to enable downgrading commitments. For example, in order to downgrade from 10000 slots to 8000, you might split a 10000 capacity commitment into commitments of 2000 and 8000. Then, you delete the first one after the commitment end time passes.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/bigqueryreservation.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const bigqueryreservation = google.bigqueryreservation('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/bigquery',
    *       'https://www.googleapis.com/auth/cloud-platform',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res =
    *     await bigqueryreservation.projects.locations.capacityCommitments.split({
    *       // Required. The resource name e.g.,: `projects/myproject/locations/US/capacityCommitments/123`
    *       name: 'projects/my-project/locations/my-location/capacityCommitments/my-capacityCommitment',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "slotCount": "my_slotCount"
    *         // }
    *       },
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "first": {},
    *   //   "second": {}
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
  def split(params: ParamsResourceProjectsLocationsCapacitycommitmentsSplit, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def split(
    params: ParamsResourceProjectsLocationsCapacitycommitmentsSplit,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
