package typings
package atGoogleDashCloudPubsubLib.pubsubMod.PubSubNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object TopicNs {
  type CreateCallback = atGoogleDashCloudPubsubLib.pubsubMod.PubSubNs.PubSubNs.CreateTopicCallback
  type CreateSubscriptionCallback = atGoogleDashCloudPubsubLib.pubsubMod.PubSubNs.PubSubNs.CreateSubscriptionCallback
  type CreateSubscriptionOptions = atGoogleDashCloudPubsubLib.pubsubMod.PubSubNs.PubSubNs.CreateSubscriptionOptions
  // Note: This is not fully documented in the link; browse the source code to find the callback parameters
  // https://googlecloudplatform.github.io/google-cloud-node/#/docs/pubsub/0.14.1/pubsub/topic?method=delete
  type DeleteCallback = js.Function2[/* err */ nodeLib.Error | scala.Null, /* apiResponse */ js.Object, scala.Unit]
  type ExistsCallback = js.Function2[/* err */ nodeLib.Error | scala.Null, /* exists */ scala.Boolean, scala.Unit]
  // Note: This is not fully documented in the link; browse the source code to find the callback parameters
  // https://googlecloudplatform.github.io/google-cloud-node/#/docs/pubsub/0.14.1/pubsub/topic?method=get
  type GetCallback = js.Function3[
    /* err */ nodeLib.Error | scala.Null, 
    /* topic */ atGoogleDashCloudPubsubLib.pubsubMod.PubSubNs.Topic, 
    /* apiResponse */ js.Object, 
    scala.Unit
  ]
  type GetMetadataCallback = js.Function2[/* err */ nodeLib.Error | scala.Null, /* apiResponse */ js.Object, scala.Unit]
  // Callback signature also slightly different to PubSub.getSubscriptions(callback), so we can't just reuse it
  type GetSubscriptionsCallback = js.Function2[
    /* err */ nodeLib.Error | scala.Null, 
    /* subscriptions */ js.Array[atGoogleDashCloudPubsubLib.pubsubMod.PubSubNs.Subscription], 
    scala.Unit
  ]
  type SubscriptionOptions = atGoogleDashCloudPubsubLib.pubsubMod.PubSubNs.PubSubNs.SubscriptionOptions
}
