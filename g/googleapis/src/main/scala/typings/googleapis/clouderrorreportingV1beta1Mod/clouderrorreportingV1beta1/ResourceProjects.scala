package typings.googleapis.clouderrorreportingV1beta1Mod.clouderrorreportingV1beta1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/clouderrorreporting/v1beta1", "clouderrorreporting_v1beta1.Resource$Projects")
@js.native
open class ResourceProjects protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def deleteEvents(): GaxiosPromise[SchemaDeleteEventsResponse] = js.native
  def deleteEvents(callback: BodyResponseCallback[SchemaDeleteEventsResponse]): Unit = js.native
  def deleteEvents(params: Unit, options: MethodOptions): GaxiosPromise[SchemaDeleteEventsResponse] = js.native
  def deleteEvents(params: ParamsResourceProjectsDeleteevents): GaxiosPromise[SchemaDeleteEventsResponse] = js.native
  def deleteEvents(
    params: ParamsResourceProjectsDeleteevents,
    callback: BodyResponseCallback[SchemaDeleteEventsResponse]
  ): Unit = js.native
  def deleteEvents(
    params: ParamsResourceProjectsDeleteevents,
    options: BodyResponseCallback[Readable | SchemaDeleteEventsResponse],
    callback: BodyResponseCallback[Readable | SchemaDeleteEventsResponse]
  ): Unit = js.native
  def deleteEvents(params: ParamsResourceProjectsDeleteevents, options: MethodOptions): GaxiosPromise[SchemaDeleteEventsResponse] = js.native
  def deleteEvents(
    params: ParamsResourceProjectsDeleteevents,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDeleteEventsResponse]
  ): Unit = js.native
  /**
    * Deletes all error events of a given project.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/clouderrorreporting.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const clouderrorreporting = google.clouderrorreporting('v1beta1');
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
    *   const res = await clouderrorreporting.projects.deleteEvents({
    *     // Required. The resource name of the Google Cloud Platform project. Written as `projects/{projectID\}`, where `{projectID\}` is the [Google Cloud Platform project ID](https://support.google.com/cloud/answer/6158840). Example: `projects/my-project-123`.
    *     projectName: 'projects/my-project',
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
  def deleteEvents(params: ParamsResourceProjectsDeleteevents, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def deleteEvents(
    params: ParamsResourceProjectsDeleteevents,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var events: ResourceProjectsEvents = js.native
  
  var groupStats: ResourceProjectsGroupstats = js.native
  
  var groups: ResourceProjectsGroups = js.native
}
