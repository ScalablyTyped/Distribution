package typings.googleapis.buildSrcApisDataflowV1b3Mod.dataflow_v1b3

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/dataflow/v1b3", "dataflow_v1b3.Resource$Projects$Locations")
@js.native
class ResourceDollarProjectsDollarLocations protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  var jobs: ResourceDollarProjectsDollarLocationsDollarJobs = js.native
  var templates: ResourceDollarProjectsDollarLocationsDollarTemplates = js.native
  /**
    * dataflow.projects.locations.workerMessages
    * @desc Send a worker_message to the service.
    * @alias dataflow.projects.locations.workerMessages
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.location The [regional endpoint] (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints) that contains the job.
    * @param {string} params.projectId The project to send the WorkerMessages to.
    * @param {().SendWorkerMessagesRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def workerMessages(): GaxiosPromise[Schema$SendWorkerMessagesResponse] = js.native
  def workerMessages(callback: BodyResponseCallback[Schema$SendWorkerMessagesResponse]): Unit = js.native
  def workerMessages(params: ParamsDollarResourceDollarProjectsDollarLocationsDollarWorkermessages): GaxiosPromise[Schema$SendWorkerMessagesResponse] = js.native
  def workerMessages(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarWorkermessages,
    callback: BodyResponseCallback[Schema$SendWorkerMessagesResponse]
  ): Unit = js.native
  def workerMessages(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarWorkermessages,
    options: BodyResponseCallback[Schema$SendWorkerMessagesResponse],
    callback: BodyResponseCallback[Schema$SendWorkerMessagesResponse]
  ): Unit = js.native
  def workerMessages(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarWorkermessages,
    options: MethodOptions
  ): GaxiosPromise[Schema$SendWorkerMessagesResponse] = js.native
  def workerMessages(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarWorkermessages,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$SendWorkerMessagesResponse]
  ): Unit = js.native
}

