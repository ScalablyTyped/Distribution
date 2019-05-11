package typings
package atGoogleDashCloudPubsubLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object buildSrcPubsubMod {
  type EmptyCallback = RequestCallback[
    atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.IEmpty, 
    scala.Unit
  ]
  type EmptyResponse = js.Array[atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.IEmpty]
  type ExistsCallback = RequestCallback[scala.Boolean, scala.Unit]
  type ExistsResponse = js.Array[scala.Boolean]
  type GetAllSubscriptionsCallback = RequestCallback[
    atGoogleDashCloudPubsubLib.buildSrcSubscriptionMod.Subscription, 
    atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.IListSubscriptionsResponse
  ]
  type GetAllSubscriptionsResponse = PagedResponse[
    atGoogleDashCloudPubsubLib.buildSrcSubscriptionMod.Subscription, 
    atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.IListSubscriptionsResponse
  ]
  type GetClientCallback = js.Function2[
    /* err */ stdLib.Error | scala.Null, 
    /* gaxClient */ js.UndefOr[googleDashGaxLib.googleDashGaxMod.ClientStub], 
    scala.Unit
  ]
  type GetSnapshotsCallback = RequestCallback[
    atGoogleDashCloudPubsubLib.buildSrcSnapshotMod.Snapshot, 
    atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.IListSnapshotsResponse
  ]
  type GetSnapshotsResponse = PagedResponse[
    atGoogleDashCloudPubsubLib.buildSrcSnapshotMod.Snapshot, 
    atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.IListSnapshotsResponse
  ]
  type GetSubscriptionsCallback = GetAllSubscriptionsCallback | atGoogleDashCloudPubsubLib.buildSrcTopicMod.GetTopicSubscriptionsCallback
  type GetSubscriptionsOptions = PageOptions with atGoogleDashCloudPubsubLib.Anon_Topic
  type GetSubscriptionsResponse = GetAllSubscriptionsResponse | atGoogleDashCloudPubsubLib.buildSrcTopicMod.GetTopicSubscriptionsResponse
  type GetTopicsCallback = RequestCallback[
    atGoogleDashCloudPubsubLib.buildSrcTopicMod.Topic, 
    atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.IListTopicsResponse
  ]
  type GetTopicsResponse = PagedResponse[
    atGoogleDashCloudPubsubLib.buildSrcTopicMod.Topic, 
    atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.IListTopicsResponse
  ]
  type NormalCallback[TResponse] = js.Function2[
    /* err */ grpcLib.grpcMod.ServiceError | scala.Null, 
    /* res */ js.UndefOr[TResponse | scala.Null], 
    scala.Unit
  ]
  type ObjectStream[O] = atGoogleDashCloudPubsubLib.Anon_AddListener[O] with nodeLib.streamMod.Transform
  type Omit[T, K /* <: java.lang.String */] = stdLib.Pick[T, stdLib.Exclude[java.lang.String, K]]
  type PagedCallback[Item, Response] = js.Function4[
    /* err */ grpcLib.grpcMod.ServiceError | scala.Null, 
    /* results */ js.UndefOr[js.Array[Item] | scala.Null], 
    /* nextQuery */ js.UndefOr[js.Object | scala.Null], 
    /* response */ js.UndefOr[Response | scala.Null], 
    scala.Unit
  ]
  type PagedResponse[Item, Response] = js.Array[js.Array[Item]] | (js.Tuple3[js.Array[Item], js.Object | scala.Null, Response])
  type RequestCallback[T, R] = (PagedCallback[T, R]) | NormalCallback[T]
  type ResourceCallback[Resource, Response] = js.Function3[
    /* err */ grpcLib.grpcMod.ServiceError | scala.Null, 
    /* resource */ js.UndefOr[Resource | scala.Null], 
    /* response */ js.UndefOr[Response | scala.Null], 
    scala.Unit
  ]
}
