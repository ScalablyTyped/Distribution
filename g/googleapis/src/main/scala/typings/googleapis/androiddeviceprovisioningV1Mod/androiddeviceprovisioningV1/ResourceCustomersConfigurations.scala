package typings.googleapis.androiddeviceprovisioningV1Mod.androiddeviceprovisioningV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/androiddeviceprovisioning/v1", "androiddeviceprovisioning_v1.Resource$Customers$Configurations")
@js.native
open class ResourceCustomersConfigurations protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaConfiguration] = js.native
  def create(callback: BodyResponseCallback[SchemaConfiguration]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaConfiguration] = js.native
  def create(params: ParamsResourceCustomersConfigurationsCreate): GaxiosPromise[SchemaConfiguration] = js.native
  def create(
    params: ParamsResourceCustomersConfigurationsCreate,
    callback: BodyResponseCallback[SchemaConfiguration]
  ): Unit = js.native
  def create(
    params: ParamsResourceCustomersConfigurationsCreate,
    options: BodyResponseCallback[Readable | SchemaConfiguration],
    callback: BodyResponseCallback[Readable | SchemaConfiguration]
  ): Unit = js.native
  def create(params: ParamsResourceCustomersConfigurationsCreate, options: MethodOptions): GaxiosPromise[SchemaConfiguration] = js.native
  def create(
    params: ParamsResourceCustomersConfigurationsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaConfiguration]
  ): Unit = js.native
  /**
    * Creates a new configuration. Once created, a customer can apply the configuration to devices.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/androiddeviceprovisioning.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const androiddeviceprovisioning = google.androiddeviceprovisioning('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await androiddeviceprovisioning.customers.configurations.create({
    *     // Required. The customer that manages the configuration. An API resource name in the format `customers/[CUSTOMER_ID]`. This field has custom validation in CreateConfigurationRequestValidator
    *     parent: 'customers/my-customer',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "companyName": "my_companyName",
    *       //   "configurationId": "my_configurationId",
    *       //   "configurationName": "my_configurationName",
    *       //   "contactEmail": "my_contactEmail",
    *       //   "contactPhone": "my_contactPhone",
    *       //   "customMessage": "my_customMessage",
    *       //   "dpcExtras": "my_dpcExtras",
    *       //   "dpcResourcePath": "my_dpcResourcePath",
    *       //   "isDefault": false,
    *       //   "name": "my_name"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "companyName": "my_companyName",
    *   //   "configurationId": "my_configurationId",
    *   //   "configurationName": "my_configurationName",
    *   //   "contactEmail": "my_contactEmail",
    *   //   "contactPhone": "my_contactPhone",
    *   //   "customMessage": "my_customMessage",
    *   //   "dpcExtras": "my_dpcExtras",
    *   //   "dpcResourcePath": "my_dpcResourcePath",
    *   //   "isDefault": false,
    *   //   "name": "my_name"
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
  def create(params: ParamsResourceCustomersConfigurationsCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceCustomersConfigurationsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceCustomersConfigurationsDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceCustomersConfigurationsDelete, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(
    params: ParamsResourceCustomersConfigurationsDelete,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceCustomersConfigurationsDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceCustomersConfigurationsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * Deletes an unused configuration. The API call fails if the customer has devices with the configuration applied.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/androiddeviceprovisioning.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const androiddeviceprovisioning = google.androiddeviceprovisioning('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await androiddeviceprovisioning.customers.configurations.delete({
    *     // Required. The configuration to delete. An API resource name in the format `customers/[CUSTOMER_ID]/configurations/[CONFIGURATION_ID]`. If the configuration is applied to any devices, the API call fails.
    *     name: 'customers/my-customer/configurations/my-configuration',
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
  def delete(params: ParamsResourceCustomersConfigurationsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceCustomersConfigurationsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaConfiguration] = js.native
  def get(callback: BodyResponseCallback[SchemaConfiguration]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaConfiguration] = js.native
  def get(params: ParamsResourceCustomersConfigurationsGet): GaxiosPromise[SchemaConfiguration] = js.native
  def get(
    params: ParamsResourceCustomersConfigurationsGet,
    callback: BodyResponseCallback[SchemaConfiguration]
  ): Unit = js.native
  def get(
    params: ParamsResourceCustomersConfigurationsGet,
    options: BodyResponseCallback[Readable | SchemaConfiguration],
    callback: BodyResponseCallback[Readable | SchemaConfiguration]
  ): Unit = js.native
  def get(params: ParamsResourceCustomersConfigurationsGet, options: MethodOptions): GaxiosPromise[SchemaConfiguration] = js.native
  def get(
    params: ParamsResourceCustomersConfigurationsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaConfiguration]
  ): Unit = js.native
  /**
    * Gets the details of a configuration.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/androiddeviceprovisioning.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const androiddeviceprovisioning = google.androiddeviceprovisioning('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await androiddeviceprovisioning.customers.configurations.get({
    *     // Required. The configuration to get. An API resource name in the format `customers/[CUSTOMER_ID]/configurations/[CONFIGURATION_ID]`.
    *     name: 'customers/my-customer/configurations/my-configuration',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "companyName": "my_companyName",
    *   //   "configurationId": "my_configurationId",
    *   //   "configurationName": "my_configurationName",
    *   //   "contactEmail": "my_contactEmail",
    *   //   "contactPhone": "my_contactPhone",
    *   //   "customMessage": "my_customMessage",
    *   //   "dpcExtras": "my_dpcExtras",
    *   //   "dpcResourcePath": "my_dpcResourcePath",
    *   //   "isDefault": false,
    *   //   "name": "my_name"
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
  def get(params: ParamsResourceCustomersConfigurationsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceCustomersConfigurationsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaCustomerListConfigurationsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaCustomerListConfigurationsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCustomerListConfigurationsResponse] = js.native
  def list(params: ParamsResourceCustomersConfigurationsList): GaxiosPromise[SchemaCustomerListConfigurationsResponse] = js.native
  def list(
    params: ParamsResourceCustomersConfigurationsList,
    callback: BodyResponseCallback[SchemaCustomerListConfigurationsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceCustomersConfigurationsList,
    options: BodyResponseCallback[Readable | SchemaCustomerListConfigurationsResponse],
    callback: BodyResponseCallback[Readable | SchemaCustomerListConfigurationsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceCustomersConfigurationsList, options: MethodOptions): GaxiosPromise[SchemaCustomerListConfigurationsResponse] = js.native
  def list(
    params: ParamsResourceCustomersConfigurationsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCustomerListConfigurationsResponse]
  ): Unit = js.native
  /**
    * Lists a customer's configurations.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/androiddeviceprovisioning.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const androiddeviceprovisioning = google.androiddeviceprovisioning('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await androiddeviceprovisioning.customers.configurations.list({
    *     // Required. The customer that manages the listed configurations. An API resource name in the format `customers/[CUSTOMER_ID]`.
    *     parent: 'customers/my-customer',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "configurations": []
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
  def list(params: ParamsResourceCustomersConfigurationsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceCustomersConfigurationsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaConfiguration] = js.native
  def patch(callback: BodyResponseCallback[SchemaConfiguration]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaConfiguration] = js.native
  def patch(params: ParamsResourceCustomersConfigurationsPatch): GaxiosPromise[SchemaConfiguration] = js.native
  def patch(
    params: ParamsResourceCustomersConfigurationsPatch,
    callback: BodyResponseCallback[SchemaConfiguration]
  ): Unit = js.native
  def patch(
    params: ParamsResourceCustomersConfigurationsPatch,
    options: BodyResponseCallback[Readable | SchemaConfiguration],
    callback: BodyResponseCallback[Readable | SchemaConfiguration]
  ): Unit = js.native
  def patch(params: ParamsResourceCustomersConfigurationsPatch, options: MethodOptions): GaxiosPromise[SchemaConfiguration] = js.native
  def patch(
    params: ParamsResourceCustomersConfigurationsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaConfiguration]
  ): Unit = js.native
  /**
    * Updates a configuration's field values.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/androiddeviceprovisioning.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const androiddeviceprovisioning = google.androiddeviceprovisioning('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await androiddeviceprovisioning.customers.configurations.patch({
    *     // Output only. The API resource name in the format `customers/[CUSTOMER_ID]/configurations/[CONFIGURATION_ID]`. Assigned by the server.
    *     name: 'customers/my-customer/configurations/my-configuration',
    *     // Required. The field mask applied to the target `Configuration` before updating the fields. To learn more about using field masks, read [FieldMask](/protocol-buffers/docs/reference/google.protobuf#fieldmask) in the Protocol Buffers documentation.
    *     updateMask: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "companyName": "my_companyName",
    *       //   "configurationId": "my_configurationId",
    *       //   "configurationName": "my_configurationName",
    *       //   "contactEmail": "my_contactEmail",
    *       //   "contactPhone": "my_contactPhone",
    *       //   "customMessage": "my_customMessage",
    *       //   "dpcExtras": "my_dpcExtras",
    *       //   "dpcResourcePath": "my_dpcResourcePath",
    *       //   "isDefault": false,
    *       //   "name": "my_name"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "companyName": "my_companyName",
    *   //   "configurationId": "my_configurationId",
    *   //   "configurationName": "my_configurationName",
    *   //   "contactEmail": "my_contactEmail",
    *   //   "contactPhone": "my_contactPhone",
    *   //   "customMessage": "my_customMessage",
    *   //   "dpcExtras": "my_dpcExtras",
    *   //   "dpcResourcePath": "my_dpcResourcePath",
    *   //   "isDefault": false,
    *   //   "name": "my_name"
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
  def patch(params: ParamsResourceCustomersConfigurationsPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceCustomersConfigurationsPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
