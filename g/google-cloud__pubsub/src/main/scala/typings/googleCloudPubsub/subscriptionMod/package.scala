package typings.googleCloudPubsub

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object subscriptionMod {
  type CreateSubscriptionCallback = typings.googleCloudPubsub.subscriptionMod.SubscriptionCallback
  type CreateSubscriptionResponse = typings.googleCloudPubsub.subscriptionMod.SubscriptionResponse
  type GetSubscriptionCallback = typings.googleCloudPubsub.subscriptionMod.SubscriptionCallback
  type GetSubscriptionMetadataCallback = typings.googleCloudPubsub.subscriptionMod.MetadataCallback
  type GetSubscriptionMetadataResponse = typings.googleCloudPubsub.subscriptionMod.MetadataResponse
  type GetSubscriptionResponse = typings.googleCloudPubsub.subscriptionMod.SubscriptionResponse
  type MetadataCallback = typings.googleCloudPubsub.srcPubsubMod.RequestCallback[typings.googleCloudPubsub.pubsubMod.google.pubsub.v1.ISubscription, scala.Unit]
  type MetadataResponse = js.Array[typings.googleCloudPubsub.pubsubMod.google.pubsub.v1.ISubscription]
  type OidcToken = typings.googleCloudPubsub.pubsubMod.google.pubsub.v1.PushConfig.IOidcToken
  type PushConfig = typings.googleCloudPubsub.pubsubMod.google.pubsub.v1.IPushConfig
  type SetSubscriptionMetadataCallback = typings.googleCloudPubsub.subscriptionMod.MetadataCallback
  type SetSubscriptionMetadataResponse = typings.googleCloudPubsub.subscriptionMod.MetadataResponse
  type SubscriptionCallback = typings.googleCloudPubsub.srcPubsubMod.ResourceCallback[
    typings.googleCloudPubsub.subscriptionMod.Subscription, 
    typings.googleCloudPubsub.pubsubMod.google.pubsub.v1.ISubscription
  ]
  type SubscriptionCloseCallback = js.Function1[/* err */ js.UndefOr[typings.std.Error], scala.Unit]
  type SubscriptionResponse = js.Tuple2[
    typings.googleCloudPubsub.subscriptionMod.Subscription, 
    typings.googleCloudPubsub.pubsubMod.google.pubsub.v1.ISubscription
  ]
}
