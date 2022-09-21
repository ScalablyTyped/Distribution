package typings.googleapis.binaryauthorizationV1Mod.binaryauthorizationV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/binaryauthorization/v1", "binaryauthorization_v1.Resource$Systempolicy")
@js.native
open class ResourceSystempolicy protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def getPolicy(): GaxiosPromise[SchemaPolicy] = js.native
  def getPolicy(callback: BodyResponseCallback[SchemaPolicy]): Unit = js.native
  def getPolicy(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def getPolicy(params: ParamsResourceSystempolicyGetpolicy): GaxiosPromise[SchemaPolicy] = js.native
  def getPolicy(params: ParamsResourceSystempolicyGetpolicy, callback: BodyResponseCallback[SchemaPolicy]): Unit = js.native
  def getPolicy(
    params: ParamsResourceSystempolicyGetpolicy,
    options: BodyResponseCallback[Readable | SchemaPolicy],
    callback: BodyResponseCallback[Readable | SchemaPolicy]
  ): Unit = js.native
  def getPolicy(params: ParamsResourceSystempolicyGetpolicy, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def getPolicy(
    params: ParamsResourceSystempolicyGetpolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  /**
    * Gets the current system policy in the specified location.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/binaryauthorization.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const binaryauthorization = google.binaryauthorization('v1');
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
    *   const res = await binaryauthorization.systempolicy.getPolicy({
    *     // Required. The resource name, in the format `locations/x/policy`. Note that the system policy is not associated with a project.
    *     name: 'locations/my-location/policy',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "admissionWhitelistPatterns": [],
    *   //   "clusterAdmissionRules": {},
    *   //   "defaultAdmissionRule": {},
    *   //   "description": "my_description",
    *   //   "etag": "my_etag",
    *   //   "globalPolicyEvaluationMode": "my_globalPolicyEvaluationMode",
    *   //   "istioServiceIdentityAdmissionRules": {},
    *   //   "kubernetesNamespaceAdmissionRules": {},
    *   //   "kubernetesServiceAccountAdmissionRules": {},
    *   //   "name": "my_name",
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
  def getPolicy(params: ParamsResourceSystempolicyGetpolicy, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def getPolicy(
    params: ParamsResourceSystempolicyGetpolicy,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
