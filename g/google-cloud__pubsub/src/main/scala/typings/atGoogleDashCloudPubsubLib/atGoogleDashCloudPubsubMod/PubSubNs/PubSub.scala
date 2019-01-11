package typings
package atGoogleDashCloudPubsubLib.atGoogleDashCloudPubsubMod.PubSubNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PubSub extends js.Object {
  def createSubscription(topic: Topic, name: java.lang.String): js.Promise[js.Array[_]] = js.native
  def createSubscription(
    topic: Topic,
    name: java.lang.String,
    callback: atGoogleDashCloudPubsubLib.atGoogleDashCloudPubsubMod.PubSubNs.PubSubNs.CreateSubscriptionCallback
  ): scala.Unit = js.native
  def createSubscription(
    topic: Topic,
    name: java.lang.String,
    options: atGoogleDashCloudPubsubLib.atGoogleDashCloudPubsubMod.PubSubNs.PubSubNs.CreateSubscriptionOptions
  ): js.Promise[js.Array[_]] = js.native
  def createSubscription(
    topic: Topic,
    name: java.lang.String,
    options: atGoogleDashCloudPubsubLib.atGoogleDashCloudPubsubMod.PubSubNs.PubSubNs.CreateSubscriptionOptions,
    callback: atGoogleDashCloudPubsubLib.atGoogleDashCloudPubsubMod.PubSubNs.PubSubNs.CreateSubscriptionCallback
  ): scala.Unit = js.native
  def createSubscription(topic: java.lang.String, name: java.lang.String): js.Promise[js.Array[_]] = js.native
  def createSubscription(
    topic: java.lang.String,
    name: java.lang.String,
    callback: atGoogleDashCloudPubsubLib.atGoogleDashCloudPubsubMod.PubSubNs.PubSubNs.CreateSubscriptionCallback
  ): scala.Unit = js.native
  def createSubscription(
    topic: java.lang.String,
    name: java.lang.String,
    options: atGoogleDashCloudPubsubLib.atGoogleDashCloudPubsubMod.PubSubNs.PubSubNs.CreateSubscriptionOptions
  ): js.Promise[js.Array[_]] = js.native
  def createSubscription(
    topic: java.lang.String,
    name: java.lang.String,
    options: atGoogleDashCloudPubsubLib.atGoogleDashCloudPubsubMod.PubSubNs.PubSubNs.CreateSubscriptionOptions,
    callback: atGoogleDashCloudPubsubLib.atGoogleDashCloudPubsubMod.PubSubNs.PubSubNs.CreateSubscriptionCallback
  ): scala.Unit = js.native
  def createTopic(name: java.lang.String): js.Promise[js.Array[_]] = js.native
  def createTopic(
    name: java.lang.String,
    callback: atGoogleDashCloudPubsubLib.atGoogleDashCloudPubsubMod.PubSubNs.PubSubNs.CreateTopicCallback
  ): scala.Unit = js.native
  def createTopic(
    name: java.lang.String,
    gaxOpts: atGoogleDashCloudPubsubLib.atGoogleDashCloudPubsubMod.PubSubNs.GAXNs.CallOptions
  ): js.Promise[js.Array[_]] = js.native
  def createTopic(
    name: java.lang.String,
    gaxOpts: atGoogleDashCloudPubsubLib.atGoogleDashCloudPubsubMod.PubSubNs.GAXNs.CallOptions,
    callback: atGoogleDashCloudPubsubLib.atGoogleDashCloudPubsubMod.PubSubNs.PubSubNs.CreateTopicCallback
  ): scala.Unit = js.native
  def getSnapshots(): js.Promise[js.Array[_]] = js.native
  def getSnapshots(
    callback: atGoogleDashCloudPubsubLib.atGoogleDashCloudPubsubMod.PubSubNs.PubSubNs.GetSnapshotsCallback
  ): scala.Unit = js.native
  def getSnapshots(
    options: atGoogleDashCloudPubsubLib.atGoogleDashCloudPubsubMod.PubSubNs.PubSubNs.GetSnapshotsOptions
  ): js.Promise[js.Array[_]] = js.native
  def getSnapshots(
    options: atGoogleDashCloudPubsubLib.atGoogleDashCloudPubsubMod.PubSubNs.PubSubNs.GetSnapshotsOptions,
    callback: atGoogleDashCloudPubsubLib.atGoogleDashCloudPubsubMod.PubSubNs.PubSubNs.GetSnapshotsCallback
  ): scala.Unit = js.native
  def getSnapshotsStream(): nodeLib.streamMod.Duplex = js.native
  def getSnapshotsStream(
    options: atGoogleDashCloudPubsubLib.atGoogleDashCloudPubsubMod.PubSubNs.PubSubNs.GetSnapshotsOptions
  ): nodeLib.streamMod.Duplex = js.native
  def getSubscriptions(): js.Promise[js.Array[_]] = js.native
  def getSubscriptions(
    callback: atGoogleDashCloudPubsubLib.atGoogleDashCloudPubsubMod.PubSubNs.PubSubNs.GetSubscriptionsCallback
  ): scala.Unit = js.native
  def getSubscriptions(
    options: atGoogleDashCloudPubsubLib.atGoogleDashCloudPubsubMod.PubSubNs.PubSubNs.GetSubscriptionsOptions
  ): js.Promise[js.Array[_]] = js.native
  def getSubscriptions(
    options: atGoogleDashCloudPubsubLib.atGoogleDashCloudPubsubMod.PubSubNs.PubSubNs.GetSubscriptionsOptions,
    callback: atGoogleDashCloudPubsubLib.atGoogleDashCloudPubsubMod.PubSubNs.PubSubNs.GetSubscriptionsCallback
  ): scala.Unit = js.native
  def getSubscriptionsStream(): nodeLib.streamMod.Duplex = js.native
  def getSubscriptionsStream(
    options: atGoogleDashCloudPubsubLib.atGoogleDashCloudPubsubMod.PubSubNs.PubSubNs.GetSubscriptionsOptions
  ): nodeLib.streamMod.Duplex = js.native
  def getTopics(): js.Promise[js.Array[_]] = js.native
  def getTopics(
    callback: atGoogleDashCloudPubsubLib.atGoogleDashCloudPubsubMod.PubSubNs.PubSubNs.GetTopicsCallback
  ): scala.Unit = js.native
  def getTopics(query: atGoogleDashCloudPubsubLib.atGoogleDashCloudPubsubMod.PubSubNs.PubSubNs.GetTopicsQuery): js.Promise[js.Array[_]] = js.native
  def getTopics(
    query: atGoogleDashCloudPubsubLib.atGoogleDashCloudPubsubMod.PubSubNs.PubSubNs.GetTopicsQuery,
    callback: atGoogleDashCloudPubsubLib.atGoogleDashCloudPubsubMod.PubSubNs.PubSubNs.GetTopicsCallback
  ): scala.Unit = js.native
  def getTopicsStream(): nodeLib.streamMod.Duplex = js.native
  def getTopicsStream(query: atGoogleDashCloudPubsubLib.atGoogleDashCloudPubsubMod.PubSubNs.PubSubNs.GetTopicsQuery): nodeLib.streamMod.Duplex = js.native
  def snapshot(name: java.lang.String): Snapshot = js.native
  def subscription(name: java.lang.String): Subscription = js.native
  def subscription(
    name: java.lang.String,
    options: atGoogleDashCloudPubsubLib.atGoogleDashCloudPubsubMod.PubSubNs.PubSubNs.SubscriptionOptions
  ): Subscription = js.native
  def topic(name: java.lang.String): Topic = js.native
}

