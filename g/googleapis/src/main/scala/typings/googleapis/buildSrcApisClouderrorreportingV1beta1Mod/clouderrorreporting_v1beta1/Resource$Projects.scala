package typings.googleapis.buildSrcApisClouderrorreportingV1beta1Mod.clouderrorreporting_v1beta1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/clouderrorreporting/v1beta1", "clouderrorreporting_v1beta1.Resource$Projects")
@js.native
class Resource$Projects protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  var events: ResourceDollarProjectsDollarEvents = js.native
  var groupStats: ResourceDollarProjectsDollarGroupstats = js.native
  var groups: ResourceDollarProjectsDollarGroups = js.native
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
  def deleteEvents(): GaxiosPromise[Schema$DeleteEventsResponse] = js.native
  def deleteEvents(callback: BodyResponseCallback[Schema$DeleteEventsResponse]): Unit = js.native
  def deleteEvents(params: ParamsDollarResourceDollarProjectsDollarDeleteevents): GaxiosPromise[Schema$DeleteEventsResponse] = js.native
  def deleteEvents(
    params: ParamsDollarResourceDollarProjectsDollarDeleteevents,
    callback: BodyResponseCallback[Schema$DeleteEventsResponse]
  ): Unit = js.native
  def deleteEvents(
    params: ParamsDollarResourceDollarProjectsDollarDeleteevents,
    options: BodyResponseCallback[Schema$DeleteEventsResponse],
    callback: BodyResponseCallback[Schema$DeleteEventsResponse]
  ): Unit = js.native
  def deleteEvents(params: ParamsDollarResourceDollarProjectsDollarDeleteevents, options: MethodOptions): GaxiosPromise[Schema$DeleteEventsResponse] = js.native
  def deleteEvents(
    params: ParamsDollarResourceDollarProjectsDollarDeleteevents,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$DeleteEventsResponse]
  ): Unit = js.native
}

