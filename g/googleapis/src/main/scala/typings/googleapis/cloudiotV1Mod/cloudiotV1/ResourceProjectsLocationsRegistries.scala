package typings.googleapis.cloudiotV1Mod.cloudiotV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/cloudiot/v1", "cloudiot_v1.Resource$Projects$Locations$Registries")
@js.native
open class ResourceProjectsLocationsRegistries protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  def bindDeviceToGateway(): GaxiosPromise[SchemaBindDeviceToGatewayResponse] = js.native
  def bindDeviceToGateway(callback: BodyResponseCallback[SchemaBindDeviceToGatewayResponse]): Unit = js.native
  def bindDeviceToGateway(params: Unit, options: MethodOptions): GaxiosPromise[SchemaBindDeviceToGatewayResponse] = js.native
  def bindDeviceToGateway(params: ParamsResourceProjectsLocationsRegistriesBinddevicetogateway): GaxiosPromise[SchemaBindDeviceToGatewayResponse] = js.native
  def bindDeviceToGateway(
    params: ParamsResourceProjectsLocationsRegistriesBinddevicetogateway,
    callback: BodyResponseCallback[SchemaBindDeviceToGatewayResponse]
  ): Unit = js.native
  def bindDeviceToGateway(
    params: ParamsResourceProjectsLocationsRegistriesBinddevicetogateway,
    options: BodyResponseCallback[Readable | SchemaBindDeviceToGatewayResponse],
    callback: BodyResponseCallback[Readable | SchemaBindDeviceToGatewayResponse]
  ): Unit = js.native
  def bindDeviceToGateway(params: ParamsResourceProjectsLocationsRegistriesBinddevicetogateway, options: MethodOptions): GaxiosPromise[SchemaBindDeviceToGatewayResponse] = js.native
  def bindDeviceToGateway(
    params: ParamsResourceProjectsLocationsRegistriesBinddevicetogateway,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBindDeviceToGatewayResponse]
  ): Unit = js.native
  /**
    * Associates the device with the gateway.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/cloudiot.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const cloudiot = google.cloudiot('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/cloudiot',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await cloudiot.projects.locations.registries.bindDeviceToGateway({
    *     // Required. The name of the registry. For example, `projects/example-project/locations/us-central1/registries/my-registry`.
    *     parent: 'projects/my-project/locations/my-location/registries/my-registrie',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "deviceId": "my_deviceId",
    *       //   "gatewayId": "my_gatewayId"
    *       // }
    *     },
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
  def bindDeviceToGateway(params: ParamsResourceProjectsLocationsRegistriesBinddevicetogateway, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def bindDeviceToGateway(
    params: ParamsResourceProjectsLocationsRegistriesBinddevicetogateway,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaDeviceRegistry] = js.native
  def create(callback: BodyResponseCallback[SchemaDeviceRegistry]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaDeviceRegistry] = js.native
  def create(params: ParamsResourceProjectsLocationsRegistriesCreate): GaxiosPromise[SchemaDeviceRegistry] = js.native
  def create(
    params: ParamsResourceProjectsLocationsRegistriesCreate,
    callback: BodyResponseCallback[SchemaDeviceRegistry]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsLocationsRegistriesCreate,
    options: BodyResponseCallback[Readable | SchemaDeviceRegistry],
    callback: BodyResponseCallback[Readable | SchemaDeviceRegistry]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsLocationsRegistriesCreate, options: MethodOptions): GaxiosPromise[SchemaDeviceRegistry] = js.native
  def create(
    params: ParamsResourceProjectsLocationsRegistriesCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDeviceRegistry]
  ): Unit = js.native
  /**
    * Creates a device registry that contains devices.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/cloudiot.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const cloudiot = google.cloudiot('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/cloudiot',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await cloudiot.projects.locations.registries.create({
    *     // Required. The project and cloud region where this device registry must be created. For example, `projects/example-project/locations/us-central1`.
    *     parent: 'projects/my-project/locations/my-location',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "credentials": [],
    *       //   "eventNotificationConfigs": [],
    *       //   "httpConfig": {},
    *       //   "id": "my_id",
    *       //   "logLevel": "my_logLevel",
    *       //   "mqttConfig": {},
    *       //   "name": "my_name",
    *       //   "stateNotificationConfig": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "credentials": [],
    *   //   "eventNotificationConfigs": [],
    *   //   "httpConfig": {},
    *   //   "id": "my_id",
    *   //   "logLevel": "my_logLevel",
    *   //   "mqttConfig": {},
    *   //   "name": "my_name",
    *   //   "stateNotificationConfig": {}
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
  def create(params: ParamsResourceProjectsLocationsRegistriesCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceProjectsLocationsRegistriesCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceProjectsLocationsRegistriesDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsRegistriesDelete,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsLocationsRegistriesDelete,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsLocationsRegistriesDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsRegistriesDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * Deletes a device registry configuration.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/cloudiot.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const cloudiot = google.cloudiot('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/cloudiot',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await cloudiot.projects.locations.registries.delete({
    *     // Required. The name of the device registry. For example, `projects/example-project/locations/us-central1/registries/my-registry`.
    *     name: 'projects/my-project/locations/my-location/registries/my-registrie',
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
  def delete(params: ParamsResourceProjectsLocationsRegistriesDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsRegistriesDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var devices: ResourceProjectsLocationsRegistriesDevices = js.native
  
  def get(): GaxiosPromise[SchemaDeviceRegistry] = js.native
  def get(callback: BodyResponseCallback[SchemaDeviceRegistry]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaDeviceRegistry] = js.native
  def get(params: ParamsResourceProjectsLocationsRegistriesGet): GaxiosPromise[SchemaDeviceRegistry] = js.native
  def get(
    params: ParamsResourceProjectsLocationsRegistriesGet,
    callback: BodyResponseCallback[SchemaDeviceRegistry]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsLocationsRegistriesGet,
    options: BodyResponseCallback[Readable | SchemaDeviceRegistry],
    callback: BodyResponseCallback[Readable | SchemaDeviceRegistry]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsLocationsRegistriesGet, options: MethodOptions): GaxiosPromise[SchemaDeviceRegistry] = js.native
  def get(
    params: ParamsResourceProjectsLocationsRegistriesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDeviceRegistry]
  ): Unit = js.native
  /**
    * Gets a device registry configuration.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/cloudiot.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const cloudiot = google.cloudiot('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/cloudiot',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await cloudiot.projects.locations.registries.get({
    *     // Required. The name of the device registry. For example, `projects/example-project/locations/us-central1/registries/my-registry`.
    *     name: 'projects/my-project/locations/my-location/registries/my-registrie',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "credentials": [],
    *   //   "eventNotificationConfigs": [],
    *   //   "httpConfig": {},
    *   //   "id": "my_id",
    *   //   "logLevel": "my_logLevel",
    *   //   "mqttConfig": {},
    *   //   "name": "my_name",
    *   //   "stateNotificationConfig": {}
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
  def get(params: ParamsResourceProjectsLocationsRegistriesGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsLocationsRegistriesGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def getIamPolicy(): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(callback: BodyResponseCallback[SchemaPolicy]): Unit = js.native
  def getIamPolicy(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(params: ParamsResourceProjectsLocationsRegistriesGetiampolicy): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(
    params: ParamsResourceProjectsLocationsRegistriesGetiampolicy,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  def getIamPolicy(
    params: ParamsResourceProjectsLocationsRegistriesGetiampolicy,
    options: BodyResponseCallback[Readable | SchemaPolicy],
    callback: BodyResponseCallback[Readable | SchemaPolicy]
  ): Unit = js.native
  def getIamPolicy(params: ParamsResourceProjectsLocationsRegistriesGetiampolicy, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(
    params: ParamsResourceProjectsLocationsRegistriesGetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  /**
    * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/cloudiot.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const cloudiot = google.cloudiot('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/cloudiot',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await cloudiot.projects.locations.registries.getIamPolicy({
    *     // REQUIRED: The resource for which the policy is being requested. See [Resource names](https://cloud.google.com/apis/design/resource_names) for the appropriate value for this field.
    *     resource:
    *       'projects/my-project/locations/my-location/registries/my-registrie',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "options": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "bindings": [],
    *   //   "etag": "my_etag",
    *   //   "version": 0
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
  def getIamPolicy(params: ParamsResourceProjectsLocationsRegistriesGetiampolicy, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def getIamPolicy(
    params: ParamsResourceProjectsLocationsRegistriesGetiampolicy,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var groups: ResourceProjectsLocationsRegistriesGroups = js.native
  
  def list(): GaxiosPromise[SchemaListDeviceRegistriesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListDeviceRegistriesResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListDeviceRegistriesResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsRegistriesList): GaxiosPromise[SchemaListDeviceRegistriesResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsRegistriesList,
    callback: BodyResponseCallback[SchemaListDeviceRegistriesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsRegistriesList,
    options: BodyResponseCallback[Readable | SchemaListDeviceRegistriesResponse],
    callback: BodyResponseCallback[Readable | SchemaListDeviceRegistriesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsRegistriesList, options: MethodOptions): GaxiosPromise[SchemaListDeviceRegistriesResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsRegistriesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListDeviceRegistriesResponse]
  ): Unit = js.native
  /**
    * Lists device registries.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/cloudiot.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const cloudiot = google.cloudiot('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/cloudiot',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await cloudiot.projects.locations.registries.list({
    *     // The maximum number of registries to return in the response. If this value is zero, the service will select a default size. A call may return fewer objects than requested. A non-empty `next_page_token` in the response indicates that more data is available.
    *     pageSize: 'placeholder-value',
    *     // The value returned by the last `ListDeviceRegistriesResponse`; indicates that this is a continuation of a prior `ListDeviceRegistries` call and the system should return the next page of data.
    *     pageToken: 'placeholder-value',
    *     // Required. The project and cloud region path. For example, `projects/example-project/locations/us-central1`.
    *     parent: 'projects/my-project/locations/my-location',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "deviceRegistries": [],
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
  def list(params: ParamsResourceProjectsLocationsRegistriesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsLocationsRegistriesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaDeviceRegistry] = js.native
  def patch(callback: BodyResponseCallback[SchemaDeviceRegistry]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaDeviceRegistry] = js.native
  def patch(params: ParamsResourceProjectsLocationsRegistriesPatch): GaxiosPromise[SchemaDeviceRegistry] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsRegistriesPatch,
    callback: BodyResponseCallback[SchemaDeviceRegistry]
  ): Unit = js.native
  def patch(
    params: ParamsResourceProjectsLocationsRegistriesPatch,
    options: BodyResponseCallback[Readable | SchemaDeviceRegistry],
    callback: BodyResponseCallback[Readable | SchemaDeviceRegistry]
  ): Unit = js.native
  def patch(params: ParamsResourceProjectsLocationsRegistriesPatch, options: MethodOptions): GaxiosPromise[SchemaDeviceRegistry] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsRegistriesPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDeviceRegistry]
  ): Unit = js.native
  /**
    * Updates a device registry configuration.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/cloudiot.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const cloudiot = google.cloudiot('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/cloudiot',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await cloudiot.projects.locations.registries.patch({
    *     // The resource path name. For example, `projects/example-project/locations/us-central1/registries/my-registry`.
    *     name: 'projects/my-project/locations/my-location/registries/my-registrie',
    *     // Required. Only updates the `device_registry` fields indicated by this mask. The field mask must not be empty, and it must not contain fields that are immutable or only set by the server. Mutable top-level fields: `event_notification_config`, `http_config`, `mqtt_config`, and `state_notification_config`.
    *     updateMask: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "credentials": [],
    *       //   "eventNotificationConfigs": [],
    *       //   "httpConfig": {},
    *       //   "id": "my_id",
    *       //   "logLevel": "my_logLevel",
    *       //   "mqttConfig": {},
    *       //   "name": "my_name",
    *       //   "stateNotificationConfig": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "credentials": [],
    *   //   "eventNotificationConfigs": [],
    *   //   "httpConfig": {},
    *   //   "id": "my_id",
    *   //   "logLevel": "my_logLevel",
    *   //   "mqttConfig": {},
    *   //   "name": "my_name",
    *   //   "stateNotificationConfig": {}
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
  def patch(params: ParamsResourceProjectsLocationsRegistriesPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsRegistriesPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def setIamPolicy(): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(callback: BodyResponseCallback[SchemaPolicy]): Unit = js.native
  def setIamPolicy(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(params: ParamsResourceProjectsLocationsRegistriesSetiampolicy): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(
    params: ParamsResourceProjectsLocationsRegistriesSetiampolicy,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  def setIamPolicy(
    params: ParamsResourceProjectsLocationsRegistriesSetiampolicy,
    options: BodyResponseCallback[Readable | SchemaPolicy],
    callback: BodyResponseCallback[Readable | SchemaPolicy]
  ): Unit = js.native
  def setIamPolicy(params: ParamsResourceProjectsLocationsRegistriesSetiampolicy, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(
    params: ParamsResourceProjectsLocationsRegistriesSetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  /**
    * Sets the access control policy on the specified resource. Replaces any existing policy.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/cloudiot.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const cloudiot = google.cloudiot('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/cloudiot',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await cloudiot.projects.locations.registries.setIamPolicy({
    *     // REQUIRED: The resource for which the policy is being specified. See [Resource names](https://cloud.google.com/apis/design/resource_names) for the appropriate value for this field.
    *     resource:
    *       'projects/my-project/locations/my-location/registries/my-registrie',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "policy": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "bindings": [],
    *   //   "etag": "my_etag",
    *   //   "version": 0
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
  def setIamPolicy(params: ParamsResourceProjectsLocationsRegistriesSetiampolicy, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def setIamPolicy(
    params: ParamsResourceProjectsLocationsRegistriesSetiampolicy,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def testIamPermissions(): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]): Unit = js.native
  def testIamPermissions(params: Unit, options: MethodOptions): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(params: ParamsResourceProjectsLocationsRegistriesTestiampermissions): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsLocationsRegistriesTestiampermissions,
    callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsLocationsRegistriesTestiampermissions,
    options: BodyResponseCallback[Readable | SchemaTestIamPermissionsResponse],
    callback: BodyResponseCallback[Readable | SchemaTestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(params: ParamsResourceProjectsLocationsRegistriesTestiampermissions, options: MethodOptions): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsLocationsRegistriesTestiampermissions,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]
  ): Unit = js.native
  /**
    * Returns permissions that a caller has on the specified resource. If the resource does not exist, this will return an empty set of permissions, not a NOT_FOUND error.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/cloudiot.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const cloudiot = google.cloudiot('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/cloudiot',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await cloudiot.projects.locations.registries.testIamPermissions({
    *     // REQUIRED: The resource for which the policy detail is being requested. See [Resource names](https://cloud.google.com/apis/design/resource_names) for the appropriate value for this field.
    *     resource:
    *       'projects/my-project/locations/my-location/registries/my-registrie',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "permissions": []
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "permissions": []
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
  def testIamPermissions(params: ParamsResourceProjectsLocationsRegistriesTestiampermissions, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsLocationsRegistriesTestiampermissions,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def unbindDeviceFromGateway(): GaxiosPromise[SchemaUnbindDeviceFromGatewayResponse] = js.native
  def unbindDeviceFromGateway(callback: BodyResponseCallback[SchemaUnbindDeviceFromGatewayResponse]): Unit = js.native
  def unbindDeviceFromGateway(params: Unit, options: MethodOptions): GaxiosPromise[SchemaUnbindDeviceFromGatewayResponse] = js.native
  def unbindDeviceFromGateway(params: ParamsResourceProjectsLocationsRegistriesUnbinddevicefromgateway): GaxiosPromise[SchemaUnbindDeviceFromGatewayResponse] = js.native
  def unbindDeviceFromGateway(
    params: ParamsResourceProjectsLocationsRegistriesUnbinddevicefromgateway,
    callback: BodyResponseCallback[SchemaUnbindDeviceFromGatewayResponse]
  ): Unit = js.native
  def unbindDeviceFromGateway(
    params: ParamsResourceProjectsLocationsRegistriesUnbinddevicefromgateway,
    options: BodyResponseCallback[Readable | SchemaUnbindDeviceFromGatewayResponse],
    callback: BodyResponseCallback[Readable | SchemaUnbindDeviceFromGatewayResponse]
  ): Unit = js.native
  def unbindDeviceFromGateway(params: ParamsResourceProjectsLocationsRegistriesUnbinddevicefromgateway, options: MethodOptions): GaxiosPromise[SchemaUnbindDeviceFromGatewayResponse] = js.native
  def unbindDeviceFromGateway(
    params: ParamsResourceProjectsLocationsRegistriesUnbinddevicefromgateway,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaUnbindDeviceFromGatewayResponse]
  ): Unit = js.native
  /**
    * Deletes the association between the device and the gateway.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/cloudiot.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const cloudiot = google.cloudiot('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/cloudiot',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res =
    *     await cloudiot.projects.locations.registries.unbindDeviceFromGateway({
    *       // Required. The name of the registry. For example, `projects/example-project/locations/us-central1/registries/my-registry`.
    *       parent:
    *         'projects/my-project/locations/my-location/registries/my-registrie',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "deviceId": "my_deviceId",
    *         //   "gatewayId": "my_gatewayId"
    *         // }
    *       },
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
  def unbindDeviceFromGateway(
    params: ParamsResourceProjectsLocationsRegistriesUnbinddevicefromgateway,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def unbindDeviceFromGateway(
    params: ParamsResourceProjectsLocationsRegistriesUnbinddevicefromgateway,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
