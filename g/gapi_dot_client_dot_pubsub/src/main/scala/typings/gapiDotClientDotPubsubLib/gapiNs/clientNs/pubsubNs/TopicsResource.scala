package typings
package gapiDotClientDotPubsubLib.gapiNs.clientNs.pubsubNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait TopicsResource extends js.Object {
  var subscriptions: SubscriptionsResource
  /** Creates the given topic with the given name. */
  def create(request: gapiDotClientDotPubsubLib.Anon_Name): gapiDotClientLib.gapiNs.clientNs.Request[Topic]
  /**
               * Deletes the topic with the given name. Returns `NOT_FOUND` if the topic
               * does not exist. After a topic is deleted, a new topic may be created with
               * the same name; this is an entirely new topic with none of the old
               * configuration or subscriptions. Existing subscriptions to this topic are
               * not deleted, but their `topic` field is set to `_deleted-topic_`.
               */
  def delete(request: gapiDotClientDotPubsubLib.Anon_AccesstokenPrettyPrintBearertoken): gapiDotClientLib.gapiNs.clientNs.Request[js.Object]
  /** Gets the configuration of a topic. */
  def get(request: gapiDotClientDotPubsubLib.Anon_AccesstokenPrettyPrintBearertoken): gapiDotClientLib.gapiNs.clientNs.Request[Topic]
  /**
               * Gets the access control policy for a resource.
               * Returns an empty policy if the resource exists and does not have a policy
               * set.
               */
  def getIamPolicy(request: gapiDotClientDotPubsubLib.Anon_Accesstoken): gapiDotClientLib.gapiNs.clientNs.Request[Policy]
  /** Lists matching topics. */
  def list(request: gapiDotClientDotPubsubLib.Anon_AccesstokenPageSize): gapiDotClientLib.gapiNs.clientNs.Request[ListTopicsResponse]
  /**
               * Adds one or more messages to the topic. Returns `NOT_FOUND` if the topic
               * does not exist. The message payload must not be empty; it must contain
               * either a non-empty data field, or at least one attribute.
               */
  def publish(request: gapiDotClientDotPubsubLib.Anon_AccesstokenPrettyPrintBearertoken): gapiDotClientLib.gapiNs.clientNs.Request[PublishResponse]
  /**
               * Sets the access control policy on the specified resource. Replaces any
               * existing policy.
               */
  def setIamPolicy(request: gapiDotClientDotPubsubLib.Anon_Accesstoken): gapiDotClientLib.gapiNs.clientNs.Request[Policy]
  /**
               * Returns permissions that a caller has on the specified resource.
               * If the resource does not exist, this will return an empty set of
               * permissions, not a NOT_FOUND error.
               *
               * Note: This operation is designed to be used for building permission-aware
               * UIs and command-line tools, not for authorization checking. This operation
               * may "fail open" without warning.
               */
  def testIamPermissions(request: gapiDotClientDotPubsubLib.Anon_Accesstoken): gapiDotClientLib.gapiNs.clientNs.Request[TestIamPermissionsResponse]
}

