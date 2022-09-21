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

@JSImport("googleapis/build/src/apis/bigqueryreservation/v1", "bigqueryreservation_v1.Resource$Projects$Locations$Reservations")
@js.native
open class ResourceProjectsLocationsReservations protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var assignments: ResourceProjectsLocationsReservationsAssignments = js.native
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaReservation] = js.native
  def create(callback: BodyResponseCallback[SchemaReservation]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaReservation] = js.native
  def create(params: ParamsResourceProjectsLocationsReservationsCreate): GaxiosPromise[SchemaReservation] = js.native
  def create(
    params: ParamsResourceProjectsLocationsReservationsCreate,
    callback: BodyResponseCallback[SchemaReservation]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsLocationsReservationsCreate,
    options: BodyResponseCallback[Readable | SchemaReservation],
    callback: BodyResponseCallback[Readable | SchemaReservation]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsLocationsReservationsCreate, options: MethodOptions): GaxiosPromise[SchemaReservation] = js.native
  def create(
    params: ParamsResourceProjectsLocationsReservationsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaReservation]
  ): Unit = js.native
  /**
    * Creates a new reservation resource.
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
    *   const res = await bigqueryreservation.projects.locations.reservations.create({
    *     // Required. Project, location. E.g., `projects/myproject/locations/US`
    *     parent: 'projects/my-project/locations/my-location',
    *     // The reservation ID. It must only contain lower case alphanumeric characters or dashes. It must start with a letter and must not end with a dash. Its maximum length is 64 characters.
    *     reservationId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "concurrency": "my_concurrency",
    *       //   "creationTime": "my_creationTime",
    *       //   "ignoreIdleSlots": false,
    *       //   "multiRegionAuxiliary": false,
    *       //   "name": "my_name",
    *       //   "slotCapacity": "my_slotCapacity",
    *       //   "updateTime": "my_updateTime"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "concurrency": "my_concurrency",
    *   //   "creationTime": "my_creationTime",
    *   //   "ignoreIdleSlots": false,
    *   //   "multiRegionAuxiliary": false,
    *   //   "name": "my_name",
    *   //   "slotCapacity": "my_slotCapacity",
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
  def create(params: ParamsResourceProjectsLocationsReservationsCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceProjectsLocationsReservationsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceProjectsLocationsReservationsDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsReservationsDelete,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsLocationsReservationsDelete,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsLocationsReservationsDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsReservationsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * Deletes a reservation. Returns `google.rpc.Code.FAILED_PRECONDITION` when reservation has assignments.
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
    *   const res = await bigqueryreservation.projects.locations.reservations.delete({
    *     // Required. Resource name of the reservation to retrieve. E.g., `projects/myproject/locations/US/reservations/team1-prod`
    *     name: 'projects/my-project/locations/my-location/reservations/my-reservation',
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
  def delete(params: ParamsResourceProjectsLocationsReservationsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsReservationsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaReservation] = js.native
  def get(callback: BodyResponseCallback[SchemaReservation]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaReservation] = js.native
  def get(params: ParamsResourceProjectsLocationsReservationsGet): GaxiosPromise[SchemaReservation] = js.native
  def get(
    params: ParamsResourceProjectsLocationsReservationsGet,
    callback: BodyResponseCallback[SchemaReservation]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsLocationsReservationsGet,
    options: BodyResponseCallback[Readable | SchemaReservation],
    callback: BodyResponseCallback[Readable | SchemaReservation]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsLocationsReservationsGet, options: MethodOptions): GaxiosPromise[SchemaReservation] = js.native
  def get(
    params: ParamsResourceProjectsLocationsReservationsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaReservation]
  ): Unit = js.native
  /**
    * Returns information about the reservation.
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
    *   const res = await bigqueryreservation.projects.locations.reservations.get({
    *     // Required. Resource name of the reservation to retrieve. E.g., `projects/myproject/locations/US/reservations/team1-prod`
    *     name: 'projects/my-project/locations/my-location/reservations/my-reservation',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "concurrency": "my_concurrency",
    *   //   "creationTime": "my_creationTime",
    *   //   "ignoreIdleSlots": false,
    *   //   "multiRegionAuxiliary": false,
    *   //   "name": "my_name",
    *   //   "slotCapacity": "my_slotCapacity",
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
  def get(params: ParamsResourceProjectsLocationsReservationsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsLocationsReservationsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListReservationsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListReservationsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListReservationsResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsReservationsList): GaxiosPromise[SchemaListReservationsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsReservationsList,
    callback: BodyResponseCallback[SchemaListReservationsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsReservationsList,
    options: BodyResponseCallback[Readable | SchemaListReservationsResponse],
    callback: BodyResponseCallback[Readable | SchemaListReservationsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsReservationsList, options: MethodOptions): GaxiosPromise[SchemaListReservationsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsReservationsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListReservationsResponse]
  ): Unit = js.native
  /**
    * Lists all the reservations for the project in the specified location.
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
    *   const res = await bigqueryreservation.projects.locations.reservations.list({
    *     // The maximum number of items to return per page.
    *     pageSize: 'placeholder-value',
    *     // The next_page_token value returned from a previous List request, if any.
    *     pageToken: 'placeholder-value',
    *     // Required. The parent resource name containing project and location, e.g.: `projects/myproject/locations/US`
    *     parent: 'projects/my-project/locations/my-location',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "reservations": []
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
  def list(params: ParamsResourceProjectsLocationsReservationsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsLocationsReservationsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaReservation] = js.native
  def patch(callback: BodyResponseCallback[SchemaReservation]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaReservation] = js.native
  def patch(params: ParamsResourceProjectsLocationsReservationsPatch): GaxiosPromise[SchemaReservation] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsReservationsPatch,
    callback: BodyResponseCallback[SchemaReservation]
  ): Unit = js.native
  def patch(
    params: ParamsResourceProjectsLocationsReservationsPatch,
    options: BodyResponseCallback[Readable | SchemaReservation],
    callback: BodyResponseCallback[Readable | SchemaReservation]
  ): Unit = js.native
  def patch(params: ParamsResourceProjectsLocationsReservationsPatch, options: MethodOptions): GaxiosPromise[SchemaReservation] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsReservationsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaReservation]
  ): Unit = js.native
  /**
    * Updates an existing reservation resource.
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
    *   const res = await bigqueryreservation.projects.locations.reservations.patch({
    *     // The resource name of the reservation, e.g., `projects/x/locations/x/reservations/team1-prod`. The reservation_id must only contain lower case alphanumeric characters or dashes. It must start with a letter and must not end with a dash. Its maximum length is 64 characters.
    *     name: 'projects/my-project/locations/my-location/reservations/my-reservation',
    *     // Standard field mask for the set of fields to be updated.
    *     updateMask: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "concurrency": "my_concurrency",
    *       //   "creationTime": "my_creationTime",
    *       //   "ignoreIdleSlots": false,
    *       //   "multiRegionAuxiliary": false,
    *       //   "name": "my_name",
    *       //   "slotCapacity": "my_slotCapacity",
    *       //   "updateTime": "my_updateTime"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "concurrency": "my_concurrency",
    *   //   "creationTime": "my_creationTime",
    *   //   "ignoreIdleSlots": false,
    *   //   "multiRegionAuxiliary": false,
    *   //   "name": "my_name",
    *   //   "slotCapacity": "my_slotCapacity",
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
  def patch(params: ParamsResourceProjectsLocationsReservationsPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsReservationsPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
