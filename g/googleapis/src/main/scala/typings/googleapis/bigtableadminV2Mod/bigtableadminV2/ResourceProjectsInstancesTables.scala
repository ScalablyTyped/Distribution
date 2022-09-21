package typings.googleapis.bigtableadminV2Mod.bigtableadminV2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/bigtableadmin/v2", "bigtableadmin_v2.Resource$Projects$Instances$Tables")
@js.native
open class ResourceProjectsInstancesTables protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  def checkConsistency(): GaxiosPromise[SchemaCheckConsistencyResponse] = js.native
  def checkConsistency(callback: BodyResponseCallback[SchemaCheckConsistencyResponse]): Unit = js.native
  def checkConsistency(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCheckConsistencyResponse] = js.native
  def checkConsistency(params: ParamsResourceProjectsInstancesTablesCheckconsistency): GaxiosPromise[SchemaCheckConsistencyResponse] = js.native
  def checkConsistency(
    params: ParamsResourceProjectsInstancesTablesCheckconsistency,
    callback: BodyResponseCallback[SchemaCheckConsistencyResponse]
  ): Unit = js.native
  def checkConsistency(
    params: ParamsResourceProjectsInstancesTablesCheckconsistency,
    options: BodyResponseCallback[Readable | SchemaCheckConsistencyResponse],
    callback: BodyResponseCallback[Readable | SchemaCheckConsistencyResponse]
  ): Unit = js.native
  def checkConsistency(params: ParamsResourceProjectsInstancesTablesCheckconsistency, options: MethodOptions): GaxiosPromise[SchemaCheckConsistencyResponse] = js.native
  def checkConsistency(
    params: ParamsResourceProjectsInstancesTablesCheckconsistency,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCheckConsistencyResponse]
  ): Unit = js.native
  /**
    * Checks replication consistency based on a consistency token, that is, if replication has caught up based on the conditions specified in the token and the check request.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/bigtableadmin.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const bigtableadmin = google.bigtableadmin('v2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/bigtable.admin',
    *       'https://www.googleapis.com/auth/bigtable.admin.table',
    *       'https://www.googleapis.com/auth/cloud-bigtable.admin',
    *       'https://www.googleapis.com/auth/cloud-bigtable.admin.table',
    *       'https://www.googleapis.com/auth/cloud-platform',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await bigtableadmin.projects.instances.tables.checkConsistency({
    *     // Required. The unique name of the Table for which to check replication consistency. Values are of the form `projects/{project\}/instances/{instance\}/tables/{table\}`.
    *     name: 'projects/my-project/instances/my-instance/tables/my-table',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "consistencyToken": "my_consistencyToken"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "consistent": false
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
  def checkConsistency(params: ParamsResourceProjectsInstancesTablesCheckconsistency, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def checkConsistency(
    params: ParamsResourceProjectsInstancesTablesCheckconsistency,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaTable] = js.native
  def create(callback: BodyResponseCallback[SchemaTable]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaTable] = js.native
  def create(params: ParamsResourceProjectsInstancesTablesCreate): GaxiosPromise[SchemaTable] = js.native
  def create(params: ParamsResourceProjectsInstancesTablesCreate, callback: BodyResponseCallback[SchemaTable]): Unit = js.native
  def create(
    params: ParamsResourceProjectsInstancesTablesCreate,
    options: BodyResponseCallback[Readable | SchemaTable],
    callback: BodyResponseCallback[Readable | SchemaTable]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsInstancesTablesCreate, options: MethodOptions): GaxiosPromise[SchemaTable] = js.native
  def create(
    params: ParamsResourceProjectsInstancesTablesCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTable]
  ): Unit = js.native
  /**
    * Creates a new table in the specified instance. The table can be created with a full set of initial column families, specified in the request.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/bigtableadmin.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const bigtableadmin = google.bigtableadmin('v2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/bigtable.admin',
    *       'https://www.googleapis.com/auth/bigtable.admin.table',
    *       'https://www.googleapis.com/auth/cloud-bigtable.admin',
    *       'https://www.googleapis.com/auth/cloud-bigtable.admin.table',
    *       'https://www.googleapis.com/auth/cloud-platform',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await bigtableadmin.projects.instances.tables.create({
    *     // Required. The unique name of the instance in which to create the table. Values are of the form `projects/{project\}/instances/{instance\}`.
    *     parent: 'projects/my-project/instances/my-instance',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "initialSplits": [],
    *       //   "table": {},
    *       //   "tableId": "my_tableId"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "clusterStates": {},
    *   //   "columnFamilies": {},
    *   //   "granularity": "my_granularity",
    *   //   "name": "my_name",
    *   //   "restoreInfo": {}
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
  def create(params: ParamsResourceProjectsInstancesTablesCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceProjectsInstancesTablesCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceProjectsInstancesTablesDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceProjectsInstancesTablesDelete, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(
    params: ParamsResourceProjectsInstancesTablesDelete,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsInstancesTablesDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsInstancesTablesDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * Permanently deletes a specified table and all of its data.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/bigtableadmin.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const bigtableadmin = google.bigtableadmin('v2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/bigtable.admin',
    *       'https://www.googleapis.com/auth/bigtable.admin.table',
    *       'https://www.googleapis.com/auth/cloud-bigtable.admin',
    *       'https://www.googleapis.com/auth/cloud-bigtable.admin.table',
    *       'https://www.googleapis.com/auth/cloud-platform',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await bigtableadmin.projects.instances.tables.delete({
    *     // Required. The unique name of the table to be deleted. Values are of the form `projects/{project\}/instances/{instance\}/tables/{table\}`.
    *     name: 'projects/my-project/instances/my-instance/tables/my-table',
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
  def delete(params: ParamsResourceProjectsInstancesTablesDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceProjectsInstancesTablesDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def dropRowRange(): GaxiosPromise[SchemaEmpty] = js.native
  def dropRowRange(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def dropRowRange(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def dropRowRange(params: ParamsResourceProjectsInstancesTablesDroprowrange): GaxiosPromise[SchemaEmpty] = js.native
  def dropRowRange(
    params: ParamsResourceProjectsInstancesTablesDroprowrange,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def dropRowRange(
    params: ParamsResourceProjectsInstancesTablesDroprowrange,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def dropRowRange(params: ParamsResourceProjectsInstancesTablesDroprowrange, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def dropRowRange(
    params: ParamsResourceProjectsInstancesTablesDroprowrange,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * Permanently drop/delete a row range from a specified table. The request can specify whether to delete all rows in a table, or only those that match a particular prefix.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/bigtableadmin.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const bigtableadmin = google.bigtableadmin('v2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/bigtable.admin',
    *       'https://www.googleapis.com/auth/bigtable.admin.table',
    *       'https://www.googleapis.com/auth/cloud-bigtable.admin',
    *       'https://www.googleapis.com/auth/cloud-bigtable.admin.table',
    *       'https://www.googleapis.com/auth/cloud-platform',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await bigtableadmin.projects.instances.tables.dropRowRange({
    *     // Required. The unique name of the table on which to drop a range of rows. Values are of the form `projects/{project\}/instances/{instance\}/tables/{table\}`.
    *     name: 'projects/my-project/instances/my-instance/tables/my-table',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "deleteAllDataFromTable": false,
    *       //   "rowKeyPrefix": "my_rowKeyPrefix"
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
  def dropRowRange(params: ParamsResourceProjectsInstancesTablesDroprowrange, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def dropRowRange(
    params: ParamsResourceProjectsInstancesTablesDroprowrange,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def generateConsistencyToken(): GaxiosPromise[SchemaGenerateConsistencyTokenResponse] = js.native
  def generateConsistencyToken(callback: BodyResponseCallback[SchemaGenerateConsistencyTokenResponse]): Unit = js.native
  def generateConsistencyToken(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGenerateConsistencyTokenResponse] = js.native
  def generateConsistencyToken(params: ParamsResourceProjectsInstancesTablesGenerateconsistencytoken): GaxiosPromise[SchemaGenerateConsistencyTokenResponse] = js.native
  def generateConsistencyToken(
    params: ParamsResourceProjectsInstancesTablesGenerateconsistencytoken,
    callback: BodyResponseCallback[SchemaGenerateConsistencyTokenResponse]
  ): Unit = js.native
  def generateConsistencyToken(
    params: ParamsResourceProjectsInstancesTablesGenerateconsistencytoken,
    options: BodyResponseCallback[Readable | SchemaGenerateConsistencyTokenResponse],
    callback: BodyResponseCallback[Readable | SchemaGenerateConsistencyTokenResponse]
  ): Unit = js.native
  def generateConsistencyToken(params: ParamsResourceProjectsInstancesTablesGenerateconsistencytoken, options: MethodOptions): GaxiosPromise[SchemaGenerateConsistencyTokenResponse] = js.native
  def generateConsistencyToken(
    params: ParamsResourceProjectsInstancesTablesGenerateconsistencytoken,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGenerateConsistencyTokenResponse]
  ): Unit = js.native
  /**
    * Generates a consistency token for a Table, which can be used in CheckConsistency to check whether mutations to the table that finished before this call started have been replicated. The tokens will be available for 90 days.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/bigtableadmin.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const bigtableadmin = google.bigtableadmin('v2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/bigtable.admin',
    *       'https://www.googleapis.com/auth/bigtable.admin.table',
    *       'https://www.googleapis.com/auth/cloud-bigtable.admin',
    *       'https://www.googleapis.com/auth/cloud-bigtable.admin.table',
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
    *     await bigtableadmin.projects.instances.tables.generateConsistencyToken({
    *       // Required. The unique name of the Table for which to create a consistency token. Values are of the form `projects/{project\}/instances/{instance\}/tables/{table\}`.
    *       name: 'projects/my-project/instances/my-instance/tables/my-table',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {}
    *       },
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "consistencyToken": "my_consistencyToken"
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
  def generateConsistencyToken(
    params: ParamsResourceProjectsInstancesTablesGenerateconsistencytoken,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def generateConsistencyToken(
    params: ParamsResourceProjectsInstancesTablesGenerateconsistencytoken,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaTable] = js.native
  def get(callback: BodyResponseCallback[SchemaTable]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaTable] = js.native
  def get(params: ParamsResourceProjectsInstancesTablesGet): GaxiosPromise[SchemaTable] = js.native
  def get(params: ParamsResourceProjectsInstancesTablesGet, callback: BodyResponseCallback[SchemaTable]): Unit = js.native
  def get(
    params: ParamsResourceProjectsInstancesTablesGet,
    options: BodyResponseCallback[Readable | SchemaTable],
    callback: BodyResponseCallback[Readable | SchemaTable]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsInstancesTablesGet, options: MethodOptions): GaxiosPromise[SchemaTable] = js.native
  def get(
    params: ParamsResourceProjectsInstancesTablesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTable]
  ): Unit = js.native
  /**
    * Gets metadata information about the specified table.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/bigtableadmin.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const bigtableadmin = google.bigtableadmin('v2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/bigtable.admin',
    *       'https://www.googleapis.com/auth/bigtable.admin.table',
    *       'https://www.googleapis.com/auth/cloud-bigtable.admin',
    *       'https://www.googleapis.com/auth/cloud-bigtable.admin.table',
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/cloud-platform.read-only',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await bigtableadmin.projects.instances.tables.get({
    *     // Required. The unique name of the requested table. Values are of the form `projects/{project\}/instances/{instance\}/tables/{table\}`.
    *     name: 'projects/my-project/instances/my-instance/tables/my-table',
    *     // The view to be applied to the returned table's fields. Defaults to `SCHEMA_VIEW` if unspecified.
    *     view: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "clusterStates": {},
    *   //   "columnFamilies": {},
    *   //   "granularity": "my_granularity",
    *   //   "name": "my_name",
    *   //   "restoreInfo": {}
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
  def get(params: ParamsResourceProjectsInstancesTablesGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsInstancesTablesGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def getIamPolicy(): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(callback: BodyResponseCallback[SchemaPolicy]): Unit = js.native
  def getIamPolicy(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(params: ParamsResourceProjectsInstancesTablesGetiampolicy): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(
    params: ParamsResourceProjectsInstancesTablesGetiampolicy,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  def getIamPolicy(
    params: ParamsResourceProjectsInstancesTablesGetiampolicy,
    options: BodyResponseCallback[Readable | SchemaPolicy],
    callback: BodyResponseCallback[Readable | SchemaPolicy]
  ): Unit = js.native
  def getIamPolicy(params: ParamsResourceProjectsInstancesTablesGetiampolicy, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(
    params: ParamsResourceProjectsInstancesTablesGetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  /**
    * Gets the access control policy for a Table resource. Returns an empty policy if the resource exists but does not have a policy set.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/bigtableadmin.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const bigtableadmin = google.bigtableadmin('v2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/bigtable.admin',
    *       'https://www.googleapis.com/auth/bigtable.admin.table',
    *       'https://www.googleapis.com/auth/cloud-bigtable.admin',
    *       'https://www.googleapis.com/auth/cloud-bigtable.admin.table',
    *       'https://www.googleapis.com/auth/cloud-platform',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await bigtableadmin.projects.instances.tables.getIamPolicy({
    *     // REQUIRED: The resource for which the policy is being requested. See [Resource names](https://cloud.google.com/apis/design/resource_names) for the appropriate value for this field.
    *     resource: 'projects/my-project/instances/my-instance/tables/my-table',
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
    *   //   "auditConfigs": [],
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
  def getIamPolicy(params: ParamsResourceProjectsInstancesTablesGetiampolicy, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def getIamPolicy(
    params: ParamsResourceProjectsInstancesTablesGetiampolicy,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListTablesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListTablesResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListTablesResponse] = js.native
  def list(params: ParamsResourceProjectsInstancesTablesList): GaxiosPromise[SchemaListTablesResponse] = js.native
  def list(
    params: ParamsResourceProjectsInstancesTablesList,
    callback: BodyResponseCallback[SchemaListTablesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsInstancesTablesList,
    options: BodyResponseCallback[Readable | SchemaListTablesResponse],
    callback: BodyResponseCallback[Readable | SchemaListTablesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsInstancesTablesList, options: MethodOptions): GaxiosPromise[SchemaListTablesResponse] = js.native
  def list(
    params: ParamsResourceProjectsInstancesTablesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListTablesResponse]
  ): Unit = js.native
  /**
    * Lists all tables served from a specified instance.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/bigtableadmin.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const bigtableadmin = google.bigtableadmin('v2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/bigtable.admin',
    *       'https://www.googleapis.com/auth/bigtable.admin.table',
    *       'https://www.googleapis.com/auth/cloud-bigtable.admin',
    *       'https://www.googleapis.com/auth/cloud-bigtable.admin.table',
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/cloud-platform.read-only',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await bigtableadmin.projects.instances.tables.list({
    *     // Maximum number of results per page. A page_size of zero lets the server choose the number of items to return. A page_size which is strictly positive will return at most that many items. A negative page_size will cause an error. Following the first request, subsequent paginated calls are not required to pass a page_size. If a page_size is set in subsequent calls, it must match the page_size given in the first request.
    *     pageSize: 'placeholder-value',
    *     // The value of `next_page_token` returned by a previous call.
    *     pageToken: 'placeholder-value',
    *     // Required. The unique name of the instance for which tables should be listed. Values are of the form `projects/{project\}/instances/{instance\}`.
    *     parent: 'projects/my-project/instances/my-instance',
    *     // The view to be applied to the returned tables' fields. Only NAME_ONLY view (default), REPLICATION_VIEW and ENCRYPTION_VIEW are supported.
    *     view: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "tables": []
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
  def list(params: ParamsResourceProjectsInstancesTablesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsInstancesTablesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def modifyColumnFamilies(): GaxiosPromise[SchemaTable] = js.native
  def modifyColumnFamilies(callback: BodyResponseCallback[SchemaTable]): Unit = js.native
  def modifyColumnFamilies(params: Unit, options: MethodOptions): GaxiosPromise[SchemaTable] = js.native
  def modifyColumnFamilies(params: ParamsResourceProjectsInstancesTablesModifycolumnfamilies): GaxiosPromise[SchemaTable] = js.native
  def modifyColumnFamilies(
    params: ParamsResourceProjectsInstancesTablesModifycolumnfamilies,
    callback: BodyResponseCallback[SchemaTable]
  ): Unit = js.native
  def modifyColumnFamilies(
    params: ParamsResourceProjectsInstancesTablesModifycolumnfamilies,
    options: BodyResponseCallback[Readable | SchemaTable],
    callback: BodyResponseCallback[Readable | SchemaTable]
  ): Unit = js.native
  def modifyColumnFamilies(params: ParamsResourceProjectsInstancesTablesModifycolumnfamilies, options: MethodOptions): GaxiosPromise[SchemaTable] = js.native
  def modifyColumnFamilies(
    params: ParamsResourceProjectsInstancesTablesModifycolumnfamilies,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTable]
  ): Unit = js.native
  /**
    * Performs a series of column family modifications on the specified table. Either all or none of the modifications will occur before this method returns, but data requests received prior to that point may see a table where only some modifications have taken effect.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/bigtableadmin.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const bigtableadmin = google.bigtableadmin('v2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/bigtable.admin',
    *       'https://www.googleapis.com/auth/bigtable.admin.table',
    *       'https://www.googleapis.com/auth/cloud-bigtable.admin',
    *       'https://www.googleapis.com/auth/cloud-bigtable.admin.table',
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
    *     await bigtableadmin.projects.instances.tables.modifyColumnFamilies({
    *       // Required. The unique name of the table whose families should be modified. Values are of the form `projects/{project\}/instances/{instance\}/tables/{table\}`.
    *       name: 'projects/my-project/instances/my-instance/tables/my-table',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "modifications": []
    *         // }
    *       },
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "clusterStates": {},
    *   //   "columnFamilies": {},
    *   //   "granularity": "my_granularity",
    *   //   "name": "my_name",
    *   //   "restoreInfo": {}
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
  def modifyColumnFamilies(params: ParamsResourceProjectsInstancesTablesModifycolumnfamilies, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def modifyColumnFamilies(
    params: ParamsResourceProjectsInstancesTablesModifycolumnfamilies,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def restore(): GaxiosPromise[SchemaOperation] = js.native
  def restore(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def restore(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def restore(params: ParamsResourceProjectsInstancesTablesRestore): GaxiosPromise[SchemaOperation] = js.native
  def restore(
    params: ParamsResourceProjectsInstancesTablesRestore,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def restore(
    params: ParamsResourceProjectsInstancesTablesRestore,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def restore(params: ParamsResourceProjectsInstancesTablesRestore, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def restore(
    params: ParamsResourceProjectsInstancesTablesRestore,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Create a new table by restoring from a completed backup. The new table must be in the same project as the instance containing the backup. The returned table long-running operation can be used to track the progress of the operation, and to cancel it. The metadata field type is RestoreTableMetadata. The response type is Table, if successful.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/bigtableadmin.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const bigtableadmin = google.bigtableadmin('v2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/bigtable.admin',
    *       'https://www.googleapis.com/auth/bigtable.admin.table',
    *       'https://www.googleapis.com/auth/cloud-bigtable.admin',
    *       'https://www.googleapis.com/auth/cloud-bigtable.admin.table',
    *       'https://www.googleapis.com/auth/cloud-platform',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await bigtableadmin.projects.instances.tables.restore({
    *     // Required. The name of the instance in which to create the restored table. This instance must be in the same project as the source backup. Values are of the form `projects//instances/`.
    *     parent: 'projects/my-project/instances/my-instance',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "backup": "my_backup",
    *       //   "tableId": "my_tableId"
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
  def restore(params: ParamsResourceProjectsInstancesTablesRestore, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def restore(
    params: ParamsResourceProjectsInstancesTablesRestore,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def setIamPolicy(): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(callback: BodyResponseCallback[SchemaPolicy]): Unit = js.native
  def setIamPolicy(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(params: ParamsResourceProjectsInstancesTablesSetiampolicy): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(
    params: ParamsResourceProjectsInstancesTablesSetiampolicy,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  def setIamPolicy(
    params: ParamsResourceProjectsInstancesTablesSetiampolicy,
    options: BodyResponseCallback[Readable | SchemaPolicy],
    callback: BodyResponseCallback[Readable | SchemaPolicy]
  ): Unit = js.native
  def setIamPolicy(params: ParamsResourceProjectsInstancesTablesSetiampolicy, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(
    params: ParamsResourceProjectsInstancesTablesSetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  /**
    * Sets the access control policy on a Table resource. Replaces any existing policy.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/bigtableadmin.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const bigtableadmin = google.bigtableadmin('v2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/bigtable.admin',
    *       'https://www.googleapis.com/auth/bigtable.admin.table',
    *       'https://www.googleapis.com/auth/cloud-bigtable.admin',
    *       'https://www.googleapis.com/auth/cloud-bigtable.admin.table',
    *       'https://www.googleapis.com/auth/cloud-platform',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await bigtableadmin.projects.instances.tables.setIamPolicy({
    *     // REQUIRED: The resource for which the policy is being specified. See [Resource names](https://cloud.google.com/apis/design/resource_names) for the appropriate value for this field.
    *     resource: 'projects/my-project/instances/my-instance/tables/my-table',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "policy": {},
    *       //   "updateMask": "my_updateMask"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "auditConfigs": [],
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
  def setIamPolicy(params: ParamsResourceProjectsInstancesTablesSetiampolicy, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def setIamPolicy(
    params: ParamsResourceProjectsInstancesTablesSetiampolicy,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def testIamPermissions(): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]): Unit = js.native
  def testIamPermissions(params: Unit, options: MethodOptions): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(params: ParamsResourceProjectsInstancesTablesTestiampermissions): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsInstancesTablesTestiampermissions,
    callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsInstancesTablesTestiampermissions,
    options: BodyResponseCallback[Readable | SchemaTestIamPermissionsResponse],
    callback: BodyResponseCallback[Readable | SchemaTestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(params: ParamsResourceProjectsInstancesTablesTestiampermissions, options: MethodOptions): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsInstancesTablesTestiampermissions,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]
  ): Unit = js.native
  /**
    * Returns permissions that the caller has on the specified table resource.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/bigtableadmin.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const bigtableadmin = google.bigtableadmin('v2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/bigtable.admin',
    *       'https://www.googleapis.com/auth/bigtable.admin.table',
    *       'https://www.googleapis.com/auth/cloud-bigtable.admin',
    *       'https://www.googleapis.com/auth/cloud-bigtable.admin.table',
    *       'https://www.googleapis.com/auth/cloud-platform',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await bigtableadmin.projects.instances.tables.testIamPermissions({
    *     // REQUIRED: The resource for which the policy detail is being requested. See [Resource names](https://cloud.google.com/apis/design/resource_names) for the appropriate value for this field.
    *     resource: 'projects/my-project/instances/my-instance/tables/my-table',
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
  def testIamPermissions(params: ParamsResourceProjectsInstancesTablesTestiampermissions, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsInstancesTablesTestiampermissions,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def undelete(): GaxiosPromise[SchemaOperation] = js.native
  def undelete(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def undelete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def undelete(params: ParamsResourceProjectsInstancesTablesUndelete): GaxiosPromise[SchemaOperation] = js.native
  def undelete(
    params: ParamsResourceProjectsInstancesTablesUndelete,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def undelete(
    params: ParamsResourceProjectsInstancesTablesUndelete,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def undelete(params: ParamsResourceProjectsInstancesTablesUndelete, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def undelete(
    params: ParamsResourceProjectsInstancesTablesUndelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Restores a specified table which was accidentally deleted.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/bigtableadmin.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const bigtableadmin = google.bigtableadmin('v2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/bigtable.admin',
    *       'https://www.googleapis.com/auth/bigtable.admin.table',
    *       'https://www.googleapis.com/auth/cloud-bigtable.admin',
    *       'https://www.googleapis.com/auth/cloud-bigtable.admin.table',
    *       'https://www.googleapis.com/auth/cloud-platform',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await bigtableadmin.projects.instances.tables.undelete({
    *     // Required. The unique name of the table to be restored. Values are of the form `projects/{project\}/instances/{instance\}/tables/{table\}`.
    *     name: 'projects/my-project/instances/my-instance/tables/my-table',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {}
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
  def undelete(params: ParamsResourceProjectsInstancesTablesUndelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def undelete(
    params: ParamsResourceProjectsInstancesTablesUndelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
