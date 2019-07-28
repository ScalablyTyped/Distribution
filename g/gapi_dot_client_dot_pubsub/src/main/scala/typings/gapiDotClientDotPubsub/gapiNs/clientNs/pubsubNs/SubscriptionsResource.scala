package typings.gapiDotClientDotPubsub.gapiNs.clientNs.pubsubNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotPubsub.Anon_Accesstoken
import typings.gapiDotClientDotPubsub.Anon_AccesstokenAlt
import typings.gapiDotClientDotPubsub.Anon_AccesstokenAltBearertoken
import typings.gapiDotClientDotPubsub.Anon_AccesstokenAltBearertokenCallback
import typings.gapiDotClientDotPubsub.Anon_AccesstokenAltBearertokenCallbackFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubscriptionsResource extends js.Object {
  /**
    * Acknowledges the messages associated with the `ack_ids` in the
    * `AcknowledgeRequest`. The Pub/Sub system can remove the relevant messages
    * from the subscription.
    *
    * Acknowledging a message whose ack deadline has expired may succeed,
    * but such a message may be redelivered later. Acknowledging a message more
    * than once will not result in an error.
    */
  def acknowledge(request: Anon_AccesstokenAlt): Request[js.Object] = js.native
  /**
    * Creates a subscription to a given topic.
    * If the subscription already exists, returns `ALREADY_EXISTS`.
    * If the corresponding topic doesn't exist, returns `NOT_FOUND`.
    *
    * If the name is not provided in the request, the server will assign a random
    * name for this subscription on the same project as the topic, conforming
    * to the
    * [resource name format](https://cloud.google.com/pubsub/docs/overview#names).
    * The generated name is populated in the returned Subscription object.
    * Note that for REST API requests, you must specify a name in the request.
    */
  def create(request: Anon_AccesstokenAltBearertoken): Request[Subscription] = js.native
  /**
    * Deletes an existing subscription. All messages retained in the subscription
    * are immediately dropped. Calls to `Pull` after deletion will return
    * `NOT_FOUND`. After a subscription is deleted, a new one may be created with
    * the same name, but the new one has no association with the old
    * subscription or its topic unless the same topic is specified.
    */
  def delete(request: Anon_AccesstokenAlt): Request[js.Object] = js.native
  /** Gets the configuration details of a subscription. */
  def get(request: Anon_AccesstokenAlt): Request[Subscription] = js.native
  /**
    * Gets the access control policy for a resource.
    * Returns an empty policy if the resource exists and does not have a policy
    * set.
    */
  def getIamPolicy(request: Anon_Accesstoken): Request[Policy] = js.native
  /** Lists matching subscriptions. */
  def list(request: Anon_AccesstokenAltBearertokenCallback): Request[ListSubscriptionsResponse] = js.native
  /** Lists the name of the subscriptions for this topic. */
  def list(request: Anon_AccesstokenAltBearertokenCallbackFields): Request[ListTopicSubscriptionsResponse] = js.native
  /**
    * Modifies the ack deadline for a specific message. This method is useful
    * to indicate that more time is needed to process a message by the
    * subscriber, or to make the message available for redelivery if the
    * processing was interrupted. Note that this does not modify the
    * subscription-level `ackDeadlineSeconds` used for subsequent messages.
    */
  def modifyAckDeadline(request: Anon_AccesstokenAlt): Request[js.Object] = js.native
  /**
    * Modifies the `PushConfig` for a specified subscription.
    *
    * This may be used to change a push subscription to a pull one (signified by
    * an empty `PushConfig`) or vice versa, or change the endpoint URL and other
    * attributes of a push subscription. Messages will accumulate for delivery
    * continuously through the call regardless of changes to the `PushConfig`.
    */
  def modifyPushConfig(request: Anon_AccesstokenAlt): Request[js.Object] = js.native
  /**
    * Pulls messages from the server. Returns an empty list if there are no
    * messages available in the backlog. The server may return `UNAVAILABLE` if
    * there are too many concurrent pull requests pending for the given
    * subscription.
    */
  def pull(request: Anon_AccesstokenAlt): Request[PullResponse] = js.native
  /**
    * Sets the access control policy on the specified resource. Replaces any
    * existing policy.
    */
  def setIamPolicy(request: Anon_Accesstoken): Request[Policy] = js.native
  /**
    * Returns permissions that a caller has on the specified resource.
    * If the resource does not exist, this will return an empty set of
    * permissions, not a NOT_FOUND error.
    *
    * Note: This operation is designed to be used for building permission-aware
    * UIs and command-line tools, not for authorization checking. This operation
    * may "fail open" without warning.
    */
  def testIamPermissions(request: Anon_Accesstoken): Request[TestIamPermissionsResponse] = js.native
}

