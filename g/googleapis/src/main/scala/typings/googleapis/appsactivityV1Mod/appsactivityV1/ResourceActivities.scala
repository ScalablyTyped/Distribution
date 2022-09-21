package typings.googleapis.appsactivityV1Mod.appsactivityV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/appsactivity/v1", "appsactivity_v1.Resource$Activities")
@js.native
open class ResourceActivities protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def list(): GaxiosPromise[SchemaListActivitiesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListActivitiesResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListActivitiesResponse] = js.native
  def list(params: ParamsResourceActivitiesList): GaxiosPromise[SchemaListActivitiesResponse] = js.native
  def list(params: ParamsResourceActivitiesList, callback: BodyResponseCallback[SchemaListActivitiesResponse]): Unit = js.native
  def list(
    params: ParamsResourceActivitiesList,
    options: BodyResponseCallback[Readable | SchemaListActivitiesResponse],
    callback: BodyResponseCallback[Readable | SchemaListActivitiesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceActivitiesList, options: MethodOptions): GaxiosPromise[SchemaListActivitiesResponse] = js.native
  def list(
    params: ParamsResourceActivitiesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListActivitiesResponse]
  ): Unit = js.native
  /**
    * appsactivity.activities.list
    * @desc Returns a list of activities visible to the current logged in user. Visible activities are determined by the visibility settings of the object that was acted on, e.g. Drive files a user can see. An activity is a record of past events. Multiple events may be merged if they are similar. A request is scoped to activities from a given Google service using the source parameter.
    * @example
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/appsactivity.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const appsactivity = google.appsactivity('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/activity'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await appsactivity.activities.list({
    *     // Identifies the Drive folder containing the items for which to return activities.
    *     'drive.ancestorId': 'placeholder-value',
    *     // Identifies the Drive item to return activities for.
    *     'drive.fileId': 'placeholder-value',
    *     // Indicates the strategy to use when grouping singleEvents items in the associated combinedEvent object.
    *     groupingStrategy: 'placeholder-value',
    *     // The maximum number of events to return on a page. The response includes a continuation token if there are more events.
    *     pageSize: 'placeholder-value',
    *     // A token to retrieve a specific page of results.
    *     pageToken: 'placeholder-value',
    *     // The Google service from which to return activities. Possible values of source are:
    *     // - drive.google.com
    *     source: 'placeholder-value',
    *     // The ID used for ACL checks (does not filter the resulting event list by the assigned value). Use the special value me to indicate the currently authenticated user.
    *     userId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "activities": [],
    *   //   "nextPageToken": "my_nextPageToken"
    *   // }
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * @alias appsactivity.activities.list
    * @memberOf! ()
    *
    * @param {object=} params Parameters for request
    * @param {string=} params.drive.ancestorId Identifies the Drive folder containing the items for which to return activities.
    * @param {string=} params.drive.fileId Identifies the Drive item to return activities for.
    * @param {string=} params.groupingStrategy Indicates the strategy to use when grouping singleEvents items in the associated combinedEvent object.
    * @param {integer=} params.pageSize The maximum number of events to return on a page. The response includes a continuation token if there are more events.
    * @param {string=} params.pageToken A token to retrieve a specific page of results.
    * @param {string=} params.source The Google service from which to return activities. Possible values of source are:  - drive.google.com
    * @param {string=} params.userId The ID used for ACL checks (does not filter the resulting event list by the assigned value). Use the special value me to indicate the currently authenticated user.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(params: ParamsResourceActivitiesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceActivitiesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
