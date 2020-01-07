package typings.googleapis.buildSrcApisPubsubV1Mod.pubsub_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/pubsub/v1", "pubsub_v1.Resource$Projects$Topics$Snapshots")
@js.native
class ResourceDollarProjectsDollarTopicsDollarSnapshots protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * pubsub.projects.topics.snapshots.list
    * @desc Lists the names of the snapshots on this topic. Snapshots are used
    * in <a
    * href="https://cloud.google.com/pubsub/docs/replay-overview">Seek</a>
    * operations, which allow you to manage message acknowledgments in bulk.
    * That is, you can set the acknowledgment state of messages in an existing
    * subscription to the state captured by a snapshot.
    * @alias pubsub.projects.topics.snapshots.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.pageSize Maximum number of snapshot names to return.
    * @param {string=} params.pageToken The value returned by the last `ListTopicSnapshotsResponse`; indicates that this is a continuation of a prior `ListTopicSnapshots` call, and that the system should return the next page of data.
    * @param {string} params.topic The name of the topic that snapshots are attached to. Format is `projects/{project}/topics/{topic}`.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ListTopicSnapshotsResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListTopicSnapshotsResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarProjectsDollarTopicsDollarSnapshotsDollarList): GaxiosPromise[Schema$ListTopicSnapshotsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarTopicsDollarSnapshotsDollarList,
    callback: BodyResponseCallback[Schema$ListTopicSnapshotsResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarTopicsDollarSnapshotsDollarList,
    options: BodyResponseCallback[Schema$ListTopicSnapshotsResponse],
    callback: BodyResponseCallback[Schema$ListTopicSnapshotsResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarTopicsDollarSnapshotsDollarList,
    options: MethodOptions
  ): GaxiosPromise[Schema$ListTopicSnapshotsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarTopicsDollarSnapshotsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListTopicSnapshotsResponse]
  ): Unit = js.native
}

