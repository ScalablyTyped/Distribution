package typings.googleapis.bigqueryreservationV1beta1Mod.bigqueryreservationV1beta1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/bigqueryreservation/v1beta1", "bigqueryreservation_v1beta1.Resource$Projects$Locations")
@js.native
open class ResourceProjectsLocations protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var capacityCommitments: ResourceProjectsLocationsCapacitycommitments = js.native
  
  var context: APIRequestContext = js.native
  
  def getBiReservation(): GaxiosPromise[SchemaBiReservation] = js.native
  def getBiReservation(callback: BodyResponseCallback[SchemaBiReservation]): Unit = js.native
  def getBiReservation(params: Unit, options: MethodOptions): GaxiosPromise[SchemaBiReservation] = js.native
  def getBiReservation(params: ParamsResourceProjectsLocationsGetbireservation): GaxiosPromise[SchemaBiReservation] = js.native
  def getBiReservation(
    params: ParamsResourceProjectsLocationsGetbireservation,
    callback: BodyResponseCallback[SchemaBiReservation]
  ): Unit = js.native
  def getBiReservation(
    params: ParamsResourceProjectsLocationsGetbireservation,
    options: BodyResponseCallback[Readable | SchemaBiReservation],
    callback: BodyResponseCallback[Readable | SchemaBiReservation]
  ): Unit = js.native
  def getBiReservation(params: ParamsResourceProjectsLocationsGetbireservation, options: MethodOptions): GaxiosPromise[SchemaBiReservation] = js.native
  def getBiReservation(
    params: ParamsResourceProjectsLocationsGetbireservation,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBiReservation]
  ): Unit = js.native
  /**
    * Retrieves a BI reservation.
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
    * const bigqueryreservation = google.bigqueryreservation('v1beta1');
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
    *   const res = await bigqueryreservation.projects.locations.getBiReservation({
    *     // Required. Name of the requested reservation, for example: `projects/{project_id\}/locations/{location_id\}/biReservation`
    *     name: 'projects/my-project/locations/my-location/biReservation',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "name": "my_name",
    *   //   "preferredTables": [],
    *   //   "size": "my_size",
    *   //   "updateTime": "my_updateTime"
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
  def getBiReservation(params: ParamsResourceProjectsLocationsGetbireservation, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def getBiReservation(
    params: ParamsResourceProjectsLocationsGetbireservation,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var reservations: ResourceProjectsLocationsReservations = js.native
  
  def searchAssignments(): GaxiosPromise[SchemaSearchAssignmentsResponse] = js.native
  def searchAssignments(callback: BodyResponseCallback[SchemaSearchAssignmentsResponse]): Unit = js.native
  def searchAssignments(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSearchAssignmentsResponse] = js.native
  def searchAssignments(params: ParamsResourceProjectsLocationsSearchassignments): GaxiosPromise[SchemaSearchAssignmentsResponse] = js.native
  def searchAssignments(
    params: ParamsResourceProjectsLocationsSearchassignments,
    callback: BodyResponseCallback[SchemaSearchAssignmentsResponse]
  ): Unit = js.native
  def searchAssignments(
    params: ParamsResourceProjectsLocationsSearchassignments,
    options: BodyResponseCallback[Readable | SchemaSearchAssignmentsResponse],
    callback: BodyResponseCallback[Readable | SchemaSearchAssignmentsResponse]
  ): Unit = js.native
  def searchAssignments(params: ParamsResourceProjectsLocationsSearchassignments, options: MethodOptions): GaxiosPromise[SchemaSearchAssignmentsResponse] = js.native
  def searchAssignments(
    params: ParamsResourceProjectsLocationsSearchassignments,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSearchAssignmentsResponse]
  ): Unit = js.native
  /**
    * Looks up assignments for a specified resource for a particular region. If the request is about a project: 1. Assignments created on the project will be returned if they exist. 2. Otherwise assignments created on the closest ancestor will be returned. 3. Assignments for different JobTypes will all be returned. The same logic applies if the request is about a folder. If the request is about an organization, then assignments created on the organization will be returned (organization doesn't have ancestors). Comparing to ListAssignments, there are some behavior differences: 1. permission on the assignee will be verified in this API. 2. Hierarchy lookup (project-\>folder-\>organization) happens in this API. 3. Parent here is `projects/x/locations/x`, instead of `projects/x/locations/xreservations/x`. **Note** "-" cannot be used for projects nor locations.
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
    * const bigqueryreservation = google.bigqueryreservation('v1beta1');
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
    *   const res = await bigqueryreservation.projects.locations.searchAssignments({
    *     // The maximum number of items to return.
    *     pageSize: 'placeholder-value',
    *     // The next_page_token value returned from a previous List request, if any.
    *     pageToken: 'placeholder-value',
    *     // Required. The resource name of the admin project(containing project and location), e.g.: `projects/myproject/locations/US`.
    *     parent: 'projects/my-project/locations/my-location',
    *     // Please specify resource name as assignee in the query. Examples: * `assignee=projects/myproject` * `assignee=folders/123` * `assignee=organizations/456`
    *     query: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "assignments": [],
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
  def searchAssignments(params: ParamsResourceProjectsLocationsSearchassignments, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def searchAssignments(
    params: ParamsResourceProjectsLocationsSearchassignments,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def updateBiReservation(): GaxiosPromise[SchemaBiReservation] = js.native
  def updateBiReservation(callback: BodyResponseCallback[SchemaBiReservation]): Unit = js.native
  def updateBiReservation(params: Unit, options: MethodOptions): GaxiosPromise[SchemaBiReservation] = js.native
  def updateBiReservation(params: ParamsResourceProjectsLocationsUpdatebireservation): GaxiosPromise[SchemaBiReservation] = js.native
  def updateBiReservation(
    params: ParamsResourceProjectsLocationsUpdatebireservation,
    callback: BodyResponseCallback[SchemaBiReservation]
  ): Unit = js.native
  def updateBiReservation(
    params: ParamsResourceProjectsLocationsUpdatebireservation,
    options: BodyResponseCallback[Readable | SchemaBiReservation],
    callback: BodyResponseCallback[Readable | SchemaBiReservation]
  ): Unit = js.native
  def updateBiReservation(params: ParamsResourceProjectsLocationsUpdatebireservation, options: MethodOptions): GaxiosPromise[SchemaBiReservation] = js.native
  def updateBiReservation(
    params: ParamsResourceProjectsLocationsUpdatebireservation,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBiReservation]
  ): Unit = js.native
  /**
    * Updates a BI reservation. Only fields specified in the `field_mask` are updated. A singleton BI reservation always exists with default size 0. In order to reserve BI capacity it needs to be updated to an amount greater than 0. In order to release BI capacity reservation size must be set to 0.
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
    * const bigqueryreservation = google.bigqueryreservation('v1beta1');
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
    *   const res = await bigqueryreservation.projects.locations.updateBiReservation({
    *     // The resource name of the singleton BI reservation. Reservation names have the form `projects/{project_id\}/locations/{location_id\}/biReservation`.
    *     name: 'projects/my-project/locations/my-location/biReservation',
    *     // A list of fields to be updated in this request.
    *     updateMask: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "name": "my_name",
    *       //   "preferredTables": [],
    *       //   "size": "my_size",
    *       //   "updateTime": "my_updateTime"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "name": "my_name",
    *   //   "preferredTables": [],
    *   //   "size": "my_size",
    *   //   "updateTime": "my_updateTime"
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
  def updateBiReservation(params: ParamsResourceProjectsLocationsUpdatebireservation, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def updateBiReservation(
    params: ParamsResourceProjectsLocationsUpdatebireservation,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
