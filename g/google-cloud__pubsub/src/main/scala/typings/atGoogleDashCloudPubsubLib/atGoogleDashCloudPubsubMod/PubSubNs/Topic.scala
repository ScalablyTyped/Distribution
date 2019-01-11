package typings
package atGoogleDashCloudPubsubLib.atGoogleDashCloudPubsubMod.PubSubNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Topic extends js.Object {
  var iam: IAM = js.native
  def create(): js.Promise[js.Array[_]] = js.native
  def create(callback: atGoogleDashCloudPubsubLib.atGoogleDashCloudPubsubMod.PubSubNs.TopicNs.CreateCallback): scala.Unit = js.native
  def create(gaxOpts: atGoogleDashCloudPubsubLib.atGoogleDashCloudPubsubMod.PubSubNs.GAXNs.CallOptions): js.Promise[js.Array[_]] = js.native
  def create(
    gaxOpts: atGoogleDashCloudPubsubLib.atGoogleDashCloudPubsubMod.PubSubNs.GAXNs.CallOptions,
    callback: atGoogleDashCloudPubsubLib.atGoogleDashCloudPubsubMod.PubSubNs.TopicNs.CreateCallback
  ): scala.Unit = js.native
  def createSubscription(): js.Promise[js.Array[_]] = js.native
  def createSubscription(
    callback: atGoogleDashCloudPubsubLib.atGoogleDashCloudPubsubMod.PubSubNs.TopicNs.CreateSubscriptionCallback
  ): scala.Unit = js.native
  def createSubscription(
    nameOrOptions: atGoogleDashCloudPubsubLib.atGoogleDashCloudPubsubMod.PubSubNs.TopicNs.CreateSubscriptionOptions
  ): js.Promise[js.Array[_]] = js.native
  def createSubscription(
    nameOrOptions: atGoogleDashCloudPubsubLib.atGoogleDashCloudPubsubMod.PubSubNs.TopicNs.CreateSubscriptionOptions,
    callback: atGoogleDashCloudPubsubLib.atGoogleDashCloudPubsubMod.PubSubNs.TopicNs.CreateSubscriptionCallback
  ): scala.Unit = js.native
  def createSubscription(nameOrOptions: java.lang.String): js.Promise[js.Array[_]] = js.native
  def createSubscription(
    nameOrOptions: java.lang.String,
    callback: atGoogleDashCloudPubsubLib.atGoogleDashCloudPubsubMod.PubSubNs.TopicNs.CreateSubscriptionCallback
  ): scala.Unit = js.native
  def createSubscription(
    name: java.lang.String,
    options: atGoogleDashCloudPubsubLib.atGoogleDashCloudPubsubMod.PubSubNs.TopicNs.CreateSubscriptionOptions
  ): js.Promise[js.Array[_]] = js.native
  def createSubscription(
    name: java.lang.String,
    options: atGoogleDashCloudPubsubLib.atGoogleDashCloudPubsubMod.PubSubNs.TopicNs.CreateSubscriptionOptions,
    callback: atGoogleDashCloudPubsubLib.atGoogleDashCloudPubsubMod.PubSubNs.TopicNs.CreateSubscriptionCallback
  ): scala.Unit = js.native
  def delete(): js.Promise[js.Array[_]] = js.native
  def delete(callback: atGoogleDashCloudPubsubLib.atGoogleDashCloudPubsubMod.PubSubNs.TopicNs.DeleteCallback): scala.Unit = js.native
  def delete(gaxOpts: atGoogleDashCloudPubsubLib.atGoogleDashCloudPubsubMod.PubSubNs.GAXNs.CallOptions): js.Promise[js.Array[_]] = js.native
  def delete(
    gaxOpts: atGoogleDashCloudPubsubLib.atGoogleDashCloudPubsubMod.PubSubNs.GAXNs.CallOptions,
    callback: atGoogleDashCloudPubsubLib.atGoogleDashCloudPubsubMod.PubSubNs.TopicNs.DeleteCallback
  ): scala.Unit = js.native
  def exists(): js.Promise[js.Array[_]] = js.native
  def exists(callback: atGoogleDashCloudPubsubLib.atGoogleDashCloudPubsubMod.PubSubNs.TopicNs.ExistsCallback): scala.Unit = js.native
  // NOTE: The documentation in the link is incomplete; the function takes a callback
  // as second argument (in the source):
  // https://googlecloudplatform.github.io/google-cloud-node/#/docs/pubsub/0.14.1/pubsub/topic?method=get
  def get(): js.Promise[js.Array[_]] = js.native
  def get(callback: atGoogleDashCloudPubsubLib.atGoogleDashCloudPubsubMod.PubSubNs.TopicNs.GetCallback): scala.Unit = js.native
  def get(gaxOpts: atGoogleDashCloudPubsubLib.atGoogleDashCloudPubsubMod.PubSubNs.GAXNs.CallOptions): js.Promise[js.Array[_]] = js.native
  def get(
    gaxOpts: atGoogleDashCloudPubsubLib.atGoogleDashCloudPubsubMod.PubSubNs.GAXNs.CallOptions,
    callback: atGoogleDashCloudPubsubLib.atGoogleDashCloudPubsubMod.PubSubNs.TopicNs.GetCallback
  ): scala.Unit = js.native
  def getMetadata(): js.Promise[js.Array[_]] = js.native
  def getMetadata(
    callback: atGoogleDashCloudPubsubLib.atGoogleDashCloudPubsubMod.PubSubNs.TopicNs.GetMetadataCallback
  ): scala.Unit = js.native
  def getMetadata(gaxOpts: atGoogleDashCloudPubsubLib.atGoogleDashCloudPubsubMod.PubSubNs.GAXNs.CallOptions): js.Promise[js.Array[_]] = js.native
  def getMetadata(
    gaxOpts: atGoogleDashCloudPubsubLib.atGoogleDashCloudPubsubMod.PubSubNs.GAXNs.CallOptions,
    callback: atGoogleDashCloudPubsubLib.atGoogleDashCloudPubsubMod.PubSubNs.TopicNs.GetMetadataCallback
  ): scala.Unit = js.native
  def getSubscriptions(): js.Promise[js.Array[_]] = js.native
  def getSubscriptions(
    callback: atGoogleDashCloudPubsubLib.atGoogleDashCloudPubsubMod.PubSubNs.TopicNs.GetSubscriptionsCallback
  ): scala.Unit = js.native
  def getSubscriptions(
    options: atGoogleDashCloudPubsubLib.atGoogleDashCloudPubsubMod.PubSubNs.TopicNs.GetSubscriptionsOptions
  ): js.Promise[js.Array[_]] = js.native
  def getSubscriptions(
    options: atGoogleDashCloudPubsubLib.atGoogleDashCloudPubsubMod.PubSubNs.TopicNs.GetSubscriptionsOptions,
    callback: atGoogleDashCloudPubsubLib.atGoogleDashCloudPubsubMod.PubSubNs.TopicNs.GetSubscriptionsCallback
  ): scala.Unit = js.native
  // Note: The documention lists the parameter as 'query', when it probably should be 'options'.
  def getSubscriptionsStream(): nodeLib.streamMod.Duplex = js.native
  def getSubscriptionsStream(
    options: atGoogleDashCloudPubsubLib.atGoogleDashCloudPubsubMod.PubSubNs.TopicNs.GetSubscriptionsOptions
  ): nodeLib.streamMod.Duplex = js.native
  def publisher(): Publisher = js.native
  def publisher(options: atGoogleDashCloudPubsubLib.atGoogleDashCloudPubsubMod.PubSubNs.TopicNs.PublisherOptions): Publisher = js.native
  def subscription(name: java.lang.String): Subscription = js.native
  def subscription(
    name: java.lang.String,
    options: atGoogleDashCloudPubsubLib.atGoogleDashCloudPubsubMod.PubSubNs.TopicNs.SubscriptionOptions
  ): Subscription = js.native
}

