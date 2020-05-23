package typings.googleCloudPubsub

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object topicMod {
  type CreateTopicCallback = typings.googleCloudPubsub.topicMod.TopicCallback
  type CreateTopicResponse = typings.googleCloudPubsub.topicMod.TopicResponse
  type GetTopicCallback = typings.googleCloudPubsub.topicMod.TopicCallback
  type GetTopicMetadataCallback = typings.googleCloudPubsub.topicMod.MetadataCallback
  type GetTopicMetadataResponse = typings.googleCloudPubsub.topicMod.MetadataResponse
  type GetTopicResponse = typings.googleCloudPubsub.topicMod.TopicResponse
  type GetTopicSubscriptionsCallback = typings.googleCloudPubsub.srcPubsubMod.RequestCallback[
    typings.googleCloudPubsub.subscriptionMod.Subscription, 
    typings.googleCloudPubsub.pubsubMod.google.pubsub.v1.IListTopicSubscriptionsResponse
  ]
  type GetTopicSubscriptionsResponse = typings.googleCloudPubsub.srcPubsubMod.PagedResponse[
    typings.googleCloudPubsub.subscriptionMod.Subscription, 
    typings.googleCloudPubsub.pubsubMod.google.pubsub.v1.IListTopicSubscriptionsResponse
  ]
  type MetadataCallback = typings.googleCloudPubsub.srcPubsubMod.RequestCallback[typings.googleCloudPubsub.topicMod.TopicMetadata, scala.Unit]
  type MetadataResponse = js.Array[typings.googleCloudPubsub.topicMod.TopicMetadata]
  type SetTopicMetadataCallback = typings.googleCloudPubsub.topicMod.MetadataCallback
  type SetTopicMetadataResponse = typings.googleCloudPubsub.topicMod.MetadataResponse
  type TopicCallback = typings.googleCloudPubsub.srcPubsubMod.ResourceCallback[
    typings.googleCloudPubsub.topicMod.Topic, 
    typings.googleCloudPubsub.topicMod.TopicMetadata
  ]
  type TopicMetadata = typings.googleCloudPubsub.pubsubMod.google.pubsub.v1.ITopic
  type TopicResponse = js.Tuple2[
    typings.googleCloudPubsub.topicMod.Topic, 
    typings.googleCloudPubsub.topicMod.TopicMetadata
  ]
}
