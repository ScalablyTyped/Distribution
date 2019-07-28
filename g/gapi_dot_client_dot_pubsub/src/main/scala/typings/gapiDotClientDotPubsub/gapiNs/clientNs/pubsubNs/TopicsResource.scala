package typings.gapiDotClientDotPubsub.gapiNs.clientNs.pubsubNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotPubsub.Anon_Accesstoken
import typings.gapiDotClientDotPubsub.Anon_AccesstokenAltBearertoken
import typings.gapiDotClientDotPubsub.Anon_AccesstokenAltBearertokenCallback
import typings.gapiDotClientDotPubsub.Anon_AccesstokenAltBearertokenCallbackFieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TopicsResource extends js.Object {
  var subscriptions: SubscriptionsResource
  /** Creates the given topic with the given name. */
  def create(request: Anon_AccesstokenAltBearertoken): Request[Topic]
  /**
    * Deletes the topic with the given name. Returns `NOT_FOUND` if the topic
    * does not exist. After a topic is deleted, a new topic may be created with
    * the same name; this is an entirely new topic with none of the old
    * configuration or subscriptions. Existing subscriptions to this topic are
    * not deleted, but their `topic` field is set to `_deleted-topic_`.
    */
  def delete(request: Anon_AccesstokenAltBearertokenCallbackFieldsKey): Request[js.Object]
  /** Gets the configuration of a topic. */
  def get(request: Anon_AccesstokenAltBearertokenCallbackFieldsKey): Request[Topic]
  /**
    * Gets the access control policy for a resource.
    * Returns an empty policy if the resource exists and does not have a policy
    * set.
    */
  def getIamPolicy(request: Anon_Accesstoken): Request[Policy]
  /** Lists matching topics. */
  def list(request: Anon_AccesstokenAltBearertokenCallback): Request[ListTopicsResponse]
  /**
    * Adds one or more messages to the topic. Returns `NOT_FOUND` if the topic
    * does not exist. The message payload must not be empty; it must contain
    * either a non-empty data field, or at least one attribute.
    */
  def publish(request: Anon_AccesstokenAltBearertokenCallbackFieldsKey): Request[PublishResponse]
  /**
    * Sets the access control policy on the specified resource. Replaces any
    * existing policy.
    */
  def setIamPolicy(request: Anon_Accesstoken): Request[Policy]
  /**
    * Returns permissions that a caller has on the specified resource.
    * If the resource does not exist, this will return an empty set of
    * permissions, not a NOT_FOUND error.
    *
    * Note: This operation is designed to be used for building permission-aware
    * UIs and command-line tools, not for authorization checking. This operation
    * may "fail open" without warning.
    */
  def testIamPermissions(request: Anon_Accesstoken): Request[TestIamPermissionsResponse]
}

object TopicsResource {
  @scala.inline
  def apply(
    create: Anon_AccesstokenAltBearertoken => Request[Topic],
    delete: Anon_AccesstokenAltBearertokenCallbackFieldsKey => Request[js.Object],
    get: Anon_AccesstokenAltBearertokenCallbackFieldsKey => Request[Topic],
    getIamPolicy: Anon_Accesstoken => Request[Policy],
    list: Anon_AccesstokenAltBearertokenCallback => Request[ListTopicsResponse],
    publish: Anon_AccesstokenAltBearertokenCallbackFieldsKey => Request[PublishResponse],
    setIamPolicy: Anon_Accesstoken => Request[Policy],
    subscriptions: SubscriptionsResource,
    testIamPermissions: Anon_Accesstoken => Request[TestIamPermissionsResponse]
  ): TopicsResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), getIamPolicy = js.Any.fromFunction1(getIamPolicy), list = js.Any.fromFunction1(list), publish = js.Any.fromFunction1(publish), setIamPolicy = js.Any.fromFunction1(setIamPolicy), subscriptions = subscriptions, testIamPermissions = js.Any.fromFunction1(testIamPermissions))
  
    __obj.asInstanceOf[TopicsResource]
  }
}

