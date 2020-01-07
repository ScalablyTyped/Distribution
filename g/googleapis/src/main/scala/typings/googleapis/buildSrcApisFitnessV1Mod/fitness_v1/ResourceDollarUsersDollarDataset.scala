package typings.googleapis.buildSrcApisFitnessV1Mod.fitness_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/fitness/v1", "fitness_v1.Resource$Users$Dataset")
@js.native
class ResourceDollarUsersDollarDataset protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * fitness.users.dataset.aggregate
    * @desc Aggregates data of a certain type or stream into buckets divided by
    * a given type of boundary. Multiple data sets of multiple types and from
    * multiple sources can be aggreated into exactly one bucket type per
    * request.
    * @alias fitness.users.dataset.aggregate
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.userId Aggregate data for the person identified. Use me to indicate the authenticated user. Only me is supported at this time.
    * @param {().AggregateRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def aggregate(): GaxiosPromise[Schema$AggregateResponse] = js.native
  def aggregate(callback: BodyResponseCallback[Schema$AggregateResponse]): Unit = js.native
  def aggregate(params: ParamsDollarResourceDollarUsersDollarDatasetDollarAggregate): GaxiosPromise[Schema$AggregateResponse] = js.native
  def aggregate(
    params: ParamsDollarResourceDollarUsersDollarDatasetDollarAggregate,
    callback: BodyResponseCallback[Schema$AggregateResponse]
  ): Unit = js.native
  def aggregate(
    params: ParamsDollarResourceDollarUsersDollarDatasetDollarAggregate,
    options: BodyResponseCallback[Schema$AggregateResponse],
    callback: BodyResponseCallback[Schema$AggregateResponse]
  ): Unit = js.native
  def aggregate(params: ParamsDollarResourceDollarUsersDollarDatasetDollarAggregate, options: MethodOptions): GaxiosPromise[Schema$AggregateResponse] = js.native
  def aggregate(
    params: ParamsDollarResourceDollarUsersDollarDatasetDollarAggregate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$AggregateResponse]
  ): Unit = js.native
}

