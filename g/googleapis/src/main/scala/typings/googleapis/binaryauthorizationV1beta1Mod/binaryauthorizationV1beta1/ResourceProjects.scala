package typings.googleapis.binaryauthorizationV1beta1Mod.binaryauthorizationV1beta1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/binaryauthorization/v1beta1", "binaryauthorization_v1beta1.Resource$Projects")
@js.native
open class ResourceProjects protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var attestors: ResourceProjectsAttestors = js.native
  
  var context: APIRequestContext = js.native
  
  def getPolicy(): GaxiosPromise[SchemaPolicy] = js.native
  def getPolicy(callback: BodyResponseCallback[SchemaPolicy]): Unit = js.native
  def getPolicy(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def getPolicy(params: ParamsResourceProjectsGetpolicy): GaxiosPromise[SchemaPolicy] = js.native
  def getPolicy(params: ParamsResourceProjectsGetpolicy, callback: BodyResponseCallback[SchemaPolicy]): Unit = js.native
  def getPolicy(
    params: ParamsResourceProjectsGetpolicy,
    options: BodyResponseCallback[Readable | SchemaPolicy],
    callback: BodyResponseCallback[Readable | SchemaPolicy]
  ): Unit = js.native
  def getPolicy(params: ParamsResourceProjectsGetpolicy, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def getPolicy(
    params: ParamsResourceProjectsGetpolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  /**
    * A policy specifies the attestors that must attest to a container image, before the project is allowed to deploy that image. There is at most one policy per project. All image admission requests are permitted if a project has no policy. Gets the policy for this project. Returns a default policy if the project does not have one.
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
    * const binaryauthorization = google.binaryauthorization('v1beta1');
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
    *   const res = await binaryauthorization.projects.getPolicy({
    *     // Required. The resource name of the policy to retrieve, in the format `projects/x/policy`.
    *     name: 'projects/my-project/policy',
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
  def getPolicy(params: ParamsResourceProjectsGetpolicy, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def getPolicy(
    params: ParamsResourceProjectsGetpolicy,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var policy: ResourceProjectsPolicy = js.native
  
  def updatePolicy(): GaxiosPromise[SchemaPolicy] = js.native
  def updatePolicy(callback: BodyResponseCallback[SchemaPolicy]): Unit = js.native
  def updatePolicy(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def updatePolicy(params: ParamsResourceProjectsUpdatepolicy): GaxiosPromise[SchemaPolicy] = js.native
  def updatePolicy(params: ParamsResourceProjectsUpdatepolicy, callback: BodyResponseCallback[SchemaPolicy]): Unit = js.native
  def updatePolicy(
    params: ParamsResourceProjectsUpdatepolicy,
    options: BodyResponseCallback[Readable | SchemaPolicy],
    callback: BodyResponseCallback[Readable | SchemaPolicy]
  ): Unit = js.native
  def updatePolicy(params: ParamsResourceProjectsUpdatepolicy, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def updatePolicy(
    params: ParamsResourceProjectsUpdatepolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  /**
    * Creates or updates a project's policy, and returns a copy of the new policy. A policy is always updated as a whole, to avoid race conditions with concurrent policy enforcement (or management!) requests. Returns NOT_FOUND if the project does not exist, INVALID_ARGUMENT if the request is malformed.
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
    * const binaryauthorization = google.binaryauthorization('v1beta1');
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
    *   const res = await binaryauthorization.projects.updatePolicy({
    *     // Output only. The resource name, in the format `projects/x/policy`. There is at most one policy per project.
    *     name: 'projects/my-project/policy',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "admissionWhitelistPatterns": [],
    *       //   "clusterAdmissionRules": {},
    *       //   "defaultAdmissionRule": {},
    *       //   "description": "my_description",
    *       //   "etag": "my_etag",
    *       //   "globalPolicyEvaluationMode": "my_globalPolicyEvaluationMode",
    *       //   "istioServiceIdentityAdmissionRules": {},
    *       //   "kubernetesNamespaceAdmissionRules": {},
    *       //   "kubernetesServiceAccountAdmissionRules": {},
    *       //   "name": "my_name",
    *       //   "updateTime": "my_updateTime"
    *       // }
    *     },
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
  def updatePolicy(params: ParamsResourceProjectsUpdatepolicy, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def updatePolicy(
    params: ParamsResourceProjectsUpdatepolicy,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
