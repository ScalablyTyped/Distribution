package typings.googleapis.buildSrcApisPubsubV1beta1aMod.pubsub_v1beta1a

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/pubsub/v1beta1a", "pubsub_v1beta1a.Resource$Subscriptions")
@js.native
class Resource$Subscriptions protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * pubsub.subscriptions.acknowledge
    * @desc Acknowledges a particular received message: the Pub/Sub system can
    * remove the given message from the subscription. Acknowledging a message
    * whose Ack deadline has expired may succeed, but the message could have
    * been already redelivered. Acknowledging a message more than once will not
    * result in an error. This is only used for messages received via pull.
    * @alias pubsub.subscriptions.acknowledge
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().AcknowledgeRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def acknowledge(): GaxiosPromise[Schema$Empty] = js.native
  def acknowledge(callback: BodyResponseCallback[Schema$Empty]): Unit = js.native
  def acknowledge(params: ParamsDollarResourceDollarSubscriptionsDollarAcknowledge): GaxiosPromise[Schema$Empty] = js.native
  def acknowledge(
    params: ParamsDollarResourceDollarSubscriptionsDollarAcknowledge,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def acknowledge(
    params: ParamsDollarResourceDollarSubscriptionsDollarAcknowledge,
    options: BodyResponseCallback[Schema$Empty],
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def acknowledge(params: ParamsDollarResourceDollarSubscriptionsDollarAcknowledge, options: MethodOptions): GaxiosPromise[Schema$Empty] = js.native
  def acknowledge(
    params: ParamsDollarResourceDollarSubscriptionsDollarAcknowledge,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  /**
    * pubsub.subscriptions.create
    * @desc Creates a subscription on a given topic for a given subscriber. If
    * the subscription already exists, returns ALREADY_EXISTS. If the
    * corresponding topic doesn't exist, returns NOT_FOUND.  If the name is not
    * provided in the request, the server will assign a random name for this
    * subscription on the same project as the topic.
    * @alias pubsub.subscriptions.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().Subscription} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[Schema$Subscription] = js.native
  def create(callback: BodyResponseCallback[Schema$Subscription]): Unit = js.native
  def create(params: ParamsDollarResourceDollarSubscriptionsDollarCreate): GaxiosPromise[Schema$Subscription] = js.native
  def create(
    params: ParamsDollarResourceDollarSubscriptionsDollarCreate,
    callback: BodyResponseCallback[Schema$Subscription]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarSubscriptionsDollarCreate,
    options: BodyResponseCallback[Schema$Subscription],
    callback: BodyResponseCallback[Schema$Subscription]
  ): Unit = js.native
  def create(params: ParamsDollarResourceDollarSubscriptionsDollarCreate, options: MethodOptions): GaxiosPromise[Schema$Subscription] = js.native
  def create(
    params: ParamsDollarResourceDollarSubscriptionsDollarCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Subscription]
  ): Unit = js.native
  /**
    * pubsub.subscriptions.delete
    * @desc Deletes an existing subscription. All pending messages in the
    * subscription are immediately dropped. Calls to Pull after deletion will
    * return NOT_FOUND.
    * @alias pubsub.subscriptions.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.subscription The subscription to delete.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Schema$Empty] = js.native
  def delete(callback: BodyResponseCallback[Schema$Empty]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarSubscriptionsDollarDelete): GaxiosPromise[Schema$Empty] = js.native
  def delete(
    params: ParamsDollarResourceDollarSubscriptionsDollarDelete,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarSubscriptionsDollarDelete,
    options: BodyResponseCallback[Schema$Empty],
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarSubscriptionsDollarDelete, options: MethodOptions): GaxiosPromise[Schema$Empty] = js.native
  def delete(
    params: ParamsDollarResourceDollarSubscriptionsDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  /**
    * pubsub.subscriptions.get
    * @desc Gets the configuration details of a subscription.
    * @alias pubsub.subscriptions.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.subscription The name of the subscription to get.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Subscription] = js.native
  def get(callback: BodyResponseCallback[Schema$Subscription]): Unit = js.native
  def get(params: ParamsDollarResourceDollarSubscriptionsDollarGet): GaxiosPromise[Schema$Subscription] = js.native
  def get(
    params: ParamsDollarResourceDollarSubscriptionsDollarGet,
    callback: BodyResponseCallback[Schema$Subscription]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarSubscriptionsDollarGet,
    options: BodyResponseCallback[Schema$Subscription],
    callback: BodyResponseCallback[Schema$Subscription]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarSubscriptionsDollarGet, options: MethodOptions): GaxiosPromise[Schema$Subscription] = js.native
  def get(
    params: ParamsDollarResourceDollarSubscriptionsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Subscription]
  ): Unit = js.native
  /**
    * pubsub.subscriptions.list
    * @desc Lists matching subscriptions.
    * @alias pubsub.subscriptions.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.maxResults Maximum number of subscriptions to return.
    * @param {string=} params.pageToken The value obtained in the last <code>ListSubscriptionsResponse</code> for continuation.
    * @param {string=} params.query A valid label query expression.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ListSubscriptionsResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListSubscriptionsResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarSubscriptionsDollarList): GaxiosPromise[Schema$ListSubscriptionsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarSubscriptionsDollarList,
    callback: BodyResponseCallback[Schema$ListSubscriptionsResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarSubscriptionsDollarList,
    options: BodyResponseCallback[Schema$ListSubscriptionsResponse],
    callback: BodyResponseCallback[Schema$ListSubscriptionsResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarSubscriptionsDollarList, options: MethodOptions): GaxiosPromise[Schema$ListSubscriptionsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarSubscriptionsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListSubscriptionsResponse]
  ): Unit = js.native
  /**
    * pubsub.subscriptions.modifyAckDeadline
    * @desc Modifies the Ack deadline for a message received from a pull
    * request.
    * @alias pubsub.subscriptions.modifyAckDeadline
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().ModifyAckDeadlineRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def modifyAckDeadline(): GaxiosPromise[Schema$Empty] = js.native
  def modifyAckDeadline(callback: BodyResponseCallback[Schema$Empty]): Unit = js.native
  def modifyAckDeadline(params: ParamsDollarResourceDollarSubscriptionsDollarModifyackdeadline): GaxiosPromise[Schema$Empty] = js.native
  def modifyAckDeadline(
    params: ParamsDollarResourceDollarSubscriptionsDollarModifyackdeadline,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def modifyAckDeadline(
    params: ParamsDollarResourceDollarSubscriptionsDollarModifyackdeadline,
    options: BodyResponseCallback[Schema$Empty],
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def modifyAckDeadline(params: ParamsDollarResourceDollarSubscriptionsDollarModifyackdeadline, options: MethodOptions): GaxiosPromise[Schema$Empty] = js.native
  def modifyAckDeadline(
    params: ParamsDollarResourceDollarSubscriptionsDollarModifyackdeadline,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  /**
    * pubsub.subscriptions.modifyPushConfig
    * @desc Modifies the <code>PushConfig</code> for a specified subscription.
    * This method can be used to suspend the flow of messages to an endpoint by
    * clearing the <code>PushConfig</code> field in the request. Messages will
    * be accumulated for delivery even if no push configuration is defined or
    * while the configuration is modified.
    * @alias pubsub.subscriptions.modifyPushConfig
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().ModifyPushConfigRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def modifyPushConfig(): GaxiosPromise[Schema$Empty] = js.native
  def modifyPushConfig(callback: BodyResponseCallback[Schema$Empty]): Unit = js.native
  def modifyPushConfig(params: ParamsDollarResourceDollarSubscriptionsDollarModifypushconfig): GaxiosPromise[Schema$Empty] = js.native
  def modifyPushConfig(
    params: ParamsDollarResourceDollarSubscriptionsDollarModifypushconfig,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def modifyPushConfig(
    params: ParamsDollarResourceDollarSubscriptionsDollarModifypushconfig,
    options: BodyResponseCallback[Schema$Empty],
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def modifyPushConfig(params: ParamsDollarResourceDollarSubscriptionsDollarModifypushconfig, options: MethodOptions): GaxiosPromise[Schema$Empty] = js.native
  def modifyPushConfig(
    params: ParamsDollarResourceDollarSubscriptionsDollarModifypushconfig,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  /**
    * pubsub.subscriptions.pull
    * @desc Pulls a single message from the server. If return_immediately is
    * true, and no messages are available in the subscription, this method
    * returns FAILED_PRECONDITION. The system is free to return an UNAVAILABLE
    * error if no messages are available in a reasonable amount of time (to
    * reduce system load).
    * @alias pubsub.subscriptions.pull
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().PullRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def pull(): GaxiosPromise[Schema$PullResponse] = js.native
  def pull(callback: BodyResponseCallback[Schema$PullResponse]): Unit = js.native
  def pull(params: ParamsDollarResourceDollarSubscriptionsDollarPull): GaxiosPromise[Schema$PullResponse] = js.native
  def pull(
    params: ParamsDollarResourceDollarSubscriptionsDollarPull,
    callback: BodyResponseCallback[Schema$PullResponse]
  ): Unit = js.native
  def pull(
    params: ParamsDollarResourceDollarSubscriptionsDollarPull,
    options: BodyResponseCallback[Schema$PullResponse],
    callback: BodyResponseCallback[Schema$PullResponse]
  ): Unit = js.native
  def pull(params: ParamsDollarResourceDollarSubscriptionsDollarPull, options: MethodOptions): GaxiosPromise[Schema$PullResponse] = js.native
  def pull(
    params: ParamsDollarResourceDollarSubscriptionsDollarPull,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$PullResponse]
  ): Unit = js.native
  /**
    * pubsub.subscriptions.pullBatch
    * @desc Pulls messages from the server. Returns an empty list if there are
    * no messages available in the backlog. The system is free to return
    * UNAVAILABLE if there are too many pull requests outstanding for the given
    * subscription.
    * @alias pubsub.subscriptions.pullBatch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().PullBatchRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def pullBatch(): GaxiosPromise[Schema$PullBatchResponse] = js.native
  def pullBatch(callback: BodyResponseCallback[Schema$PullBatchResponse]): Unit = js.native
  def pullBatch(params: ParamsDollarResourceDollarSubscriptionsDollarPullbatch): GaxiosPromise[Schema$PullBatchResponse] = js.native
  def pullBatch(
    params: ParamsDollarResourceDollarSubscriptionsDollarPullbatch,
    callback: BodyResponseCallback[Schema$PullBatchResponse]
  ): Unit = js.native
  def pullBatch(
    params: ParamsDollarResourceDollarSubscriptionsDollarPullbatch,
    options: BodyResponseCallback[Schema$PullBatchResponse],
    callback: BodyResponseCallback[Schema$PullBatchResponse]
  ): Unit = js.native
  def pullBatch(params: ParamsDollarResourceDollarSubscriptionsDollarPullbatch, options: MethodOptions): GaxiosPromise[Schema$PullBatchResponse] = js.native
  def pullBatch(
    params: ParamsDollarResourceDollarSubscriptionsDollarPullbatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$PullBatchResponse]
  ): Unit = js.native
}

