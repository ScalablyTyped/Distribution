package typings.googleapis.clouderrorreportingV1beta1Mod.clouderrorreportingV1beta1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/clouderrorreporting/v1beta1", "clouderrorreporting_v1beta1.Resource$Projects")
@js.native
class ResourceProjects protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  var events: ResourceProjectsEvents = js.native
  var groupStats: ResourceProjectsGroupstats = js.native
  var groups: ResourceProjectsGroups = js.native
  /**
    * clouderrorreporting.projects.deleteEvents
    * @desc Deletes all error events of a given project.
    * @alias clouderrorreporting.projects.deleteEvents
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.projectName [Required] The resource name of the Google Cloud Platform project. Written as `projects/` plus the [Google Cloud Platform project ID](https://support.google.com/cloud/answer/6158840). Example: `projects/my-project-123`.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def deleteEvents(): GaxiosPromise[SchemaDeleteEventsResponse] = js.native
  def deleteEvents(callback: BodyResponseCallback[SchemaDeleteEventsResponse]): Unit = js.native
  def deleteEvents(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaDeleteEventsResponse] = js.native
  def deleteEvents(params: ParamsResourceProjectsDeleteevents): GaxiosPromise[SchemaDeleteEventsResponse] = js.native
  def deleteEvents(
    params: ParamsResourceProjectsDeleteevents,
    callback: BodyResponseCallback[SchemaDeleteEventsResponse]
  ): Unit = js.native
  def deleteEvents(
    params: ParamsResourceProjectsDeleteevents,
    options: BodyResponseCallback[SchemaDeleteEventsResponse],
    callback: BodyResponseCallback[SchemaDeleteEventsResponse]
  ): Unit = js.native
  def deleteEvents(params: ParamsResourceProjectsDeleteevents, options: MethodOptions): GaxiosPromise[SchemaDeleteEventsResponse] = js.native
  def deleteEvents(
    params: ParamsResourceProjectsDeleteevents,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDeleteEventsResponse]
  ): Unit = js.native
}

