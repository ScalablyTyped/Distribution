package typings
package atGoogleDashCloudPubsubLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object buildSrcTopicMod {
  type CreateTopicCallback = TopicCallback
  type CreateTopicResponse = TopicResponse
  type GetTopicCallback = TopicCallback
  type GetTopicMetadataCallback = MetadataCallback
  type GetTopicMetadataResponse = MetadataResponse
  type GetTopicOptions = googleDashGaxLib.buildSrcGaxMod.CallOptions with atGoogleDashCloudPubsubLib.Anon_AutoCreate
  type GetTopicResponse = TopicResponse
  type GetTopicSubscriptionsCallback = atGoogleDashCloudPubsubLib.buildSrcPubsubMod.RequestCallback[
    atGoogleDashCloudPubsubLib.buildSrcSubscriptionMod.Subscription, 
    atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.IListTopicSubscriptionsResponse
  ]
  type GetTopicSubscriptionsResponse = atGoogleDashCloudPubsubLib.buildSrcPubsubMod.PagedResponse[
    atGoogleDashCloudPubsubLib.buildSrcSubscriptionMod.Subscription, 
    atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.IListTopicSubscriptionsResponse
  ]
  type MetadataCallback = atGoogleDashCloudPubsubLib.buildSrcPubsubMod.RequestCallback[TopicMetadata, scala.Unit]
  type MetadataResponse = js.Array[TopicMetadata]
  type SetTopicMetadataCallback = MetadataCallback
  type SetTopicMetadataResponse = MetadataResponse
  type TopicCallback = atGoogleDashCloudPubsubLib.buildSrcPubsubMod.ResourceCallback[Topic, TopicMetadata]
  type TopicMetadata = atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ITopic
  type TopicResponse = js.Tuple2[Topic, TopicMetadata]
}
