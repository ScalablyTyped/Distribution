package typings.googleapis.buildSrcApisPubsubV1beta2Mod.pubsub_v1beta2

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/pubsub/v1beta2", "pubsub_v1beta2.Resource$Projects$Subscriptions")
@js.native
class ResourceDollarProjectsDollarSubscriptions protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * pubsub.projects.subscriptions.acknowledge
    * @desc Acknowledges the messages associated with the `ack_ids` in the
    * `AcknowledgeRequest`. The Pub/Sub system can remove the relevant messages
    * from the subscription.  Acknowledging a message whose ack deadline has
    * expired may succeed, but such a message may be redelivered later.
    * Acknowledging a message more than once will not result in an error.
    * @alias pubsub.projects.subscriptions.acknowledge
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.subscription The subscription whose message is being acknowledged.
    * @param {().AcknowledgeRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def acknowledge(): GaxiosPromise[Schema$Empty] = js.native
  def acknowledge(callback: BodyResponseCallback[Schema$Empty]): Unit = js.native
  def acknowledge(params: ParamsDollarResourceDollarProjectsDollarSubscriptionsDollarAcknowledge): GaxiosPromise[Schema$Empty] = js.native
  def acknowledge(
    params: ParamsDollarResourceDollarProjectsDollarSubscriptionsDollarAcknowledge,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def acknowledge(
    params: ParamsDollarResourceDollarProjectsDollarSubscriptionsDollarAcknowledge,
    options: BodyResponseCallback[Schema$Empty],
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def acknowledge(
    params: ParamsDollarResourceDollarProjectsDollarSubscriptionsDollarAcknowledge,
    options: MethodOptions
  ): GaxiosPromise[Schema$Empty] = js.native
  def acknowledge(
    params: ParamsDollarResourceDollarProjectsDollarSubscriptionsDollarAcknowledge,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  /**
    * pubsub.projects.subscriptions.create
    * @desc Creates a subscription to a given topic. If the subscription
    * already exists, returns `ALREADY_EXISTS`. If the corresponding topic
    * doesn't exist, returns `NOT_FOUND`.  If the name is not provided in the
    * request, the server will assign a random name for this subscription on
    * the same project as the topic. Note that for REST API requests, you must
    * specify a name.
    * @alias pubsub.projects.subscriptions.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name of the subscription. It must have the format `"projects/{project}/subscriptions/{subscription}"`. `{subscription}` must start with a letter, and contain only letters (`[A-Za-z]`), numbers (`[0-9]`), dashes (`-`), underscores (`_`), periods (`.`), tildes (`~`), plus (`+`) or percent signs (`%`). It must be between 3 and 255 characters in length, and it must not start with `"goog"`.
    * @param {().Subscription} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[Schema$Subscription] = js.native
  def create(callback: BodyResponseCallback[Schema$Subscription]): Unit = js.native
  def create(params: ParamsDollarResourceDollarProjectsDollarSubscriptionsDollarCreate): GaxiosPromise[Schema$Subscription] = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarSubscriptionsDollarCreate,
    callback: BodyResponseCallback[Schema$Subscription]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarSubscriptionsDollarCreate,
    options: BodyResponseCallback[Schema$Subscription],
    callback: BodyResponseCallback[Schema$Subscription]
  ): Unit = js.native
  def create(params: ParamsDollarResourceDollarProjectsDollarSubscriptionsDollarCreate, options: MethodOptions): GaxiosPromise[Schema$Subscription] = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarSubscriptionsDollarCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Subscription]
  ): Unit = js.native
  /**
    * pubsub.projects.subscriptions.delete
    * @desc Deletes an existing subscription. All pending messages in the
    * subscription are immediately dropped. Calls to `Pull` after deletion will
    * return `NOT_FOUND`. After a subscription is deleted, a new one may be
    * created with the same name, but the new one has no association with the
    * old subscription, or its topic unless the same topic is specified.
    * @alias pubsub.projects.subscriptions.delete
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
  def delete(params: ParamsDollarResourceDollarProjectsDollarSubscriptionsDollarDelete): GaxiosPromise[Schema$Empty] = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarSubscriptionsDollarDelete,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarSubscriptionsDollarDelete,
    options: BodyResponseCallback[Schema$Empty],
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarProjectsDollarSubscriptionsDollarDelete, options: MethodOptions): GaxiosPromise[Schema$Empty] = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarSubscriptionsDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  /**
    * pubsub.projects.subscriptions.get
    * @desc Gets the configuration details of a subscription.
    * @alias pubsub.projects.subscriptions.get
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
  def get(params: ParamsDollarResourceDollarProjectsDollarSubscriptionsDollarGet): GaxiosPromise[Schema$Subscription] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarSubscriptionsDollarGet,
    callback: BodyResponseCallback[Schema$Subscription]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarSubscriptionsDollarGet,
    options: BodyResponseCallback[Schema$Subscription],
    callback: BodyResponseCallback[Schema$Subscription]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarProjectsDollarSubscriptionsDollarGet, options: MethodOptions): GaxiosPromise[Schema$Subscription] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarSubscriptionsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Subscription]
  ): Unit = js.native
  /**
    * pubsub.projects.subscriptions.getIamPolicy
    * @desc Gets the access control policy for a resource. Returns an empty
    * policy if the resource exists and does not have a policy set.
    * @alias pubsub.projects.subscriptions.getIamPolicy
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.resource_ REQUIRED: The resource for which the policy is being requested. See the operation documentation for the appropriate value for this field.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getIamPolicy(): GaxiosPromise[Schema$Policy] = js.native
  def getIamPolicy(callback: BodyResponseCallback[Schema$Policy]): Unit = js.native
  def getIamPolicy(params: ParamsDollarResourceDollarProjectsDollarSubscriptionsDollarGetiampolicy): GaxiosPromise[Schema$Policy] = js.native
  def getIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarSubscriptionsDollarGetiampolicy,
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  def getIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarSubscriptionsDollarGetiampolicy,
    options: BodyResponseCallback[Schema$Policy],
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  def getIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarSubscriptionsDollarGetiampolicy,
    options: MethodOptions
  ): GaxiosPromise[Schema$Policy] = js.native
  def getIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarSubscriptionsDollarGetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  /**
    * pubsub.projects.subscriptions.list
    * @desc Lists matching subscriptions.
    * @alias pubsub.projects.subscriptions.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.pageSize Maximum number of subscriptions to return.
    * @param {string=} params.pageToken The value returned by the last `ListSubscriptionsResponse`; indicates that this is a continuation of a prior `ListSubscriptions` call, and that the system should return the next page of data.
    * @param {string} params.project The name of the cloud project that subscriptions belong to.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ListSubscriptionsResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListSubscriptionsResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarProjectsDollarSubscriptionsDollarList): GaxiosPromise[Schema$ListSubscriptionsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarSubscriptionsDollarList,
    callback: BodyResponseCallback[Schema$ListSubscriptionsResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarSubscriptionsDollarList,
    options: BodyResponseCallback[Schema$ListSubscriptionsResponse],
    callback: BodyResponseCallback[Schema$ListSubscriptionsResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarProjectsDollarSubscriptionsDollarList, options: MethodOptions): GaxiosPromise[Schema$ListSubscriptionsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarSubscriptionsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListSubscriptionsResponse]
  ): Unit = js.native
  /**
    * pubsub.projects.subscriptions.modifyAckDeadline
    * @desc Modifies the ack deadline for a specific message. This method is
    * useful to indicate that more time is needed to process a message by the
    * subscriber, or to make the message available for redelivery if the
    * processing was interrupted. Note that this does not modify the
    * subscription-level `ackDeadlineSeconds` used for subsequent messages.
    * @alias pubsub.projects.subscriptions.modifyAckDeadline
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.subscription The name of the subscription.
    * @param {().ModifyAckDeadlineRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def modifyAckDeadline(): GaxiosPromise[Schema$Empty] = js.native
  def modifyAckDeadline(callback: BodyResponseCallback[Schema$Empty]): Unit = js.native
  def modifyAckDeadline(params: ParamsDollarResourceDollarProjectsDollarSubscriptionsDollarModifyackdeadline): GaxiosPromise[Schema$Empty] = js.native
  def modifyAckDeadline(
    params: ParamsDollarResourceDollarProjectsDollarSubscriptionsDollarModifyackdeadline,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def modifyAckDeadline(
    params: ParamsDollarResourceDollarProjectsDollarSubscriptionsDollarModifyackdeadline,
    options: BodyResponseCallback[Schema$Empty],
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def modifyAckDeadline(
    params: ParamsDollarResourceDollarProjectsDollarSubscriptionsDollarModifyackdeadline,
    options: MethodOptions
  ): GaxiosPromise[Schema$Empty] = js.native
  def modifyAckDeadline(
    params: ParamsDollarResourceDollarProjectsDollarSubscriptionsDollarModifyackdeadline,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  /**
    * pubsub.projects.subscriptions.modifyPushConfig
    * @desc Modifies the `PushConfig` for a specified subscription.  This may
    * be used to change a push subscription to a pull one (signified by an
    * empty `PushConfig`) or vice versa, or change the endpoint URL and other
    * attributes of a push subscription. Messages will accumulate for delivery
    * continuously through the call regardless of changes to the `PushConfig`.
    * @alias pubsub.projects.subscriptions.modifyPushConfig
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.subscription The name of the subscription.
    * @param {().ModifyPushConfigRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def modifyPushConfig(): GaxiosPromise[Schema$Empty] = js.native
  def modifyPushConfig(callback: BodyResponseCallback[Schema$Empty]): Unit = js.native
  def modifyPushConfig(params: ParamsDollarResourceDollarProjectsDollarSubscriptionsDollarModifypushconfig): GaxiosPromise[Schema$Empty] = js.native
  def modifyPushConfig(
    params: ParamsDollarResourceDollarProjectsDollarSubscriptionsDollarModifypushconfig,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def modifyPushConfig(
    params: ParamsDollarResourceDollarProjectsDollarSubscriptionsDollarModifypushconfig,
    options: BodyResponseCallback[Schema$Empty],
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def modifyPushConfig(
    params: ParamsDollarResourceDollarProjectsDollarSubscriptionsDollarModifypushconfig,
    options: MethodOptions
  ): GaxiosPromise[Schema$Empty] = js.native
  def modifyPushConfig(
    params: ParamsDollarResourceDollarProjectsDollarSubscriptionsDollarModifypushconfig,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  /**
    * pubsub.projects.subscriptions.pull
    * @desc Pulls messages from the server. Returns an empty list if there are
    * no messages available in the backlog. The server may return `UNAVAILABLE`
    * if there are too many concurrent pull requests pending for the given
    * subscription.
    * @alias pubsub.projects.subscriptions.pull
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.subscription The subscription from which messages should be pulled.
    * @param {().PullRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def pull(): GaxiosPromise[Schema$PullResponse] = js.native
  def pull(callback: BodyResponseCallback[Schema$PullResponse]): Unit = js.native
  def pull(params: ParamsDollarResourceDollarProjectsDollarSubscriptionsDollarPull): GaxiosPromise[Schema$PullResponse] = js.native
  def pull(
    params: ParamsDollarResourceDollarProjectsDollarSubscriptionsDollarPull,
    callback: BodyResponseCallback[Schema$PullResponse]
  ): Unit = js.native
  def pull(
    params: ParamsDollarResourceDollarProjectsDollarSubscriptionsDollarPull,
    options: BodyResponseCallback[Schema$PullResponse],
    callback: BodyResponseCallback[Schema$PullResponse]
  ): Unit = js.native
  def pull(params: ParamsDollarResourceDollarProjectsDollarSubscriptionsDollarPull, options: MethodOptions): GaxiosPromise[Schema$PullResponse] = js.native
  def pull(
    params: ParamsDollarResourceDollarProjectsDollarSubscriptionsDollarPull,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$PullResponse]
  ): Unit = js.native
  /**
    * pubsub.projects.subscriptions.setIamPolicy
    * @desc Sets the access control policy on the specified resource. Replaces
    * any existing policy.
    * @alias pubsub.projects.subscriptions.setIamPolicy
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.resource_ REQUIRED: The resource for which the policy is being specified. See the operation documentation for the appropriate value for this field.
    * @param {().SetIamPolicyRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def setIamPolicy(): GaxiosPromise[Schema$Policy] = js.native
  def setIamPolicy(callback: BodyResponseCallback[Schema$Policy]): Unit = js.native
  def setIamPolicy(params: ParamsDollarResourceDollarProjectsDollarSubscriptionsDollarSetiampolicy): GaxiosPromise[Schema$Policy] = js.native
  def setIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarSubscriptionsDollarSetiampolicy,
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  def setIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarSubscriptionsDollarSetiampolicy,
    options: BodyResponseCallback[Schema$Policy],
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  def setIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarSubscriptionsDollarSetiampolicy,
    options: MethodOptions
  ): GaxiosPromise[Schema$Policy] = js.native
  def setIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarSubscriptionsDollarSetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  /**
    * pubsub.projects.subscriptions.testIamPermissions
    * @desc Returns permissions that a caller has on the specified resource. If
    * the resource does not exist, this will return an empty set of
    * permissions, not a NOT_FOUND error.  Note: This operation is designed to
    * be used for building permission-aware UIs and command-line tools, not for
    * authorization checking. This operation may "fail open" without warning.
    * @alias pubsub.projects.subscriptions.testIamPermissions
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.resource_ REQUIRED: The resource for which the policy detail is being requested. See the operation documentation for the appropriate value for this field.
    * @param {().TestIamPermissionsRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def testIamPermissions(): GaxiosPromise[Schema$TestIamPermissionsResponse] = js.native
  def testIamPermissions(callback: BodyResponseCallback[Schema$TestIamPermissionsResponse]): Unit = js.native
  def testIamPermissions(params: ParamsDollarResourceDollarProjectsDollarSubscriptionsDollarTestiampermissions): GaxiosPromise[Schema$TestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarProjectsDollarSubscriptionsDollarTestiampermissions,
    callback: BodyResponseCallback[Schema$TestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarProjectsDollarSubscriptionsDollarTestiampermissions,
    options: BodyResponseCallback[Schema$TestIamPermissionsResponse],
    callback: BodyResponseCallback[Schema$TestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarProjectsDollarSubscriptionsDollarTestiampermissions,
    options: MethodOptions
  ): GaxiosPromise[Schema$TestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarProjectsDollarSubscriptionsDollarTestiampermissions,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$TestIamPermissionsResponse]
  ): Unit = js.native
}

