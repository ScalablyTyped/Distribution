package typings.googleapis.appsactivityV1Mod.appsactivityV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/appsactivity/v1", "appsactivity_v1.Resource$Activities")
@js.native
class ResourceActivities protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * appsactivity.activities.list
    * @desc Returns a list of activities visible to the current logged in user.
    * Visible activities are determined by the visibility settings of the
    * object that was acted on, e.g. Drive files a user can see. An activity is
    * a record of past events. Multiple events may be merged if they are
    * similar. A request is scoped to activities from a given Google service
    * using the source parameter.
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
  def list(): GaxiosPromise[SchemaListActivitiesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListActivitiesResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaListActivitiesResponse] = js.native
  def list(params: ParamsResourceActivitiesList): GaxiosPromise[SchemaListActivitiesResponse] = js.native
  def list(params: ParamsResourceActivitiesList, callback: BodyResponseCallback[SchemaListActivitiesResponse]): Unit = js.native
  def list(
    params: ParamsResourceActivitiesList,
    options: BodyResponseCallback[SchemaListActivitiesResponse],
    callback: BodyResponseCallback[SchemaListActivitiesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceActivitiesList, options: MethodOptions): GaxiosPromise[SchemaListActivitiesResponse] = js.native
  def list(
    params: ParamsResourceActivitiesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListActivitiesResponse]
  ): Unit = js.native
}
