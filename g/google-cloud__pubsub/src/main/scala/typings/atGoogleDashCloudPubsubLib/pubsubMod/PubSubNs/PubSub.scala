package typings
package atGoogleDashCloudPubsubLib.pubsubMod.PubSubNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PubSub extends js.Object {
  def createSubscription(topic: Topic, name: java.lang.String): stdLib.Promise[js.Array[_]] = js.native
  def createSubscription(
    topic: Topic,
    name: java.lang.String,
    callback: atGoogleDashCloudPubsubLib.pubsubMod.PubSubNs.PubSubNs.CreateSubscriptionCallback
  ): scala.Unit = js.native
  def createSubscription(
    topic: Topic,
    name: java.lang.String,
    options: atGoogleDashCloudPubsubLib.pubsubMod.PubSubNs.PubSubNs.CreateSubscriptionOptions
  ): stdLib.Promise[js.Array[_]] = js.native
  def createSubscription(
    topic: Topic,
    name: java.lang.String,
    options: atGoogleDashCloudPubsubLib.pubsubMod.PubSubNs.PubSubNs.CreateSubscriptionOptions,
    callback: atGoogleDashCloudPubsubLib.pubsubMod.PubSubNs.PubSubNs.CreateSubscriptionCallback
  ): scala.Unit = js.native
  def createSubscription(topic: java.lang.String, name: java.lang.String): stdLib.Promise[js.Array[_]] = js.native
  def createSubscription(
    topic: java.lang.String,
    name: java.lang.String,
    callback: atGoogleDashCloudPubsubLib.pubsubMod.PubSubNs.PubSubNs.CreateSubscriptionCallback
  ): scala.Unit = js.native
  def createSubscription(
    topic: java.lang.String,
    name: java.lang.String,
    options: atGoogleDashCloudPubsubLib.pubsubMod.PubSubNs.PubSubNs.CreateSubscriptionOptions
  ): stdLib.Promise[js.Array[_]] = js.native
  def createSubscription(
    topic: java.lang.String,
    name: java.lang.String,
    options: atGoogleDashCloudPubsubLib.pubsubMod.PubSubNs.PubSubNs.CreateSubscriptionOptions,
    callback: atGoogleDashCloudPubsubLib.pubsubMod.PubSubNs.PubSubNs.CreateSubscriptionCallback
  ): scala.Unit = js.native
  def createTopic(name: java.lang.String): stdLib.Promise[js.Array[_]] = js.native
  def createTopic(
    name: java.lang.String,
    callback: atGoogleDashCloudPubsubLib.pubsubMod.PubSubNs.PubSubNs.CreateTopicCallback
  ): scala.Unit = js.native
  def createTopic(name: java.lang.String, gaxOpts: atGoogleDashCloudPubsubLib.pubsubMod.PubSubNs.GAXNs.CallOptions): stdLib.Promise[js.Array[_]] = js.native
  def createTopic(
    name: java.lang.String,
    gaxOpts: atGoogleDashCloudPubsubLib.pubsubMod.PubSubNs.GAXNs.CallOptions,
    callback: atGoogleDashCloudPubsubLib.pubsubMod.PubSubNs.PubSubNs.CreateTopicCallback
  ): scala.Unit = js.native
  def getSnapshots(): stdLib.Promise[js.Array[_]] = js.native
  def getSnapshots(callback: atGoogleDashCloudPubsubLib.pubsubMod.PubSubNs.PubSubNs.GetSnapshotsCallback): scala.Unit = js.native
  def getSnapshots(options: atGoogleDashCloudPubsubLib.pubsubMod.PubSubNs.PubSubNs.GetSnapshotsOptions): stdLib.Promise[js.Array[_]] = js.native
  def getSnapshots(
    options: atGoogleDashCloudPubsubLib.pubsubMod.PubSubNs.PubSubNs.GetSnapshotsOptions,
    callback: atGoogleDashCloudPubsubLib.pubsubMod.PubSubNs.PubSubNs.GetSnapshotsCallback
  ): scala.Unit = js.native
  def getSnapshotsStream(): nodeLib.streamMod.Duplex = js.native
  def getSnapshotsStream(options: atGoogleDashCloudPubsubLib.pubsubMod.PubSubNs.PubSubNs.GetSnapshotsOptions): nodeLib.streamMod.Duplex = js.native
  def getSubscriptions(): stdLib.Promise[js.Array[_]] = js.native
  def getSubscriptions(callback: atGoogleDashCloudPubsubLib.pubsubMod.PubSubNs.PubSubNs.GetSubscriptionsCallback): scala.Unit = js.native
  def getSubscriptions(options: atGoogleDashCloudPubsubLib.pubsubMod.PubSubNs.PubSubNs.GetSubscriptionsOptions): stdLib.Promise[js.Array[_]] = js.native
  def getSubscriptions(
    options: atGoogleDashCloudPubsubLib.pubsubMod.PubSubNs.PubSubNs.GetSubscriptionsOptions,
    callback: atGoogleDashCloudPubsubLib.pubsubMod.PubSubNs.PubSubNs.GetSubscriptionsCallback
  ): scala.Unit = js.native
  def getSubscriptionsStream(): nodeLib.streamMod.Duplex = js.native
  def getSubscriptionsStream(options: atGoogleDashCloudPubsubLib.pubsubMod.PubSubNs.PubSubNs.GetSubscriptionsOptions): nodeLib.streamMod.Duplex = js.native
  def getTopics(): stdLib.Promise[js.Array[_]] = js.native
  def getTopics(callback: atGoogleDashCloudPubsubLib.pubsubMod.PubSubNs.PubSubNs.GetTopicsCallback): scala.Unit = js.native
  def getTopics(query: atGoogleDashCloudPubsubLib.pubsubMod.PubSubNs.PubSubNs.GetTopicsQuery): stdLib.Promise[js.Array[_]] = js.native
  def getTopics(
    query: atGoogleDashCloudPubsubLib.pubsubMod.PubSubNs.PubSubNs.GetTopicsQuery,
    callback: atGoogleDashCloudPubsubLib.pubsubMod.PubSubNs.PubSubNs.GetTopicsCallback
  ): scala.Unit = js.native
  def getTopicsStream(): nodeLib.streamMod.Duplex = js.native
  def getTopicsStream(query: atGoogleDashCloudPubsubLib.pubsubMod.PubSubNs.PubSubNs.GetTopicsQuery): nodeLib.streamMod.Duplex = js.native
  def snapshot(name: java.lang.String): Snapshot = js.native
  def subscription(name: java.lang.String): Subscription = js.native
  def subscription(
    name: java.lang.String,
    options: atGoogleDashCloudPubsubLib.pubsubMod.PubSubNs.PubSubNs.SubscriptionOptions
  ): Subscription = js.native
  def topic(name: java.lang.String): Topic = js.native
}

