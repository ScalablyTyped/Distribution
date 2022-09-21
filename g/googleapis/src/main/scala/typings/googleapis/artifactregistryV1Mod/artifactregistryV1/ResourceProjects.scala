package typings.googleapis.artifactregistryV1Mod.artifactregistryV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/artifactregistry/v1", "artifactregistry_v1.Resource$Projects")
@js.native
open class ResourceProjects protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def getProjectSettings(): GaxiosPromise[SchemaProjectSettings] = js.native
  def getProjectSettings(callback: BodyResponseCallback[SchemaProjectSettings]): Unit = js.native
  def getProjectSettings(params: Unit, options: MethodOptions): GaxiosPromise[SchemaProjectSettings] = js.native
  def getProjectSettings(params: ParamsResourceProjectsGetprojectsettings): GaxiosPromise[SchemaProjectSettings] = js.native
  def getProjectSettings(
    params: ParamsResourceProjectsGetprojectsettings,
    callback: BodyResponseCallback[SchemaProjectSettings]
  ): Unit = js.native
  def getProjectSettings(
    params: ParamsResourceProjectsGetprojectsettings,
    options: BodyResponseCallback[Readable | SchemaProjectSettings],
    callback: BodyResponseCallback[Readable | SchemaProjectSettings]
  ): Unit = js.native
  def getProjectSettings(params: ParamsResourceProjectsGetprojectsettings, options: MethodOptions): GaxiosPromise[SchemaProjectSettings] = js.native
  def getProjectSettings(
    params: ParamsResourceProjectsGetprojectsettings,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaProjectSettings]
  ): Unit = js.native
  /**
    * Retrieves the Settings for the Project.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/artifactregistry.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const artifactregistry = google.artifactregistry('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
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
    *   const res = await artifactregistry.projects.getProjectSettings({
    *     // Required. The name of the projectSettings resource.
    *     name: 'projects/my-project/projectSettings',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "legacyRedirectionState": "my_legacyRedirectionState",
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
  def getProjectSettings(params: ParamsResourceProjectsGetprojectsettings, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def getProjectSettings(
    params: ParamsResourceProjectsGetprojectsettings,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var locations: ResourceProjectsLocations = js.native
  
  def updateProjectSettings(): GaxiosPromise[SchemaProjectSettings] = js.native
  def updateProjectSettings(callback: BodyResponseCallback[SchemaProjectSettings]): Unit = js.native
  def updateProjectSettings(params: Unit, options: MethodOptions): GaxiosPromise[SchemaProjectSettings] = js.native
  def updateProjectSettings(params: ParamsResourceProjectsUpdateprojectsettings): GaxiosPromise[SchemaProjectSettings] = js.native
  def updateProjectSettings(
    params: ParamsResourceProjectsUpdateprojectsettings,
    callback: BodyResponseCallback[SchemaProjectSettings]
  ): Unit = js.native
  def updateProjectSettings(
    params: ParamsResourceProjectsUpdateprojectsettings,
    options: BodyResponseCallback[Readable | SchemaProjectSettings],
    callback: BodyResponseCallback[Readable | SchemaProjectSettings]
  ): Unit = js.native
  def updateProjectSettings(params: ParamsResourceProjectsUpdateprojectsettings, options: MethodOptions): GaxiosPromise[SchemaProjectSettings] = js.native
  def updateProjectSettings(
    params: ParamsResourceProjectsUpdateprojectsettings,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaProjectSettings]
  ): Unit = js.native
  /**
    * Updates the Settings for the Project.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/artifactregistry.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const artifactregistry = google.artifactregistry('v1');
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
    *   const res = await artifactregistry.projects.updateProjectSettings({
    *     // The name of the project's settings. Always of the form: projects/{project-id\}/projectSettings In update request: never set In response: always set
    *     name: 'projects/my-project/projectSettings',
    *     // Field mask to support partial updates.
    *     updateMask: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "legacyRedirectionState": "my_legacyRedirectionState",
    *       //   "name": "my_name"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "legacyRedirectionState": "my_legacyRedirectionState",
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
  def updateProjectSettings(params: ParamsResourceProjectsUpdateprojectsettings, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def updateProjectSettings(
    params: ParamsResourceProjectsUpdateprojectsettings,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
