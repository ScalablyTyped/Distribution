package typings.googleCloudPubsub

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object srcPubsubMod {
  type EmptyCallback = typings.googleCloudPubsub.srcPubsubMod.RequestCallback[typings.googleCloudPubsub.pubsubMod.google.protobuf.IEmpty, scala.Unit]
  type EmptyResponse = js.Array[typings.googleCloudPubsub.pubsubMod.google.protobuf.IEmpty]
  type ExistsCallback = typings.googleCloudPubsub.srcPubsubMod.RequestCallback[scala.Boolean, scala.Unit]
  type ExistsResponse = js.Array[scala.Boolean]
  type GetAllSubscriptionsCallback = typings.googleCloudPubsub.srcPubsubMod.RequestCallback[
    typings.googleCloudPubsub.subscriptionMod.Subscription, 
    typings.googleCloudPubsub.pubsubMod.google.pubsub.v1.IListSubscriptionsResponse
  ]
  type GetAllSubscriptionsResponse = typings.googleCloudPubsub.srcPubsubMod.PagedResponse[
    typings.googleCloudPubsub.subscriptionMod.Subscription, 
    typings.googleCloudPubsub.pubsubMod.google.pubsub.v1.IListSubscriptionsResponse
  ]
  type GetClientCallback = js.Function2[
    /* err */ typings.std.Error | scala.Null, 
    /* gaxClient */ js.UndefOr[typings.googleGax.mod.ClientStub], 
    scala.Unit
  ]
  type GetSnapshotsCallback = typings.googleCloudPubsub.srcPubsubMod.RequestCallback[
    typings.googleCloudPubsub.snapshotMod.Snapshot, 
    typings.googleCloudPubsub.pubsubMod.google.pubsub.v1.IListSnapshotsResponse
  ]
  type GetSnapshotsResponse = typings.googleCloudPubsub.srcPubsubMod.PagedResponse[
    typings.googleCloudPubsub.snapshotMod.Snapshot, 
    typings.googleCloudPubsub.pubsubMod.google.pubsub.v1.IListSnapshotsResponse
  ]
  type GetSubscriptionsCallback = typings.googleCloudPubsub.srcPubsubMod.GetAllSubscriptionsCallback | typings.googleCloudPubsub.topicMod.GetTopicSubscriptionsCallback
  type GetSubscriptionsOptions = typings.googleCloudPubsub.srcPubsubMod.PageOptions with typings.googleCloudPubsub.AnonTopic
  type GetSubscriptionsResponse = typings.googleCloudPubsub.srcPubsubMod.GetAllSubscriptionsResponse | typings.googleCloudPubsub.topicMod.GetTopicSubscriptionsResponse
  type GetTopicsCallback = typings.googleCloudPubsub.srcPubsubMod.RequestCallback[
    typings.googleCloudPubsub.topicMod.Topic, 
    typings.googleCloudPubsub.pubsubMod.google.pubsub.v1.IListTopicsResponse
  ]
  type GetTopicsResponse = typings.googleCloudPubsub.srcPubsubMod.PagedResponse[
    typings.googleCloudPubsub.topicMod.Topic, 
    typings.googleCloudPubsub.pubsubMod.google.pubsub.v1.IListTopicsResponse
  ]
  type NormalCallback[TResponse] = js.Function2[
    /* err */ typings.grpcGrpcJs.callMod.ServiceError | scala.Null, 
    /* res */ js.UndefOr[TResponse | scala.Null], 
    scala.Unit
  ]
  type ObjectStream[O] = typings.googleCloudPubsub.AnonAddListener[O] with typings.node.streamMod.Transform
  type Omit[T, K /* <: java.lang.String */] = typings.std.Pick[T, typings.std.Exclude[java.lang.String, K]]
  type PagedCallback[Item, Response] = js.Function4[
    /* err */ typings.grpcGrpcJs.callMod.ServiceError | scala.Null, 
    /* results */ js.UndefOr[js.Array[Item] | scala.Null], 
    /* nextQuery */ js.UndefOr[js.Object | scala.Null], 
    /* response */ js.UndefOr[Response | scala.Null], 
    scala.Unit
  ]
  type PagedResponse[Item, Response] = js.Array[js.Array[Item]] | (js.Tuple3[js.Array[Item], js.Object | scala.Null, Response])
  type RequestCallback[T, R] = (typings.googleCloudPubsub.srcPubsubMod.PagedCallback[T, R]) | typings.googleCloudPubsub.srcPubsubMod.NormalCallback[T]
  type ResourceCallback[Resource, Response] = js.Function3[
    /* err */ typings.grpcGrpcJs.callMod.ServiceError | scala.Null, 
    /* resource */ js.UndefOr[Resource | scala.Null], 
    /* response */ js.UndefOr[Response | scala.Null], 
    scala.Unit
  ]
}
