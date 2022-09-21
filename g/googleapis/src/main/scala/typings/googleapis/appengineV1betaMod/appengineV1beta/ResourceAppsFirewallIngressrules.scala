package typings.googleapis.appengineV1betaMod.appengineV1beta

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/appengine/v1beta", "appengine_v1beta.Resource$Apps$Firewall$Ingressrules")
@js.native
open class ResourceAppsFirewallIngressrules protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  def batchUpdate(): GaxiosPromise[SchemaBatchUpdateIngressRulesResponse] = js.native
  def batchUpdate(callback: BodyResponseCallback[SchemaBatchUpdateIngressRulesResponse]): Unit = js.native
  def batchUpdate(params: Unit, options: MethodOptions): GaxiosPromise[SchemaBatchUpdateIngressRulesResponse] = js.native
  def batchUpdate(params: ParamsResourceAppsFirewallIngressrulesBatchupdate): GaxiosPromise[SchemaBatchUpdateIngressRulesResponse] = js.native
  def batchUpdate(
    params: ParamsResourceAppsFirewallIngressrulesBatchupdate,
    callback: BodyResponseCallback[SchemaBatchUpdateIngressRulesResponse]
  ): Unit = js.native
  def batchUpdate(
    params: ParamsResourceAppsFirewallIngressrulesBatchupdate,
    options: BodyResponseCallback[Readable | SchemaBatchUpdateIngressRulesResponse],
    callback: BodyResponseCallback[Readable | SchemaBatchUpdateIngressRulesResponse]
  ): Unit = js.native
  def batchUpdate(params: ParamsResourceAppsFirewallIngressrulesBatchupdate, options: MethodOptions): GaxiosPromise[SchemaBatchUpdateIngressRulesResponse] = js.native
  def batchUpdate(
    params: ParamsResourceAppsFirewallIngressrulesBatchupdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBatchUpdateIngressRulesResponse]
  ): Unit = js.native
  /**
    * Replaces the entire firewall ruleset in one bulk operation. This overrides and replaces the rules of an existing firewall with the new rules.If the final rule does not match traffic with the '*' wildcard IP range, then an "allow all" rule is explicitly added to the end of the list.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/appengine.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const appengine = google.appengine('v1beta');
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
    *   const res = await appengine.apps.firewall.ingressRules.batchUpdate({
    *     // Part of `name`. Name of the Firewall collection to set. Example: apps/myapp/firewall/ingressRules.
    *     appsId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "ingressRules": []
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "ingressRules": []
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
  def batchUpdate(params: ParamsResourceAppsFirewallIngressrulesBatchupdate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def batchUpdate(
    params: ParamsResourceAppsFirewallIngressrulesBatchupdate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaFirewallRule] = js.native
  def create(callback: BodyResponseCallback[SchemaFirewallRule]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaFirewallRule] = js.native
  def create(params: ParamsResourceAppsFirewallIngressrulesCreate): GaxiosPromise[SchemaFirewallRule] = js.native
  def create(
    params: ParamsResourceAppsFirewallIngressrulesCreate,
    callback: BodyResponseCallback[SchemaFirewallRule]
  ): Unit = js.native
  def create(
    params: ParamsResourceAppsFirewallIngressrulesCreate,
    options: BodyResponseCallback[Readable | SchemaFirewallRule],
    callback: BodyResponseCallback[Readable | SchemaFirewallRule]
  ): Unit = js.native
  def create(params: ParamsResourceAppsFirewallIngressrulesCreate, options: MethodOptions): GaxiosPromise[SchemaFirewallRule] = js.native
  def create(
    params: ParamsResourceAppsFirewallIngressrulesCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaFirewallRule]
  ): Unit = js.native
  /**
    * Creates a firewall rule for the application.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/appengine.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const appengine = google.appengine('v1beta');
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
    *   const res = await appengine.apps.firewall.ingressRules.create({
    *     // Part of `parent`. Name of the parent Firewall collection in which to create a new rule. Example: apps/myapp/firewall/ingressRules.
    *     appsId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "action": "my_action",
    *       //   "description": "my_description",
    *       //   "priority": 0,
    *       //   "sourceRange": "my_sourceRange"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "action": "my_action",
    *   //   "description": "my_description",
    *   //   "priority": 0,
    *   //   "sourceRange": "my_sourceRange"
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
  def create(params: ParamsResourceAppsFirewallIngressrulesCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceAppsFirewallIngressrulesCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceAppsFirewallIngressrulesDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceAppsFirewallIngressrulesDelete, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(
    params: ParamsResourceAppsFirewallIngressrulesDelete,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceAppsFirewallIngressrulesDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceAppsFirewallIngressrulesDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * Deletes the specified firewall rule.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/appengine.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const appengine = google.appengine('v1beta');
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
    *   const res = await appengine.apps.firewall.ingressRules.delete({
    *     // Part of `name`. Name of the Firewall resource to delete. Example: apps/myapp/firewall/ingressRules/100.
    *     appsId: 'placeholder-value',
    *     // Part of `name`. See documentation of `appsId`.
    *     ingressRulesId: 'placeholder-value',
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
  def delete(params: ParamsResourceAppsFirewallIngressrulesDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceAppsFirewallIngressrulesDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaFirewallRule] = js.native
  def get(callback: BodyResponseCallback[SchemaFirewallRule]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaFirewallRule] = js.native
  def get(params: ParamsResourceAppsFirewallIngressrulesGet): GaxiosPromise[SchemaFirewallRule] = js.native
  def get(
    params: ParamsResourceAppsFirewallIngressrulesGet,
    callback: BodyResponseCallback[SchemaFirewallRule]
  ): Unit = js.native
  def get(
    params: ParamsResourceAppsFirewallIngressrulesGet,
    options: BodyResponseCallback[Readable | SchemaFirewallRule],
    callback: BodyResponseCallback[Readable | SchemaFirewallRule]
  ): Unit = js.native
  def get(params: ParamsResourceAppsFirewallIngressrulesGet, options: MethodOptions): GaxiosPromise[SchemaFirewallRule] = js.native
  def get(
    params: ParamsResourceAppsFirewallIngressrulesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaFirewallRule]
  ): Unit = js.native
  /**
    * Gets the specified firewall rule.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/appengine.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const appengine = google.appengine('v1beta');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/appengine.admin',
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
    *   const res = await appengine.apps.firewall.ingressRules.get({
    *     // Part of `name`. Name of the Firewall resource to retrieve. Example: apps/myapp/firewall/ingressRules/100.
    *     appsId: 'placeholder-value',
    *     // Part of `name`. See documentation of `appsId`.
    *     ingressRulesId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "action": "my_action",
    *   //   "description": "my_description",
    *   //   "priority": 0,
    *   //   "sourceRange": "my_sourceRange"
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
  def get(params: ParamsResourceAppsFirewallIngressrulesGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceAppsFirewallIngressrulesGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListIngressRulesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListIngressRulesResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListIngressRulesResponse] = js.native
  def list(params: ParamsResourceAppsFirewallIngressrulesList): GaxiosPromise[SchemaListIngressRulesResponse] = js.native
  def list(
    params: ParamsResourceAppsFirewallIngressrulesList,
    callback: BodyResponseCallback[SchemaListIngressRulesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceAppsFirewallIngressrulesList,
    options: BodyResponseCallback[Readable | SchemaListIngressRulesResponse],
    callback: BodyResponseCallback[Readable | SchemaListIngressRulesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceAppsFirewallIngressrulesList, options: MethodOptions): GaxiosPromise[SchemaListIngressRulesResponse] = js.native
  def list(
    params: ParamsResourceAppsFirewallIngressrulesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListIngressRulesResponse]
  ): Unit = js.native
  /**
    * Lists the firewall rules of an application.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/appengine.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const appengine = google.appengine('v1beta');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/appengine.admin',
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
    *   const res = await appengine.apps.firewall.ingressRules.list({
    *     // Part of `parent`. Name of the Firewall collection to retrieve. Example: apps/myapp/firewall/ingressRules.
    *     appsId: 'placeholder-value',
    *     // A valid IP Address. If set, only rules matching this address will be returned. The first returned rule will be the rule that fires on requests from this IP.
    *     matchingAddress: 'placeholder-value',
    *     // Maximum results to return per page.
    *     pageSize: 'placeholder-value',
    *     // Continuation token for fetching the next page of results.
    *     pageToken: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "ingressRules": [],
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
  def list(params: ParamsResourceAppsFirewallIngressrulesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceAppsFirewallIngressrulesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaFirewallRule] = js.native
  def patch(callback: BodyResponseCallback[SchemaFirewallRule]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaFirewallRule] = js.native
  def patch(params: ParamsResourceAppsFirewallIngressrulesPatch): GaxiosPromise[SchemaFirewallRule] = js.native
  def patch(
    params: ParamsResourceAppsFirewallIngressrulesPatch,
    callback: BodyResponseCallback[SchemaFirewallRule]
  ): Unit = js.native
  def patch(
    params: ParamsResourceAppsFirewallIngressrulesPatch,
    options: BodyResponseCallback[Readable | SchemaFirewallRule],
    callback: BodyResponseCallback[Readable | SchemaFirewallRule]
  ): Unit = js.native
  def patch(params: ParamsResourceAppsFirewallIngressrulesPatch, options: MethodOptions): GaxiosPromise[SchemaFirewallRule] = js.native
  def patch(
    params: ParamsResourceAppsFirewallIngressrulesPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaFirewallRule]
  ): Unit = js.native
  /**
    * Updates the specified firewall rule.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/appengine.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const appengine = google.appengine('v1beta');
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
    *   const res = await appengine.apps.firewall.ingressRules.patch({
    *     // Part of `name`. Name of the Firewall resource to update. Example: apps/myapp/firewall/ingressRules/100.
    *     appsId: 'placeholder-value',
    *     // Part of `name`. See documentation of `appsId`.
    *     ingressRulesId: 'placeholder-value',
    *     // Standard field mask for the set of fields to be updated.
    *     updateMask: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "action": "my_action",
    *       //   "description": "my_description",
    *       //   "priority": 0,
    *       //   "sourceRange": "my_sourceRange"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "action": "my_action",
    *   //   "description": "my_description",
    *   //   "priority": 0,
    *   //   "sourceRange": "my_sourceRange"
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
  def patch(params: ParamsResourceAppsFirewallIngressrulesPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceAppsFirewallIngressrulesPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
