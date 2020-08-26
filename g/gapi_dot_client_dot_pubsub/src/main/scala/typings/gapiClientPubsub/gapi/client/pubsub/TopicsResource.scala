package typings.gapiClientPubsub.gapi.client.pubsub

import typings.gapiClient.gapi.client.Request
import typings.gapiClientPubsub.anon.Accesstoken
import typings.gapiClientPubsub.anon.Bearertoken
import typings.gapiClientPubsub.anon.Callback
import typings.gapiClientPubsub.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TopicsResource extends js.Object {
  var subscriptions: SubscriptionsResource = js.native
  /** Creates the given topic with the given name. */
  def create(request: Bearertoken): Request[Topic] = js.native
  /**
    * Deletes the topic with the given name. Returns `NOT_FOUND` if the topic
    * does not exist. After a topic is deleted, a new topic may be created with
    * the same name; this is an entirely new topic with none of the old
    * configuration or subscriptions. Existing subscriptions to this topic are
    * not deleted, but their `topic` field is set to `_deleted-topic_`.
    */
  def delete(request: Key): Request[js.Object] = js.native
  /** Gets the configuration of a topic. */
  def get(request: Key): Request[Topic] = js.native
  /**
    * Gets the access control policy for a resource.
    * Returns an empty policy if the resource exists and does not have a policy
    * set.
    */
  def getIamPolicy(request: Accesstoken): Request[Policy] = js.native
  /** Lists matching topics. */
  def list(request: Callback): Request[ListTopicsResponse] = js.native
  /**
    * Adds one or more messages to the topic. Returns `NOT_FOUND` if the topic
    * does not exist. The message payload must not be empty; it must contain
    * either a non-empty data field, or at least one attribute.
    */
  def publish(request: Key): Request[PublishResponse] = js.native
  /**
    * Sets the access control policy on the specified resource. Replaces any
    * existing policy.
    */
  def setIamPolicy(request: Accesstoken): Request[Policy] = js.native
  /**
    * Returns permissions that a caller has on the specified resource.
    * If the resource does not exist, this will return an empty set of
    * permissions, not a NOT_FOUND error.
    *
    * Note: This operation is designed to be used for building permission-aware
    * UIs and command-line tools, not for authorization checking. This operation
    * may "fail open" without warning.
    */
  def testIamPermissions(request: Accesstoken): Request[TestIamPermissionsResponse] = js.native
}

object TopicsResource {
  @scala.inline
  def apply(
    create: Bearertoken => Request[Topic],
    delete: Key => Request[js.Object],
    get: Key => Request[Topic],
    getIamPolicy: Accesstoken => Request[Policy],
    list: Callback => Request[ListTopicsResponse],
    publish: Key => Request[PublishResponse],
    setIamPolicy: Accesstoken => Request[Policy],
    subscriptions: SubscriptionsResource,
    testIamPermissions: Accesstoken => Request[TestIamPermissionsResponse]
  ): TopicsResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), getIamPolicy = js.Any.fromFunction1(getIamPolicy), list = js.Any.fromFunction1(list), publish = js.Any.fromFunction1(publish), setIamPolicy = js.Any.fromFunction1(setIamPolicy), subscriptions = subscriptions.asInstanceOf[js.Any], testIamPermissions = js.Any.fromFunction1(testIamPermissions))
    __obj.asInstanceOf[TopicsResource]
  }
  @scala.inline
  implicit class TopicsResourceOps[Self <: TopicsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCreate(value: Bearertoken => Request[Topic]): Self = this.set("create", js.Any.fromFunction1(value))
    @scala.inline
    def setDelete(value: Key => Request[js.Object]): Self = this.set("delete", js.Any.fromFunction1(value))
    @scala.inline
    def setGet(value: Key => Request[Topic]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setGetIamPolicy(value: Accesstoken => Request[Policy]): Self = this.set("getIamPolicy", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: Callback => Request[ListTopicsResponse]): Self = this.set("list", js.Any.fromFunction1(value))
    @scala.inline
    def setPublish(value: Key => Request[PublishResponse]): Self = this.set("publish", js.Any.fromFunction1(value))
    @scala.inline
    def setSetIamPolicy(value: Accesstoken => Request[Policy]): Self = this.set("setIamPolicy", js.Any.fromFunction1(value))
    @scala.inline
    def setSubscriptions(value: SubscriptionsResource): Self = this.set("subscriptions", value.asInstanceOf[js.Any])
    @scala.inline
    def setTestIamPermissions(value: Accesstoken => Request[TestIamPermissionsResponse]): Self = this.set("testIamPermissions", js.Any.fromFunction1(value))
  }
  
}

