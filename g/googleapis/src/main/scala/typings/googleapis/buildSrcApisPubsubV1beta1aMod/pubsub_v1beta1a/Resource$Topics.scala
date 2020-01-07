package typings.googleapis.buildSrcApisPubsubV1beta1aMod.pubsub_v1beta1a

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/pubsub/v1beta1a", "pubsub_v1beta1a.Resource$Topics")
@js.native
class Resource$Topics protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * pubsub.topics.create
    * @desc Creates the given topic with the given name.
    * @alias pubsub.topics.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().Topic} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[Schema$Topic] = js.native
  def create(callback: BodyResponseCallback[Schema$Topic]): Unit = js.native
  def create(params: ParamsDollarResourceDollarTopicsDollarCreate): GaxiosPromise[Schema$Topic] = js.native
  def create(params: ParamsDollarResourceDollarTopicsDollarCreate, callback: BodyResponseCallback[Schema$Topic]): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarTopicsDollarCreate,
    options: BodyResponseCallback[Schema$Topic],
    callback: BodyResponseCallback[Schema$Topic]
  ): Unit = js.native
  def create(params: ParamsDollarResourceDollarTopicsDollarCreate, options: MethodOptions): GaxiosPromise[Schema$Topic] = js.native
  def create(
    params: ParamsDollarResourceDollarTopicsDollarCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Topic]
  ): Unit = js.native
  /**
    * pubsub.topics.delete
    * @desc Deletes the topic with the given name. Returns NOT_FOUND if the
    * topic does not exist. After a topic is deleted, a new topic may be
    * created with the same name.
    * @alias pubsub.topics.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.topic Name of the topic to delete.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Schema$Empty] = js.native
  def delete(callback: BodyResponseCallback[Schema$Empty]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarTopicsDollarDelete): GaxiosPromise[Schema$Empty] = js.native
  def delete(params: ParamsDollarResourceDollarTopicsDollarDelete, callback: BodyResponseCallback[Schema$Empty]): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarTopicsDollarDelete,
    options: BodyResponseCallback[Schema$Empty],
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarTopicsDollarDelete, options: MethodOptions): GaxiosPromise[Schema$Empty] = js.native
  def delete(
    params: ParamsDollarResourceDollarTopicsDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  /**
    * pubsub.topics.get
    * @desc Gets the configuration of a topic. Since the topic only has the
    * name attribute, this method is only useful to check the existence of a
    * topic. If other attributes are added in the future, they will be returned
    * here.
    * @alias pubsub.topics.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.topic The name of the topic to get.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Topic] = js.native
  def get(callback: BodyResponseCallback[Schema$Topic]): Unit = js.native
  def get(params: ParamsDollarResourceDollarTopicsDollarGet): GaxiosPromise[Schema$Topic] = js.native
  def get(params: ParamsDollarResourceDollarTopicsDollarGet, callback: BodyResponseCallback[Schema$Topic]): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarTopicsDollarGet,
    options: BodyResponseCallback[Schema$Topic],
    callback: BodyResponseCallback[Schema$Topic]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarTopicsDollarGet, options: MethodOptions): GaxiosPromise[Schema$Topic] = js.native
  def get(
    params: ParamsDollarResourceDollarTopicsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Topic]
  ): Unit = js.native
  /**
    * pubsub.topics.list
    * @desc Lists matching topics.
    * @alias pubsub.topics.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.maxResults Maximum number of topics to return.
    * @param {string=} params.pageToken The value obtained in the last <code>ListTopicsResponse</code> for continuation.
    * @param {string=} params.query A valid label query expression.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ListTopicsResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListTopicsResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarTopicsDollarList): GaxiosPromise[Schema$ListTopicsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarTopicsDollarList,
    callback: BodyResponseCallback[Schema$ListTopicsResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarTopicsDollarList,
    options: BodyResponseCallback[Schema$ListTopicsResponse],
    callback: BodyResponseCallback[Schema$ListTopicsResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarTopicsDollarList, options: MethodOptions): GaxiosPromise[Schema$ListTopicsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarTopicsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListTopicsResponse]
  ): Unit = js.native
  /**
    * pubsub.topics.publish
    * @desc Adds a message to the topic.  Returns NOT_FOUND if the topic does
    * not exist.
    * @alias pubsub.topics.publish
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().PublishRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def publish(): GaxiosPromise[Schema$Empty] = js.native
  def publish(callback: BodyResponseCallback[Schema$Empty]): Unit = js.native
  def publish(params: ParamsDollarResourceDollarTopicsDollarPublish): GaxiosPromise[Schema$Empty] = js.native
  def publish(
    params: ParamsDollarResourceDollarTopicsDollarPublish,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def publish(
    params: ParamsDollarResourceDollarTopicsDollarPublish,
    options: BodyResponseCallback[Schema$Empty],
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def publish(params: ParamsDollarResourceDollarTopicsDollarPublish, options: MethodOptions): GaxiosPromise[Schema$Empty] = js.native
  def publish(
    params: ParamsDollarResourceDollarTopicsDollarPublish,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  /**
    * pubsub.topics.publishBatch
    * @desc Adds one or more messages to the topic. Returns NOT_FOUND if the
    * topic does not exist.
    * @alias pubsub.topics.publishBatch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().PublishBatchRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def publishBatch(): GaxiosPromise[Schema$PublishBatchResponse] = js.native
  def publishBatch(callback: BodyResponseCallback[Schema$PublishBatchResponse]): Unit = js.native
  def publishBatch(params: ParamsDollarResourceDollarTopicsDollarPublishbatch): GaxiosPromise[Schema$PublishBatchResponse] = js.native
  def publishBatch(
    params: ParamsDollarResourceDollarTopicsDollarPublishbatch,
    callback: BodyResponseCallback[Schema$PublishBatchResponse]
  ): Unit = js.native
  def publishBatch(
    params: ParamsDollarResourceDollarTopicsDollarPublishbatch,
    options: BodyResponseCallback[Schema$PublishBatchResponse],
    callback: BodyResponseCallback[Schema$PublishBatchResponse]
  ): Unit = js.native
  def publishBatch(params: ParamsDollarResourceDollarTopicsDollarPublishbatch, options: MethodOptions): GaxiosPromise[Schema$PublishBatchResponse] = js.native
  def publishBatch(
    params: ParamsDollarResourceDollarTopicsDollarPublishbatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$PublishBatchResponse]
  ): Unit = js.native
}

