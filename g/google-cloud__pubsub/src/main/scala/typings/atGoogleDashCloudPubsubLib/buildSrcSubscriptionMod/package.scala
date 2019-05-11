package typings
package atGoogleDashCloudPubsubLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object buildSrcSubscriptionMod {
  type CreateSubscriptionCallback = SubscriptionCallback
  type CreateSubscriptionOptions = SubscriptionMetadata with atGoogleDashCloudPubsubLib.Anon_FlowControl
  type CreateSubscriptionResponse = SubscriptionResponse
  type GetSubscriptionCallback = SubscriptionCallback
  type GetSubscriptionMetadataCallback = MetadataCallback
  type GetSubscriptionMetadataResponse = MetadataResponse
  type GetSubscriptionOptions = googleDashGaxLib.buildSrcGaxMod.CallOptions with atGoogleDashCloudPubsubLib.Anon_AutoCreate
  type GetSubscriptionResponse = SubscriptionResponse
  type MetadataCallback = atGoogleDashCloudPubsubLib.buildSrcPubsubMod.RequestCallback[
    atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ISubscription, 
    scala.Unit
  ]
  type MetadataResponse = js.Array[
    atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ISubscription
  ]
  type PushConfig = atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.IPushConfig
  type SetSubscriptionMetadataCallback = MetadataCallback
  type SetSubscriptionMetadataResponse = MetadataResponse
  type SubscriptionCallback = atGoogleDashCloudPubsubLib.buildSrcPubsubMod.ResourceCallback[
    Subscription, 
    atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ISubscription
  ]
  type SubscriptionCloseCallback = js.Function1[/* err */ js.UndefOr[stdLib.Error], scala.Unit]
  type SubscriptionMetadata = atGoogleDashCloudPubsubLib.Anon_MessageRetentionDuration with (atGoogleDashCloudPubsubLib.buildSrcPubsubMod.Omit[
    atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ISubscription, 
    atGoogleDashCloudPubsubLib.atGoogleDashCloudPubsubLibStrings.messageRetentionDuration
  ])
  type SubscriptionOptions = atGoogleDashCloudPubsubLib.buildSrcSubscriberMod.SubscriberOptions with atGoogleDashCloudPubsubLib.Anon_TopicOptional
  type SubscriptionResponse = js.Tuple2[
    Subscription, 
    atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ISubscription
  ]
}
