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

@JSImport("googleapis/build/src/apis/bigqueryreservation/v1", "bigqueryreservation_v1.Resource$Projects$Locations$Reservations$Assignments")
@js.native
open class ResourceProjectsLocationsReservationsAssignments protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaAssignment] = js.native
  def create(callback: BodyResponseCallback[SchemaAssignment]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAssignment] = js.native
  def create(params: ParamsResourceProjectsLocationsReservationsAssignmentsCreate): GaxiosPromise[SchemaAssignment] = js.native
  def create(
    params: ParamsResourceProjectsLocationsReservationsAssignmentsCreate,
    callback: BodyResponseCallback[SchemaAssignment]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsLocationsReservationsAssignmentsCreate,
    options: BodyResponseCallback[Readable | SchemaAssignment],
    callback: BodyResponseCallback[Readable | SchemaAssignment]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsLocationsReservationsAssignmentsCreate, options: MethodOptions): GaxiosPromise[SchemaAssignment] = js.native
  def create(
    params: ParamsResourceProjectsLocationsReservationsAssignmentsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAssignment]
  ): Unit = js.native
  /**
    * Creates an assignment object which allows the given project to submit jobs of a certain type using slots from the specified reservation. Currently a resource (project, folder, organization) can only have one assignment per each (job_type, location) combination, and that reservation will be used for all jobs of the matching type. Different assignments can be created on different levels of the projects, folders or organization hierarchy. During query execution, the assignment is looked up at the project, folder and organization levels in that order. The first assignment found is applied to the query. When creating assignments, it does not matter if other assignments exist at higher levels. Example: * The organization `organizationA` contains two projects, `project1` and `project2`. * Assignments for all three entities (`organizationA`, `project1`, and `project2`) could all be created and mapped to the same or different reservations. "None" assignments represent an absence of the assignment. Projects assigned to None use on-demand pricing. To create a "None" assignment, use "none" as a reservation_id in the parent. Example parent: `projects/myproject/locations/US/reservations/none`. Returns `google.rpc.Code.PERMISSION_DENIED` if user does not have 'bigquery.admin' permissions on the project using the reservation and the project that owns this reservation. Returns `google.rpc.Code.INVALID_ARGUMENT` when location of the assignment does not match location of the reservation.
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
    *     await bigqueryreservation.projects.locations.reservations.assignments.create(
    *       {
    *         // The optional assignment ID. Assignment name will be generated automatically if this field is empty. This field must only contain lower case alphanumeric characters or dashes. Max length is 64 characters.
    *         assignmentId: 'placeholder-value',
    *         // Required. The parent resource name of the assignment E.g. `projects/myproject/locations/US/reservations/team1-prod`
    *         parent:
    *           'projects/my-project/locations/my-location/reservations/my-reservation',
    *
    *         // Request body metadata
    *         requestBody: {
    *           // request body parameters
    *           // {
    *           //   "assignee": "my_assignee",
    *           //   "jobType": "my_jobType",
    *           //   "name": "my_name",
    *           //   "state": "my_state"
    *           // }
    *         },
    *       }
    *     );
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "assignee": "my_assignee",
    *   //   "jobType": "my_jobType",
    *   //   "name": "my_name",
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
  def create(params: ParamsResourceProjectsLocationsReservationsAssignmentsCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceProjectsLocationsReservationsAssignmentsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceProjectsLocationsReservationsAssignmentsDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsReservationsAssignmentsDelete,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsLocationsReservationsAssignmentsDelete,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsLocationsReservationsAssignmentsDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsReservationsAssignmentsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * Deletes a assignment. No expansion will happen. Example: * Organization `organizationA` contains two projects, `project1` and `project2`. * Reservation `res1` exists and was created previously. * CreateAssignment was used previously to define the following associations between entities and reservations: `` and `` In this example, deletion of the `` assignment won't affect the other assignment ``. After said deletion, queries from `project1` will still use `res1` while queries from `project2` will switch to use on-demand mode.
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
    *     await bigqueryreservation.projects.locations.reservations.assignments.delete(
    *       {
    *         // Required. Name of the resource, e.g. `projects/myproject/locations/US/reservations/team1-prod/assignments/123`
    *         name: 'projects/my-project/locations/my-location/reservations/my-reservation/assignments/my-assignment',
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
  def delete(params: ParamsResourceProjectsLocationsReservationsAssignmentsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsReservationsAssignmentsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListAssignmentsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListAssignmentsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListAssignmentsResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsReservationsAssignmentsList): GaxiosPromise[SchemaListAssignmentsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsReservationsAssignmentsList,
    callback: BodyResponseCallback[SchemaListAssignmentsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsReservationsAssignmentsList,
    options: BodyResponseCallback[Readable | SchemaListAssignmentsResponse],
    callback: BodyResponseCallback[Readable | SchemaListAssignmentsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsReservationsAssignmentsList, options: MethodOptions): GaxiosPromise[SchemaListAssignmentsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsReservationsAssignmentsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListAssignmentsResponse]
  ): Unit = js.native
  /**
    * Lists assignments. Only explicitly created assignments will be returned. Example: * Organization `organizationA` contains two projects, `project1` and `project2`. * Reservation `res1` exists and was created previously. * CreateAssignment was used previously to define the following associations between entities and reservations: `` and `` In this example, ListAssignments will just return the above two assignments for reservation `res1`, and no expansion/merge will happen. The wildcard "-" can be used for reservations in the request. In that case all assignments belongs to the specified project and location will be listed. **Note** "-" cannot be used for projects nor locations.
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
    *     await bigqueryreservation.projects.locations.reservations.assignments.list({
    *       // The maximum number of items to return per page.
    *       pageSize: 'placeholder-value',
    *       // The next_page_token value returned from a previous List request, if any.
    *       pageToken: 'placeholder-value',
    *       // Required. The parent resource name e.g.: `projects/myproject/locations/US/reservations/team1-prod` Or: `projects/myproject/locations/US/reservations/-`
    *       parent:
    *         'projects/my-project/locations/my-location/reservations/my-reservation',
    *     });
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
  def list(params: ParamsResourceProjectsLocationsReservationsAssignmentsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsLocationsReservationsAssignmentsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def move(): GaxiosPromise[SchemaAssignment] = js.native
  def move(callback: BodyResponseCallback[SchemaAssignment]): Unit = js.native
  def move(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAssignment] = js.native
  def move(params: ParamsResourceProjectsLocationsReservationsAssignmentsMove): GaxiosPromise[SchemaAssignment] = js.native
  def move(
    params: ParamsResourceProjectsLocationsReservationsAssignmentsMove,
    callback: BodyResponseCallback[SchemaAssignment]
  ): Unit = js.native
  def move(
    params: ParamsResourceProjectsLocationsReservationsAssignmentsMove,
    options: BodyResponseCallback[Readable | SchemaAssignment],
    callback: BodyResponseCallback[Readable | SchemaAssignment]
  ): Unit = js.native
  def move(params: ParamsResourceProjectsLocationsReservationsAssignmentsMove, options: MethodOptions): GaxiosPromise[SchemaAssignment] = js.native
  def move(
    params: ParamsResourceProjectsLocationsReservationsAssignmentsMove,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAssignment]
  ): Unit = js.native
  /**
    * Moves an assignment under a new reservation. This differs from removing an existing assignment and recreating a new one by providing a transactional change that ensures an assignee always has an associated reservation.
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
    *     await bigqueryreservation.projects.locations.reservations.assignments.move({
    *       // Required. The resource name of the assignment, e.g. `projects/myproject/locations/US/reservations/team1-prod/assignments/123`
    *       name: 'projects/my-project/locations/my-location/reservations/my-reservation/assignments/my-assignment',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "destinationId": "my_destinationId"
    *         // }
    *       },
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "assignee": "my_assignee",
    *   //   "jobType": "my_jobType",
    *   //   "name": "my_name",
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
  def move(params: ParamsResourceProjectsLocationsReservationsAssignmentsMove, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def move(
    params: ParamsResourceProjectsLocationsReservationsAssignmentsMove,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaAssignment] = js.native
  def patch(callback: BodyResponseCallback[SchemaAssignment]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAssignment] = js.native
  def patch(params: ParamsResourceProjectsLocationsReservationsAssignmentsPatch): GaxiosPromise[SchemaAssignment] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsReservationsAssignmentsPatch,
    callback: BodyResponseCallback[SchemaAssignment]
  ): Unit = js.native
  def patch(
    params: ParamsResourceProjectsLocationsReservationsAssignmentsPatch,
    options: BodyResponseCallback[Readable | SchemaAssignment],
    callback: BodyResponseCallback[Readable | SchemaAssignment]
  ): Unit = js.native
  def patch(params: ParamsResourceProjectsLocationsReservationsAssignmentsPatch, options: MethodOptions): GaxiosPromise[SchemaAssignment] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsReservationsAssignmentsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAssignment]
  ): Unit = js.native
  /**
    * Updates an existing assignment. Only the `priority` field can be updated.
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
    *     await bigqueryreservation.projects.locations.reservations.assignments.patch(
    *       {
    *         // Output only. Name of the resource. E.g.: `projects/myproject/locations/US/reservations/team1-prod/assignments/123`. The assignment_id must only contain lower case alphanumeric characters or dashes and the max length is 64 characters.
    *         name: 'projects/my-project/locations/my-location/reservations/my-reservation/assignments/my-assignment',
    *         // Standard field mask for the set of fields to be updated.
    *         updateMask: 'placeholder-value',
    *
    *         // Request body metadata
    *         requestBody: {
    *           // request body parameters
    *           // {
    *           //   "assignee": "my_assignee",
    *           //   "jobType": "my_jobType",
    *           //   "name": "my_name",
    *           //   "state": "my_state"
    *           // }
    *         },
    *       }
    *     );
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "assignee": "my_assignee",
    *   //   "jobType": "my_jobType",
    *   //   "name": "my_name",
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
  def patch(params: ParamsResourceProjectsLocationsReservationsAssignmentsPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsReservationsAssignmentsPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
