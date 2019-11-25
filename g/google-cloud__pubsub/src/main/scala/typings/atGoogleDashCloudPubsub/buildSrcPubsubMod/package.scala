package typings.atGoogleDashCloudPubsub

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object buildSrcPubsubMod {
  import typings.atGoogleDashCloudPubsub.Anon_AddListener
  import typings.atGoogleDashCloudPubsub.Anon_Topic
  import typings.atGoogleDashCloudPubsub.buildProtoPubsubMod.google.protobuf.IEmpty
  import typings.atGoogleDashCloudPubsub.buildProtoPubsubMod.google.pubsub.v1.IListSnapshotsResponse
  import typings.atGoogleDashCloudPubsub.buildProtoPubsubMod.google.pubsub.v1.IListSubscriptionsResponse
  import typings.atGoogleDashCloudPubsub.buildProtoPubsubMod.google.pubsub.v1.IListTopicsResponse
  import typings.atGoogleDashCloudPubsub.buildSrcSnapshotMod.Snapshot
  import typings.atGoogleDashCloudPubsub.buildSrcSubscriptionMod.Subscription
  import typings.atGoogleDashCloudPubsub.buildSrcTopicMod.GetTopicSubscriptionsCallback
  import typings.atGoogleDashCloudPubsub.buildSrcTopicMod.GetTopicSubscriptionsResponse
  import typings.atGoogleDashCloudPubsub.buildSrcTopicMod.Topic
  import typings.atGrpcGrpcDashJs.buildSrcCallMod.ServiceError
  import typings.googleDashGax.googleDashGaxMod.ClientStub
  import typings.node.streamMod.Transform
  import typings.std.Error
  import typings.std.Exclude
  import typings.std.Pick

  type EmptyCallback = RequestCallback[IEmpty, Unit]
  type EmptyResponse = js.Array[IEmpty]
  type ExistsCallback = RequestCallback[Boolean, Unit]
  type ExistsResponse = js.Array[Boolean]
  type GetAllSubscriptionsCallback = RequestCallback[Subscription, IListSubscriptionsResponse]
  type GetAllSubscriptionsResponse = PagedResponse[Subscription, IListSubscriptionsResponse]
  type GetClientCallback = js.Function2[/* err */ Error | Null, /* gaxClient */ js.UndefOr[ClientStub], Unit]
  type GetSnapshotsCallback = RequestCallback[Snapshot, IListSnapshotsResponse]
  type GetSnapshotsResponse = PagedResponse[Snapshot, IListSnapshotsResponse]
  type GetSubscriptionsCallback = GetAllSubscriptionsCallback | GetTopicSubscriptionsCallback
  type GetSubscriptionsOptions = PageOptions with Anon_Topic
  type GetSubscriptionsResponse = GetAllSubscriptionsResponse | GetTopicSubscriptionsResponse
  type GetTopicsCallback = RequestCallback[Topic, IListTopicsResponse]
  type GetTopicsResponse = PagedResponse[Topic, IListTopicsResponse]
  type NormalCallback[TResponse] = js.Function2[/* err */ ServiceError | Null, /* res */ js.UndefOr[TResponse | Null], Unit]
  type ObjectStream[O] = Anon_AddListener[O] with Transform
  type Omit[T, K /* <: String */] = Pick[T, Exclude[String, K]]
  type PagedCallback[Item, Response] = js.Function4[
    /* err */ ServiceError | Null, 
    /* results */ js.UndefOr[js.Array[Item] | Null], 
    /* nextQuery */ js.UndefOr[js.Object | Null], 
    /* response */ js.UndefOr[Response | Null], 
    Unit
  ]
  type PagedResponse[Item, Response] = js.Array[js.Array[Item]] | (js.Tuple3[js.Array[Item], js.Object | Null, Response])
  type RequestCallback[T, R] = (PagedCallback[T, R]) | NormalCallback[T]
  type ResourceCallback[Resource, Response] = js.Function3[
    /* err */ ServiceError | Null, 
    /* resource */ js.UndefOr[Resource | Null], 
    /* response */ js.UndefOr[Response | Null], 
    Unit
  ]
}
